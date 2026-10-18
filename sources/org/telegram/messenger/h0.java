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
    public final int f18488a;
    public final Object f18489b;
    public final Object f18490c;
    public final Object d;

    public h0(Object obj, Object obj2, Object obj3, int i10) {
        this.f18488a = i10;
        this.f18489b = obj;
        this.f18490c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18488a) {
            case 0:
                BirthdayController.c((BirthdayController) this.f18489b, (BirthdayController.TL_birthdays) this.f18490c, (ArrayList) this.d);
                return;
            case 1:
                ((ImageLoader.AnonymousClass5) this.f18489b).lambda$fileLoadProgressChanged$7((String) this.f18490c, (FileLoadOperation) this.d);
                return;
            case 2:
                ((ImageLoader.CacheOutTask) this.f18489b).lambda$onPostExecute$0((Drawable) this.f18490c, (String) this.d);
                return;
            case 3:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f18489b).lambda$run$0((TLRPC.TL_error) this.f18490c, (TLRPC.TL_messages_startHistoryImport) this.d);
                return;
            case 4:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f18489b).lambda$run$0((TLObject) this.f18490c, (Runnable) this.d);
                return;
            case 5:
                ((TelegramMediaSession.SessionCallback) this.f18489b).lambda$onPlayFromMediaId$1((String) this.f18490c, (Bundle) this.d);
                return;
            case 6:
                ((TranslateController) this.f18489b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f18490c, (TranslateController.StoryKey) this.d);
                return;
            case 7:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f18489b, (org.telegram.ui.Components.zc[]) this.f18490c, (qi.a) this.d);
                return;
            case 8:
                ((BetaUpdaterController) this.f18489b).lambda$checkForUpdate$1((String) this.f18490c, (Runnable) this.d);
                return;
            case 9:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.f18489b, (b0) this.f18490c);
                return;
            case 10:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f18489b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f18490c, (TL_update.TL_updateSentPhoneCode) this.d);
                return;
            case 11:
                CacheFetcher.a((CacheFetcher) this.f18489b, (Pair) this.f18490c, (Utilities.Callback) this.d);
                return;
            case 12:
                ChannelBoostsController.a((Utilities.Callback) this.f18490c, (TLObject) this.f18489b, (TLRPC.TL_error) this.d);
                return;
            case 13:
                ChatThemeController.lambda$saveWallpaperPatternBitmap$12((File) this.f18489b, (List) this.f18490c, (Bitmap) this.d);
                return;
            case 14:
                ((ContactsController) this.f18489b).lambda$addContact$51((TLRPC.Updates) this.f18490c, (TLRPC.User) this.d);
                return;
            case 15:
                ((ContactsController) this.f18489b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f18490c, (Vector) this.d);
                return;
            case 16:
                ((ContactsController) this.f18489b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.f18490c);
                return;
            case 17:
                ((DispatchQueuePoolBackground) this.f18489b).lambda$execute$1((Runnable) this.f18490c, (DispatchQueue) this.d);
                return;
            case 18:
                ((DownloadController) this.f18489b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.f18490c);
                return;
            case 19:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f18489b, (ArrayList) this.d, (Utilities.Callback) this.f18490c);
                return;
            case 20:
                ((FileLoadOperation) this.f18489b).lambda$getCurrentFile$4((File[]) this.f18490c, (CountDownLatch) this.d);
                return;
            case 21:
                FileLoadOperation.lambda$cancelRequests$16((FileLoadOperation.RequestInfo) this.f18489b, (int[]) this.f18490c, (Runnable) this.d);
                return;
            case 22:
                ((FileLoader) this.f18489b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f18490c, (String) this.d);
                return;
            case 23:
                ((FileLoader) this.f18489b).lambda$checkDownloadQueue$15((FileLoaderPriorityQueue) this.f18490c, (FileLoadOperation) this.d);
                return;
            case 24:
                ((FilePathDatabase) this.f18489b).lambda$saveFileDialogId$5((File) this.f18490c, (FilePathDatabase.FileMeta) this.d);
                return;
            case 25:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f18489b, (int[]) this.f18490c, (Runnable) this.d);
                return;
            case 26:
                ((LocationController) this.f18489b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f18490c, (LocationController.SharingLocationInfo) this.d);
                return;
            case 27:
                ((MediaDataController) this.f18489b).lambda$saveToRingtones$204((TLObject) this.f18490c, (TLRPC.Document) this.d);
                return;
            default:
                ((MediaDataController) this.f18489b).lambda$processLoadedDiceStickers$88((String) this.f18490c, (TLRPC.TL_messages_stickerSet) this.d);
                return;
        }
    }

    public h0(ArrayList arrayList, AtomicInteger atomicInteger, b0 b0Var) {
        this.f18488a = 9;
        this.d = arrayList;
        this.f18489b = atomicInteger;
        this.f18490c = b0Var;
    }

    public h0(BaseController baseController, ArrayList arrayList, Object obj, int i10) {
        this.f18488a = i10;
        this.f18489b = baseController;
        this.d = arrayList;
        this.f18490c = obj;
    }
}
