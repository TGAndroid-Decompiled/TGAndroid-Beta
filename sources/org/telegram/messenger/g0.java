package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
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
    public final int f16398a;
    public final Object f16399b;
    public final Object f16400c;
    public final Object d;

    public g0(Object obj, Object obj2, Object obj3, int i10) {
        this.f16398a = i10;
        this.f16399b = obj;
        this.f16400c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f16398a) {
            case 0:
                BirthdayController.c((BirthdayController) this.f16399b, (BirthdayController.TL_birthdays) this.f16400c, (ArrayList) this.d);
                return;
            case 1:
                ((ImageLoader.AnonymousClass5) this.f16399b).lambda$fileLoadProgressChanged$7((String) this.f16400c, (FileLoadOperation) this.d);
                return;
            case 2:
                ((ImageLoader.CacheOutTask) this.f16399b).lambda$onPostExecute$0((Drawable) this.f16400c, (String) this.d);
                return;
            case 3:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f16399b).lambda$run$0((TLRPC.TL_error) this.f16400c, (TLRPC.TL_messages_startHistoryImport) this.d);
                return;
            case 4:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f16399b).lambda$run$0((TLObject) this.f16400c, (Runnable) this.d);
                return;
            case 5:
                ((TelegramMediaSession.SessionCallback) this.f16399b).lambda$onPlayFromMediaId$1((String) this.f16400c, (Bundle) this.d);
                return;
            case 6:
                ((TranslateController) this.f16399b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f16400c, (TranslateController.StoryKey) this.d);
                return;
            case 7:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f16399b, (org.telegram.ui.Components.ad[]) this.f16400c, (oi.b) this.d);
                return;
            case 8:
                ((BetaUpdaterController) this.f16399b).lambda$checkForUpdate$1((String) this.f16400c, (Runnable) this.d);
                return;
            case 9:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.f16399b, (a0) this.f16400c);
                return;
            case 10:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f16399b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f16400c, (TL_update.TL_updateSentPhoneCode) this.d);
                return;
            case 11:
                CacheFetcher.a((CacheFetcher) this.f16399b, (Pair) this.f16400c, (Utilities.Callback) this.d);
                return;
            case 12:
                ChannelBoostsController.a((Utilities.Callback) this.f16400c, (TLObject) this.f16399b, (TLRPC.TL_error) this.d);
                return;
            case 13:
                ChatThemeController.e((File) this.f16399b, (List) this.f16400c, (Bitmap) this.d);
                return;
            case 14:
                CodeHighlighting.lambda$highlightEditable$0((ArrayList) this.d, (SpannableString) this.f16399b, (Utilities.Callback) this.f16400c);
                return;
            case 15:
                ((ContactsController) this.f16399b).lambda$addContact$51((TLRPC.Updates) this.f16400c, (TLRPC.User) this.d);
                return;
            case 16:
                ((ContactsController) this.f16399b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f16400c, (Vector) this.d);
                return;
            case 17:
                ((ContactsController) this.f16399b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.f16400c);
                return;
            case 18:
                ((DispatchQueuePoolBackground) this.f16399b).lambda$execute$1((Runnable) this.f16400c, (DispatchQueue) this.d);
                return;
            case 19:
                ((DownloadController) this.f16399b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.f16400c);
                return;
            case 20:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f16399b, (ArrayList) this.d, (Utilities.Callback) this.f16400c);
                return;
            case 21:
                ((FileLoadOperation) this.f16399b).lambda$getCurrentFile$3((File[]) this.f16400c, (CountDownLatch) this.d);
                return;
            case 22:
                FileLoadOperation.lambda$cancelRequests$15((FileLoadOperation.RequestInfo) this.f16399b, (int[]) this.f16400c, (Runnable) this.d);
                return;
            case 23:
                ((FileLoader) this.f16399b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f16400c, (String) this.d);
                return;
            case 24:
                ((FileLoader) this.f16399b).lambda$checkDownloadQueue$15((FileLoaderPriorityQueue) this.f16400c, (FileLoadOperation) this.d);
                return;
            case 25:
                ((FilePathDatabase) this.f16399b).lambda$saveFileDialogId$5((File) this.f16400c, (FilePathDatabase.FileMeta) this.d);
                return;
            case 26:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f16399b, (int[]) this.f16400c, (Runnable) this.d);
                return;
            case 27:
                ((LocationController) this.f16399b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f16400c, (LocationController.SharingLocationInfo) this.d);
                return;
            default:
                ((MediaDataController) this.f16399b).lambda$processLoadedDiceStickers$88((String) this.f16400c, (TLRPC.TL_messages_stickerSet) this.d);
                return;
        }
    }

    public g0(ArrayList arrayList, Object obj, Object obj2, int i10) {
        this.f16398a = i10;
        this.d = arrayList;
        this.f16399b = obj;
        this.f16400c = obj2;
    }

    public g0(BaseController baseController, ArrayList arrayList, Object obj, int i10) {
        this.f16398a = i10;
        this.f16399b = baseController;
        this.d = arrayList;
        this.f16400c = obj;
    }
}
