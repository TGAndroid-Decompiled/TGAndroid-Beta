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
    public final int f17320a;
    public final Object f17321b;
    public final Object f17322c;
    public final Object d;
    public final Object e;

    public pk(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17320a = i10;
        this.d = obj;
        this.f17322c = obj2;
        this.e = obj3;
        this.f17321b = obj4;
    }

    @Override
    public final void run() {
        switch (this.f17320a) {
            case 0:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass1) this.d).lambda$run$0((TLObject) this.f17322c, (TLRPC.TL_messages_initHistoryImport) this.e, (TLRPC.TL_error) this.f17321b);
                return;
            case 1:
                ((SendMessagesHelper.ImportingStickers.AnonymousClass1) this.d).lambda$run$0((TLRPC.TL_error) this.f17321b, (TLRPC.TL_stickers_createStickerSet) this.e, (TLObject) this.f17322c);
                return;
            case 2:
                ((TranslateController) this.d).lambda$detectPhotoLanguage$41((MessageObject) this.f17322c, (TranslateController.MessageKey) this.e, (Utilities.Callback) this.f17321b);
                return;
            case 3:
                ((TranslateController) this.d).lambda$detectStoryLanguage$31((TL_stories.StoryItem) this.f17322c, (String) this.e, (TranslateController.StoryKey) this.f17321b);
                return;
            case 4:
                AndroidUtilities.lambda$showProxyAlert$21((boolean[]) this.d, (org.telegram.ui.Components.zc[]) this.f17322c, (oi.b) this.e, (Activity) this.f17321b);
                return;
            case 5:
                CodeHighlighting.lambda$highlightEditable$1((String) this.d, (String) this.f17322c, (SpannableString) this.e, (Utilities.Callback) this.f17321b);
                return;
            case 6:
                ((FilePathDatabase) this.d).lambda$lookupFiles$7((ArrayList) this.f17322c, (LongSparseArray) this.e, (CountDownLatch) this.f17321b);
                return;
            case 7:
                ((FilePathDatabase) this.d).lambda$checkMediaExistance$2((ArrayList) this.f17322c, (long[]) this.e, (CountDownLatch) this.f17321b);
                return;
            case 8:
                ((FileRefController) this.d).lambda$requestReferenceFromServer$0((String) this.f17322c, (String) this.e, (ai.s8) this.f17321b);
                return;
            case 9:
                ((ImageLoader) this.d).lambda$replaceImageInCache$5((String) this.f17322c, (String) this.e, (ImageLocation) this.f17321b);
                return;
            case 10:
                ((LocationController) this.d).lambda$loadSharingLocations$16((ArrayList) this.f17322c, (ArrayList) this.e, (ArrayList) this.f17321b);
                return;
            case 11:
                ((MediaController) this.d).lambda$generateWaveform$39((String) this.f17322c, (String) this.e, (MessageObject) this.f17321b);
                return;
            case 12:
                ((MediaController) this.d).lambda$prepareResumedRecording$24((File) this.f17322c, (TLRPC.TL_document) this.e, (MediaDataController.DraftVoice) this.f17321b);
                return;
            case 13:
                ((MediaController) this.d).lambda$generateWaveform$38((String) this.f17322c, (byte[]) this.e, (MessageObject) this.f17321b);
                return;
            case 14:
                ((MediaDataController) this.d).lambda$loadSavedReactions$239((TLRPC.TL_error) this.f17321b, (TLObject) this.f17322c, (SharedPreferences) this.e);
                return;
            case 15:
                ((MediaDataController) this.d).lambda$getEmojiSuggestions$219((String[]) this.f17322c, (MediaDataController.KeywordResultCallback) this.e, (ArrayList) this.f17321b);
                return;
            case 16:
                MediaDataController.lambda$getEmojiSuggestions$222((CountDownLatch) this.d, (MediaDataController.KeywordResultCallback) this.f17322c, (ArrayList) this.e, (String) this.f17321b);
                return;
            case 17:
                MediaDataController.lambda$getAnimatedEmojiByKeywords$216((String) this.d, (ArrayList) this.f17322c, (ArrayList) this.e, (Utilities.Callback) this.f17321b);
                return;
            case 18:
                ((MediaDataController) this.d).lambda$getEmojiNames$218((String[]) this.f17322c, (String) this.e, (Utilities.Callback) this.f17321b);
                return;
            case 19:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$227((boolean[]) this.f17322c, (ArrayList[]) this.e, (t6) this.f17321b);
                return;
            case 20:
                ((MessagesController) this.d).lambda$setUserAdminRole$106((TLRPC.TL_error) this.f17321b, (org.telegram.ui.ActionBar.n2) this.f17322c, (TLRPC.TL_messages_editChatAdmin) this.e);
                return;
            case 21:
                ((MessagesController) this.d).lambda$createChat$259((TLRPC.TL_error) this.f17321b, (org.telegram.ui.ActionBar.n2) this.f17322c, (TLRPC.TL_channels_createChannel) this.e);
                return;
            case 22:
                ((MessagesController) this.d).lambda$addUsersToChannel$272((TLRPC.TL_error) this.f17321b, (org.telegram.ui.ActionBar.n2) this.f17322c, (TLRPC.TL_channels_inviteToChannel) this.e);
                return;
            case 23:
                ((MessagesController) this.d).lambda$createChat$256((TLRPC.TL_error) this.f17321b, (org.telegram.ui.ActionBar.n2) this.f17322c, (TLRPC.TL_messages_createChat) this.e);
                return;
            case 24:
                ((MessagesController) this.d).lambda$completeDialogsReset$211((TLRPC.messages_Dialogs) this.f17322c, (a0.i) this.e, (a0.i) this.f17321b);
                return;
            case 25:
                ((MessagesController) this.d).lambda$getDifference$356((ArrayList) this.f17322c, (TLRPC.updates_Difference) this.e, (a0.i) this.f17321b);
                return;
            case 26:
                ((MessagesController) this.d).lambda$getDifference$357((TLRPC.updates_Difference) this.f17322c, (a0.i) this.e, (a0.i) this.f17321b);
                return;
            case 27:
                ((MessagesStorage) this.d).lambda$putEncryptedChat$178((TLRPC.EncryptedChat) this.f17322c, (TLRPC.User) this.e, (TLRPC.Dialog) this.f17321b);
                return;
            case 28:
                ((MessagesStorage) this.d).lambda$addRecentLocalFile$82((TLRPC.Document) this.f17322c, (String) this.e, (String) this.f17321b);
                return;
            default:
                ((MessagesStorage) this.d).lambda$markMessagesAsRead$219((LongSparseIntArray) this.f17322c, (LongSparseIntArray) this.e, (SparseIntArray) this.f17321b);
                return;
        }
    }

    public pk(BaseController baseController, TLRPC.TL_error tL_error, Object obj, Object obj2, int i10) {
        this.f17320a = i10;
        this.d = baseController;
        this.f17321b = tL_error;
        this.f17322c = obj;
        this.e = obj2;
    }

    public pk(SendMessagesHelper.ImportingStickers.AnonymousClass1 anonymousClass1, TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
        this.f17320a = 1;
        this.d = anonymousClass1;
        this.f17321b = tL_error;
        this.e = tL_stickers_createStickerSet;
        this.f17322c = tLObject;
    }
}
