package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class g0 implements Runnable {
    public final int f17926a;
    public final Object f17927b;
    public final Object f17928c;
    public final Object d;

    public g0(Object obj, Object obj2, Object obj3, int i10) {
        this.f17926a = i10;
        this.f17927b = obj;
        this.f17928c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17926a) {
            case 0:
                BirthdayController.c((BirthdayController) this.f17927b, (BirthdayController.TL_birthdays) this.f17928c, (ArrayList) this.d);
                return;
            case 1:
                ((ImageLoader.AnonymousClass5) this.f17927b).lambda$fileLoadProgressChanged$7((String) this.f17928c, (FileLoadOperation) this.d);
                return;
            case 2:
                ((ImageLoader.CacheOutTask) this.f17927b).lambda$onPostExecute$0((Drawable) this.f17928c, (String) this.d);
                return;
            case 3:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f17927b).lambda$run$0((TLRPC.TL_error) this.f17928c, (TLRPC.TL_messages_startHistoryImport) this.d);
                return;
            case 4:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f17927b).lambda$run$0((TLObject) this.f17928c, (Runnable) this.d);
                return;
            case 5:
                ((TelegramMediaSession.SessionCallback) this.f17927b).lambda$onPlayFromMediaId$1((String) this.f17928c, (Bundle) this.d);
                return;
            case 6:
                ((TranslateController) this.f17927b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f17928c, (TranslateController.StoryKey) this.d);
                return;
            case 7:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f17927b, (org.telegram.ui.Components.cd[]) this.f17928c, (pi.b) this.d);
                return;
            case 8:
                ((BetaUpdaterController) this.f17927b).lambda$checkForUpdate$1((String) this.f17928c, (Runnable) this.d);
                return;
            case 9:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.f17927b, (b0) this.f17928c);
                return;
            case 10:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f17927b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f17928c, (TL_update.TL_updateSentPhoneCode) this.d);
                return;
            case 11:
                CacheFetcher.a((CacheFetcher) this.f17927b, (Pair) this.f17928c, (Utilities.Callback) this.d);
                return;
            case 12:
                ChannelBoostsController.a((Utilities.Callback) this.f17928c, (TLObject) this.f17927b, (TLRPC.TL_error) this.d);
                return;
            case 13:
                ChatThemeController.lambda$saveWallpaperPatternBitmap$12((File) this.f17927b, (List) this.f17928c, (Bitmap) this.d);
                return;
            case 14:
                ((ContactsController) this.f17927b).lambda$addContact$51((TLRPC.Updates) this.f17928c, (TLRPC.User) this.d);
                return;
            case 15:
                ((ContactsController) this.f17927b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f17928c, (Vector) this.d);
                return;
            case 16:
                ((ContactsController) this.f17927b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.f17928c);
                return;
            case 17:
                ((DispatchQueuePoolBackground) this.f17927b).lambda$execute$1((Runnable) this.f17928c, (DispatchQueue) this.d);
                return;
            case 18:
                ((DownloadController) this.f17927b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.f17928c);
                return;
            case 19:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f17927b, (ArrayList) this.d, (Utilities.Callback) this.f17928c);
                return;
            case 20:
                ((FileLoadOperation) this.f17927b).lambda$getCurrentFile$4((File[]) this.f17928c, (CountDownLatch) this.d);
                return;
            case 21:
                FileLoadOperation.lambda$cancelRequests$16((FileLoadOperation.RequestInfo) this.f17927b, (int[]) this.f17928c, (Runnable) this.d);
                return;
            case 22:
                ((FileLoader) this.f17927b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f17928c, (String) this.d);
                return;
            case 23:
                ((FileLoader) this.f17927b).lambda$checkDownloadQueue$15((FileLoaderPriorityQueue) this.f17928c, (FileLoadOperation) this.d);
                return;
            case 24:
                ((FilePathDatabase) this.f17927b).lambda$saveFileDialogId$5((File) this.f17928c, (FilePathDatabase.FileMeta) this.d);
                return;
            case 25:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f17927b, (int[]) this.f17928c, (Runnable) this.d);
                return;
            case 26:
                ((LocationController) this.f17927b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f17928c, (LocationController.SharingLocationInfo) this.d);
                return;
            case 27:
                ((MediaDataController) this.f17927b).lambda$saveToRingtones$204((TLObject) this.f17928c, (TLRPC.Document) this.d);
                return;
            default:
                ((MediaDataController) this.f17927b).lambda$processLoadedDiceStickers$88((String) this.f17928c, (TLRPC.TL_messages_stickerSet) this.d);
                return;
        }
    }

    public g0(ArrayList arrayList, AtomicInteger atomicInteger, b0 b0Var) {
        this.f17926a = 9;
        this.d = arrayList;
        this.f17927b = atomicInteger;
        this.f17928c = b0Var;
    }

    public g0(BaseController baseController, ArrayList arrayList, Object obj, int i10) {
        this.f17926a = i10;
        this.f17927b = baseController;
        this.d = arrayList;
        this.f17928c = obj;
    }
}
