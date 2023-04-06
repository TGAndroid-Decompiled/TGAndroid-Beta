package org.telegram.messenger;

import android.content.res.Resources;
import android.icu.text.Collator;
import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_togglePeerTranslations;
import org.telegram.tgnet.TLRPC$TL_messages_translateResult;
import org.telegram.tgnet.TLRPC$TL_messages_translateText;
import org.telegram.tgnet.TLRPC$TL_textWithEntities;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.RestrictedLanguagesSelectActivity;
public class TranslateController extends BaseController {
    private static final int GROUPING_TRANSLATIONS_TIMEOUT = 80;
    private static final int MAX_MESSAGES_PER_REQUEST = 20;
    private static final int MAX_SYMBOLS_PER_REQUEST = 25000;
    private static final float REQUIRED_MIN_PERCENTAGE_MESSAGES_UNKNOWN = 0.65f;
    private static final float REQUIRED_PERCENTAGE_MESSAGES_TRANSLATABLE = 0.6f;
    private static final int REQUIRED_TOTAL_MESSAGES_CHECKED = 8;
    public static final String UNKNOWN_LANGUAGE = "und";
    private final HashMap<Long, String> detectedDialogLanguage;
    private final Set<Long> hideTranslateDialogs;
    private final HashMap<Long, HashMap<Integer, MessageObject>> keptReplyMessageObjects;
    private final Set<Integer> loadingTranslations;
    private MessagesController messagesController;
    private ArrayList<Integer> pendingLanguageChecks;
    private final HashMap<Long, ArrayList<PendingTranslation>> pendingTranslations;
    private final HashMap<Long, TranslatableDecision> translatableDialogMessages;
    private final Set<Long> translatableDialogs;
    private final HashMap<Long, String> translateDialogLanguage;
    private final Set<Long> translatingDialogs;
    private static List<String> languagesOrder = Arrays.asList("en", "ar", "zh", "fr", "de", "it", "ja", "ko", "pt", "ru", "es", "uk");
    private static List<String> allLanguages = Arrays.asList("af", "sq", "am", "ar", "hy", "az", "eu", "be", "bn", "bs", "bg", "ca", "ceb", "zh-cn", "zh", "zh-tw", "co", "hr", "cs", "da", "nl", "en", "eo", "et", "fi", "fr", "fy", "gl", "ka", "de", "el", "gu", "ht", "ha", "haw", "he", "iw", "hi", "hmn", "hu", "is", "ig", "id", "ga", "it", "ja", "jv", "kn", "kk", "km", "rw", "ko", "ku", "ky", "lo", "la", "lv", "lt", "lb", "mk", "mg", "ms", "ml", "mt", "mi", "mr", "mn", "my", "ne", "no", "ny", "or", "ps", "fa", "pl", "pt", "pa", "ro", "ru", "sm", "gd", "sr", "st", "sn", "sd", "si", "sk", "sl", "so", "es", "su", "sw", "sv", "tl", "tg", "ta", "tt", "te", "th", "tr", "tk", "uk", "ur", "ug", "uz", "vi", "cy", "xh", "yi", "yo", "zu");
    private static LinkedHashSet<String> suggestedLanguageCodes = null;

    public static class Language {
        public String code;
        public String displayName;
        public String ownDisplayName;
        public String q;
    }

    public class TranslatableDecision {
        Set<Integer> certainlyTranslatable = new HashSet();
        Set<Integer> unknown = new HashSet();
        Set<Integer> certainlyNotTranslatable = new HashSet();

        TranslatableDecision() {
        }
    }

    public TranslateController(MessagesController messagesController) {
        super(messagesController.currentAccount);
        this.translatingDialogs = new HashSet();
        this.translatableDialogs = new HashSet();
        this.translatableDialogMessages = new HashMap<>();
        this.translateDialogLanguage = new HashMap<>();
        this.detectedDialogLanguage = new HashMap<>();
        this.keptReplyMessageObjects = new HashMap<>();
        this.hideTranslateDialogs = new HashSet();
        this.pendingLanguageChecks = new ArrayList<>();
        this.loadingTranslations = new HashSet();
        this.pendingTranslations = new HashMap<>();
        this.messagesController = messagesController;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TranslateController.this.loadTranslatingDialogsCached();
            }
        }, 150L);
    }

    public boolean isFeatureAvailable() {
        return UserConfig.getInstance(this.currentAccount).isPremium() && isChatTranslateEnabled();
    }

    public boolean isChatTranslateEnabled() {
        return MessagesController.getMainSettings(this.currentAccount).getBoolean("translate_chat_button", true);
    }

    public boolean isContextTranslateEnabled() {
        return MessagesController.getMainSettings(this.currentAccount).getBoolean("translate_button", MessagesController.getGlobalMainSettings().getBoolean("translate_button", false));
    }

    public void setContextTranslateEnabled(boolean z) {
        MessagesController.getMainSettings(this.currentAccount).edit().putBoolean("translate_button", z).apply();
    }

    public static boolean isTranslatable(MessageObject messageObject) {
        int i;
        return (messageObject == null || messageObject.messageOwner == null || messageObject.isOutOwner() || messageObject.isRestrictedMessage || ((i = messageObject.type) != 0 && i != 3 && i != 1 && i != 2 && i != 9 && i != 14) || TextUtils.isEmpty(messageObject.messageOwner.message)) ? false : true;
    }

    public boolean isDialogTranslatable(long j) {
        return isFeatureAvailable() && !DialogObject.isEncryptedDialog(j) && getUserConfig().getClientUserId() != j && this.translatableDialogs.contains(Long.valueOf(j));
    }

    public boolean isTranslateDialogHidden(long j) {
        if (this.hideTranslateDialogs.contains(Long.valueOf(j))) {
            return true;
        }
        TLRPC$ChatFull chatFull = getMessagesController().getChatFull(-j);
        if (chatFull != null) {
            return chatFull.translations_disabled;
        }
        TLRPC$UserFull userFull = getMessagesController().getUserFull(j);
        if (userFull != null) {
            return userFull.translations_disabled;
        }
        return false;
    }

    public boolean isTranslatingDialog(long j) {
        return isFeatureAvailable() && this.translatingDialogs.contains(Long.valueOf(j));
    }

    public void toggleTranslatingDialog(long j) {
        toggleTranslatingDialog(j, !isTranslatingDialog(j));
    }

    public boolean toggleTranslatingDialog(long j, boolean z) {
        boolean isTranslatingDialog = isTranslatingDialog(j);
        boolean z2 = false;
        if (z && !isTranslatingDialog) {
            this.translatingDialogs.add(Long.valueOf(j));
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.dialogTranslate, Long.valueOf(j), Boolean.TRUE);
        } else {
            if (!z && isTranslatingDialog) {
                this.translatingDialogs.remove(Long.valueOf(j));
                NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.dialogTranslate, Long.valueOf(j), Boolean.FALSE);
                cancelTranslations(j);
            }
            saveTranslatingDialogsCache();
            return z2;
        }
        z2 = true;
        saveTranslatingDialogsCache();
        return z2;
    }

    private int hash(MessageObject messageObject) {
        if (messageObject == null) {
            return 0;
        }
        return Objects.hash(Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()));
    }

    private String currentLanguage() {
        String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
        return str != null ? str.split("_")[0] : str;
    }

    public String getDialogTranslateTo(long j) {
        String str = this.translateDialogLanguage.get(Long.valueOf(j));
        if (str == null && ((str = TranslateAlert2.getToLanguage()) == null || str.equals(getDialogDetectedLanguage(j)))) {
            str = currentLanguage();
        }
        return "nb".equals(str) ? "no" : str;
    }

    public void setDialogTranslateTo(final long j, final String str) {
        if (TextUtils.equals(getDialogTranslateTo(j), str)) {
            return;
        }
        if (isTranslatingDialog(j)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TranslateController.this.lambda$setDialogTranslateTo$0(j, str);
                }
            }, 150L);
        } else {
            synchronized (this) {
                this.translateDialogLanguage.put(Long.valueOf(j), str);
            }
        }
        cancelTranslations(j);
        synchronized (this) {
            this.translatingDialogs.remove(Long.valueOf(j));
        }
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.dialogTranslate, Long.valueOf(j), Boolean.FALSE);
        TranslateAlert2.setToLanguage(str);
    }

    public void lambda$setDialogTranslateTo$0(long j, String str) {
        synchronized (this) {
            this.translateDialogLanguage.put(Long.valueOf(j), str);
            this.translatingDialogs.add(Long.valueOf(j));
            saveTranslatingDialogsCache();
        }
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.dialogTranslate, Long.valueOf(j), Boolean.TRUE);
    }

    public void updateDialogFull(long j) {
        boolean z;
        if (isFeatureAvailable() && isDialogTranslatable(j)) {
            boolean contains = this.hideTranslateDialogs.contains(Long.valueOf(j));
            TLRPC$ChatFull chatFull = getMessagesController().getChatFull(-j);
            if (chatFull != null) {
                z = chatFull.translations_disabled;
            } else {
                TLRPC$UserFull userFull = getMessagesController().getUserFull(j);
                z = userFull != null ? userFull.translations_disabled : false;
            }
            synchronized (this) {
                if (z) {
                    this.hideTranslateDialogs.add(Long.valueOf(j));
                } else {
                    this.hideTranslateDialogs.remove(Long.valueOf(j));
                }
            }
            if (contains != z) {
                saveTranslatingDialogsCache();
                NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.dialogTranslate, Long.valueOf(j), Boolean.valueOf(isTranslatingDialog(j)));
            }
        }
    }

    public void setHideTranslateDialog(long j, boolean z) {
        setHideTranslateDialog(j, z, false);
    }

    public void setHideTranslateDialog(long j, boolean z, boolean z2) {
        TLRPC$TL_messages_togglePeerTranslations tLRPC$TL_messages_togglePeerTranslations = new TLRPC$TL_messages_togglePeerTranslations();
        tLRPC$TL_messages_togglePeerTranslations.peer = getMessagesController().getInputPeer(j);
        tLRPC$TL_messages_togglePeerTranslations.disabled = z;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_togglePeerTranslations, null);
        TLRPC$ChatFull chatFull = getMessagesController().getChatFull(-j);
        if (chatFull != null) {
            chatFull.translations_disabled = z;
            getMessagesStorage().updateChatInfo(chatFull, true);
        }
        TLRPC$UserFull userFull = getMessagesController().getUserFull(j);
        if (userFull != null) {
            userFull.translations_disabled = z;
            getMessagesStorage().updateUserInfo(userFull, true);
        }
        synchronized (this) {
            if (z) {
                this.hideTranslateDialogs.add(Long.valueOf(j));
            } else {
                this.hideTranslateDialogs.remove(Long.valueOf(j));
            }
        }
        saveTranslatingDialogsCache();
        if (z2) {
            return;
        }
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.dialogTranslate, Long.valueOf(j), Boolean.valueOf(isTranslatingDialog(j)));
    }

    public static ArrayList<Language> getLanguages() {
        ArrayList<Language> arrayList = new ArrayList<>();
        for (int i = 0; i < allLanguages.size(); i++) {
            Language language = new Language();
            String str = allLanguages.get(i);
            language.code = str;
            if ("no".equals(str)) {
                language.code = "nb";
            }
            language.displayName = TranslateAlert2.capitalFirst(TranslateAlert2.languageName(language.code));
            language.ownDisplayName = TranslateAlert2.capitalFirst(TranslateAlert2.systemLanguageName(language.code, true));
            if (language.displayName != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(language.displayName);
                sb.append(" ");
                String str2 = language.ownDisplayName;
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(str2);
                language.q = sb.toString().toLowerCase();
                arrayList.add(language);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            final Collator collator = Collator.getInstance(Locale.getDefault());
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$getLanguages$1;
                    lambda$getLanguages$1 = TranslateController.lambda$getLanguages$1(collator, (TranslateController.Language) obj, (TranslateController.Language) obj2);
                    return lambda$getLanguages$1;
                }
            });
        } else {
            Collections.sort(arrayList, Comparator$CC.comparing(TranslateController$$ExternalSyntheticLambda13.INSTANCE));
        }
        return arrayList;
    }

    public static int lambda$getLanguages$1(Collator collator, Language language, Language language2) {
        return collator.compare(language.displayName, language2.displayName);
    }

    public static void invalidateSuggestedLanguageCodes() {
        suggestedLanguageCodes = null;
    }

    public static void analyzeSuggestedLanguageCodes() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        try {
            linkedHashSet.add(LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            linkedHashSet.add(Resources.getSystem().getConfiguration().locale.getLanguage());
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        try {
            linkedHashSet.addAll(RestrictedLanguagesSelectActivity.getRestrictedLanguages());
        } catch (Exception e3) {
            FileLog.e(e3);
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                        String locale = inputMethodSubtype.getLocale();
                        if (locale != null && locale.contains("_")) {
                            locale = locale.split("_")[0];
                        }
                        if (TranslateAlert2.languageName(locale) != null) {
                            linkedHashSet.add(locale);
                        }
                    }
                }
            }
        } catch (Exception e4) {
            FileLog.e(e4);
        }
        suggestedLanguageCodes = linkedHashSet;
    }

    public static ArrayList<Language> getSuggestedLanguages(String str) {
        ArrayList<Language> arrayList = new ArrayList<>();
        if (suggestedLanguageCodes == null) {
            analyzeSuggestedLanguageCodes();
            if (suggestedLanguageCodes == null) {
                return arrayList;
            }
        }
        Iterator<String> it = suggestedLanguageCodes.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!TextUtils.equals(next, str) && (!"no".equals(str) || !"nb".equals(next))) {
                if (!"nb".equals(str) || !"no".equals(next)) {
                    Language language = new Language();
                    language.code = next;
                    if ("no".equals(next)) {
                        language.code = "nb";
                    }
                    language.displayName = TranslateAlert2.capitalFirst(TranslateAlert2.languageName(language.code));
                    language.ownDisplayName = TranslateAlert2.capitalFirst(TranslateAlert2.systemLanguageName(language.code, true));
                    if (language.displayName != null) {
                        language.q = (language.displayName + " " + language.ownDisplayName).toLowerCase();
                        arrayList.add(language);
                    }
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<LocaleController.LocaleInfo> getLocales() {
        String str;
        ArrayList<LocaleController.LocaleInfo> arrayList = new ArrayList<>(LocaleController.getInstance().languagesDict.values());
        int i = 0;
        while (i < arrayList.size()) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i);
            if (localeInfo == null || (((str = localeInfo.shortName) != null && str.endsWith("_raw")) || !"remote".equals(localeInfo.pathToFile))) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        final LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$getLocales$3;
                lambda$getLocales$3 = TranslateController.lambda$getLocales$3(LocaleController.LocaleInfo.this, (LocaleController.LocaleInfo) obj, (LocaleController.LocaleInfo) obj2);
                return lambda$getLocales$3;
            }
        });
        return arrayList;
    }

    public static int lambda$getLocales$3(LocaleController.LocaleInfo localeInfo, LocaleController.LocaleInfo localeInfo2, LocaleController.LocaleInfo localeInfo3) {
        if (localeInfo2 == localeInfo) {
            return -1;
        }
        if (localeInfo3 == localeInfo) {
            return 1;
        }
        int indexOf = languagesOrder.indexOf(localeInfo2.pluralLangCode);
        int indexOf2 = languagesOrder.indexOf(localeInfo3.pluralLangCode);
        if (indexOf < 0 || indexOf2 < 0) {
            if (indexOf >= 0) {
                return -1;
            }
            if (indexOf2 >= 0) {
                return 1;
            }
            int i = localeInfo2.serverIndex;
            int i2 = localeInfo3.serverIndex;
            if (i == i2) {
                return localeInfo2.name.compareTo(localeInfo3.name);
            }
            if (i > i2) {
                return 1;
            }
            return i < i2 ? -1 : 0;
        }
        return indexOf - indexOf2;
    }

    public void checkRestrictedLanguagesUpdate() {
        synchronized (this) {
            this.translatableDialogMessages.clear();
            ArrayList arrayList = new ArrayList();
            HashSet<String> restrictedLanguages = RestrictedLanguagesSelectActivity.getRestrictedLanguages();
            for (Long l : this.translatableDialogs) {
                long longValue = l.longValue();
                String str = this.detectedDialogLanguage.get(Long.valueOf(longValue));
                if (str != null && restrictedLanguages.contains(str)) {
                    cancelTranslations(longValue);
                    this.translatingDialogs.remove(Long.valueOf(longValue));
                    arrayList.add(Long.valueOf(longValue));
                }
            }
            this.translatableDialogs.clear();
            saveTranslatingDialogsCache();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.dialogTranslate, Long.valueOf(((Long) it.next()).longValue()), Boolean.FALSE);
            }
        }
    }

    public String getDialogDetectedLanguage(long j) {
        return this.detectedDialogLanguage.get(Long.valueOf(j));
    }

    public void checkTranslation(MessageObject messageObject, boolean z) {
        checkTranslation(messageObject, z, false);
    }

    private void checkTranslation(MessageObject messageObject, boolean z, final boolean z2) {
        MessageObject findReplyMessageObject;
        MessageObject messageObject2;
        if (!isFeatureAvailable() || messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        final long dialogId = messageObject.getDialogId();
        if (!z2 && (messageObject2 = messageObject.replyMessageObject) != null) {
            checkTranslation(messageObject2, z, true);
        }
        if (isTranslatable(messageObject)) {
            if (!isTranslatingDialog(dialogId)) {
                checkLanguage(messageObject);
                return;
            }
            String dialogTranslateTo = getDialogTranslateTo(dialogId);
            if (!z2) {
                TLRPC$Message tLRPC$Message = messageObject.messageOwner;
                if ((tLRPC$Message.translatedText == null || !dialogTranslateTo.equals(tLRPC$Message.translatedToLanguage)) && (findReplyMessageObject = findReplyMessageObject(dialogId, messageObject.getId())) != null) {
                    TLRPC$Message tLRPC$Message2 = messageObject.messageOwner;
                    TLRPC$Message tLRPC$Message3 = findReplyMessageObject.messageOwner;
                    tLRPC$Message2.translatedToLanguage = tLRPC$Message3.translatedToLanguage;
                    tLRPC$Message2.translatedText = tLRPC$Message3.translatedText;
                    messageObject = findReplyMessageObject;
                }
            }
            if (z && isTranslatingDialog(dialogId)) {
                TLRPC$Message tLRPC$Message4 = messageObject.messageOwner;
                if (tLRPC$Message4.translatedText == null || !dialogTranslateTo.equals(tLRPC$Message4.translatedToLanguage)) {
                    NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.messageTranslating, messageObject);
                    final MessageObject messageObject3 = messageObject;
                    pushToTranslate(messageObject, dialogTranslateTo, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TranslateController.this.lambda$checkTranslation$4(messageObject3, z2, dialogId, (TLRPC$TL_textWithEntities) obj, (String) obj2);
                        }
                    });
                } else if (z2) {
                    keepReplyMessage(messageObject);
                }
            }
        }
    }

    public void lambda$checkTranslation$4(MessageObject messageObject, boolean z, long j, TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities, String str) {
        TLRPC$Message tLRPC$Message = messageObject.messageOwner;
        tLRPC$Message.translatedToLanguage = str;
        tLRPC$Message.translatedText = tLRPC$TL_textWithEntities;
        if (z) {
            keepReplyMessage(messageObject);
        }
        getMessagesStorage().updateMessageCustomParams(j, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.messageTranslated, messageObject);
        ArrayList<MessageObject> arrayList = this.messagesController.dialogMessage.get(j);
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                MessageObject messageObject2 = arrayList.get(i);
                if (messageObject2 != null && messageObject2.getId() == messageObject.getId()) {
                    TLRPC$Message tLRPC$Message2 = messageObject2.messageOwner;
                    tLRPC$Message2.translatedToLanguage = str;
                    tLRPC$Message2.translatedText = tLRPC$TL_textWithEntities;
                    if (messageObject2.updateTranslation()) {
                        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.updateInterfaces, 0);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void invalidateTranslation(final MessageObject messageObject) {
        if (!isFeatureAvailable() || messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        final long dialogId = messageObject.getDialogId();
        TLRPC$Message tLRPC$Message = messageObject.messageOwner;
        tLRPC$Message.translatedToLanguage = null;
        tLRPC$Message.translatedText = null;
        getMessagesStorage().updateMessageCustomParams(dialogId, messageObject.messageOwner);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TranslateController.this.lambda$invalidateTranslation$5(messageObject, dialogId);
            }
        });
    }

    public void lambda$invalidateTranslation$5(MessageObject messageObject, long j) {
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.messageTranslated, messageObject, Boolean.valueOf(isTranslatingDialog(j)));
    }

    public void checkDialogMessages(final long j) {
        if (isFeatureAvailable()) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    TranslateController.this.lambda$checkDialogMessages$7(j);
                }
            });
        }
    }

    public void lambda$checkDialogMessages$7(long j) {
        final ArrayList<MessageObject> arrayList = this.messagesController.dialogMessage.get(j);
        if (arrayList == null) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = arrayList.get(i);
            if (messageObject == null || messageObject.messageOwner == null) {
                arrayList2.add(null);
            } else {
                arrayList2.add(getMessagesStorage().getMessageWithCustomParamsOnlyInternal(messageObject.getId(), messageObject.getDialogId()));
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TranslateController.this.lambda$checkDialogMessages$6(arrayList2, arrayList);
            }
        });
    }

    public void lambda$checkDialogMessages$6(ArrayList arrayList, ArrayList arrayList2) {
        TLRPC$Message tLRPC$Message;
        boolean z = false;
        for (int i = 0; i < Math.min(arrayList.size(), arrayList2.size()); i++) {
            MessageObject messageObject = (MessageObject) arrayList2.get(i);
            TLRPC$Message tLRPC$Message2 = (TLRPC$Message) arrayList.get(i);
            if (messageObject != null && (tLRPC$Message = messageObject.messageOwner) != null && tLRPC$Message2 != null) {
                tLRPC$Message.translatedText = tLRPC$Message2.translatedText;
                tLRPC$Message.translatedToLanguage = tLRPC$Message2.translatedToLanguage;
                if (messageObject.updateTranslation(false)) {
                    z = true;
                }
            }
        }
        if (z) {
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.updateInterfaces, 0);
        }
    }

    public void cleanup() {
        cancelAllTranslations();
        resetTranslatingDialogsCache();
        this.translatingDialogs.clear();
        this.translatableDialogs.clear();
        this.translatableDialogMessages.clear();
        this.translateDialogLanguage.clear();
        this.detectedDialogLanguage.clear();
        this.keptReplyMessageObjects.clear();
        this.hideTranslateDialogs.clear();
        this.loadingTranslations.clear();
    }

    private void checkLanguage(final MessageObject messageObject) {
        TLRPC$Message tLRPC$Message;
        if (LanguageDetector.hasSupport() && isTranslatable(messageObject) && (tLRPC$Message = messageObject.messageOwner) != null && !TextUtils.isEmpty(tLRPC$Message.message)) {
            if (messageObject.messageOwner.originalLanguage != null) {
                checkDialogTranslatable(messageObject);
                return;
            }
            final long dialogId = messageObject.getDialogId();
            final int hash = hash(messageObject);
            if (isDialogTranslatable(dialogId) || this.pendingLanguageChecks.contains(Integer.valueOf(hash))) {
                return;
            }
            this.pendingLanguageChecks.add(Integer.valueOf(hash));
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    TranslateController.this.lambda$checkLanguage$12(messageObject, dialogId, hash);
                }
            });
        }
    }

    public void lambda$checkLanguage$12(final MessageObject messageObject, final long j, final int i) {
        LanguageDetector.detectLanguage(messageObject.messageOwner.message, new LanguageDetector.StringCallback() {
            @Override
            public final void run(String str) {
                TranslateController.this.lambda$checkLanguage$9(messageObject, j, i, str);
            }
        }, new LanguageDetector.ExceptionCallback() {
            @Override
            public final void run(Exception exc) {
                TranslateController.this.lambda$checkLanguage$11(messageObject, j, i, exc);
            }
        });
    }

    public void lambda$checkLanguage$9(final MessageObject messageObject, final long j, final int i, final String str) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TranslateController.this.lambda$checkLanguage$8(str, messageObject, j, i);
            }
        });
    }

    public void lambda$checkLanguage$8(String str, MessageObject messageObject, long j, int i) {
        if (str == null) {
            str = UNKNOWN_LANGUAGE;
        }
        messageObject.messageOwner.originalLanguage = str;
        getMessagesStorage().updateMessageCustomParams(j, messageObject.messageOwner);
        this.pendingLanguageChecks.remove(Integer.valueOf(i));
        checkDialogTranslatable(messageObject);
    }

    public void lambda$checkLanguage$11(final MessageObject messageObject, final long j, final int i, Exception exc) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TranslateController.this.lambda$checkLanguage$10(messageObject, j, i);
            }
        });
    }

    public void lambda$checkLanguage$10(MessageObject messageObject, long j, int i) {
        messageObject.messageOwner.originalLanguage = UNKNOWN_LANGUAGE;
        getMessagesStorage().updateMessageCustomParams(j, messageObject.messageOwner);
        this.pendingLanguageChecks.remove(Integer.valueOf(i));
    }

    private void checkDialogTranslatable(MessageObject messageObject) {
        String str;
        String str2;
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        final long dialogId = messageObject.getDialogId();
        TranslatableDecision translatableDecision = this.translatableDialogMessages.get(Long.valueOf(dialogId));
        if (translatableDecision == null) {
            HashMap<Long, TranslatableDecision> hashMap = this.translatableDialogMessages;
            Long valueOf = Long.valueOf(dialogId);
            TranslatableDecision translatableDecision2 = new TranslatableDecision();
            hashMap.put(valueOf, translatableDecision2);
            translatableDecision = translatableDecision2;
        }
        boolean z = true;
        boolean z2 = isTranslatable(messageObject) && ((str2 = messageObject.messageOwner.originalLanguage) == null || UNKNOWN_LANGUAGE.equals(str2));
        z = (!isTranslatable(messageObject) || (str = messageObject.messageOwner.originalLanguage) == null || UNKNOWN_LANGUAGE.equals(str) || RestrictedLanguagesSelectActivity.getRestrictedLanguages().contains(messageObject.messageOwner.originalLanguage)) ? false : false;
        if (z2) {
            translatableDecision.unknown.add(Integer.valueOf(messageObject.getId()));
        } else {
            (z ? translatableDecision.certainlyTranslatable : translatableDecision.certainlyNotTranslatable).add(Integer.valueOf(messageObject.getId()));
        }
        if (!z2) {
            this.detectedDialogLanguage.put(Long.valueOf(dialogId), messageObject.messageOwner.originalLanguage);
        }
        int size = translatableDecision.certainlyTranslatable.size();
        int size2 = translatableDecision.unknown.size();
        int size3 = translatableDecision.certainlyNotTranslatable.size();
        int i = size + size2 + size3;
        if (i < 8 || size / (size + size3) < REQUIRED_PERCENTAGE_MESSAGES_TRANSLATABLE || size2 / i >= REQUIRED_MIN_PERCENTAGE_MESSAGES_UNKNOWN) {
            return;
        }
        this.translatableDialogs.add(Long.valueOf(dialogId));
        this.translatableDialogMessages.remove(Long.valueOf(dialogId));
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TranslateController.this.lambda$checkDialogTranslatable$13(dialogId);
            }
        }, 450L);
    }

    public void lambda$checkDialogTranslatable$13(long j) {
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.dialogIsTranslatable, Long.valueOf(j));
    }

    public static class PendingTranslation {
        ArrayList<Utilities.Callback2<TLRPC$TL_textWithEntities, String>> callbacks;
        int delay;
        String language;
        ArrayList<Integer> messageIds;
        ArrayList<TLRPC$TL_textWithEntities> messageTexts;
        int reqId;
        Runnable runnable;
        int symbolsCount;

        private PendingTranslation() {
            this.messageIds = new ArrayList<>();
            this.messageTexts = new ArrayList<>();
            this.callbacks = new ArrayList<>();
            this.delay = TranslateController.GROUPING_TRANSLATIONS_TIMEOUT;
            this.reqId = -1;
        }
    }

    private void pushToTranslate(MessageObject messageObject, String str, Utilities.Callback2<TLRPC$TL_textWithEntities, String> callback2) {
        final PendingTranslation pendingTranslation;
        String str2;
        if (messageObject == null || callback2 == null) {
            return;
        }
        final long dialogId = messageObject.getDialogId();
        synchronized (this) {
            ArrayList<PendingTranslation> arrayList = this.pendingTranslations.get(Long.valueOf(dialogId));
            if (arrayList == null) {
                HashMap<Long, ArrayList<PendingTranslation>> hashMap = this.pendingTranslations;
                Long valueOf = Long.valueOf(dialogId);
                ArrayList<PendingTranslation> arrayList2 = new ArrayList<>();
                hashMap.put(valueOf, arrayList2);
                arrayList = arrayList2;
            }
            TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities = null;
            if (arrayList.isEmpty()) {
                pendingTranslation = new PendingTranslation();
                arrayList.add(pendingTranslation);
            } else {
                pendingTranslation = arrayList.get(arrayList.size() - 1);
            }
            if (pendingTranslation.messageIds.contains(Integer.valueOf(messageObject.getId()))) {
                return;
            }
            int i = 0;
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            if (tLRPC$Message != null && (str2 = tLRPC$Message.message) != null) {
                i = str2.length();
            } else {
                CharSequence charSequence = messageObject.caption;
                if (charSequence != null) {
                    i = charSequence.length();
                } else {
                    CharSequence charSequence2 = messageObject.messageText;
                    if (charSequence2 != null) {
                        i = charSequence2.length();
                    }
                }
            }
            if (pendingTranslation.symbolsCount + i >= MAX_SYMBOLS_PER_REQUEST || pendingTranslation.messageIds.size() + 1 >= 20) {
                AndroidUtilities.cancelRunOnUIThread(pendingTranslation.runnable);
                AndroidUtilities.runOnUIThread(pendingTranslation.runnable);
                pendingTranslation = new PendingTranslation();
                arrayList.add(pendingTranslation);
            }
            Runnable runnable = pendingTranslation.runnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            this.loadingTranslations.add(Integer.valueOf(messageObject.getId()));
            pendingTranslation.messageIds.add(Integer.valueOf(messageObject.getId()));
            if (messageObject.messageOwner != null) {
                tLRPC$TL_textWithEntities = new TLRPC$TL_textWithEntities();
                TLRPC$Message tLRPC$Message2 = messageObject.messageOwner;
                tLRPC$TL_textWithEntities.text = tLRPC$Message2.message;
                tLRPC$TL_textWithEntities.entities = tLRPC$Message2.entities;
            }
            pendingTranslation.messageTexts.add(tLRPC$TL_textWithEntities);
            pendingTranslation.callbacks.add(callback2);
            pendingTranslation.language = str;
            pendingTranslation.symbolsCount += i;
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    TranslateController.this.lambda$pushToTranslate$16(dialogId, pendingTranslation);
                }
            };
            pendingTranslation.runnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, pendingTranslation.delay);
            pendingTranslation.delay /= 2;
        }
    }

    public void lambda$pushToTranslate$16(final long j, final PendingTranslation pendingTranslation) {
        synchronized (this) {
            ArrayList<PendingTranslation> arrayList = this.pendingTranslations.get(Long.valueOf(j));
            if (arrayList != null) {
                arrayList.remove(pendingTranslation);
                if (arrayList.isEmpty()) {
                    this.pendingTranslations.remove(Long.valueOf(j));
                }
            }
        }
        TLRPC$TL_messages_translateText tLRPC$TL_messages_translateText = new TLRPC$TL_messages_translateText();
        tLRPC$TL_messages_translateText.flags |= 1;
        tLRPC$TL_messages_translateText.peer = getMessagesController().getInputPeer(j);
        tLRPC$TL_messages_translateText.id = pendingTranslation.messageIds;
        tLRPC$TL_messages_translateText.to_lang = pendingTranslation.language;
        int sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_messages_translateText, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                TranslateController.this.lambda$pushToTranslate$15(pendingTranslation, j, tLObject, tLRPC$TL_error);
            }
        });
        synchronized (this) {
            pendingTranslation.reqId = sendRequest;
        }
    }

    public void lambda$pushToTranslate$15(final PendingTranslation pendingTranslation, final long j, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TranslateController.this.lambda$pushToTranslate$14(pendingTranslation, tLObject, tLRPC$TL_error, j);
            }
        });
    }

    public void lambda$pushToTranslate$14(PendingTranslation pendingTranslation, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error, long j) {
        ArrayList<Integer> arrayList;
        ArrayList<Utilities.Callback2<TLRPC$TL_textWithEntities, String>> arrayList2;
        ArrayList<TLRPC$TL_textWithEntities> arrayList3;
        synchronized (this) {
            arrayList = pendingTranslation.messageIds;
            arrayList2 = pendingTranslation.callbacks;
            arrayList3 = pendingTranslation.messageTexts;
        }
        if (tLObject instanceof TLRPC$TL_messages_translateResult) {
            ArrayList<TLRPC$TL_textWithEntities> arrayList4 = ((TLRPC$TL_messages_translateResult) tLObject).result;
            int min = Math.min(arrayList2.size(), arrayList4.size());
            for (int i = 0; i < min; i++) {
                arrayList2.get(i).run(TranslateAlert2.preprocess(arrayList3.get(i), arrayList4.get(i)), pendingTranslation.language);
            }
        } else if (tLRPC$TL_error != null && "TO_LANG_INVALID".equals(tLRPC$TL_error.text)) {
            toggleTranslatingDialog(j, false);
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 1, LocaleController.getString("TranslationFailedAlert2", R.string.TranslationFailedAlert2));
        } else {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                arrayList2.get(i2).run(null, pendingTranslation.language);
            }
        }
        synchronized (this) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.loadingTranslations.remove(arrayList.get(i3));
            }
        }
    }

    public boolean isTranslating(MessageObject messageObject) {
        boolean z;
        synchronized (this) {
            if (messageObject != null) {
                try {
                    z = (this.loadingTranslations.contains(Integer.valueOf(messageObject.getId())) && isTranslatingDialog(messageObject.getDialogId())) ? true : true;
                } finally {
                }
            }
            z = false;
        }
        return z;
    }

    public boolean isTranslating(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages) {
        if (messageObject != null && isTranslatingDialog(messageObject.getDialogId())) {
            synchronized (this) {
                if (this.loadingTranslations.contains(Integer.valueOf(messageObject.getId()))) {
                    return true;
                }
                if (groupedMessages != null) {
                    Iterator<MessageObject> it = groupedMessages.messages.iterator();
                    while (it.hasNext()) {
                        if (this.loadingTranslations.contains(Integer.valueOf(it.next().getId()))) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    public void cancelAllTranslations() {
        synchronized (this) {
            for (ArrayList<PendingTranslation> arrayList : this.pendingTranslations.values()) {
                if (arrayList != null) {
                    Iterator<PendingTranslation> it = arrayList.iterator();
                    while (it.hasNext()) {
                        PendingTranslation next = it.next();
                        AndroidUtilities.cancelRunOnUIThread(next.runnable);
                        if (next.reqId != -1) {
                            getConnectionsManager().cancelRequest(next.reqId, true);
                            Iterator<Integer> it2 = next.messageIds.iterator();
                            while (it2.hasNext()) {
                                this.loadingTranslations.remove(it2.next());
                            }
                        }
                    }
                }
            }
        }
    }

    public void cancelTranslations(long j) {
        synchronized (this) {
            ArrayList<PendingTranslation> arrayList = this.pendingTranslations.get(Long.valueOf(j));
            if (arrayList != null) {
                Iterator<PendingTranslation> it = arrayList.iterator();
                while (it.hasNext()) {
                    PendingTranslation next = it.next();
                    AndroidUtilities.cancelRunOnUIThread(next.runnable);
                    if (next.reqId != -1) {
                        getConnectionsManager().cancelRequest(next.reqId, true);
                        Iterator<Integer> it2 = next.messageIds.iterator();
                        while (it2.hasNext()) {
                            this.loadingTranslations.remove(it2.next());
                        }
                    }
                }
                this.pendingTranslations.remove(Long.valueOf(j));
            }
        }
    }

    private void keepReplyMessage(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        HashMap<Integer, MessageObject> hashMap = this.keptReplyMessageObjects.get(Long.valueOf(messageObject.getDialogId()));
        if (hashMap == null) {
            HashMap<Long, HashMap<Integer, MessageObject>> hashMap2 = this.keptReplyMessageObjects;
            Long valueOf = Long.valueOf(messageObject.getDialogId());
            HashMap<Integer, MessageObject> hashMap3 = new HashMap<>();
            hashMap2.put(valueOf, hashMap3);
            hashMap = hashMap3;
        }
        hashMap.put(Integer.valueOf(messageObject.getId()), messageObject);
    }

    public MessageObject findReplyMessageObject(long j, int i) {
        HashMap<Integer, MessageObject> hashMap = this.keptReplyMessageObjects.get(Long.valueOf(j));
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(Integer.valueOf(i));
    }

    private void clearAllKeptReplyMessages(long j) {
        this.keptReplyMessageObjects.remove(Long.valueOf(j));
    }

    public void loadTranslatingDialogsCached() {
        String string;
        if (isFeatureAvailable() && (string = this.messagesController.getMainSettings().getString("translating_dialog_languages2", null)) != null) {
            String[] split = string.split(";");
            HashSet<String> restrictedLanguages = RestrictedLanguagesSelectActivity.getRestrictedLanguages();
            for (String str : split) {
                String[] split2 = str.split("=");
                if (split2.length >= 2) {
                    long parseLong = Long.parseLong(split2[0]);
                    String[] split3 = split2[1].split(">");
                    if (split3.length == 2) {
                        String str2 = split3[0];
                        String str3 = split3[1];
                        if ("null".equals(str2)) {
                            str2 = null;
                        }
                        if ("null".equals(str3)) {
                            str3 = null;
                        }
                        if (str2 != null) {
                            this.detectedDialogLanguage.put(Long.valueOf(parseLong), str2);
                            if (!restrictedLanguages.contains(str2)) {
                                this.translatingDialogs.add(Long.valueOf(parseLong));
                                this.translatableDialogs.add(Long.valueOf(parseLong));
                            }
                            if (str3 != null) {
                                this.translateDialogLanguage.put(Long.valueOf(parseLong), str3);
                            }
                        }
                    }
                }
            }
            Set<String> stringSet = this.messagesController.getMainSettings().getStringSet("hidden_translation_at", null);
            if (stringSet != null) {
                for (String str4 : stringSet) {
                    try {
                        this.hideTranslateDialogs.add(Long.valueOf(Long.parseLong(str4)));
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
        }
    }

    private void saveTranslatingDialogsCache() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Long l : this.translatingDialogs) {
            try {
                long longValue = l.longValue();
                if (!z) {
                    sb.append(";");
                }
                if (z) {
                    z = false;
                }
                String str = this.detectedDialogLanguage.get(Long.valueOf(longValue));
                String str2 = "null";
                if (str == null) {
                    str = "null";
                }
                String dialogTranslateTo = getDialogTranslateTo(longValue);
                if (dialogTranslateTo != null) {
                    str2 = dialogTranslateTo;
                }
                sb.append(longValue);
                sb.append("=");
                sb.append(str);
                sb.append(">");
                sb.append(str2);
            } catch (Exception unused) {
            }
        }
        HashSet hashSet = new HashSet();
        Iterator<Long> it = this.hideTranslateDialogs.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add("" + it.next());
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        MessagesController.getMainSettings(this.currentAccount).edit().putString("translating_dialog_languages2", sb.toString()).putStringSet("hidden_translation_at", hashSet).apply();
    }

    private void resetTranslatingDialogsCache() {
        MessagesController.getMainSettings(this.currentAccount).edit().remove("translating_dialog_languages2").remove("hidden_translation_at").apply();
    }
}
