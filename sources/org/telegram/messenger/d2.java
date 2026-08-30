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
    public final int f17018a;
    public final Object f17019b;
    public final Object f17020c;

    public d2(int i10, Object obj, Object obj2) {
        this.f17018a = i10;
        this.f17019b = obj;
        this.f17020c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17018a) {
            case 0:
                ((DownloadController) this.f17019b).lambda$deleteRecentFiles$13((ArrayList) this.f17020c);
                return;
            case 1:
                ((DownloadController) this.f17019b).lambda$loadAutoDownloadConfig$1((TLObject) this.f17020c);
                return;
            case 2:
                ((FactCheckController) this.f17019b).lambda$applyFactCheck$14((TLRPC.Updates) this.f17020c);
                return;
            case 3:
                FactCheckController.lambda$saveToDatabase$6((MessagesStorage) this.f17019b, (TLRPC.TL_factCheck) this.f17020c);
                return;
            case 4:
                ((FileLoadOperation) this.f17019b).lambda$start$11((boolean[]) this.f17020c);
                return;
            case 5:
                ((FileLoadOperation) this.f17019b).lambda$addPart$2((ArrayList) this.f17020c);
                return;
            case 6:
                ((FileLoader) this.f17019b).lambda$uploadFile$19((NotificationCenter.NotificationCenterDelegate[]) this.f17020c);
                return;
            case 7:
                ((FileLoader) this.f17019b).lambda$checkCurrentDownloadsFiles$17((ArrayList) this.f17020c);
                return;
            case 8:
                FileLog.lambda$e$2((String) this.f17019b, (Throwable) this.f17020c);
                return;
            case 9:
                ((FilePathDatabase) this.f17019b).lambda$removeFiles$6((List) this.f17020c);
                return;
            case 10:
                ((FileRefController) this.f17019b).lambda$onRequestComplete$47((TLRPC.User) this.f17020c);
                return;
            case 11:
                ((FileRefController) this.f17019b).lambda$onRequestComplete$50((TLRPC.TL_messages_stickerSet) this.f17020c);
                return;
            case 12:
                ((GiftAuctionController) this.f17019b).lambda$sendBid$7((TLRPC.TL_payments_paymentResult) this.f17020c);
                return;
            case 13:
                ((ImageLoader) this.f17019b).lambda$checkMediaPaths$1((Runnable) this.f17020c);
                return;
            case 14:
                ImageLoader.lambda$checkMediaPaths$0((SparseArray) this.f17019b, (Runnable) this.f17020c);
                return;
            case 15:
                ((MediaController) this.f17019b).lambda$playEmojiSound$17((File) this.f17020c);
                return;
            case 16:
                MediaController.lambda$playEmojiSound$18((AccountInstance) this.f17019b, (TLRPC.TL_document) this.f17020c);
                return;
            case 17:
                ((MediaController) this.f17019b).lambda$processMediaObserver$6((ArrayList) this.f17020c);
                return;
            case 18:
                ((MediaController) this.f17019b).lambda$startAudioAgain$7((MessageObject) this.f17020c);
                return;
            case 19:
                ((MediaDataController) this.f17019b).lambda$loadHints$147((TLRPC.TL_contacts_topPeers) this.f17020c);
                return;
            case 20:
                MediaDataController.lambda$loadReplyMessagesForMessages$172((AtomicInteger) this.f17019b, (Runnable) this.f17020c);
                return;
            case 21:
                MediaDataController.lambda$fillWithAnimatedEmoji$228((boolean[]) this.f17019b, (x6) this.f17020c);
                return;
            case 22:
                ((MediaDataController) this.f17019b).lambda$loadGroupStickerSet$44((TLRPC.StickerSet) this.f17020c);
                return;
            case 23:
                ((MessageObject) this.f17019b).lambda$loadAnimatedEmojiDocument$0((TLRPC.Document) this.f17020c);
                return;
            case 24:
                ((MessagesController) this.f17019b).lambda$getDifference$351((TLRPC.updates_Difference) this.f17020c);
                return;
            case 25:
                ((MessagesController) this.f17019b).lambda$requestContactToken$475((Utilities.Callback) this.f17020c);
                return;
            case 26:
                ((MessagesController) this.f17019b).lambda$checkTosUpdate$162((TLRPC.TL_help_termsOfServiceUpdate) this.f17020c);
                return;
            case 27:
                ((MessagesController) this.f17019b).lambda$changeChatAvatar$318((Runnable) this.f17020c);
                return;
            case 28:
                ((MessagesController) this.f17019b).lambda$createChat$260((TLRPC.Updates) this.f17020c);
                return;
            default:
                ((MessagesController) this.f17019b).lambda$processUpdateArray$392((TL_update.TL_updateServiceNotification) this.f17020c);
                return;
        }
    }
}
