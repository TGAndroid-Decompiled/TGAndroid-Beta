package org.telegram.messenger;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.icu.text.Collator;
import android.os.Build;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Pair;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import j$.util.Comparator$CC;
import j$.util.Objects;
import j$.util.function.Function$CC;
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
import java.util.Set;
import java.util.function.Function;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.RestrictedLanguagesSelectActivity;

public class TranslateController extends BaseController {
    private static final int GROUPING_TRANSLATIONS_TIMEOUT = 80;
    private static final int MAX_MESSAGES_PER_REQUEST = 20;
    private static final int MAX_SYMBOLS_PER_REQUEST = 25000;
    private static final float REQUIRED_MIN_MESSAGES_TRANSLATABLE_AUTOTRANSLATE = 2.0f;
    private static final float REQUIRED_MIN_PERCENTAGE_MESSAGES_UNKNOWN = 0.65f;
    private static final float REQUIRED_MIN_PERCENTAGE_MESSAGES_UNKNOWN_AUTOTRANSLATE = 0.8f;
    private static final float REQUIRED_PERCENTAGE_MESSAGES_TRANSLATABLE = 0.6f;
    private static final int REQUIRED_TOTAL_MESSAGES_CHECKED = 6;
    private static final int REQUIRED_TOTAL_MESSAGES_CHECKED_AUTOTRANSLATE = 2;
    public static final String UNKNOWN_LANGUAGE = "und";
    private Boolean chatTranslateEnabled;
    private Boolean contextTranslateEnabled;
    private final HashMap<Long, String> detectedDialogLanguage;
    private final HashSet<MessageKey> detectingPhotos;
    private final HashSet<StoryKey> detectingStories;
    private final Set<Long> hideTranslateDialogs;
    private final HashMap<Long, HashMap<Integer, MessageObject>> keptReplyMessageObjects;
    private final HashSet<Integer> loadingSummarizations;
    private final Set<Integer> loadingTranscriptionTranslations;
    private final Set<Integer> loadingTranslations;
    private MessagesController messagesController;
    private ArrayList<Integer> pendingLanguageChecks;
    private final HashMap<Long, ArrayList<PendingPollTranslation>> pendingPollTranslations;
    private final HashMap<Long, ArrayList<PendingTranslation>> pendingTranscriptionsTranslations;
    private final HashMap<Long, ArrayList<PendingTranslation>> pendingTranslations;
    private final HashMap<Long, TranslatableDecision> translatableDialogMessages;
    private final Set<Long> translatableDialogs;
    private final HashMap<Long, String> translateDialogLanguage;
    private final LongSparseArray<Boolean> translatingDialogs;
    private final HashSet<MessageKey> translatingPhotos;
    private final HashSet<StoryKey> translatingStories;
    private static final List<String> languagesOrder = Arrays.asList("en", "ar", "zh", "fr", "de", "it", "ja", "ko", "pt", "ru", "es", "uk");
    private static final List<String> allLanguages = Arrays.asList("af", "sq", "am", "ar", "hy", "az", "eu", "be", "bn", "bs", "bg", "ca", "ceb", "zh-cn", "zh", "zh-tw", "co", "hr", "cs", "da", "nl", "en", "eo", "et", "fi", "fr", "fy", "gl", "ka", "de", "el", "gu", "ht", "ha", "haw", "he", "hi", "hmn", "hu", "is", "ig", "id", "ga", "it", "ja", "jv", "kn", "kk", "km", "rw", "ko", "ku", "ky", "lo", "la", "lv", "lt", "lb", "mk", "mg", "ms", "ml", "mt", "mi", "mr", "mn", "my", "ne", "no", "ny", "or", "ps", "fa", "pl", "pt", "pa", "ro", "ru", "sm", "gd", "sr", "st", "sn", "sd", "si", "sk", "sl", "so", "es", "su", "sw", "sv", "tl", "tg", "ta", "tt", "te", "th", "tr", "tk", "uk", "ur", "ug", "uz", "vi", "cy", "xh", "yi", "yo", "zu");
    private static LinkedHashSet<String> suggestedLanguageCodes = null;

    public static class Language {
        public String code;
        public String displayName;
        public String ownDisplayName;
        public String q;
    }

    static class TranslatableDecision {
        Set<Integer> certainlyTranslatable = new HashSet();
        Set<Integer> unknown = new HashSet();
        Set<Integer> certainlyNotTranslatable = new HashSet();

        TranslatableDecision() {
        }
    }

    public TranslateController(MessagesController messagesController) {
        super(messagesController.currentAccount);
        this.translatingDialogs = new LongSparseArray<>();
        this.translatableDialogs = new HashSet();
        this.translatableDialogMessages = new HashMap<>();
        this.translateDialogLanguage = new HashMap<>();
        this.detectedDialogLanguage = new HashMap<>();
        this.keptReplyMessageObjects = new HashMap<>();
        this.hideTranslateDialogs = new HashSet();
        this.pendingLanguageChecks = new ArrayList<>();
        this.loadingTranslations = new HashSet();
        this.loadingTranscriptionTranslations = new HashSet();
        this.pendingTranslations = new HashMap<>();
        this.pendingTranscriptionsTranslations = new HashMap<>();
        this.loadingSummarizations = new HashSet<>();
        this.pendingPollTranslations = new HashMap<>();
        this.detectingStories = new HashSet<>();
        this.translatingStories = new HashSet<>();
        this.detectingPhotos = new HashSet<>();
        this.translatingPhotos = new HashSet<>();
        this.messagesController = messagesController;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() throws NumberFormatException {
                this.f$0.loadTranslatingDialogsCached();
            }
        }, 150L);
    }

    public boolean isFeatureAvailable() {
        return isChatTranslateEnabled() && UserConfig.getInstance(this.currentAccount).isPremium();
    }

    public boolean isFeatureAvailable(long j) {
        if (!isChatTranslateEnabled()) {
            return false;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j));
        return UserConfig.getInstance(this.currentAccount).isPremium() || (chat != null && chat.autotranslation);
    }

    public boolean isChatTranslateEnabled() {
        if (!getMessagesController().isTranslationsAutoEnabled()) {
            return false;
        }
        if (this.chatTranslateEnabled == null) {
            this.chatTranslateEnabled = Boolean.valueOf(this.messagesController.getMainSettings().getBoolean("translate_chat_button", true));
        }
        return this.chatTranslateEnabled.booleanValue();
    }

    public boolean isContextTranslateEnabled() {
        if (!getMessagesController().isTranslationsManualEnabled()) {
            return false;
        }
        if (this.contextTranslateEnabled == null) {
            this.contextTranslateEnabled = Boolean.valueOf(this.messagesController.getMainSettings().getBoolean("translate_button", MessagesController.getGlobalMainSettings().getBoolean("translate_button", false)));
        }
        return this.contextTranslateEnabled.booleanValue();
    }

    public void setContextTranslateEnabled(boolean z) {
        SharedPreferences.Editor editorEdit = this.messagesController.getMainSettings().edit();
        this.contextTranslateEnabled = Boolean.valueOf(z);
        editorEdit.putBoolean("translate_button", z).apply();
    }

    public void setChatTranslateEnabled(boolean z) {
        SharedPreferences.Editor editorEdit = this.messagesController.getMainSettings().edit();
        this.chatTranslateEnabled = Boolean.valueOf(z);
        editorEdit.putBoolean("translate_chat_button", z).apply();
    }

    public static boolean isSummarizable(MessageObject messageObject) {
        TLRPC.Message message;
        int i;
        return (messageObject == null || (message = messageObject.messageOwner) == null || (!BuildVars.DEBUG_PRIVATE_VERSION && message.summary_from_language == null) || messageObject.isOutOwner() || messageObject.isRestrictedMessage || messageObject.isSponsored() || (((i = messageObject.type) != 0 && i != 3 && i != 1 && i != 9 && i != 14 && i != 17) || TextUtils.isEmpty(messageObject.messageOwner.message) || messageObject.messageOwner.message.length() <= 100)) ? false : true;
    }

    public static boolean isTranslatable(MessageObject messageObject) {
        int i;
        if (messageObject != null && messageObject.messageOwner != null && !messageObject.isOutOwner() && !messageObject.isRestrictedMessage && !messageObject.isSponsored() && ((i = messageObject.type) == 0 || i == 3 || i == 1 || i == 2 || i == 5 || i == 9 || i == 14 || i == 17)) {
            if (!TextUtils.isEmpty(messageObject.messageOwner.message) || (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                return true;
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message.voiceTranscriptionOpen && !TextUtils.isEmpty(message.voiceTranscription) && messageObject.messageOwner.voiceTranscriptionFinal) {
                return true;
            }
        }
        return false;
    }

    public boolean isDialogTranslatable(long j) {
        return this.translatableDialogs.contains(Long.valueOf(j)) && isFeatureAvailable(j) && !DialogObject.isEncryptedDialog(j) && getUserConfig().getClientUserId() != j;
    }

    public boolean isTranslateDialogHidden(long j) {
        if (this.hideTranslateDialogs.contains(Long.valueOf(j))) {
            return true;
        }
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j);
        if (chatFull != null) {
            return chatFull.translations_disabled;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(j);
        if (userFull != null) {
            return userFull.translations_disabled;
        }
        return false;
    }

    private boolean isChatAutoTranslated(long j) {
        TLRPC.Chat chat;
        return isDialogTranslatable(j) && (chat = getMessagesController().getChat(Long.valueOf(-j))) != null && chat.autotranslation;
    }

    public boolean isTranslatingDialog(long j) {
        return isFeatureAvailable(j) && this.translatingDialogs.get(j, Boolean.valueOf(isChatAutoTranslated(j))).booleanValue();
    }

    public void toggleTranslatingDialog(long j) {
        toggleTranslatingDialog(j, !isTranslatingDialog(j));
    }

    public boolean toggleTranslatingDialog(long j, boolean z) {
        boolean z2 = false;
        boolean zIsTranslatingDialog = isTranslatingDialog(j);
        if (z && !zIsTranslatingDialog) {
            LongSparseArray<Boolean> longSparseArray = this.translatingDialogs;
            Boolean bool = Boolean.TRUE;
            longSparseArray.put(j, bool);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j), bool);
        } else {
            if (!z && zIsTranslatingDialog) {
                LongSparseArray<Boolean> longSparseArray2 = this.translatingDialogs;
                Boolean bool2 = Boolean.FALSE;
                longSparseArray2.put(j, bool2);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j), bool2);
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
        String toLanguage = this.translateDialogLanguage.get(Long.valueOf(j));
        if (toLanguage == null && ((toLanguage = TranslateAlert2.getToLanguage()) == null || toLanguage.equals(getDialogDetectedLanguage(j)))) {
            toLanguage = currentLanguage();
        }
        return "nb".equals(toLanguage) ? "no" : toLanguage;
    }

    public void setDialogTranslateTo(final long j, final String str) {
        Boolean bool;
        if (TextUtils.equals(getDialogTranslateTo(j), str)) {
            return;
        }
        if (isTranslatingDialog(j)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setDialogTranslateTo$0(j, str);
                }
            }, 150L);
        } else {
            synchronized (this) {
                this.translateDialogLanguage.put(Long.valueOf(j), str);
            }
        }
        cancelTranslations(j);
        synchronized (this) {
            LongSparseArray<Boolean> longSparseArray = this.translatingDialogs;
            bool = Boolean.FALSE;
            longSparseArray.put(j, bool);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j), bool);
        TranslateAlert2.setToLanguage(str);
    }

    public void lambda$setDialogTranslateTo$0(long j, String str) {
        Boolean bool;
        synchronized (this) {
            this.translateDialogLanguage.put(Long.valueOf(j), str);
            LongSparseArray<Boolean> longSparseArray = this.translatingDialogs;
            bool = Boolean.TRUE;
            longSparseArray.put(j, bool);
            saveTranslatingDialogsCache();
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j), bool);
    }

    public void updateDialogFull(long j) {
        boolean z;
        if (isFeatureAvailable(j) && isDialogTranslatable(j)) {
            boolean zContains = this.hideTranslateDialogs.contains(Long.valueOf(j));
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j);
            if (chatFull != null) {
                z = chatFull.translations_disabled;
            } else {
                TLRPC.UserFull userFull = getMessagesController().getUserFull(j);
                z = userFull != null ? userFull.translations_disabled : false;
            }
            synchronized (this) {
                try {
                    if (z) {
                        this.hideTranslateDialogs.add(Long.valueOf(j));
                        this.translatingDialogs.remove(j);
                    } else {
                        this.hideTranslateDialogs.remove(Long.valueOf(j));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zContains != z) {
                saveTranslatingDialogsCache();
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j), Boolean.valueOf(isTranslatingDialog(j)));
            }
        }
    }

    public void setHideTranslateDialog(long j, boolean z) {
        setHideTranslateDialog(j, z, false);
    }

    public void setHideTranslateDialog(long j, boolean z, boolean z2) {
        TLRPC.TL_messages_togglePeerTranslations tL_messages_togglePeerTranslations = new TLRPC.TL_messages_togglePeerTranslations();
        tL_messages_togglePeerTranslations.peer = getMessagesController().getInputPeer(j);
        tL_messages_togglePeerTranslations.disabled = z;
        getConnectionsManager().sendRequest(tL_messages_togglePeerTranslations, null);
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j);
        if (chatFull != null) {
            chatFull.translations_disabled = z;
            getMessagesStorage().updateChatInfo(chatFull, true);
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(j);
        if (userFull != null) {
            userFull.translations_disabled = z;
            getMessagesStorage().updateUserInfo(userFull, true);
        }
        synchronized (this) {
            try {
                if (z) {
                    this.hideTranslateDialogs.add(Long.valueOf(j));
                    this.translatingDialogs.remove(j);
                } else {
                    this.hideTranslateDialogs.remove(Long.valueOf(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        saveTranslatingDialogsCache();
        if (z2) {
            return;
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j), Boolean.valueOf(isTranslatingDialog(j)));
    }

    public static ArrayList<Language> getLanguages() {
        ArrayList<Language> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            List<String> list = allLanguages;
            if (i >= list.size()) {
                break;
            }
            Language language = new Language();
            String str = list.get(i);
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
            i++;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            final Collator collator = Collator.getInstance(Locale.getDefault());
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return TranslateController.lambda$getLanguages$1(collator, (TranslateController.Language) obj, (TranslateController.Language) obj2);
                }
            });
        } else {
            Collections.sort(arrayList, Comparator$CC.comparing(new Function() {
                public Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override
                public final Object apply(Object obj) {
                    return ((TranslateController.Language) obj).displayName;
                }

                public Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
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
            Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
            while (it.hasNext()) {
                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
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
                return TranslateController.lambda$getLocales$3(currentLocaleInfo, (LocaleController.LocaleInfo) obj, (LocaleController.LocaleInfo) obj2);
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
        List<String> list = languagesOrder;
        int iIndexOf = list.indexOf(localeInfo2.pluralLangCode);
        int iIndexOf2 = list.indexOf(localeInfo3.pluralLangCode);
        if (iIndexOf >= 0 && iIndexOf2 >= 0) {
            return iIndexOf - iIndexOf2;
        }
        if (iIndexOf >= 0) {
            return -1;
        }
        if (iIndexOf2 >= 0) {
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

    public void checkRestrictedLanguagesUpdate() {
        synchronized (this) {
            try {
                this.translatableDialogMessages.clear();
                ArrayList arrayList = new ArrayList();
                for (Long l : this.translatableDialogs) {
                    long jLongValue = l.longValue();
                    String str = this.detectedDialogLanguage.get(l);
                    if (str != null && isLanguageRestricted(str)) {
                        cancelTranslations(jLongValue);
                        this.translatingDialogs.remove(jLongValue);
                        arrayList.add(l);
                    }
                }
                this.translatableDialogs.clear();
                saveTranslatingDialogsCache();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Long l2 = (Long) it.next();
                    l2.longValue();
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, l2, Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getDialogDetectedLanguage(long j) {
        return this.detectedDialogLanguage.get(Long.valueOf(j));
    }

    public void checkTranslation(MessageObject messageObject, boolean z) {
        checkTranslation(messageObject, z, false);
    }

    private void checkTranslation(final MessageObject messageObject, boolean z, final boolean z2) {
        PollText pollText;
        PollText pollText2;
        MessageObject messageObjectFindReplyMessageObject;
        MessageObject messageObject2;
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        final long dialogId = messageObject.getDialogId();
        if (z) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.summarizedOpen && message.summaryText == null && !isTranslatingDialog(messageObject.getDialogId())) {
                pushToSummarize(messageObject, null, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$checkTranslation$4(messageObject, dialogId, (TLRPC.TL_textWithEntities) obj);
                    }
                });
            }
        }
        if (isFeatureAvailable(dialogId)) {
            if (!z2 && (messageObject2 = messageObject.replyMessageObject) != null) {
                checkTranslation(messageObject2, z, true);
            }
            if (isTranslatable(messageObject)) {
                if (!isTranslatingDialog(dialogId)) {
                    checkLanguage(messageObject);
                    return;
                }
                if (isTranslateDialogHidden(dialogId)) {
                    return;
                }
                final String dialogTranslateTo = getDialogTranslateTo(dialogId);
                if (!z2) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    if (((((message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal) ? message2.translatedVoiceTranscription : message2.translatedText) == null && message2.translatedPoll == null) || (((pollText2 = message2.translatedPoll) != null && !PollText.isFullyTranslated(messageObject, pollText2)) || !dialogTranslateTo.equals(messageObject.messageOwner.translatedToLanguage))) && (messageObjectFindReplyMessageObject = findReplyMessageObject(dialogId, messageObject.getId())) != null) {
                        TLRPC.Message message3 = messageObject.messageOwner;
                        TLRPC.Message message4 = messageObjectFindReplyMessageObject.messageOwner;
                        message3.translatedToLanguage = message4.translatedToLanguage;
                        message3.translatedText = message4.translatedText;
                        message3.translatedPoll = message4.translatedPoll;
                        messageObject = messageObjectFindReplyMessageObject;
                    }
                }
                if (z && isTranslatingDialog(dialogId)) {
                    TLRPC.Message message5 = messageObject.messageOwner;
                    if (message5.summarizedOpen) {
                        if (message5.translatedSummaryText == null || !dialogTranslateTo.equals(message5.translatedSummaryLanguage)) {
                            final MessageObject messageObject3 = messageObject;
                            pushToSummarize(messageObject, dialogTranslateTo, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    this.f$0.lambda$checkTranslation$5(messageObject3, dialogTranslateTo, dialogId, (TLRPC.TL_textWithEntities) obj);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (!(((message5.voiceTranscriptionOpen && message5.voiceTranscriptionFinal) ? message5.translatedVoiceTranscription : message5.translatedText) == null && message5.translatedPoll == null) && (((pollText = message5.translatedPoll) == null || PollText.isFullyTranslated(messageObject, pollText)) && dialogTranslateTo.equals(messageObject.messageOwner.translatedToLanguage))) {
                        if (z2) {
                            keepReplyMessage(messageObject);
                            return;
                        }
                        return;
                    }
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslating, messageObject);
                    if (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPoll) {
                        final MessageObject messageObject4 = messageObject;
                        pushPollToTranslate(messageObject, dialogTranslateTo, new Utilities.Callback3() {
                            @Override
                            public final void run(Object obj, Object obj2, Object obj3) {
                                this.f$0.lambda$checkTranslation$6(messageObject4, z2, dialogId, (Integer) obj, (TranslateController.PollText) obj2, (String) obj3);
                            }
                        });
                    } else {
                        final MessageObject messageObject5 = messageObject;
                        pushToTranslate(messageObject, dialogTranslateTo, new Utilities.Callback4() {
                            @Override
                            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                                this.f$0.lambda$checkTranslation$7(messageObject5, z2, dialogId, (Boolean) obj, (Integer) obj2, (TLRPC.TL_textWithEntities) obj3, (String) obj4);
                            }
                        });
                    }
                }
            }
        }
    }

    public void lambda$checkTranslation$4(MessageObject messageObject, long j, TLRPC.TL_textWithEntities tL_textWithEntities) {
        messageObject.messageOwner.summaryText = tL_textWithEntities;
        getMessagesStorage().updateMessageCustomParams(j, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject, Boolean.TRUE);
    }

    public void lambda$checkTranslation$5(MessageObject messageObject, String str, long j, TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedSummaryLanguage = str;
        message.translatedSummaryText = tL_textWithEntities;
        getMessagesStorage().updateMessageCustomParams(j, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject, Boolean.TRUE);
    }

    public void lambda$checkTranslation$6(MessageObject messageObject, boolean z, long j, Integer num, PollText pollText, String str) {
        if (messageObject.getId() != num.intValue()) {
            FileLog.e("wtf, asked to translate " + messageObject.getId() + " poll but got " + num + "!");
        }
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = null;
        message.translatedVoiceTranscription = null;
        message.translatedPoll = pollText;
        if (z) {
            keepReplyMessage(messageObject);
        }
        getMessagesStorage().updateMessageCustomParams(j, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject);
        ArrayList arrayList = (ArrayList) this.messagesController.dialogMessage.get(j);
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i);
                if (messageObject2 != null && messageObject2.getId() == messageObject.getId()) {
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    message2.translatedToLanguage = str;
                    message2.translatedText = null;
                    message2.translatedVoiceTranscription = null;
                    message2.translatedPoll = pollText;
                    if (messageObject2.updateTranslation()) {
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void lambda$checkTranslation$7(MessageObject messageObject, boolean z, long j, Boolean bool, Integer num, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        if (messageObject.getId() != num.intValue()) {
            FileLog.e("wtf, asked to translate " + messageObject.getId() + " but got " + num + "!");
        }
        messageObject.messageOwner.translatedToLanguage = str;
        if (bool.booleanValue()) {
            messageObject.messageOwner.translatedVoiceTranscription = tL_textWithEntities;
        } else {
            messageObject.messageOwner.translatedText = tL_textWithEntities;
        }
        messageObject.messageOwner.translatedPoll = null;
        if (z) {
            keepReplyMessage(messageObject);
        }
        getMessagesStorage().updateMessageCustomParams(j, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject);
        ArrayList arrayList = (ArrayList) this.messagesController.dialogMessage.get(j);
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i);
                if (messageObject2 != null && messageObject2.getId() == messageObject.getId()) {
                    messageObject2.messageOwner.translatedToLanguage = str;
                    if (bool.booleanValue()) {
                        messageObject2.messageOwner.translatedVoiceTranscription = tL_textWithEntities;
                    } else {
                        messageObject2.messageOwner.translatedText = tL_textWithEntities;
                    }
                    messageObject2.messageOwner.translatedPoll = null;
                    if (messageObject2.updateTranslation()) {
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void invalidateTranslation(final MessageObject messageObject) {
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        final long dialogId = messageObject.getDialogId();
        if (isFeatureAvailable(dialogId)) {
            TLRPC.Message message = messageObject.messageOwner;
            message.translatedToLanguage = null;
            message.translatedText = null;
            message.translatedVoiceTranscription = null;
            message.translatedPoll = null;
            message.summaryText = null;
            message.translatedSummaryText = null;
            message.translatedSummaryLanguage = null;
            getMessagesStorage().updateMessageCustomParams(dialogId, messageObject.messageOwner);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$invalidateTranslation$8(messageObject, dialogId);
                }
            });
        }
    }

    public void lambda$invalidateTranslation$8(MessageObject messageObject, long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject, Boolean.FALSE, Boolean.valueOf(isTranslatingDialog(j)));
    }

    public void checkDialogMessage(long j) {
        if (isFeatureAvailable(j)) {
            checkDialogMessageSure(j);
        }
    }

    public void checkDialogMessageSure(final long j) {
        if (this.translatingDialogs.get(j, Boolean.valueOf(isChatAutoTranslated(j))).booleanValue()) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkDialogMessageSure$10(j);
                }
            });
        }
    }

    public void lambda$checkDialogMessageSure$10(long j) {
        final ArrayList arrayList = (ArrayList) this.messagesController.dialogMessage.get(j);
        if (arrayList == null) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i);
            if (messageObject == null || messageObject.messageOwner == null) {
                arrayList2.add(null);
            } else {
                arrayList2.add(getMessagesStorage().getMessageWithCustomParamsOnlyInternal(messageObject.getId(), messageObject.getDialogId()));
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkDialogMessageSure$9(arrayList2, arrayList);
            }
        });
    }

    public void lambda$checkDialogMessageSure$9(ArrayList arrayList, ArrayList arrayList2) {
        TLRPC.Message message;
        boolean z = false;
        for (int i = 0; i < Math.min(arrayList.size(), arrayList2.size()); i++) {
            MessageObject messageObject = (MessageObject) arrayList2.get(i);
            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(i);
            if (messageObject != null && (message = messageObject.messageOwner) != null && message2 != null) {
                message.translatedText = message2.translatedText;
                message.translatedPoll = message2.translatedPoll;
                message.translatedToLanguage = message2.translatedToLanguage;
                if (messageObject.updateTranslation(false)) {
                    z = true;
                }
            }
        }
        if (z) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
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
        this.loadingTranscriptionTranslations.clear();
    }

    public void reset() {
        this.translatableDialogMessages.clear();
        this.detectedDialogLanguage.clear();
    }

    private void checkLanguage(final MessageObject messageObject) {
        TLRPC.Message message;
        if (LanguageDetector.hasSupport() && isTranslatable(messageObject) && (message = messageObject.messageOwner) != null && !TextUtils.isEmpty(message.message)) {
            if (messageObject.messageOwner.originalLanguage != null) {
                checkDialogTranslatable(messageObject);
                return;
            }
            final long dialogId = messageObject.getDialogId();
            final int iHash = hash(messageObject);
            if (isDialogTranslatable(dialogId) || this.pendingLanguageChecks.contains(Integer.valueOf(iHash))) {
                return;
            }
            this.pendingLanguageChecks.add(Integer.valueOf(iHash));
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkLanguage$15(messageObject, dialogId, iHash);
                }
            });
        }
    }

    public void lambda$checkLanguage$12(final MessageObject messageObject, final long j, final int i, final String str) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkLanguage$11(str, messageObject, j, i);
            }
        });
    }

    public void lambda$checkLanguage$15(final MessageObject messageObject, final long j, final int i) {
        LanguageDetector.detectLanguage(messageObject.messageOwner.message, new LanguageDetector.StringCallback() {
            @Override
            public final void run(String str) {
                this.f$0.lambda$checkLanguage$12(messageObject, j, i, str);
            }
        }, new LanguageDetector.ExceptionCallback() {
            @Override
            public final void run(Exception exc) {
                this.f$0.lambda$checkLanguage$14(messageObject, j, i, exc);
            }
        });
    }

    public void lambda$checkLanguage$11(String str, MessageObject messageObject, long j, int i) {
        if (str == null) {
            str = "und";
        }
        messageObject.messageOwner.originalLanguage = str;
        getMessagesStorage().updateMessageCustomParams(j, messageObject.messageOwner);
        this.pendingLanguageChecks.remove(Integer.valueOf(i));
        checkDialogTranslatable(messageObject);
    }

    public void lambda$checkLanguage$14(final MessageObject messageObject, final long j, final int i, Exception exc) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkLanguage$13(messageObject, j, i);
            }
        });
    }

    public void lambda$checkLanguage$13(MessageObject messageObject, long j, int i) {
        messageObject.messageOwner.originalLanguage = "und";
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
            HashMap<Long, TranslatableDecision> map = this.translatableDialogMessages;
            Long lValueOf = Long.valueOf(dialogId);
            TranslatableDecision translatableDecision2 = new TranslatableDecision();
            map.put(lValueOf, translatableDecision2);
            translatableDecision = translatableDecision2;
        }
        boolean z = false;
        boolean z2 = isTranslatable(messageObject) && ((str2 = messageObject.messageOwner.originalLanguage) == null || "und".equals(str2));
        if (isTranslatable(messageObject) && (str = messageObject.messageOwner.originalLanguage) != null && !"und".equals(str) && !isLanguageRestricted(messageObject.messageOwner.originalLanguage)) {
            z = true;
        }
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
        int size3 = size + size2 + translatableDecision.certainlyNotTranslatable.size();
        boolean zIsChatAutoTranslated = isChatAutoTranslated(dialogId);
        if (size3 >= (zIsChatAutoTranslated ? 2 : 6)) {
            if (zIsChatAutoTranslated) {
                if (size < 2.0f) {
                    return;
                }
            } else if (size / (size + r2) < 0.6f) {
                return;
            }
            if (size2 / size3 < (zIsChatAutoTranslated ? 0.8f : 0.65f)) {
                this.translatableDialogs.add(Long.valueOf(dialogId));
                this.translatableDialogMessages.remove(Long.valueOf(dialogId));
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$checkDialogTranslatable$16(dialogId);
                    }
                }, 450L);
            }
        }
    }

    public void lambda$checkDialogTranslatable$16(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogIsTranslatable, Long.valueOf(j));
    }

    private void pushToSummarize(MessageObject messageObject, String str, final Utilities.Callback<TLRPC.TL_textWithEntities> callback) {
        final int iHash = Objects.hash(Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), Integer.valueOf(str != null ? 1 : 0));
        if (this.loadingSummarizations.contains(Integer.valueOf(iHash))) {
            return;
        }
        this.loadingSummarizations.add(Integer.valueOf(iHash));
        TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
        tL_messages_summarizeText.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
        tL_messages_summarizeText.id = messageObject.getId();
        if (str != null) {
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.to_lang = str;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$pushToSummarize$18(iHash, callback, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$pushToSummarize$18(final int i, final Utilities.Callback callback, final TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$pushToSummarize$17(tL_textWithEntities, i, callback);
            }
        });
    }

    public void lambda$pushToSummarize$17(TLRPC.TL_textWithEntities tL_textWithEntities, int i, Utilities.Callback callback) {
        if (tL_textWithEntities != null) {
            this.loadingSummarizations.remove(Integer.valueOf(i));
            callback.run(tL_textWithEntities);
        }
    }

    static class PendingTranslation {
        ArrayList<Utilities.Callback4<Boolean, Integer, TLRPC.TL_textWithEntities, String>> callbacks;
        int delay;
        String language;
        ArrayList<Integer> messageIds;
        ArrayList<TLRPC.TL_textWithEntities> messageTexts;
        int reqId;
        Runnable runnable;
        int symbolsCount;

        private PendingTranslation() {
            this.messageIds = new ArrayList<>();
            this.messageTexts = new ArrayList<>();
            this.callbacks = new ArrayList<>();
            this.delay = 80;
            this.reqId = -1;
        }
    }

    private void pushToTranslate(MessageObject messageObject, String str, Utilities.Callback4<Boolean, Integer, TLRPC.TL_textWithEntities, String> callback4) {
        PendingTranslation pendingTranslation;
        String str2;
        if (messageObject == null || messageObject.messageOwner == null || messageObject.getId() < 0 || callback4 == null) {
            return;
        }
        TLRPC.Message message = messageObject.messageOwner;
        int length = 0;
        final boolean z = message.voiceTranscription != null && message.voiceTranscriptionFinal && message.voiceTranscriptionOpen;
        final long dialogId = messageObject.getDialogId();
        final HashMap<Long, ArrayList<PendingTranslation>> map = z ? this.pendingTranscriptionsTranslations : this.pendingTranslations;
        final Set<Integer> set = z ? this.loadingTranscriptionTranslations : this.loadingTranslations;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        if (z) {
            String str3 = messageObject.messageOwner.voiceTranscription;
            tL_textWithEntities.text = str3;
            if (TextUtils.isEmpty(str3)) {
                return;
            }
        } else {
            TLRPC.Message message2 = messageObject.messageOwner;
            tL_textWithEntities.text = message2.message;
            tL_textWithEntities.entities = message2.entities;
        }
        synchronized (this) {
            try {
                ArrayList<PendingTranslation> arrayList = map.get(Long.valueOf(dialogId));
                if (arrayList == null) {
                    Long lValueOf = Long.valueOf(dialogId);
                    ArrayList<PendingTranslation> arrayList2 = new ArrayList<>();
                    map.put(lValueOf, arrayList2);
                    arrayList = arrayList2;
                }
                if (arrayList.isEmpty()) {
                    pendingTranslation = new PendingTranslation();
                    arrayList.add(pendingTranslation);
                } else {
                    pendingTranslation = arrayList.get(arrayList.size() - 1);
                }
                if (pendingTranslation.messageIds.contains(Integer.valueOf(messageObject.getId()))) {
                    return;
                }
                if (z) {
                    String str4 = messageObject.messageOwner.voiceTranscription;
                    if (str4 != null) {
                        length = str4.length();
                    }
                } else {
                    TLRPC.Message message3 = messageObject.messageOwner;
                    if (message3 != null && (str2 = message3.message) != null) {
                        length = str2.length();
                    } else {
                        CharSequence charSequence = messageObject.caption;
                        if (charSequence != null) {
                            length = charSequence.length();
                        } else {
                            CharSequence charSequence2 = messageObject.messageText;
                            if (charSequence2 != null) {
                                length = charSequence2.length();
                            }
                        }
                    }
                }
                if (pendingTranslation.symbolsCount + length >= 25000 || pendingTranslation.messageIds.size() + 1 >= 20) {
                    AndroidUtilities.cancelRunOnUIThread(pendingTranslation.runnable);
                    AndroidUtilities.runOnUIThread(pendingTranslation.runnable);
                    pendingTranslation = new PendingTranslation();
                    arrayList.add(pendingTranslation);
                }
                Runnable runnable = pendingTranslation.runnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                set.add(Integer.valueOf(messageObject.getId()));
                pendingTranslation.messageIds.add(Integer.valueOf(messageObject.getId()));
                FileLog.d("pending translation +" + messageObject.getId() + " message");
                pendingTranslation.messageTexts.add(tL_textWithEntities);
                pendingTranslation.callbacks.add(callback4);
                pendingTranslation.language = str;
                pendingTranslation.symbolsCount = pendingTranslation.symbolsCount + length;
                final PendingTranslation pendingTranslation2 = pendingTranslation;
                Runnable runnable2 = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$pushToTranslate$23(map, dialogId, pendingTranslation2, z, set);
                    }
                };
                pendingTranslation.runnable = runnable2;
                AndroidUtilities.runOnUIThread(runnable2, pendingTranslation.delay);
                pendingTranslation.delay /= 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void lambda$pushToTranslate$23(HashMap map, final long j, final PendingTranslation pendingTranslation, final boolean z, final Set set) {
        synchronized (this) {
            try {
                ArrayList arrayList = (ArrayList) map.get(Long.valueOf(j));
                if (arrayList != null) {
                    arrayList.remove(pendingTranslation);
                    if (arrayList.isEmpty()) {
                        map.remove(Long.valueOf(j));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        String str = getMessagesController().translationsAutoEnabled;
        if ("alternative".equals(str) || "system".equals(str)) {
            final String str2 = pendingTranslation.language;
            for (int i = 0; i < pendingTranslation.messageIds.size(); i++) {
                final int iIntValue = pendingTranslation.messageIds.get(i).intValue();
                final Utilities.Callback4<Boolean, Integer, TLRPC.TL_textWithEntities, String> callback4 = pendingTranslation.callbacks.get(i);
                TranslateAlert2.alternativeTranslate(pendingTranslation.messageTexts.get(i).text, null, str2, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        this.f$0.lambda$pushToTranslate$19(callback4, z, iIntValue, str2, j, (String) obj, (Boolean) obj2);
                    }
                });
            }
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        if (z) {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.addAll(pendingTranslation.messageTexts);
        } else {
            tL_messages_translateText.flags |= 1;
            tL_messages_translateText.peer = getMessagesController().getInputPeer(j);
            tL_messages_translateText.id = pendingTranslation.messageIds;
        }
        tL_messages_translateText.to_lang = pendingTranslation.language;
        int iSendRequest = getConnectionsManager().sendRequest(tL_messages_translateText, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$pushToTranslate$22(pendingTranslation, z, j, set, tLObject, tL_error);
            }
        });
        synchronized (this) {
            pendingTranslation.reqId = iSendRequest;
        }
    }

    public void lambda$pushToTranslate$19(Utilities.Callback4 callback4, boolean z, int i, String str, long j, String str2, Boolean bool) {
        if (str2 != null) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_textWithEntities.text = str2;
            callback4.run(Boolean.valueOf(z), Integer.valueOf(i), tL_textWithEntities, str);
        } else {
            toggleTranslatingDialog(j, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2));
        }
    }

    public void lambda$pushToTranslate$22(final PendingTranslation pendingTranslation, final boolean z, final long j, final Set set, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$pushToTranslate$21(pendingTranslation, tLObject, z, tL_error, j, set);
            }
        });
    }

    public void lambda$pushToTranslate$21(org.telegram.messenger.TranslateController.PendingTranslation r18, org.telegram.tgnet.TLObject r19, final boolean r20, org.telegram.tgnet.TLRPC.TL_error r21, final long r22, java.util.Set r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TranslateController.lambda$pushToTranslate$21(org.telegram.messenger.TranslateController$PendingTranslation, org.telegram.tgnet.TLObject, boolean, org.telegram.tgnet.TLRPC$TL_error, long, java.util.Set):void");
    }

    public void lambda$pushToTranslate$20(Utilities.Callback4 callback4, boolean z, int i, String str, long j, String str2, Boolean bool) {
        if (str2 != null) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_textWithEntities.text = str2;
            callback4.run(Boolean.valueOf(z), Integer.valueOf(i), tL_textWithEntities, str);
        } else {
            toggleTranslatingDialog(j, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2));
        }
    }

    static class PendingPollTranslation {
        ArrayList<Utilities.Callback3<Integer, PollText, String>> callbacks;
        int delay;
        String language;
        ArrayList<Integer> messageIds;
        ArrayList<Pair<PollText, PollText>> messageTexts;
        int reqId;
        Runnable runnable;
        int symbolsCount;

        private PendingPollTranslation() {
            this.messageIds = new ArrayList<>();
            this.messageTexts = new ArrayList<>();
            this.callbacks = new ArrayList<>();
            this.delay = 80;
            this.reqId = -1;
        }
    }

    private void pushPollToTranslate(MessageObject messageObject, String str, Utilities.Callback3<Integer, PollText, String> callback3) {
        final PendingPollTranslation pendingPollTranslation;
        if (messageObject == null || messageObject.getId() < 0 || callback3 == null) {
            return;
        }
        final long dialogId = messageObject.getDialogId();
        synchronized (this) {
            try {
                ArrayList<PendingPollTranslation> arrayList = this.pendingPollTranslations.get(Long.valueOf(dialogId));
                if (arrayList == null) {
                    HashMap<Long, ArrayList<PendingPollTranslation>> map = this.pendingPollTranslations;
                    Long lValueOf = Long.valueOf(dialogId);
                    ArrayList<PendingPollTranslation> arrayList2 = new ArrayList<>();
                    map.put(lValueOf, arrayList2);
                    arrayList = arrayList2;
                }
                if (arrayList.isEmpty()) {
                    pendingPollTranslation = new PendingPollTranslation();
                    arrayList.add(pendingPollTranslation);
                } else {
                    pendingPollTranslation = arrayList.get(arrayList.size() - 1);
                }
                if (pendingPollTranslation.messageIds.contains(Integer.valueOf(messageObject.getId()))) {
                    return;
                }
                TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
                if (media instanceof TLRPC.TL_messageMediaPoll) {
                    PollText pollTextFromPoll = PollText.fromPoll((TLRPC.TL_messageMediaPoll) media);
                    PollText pollText = messageObject.messageOwner.translatedPoll;
                    int length = pollTextFromPoll.length();
                    if (pendingPollTranslation.symbolsCount + length >= 25000 || pendingPollTranslation.messageIds.size() + 1 >= 20) {
                        AndroidUtilities.cancelRunOnUIThread(pendingPollTranslation.runnable);
                        AndroidUtilities.runOnUIThread(pendingPollTranslation.runnable);
                        pendingPollTranslation = new PendingPollTranslation();
                        arrayList.add(pendingPollTranslation);
                    }
                    Runnable runnable = pendingPollTranslation.runnable;
                    if (runnable != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable);
                    }
                    this.loadingTranslations.add(Integer.valueOf(messageObject.getId()));
                    pendingPollTranslation.messageIds.add(Integer.valueOf(messageObject.getId()));
                    FileLog.d("pending translation +" + messageObject.getId() + " poll message");
                    pendingPollTranslation.messageTexts.add(new Pair<>(pollTextFromPoll, pollText));
                    pendingPollTranslation.callbacks.add(callback3);
                    pendingPollTranslation.language = str;
                    pendingPollTranslation.symbolsCount = pendingPollTranslation.symbolsCount + length;
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$pushPollToTranslate$26(dialogId, pendingPollTranslation);
                        }
                    };
                    pendingPollTranslation.runnable = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, pendingPollTranslation.delay);
                    pendingPollTranslation.delay /= 2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void lambda$pushPollToTranslate$26(final long j, final PendingPollTranslation pendingPollTranslation) {
        synchronized (this) {
            try {
                ArrayList<PendingTranslation> arrayList = this.pendingTranslations.get(Long.valueOf(j));
                if (arrayList != null) {
                    arrayList.remove(pendingPollTranslation);
                    if (arrayList.isEmpty()) {
                        this.pendingTranslations.remove(Long.valueOf(j));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.flags |= 2;
        Iterator<Pair<PollText, PollText>> it = pendingPollTranslation.messageTexts.iterator();
        while (it.hasNext()) {
            Pair<PollText, PollText> next = it.next();
            PollText pollText = (PollText) next.first;
            PollText pollText2 = (PollText) next.second;
            TLRPC.TL_textWithEntities tL_textWithEntities = pollText.question;
            if (tL_textWithEntities != null && (pollText2 == null || pollText2.question == null)) {
                tL_messages_translateText.text.add(tL_textWithEntities);
            }
            if (pollText.answers.size() != (pollText2 == null ? 0 : pollText2.answers.size())) {
                Iterator<TLRPC.PollAnswer> it2 = pollText.answers.iterator();
                while (it2.hasNext()) {
                    tL_messages_translateText.text.add(it2.next().text);
                }
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = pollText.solution;
            if (tL_textWithEntities2 != null && (pollText2 == null || pollText2.solution == null)) {
                tL_messages_translateText.text.add(tL_textWithEntities2);
            }
        }
        tL_messages_translateText.to_lang = pendingPollTranslation.language;
        int iSendRequest = getConnectionsManager().sendRequest(tL_messages_translateText, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$pushPollToTranslate$25(pendingPollTranslation, j, tLObject, tL_error);
            }
        });
        synchronized (this) {
            pendingPollTranslation.reqId = iSendRequest;
        }
    }

    public void lambda$pushPollToTranslate$25(final PendingPollTranslation pendingPollTranslation, final long j, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$pushPollToTranslate$24(pendingPollTranslation, tLObject, tL_error, j);
            }
        });
    }

    public void lambda$pushPollToTranslate$24(org.telegram.messenger.TranslateController.PendingPollTranslation r18, org.telegram.tgnet.TLObject r19, org.telegram.tgnet.TLRPC.TL_error r20, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TranslateController.lambda$pushPollToTranslate$24(org.telegram.messenger.TranslateController$PendingPollTranslation, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error, long):void");
    }

    public boolean isTranslating(org.telegram.messenger.MessageObject r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TranslateController.isTranslating(org.telegram.messenger.MessageObject):boolean");
    }

    public boolean isTranslating(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages) {
        if (messageObject == null || !isTranslatingDialog(messageObject.getDialogId())) {
            return false;
        }
        TLRPC.Message message = messageObject.messageOwner;
        boolean z = message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal;
        synchronized (this) {
            try {
                if ((z ? this.loadingTranscriptionTranslations : this.loadingTranslations).contains(Integer.valueOf(messageObject.getId()))) {
                    return true;
                }
                if (groupedMessages != null) {
                    Iterator<MessageObject> it = groupedMessages.messages.iterator();
                    while (it.hasNext()) {
                        if ((z ? this.loadingTranscriptionTranslations : this.loadingTranslations).contains(Integer.valueOf(it.next().getId()))) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void cancelAllTranslations() {
        synchronized (this) {
            try {
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
                for (ArrayList<PendingTranslation> arrayList2 : this.pendingTranscriptionsTranslations.values()) {
                    if (arrayList2 != null) {
                        Iterator<PendingTranslation> it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            PendingTranslation next2 = it3.next();
                            AndroidUtilities.cancelRunOnUIThread(next2.runnable);
                            if (next2.reqId != -1) {
                                getConnectionsManager().cancelRequest(next2.reqId, true);
                                Iterator<Integer> it4 = next2.messageIds.iterator();
                                while (it4.hasNext()) {
                                    this.loadingTranscriptionTranslations.remove(it4.next());
                                }
                            }
                        }
                    }
                }
                for (ArrayList<PendingPollTranslation> arrayList3 : this.pendingPollTranslations.values()) {
                    if (arrayList3 != null) {
                        Iterator<PendingPollTranslation> it5 = arrayList3.iterator();
                        while (it5.hasNext()) {
                            PendingPollTranslation next3 = it5.next();
                            AndroidUtilities.cancelRunOnUIThread(next3.runnable);
                            if (next3.reqId != -1) {
                                getConnectionsManager().cancelRequest(next3.reqId, true);
                                Iterator<Integer> it6 = next3.messageIds.iterator();
                                while (it6.hasNext()) {
                                    this.loadingTranslations.remove(it6.next());
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void cancelTranslations(long j) {
        synchronized (this) {
            try {
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
                ArrayList<PendingTranslation> arrayList2 = this.pendingTranscriptionsTranslations.get(Long.valueOf(j));
                if (arrayList2 != null) {
                    Iterator<PendingTranslation> it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        PendingTranslation next2 = it3.next();
                        AndroidUtilities.cancelRunOnUIThread(next2.runnable);
                        if (next2.reqId != -1) {
                            getConnectionsManager().cancelRequest(next2.reqId, true);
                            Iterator<Integer> it4 = next2.messageIds.iterator();
                            while (it4.hasNext()) {
                                this.loadingTranscriptionTranslations.remove(it4.next());
                            }
                        }
                    }
                    this.pendingTranscriptionsTranslations.remove(Long.valueOf(j));
                }
                ArrayList<PendingPollTranslation> arrayList3 = this.pendingPollTranslations.get(Long.valueOf(j));
                if (arrayList3 != null) {
                    Iterator<PendingPollTranslation> it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        PendingPollTranslation next3 = it5.next();
                        AndroidUtilities.cancelRunOnUIThread(next3.runnable);
                        if (next3.reqId != -1) {
                            getConnectionsManager().cancelRequest(next3.reqId, true);
                            Iterator<Integer> it6 = next3.messageIds.iterator();
                            while (it6.hasNext()) {
                                this.loadingTranslations.remove(it6.next());
                            }
                        }
                    }
                    this.pendingPollTranslations.remove(Long.valueOf(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void keepReplyMessage(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        HashMap<Integer, MessageObject> map = this.keptReplyMessageObjects.get(Long.valueOf(messageObject.getDialogId()));
        if (map == null) {
            HashMap<Long, HashMap<Integer, MessageObject>> map2 = this.keptReplyMessageObjects;
            Long lValueOf = Long.valueOf(messageObject.getDialogId());
            HashMap<Integer, MessageObject> map3 = new HashMap<>();
            map2.put(lValueOf, map3);
            map = map3;
        }
        map.put(Integer.valueOf(messageObject.getId()), messageObject);
    }

    public MessageObject findReplyMessageObject(long j, int i) {
        HashMap<Integer, MessageObject> map = this.keptReplyMessageObjects.get(Long.valueOf(j));
        if (map == null) {
            return null;
        }
        return map.get(Integer.valueOf(i));
    }

    private void clearAllKeptReplyMessages(long j) {
        this.keptReplyMessageObjects.remove(Long.valueOf(j));
    }

    private boolean isLanguageRestricted(String str) {
        if (getUserConfig().isPremium()) {
            return RestrictedLanguagesSelectActivity.getRestrictedLanguages().contains(str);
        }
        try {
            return TextUtils.equals(LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode, str);
        } catch (Exception unused) {
            return false;
        }
    }

    public void loadTranslatingDialogsCached() throws NumberFormatException {
        boolean z;
        String string = this.messagesController.getMainSettings().getString("translating_dialog_languages2", null);
        if (string == null) {
            return;
        }
        for (String str : string.split(";")) {
            String[] strArrSplit = str.split("=");
            if (strArrSplit.length >= 2) {
                long j = Long.parseLong(strArrSplit[0]);
                String[] strArrSplit2 = strArrSplit[1].split(">");
                if (strArrSplit2.length == 2) {
                    String str2 = strArrSplit2[0];
                    String strSubstring = strArrSplit2[1];
                    if (strSubstring.length() <= 0 || strSubstring.charAt(strSubstring.length() - 1) != '!') {
                        z = false;
                    } else {
                        strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                        z = true;
                    }
                    if ("null".equals(str2)) {
                        str2 = null;
                    }
                    if ("null".equals(strSubstring)) {
                        strSubstring = null;
                    }
                    if (str2 != null) {
                        this.detectedDialogLanguage.put(Long.valueOf(j), str2);
                        if (!isLanguageRestricted(str2)) {
                            this.translatingDialogs.put(j, Boolean.valueOf(true ^ z));
                            this.translatableDialogs.add(Long.valueOf(j));
                        }
                        if (strSubstring != null) {
                            this.translateDialogLanguage.put(Long.valueOf(j), strSubstring);
                        }
                    }
                }
            }
        }
        Set<String> stringSet = this.messagesController.getMainSettings().getStringSet("hidden_translation_at", null);
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    this.hideTranslateDialogs.add(Long.valueOf(Long.parseLong(it.next())));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    private void saveTranslatingDialogsCache() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (int i = 0; i < this.translatingDialogs.size(); i++) {
            try {
                long jKeyAt = this.translatingDialogs.keyAt(i);
                if (!z) {
                    sb.append(";");
                }
                if (z) {
                    z = false;
                }
                String str = this.detectedDialogLanguage.get(Long.valueOf(jKeyAt));
                String str2 = "null";
                if (str == null) {
                    str = "null";
                }
                String dialogTranslateTo = getDialogTranslateTo(jKeyAt);
                if (dialogTranslateTo != null) {
                    str2 = dialogTranslateTo;
                }
                sb.append(jKeyAt);
                sb.append("=");
                sb.append(str);
                sb.append(">");
                sb.append(str2);
                if (!this.translatingDialogs.valueAt(i).booleanValue()) {
                    sb.append("!");
                }
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

    public void detectStoryLanguage(final TL_stories.StoryItem storyItem) {
        String str;
        if (storyItem == null || storyItem.detectedLng != null || (str = storyItem.caption) == null || str.length() == 0 || !LanguageDetector.hasSupport()) {
            return;
        }
        final StoryKey storyKey = new StoryKey(storyItem);
        if (this.detectingStories.contains(storyKey)) {
            return;
        }
        this.detectingStories.add(storyKey);
        LanguageDetector.detectLanguage(storyItem.caption, new LanguageDetector.StringCallback() {
            @Override
            public final void run(String str2) {
                this.f$0.lambda$detectStoryLanguage$28(storyItem, storyKey, str2);
            }
        }, new LanguageDetector.ExceptionCallback() {
            @Override
            public final void run(Exception exc) {
                this.f$0.lambda$detectStoryLanguage$30(storyItem, storyKey, exc);
            }
        });
    }

    public void lambda$detectStoryLanguage$28(final TL_stories.StoryItem storyItem, final StoryKey storyKey, final String str) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$detectStoryLanguage$27(storyItem, str, storyKey);
            }
        });
    }

    public void lambda$detectStoryLanguage$27(TL_stories.StoryItem storyItem, String str, StoryKey storyKey) {
        storyItem.detectedLng = str;
        getMessagesController().getStoriesController().getStoriesStorage().putStoryInternal(storyItem.dialogId, storyItem);
        this.detectingStories.remove(storyKey);
    }

    public void lambda$detectStoryLanguage$30(final TL_stories.StoryItem storyItem, final StoryKey storyKey, Exception exc) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$detectStoryLanguage$29(storyItem, storyKey);
            }
        });
    }

    public void lambda$detectStoryLanguage$29(TL_stories.StoryItem storyItem, StoryKey storyKey) {
        storyItem.detectedLng = "und";
        getMessagesController().getStoriesController().getStoriesStorage().putStoryInternal(storyItem.dialogId, storyItem);
        this.detectingStories.remove(storyKey);
    }

    public boolean canTranslateStory(TL_stories.StoryItem storyItem) {
        String str;
        return (storyItem == null || TextUtils.isEmpty(storyItem.caption) || Emoji.fullyConsistsOfEmojis(storyItem.caption) || ((storyItem.detectedLng != null || storyItem.translatedText == null || !TextUtils.equals(storyItem.translatedLng, TranslateAlert2.getToLanguage())) && ((str = storyItem.detectedLng) == null || isLanguageRestricted(str)))) ? false : true;
    }

    public void translateStory(final TL_stories.StoryItem storyItem, final Runnable runnable) {
        if (storyItem == null) {
            return;
        }
        final StoryKey storyKey = new StoryKey(storyItem);
        final String toLanguage = TranslateAlert2.getToLanguage();
        if (storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, toLanguage)) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            if (this.translatingStories.contains(storyKey)) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            this.translatingStories.add(storyKey);
            TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
            tL_messages_translateText.flags |= 2;
            final TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_textWithEntities.text = storyItem.caption;
            tL_textWithEntities.entities = storyItem.entities;
            tL_messages_translateText.text.add(tL_textWithEntities);
            tL_messages_translateText.to_lang = toLanguage;
            getConnectionsManager().sendRequest(tL_messages_translateText, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$translateStory$34(storyItem, toLanguage, storyKey, runnable, tL_textWithEntities, tLObject, tL_error);
                }
            });
        }
    }

    public void lambda$translateStory$34(final TL_stories.StoryItem storyItem, final String str, final StoryKey storyKey, final Runnable runnable, final TLRPC.TL_textWithEntities tL_textWithEntities, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
            if (arrayList.size() <= 0) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$translateStory$31(storyItem, str, storyKey, runnable);
                    }
                });
                return;
            } else {
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = arrayList.get(0);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$translateStory$32(storyItem, str, tL_textWithEntities, tL_textWithEntities2, storyKey, runnable);
                    }
                });
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$translateStory$33(storyItem, str, storyKey, runnable);
            }
        });
    }

    public void lambda$translateStory$31(TL_stories.StoryItem storyItem, String str, StoryKey storyKey, Runnable runnable) {
        storyItem.translatedLng = str;
        storyItem.translatedText = null;
        getMessagesController().getStoriesController().getStoriesStorage().putStoryInternal(storyItem.dialogId, storyItem);
        this.translatingStories.remove(storyKey);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$translateStory$32(TL_stories.StoryItem storyItem, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, StoryKey storyKey, Runnable runnable) {
        storyItem.translatedLng = str;
        storyItem.translatedText = TranslateAlert2.preprocess(tL_textWithEntities, tL_textWithEntities2);
        getMessagesController().getStoriesController().getStoriesStorage().putStoryInternal(storyItem.dialogId, storyItem);
        this.translatingStories.remove(storyKey);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$translateStory$33(TL_stories.StoryItem storyItem, String str, StoryKey storyKey, Runnable runnable) {
        storyItem.translatedLng = str;
        storyItem.translatedText = null;
        getMessagesController().getStoriesController().getStoriesStorage().putStoryInternal(storyItem.dialogId, storyItem);
        this.translatingStories.remove(storyKey);
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean isTranslatingStory(TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return false;
        }
        return this.translatingStories.contains(new StoryKey(storyItem));
    }

    static class StoryKey {
        public long dialogId;
        public int storyId;

        public StoryKey(TL_stories.StoryItem storyItem) {
            this.dialogId = storyItem.dialogId;
            this.storyId = storyItem.id;
        }
    }

    public void detectPhotoLanguage(final MessageObject messageObject, final Utilities.Callback<String> callback) {
        if (messageObject == null || messageObject.messageOwner == null || !LanguageDetector.hasSupport() || TextUtils.isEmpty(messageObject.messageOwner.message)) {
            return;
        }
        if (!TextUtils.isEmpty(messageObject.messageOwner.originalLanguage)) {
            if (callback != null) {
                callback.run(messageObject.messageOwner.originalLanguage);
            }
        } else {
            final MessageKey messageKey = new MessageKey(messageObject);
            if (this.detectingPhotos.contains(messageKey)) {
                return;
            }
            this.detectingPhotos.add(messageKey);
            LanguageDetector.detectLanguage(messageObject.messageOwner.message, new LanguageDetector.StringCallback() {
                @Override
                public final void run(String str) {
                    this.f$0.lambda$detectPhotoLanguage$36(messageObject, messageKey, callback, str);
                }
            }, new LanguageDetector.ExceptionCallback() {
                @Override
                public final void run(Exception exc) {
                    this.f$0.lambda$detectPhotoLanguage$38(messageObject, messageKey, callback, exc);
                }
            });
        }
    }

    public void lambda$detectPhotoLanguage$36(final MessageObject messageObject, final MessageKey messageKey, final Utilities.Callback callback, final String str) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$detectPhotoLanguage$35(messageObject, str, messageKey, callback);
            }
        });
    }

    public void lambda$detectPhotoLanguage$35(MessageObject messageObject, String str, MessageKey messageKey, Utilities.Callback callback) {
        messageObject.messageOwner.originalLanguage = str;
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.detectingPhotos.remove(messageKey);
        if (callback != null) {
            callback.run(str);
        }
    }

    public void lambda$detectPhotoLanguage$38(final MessageObject messageObject, final MessageKey messageKey, final Utilities.Callback callback, Exception exc) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$detectPhotoLanguage$37(messageObject, messageKey, callback);
            }
        });
    }

    public void lambda$detectPhotoLanguage$37(MessageObject messageObject, MessageKey messageKey, Utilities.Callback callback) {
        messageObject.messageOwner.originalLanguage = "und";
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.detectingPhotos.remove(messageKey);
        if (callback != null) {
            callback.run("und");
        }
    }

    public boolean canTranslatePhoto(org.telegram.messenger.MessageObject r3, java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TranslateController.canTranslatePhoto(org.telegram.messenger.MessageObject, java.lang.String):boolean");
    }

    public void translatePhoto(final MessageObject messageObject, final Runnable runnable) {
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        final MessageKey messageKey = new MessageKey(messageObject);
        final String toLanguage = TranslateAlert2.getToLanguage();
        TLRPC.Message message = messageObject.messageOwner;
        if (message.translatedText != null && TextUtils.equals(message.translatedToLanguage, toLanguage)) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (this.translatingPhotos.contains(messageKey)) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        this.translatingPhotos.add(messageKey);
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.flags |= 2;
        final TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        TLRPC.Message message2 = messageObject.messageOwner;
        tL_textWithEntities.text = message2.message;
        ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
        tL_textWithEntities.entities = arrayList;
        if (arrayList == null) {
            tL_textWithEntities.entities = new ArrayList<>();
        }
        tL_messages_translateText.text.add(tL_textWithEntities);
        tL_messages_translateText.to_lang = toLanguage;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        getConnectionsManager().sendRequest(tL_messages_translateText, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$translatePhoto$42(messageObject, toLanguage, messageKey, runnable, jCurrentTimeMillis, tL_textWithEntities, tLObject, tL_error);
            }
        });
    }

    public void lambda$translatePhoto$42(final MessageObject messageObject, final String str, final MessageKey messageKey, final Runnable runnable, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
            if (arrayList.size() <= 0) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$translatePhoto$39(messageObject, str, messageKey, runnable, j);
                    }
                });
                return;
            } else {
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = arrayList.get(0);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$translatePhoto$40(messageObject, str, tL_textWithEntities, tL_textWithEntities2, messageKey, runnable, j);
                    }
                });
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$translatePhoto$41(messageObject, str, messageKey, runnable, j);
            }
        });
    }

    public void lambda$translatePhoto$39(MessageObject messageObject, String str, MessageKey messageKey, Runnable runnable, long j) {
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = null;
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.translatingPhotos.remove(messageKey);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 400 - (System.currentTimeMillis() - j)));
        }
    }

    public void lambda$translatePhoto$40(MessageObject messageObject, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, MessageKey messageKey, Runnable runnable, long j) {
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = TranslateAlert2.preprocess(tL_textWithEntities, tL_textWithEntities2);
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.translatingPhotos.remove(messageKey);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 400 - (System.currentTimeMillis() - j)));
        }
    }

    public void lambda$translatePhoto$41(MessageObject messageObject, String str, MessageKey messageKey, Runnable runnable, long j) {
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = null;
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.translatingPhotos.remove(messageKey);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 400 - (System.currentTimeMillis() - j)));
        }
    }

    static class MessageKey {
        public long dialogId;
        public int id;

        public MessageKey(MessageObject messageObject) {
            this.dialogId = messageObject.getDialogId();
            this.id = messageObject.getId();
        }
    }

    public static class PollText extends TLObject {
        public static final int constructor = 613759672;
        public ArrayList<TLRPC.PollAnswer> answers = new ArrayList<>();
        public TLRPC.TL_textWithEntities question;
        public TLRPC.TL_textWithEntities solution;

        public static PollText TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (PollText) TLObject.TLdeserialize(PollText.class, 613759672 != i ? null : new PollText(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            if ((int32 & 1) != 0) {
                this.question = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((int32 & 2) != 0) {
                this.answers = Vector.deserialize(inputSerializedData, new TranslateController$PollText$$ExternalSyntheticLambda0(), z);
            }
            if ((int32 & 4) != 0) {
                this.solution = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(613759672);
            int i = this.question != null ? 1 : 0;
            ArrayList<TLRPC.PollAnswer> arrayList = this.answers;
            if (arrayList != null && !arrayList.isEmpty()) {
                i |= 2;
            }
            if (this.solution != null) {
                i |= 4;
            }
            outputSerializedData.writeInt32(i);
            if ((i & 1) != 0) {
                this.question.serializeToStream(outputSerializedData);
            }
            if ((i & 2) != 0) {
                Vector.serialize(outputSerializedData, this.answers);
            }
            if ((i & 4) != 0) {
                this.solution.serializeToStream(outputSerializedData);
            }
        }

        public int length() {
            TLRPC.TL_textWithEntities tL_textWithEntities = this.question;
            int length = tL_textWithEntities != null ? tL_textWithEntities.text.length() : 0;
            for (int i = 0; i < this.answers.size(); i++) {
                length += this.answers.get(i).text.text.length();
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = this.solution;
            return tL_textWithEntities2 != null ? length + tL_textWithEntities2.text.length() : length;
        }

        public static PollText fromMessage(MessageObject messageObject) {
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                return fromPoll((TLRPC.TL_messageMediaPoll) media);
            }
            return null;
        }

        public static PollText fromPoll(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
            TLRPC.Poll poll = tL_messageMediaPoll.poll;
            PollText pollText = new PollText();
            pollText.question = poll.question;
            for (int i = 0; i < poll.answers.size(); i++) {
                TLRPC.PollAnswer pollAnswer = poll.answers.get(i);
                TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                tL_pollAnswer.text = pollAnswer.text;
                tL_pollAnswer.option = pollAnswer.option;
                pollText.answers.add(tL_pollAnswer);
            }
            TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
            if (pollResults != null && !TextUtils.isEmpty(pollResults.solution)) {
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                pollText.solution = tL_textWithEntities;
                TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                tL_textWithEntities.text = pollResults2.solution;
                tL_textWithEntities.entities = pollResults2.solution_entities;
            }
            return pollText;
        }

        public static boolean isFullyTranslated(MessageObject messageObject, PollText pollText) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
            TLRPC.Poll poll;
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
            if (!(media instanceof TLRPC.TL_messageMediaPoll) || (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media).poll) == null) {
                return true;
            }
            if ((poll.question != null) != (pollText.question != null)) {
                return false;
            }
            TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
            return (pollResults != null && pollResults.solution != null) == (pollText.solution != null) && poll.answers.size() == pollText.answers.size();
        }
    }
}
