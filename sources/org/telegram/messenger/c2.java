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
    public final int f16030a;
    public final Object f16031b;
    public final Object f16032c;

    public c2(int i10, Object obj, Object obj2) {
        this.f16030a = i10;
        this.f16031b = obj;
        this.f16032c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16030a) {
            case 0:
                ((DownloadController) this.f16031b).lambda$loadAutoDownloadConfig$1((TLObject) this.f16032c);
                return;
            case 1:
                ((FactCheckController) this.f16031b).lambda$applyFactCheck$14((TLRPC.Updates) this.f16032c);
                return;
            case 2:
                FactCheckController.lambda$saveToDatabase$6((MessagesStorage) this.f16031b, (TLRPC.TL_factCheck) this.f16032c);
                return;
            case 3:
                ((FileLoadOperation) this.f16031b).lambda$start$11((boolean[]) this.f16032c);
                return;
            case 4:
                ((FileLoadOperation) this.f16031b).lambda$addPart$2((ArrayList) this.f16032c);
                return;
            case 5:
                ((FileLoader) this.f16031b).lambda$uploadFile$19((NotificationCenter.NotificationCenterDelegate[]) this.f16032c);
                return;
            case 6:
                ((FileLoader) this.f16031b).lambda$checkCurrentDownloadsFiles$17((ArrayList) this.f16032c);
                return;
            case 7:
                FileLog.lambda$e$2((String) this.f16031b, (Throwable) this.f16032c);
                return;
            case 8:
                ((FilePathDatabase) this.f16031b).lambda$removeFiles$6((List) this.f16032c);
                return;
            case 9:
                ((FileRefController) this.f16031b).lambda$onRequestComplete$47((TLRPC.User) this.f16032c);
                return;
            case 10:
                ((FileRefController) this.f16031b).lambda$onRequestComplete$50((TLRPC.TL_messages_stickerSet) this.f16032c);
                return;
            case 11:
                ((GiftAuctionController) this.f16031b).lambda$sendBid$7((TLRPC.TL_payments_paymentResult) this.f16032c);
                return;
            case 12:
                ((ImageLoader) this.f16031b).lambda$checkMediaPaths$1((Runnable) this.f16032c);
                return;
            case 13:
                ImageLoader.lambda$checkMediaPaths$0((SparseArray) this.f16031b, (Runnable) this.f16032c);
                return;
            case 14:
                ((MediaController) this.f16031b).lambda$playEmojiSound$17((File) this.f16032c);
                return;
            case 15:
                MediaController.lambda$playEmojiSound$18((AccountInstance) this.f16031b, (TLRPC.TL_document) this.f16032c);
                return;
            case 16:
                ((MediaController) this.f16031b).lambda$processMediaObserver$6((ArrayList) this.f16032c);
                return;
            case 17:
                ((MediaController) this.f16031b).lambda$startAudioAgain$7((MessageObject) this.f16032c);
                return;
            case 18:
                ((MediaDataController) this.f16031b).lambda$loadHints$147((TLRPC.TL_contacts_topPeers) this.f16032c);
                return;
            case 19:
                MediaDataController.lambda$loadReplyMessagesForMessages$172((AtomicInteger) this.f16031b, (Runnable) this.f16032c);
                return;
            case 20:
                MediaDataController.lambda$fillWithAnimatedEmoji$228((boolean[]) this.f16031b, (t6) this.f16032c);
                return;
            case 21:
                ((MediaDataController) this.f16031b).lambda$loadGroupStickerSet$44((TLRPC.StickerSet) this.f16032c);
                return;
            case 22:
                ((MessageObject) this.f16031b).lambda$loadAnimatedEmojiDocument$0((TLRPC.Document) this.f16032c);
                return;
            case 23:
                ((MessagesController) this.f16031b).lambda$getDifference$351((TLRPC.updates_Difference) this.f16032c);
                return;
            case 24:
                ((MessagesController) this.f16031b).lambda$requestContactToken$475((Utilities.Callback) this.f16032c);
                return;
            case 25:
                ((MessagesController) this.f16031b).lambda$checkTosUpdate$162((TLRPC.TL_help_termsOfServiceUpdate) this.f16032c);
                return;
            case 26:
                ((MessagesController) this.f16031b).lambda$changeChatAvatar$318((Runnable) this.f16032c);
                return;
            case 27:
                ((MessagesController) this.f16031b).lambda$createChat$260((TLRPC.Updates) this.f16032c);
                return;
            case 28:
                ((MessagesController) this.f16031b).lambda$processUpdateArray$392((TL_update.TL_updateServiceNotification) this.f16032c);
                return;
            default:
                ((MessagesController) this.f16031b).lambda$processUpdateArray$393((TLRPC.Message) this.f16032c);
                return;
        }
    }
}
