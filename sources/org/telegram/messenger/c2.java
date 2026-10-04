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
public final class c2 implements Runnable {
    public final int f17491a;
    public final Object f17492b;
    public final Object f17493c;

    public c2(int i10, Object obj, Object obj2) {
        this.f17491a = i10;
        this.f17492b = obj;
        this.f17493c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17491a) {
            case 0:
                ((DownloadController) this.f17492b).lambda$loadAutoDownloadConfig$1((TLObject) this.f17493c);
                return;
            case 1:
                ((FactCheckController) this.f17492b).lambda$applyFactCheck$14((TLRPC.Updates) this.f17493c);
                return;
            case 2:
                FactCheckController.lambda$saveToDatabase$6((MessagesStorage) this.f17492b, (TLRPC.TL_factCheck) this.f17493c);
                return;
            case 3:
                ((FileLoadOperation) this.f17492b).lambda$start$11((boolean[]) this.f17493c);
                return;
            case 4:
                ((FileLoadOperation) this.f17492b).lambda$addPart$2((ArrayList) this.f17493c);
                return;
            case 5:
                ((FileLoader) this.f17492b).lambda$uploadFile$19((NotificationCenter.NotificationCenterDelegate[]) this.f17493c);
                return;
            case 6:
                ((FileLoader) this.f17492b).lambda$checkCurrentDownloadsFiles$17((ArrayList) this.f17493c);
                return;
            case 7:
                FileLog.lambda$e$2((String) this.f17492b, (Throwable) this.f17493c);
                return;
            case 8:
                ((FilePathDatabase) this.f17492b).lambda$removeFiles$6((List) this.f17493c);
                return;
            case 9:
                ((FileRefController) this.f17492b).lambda$onRequestComplete$47((TLRPC.User) this.f17493c);
                return;
            case 10:
                ((FileRefController) this.f17492b).lambda$onRequestComplete$50((TLRPC.TL_messages_stickerSet) this.f17493c);
                return;
            case 11:
                ((GiftAuctionController) this.f17492b).lambda$sendBid$7((TLRPC.TL_payments_paymentResult) this.f17493c);
                return;
            case 12:
                ((ImageLoader) this.f17492b).lambda$checkMediaPaths$1((Runnable) this.f17493c);
                return;
            case 13:
                ImageLoader.lambda$checkMediaPaths$0((SparseArray) this.f17492b, (Runnable) this.f17493c);
                return;
            case 14:
                ((MediaController) this.f17492b).lambda$playEmojiSound$17((File) this.f17493c);
                return;
            case 15:
                MediaController.lambda$playEmojiSound$18((AccountInstance) this.f17492b, (TLRPC.TL_document) this.f17493c);
                return;
            case 16:
                ((MediaController) this.f17492b).lambda$processMediaObserver$6((ArrayList) this.f17493c);
                return;
            case 17:
                ((MediaController) this.f17492b).lambda$startAudioAgain$7((MessageObject) this.f17493c);
                return;
            case 18:
                MediaDataController.lambda$loadReplyMessagesForMessages$172((AtomicInteger) this.f17492b, (Runnable) this.f17493c);
                return;
            case 19:
                MediaDataController.lambda$fillWithAnimatedEmoji$229((boolean[]) this.f17492b, (t6) this.f17493c);
                return;
            case 20:
                ((MediaDataController) this.f17492b).lambda$loadGroupStickerSet$44((TLRPC.StickerSet) this.f17493c);
                return;
            case 21:
                ((MediaDataController) this.f17492b).lambda$loadHints$147((TLRPC.TL_contacts_topPeers) this.f17493c);
                return;
            case 22:
                ((MessageObject) this.f17492b).lambda$loadAnimatedEmojiDocument$0((TLRPC.Document) this.f17493c);
                return;
            case 23:
                ((MessagesController) this.f17492b).lambda$getDifference$351((TLRPC.updates_Difference) this.f17493c);
                return;
            case 24:
                ((MessagesController) this.f17492b).lambda$requestContactToken$475((Utilities.Callback) this.f17493c);
                return;
            case 25:
                ((MessagesController) this.f17492b).lambda$checkTosUpdate$162((TLRPC.TL_help_termsOfServiceUpdate) this.f17493c);
                return;
            case 26:
                ((MessagesController) this.f17492b).lambda$changeChatAvatar$318((Runnable) this.f17493c);
                return;
            case 27:
                ((MessagesController) this.f17492b).lambda$createChat$260((TLRPC.Updates) this.f17493c);
                return;
            case 28:
                ((MessagesController) this.f17492b).lambda$processUpdateArray$392((TL_update.TL_updateServiceNotification) this.f17493c);
                return;
            default:
                ((MessagesController) this.f17492b).lambda$processUpdateArray$393((TLRPC.Message) this.f17493c);
                return;
        }
    }
}
