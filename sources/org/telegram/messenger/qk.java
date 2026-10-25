package org.telegram.messenger;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
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
public final class qk implements Runnable {
    public final int f21079a;
    public final Object f21080b;
    public final Object f21081c;
    public final Object d;
    public final Object e;

    public qk(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f21079a = i10;
        this.d = obj;
        this.f21081c = obj2;
        this.e = obj3;
        this.f21080b = obj4;
    }

    @Override
    public final void run() {
        switch (this.f21079a) {
            case 0:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass1) this.d).lambda$run$0((TLObject) this.f21081c, (TLRPC.TL_messages_initHistoryImport) this.e, (TLRPC.TL_error) this.f21080b);
                return;
            case 1:
                ((SendMessagesHelper.ImportingStickers.AnonymousClass1) this.d).lambda$run$0((TLRPC.TL_error) this.f21080b, (TLRPC.TL_stickers_createStickerSet) this.e, (TLObject) this.f21081c);
                return;
            case 2:
                ((TranslateController) this.d).lambda$detectPhotoLanguage$41((MessageObject) this.f21081c, (TranslateController.MessageKey) this.e, (Utilities.Callback) this.f21080b);
                return;
            case 3:
                ((TranslateController) this.d).lambda$detectStoryLanguage$31((TL_stories.StoryItem) this.f21081c, (String) this.e, (TranslateController.StoryKey) this.f21080b);
                return;
            case 4:
                AndroidUtilities.lambda$showProxyAlert$21((boolean[]) this.d, (org.telegram.ui.Components.yc[]) this.f21081c, (ti.a) this.e, (Activity) this.f21080b);
                return;
            case 5:
                ((FilePathDatabase) this.d).lambda$lookupFiles$7((ArrayList) this.f21081c, (LongSparseArray) this.e, (CountDownLatch) this.f21080b);
                return;
            case 6:
                ((FilePathDatabase) this.d).lambda$checkMediaExistance$2((ArrayList) this.f21081c, (long[]) this.e, (CountDownLatch) this.f21080b);
                return;
            case 7:
                ((FileRefController) this.d).lambda$requestReferenceFromServer$0((String) this.f21081c, (String) this.e, (di.r6) this.f21080b);
                return;
            case 8:
                ((ImageLoader) this.d).lambda$replaceImageInCache$5((String) this.f21081c, (String) this.e, (ImageLocation) this.f21080b);
                return;
            case 9:
                ((LocationController) this.d).lambda$loadSharingLocations$16((ArrayList) this.f21081c, (ArrayList) this.e, (ArrayList) this.f21080b);
                return;
            case 10:
                ((MediaController) this.d).lambda$generateWaveform$41((String) this.f21081c, (byte[]) this.e, (MessageObject) this.f21080b);
                return;
            case 11:
                ((MediaController) this.d).lambda$generateWaveform$42((String) this.f21081c, (String) this.e, (MessageObject) this.f21080b);
                return;
            case 12:
                ((MediaDataController) this.d).lambda$getEmojiSuggestions$220((String[]) this.f21081c, (MediaDataController.KeywordResultCallback) this.e, (ArrayList) this.f21080b);
                return;
            case 13:
                MediaDataController.lambda$getEmojiSuggestions$223((CountDownLatch) this.d, (MediaDataController.KeywordResultCallback) this.f21081c, (ArrayList) this.e, (String) this.f21080b);
                return;
            case 14:
                MediaDataController.lambda$getAnimatedEmojiByKeywords$217((String) this.d, (ArrayList) this.f21081c, (ArrayList) this.e, (Utilities.Callback) this.f21080b);
                return;
            case 15:
                ((MediaDataController) this.d).lambda$getEmojiNames$219((String[]) this.f21081c, (String) this.e, (Utilities.Callback) this.f21080b);
                return;
            case 16:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$228((boolean[]) this.f21081c, (ArrayList[]) this.e, (c7) this.f21080b);
                return;
            case 17:
                ((MediaDataController) this.d).lambda$loadSavedReactions$240((TLRPC.TL_error) this.f21080b, (TLObject) this.f21081c, (SharedPreferences) this.e);
                return;
            case 18:
                ((MessagesController) this.d).lambda$addUsersToChannel$271((TLRPC.TL_error) this.f21080b, (org.telegram.ui.ActionBar.r2) this.f21081c, (TLRPC.TL_channels_inviteToChannel) this.e);
                return;
            case 19:
                ((MessagesController) this.d).lambda$createChat$255((TLRPC.TL_error) this.f21080b, (org.telegram.ui.ActionBar.r2) this.f21081c, (TLRPC.TL_messages_createChat) this.e);
                return;
            case 20:
                ((MessagesController) this.d).lambda$createChat$258((TLRPC.TL_error) this.f21080b, (org.telegram.ui.ActionBar.r2) this.f21081c, (TLRPC.TL_channels_createChannel) this.e);
                return;
            case 21:
                ((MessagesController) this.d).lambda$setUserAdminRole$105((TLRPC.TL_error) this.f21080b, (org.telegram.ui.ActionBar.r2) this.f21081c, (TLRPC.TL_messages_editChatAdmin) this.e);
                return;
            case 22:
                ((MessagesController) this.d).lambda$completeDialogsReset$210((TLRPC.messages_Dialogs) this.f21081c, (a0.h) this.e, (a0.h) this.f21080b);
                return;
            case 23:
                ((MessagesController) this.d).lambda$getDifference$358((TLRPC.updates_Difference) this.f21081c, (a0.h) this.e, (a0.h) this.f21080b);
                return;
            case 24:
                ((MessagesController) this.d).lambda$getDifference$357((ArrayList) this.f21081c, (TLRPC.updates_Difference) this.e, (a0.h) this.f21080b);
                return;
            case 25:
                ((MessagesStorage) this.d).lambda$putEncryptedChat$181((TLRPC.EncryptedChat) this.f21081c, (TLRPC.User) this.e, (TLRPC.Dialog) this.f21080b);
                return;
            case 26:
                ((MessagesStorage) this.d).lambda$addRecentLocalFile$85((TLRPC.Document) this.f21081c, (String) this.e, (String) this.f21080b);
                return;
            case 27:
                ((MessagesStorage) this.d).lambda$markMessagesAsRead$222((LongSparseIntArray) this.f21081c, (LongSparseIntArray) this.e, (SparseIntArray) this.f21080b);
                return;
            case 28:
                ((SavedMessagesController) this.d).lambda$loadDialogs$2((TLObject) this.f21081c, (ArrayList) this.e, (TLRPC.TL_error) this.f21080b);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$performSendDelayedMessage$60((TLObject) this.f21081c, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f21080b);
                return;
        }
    }

    public qk(BaseController baseController, TLRPC.TL_error tL_error, Object obj, Object obj2, int i10) {
        this.f21079a = i10;
        this.d = baseController;
        this.f21080b = tL_error;
        this.f21081c = obj;
        this.e = obj2;
    }

    public qk(SendMessagesHelper.ImportingStickers.AnonymousClass1 anonymousClass1, TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
        this.f21079a = 1;
        this.d = anonymousClass1;
        this.f21080b = tL_error;
        this.e = tL_stickers_createStickerSet;
        this.f21081c = tLObject;
    }
}
