package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;

public final class FileLoader$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;

    public FileLoader$$ExternalSyntheticLambda5(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((FileLoader) this.f$0).lambda$changePriority$11((String) this.f$1, this.f$2);
                break;
            case 1:
                ((ImageLoader) this.f$0).lambda$runHttpFileLoadTasks$14((ImageLoader.HttpFileTask) this.f$1, this.f$2);
                break;
            case 2:
                ((MediaDataController.AnonymousClass1) this.f$0).lambda$run$0((Runnable) this.f$1, this.f$2);
                break;
            case 3:
                ((DownloadController) this.f$0).lambda$onDownloadFail$8((MessageObject) this.f$1, this.f$2);
                break;
            case 4:
                ((ImageLoader) this.f$0).lambda$changeFileLoadingPriorityForImageReceiver$3((ImageReceiver) this.f$1, this.f$2);
                break;
            case 5:
                ((LocationController) this.f$0).lambda$saveSharingLocation$18(this.f$2, (LocationController.SharingLocationInfo) this.f$1);
                break;
            case 6:
                ((MediaDataController) this.f$0).lambda$putPremiumPromoToCache$10((TLRPC.TL_help_premiumPromo) this.f$1, this.f$2);
                break;
            case 7:
                ((MediaDataController) this.f$0).lambda$addRecentSticker$23(this.f$2, (TLRPC.Document) this.f$1);
                break;
            case 8:
                ((MediaDataController) this.f$0).lambda$updateEmojiStatuses$234(this.f$2, (TL_account.TL_emojiStatuses) this.f$1);
                break;
            case 9:
                ((MediaDataController) this.f$0).lambda$toggleStickerSetInternal$116((TLRPC.StickerSet) this.f$1, this.f$2);
                break;
            case 10:
                ((MediaDataController) this.f$0).lambda$loadStickers$93(this.f$2, (Utilities.Callback) this.f$1);
                break;
            case 11:
                ((MessagesController) this.f$0).lambda$checkCanOpenChat$454(this.f$2, (BaseFragment) this.f$1);
                break;
            case 12:
                ((MessagesController) this.f$0).lambda$loadGlobalNotificationsSettings$200((TLObject) this.f$1, this.f$2);
                break;
            case 13:
                ((MessagesController) this.f$0).lambda$migrateDialogs$214((TLRPC.messages_Dialogs) this.f$1, this.f$2);
                break;
            case 14:
                ((MessagesController) this.f$0).lambda$toggleChatNoForwards$276((Utilities.Callback2) this.f$1, this.f$2);
                break;
            case 15:
                ((MessagesController.DialogPhotos) this.f$0).lambda$loadCache$4(this.f$2, (HashMap) this.f$1);
                break;
            case 16:
                ((MessagesStorage) this.f$0).lambda$markMessageAsSendError$209(this.f$2, (TLRPC.Message) this.f$1);
                break;
            case 17:
                ((MessagesStorage) this.f$0).lambda$broadcastScheduledMessagesChange$222((Long) this.f$1, this.f$2);
                break;
            case 18:
                ((MessagesStorage) this.f$0).lambda$putDialogs$253((TLRPC.messages_Dialogs) this.f$1, this.f$2);
                break;
            case 19:
                ((NotificationCenter) this.f$0).lambda$postNotificationNameOnUIThread$1(this.f$2, (Object[]) this.f$1);
                break;
            case 20:
                ((NotificationsController) this.f$0).lambda$processNewMessages$25((ArrayList) this.f$1, this.f$2);
                break;
            case 21:
                ((SecretChatHelper) this.f$0).lambda$performSendEncryptedRequest$4((TLRPC.Message) this.f$1, this.f$2);
                break;
            default:
                ((UserNameResolver) this.f$0).lambda$resolve$2((String) this.f$1, this.f$2);
                break;
        }
    }

    public FileLoader$$ExternalSyntheticLambda5(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }
}
