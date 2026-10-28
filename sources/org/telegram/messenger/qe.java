package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;
public final class qe implements Utilities.Callback2 {
    public final int f21047a;
    public final Object f21048b;

    public qe(Object obj, int i10) {
        this.f21047a = i10;
        this.f21048b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f21047a) {
            case 0:
                MessagesController.AnonymousClass5.lambda$getRemote$0((Utilities.Callback4) this.f21048b, (TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((AiTonesController) this.f21048b).lambda$request$0((TL_aicompose.Tones) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                ((ChatThemeController) this.f21048b).lambda$setDialogTheme$4((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                ((GiftAuctionController) this.f21048b).lambda$requestUserAuctions$10((TL_payments.StarGiftActiveAuctions) obj, (TLRPC.TL_error) obj2);
                return;
            case 4:
                ((MediaDataController) this.f21048b).lambda$loadHints$148((TLRPC.contacts_TopPeers) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                MessagesController.lambda$getNextReactionMentionInternal$3((q0.a) this.f21048b, (TLRPC.messages_Messages) obj, (TLRPC.TL_error) obj2);
                return;
            case 6:
                MessagesController.lambda$createCommunity$254((Utilities.Callback2) this.f21048b, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((SendMessagesHelper) this.f21048b).lambda$deletePollOption$30((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
