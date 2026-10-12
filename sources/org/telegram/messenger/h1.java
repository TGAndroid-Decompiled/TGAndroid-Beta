package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
public final class h1 implements Utilities.Callback2 {
    public final int f17739a;
    public final Object f17740b;
    public final Object f17741c;

    public h1(int i10, Object obj, Object obj2) {
        this.f17739a = i10;
        this.f17740b = obj;
        this.f17741c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17739a) {
            case 0:
                ((ChatThemeController) this.f17740b).lambda$requestNextChatThemes$21((ResultCallback) this.f17741c, (TL_account.ChatThemes) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((GiftAuctionController) this.f17740b).lambda$requestGiftAuctionInternal$4((Utilities.Callback2) this.f17741c, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                ((MessagesController) this.f17740b).lambda$fetchJoinedCommunities$250((Utilities.Callback) this.f17741c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                PasskeysController.lambda$create$4((org.telegram.ui.ActionBar.a2) this.f17740b, (Utilities.Callback2) this.f17741c, (TL_account.Passkey) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((UnconfirmedAuthController.UnconfirmedAuth) this.f17740b).lambda$confirm$0((Utilities.Callback) this.f17741c, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
