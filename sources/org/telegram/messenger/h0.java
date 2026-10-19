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
public final class h0 implements Runnable {
    public final int f18484a;
    public final Object f18485b;
    public final Object f18486c;
    public final Object d;

    public h0(Object obj, Object obj2, Object obj3, int i10) {
        this.f18484a = i10;
        this.f18485b = obj;
        this.f18486c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18484a) {
            case 0:
                BirthdayController.c((BirthdayController) this.f18485b, (BirthdayController.TL_birthdays) this.f18486c, (ArrayList) this.d);
                return;
            case 1:
                ((ImageLoader.AnonymousClass5) this.f18485b).lambda$fileLoadProgressChanged$7((String) this.f18486c, (FileLoadOperation) this.d);
                return;
            case 2:
                ((ImageLoader.CacheOutTask) this.f18485b).lambda$onPostExecute$0((Drawable) this.f18486c, (String) this.d);
                return;
            case 3:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f18485b).lambda$run$0((TLRPC.TL_error) this.f18486c, (TLRPC.TL_messages_startHistoryImport) this.d);
                return;
            case 4:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f18485b).lambda$run$0((TLObject) this.f18486c, (Runnable) this.d);
                return;
            case 5:
                ((TelegramMediaSession.SessionCallback) this.f18485b).lambda$onPlayFromMediaId$1((String) this.f18486c, (Bundle) this.d);
                return;
            case 6:
                ((TranslateController) this.f18485b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f18486c, (TranslateController.StoryKey) this.d);
                return;
            case 7:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f18485b, (org.telegram.ui.Components.zc[]) this.f18486c, (qi.a) this.d);
                return;
            case 8:
                ((BetaUpdaterController) this.f18485b).lambda$checkForUpdate$1((String) this.f18486c, (Runnable) this.d);
                return;
            case 9:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.f18485b, (b0) this.f18486c);
                return;
            case 10:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f18485b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f18486c, (TL_update.TL_updateSentPhoneCode) this.d);
                return;
            case 11:
                CacheFetcher.a((CacheFetcher) this.f18485b, (Pair) this.f18486c, (Utilities.Callback) this.d);
                return;
            case 12:
                ChannelBoostsController.a((Utilities.Callback) this.f18486c, (TLObject) this.f18485b, (TLRPC.TL_error) this.d);
                return;
            case 13:
                ChatThemeController.lambda$saveWallpaperPatternBitmap$12((File) this.f18485b, (List) this.f18486c, (Bitmap) this.d);
                return;
            case 14:
                ((ContactsController) this.f18485b).lambda$addContact$51((TLRPC.Updates) this.f18486c, (TLRPC.User) this.d);
                return;
            case 15:
                ((ContactsController) this.f18485b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f18486c, (Vector) this.d);
                return;
            case 16:
                ((ContactsController) this.f18485b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.f18486c);
                return;
            case 17:
                ((DispatchQueuePoolBackground) this.f18485b).lambda$execute$1((Runnable) this.f18486c, (DispatchQueue) this.d);
                return;
            case 18:
                ((DownloadController) this.f18485b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.f18486c);
                return;
            case 19:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f18485b, (ArrayList) this.d, (Utilities.Callback) this.f18486c);
                return;
            case 20:
                ((FileLoadOperation) this.f18485b).lambda$getCurrentFile$4((File[]) this.f18486c, (CountDownLatch) this.d);
                return;
            case 21:
                FileLoadOperation.lambda$cancelRequests$16((FileLoadOperation.RequestInfo) this.f18485b, (int[]) this.f18486c, (Runnable) this.d);
                return;
            case 22:
                ((FileLoader) this.f18485b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f18486c, (String) this.d);
                return;
            case 23:
                ((FileLoader) this.f18485b).lambda$checkDownloadQueue$15((FileLoaderPriorityQueue) this.f18486c, (FileLoadOperation) this.d);
                return;
            case 24:
                ((FilePathDatabase) this.f18485b).lambda$saveFileDialogId$5((File) this.f18486c, (FilePathDatabase.FileMeta) this.d);
                return;
            case 25:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f18485b, (int[]) this.f18486c, (Runnable) this.d);
                return;
            case 26:
                ((LocationController) this.f18485b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f18486c, (LocationController.SharingLocationInfo) this.d);
                return;
            case 27:
                ((MediaDataController) this.f18485b).lambda$saveToRingtones$204((TLObject) this.f18486c, (TLRPC.Document) this.d);
                return;
            default:
                ((MediaDataController) this.f18485b).lambda$processLoadedDiceStickers$88((String) this.f18486c, (TLRPC.TL_messages_stickerSet) this.d);
                return;
        }
    }

    public h0(ArrayList arrayList, AtomicInteger atomicInteger, b0 b0Var) {
        this.f18484a = 9;
        this.d = arrayList;
        this.f18485b = atomicInteger;
        this.f18486c = b0Var;
    }

    public h0(BaseController baseController, ArrayList arrayList, Object obj, int i10) {
        this.f18484a = i10;
        this.f18485b = baseController;
        this.d = arrayList;
        this.f18486c = obj;
    }
}
