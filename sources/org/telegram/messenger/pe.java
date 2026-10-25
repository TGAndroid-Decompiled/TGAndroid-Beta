package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;
public final class pe implements Utilities.Callback2 {
    public final int f20963a;
    public final Object f20964b;

    public pe(Object obj, int i10) {
        this.f20963a = i10;
        this.f20964b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20963a) {
            case 0:
                MessagesController.AnonymousClass5.lambda$getRemote$0((Utilities.Callback4) this.f20964b, (TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((AiTonesController) this.f20964b).lambda$request$0((TL_aicompose.Tones) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                ((ChatThemeController) this.f20964b).lambda$setDialogTheme$4((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                ((GiftAuctionController) this.f20964b).lambda$requestUserAuctions$10((TL_payments.StarGiftActiveAuctions) obj, (TLRPC.TL_error) obj2);
                return;
            case 4:
                ((MediaDataController) this.f20964b).lambda$loadHints$148((TLRPC.contacts_TopPeers) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                MessagesController.lambda$getNextReactionMentionInternal$3((q0.a) this.f20964b, (TLRPC.messages_Messages) obj, (TLRPC.TL_error) obj2);
                return;
            case 6:
                MessagesController.lambda$createCommunity$254((Utilities.Callback2) this.f20964b, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((SendMessagesHelper) this.f20964b).lambda$deletePollOption$30((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
