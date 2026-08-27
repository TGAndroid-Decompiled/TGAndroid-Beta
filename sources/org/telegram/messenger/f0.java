package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.Pair;
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

public final class f0 implements Runnable {

    public final int f20203a;

    public final Object f20204b;

    public final Object f20205c;
    public final Object d;

    public f0(Object obj, Object obj2, Object obj3, int i10) {
        this.f20203a = i10;
        this.f20204b = obj;
        this.f20205c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f20203a) {
            case 0:
                ((BirthdayController) this.f20204b).lambda$new$0((BirthdayController.TL_birthdays) this.f20205c, (ArrayList) this.d);
                break;
            case 1:
                ((ImageLoader.AnonymousClass5) this.f20204b).lambda$fileLoadProgressChanged$7((String) this.f20205c, (FileLoadOperation) this.d);
                break;
            case 2:
                ((ImageLoader.CacheOutTask) this.f20204b).lambda$onPostExecute$0((Drawable) this.f20205c, (String) this.d);
                break;
            case 3:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f20204b).lambda$run$0((TLRPC.TL_error) this.f20205c, (TLRPC.TL_messages_startHistoryImport) this.d);
                break;
            case 4:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f20204b).lambda$run$0((TLObject) this.f20205c, (Runnable) this.d);
                break;
            case 5:
                ((TranslateController) this.f20204b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f20205c, (TranslateController.StoryKey) this.d);
                break;
            case 6:
                ((BetaUpdaterController) this.f20204b).lambda$checkForUpdate$1((String) this.f20205c, (Runnable) this.d);
                break;
            case 7:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.f20204b, (b0) this.f20205c);
                break;
            case 8:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f20204b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f20205c, (TL_update.TL_updateSentPhoneCode) this.d);
                break;
            case 9:
                ((CacheFetcher) this.f20204b).lambda$saveCallback$2((Pair) this.f20205c, (Utilities.Callback) this.d);
                break;
            case 10:
                ChannelBoostsController.lambda$getBoostsStats$0((TLObject) this.f20204b, (d5.d) this.f20205c, (TLRPC.TL_error) this.d);
                break;
            case 11:
                ChatThemeController.lambda$saveWallpaperPatternBitmap$12((File) this.f20204b, (List) this.f20205c, (Bitmap) this.d);
                break;
            case 12:
                CodeHighlighting.lambda$highlightEditable$0((ArrayList) this.d, (SpannableString) this.f20204b, (Utilities.Callback) this.f20205c);
                break;
            case 13:
                ((ContactsController) this.f20204b).lambda$addContact$51((TLRPC.Updates) this.f20205c, (TLRPC.User) this.d);
                break;
            case 14:
                ((ContactsController) this.f20204b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f20205c, (Vector) this.d);
                break;
            case 15:
                ((ContactsController) this.f20204b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.f20205c);
                break;
            case 16:
                ((DispatchQueuePoolBackground) this.f20204b).lambda$execute$1((Runnable) this.f20205c, (DispatchQueue) this.d);
                break;
            case 17:
                ((DownloadController) this.f20204b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.f20205c);
                break;
            case 18:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f20204b, (ArrayList) this.d, (Utilities.Callback) this.f20205c);
                break;
            case 19:
                ((FileLoadOperation) this.f20204b).lambda$getCurrentFile$3((File[]) this.f20205c, (CountDownLatch) this.d);
                break;
            case 20:
                FileLoadOperation.lambda$cancelRequests$15((FileLoadOperation.RequestInfo) this.f20204b, (int[]) this.f20205c, (Runnable) this.d);
                break;
            case 21:
                ((FileLoader) this.f20204b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f20205c, (String) this.d);
                break;
            case 22:
                ((FileLoader) this.f20204b).lambda$checkDownloadQueue$15((FileLoaderPriorityQueue) this.f20205c, (FileLoadOperation) this.d);
                break;
            case 23:
                ((FilePathDatabase) this.f20204b).lambda$saveFileDialogId$5((File) this.f20205c, (FilePathDatabase.FileMeta) this.d);
                break;
            case 24:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f20204b, (int[]) this.f20205c, (Runnable) this.d);
                break;
            case 25:
                ((LocationController) this.f20204b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f20205c, (LocationController.SharingLocationInfo) this.d);
                break;
            case 26:
                ((MediaDataController) this.f20204b).lambda$processLoadedDiceStickers$88((String) this.f20205c, (TLRPC.TL_messages_stickerSet) this.d);
                break;
            case 27:
                ((MediaDataController) this.f20204b).lambda$putEmojiKeywords$215((TLRPC.TL_emojiKeywordsDifference) this.f20205c, (String) this.d);
                break;
            case 28:
                ((MediaDataController) this.f20204b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.f20205c, (String) this.d);
                break;
            default:
                ((MediaDataController) this.f20204b).lambda$clearBotKeyboard$193((ArrayList) this.d, (MessagesStorage.TopicKey) this.f20205c);
                break;
        }
    }

    public f0(ArrayList arrayList, Object obj, Object obj2, int i10) {
        this.f20203a = i10;
        this.d = arrayList;
        this.f20204b = obj;
        this.f20205c = obj2;
    }

    public f0(BaseController baseController, ArrayList arrayList, Object obj, int i10) {
        this.f20203a = i10;
        this.f20204b = baseController;
        this.d = arrayList;
        this.f20205c = obj;
    }
}
