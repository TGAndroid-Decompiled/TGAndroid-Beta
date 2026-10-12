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
public final class vk implements Runnable {
    public final int f19288a;
    public final Object f19289b;
    public final Object f19290c;
    public final Object d;
    public final Object f19291e;

    public vk(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19288a = i10;
        this.d = obj;
        this.f19290c = obj2;
        this.f19291e = obj3;
        this.f19289b = obj4;
    }

    @Override
    public final void run() {
        switch (this.f19288a) {
            case 0:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass1) this.d).lambda$run$0((TLObject) this.f19290c, (TLRPC.TL_messages_initHistoryImport) this.f19291e, (TLRPC.TL_error) this.f19289b);
                return;
            case 1:
                ((SendMessagesHelper.ImportingStickers.AnonymousClass1) this.d).lambda$run$0((TLRPC.TL_error) this.f19289b, (TLRPC.TL_stickers_createStickerSet) this.f19291e, (TLObject) this.f19290c);
                return;
            case 2:
                ((TranslateController) this.d).lambda$detectPhotoLanguage$41((MessageObject) this.f19290c, (TranslateController.MessageKey) this.f19291e, (Utilities.Callback) this.f19289b);
                return;
            case 3:
                ((TranslateController) this.d).lambda$detectStoryLanguage$31((TL_stories.StoryItem) this.f19290c, (String) this.f19291e, (TranslateController.StoryKey) this.f19289b);
                return;
            case 4:
                AndroidUtilities.lambda$showProxyAlert$21((boolean[]) this.d, (org.telegram.ui.Components.bd[]) this.f19290c, (oi.b) this.f19291e, (Activity) this.f19289b);
                return;
            case 5:
                ((FilePathDatabase) this.d).lambda$lookupFiles$7((ArrayList) this.f19290c, (LongSparseArray) this.f19291e, (CountDownLatch) this.f19289b);
                return;
            case 6:
                ((FilePathDatabase) this.d).lambda$checkMediaExistance$2((ArrayList) this.f19290c, (long[]) this.f19291e, (CountDownLatch) this.f19289b);
                return;
            case 7:
                ((FileRefController) this.d).lambda$requestReferenceFromServer$0((String) this.f19290c, (String) this.f19291e, (ai.u8) this.f19289b);
                return;
            case 8:
                ((ImageLoader) this.d).lambda$replaceImageInCache$5((String) this.f19290c, (String) this.f19291e, (ImageLocation) this.f19289b);
                return;
            case 9:
                ((LocationController) this.d).lambda$loadSharingLocations$16((ArrayList) this.f19290c, (ArrayList) this.f19291e, (ArrayList) this.f19289b);
                return;
            case 10:
                ((MediaController) this.d).lambda$generateWaveform$40((String) this.f19290c, (String) this.f19291e, (MessageObject) this.f19289b);
                return;
            case 11:
                ((MediaController) this.d).lambda$prepareResumedRecording$25((File) this.f19290c, (TLRPC.TL_document) this.f19291e, (MediaDataController.DraftVoice) this.f19289b);
                return;
            case 12:
                ((MediaController) this.d).lambda$generateWaveform$39((String) this.f19290c, (byte[]) this.f19291e, (MessageObject) this.f19289b);
                return;
            case 13:
                ((MediaDataController) this.d).lambda$getEmojiSuggestions$220((String[]) this.f19290c, (MediaDataController.KeywordResultCallback) this.f19291e, (ArrayList) this.f19289b);
                return;
            case 14:
                MediaDataController.lambda$getEmojiSuggestions$223((CountDownLatch) this.d, (MediaDataController.KeywordResultCallback) this.f19290c, (ArrayList) this.f19291e, (String) this.f19289b);
                return;
            case 15:
                MediaDataController.lambda$getAnimatedEmojiByKeywords$217((String) this.d, (ArrayList) this.f19290c, (ArrayList) this.f19291e, (Utilities.Callback) this.f19289b);
                return;
            case 16:
                ((MediaDataController) this.d).lambda$getEmojiNames$219((String[]) this.f19290c, (String) this.f19291e, (Utilities.Callback) this.f19289b);
                return;
            case 17:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$228((boolean[]) this.f19290c, (ArrayList[]) this.f19291e, (x6) this.f19289b);
                return;
            case 18:
                ((MediaDataController) this.d).lambda$loadSavedReactions$240((TLRPC.TL_error) this.f19289b, (TLObject) this.f19290c, (SharedPreferences) this.f19291e);
                return;
            case 19:
                ((MessagesController) this.d).lambda$addUsersToChannel$271((TLRPC.TL_error) this.f19289b, (org.telegram.ui.ActionBar.m2) this.f19290c, (TLRPC.TL_channels_inviteToChannel) this.f19291e);
                return;
            case 20:
                ((MessagesController) this.d).lambda$getDifference$356((TLRPC.updates_Difference) this.f19290c, (a0.i) this.f19291e, (a0.i) this.f19289b);
                return;
            case 21:
                ((MessagesController) this.d).lambda$createChat$255((TLRPC.TL_error) this.f19289b, (org.telegram.ui.ActionBar.m2) this.f19290c, (TLRPC.TL_messages_createChat) this.f19291e);
                return;
            case 22:
                ((MessagesController) this.d).lambda$createChat$258((TLRPC.TL_error) this.f19289b, (org.telegram.ui.ActionBar.m2) this.f19290c, (TLRPC.TL_channels_createChannel) this.f19291e);
                return;
            case 23:
                ((MessagesController) this.d).lambda$setUserAdminRole$105((TLRPC.TL_error) this.f19289b, (org.telegram.ui.ActionBar.m2) this.f19290c, (TLRPC.TL_messages_editChatAdmin) this.f19291e);
                return;
            case 24:
                ((MessagesController) this.d).lambda$completeDialogsReset$210((TLRPC.messages_Dialogs) this.f19290c, (a0.i) this.f19291e, (a0.i) this.f19289b);
                return;
            case 25:
                ((MessagesController) this.d).lambda$getDifference$355((ArrayList) this.f19290c, (TLRPC.updates_Difference) this.f19291e, (a0.i) this.f19289b);
                return;
            case 26:
                ((MessagesStorage) this.d).lambda$putEncryptedChat$178((TLRPC.EncryptedChat) this.f19290c, (TLRPC.User) this.f19291e, (TLRPC.Dialog) this.f19289b);
                return;
            case 27:
                ((MessagesStorage) this.d).lambda$addRecentLocalFile$82((TLRPC.Document) this.f19290c, (String) this.f19291e, (String) this.f19289b);
                return;
            case 28:
                ((MessagesStorage) this.d).lambda$markMessagesAsRead$219((LongSparseIntArray) this.f19290c, (LongSparseIntArray) this.f19291e, (SparseIntArray) this.f19289b);
                return;
            default:
                ((SavedMessagesController) this.d).lambda$loadDialogs$2((TLObject) this.f19290c, (ArrayList) this.f19291e, (TLRPC.TL_error) this.f19289b);
                return;
        }
    }

    public vk(BaseController baseController, TLRPC.TL_error tL_error, Object obj, Object obj2, int i10) {
        this.f19288a = i10;
        this.d = baseController;
        this.f19289b = tL_error;
        this.f19290c = obj;
        this.f19291e = obj2;
    }

    public vk(SendMessagesHelper.ImportingStickers.AnonymousClass1 anonymousClass1, TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
        this.f19288a = 1;
        this.d = anonymousClass1;
        this.f19289b = tL_error;
        this.f19291e = tL_stickers_createStickerSet;
        this.f19290c = tLObject;
    }
}
