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
    public final int f18929a;
    public final Object f18930b;
    public final Object f18931c;
    public final Object d;
    public final Object f18932e;

    public pk(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18929a = i10;
        this.d = obj;
        this.f18931c = obj2;
        this.f18932e = obj3;
        this.f18930b = obj4;
    }

    @Override
    public final void run() {
        switch (this.f18929a) {
            case 0:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass1) this.d).lambda$run$0((TLObject) this.f18931c, (TLRPC.TL_messages_initHistoryImport) this.f18932e, (TLRPC.TL_error) this.f18930b);
                return;
            case 1:
                ((SendMessagesHelper.ImportingStickers.AnonymousClass1) this.d).lambda$run$0((TLRPC.TL_error) this.f18930b, (TLRPC.TL_stickers_createStickerSet) this.f18932e, (TLObject) this.f18931c);
                return;
            case 2:
                ((TranslateController) this.d).lambda$detectPhotoLanguage$41((MessageObject) this.f18931c, (TranslateController.MessageKey) this.f18932e, (Utilities.Callback) this.f18930b);
                return;
            case 3:
                ((TranslateController) this.d).lambda$detectStoryLanguage$31((TL_stories.StoryItem) this.f18931c, (String) this.f18932e, (TranslateController.StoryKey) this.f18930b);
                return;
            case 4:
                AndroidUtilities.lambda$showProxyAlert$21((boolean[]) this.d, (org.telegram.ui.Components.ad[]) this.f18931c, (qi.b) this.f18932e, (Activity) this.f18930b);
                return;
            case 5:
                CodeHighlighting.lambda$highlightEditable$1((String) this.d, (String) this.f18931c, (SpannableString) this.f18932e, (Utilities.Callback) this.f18930b);
                return;
            case 6:
                ((FilePathDatabase) this.d).lambda$lookupFiles$7((ArrayList) this.f18931c, (LongSparseArray) this.f18932e, (CountDownLatch) this.f18930b);
                return;
            case 7:
                ((FilePathDatabase) this.d).lambda$checkMediaExistance$2((ArrayList) this.f18931c, (long[]) this.f18932e, (CountDownLatch) this.f18930b);
                return;
            case 8:
                ((FileRefController) this.d).lambda$requestReferenceFromServer$0((String) this.f18931c, (String) this.f18932e, (ai.t8) this.f18930b);
                return;
            case 9:
                ((ImageLoader) this.d).lambda$replaceImageInCache$5((String) this.f18931c, (String) this.f18932e, (ImageLocation) this.f18930b);
                return;
            case 10:
                ((LocationController) this.d).lambda$loadSharingLocations$16((ArrayList) this.f18931c, (ArrayList) this.f18932e, (ArrayList) this.f18930b);
                return;
            case 11:
                ((MediaController) this.d).lambda$generateWaveform$39((String) this.f18931c, (String) this.f18932e, (MessageObject) this.f18930b);
                return;
            case 12:
                ((MediaController) this.d).lambda$prepareResumedRecording$24((File) this.f18931c, (TLRPC.TL_document) this.f18932e, (MediaDataController.DraftVoice) this.f18930b);
                return;
            case 13:
                ((MediaController) this.d).lambda$generateWaveform$38((String) this.f18931c, (byte[]) this.f18932e, (MessageObject) this.f18930b);
                return;
            case 14:
                ((MediaDataController) this.d).lambda$getEmojiSuggestions$220((String[]) this.f18931c, (MediaDataController.KeywordResultCallback) this.f18932e, (ArrayList) this.f18930b);
                return;
            case 15:
                MediaDataController.lambda$getEmojiSuggestions$223((CountDownLatch) this.d, (MediaDataController.KeywordResultCallback) this.f18931c, (ArrayList) this.f18932e, (String) this.f18930b);
                return;
            case 16:
                MediaDataController.lambda$getAnimatedEmojiByKeywords$217((String) this.d, (ArrayList) this.f18931c, (ArrayList) this.f18932e, (Utilities.Callback) this.f18930b);
                return;
            case 17:
                ((MediaDataController) this.d).lambda$getEmojiNames$219((String[]) this.f18931c, (String) this.f18932e, (Utilities.Callback) this.f18930b);
                return;
            case 18:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$228((boolean[]) this.f18931c, (ArrayList[]) this.f18932e, (t6) this.f18930b);
                return;
            case 19:
                ((MediaDataController) this.d).lambda$loadSavedReactions$240((TLRPC.TL_error) this.f18930b, (TLObject) this.f18931c, (SharedPreferences) this.f18932e);
                return;
            case 20:
                ((MessagesController) this.d).lambda$setUserAdminRole$106((TLRPC.TL_error) this.f18930b, (org.telegram.ui.ActionBar.n2) this.f18931c, (TLRPC.TL_messages_editChatAdmin) this.f18932e);
                return;
            case 21:
                ((MessagesController) this.d).lambda$createChat$259((TLRPC.TL_error) this.f18930b, (org.telegram.ui.ActionBar.n2) this.f18931c, (TLRPC.TL_channels_createChannel) this.f18932e);
                return;
            case 22:
                ((MessagesController) this.d).lambda$addUsersToChannel$272((TLRPC.TL_error) this.f18930b, (org.telegram.ui.ActionBar.n2) this.f18931c, (TLRPC.TL_channels_inviteToChannel) this.f18932e);
                return;
            case 23:
                ((MessagesController) this.d).lambda$createChat$256((TLRPC.TL_error) this.f18930b, (org.telegram.ui.ActionBar.n2) this.f18931c, (TLRPC.TL_messages_createChat) this.f18932e);
                return;
            case 24:
                ((MessagesController) this.d).lambda$completeDialogsReset$211((TLRPC.messages_Dialogs) this.f18931c, (a0.i) this.f18932e, (a0.i) this.f18930b);
                return;
            case 25:
                ((MessagesController) this.d).lambda$getDifference$356((ArrayList) this.f18931c, (TLRPC.updates_Difference) this.f18932e, (a0.i) this.f18930b);
                return;
            case 26:
                ((MessagesController) this.d).lambda$getDifference$357((TLRPC.updates_Difference) this.f18931c, (a0.i) this.f18932e, (a0.i) this.f18930b);
                return;
            case 27:
                ((MessagesStorage) this.d).lambda$putEncryptedChat$178((TLRPC.EncryptedChat) this.f18931c, (TLRPC.User) this.f18932e, (TLRPC.Dialog) this.f18930b);
                return;
            case 28:
                ((MessagesStorage) this.d).lambda$addRecentLocalFile$82((TLRPC.Document) this.f18931c, (String) this.f18932e, (String) this.f18930b);
                return;
            default:
                ((MessagesStorage) this.d).lambda$markMessagesAsRead$219((LongSparseIntArray) this.f18931c, (LongSparseIntArray) this.f18932e, (SparseIntArray) this.f18930b);
                return;
        }
    }

    public pk(BaseController baseController, TLRPC.TL_error tL_error, Object obj, Object obj2, int i10) {
        this.f18929a = i10;
        this.d = baseController;
        this.f18930b = tL_error;
        this.f18931c = obj;
        this.f18932e = obj2;
    }

    public pk(SendMessagesHelper.ImportingStickers.AnonymousClass1 anonymousClass1, TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
        this.f18929a = 1;
        this.d = anonymousClass1;
        this.f18930b = tL_error;
        this.f18932e = tL_stickers_createStickerSet;
        this.f18931c = tLObject;
    }
}
