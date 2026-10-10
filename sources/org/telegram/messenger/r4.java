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
    public final int f19011a;
    public final int f19012b;
    public final Object f19013c;
    public final Object d;

    public r4(Object obj, int i10, Object obj2, int i11) {
        this.f19011a = i11;
        this.f19013c = obj;
        this.f19012b = i10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19011a) {
            case 0:
                ((ImageLoader) this.f19013c).lambda$runHttpFileLoadTasks$14((ImageLoader.HttpFileTask) this.d, this.f19012b);
                return;
            case 1:
                ((MediaDataController.AnonymousClass1) this.f19013c).lambda$run$0((Runnable) this.d, this.f19012b);
                return;
            case 2:
                ((DownloadController) this.f19013c).lambda$onDownloadFail$8((MessageObject) this.d, this.f19012b);
                return;
            case 3:
                ((FileLoader) this.f19013c).lambda$changePriority$11((String) this.d, this.f19012b);
                return;
            case 4:
                ((ImageLoader) this.f19013c).lambda$changeFileLoadingPriorityForImageReceiver$3((ImageReceiver) this.d, this.f19012b);
                return;
            case 5:
                ((LocationController) this.f19013c).lambda$saveSharingLocation$18(this.f19012b, (LocationController.SharingLocationInfo) this.d);
                return;
            case 6:
                ((MediaDataController) this.f19013c).lambda$putPremiumPromoToCache$10((TLRPC.TL_help_premiumPromo) this.d, this.f19012b);
                return;
            case 7:
                ((MediaDataController) this.f19013c).lambda$addRecentSticker$23(this.f19012b, (TLRPC.Document) this.d);
                return;
            case 8:
                ((MediaDataController) this.f19013c).lambda$updateEmojiStatuses$235(this.f19012b, (TL_account.TL_emojiStatuses) this.d);
                return;
            case 9:
                ((MediaDataController) this.f19013c).lambda$toggleStickerSetInternal$116((TLRPC.StickerSet) this.d, this.f19012b);
                return;
            case 10:
                ((MediaDataController) this.f19013c).lambda$loadStickers$93(this.f19012b, (Utilities.Callback) this.d);
                return;
            case 11:
                ((MessagesController) this.f19013c).lambda$checkCanOpenChat$457(this.f19012b, (org.telegram.ui.ActionBar.n2) this.d);
                return;
            case 12:
                ((MessagesController) this.f19013c).lambda$migrateDialogs$213((TLRPC.messages_Dialogs) this.d, this.f19012b);
                return;
            case 13:
                ((MessagesController) this.f19013c).lambda$toggleChatNoForwards$275((Utilities.Callback2) this.d, this.f19012b);
                return;
            case 14:
                ((MessagesController) this.f19013c).lambda$loadGlobalNotificationsSettings$199((TLObject) this.d, this.f19012b);
                return;
            case 15:
                ((MessagesController.DialogPhotos) this.f19013c).lambda$loadCache$4(this.f19012b, (HashMap) this.d);
                return;
            case 16:
                ((MessagesStorage) this.f19013c).lambda$markMessageAsSendError$209(this.f19012b, (TLRPC.Message) this.d);
                return;
            case 17:
                ((MessagesStorage) this.f19013c).lambda$broadcastScheduledMessagesChange$222((Long) this.d, this.f19012b);
                return;
            case 18:
                ((MessagesStorage) this.f19013c).lambda$putDialogs$253((TLRPC.messages_Dialogs) this.d, this.f19012b);
                return;
            case 19:
                ((NotificationCenter) this.f19013c).lambda$postNotificationNameOnUIThread$1(this.f19012b, (Object[]) this.d);
                return;
            case 20:
                ((NotificationsController) this.f19013c).lambda$processNewMessages$26((ArrayList) this.d, this.f19012b);
                return;
            case 21:
                ((SecretChatHelper) this.f19013c).lambda$performSendEncryptedRequest$4((TLRPC.Message) this.d, this.f19012b);
                return;
            case 22:
                ((TelegramMediaSession) this.f19013c).lambda$loadChats$5((MessagesStorage) this.d, this.f19012b);
                return;
            default:
                UserNameResolver.c((UserNameResolver) this.f19013c, (String) this.d, this.f19012b);
                return;
        }
    }

    public r4(Object obj, Object obj2, int i10, int i11) {
        this.f19011a = i11;
        this.f19013c = obj;
        this.d = obj2;
        this.f19012b = i10;
    }
}
