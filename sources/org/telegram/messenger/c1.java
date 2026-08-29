package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
public final class c1 implements Utilities.Callback2 {
    public final int f19855a;
    public final Object f19856b;
    public final Object f19857c;

    public c1(int i10, Object obj, Object obj2) {
        this.f19855a = i10;
        this.f19856b = obj;
        this.f19857c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19855a) {
            case 0:
                ((ChatThemeController) this.f19856b).lambda$requestNextChatThemes$21((ResultCallback) this.f19857c, (TL_account.ChatThemes) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((GiftAuctionController) this.f19856b).lambda$requestGiftAuctionInternal$4((Utilities.Callback2) this.f19857c, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                ((MessagesController) this.f19856b).lambda$fetchJoinedCommunities$251((Utilities.Callback) this.f19857c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                PasskeysController.lambda$create$4((org.telegram.ui.ActionBar.c2) this.f19856b, (Utilities.Callback2) this.f19857c, (TL_account.Passkey) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((UnconfirmedAuthController.UnconfirmedAuth) this.f19856b).lambda$confirm$0((Utilities.Callback) this.f19857c, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
