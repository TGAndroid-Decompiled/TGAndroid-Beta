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
    public final int f19858a;
    public final Object f19859b;
    public final Object f19860c;

    public c2(int i10, Object obj, Object obj2) {
        this.f19858a = i10;
        this.f19859b = obj;
        this.f19860c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19858a) {
            case 0:
                ((DownloadController) this.f19859b).lambda$deleteRecentFiles$13((ArrayList) this.f19860c);
                return;
            case 1:
                ((DownloadController) this.f19859b).lambda$loadAutoDownloadConfig$1((TLObject) this.f19860c);
                return;
            case 2:
                ((FactCheckController) this.f19859b).lambda$applyFactCheck$14((TLRPC.Updates) this.f19860c);
                return;
            case 3:
                FactCheckController.lambda$saveToDatabase$6((MessagesStorage) this.f19859b, (TLRPC.TL_factCheck) this.f19860c);
                return;
            case 4:
                ((FileLoadOperation) this.f19859b).lambda$start$11((boolean[]) this.f19860c);
                return;
            case 5:
                ((FileLoadOperation) this.f19859b).lambda$addPart$2((ArrayList) this.f19860c);
                return;
            case 6:
                ((FileLoader) this.f19859b).lambda$uploadFile$19((NotificationCenter.NotificationCenterDelegate[]) this.f19860c);
                return;
            case 7:
                ((FileLoader) this.f19859b).lambda$checkCurrentDownloadsFiles$17((ArrayList) this.f19860c);
                return;
            case 8:
                FileLog.lambda$e$2((String) this.f19859b, (Throwable) this.f19860c);
                return;
            case 9:
                ((FilePathDatabase) this.f19859b).lambda$removeFiles$6((List) this.f19860c);
                return;
            case 10:
                ((FileRefController) this.f19859b).lambda$onRequestComplete$47((TLRPC.User) this.f19860c);
                return;
            case 11:
                ((FileRefController) this.f19859b).lambda$onRequestComplete$50((TLRPC.TL_messages_stickerSet) this.f19860c);
                return;
            case 12:
                ((GiftAuctionController) this.f19859b).lambda$sendBid$7((TLRPC.TL_payments_paymentResult) this.f19860c);
                return;
            case 13:
                ((ImageLoader) this.f19859b).lambda$checkMediaPaths$1((Runnable) this.f19860c);
                return;
            case 14:
                ImageLoader.lambda$checkMediaPaths$0((SparseArray) this.f19859b, (Runnable) this.f19860c);
                return;
            case 15:
                ((MediaController) this.f19859b).lambda$playEmojiSound$17((File) this.f19860c);
                return;
            case 16:
                ((MediaController) this.f19859b).lambda$processMediaObserver$6((ArrayList) this.f19860c);
                return;
            case 17:
                MediaController.lambda$playEmojiSound$18((AccountInstance) this.f19859b, (TLRPC.TL_document) this.f19860c);
                return;
            case 18:
                ((MediaController) this.f19859b).lambda$startAudioAgain$7((MessageObject) this.f19860c);
                return;
            case 19:
                ((MediaDataController) this.f19859b).lambda$loadHints$147((TLRPC.TL_contacts_topPeers) this.f19860c);
                return;
            case 20:
                MediaDataController.lambda$loadReplyMessagesForMessages$172((AtomicInteger) this.f19859b, (Runnable) this.f19860c);
                return;
            case 21:
                MediaDataController.lambda$fillWithAnimatedEmoji$228((boolean[]) this.f19859b, (w6) this.f19860c);
                return;
            case 22:
                ((MediaDataController) this.f19859b).lambda$loadGroupStickerSet$44((TLRPC.StickerSet) this.f19860c);
                return;
            case 23:
                ((MessageObject) this.f19859b).lambda$loadAnimatedEmojiDocument$0((TLRPC.Document) this.f19860c);
                return;
            case 24:
                ((MessagesController) this.f19859b).lambda$getDifference$351((TLRPC.updates_Difference) this.f19860c);
                return;
            case 25:
                ((MessagesController) this.f19859b).lambda$requestContactToken$475((Utilities.Callback) this.f19860c);
                return;
            case 26:
                ((MessagesController) this.f19859b).lambda$checkTosUpdate$162((TLRPC.TL_help_termsOfServiceUpdate) this.f19860c);
                return;
            case 27:
                ((MessagesController) this.f19859b).lambda$changeChatAvatar$318((Runnable) this.f19860c);
                return;
            case 28:
                ((MessagesController) this.f19859b).lambda$createChat$260((TLRPC.Updates) this.f19860c);
                return;
            default:
                ((MessagesController) this.f19859b).lambda$processUpdateArray$392((TL_update.TL_updateServiceNotification) this.f19860c);
                return;
        }
    }
}
