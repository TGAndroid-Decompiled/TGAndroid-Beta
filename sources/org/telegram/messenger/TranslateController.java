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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.a31;

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

        public String f19644q;
    }

    public static class MessageKey {
        public long dialogId;

        public int f19645id;

        public MessageKey(MessageObject messageObject) {
            this.dialogId = messageObject.getDialogId();
            this.f19645id = messageObject.getId();
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

        public static PollText TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (PollText) TLObject.TLdeserialize(PollText.class, 613759672 != i10 ? null : new PollText(), inputSerializedData, i10, z10);
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

        public int length() {
            TLRPC.TL_textWithEntities tL_textWithEntities = this.question;
            int length = tL_textWithEntities != null ? tL_textWithEntities.text.length() : 0;
            for (int i10 = 0; i10 < this.answers.size(); i10++) {
                length += this.answers.get(i10).text.text.length();
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = this.solution;
            return tL_textWithEntities2 != null ? tL_textWithEntities2.text.length() + length : length;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int int32 = inputSerializedData.readInt32(z10);
            if ((int32 & 1) != 0) {
                this.question = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if ((int32 & 2) != 0) {
                this.answers = Vector.deserialize(inputSerializedData, new vg(), z10);
            }
            if ((int32 & 4) != 0) {
                this.solution = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(613759672);
            int i10 = this.question != null ? 1 : 0;
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
            this.storyId = storyItem.f22617id;
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
        AndroidUtilities.runOnUIThread(new rg(this, 16), 150L);
    }

    public static void analyzeSuggestedLanguageCodes() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        try {
            linkedHashSet.add(LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        try {
            linkedHashSet.add(Resources.getSystem().getConfiguration().locale.getLanguage());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            linkedHashSet.addAll(a31.Y());
        } catch (Exception e11) {
            FileLog.e(e11);
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
                        if (b31.E(locale, null, null) != null) {
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
        String str;
        String str2;
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        TranslatableDecision translatableDecision = this.translatableDialogMessages.get(Long.valueOf(dialogId));
        if (translatableDecision == null) {
            HashMap<Long, TranslatableDecision> map = this.translatableDialogMessages;
            Long lValueOf = Long.valueOf(dialogId);
            TranslatableDecision translatableDecision2 = new TranslatableDecision();
            map.put(lValueOf, translatableDecision2);
            translatableDecision = translatableDecision2;
        }
        boolean z10 = false;
        boolean z11 = isTranslatable(messageObject) && ((str2 = messageObject.messageOwner.originalLanguage) == null || "und".equals(str2));
        if (isTranslatable(messageObject) && (str = messageObject.messageOwner.originalLanguage) != null && !"und".equals(str) && !isLanguageRestricted(messageObject.messageOwner.originalLanguage)) {
            z10 = true;
        }
        if (z11) {
            translatableDecision.unknown.add(Integer.valueOf(messageObject.getId()));
        } else {
            (z10 ? translatableDecision.certainlyTranslatable : translatableDecision.certainlyNotTranslatable).add(Integer.valueOf(messageObject.getId()));
        }
        if (!z11) {
            this.detectedDialogLanguage.put(Long.valueOf(dialogId), messageObject.messageOwner.originalLanguage);
        }
        int size = translatableDecision.certainlyTranslatable.size();
        int size2 = translatableDecision.unknown.size();
        int size3 = translatableDecision.certainlyNotTranslatable.size();
        int i10 = size + size2 + size3;
        boolean zIsChatAutoTranslated = isChatAutoTranslated(dialogId);
        if (i10 >= (zIsChatAutoTranslated ? 2 : 6)) {
            if (zIsChatAutoTranslated) {
                if (size < 2.0f) {
                    return;
                }
            } else if (size / (size + size3) < 0.6f) {
                return;
            }
            if (size2 / i10 < (zIsChatAutoTranslated ? 0.8f : 0.65f)) {
                this.translatableDialogs.add(Long.valueOf(dialogId));
                this.translatableDialogMessages.remove(Long.valueOf(dialogId));
                AndroidUtilities.runOnUIThread(new wk(this, dialogId, 0), 450L);
            }
        }
    }

    private void checkLanguage(MessageObject messageObject) {
        if (LanguageDetector.hasSupport()) {
            String detectLanguageText = getDetectLanguageText(messageObject);
            if (!isTranslatable(messageObject) || messageObject.messageOwner == null || TextUtils.isEmpty(detectLanguageText)) {
                return;
            }
            if (messageObject.messageOwner.originalLanguage != null) {
                checkDialogTranslatable(messageObject);
                return;
            }
            long dialogId = messageObject.getDialogId();
            int iHash = hash(messageObject);
            if (isDialogTranslatable(dialogId) || this.pendingLanguageChecks.contains(Integer.valueOf(iHash))) {
                return;
            }
            this.pendingLanguageChecks.add(Integer.valueOf(iHash));
            Utilities.stageQueue.postRunnable(new vk(this, detectLanguageText, messageObject, dialogId, iHash, 0));
        }
    }

    private void clearAllKeptReplyMessages(long j10) {
        this.keptReplyMessageObjects.remove(Long.valueOf(j10));
    }

    public static String currentLanguage() {
        String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
        return str != null ? str.split("_")[0] : str;
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
            language.displayName = b31.z(b31.E(language.code, null, null));
            language.ownDisplayName = b31.z(b31.L(language.code, true));
            if (language.displayName != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(language.displayName);
                sb2.append(" ");
                String str2 = language.ownDisplayName;
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                language.f19644q = sb2.toString().toLowerCase();
                arrayList.add(language);
            }
            i10++;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collections.sort(arrayList, new mk(Collator.getInstance(Locale.getDefault()), 2));
            return arrayList;
        }
        Collections.sort(arrayList, Comparator$CC.comparing(new ia(4)));
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
        Collections.sort(arrayList, new mk(LocaleController.getInstance().getCurrentLocaleInfo(), 1));
        return arrayList;
    }

    public static ArrayList<Language> getSuggestedLanguages(String str) {
        ArrayList<Language> arrayList = new ArrayList<>();
        if (suggestedLanguageCodes == null) {
            analyzeSuggestedLanguageCodes();
            if (suggestedLanguageCodes != null) {
                for (String str2 : suggestedLanguageCodes) {
                    if (TextUtils.equals(str2, str) && (!"no".equals(str) || !"nb".equals(str2))) {
                        if (!"nb".equals(str) || !"no".equals(str2)) {
                            Language language = new Language();
                            language.code = str2;
                            if ("no".equals(str2)) {
                                language.code = "nb";
                            }
                            language.displayName = b31.z(b31.E(language.code, null, null));
                            language.ownDisplayName = b31.z(b31.L(language.code, true));
                            if (language.displayName != null) {
                                language.f19644q = (language.displayName + " " + language.ownDisplayName).toLowerCase();
                                arrayList.add(language);
                            }
                        }
                    }
                }
            }
        } else {
            while (r1.hasNext()) {
                if (TextUtils.equals(str2, str)) {
                }
            }
        }
        return arrayList;
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
        return isDialogTranslatable(j10) && (chat = getMessagesController().getChat(Long.valueOf(-j10))) != null && chat.autotranslation;
    }

    private boolean isLanguageRestricted(String str) {
        if (getUserConfig().isPremium()) {
            return a31.Y().contains(str);
        }
        try {
            return TextUtils.equals(LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode, str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isSummarizable(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject == null || (message = messageObject.messageOwner) == null || message.summary_from_language == null || messageObject.isOutOwner() || messageObject.isRestrictedMessage || messageObject.isSponsored()) {
            return false;
        }
        int i10 = messageObject.type;
        return (i10 == 0 || i10 == 3 || i10 == 1 || i10 == 9 || i10 == 14 || i10 == 17) && !TextUtils.isEmpty(messageObject.messageOwner.message) && messageObject.messageOwner.message.length() > 100;
    }

    public static boolean isTranslatable(MessageObject messageObject) {
        if (messageObject == null || messageObject.messageOwner == null || messageObject.isOutOwner() || messageObject.isRestrictedMessage || messageObject.isSponsored()) {
            return false;
        }
        int i10 = messageObject.type;
        if (i10 != 0 && i10 != 3 && i10 != 1 && i10 != 2 && i10 != 5 && i10 != 9 && i10 != 14 && i10 != 17 && i10 != 36) {
            return false;
        }
        if (TextUtils.isEmpty(messageObject.messageOwner.message) && !(MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.rich_message == null && (!message.voiceTranscriptionOpen || TextUtils.isEmpty(message.voiceTranscription) || !messageObject.messageOwner.voiceTranscriptionFinal)) {
                return false;
            }
        }
        return true;
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

    public void lambda$checkDialogMessageSure$10(ArrayList arrayList, ArrayList arrayList2) {
        TLRPC.Message message;
        boolean z10 = false;
        for (int i10 = 0; i10 < Math.min(arrayList.size(), arrayList2.size()); i10++) {
            MessageObject messageObject = (MessageObject) arrayList2.get(i10);
            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(i10);
            if (messageObject != null && (message = messageObject.messageOwner) != null && message2 != null) {
                message.translatedText = message2.translatedText;
                message.translatedPoll = message2.translatedPoll;
                message.translatedToLanguage = message2.translatedToLanguage;
                if (messageObject.updateTranslation(false)) {
                    z10 = true;
                }
            }
        }
        if (z10) {
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
            if (messageObject == null || messageObject.messageOwner == null) {
                arrayList2.add(null);
            } else {
                arrayList2.add(getMessagesStorage().getMessageWithCustomParamsOnlyInternal(messageObject.getId(), messageObject.getDialogId()));
            }
        }
        AndroidUtilities.runOnUIThread(new a9(this, arrayList2, arrayList, 26));
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
        AndroidUtilities.runOnUIThread(new vk(this, str, messageObject, j10, i10, 1));
    }

    public void lambda$checkLanguage$14(MessageObject messageObject, long j10, int i10) {
        messageObject.messageOwner.originalLanguage = "und";
        getMessagesStorage().updateMessageCustomParams(j10, messageObject.messageOwner);
        this.pendingLanguageChecks.remove(Integer.valueOf(i10));
    }

    public void lambda$checkLanguage$15(MessageObject messageObject, long j10, int i10, Exception exc) {
        AndroidUtilities.runOnUIThread(new hh.b9(this, messageObject, j10, i10, 11));
    }

    public void lambda$checkLanguage$16(String str, MessageObject messageObject, long j10, int i10) {
        LanguageDetector.detectLanguage(str, new yk(this, messageObject, j10, i10), new yk(this, messageObject, j10, i10));
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

    public void lambda$checkTranslation$5(MessageObject messageObject, boolean z10, long j10, Integer num, TL_iv.RichMessage richMessage, String str) {
        if (messageObject.getId() != num.intValue()) {
            FileLog.e("wtf, asked to translate " + messageObject.getId() + " rich message but got " + num + "!");
        }
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = null;
        message.translatedVoiceTranscription = null;
        message.translatedPoll = null;
        message.translatedRichMessage = richMessage;
        if (z10) {
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

    public void lambda$checkTranslation$7(MessageObject messageObject, boolean z10, long j10, Integer num, PollText pollText, String str) {
        if (messageObject.getId() != num.intValue()) {
            FileLog.e("wtf, asked to translate " + messageObject.getId() + " poll but got " + num + "!");
        }
        TLRPC.Message message = messageObject.messageOwner;
        message.translatedToLanguage = str;
        message.translatedText = null;
        message.translatedVoiceTranscription = null;
        message.translatedPoll = pollText;
        if (z10) {
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

    public void lambda$checkTranslation$8(MessageObject messageObject, boolean z10, long j10, Boolean bool, Integer num, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
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
        if (z10) {
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
        AndroidUtilities.runOnUIThread(new c5(str, messageObject, messageKey, this, callback));
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
        AndroidUtilities.runOnUIThread(new lk(this, messageObject, messageKey, callback, 2));
    }

    public void lambda$detectStoryLanguage$31(TL_stories.StoryItem storyItem, String str, StoryKey storyKey) {
        storyItem.detectedLng = str;
        getMessagesController().getStoriesController().f13963k.h(storyItem.dialogId, storyItem);
        this.detectingStories.remove(storyKey);
    }

    public void lambda$detectStoryLanguage$32(TL_stories.StoryItem storyItem, StoryKey storyKey, String str) {
        AndroidUtilities.runOnUIThread(new lk(this, storyItem, str, storyKey, 3));
    }

    public void lambda$detectStoryLanguage$33(TL_stories.StoryItem storyItem, StoryKey storyKey) {
        storyItem.detectedLng = "und";
        getMessagesController().getStoriesController().f13963k.h(storyItem.dialogId, storyItem);
        this.detectingStories.remove(storyKey);
    }

    public void lambda$detectStoryLanguage$34(TL_stories.StoryItem storyItem, StoryKey storyKey, Exception exc) {
        AndroidUtilities.runOnUIThread(new f0(this, storyItem, storyKey, 5));
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
        int i10 = localeInfo2.serverIndex;
        int i11 = localeInfo3.serverIndex;
        if (i10 == i11) {
            return localeInfo2.name.compareTo(localeInfo3.name);
        }
        if (i10 > i11) {
            return 1;
        }
        return i10 < i11 ? -1 : 0;
    }

    public void lambda$invalidateTranslation$9(MessageObject messageObject, long j10) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslated, messageObject, Boolean.FALSE, Boolean.valueOf(isTranslatingDialog(j10)));
    }

    public void lambda$pushPollToTranslate$25(PendingPollTranslation pendingPollTranslation, TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        ArrayList<Integer> arrayList;
        ArrayList<Utilities.Callback3<Integer, PollText, String>> arrayList2;
        ArrayList<Pair<PollText, PollText>> arrayList3;
        int i10;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        ArrayList<Pair<PollText, PollText>> arrayList4;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        int i12;
        TLRPC.TL_textWithEntities tL_textWithEntities4;
        TLRPC.TL_textWithEntities tL_textWithEntities5;
        synchronized (this) {
            arrayList = pendingPollTranslation.messageIds;
            arrayList2 = pendingPollTranslation.callbacks;
            arrayList3 = pendingPollTranslation.messageTexts;
        }
        if (!(tLObject instanceof TLRPC.TL_messages_translateResult)) {
            if (tL_error == null || !"TO_LANG_INVALID".equals(tL_error.text)) {
                if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert1));
                }
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    arrayList2.get(i13).run(arrayList.get(i13), null, pendingPollTranslation.language);
                }
            } else {
                toggleTranslatingDialog(j10, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            }
            synchronized (this) {
                for (i10 = 0; i10 < arrayList.size(); i10++) {
                    try {
                        this.loadingTranslations.remove(arrayList.get(i10));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        ArrayList<TLRPC.TL_textWithEntities> arrayList5 = ((TLRPC.TL_messages_translateResult) tLObject).result;
        ArrayList arrayList6 = new ArrayList();
        int size = arrayList3.size();
        int i14 = 0;
        int i15 = 0;
        while (i15 < size) {
            Pair<PollText, PollText> pair = arrayList3.get(i15);
            i15++;
            Pair<PollText, PollText> pair2 = pair;
            PollText pollText = (PollText) pair2.first;
            PollText pollText2 = (PollText) pair2.second;
            PollText pollText3 = new PollText();
            if (pollText2 != null && (tL_textWithEntities5 = pollText2.question) != null) {
                pollText3.question = tL_textWithEntities5;
            } else if (pollText.question != null) {
                if (i14 >= arrayList5.size()) {
                    tL_textWithEntities = new TLRPC.TL_textWithEntities();
                } else {
                    tL_textWithEntities = arrayList5.get(i14);
                    i14++;
                }
                pollText3.question = b31.F(pollText.question, tL_textWithEntities);
            }
            if (pollText.answers.size() != (pollText2 == null ? 0 : pollText2.answers.size())) {
                ArrayList<TLRPC.PollAnswer> arrayList7 = pollText.answers;
                int size2 = arrayList7.size();
                int i16 = 0;
                while (i16 < size2) {
                    TLRPC.PollAnswer pollAnswer = arrayList7.get(i16);
                    i16++;
                    int i17 = size;
                    TLRPC.PollAnswer pollAnswer2 = pollAnswer;
                    ArrayList<Pair<PollText, PollText>> arrayList8 = arrayList3;
                    if (i14 >= arrayList5.size()) {
                        tL_textWithEntities4 = new TLRPC.TL_textWithEntities();
                        i12 = i14;
                    } else {
                        i12 = i14 + 1;
                        tL_textWithEntities4 = arrayList5.get(i14);
                    }
                    TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                    tL_pollAnswer.text = tL_textWithEntities4;
                    tL_pollAnswer.option = pollAnswer2.option;
                    pollText3.answers.add(tL_pollAnswer);
                    size = i17;
                    i14 = i12;
                    arrayList3 = arrayList8;
                }
                i11 = size;
                arrayList4 = arrayList3;
            } else {
                i11 = size;
                arrayList4 = arrayList3;
                if (pollText2 != null) {
                    pollText3.answers = pollText2.answers;
                }
            }
            if (pollText2 != null && (tL_textWithEntities3 = pollText2.solution) != null) {
                pollText3.solution = tL_textWithEntities3;
            } else if (pollText.solution != null) {
                if (i14 >= arrayList5.size()) {
                    tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                } else {
                    int i18 = i14 + 1;
                    TLRPC.TL_textWithEntities tL_textWithEntities6 = arrayList5.get(i14);
                    i14 = i18;
                    tL_textWithEntities2 = tL_textWithEntities6;
                }
                pollText3.solution = b31.F(pollText.solution, tL_textWithEntities2);
            }
            arrayList6.add(pollText3);
            size = i11;
            arrayList3 = arrayList4;
        }
        int iMin = Math.min(arrayList2.size(), arrayList6.size());
        for (int i19 = 0; i19 < iMin; i19++) {
            arrayList2.get(i19).run(arrayList.get(i19), (PollText) arrayList6.get(i19), pendingPollTranslation.language);
        }
        synchronized (this) {
            while (i10 < arrayList.size()) {
                this.loadingTranslations.remove(arrayList.get(i10));
            }
        }
    }

    public void lambda$pushPollToTranslate$26(PendingPollTranslation pendingPollTranslation, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new xk(this, pendingPollTranslation, tLObject, tL_error, j10, 0));
    }

    public void lambda$pushPollToTranslate$27(long r13, org.telegram.messenger.TranslateController.PendingPollTranslation r15) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TranslateController.lambda$pushPollToTranslate$27(long, org.telegram.messenger.TranslateController$PendingPollTranslation):void");
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
            int iMin = Math.min(arrayList2.size(), arrayList3.size());
            for (int i10 = 0; i10 < iMin; i10++) {
                arrayList2.get(i10).run(arrayList.get(i10), arrayList3.get(i10), pendingRichTranslation.language);
            }
        } else if (tL_error == null || !"TO_LANG_INVALID".equals(tL_error.text)) {
            if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert1));
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                arrayList2.get(i11).run(arrayList.get(i11), null, pendingRichTranslation.language);
            }
        } else {
            toggleTranslatingDialog(j10, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
        }
        synchronized (this) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                try {
                    this.loadingTranslations.remove(arrayList.get(i12));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void lambda$pushRichMessageToTranslate$29(PendingRichTranslation pendingRichTranslation, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new xk(this, pendingRichTranslation, tLObject, tL_error, j10, 1));
    }

    public void lambda$pushRichMessageToTranslate$30(long r9, org.telegram.messenger.TranslateController.PendingRichTranslation r11) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TranslateController.lambda$pushRichMessageToTranslate$30(long, org.telegram.messenger.TranslateController$PendingRichTranslation):void");
    }

    public static void lambda$pushToSummarize$18(org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
    }

    public void lambda$pushToSummarize$19(int i10, Utilities.Callback callback, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_error tL_error) {
        org.telegram.ui.ActionBar.n2 n2VarU;
        if (tL_textWithEntities != null) {
            this.loadingSummarizations.remove(Integer.valueOf(i10));
            callback.run(tL_textWithEntities);
        } else if (tL_error != null) {
            if ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) && (n2VarU = LaunchActivity.U()) != null) {
                org.telegram.ui.Components.ec ecVarJ = org.telegram.ui.Components.mc.a0(n2VarU).J(R.raw.star_premium_2, LocaleController.getString(R.string.SummaryLimit), LocaleController.getString(R.string.SummaryLimitUpgrade), new td(3, n2VarU));
                ecVarJ.f28020j = 5000;
                ecVarJ.k(true);
            }
            this.loadingSummarizations.remove(Integer.valueOf(i10));
            callback.run(null);
        }
    }

    public void lambda$pushToTranslate$20(Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, String str2, Boolean bool) {
        if (str2 == null) {
            toggleTranslatingDialog(j10, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2));
        } else {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_textWithEntities.text = str2;
            callback4.run(Boolean.valueOf(z10), Integer.valueOf(i10), tL_textWithEntities, str);
        }
    }

    public void lambda$pushToTranslate$21(Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, String str2, Boolean bool) {
        if (str2 == null) {
            toggleTranslatingDialog(j10, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2));
        } else {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_textWithEntities.text = str2;
            callback4.run(Boolean.valueOf(z10), Integer.valueOf(i10), tL_textWithEntities, str);
        }
    }

    public void lambda$pushToTranslate$22(org.telegram.messenger.TranslateController.PendingTranslation r17, org.telegram.tgnet.TLObject r18, boolean r19, org.telegram.tgnet.TLRPC.TL_error r20, long r21, java.util.Set r23) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TranslateController.lambda$pushToTranslate$22(org.telegram.messenger.TranslateController$PendingTranslation, org.telegram.tgnet.TLObject, boolean, org.telegram.tgnet.TLRPC$TL_error, long, java.util.Set):void");
    }

    public void lambda$pushToTranslate$23(PendingTranslation pendingTranslation, boolean z10, long j10, Set set, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new sk(j10, set, pendingTranslation, this, tLObject, tL_error, z10));
    }

    public void lambda$pushToTranslate$24(HashMap map, long j10, PendingTranslation pendingTranslation, boolean z10, Set set) {
        long j11;
        synchronized (this) {
            try {
                ArrayList arrayList = (ArrayList) map.get(Long.valueOf(j10));
                if (arrayList != null) {
                    arrayList.remove(pendingTranslation);
                    if (arrayList.isEmpty()) {
                        map.remove(Long.valueOf(j10));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        String str = getMessagesController().translationsAutoEnabled;
        if ("alternative".equals(str) || "system".equals(str)) {
            String str2 = pendingTranslation.language;
            for (int i10 = 0; i10 < pendingTranslation.messageIds.size(); i10++) {
                b31.y(pendingTranslation.messageTexts.get(i10).text, null, str2, new tk(this, pendingTranslation.callbacks.get(i10), z10, pendingTranslation.messageIds.get(i10).intValue(), str2, j10, 1));
            }
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        if (z10) {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.addAll(pendingTranslation.messageTexts);
            j11 = j10;
        } else {
            tL_messages_translateText.flags |= 1;
            j11 = j10;
            tL_messages_translateText.peer = getMessagesController().getInputPeer(j11);
            tL_messages_translateText.f22502id = pendingTranslation.messageIds;
        }
        tL_messages_translateText.to_lang = normalizeLanguage(pendingTranslation.language);
        int iSendRequest = getConnectionsManager().sendRequest(tL_messages_translateText, new oa(this, pendingTranslation, z10, j11, set, 1));
        synchronized (this) {
            pendingTranslation.reqId = iSendRequest;
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
        message.translatedText = b31.F(tL_textWithEntities, tL_textWithEntities2);
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
        if (!(tLObject instanceof TLRPC.TL_messages_translateResult)) {
            AndroidUtilities.runOnUIThread(new zk(this, messageObject, str, messageKey, runnable, j10, 1));
            return;
        }
        ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
        if (arrayList.size() <= 0) {
            AndroidUtilities.runOnUIThread(new zk(this, messageObject, str, messageKey, runnable, j10, 0));
        } else {
            final TLRPC.TL_textWithEntities tL_textWithEntities2 = arrayList.get(0);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f19740a.lambda$translatePhoto$44(messageObject, str, tL_textWithEntities, tL_textWithEntities2, messageKey, runnable, j10);
                }
            });
        }
    }

    public void lambda$translateStory$35(TL_stories.StoryItem storyItem, String str, StoryKey storyKey, Runnable runnable) {
        storyItem.translatedLng = str;
        storyItem.translatedText = null;
        getMessagesController().getStoriesController().f13963k.h(storyItem.dialogId, storyItem);
        this.translatingStories.remove(storyKey);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$translateStory$36(TL_stories.StoryItem storyItem, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, StoryKey storyKey, Runnable runnable) {
        storyItem.translatedLng = str;
        storyItem.translatedText = b31.F(tL_textWithEntities, tL_textWithEntities2);
        getMessagesController().getStoriesController().f13963k.h(storyItem.dialogId, storyItem);
        this.translatingStories.remove(storyKey);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$translateStory$37(TL_stories.StoryItem storyItem, String str, StoryKey storyKey, Runnable runnable) {
        storyItem.translatedLng = str;
        storyItem.translatedText = null;
        getMessagesController().getStoriesController().f13963k.h(storyItem.dialogId, storyItem);
        this.translatingStories.remove(storyKey);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$translateStory$38(final TL_stories.StoryItem storyItem, final String str, final StoryKey storyKey, final Runnable runnable, TLRPC.TL_textWithEntities tL_textWithEntities, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_messages_translateResult)) {
            final int i10 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(this) {

                public final TranslateController f20196b;

                {
                    this.f20196b = this;
                }

                @Override
                public final void run() {
                    switch (i10) {
                        case 0:
                            this.f20196b.lambda$translateStory$35(storyItem, str, storyKey, runnable);
                            break;
                        default:
                            this.f20196b.lambda$translateStory$37(storyItem, str, storyKey, runnable);
                            break;
                    }
                }
            });
            return;
        }
        ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
        if (arrayList.size() > 0) {
            AndroidUtilities.runOnUIThread(new il(this, storyItem, str, tL_textWithEntities, arrayList.get(0), storyKey, runnable, 0));
        } else {
            final int i11 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) {

                public final TranslateController f20196b;

                {
                    this.f20196b = this;
                }

                @Override
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.f20196b.lambda$translateStory$35(storyItem, str, storyKey, runnable);
                            break;
                        default:
                            this.f20196b.lambda$translateStory$37(storyItem, str, storyKey, runnable);
                            break;
                    }
                }
            });
        }
    }

    public void loadTranslatingDialogsCached() {
        boolean z10;
        String string = this.messagesController.getMainSettings().getString("translating_dialog_languages2", null);
        if (string == null) {
            return;
        }
        for (String str : string.split(";")) {
            String[] strArrSplit = str.split("=");
            if (strArrSplit.length >= 2) {
                long j10 = Long.parseLong(strArrSplit[0]);
                String[] strArrSplit2 = strArrSplit[1].split(">");
                if (strArrSplit2.length == 2) {
                    String str2 = strArrSplit2[0];
                    String strN = strArrSplit2[1];
                    if (strN.length() <= 0 || strN.charAt(strN.length() - 1) != '!') {
                        z10 = false;
                    } else {
                        strN = com.google.android.recaptcha.internal.a.n(strN, 1, 0);
                        z10 = true;
                    }
                    if ("null".equals(str2)) {
                        str2 = null;
                    }
                    if ("null".equals(strN)) {
                        strN = null;
                    }
                    if (str2 != null) {
                        this.detectedDialogLanguage.put(Long.valueOf(j10), str2);
                        if (!isLanguageRestricted(str2)) {
                            this.translatingDialogs.put(j10, Boolean.valueOf(true ^ z10));
                            this.translatableDialogs.add(Long.valueOf(j10));
                        }
                        if (strN != null) {
                            this.translateDialogLanguage.put(Long.valueOf(j10), strN);
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
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        }
    }

    public static String normalizeLanguage(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains("_")) {
            String[] strArrSplit = str.split("_", 2);
            return strArrSplit[0].toLowerCase() + "-" + strArrSplit[1].toUpperCase();
        }
        if (!str.contains("-")) {
            return str;
        }
        String[] strArrSplit2 = str.split("-", 2);
        return strArrSplit2[0].toLowerCase() + "-" + strArrSplit2[1].toUpperCase();
    }

    private void pushPollToTranslate(MessageObject messageObject, String str, Utilities.Callback3<Integer, PollText, String> callback3) throws Throwable {
        Throwable th;
        PendingPollTranslation pendingPollTranslation;
        if (messageObject == null || messageObject.getId() < 0 || callback3 == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        synchronized (this) {
            try {
                try {
                    ArrayList<PendingPollTranslation> arrayList = this.pendingPollTranslations.get(Long.valueOf(dialogId));
                    if (arrayList == null) {
                        try {
                            HashMap<Long, ArrayList<PendingPollTranslation>> map = this.pendingPollTranslations;
                            Long lValueOf = Long.valueOf(dialogId);
                            ArrayList<PendingPollTranslation> arrayList2 = new ArrayList<>();
                            map.put(lValueOf, arrayList2);
                            arrayList = arrayList2;
                        } catch (Throwable th2) {
                            th = th2;
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
                        pendingPollTranslation.symbolsCount += length;
                        PendingPollTranslation pendingPollTranslation2 = pendingPollTranslation;
                        c4 c4Var = new c4(this, dialogId, pendingPollTranslation2, 1);
                        pendingPollTranslation2.runnable = c4Var;
                        AndroidUtilities.runOnUIThread(c4Var, pendingPollTranslation2.delay);
                        pendingPollTranslation2.delay /= 2;
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
            }
            throw th;
        }
    }

    private void pushRichMessageToTranslate(MessageObject messageObject, String str, Utilities.Callback3<Integer, TL_iv.RichMessage, String> callback3) throws Throwable {
        Throwable th;
        PendingRichTranslation pendingRichTranslation;
        if (messageObject == null || messageObject.messageOwner == null || messageObject.getId() < 0 || callback3 == null || messageObject.messageOwner.rich_message == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        synchronized (this) {
            try {
                try {
                    ArrayList<PendingRichTranslation> arrayList = this.pendingRichTranslations.get(Long.valueOf(dialogId));
                    if (arrayList == null) {
                        try {
                            HashMap<Long, ArrayList<PendingRichTranslation>> map = this.pendingRichTranslations;
                            Long lValueOf = Long.valueOf(dialogId);
                            ArrayList<PendingRichTranslation> arrayList2 = new ArrayList<>();
                            map.put(lValueOf, arrayList2);
                            arrayList = arrayList2;
                        } catch (Throwable th2) {
                            th = th2;
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
                    c4 c4Var = new c4(this, dialogId, pendingRichTranslation2, 2);
                    pendingRichTranslation2.runnable = c4Var;
                    AndroidUtilities.runOnUIThread(c4Var, pendingRichTranslation2.delay);
                    pendingRichTranslation2.delay /= 2;
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
            }
            throw th;
        }
    }

    private void pushToSummarize(MessageObject messageObject, String str, Utilities.Callback<TLRPC.TL_textWithEntities> callback) {
        int iHash = Objects.hash(Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), Integer.valueOf(str != null ? 1 : 0));
        if (this.loadingSummarizations.contains(Integer.valueOf(iHash))) {
            return;
        }
        this.loadingSummarizations.add(Integer.valueOf(iHash));
        TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
        tL_messages_summarizeText.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
        tL_messages_summarizeText.f22500id = messageObject.getId();
        if (str != null) {
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.to_lang = normalizeLanguage(str);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new a(), new kh(this, iHash, callback));
    }

    private void pushToTranslate(MessageObject messageObject, String str, Utilities.Callback4<Boolean, Integer, TLRPC.TL_textWithEntities, String> callback4) {
        PendingTranslation pendingTranslation;
        int length;
        String str2;
        if (messageObject == null || messageObject.messageOwner == null || messageObject.getId() < 0 || callback4 == null) {
            return;
        }
        TLRPC.Message message = messageObject.messageOwner;
        boolean z10 = false;
        if (message.voiceTranscription != null && message.voiceTranscriptionFinal && message.voiceTranscriptionOpen) {
            z10 = true;
        }
        long dialogId = messageObject.getDialogId();
        HashMap<Long, ArrayList<PendingTranslation>> map = z10 ? this.pendingTranscriptionsTranslations : this.pendingTranslations;
        Set<Integer> set = z10 ? this.loadingTranscriptionTranslations : this.loadingTranslations;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        if (z10) {
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
                if (z10) {
                    String str4 = messageObject.messageOwner.voiceTranscription;
                    length = str4 == null ? 0 : str4.length();
                } else {
                    TLRPC.Message message3 = messageObject.messageOwner;
                    if (message3 == null || (str2 = message3.message) == null) {
                        CharSequence charSequence = messageObject.caption;
                        if (charSequence != null) {
                            length = charSequence.length();
                        } else {
                            CharSequence charSequence2 = messageObject.messageText;
                            length = charSequence2 != null ? charSequence2.length() : 0;
                        }
                    } else {
                        length = str2.length();
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
                pendingTranslation.symbolsCount += length;
                PendingTranslation pendingTranslation2 = pendingTranslation;
                jd jdVar = new jd(this, map, dialogId, pendingTranslation2, z10, set);
                pendingTranslation2.runnable = jdVar;
                AndroidUtilities.runOnUIThread(jdVar, pendingTranslation2.delay);
                pendingTranslation2.delay /= 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void resetTranslatingDialogsCache() {
        MessagesController.getMainSettings(this.currentAccount).edit().remove("translating_dialog_languages2").remove("hidden_translation_at").apply();
    }

    private void saveTranslatingDialogsCache() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (int i10 = 0; i10 < this.translatingDialogs.size(); i10++) {
            try {
                long jKeyAt = this.translatingDialogs.keyAt(i10);
                if (!z10) {
                    sb2.append(";");
                }
                if (z10) {
                    z10 = false;
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
                sb2.append(jKeyAt);
                sb2.append("=");
                sb2.append(str);
                sb2.append(">");
                sb2.append(str2);
                if (!this.translatingDialogs.valueAt(i10).booleanValue()) {
                    sb2.append("!");
                }
            } catch (Exception unused) {
            }
        }
        HashSet hashSet = new HashSet();
        Iterator<Long> it = this.hideTranslateDialogs.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add("" + it.next());
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        MessagesController.getMainSettings(this.currentAccount).edit().putString("translating_dialog_languages2", sb2.toString()).putStringSet("hidden_translation_at", hashSet).apply();
    }

    public boolean canTranslatePhoto(MessageObject messageObject, String str) {
        TLRPC.Message message;
        TLRPC.Message message2;
        String str2;
        if (messageObject != null && (message2 = messageObject.messageOwner) != null && (str2 = message2.originalLanguage) != null) {
            str = str2;
        }
        if (messageObject == null || (message = messageObject.messageOwner) == null || TextUtils.isEmpty(message.message)) {
            return false;
        }
        if (str != null) {
            return str != null ? false : false;
        }
        TLRPC.Message message3 = messageObject.messageOwner;
        if (message3.translatedText == null || !TextUtils.equals(message3.translatedToLanguage, b31.C())) {
            if (str != null || isLanguageRestricted(messageObject.messageOwner.originalLanguage)) {
            }
        }
        return !messageObject.translated;
    }

    public boolean canTranslateStory(TL_stories.StoryItem storyItem) {
        if (storyItem == null || TextUtils.isEmpty(storyItem.caption) || Emoji.fullyConsistsOfEmojis(storyItem.caption)) {
            return false;
        }
        if (storyItem.detectedLng == null && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, b31.C())) {
            return true;
        }
        String str = storyItem.detectedLng;
        return (str == null || isLanguageRestricted(str)) ? false : true;
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
            } catch (Throwable th) {
                throw th;
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void checkDialogMessage(long j10) {
        if (isFeatureAvailable(j10)) {
            checkDialogMessageSure(j10);
        }
    }

    public void checkDialogMessageSure(long j10) {
        if (this.translatingDialogs.get(j10, Boolean.valueOf(isChatAutoTranslated(j10))).booleanValue()) {
            getMessagesStorage().getStorageQueue().postRunnable(new wk(this, j10, 1));
        }
    }

    public void checkRestrictedLanguagesUpdate() {
        synchronized (this) {
            try {
                this.translatableDialogMessages.clear();
                ArrayList arrayList = new ArrayList();
                for (Long l10 : this.translatableDialogs) {
                    long jLongValue = l10.longValue();
                    String str = this.detectedDialogLanguage.get(l10);
                    if (str != null && isLanguageRestricted(str)) {
                        cancelTranslations(jLongValue);
                        this.translatingDialogs.remove(jLongValue);
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void checkTranslation(MessageObject messageObject, boolean z10) {
        checkTranslation(messageObject, z10, false);
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
        if (messageObject == null || messageObject.messageOwner == null || !LanguageDetector.hasSupport() || TextUtils.isEmpty(messageObject.messageOwner.message)) {
            return;
        }
        if (!TextUtils.isEmpty(messageObject.messageOwner.originalLanguage)) {
            if (callback != null) {
                callback.run(messageObject.messageOwner.originalLanguage);
            }
        } else {
            MessageKey messageKey = new MessageKey(messageObject);
            if (this.detectingPhotos.contains(messageKey)) {
                return;
            }
            this.detectingPhotos.add(messageKey);
            LanguageDetector.detectLanguage(messageObject.messageOwner.message, new jl(this, messageObject, messageKey, callback), new jl(this, messageObject, messageKey, callback));
        }
    }

    public void detectStoryLanguage(TL_stories.StoryItem storyItem) {
        String str;
        if (storyItem == null || storyItem.detectedLng != null || (str = storyItem.caption) == null || str.length() == 0 || !LanguageDetector.hasSupport()) {
            return;
        }
        StoryKey storyKey = new StoryKey(storyItem);
        if (this.detectingStories.contains(storyKey)) {
            return;
        }
        this.detectingStories.add(storyKey);
        LanguageDetector.detectLanguage(storyItem.caption, new gl(this, storyItem, storyKey), new gl(this, storyItem, storyKey));
    }

    public MessageObject findReplyMessageObject(long j10, int i10) {
        HashMap<Integer, MessageObject> map = this.keptReplyMessageObjects.get(Long.valueOf(j10));
        if (map == null) {
            return null;
        }
        return map.get(Integer.valueOf(i10));
    }

    public String getDialogDetectedLanguage(long j10) {
        return this.detectedDialogLanguage.get(Long.valueOf(j10));
    }

    public String getDialogTranslateTo(long j10) {
        String strC = this.translateDialogLanguage.get(Long.valueOf(j10));
        if (strC == null && ((strC = b31.C()) == null || strC.equals(getDialogDetectedLanguage(j10)))) {
            strC = currentLanguage();
        }
        return "nb".equals(strC) ? "no" : strC;
    }

    public void invalidateTranslation(MessageObject messageObject) {
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
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
            AndroidUtilities.runOnUIThread(new dl(this, messageObject, dialogId));
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
        return this.translatableDialogs.contains(Long.valueOf(j10)) && isFeatureAvailable(j10) && !DialogObject.isEncryptedDialog(j10) && getUserConfig().getClientUserId() != j10;
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
        boolean z10 = true;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.summarizedOpen) {
            return this.loadingSummarizations.contains(Integer.valueOf(Objects.hash(Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), Integer.valueOf(isTranslatingDialog(messageObject.getDialogId()) ? 1 : 0))));
        }
        synchronized (this) {
            if (messageObject != null) {
                try {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    if (message2 == null) {
                        z10 = false;
                    } else {
                        if (!((message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal) ? this.loadingTranscriptionTranslations : this.loadingTranslations).contains(Integer.valueOf(messageObject.getId())) || !isTranslatingDialog(messageObject.getDialogId())) {
                            z10 = false;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean isTranslatingDialog(long j10) {
        return isFeatureAvailable(j10) && this.translatingDialogs.get(j10, Boolean.valueOf(isChatAutoTranslated(j10))).booleanValue();
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

    public void setChatTranslateEnabled(boolean z10) {
        SharedPreferences.Editor editorEdit = this.messagesController.getMainSettings().edit();
        this.chatTranslateEnabled = Boolean.valueOf(z10);
        editorEdit.putBoolean("translate_chat_button", z10).apply();
    }

    public void setContextTranslateEnabled(boolean z10) {
        SharedPreferences.Editor editorEdit = this.messagesController.getMainSettings().edit();
        this.contextTranslateEnabled = Boolean.valueOf(z10);
        editorEdit.putBoolean("translate_button", z10).apply();
    }

    public void setDialogTranslateTo(long j10, String str) {
        Boolean bool;
        if (TextUtils.equals(getDialogTranslateTo(j10), str)) {
            return;
        }
        if (isTranslatingDialog(j10)) {
            AndroidUtilities.runOnUIThread(new dl(this, j10, str), 150L);
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
        b31.I(str);
    }

    public void setHideTranslateDialog(long j10, boolean z10) {
        setHideTranslateDialog(j10, z10, false);
    }

    public void toggleTranslatingDialog(long j10) {
        toggleTranslatingDialog(j10, !isTranslatingDialog(j10));
    }

    public void translatePhoto(MessageObject messageObject, Runnable runnable) {
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        MessageKey messageKey = new MessageKey(messageObject);
        String strC = b31.C();
        TLRPC.Message message = messageObject.messageOwner;
        if (message.translatedText != null && TextUtils.equals(message.translatedToLanguage, strC)) {
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
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        TLRPC.Message message2 = messageObject.messageOwner;
        tL_textWithEntities.text = message2.message;
        ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
        tL_textWithEntities.entities = arrayList;
        if (arrayList == null) {
            tL_textWithEntities.entities = new ArrayList<>();
        }
        tL_messages_translateText.text.add(tL_textWithEntities);
        tL_messages_translateText.to_lang = normalizeLanguage(strC);
        getConnectionsManager().sendRequest(tL_messages_translateText, new fl(this, messageObject, strC, messageKey, runnable, System.currentTimeMillis(), tL_textWithEntities));
    }

    public void translateStory(TL_stories.StoryItem storyItem, Runnable runnable) {
        if (storyItem == null) {
            return;
        }
        StoryKey storyKey = new StoryKey(storyItem);
        String strC = b31.C();
        if (storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, strC)) {
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
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_textWithEntities.text = storyItem.caption;
            tL_textWithEntities.entities = storyItem.entities;
            tL_messages_translateText.text.add(tL_textWithEntities);
            tL_messages_translateText.to_lang = normalizeLanguage(strC);
            getConnectionsManager().sendRequest(tL_messages_translateText, new hl(this, storyItem, strC, storyKey, runnable, tL_textWithEntities, 0));
        }
    }

    public void updateDialogFull(long j10) {
        boolean z10;
        if (isFeatureAvailable(j10) && isDialogTranslatable(j10)) {
            boolean zContains = this.hideTranslateDialogs.contains(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull != null) {
                z10 = chatFull.translations_disabled;
            } else {
                TLRPC.UserFull userFull = getMessagesController().getUserFull(j10);
                z10 = userFull != null ? userFull.translations_disabled : false;
            }
            synchronized (this) {
                try {
                    if (z10) {
                        this.hideTranslateDialogs.add(Long.valueOf(j10));
                        this.translatingDialogs.remove(j10);
                    } else {
                        this.hideTranslateDialogs.remove(Long.valueOf(j10));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zContains != z10) {
                saveTranslatingDialogsCache();
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j10), Boolean.valueOf(isTranslatingDialog(j10)));
            }
        }
    }

    private void checkTranslation(MessageObject messageObject, boolean z10, final boolean z11) throws Throwable {
        final MessageObject messageObject2;
        PollText pollText;
        PollText pollText2;
        MessageObject messageObjectFindReplyMessageObject;
        MessageObject messageObject3;
        if (messageObject != null && messageObject.messageOwner != null) {
            final long dialogId = messageObject.getDialogId();
            if (z10) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message.summarizedOpen && message.summaryText == null && !isTranslatingDialog(messageObject.getDialogId())) {
                    pushToSummarize(messageObject, null, new e4(this, messageObject, dialogId));
                }
            }
            if (isFeatureAvailable(dialogId)) {
                if (!z11 && (messageObject3 = messageObject.replyMessageObject) != null) {
                    checkTranslation(messageObject3, z10, true);
                }
                if (isTranslatable(messageObject)) {
                    if (!isTranslatingDialog(dialogId)) {
                        checkLanguage(messageObject);
                        return;
                    }
                    if (!isTranslateDialogHidden(dialogId)) {
                        String dialogTranslateTo = getDialogTranslateTo(dialogId);
                        if (z11 || messageObject.type == 36) {
                            messageObject2 = messageObject;
                        } else {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            if ((!(((message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal) ? message2.translatedVoiceTranscription : message2.translatedText) == null && message2.translatedPoll == null) && (((pollText2 = message2.translatedPoll) == null || PollText.isFullyTranslated(messageObject, pollText2)) && dialogTranslateTo.equals(messageObject.messageOwner.translatedToLanguage))) || (messageObjectFindReplyMessageObject = findReplyMessageObject(dialogId, messageObject.getId())) == null) {
                                messageObject2 = messageObject;
                            } else {
                                TLRPC.Message message3 = messageObject.messageOwner;
                                TLRPC.Message message4 = messageObjectFindReplyMessageObject.messageOwner;
                                message3.translatedToLanguage = message4.translatedToLanguage;
                                message3.translatedText = message4.translatedText;
                                message3.translatedPoll = message4.translatedPoll;
                                messageObject2 = messageObjectFindReplyMessageObject;
                            }
                        }
                        if (z10 && isTranslatingDialog(dialogId)) {
                            if (messageObject2.type != 36) {
                                TLRPC.Message message5 = messageObject2.messageOwner;
                                if (message5.summarizedOpen) {
                                    if (message5.translatedSummaryText == null || !dialogTranslateTo.equals(message5.translatedSummaryLanguage)) {
                                        pushToSummarize(messageObject2, dialogTranslateTo, new gh.b1(this, messageObject2, dialogTranslateTo, dialogId, 3));
                                        return;
                                    }
                                    return;
                                }
                                if (!(((message5.voiceTranscriptionOpen && message5.voiceTranscriptionFinal) ? message5.translatedVoiceTranscription : message5.translatedText) == null && message5.translatedPoll == null) && (((pollText = message5.translatedPoll) == null || PollText.isFullyTranslated(messageObject2, pollText)) && dialogTranslateTo.equals(messageObject2.messageOwner.translatedToLanguage))) {
                                    if (z11) {
                                        keepReplyMessage(messageObject2);
                                        return;
                                    }
                                    return;
                                } else {
                                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslating, messageObject2);
                                    if (!(MessageObject.getMedia(messageObject2) instanceof TLRPC.TL_messageMediaPoll)) {
                                        pushToTranslate(messageObject2, dialogTranslateTo, new Utilities.Callback4() {
                                            @Override
                                            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                                                this.f19999a.lambda$checkTranslation$8(messageObject2, z11, dialogId, (Boolean) obj, (Integer) obj2, (TLRPC.TL_textWithEntities) obj3, (String) obj4);
                                            }
                                        });
                                        return;
                                    } else {
                                        final int i10 = 1;
                                        pushPollToTranslate(messageObject2, dialogTranslateTo, new Utilities.Callback3(this) {

                                            public final TranslateController f19858b;

                                            {
                                                this.f19858b = this;
                                            }

                                            @Override
                                            public final void run(Object obj, Object obj2, Object obj3) {
                                                switch (i10) {
                                                    case 0:
                                                        this.f19858b.lambda$checkTranslation$5(messageObject2, z11, dialogId, (Integer) obj, (TL_iv.RichMessage) obj2, (String) obj3);
                                                        break;
                                                    default:
                                                        this.f19858b.lambda$checkTranslation$7(messageObject2, z11, dialogId, (Integer) obj, (TranslateController.PollText) obj2, (String) obj3);
                                                        break;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                }
                            }
                            TLRPC.Message message6 = messageObject2.messageOwner;
                            if (message6.translatedRichMessage == null || !dialogTranslateTo.equals(message6.translatedToLanguage)) {
                                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageTranslating, messageObject2);
                                final int i11 = 0;
                                pushRichMessageToTranslate(messageObject2, dialogTranslateTo, new Utilities.Callback3(this) {

                                    public final TranslateController f19858b;

                                    {
                                        this.f19858b = this;
                                    }

                                    @Override
                                    public final void run(Object obj, Object obj2, Object obj3) {
                                        switch (i11) {
                                            case 0:
                                                this.f19858b.lambda$checkTranslation$5(messageObject2, z11, dialogId, (Integer) obj, (TL_iv.RichMessage) obj2, (String) obj3);
                                                break;
                                            default:
                                                this.f19858b.lambda$checkTranslation$7(messageObject2, z11, dialogId, (Integer) obj, (TranslateController.PollText) obj2, (String) obj3);
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean isFeatureAvailable(long j10) {
        if (!isChatTranslateEnabled()) {
            return false;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            return true;
        }
        return chat != null && chat.autotranslation;
    }

    public void setHideTranslateDialog(long j10, boolean z10, boolean z11) {
        TLRPC.TL_messages_togglePeerTranslations tL_messages_togglePeerTranslations = new TLRPC.TL_messages_togglePeerTranslations();
        tL_messages_togglePeerTranslations.peer = getMessagesController().getInputPeer(j10);
        tL_messages_togglePeerTranslations.disabled = z10;
        getConnectionsManager().sendRequest(tL_messages_togglePeerTranslations, null);
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
        if (chatFull != null) {
            chatFull.translations_disabled = z10;
            getMessagesStorage().updateChatInfo(chatFull, true);
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(j10);
        if (userFull != null) {
            userFull.translations_disabled = z10;
            getMessagesStorage().updateUserInfo(userFull, true);
        }
        synchronized (this) {
            try {
                if (z10) {
                    this.hideTranslateDialogs.add(Long.valueOf(j10));
                    this.translatingDialogs.remove(j10);
                } else {
                    this.hideTranslateDialogs.remove(Long.valueOf(j10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        saveTranslatingDialogsCache();
        if (z11) {
            return;
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j10), Boolean.valueOf(isTranslatingDialog(j10)));
    }

    public boolean toggleTranslatingDialog(long j10, boolean z10) {
        boolean zIsTranslatingDialog = isTranslatingDialog(j10);
        boolean z11 = true;
        if (z10 && !zIsTranslatingDialog) {
            LongSparseArray<Boolean> longSparseArray = this.translatingDialogs;
            Boolean bool = Boolean.TRUE;
            longSparseArray.put(j10, bool);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j10), bool);
        } else if (z10 || !zIsTranslatingDialog) {
            z11 = false;
        } else {
            LongSparseArray<Boolean> longSparseArray2 = this.translatingDialogs;
            Boolean bool2 = Boolean.FALSE;
            longSparseArray2.put(j10, bool2);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogTranslate, Long.valueOf(j10), bool2);
            cancelTranslations(j10);
        }
        saveTranslatingDialogsCache();
        return z11;
    }

    public boolean isTranslating(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages) {
        if (messageObject == null || !isTranslatingDialog(messageObject.getDialogId())) {
            return false;
        }
        TLRPC.Message message = messageObject.messageOwner;
        boolean z10 = message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal;
        synchronized (this) {
            try {
                if ((z10 ? this.loadingTranscriptionTranslations : this.loadingTranslations).contains(Integer.valueOf(messageObject.getId()))) {
                    return true;
                }
                if (groupedMessages != null) {
                    ArrayList<MessageObject> arrayList = groupedMessages.messages;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        MessageObject messageObject2 = arrayList.get(i10);
                        i10++;
                        if ((z10 ? this.loadingTranscriptionTranslations : this.loadingTranslations).contains(Integer.valueOf(messageObject2.getId()))) {
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
}
