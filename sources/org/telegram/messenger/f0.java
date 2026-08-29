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
    public final int f20184a;
    public final Object f20185b;
    public final Object f20186c;
    public final Object d;

    public f0(Object obj, Object obj2, Object obj3, int i10) {
        this.f20184a = i10;
        this.f20185b = obj;
        this.f20186c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f20184a) {
            case 0:
                BirthdayController.c((BirthdayController) this.f20185b, (BirthdayController.TL_birthdays) this.f20186c, (ArrayList) this.d);
                return;
            case 1:
                ((ImageLoader.AnonymousClass5) this.f20185b).lambda$fileLoadProgressChanged$7((String) this.f20186c, (FileLoadOperation) this.d);
                return;
            case 2:
                ((ImageLoader.CacheOutTask) this.f20185b).lambda$onPostExecute$0((Drawable) this.f20186c, (String) this.d);
                return;
            case 3:
                ((SendMessagesHelper.ImportingHistory.AnonymousClass3) this.f20185b).lambda$run$0((TLRPC.TL_error) this.f20186c, (TLRPC.TL_messages_startHistoryImport) this.d);
                return;
            case 4:
                ((SendMessagesHelper.ImportingSticker.AnonymousClass1) this.f20185b).lambda$run$0((TLObject) this.f20186c, (Runnable) this.d);
                return;
            case 5:
                ((TranslateController) this.f20185b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.f20186c, (TranslateController.StoryKey) this.d);
                return;
            case 6:
                ((BetaUpdaterController) this.f20185b).lambda$checkForUpdate$1((String) this.f20186c, (Runnable) this.d);
                return;
            case 7:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.f20185b, (b0) this.f20186c);
                return;
            case 8:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.f20185b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f20186c, (TL_update.TL_updateSentPhoneCode) this.d);
                return;
            case 9:
                CacheFetcher.a((CacheFetcher) this.f20185b, (Pair) this.f20186c, (Utilities.Callback) this.d);
                return;
            case 10:
                ChannelBoostsController.a((f5.d) this.f20186c, (TLObject) this.f20185b, (TLRPC.TL_error) this.d);
                return;
            case 11:
                ChatThemeController.e((File) this.f20185b, (List) this.f20186c, (Bitmap) this.d);
                return;
            case 12:
                CodeHighlighting.lambda$highlightEditable$0((ArrayList) this.d, (SpannableString) this.f20185b, (Utilities.Callback) this.f20186c);
                return;
            case 13:
                ((ContactsController) this.f20185b).lambda$addContact$51((TLRPC.Updates) this.f20186c, (TLRPC.User) this.d);
                return;
            case 14:
                ((ContactsController) this.f20185b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.f20186c, (Vector) this.d);
                return;
            case 15:
                ((ContactsController) this.f20185b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.f20186c);
                return;
            case 16:
                ((DispatchQueuePoolBackground) this.f20185b).lambda$execute$1((Runnable) this.f20186c, (DispatchQueue) this.d);
                return;
            case 17:
                ((DownloadController) this.f20185b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.f20186c);
                return;
            case 18:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.f20185b, (ArrayList) this.d, (Utilities.Callback) this.f20186c);
                return;
            case 19:
                ((FileLoadOperation) this.f20185b).lambda$getCurrentFile$3((File[]) this.f20186c, (CountDownLatch) this.d);
                return;
            case 20:
                FileLoadOperation.lambda$cancelRequests$15((FileLoadOperation.RequestInfo) this.f20185b, (int[]) this.f20186c, (Runnable) this.d);
                return;
            case 21:
                ((FileLoader) this.f20185b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.f20186c, (String) this.d);
                return;
            case 22:
                ((FileLoader) this.f20185b).lambda$checkDownloadQueue$15((FileLoaderPriorityQueue) this.f20186c, (FileLoadOperation) this.d);
                return;
            case 23:
                ((FilePathDatabase) this.f20185b).lambda$saveFileDialogId$5((File) this.f20186c, (FilePathDatabase.FileMeta) this.d);
                return;
            case 24:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.f20185b, (int[]) this.f20186c, (Runnable) this.d);
                return;
            case 25:
                ((LocationController) this.f20185b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.f20186c, (LocationController.SharingLocationInfo) this.d);
                return;
            case 26:
                ((MediaDataController) this.f20185b).lambda$processLoadedDiceStickers$88((String) this.f20186c, (TLRPC.TL_messages_stickerSet) this.d);
                return;
            case 27:
                ((MediaDataController) this.f20185b).lambda$putEmojiKeywords$215((TLRPC.TL_emojiKeywordsDifference) this.f20186c, (String) this.d);
                return;
            case 28:
                ((MediaDataController) this.f20185b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.f20186c, (String) this.d);
                return;
            default:
                ((MediaDataController) this.f20185b).lambda$clearBotKeyboard$193((ArrayList) this.d, (MessagesStorage.TopicKey) this.f20186c);
                return;
        }
    }

    public f0(ArrayList arrayList, Object obj, Object obj2, int i10) {
        this.f20184a = i10;
        this.d = arrayList;
        this.f20185b = obj;
        this.f20186c = obj2;
    }

    public f0(BaseController baseController, ArrayList arrayList, Object obj, int i10) {
        this.f20184a = i10;
        this.f20185b = baseController;
        this.d = arrayList;
        this.f20186c = obj;
    }
}
