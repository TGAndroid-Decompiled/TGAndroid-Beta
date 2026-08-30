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
public final class sk implements Runnable {
    public final int f18434a;
    public final Object f18435b;
    public final Object f18436c;
    public final Object d;
    public final Object e;

    public sk(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18434a = i10;
        this.d = obj;
        this.f18436c = obj2;
        this.e = obj3;
        this.f18435b = obj4;
    }

    @Override
    public final void run() {
        switch (this.f18434a) {
            case 0:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass1) this.d).lambda$run$0((TLObject) this.f18436c, (TLRPC.TL_messages_initHistoryImport) this.e, (TLRPC.TL_error) this.f18435b);
                return;
            case 1:
                ((SendMessagesHelper.ImportingStickers.AnonymousClass1) this.d).lambda$run$0((TLRPC.TL_error) this.f18435b, (TLRPC.TL_stickers_createStickerSet) this.e, (TLObject) this.f18436c);
                return;
            case 2:
                ((TranslateController) this.d).lambda$detectPhotoLanguage$41((MessageObject) this.f18436c, (TranslateController.MessageKey) this.e, (Utilities.Callback) this.f18435b);
                return;
            case 3:
                ((TranslateController) this.d).lambda$detectStoryLanguage$31((TL_stories.StoryItem) this.f18436c, (String) this.e, (TranslateController.StoryKey) this.f18435b);
                return;
            case 4:
                CodeHighlighting.lambda$highlightEditable$1((String) this.d, (String) this.f18436c, (SpannableString) this.e, (Utilities.Callback) this.f18435b);
                return;
            case 5:
                ((FilePathDatabase) this.d).lambda$lookupFiles$7((ArrayList) this.f18436c, (LongSparseArray) this.e, (CountDownLatch) this.f18435b);
                return;
            case 6:
                ((FilePathDatabase) this.d).lambda$checkMediaExistance$2((ArrayList) this.f18436c, (long[]) this.e, (CountDownLatch) this.f18435b);
                return;
            case 7:
                ((FileRefController) this.d).lambda$requestReferenceFromServer$0((String) this.f18436c, (String) this.e, (nh.c6) this.f18435b);
                return;
            case 8:
                ((ImageLoader) this.d).lambda$replaceImageInCache$5((String) this.f18436c, (String) this.e, (ImageLocation) this.f18435b);
                return;
            case 9:
                ((LocationController) this.d).lambda$loadSharingLocations$16((ArrayList) this.f18436c, (ArrayList) this.e, (ArrayList) this.f18435b);
                return;
            case 10:
                ((MediaController) this.d).lambda$generateWaveform$39((String) this.f18436c, (String) this.e, (MessageObject) this.f18435b);
                return;
            case 11:
                ((MediaController) this.d).lambda$prepareResumedRecording$24((File) this.f18436c, (TLRPC.TL_document) this.e, (MediaDataController.DraftVoice) this.f18435b);
                return;
            case 12:
                ((MediaController) this.d).lambda$generateWaveform$38((String) this.f18436c, (byte[]) this.e, (MessageObject) this.f18435b);
                return;
            case 13:
                ((MediaDataController) this.d).lambda$loadSavedReactions$239((TLRPC.TL_error) this.f18435b, (TLObject) this.f18436c, (SharedPreferences) this.e);
                return;
            case 14:
                ((MediaDataController) this.d).lambda$getEmojiSuggestions$219((String[]) this.f18436c, (MediaDataController.KeywordResultCallback) this.e, (ArrayList) this.f18435b);
                return;
            case 15:
                MediaDataController.lambda$getEmojiSuggestions$222((CountDownLatch) this.d, (MediaDataController.KeywordResultCallback) this.f18436c, (ArrayList) this.e, (String) this.f18435b);
                return;
            case 16:
                MediaDataController.lambda$getAnimatedEmojiByKeywords$216((String) this.d, (ArrayList) this.f18436c, (ArrayList) this.e, (Utilities.Callback) this.f18435b);
                return;
            case 17:
                ((MediaDataController) this.d).lambda$getEmojiNames$218((String[]) this.f18436c, (String) this.e, (Utilities.Callback) this.f18435b);
                return;
            case 18:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$227((boolean[]) this.f18436c, (ArrayList[]) this.e, (x6) this.f18435b);
                return;
            case 19:
                ((MessagesController) this.d).lambda$setUserAdminRole$106((TLRPC.TL_error) this.f18435b, (org.telegram.ui.ActionBar.p2) this.f18436c, (TLRPC.TL_messages_editChatAdmin) this.e);
                return;
            case 20:
                ((MessagesController) this.d).lambda$createChat$259((TLRPC.TL_error) this.f18435b, (org.telegram.ui.ActionBar.p2) this.f18436c, (TLRPC.TL_channels_createChannel) this.e);
                return;
            case 21:
                ((MessagesController) this.d).lambda$addUsersToChannel$272((TLRPC.TL_error) this.f18435b, (org.telegram.ui.ActionBar.p2) this.f18436c, (TLRPC.TL_channels_inviteToChannel) this.e);
                return;
            case 22:
                ((MessagesController) this.d).lambda$createChat$256((TLRPC.TL_error) this.f18435b, (org.telegram.ui.ActionBar.p2) this.f18436c, (TLRPC.TL_messages_createChat) this.e);
                return;
            case 23:
                ((MessagesController) this.d).lambda$completeDialogsReset$211((TLRPC.messages_Dialogs) this.f18436c, (a0.h) this.e, (a0.h) this.f18435b);
                return;
            case 24:
                ((MessagesController) this.d).lambda$getDifference$356((ArrayList) this.f18436c, (TLRPC.updates_Difference) this.e, (a0.h) this.f18435b);
                return;
            case 25:
                ((MessagesController) this.d).lambda$getDifference$357((TLRPC.updates_Difference) this.f18436c, (a0.h) this.e, (a0.h) this.f18435b);
                return;
            case 26:
                ((MessagesStorage) this.d).lambda$putEncryptedChat$178((TLRPC.EncryptedChat) this.f18436c, (TLRPC.User) this.e, (TLRPC.Dialog) this.f18435b);
                return;
            case 27:
                ((MessagesStorage) this.d).lambda$addRecentLocalFile$82((TLRPC.Document) this.f18436c, (String) this.e, (String) this.f18435b);
                return;
            case 28:
                ((MessagesStorage) this.d).lambda$markMessagesAsRead$219((LongSparseIntArray) this.f18436c, (LongSparseIntArray) this.e, (SparseIntArray) this.f18435b);
                return;
            default:
                ((SavedMessagesController) this.d).lambda$loadDialogs$2((TLObject) this.f18436c, (ArrayList) this.e, (TLRPC.TL_error) this.f18435b);
                return;
        }
    }

    public sk(BaseController baseController, TLRPC.TL_error tL_error, Object obj, Object obj2, int i10) {
        this.f18434a = i10;
        this.d = baseController;
        this.f18435b = tL_error;
        this.f18436c = obj;
        this.e = obj2;
    }

    public sk(SendMessagesHelper.ImportingStickers.AnonymousClass1 anonymousClass1, TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
        this.f18434a = 1;
        this.d = anonymousClass1;
        this.f18435b = tL_error;
        this.e = tL_stickers_createStickerSet;
        this.f18436c = tLObject;
    }
}
