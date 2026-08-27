package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;

public final class c1 implements Utilities.Callback2 {

    public final int f19868a;

    public final Object f19869b;

    public final Object f19870c;

    public c1(int i10, Object obj, Object obj2) {
        this.f19868a = i10;
        this.f19869b = obj;
        this.f19870c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19868a) {
            case 0:
                ((ChatThemeController) this.f19869b).lambda$requestNextChatThemes$21((ResultCallback) this.f19870c, (TL_account.ChatThemes) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                ((GiftAuctionController) this.f19869b).lambda$requestGiftAuctionInternal$4((Utilities.Callback2) this.f19870c, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                ((MessagesController) this.f19869b).lambda$fetchJoinedCommunities$251((Utilities.Callback) this.f19870c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                PasskeysController.lambda$create$4((org.telegram.ui.ActionBar.b2) this.f19869b, (Utilities.Callback2) this.f19870c, (TL_account.Passkey) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((UnconfirmedAuthController.UnconfirmedAuth) this.f19869b).lambda$confirm$0((Utilities.Callback) this.f19870c, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
