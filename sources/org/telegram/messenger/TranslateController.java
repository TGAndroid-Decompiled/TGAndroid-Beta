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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.v31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.t31;
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
    private final HashMap<Long, ArrayList<PendingRichTranslation>> pendingRichTranslations;
    private final HashMap<Long, ArrayList<PendingTranslation>> pendingTranscriptionsTranslations;
    private final HashMap<Long, ArrayList<PendingTranslation>> pendingTranslations;
    private final HashMap<Long, TranslatableDecision> translatableDialogMessages;
    private final Set<Long> translatableDialogs;
    private final HashMap<Long, String> translateDialogLanguage;
    private final LongSparseArray<Boolean> translatingDialogs;
    private final HashSet<MessageKey> translatingPhotos;
    private final HashSet<StoryKey> translatingStories;
    private static final List<String> languagesOrder = Arrays.asList("en", "ar", "zh", "fr", "de", "it", "ja", "ko", "pt", "ru", "es", "uk");
    private static final List<String> allLanguages = Arrays.asList("af", "sq", "am", "ar", "hy", "az", "eu", "be", "bn", "bs", "bg", "ca", "ceb", "zh-cn", "zh", "zh-tw", "co", "hr", "cs", "da", "nl", "en", "eo", "et", "fi", "fr", "fy", "gl", "ka", "de", "el", "gu", "ht", "ha", "haw", "he", "hi", "hmn", "hu", "is", "ig", "id", "ga", "it", "ja", "jv", "kn", "kk", "km", "rw", "ko", "ku", "ky", "lo", "la", "lv", "lt", "lb", "mk", "mg", "ms", "ml", "mt", "mi", "mr", "mn", "my", "ne", "no", "ny", "or", "ps", "fa", "pl", "pt", "pt-br", "pa", "ro", "ru", "sm", "gd", "sr", "st", "sn", "sd", "si", "sk", "sl", "so", "es", "su", "sw", "sv", "tl", "tg", "ta", "tt", "te", "th", "tr", "tk", "uk", "ur", "ug", "uz", "vi", "cy", "xh", "yi", "yo", "zu");
    private static LinkedHashSet<String> suggestedLanguageCodes = null;

    public static class Language {
        public String code;
        public String displayName;
        public String ownDisplayName;
        public String f18079q;
    }

    public static class MessageKey {
        public long dialogId;
        public int f18080id;

        public MessageKey(MessageObject messageObject) {
            this.dialogId = messageObject.getDialogId();
            this.f18080id = messageObject.getId();
        }
    }

    public static class PendingPollTranslation {
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

    public static class PendingRichTranslation {
        ArrayList<Utilities.Callback3<Integer, TL_iv.RichMessage, String>> callbacks;
        int delay;
        String language;
        ArrayList<Integer> messageIds;
        int reqId;
        Runnable runnable;

        private PendingRichTranslation() {
            this.messageIds = new ArrayList<>();
            this.callbacks = new ArrayList<>();
            this.delay = 80;
            this.reqId = -1;
        }
    }

    public static class PendingTranslation {
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

    public static class PollText extends TLObject {
        public static final int constructor = 613759672;
        public ArrayList<TLRPC.PollAnswer> answers = new ArrayList<>();
        public TLRPC.TL_textWithEntities question;
        public TLRPC.TL_textWithEntities solution;

        public static PollText TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            PollText pollText;
            if (613759672 != i10) {
                pollText = null;
            } else {
                pollText = new PollText();
            }
            return (PollText) TLObject.TLdeserialize(PollText.class, pollText, inputSerializedData, i10, z4);
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
            for (int i10 = 0; i10 < poll.answers.size(); i10++) {
                TLRPC.PollAnswer pollAnswer = poll.answers.get(i10);
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
            boolean z4;
            boolean z10;
            boolean z11;
            boolean z12;
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
            if (!(media instanceof TLRPC.TL_messageMediaPoll) || (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media).poll) == null) {
                return true;
            }
            if (poll.question != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (pollText.question != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z4 != z10) {
                return false;
            }
            TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
            if (pollResults != null && pollResults.solution != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (pollText.solution != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 == z12 && poll.answers.size() == pollText.answers.size()) {
                return true;
            }
            return false;
        }

        public int length() {
            int i10;
            TLRPC.TL_textWithEntities tL_textWithEntities = this.question;
            if (tL_textWithEntities != null) {
                i10 = tL_textWithEntities.text.length();
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < this.answers.size(); i11++) {
                i10 += this.answers.get(i11).text.text.length();
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = this.solution;
            if (tL_textWithEntities2 != null) {
                return tL_textWithEntities2.text.length() + i10;
            }
            return i10;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            if ((readInt32 & 1) != 0) {
                this.question = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if ((readInt32 & 2) != 0) {
                this.answers = Vector.deserialize(inputSerializedData, (Vector.TLDeserializer) new Object(), z4);
            }
            if ((readInt32 & 4) != 0) {
                this.solution = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int i10;
            outputSerializedData.writeInt32(613759672);
            if (this.question != null) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            ArrayList<TLRPC.PollAnswer> arrayList = this.answers;
            if (arrayList != null && !arrayList.isEmpty()) {
                i10 |= 2;
            }
            if (this.solution != null) {
                i10 |= 4;
            }
            outputSerializedData.writeInt32(i10);
            if ((i10 & 1) != 0) {
                this.question.serializeToStream(outputSerializedData);
            }
            if ((i10 & 2) != 0) {
                Vector.serialize(outputSerializedData, this.answers);
            }
            if ((i10 & 4) != 0) {
                this.solution.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class StoryKey {
        public long dialogId;
        public int storyId;

        public StoryKey(TL_stories.StoryItem storyItem) {
            this.dialogId = storyItem.dialogId;
            this.storyId = storyItem.f21082id;
        }
    }

    public static class TranslatableDecision {
        Set<Integer> certainlyTranslatable = new HashSet();
        Set<Integer> unknown = new HashSet();
        Set<Integer> certainlyNotTranslatable = new HashSet();
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
        this.pendingRichTranslations = new HashMap<>();
        this.detectingStories = new HashSet<>();
        this.translatingStories = new HashSet<>();
        this.detectingPhotos = new HashSet<>();
        this.translatingPhotos = new HashSet<>();
        this.messagesController = messagesController;
        AndroidUtilities.runOnUIThread(new xg(this, 16), 150L);
    }

    public static void analyzeSuggestedLanguageCodes() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        try {
            linkedHashSet.add(LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        try {
            linkedHashSet.add(Resources.getSystem().getConfiguration().locale.getLanguage());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            linkedHashSet.addAll(t31.Y());
        } catch (Exception e11) {
            FileLog.e(e11);
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
                        if (v31.D(locale, null, null) != null) {
                            linkedHashSet.add(locale);
                        }
                    }
                }
            }
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        suggestedLanguageCodes = linkedHashSet;
    }

    private void checkDialogTranslatable(MessageObject messageObject) {
        boolean z4;
        Set<Integer> set;
        int i10;
        float f10;
        String str;
        String str2;
        if (messageObject != null && messageObject.messageOwner != null) {
            long dialogId = messageObject.getDialogId();
            TranslatableDecision translatableDecision = this.translatableDialogMessages.get(Long.valueOf(dialogId));
            if (translatableDecision == null) {
                HashMap<Long, TranslatableDecision> hashMap = this.translatableDialogMessages;
                Long valueOf = Long.valueOf(dialogId);
                TranslatableDecision translatableDecision2 = new TranslatableDecision();
                hashMap.put(valueOf, translatableDecision2);
                translatableDecision = translatableDecision2;
            }
            boolean z10 = false;
            if (isTranslatable(messageObject) && ((str2 = messageObject.messageOwner.originalLanguage) == null || "und".equals(str2))) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (isTranslatable(messageObject) && (str = messageObject.messageOwner.originalLanguage) != null && !"und".equals(str) && !isLanguageRestricted(messageObject.messageOwner.originalLanguage)) {
                z10 = true;
            }
            if (z4) {
                translatableDecision.unknown.add(Integer.valueOf(messageObject.getId()));
            } else {
                if (z10) {
                    set = translatableDecision.certainlyTranslatable;
                } else {
                    set = translatableDecision.certainlyNotTranslatable;
                }
                set.add(Integer.valueOf(messageObject.getId()));
            }
            if (!z4) {
                this.detectedDialogLanguage.put(Long.valueOf(dialogId), messageObject.messageOwner.originalLanguage);
            }
            int size = translatableDecision.certainlyTranslatable.size();
            int size2 = translatableDecision.unknown.size();
            int size3 = translatableDecision.certainlyNotTranslatable.size();
            int i11 = size + size2 + size3;
            boolean isChatAutoTranslated = isChatAutoTranslated(dialogId);
            if (isChatAutoTranslated) {
                i10 = 2;
            } else {
                i10 = 6;
            }
            if (i11 >= i10) {
                if (isChatAutoTranslated) {
                    if (size < 2.0f) {
                        return;
                    }
                } else if (size / (size + size3) < 0.6f) {
                    return;
                }
                float f11 = size2 / i11;
                if (isChatAutoTranslated) {
                    f10 = 0.8f;
                } else {
                    f10 = 0.65f;
                }
                if (f11 < f10) {
                    this.translatableDialogs.add(Long.valueOf(dialogId));
                    this.translatableDialogMessages.remove(Long.valueOf(dialogId));
                    AndroidUtilities.runOnUIThread(new dl(this, dialogId, 0), 450L);
                }
            }
        }
    }

    private void checkLanguage(MessageObject messageObject) {
        if (LanguageDetector.hasSupport()) {
            String detectLanguageText = getDetectLanguageText(messageObject);
            if (isTranslatable(messageObject) && messageObject.messageOwner != null && !TextUtils.isEmpty(detectLanguageText)) {
                if (messageObject.messageOwner.originalLanguage != null) {
                    checkDialogTranslatable(messageObject);
                    return;
                }
                long dialogId = messageObject.getDialogId();
                int hash = hash(messageObject);
                if (!isDialogTranslatable(dialogId) && !this.pendingLanguageChecks.contains(Integer.valueOf(hash))) {
                    this.pendingLanguageChecks.add(Integer.valueOf(hash));
                    Utilities.stageQueue.postRunnable(new cl(this, detectLanguageText, messageObject, dialogId, hash, 0));
                }
            }
        }
    }

    private void clearAllKeptReplyMessages(long j10) {
        this.keptReplyMessageObjects.remove(Long.valueOf(j10));
    }

    public static String currentLanguage() {
        String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
        if (str != null) {
            return str.split("_")[0];
        }
        return str;
    }

    private static String getDetectLanguageText(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            if (!TextUtils.isEmpty(message.message)) {
                return messageObject.messageOwner.message;
            }
            if (messageObject.type == 36 && !TextUtils.isEmpty(messageObject.messageText)) {
                return messageObject.messageText.toString();
            }
        }
        return null;
    }

    public static ArrayList<Language> getLanguages() {
        ArrayList<Language> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            List<String> list = allLanguages;
            if (i10 >= list.size()) {
                break;
            }
            Language language = new Language();
            String str = list.get(i10);
            language.code = str;
            if ("no".equals(str)) {
                language.code = "nb";
            }
            language.displayName = v31.y(v31.D(language.code, null, null));
            language.ownDisplayName = v31.y(v31.K(language.code, true));
            if (language.displayName != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(language.displayName);
                sb.append(" ");
                String str2 = language.ownDisplayName;
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(str2);
                language.f18079q = sb.toString().toLowerCase();
                arrayList.add(language);
            }
            i10++;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collections.sort(arrayList, new tk(Collator.getInstance(Locale.getDefault()), 2));
            return arrayList;
        }
        Collections.sort(arrayList, Comparator$CC.comparing(new la(4)));
        return arrayList;
    }

    public static ArrayList<LocaleController.LocaleInfo> getLocales() {
        String str;
        ArrayList<LocaleController.LocaleInfo> arrayList = new ArrayList<>(LocaleController.getInstance().languagesDict.values());
        int i10 = 0;
        while (i10 < arrayList.size()) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i10);
            if (localeInfo == null || (((str = localeInfo.shortName) != null && str.endsWith("_raw")) || !"remote".equals(localeInfo.pathToFile))) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        Collections.sort(arrayList, new tk(LocaleController.getInstance().getCurrentLocaleInfo(), 1));
        return arrayList;
    }

    public static java.util.ArrayList<org.telegram.messenger.TranslateController.Language> getSuggestedLanguages(java.lang.String r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TranslateController.getSuggestedLanguages(java.lang.String):java.util.ArrayList");
    }

    private int hash(MessageObject messageObject) {
        if (messageObject == null) {
            return 0;
        }
        return Objects.hash(Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()));
    }

    public static void invalidateSuggestedLanguageCodes() {
        suggestedLanguageCodes = null;
    }

    private boolean isChatAutoTranslated(long j10) {
        TLRPC.Chat chat;
        if (!isDialogTranslatable(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || !chat.autotranslation) {
            return false;
        }
        return true;
    }

    private boolean isLanguageRestricted(String str) {
        if (getUserConfig().isPremium()) {
            return t31.Y().contains(str);
        }
        try {
            return TextUtils.equals(LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode, str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isSummarizable(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.summary_from_language != null && !messageObject.isOutOwner() && !messageObject.isRestrictedMessage && !messageObject.isSponsored()) {
            int i10 = messageObject.type;
            if ((i10 == 0 || i10 == 3 || i10 == 1 || i10 == 9 || i10 == 14 || i10 == 17) && !TextUtils.isEmpty(messageObject.messageOwner.message) && messageObject.messageOwner.message.length() > 100) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isTranslatable(MessageObject messageObject) {
        if (messageObject != null && messageObject.messageOwner != null && !messageObject.isOutOwner() && !messageObject.isRestrictedMessage && !messageObject.isSponsored()) {
            int i10 = messageObject.type;
            if (i10 == 0 || i10 == 3 || i10 == 1 || i10 == 2 || i10 == 5 || i10 == 9 || i10 == 14 || i10 == 17 || i10 == 36) {
                if (TextUtils.isEmpty(messageObject.messageOwner.message) && !(MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.rich_message == null && (!message.voiceTranscriptionOpen || TextUtils.isEmpty(message.voiceTranscription) || !messageObject.messageOwner.voiceTranscriptionFinal)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
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

    public void lambda$checkDialogMessageSure$10(ArrayList arrayList, ArrayList arrayList2) {
        TLRPC.Message message;
        boolean z4 = false;
        for (int i10 = 0; i10 < Math.min(arrayList.size(), arrayList2.size()); i10++) {
            MessageObject messageObject = (MessageObject) arrayList2.get(i10);
            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(i10);
            if (messageObject != null && (message = messageObject.messageOwner) != null && message2 != null) {
                message.translatedText = message2.translatedText;
                message.translatedPoll = message2.translatedPoll;
                message.translatedToLanguage = message2.translatedToLanguage;
                if (messageObject.updateTranslation(false)) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
        }
    }

    public void lambda$checkDialogMessageSure$11(long j10) {
        ArrayList arrayList = (ArrayList) this.messagesController.dialogMessage.f(j10);
        if (arrayList == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.messageOwner != null) {
                arrayList2.add(getMessagesStorage().getMessageWithCustomParamsOnlyInternal(messageObject.getId(), messageObject.getDialogId()));
            } else {
                arrayList2.add(null);
            }
        }
        AndroidUtilities.runOnUIThread(new d9(this, arrayList2, arrayList, 27));
    }

    public void lambda$checkDialogTranslatable$17(long j10) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogIsTranslatable, Long.valueOf(j10));
    }

    public void lambda$checkLanguage$12(String str, MessageObject messageObject, long j10, int i10) {
        if (str == null) {
            str = "und";
        }
        messageObject.messageOwner.originalLanguage = str;
        getMessagesStorage().updateMessageCustomParams(j10, messageObject.messageOwner);
        this.pendingLanguageChecks.remove(Integer.valueOf(i10));
        checkDialogTranslatable(messageObject);
    }

    public void lambda$checkLanguage$13(MessageObject messageObject, long j10, int i10, String str) {
        AndroidUtilities.runOnUIThread(new cl(this, str, messageObject, j10, i10, 1));
    }

    public void lambda$checkLanguage$14(MessageObject messageObject, long j10, int i10) {
        messageObject.messageOwner.originalLanguage = "und";
        getMessagesStorage().updateMessageCustomParams(j10, messageObject.messageOwner);
        this.pendingLanguageChecks.remove(Integer.valueOf(i10));
    }

    public void lambda$checkLanguage$15(MessageObject messageObject, long j10, int i10, Exception exc) {
        AndroidUtilities.runOnUIThread(new mh.y8(this, messageObject, j10, i10, 11));
    }

    public void lambda$checkLanguage$16(String str, MessageObject messageObject, long j10, int i10) {
        LanguageDetector.detectLanguage(str, new fl(this, messageObject, j10, i10), new fl(this, messageObject, j10, i10));
    }

    public void lambda$checkTranslation$4(MessageObject messageObject, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.Message message = messageObject.messageOwner;
        message.summaryText = tL_textWithEntities;
        if (tL_textWithEntities == null) {
            message.summarizedOpen = false;
        }
        getMessagesStorage().updateMessageCustomParams(j10, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject, Boolean.TRUE);
    }

    public void lambda$checkTranslation$5(MessageObject messageObject, boolean z4, long j10, Integer num, TL_iv.RichMessage richMessage, String str) {
        if (messageObject.getId() != num.intValue()) {
            FileLog.e("wtf, asked to translate " + messageObject.getId() + " rich message but got " + num + "!");
        }
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = null;
        message.translatedVoiceTranscription = null;
        message.translatedPoll = null;
        message.translatedRichMessage = richMessage;
        if (z4) {
            keepReplyMessage(messageObject);
        }
        getMessagesStorage().updateMessageCustomParams(j10, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject);
        ArrayList arrayList = (ArrayList) this.messagesController.dialogMessage.f(j10);
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
                if (messageObject2 != null && messageObject2.getId() == messageObject.getId()) {
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    message2.translatedToLanguage = str;
                    message2.translatedRichMessage = richMessage;
                    if (messageObject2.updateTranslation()) {
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void lambda$checkTranslation$6(MessageObject messageObject, String str, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.Message message = messageObject.messageOwner;
        if (tL_textWithEntities == null) {
            str = null;
        }
        message.translatedSummaryLanguage = str;
        message.translatedSummaryText = tL_textWithEntities;
        if (tL_textWithEntities == null) {
            message.summarizedOpen = false;
        }
        getMessagesStorage().updateMessageCustomParams(j10, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject, Boolean.TRUE);
    }

    public void lambda$checkTranslation$7(MessageObject messageObject, boolean z4, long j10, Integer num, PollText pollText, String str) {
        if (messageObject.getId() != num.intValue()) {
            FileLog.e("wtf, asked to translate " + messageObject.getId() + " poll but got " + num + "!");
        }
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = null;
        message.translatedVoiceTranscription = null;
        message.translatedPoll = pollText;
        if (z4) {
            keepReplyMessage(messageObject);
        }
        getMessagesStorage().updateMessageCustomParams(j10, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject);
        ArrayList arrayList = (ArrayList) this.messagesController.dialogMessage.f(j10);
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
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

    public void lambda$checkTranslation$8(MessageObject messageObject, boolean z4, long j10, Boolean bool, Integer num, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
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
        if (z4) {
            keepReplyMessage(messageObject);
        }
        getMessagesStorage().updateMessageCustomParams(j10, messageObject.messageOwner);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject);
        ArrayList arrayList = (ArrayList) this.messagesController.dialogMessage.f(j10);
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
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

    public void lambda$detectPhotoLanguage$39(MessageObject messageObject, String str, MessageKey messageKey, Utilities.Callback callback) {
        messageObject.messageOwner.originalLanguage = str;
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.detectingPhotos.remove(messageKey);
        if (callback != null) {
            callback.run(str);
        }
    }

    public void lambda$detectPhotoLanguage$40(MessageObject messageObject, MessageKey messageKey, Utilities.Callback callback, String str) {
        AndroidUtilities.runOnUIThread(new d5(str, messageObject, messageKey, this, callback));
    }

    public void lambda$detectPhotoLanguage$41(MessageObject messageObject, MessageKey messageKey, Utilities.Callback callback) {
        messageObject.messageOwner.originalLanguage = "und";
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.detectingPhotos.remove(messageKey);
        if (callback != null) {
            callback.run("und");
        }
    }

    public void lambda$detectPhotoLanguage$42(MessageObject messageObject, MessageKey messageKey, Utilities.Callback callback, Exception exc) {
        AndroidUtilities.runOnUIThread(new sk(this, messageObject, messageKey, callback, 2));
    }

    public void lambda$detectStoryLanguage$31(TL_stories.StoryItem storyItem, String str, StoryKey storyKey) {
        storyItem.detectedLng = str;
        getMessagesController().getStoriesController().f17780k.h(storyItem.dialogId, storyItem);
        this.detectingStories.remove(storyKey);
    }

    public void lambda$detectStoryLanguage$32(TL_stories.StoryItem storyItem, StoryKey storyKey, String str) {
        AndroidUtilities.runOnUIThread(new sk(this, storyItem, str, storyKey, 3));
    }

    public void lambda$detectStoryLanguage$33(TL_stories.StoryItem storyItem, StoryKey storyKey) {
        storyItem.detectedLng = "und";
        getMessagesController().getStoriesController().f17780k.h(storyItem.dialogId, storyItem);
        this.detectingStories.remove(storyKey);
    }

    public void lambda$detectStoryLanguage$34(TL_stories.StoryItem storyItem, StoryKey storyKey, Exception exc) {
        AndroidUtilities.runOnUIThread(new g0(this, storyItem, storyKey, 5));
    }

    public static int lambda$getLanguages$1(Collator collator, Language language, Language language2) {
        return collator.compare(language.displayName, language2.displayName);
    }

    public static int lambda$getLocales$3(LocaleController.LocaleInfo localeInfo, LocaleController.LocaleInfo localeInfo2, LocaleController.LocaleInfo localeInfo3) {
        if (localeInfo2 == localeInfo) {
            return -1;
        }
        if (localeInfo3 == localeInfo) {
            return 1;
        }
        List<String> list = languagesOrder;
        int indexOf = list.indexOf(localeInfo2.pluralLangCode);
        int indexOf2 = list.indexOf(localeInfo3.pluralLangCode);
        if (indexOf >= 0 && indexOf2 >= 0) {
            return indexOf - indexOf2;
        }
        if (indexOf >= 0) {
            return -1;
        }
        if (indexOf2 >= 0) {
            return 1;
        }
        int i10 = localeInfo2.serverIndex;
        int i11 = localeInfo3.serverIndex;
        if (i10 == i11) {
            return localeInfo2.name.compareTo(localeInfo3.name);
        }
        if (i10 > i11) {
            return 1;
        }
        if (i10 < i11) {
            return -1;
        }
        return 0;
    }

    public void lambda$invalidateTranslation$9(MessageObject messageObject, long j10) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject, Boolean.FALSE, Boolean.valueOf(isTranslatingDialog(j10)));
    }

    public void lambda$pushPollToTranslate$25(org.telegram.messenger.TranslateController.PendingPollTranslation r20, org.telegram.tgnet.TLObject r21, org.telegram.tgnet.TLRPC.TL_error r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TranslateController.lambda$pushPollToTranslate$25(org.telegram.messenger.TranslateController$PendingPollTranslation, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error, long):void");
    }

    public void lambda$pushPollToTranslate$26(PendingPollTranslation pendingPollTranslation, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new el(this, pendingPollTranslation, tLObject, tL_error, j10, 0));
    }

    public void lambda$pushPollToTranslate$27(long j10, PendingPollTranslation pendingPollTranslation) {
        Throwable th2;
        int size;
        synchronized (this) {
            try {
                ArrayList<PendingTranslation> arrayList = this.pendingTranslations.get(Long.valueOf(j10));
                if (arrayList != null) {
                    try {
                        arrayList.remove(pendingPollTranslation);
                        if (arrayList.isEmpty()) {
                            this.pendingTranslations.remove(Long.valueOf(j10));
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                        } catch (Throwable th4) {
                            th = th4;
                            th2 = th;
                            throw th2;
                        }
                        throw th2;
                    }
                }
                TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                tL_messages_translateText.flags |= 2;
                ArrayList<Pair<PollText, PollText>> arrayList2 = pendingPollTranslation.messageTexts;
                int size2 = arrayList2.size();
                int i10 = 0;
                while (i10 < size2) {
                    Pair<PollText, PollText> pair = arrayList2.get(i10);
                    i10++;
                    Pair<PollText, PollText> pair2 = pair;
                    PollText pollText = (PollText) pair2.first;
                    PollText pollText2 = (PollText) pair2.second;
                    TLRPC.TL_textWithEntities tL_textWithEntities = pollText.question;
                    if (tL_textWithEntities != null && (pollText2 == null || pollText2.question == null)) {
                        tL_messages_translateText.text.add(tL_textWithEntities);
                    }
                    int size3 = pollText.answers.size();
                    if (pollText2 == null) {
                        size = 0;
                    } else {
                        size = pollText2.answers.size();
                    }
                    if (size3 != size) {
                        ArrayList<TLRPC.PollAnswer> arrayList3 = pollText.answers;
                        int size4 = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size4) {
                            TLRPC.PollAnswer pollAnswer = arrayList3.get(i11);
                            i11++;
                            tL_messages_translateText.text.add(pollAnswer.text);
                        }
                    }
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = pollText.solution;
                    if (tL_textWithEntities2 != null && (pollText2 == null || pollText2.solution == null)) {
                        tL_messages_translateText.text.add(tL_textWithEntities2);
                    }
                }
                tL_messages_translateText.to_lang = normalizeLanguage(pendingPollTranslation.language);
                int sendRequest = getConnectionsManager().sendRequest(tL_messages_translateText, new bl(this, pendingPollTranslation, j10, 0));
                synchronized (this) {
                    pendingPollTranslation.reqId = sendRequest;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    public void lambda$pushRichMessageToTranslate$28(PendingRichTranslation pendingRichTranslation, TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        ArrayList<Integer> arrayList;
        ArrayList<Utilities.Callback3<Integer, TL_iv.RichMessage, String>> arrayList2;
        synchronized (this) {
            arrayList = pendingRichTranslation.messageIds;
            arrayList2 = pendingRichTranslation.callbacks;
        }
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            ArrayList<TL_iv.RichMessage> arrayList3 = ((TLRPC.TL_messages_translatedRichMessage) tLObject).result;
            int min = Math.min(arrayList2.size(), arrayList3.size());
            for (int i10 = 0; i10 < min; i10++) {
                arrayList2.get(i10).run(arrayList.get(i10), arrayList3.get(i10), pendingRichTranslation.language);
            }
        } else if (tL_error != null && "TO_LANG_INVALID".equals(tL_error.text)) {
            toggleTranslatingDialog(j10, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
        } else {
            if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert1));
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                arrayList2.get(i11).run(arrayList.get(i11), null, pendingRichTranslation.language);
            }
        }
        synchronized (this) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                try {
                    this.loadingTranslations.remove(arrayList.get(i12));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void lambda$pushRichMessageToTranslate$29(PendingRichTranslation pendingRichTranslation, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new el(this, pendingRichTranslation, tLObject, tL_error, j10, 1));
    }

    public void lambda$pushRichMessageToTranslate$30(long j10, PendingRichTranslation pendingRichTranslation) {
        Throwable th2;
        synchronized (this) {
            try {
                ArrayList<PendingRichTranslation> arrayList = this.pendingRichTranslations.get(Long.valueOf(j10));
                if (arrayList != null) {
                    try {
                        arrayList.remove(pendingRichTranslation);
                        if (arrayList.isEmpty()) {
                            this.pendingRichTranslations.remove(Long.valueOf(j10));
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                        } catch (Throwable th4) {
                            th = th4;
                            th2 = th;
                            throw th2;
                        }
                        throw th2;
                    }
                }
                TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
                tL_messages_translateRichMessage.flags |= 1;
                tL_messages_translateRichMessage.peer = getMessagesController().getInputPeer(j10);
                tL_messages_translateRichMessage.f20966id = pendingRichTranslation.messageIds;
                tL_messages_translateRichMessage.to_lang = normalizeLanguage(pendingRichTranslation.language);
                int sendRequest = getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new bl(this, pendingRichTranslation, j10, 1));
                synchronized (this) {
                    pendingRichTranslation.reqId = sendRequest;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    public static void lambda$pushToSummarize$18(org.telegram.ui.ActionBar.p2 p2Var) {
        p2Var.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
    }

    public void lambda$pushToSummarize$19(int i10, Utilities.Callback callback, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_error tL_error) {
        org.telegram.ui.ActionBar.p2 U;
        if (tL_textWithEntities != null) {
            this.loadingSummarizations.remove(Integer.valueOf(i10));
            callback.run(tL_textWithEntities);
        } else if (tL_error != null) {
            if ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) && (U = LaunchActivity.U()) != null) {
                org.telegram.ui.Components.ic J = org.telegram.ui.Components.qc.a0(U).J(R.raw.star_premium_2, LocaleController.getString(R.string.SummaryLimit), LocaleController.getString(R.string.SummaryLimitUpgrade), new xd(3, U));
                J.f27778j = 5000;
                J.k(true);
            }
            this.loadingSummarizations.remove(Integer.valueOf(i10));
            callback.run(null);
        }
    }

    public void lambda$pushToTranslate$20(Utilities.Callback4 callback4, boolean z4, int i10, String str, long j10, String str2, Boolean bool) {
        int i11;
        if (str2 != null) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_textWithEntities.text = str2;
            callback4.run(Boolean.valueOf(z4), Integer.valueOf(i10), tL_textWithEntities, str);
            return;
        }
        toggleTranslatingDialog(j10, false);
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i12 = NotificationCenter.showBulletin;
        if (bool.booleanValue()) {
            i11 = R.string.TranslationFailedAlert1;
        } else {
            i11 = R.string.TranslationFailedAlert2;
        }
        globalInstance.lambda$postNotificationNameOnUIThread$1(i12, 1, LocaleController.getString(i11));
    }

    public void lambda$pushToTranslate$21(Utilities.Callback4 callback4, boolean z4, int i10, String str, long j10, String str2, Boolean bool) {
        int i11;
        if (str2 != null) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_textWithEntities.text = str2;
            callback4.run(Boolean.valueOf(z4), Integer.valueOf(i10), tL_textWithEntities, str);
            return;
        }
        toggleTranslatingDialog(j10, false);
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i12 = NotificationCenter.showBulletin;
        if (bool.booleanValue()) {
            i11 = R.string.TranslationFailedAlert1;
        } else {
            i11 = R.string.TranslationFailedAlert2;
        }
        globalInstance.lambda$postNotificationNameOnUIThread$1(i12, 1, LocaleController.getString(i11));
    }

    public void lambda$pushToTranslate$22(org.telegram.messenger.TranslateController.PendingTranslation r17, org.telegram.tgnet.TLObject r18, boolean r19, org.telegram.tgnet.TLRPC.TL_error r20, long r21, java.util.Set r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TranslateController.lambda$pushToTranslate$22(org.telegram.messenger.TranslateController$PendingTranslation, org.telegram.tgnet.TLObject, boolean, org.telegram.tgnet.TLRPC$TL_error, long, java.util.Set):void");
    }

    public void lambda$pushToTranslate$23(PendingTranslation pendingTranslation, boolean z4, long j10, Set set, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new zk(j10, set, pendingTranslation, this, tLObject, tL_error, z4));
    }

    public void lambda$pushToTranslate$24(HashMap hashMap, long j10, PendingTranslation pendingTranslation, boolean z4, Set set) {
        long j11;
        synchronized (this) {
            try {
                ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(j10));
                if (arrayList != null) {
                    arrayList.remove(pendingTranslation);
                    if (arrayList.isEmpty()) {
                        hashMap.remove(Long.valueOf(j10));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        String str = getMessagesController().translationsAutoEnabled;
        if (!"alternative".equals(str) && !"system".equals(str)) {
            TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
            if (z4) {
                tL_messages_translateText.flags |= 2;
                tL_messages_translateText.text.addAll(pendingTranslation.messageTexts);
                j11 = j10;
            } else {
                tL_messages_translateText.flags |= 1;
                j11 = j10;
                tL_messages_translateText.peer = getMessagesController().getInputPeer(j11);
                tL_messages_translateText.f20967id = pendingTranslation.messageIds;
            }
            tL_messages_translateText.to_lang = normalizeLanguage(pendingTranslation.language);
            int sendRequest = getConnectionsManager().sendRequest(tL_messages_translateText, new ra(this, pendingTranslation, z4, j11, set, 1));
            synchronized (this) {
                pendingTranslation.reqId = sendRequest;
            }
            return;
        }
        String str2 = pendingTranslation.language;
        for (int i10 = 0; i10 < pendingTranslation.messageIds.size(); i10++) {
            v31.x(pendingTranslation.messageTexts.get(i10).text, null, str2, new al(this, pendingTranslation.callbacks.get(i10), z4, pendingTranslation.messageIds.get(i10).intValue(), str2, j10, 1));
        }
    }

    public void lambda$setDialogTranslateTo$0(long j10, String str) {
        Boolean bool;
        synchronized (this) {
            this.translateDialogLanguage.put(Long.valueOf(j10), str);
            LongSparseArray<Boolean> longSparseArray = this.translatingDialogs;
            bool = Boolean.TRUE;
            longSparseArray.put(j10, bool);
            saveTranslatingDialogsCache();
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j10), bool);
    }

    public void lambda$translatePhoto$43(MessageObject messageObject, String str, MessageKey messageKey, Runnable runnable, long j10) {
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = null;
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.translatingPhotos.remove(messageKey);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
        }
    }

    public void lambda$translatePhoto$44(MessageObject messageObject, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, MessageKey messageKey, Runnable runnable, long j10) {
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = v31.E(tL_textWithEntities, tL_textWithEntities2);
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.translatingPhotos.remove(messageKey);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
        }
    }

    public void lambda$translatePhoto$45(MessageObject messageObject, String str, MessageKey messageKey, Runnable runnable, long j10) {
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = null;
        getMessagesStorage().updateMessageCustomParams(messageKey.dialogId, messageObject.messageOwner);
        this.translatingPhotos.remove(messageKey);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
        }
    }

    public void lambda$translatePhoto$46(final MessageObject messageObject, final String str, final MessageKey messageKey, final Runnable runnable, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
            if (arrayList.size() <= 0) {
                AndroidUtilities.runOnUIThread(new gl(this, messageObject, str, messageKey, runnable, j10, 0));
                return;
            }
            final TLRPC.TL_textWithEntities tL_textWithEntities2 = arrayList.get(0);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TranslateController.this.lambda$translatePhoto$44(messageObject, str, tL_textWithEntities, tL_textWithEntities2, messageKey, runnable, j10);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new gl(this, messageObject, str, messageKey, runnable, j10, 1));
    }

    public void lambda$translateStory$35(TL_stories.StoryItem storyItem, String str, StoryKey storyKey, Runnable runnable) {
        storyItem.translatedLng = str;
        storyItem.translatedText = null;
        getMessagesController().getStoriesController().f17780k.h(storyItem.dialogId, storyItem);
        this.translatingStories.remove(storyKey);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$translateStory$36(TL_stories.StoryItem storyItem, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, StoryKey storyKey, Runnable runnable) {
        storyItem.translatedLng = str;
        storyItem.translatedText = v31.E(tL_textWithEntities, tL_textWithEntities2);
        getMessagesController().getStoriesController().f17780k.h(storyItem.dialogId, storyItem);
        this.translatingStories.remove(storyKey);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$translateStory$37(TL_stories.StoryItem storyItem, String str, StoryKey storyKey, Runnable runnable) {
        storyItem.translatedLng = str;
        storyItem.translatedText = null;
        getMessagesController().getStoriesController().f17780k.h(storyItem.dialogId, storyItem);
        this.translatingStories.remove(storyKey);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$translateStory$38(final TL_stories.StoryItem storyItem, final String str, final StoryKey storyKey, final Runnable runnable, TLRPC.TL_textWithEntities tL_textWithEntities, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
            if (arrayList.size() <= 0) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final TranslateController f19313b;

                    {
                        this.f19313b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r6) {
                            case 0:
                                this.f19313b.lambda$translateStory$35(storyItem, str, storyKey, runnable);
                                return;
                            default:
                                this.f19313b.lambda$translateStory$37(storyItem, str, storyKey, runnable);
                                return;
                        }
                    }
                });
                return;
            } else {
                AndroidUtilities.runOnUIThread(new pl(this, storyItem, str, tL_textWithEntities, arrayList.get(0), storyKey, runnable, 0));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable(this) {
            public final TranslateController f19313b;

            {
                this.f19313b = this;
            }

            @Override
            public final void run() {
                switch (r6) {
                    case 0:
                        this.f19313b.lambda$translateStory$35(storyItem, str, storyKey, runnable);
                        return;
                    default:
                        this.f19313b.lambda$translateStory$37(storyItem, str, storyKey, runnable);
                        return;
                }
            }
        });
    }

    public void loadTranslatingDialogsCached() {
        boolean z4;
        String string = this.messagesController.getMainSettings().getString("translating_dialog_languages2", null);
        if (string != null) {
            for (String str : string.split(";")) {
                String[] split = str.split("=");
                if (split.length >= 2) {
                    long parseLong = Long.parseLong(split[0]);
                    String[] split2 = split[1].split(">");
                    if (split2.length == 2) {
                        String str2 = split2[0];
                        String str3 = split2[1];
                        if (str3.length() > 0 && str3.charAt(str3.length() - 1) == '!') {
                            str3 = e2.c.j(str3, 1, 0);
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if ("null".equals(str2)) {
                            str2 = null;
                        }
                        if ("null".equals(str3)) {
                            str3 = null;
                        }
                        if (str2 != null) {
                            this.detectedDialogLanguage.put(Long.valueOf(parseLong), str2);
                            if (!isLanguageRestricted(str2)) {
                                this.translatingDialogs.put(parseLong, Boolean.valueOf(true ^ z4));
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
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
            }
        }
    }

    public static String normalizeLanguage(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains("_")) {
            String[] split = str.split("_", 2);
            return split[0].toLowerCase() + "-" + split[1].toUpperCase();
        } else if (str.contains("-")) {
            String[] split2 = str.split("-", 2);
            return split2[0].toLowerCase() + "-" + split2[1].toUpperCase();
        } else {
            return str;
        }
    }

    private void pushPollToTranslate(MessageObject messageObject, String str, Utilities.Callback3<Integer, PollText, String> callback3) {
        Throwable th2;
        PendingPollTranslation pendingPollTranslation;
        if (messageObject != null && messageObject.getId() >= 0 && callback3 != null) {
            long dialogId = messageObject.getDialogId();
            synchronized (this) {
                try {
                    try {
                        ArrayList<PendingPollTranslation> arrayList = this.pendingPollTranslations.get(Long.valueOf(dialogId));
                        if (arrayList == null) {
                            try {
                                HashMap<Long, ArrayList<PendingPollTranslation>> hashMap = this.pendingPollTranslations;
                                Long valueOf = Long.valueOf(dialogId);
                                ArrayList<PendingPollTranslation> arrayList2 = new ArrayList<>();
                                hashMap.put(valueOf, arrayList2);
                                arrayList = arrayList2;
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
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
                        if (!(media instanceof TLRPC.TL_messageMediaPoll)) {
                            return;
                        }
                        PollText fromPoll = PollText.fromPoll((TLRPC.TL_messageMediaPoll) media);
                        PollText pollText = messageObject.messageOwner.translatedPoll;
                        int length = fromPoll.length();
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
                        pendingPollTranslation.messageTexts.add(new Pair<>(fromPoll, pollText));
                        pendingPollTranslation.callbacks.add(callback3);
                        pendingPollTranslation.language = str;
                        pendingPollTranslation.symbolsCount += length;
                        PendingPollTranslation pendingPollTranslation2 = pendingPollTranslation;
                        d4 d4Var = new d4(this, dialogId, pendingPollTranslation2, 1);
                        pendingPollTranslation2.runnable = d4Var;
                        AndroidUtilities.runOnUIThread(d4Var, pendingPollTranslation2.delay);
                        pendingPollTranslation2.delay /= 2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th2 = th;
                    throw th2;
                }
            }
        }
    }

    private void pushRichMessageToTranslate(MessageObject messageObject, String str, Utilities.Callback3<Integer, TL_iv.RichMessage, String> callback3) {
        Throwable th2;
        PendingRichTranslation pendingRichTranslation;
        if (messageObject != null && messageObject.messageOwner != null && messageObject.getId() >= 0 && callback3 != null && messageObject.messageOwner.rich_message != null) {
            long dialogId = messageObject.getDialogId();
            synchronized (this) {
                try {
                    try {
                        ArrayList<PendingRichTranslation> arrayList = this.pendingRichTranslations.get(Long.valueOf(dialogId));
                        if (arrayList == null) {
                            try {
                                HashMap<Long, ArrayList<PendingRichTranslation>> hashMap = this.pendingRichTranslations;
                                Long valueOf = Long.valueOf(dialogId);
                                ArrayList<PendingRichTranslation> arrayList2 = new ArrayList<>();
                                hashMap.put(valueOf, arrayList2);
                                arrayList = arrayList2;
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            pendingRichTranslation = new PendingRichTranslation();
                            arrayList.add(pendingRichTranslation);
                        } else {
                            pendingRichTranslation = arrayList.get(arrayList.size() - 1);
                        }
                        if (pendingRichTranslation.messageIds.contains(Integer.valueOf(messageObject.getId()))) {
                            return;
                        }
                        if (pendingRichTranslation.messageIds.size() + 1 >= 20) {
                            AndroidUtilities.cancelRunOnUIThread(pendingRichTranslation.runnable);
                            AndroidUtilities.runOnUIThread(pendingRichTranslation.runnable);
                            pendingRichTranslation = new PendingRichTranslation();
                            arrayList.add(pendingRichTranslation);
                        }
                        PendingRichTranslation pendingRichTranslation2 = pendingRichTranslation;
                        Runnable runnable = pendingRichTranslation2.runnable;
                        if (runnable != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable);
                        }
                        this.loadingTranslations.add(Integer.valueOf(messageObject.getId()));
                        pendingRichTranslation2.messageIds.add(Integer.valueOf(messageObject.getId()));
                        FileLog.d("pending translation +" + messageObject.getId() + " rich message");
                        pendingRichTranslation2.callbacks.add(callback3);
                        pendingRichTranslation2.language = str;
                        d4 d4Var = new d4(this, dialogId, pendingRichTranslation2, 2);
                        pendingRichTranslation2.runnable = d4Var;
                        AndroidUtilities.runOnUIThread(d4Var, pendingRichTranslation2.delay);
                        pendingRichTranslation2.delay /= 2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th2 = th;
                    throw th2;
                }
            }
        }
    }

    private void pushToSummarize(MessageObject messageObject, String str, Utilities.Callback<TLRPC.TL_textWithEntities> callback) {
        int i10;
        Long valueOf = Long.valueOf(messageObject.getDialogId());
        Integer valueOf2 = Integer.valueOf(messageObject.getId());
        if (str != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int hash = Objects.hash(valueOf, valueOf2, Integer.valueOf(i10));
        if (this.loadingSummarizations.contains(Integer.valueOf(hash))) {
            return;
        }
        this.loadingSummarizations.add(Integer.valueOf(hash));
        TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
        tL_messages_summarizeText.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
        tL_messages_summarizeText.f20965id = messageObject.getId();
        if (str != null) {
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.to_lang = normalizeLanguage(str);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new Object(), new qh(this, hash, callback));
    }

    private void pushToTranslate(MessageObject messageObject, String str, Utilities.Callback4<Boolean, Integer, TLRPC.TL_textWithEntities, String> callback4) {
        HashMap<Long, ArrayList<PendingTranslation>> hashMap;
        Set<Integer> set;
        PendingTranslation pendingTranslation;
        int i10;
        String str2;
        int length;
        if (messageObject != null && messageObject.messageOwner != null && messageObject.getId() >= 0 && callback4 != null) {
            TLRPC.Message message = messageObject.messageOwner;
            boolean z4 = false;
            if (message.voiceTranscription != null && message.voiceTranscriptionFinal && message.voiceTranscriptionOpen) {
                z4 = true;
            }
            long dialogId = messageObject.getDialogId();
            if (z4) {
                hashMap = this.pendingTranscriptionsTranslations;
            } else {
                hashMap = this.pendingTranslations;
            }
            if (z4) {
                set = this.loadingTranscriptionTranslations;
            } else {
                set = this.loadingTranslations;
            }
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            if (z4) {
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
                    ArrayList<PendingTranslation> arrayList = hashMap.get(Long.valueOf(dialogId));
                    if (arrayList == null) {
                        Long valueOf = Long.valueOf(dialogId);
                        ArrayList<PendingTranslation> arrayList2 = new ArrayList<>();
                        hashMap.put(valueOf, arrayList2);
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
                    if (z4) {
                        String str4 = messageObject.messageOwner.voiceTranscription;
                        if (str4 == null) {
                            length = 0;
                        } else {
                            length = str4.length();
                        }
                        i10 = length;
                    } else {
                        TLRPC.Message message3 = messageObject.messageOwner;
                        if (message3 != null && (str2 = message3.message) != null) {
                            i10 = str2.length();
                        } else {
                            CharSequence charSequence = messageObject.caption;
                            if (charSequence != null) {
                                i10 = charSequence.length();
                            } else {
                                CharSequence charSequence2 = messageObject.messageText;
                                if (charSequence2 != null) {
                                    i10 = charSequence2.length();
                                } else {
                                    i10 = 0;
                                }
                            }
                        }
                    }
                    if (pendingTranslation.symbolsCount + i10 >= 25000 || pendingTranslation.messageIds.size() + 1 >= 20) {
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
                    pendingTranslation.symbolsCount += i10;
                    PendingTranslation pendingTranslation2 = pendingTranslation;
                    nd ndVar = new nd(this, hashMap, dialogId, pendingTranslation2, z4, set);
                    pendingTranslation2.runnable = ndVar;
                    AndroidUtilities.runOnUIThread(ndVar, pendingTranslation2.delay);
                    pendingTranslation2.delay /= 2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void resetTranslatingDialogsCache() {
        MessagesController.getMainSettings(this.currentAccount).edit().remove("translating_dialog_languages2").remove("hidden_translation_at").apply();
    }

    private void saveTranslatingDialogsCache() {
        StringBuilder sb = new StringBuilder();
        boolean z4 = true;
        for (int i10 = 0; i10 < this.translatingDialogs.size(); i10++) {
            try {
                long keyAt = this.translatingDialogs.keyAt(i10);
                if (!z4) {
                    sb.append(";");
                }
                if (z4) {
                    z4 = false;
                }
                String str = this.detectedDialogLanguage.get(Long.valueOf(keyAt));
                String str2 = "null";
                if (str == null) {
                    str = "null";
                }
                String dialogTranslateTo = getDialogTranslateTo(keyAt);
                if (dialogTranslateTo != null) {
                    str2 = dialogTranslateTo;
                }
                sb.append(keyAt);
                sb.append("=");
                sb.append(str);
                sb.append(">");
                sb.append(str2);
                if (!this.translatingDialogs.valueAt(i10).booleanValue()) {
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
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        MessagesController.getMainSettings(this.currentAccount).edit().putString("translating_dialog_languages2", sb.toString()).putStringSet("hidden_translation_at", hashSet).apply();
    }

    public boolean canTranslatePhoto(org.telegram.messenger.MessageObject r3, java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TranslateController.canTranslatePhoto(org.telegram.messenger.MessageObject, java.lang.String):boolean");
    }

    public boolean canTranslateStory(TL_stories.StoryItem storyItem) {
        if (storyItem != null && !TextUtils.isEmpty(storyItem.caption) && !Emoji.fullyConsistsOfEmojis(storyItem.caption)) {
            if (storyItem.detectedLng != null || storyItem.translatedText == null || !TextUtils.equals(storyItem.translatedLng, v31.B())) {
                String str = storyItem.detectedLng;
                if (str != null && !isLanguageRestricted(str)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public void cancelAllTranslations() {
        synchronized (this) {
            try {
                for (ArrayList<PendingTranslation> arrayList : this.pendingTranslations.values()) {
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            PendingTranslation pendingTranslation = arrayList.get(i10);
                            i10++;
                            PendingTranslation pendingTranslation2 = pendingTranslation;
                            AndroidUtilities.cancelRunOnUIThread(pendingTranslation2.runnable);
                            if (pendingTranslation2.reqId != -1) {
                                getConnectionsManager().cancelRequest(pendingTranslation2.reqId, true);
                                ArrayList<Integer> arrayList2 = pendingTranslation2.messageIds;
                                int size2 = arrayList2.size();
                                int i11 = 0;
                                while (i11 < size2) {
                                    Integer num = arrayList2.get(i11);
                                    i11++;
                                    this.loadingTranslations.remove(num);
                                }
                            }
                        }
                    }
                }
                for (ArrayList<PendingTranslation> arrayList3 : this.pendingTranscriptionsTranslations.values()) {
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            PendingTranslation pendingTranslation3 = arrayList3.get(i12);
                            i12++;
                            PendingTranslation pendingTranslation4 = pendingTranslation3;
                            AndroidUtilities.cancelRunOnUIThread(pendingTranslation4.runnable);
                            if (pendingTranslation4.reqId != -1) {
                                getConnectionsManager().cancelRequest(pendingTranslation4.reqId, true);
                                ArrayList<Integer> arrayList4 = pendingTranslation4.messageIds;
                                int size4 = arrayList4.size();
                                int i13 = 0;
                                while (i13 < size4) {
                                    Integer num2 = arrayList4.get(i13);
                                    i13++;
                                    this.loadingTranscriptionTranslations.remove(num2);
                                }
                            }
                        }
                    }
                }
                for (ArrayList<PendingPollTranslation> arrayList5 : this.pendingPollTranslations.values()) {
                    if (arrayList5 != null) {
                        int size5 = arrayList5.size();
                        int i14 = 0;
                        while (i14 < size5) {
                            PendingPollTranslation pendingPollTranslation = arrayList5.get(i14);
                            i14++;
                            PendingPollTranslation pendingPollTranslation2 = pendingPollTranslation;
                            AndroidUtilities.cancelRunOnUIThread(pendingPollTranslation2.runnable);
                            if (pendingPollTranslation2.reqId != -1) {
                                getConnectionsManager().cancelRequest(pendingPollTranslation2.reqId, true);
                                ArrayList<Integer> arrayList6 = pendingPollTranslation2.messageIds;
                                int size6 = arrayList6.size();
                                int i15 = 0;
                                while (i15 < size6) {
                                    Integer num3 = arrayList6.get(i15);
                                    i15++;
                                    this.loadingTranslations.remove(num3);
                                }
                            }
                        }
                    }
                }
                for (ArrayList<PendingRichTranslation> arrayList7 : this.pendingRichTranslations.values()) {
                    if (arrayList7 != null) {
                        int size7 = arrayList7.size();
                        int i16 = 0;
                        while (i16 < size7) {
                            PendingRichTranslation pendingRichTranslation = arrayList7.get(i16);
                            i16++;
                            PendingRichTranslation pendingRichTranslation2 = pendingRichTranslation;
                            AndroidUtilities.cancelRunOnUIThread(pendingRichTranslation2.runnable);
                            if (pendingRichTranslation2.reqId != -1) {
                                getConnectionsManager().cancelRequest(pendingRichTranslation2.reqId, true);
                                ArrayList<Integer> arrayList8 = pendingRichTranslation2.messageIds;
                                int size8 = arrayList8.size();
                                int i17 = 0;
                                while (i17 < size8) {
                                    Integer num4 = arrayList8.get(i17);
                                    i17++;
                                    this.loadingTranslations.remove(num4);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void cancelTranslations(long j10) {
        synchronized (this) {
            try {
                ArrayList<PendingTranslation> arrayList = this.pendingTranslations.get(Long.valueOf(j10));
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        PendingTranslation pendingTranslation = arrayList.get(i10);
                        i10++;
                        PendingTranslation pendingTranslation2 = pendingTranslation;
                        AndroidUtilities.cancelRunOnUIThread(pendingTranslation2.runnable);
                        if (pendingTranslation2.reqId != -1) {
                            getConnectionsManager().cancelRequest(pendingTranslation2.reqId, true);
                            ArrayList<Integer> arrayList2 = pendingTranslation2.messageIds;
                            int size2 = arrayList2.size();
                            int i11 = 0;
                            while (i11 < size2) {
                                Integer num = arrayList2.get(i11);
                                i11++;
                                this.loadingTranslations.remove(num);
                            }
                        }
                    }
                    this.pendingTranslations.remove(Long.valueOf(j10));
                }
                ArrayList<PendingTranslation> arrayList3 = this.pendingTranscriptionsTranslations.get(Long.valueOf(j10));
                if (arrayList3 != null) {
                    int size3 = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        PendingTranslation pendingTranslation3 = arrayList3.get(i12);
                        i12++;
                        PendingTranslation pendingTranslation4 = pendingTranslation3;
                        AndroidUtilities.cancelRunOnUIThread(pendingTranslation4.runnable);
                        if (pendingTranslation4.reqId != -1) {
                            getConnectionsManager().cancelRequest(pendingTranslation4.reqId, true);
                            ArrayList<Integer> arrayList4 = pendingTranslation4.messageIds;
                            int size4 = arrayList4.size();
                            int i13 = 0;
                            while (i13 < size4) {
                                Integer num2 = arrayList4.get(i13);
                                i13++;
                                this.loadingTranscriptionTranslations.remove(num2);
                            }
                        }
                    }
                    this.pendingTranscriptionsTranslations.remove(Long.valueOf(j10));
                }
                ArrayList<PendingPollTranslation> arrayList5 = this.pendingPollTranslations.get(Long.valueOf(j10));
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size5) {
                        PendingPollTranslation pendingPollTranslation = arrayList5.get(i14);
                        i14++;
                        PendingPollTranslation pendingPollTranslation2 = pendingPollTranslation;
                        AndroidUtilities.cancelRunOnUIThread(pendingPollTranslation2.runnable);
                        if (pendingPollTranslation2.reqId != -1) {
                            getConnectionsManager().cancelRequest(pendingPollTranslation2.reqId, true);
                            ArrayList<Integer> arrayList6 = pendingPollTranslation2.messageIds;
                            int size6 = arrayList6.size();
                            int i15 = 0;
                            while (i15 < size6) {
                                Integer num3 = arrayList6.get(i15);
                                i15++;
                                this.loadingTranslations.remove(num3);
                            }
                        }
                    }
                    this.pendingPollTranslations.remove(Long.valueOf(j10));
                }
                ArrayList<PendingRichTranslation> arrayList7 = this.pendingRichTranslations.get(Long.valueOf(j10));
                if (arrayList7 != null) {
                    int size7 = arrayList7.size();
                    int i16 = 0;
                    while (i16 < size7) {
                        PendingRichTranslation pendingRichTranslation = arrayList7.get(i16);
                        i16++;
                        PendingRichTranslation pendingRichTranslation2 = pendingRichTranslation;
                        AndroidUtilities.cancelRunOnUIThread(pendingRichTranslation2.runnable);
                        if (pendingRichTranslation2.reqId != -1) {
                            getConnectionsManager().cancelRequest(pendingRichTranslation2.reqId, true);
                            ArrayList<Integer> arrayList8 = pendingRichTranslation2.messageIds;
                            int size8 = arrayList8.size();
                            int i17 = 0;
                            while (i17 < size8) {
                                Integer num4 = arrayList8.get(i17);
                                i17++;
                                this.loadingTranslations.remove(num4);
                            }
                        }
                    }
                    this.pendingRichTranslations.remove(Long.valueOf(j10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void checkDialogMessage(long j10) {
        if (isFeatureAvailable(j10)) {
            checkDialogMessageSure(j10);
        }
    }

    public void checkDialogMessageSure(long j10) {
        if (!this.translatingDialogs.get(j10, Boolean.valueOf(isChatAutoTranslated(j10))).booleanValue()) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new dl(this, j10, 1));
    }

    public void checkRestrictedLanguagesUpdate() {
        synchronized (this) {
            try {
                this.translatableDialogMessages.clear();
                ArrayList arrayList = new ArrayList();
                for (Long l10 : this.translatableDialogs) {
                    long longValue = l10.longValue();
                    String str = this.detectedDialogLanguage.get(l10);
                    if (str != null && isLanguageRestricted(str)) {
                        cancelTranslations(longValue);
                        this.translatingDialogs.remove(longValue);
                        arrayList.add(l10);
                    }
                }
                this.translatableDialogs.clear();
                saveTranslatingDialogsCache();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    Long l11 = (Long) obj;
                    l11.longValue();
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, l11, Boolean.FALSE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void checkTranslation(MessageObject messageObject, boolean z4) {
        checkTranslation(messageObject, z4, false);
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

    public void detectPhotoLanguage(MessageObject messageObject, Utilities.Callback<String> callback) {
        if (messageObject != null && messageObject.messageOwner != null && LanguageDetector.hasSupport() && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
            if (!TextUtils.isEmpty(messageObject.messageOwner.originalLanguage)) {
                if (callback != null) {
                    callback.run(messageObject.messageOwner.originalLanguage);
                    return;
                }
                return;
            }
            MessageKey messageKey = new MessageKey(messageObject);
            if (!this.detectingPhotos.contains(messageKey)) {
                this.detectingPhotos.add(messageKey);
                LanguageDetector.detectLanguage(messageObject.messageOwner.message, new ql(this, messageObject, messageKey, callback), new ql(this, messageObject, messageKey, callback));
            }
        }
    }

    public void detectStoryLanguage(TL_stories.StoryItem storyItem) {
        String str;
        if (storyItem != null && storyItem.detectedLng == null && (str = storyItem.caption) != null && str.length() != 0 && LanguageDetector.hasSupport()) {
            StoryKey storyKey = new StoryKey(storyItem);
            if (!this.detectingStories.contains(storyKey)) {
                this.detectingStories.add(storyKey);
                LanguageDetector.detectLanguage(storyItem.caption, new nl(this, storyItem, storyKey), new nl(this, storyItem, storyKey));
            }
        }
    }

    public MessageObject findReplyMessageObject(long j10, int i10) {
        HashMap<Integer, MessageObject> hashMap = this.keptReplyMessageObjects.get(Long.valueOf(j10));
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(Integer.valueOf(i10));
    }

    public String getDialogDetectedLanguage(long j10) {
        return this.detectedDialogLanguage.get(Long.valueOf(j10));
    }

    public String getDialogTranslateTo(long j10) {
        String str = this.translateDialogLanguage.get(Long.valueOf(j10));
        if (str == null && ((str = v31.B()) == null || str.equals(getDialogDetectedLanguage(j10)))) {
            str = currentLanguage();
        }
        if ("nb".equals(str)) {
            return "no";
        }
        return str;
    }

    public void invalidateTranslation(MessageObject messageObject) {
        if (messageObject != null && messageObject.messageOwner != null) {
            long dialogId = messageObject.getDialogId();
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
                AndroidUtilities.runOnUIThread(new il(this, messageObject, dialogId));
            }
        }
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

    public boolean isDialogTranslatable(long j10) {
        if (this.translatableDialogs.contains(Long.valueOf(j10)) && isFeatureAvailable(j10) && !DialogObject.isEncryptedDialog(j10) && getUserConfig().getClientUserId() != j10) {
            return true;
        }
        return false;
    }

    public boolean isFeatureAvailable() {
        return isChatTranslateEnabled() && UserConfig.getInstance(this.currentAccount).isPremium();
    }

    public boolean isTranslateDialogHidden(long j10) {
        if (this.hideTranslateDialogs.contains(Long.valueOf(j10))) {
            return true;
        }
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
        if (chatFull != null) {
            return chatFull.translations_disabled;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(j10);
        if (userFull != null) {
            return userFull.translations_disabled;
        }
        return false;
    }

    public boolean isTranslating(MessageObject messageObject) {
        TLRPC.Message message;
        boolean z4 = true;
        if (messageObject == null || (message = messageObject.messageOwner) == null || !message.summarizedOpen) {
            synchronized (this) {
                if (messageObject != null) {
                    try {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        if (message2 != null) {
                            if (((message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal) ? this.loadingTranscriptionTranslations : this.loadingTranslations).contains(Integer.valueOf(messageObject.getId())) && isTranslatingDialog(messageObject.getDialogId())) {
                            }
                        }
                    } finally {
                    }
                }
                z4 = false;
            }
            return z4;
        }
        return this.loadingSummarizations.contains(Integer.valueOf(Objects.hash(Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), Integer.valueOf(isTranslatingDialog(messageObject.getDialogId()) ? 1 : 0))));
    }

    public boolean isTranslatingDialog(long j10) {
        if (isFeatureAvailable(j10) && this.translatingDialogs.get(j10, Boolean.valueOf(isChatAutoTranslated(j10))).booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean isTranslatingStory(TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return false;
        }
        return this.translatingStories.contains(new StoryKey(storyItem));
    }

    public void reset() {
        this.translatableDialogMessages.clear();
        this.detectedDialogLanguage.clear();
    }

    public void setChatTranslateEnabled(boolean z4) {
        SharedPreferences.Editor edit = this.messagesController.getMainSettings().edit();
        this.chatTranslateEnabled = Boolean.valueOf(z4);
        edit.putBoolean("translate_chat_button", z4).apply();
    }

    public void setContextTranslateEnabled(boolean z4) {
        SharedPreferences.Editor edit = this.messagesController.getMainSettings().edit();
        this.contextTranslateEnabled = Boolean.valueOf(z4);
        edit.putBoolean("translate_button", z4).apply();
    }

    public void setDialogTranslateTo(long j10, String str) {
        Boolean bool;
        if (TextUtils.equals(getDialogTranslateTo(j10), str)) {
            return;
        }
        if (isTranslatingDialog(j10)) {
            AndroidUtilities.runOnUIThread(new il(this, j10, str), 150L);
        } else {
            synchronized (this) {
                this.translateDialogLanguage.put(Long.valueOf(j10), str);
            }
        }
        cancelTranslations(j10);
        synchronized (this) {
            LongSparseArray<Boolean> longSparseArray = this.translatingDialogs;
            bool = Boolean.FALSE;
            longSparseArray.put(j10, bool);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j10), bool);
        v31.H(str);
    }

    public void setHideTranslateDialog(long j10, boolean z4) {
        setHideTranslateDialog(j10, z4, false);
    }

    public void toggleTranslatingDialog(long j10) {
        toggleTranslatingDialog(j10, !isTranslatingDialog(j10));
    }

    public void translatePhoto(MessageObject messageObject, Runnable runnable) {
        if (messageObject != null && messageObject.messageOwner != null) {
            MessageKey messageKey = new MessageKey(messageObject);
            String B = v31.B();
            TLRPC.Message message = messageObject.messageOwner;
            if (message.translatedText != null && TextUtils.equals(message.translatedToLanguage, B)) {
                if (runnable != null) {
                    runnable.run();
                }
            } else if (this.translatingPhotos.contains(messageKey)) {
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                this.translatingPhotos.add(messageKey);
                TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                tL_messages_translateText.flags |= 2;
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                TLRPC.Message message2 = messageObject.messageOwner;
                tL_textWithEntities.text = message2.message;
                ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
                tL_textWithEntities.entities = arrayList;
                if (arrayList == null) {
                    tL_textWithEntities.entities = new ArrayList<>();
                }
                tL_messages_translateText.text.add(tL_textWithEntities);
                tL_messages_translateText.to_lang = normalizeLanguage(B);
                getConnectionsManager().sendRequest(tL_messages_translateText, new ml(this, messageObject, B, messageKey, runnable, System.currentTimeMillis(), tL_textWithEntities));
            }
        }
    }

    public void translateStory(TL_stories.StoryItem storyItem, Runnable runnable) {
        if (storyItem != null) {
            StoryKey storyKey = new StoryKey(storyItem);
            String B = v31.B();
            if (storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, B)) {
                if (runnable != null) {
                    runnable.run();
                }
            } else if (this.translatingStories.contains(storyKey)) {
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                this.translatingStories.add(storyKey);
                TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                tL_messages_translateText.flags |= 2;
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = storyItem.caption;
                tL_textWithEntities.entities = storyItem.entities;
                tL_messages_translateText.text.add(tL_textWithEntities);
                tL_messages_translateText.to_lang = normalizeLanguage(B);
                getConnectionsManager().sendRequest(tL_messages_translateText, new ol(this, storyItem, B, storyKey, runnable, tL_textWithEntities, 0));
            }
        }
    }

    public void updateDialogFull(long j10) {
        boolean z4;
        if (isFeatureAvailable(j10) && isDialogTranslatable(j10)) {
            boolean contains = this.hideTranslateDialogs.contains(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull != null) {
                z4 = chatFull.translations_disabled;
            } else {
                TLRPC.UserFull userFull = getMessagesController().getUserFull(j10);
                if (userFull != null) {
                    z4 = userFull.translations_disabled;
                } else {
                    z4 = false;
                }
            }
            synchronized (this) {
                try {
                    if (z4) {
                        this.hideTranslateDialogs.add(Long.valueOf(j10));
                        this.translatingDialogs.remove(j10);
                    } else {
                        this.hideTranslateDialogs.remove(Long.valueOf(j10));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (contains != z4) {
                saveTranslatingDialogsCache();
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j10), Boolean.valueOf(isTranslatingDialog(j10)));
            }
        }
    }

    private void checkTranslation(org.telegram.messenger.MessageObject r10, boolean r11, final boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TranslateController.checkTranslation(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    public boolean isFeatureAvailable(long j10) {
        if (isChatTranslateEnabled()) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
            if (UserConfig.getInstance(this.currentAccount).isPremium()) {
                return true;
            }
            return chat != null && chat.autotranslation;
        }
        return false;
    }

    public void setHideTranslateDialog(long j10, boolean z4, boolean z10) {
        TLRPC.TL_messages_togglePeerTranslations tL_messages_togglePeerTranslations = new TLRPC.TL_messages_togglePeerTranslations();
        tL_messages_togglePeerTranslations.peer = getMessagesController().getInputPeer(j10);
        tL_messages_togglePeerTranslations.disabled = z4;
        getConnectionsManager().sendRequest(tL_messages_togglePeerTranslations, null);
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
        if (chatFull != null) {
            chatFull.translations_disabled = z4;
            getMessagesStorage().updateChatInfo(chatFull, true);
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(j10);
        if (userFull != null) {
            userFull.translations_disabled = z4;
            getMessagesStorage().updateUserInfo(userFull, true);
        }
        synchronized (this) {
            try {
                if (z4) {
                    this.hideTranslateDialogs.add(Long.valueOf(j10));
                    this.translatingDialogs.remove(j10);
                } else {
                    this.hideTranslateDialogs.remove(Long.valueOf(j10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        saveTranslatingDialogsCache();
        if (z10) {
            return;
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j10), Boolean.valueOf(isTranslatingDialog(j10)));
    }

    public boolean toggleTranslatingDialog(long j10, boolean z4) {
        boolean isTranslatingDialog = isTranslatingDialog(j10);
        boolean z10 = true;
        if (z4 && !isTranslatingDialog) {
            LongSparseArray<Boolean> longSparseArray = this.translatingDialogs;
            Boolean bool = Boolean.TRUE;
            longSparseArray.put(j10, bool);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j10), bool);
        } else if (z4 || !isTranslatingDialog) {
            z10 = false;
        } else {
            LongSparseArray<Boolean> longSparseArray2 = this.translatingDialogs;
            Boolean bool2 = Boolean.FALSE;
            longSparseArray2.put(j10, bool2);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j10), bool2);
            cancelTranslations(j10);
        }
        saveTranslatingDialogsCache();
        return z10;
    }

    public boolean isTranslating(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages) {
        if (messageObject != null && isTranslatingDialog(messageObject.getDialogId())) {
            TLRPC.Message message = messageObject.messageOwner;
            boolean z4 = message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal;
            synchronized (this) {
                try {
                    if ((z4 ? this.loadingTranscriptionTranslations : this.loadingTranslations).contains(Integer.valueOf(messageObject.getId()))) {
                        return true;
                    }
                    if (groupedMessages != null) {
                        ArrayList<MessageObject> arrayList = groupedMessages.messages;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            MessageObject messageObject2 = arrayList.get(i10);
                            i10++;
                            if ((z4 ? this.loadingTranscriptionTranslations : this.loadingTranslations).contains(Integer.valueOf(messageObject2.getId()))) {
                                return true;
                            }
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return false;
    }
}
