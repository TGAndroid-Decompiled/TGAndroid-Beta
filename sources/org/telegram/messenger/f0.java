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
public final class f0 implements Runnable {
    public final int f15125a;
    public final Object f15126b;
    public final Object f15127c;
    public final Object d;

    public f0(int i10, Object obj, Object obj2, ArrayList arrayList) {
        this.f15125a = i10;
        this.d = arrayList;
        this.f15126b = obj;
        this.f15127c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f15125a) {
            case 0:
                BirthdayController.c((BirthdayController) this.f15126b, (BirthdayController.TL_birthdays) this.f15127c, (ArrayList) this.d);
                return;
            case 1:
                ((ImageLoader.AnonymousClass5) this.f15126b).lambda$fileLoadProgressChanged$7((String) this.f15127c, (FileLoadOperation) this.d);
                return;
            case 2:
                ((ImageLoader.CacheOutTask) this.f15126b).lambda$onPostExecute$0((Drawable) this.f15127c, (String) this.d);
                return;
            case 3:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f15126b).lambda$run$0((TLRPC.TL_error) this.f15127c, (TLRPC.TL_messages_startHistoryImport) this.d);
                return;
            case 4:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f15126b).lambda$run$0((TLObject) this.f15127c, (Runnable) this.d);
                return;
            case 5:
                ((TranslateController) this.f15126b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f15127c, (TranslateController.StoryKey) this.d);
                return;
            case 6:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f15126b, (org.telegram.ui.Components.yc[]) this.f15127c, (ki.b) this.d);
                return;
            case 7:
                ((BetaUpdaterController) this.f15126b).lambda$checkForUpdate$1((String) this.f15127c, (Runnable) this.d);
                return;
            case 8:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.f15126b, (a0) this.f15127c);
                return;
            case 9:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f15126b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f15127c, (TL_update.TL_updateSentPhoneCode) this.d);
                return;
            case 10:
                CacheFetcher.a((CacheFetcher) this.f15126b, (Pair) this.f15127c, (Utilities.Callback) this.d);
                return;
            case 11:
                ChannelBoostsController.d((e2.h) this.f15127c, (TLObject) this.f15126b, (TLRPC.TL_error) this.d);
                return;
            case 12:
                ChatThemeController.e((File) this.f15126b, (List) this.f15127c, (Bitmap) this.d);
                return;
            case 13:
                CodeHighlighting.lambda$highlightEditable$0((ArrayList) this.d, (SpannableString) this.f15126b, (Utilities.Callback) this.f15127c);
                return;
            case 14:
                ((ContactsController) this.f15126b).lambda$addContact$51((TLRPC.Updates) this.f15127c, (TLRPC.User) this.d);
                return;
            case 15:
                ((ContactsController) this.f15126b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f15127c, (Vector) this.d);
                return;
            case 16:
                ((ContactsController) this.f15126b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.f15127c);
                return;
            case 17:
                ((DispatchQueuePoolBackground) this.f15126b).lambda$execute$1((Runnable) this.f15127c, (DispatchQueue) this.d);
                return;
            case 18:
                ((DownloadController) this.f15126b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.f15127c);
                return;
            case 19:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f15126b, (ArrayList) this.d, (Utilities.Callback) this.f15127c);
                return;
            case 20:
                ((FileLoadOperation) this.f15126b).lambda$getCurrentFile$3((File[]) this.f15127c, (CountDownLatch) this.d);
                return;
            case 21:
                FileLoadOperation.lambda$cancelRequests$15((FileLoadOperation.RequestInfo) this.f15126b, (int[]) this.f15127c, (Runnable) this.d);
                return;
            case 22:
                ((FileLoader) this.f15126b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f15127c, (String) this.d);
                return;
            case 23:
                ((FileLoader) this.f15126b).lambda$checkDownloadQueue$15((FileLoaderPriorityQueue) this.f15127c, (FileLoadOperation) this.d);
                return;
            case 24:
                ((FilePathDatabase) this.f15126b).lambda$saveFileDialogId$5((File) this.f15127c, (FilePathDatabase.FileMeta) this.d);
                return;
            case 25:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f15126b, (int[]) this.f15127c, (Runnable) this.d);
                return;
            case 26:
                ((LocationController) this.f15126b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f15127c, (LocationController.SharingLocationInfo) this.d);
                return;
            case 27:
                ((MediaDataController) this.f15126b).lambda$processLoadedDiceStickers$88((String) this.f15127c, (TLRPC.TL_messages_stickerSet) this.d);
                return;
            case 28:
                ((MediaDataController) this.f15126b).lambda$putEmojiKeywords$215((TLRPC.TL_emojiKeywordsDifference) this.f15127c, (String) this.d);
                return;
            default:
                ((MediaDataController) this.f15126b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.f15127c, (String) this.d);
                return;
        }
    }

    public f0(Object obj, Object obj2, Object obj3, int i10) {
        this.f15125a = i10;
        this.f15126b = obj;
        this.f15127c = obj2;
        this.d = obj3;
    }

    public f0(BaseController baseController, ArrayList arrayList, Object obj, int i10) {
        this.f15125a = i10;
        this.f15126b = baseController;
        this.d = arrayList;
        this.f15127c = obj;
    }
}
