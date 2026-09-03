package org.telegram.messenger;

import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class d2 implements Runnable {
    public final int f17001a;
    public final Object f17002b;
    public final Object f17003c;

    public d2(int i10, Object obj, Object obj2) {
        this.f17001a = i10;
        this.f17002b = obj;
        this.f17003c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17001a) {
            case 0:
                ((DownloadController) this.f17002b).lambda$loadAutoDownloadConfig$1((TLObject) this.f17003c);
                return;
            case 1:
                ((FactCheckController) this.f17002b).lambda$applyFactCheck$14((TLRPC.Updates) this.f17003c);
                return;
            case 2:
                FactCheckController.lambda$saveToDatabase$6((MessagesStorage) this.f17002b, (TLRPC.TL_factCheck) this.f17003c);
                return;
            case 3:
                ((FileLoadOperation) this.f17002b).lambda$start$11((boolean[]) this.f17003c);
                return;
            case 4:
                ((FileLoadOperation) this.f17002b).lambda$addPart$2((ArrayList) this.f17003c);
                return;
            case 5:
                ((FileLoader) this.f17002b).lambda$uploadFile$19((NotificationCenter.NotificationCenterDelegate[]) this.f17003c);
                return;
            case 6:
                ((FileLoader) this.f17002b).lambda$checkCurrentDownloadsFiles$17((ArrayList) this.f17003c);
                return;
            case 7:
                FileLog.lambda$e$2((String) this.f17002b, (Throwable) this.f17003c);
                return;
            case 8:
                ((FilePathDatabase) this.f17002b).lambda$removeFiles$6((List) this.f17003c);
                return;
            case 9:
                ((FileRefController) this.f17002b).lambda$onRequestComplete$47((TLRPC.User) this.f17003c);
                return;
            case 10:
                ((FileRefController) this.f17002b).lambda$onRequestComplete$50((TLRPC.TL_messages_stickerSet) this.f17003c);
                return;
            case 11:
                ((GiftAuctionController) this.f17002b).lambda$sendBid$7((TLRPC.TL_payments_paymentResult) this.f17003c);
                return;
            case 12:
                ((ImageLoader) this.f17002b).lambda$checkMediaPaths$1((Runnable) this.f17003c);
                return;
            case 13:
                ImageLoader.lambda$checkMediaPaths$0((SparseArray) this.f17002b, (Runnable) this.f17003c);
                return;
            case 14:
                ((MediaController) this.f17002b).lambda$playEmojiSound$17((File) this.f17003c);
                return;
            case 15:
                MediaController.lambda$playEmojiSound$18((AccountInstance) this.f17002b, (TLRPC.TL_document) this.f17003c);
                return;
            case 16:
                ((MediaController) this.f17002b).lambda$processMediaObserver$6((ArrayList) this.f17003c);
                return;
            case 17:
                ((MediaController) this.f17002b).lambda$startAudioAgain$7((MessageObject) this.f17003c);
                return;
            case 18:
                ((MediaDataController) this.f17002b).lambda$loadHints$147((TLRPC.TL_contacts_topPeers) this.f17003c);
                return;
            case 19:
                MediaDataController.lambda$loadReplyMessagesForMessages$172((AtomicInteger) this.f17002b, (Runnable) this.f17003c);
                return;
            case 20:
                MediaDataController.lambda$fillWithAnimatedEmoji$228((boolean[]) this.f17002b, (x6) this.f17003c);
                return;
            case 21:
                ((MediaDataController) this.f17002b).lambda$loadGroupStickerSet$44((TLRPC.StickerSet) this.f17003c);
                return;
            case 22:
                ((MessageObject) this.f17002b).lambda$loadAnimatedEmojiDocument$0((TLRPC.Document) this.f17003c);
                return;
            case 23:
                ((MessagesController) this.f17002b).lambda$getDifference$351((TLRPC.updates_Difference) this.f17003c);
                return;
            case 24:
                ((MessagesController) this.f17002b).lambda$requestContactToken$475((Utilities.Callback) this.f17003c);
                return;
            case 25:
                ((MessagesController) this.f17002b).lambda$checkTosUpdate$162((TLRPC.TL_help_termsOfServiceUpdate) this.f17003c);
                return;
            case 26:
                ((MessagesController) this.f17002b).lambda$changeChatAvatar$318((Runnable) this.f17003c);
                return;
            case 27:
                ((MessagesController) this.f17002b).lambda$createChat$260((TLRPC.Updates) this.f17003c);
                return;
            case 28:
                ((MessagesController) this.f17002b).lambda$processUpdateArray$392((TL_update.TL_updateServiceNotification) this.f17003c);
                return;
            default:
                ((MessagesController) this.f17002b).lambda$processUpdateArray$393((TLRPC.Message) this.f17003c);
                return;
        }
    }
}
