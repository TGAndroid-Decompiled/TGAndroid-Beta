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
    public final int f16343a;
    public final Object f16344b;
    public final Object f16345c;
    public final Object d;

    public g0(int i10, Object obj, Object obj2, ArrayList arrayList) {
        this.f16343a = i10;
        this.d = arrayList;
        this.f16344b = obj;
        this.f16345c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16343a) {
            case 0:
                BirthdayController.c((BirthdayController) this.f16344b, (BirthdayController.TL_birthdays) this.f16345c, (ArrayList) this.d);
                return;
            case 1:
                ((ImageLoader.AnonymousClass5) this.f16344b).lambda$fileLoadProgressChanged$7((String) this.f16345c, (FileLoadOperation) this.d);
                return;
            case 2:
                ((ImageLoader.CacheOutTask) this.f16344b).lambda$onPostExecute$0((Drawable) this.f16345c, (String) this.d);
                return;
            case 3:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f16344b).lambda$run$0((TLRPC.TL_error) this.f16345c, (TLRPC.TL_messages_startHistoryImport) this.d);
                return;
            case 4:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f16344b).lambda$run$0((TLObject) this.f16345c, (Runnable) this.d);
                return;
            case 5:
                ((TranslateController) this.f16344b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f16345c, (TranslateController.StoryKey) this.d);
                return;
            case 6:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f16344b, (org.telegram.ui.Components.zc[]) this.f16345c, (oi.b) this.d);
                return;
            case 7:
                ((BetaUpdaterController) this.f16344b).lambda$checkForUpdate$1((String) this.f16345c, (Runnable) this.d);
                return;
            case 8:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.f16344b, (b0) this.f16345c);
                return;
            case 9:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f16344b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f16345c, (TL_update.TL_updateSentPhoneCode) this.d);
                return;
            case 10:
                CacheFetcher.a((CacheFetcher) this.f16344b, (Pair) this.f16345c, (Utilities.Callback) this.d);
                return;
            case 11:
                ChannelBoostsController.d((e2.h) this.f16345c, (TLObject) this.f16344b, (TLRPC.TL_error) this.d);
                return;
            case 12:
                ChatThemeController.e((File) this.f16344b, (List) this.f16345c, (Bitmap) this.d);
                return;
            case 13:
                CodeHighlighting.lambda$highlightEditable$0((ArrayList) this.d, (SpannableString) this.f16344b, (Utilities.Callback) this.f16345c);
                return;
            case 14:
                ((ContactsController) this.f16344b).lambda$addContact$51((TLRPC.Updates) this.f16345c, (TLRPC.User) this.d);
                return;
            case 15:
                ((ContactsController) this.f16344b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f16345c, (Vector) this.d);
                return;
            case 16:
                ((ContactsController) this.f16344b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.f16345c);
                return;
            case 17:
                ((DispatchQueuePoolBackground) this.f16344b).lambda$execute$1((Runnable) this.f16345c, (DispatchQueue) this.d);
                return;
            case 18:
                ((DownloadController) this.f16344b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.f16345c);
                return;
            case 19:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f16344b, (ArrayList) this.d, (Utilities.Callback) this.f16345c);
                return;
            case 20:
                ((FileLoadOperation) this.f16344b).lambda$getCurrentFile$3((File[]) this.f16345c, (CountDownLatch) this.d);
                return;
            case 21:
                FileLoadOperation.lambda$cancelRequests$15((FileLoadOperation.RequestInfo) this.f16344b, (int[]) this.f16345c, (Runnable) this.d);
                return;
            case 22:
                ((FileLoader) this.f16344b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f16345c, (String) this.d);
                return;
            case 23:
                ((FileLoader) this.f16344b).lambda$checkDownloadQueue$15((FileLoaderPriorityQueue) this.f16345c, (FileLoadOperation) this.d);
                return;
            case 24:
                ((FilePathDatabase) this.f16344b).lambda$saveFileDialogId$5((File) this.f16345c, (FilePathDatabase.FileMeta) this.d);
                return;
            case 25:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f16344b, (int[]) this.f16345c, (Runnable) this.d);
                return;
            case 26:
                ((LocationController) this.f16344b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f16345c, (LocationController.SharingLocationInfo) this.d);
                return;
            case 27:
                ((MediaDataController) this.f16344b).lambda$processLoadedDiceStickers$88((String) this.f16345c, (TLRPC.TL_messages_stickerSet) this.d);
                return;
            case 28:
                ((MediaDataController) this.f16344b).lambda$putEmojiKeywords$215((TLRPC.TL_emojiKeywordsDifference) this.f16345c, (String) this.d);
                return;
            default:
                ((MediaDataController) this.f16344b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.f16345c, (String) this.d);
                return;
        }
    }

    public g0(Object obj, Object obj2, Object obj3, int i10) {
        this.f16343a = i10;
        this.f16344b = obj;
        this.f16345c = obj2;
        this.d = obj3;
    }

    public g0(BaseController baseController, ArrayList arrayList, Object obj, int i10) {
        this.f16343a = i10;
        this.f16344b = baseController;
        this.d = arrayList;
        this.f16345c = obj;
    }
}
