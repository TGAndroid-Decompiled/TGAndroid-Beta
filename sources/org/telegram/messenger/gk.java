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
public final class gk implements Runnable {
    public final int f20419a;
    public final Object f20420b;
    public final Object f20421c;
    public final Object d;
    public final Object f20422e;

    public gk(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f20419a = i9;
        this.d = obj;
        this.f20421c = obj2;
        this.f20422e = obj3;
        this.f20420b = obj4;
    }

    @Override
    public final void run() {
        switch (this.f20419a) {
            case 0:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass1) this.d).lambda$run$0((TLObject) this.f20421c, (TLRPC.TL_messages_initHistoryImport) this.f20422e, (TLRPC.TL_error) this.f20420b);
                return;
            case 1:
                ((SendMessagesHelper.ImportingStickers.AnonymousClass1) this.d).lambda$run$0((TLRPC.TL_error) this.f20420b, (TLRPC.TL_stickers_createStickerSet) this.f20422e, (TLObject) this.f20421c);
                return;
            case 2:
                ((TranslateController) this.d).lambda$detectPhotoLanguage$41((MessageObject) this.f20421c, (TranslateController.MessageKey) this.f20422e, (Utilities.Callback) this.f20420b);
                return;
            case 3:
                ((TranslateController) this.d).lambda$detectStoryLanguage$31((TL_stories.StoryItem) this.f20421c, (String) this.f20422e, (TranslateController.StoryKey) this.f20420b);
                return;
            case 4:
                CodeHighlighting.lambda$highlightEditable$1((String) this.d, (String) this.f20421c, (SpannableString) this.f20422e, (Utilities.Callback) this.f20420b);
                return;
            case 5:
                ((FilePathDatabase) this.d).lambda$lookupFiles$7((ArrayList) this.f20421c, (LongSparseArray) this.f20422e, (CountDownLatch) this.f20420b);
                return;
            case 6:
                ((FilePathDatabase) this.d).lambda$checkMediaExistance$2((ArrayList) this.f20421c, (long[]) this.f20422e, (CountDownLatch) this.f20420b);
                return;
            case 7:
                ((FileRefController) this.d).lambda$requestReferenceFromServer$0((String) this.f20421c, (String) this.f20422e, (ih.e6) this.f20420b);
                return;
            case 8:
                ((ImageLoader) this.d).lambda$replaceImageInCache$5((String) this.f20421c, (String) this.f20422e, (ImageLocation) this.f20420b);
                return;
            case 9:
                ((LocationController) this.d).lambda$loadSharingLocations$16((ArrayList) this.f20421c, (ArrayList) this.f20422e, (ArrayList) this.f20420b);
                return;
            case 10:
                ((MediaController) this.d).lambda$generateWaveform$39((String) this.f20421c, (String) this.f20422e, (MessageObject) this.f20420b);
                return;
            case 11:
                ((MediaController) this.d).lambda$prepareResumedRecording$24((File) this.f20421c, (TLRPC.TL_document) this.f20422e, (MediaDataController.DraftVoice) this.f20420b);
                return;
            case 12:
                ((MediaController) this.d).lambda$generateWaveform$38((String) this.f20421c, (byte[]) this.f20422e, (MessageObject) this.f20420b);
                return;
            case 13:
                ((MediaDataController) this.d).lambda$loadSavedReactions$239((TLRPC.TL_error) this.f20420b, (TLObject) this.f20421c, (SharedPreferences) this.f20422e);
                return;
            case 14:
                ((MediaDataController) this.d).lambda$getEmojiSuggestions$219((String[]) this.f20421c, (MediaDataController.KeywordResultCallback) this.f20422e, (ArrayList) this.f20420b);
                return;
            case 15:
                MediaDataController.lambda$getEmojiSuggestions$222((CountDownLatch) this.d, (MediaDataController.KeywordResultCallback) this.f20421c, (ArrayList) this.f20422e, (String) this.f20420b);
                return;
            case 16:
                MediaDataController.lambda$getAnimatedEmojiByKeywords$216((String) this.d, (ArrayList) this.f20421c, (ArrayList) this.f20422e, (Utilities.Callback) this.f20420b);
                return;
            case 17:
                ((MediaDataController) this.d).lambda$getEmojiNames$218((String[]) this.f20421c, (String) this.f20422e, (Utilities.Callback) this.f20420b);
                return;
            case 18:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$227((boolean[]) this.f20421c, (ArrayList[]) this.f20422e, (s6) this.f20420b);
                return;
            case 19:
                ((MessagesController) this.d).lambda$setUserAdminRole$106((TLRPC.TL_error) this.f20420b, (org.telegram.ui.ActionBar.o2) this.f20421c, (TLRPC.TL_messages_editChatAdmin) this.f20422e);
                return;
            case 20:
                ((MessagesController) this.d).lambda$createChat$259((TLRPC.TL_error) this.f20420b, (org.telegram.ui.ActionBar.o2) this.f20421c, (TLRPC.TL_channels_createChannel) this.f20422e);
                return;
            case 21:
                ((MessagesController) this.d).lambda$addUsersToChannel$272((TLRPC.TL_error) this.f20420b, (org.telegram.ui.ActionBar.o2) this.f20421c, (TLRPC.TL_channels_inviteToChannel) this.f20422e);
                return;
            case 22:
                ((MessagesController) this.d).lambda$createChat$256((TLRPC.TL_error) this.f20420b, (org.telegram.ui.ActionBar.o2) this.f20421c, (TLRPC.TL_messages_createChat) this.f20422e);
                return;
            case 23:
                ((MessagesController) this.d).lambda$completeDialogsReset$211((TLRPC.messages_Dialogs) this.f20421c, (a0.h) this.f20422e, (a0.h) this.f20420b);
                return;
            case 24:
                ((MessagesController) this.d).lambda$getDifference$356((ArrayList) this.f20421c, (TLRPC.updates_Difference) this.f20422e, (a0.h) this.f20420b);
                return;
            case 25:
                ((MessagesController) this.d).lambda$getDifference$357((TLRPC.updates_Difference) this.f20421c, (a0.h) this.f20422e, (a0.h) this.f20420b);
                return;
            case 26:
                ((MessagesStorage) this.d).lambda$putEncryptedChat$178((TLRPC.EncryptedChat) this.f20421c, (TLRPC.User) this.f20422e, (TLRPC.Dialog) this.f20420b);
                return;
            case 27:
                ((MessagesStorage) this.d).lambda$addRecentLocalFile$82((TLRPC.Document) this.f20421c, (String) this.f20422e, (String) this.f20420b);
                return;
            case 28:
                ((MessagesStorage) this.d).lambda$markMessagesAsRead$219((LongSparseIntArray) this.f20421c, (LongSparseIntArray) this.f20422e, (SparseIntArray) this.f20420b);
                return;
            default:
                ((SavedMessagesController) this.d).lambda$loadDialogs$2((TLObject) this.f20421c, (ArrayList) this.f20422e, (TLRPC.TL_error) this.f20420b);
                return;
        }
    }

    public gk(BaseController baseController, TLRPC.TL_error tL_error, Object obj, Object obj2, int i9) {
        this.f20419a = i9;
        this.d = baseController;
        this.f20420b = tL_error;
        this.f20421c = obj;
        this.f20422e = obj2;
    }

    public gk(SendMessagesHelper.ImportingStickers.AnonymousClass1 anonymousClass1, TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
        this.f20419a = 1;
        this.d = anonymousClass1;
        this.f20420b = tL_error;
        this.f20422e = tL_stickers_createStickerSet;
        this.f20421c = tLObject;
    }
}
