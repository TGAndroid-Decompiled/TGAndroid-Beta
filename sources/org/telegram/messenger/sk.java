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
public final class sk implements Runnable {
    public final int f20027a;
    public final Object f20028b;
    public final Object f20029c;
    public final Object d;
    public final Object f20030e;

    public sk(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20027a = i10;
        this.d = obj;
        this.f20029c = obj2;
        this.f20030e = obj3;
        this.f20028b = obj4;
    }

    @Override
    public final void run() {
        switch (this.f20027a) {
            case 0:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass1) this.d).lambda$run$0((TLObject) this.f20029c, (TLRPC.TL_messages_initHistoryImport) this.f20030e, (TLRPC.TL_error) this.f20028b);
                return;
            case 1:
                ((SendMessagesHelper.ImportingStickers.AnonymousClass1) this.d).lambda$run$0((TLRPC.TL_error) this.f20028b, (TLRPC.TL_stickers_createStickerSet) this.f20030e, (TLObject) this.f20029c);
                return;
            case 2:
                ((TranslateController) this.d).lambda$detectPhotoLanguage$41((MessageObject) this.f20029c, (TranslateController.MessageKey) this.f20030e, (Utilities.Callback) this.f20028b);
                return;
            case 3:
                ((TranslateController) this.d).lambda$detectStoryLanguage$31((TL_stories.StoryItem) this.f20029c, (String) this.f20030e, (TranslateController.StoryKey) this.f20028b);
                return;
            case 4:
                AndroidUtilities.lambda$showProxyAlert$21((boolean[]) this.d, (org.telegram.ui.Components.sc[]) this.f20029c, (sf.a) this.f20030e, (Activity) this.f20028b);
                return;
            case 5:
                CodeHighlighting.lambda$highlightEditable$1((String) this.d, (String) this.f20029c, (SpannableString) this.f20030e, (Utilities.Callback) this.f20028b);
                return;
            case 6:
                ((FilePathDatabase) this.d).lambda$lookupFiles$7((ArrayList) this.f20029c, (LongSparseArray) this.f20030e, (CountDownLatch) this.f20028b);
                return;
            case 7:
                ((FilePathDatabase) this.d).lambda$checkMediaExistance$2((ArrayList) this.f20029c, (long[]) this.f20030e, (CountDownLatch) this.f20028b);
                return;
            case 8:
                ((FileRefController) this.d).lambda$requestReferenceFromServer$0((String) this.f20029c, (String) this.f20030e, (oh.c6) this.f20028b);
                return;
            case 9:
                ((ImageLoader) this.d).lambda$replaceImageInCache$5((String) this.f20029c, (String) this.f20030e, (ImageLocation) this.f20028b);
                return;
            case 10:
                ((LocationController) this.d).lambda$loadSharingLocations$16((ArrayList) this.f20029c, (ArrayList) this.f20030e, (ArrayList) this.f20028b);
                return;
            case 11:
                ((MediaController) this.d).lambda$generateWaveform$39((String) this.f20029c, (String) this.f20030e, (MessageObject) this.f20028b);
                return;
            case 12:
                ((MediaController) this.d).lambda$prepareResumedRecording$24((File) this.f20029c, (TLRPC.TL_document) this.f20030e, (MediaDataController.DraftVoice) this.f20028b);
                return;
            case 13:
                ((MediaController) this.d).lambda$generateWaveform$38((String) this.f20029c, (byte[]) this.f20030e, (MessageObject) this.f20028b);
                return;
            case 14:
                ((MediaDataController) this.d).lambda$loadSavedReactions$239((TLRPC.TL_error) this.f20028b, (TLObject) this.f20029c, (SharedPreferences) this.f20030e);
                return;
            case 15:
                ((MediaDataController) this.d).lambda$getEmojiSuggestions$219((String[]) this.f20029c, (MediaDataController.KeywordResultCallback) this.f20030e, (ArrayList) this.f20028b);
                return;
            case 16:
                MediaDataController.lambda$getEmojiSuggestions$222((CountDownLatch) this.d, (MediaDataController.KeywordResultCallback) this.f20029c, (ArrayList) this.f20030e, (String) this.f20028b);
                return;
            case 17:
                MediaDataController.lambda$getAnimatedEmojiByKeywords$216((String) this.d, (ArrayList) this.f20029c, (ArrayList) this.f20030e, (Utilities.Callback) this.f20028b);
                return;
            case 18:
                ((MediaDataController) this.d).lambda$getEmojiNames$218((String[]) this.f20029c, (String) this.f20030e, (Utilities.Callback) this.f20028b);
                return;
            case 19:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$227((boolean[]) this.f20029c, (ArrayList[]) this.f20030e, (x6) this.f20028b);
                return;
            case 20:
                ((MessagesController) this.d).lambda$setUserAdminRole$106((TLRPC.TL_error) this.f20028b, (org.telegram.ui.ActionBar.p2) this.f20029c, (TLRPC.TL_messages_editChatAdmin) this.f20030e);
                return;
            case 21:
                ((MessagesController) this.d).lambda$createChat$259((TLRPC.TL_error) this.f20028b, (org.telegram.ui.ActionBar.p2) this.f20029c, (TLRPC.TL_channels_createChannel) this.f20030e);
                return;
            case 22:
                ((MessagesController) this.d).lambda$addUsersToChannel$272((TLRPC.TL_error) this.f20028b, (org.telegram.ui.ActionBar.p2) this.f20029c, (TLRPC.TL_channels_inviteToChannel) this.f20030e);
                return;
            case 23:
                ((MessagesController) this.d).lambda$createChat$256((TLRPC.TL_error) this.f20028b, (org.telegram.ui.ActionBar.p2) this.f20029c, (TLRPC.TL_messages_createChat) this.f20030e);
                return;
            case 24:
                ((MessagesController) this.d).lambda$completeDialogsReset$211((TLRPC.messages_Dialogs) this.f20029c, (a0.h) this.f20030e, (a0.h) this.f20028b);
                return;
            case 25:
                ((MessagesController) this.d).lambda$getDifference$356((ArrayList) this.f20029c, (TLRPC.updates_Difference) this.f20030e, (a0.h) this.f20028b);
                return;
            case 26:
                ((MessagesController) this.d).lambda$getDifference$357((TLRPC.updates_Difference) this.f20029c, (a0.h) this.f20030e, (a0.h) this.f20028b);
                return;
            case 27:
                ((MessagesStorage) this.d).lambda$putEncryptedChat$178((TLRPC.EncryptedChat) this.f20029c, (TLRPC.User) this.f20030e, (TLRPC.Dialog) this.f20028b);
                return;
            case 28:
                ((MessagesStorage) this.d).lambda$addRecentLocalFile$82((TLRPC.Document) this.f20029c, (String) this.f20030e, (String) this.f20028b);
                return;
            default:
                ((MessagesStorage) this.d).lambda$markMessagesAsRead$219((LongSparseIntArray) this.f20029c, (LongSparseIntArray) this.f20030e, (SparseIntArray) this.f20028b);
                return;
        }
    }

    public sk(BaseController baseController, TLRPC.TL_error tL_error, Object obj, Object obj2, int i10) {
        this.f20027a = i10;
        this.d = baseController;
        this.f20028b = tL_error;
        this.f20029c = obj;
        this.f20030e = obj2;
    }

    public sk(SendMessagesHelper.ImportingStickers.AnonymousClass1 anonymousClass1, TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
        this.f20027a = 1;
        this.d = anonymousClass1;
        this.f20028b = tL_error;
        this.f20030e = tL_stickers_createStickerSet;
        this.f20029c = tLObject;
    }
}
