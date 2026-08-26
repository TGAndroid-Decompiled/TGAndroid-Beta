package org.telegram.messenger;

import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

public final class FileLog$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public FileLog$$ExternalSyntheticLambda3(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                FileLog.lambda$e$2((String) this.f$0, (Throwable) this.f$1);
                break;
            case 1:
                ((DownloadController) this.f$0).lambda$deleteRecentFiles$13((ArrayList) this.f$1);
                break;
            case 2:
                ((FactCheckController) this.f$0).lambda$applyFactCheck$14((TLRPC.Updates) this.f$1);
                break;
            case 3:
                FactCheckController.lambda$saveToDatabase$6((MessagesStorage) this.f$0, (TLRPC.TL_factCheck) this.f$1);
                break;
            case 4:
                ((FileLoadOperation) this.f$0).lambda$start$11((boolean[]) this.f$1);
                break;
            case 5:
                ((FileLoadOperation) this.f$0).lambda$addPart$2((ArrayList) this.f$1);
                break;
            case 6:
                ((FileLoader) this.f$0).lambda$uploadFile$19((NotificationCenter.NotificationCenterDelegate[]) this.f$1);
                break;
            case 7:
                ((FileLoader) this.f$0).lambda$checkCurrentDownloadsFiles$17((ArrayList) this.f$1);
                break;
            case 8:
                ((FilePathDatabase) this.f$0).lambda$removeFiles$6((List) this.f$1);
                break;
            case 9:
                ((FileRefController) this.f$0).lambda$onRequestComplete$47((TLRPC.User) this.f$1);
                break;
            case 10:
                ((FileRefController) this.f$0).lambda$onRequestComplete$50((TLRPC.TL_messages_stickerSet) this.f$1);
                break;
            case 11:
                ((GiftAuctionController) this.f$0).lambda$sendBid$7((TLRPC.TL_payments_paymentResult) this.f$1);
                break;
            case 12:
                ((ImageLoader) this.f$0).lambda$checkMediaPaths$1((Runnable) this.f$1);
                break;
            case 13:
                ImageLoader.lambda$checkMediaPaths$0((SparseArray) this.f$0, (Runnable) this.f$1);
                break;
            case 14:
                ((MediaController) this.f$0).lambda$processMediaObserver$6((ArrayList) this.f$1);
                break;
            case 15:
                ((MediaController) this.f$0).lambda$startAudioAgain$7((MessageObject) this.f$1);
                break;
            case 16:
                ((MediaController) this.f$0).lambda$playEmojiSound$17((File) this.f$1);
                break;
            case 17:
                MediaController.lambda$playEmojiSound$18((AccountInstance) this.f$0, (TLRPC.TL_document) this.f$1);
                break;
            case 18:
                ((MediaDataController) this.f$0).lambda$loadHints$147((TLRPC.TL_contacts_topPeers) this.f$1);
                break;
            case 19:
                MediaDataController.lambda$loadReplyMessagesForMessages$172((AtomicInteger) this.f$0, (Runnable) this.f$1);
                break;
            case 20:
                MediaDataController.lambda$fillWithAnimatedEmoji$228((boolean[]) this.f$0, (MessagesController$$ExternalSyntheticLambda69) this.f$1);
                break;
            case 21:
                ((MediaDataController) this.f$0).lambda$loadGroupStickerSet$44((TLRPC.StickerSet) this.f$1);
                break;
            case 22:
                ((MessageObject) this.f$0).lambda$loadAnimatedEmojiDocument$0((TLRPC.Document) this.f$1);
                break;
            case 23:
                ((MessagesController) this.f$0).lambda$getDifference$351((TLRPC.updates_Difference) this.f$1);
                break;
            case 24:
                ((MessagesController) this.f$0).lambda$requestContactToken$475((Utilities.Callback) this.f$1);
                break;
            case 25:
                ((MessagesController) this.f$0).lambda$checkTosUpdate$162((TLRPC.TL_help_termsOfServiceUpdate) this.f$1);
                break;
            case 26:
                ((MessagesController) this.f$0).lambda$changeChatAvatar$318((Runnable) this.f$1);
                break;
            case 27:
                ((MessagesController) this.f$0).lambda$createChat$260((TLRPC.Updates) this.f$1);
                break;
            case 28:
                ((MessagesController) this.f$0).lambda$processUpdateArray$386((TL_update.TL_updateUserTyping) this.f$1);
                break;
            default:
                ((MessagesController) this.f$0).lambda$processUpdateArray$387((TL_update.TL_updateChatUserTyping) this.f$1);
                break;
        }
    }
}
