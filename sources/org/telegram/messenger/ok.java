package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.SpannableString;
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
public final class ok implements Runnable {
    public final int f21201a;
    public final Object f21202b;
    public final Object f21203c;
    public final Object d;
    public final Object f21204e;

    public ok(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f21201a = i10;
        this.d = obj;
        this.f21203c = obj2;
        this.f21204e = obj3;
        this.f21202b = obj4;
    }

    @Override
    public final void run() {
        switch (this.f21201a) {
            case 0:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass1) this.d).lambda$run$0((TLObject) this.f21203c, (TLRPC.TL_messages_initHistoryImport) this.f21204e, (TLRPC.TL_error) this.f21202b);
                return;
            case 1:
                ((SendMessagesHelper.ImportingStickers.AnonymousClass1) this.d).lambda$run$0((TLRPC.TL_error) this.f21202b, (TLRPC.TL_stickers_createStickerSet) this.f21204e, (TLObject) this.f21203c);
                return;
            case 2:
                ((TranslateController) this.d).lambda$detectPhotoLanguage$41((MessageObject) this.f21203c, (TranslateController.MessageKey) this.f21204e, (Utilities.Callback) this.f21202b);
                return;
            case 3:
                ((TranslateController) this.d).lambda$detectStoryLanguage$31((TL_stories.StoryItem) this.f21203c, (String) this.f21204e, (TranslateController.StoryKey) this.f21202b);
                return;
            case 4:
                CodeHighlighting.lambda$highlightEditable$1((String) this.d, (String) this.f21203c, (SpannableString) this.f21204e, (Utilities.Callback) this.f21202b);
                return;
            case 5:
                ((FilePathDatabase) this.d).lambda$lookupFiles$7((ArrayList) this.f21203c, (LongSparseArray) this.f21204e, (CountDownLatch) this.f21202b);
                return;
            case 6:
                ((FilePathDatabase) this.d).lambda$checkMediaExistance$2((ArrayList) this.f21203c, (long[]) this.f21204e, (CountDownLatch) this.f21202b);
                return;
            case 7:
                ((FileRefController) this.d).lambda$requestReferenceFromServer$0((String) this.f21203c, (String) this.f21204e, (lh.b6) this.f21202b);
                return;
            case 8:
                ((ImageLoader) this.d).lambda$replaceImageInCache$5((String) this.f21203c, (String) this.f21204e, (ImageLocation) this.f21202b);
                return;
            case 9:
                ((LocationController) this.d).lambda$loadSharingLocations$16((ArrayList) this.f21203c, (ArrayList) this.f21204e, (ArrayList) this.f21202b);
                return;
            case 10:
                ((MediaController) this.d).lambda$generateWaveform$39((String) this.f21203c, (String) this.f21204e, (MessageObject) this.f21202b);
                return;
            case 11:
                ((MediaController) this.d).lambda$prepareResumedRecording$24((File) this.f21203c, (TLRPC.TL_document) this.f21204e, (MediaDataController.DraftVoice) this.f21202b);
                return;
            case 12:
                ((MediaController) this.d).lambda$generateWaveform$38((String) this.f21203c, (byte[]) this.f21204e, (MessageObject) this.f21202b);
                return;
            case 13:
                ((MediaDataController) this.d).lambda$loadSavedReactions$239((TLRPC.TL_error) this.f21202b, (TLObject) this.f21203c, (SharedPreferences) this.f21204e);
                return;
            case 14:
                ((MediaDataController) this.d).lambda$getEmojiSuggestions$219((String[]) this.f21203c, (MediaDataController.KeywordResultCallback) this.f21204e, (ArrayList) this.f21202b);
                return;
            case 15:
                MediaDataController.lambda$getEmojiSuggestions$222((CountDownLatch) this.d, (MediaDataController.KeywordResultCallback) this.f21203c, (ArrayList) this.f21204e, (String) this.f21202b);
                return;
            case 16:
                MediaDataController.lambda$getAnimatedEmojiByKeywords$216((String) this.d, (ArrayList) this.f21203c, (ArrayList) this.f21204e, (Utilities.Callback) this.f21202b);
                return;
            case 17:
                ((MediaDataController) this.d).lambda$getEmojiNames$218((String[]) this.f21203c, (String) this.f21204e, (Utilities.Callback) this.f21202b);
                return;
            case 18:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$227((boolean[]) this.f21203c, (ArrayList[]) this.f21204e, (w6) this.f21202b);
                return;
            case 19:
                ((MessagesController) this.d).lambda$setUserAdminRole$106((TLRPC.TL_error) this.f21202b, (org.telegram.ui.ActionBar.o2) this.f21203c, (TLRPC.TL_messages_editChatAdmin) this.f21204e);
                return;
            case 20:
                ((MessagesController) this.d).lambda$createChat$259((TLRPC.TL_error) this.f21202b, (org.telegram.ui.ActionBar.o2) this.f21203c, (TLRPC.TL_channels_createChannel) this.f21204e);
                return;
            case 21:
                ((MessagesController) this.d).lambda$addUsersToChannel$272((TLRPC.TL_error) this.f21202b, (org.telegram.ui.ActionBar.o2) this.f21203c, (TLRPC.TL_channels_inviteToChannel) this.f21204e);
                return;
            case 22:
                ((MessagesController) this.d).lambda$createChat$256((TLRPC.TL_error) this.f21202b, (org.telegram.ui.ActionBar.o2) this.f21203c, (TLRPC.TL_messages_createChat) this.f21204e);
                return;
            case 23:
                ((MessagesController) this.d).lambda$completeDialogsReset$211((TLRPC.messages_Dialogs) this.f21203c, (a0.h) this.f21204e, (a0.h) this.f21202b);
                return;
            case 24:
                ((MessagesController) this.d).lambda$getDifference$356((ArrayList) this.f21203c, (TLRPC.updates_Difference) this.f21204e, (a0.h) this.f21202b);
                return;
            case 25:
                ((MessagesController) this.d).lambda$getDifference$357((TLRPC.updates_Difference) this.f21203c, (a0.h) this.f21204e, (a0.h) this.f21202b);
                return;
            case 26:
                ((MessagesStorage) this.d).lambda$putEncryptedChat$178((TLRPC.EncryptedChat) this.f21203c, (TLRPC.User) this.f21204e, (TLRPC.Dialog) this.f21202b);
                return;
            case 27:
                ((MessagesStorage) this.d).lambda$addRecentLocalFile$82((TLRPC.Document) this.f21203c, (String) this.f21204e, (String) this.f21202b);
                return;
            case 28:
                ((MessagesStorage) this.d).lambda$markMessagesAsRead$219((LongSparseIntArray) this.f21203c, (LongSparseIntArray) this.f21204e, (SparseIntArray) this.f21202b);
                return;
            default:
                ((SavedMessagesController) this.d).lambda$loadDialogs$2((TLObject) this.f21203c, (ArrayList) this.f21204e, (TLRPC.TL_error) this.f21202b);
                return;
        }
    }

    public ok(BaseController baseController, TLRPC.TL_error tL_error, Object obj, Object obj2, int i10) {
        this.f21201a = i10;
        this.d = baseController;
        this.f21202b = tL_error;
        this.f21203c = obj;
        this.f21204e = obj2;
    }

    public ok(SendMessagesHelper.ImportingStickers.AnonymousClass1 anonymousClass1, TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
        this.f21201a = 1;
        this.d = anonymousClass1;
        this.f21202b = tL_error;
        this.f21204e = tL_stickers_createStickerSet;
        this.f21203c = tLObject;
    }
}
