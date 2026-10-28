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
public final class y4 implements Runnable {
    public final int f21880a;
    public final int f21881b;
    public final Object f21882c;
    public final Object d;

    public y4(Object obj, int i10, Object obj2, int i11) {
        this.f21880a = i11;
        this.f21882c = obj;
        this.f21881b = i10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f21880a) {
            case 0:
                ((ImageLoader) this.f21882c).lambda$runHttpFileLoadTasks$14((ImageLoader.HttpFileTask) this.d, this.f21881b);
                return;
            case 1:
                ((MediaDataController.AnonymousClass1) this.f21882c).lambda$run$0((Runnable) this.d, this.f21881b);
                return;
            case 2:
                ((DownloadController) this.f21882c).lambda$onDownloadFail$8((MessageObject) this.d, this.f21881b);
                return;
            case 3:
                ((FileLoader) this.f21882c).lambda$changePriority$11((String) this.d, this.f21881b);
                return;
            case 4:
                ((ImageLoader) this.f21882c).lambda$changeFileLoadingPriorityForImageReceiver$3((ImageReceiver) this.d, this.f21881b);
                return;
            case 5:
                ((LocationController) this.f21882c).lambda$saveSharingLocation$18(this.f21881b, (LocationController.SharingLocationInfo) this.d);
                return;
            case 6:
                ((MediaDataController) this.f21882c).lambda$putPremiumPromoToCache$10((TLRPC.TL_help_premiumPromo) this.d, this.f21881b);
                return;
            case 7:
                ((MediaDataController) this.f21882c).lambda$addRecentSticker$23(this.f21881b, (TLRPC.Document) this.d);
                return;
            case 8:
                ((MediaDataController) this.f21882c).lambda$updateEmojiStatuses$235(this.f21881b, (TL_account.TL_emojiStatuses) this.d);
                return;
            case 9:
                ((MediaDataController) this.f21882c).lambda$toggleStickerSetInternal$116((TLRPC.StickerSet) this.d, this.f21881b);
                return;
            case 10:
                ((MediaDataController) this.f21882c).lambda$loadStickers$93(this.f21881b, (Utilities.Callback) this.d);
                return;
            case 11:
                ((MessagesController) this.f21882c).lambda$checkCanOpenChat$460(this.f21881b, (org.telegram.ui.ActionBar.r2) this.d);
                return;
            case 12:
                ((MessagesController) this.f21882c).lambda$migrateDialogs$213((TLRPC.messages_Dialogs) this.d, this.f21881b);
                return;
            case 13:
                ((MessagesController) this.f21882c).lambda$toggleChatNoForwards$275((Utilities.Callback2) this.d, this.f21881b);
                return;
            case 14:
                ((MessagesController) this.f21882c).lambda$loadGlobalNotificationsSettings$199((TLObject) this.d, this.f21881b);
                return;
            case 15:
                ((MessagesController.DialogPhotos) this.f21882c).lambda$loadCache$4(this.f21881b, (HashMap) this.d);
                return;
            case 16:
                ((MessagesStorage) this.f21882c).lambda$markMessageAsSendError$213(this.f21881b, (TLRPC.Message) this.d);
                return;
            case 17:
                ((MessagesStorage) this.f21882c).lambda$broadcastScheduledMessagesChange$226((Long) this.d, this.f21881b);
                return;
            case 18:
                ((MessagesStorage) this.f21882c).lambda$putDialogs$257((TLRPC.messages_Dialogs) this.d, this.f21881b);
                return;
            case 19:
                ((NotificationCenter) this.f21882c).lambda$postNotificationNameOnUIThread$1(this.f21881b, (Object[]) this.d);
                return;
            case 20:
                ((NotificationsController) this.f21882c).lambda$processNewMessages$26((ArrayList) this.d, this.f21881b);
                return;
            case 21:
                ((SecretChatHelper) this.f21882c).lambda$performSendEncryptedRequest$4((TLRPC.Message) this.d, this.f21881b);
                return;
            case 22:
                ((TelegramMediaSession) this.f21882c).lambda$loadChats$5((MessagesStorage) this.d, this.f21881b);
                return;
            default:
                UserNameResolver.c((UserNameResolver) this.f21882c, (String) this.d, this.f21881b);
                return;
        }
    }

    public y4(Object obj, Object obj2, int i10, int i11) {
        this.f21880a = i11;
        this.f21882c = obj;
        this.d = obj2;
        this.f21881b = i10;
    }
}
