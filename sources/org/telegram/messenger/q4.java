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
public final class q4 implements Runnable {
    public final int f17345a;
    public final int f17346b;
    public final Object f17347c;
    public final Object d;

    public q4(Object obj, int i10, Object obj2, int i11) {
        this.f17345a = i11;
        this.f17347c = obj;
        this.f17346b = i10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17345a) {
            case 0:
                ((ImageLoader) this.f17347c).lambda$runHttpFileLoadTasks$14((ImageLoader.HttpFileTask) this.d, this.f17346b);
                return;
            case 1:
                ((MediaDataController.AnonymousClass1) this.f17347c).lambda$run$0((Runnable) this.d, this.f17346b);
                return;
            case 2:
                ((DownloadController) this.f17347c).lambda$onDownloadFail$8((MessageObject) this.d, this.f17346b);
                return;
            case 3:
                ((FileLoader) this.f17347c).lambda$changePriority$11((String) this.d, this.f17346b);
                return;
            case 4:
                ((ImageLoader) this.f17347c).lambda$changeFileLoadingPriorityForImageReceiver$3((ImageReceiver) this.d, this.f17346b);
                return;
            case 5:
                ((LocationController) this.f17347c).lambda$saveSharingLocation$18(this.f17346b, (LocationController.SharingLocationInfo) this.d);
                return;
            case 6:
                ((MediaDataController) this.f17347c).lambda$putPremiumPromoToCache$10((TLRPC.TL_help_premiumPromo) this.d, this.f17346b);
                return;
            case 7:
                ((MediaDataController) this.f17347c).lambda$addRecentSticker$23(this.f17346b, (TLRPC.Document) this.d);
                return;
            case 8:
                ((MediaDataController) this.f17347c).lambda$updateEmojiStatuses$234(this.f17346b, (TL_account.TL_emojiStatuses) this.d);
                return;
            case 9:
                ((MediaDataController) this.f17347c).lambda$toggleStickerSetInternal$116((TLRPC.StickerSet) this.d, this.f17346b);
                return;
            case 10:
                ((MediaDataController) this.f17347c).lambda$loadStickers$93(this.f17346b, (Utilities.Callback) this.d);
                return;
            case 11:
                ((MessagesController) this.f17347c).lambda$checkCanOpenChat$454(this.f17346b, (org.telegram.ui.ActionBar.n2) this.d);
                return;
            case 12:
                ((MessagesController) this.f17347c).lambda$loadGlobalNotificationsSettings$200((TLObject) this.d, this.f17346b);
                return;
            case 13:
                ((MessagesController) this.f17347c).lambda$migrateDialogs$214((TLRPC.messages_Dialogs) this.d, this.f17346b);
                return;
            case 14:
                ((MessagesController) this.f17347c).lambda$toggleChatNoForwards$276((Utilities.Callback2) this.d, this.f17346b);
                return;
            case 15:
                ((MessagesController.DialogPhotos) this.f17347c).lambda$loadCache$4(this.f17346b, (HashMap) this.d);
                return;
            case 16:
                ((MessagesStorage) this.f17347c).lambda$markMessageAsSendError$209(this.f17346b, (TLRPC.Message) this.d);
                return;
            case 17:
                ((MessagesStorage) this.f17347c).lambda$broadcastScheduledMessagesChange$222((Long) this.d, this.f17346b);
                return;
            case 18:
                ((MessagesStorage) this.f17347c).lambda$putDialogs$253((TLRPC.messages_Dialogs) this.d, this.f17346b);
                return;
            case 19:
                ((NotificationCenter) this.f17347c).lambda$postNotificationNameOnUIThread$1(this.f17346b, (Object[]) this.d);
                return;
            case 20:
                ((NotificationsController) this.f17347c).lambda$processNewMessages$25((ArrayList) this.d, this.f17346b);
                return;
            case 21:
                ((SecretChatHelper) this.f17347c).lambda$performSendEncryptedRequest$4((TLRPC.Message) this.d, this.f17346b);
                return;
            default:
                UserNameResolver.c((UserNameResolver) this.f17347c, (String) this.d, this.f17346b);
                return;
        }
    }

    public q4(Object obj, Object obj2, int i10, int i11) {
        this.f17345a = i11;
        this.f17347c = obj;
        this.d = obj2;
        this.f17346b = i10;
    }
}
