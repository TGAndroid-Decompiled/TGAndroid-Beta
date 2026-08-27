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

public final class lk implements Runnable {

    public final int f20913a;

    public final Object f20914b;

    public final Object f20915c;
    public final Object d;

    public final Object f20916e;

    public lk(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20913a = i10;
        this.d = obj;
        this.f20915c = obj2;
        this.f20916e = obj3;
        this.f20914b = obj4;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f20913a) {
            case 0:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass1) this.d).lambda$run$0((TLObject) this.f20915c, (TLRPC.TL_messages_initHistoryImport) this.f20916e, (TLRPC.TL_error) this.f20914b);
                break;
            case 1:
                ((SendMessagesHelper.ImportingStickers.AnonymousClass1) this.d).lambda$run$0((TLRPC.TL_error) this.f20914b, (TLRPC.TL_stickers_createStickerSet) this.f20916e, (TLObject) this.f20915c);
                break;
            case 2:
                ((TranslateController) this.d).lambda$detectPhotoLanguage$41((MessageObject) this.f20915c, (TranslateController.MessageKey) this.f20916e, (Utilities.Callback) this.f20914b);
                break;
            case 3:
                ((TranslateController) this.d).lambda$detectStoryLanguage$31((TL_stories.StoryItem) this.f20915c, (String) this.f20916e, (TranslateController.StoryKey) this.f20914b);
                break;
            case 4:
                CodeHighlighting.lambda$highlightEditable$1((String) this.d, (String) this.f20915c, (SpannableString) this.f20916e, (Utilities.Callback) this.f20914b);
                break;
            case 5:
                ((FilePathDatabase) this.d).lambda$lookupFiles$7((ArrayList) this.f20915c, (LongSparseArray) this.f20916e, (CountDownLatch) this.f20914b);
                break;
            case 6:
                ((FilePathDatabase) this.d).lambda$checkMediaExistance$2((ArrayList) this.f20915c, (long[]) this.f20916e, (CountDownLatch) this.f20914b);
                break;
            case 7:
                ((FileRefController) this.d).lambda$requestReferenceFromServer$0((String) this.f20915c, (String) this.f20916e, (jh.a6) this.f20914b);
                break;
            case 8:
                ((ImageLoader) this.d).lambda$replaceImageInCache$5((String) this.f20915c, (String) this.f20916e, (ImageLocation) this.f20914b);
                break;
            case 9:
                ((LocationController) this.d).lambda$loadSharingLocations$16((ArrayList) this.f20915c, (ArrayList) this.f20916e, (ArrayList) this.f20914b);
                break;
            case 10:
                ((MediaController) this.d).lambda$generateWaveform$39((String) this.f20915c, (String) this.f20916e, (MessageObject) this.f20914b);
                break;
            case 11:
                ((MediaController) this.d).lambda$prepareResumedRecording$24((File) this.f20915c, (TLRPC.TL_document) this.f20916e, (MediaDataController.DraftVoice) this.f20914b);
                break;
            case 12:
                ((MediaController) this.d).lambda$generateWaveform$38((String) this.f20915c, (byte[]) this.f20916e, (MessageObject) this.f20914b);
                break;
            case 13:
                ((MediaDataController) this.d).lambda$loadSavedReactions$239((TLRPC.TL_error) this.f20914b, (TLObject) this.f20915c, (SharedPreferences) this.f20916e);
                break;
            case 14:
                ((MediaDataController) this.d).lambda$getEmojiSuggestions$219((String[]) this.f20915c, (MediaDataController.KeywordResultCallback) this.f20916e, (ArrayList) this.f20914b);
                break;
            case 15:
                MediaDataController.lambda$getEmojiSuggestions$222((CountDownLatch) this.d, (MediaDataController.KeywordResultCallback) this.f20915c, (ArrayList) this.f20916e, (String) this.f20914b);
                break;
            case 16:
                MediaDataController.lambda$getAnimatedEmojiByKeywords$216((String) this.d, (ArrayList) this.f20915c, (ArrayList) this.f20916e, (Utilities.Callback) this.f20914b);
                break;
            case 17:
                ((MediaDataController) this.d).lambda$getEmojiNames$218((String[]) this.f20915c, (String) this.f20916e, (Utilities.Callback) this.f20914b);
                break;
            case 18:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$227((boolean[]) this.f20915c, (ArrayList[]) this.f20916e, (u6) this.f20914b);
                break;
            case 19:
                ((MessagesController) this.d).lambda$setUserAdminRole$106((TLRPC.TL_error) this.f20914b, (org.telegram.ui.ActionBar.n2) this.f20915c, (TLRPC.TL_messages_editChatAdmin) this.f20916e);
                break;
            case 20:
                ((MessagesController) this.d).lambda$createChat$259((TLRPC.TL_error) this.f20914b, (org.telegram.ui.ActionBar.n2) this.f20915c, (TLRPC.TL_channels_createChannel) this.f20916e);
                break;
            case 21:
                ((MessagesController) this.d).lambda$addUsersToChannel$272((TLRPC.TL_error) this.f20914b, (org.telegram.ui.ActionBar.n2) this.f20915c, (TLRPC.TL_channels_inviteToChannel) this.f20916e);
                break;
            case 22:
                ((MessagesController) this.d).lambda$createChat$256((TLRPC.TL_error) this.f20914b, (org.telegram.ui.ActionBar.n2) this.f20915c, (TLRPC.TL_messages_createChat) this.f20916e);
                break;
            case 23:
                ((MessagesController) this.d).lambda$completeDialogsReset$211((TLRPC.messages_Dialogs) this.f20915c, (a0.h) this.f20916e, (a0.h) this.f20914b);
                break;
            case 24:
                ((MessagesController) this.d).lambda$getDifference$356((ArrayList) this.f20915c, (TLRPC.updates_Difference) this.f20916e, (a0.h) this.f20914b);
                break;
            case 25:
                ((MessagesController) this.d).lambda$getDifference$357((TLRPC.updates_Difference) this.f20915c, (a0.h) this.f20916e, (a0.h) this.f20914b);
                break;
            case 26:
                ((MessagesStorage) this.d).lambda$putEncryptedChat$178((TLRPC.EncryptedChat) this.f20915c, (TLRPC.User) this.f20916e, (TLRPC.Dialog) this.f20914b);
                break;
            case 27:
                ((MessagesStorage) this.d).lambda$addRecentLocalFile$82((TLRPC.Document) this.f20915c, (String) this.f20916e, (String) this.f20914b);
                break;
            case 28:
                ((MessagesStorage) this.d).lambda$markMessagesAsRead$219((LongSparseIntArray) this.f20915c, (LongSparseIntArray) this.f20916e, (SparseIntArray) this.f20914b);
                break;
            default:
                ((SavedMessagesController) this.d).lambda$loadDialogs$2((TLObject) this.f20915c, (ArrayList) this.f20916e, (TLRPC.TL_error) this.f20914b);
                break;
        }
    }

    public lk(BaseController baseController, TLRPC.TL_error tL_error, Object obj, Object obj2, int i10) {
        this.f20913a = i10;
        this.d = baseController;
        this.f20914b = tL_error;
        this.f20915c = obj;
        this.f20916e = obj2;
    }

    public lk(SendMessagesHelper.ImportingStickers.AnonymousClass1 anonymousClass1, TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
        this.f20913a = 1;
        this.d = anonymousClass1;
        this.f20914b = tL_error;
        this.f20916e = tL_stickers_createStickerSet;
        this.f20915c = tLObject;
    }
}
