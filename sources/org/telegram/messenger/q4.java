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
    public final int f18948a;
    public final int f18949b;
    public final Object f18950c;
    public final Object d;

    public q4(Object obj, int i10, Object obj2, int i11) {
        this.f18948a = i11;
        this.f18950c = obj;
        this.f18949b = i10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18948a) {
            case 0:
                ((ImageLoader) this.f18950c).lambda$runHttpFileLoadTasks$14((ImageLoader.HttpFileTask) this.d, this.f18949b);
                return;
            case 1:
                ((MediaDataController.AnonymousClass1) this.f18950c).lambda$run$0((Runnable) this.d, this.f18949b);
                return;
            case 2:
                ((DownloadController) this.f18950c).lambda$onDownloadFail$8((MessageObject) this.d, this.f18949b);
                return;
            case 3:
                ((FileLoader) this.f18950c).lambda$changePriority$11((String) this.d, this.f18949b);
                return;
            case 4:
                ((ImageLoader) this.f18950c).lambda$changeFileLoadingPriorityForImageReceiver$3((ImageReceiver) this.d, this.f18949b);
                return;
            case 5:
                ((LocationController) this.f18950c).lambda$saveSharingLocation$18(this.f18949b, (LocationController.SharingLocationInfo) this.d);
                return;
            case 6:
                ((MediaDataController) this.f18950c).lambda$putPremiumPromoToCache$10((TLRPC.TL_help_premiumPromo) this.d, this.f18949b);
                return;
            case 7:
                ((MediaDataController) this.f18950c).lambda$addRecentSticker$23(this.f18949b, (TLRPC.Document) this.d);
                return;
            case 8:
                ((MediaDataController) this.f18950c).lambda$updateEmojiStatuses$235(this.f18949b, (TL_account.TL_emojiStatuses) this.d);
                return;
            case 9:
                ((MediaDataController) this.f18950c).lambda$toggleStickerSetInternal$116((TLRPC.StickerSet) this.d, this.f18949b);
                return;
            case 10:
                ((MediaDataController) this.f18950c).lambda$loadStickers$93(this.f18949b, (Utilities.Callback) this.d);
                return;
            case 11:
                ((MessagesController) this.f18950c).lambda$checkCanOpenChat$454(this.f18949b, (org.telegram.ui.ActionBar.n2) this.d);
                return;
            case 12:
                ((MessagesController) this.f18950c).lambda$loadGlobalNotificationsSettings$200((TLObject) this.d, this.f18949b);
                return;
            case 13:
                ((MessagesController) this.f18950c).lambda$migrateDialogs$214((TLRPC.messages_Dialogs) this.d, this.f18949b);
                return;
            case 14:
                ((MessagesController) this.f18950c).lambda$toggleChatNoForwards$276((Utilities.Callback2) this.d, this.f18949b);
                return;
            case 15:
                ((MessagesController.DialogPhotos) this.f18950c).lambda$loadCache$4(this.f18949b, (HashMap) this.d);
                return;
            case 16:
                ((MessagesStorage) this.f18950c).lambda$markMessageAsSendError$209(this.f18949b, (TLRPC.Message) this.d);
                return;
            case 17:
                ((MessagesStorage) this.f18950c).lambda$broadcastScheduledMessagesChange$222((Long) this.d, this.f18949b);
                return;
            case 18:
                ((MessagesStorage) this.f18950c).lambda$putDialogs$253((TLRPC.messages_Dialogs) this.d, this.f18949b);
                return;
            case 19:
                ((NotificationCenter) this.f18950c).lambda$postNotificationNameOnUIThread$1(this.f18949b, (Object[]) this.d);
                return;
            case 20:
                ((NotificationsController) this.f18950c).lambda$processNewMessages$25((ArrayList) this.d, this.f18949b);
                return;
            case 21:
                ((SecretChatHelper) this.f18950c).lambda$performSendEncryptedRequest$4((TLRPC.Message) this.d, this.f18949b);
                return;
            case 22:
                ((TelegramMediaSession) this.f18950c).lambda$loadChats$5((MessagesStorage) this.d, this.f18949b);
                return;
            default:
                UserNameResolver.c((UserNameResolver) this.f18950c, (String) this.d, this.f18949b);
                return;
        }
    }

    public q4(Object obj, Object obj2, int i10, int i11) {
        this.f18948a = i11;
        this.f18950c = obj;
        this.d = obj2;
        this.f18949b = i10;
    }
}
