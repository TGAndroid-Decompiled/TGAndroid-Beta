package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class p4 implements Runnable {
    public final int f18702a;
    public final int f18703b;
    public final Object f18704c;
    public final Object d;

    public p4(Object obj, int i10, Object obj2, int i11) {
        this.f18702a = i11;
        this.f18704c = obj;
        this.f18703b = i10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18702a) {
            case 0:
                ((ImageLoader) this.f18704c).lambda$runHttpFileLoadTasks$14((ImageLoader.HttpFileTask) this.d, this.f18703b);
                return;
            case 1:
                ((MediaDataController.AnonymousClass1) this.f18704c).lambda$run$0((Runnable) this.d, this.f18703b);
                return;
            case 2:
                ((DownloadController) this.f18704c).lambda$onDownloadFail$8((MessageObject) this.d, this.f18703b);
                return;
            case 3:
                ((FileLoader) this.f18704c).lambda$changePriority$11((String) this.d, this.f18703b);
                return;
            case 4:
                ((ImageLoader) this.f18704c).lambda$changeFileLoadingPriorityForImageReceiver$3((ImageReceiver) this.d, this.f18703b);
                return;
            case 5:
                ((LocationController) this.f18704c).lambda$saveSharingLocation$18(this.f18703b, (LocationController.SharingLocationInfo) this.d);
                return;
            case 6:
                ((MediaDataController) this.f18704c).lambda$putPremiumPromoToCache$10((TLRPC.TL_help_premiumPromo) this.d, this.f18703b);
                return;
            case 7:
                ((MediaDataController) this.f18704c).lambda$addRecentSticker$23(this.f18703b, (TLRPC.Document) this.d);
                return;
            case 8:
                ((MediaDataController) this.f18704c).lambda$updateEmojiStatuses$234(this.f18703b, (TL_account.TL_emojiStatuses) this.d);
                return;
            case 9:
                ((MediaDataController) this.f18704c).lambda$toggleStickerSetInternal$116((TLRPC.StickerSet) this.d, this.f18703b);
                return;
            case 10:
                ((MediaDataController) this.f18704c).lambda$loadStickers$93(this.f18703b, (Utilities.Callback) this.d);
                return;
            case 11:
                ((MessagesController) this.f18704c).lambda$checkCanOpenChat$454(this.f18703b, (org.telegram.ui.ActionBar.n2) this.d);
                return;
            case 12:
                ((MessagesController) this.f18704c).lambda$loadGlobalNotificationsSettings$200((TLObject) this.d, this.f18703b);
                return;
            case 13:
                ((MessagesController) this.f18704c).lambda$migrateDialogs$214((TLRPC.messages_Dialogs) this.d, this.f18703b);
                return;
            case 14:
                ((MessagesController) this.f18704c).lambda$toggleChatNoForwards$276((Utilities.Callback2) this.d, this.f18703b);
                return;
            case 15:
                ((MessagesController.DialogPhotos) this.f18704c).lambda$loadCache$4(this.f18703b, (HashMap) this.d);
                return;
            case 16:
                ((MessagesStorage) this.f18704c).lambda$markMessageAsSendError$209(this.f18703b, (TLRPC.Message) this.d);
                return;
            case 17:
                ((MessagesStorage) this.f18704c).lambda$broadcastScheduledMessagesChange$222((Long) this.d, this.f18703b);
                return;
            case 18:
                ((MessagesStorage) this.f18704c).lambda$putDialogs$253((TLRPC.messages_Dialogs) this.d, this.f18703b);
                return;
            case 19:
                ((NotificationCenter) this.f18704c).lambda$postNotificationNameOnUIThread$1(this.f18703b, (Object[]) this.d);
                return;
            case 20:
                ((NotificationsController) this.f18704c).lambda$processNewMessages$25((ArrayList) this.d, this.f18703b);
                return;
            case 21:
                ((SecretChatHelper) this.f18704c).lambda$performSendEncryptedRequest$4((TLRPC.Message) this.d, this.f18703b);
                return;
            default:
                UserNameResolver.c((UserNameResolver) this.f18704c, (String) this.d, this.f18703b);
                return;
        }
    }

    public p4(Object obj, Object obj2, int i10, int i11) {
        this.f18702a = i11;
        this.f18704c = obj;
        this.d = obj2;
        this.f18703b = i10;
    }
}
