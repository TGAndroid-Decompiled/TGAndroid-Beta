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
public final class f0 implements Runnable {
    public final int f16322a;
    public final Object f16323b;
    public final Object f16324c;
    public final Object d;

    public f0(Object obj, Object obj2, Object obj3, int i10) {
        this.f16322a = i10;
        this.f16323b = obj;
        this.f16324c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f16322a) {
            case 0:
                BirthdayController.c((BirthdayController) this.f16323b, (BirthdayController.TL_birthdays) this.f16324c, (ArrayList) this.d);
                return;
            case 1:
                ((ImageLoader.AnonymousClass5) this.f16323b).lambda$fileLoadProgressChanged$7((String) this.f16324c, (FileLoadOperation) this.d);
                return;
            case 2:
                ((ImageLoader.CacheOutTask) this.f16323b).lambda$onPostExecute$0((Drawable) this.f16324c, (String) this.d);
                return;
            case 3:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f16323b).lambda$run$0((TLRPC.TL_error) this.f16324c, (TLRPC.TL_messages_startHistoryImport) this.d);
                return;
            case 4:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f16323b).lambda$run$0((TLObject) this.f16324c, (Runnable) this.d);
                return;
            case 5:
                ((TelegramMediaSession.SessionCallback) this.f16323b).lambda$onPlayFromMediaId$1((String) this.f16324c, (Bundle) this.d);
                return;
            case 6:
                ((TranslateController) this.f16323b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f16324c, (TranslateController.StoryKey) this.d);
                return;
            case 7:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f16323b, (org.telegram.ui.Components.zc[]) this.f16324c, (pi.b) this.d);
                return;
            case 8:
                ((BetaUpdaterController) this.f16323b).lambda$checkForUpdate$1((String) this.f16324c, (Runnable) this.d);
                return;
            case 9:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.f16323b, (a0) this.f16324c);
                return;
            case 10:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f16323b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f16324c, (TL_update.TL_updateSentPhoneCode) this.d);
                return;
            case 11:
                CacheFetcher.a((CacheFetcher) this.f16323b, (Pair) this.f16324c, (Utilities.Callback) this.d);
                return;
            case 12:
                ChannelBoostsController.a((Utilities.Callback) this.f16324c, (TLObject) this.f16323b, (TLRPC.TL_error) this.d);
                return;
            case 13:
                ChatThemeController.e((File) this.f16323b, (List) this.f16324c, (Bitmap) this.d);
                return;
            case 14:
                CodeHighlighting.lambda$highlightEditable$0((ArrayList) this.d, (SpannableString) this.f16323b, (Utilities.Callback) this.f16324c);
                return;
            case 15:
                ((ContactsController) this.f16323b).lambda$addContact$51((TLRPC.Updates) this.f16324c, (TLRPC.User) this.d);
                return;
            case 16:
                ((ContactsController) this.f16323b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f16324c, (Vector) this.d);
                return;
            case 17:
                ((ContactsController) this.f16323b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.f16324c);
                return;
            case 18:
                ((DispatchQueuePoolBackground) this.f16323b).lambda$execute$1((Runnable) this.f16324c, (DispatchQueue) this.d);
                return;
            case 19:
                ((DownloadController) this.f16323b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.f16324c);
                return;
            case 20:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f16323b, (ArrayList) this.d, (Utilities.Callback) this.f16324c);
                return;
            case 21:
                ((FileLoadOperation) this.f16323b).lambda$getCurrentFile$3((File[]) this.f16324c, (CountDownLatch) this.d);
                return;
            case 22:
                FileLoadOperation.lambda$cancelRequests$15((FileLoadOperation.RequestInfo) this.f16323b, (int[]) this.f16324c, (Runnable) this.d);
                return;
            case 23:
                ((FileLoader) this.f16323b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f16324c, (String) this.d);
                return;
            case 24:
                ((FileLoader) this.f16323b).lambda$checkDownloadQueue$15((FileLoaderPriorityQueue) this.f16324c, (FileLoadOperation) this.d);
                return;
            case 25:
                ((FilePathDatabase) this.f16323b).lambda$saveFileDialogId$5((File) this.f16324c, (FilePathDatabase.FileMeta) this.d);
                return;
            case 26:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f16323b, (int[]) this.f16324c, (Runnable) this.d);
                return;
            case 27:
                ((LocationController) this.f16323b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f16324c, (LocationController.SharingLocationInfo) this.d);
                return;
            default:
                ((MediaDataController) this.f16323b).lambda$processLoadedDiceStickers$88((String) this.f16324c, (TLRPC.TL_messages_stickerSet) this.d);
                return;
        }
    }

    public f0(ArrayList arrayList, Object obj, Object obj2, int i10) {
        this.f16322a = i10;
        this.d = arrayList;
        this.f16323b = obj;
        this.f16324c = obj2;
    }

    public f0(BaseController baseController, ArrayList arrayList, Object obj, int i10) {
        this.f16322a = i10;
        this.f16323b = baseController;
        this.d = arrayList;
        this.f16324c = obj;
    }
}
