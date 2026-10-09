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
    public final int f19007a;
    public final int f19008b;
    public final Object f19009c;
    public final Object d;

    public r4(Object obj, int i10, Object obj2, int i11) {
        this.f19007a = i11;
        this.f19009c = obj;
        this.f19008b = i10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19007a) {
            case 0:
                ((ImageLoader) this.f19009c).lambda$runHttpFileLoadTasks$14((ImageLoader.HttpFileTask) this.d, this.f19008b);
                return;
            case 1:
                ((MediaDataController.AnonymousClass1) this.f19009c).lambda$run$0((Runnable) this.d, this.f19008b);
                return;
            case 2:
                ((DownloadController) this.f19009c).lambda$onDownloadFail$8((MessageObject) this.d, this.f19008b);
                return;
            case 3:
                ((FileLoader) this.f19009c).lambda$changePriority$11((String) this.d, this.f19008b);
                return;
            case 4:
                ((ImageLoader) this.f19009c).lambda$changeFileLoadingPriorityForImageReceiver$3((ImageReceiver) this.d, this.f19008b);
                return;
            case 5:
                ((LocationController) this.f19009c).lambda$saveSharingLocation$18(this.f19008b, (LocationController.SharingLocationInfo) this.d);
                return;
            case 6:
                ((MediaDataController) this.f19009c).lambda$putPremiumPromoToCache$10((TLRPC.TL_help_premiumPromo) this.d, this.f19008b);
                return;
            case 7:
                ((MediaDataController) this.f19009c).lambda$addRecentSticker$23(this.f19008b, (TLRPC.Document) this.d);
                return;
            case 8:
                ((MediaDataController) this.f19009c).lambda$updateEmojiStatuses$235(this.f19008b, (TL_account.TL_emojiStatuses) this.d);
                return;
            case 9:
                ((MediaDataController) this.f19009c).lambda$toggleStickerSetInternal$116((TLRPC.StickerSet) this.d, this.f19008b);
                return;
            case 10:
                ((MediaDataController) this.f19009c).lambda$loadStickers$93(this.f19008b, (Utilities.Callback) this.d);
                return;
            case 11:
                ((MessagesController) this.f19009c).lambda$checkCanOpenChat$457(this.f19008b, (org.telegram.ui.ActionBar.n2) this.d);
                return;
            case 12:
                ((MessagesController) this.f19009c).lambda$migrateDialogs$213((TLRPC.messages_Dialogs) this.d, this.f19008b);
                return;
            case 13:
                ((MessagesController) this.f19009c).lambda$toggleChatNoForwards$275((Utilities.Callback2) this.d, this.f19008b);
                return;
            case 14:
                ((MessagesController) this.f19009c).lambda$loadGlobalNotificationsSettings$199((TLObject) this.d, this.f19008b);
                return;
            case 15:
                ((MessagesController.DialogPhotos) this.f19009c).lambda$loadCache$4(this.f19008b, (HashMap) this.d);
                return;
            case 16:
                ((MessagesStorage) this.f19009c).lambda$markMessageAsSendError$209(this.f19008b, (TLRPC.Message) this.d);
                return;
            case 17:
                ((MessagesStorage) this.f19009c).lambda$broadcastScheduledMessagesChange$222((Long) this.d, this.f19008b);
                return;
            case 18:
                ((MessagesStorage) this.f19009c).lambda$putDialogs$253((TLRPC.messages_Dialogs) this.d, this.f19008b);
                return;
            case 19:
                ((NotificationCenter) this.f19009c).lambda$postNotificationNameOnUIThread$1(this.f19008b, (Object[]) this.d);
                return;
            case 20:
                ((NotificationsController) this.f19009c).lambda$processNewMessages$26((ArrayList) this.d, this.f19008b);
                return;
            case 21:
                ((SecretChatHelper) this.f19009c).lambda$performSendEncryptedRequest$4((TLRPC.Message) this.d, this.f19008b);
                return;
            case 22:
                ((TelegramMediaSession) this.f19009c).lambda$loadChats$5((MessagesStorage) this.d, this.f19008b);
                return;
            default:
                UserNameResolver.c((UserNameResolver) this.f19009c, (String) this.d, this.f19008b);
                return;
        }
    }

    public r4(Object obj, Object obj2, int i10, int i11) {
        this.f19007a = i11;
        this.f19009c = obj;
        this.d = obj2;
        this.f19008b = i10;
    }
}
