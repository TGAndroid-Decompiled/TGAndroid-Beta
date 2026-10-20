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
public final class v4 implements Runnable {
    public final int f19714a;
    public final int f19715b;
    public final Object f19716c;
    public final Object d;

    public v4(Object obj, int i10, Object obj2, int i11) {
        this.f19714a = i11;
        this.f19716c = obj;
        this.f19715b = i10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19714a) {
            case 0:
                ((ImageLoader) this.f19716c).lambda$runHttpFileLoadTasks$14((ImageLoader.HttpFileTask) this.d, this.f19715b);
                return;
            case 1:
                ((MediaDataController.AnonymousClass1) this.f19716c).lambda$run$0((Runnable) this.d, this.f19715b);
                return;
            case 2:
                ((DownloadController) this.f19716c).lambda$onDownloadFail$8((MessageObject) this.d, this.f19715b);
                return;
            case 3:
                ((FileLoader) this.f19716c).lambda$changePriority$11((String) this.d, this.f19715b);
                return;
            case 4:
                ((ImageLoader) this.f19716c).lambda$changeFileLoadingPriorityForImageReceiver$3((ImageReceiver) this.d, this.f19715b);
                return;
            case 5:
                ((LocationController) this.f19716c).lambda$saveSharingLocation$18(this.f19715b, (LocationController.SharingLocationInfo) this.d);
                return;
            case 6:
                ((MediaDataController) this.f19716c).lambda$putPremiumPromoToCache$10((TLRPC.TL_help_premiumPromo) this.d, this.f19715b);
                return;
            case 7:
                ((MediaDataController) this.f19716c).lambda$addRecentSticker$23(this.f19715b, (TLRPC.Document) this.d);
                return;
            case 8:
                ((MediaDataController) this.f19716c).lambda$updateEmojiStatuses$235(this.f19715b, (TL_account.TL_emojiStatuses) this.d);
                return;
            case 9:
                ((MediaDataController) this.f19716c).lambda$toggleStickerSetInternal$116((TLRPC.StickerSet) this.d, this.f19715b);
                return;
            case 10:
                ((MediaDataController) this.f19716c).lambda$loadStickers$93(this.f19715b, (Utilities.Callback) this.d);
                return;
            case 11:
                ((MessagesController) this.f19716c).lambda$checkCanOpenChat$457(this.f19715b, (org.telegram.ui.ActionBar.n2) this.d);
                return;
            case 12:
                ((MessagesController) this.f19716c).lambda$migrateDialogs$213((TLRPC.messages_Dialogs) this.d, this.f19715b);
                return;
            case 13:
                ((MessagesController) this.f19716c).lambda$toggleChatNoForwards$275((Utilities.Callback2) this.d, this.f19715b);
                return;
            case 14:
                ((MessagesController) this.f19716c).lambda$loadGlobalNotificationsSettings$199((TLObject) this.d, this.f19715b);
                return;
            case 15:
                ((MessagesController.DialogPhotos) this.f19716c).lambda$loadCache$4(this.f19715b, (HashMap) this.d);
                return;
            case 16:
                ((MessagesStorage) this.f19716c).lambda$markMessageAsSendError$209(this.f19715b, (TLRPC.Message) this.d);
                return;
            case 17:
                ((MessagesStorage) this.f19716c).lambda$broadcastScheduledMessagesChange$222((Long) this.d, this.f19715b);
                return;
            case 18:
                ((MessagesStorage) this.f19716c).lambda$putDialogs$253((TLRPC.messages_Dialogs) this.d, this.f19715b);
                return;
            case 19:
                ((NotificationCenter) this.f19716c).lambda$postNotificationNameOnUIThread$1(this.f19715b, (Object[]) this.d);
                return;
            case 20:
                ((NotificationsController) this.f19716c).lambda$processNewMessages$26((ArrayList) this.d, this.f19715b);
                return;
            case 21:
                ((SecretChatHelper) this.f19716c).lambda$performSendEncryptedRequest$4((TLRPC.Message) this.d, this.f19715b);
                return;
            case 22:
                ((TelegramMediaSession) this.f19716c).lambda$loadChats$5((MessagesStorage) this.d, this.f19715b);
                return;
            default:
                UserNameResolver.c((UserNameResolver) this.f19716c, (String) this.d, this.f19715b);
                return;
        }
    }

    public v4(Object obj, Object obj2, int i10, int i11) {
        this.f19714a = i11;
        this.f19716c = obj;
        this.d = obj2;
        this.f19715b = i10;
    }
}
