package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
public final class d1 implements Utilities.Callback2 {
    public final int f20039a;
    public final Object f20040b;
    public final Object f20041c;

    public d1(int i9, Object obj, Object obj2) {
        this.f20039a = i9;
        this.f20040b = obj;
        this.f20041c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20039a) {
            case 0:
                ((ChatThemeController) this.f20040b).lambda$requestNextChatThemes$21((ResultCallback) this.f20041c, (TL_account.ChatThemes) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((GiftAuctionController) this.f20040b).lambda$requestGiftAuctionInternal$4((Utilities.Callback2) this.f20041c, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                ((MessagesController) this.f20040b).lambda$fetchJoinedCommunities$251((Utilities.Callback) this.f20041c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                PasskeysController.lambda$create$4((org.telegram.ui.ActionBar.c2) this.f20040b, (Utilities.Callback2) this.f20041c, (TL_account.Passkey) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((UnconfirmedAuthController.UnconfirmedAuth) this.f20040b).lambda$confirm$0((Utilities.Callback) this.f20041c, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
