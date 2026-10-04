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
    public final int f17897a;
    public final Object f17898b;
    public final Object f17899c;
    public final Object d;

    public g0(Object obj, Object obj2, Object obj3, int i10) {
        this.f17897a = i10;
        this.f17898b = obj;
        this.f17899c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17897a) {
            case 0:
                BirthdayController.c((BirthdayController) this.f17898b, (BirthdayController.TL_birthdays) this.f17899c, (ArrayList) this.d);
                return;
            case 1:
                ((ImageLoader.AnonymousClass5) this.f17898b).lambda$fileLoadProgressChanged$7((String) this.f17899c, (FileLoadOperation) this.d);
                return;
            case 2:
                ((ImageLoader.CacheOutTask) this.f17898b).lambda$onPostExecute$0((Drawable) this.f17899c, (String) this.d);
                return;
            case 3:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f17898b).lambda$run$0((TLRPC.TL_error) this.f17899c, (TLRPC.TL_messages_startHistoryImport) this.d);
                return;
            case 4:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f17898b).lambda$run$0((TLObject) this.f17899c, (Runnable) this.d);
                return;
            case 5:
                ((TelegramMediaSession.SessionCallback) this.f17898b).lambda$onPlayFromMediaId$1((String) this.f17899c, (Bundle) this.d);
                return;
            case 6:
                ((TranslateController) this.f17898b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f17899c, (TranslateController.StoryKey) this.d);
                return;
            case 7:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f17898b, (org.telegram.ui.Components.ad[]) this.f17899c, (qi.b) this.d);
                return;
            case 8:
                ((BetaUpdaterController) this.f17898b).lambda$checkForUpdate$1((String) this.f17899c, (Runnable) this.d);
                return;
            case 9:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.f17898b, (b0) this.f17899c);
                return;
            case 10:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f17898b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f17899c, (TL_update.TL_updateSentPhoneCode) this.d);
                return;
            case 11:
                CacheFetcher.a((CacheFetcher) this.f17898b, (Pair) this.f17899c, (Utilities.Callback) this.d);
                return;
            case 12:
                ChannelBoostsController.a((Utilities.Callback) this.f17899c, (TLObject) this.f17898b, (TLRPC.TL_error) this.d);
                return;
            case 13:
                ChatThemeController.e((File) this.f17898b, (List) this.f17899c, (Bitmap) this.d);
                return;
            case 14:
                CodeHighlighting.lambda$highlightEditable$0((ArrayList) this.d, (SpannableString) this.f17898b, (Utilities.Callback) this.f17899c);
                return;
            case 15:
                ((ContactsController) this.f17898b).lambda$addContact$51((TLRPC.Updates) this.f17899c, (TLRPC.User) this.d);
                return;
            case 16:
                ((ContactsController) this.f17898b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f17899c, (Vector) this.d);
                return;
            case 17:
                ((ContactsController) this.f17898b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.f17899c);
                return;
            case 18:
                ((DispatchQueuePoolBackground) this.f17898b).lambda$execute$1((Runnable) this.f17899c, (DispatchQueue) this.d);
                return;
            case 19:
                ((DownloadController) this.f17898b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.f17899c);
                return;
            case 20:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f17898b, (ArrayList) this.d, (Utilities.Callback) this.f17899c);
                return;
            case 21:
                ((FileLoadOperation) this.f17898b).lambda$getCurrentFile$3((File[]) this.f17899c, (CountDownLatch) this.d);
                return;
            case 22:
                FileLoadOperation.lambda$cancelRequests$15((FileLoadOperation.RequestInfo) this.f17898b, (int[]) this.f17899c, (Runnable) this.d);
                return;
            case 23:
                ((FileLoader) this.f17898b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f17899c, (String) this.d);
                return;
            case 24:
                ((FileLoader) this.f17898b).lambda$checkDownloadQueue$15((FileLoaderPriorityQueue) this.f17899c, (FileLoadOperation) this.d);
                return;
            case 25:
                ((FilePathDatabase) this.f17898b).lambda$saveFileDialogId$5((File) this.f17899c, (FilePathDatabase.FileMeta) this.d);
                return;
            case 26:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f17898b, (int[]) this.f17899c, (Runnable) this.d);
                return;
            case 27:
                ((LocationController) this.f17898b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f17899c, (LocationController.SharingLocationInfo) this.d);
                return;
            default:
                ((MediaDataController) this.f17898b).lambda$saveToRingtones$204((TLObject) this.f17899c, (TLRPC.Document) this.d);
                return;
        }
    }

    public g0(ArrayList arrayList, Object obj, Object obj2, int i10) {
        this.f17897a = i10;
        this.d = arrayList;
        this.f17898b = obj;
        this.f17899c = obj2;
    }

    public g0(BaseController baseController, ArrayList arrayList, Object obj, int i10) {
        this.f17897a = i10;
        this.f17898b = baseController;
        this.d = arrayList;
        this.f17899c = obj;
    }
}
