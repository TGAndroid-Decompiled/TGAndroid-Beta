package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.Pair;
import com.google.android.exoplayer2.util.Consumer;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;

public final class FileLoader$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public FileLoader$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((FileLoader) this.f$0).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f$1, (String) this.f$2);
                break;
            case 1:
                ((BirthdayController) this.f$0).lambda$new$0((BirthdayController.TL_birthdays) this.f$1, (ArrayList) this.f$2);
                break;
            case 2:
                ((ImageLoader.AnonymousClass5) this.f$0).lambda$fileLoadProgressChanged$7((String) this.f$2, (FileLoadOperation) this.f$1);
                break;
            case 3:
                ((ImageLoader.CacheOutTask) this.f$0).lambda$onPostExecute$0((Drawable) this.f$1, (String) this.f$2);
                break;
            case 4:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f$0).lambda$run$0((TLRPC.TL_error) this.f$1, (TLRPC.TL_messages_startHistoryImport) this.f$2);
                break;
            case 5:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f$0).lambda$run$0((TLObject) this.f$1, (Runnable) this.f$2);
                break;
            case 6:
                ((TranslateController) this.f$0).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f$1, (TranslateController.StoryKey) this.f$2);
                break;
            case 7:
                ((BetaUpdaterController) this.f$0).lambda$checkForUpdate$1((String) this.f$2, (Runnable) this.f$1);
                break;
            case 8:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.f$0, (AtomicInteger) this.f$1, (MediaController$$ExternalSyntheticLambda44) this.f$2);
                break;
            case 9:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f$0, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f$1, (TL_update.TL_updateSentPhoneCode) this.f$2);
                break;
            case 10:
                ((CacheFetcher) this.f$0).lambda$saveCallback$2((Pair) this.f$1, (Utilities.Callback) this.f$2);
                break;
            case 11:
                ChannelBoostsController.lambda$getBoostsStats$0((TLObject) this.f$0, (Consumer) this.f$1, (TLRPC.TL_error) this.f$2);
                break;
            case 12:
                ChatThemeController.lambda$saveWallpaperPatternBitmap$12((File) this.f$0, (List) this.f$1, (Bitmap) this.f$2);
                break;
            case 13:
                CodeHighlighting.lambda$highlightEditable$0((ArrayList) this.f$0, (SpannableString) this.f$1, (Utilities.Callback) this.f$2);
                break;
            case 14:
                ((ContactsController) this.f$0).lambda$addContact$51((TLRPC.Updates) this.f$1, (TLRPC.User) this.f$2);
                break;
            case 15:
                ((ContactsController) this.f$0).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f$1, (Vector) this.f$2);
                break;
            case 16:
                ((ContactsController) this.f$0).lambda$applyContactsUpdates$48((ArrayList) this.f$1, (ArrayList) this.f$2);
                break;
            case 17:
                ((DispatchQueuePoolBackground) this.f$0).lambda$execute$1((Runnable) this.f$1, (DispatchQueue) this.f$2);
                break;
            case 18:
                ((DownloadController) this.f$0).lambda$loadDownloadingFiles$10((ArrayList) this.f$1, (ArrayList) this.f$2);
                break;
            case 19:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f$0, (ArrayList) this.f$1, (Utilities.Callback) this.f$2);
                break;
            case 20:
                ((FileLoadOperation) this.f$0).lambda$getCurrentFile$3((File[]) this.f$1, (CountDownLatch) this.f$2);
                break;
            case 21:
                FileLoadOperation.lambda$cancelRequests$15((FileLoadOperation.RequestInfo) this.f$0, (int[]) this.f$1, (Runnable) this.f$2);
                break;
            case 22:
                ((FileLoader) this.f$0).lambda$checkDownloadQueue$15((FileLoaderPriorityQueue) this.f$1, (FileLoadOperation) this.f$2);
                break;
            case 23:
                ((FilePathDatabase) this.f$0).lambda$saveFileDialogId$5((File) this.f$1, (FilePathDatabase.FileMeta) this.f$2);
                break;
            case 24:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f$0, (int[]) this.f$1, (Runnable) this.f$2);
                break;
            case 25:
                ((LocationController) this.f$0).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f$1, (LocationController.SharingLocationInfo) this.f$2);
                break;
            case 26:
                ((MediaDataController) this.f$0).lambda$processLoadedDiceStickers$88((String) this.f$2, (TLRPC.TL_messages_stickerSet) this.f$1);
                break;
            case 27:
                ((MediaDataController) this.f$0).lambda$putEmojiKeywords$215((TLRPC.TL_emojiKeywordsDifference) this.f$1, (String) this.f$2);
                break;
            case 28:
                ((MediaDataController) this.f$0).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.f$1, (String) this.f$2);
                break;
            default:
                ((MediaDataController) this.f$0).lambda$clearBotKeyboard$193((ArrayList) this.f$1, (MessagesStorage.TopicKey) this.f$2);
                break;
        }
    }

    public FileLoader$$ExternalSyntheticLambda0(Object obj, String str, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = str;
        this.f$1 = obj2;
    }
}
