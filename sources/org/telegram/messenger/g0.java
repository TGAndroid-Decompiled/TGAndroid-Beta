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
    public final int f18459a;
    public final Object f18460b;
    public final Object f18461c;
    public final Object d;

    public g0(Object obj, Object obj2, Object obj3, int i10) {
        this.f18459a = i10;
        this.f18460b = obj;
        this.f18461c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18459a) {
            case 0:
                BirthdayController.c((BirthdayController) this.f18460b, (BirthdayController.TL_birthdays) this.f18461c, (ArrayList) this.d);
                return;
            case 1:
                ((ImageLoader.AnonymousClass5) this.f18460b).lambda$fileLoadProgressChanged$7((String) this.f18461c, (FileLoadOperation) this.d);
                return;
            case 2:
                ((ImageLoader.CacheOutTask) this.f18460b).lambda$onPostExecute$0((Drawable) this.f18461c, (String) this.d);
                return;
            case 3:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f18460b).lambda$run$0((TLRPC.TL_error) this.f18461c, (TLRPC.TL_messages_startHistoryImport) this.d);
                return;
            case 4:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f18460b).lambda$run$0((TLObject) this.f18461c, (Runnable) this.d);
                return;
            case 5:
                ((TelegramMediaSession.SessionCallback) this.f18460b).lambda$onPlayFromMediaId$1((String) this.f18461c, (Bundle) this.d);
                return;
            case 6:
                ((TranslateController) this.f18460b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f18461c, (TranslateController.StoryKey) this.d);
                return;
            case 7:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f18460b, (org.telegram.ui.Components.xc[]) this.f18461c, (qi.a) this.d);
                return;
            case 8:
                ((BetaUpdaterController) this.f18460b).lambda$checkForUpdate$1((String) this.f18461c, (Runnable) this.d);
                return;
            case 9:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.f18460b, (b0) this.f18461c);
                return;
            case 10:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f18460b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f18461c, (TL_update.TL_updateSentPhoneCode) this.d);
                return;
            case 11:
                CacheFetcher.a((CacheFetcher) this.f18460b, (Pair) this.f18461c, (Utilities.Callback) this.d);
                return;
            case 12:
                ChannelBoostsController.a((Utilities.Callback) this.f18461c, (TLObject) this.f18460b, (TLRPC.TL_error) this.d);
                return;
            case 13:
                ChatThemeController.lambda$saveWallpaperPatternBitmap$12((File) this.f18460b, (List) this.f18461c, (Bitmap) this.d);
                return;
            case 14:
                ((ContactsController) this.f18460b).lambda$addContact$51((TLRPC.Updates) this.f18461c, (TLRPC.User) this.d);
                return;
            case 15:
                ((ContactsController) this.f18460b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f18461c, (Vector) this.d);
                return;
            case 16:
                ((ContactsController) this.f18460b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.f18461c);
                return;
            case 17:
                ((DispatchQueuePoolBackground) this.f18460b).lambda$execute$1((Runnable) this.f18461c, (DispatchQueue) this.d);
                return;
            case 18:
                ((DownloadController) this.f18460b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.f18461c);
                return;
            case 19:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f18460b, (ArrayList) this.d, (Utilities.Callback) this.f18461c);
                return;
            case 20:
                ((FileLoadOperation) this.f18460b).lambda$getCurrentFile$4((File[]) this.f18461c, (CountDownLatch) this.d);
                return;
            case 21:
                FileLoadOperation.lambda$cancelRequests$16((FileLoadOperation.RequestInfo) this.f18460b, (int[]) this.f18461c, (Runnable) this.d);
                return;
            case 22:
                ((FileLoader) this.f18460b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f18461c, (String) this.d);
                return;
            case 23:
                ((FileLoader) this.f18460b).lambda$startVideoStream$15((TLRPC.Document) this.f18461c, this.d);
                return;
            case 24:
                ((FileLoader) this.f18460b).lambda$checkDownloadQueue$17((FileLoaderPriorityQueue) this.f18461c, (FileLoadOperation) this.d);
                return;
            case 25:
                ((FilePathDatabase) this.f18460b).lambda$saveFileDialogId$5((File) this.f18461c, (FilePathDatabase.FileMeta) this.d);
                return;
            case 26:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f18460b, (int[]) this.f18461c, (Runnable) this.d);
                return;
            case 27:
                ((LocationController) this.f18460b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f18461c, (LocationController.SharingLocationInfo) this.d);
                return;
            case 28:
                ((MediaDataController) this.f18460b).lambda$saveToRingtones$204((TLObject) this.f18461c, (TLRPC.Document) this.d);
                return;
            default:
                ((MediaDataController) this.f18460b).lambda$processLoadedDiceStickers$88((String) this.f18461c, (TLRPC.TL_messages_stickerSet) this.d);
                return;
        }
    }

    public g0(ArrayList arrayList, AtomicInteger atomicInteger, b0 b0Var) {
        this.f18459a = 9;
        this.d = arrayList;
        this.f18460b = atomicInteger;
        this.f18461c = b0Var;
    }

    public g0(BaseController baseController, ArrayList arrayList, Object obj, int i10) {
        this.f18459a = i10;
        this.f18460b = baseController;
        this.d = arrayList;
        this.f18461c = obj;
    }
}
