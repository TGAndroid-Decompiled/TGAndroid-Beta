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
public final class j0 implements Runnable {
    public final int f20392a;
    public final Object f20393b;
    public final Object f20394c;
    public final Object d;

    public j0(Object obj, Object obj2, Object obj3, int i10) {
        this.f20392a = i10;
        this.f20393b = obj;
        this.f20394c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f20392a) {
            case 0:
                BirthdayController.c((BirthdayController) this.f20393b, (BirthdayController.TL_birthdays) this.f20394c, (ArrayList) this.d);
                return;
            case 1:
                ((ImageLoader.AnonymousClass5) this.f20393b).lambda$fileLoadProgressChanged$7((String) this.f20394c, (FileLoadOperation) this.d);
                return;
            case 2:
                ((ImageLoader.CacheOutTask) this.f20393b).lambda$onPostExecute$0((Drawable) this.f20394c, (String) this.d);
                return;
            case 3:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f20393b).lambda$run$0((TLRPC.TL_error) this.f20394c, (TLRPC.TL_messages_startHistoryImport) this.d);
                return;
            case 4:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f20393b).lambda$run$0((TLObject) this.f20394c, (Runnable) this.d);
                return;
            case 5:
                ((TelegramMediaSession.SessionCallback) this.f20393b).lambda$onPlayFromMediaId$1((String) this.f20394c, (Bundle) this.d);
                return;
            case 6:
                ((TranslateController) this.f20393b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f20394c, (TranslateController.StoryKey) this.d);
                return;
            case 7:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f20393b, (org.telegram.ui.Components.yc[]) this.f20394c, (ti.a) this.d);
                return;
            case 8:
                ((BetaUpdaterController) this.f20393b).lambda$checkForUpdate$1((String) this.f20394c, (Runnable) this.d);
                return;
            case 9:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.f20393b, (e0) this.f20394c);
                return;
            case 10:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f20393b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f20394c, (TL_update.TL_updateSentPhoneCode) this.d);
                return;
            case 11:
                CacheFetcher.a((CacheFetcher) this.f20393b, (Pair) this.f20394c, (Utilities.Callback) this.d);
                return;
            case 12:
                ChannelBoostsController.a((Utilities.Callback) this.f20394c, (TLObject) this.f20393b, (TLRPC.TL_error) this.d);
                return;
            case 13:
                ChatThemeController.lambda$saveWallpaperPatternBitmap$12((File) this.f20393b, (List) this.f20394c, (Bitmap) this.d);
                return;
            case 14:
                ((ContactsController) this.f20393b).lambda$addContact$51((TLRPC.Updates) this.f20394c, (TLRPC.User) this.d);
                return;
            case 15:
                ((ContactsController) this.f20393b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f20394c, (Vector) this.d);
                return;
            case 16:
                ((ContactsController) this.f20393b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.f20394c);
                return;
            case 17:
                ((DispatchQueuePoolBackground) this.f20393b).lambda$execute$1((Runnable) this.f20394c, (DispatchQueue) this.d);
                return;
            case 18:
                ((DownloadController) this.f20393b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.f20394c);
                return;
            case 19:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f20393b, (ArrayList) this.d, (Utilities.Callback) this.f20394c);
                return;
            case 20:
                ((FileLoadOperation) this.f20393b).lambda$getCurrentFile$4((File[]) this.f20394c, (CountDownLatch) this.d);
                return;
            case 21:
                FileLoadOperation.lambda$cancelRequests$16((FileLoadOperation.RequestInfo) this.f20393b, (int[]) this.f20394c, (Runnable) this.d);
                return;
            case 22:
                ((FileLoader) this.f20393b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f20394c, (String) this.d);
                return;
            case 23:
                ((FileLoader) this.f20393b).lambda$startVideoStream$15((TLRPC.Document) this.f20394c, this.d);
                return;
            case 24:
                ((FileLoader) this.f20393b).lambda$checkDownloadQueue$17((FileLoaderPriorityQueue) this.f20394c, (FileLoadOperation) this.d);
                return;
            case 25:
                ((FilePathDatabase) this.f20393b).lambda$saveFileDialogId$5((File) this.f20394c, (FilePathDatabase.FileMeta) this.d);
                return;
            case 26:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f20393b, (int[]) this.f20394c, (Runnable) this.d);
                return;
            case 27:
                ((LocationController) this.f20393b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f20394c, (LocationController.SharingLocationInfo) this.d);
                return;
            case 28:
                ((MediaDataController) this.f20393b).lambda$saveToRingtones$204((TLObject) this.f20394c, (TLRPC.Document) this.d);
                return;
            default:
                ((MediaDataController) this.f20393b).lambda$processLoadedDiceStickers$88((String) this.f20394c, (TLRPC.TL_messages_stickerSet) this.d);
                return;
        }
    }

    public j0(ArrayList arrayList, AtomicInteger atomicInteger, e0 e0Var) {
        this.f20392a = 9;
        this.d = arrayList;
        this.f20393b = atomicInteger;
        this.f20394c = e0Var;
    }

    public j0(BaseController baseController, ArrayList arrayList, Object obj, int i10) {
        this.f20392a = i10;
        this.f20393b = baseController;
        this.d = arrayList;
        this.f20394c = obj;
    }
}
