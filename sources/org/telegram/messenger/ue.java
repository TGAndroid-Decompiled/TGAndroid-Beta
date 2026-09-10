package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;
public final class ue implements Utilities.Callback2 {
    public final int f16510a;
    public final Object f16511b;

    public ue(Object obj, int i10) {
        this.f16510a = i10;
        this.f16511b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16510a) {
            case 0:
                MessagesController.AnonymousClass5.lambda$getRemote$0((Utilities.Callback4) this.f16511b, (TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((AiTonesController) this.f16511b).lambda$request$0((TL_aicompose.Tones) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                ((ChatThemeController) this.f16511b).lambda$setDialogTheme$4((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                ((GiftAuctionController) this.f16511b).lambda$requestUserAuctions$10((TL_payments.StarGiftActiveAuctions) obj, (TLRPC.TL_error) obj2);
                return;
            case 4:
                ((MediaDataController) this.f16511b).lambda$loadHints$148((TLRPC.contacts_TopPeers) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                MessagesController.lambda$getNextReactionMentionInternal$3((q0.a) this.f16511b, (TLRPC.messages_Messages) obj, (TLRPC.TL_error) obj2);
                return;
            case 6:
                MessagesController.lambda$createCommunity$255((Utilities.Callback2) this.f16511b, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((SendMessagesHelper) this.f16511b).lambda$deletePollOption$27((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
