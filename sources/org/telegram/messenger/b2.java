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
public final class b2 implements Runnable {
    public final int f15704a;
    public final Object f15705b;
    public final Object f15706c;

    public b2(int i10, Object obj, Object obj2) {
        this.f15704a = i10;
        this.f15705b = obj;
        this.f15706c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f15704a) {
            case 0:
                ((DownloadController) this.f15705b).lambda$loadAutoDownloadConfig$1((TLObject) this.f15706c);
                return;
            case 1:
                ((FactCheckController) this.f15705b).lambda$applyFactCheck$14((TLRPC.Updates) this.f15706c);
                return;
            case 2:
                FactCheckController.lambda$saveToDatabase$6((MessagesStorage) this.f15705b, (TLRPC.TL_factCheck) this.f15706c);
                return;
            case 3:
                ((FileLoadOperation) this.f15705b).lambda$start$11((boolean[]) this.f15706c);
                return;
            case 4:
                ((FileLoadOperation) this.f15705b).lambda$addPart$2((ArrayList) this.f15706c);
                return;
            case 5:
                ((FileLoader) this.f15705b).lambda$uploadFile$19((NotificationCenter.NotificationCenterDelegate[]) this.f15706c);
                return;
            case 6:
                ((FileLoader) this.f15705b).lambda$checkCurrentDownloadsFiles$17((ArrayList) this.f15706c);
                return;
            case 7:
                FileLog.lambda$e$2((String) this.f15705b, (Throwable) this.f15706c);
                return;
            case 8:
                ((FilePathDatabase) this.f15705b).lambda$removeFiles$6((List) this.f15706c);
                return;
            case 9:
                ((FileRefController) this.f15705b).lambda$onRequestComplete$47((TLRPC.User) this.f15706c);
                return;
            case 10:
                ((FileRefController) this.f15705b).lambda$onRequestComplete$50((TLRPC.TL_messages_stickerSet) this.f15706c);
                return;
            case 11:
                ((GiftAuctionController) this.f15705b).lambda$sendBid$7((TLRPC.TL_payments_paymentResult) this.f15706c);
                return;
            case 12:
                ((ImageLoader) this.f15705b).lambda$checkMediaPaths$1((Runnable) this.f15706c);
                return;
            case 13:
                ImageLoader.lambda$checkMediaPaths$0((SparseArray) this.f15705b, (Runnable) this.f15706c);
                return;
            case 14:
                ((MediaController) this.f15705b).lambda$playEmojiSound$17((File) this.f15706c);
                return;
            case 15:
                MediaController.lambda$playEmojiSound$18((AccountInstance) this.f15705b, (TLRPC.TL_document) this.f15706c);
                return;
            case 16:
                ((MediaController) this.f15705b).lambda$processMediaObserver$6((ArrayList) this.f15706c);
                return;
            case 17:
                ((MediaController) this.f15705b).lambda$startAudioAgain$7((MessageObject) this.f15706c);
                return;
            case 18:
                ((MediaDataController) this.f15705b).lambda$loadHints$147((TLRPC.TL_contacts_topPeers) this.f15706c);
                return;
            case 19:
                MediaDataController.lambda$loadReplyMessagesForMessages$172((AtomicInteger) this.f15705b, (Runnable) this.f15706c);
                return;
            case 20:
                MediaDataController.lambda$fillWithAnimatedEmoji$228((boolean[]) this.f15705b, (t6) this.f15706c);
                return;
            case 21:
                ((MediaDataController) this.f15705b).lambda$loadGroupStickerSet$44((TLRPC.StickerSet) this.f15706c);
                return;
            case 22:
                ((MessageObject) this.f15705b).lambda$loadAnimatedEmojiDocument$0((TLRPC.Document) this.f15706c);
                return;
            case 23:
                ((MessagesController) this.f15705b).lambda$getDifference$351((TLRPC.updates_Difference) this.f15706c);
                return;
            case 24:
                ((MessagesController) this.f15705b).lambda$requestContactToken$475((Utilities.Callback) this.f15706c);
                return;
            case 25:
                ((MessagesController) this.f15705b).lambda$checkTosUpdate$162((TLRPC.TL_help_termsOfServiceUpdate) this.f15706c);
                return;
            case 26:
                ((MessagesController) this.f15705b).lambda$changeChatAvatar$318((Runnable) this.f15706c);
                return;
            case 27:
                ((MessagesController) this.f15705b).lambda$createChat$260((TLRPC.Updates) this.f15706c);
                return;
            case 28:
                ((MessagesController) this.f15705b).lambda$processUpdateArray$392((TL_update.TL_updateServiceNotification) this.f15706c);
                return;
            default:
                ((MessagesController) this.f15705b).lambda$processUpdateArray$393((TLRPC.Message) this.f15706c);
                return;
        }
    }
}
