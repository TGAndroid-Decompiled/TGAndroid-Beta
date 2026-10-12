package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
public final class g1 implements Utilities.Callback2 {
    public final int f17281a;
    public final Object f17282b;
    public final Object f17283c;

    public g1(int i10, Object obj, Object obj2) {
        this.f17281a = i10;
        this.f17282b = obj;
        this.f17283c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17281a) {
            case 0:
                ((ChatThemeController) this.f17282b).lambda$requestNextChatThemes$21((ResultCallback) this.f17283c, (TL_account.ChatThemes) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((GiftAuctionController) this.f17282b).lambda$requestGiftAuctionInternal$4((Utilities.Callback2) this.f17283c, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                ((MessagesController) this.f17282b).lambda$fetchJoinedCommunities$250((Utilities.Callback) this.f17283c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                PasskeysController.lambda$create$4((org.telegram.ui.ActionBar.a2) this.f17282b, (Utilities.Callback2) this.f17283c, (TL_account.Passkey) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((UnconfirmedAuthController.UnconfirmedAuth) this.f17282b).lambda$confirm$0((Utilities.Callback) this.f17283c, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
