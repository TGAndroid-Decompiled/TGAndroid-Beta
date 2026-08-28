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
public final class f0 implements Runnable {
    public final int f20231a;
    public final Object f20232b;
    public final Object f20233c;
    public final Object d;

    public f0(Object obj, Object obj2, Object obj3, int i9) {
        this.f20231a = i9;
        this.f20232b = obj;
        this.f20233c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f20231a) {
            case 0:
                BirthdayController.c((BirthdayController) this.f20232b, (BirthdayController.TL_birthdays) this.f20233c, (ArrayList) this.d);
                return;
            case 1:
                ((ImageLoader.AnonymousClass5) this.f20232b).lambda$fileLoadProgressChanged$7((String) this.f20233c, (FileLoadOperation) this.d);
                return;
            case 2:
                ((ImageLoader.CacheOutTask) this.f20232b).lambda$onPostExecute$0((Drawable) this.f20233c, (String) this.d);
                return;
            case 3:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f20232b).lambda$run$0((TLRPC.TL_error) this.f20233c, (TLRPC.TL_messages_startHistoryImport) this.d);
                return;
            case 4:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f20232b).lambda$run$0((TLObject) this.f20233c, (Runnable) this.d);
                return;
            case 5:
                ((TranslateController) this.f20232b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f20233c, (TranslateController.StoryKey) this.d);
                return;
            case 6:
                ((BetaUpdaterController) this.f20232b).lambda$checkForUpdate$1((String) this.f20233c, (Runnable) this.d);
                return;
            case 7:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.f20232b, (b0) this.f20233c);
                return;
            case 8:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f20232b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f20233c, (TL_update.TL_updateSentPhoneCode) this.d);
                return;
            case 9:
                CacheFetcher.a((CacheFetcher) this.f20232b, (Pair) this.f20233c, (Utilities.Callback) this.d);
                return;
            case 10:
                ChannelBoostsController.a((d5.d) this.f20233c, (TLObject) this.f20232b, (TLRPC.TL_error) this.d);
                return;
            case 11:
                ChatThemeController.e((File) this.f20232b, (List) this.f20233c, (Bitmap) this.d);
                return;
            case 12:
                CodeHighlighting.lambda$highlightEditable$0((ArrayList) this.d, (SpannableString) this.f20232b, (Utilities.Callback) this.f20233c);
                return;
            case 13:
                ((ContactsController) this.f20232b).lambda$addContact$51((TLRPC.Updates) this.f20233c, (TLRPC.User) this.d);
                return;
            case 14:
                ((ContactsController) this.f20232b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f20233c, (Vector) this.d);
                return;
            case 15:
                ((ContactsController) this.f20232b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.f20233c);
                return;
            case 16:
                ((DispatchQueuePoolBackground) this.f20232b).lambda$execute$1((Runnable) this.f20233c, (DispatchQueue) this.d);
                return;
            case 17:
                ((DownloadController) this.f20232b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.f20233c);
                return;
            case 18:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f20232b, (ArrayList) this.d, (Utilities.Callback) this.f20233c);
                return;
            case 19:
                ((FileLoadOperation) this.f20232b).lambda$getCurrentFile$3((File[]) this.f20233c, (CountDownLatch) this.d);
                return;
            case 20:
                FileLoadOperation.lambda$cancelRequests$15((FileLoadOperation.RequestInfo) this.f20232b, (int[]) this.f20233c, (Runnable) this.d);
                return;
            case 21:
                ((FileLoader) this.f20232b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f20233c, (String) this.d);
                return;
            case 22:
                ((FileLoader) this.f20232b).lambda$checkDownloadQueue$15((FileLoaderPriorityQueue) this.f20233c, (FileLoadOperation) this.d);
                return;
            case 23:
                ((FilePathDatabase) this.f20232b).lambda$saveFileDialogId$5((File) this.f20233c, (FilePathDatabase.FileMeta) this.d);
                return;
            case 24:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f20232b, (int[]) this.f20233c, (Runnable) this.d);
                return;
            case 25:
                ((LocationController) this.f20232b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f20233c, (LocationController.SharingLocationInfo) this.d);
                return;
            case 26:
                ((MediaDataController) this.f20232b).lambda$processLoadedDiceStickers$88((String) this.f20233c, (TLRPC.TL_messages_stickerSet) this.d);
                return;
            case 27:
                ((MediaDataController) this.f20232b).lambda$putEmojiKeywords$215((TLRPC.TL_emojiKeywordsDifference) this.f20233c, (String) this.d);
                return;
            case 28:
                ((MediaDataController) this.f20232b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.f20233c, (String) this.d);
                return;
            default:
                ((MediaDataController) this.f20232b).lambda$clearBotKeyboard$193((ArrayList) this.d, (MessagesStorage.TopicKey) this.f20233c);
                return;
        }
    }

    public f0(ArrayList arrayList, Object obj, Object obj2, int i9) {
        this.f20231a = i9;
        this.d = arrayList;
        this.f20232b = obj;
        this.f20233c = obj2;
    }

    public f0(BaseController baseController, ArrayList arrayList, Object obj, int i9) {
        this.f20231a = i9;
        this.f20232b = baseController;
        this.d = arrayList;
        this.f20233c = obj;
    }
}
