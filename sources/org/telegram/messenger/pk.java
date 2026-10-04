package org.telegram.messenger;

import android.app.Activity;
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
public final class pk implements Runnable {
    public final int f18926a;
    public final Object f18927b;
    public final Object f18928c;
    public final Object d;
    public final Object f18929e;

    public pk(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18926a = i10;
        this.d = obj;
        this.f18928c = obj2;
        this.f18929e = obj3;
        this.f18927b = obj4;
    }

    @Override
    public final void run() {
        switch (this.f18926a) {
            case 0:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass1) this.d).lambda$run$0((TLObject) this.f18928c, (TLRPC.TL_messages_initHistoryImport) this.f18929e, (TLRPC.TL_error) this.f18927b);
                return;
            case 1:
                ((SendMessagesHelper.ImportingStickers.AnonymousClass1) this.d).lambda$run$0((TLRPC.TL_error) this.f18927b, (TLRPC.TL_stickers_createStickerSet) this.f18929e, (TLObject) this.f18928c);
                return;
            case 2:
                ((TranslateController) this.d).lambda$detectPhotoLanguage$41((MessageObject) this.f18928c, (TranslateController.MessageKey) this.f18929e, (Utilities.Callback) this.f18927b);
                return;
            case 3:
                ((TranslateController) this.d).lambda$detectStoryLanguage$31((TL_stories.StoryItem) this.f18928c, (String) this.f18929e, (TranslateController.StoryKey) this.f18927b);
                return;
            case 4:
                AndroidUtilities.lambda$showProxyAlert$21((boolean[]) this.d, (org.telegram.ui.Components.ad[]) this.f18928c, (qi.b) this.f18929e, (Activity) this.f18927b);
                return;
            case 5:
                CodeHighlighting.lambda$highlightEditable$1((String) this.d, (String) this.f18928c, (SpannableString) this.f18929e, (Utilities.Callback) this.f18927b);
                return;
            case 6:
                ((FilePathDatabase) this.d).lambda$lookupFiles$7((ArrayList) this.f18928c, (LongSparseArray) this.f18929e, (CountDownLatch) this.f18927b);
                return;
            case 7:
                ((FilePathDatabase) this.d).lambda$checkMediaExistance$2((ArrayList) this.f18928c, (long[]) this.f18929e, (CountDownLatch) this.f18927b);
                return;
            case 8:
                ((FileRefController) this.d).lambda$requestReferenceFromServer$0((String) this.f18928c, (String) this.f18929e, (ai.t8) this.f18927b);
                return;
            case 9:
                ((ImageLoader) this.d).lambda$replaceImageInCache$5((String) this.f18928c, (String) this.f18929e, (ImageLocation) this.f18927b);
                return;
            case 10:
                ((LocationController) this.d).lambda$loadSharingLocations$16((ArrayList) this.f18928c, (ArrayList) this.f18929e, (ArrayList) this.f18927b);
                return;
            case 11:
                ((MediaController) this.d).lambda$generateWaveform$39((String) this.f18928c, (String) this.f18929e, (MessageObject) this.f18927b);
                return;
            case 12:
                ((MediaController) this.d).lambda$prepareResumedRecording$24((File) this.f18928c, (TLRPC.TL_document) this.f18929e, (MediaDataController.DraftVoice) this.f18927b);
                return;
            case 13:
                ((MediaController) this.d).lambda$generateWaveform$38((String) this.f18928c, (byte[]) this.f18929e, (MessageObject) this.f18927b);
                return;
            case 14:
                ((MediaDataController) this.d).lambda$getEmojiSuggestions$220((String[]) this.f18928c, (MediaDataController.KeywordResultCallback) this.f18929e, (ArrayList) this.f18927b);
                return;
            case 15:
                MediaDataController.lambda$getEmojiSuggestions$223((CountDownLatch) this.d, (MediaDataController.KeywordResultCallback) this.f18928c, (ArrayList) this.f18929e, (String) this.f18927b);
                return;
            case 16:
                MediaDataController.lambda$getAnimatedEmojiByKeywords$217((String) this.d, (ArrayList) this.f18928c, (ArrayList) this.f18929e, (Utilities.Callback) this.f18927b);
                return;
            case 17:
                ((MediaDataController) this.d).lambda$getEmojiNames$219((String[]) this.f18928c, (String) this.f18929e, (Utilities.Callback) this.f18927b);
                return;
            case 18:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$228((boolean[]) this.f18928c, (ArrayList[]) this.f18929e, (t6) this.f18927b);
                return;
            case 19:
                ((MediaDataController) this.d).lambda$loadSavedReactions$240((TLRPC.TL_error) this.f18927b, (TLObject) this.f18928c, (SharedPreferences) this.f18929e);
                return;
            case 20:
                ((MessagesController) this.d).lambda$setUserAdminRole$106((TLRPC.TL_error) this.f18927b, (org.telegram.ui.ActionBar.n2) this.f18928c, (TLRPC.TL_messages_editChatAdmin) this.f18929e);
                return;
            case 21:
                ((MessagesController) this.d).lambda$createChat$259((TLRPC.TL_error) this.f18927b, (org.telegram.ui.ActionBar.n2) this.f18928c, (TLRPC.TL_channels_createChannel) this.f18929e);
                return;
            case 22:
                ((MessagesController) this.d).lambda$addUsersToChannel$272((TLRPC.TL_error) this.f18927b, (org.telegram.ui.ActionBar.n2) this.f18928c, (TLRPC.TL_channels_inviteToChannel) this.f18929e);
                return;
            case 23:
                ((MessagesController) this.d).lambda$createChat$256((TLRPC.TL_error) this.f18927b, (org.telegram.ui.ActionBar.n2) this.f18928c, (TLRPC.TL_messages_createChat) this.f18929e);
                return;
            case 24:
                ((MessagesController) this.d).lambda$completeDialogsReset$211((TLRPC.messages_Dialogs) this.f18928c, (a0.i) this.f18929e, (a0.i) this.f18927b);
                return;
            case 25:
                ((MessagesController) this.d).lambda$getDifference$356((ArrayList) this.f18928c, (TLRPC.updates_Difference) this.f18929e, (a0.i) this.f18927b);
                return;
            case 26:
                ((MessagesController) this.d).lambda$getDifference$357((TLRPC.updates_Difference) this.f18928c, (a0.i) this.f18929e, (a0.i) this.f18927b);
                return;
            case 27:
                ((MessagesStorage) this.d).lambda$putEncryptedChat$178((TLRPC.EncryptedChat) this.f18928c, (TLRPC.User) this.f18929e, (TLRPC.Dialog) this.f18927b);
                return;
            case 28:
                ((MessagesStorage) this.d).lambda$addRecentLocalFile$82((TLRPC.Document) this.f18928c, (String) this.f18929e, (String) this.f18927b);
                return;
            default:
                ((MessagesStorage) this.d).lambda$markMessagesAsRead$219((LongSparseIntArray) this.f18928c, (LongSparseIntArray) this.f18929e, (SparseIntArray) this.f18927b);
                return;
        }
    }

    public pk(BaseController baseController, TLRPC.TL_error tL_error, Object obj, Object obj2, int i10) {
        this.f18926a = i10;
        this.d = baseController;
        this.f18927b = tL_error;
        this.f18928c = obj;
        this.f18929e = obj2;
    }

    public pk(SendMessagesHelper.ImportingStickers.AnonymousClass1 anonymousClass1, TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
        this.f18926a = 1;
        this.d = anonymousClass1;
        this.f18927b = tL_error;
        this.f18929e = tL_stickers_createStickerSet;
        this.f18928c = tLObject;
    }
}
