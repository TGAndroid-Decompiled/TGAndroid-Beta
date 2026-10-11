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
public final class f2 implements Runnable {
    public final int f17838a;
    public final Object f17839b;
    public final Object f17840c;

    public f2(int i10, Object obj, Object obj2) {
        this.f17838a = i10;
        this.f17839b = obj;
        this.f17840c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17838a) {
            case 0:
                ((FactCheckController) this.f17839b).lambda$applyFactCheck$14((TLRPC.Updates) this.f17840c);
                return;
            case 1:
                FactCheckController.lambda$saveToDatabase$6((MessagesStorage) this.f17839b, (TLRPC.TL_factCheck) this.f17840c);
                return;
            case 2:
                ((FileLoadOperation) this.f17839b).lambda$start$12((boolean[]) this.f17840c);
                return;
            case 3:
                ((FileLoadOperation) this.f17839b).lambda$addPart$3((ArrayList) this.f17840c);
                return;
            case 4:
                ((FileLoader) this.f17839b).lambda$uploadFile$19((NotificationCenter.NotificationCenterDelegate[]) this.f17840c);
                return;
            case 5:
                ((FileLoader) this.f17839b).lambda$checkCurrentDownloadsFiles$17((ArrayList) this.f17840c);
                return;
            case 6:
                FileLog.lambda$e$3((String) this.f17839b, (Throwable) this.f17840c);
                return;
            case 7:
                ((FilePathDatabase) this.f17839b).lambda$removeFiles$6((List) this.f17840c);
                return;
            case 8:
                ((FileRefController) this.f17839b).lambda$onRequestComplete$47((TLRPC.User) this.f17840c);
                return;
            case 9:
                ((FileRefController) this.f17839b).lambda$onRequestComplete$50((TLRPC.TL_messages_stickerSet) this.f17840c);
                return;
            case 10:
                ((GiftAuctionController) this.f17839b).lambda$sendBid$7((TLRPC.TL_payments_paymentResult) this.f17840c);
                return;
            case 11:
                ((ImageLoader) this.f17839b).lambda$checkMediaPaths$1((Runnable) this.f17840c);
                return;
            case 12:
                ImageLoader.lambda$checkMediaPaths$0((SparseArray) this.f17839b, (Runnable) this.f17840c);
                return;
            case 13:
                ((MediaController) this.f17839b).lambda$playEmojiSound$17((File) this.f17840c);
                return;
            case 14:
                MediaController.lambda$playEmojiSound$18((AccountInstance) this.f17839b, (TLRPC.TL_document) this.f17840c);
                return;
            case 15:
                ((MediaController) this.f17839b).lambda$processMediaObserver$6((ArrayList) this.f17840c);
                return;
            case 16:
                ((MediaController) this.f17839b).lambda$startAudioAgain$7((MessageObject) this.f17840c);
                return;
            case 17:
                MediaDataController.lambda$loadReplyMessagesForMessages$172((AtomicInteger) this.f17839b, (Runnable) this.f17840c);
                return;
            case 18:
                MediaDataController.lambda$fillWithAnimatedEmoji$229((boolean[]) this.f17839b, (u6) this.f17840c);
                return;
            case 19:
                ((MediaDataController) this.f17839b).lambda$loadGroupStickerSet$44((TLRPC.StickerSet) this.f17840c);
                return;
            case 20:
                ((MediaDataController) this.f17839b).lambda$loadHints$147((TLRPC.TL_contacts_topPeers) this.f17840c);
                return;
            case 21:
                ((MessageObject) this.f17839b).lambda$loadAnimatedEmojiDocument$0((TLRPC.Document) this.f17840c);
                return;
            case 22:
                ((MessagesController) this.f17839b).lambda$processUpdateArray$415((TL_update.TL_updateChannel) this.f17840c);
                return;
            case 23:
                ((MessagesController) this.f17839b).lambda$createChat$256((TLRPC.TL_messages_invitedUsers) this.f17840c);
                return;
            case 24:
                ((MessagesController) this.f17839b).lambda$processMessageIDUpdate$376((TL_update.TL_updateMessageID) this.f17840c);
                return;
            case 25:
                ((MessagesController) this.f17839b).lambda$createChat$259((TLRPC.Updates) this.f17840c);
                return;
            case 26:
                MessagesController.lambda$addUserToChat$298((Utilities.Callback) this.f17839b, (Runnable) this.f17840c);
                return;
            case 27:
                ((MessagesController) this.f17839b).lambda$checkChatInviter$370((TLRPC.TL_channels_channelParticipant) this.f17840c);
                return;
            case 28:
                ((MessagesController) this.f17839b).lambda$checkTosUpdate$161((TLRPC.TL_help_termsOfServiceUpdate) this.f17840c);
                return;
            default:
                ((MessagesController) this.f17839b).lambda$processUpdateArray$395((TL_update.TL_updateServiceNotification) this.f17840c);
                return;
        }
    }
}
