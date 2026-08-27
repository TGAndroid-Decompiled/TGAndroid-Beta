package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;

public final class le implements Utilities.Callback2 {

    public final int f20889a;

    public final Object f20890b;

    public le(Object obj, int i10) {
        this.f20889a = i10;
        this.f20890b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20889a) {
            case 0:
                MessagesController.AnonymousClass5.lambda$getRemote$0((Utilities.Callback4) this.f20890b, (TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                ((AiTonesController) this.f20890b).lambda$request$0((TL_aicompose.Tones) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                ((ChatThemeController) this.f20890b).lambda$setDialogTheme$4((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                ((GiftAuctionController) this.f20890b).lambda$requestUserAuctions$10((TL_payments.StarGiftActiveAuctions) obj, (TLRPC.TL_error) obj2);
                break;
            case 4:
                ((MediaDataController) this.f20890b).lambda$loadHints$148((TLRPC.contacts_TopPeers) obj, (TLRPC.TL_error) obj2);
                break;
            case 5:
                MessagesController.lambda$getNextReactionMentionInternal$3((q0.a) this.f20890b, (TLRPC.messages_Messages) obj, (TLRPC.TL_error) obj2);
                break;
            case 6:
                MessagesController.lambda$createCommunity$255((Utilities.Callback2) this.f20890b, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((SendMessagesHelper) this.f20890b).lambda$deletePollOption$27((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
