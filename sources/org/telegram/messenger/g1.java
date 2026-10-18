package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
public final class g1 implements Utilities.Callback2 {
    public final int f18412a;
    public final Object f18413b;
    public final Object f18414c;

    public g1(int i10, Object obj, Object obj2) {
        this.f18412a = i10;
        this.f18413b = obj;
        this.f18414c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18412a) {
            case 0:
                ((ChatThemeController) this.f18413b).lambda$requestNextChatThemes$21((ResultCallback) this.f18414c, (TL_account.ChatThemes) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((GiftAuctionController) this.f18413b).lambda$requestGiftAuctionInternal$4((Utilities.Callback2) this.f18414c, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                ((MessagesController) this.f18413b).lambda$fetchJoinedCommunities$250((Utilities.Callback) this.f18414c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                PasskeysController.lambda$create$4((org.telegram.ui.ActionBar.b2) this.f18413b, (Utilities.Callback2) this.f18414c, (TL_account.Passkey) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((UnconfirmedAuthController.UnconfirmedAuth) this.f18413b).lambda$confirm$0((Utilities.Callback) this.f18414c, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
