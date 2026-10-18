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
public final class i2 implements Runnable {
    public final int f18572a;
    public final Object f18573b;
    public final Object f18574c;

    public i2(int i10, Object obj, Object obj2) {
        this.f18572a = i10;
        this.f18573b = obj;
        this.f18574c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18572a) {
            case 0:
                ((FactCheckController) this.f18573b).lambda$applyFactCheck$14((TLRPC.Updates) this.f18574c);
                return;
            case 1:
                FactCheckController.lambda$saveToDatabase$6((MessagesStorage) this.f18573b, (TLRPC.TL_factCheck) this.f18574c);
                return;
            case 2:
                ((FileLoadOperation) this.f18573b).lambda$start$12((boolean[]) this.f18574c);
                return;
            case 3:
                ((FileLoadOperation) this.f18573b).lambda$addPart$3((ArrayList) this.f18574c);
                return;
            case 4:
                ((FileLoader) this.f18573b).lambda$uploadFile$19((NotificationCenter.NotificationCenterDelegate[]) this.f18574c);
                return;
            case 5:
                ((FileLoader) this.f18573b).lambda$checkCurrentDownloadsFiles$17((ArrayList) this.f18574c);
                return;
            case 6:
                FileLog.lambda$e$3((String) this.f18573b, (Throwable) this.f18574c);
                return;
            case 7:
                ((FilePathDatabase) this.f18573b).lambda$removeFiles$6((List) this.f18574c);
                return;
            case 8:
                ((FileRefController) this.f18573b).lambda$onRequestComplete$47((TLRPC.User) this.f18574c);
                return;
            case 9:
                ((FileRefController) this.f18573b).lambda$onRequestComplete$50((TLRPC.TL_messages_stickerSet) this.f18574c);
                return;
            case 10:
                ((GiftAuctionController) this.f18573b).lambda$sendBid$7((TLRPC.TL_payments_paymentResult) this.f18574c);
                return;
            case 11:
                ((ImageLoader) this.f18573b).lambda$checkMediaPaths$1((Runnable) this.f18574c);
                return;
            case 12:
                ImageLoader.lambda$checkMediaPaths$0((SparseArray) this.f18573b, (Runnable) this.f18574c);
                return;
            case 13:
                ((MediaController) this.f18573b).lambda$playEmojiSound$17((File) this.f18574c);
                return;
            case 14:
                MediaController.lambda$playEmojiSound$18((AccountInstance) this.f18573b, (TLRPC.TL_document) this.f18574c);
                return;
            case 15:
                ((MediaController) this.f18573b).lambda$processMediaObserver$6((ArrayList) this.f18574c);
                return;
            case 16:
                ((MediaController) this.f18573b).lambda$startAudioAgain$7((MessageObject) this.f18574c);
                return;
            case 17:
                MediaDataController.lambda$loadReplyMessagesForMessages$172((AtomicInteger) this.f18573b, (Runnable) this.f18574c);
                return;
            case 18:
                MediaDataController.lambda$fillWithAnimatedEmoji$229((boolean[]) this.f18573b, (w6) this.f18574c);
                return;
            case 19:
                ((MediaDataController) this.f18573b).lambda$loadGroupStickerSet$44((TLRPC.StickerSet) this.f18574c);
                return;
            case 20:
                ((MediaDataController) this.f18573b).lambda$loadHints$147((TLRPC.TL_contacts_topPeers) this.f18574c);
                return;
            case 21:
                ((MessageObject) this.f18573b).lambda$loadAnimatedEmojiDocument$0((TLRPC.Document) this.f18574c);
                return;
            case 22:
                ((MessagesController) this.f18573b).lambda$processUpdateArray$415((TL_update.TL_updateChannel) this.f18574c);
                return;
            case 23:
                ((MessagesController) this.f18573b).lambda$createChat$256((TLRPC.TL_messages_invitedUsers) this.f18574c);
                return;
            case 24:
                ((MessagesController) this.f18573b).lambda$processMessageIDUpdate$376((TL_update.TL_updateMessageID) this.f18574c);
                return;
            case 25:
                ((MessagesController) this.f18573b).lambda$createChat$259((TLRPC.Updates) this.f18574c);
                return;
            case 26:
                MessagesController.lambda$addUserToChat$298((Utilities.Callback) this.f18573b, (Runnable) this.f18574c);
                return;
            case 27:
                ((MessagesController) this.f18573b).lambda$checkChatInviter$370((TLRPC.TL_channels_channelParticipant) this.f18574c);
                return;
            case 28:
                ((MessagesController) this.f18573b).lambda$checkTosUpdate$161((TLRPC.TL_help_termsOfServiceUpdate) this.f18574c);
                return;
            default:
                ((MessagesController) this.f18573b).lambda$processUpdateArray$395((TL_update.TL_updateServiceNotification) this.f18574c);
                return;
        }
    }
}
