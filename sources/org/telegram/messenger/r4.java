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
public final class r4 implements Runnable {
    public final int f21403a;
    public final int f21404b;
    public final Object f21405c;
    public final Object d;

    public r4(Object obj, int i10, Object obj2, int i11) {
        this.f21403a = i11;
        this.f21405c = obj;
        this.f21404b = i10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f21403a) {
            case 0:
                ((ImageLoader) this.f21405c).lambda$runHttpFileLoadTasks$14((ImageLoader.HttpFileTask) this.d, this.f21404b);
                return;
            case 1:
                ((MediaDataController.AnonymousClass1) this.f21405c).lambda$run$0((Runnable) this.d, this.f21404b);
                return;
            case 2:
                ((DownloadController) this.f21405c).lambda$onDownloadFail$8((MessageObject) this.d, this.f21404b);
                return;
            case 3:
                ((FileLoader) this.f21405c).lambda$changePriority$11((String) this.d, this.f21404b);
                return;
            case 4:
                ((ImageLoader) this.f21405c).lambda$changeFileLoadingPriorityForImageReceiver$3((ImageReceiver) this.d, this.f21404b);
                return;
            case 5:
                ((LocationController) this.f21405c).lambda$saveSharingLocation$18(this.f21404b, (LocationController.SharingLocationInfo) this.d);
                return;
            case 6:
                ((MediaDataController) this.f21405c).lambda$putPremiumPromoToCache$10((TLRPC.TL_help_premiumPromo) this.d, this.f21404b);
                return;
            case 7:
                ((MediaDataController) this.f21405c).lambda$addRecentSticker$23(this.f21404b, (TLRPC.Document) this.d);
                return;
            case 8:
                ((MediaDataController) this.f21405c).lambda$updateEmojiStatuses$234(this.f21404b, (TL_account.TL_emojiStatuses) this.d);
                return;
            case 9:
                ((MediaDataController) this.f21405c).lambda$toggleStickerSetInternal$116((TLRPC.StickerSet) this.d, this.f21404b);
                return;
            case 10:
                ((MediaDataController) this.f21405c).lambda$loadStickers$93(this.f21404b, (Utilities.Callback) this.d);
                return;
            case 11:
                ((MessagesController) this.f21405c).lambda$checkCanOpenChat$454(this.f21404b, (org.telegram.ui.ActionBar.o2) this.d);
                return;
            case 12:
                ((MessagesController) this.f21405c).lambda$loadGlobalNotificationsSettings$200((TLObject) this.d, this.f21404b);
                return;
            case 13:
                ((MessagesController) this.f21405c).lambda$migrateDialogs$214((TLRPC.messages_Dialogs) this.d, this.f21404b);
                return;
            case 14:
                ((MessagesController) this.f21405c).lambda$toggleChatNoForwards$276((Utilities.Callback2) this.d, this.f21404b);
                return;
            case 15:
                ((MessagesController.DialogPhotos) this.f21405c).lambda$loadCache$4(this.f21404b, (HashMap) this.d);
                return;
            case 16:
                ((MessagesStorage) this.f21405c).lambda$markMessageAsSendError$209(this.f21404b, (TLRPC.Message) this.d);
                return;
            case 17:
                ((MessagesStorage) this.f21405c).lambda$broadcastScheduledMessagesChange$222((Long) this.d, this.f21404b);
                return;
            case 18:
                ((MessagesStorage) this.f21405c).lambda$putDialogs$253((TLRPC.messages_Dialogs) this.d, this.f21404b);
                return;
            case 19:
                ((NotificationCenter) this.f21405c).lambda$postNotificationNameOnUIThread$1(this.f21404b, (Object[]) this.d);
                return;
            case 20:
                ((NotificationsController) this.f21405c).lambda$processNewMessages$25((ArrayList) this.d, this.f21404b);
                return;
            case 21:
                ((SecretChatHelper) this.f21405c).lambda$performSendEncryptedRequest$4((TLRPC.Message) this.d, this.f21404b);
                return;
            default:
                UserNameResolver.c((UserNameResolver) this.f21405c, (String) this.d, this.f21404b);
                return;
        }
    }

    public r4(Object obj, Object obj2, int i10, int i11) {
        this.f21403a = i11;
        this.f21405c = obj;
        this.d = obj2;
        this.f21404b = i10;
    }
}
