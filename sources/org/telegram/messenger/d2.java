package org.telegram.messenger;

import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

public final class d2 implements Runnable {

    public final int f20007a;

    public final Object f20008b;

    public final Object f20009c;

    public d2(int i10, Object obj, Object obj2) {
        this.f20007a = i10;
        this.f20008b = obj;
        this.f20009c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f20007a) {
            case 0:
                ((DownloadController) this.f20008b).lambda$loadAutoDownloadConfig$1((TLObject) this.f20009c);
                break;
            case 1:
                ((FactCheckController) this.f20008b).lambda$applyFactCheck$14((TLRPC.Updates) this.f20009c);
                break;
            case 2:
                FactCheckController.lambda$saveToDatabase$6((MessagesStorage) this.f20008b, (TLRPC.TL_factCheck) this.f20009c);
                break;
            case 3:
                ((FileLoadOperation) this.f20008b).lambda$start$11((boolean[]) this.f20009c);
                break;
            case 4:
                ((FileLoadOperation) this.f20008b).lambda$addPart$2((ArrayList) this.f20009c);
                break;
            case 5:
                ((FileLoader) this.f20008b).lambda$uploadFile$19((NotificationCenter.NotificationCenterDelegate[]) this.f20009c);
                break;
            case 6:
                ((FileLoader) this.f20008b).lambda$checkCurrentDownloadsFiles$17((ArrayList) this.f20009c);
                break;
            case 7:
                FileLog.lambda$e$2((String) this.f20008b, (Throwable) this.f20009c);
                break;
            case 8:
                ((FilePathDatabase) this.f20008b).lambda$removeFiles$6((List) this.f20009c);
                break;
            case 9:
                ((FileRefController) this.f20008b).lambda$onRequestComplete$47((TLRPC.User) this.f20009c);
                break;
            case 10:
                ((FileRefController) this.f20008b).lambda$onRequestComplete$50((TLRPC.TL_messages_stickerSet) this.f20009c);
                break;
            case 11:
                ((GiftAuctionController) this.f20008b).lambda$sendBid$7((TLRPC.TL_payments_paymentResult) this.f20009c);
                break;
            case 12:
                ((ImageLoader) this.f20008b).lambda$checkMediaPaths$1((Runnable) this.f20009c);
                break;
            case 13:
                ImageLoader.lambda$checkMediaPaths$0((SparseArray) this.f20008b, (Runnable) this.f20009c);
                break;
            case 14:
                ((MediaController) this.f20008b).lambda$playEmojiSound$17((File) this.f20009c);
                break;
            case 15:
                ((MediaController) this.f20008b).lambda$processMediaObserver$6((ArrayList) this.f20009c);
                break;
            case 16:
                MediaController.lambda$playEmojiSound$18((AccountInstance) this.f20008b, (TLRPC.TL_document) this.f20009c);
                break;
            case 17:
                ((MediaController) this.f20008b).lambda$startAudioAgain$7((MessageObject) this.f20009c);
                break;
            case 18:
                ((MediaDataController) this.f20008b).lambda$loadHints$147((TLRPC.TL_contacts_topPeers) this.f20009c);
                break;
            case 19:
                MediaDataController.lambda$loadReplyMessagesForMessages$172((AtomicInteger) this.f20008b, (Runnable) this.f20009c);
                break;
            case 20:
                MediaDataController.lambda$fillWithAnimatedEmoji$228((boolean[]) this.f20008b, (u6) this.f20009c);
                break;
            case 21:
                ((MediaDataController) this.f20008b).lambda$loadGroupStickerSet$44((TLRPC.StickerSet) this.f20009c);
                break;
            case 22:
                ((MessageObject) this.f20008b).lambda$loadAnimatedEmojiDocument$0((TLRPC.Document) this.f20009c);
                break;
            case 23:
                ((MessagesController) this.f20008b).lambda$getDifference$351((TLRPC.updates_Difference) this.f20009c);
                break;
            case 24:
                ((MessagesController) this.f20008b).lambda$requestContactToken$475((Utilities.Callback) this.f20009c);
                break;
            case 25:
                ((MessagesController) this.f20008b).lambda$checkTosUpdate$162((TLRPC.TL_help_termsOfServiceUpdate) this.f20009c);
                break;
            case 26:
                ((MessagesController) this.f20008b).lambda$changeChatAvatar$318((Runnable) this.f20009c);
                break;
            case 27:
                ((MessagesController) this.f20008b).lambda$createChat$260((TLRPC.Updates) this.f20009c);
                break;
            case 28:
                ((MessagesController) this.f20008b).lambda$processUpdateArray$392((TL_update.TL_updateServiceNotification) this.f20009c);
                break;
            default:
                ((MessagesController) this.f20008b).lambda$processUpdateArray$393((TLRPC.Message) this.f20009c);
                break;
        }
    }
}
