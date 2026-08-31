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
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class g0 implements Runnable {
    public final int f18711a;
    public final Object f18712b;
    public final Object f18713c;
    public final Object d;

    public g0(int i10, Object obj, Object obj2, ArrayList arrayList) {
        this.f18711a = i10;
        this.d = arrayList;
        this.f18712b = obj;
        this.f18713c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18711a) {
            case 0:
                BirthdayController.c((BirthdayController) this.f18712b, (BirthdayController.TL_birthdays) this.f18713c, (ArrayList) this.d);
                return;
            case 1:
                ((ImageLoader.AnonymousClass5) this.f18712b).lambda$fileLoadProgressChanged$7((String) this.f18713c, (FileLoadOperation) this.d);
                return;
            case 2:
                ((ImageLoader.CacheOutTask) this.f18712b).lambda$onPostExecute$0((Drawable) this.f18713c, (String) this.d);
                return;
            case 3:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f18712b).lambda$run$0((TLRPC.TL_error) this.f18713c, (TLRPC.TL_messages_startHistoryImport) this.d);
                return;
            case 4:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f18712b).lambda$run$0((TLObject) this.f18713c, (Runnable) this.d);
                return;
            case 5:
                ((TranslateController) this.f18712b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f18713c, (TranslateController.StoryKey) this.d);
                return;
            case 6:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f18712b, (org.telegram.ui.Components.sc[]) this.f18713c, (sf.a) this.d);
                return;
            case 7:
                ((BetaUpdaterController) this.f18712b).lambda$checkForUpdate$1((String) this.f18713c, (Runnable) this.d);
                return;
            case 8:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.f18712b, (b0) this.f18713c);
                return;
            case 9:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f18712b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f18713c, (TL_update.TL_updateSentPhoneCode) this.d);
                return;
            case 10:
                CacheFetcher.a((CacheFetcher) this.f18712b, (Pair) this.f18713c, (Utilities.Callback) this.d);
                return;
            case 11:
                ChannelBoostsController.a((h5.d) this.f18713c, (TLObject) this.f18712b, (TLRPC.TL_error) this.d);
                return;
            case 12:
                ChatThemeController.e((File) this.f18712b, (List) this.f18713c, (Bitmap) this.d);
                return;
            case 13:
                CodeHighlighting.lambda$highlightEditable$0((ArrayList) this.d, (SpannableString) this.f18712b, (Utilities.Callback) this.f18713c);
                return;
            case 14:
                ((ContactsController) this.f18712b).lambda$addContact$51((TLRPC.Updates) this.f18713c, (TLRPC.User) this.d);
                return;
            case 15:
                ((ContactsController) this.f18712b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f18713c, (Vector) this.d);
                return;
            case 16:
                ((ContactsController) this.f18712b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.f18713c);
                return;
            case 17:
                ((DispatchQueuePoolBackground) this.f18712b).lambda$execute$1((Runnable) this.f18713c, (DispatchQueue) this.d);
                return;
            case 18:
                ((DownloadController) this.f18712b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.f18713c);
                return;
            case 19:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f18712b, (ArrayList) this.d, (Utilities.Callback) this.f18713c);
                return;
            case 20:
                ((FileLoadOperation) this.f18712b).lambda$getCurrentFile$3((File[]) this.f18713c, (CountDownLatch) this.d);
                return;
            case 21:
                FileLoadOperation.lambda$cancelRequests$15((FileLoadOperation.RequestInfo) this.f18712b, (int[]) this.f18713c, (Runnable) this.d);
                return;
            case 22:
                ((FileLoader) this.f18712b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f18713c, (String) this.d);
                return;
            case 23:
                ((FileLoader) this.f18712b).lambda$checkDownloadQueue$15((FileLoaderPriorityQueue) this.f18713c, (FileLoadOperation) this.d);
                return;
            case 24:
                ((FilePathDatabase) this.f18712b).lambda$saveFileDialogId$5((File) this.f18713c, (FilePathDatabase.FileMeta) this.d);
                return;
            case 25:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f18712b, (int[]) this.f18713c, (Runnable) this.d);
                return;
            case 26:
                ((LocationController) this.f18712b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f18713c, (LocationController.SharingLocationInfo) this.d);
                return;
            case 27:
                ((MediaDataController) this.f18712b).lambda$processLoadedDiceStickers$88((String) this.f18713c, (TLRPC.TL_messages_stickerSet) this.d);
                return;
            case 28:
                ((MediaDataController) this.f18712b).lambda$putEmojiKeywords$215((TLRPC.TL_emojiKeywordsDifference) this.f18713c, (String) this.d);
                return;
            default:
                ((MediaDataController) this.f18712b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.f18713c, (String) this.d);
                return;
        }
    }

    public g0(Object obj, Object obj2, Object obj3, int i10) {
        this.f18711a = i10;
        this.f18712b = obj;
        this.f18713c = obj2;
        this.d = obj3;
    }

    public g0(BaseController baseController, ArrayList arrayList, Object obj, int i10) {
        this.f18711a = i10;
        this.f18712b = baseController;
        this.d = arrayList;
        this.f18713c = obj;
    }
}
