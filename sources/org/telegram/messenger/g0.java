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
    public final int f17890a;
    public final Object f17891b;
    public final Object f17892c;
    public final Object d;

    public g0(Object obj, Object obj2, Object obj3, int i10) {
        this.f17890a = i10;
        this.f17891b = obj;
        this.f17892c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17890a) {
            case 0:
                BirthdayController.c((BirthdayController) this.f17891b, (BirthdayController.TL_birthdays) this.f17892c, (ArrayList) this.d);
                return;
            case 1:
                ((ImageLoader.AnonymousClass5) this.f17891b).lambda$fileLoadProgressChanged$7((String) this.f17892c, (FileLoadOperation) this.d);
                return;
            case 2:
                ((ImageLoader.CacheOutTask) this.f17891b).lambda$onPostExecute$0((Drawable) this.f17892c, (String) this.d);
                return;
            case 3:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f17891b).lambda$run$0((TLRPC.TL_error) this.f17892c, (TLRPC.TL_messages_startHistoryImport) this.d);
                return;
            case 4:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f17891b).lambda$run$0((TLObject) this.f17892c, (Runnable) this.d);
                return;
            case 5:
                ((TelegramMediaSession.SessionCallback) this.f17891b).lambda$onPlayFromMediaId$1((String) this.f17892c, (Bundle) this.d);
                return;
            case 6:
                ((TranslateController) this.f17891b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f17892c, (TranslateController.StoryKey) this.d);
                return;
            case 7:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f17891b, (org.telegram.ui.Components.cd[]) this.f17892c, (pi.b) this.d);
                return;
            case 8:
                ((BetaUpdaterController) this.f17891b).lambda$checkForUpdate$1((String) this.f17892c, (Runnable) this.d);
                return;
            case 9:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.f17891b, (b0) this.f17892c);
                return;
            case 10:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f17891b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f17892c, (TL_update.TL_updateSentPhoneCode) this.d);
                return;
            case 11:
                CacheFetcher.a((CacheFetcher) this.f17891b, (Pair) this.f17892c, (Utilities.Callback) this.d);
                return;
            case 12:
                ChannelBoostsController.a((Utilities.Callback) this.f17892c, (TLObject) this.f17891b, (TLRPC.TL_error) this.d);
                return;
            case 13:
                ChatThemeController.lambda$saveWallpaperPatternBitmap$12((File) this.f17891b, (List) this.f17892c, (Bitmap) this.d);
                return;
            case 14:
                ((ContactsController) this.f17891b).lambda$addContact$51((TLRPC.Updates) this.f17892c, (TLRPC.User) this.d);
                return;
            case 15:
                ((ContactsController) this.f17891b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f17892c, (Vector) this.d);
                return;
            case 16:
                ((ContactsController) this.f17891b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.f17892c);
                return;
            case 17:
                ((DispatchQueuePoolBackground) this.f17891b).lambda$execute$1((Runnable) this.f17892c, (DispatchQueue) this.d);
                return;
            case 18:
                ((DownloadController) this.f17891b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.f17892c);
                return;
            case 19:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f17891b, (ArrayList) this.d, (Utilities.Callback) this.f17892c);
                return;
            case 20:
                ((FileLoadOperation) this.f17891b).lambda$getCurrentFile$4((File[]) this.f17892c, (CountDownLatch) this.d);
                return;
            case 21:
                FileLoadOperation.lambda$cancelRequests$16((FileLoadOperation.RequestInfo) this.f17891b, (int[]) this.f17892c, (Runnable) this.d);
                return;
            case 22:
                ((FileLoader) this.f17891b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f17892c, (String) this.d);
                return;
            case 23:
                ((FileLoader) this.f17891b).lambda$checkDownloadQueue$15((FileLoaderPriorityQueue) this.f17892c, (FileLoadOperation) this.d);
                return;
            case 24:
                ((FilePathDatabase) this.f17891b).lambda$saveFileDialogId$5((File) this.f17892c, (FilePathDatabase.FileMeta) this.d);
                return;
            case 25:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f17891b, (int[]) this.f17892c, (Runnable) this.d);
                return;
            case 26:
                ((LocationController) this.f17891b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f17892c, (LocationController.SharingLocationInfo) this.d);
                return;
            case 27:
                ((MediaDataController) this.f17891b).lambda$saveToRingtones$204((TLObject) this.f17892c, (TLRPC.Document) this.d);
                return;
            default:
                ((MediaDataController) this.f17891b).lambda$processLoadedDiceStickers$88((String) this.f17892c, (TLRPC.TL_messages_stickerSet) this.d);
                return;
        }
    }

    public g0(ArrayList arrayList, AtomicInteger atomicInteger, b0 b0Var) {
        this.f17890a = 9;
        this.d = arrayList;
        this.f17891b = atomicInteger;
        this.f17892c = b0Var;
    }

    public g0(BaseController baseController, ArrayList arrayList, Object obj, int i10) {
        this.f17890a = i10;
        this.f17891b = baseController;
        this.d = arrayList;
        this.f17892c = obj;
    }
}
