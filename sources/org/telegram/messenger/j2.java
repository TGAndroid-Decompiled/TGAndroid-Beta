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
public final class j2 implements Runnable {
    public final int f18733a;
    public final Object f18734b;
    public final Object f18735c;

    public j2(int i10, Object obj, Object obj2) {
        this.f18733a = i10;
        this.f18734b = obj;
        this.f18735c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18733a) {
            case 0:
                ((FactCheckController) this.f18734b).lambda$applyFactCheck$14((TLRPC.Updates) this.f18735c);
                return;
            case 1:
                FactCheckController.lambda$saveToDatabase$6((MessagesStorage) this.f18734b, (TLRPC.TL_factCheck) this.f18735c);
                return;
            case 2:
                ((FileLoadOperation) this.f18734b).lambda$start$12((boolean[]) this.f18735c);
                return;
            case 3:
                ((FileLoadOperation) this.f18734b).lambda$addPart$3((ArrayList) this.f18735c);
                return;
            case 4:
                ((FileLoader) this.f18734b).lambda$uploadFile$21((NotificationCenter.NotificationCenterDelegate[]) this.f18735c);
                return;
            case 5:
                ((FileLoader) this.f18734b).lambda$checkCurrentDownloadsFiles$19((ArrayList) this.f18735c);
                return;
            case 6:
                FileLog.lambda$e$3((String) this.f18734b, (Throwable) this.f18735c);
                return;
            case 7:
                ((FilePathDatabase) this.f18734b).lambda$removeFiles$6((List) this.f18735c);
                return;
            case 8:
                ((FileRefController) this.f18734b).lambda$onRequestComplete$47((TLRPC.User) this.f18735c);
                return;
            case 9:
                ((FileRefController) this.f18734b).lambda$onRequestComplete$50((TLRPC.TL_messages_stickerSet) this.f18735c);
                return;
            case 10:
                ((GiftAuctionController) this.f18734b).lambda$sendBid$7((TLRPC.TL_payments_paymentResult) this.f18735c);
                return;
            case 11:
                ((ImageLoader) this.f18734b).lambda$checkMediaPaths$1((Runnable) this.f18735c);
                return;
            case 12:
                ImageLoader.lambda$checkMediaPaths$0((SparseArray) this.f18734b, (Runnable) this.f18735c);
                return;
            case 13:
                ((MediaController) this.f18734b).lambda$playEmojiSound$17((File) this.f18735c);
                return;
            case 14:
                MediaController.lambda$playEmojiSound$18((AccountInstance) this.f18734b, (TLRPC.TL_document) this.f18735c);
                return;
            case 15:
                ((MediaController) this.f18734b).lambda$processMediaObserver$6((ArrayList) this.f18735c);
                return;
            case 16:
                ((MediaController) this.f18734b).lambda$startAudioAgain$7((MessageObject) this.f18735c);
                return;
            case 17:
                MediaDataController.lambda$loadReplyMessagesForMessages$172((AtomicInteger) this.f18734b, (Runnable) this.f18735c);
                return;
            case 18:
                MediaDataController.lambda$fillWithAnimatedEmoji$229((boolean[]) this.f18734b, (a7) this.f18735c);
                return;
            case 19:
                ((MediaDataController) this.f18734b).lambda$loadGroupStickerSet$44((TLRPC.StickerSet) this.f18735c);
                return;
            case 20:
                ((MediaDataController) this.f18734b).lambda$loadHints$147((TLRPC.TL_contacts_topPeers) this.f18735c);
                return;
            case 21:
                ((MessageObject) this.f18734b).lambda$loadAnimatedEmojiDocument$0((TLRPC.Document) this.f18735c);
                return;
            case 22:
                ((MessagesController) this.f18734b).lambda$processUpdateArray$415((TL_update.TL_updateChannel) this.f18735c);
                return;
            case 23:
                ((MessagesController) this.f18734b).lambda$createChat$256((TLRPC.TL_messages_invitedUsers) this.f18735c);
                return;
            case 24:
                ((MessagesController) this.f18734b).lambda$processMessageIDUpdate$376((TL_update.TL_updateMessageID) this.f18735c);
                return;
            case 25:
                ((MessagesController) this.f18734b).lambda$createChat$259((TLRPC.Updates) this.f18735c);
                return;
            case 26:
                MessagesController.lambda$addUserToChat$298((Utilities.Callback) this.f18734b, (Runnable) this.f18735c);
                return;
            case 27:
                ((MessagesController) this.f18734b).lambda$checkChatInviter$370((TLRPC.TL_channels_channelParticipant) this.f18735c);
                return;
            case 28:
                ((MessagesController) this.f18734b).lambda$checkTosUpdate$161((TLRPC.TL_help_termsOfServiceUpdate) this.f18735c);
                return;
            default:
                ((MessagesController) this.f18734b).lambda$processUpdateArray$395((TL_update.TL_updateServiceNotification) this.f18735c);
                return;
        }
    }
}
