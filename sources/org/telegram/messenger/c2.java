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
    public final int f17472a;
    public final Object f17473b;
    public final Object f17474c;

    public c2(int i10, Object obj, Object obj2) {
        this.f17472a = i10;
        this.f17473b = obj;
        this.f17474c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17472a) {
            case 0:
                ((DownloadController) this.f17473b).lambda$loadAutoDownloadConfig$1((TLObject) this.f17474c);
                return;
            case 1:
                ((FactCheckController) this.f17473b).lambda$applyFactCheck$14((TLRPC.Updates) this.f17474c);
                return;
            case 2:
                FactCheckController.lambda$saveToDatabase$6((MessagesStorage) this.f17473b, (TLRPC.TL_factCheck) this.f17474c);
                return;
            case 3:
                ((FileLoadOperation) this.f17473b).lambda$start$12((boolean[]) this.f17474c);
                return;
            case 4:
                ((FileLoadOperation) this.f17473b).lambda$addPart$3((ArrayList) this.f17474c);
                return;
            case 5:
                ((FileLoader) this.f17473b).lambda$uploadFile$19((NotificationCenter.NotificationCenterDelegate[]) this.f17474c);
                return;
            case 6:
                ((FileLoader) this.f17473b).lambda$checkCurrentDownloadsFiles$17((ArrayList) this.f17474c);
                return;
            case 7:
                FileLog.lambda$e$3((String) this.f17473b, (Throwable) this.f17474c);
                return;
            case 8:
                ((FilePathDatabase) this.f17473b).lambda$removeFiles$6((List) this.f17474c);
                return;
            case 9:
                ((FileRefController) this.f17473b).lambda$onRequestComplete$47((TLRPC.User) this.f17474c);
                return;
            case 10:
                ((FileRefController) this.f17473b).lambda$onRequestComplete$50((TLRPC.TL_messages_stickerSet) this.f17474c);
                return;
            case 11:
                ((GiftAuctionController) this.f17473b).lambda$sendBid$7((TLRPC.TL_payments_paymentResult) this.f17474c);
                return;
            case 12:
                ((ImageLoader) this.f17473b).lambda$checkMediaPaths$1((Runnable) this.f17474c);
                return;
            case 13:
                ImageLoader.lambda$checkMediaPaths$0((SparseArray) this.f17473b, (Runnable) this.f17474c);
                return;
            case 14:
                ((MediaController) this.f17473b).lambda$playEmojiSound$17((File) this.f17474c);
                return;
            case 15:
                MediaController.lambda$playEmojiSound$18((AccountInstance) this.f17473b, (TLRPC.TL_document) this.f17474c);
                return;
            case 16:
                ((MediaController) this.f17473b).lambda$processMediaObserver$6((ArrayList) this.f17474c);
                return;
            case 17:
                ((MediaController) this.f17473b).lambda$startAudioAgain$7((MessageObject) this.f17474c);
                return;
            case 18:
                MediaDataController.lambda$loadReplyMessagesForMessages$172((AtomicInteger) this.f17473b, (Runnable) this.f17474c);
                return;
            case 19:
                MediaDataController.lambda$fillWithAnimatedEmoji$229((boolean[]) this.f17473b, (u6) this.f17474c);
                return;
            case 20:
                ((MediaDataController) this.f17473b).lambda$loadGroupStickerSet$44((TLRPC.StickerSet) this.f17474c);
                return;
            case 21:
                ((MediaDataController) this.f17473b).lambda$loadHints$147((TLRPC.TL_contacts_topPeers) this.f17474c);
                return;
            case 22:
                ((MessageObject) this.f17473b).lambda$loadAnimatedEmojiDocument$0((TLRPC.Document) this.f17474c);
                return;
            case 23:
                ((MessagesController) this.f17473b).lambda$processUpdateArray$415((TL_update.TL_updateChannel) this.f17474c);
                return;
            case 24:
                ((MessagesController) this.f17473b).lambda$createChat$256((TLRPC.TL_messages_invitedUsers) this.f17474c);
                return;
            case 25:
                ((MessagesController) this.f17473b).lambda$processMessageIDUpdate$376((TL_update.TL_updateMessageID) this.f17474c);
                return;
            case 26:
                ((MessagesController) this.f17473b).lambda$createChat$259((TLRPC.Updates) this.f17474c);
                return;
            case 27:
                MessagesController.lambda$addUserToChat$298((Utilities.Callback) this.f17473b, (Runnable) this.f17474c);
                return;
            case 28:
                ((MessagesController) this.f17473b).lambda$checkChatInviter$370((TLRPC.TL_channels_channelParticipant) this.f17474c);
                return;
            default:
                ((MessagesController) this.f17473b).lambda$checkTosUpdate$161((TLRPC.TL_help_termsOfServiceUpdate) this.f17474c);
                return;
        }
    }
}
