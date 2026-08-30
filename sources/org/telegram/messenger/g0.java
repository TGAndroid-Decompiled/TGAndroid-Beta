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
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class g0 implements Runnable {
    public final int f17260a;
    public final Object f17261b;
    public final Object f17262c;
    public final Object d;

    public g0(Object obj, Object obj2, Object obj3, int i10) {
        this.f17260a = i10;
        this.f17261b = obj;
        this.f17262c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17260a) {
            case 0:
                BirthdayController.c((BirthdayController) this.f17261b, (BirthdayController.TL_birthdays) this.f17262c, (ArrayList) this.d);
                return;
            case 1:
                ((ImageLoader.AnonymousClass5) this.f17261b).lambda$fileLoadProgressChanged$7((String) this.f17262c, (FileLoadOperation) this.d);
                return;
            case 2:
                ((ImageLoader.CacheOutTask) this.f17261b).lambda$onPostExecute$0((Drawable) this.f17262c, (String) this.d);
                return;
            case 3:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f17261b).lambda$run$0((TLRPC.TL_error) this.f17262c, (TLRPC.TL_messages_startHistoryImport) this.d);
                return;
            case 4:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f17261b).lambda$run$0((TLObject) this.f17262c, (Runnable) this.d);
                return;
            case 5:
                ((TranslateController) this.f17261b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f17262c, (TranslateController.StoryKey) this.d);
                return;
            case 6:
                ((BetaUpdaterController) this.f17261b).lambda$checkForUpdate$1((String) this.f17262c, (Runnable) this.d);
                return;
            case 7:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.f17261b, (c0) this.f17262c);
                return;
            case 8:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f17261b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f17262c, (TL_update.TL_updateSentPhoneCode) this.d);
                return;
            case 9:
                CacheFetcher.a((CacheFetcher) this.f17261b, (Pair) this.f17262c, (Utilities.Callback) this.d);
                return;
            case 10:
                ChannelBoostsController.a((h5.d) this.f17262c, (TLObject) this.f17261b, (TLRPC.TL_error) this.d);
                return;
            case 11:
                ChatThemeController.e((File) this.f17261b, (List) this.f17262c, (Bitmap) this.d);
                return;
            case 12:
                CodeHighlighting.lambda$highlightEditable$0((ArrayList) this.d, (SpannableString) this.f17261b, (Utilities.Callback) this.f17262c);
                return;
            case 13:
                ((ContactsController) this.f17261b).lambda$addContact$51((TLRPC.Updates) this.f17262c, (TLRPC.User) this.d);
                return;
            case 14:
                ((ContactsController) this.f17261b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f17262c, (Vector) this.d);
                return;
            case 15:
                ((ContactsController) this.f17261b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.f17262c);
                return;
            case 16:
                ((DispatchQueuePoolBackground) this.f17261b).lambda$execute$1((Runnable) this.f17262c, (DispatchQueue) this.d);
                return;
            case 17:
                ((DownloadController) this.f17261b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.f17262c);
                return;
            case 18:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f17261b, (ArrayList) this.d, (Utilities.Callback) this.f17262c);
                return;
            case 19:
                ((FileLoadOperation) this.f17261b).lambda$getCurrentFile$3((File[]) this.f17262c, (CountDownLatch) this.d);
                return;
            case 20:
                FileLoadOperation.lambda$cancelRequests$15((FileLoadOperation.RequestInfo) this.f17261b, (int[]) this.f17262c, (Runnable) this.d);
                return;
            case 21:
                ((FileLoader) this.f17261b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f17262c, (String) this.d);
                return;
            case 22:
                ((FileLoader) this.f17261b).lambda$checkDownloadQueue$15((FileLoaderPriorityQueue) this.f17262c, (FileLoadOperation) this.d);
                return;
            case 23:
                ((FilePathDatabase) this.f17261b).lambda$saveFileDialogId$5((File) this.f17262c, (FilePathDatabase.FileMeta) this.d);
                return;
            case 24:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f17261b, (int[]) this.f17262c, (Runnable) this.d);
                return;
            case 25:
                ((LocationController) this.f17261b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f17262c, (LocationController.SharingLocationInfo) this.d);
                return;
            case 26:
                ((MediaDataController) this.f17261b).lambda$processLoadedDiceStickers$88((String) this.f17262c, (TLRPC.TL_messages_stickerSet) this.d);
                return;
            case 27:
                ((MediaDataController) this.f17261b).lambda$putEmojiKeywords$215((TLRPC.TL_emojiKeywordsDifference) this.f17262c, (String) this.d);
                return;
            case 28:
                ((MediaDataController) this.f17261b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.f17262c, (String) this.d);
                return;
            default:
                ((MediaDataController) this.f17261b).lambda$clearBotKeyboard$193((ArrayList) this.d, (MessagesStorage.TopicKey) this.f17262c);
                return;
        }
    }

    public g0(ArrayList arrayList, Object obj, Object obj2, int i10) {
        this.f17260a = i10;
        this.d = arrayList;
        this.f17261b = obj;
        this.f17262c = obj2;
    }

    public g0(BaseController baseController, ArrayList arrayList, Object obj, int i10) {
        this.f17260a = i10;
        this.f17261b = baseController;
        this.d = arrayList;
        this.f17262c = obj;
    }
}
