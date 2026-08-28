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
    public final int f19905a;
    public final Object f19906b;
    public final Object f19907c;

    public c2(int i9, Object obj, Object obj2) {
        this.f19905a = i9;
        this.f19906b = obj;
        this.f19907c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19905a) {
            case 0:
                ((DownloadController) this.f19906b).lambda$loadAutoDownloadConfig$1((TLObject) this.f19907c);
                return;
            case 1:
                ((FactCheckController) this.f19906b).lambda$applyFactCheck$14((TLRPC.Updates) this.f19907c);
                return;
            case 2:
                FactCheckController.lambda$saveToDatabase$6((MessagesStorage) this.f19906b, (TLRPC.TL_factCheck) this.f19907c);
                return;
            case 3:
                ((FileLoadOperation) this.f19906b).lambda$start$11((boolean[]) this.f19907c);
                return;
            case 4:
                ((FileLoadOperation) this.f19906b).lambda$addPart$2((ArrayList) this.f19907c);
                return;
            case 5:
                ((FileLoader) this.f19906b).lambda$uploadFile$19((NotificationCenter.NotificationCenterDelegate[]) this.f19907c);
                return;
            case 6:
                ((FileLoader) this.f19906b).lambda$checkCurrentDownloadsFiles$17((ArrayList) this.f19907c);
                return;
            case 7:
                FileLog.lambda$e$2((String) this.f19906b, (Throwable) this.f19907c);
                return;
            case 8:
                ((FilePathDatabase) this.f19906b).lambda$removeFiles$6((List) this.f19907c);
                return;
            case 9:
                ((FileRefController) this.f19906b).lambda$onRequestComplete$47((TLRPC.User) this.f19907c);
                return;
            case 10:
                ((FileRefController) this.f19906b).lambda$onRequestComplete$50((TLRPC.TL_messages_stickerSet) this.f19907c);
                return;
            case 11:
                ((GiftAuctionController) this.f19906b).lambda$sendBid$7((TLRPC.TL_payments_paymentResult) this.f19907c);
                return;
            case 12:
                ((ImageLoader) this.f19906b).lambda$checkMediaPaths$1((Runnable) this.f19907c);
                return;
            case 13:
                ImageLoader.lambda$checkMediaPaths$0((SparseArray) this.f19906b, (Runnable) this.f19907c);
                return;
            case 14:
                ((MediaController) this.f19906b).lambda$playEmojiSound$17((File) this.f19907c);
                return;
            case 15:
                ((MediaController) this.f19906b).lambda$processMediaObserver$6((ArrayList) this.f19907c);
                return;
            case 16:
                MediaController.lambda$playEmojiSound$18((AccountInstance) this.f19906b, (TLRPC.TL_document) this.f19907c);
                return;
            case 17:
                ((MediaController) this.f19906b).lambda$startAudioAgain$7((MessageObject) this.f19907c);
                return;
            case 18:
                ((MediaDataController) this.f19906b).lambda$loadHints$147((TLRPC.TL_contacts_topPeers) this.f19907c);
                return;
            case 19:
                MediaDataController.lambda$loadReplyMessagesForMessages$172((AtomicInteger) this.f19906b, (Runnable) this.f19907c);
                return;
            case 20:
                MediaDataController.lambda$fillWithAnimatedEmoji$228((boolean[]) this.f19906b, (s6) this.f19907c);
                return;
            case 21:
                ((MediaDataController) this.f19906b).lambda$loadGroupStickerSet$44((TLRPC.StickerSet) this.f19907c);
                return;
            case 22:
                ((MessageObject) this.f19906b).lambda$loadAnimatedEmojiDocument$0((TLRPC.Document) this.f19907c);
                return;
            case 23:
                ((MessagesController) this.f19906b).lambda$getDifference$351((TLRPC.updates_Difference) this.f19907c);
                return;
            case 24:
                ((MessagesController) this.f19906b).lambda$requestContactToken$475((Utilities.Callback) this.f19907c);
                return;
            case 25:
                ((MessagesController) this.f19906b).lambda$checkTosUpdate$162((TLRPC.TL_help_termsOfServiceUpdate) this.f19907c);
                return;
            case 26:
                ((MessagesController) this.f19906b).lambda$changeChatAvatar$318((Runnable) this.f19907c);
                return;
            case 27:
                ((MessagesController) this.f19906b).lambda$createChat$260((TLRPC.Updates) this.f19907c);
                return;
            case 28:
                ((MessagesController) this.f19906b).lambda$processUpdateArray$392((TL_update.TL_updateServiceNotification) this.f19907c);
                return;
            default:
                ((MessagesController) this.f19906b).lambda$processUpdateArray$393((TLRPC.Message) this.f19907c);
                return;
        }
    }
}
