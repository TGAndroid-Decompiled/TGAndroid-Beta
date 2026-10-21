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
public final class nk implements Runnable {
    public final int f19085a;
    public final Object f19086b;
    public final Object f19087c;
    public final Object d;
    public final Object e;

    public nk(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19085a = i10;
        this.d = obj;
        this.f19087c = obj2;
        this.e = obj3;
        this.f19086b = obj4;
    }

    @Override
    public final void run() {
        switch (this.f19085a) {
            case 0:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass1) this.d).lambda$run$0((TLObject) this.f19087c, (TLRPC.TL_messages_initHistoryImport) this.e, (TLRPC.TL_error) this.f19086b);
                return;
            case 1:
                ((SendMessagesHelper.ImportingStickers.AnonymousClass1) this.d).lambda$run$0((TLRPC.TL_error) this.f19086b, (TLRPC.TL_stickers_createStickerSet) this.e, (TLObject) this.f19087c);
                return;
            case 2:
                ((TranslateController) this.d).lambda$detectPhotoLanguage$41((MessageObject) this.f19087c, (TranslateController.MessageKey) this.e, (Utilities.Callback) this.f19086b);
                return;
            case 3:
                ((TranslateController) this.d).lambda$detectStoryLanguage$31((TL_stories.StoryItem) this.f19087c, (String) this.e, (TranslateController.StoryKey) this.f19086b);
                return;
            case 4:
                AndroidUtilities.lambda$showProxyAlert$21((boolean[]) this.d, (org.telegram.ui.Components.zc[]) this.f19087c, (qi.a) this.e, (Activity) this.f19086b);
                return;
            case 5:
                ((FilePathDatabase) this.d).lambda$lookupFiles$7((ArrayList) this.f19087c, (LongSparseArray) this.e, (CountDownLatch) this.f19086b);
                return;
            case 6:
                ((FilePathDatabase) this.d).lambda$checkMediaExistance$2((ArrayList) this.f19087c, (long[]) this.e, (CountDownLatch) this.f19086b);
                return;
            case 7:
                ((FileRefController) this.d).lambda$requestReferenceFromServer$0((String) this.f19087c, (String) this.e, (ci.s6) this.f19086b);
                return;
            case 8:
                ((ImageLoader) this.d).lambda$replaceImageInCache$5((String) this.f19087c, (String) this.e, (ImageLocation) this.f19086b);
                return;
            case 9:
                ((LocationController) this.d).lambda$loadSharingLocations$16((ArrayList) this.f19087c, (ArrayList) this.e, (ArrayList) this.f19086b);
                return;
            case 10:
                ((MediaController) this.d).lambda$generateWaveform$40((String) this.f19087c, (String) this.e, (MessageObject) this.f19086b);
                return;
            case 11:
                ((MediaController) this.d).lambda$generateWaveform$39((String) this.f19087c, (byte[]) this.e, (MessageObject) this.f19086b);
                return;
            case 12:
                ((MediaDataController) this.d).lambda$getEmojiSuggestions$220((String[]) this.f19087c, (MediaDataController.KeywordResultCallback) this.e, (ArrayList) this.f19086b);
                return;
            case 13:
                MediaDataController.lambda$getEmojiSuggestions$223((CountDownLatch) this.d, (MediaDataController.KeywordResultCallback) this.f19087c, (ArrayList) this.e, (String) this.f19086b);
                return;
            case 14:
                MediaDataController.lambda$getAnimatedEmojiByKeywords$217((String) this.d, (ArrayList) this.f19087c, (ArrayList) this.e, (Utilities.Callback) this.f19086b);
                return;
            case 15:
                ((MediaDataController) this.d).lambda$getEmojiNames$219((String[]) this.f19087c, (String) this.e, (Utilities.Callback) this.f19086b);
                return;
            case 16:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$228((boolean[]) this.f19087c, (ArrayList[]) this.e, (y6) this.f19086b);
                return;
            case 17:
                ((MediaDataController) this.d).lambda$loadSavedReactions$240((TLRPC.TL_error) this.f19086b, (TLObject) this.f19087c, (SharedPreferences) this.e);
                return;
            case 18:
                ((MessagesController) this.d).lambda$addUsersToChannel$271((TLRPC.TL_error) this.f19086b, (org.telegram.ui.ActionBar.n2) this.f19087c, (TLRPC.TL_channels_inviteToChannel) this.e);
                return;
            case 19:
                ((MessagesController) this.d).lambda$getDifference$356((TLRPC.updates_Difference) this.f19087c, (a0.h) this.e, (a0.h) this.f19086b);
                return;
            case 20:
                ((MessagesController) this.d).lambda$createChat$255((TLRPC.TL_error) this.f19086b, (org.telegram.ui.ActionBar.n2) this.f19087c, (TLRPC.TL_messages_createChat) this.e);
                return;
            case 21:
                ((MessagesController) this.d).lambda$createChat$258((TLRPC.TL_error) this.f19086b, (org.telegram.ui.ActionBar.n2) this.f19087c, (TLRPC.TL_channels_createChannel) this.e);
                return;
            case 22:
                ((MessagesController) this.d).lambda$setUserAdminRole$105((TLRPC.TL_error) this.f19086b, (org.telegram.ui.ActionBar.n2) this.f19087c, (TLRPC.TL_messages_editChatAdmin) this.e);
                return;
            case 23:
                ((MessagesController) this.d).lambda$completeDialogsReset$210((TLRPC.messages_Dialogs) this.f19087c, (a0.h) this.e, (a0.h) this.f19086b);
                return;
            case 24:
                ((MessagesController) this.d).lambda$getDifference$355((ArrayList) this.f19087c, (TLRPC.updates_Difference) this.e, (a0.h) this.f19086b);
                return;
            case 25:
                ((MessagesStorage) this.d).lambda$putEncryptedChat$178((TLRPC.EncryptedChat) this.f19087c, (TLRPC.User) this.e, (TLRPC.Dialog) this.f19086b);
                return;
            case 26:
                ((MessagesStorage) this.d).lambda$addRecentLocalFile$82((TLRPC.Document) this.f19087c, (String) this.e, (String) this.f19086b);
                return;
            case 27:
                ((MessagesStorage) this.d).lambda$markMessagesAsRead$219((LongSparseIntArray) this.f19087c, (LongSparseIntArray) this.e, (SparseIntArray) this.f19086b);
                return;
            case 28:
                ((SavedMessagesController) this.d).lambda$loadDialogs$2((TLObject) this.f19087c, (ArrayList) this.e, (TLRPC.TL_error) this.f19086b);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$performSendDelayedMessage$60((TLObject) this.f19087c, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f19086b);
                return;
        }
    }

    public nk(BaseController baseController, TLRPC.TL_error tL_error, Object obj, Object obj2, int i10) {
        this.f19085a = i10;
        this.d = baseController;
        this.f19086b = tL_error;
        this.f19087c = obj;
        this.e = obj2;
    }

    public nk(SendMessagesHelper.ImportingStickers.AnonymousClass1 anonymousClass1, TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
        this.f19085a = 1;
        this.d = anonymousClass1;
        this.f19086b = tL_error;
        this.e = tL_stickers_createStickerSet;
        this.f19087c = tLObject;
    }
}
