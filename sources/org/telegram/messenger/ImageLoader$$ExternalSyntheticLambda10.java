package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Stories.StoriesController;

public final class ImageLoader$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public ImageLoader$$ExternalSyntheticLambda10(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((ImageLoader) this.f$0).lambda$replaceImageInCache$5((String) this.f$1, (String) this.f$2, (ImageLocation) this.f$3);
                break;
            case 1:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass1) this.f$0).lambda$run$0((TLObject) this.f$1, (TLRPC.TL_messages_initHistoryImport) this.f$2, (TLRPC.TL_error) this.f$3);
                break;
            case 2:
                ((SendMessagesHelper.ImportingStickers.AnonymousClass1) this.f$0).lambda$run$0((TLRPC.TL_error) this.f$1, (TLRPC.TL_stickers_createStickerSet) this.f$2, (TLObject) this.f$3);
                break;
            case 3:
                ((TranslateController) this.f$0).lambda$detectPhotoLanguage$41((MessageObject) this.f$1, (TranslateController.MessageKey) this.f$2, (Utilities.Callback) this.f$3);
                break;
            case 4:
                ((TranslateController) this.f$0).lambda$detectStoryLanguage$31((TL_stories.StoryItem) this.f$2, (String) this.f$1, (TranslateController.StoryKey) this.f$3);
                break;
            case 5:
                CodeHighlighting.lambda$highlightEditable$1((String) this.f$1, (String) this.f$2, (SpannableString) this.f$0, (Utilities.Callback) this.f$3);
                break;
            case 6:
                ((FilePathDatabase) this.f$0).lambda$lookupFiles$7((ArrayList) this.f$1, (LongSparseArray) this.f$2, (CountDownLatch) this.f$3);
                break;
            case 7:
                ((FilePathDatabase) this.f$0).lambda$checkMediaExistance$2((ArrayList) this.f$1, (long[]) this.f$2, (CountDownLatch) this.f$3);
                break;
            case 8:
                ((FileRefController) this.f$0).lambda$requestReferenceFromServer$0((String) this.f$1, (String) this.f$2, (StoriesController.BotPreview) this.f$3);
                break;
            case 9:
                ((LocationController) this.f$0).lambda$loadSharingLocations$16((ArrayList) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$3);
                break;
            case 10:
                ((MediaController) this.f$0).lambda$generateWaveform$39((String) this.f$1, (String) this.f$2, (MessageObject) this.f$3);
                break;
            case 11:
                ((MediaController) this.f$0).lambda$prepareResumedRecording$24((File) this.f$1, (TLRPC.TL_document) this.f$2, (MediaDataController.DraftVoice) this.f$3);
                break;
            case 12:
                ((MediaController) this.f$0).lambda$generateWaveform$38((String) this.f$1, (byte[]) this.f$2, (MessageObject) this.f$3);
                break;
            case 13:
                ((MediaDataController) this.f$0).lambda$loadSavedReactions$239((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (SharedPreferences) this.f$3);
                break;
            case 14:
                ((MediaDataController) this.f$0).lambda$getEmojiSuggestions$219((String[]) this.f$1, (MediaDataController.KeywordResultCallback) this.f$2, (ArrayList) this.f$3);
                break;
            case 15:
                MediaDataController.lambda$getEmojiSuggestions$222((CountDownLatch) this.f$0, (MediaDataController.KeywordResultCallback) this.f$2, (ArrayList) this.f$3, (String) this.f$1);
                break;
            case 16:
                MediaDataController.lambda$getAnimatedEmojiByKeywords$216((String) this.f$1, (ArrayList) this.f$0, (ArrayList) this.f$2, (Utilities.Callback) this.f$3);
                break;
            case 17:
                ((MediaDataController) this.f$0).lambda$getEmojiNames$218((String[]) this.f$2, (String) this.f$1, (Utilities.Callback) this.f$3);
                break;
            case 18:
                ((MediaDataController) this.f$0).lambda$fillWithAnimatedEmoji$227((boolean[]) this.f$1, (ArrayList[]) this.f$2, (MessagesController$$ExternalSyntheticLambda69) this.f$3);
                break;
            case 19:
                ((MessagesController) this.f$0).lambda$setUserAdminRole$106((TLRPC.TL_error) this.f$1, (BaseFragment) this.f$2, (TLRPC.TL_messages_editChatAdmin) this.f$3);
                break;
            case 20:
                ((MessagesController) this.f$0).lambda$createChat$259((TLRPC.TL_error) this.f$1, (BaseFragment) this.f$2, (TLRPC.TL_channels_createChannel) this.f$3);
                break;
            case 21:
                ((MessagesController) this.f$0).lambda$addUsersToChannel$272((TLRPC.TL_error) this.f$1, (BaseFragment) this.f$2, (TLRPC.TL_channels_inviteToChannel) this.f$3);
                break;
            case 22:
                ((MessagesController) this.f$0).lambda$createChat$256((TLRPC.TL_error) this.f$1, (BaseFragment) this.f$2, (TLRPC.TL_messages_createChat) this.f$3);
                break;
            case 23:
                ((MessagesController) this.f$0).lambda$completeDialogsReset$211((TLRPC.messages_Dialogs) this.f$1, (androidx.collection.LongSparseArray) this.f$2, (androidx.collection.LongSparseArray) this.f$3);
                break;
            case 24:
                ((MessagesController) this.f$0).lambda$getDifference$356((ArrayList) this.f$1, (TLRPC.updates_Difference) this.f$2, (androidx.collection.LongSparseArray) this.f$3);
                break;
            case 25:
                ((MessagesController) this.f$0).lambda$getDifference$357((TLRPC.updates_Difference) this.f$1, (androidx.collection.LongSparseArray) this.f$2, (androidx.collection.LongSparseArray) this.f$3);
                break;
            case 26:
                ((MessagesStorage) this.f$0).lambda$putEncryptedChat$178((TLRPC.EncryptedChat) this.f$1, (TLRPC.User) this.f$2, (TLRPC.Dialog) this.f$3);
                break;
            case 27:
                ((MessagesStorage) this.f$0).lambda$addRecentLocalFile$82((TLRPC.Document) this.f$3, (String) this.f$1, (String) this.f$2);
                break;
            case 28:
                ((MessagesStorage) this.f$0).lambda$markMessagesAsRead$219((LongSparseIntArray) this.f$1, (LongSparseIntArray) this.f$2, (SparseIntArray) this.f$3);
                break;
            default:
                ((SavedMessagesController) this.f$0).lambda$loadDialogs$2((TLObject) this.f$1, (ArrayList) this.f$2, (TLRPC.TL_error) this.f$3);
                break;
        }
    }

    public ImageLoader$$ExternalSyntheticLambda10(String str, String str2, SpannableString spannableString, Utilities.Callback callback) {
        this.$r8$classId = 5;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$0 = spannableString;
        this.f$3 = callback;
    }

    public ImageLoader$$ExternalSyntheticLambda10(String str, ArrayList arrayList, ArrayList arrayList2, Utilities.Callback callback) {
        this.$r8$classId = 16;
        this.f$1 = str;
        this.f$0 = arrayList;
        this.f$2 = arrayList2;
        this.f$3 = callback;
    }

    public ImageLoader$$ExternalSyntheticLambda10(CountDownLatch countDownLatch, MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str) {
        this.$r8$classId = 15;
        this.f$0 = countDownLatch;
        this.f$2 = keywordResultCallback;
        this.f$3 = arrayList;
        this.f$1 = str;
    }

    public ImageLoader$$ExternalSyntheticLambda10(BaseController baseController, Object obj, String str, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = baseController;
        this.f$2 = obj;
        this.f$1 = str;
        this.f$3 = obj2;
    }

    public ImageLoader$$ExternalSyntheticLambda10(MessagesStorage messagesStorage, TLRPC.Document document, String str, String str2) {
        this.$r8$classId = 27;
        this.f$0 = messagesStorage;
        this.f$3 = document;
        this.f$1 = str;
        this.f$2 = str2;
    }
}
