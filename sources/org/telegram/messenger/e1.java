package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
public final class e1 implements Utilities.Callback2 {
    public final int f16240a;
    public final Object f16241b;
    public final Object f16242c;

    public e1(int i10, Object obj, Object obj2) {
        this.f16240a = i10;
        this.f16241b = obj;
        this.f16242c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16240a) {
            case 0:
                ((ChatThemeController) this.f16241b).lambda$requestNextChatThemes$21((ResultCallback) this.f16242c, (TL_account.ChatThemes) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((GiftAuctionController) this.f16241b).lambda$requestGiftAuctionInternal$4((Utilities.Callback2) this.f16242c, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                ((MessagesController) this.f16241b).lambda$fetchJoinedCommunities$251((Utilities.Callback) this.f16242c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                PasskeysController.lambda$create$4((org.telegram.ui.ActionBar.a2) this.f16241b, (Utilities.Callback2) this.f16242c, (TL_account.Passkey) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((UnconfirmedAuthController.UnconfirmedAuth) this.f16241b).lambda$confirm$0((Utilities.Callback) this.f16242c, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
