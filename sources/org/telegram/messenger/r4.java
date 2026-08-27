package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class r4 implements Runnable {

    public final int f21405a;

    public final int f21406b;

    public final Object f21407c;
    public final Object d;

    public r4(Object obj, int i10, Object obj2, int i11) {
        this.f21405a = i11;
        this.f21407c = obj;
        this.f21406b = i10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f21405a) {
            case 0:
                ((ImageLoader) this.f21407c).lambda$runHttpFileLoadTasks$14((ImageLoader.HttpFileTask) this.d, this.f21406b);
                break;
            case 1:
                ((MediaDataController.AnonymousClass1) this.f21407c).lambda$run$0((Runnable) this.d, this.f21406b);
                break;
            case 2:
                ((DownloadController) this.f21407c).lambda$onDownloadFail$8((MessageObject) this.d, this.f21406b);
                break;
            case 3:
                ((FileLoader) this.f21407c).lambda$changePriority$11((String) this.d, this.f21406b);
                break;
            case 4:
                ((ImageLoader) this.f21407c).lambda$changeFileLoadingPriorityForImageReceiver$3((ImageReceiver) this.d, this.f21406b);
                break;
            case 5:
                ((LocationController) this.f21407c).lambda$saveSharingLocation$18(this.f21406b, (LocationController.SharingLocationInfo) this.d);
                break;
            case 6:
                ((MediaDataController) this.f21407c).lambda$putPremiumPromoToCache$10((TLRPC.TL_help_premiumPromo) this.d, this.f21406b);
                break;
            case 7:
                ((MediaDataController) this.f21407c).lambda$addRecentSticker$23(this.f21406b, (TLRPC.Document) this.d);
                break;
            case 8:
                ((MediaDataController) this.f21407c).lambda$updateEmojiStatuses$234(this.f21406b, (TL_account.TL_emojiStatuses) this.d);
                break;
            case 9:
                ((MediaDataController) this.f21407c).lambda$toggleStickerSetInternal$116((TLRPC.StickerSet) this.d, this.f21406b);
                break;
            case 10:
                ((MediaDataController) this.f21407c).lambda$loadStickers$93(this.f21406b, (Utilities.Callback) this.d);
                break;
            case 11:
                ((MessagesController) this.f21407c).lambda$checkCanOpenChat$454(this.f21406b, (org.telegram.ui.ActionBar.n2) this.d);
                break;
            case 12:
                ((MessagesController) this.f21407c).lambda$loadGlobalNotificationsSettings$200((TLObject) this.d, this.f21406b);
                break;
            case 13:
                ((MessagesController) this.f21407c).lambda$migrateDialogs$214((TLRPC.messages_Dialogs) this.d, this.f21406b);
                break;
            case 14:
                ((MessagesController) this.f21407c).lambda$toggleChatNoForwards$276((Utilities.Callback2) this.d, this.f21406b);
                break;
            case 15:
                ((MessagesController.DialogPhotos) this.f21407c).lambda$loadCache$4(this.f21406b, (HashMap) this.d);
                break;
            case 16:
                ((MessagesStorage) this.f21407c).lambda$markMessageAsSendError$209(this.f21406b, (TLRPC.Message) this.d);
                break;
            case 17:
                ((MessagesStorage) this.f21407c).lambda$broadcastScheduledMessagesChange$222((Long) this.d, this.f21406b);
                break;
            case 18:
                ((MessagesStorage) this.f21407c).lambda$putDialogs$253((TLRPC.messages_Dialogs) this.d, this.f21406b);
                break;
            case 19:
                ((NotificationCenter) this.f21407c).lambda$postNotificationNameOnUIThread$1(this.f21406b, (Object[]) this.d);
                break;
            case 20:
                ((NotificationsController) this.f21407c).lambda$processNewMessages$25((ArrayList) this.d, this.f21406b);
                break;
            case 21:
                ((SecretChatHelper) this.f21407c).lambda$performSendEncryptedRequest$4((TLRPC.Message) this.d, this.f21406b);
                break;
            default:
                ((UserNameResolver) this.f21407c).lambda$resolve$2((String) this.d, this.f21406b);
                break;
        }
    }

    public r4(Object obj, Object obj2, int i10, int i11) {
        this.f21405a = i11;
        this.f21407c = obj;
        this.d = obj2;
        this.f21406b = i10;
    }
}
