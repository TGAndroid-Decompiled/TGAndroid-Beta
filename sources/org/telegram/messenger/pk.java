package org.telegram.messenger;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class pk implements Runnable {
    public final int f18889a;
    public final Object f18890b;
    public final Object f18891c;
    public final Object d;
    public final Object f18892e;

    public pk(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18889a = i10;
        this.d = obj;
        this.f18891c = obj2;
        this.f18892e = obj3;
        this.f18890b = obj4;
    }

    @Override
    public final void run() {
        switch (this.f18889a) {
            case 0:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass1) this.d).lambda$run$0((TLObject) this.f18891c, (TLRPC.TL_messages_initHistoryImport) this.f18892e, (TLRPC.TL_error) this.f18890b);
                return;
            case 1:
                ((SendMessagesHelper.ImportingStickers.AnonymousClass1) this.d).lambda$run$0((TLRPC.TL_error) this.f18890b, (TLRPC.TL_stickers_createStickerSet) this.f18892e, (TLObject) this.f18891c);
                return;
            case 2:
                ((TranslateController) this.d).lambda$detectPhotoLanguage$41((MessageObject) this.f18891c, (TranslateController.MessageKey) this.f18892e, (Utilities.Callback) this.f18890b);
                return;
            case 3:
                ((TranslateController) this.d).lambda$detectStoryLanguage$31((TL_stories.StoryItem) this.f18891c, (String) this.f18892e, (TranslateController.StoryKey) this.f18890b);
                return;
            case 4:
                AndroidUtilities.lambda$showProxyAlert$21((boolean[]) this.d, (org.telegram.ui.Components.cd[]) this.f18891c, (pi.b) this.f18892e, (Activity) this.f18890b);
                return;
            case 5:
                ((FilePathDatabase) this.d).lambda$lookupFiles$7((ArrayList) this.f18891c, (LongSparseArray) this.f18892e, (CountDownLatch) this.f18890b);
                return;
            case 6:
                ((FilePathDatabase) this.d).lambda$checkMediaExistance$2((ArrayList) this.f18891c, (long[]) this.f18892e, (CountDownLatch) this.f18890b);
                return;
            case 7:
                ((FileRefController) this.d).lambda$requestReferenceFromServer$0((String) this.f18891c, (String) this.f18892e, (ai.u8) this.f18890b);
                return;
            case 8:
                ((ImageLoader) this.d).lambda$replaceImageInCache$5((String) this.f18891c, (String) this.f18892e, (ImageLocation) this.f18890b);
                return;
            case 9:
                ((LocationController) this.d).lambda$loadSharingLocations$16((ArrayList) this.f18891c, (ArrayList) this.f18892e, (ArrayList) this.f18890b);
                return;
            case 10:
                ((MediaController) this.d).lambda$generateWaveform$39((String) this.f18891c, (String) this.f18892e, (MessageObject) this.f18890b);
                return;
            case 11:
                ((MediaController) this.d).lambda$prepareResumedRecording$24((File) this.f18891c, (TLRPC.TL_document) this.f18892e, (MediaDataController.DraftVoice) this.f18890b);
                return;
            case 12:
                ((MediaController) this.d).lambda$generateWaveform$38((String) this.f18891c, (byte[]) this.f18892e, (MessageObject) this.f18890b);
                return;
            case 13:
                ((MediaDataController) this.d).lambda$getEmojiSuggestions$220((String[]) this.f18891c, (MediaDataController.KeywordResultCallback) this.f18892e, (ArrayList) this.f18890b);
                return;
            case 14:
                MediaDataController.lambda$getEmojiSuggestions$223((CountDownLatch) this.d, (MediaDataController.KeywordResultCallback) this.f18891c, (ArrayList) this.f18892e, (String) this.f18890b);
                return;
            case 15:
                MediaDataController.lambda$getAnimatedEmojiByKeywords$217((String) this.d, (ArrayList) this.f18891c, (ArrayList) this.f18892e, (Utilities.Callback) this.f18890b);
                return;
            case 16:
                ((MediaDataController) this.d).lambda$getEmojiNames$219((String[]) this.f18891c, (String) this.f18892e, (Utilities.Callback) this.f18890b);
                return;
            case 17:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$228((boolean[]) this.f18891c, (ArrayList[]) this.f18892e, (u6) this.f18890b);
                return;
            case 18:
                ((MediaDataController) this.d).lambda$loadSavedReactions$240((TLRPC.TL_error) this.f18890b, (TLObject) this.f18891c, (SharedPreferences) this.f18892e);
                return;
            case 19:
                ((MessagesController) this.d).lambda$addUsersToChannel$271((TLRPC.TL_error) this.f18890b, (org.telegram.ui.ActionBar.m2) this.f18891c, (TLRPC.TL_channels_inviteToChannel) this.f18892e);
                return;
            case 20:
                ((MessagesController) this.d).lambda$getDifference$356((TLRPC.updates_Difference) this.f18891c, (a0.i) this.f18892e, (a0.i) this.f18890b);
                return;
            case 21:
                ((MessagesController) this.d).lambda$createChat$255((TLRPC.TL_error) this.f18890b, (org.telegram.ui.ActionBar.m2) this.f18891c, (TLRPC.TL_messages_createChat) this.f18892e);
                return;
            case 22:
                ((MessagesController) this.d).lambda$createChat$258((TLRPC.TL_error) this.f18890b, (org.telegram.ui.ActionBar.m2) this.f18891c, (TLRPC.TL_channels_createChannel) this.f18892e);
                return;
            case 23:
                ((MessagesController) this.d).lambda$setUserAdminRole$105((TLRPC.TL_error) this.f18890b, (org.telegram.ui.ActionBar.m2) this.f18891c, (TLRPC.TL_messages_editChatAdmin) this.f18892e);
                return;
            case 24:
                ((MessagesController) this.d).lambda$completeDialogsReset$210((TLRPC.messages_Dialogs) this.f18891c, (a0.i) this.f18892e, (a0.i) this.f18890b);
                return;
            case 25:
                ((MessagesController) this.d).lambda$getDifference$355((ArrayList) this.f18891c, (TLRPC.updates_Difference) this.f18892e, (a0.i) this.f18890b);
                return;
            case 26:
                ((MessagesStorage) this.d).lambda$putEncryptedChat$178((TLRPC.EncryptedChat) this.f18891c, (TLRPC.User) this.f18892e, (TLRPC.Dialog) this.f18890b);
                return;
            case 27:
                ((MessagesStorage) this.d).lambda$addRecentLocalFile$82((TLRPC.Document) this.f18891c, (String) this.f18892e, (String) this.f18890b);
                return;
            case 28:
                ((MessagesStorage) this.d).lambda$markMessagesAsRead$219((LongSparseIntArray) this.f18891c, (LongSparseIntArray) this.f18892e, (SparseIntArray) this.f18890b);
                return;
            default:
                ((SavedMessagesController) this.d).lambda$loadDialogs$2((TLObject) this.f18891c, (ArrayList) this.f18892e, (TLRPC.TL_error) this.f18890b);
                return;
        }
    }

    public pk(BaseController baseController, TLRPC.TL_error tL_error, Object obj, Object obj2, int i10) {
        this.f18889a = i10;
        this.d = baseController;
        this.f18890b = tL_error;
        this.f18891c = obj;
        this.f18892e = obj2;
    }

    public pk(SendMessagesHelper.ImportingStickers.AnonymousClass1 anonymousClass1, TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
        this.f18889a = 1;
        this.d = anonymousClass1;
        this.f18890b = tL_error;
        this.f18892e = tL_stickers_createStickerSet;
        this.f18891c = tLObject;
    }
}
