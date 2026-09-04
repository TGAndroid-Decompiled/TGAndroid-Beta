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
public final class qk implements Runnable {
    public final int f18832a;
    public final Object f18833b;
    public final Object f18834c;
    public final Object d;
    public final Object f18835e;

    public qk(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18832a = i10;
        this.d = obj;
        this.f18834c = obj2;
        this.f18835e = obj3;
        this.f18833b = obj4;
    }

    @Override
    public final void run() {
        switch (this.f18832a) {
            case 0:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass1) this.d).lambda$run$0((TLObject) this.f18834c, (TLRPC.TL_messages_initHistoryImport) this.f18835e, (TLRPC.TL_error) this.f18833b);
                return;
            case 1:
                ((SendMessagesHelper.ImportingStickers.AnonymousClass1) this.d).lambda$run$0((TLRPC.TL_error) this.f18833b, (TLRPC.TL_stickers_createStickerSet) this.f18835e, (TLObject) this.f18834c);
                return;
            case 2:
                ((TranslateController) this.d).lambda$detectPhotoLanguage$41((MessageObject) this.f18834c, (TranslateController.MessageKey) this.f18835e, (Utilities.Callback) this.f18833b);
                return;
            case 3:
                ((TranslateController) this.d).lambda$detectStoryLanguage$31((TL_stories.StoryItem) this.f18834c, (String) this.f18835e, (TranslateController.StoryKey) this.f18833b);
                return;
            case 4:
                AndroidUtilities.lambda$showProxyAlert$21((boolean[]) this.d, (org.telegram.ui.Components.ad[]) this.f18834c, (fg.b) this.f18835e, (Activity) this.f18833b);
                return;
            case 5:
                CodeHighlighting.lambda$highlightEditable$1((String) this.d, (String) this.f18834c, (SpannableString) this.f18835e, (Utilities.Callback) this.f18833b);
                return;
            case 6:
                ((FilePathDatabase) this.d).lambda$lookupFiles$7((ArrayList) this.f18834c, (LongSparseArray) this.f18835e, (CountDownLatch) this.f18833b);
                return;
            case 7:
                ((FilePathDatabase) this.d).lambda$checkMediaExistance$2((ArrayList) this.f18834c, (long[]) this.f18835e, (CountDownLatch) this.f18833b);
                return;
            case 8:
                ((FileRefController) this.d).lambda$requestReferenceFromServer$0((String) this.f18834c, (String) this.f18835e, (bi.a8) this.f18833b);
                return;
            case 9:
                ((ImageLoader) this.d).lambda$replaceImageInCache$5((String) this.f18834c, (String) this.f18835e, (ImageLocation) this.f18833b);
                return;
            case 10:
                ((LocationController) this.d).lambda$loadSharingLocations$16((ArrayList) this.f18834c, (ArrayList) this.f18835e, (ArrayList) this.f18833b);
                return;
            case 11:
                ((MediaController) this.d).lambda$generateWaveform$39((String) this.f18834c, (String) this.f18835e, (MessageObject) this.f18833b);
                return;
            case 12:
                ((MediaController) this.d).lambda$prepareResumedRecording$24((File) this.f18834c, (TLRPC.TL_document) this.f18835e, (MediaDataController.DraftVoice) this.f18833b);
                return;
            case 13:
                ((MediaController) this.d).lambda$generateWaveform$38((String) this.f18834c, (byte[]) this.f18835e, (MessageObject) this.f18833b);
                return;
            case 14:
                ((MediaDataController) this.d).lambda$loadSavedReactions$239((TLRPC.TL_error) this.f18833b, (TLObject) this.f18834c, (SharedPreferences) this.f18835e);
                return;
            case 15:
                ((MediaDataController) this.d).lambda$getEmojiSuggestions$219((String[]) this.f18834c, (MediaDataController.KeywordResultCallback) this.f18835e, (ArrayList) this.f18833b);
                return;
            case 16:
                MediaDataController.lambda$getEmojiSuggestions$222((CountDownLatch) this.d, (MediaDataController.KeywordResultCallback) this.f18834c, (ArrayList) this.f18835e, (String) this.f18833b);
                return;
            case 17:
                MediaDataController.lambda$getAnimatedEmojiByKeywords$216((String) this.d, (ArrayList) this.f18834c, (ArrayList) this.f18835e, (Utilities.Callback) this.f18833b);
                return;
            case 18:
                ((MediaDataController) this.d).lambda$getEmojiNames$218((String[]) this.f18834c, (String) this.f18835e, (Utilities.Callback) this.f18833b);
                return;
            case 19:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$227((boolean[]) this.f18834c, (ArrayList[]) this.f18835e, (t6) this.f18833b);
                return;
            case 20:
                ((MessagesController) this.d).lambda$setUserAdminRole$106((TLRPC.TL_error) this.f18833b, (org.telegram.ui.ActionBar.n2) this.f18834c, (TLRPC.TL_messages_editChatAdmin) this.f18835e);
                return;
            case 21:
                ((MessagesController) this.d).lambda$createChat$259((TLRPC.TL_error) this.f18833b, (org.telegram.ui.ActionBar.n2) this.f18834c, (TLRPC.TL_channels_createChannel) this.f18835e);
                return;
            case 22:
                ((MessagesController) this.d).lambda$addUsersToChannel$272((TLRPC.TL_error) this.f18833b, (org.telegram.ui.ActionBar.n2) this.f18834c, (TLRPC.TL_channels_inviteToChannel) this.f18835e);
                return;
            case 23:
                ((MessagesController) this.d).lambda$createChat$256((TLRPC.TL_error) this.f18833b, (org.telegram.ui.ActionBar.n2) this.f18834c, (TLRPC.TL_messages_createChat) this.f18835e);
                return;
            case 24:
                ((MessagesController) this.d).lambda$completeDialogsReset$211((TLRPC.messages_Dialogs) this.f18834c, (a0.i) this.f18835e, (a0.i) this.f18833b);
                return;
            case 25:
                ((MessagesController) this.d).lambda$getDifference$356((ArrayList) this.f18834c, (TLRPC.updates_Difference) this.f18835e, (a0.i) this.f18833b);
                return;
            case 26:
                ((MessagesController) this.d).lambda$getDifference$357((TLRPC.updates_Difference) this.f18834c, (a0.i) this.f18835e, (a0.i) this.f18833b);
                return;
            case 27:
                ((MessagesStorage) this.d).lambda$putEncryptedChat$178((TLRPC.EncryptedChat) this.f18834c, (TLRPC.User) this.f18835e, (TLRPC.Dialog) this.f18833b);
                return;
            case 28:
                ((MessagesStorage) this.d).lambda$addRecentLocalFile$82((TLRPC.Document) this.f18834c, (String) this.f18835e, (String) this.f18833b);
                return;
            default:
                ((MessagesStorage) this.d).lambda$markMessagesAsRead$219((LongSparseIntArray) this.f18834c, (LongSparseIntArray) this.f18835e, (SparseIntArray) this.f18833b);
                return;
        }
    }

    public qk(BaseController baseController, TLRPC.TL_error tL_error, Object obj, Object obj2, int i10) {
        this.f18832a = i10;
        this.d = baseController;
        this.f18833b = tL_error;
        this.f18834c = obj;
        this.f18835e = obj2;
    }

    public qk(SendMessagesHelper.ImportingStickers.AnonymousClass1 anonymousClass1, TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
        this.f18832a = 1;
        this.d = anonymousClass1;
        this.f18833b = tL_error;
        this.f18835e = tL_stickers_createStickerSet;
        this.f18834c = tLObject;
    }
}
