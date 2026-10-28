package org.telegram.messenger;

import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class k2 implements Runnable {
    public final int f20475a;
    public final Object f20476b;
    public final Object f20477c;

    public k2(int i10, Object obj, Object obj2) {
        this.f20475a = i10;
        this.f20476b = obj;
        this.f20477c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f20475a) {
            case 0:
                ((FactCheckController) this.f20476b).lambda$applyFactCheck$14((TLRPC.Updates) this.f20477c);
                return;
            case 1:
                FactCheckController.lambda$saveToDatabase$6((MessagesStorage) this.f20476b, (TLRPC.TL_factCheck) this.f20477c);
                return;
            case 2:
                ((FileLoadOperation) this.f20476b).lambda$start$12((boolean[]) this.f20477c);
                return;
            case 3:
                ((FileLoadOperation) this.f20476b).lambda$addPart$3((ArrayList) this.f20477c);
                return;
            case 4:
                ((FileLoader) this.f20476b).lambda$uploadFile$21((NotificationCenter.NotificationCenterDelegate[]) this.f20477c);
                return;
            case 5:
                ((FileLoader) this.f20476b).lambda$checkCurrentDownloadsFiles$19((ArrayList) this.f20477c);
                return;
            case 6:
                FileLog.lambda$e$3((String) this.f20476b, (Throwable) this.f20477c);
                return;
            case 7:
                ((FilePathDatabase) this.f20476b).lambda$removeFiles$6((List) this.f20477c);
                return;
            case 8:
                ((FileRefController) this.f20476b).lambda$onRequestComplete$47((TLRPC.User) this.f20477c);
                return;
            case 9:
                ((FileRefController) this.f20476b).lambda$onRequestComplete$50((TLRPC.TL_messages_stickerSet) this.f20477c);
                return;
            case 10:
                ((GiftAuctionController) this.f20476b).lambda$sendBid$7((TLRPC.TL_payments_paymentResult) this.f20477c);
                return;
            case 11:
                ((ImageLoader) this.f20476b).lambda$checkMediaPaths$1((Runnable) this.f20477c);
                return;
            case 12:
                ImageLoader.lambda$checkMediaPaths$0((SparseArray) this.f20476b, (Runnable) this.f20477c);
                return;
            case 13:
                ((MediaController) this.f20476b).lambda$playEmojiSound$17((File) this.f20477c);
                return;
            case 14:
                MediaController.lambda$playEmojiSound$18((AccountInstance) this.f20476b, (TLRPC.TL_document) this.f20477c);
                return;
            case 15:
                ((MediaController) this.f20476b).lambda$processMediaObserver$6((ArrayList) this.f20477c);
                return;
            case 16:
                ((MediaController) this.f20476b).lambda$startAudioAgain$7((MessageObject) this.f20477c);
                return;
            case 17:
                MediaDataController.lambda$loadReplyMessagesForMessages$172((AtomicInteger) this.f20476b, (Runnable) this.f20477c);
                return;
            case 18:
                MediaDataController.lambda$fillWithAnimatedEmoji$229((boolean[]) this.f20476b, (d7) this.f20477c);
                return;
            case 19:
                ((MediaDataController) this.f20476b).lambda$loadGroupStickerSet$44((TLRPC.StickerSet) this.f20477c);
                return;
            case 20:
                ((MediaDataController) this.f20476b).lambda$loadHints$147((TLRPC.TL_contacts_topPeers) this.f20477c);
                return;
            case 21:
                ((MessageObject) this.f20476b).lambda$loadAnimatedEmojiDocument$0((TLRPC.Document) this.f20477c);
                return;
            case 22:
                MessagesController.lambda$setCustomChatReactions$474((Utilities.Callback) this.f20476b, (TLRPC.TL_error) this.f20477c);
                return;
            case 23:
                ((MessagesController) this.f20476b).lambda$processUpdateArray$418((TL_update.TL_updateChannel) this.f20477c);
                return;
            case 24:
                ((MessagesController) this.f20476b).lambda$createChat$256((TLRPC.TL_messages_invitedUsers) this.f20477c);
                return;
            case 25:
                ((MessagesController) this.f20476b).lambda$requestContactToken$481((Utilities.Callback) this.f20477c);
                return;
            case 26:
                ((MessagesController) this.f20476b).lambda$processMessageIDUpdate$378((TL_update.TL_updateMessageID) this.f20477c);
                return;
            case 27:
                ((MessagesController) this.f20476b).lambda$createChat$259((TLRPC.Updates) this.f20477c);
                return;
            case 28:
                ((MessagesController) this.f20476b).lambda$checkTosUpdate$161((TLRPC.TL_help_termsOfServiceUpdate) this.f20477c);
                return;
            default:
                ((MessagesController) this.f20476b).lambda$processUpdateArray$397((TL_update.TL_updateServiceNotification) this.f20477c);
                return;
        }
    }
}
