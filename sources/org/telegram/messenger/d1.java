package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
public final class d1 implements Utilities.Callback2 {
    public final int f16998a;
    public final Object f16999b;
    public final Object f17000c;

    public d1(int i10, Object obj, Object obj2) {
        this.f16998a = i10;
        this.f16999b = obj;
        this.f17000c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16998a) {
            case 0:
                ((ChatThemeController) this.f16999b).lambda$requestNextChatThemes$21((ResultCallback) this.f17000c, (TL_account.ChatThemes) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((GiftAuctionController) this.f16999b).lambda$requestGiftAuctionInternal$4((Utilities.Callback2) this.f17000c, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                ((MessagesController) this.f16999b).lambda$fetchJoinedCommunities$251((Utilities.Callback) this.f17000c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                PasskeysController.lambda$create$4((org.telegram.ui.ActionBar.d2) this.f16999b, (Utilities.Callback2) this.f17000c, (TL_account.Passkey) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((UnconfirmedAuthController.UnconfirmedAuth) this.f16999b).lambda$confirm$0((Utilities.Callback) this.f17000c, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
