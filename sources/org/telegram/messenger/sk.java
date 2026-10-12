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
public final class sk implements Runnable {
    public final int f18433a;
    public final Object f18434b;
    public final Object f18435c;
    public final Object d;
    public final Object e;

    public sk(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18433a = i10;
        this.d = obj;
        this.f18435c = obj2;
        this.e = obj3;
        this.f18434b = obj4;
    }

    @Override
    public final void run() {
        switch (this.f18433a) {
            case 0:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass1) this.d).lambda$run$0((TLObject) this.f18435c, (TLRPC.TL_messages_initHistoryImport) this.e, (TLRPC.TL_error) this.f18434b);
                return;
            case 1:
                ((SendMessagesHelper.ImportingStickers.AnonymousClass1) this.d).lambda$run$0((TLRPC.TL_error) this.f18434b, (TLRPC.TL_stickers_createStickerSet) this.e, (TLObject) this.f18435c);
                return;
            case 2:
                ((TranslateController) this.d).lambda$detectPhotoLanguage$41((MessageObject) this.f18435c, (TranslateController.MessageKey) this.e, (Utilities.Callback) this.f18434b);
                return;
            case 3:
                ((TranslateController) this.d).lambda$detectStoryLanguage$31((TL_stories.StoryItem) this.f18435c, (String) this.e, (TranslateController.StoryKey) this.f18434b);
                return;
            case 4:
                AndroidUtilities.lambda$showProxyAlert$21((boolean[]) this.d, (org.telegram.ui.Components.bd[]) this.f18435c, (qi.a) this.e, (Activity) this.f18434b);
                return;
            case 5:
                ((FilePathDatabase) this.d).lambda$lookupFiles$7((ArrayList) this.f18435c, (LongSparseArray) this.e, (CountDownLatch) this.f18434b);
                return;
            case 6:
                ((FilePathDatabase) this.d).lambda$checkMediaExistance$2((ArrayList) this.f18435c, (long[]) this.e, (CountDownLatch) this.f18434b);
                return;
            case 7:
                ((FileRefController) this.d).lambda$requestReferenceFromServer$0((String) this.f18435c, (String) this.e, (bi.e8) this.f18434b);
                return;
            case 8:
                ((ImageLoader) this.d).lambda$replaceImageInCache$5((String) this.f18435c, (String) this.e, (ImageLocation) this.f18434b);
                return;
            case 9:
                ((LocationController) this.d).lambda$loadSharingLocations$16((ArrayList) this.f18435c, (ArrayList) this.e, (ArrayList) this.f18434b);
                return;
            case 10:
                ((MediaController) this.d).lambda$generateWaveform$40((String) this.f18435c, (String) this.e, (MessageObject) this.f18434b);
                return;
            case 11:
                ((MediaController) this.d).lambda$prepareResumedRecording$25((File) this.f18435c, (TLRPC.TL_document) this.e, (MediaDataController.DraftVoice) this.f18434b);
                return;
            case 12:
                ((MediaController) this.d).lambda$generateWaveform$39((String) this.f18435c, (byte[]) this.e, (MessageObject) this.f18434b);
                return;
            case 13:
                ((MediaDataController) this.d).lambda$getEmojiSuggestions$220((String[]) this.f18435c, (MediaDataController.KeywordResultCallback) this.e, (ArrayList) this.f18434b);
                return;
            case 14:
                MediaDataController.lambda$getEmojiSuggestions$223((CountDownLatch) this.d, (MediaDataController.KeywordResultCallback) this.f18435c, (ArrayList) this.e, (String) this.f18434b);
                return;
            case 15:
                MediaDataController.lambda$getAnimatedEmojiByKeywords$217((String) this.d, (ArrayList) this.f18435c, (ArrayList) this.e, (Utilities.Callback) this.f18434b);
                return;
            case 16:
                ((MediaDataController) this.d).lambda$getEmojiNames$219((String[]) this.f18435c, (String) this.e, (Utilities.Callback) this.f18434b);
                return;
            case 17:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$228((boolean[]) this.f18435c, (ArrayList[]) this.e, (x6) this.f18434b);
                return;
            case 18:
                ((MediaDataController) this.d).lambda$loadSavedReactions$240((TLRPC.TL_error) this.f18434b, (TLObject) this.f18435c, (SharedPreferences) this.e);
                return;
            case 19:
                ((MessagesController) this.d).lambda$addUsersToChannel$271((TLRPC.TL_error) this.f18434b, (org.telegram.ui.ActionBar.m2) this.f18435c, (TLRPC.TL_channels_inviteToChannel) this.e);
                return;
            case 20:
                ((MessagesController) this.d).lambda$getDifference$356((TLRPC.updates_Difference) this.f18435c, (a0.h) this.e, (a0.h) this.f18434b);
                return;
            case 21:
                ((MessagesController) this.d).lambda$createChat$255((TLRPC.TL_error) this.f18434b, (org.telegram.ui.ActionBar.m2) this.f18435c, (TLRPC.TL_messages_createChat) this.e);
                return;
            case 22:
                ((MessagesController) this.d).lambda$createChat$258((TLRPC.TL_error) this.f18434b, (org.telegram.ui.ActionBar.m2) this.f18435c, (TLRPC.TL_channels_createChannel) this.e);
                return;
            case 23:
                ((MessagesController) this.d).lambda$setUserAdminRole$105((TLRPC.TL_error) this.f18434b, (org.telegram.ui.ActionBar.m2) this.f18435c, (TLRPC.TL_messages_editChatAdmin) this.e);
                return;
            case 24:
                ((MessagesController) this.d).lambda$completeDialogsReset$210((TLRPC.messages_Dialogs) this.f18435c, (a0.h) this.e, (a0.h) this.f18434b);
                return;
            case 25:
                ((MessagesController) this.d).lambda$getDifference$355((ArrayList) this.f18435c, (TLRPC.updates_Difference) this.e, (a0.h) this.f18434b);
                return;
            case 26:
                ((MessagesStorage) this.d).lambda$putEncryptedChat$178((TLRPC.EncryptedChat) this.f18435c, (TLRPC.User) this.e, (TLRPC.Dialog) this.f18434b);
                return;
            case 27:
                ((MessagesStorage) this.d).lambda$addRecentLocalFile$82((TLRPC.Document) this.f18435c, (String) this.e, (String) this.f18434b);
                return;
            case 28:
                ((MessagesStorage) this.d).lambda$markMessagesAsRead$219((LongSparseIntArray) this.f18435c, (LongSparseIntArray) this.e, (SparseIntArray) this.f18434b);
                return;
            default:
                ((SavedMessagesController) this.d).lambda$loadDialogs$2((TLObject) this.f18435c, (ArrayList) this.e, (TLRPC.TL_error) this.f18434b);
                return;
        }
    }

    public sk(BaseController baseController, TLRPC.TL_error tL_error, Object obj, Object obj2, int i10) {
        this.f18433a = i10;
        this.d = baseController;
        this.f18434b = tL_error;
        this.f18435c = obj;
        this.e = obj2;
    }

    public sk(SendMessagesHelper.ImportingStickers.AnonymousClass1 anonymousClass1, TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
        this.f18433a = 1;
        this.d = anonymousClass1;
        this.f18434b = tL_error;
        this.e = tL_stickers_createStickerSet;
        this.f18435c = tLObject;
    }
}
