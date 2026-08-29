package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;
public final class oe implements Utilities.Callback2 {
    public final int f21177a;
    public final Object f21178b;

    public oe(Object obj, int i10) {
        this.f21177a = i10;
        this.f21178b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f21177a) {
            case 0:
                MessagesController.AnonymousClass5.lambda$getRemote$0((Utilities.Callback4) this.f21178b, (TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((AiTonesController) this.f21178b).lambda$request$0((TL_aicompose.Tones) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                ((ChatThemeController) this.f21178b).lambda$setDialogTheme$4((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                ((GiftAuctionController) this.f21178b).lambda$requestUserAuctions$10((TL_payments.StarGiftActiveAuctions) obj, (TLRPC.TL_error) obj2);
                return;
            case 4:
                ((MediaDataController) this.f21178b).lambda$loadHints$148((TLRPC.contacts_TopPeers) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                MessagesController.lambda$getNextReactionMentionInternal$3((q0.a) this.f21178b, (TLRPC.messages_Messages) obj, (TLRPC.TL_error) obj2);
                return;
            case 6:
                MessagesController.lambda$createCommunity$255((Utilities.Callback2) this.f21178b, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((SendMessagesHelper) this.f21178b).lambda$deletePollOption$27((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
