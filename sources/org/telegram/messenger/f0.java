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
    public final int f16086a;
    public final Object f16087b;
    public final Object f16088c;
    public final Object d;

    public f0(int i10, Object obj, Object obj2, ArrayList arrayList) {
        this.f16086a = i10;
        this.d = arrayList;
        this.f16087b = obj;
        this.f16088c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16086a) {
            case 0:
                BirthdayController.c((BirthdayController) this.f16087b, (BirthdayController.TL_birthdays) this.f16088c, (ArrayList) this.d);
                return;
            case 1:
                ((ImageLoader.AnonymousClass5) this.f16087b).lambda$fileLoadProgressChanged$7((String) this.f16088c, (FileLoadOperation) this.d);
                return;
            case 2:
                ((ImageLoader.CacheOutTask) this.f16087b).lambda$onPostExecute$0((Drawable) this.f16088c, (String) this.d);
                return;
            case 3:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f16087b).lambda$run$0((TLRPC.TL_error) this.f16088c, (TLRPC.TL_messages_startHistoryImport) this.d);
                return;
            case 4:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f16087b).lambda$run$0((TLObject) this.f16088c, (Runnable) this.d);
                return;
            case 5:
                ((TranslateController) this.f16087b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f16088c, (TranslateController.StoryKey) this.d);
                return;
            case 6:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f16087b, (org.telegram.ui.Components.xc[]) this.f16088c, (ni.b) this.d);
                return;
            case 7:
                ((BetaUpdaterController) this.f16087b).lambda$checkForUpdate$1((String) this.f16088c, (Runnable) this.d);
                return;
            case 8:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.f16087b, (a0) this.f16088c);
                return;
            case 9:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f16087b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f16088c, (TL_update.TL_updateSentPhoneCode) this.d);
                return;
            case 10:
                CacheFetcher.a((CacheFetcher) this.f16087b, (Pair) this.f16088c, (Utilities.Callback) this.d);
                return;
            case 11:
                ChannelBoostsController.d((e2.h) this.f16088c, (TLObject) this.f16087b, (TLRPC.TL_error) this.d);
                return;
            case 12:
                ChatThemeController.e((File) this.f16087b, (List) this.f16088c, (Bitmap) this.d);
                return;
            case 13:
                CodeHighlighting.lambda$highlightEditable$0((ArrayList) this.d, (SpannableString) this.f16087b, (Utilities.Callback) this.f16088c);
                return;
            case 14:
                ((ContactsController) this.f16087b).lambda$addContact$51((TLRPC.Updates) this.f16088c, (TLRPC.User) this.d);
                return;
            case 15:
                ((ContactsController) this.f16087b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f16088c, (Vector) this.d);
                return;
            case 16:
                ((ContactsController) this.f16087b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.f16088c);
                return;
            case 17:
                ((DispatchQueuePoolBackground) this.f16087b).lambda$execute$1((Runnable) this.f16088c, (DispatchQueue) this.d);
                return;
            case 18:
                ((DownloadController) this.f16087b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.f16088c);
                return;
            case 19:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f16087b, (ArrayList) this.d, (Utilities.Callback) this.f16088c);
                return;
            case 20:
                ((FileLoadOperation) this.f16087b).lambda$getCurrentFile$3((File[]) this.f16088c, (CountDownLatch) this.d);
                return;
            case 21:
                FileLoadOperation.lambda$cancelRequests$15((FileLoadOperation.RequestInfo) this.f16087b, (int[]) this.f16088c, (Runnable) this.d);
                return;
            case 22:
                ((FileLoader) this.f16087b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f16088c, (String) this.d);
                return;
            case 23:
                ((FileLoader) this.f16087b).lambda$checkDownloadQueue$15((FileLoaderPriorityQueue) this.f16088c, (FileLoadOperation) this.d);
                return;
            case 24:
                ((FilePathDatabase) this.f16087b).lambda$saveFileDialogId$5((File) this.f16088c, (FilePathDatabase.FileMeta) this.d);
                return;
            case 25:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f16087b, (int[]) this.f16088c, (Runnable) this.d);
                return;
            case 26:
                ((LocationController) this.f16087b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f16088c, (LocationController.SharingLocationInfo) this.d);
                return;
            case 27:
                ((MediaDataController) this.f16087b).lambda$processLoadedDiceStickers$88((String) this.f16088c, (TLRPC.TL_messages_stickerSet) this.d);
                return;
            case 28:
                ((MediaDataController) this.f16087b).lambda$putEmojiKeywords$215((TLRPC.TL_emojiKeywordsDifference) this.f16088c, (String) this.d);
                return;
            default:
                ((MediaDataController) this.f16087b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.f16088c, (String) this.d);
                return;
        }
    }

    public f0(Object obj, Object obj2, Object obj3, int i10) {
        this.f16086a = i10;
        this.f16087b = obj;
        this.f16088c = obj2;
        this.d = obj3;
    }

    public f0(BaseController baseController, ArrayList arrayList, Object obj, int i10) {
        this.f16086a = i10;
        this.f16087b = baseController;
        this.d = arrayList;
        this.f16088c = obj;
    }
}
