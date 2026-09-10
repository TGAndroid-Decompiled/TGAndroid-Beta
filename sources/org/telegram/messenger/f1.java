package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
public final class f1 implements Utilities.Callback2 {
    public final int f15128a;
    public final Object f15129b;
    public final Object f15130c;

    public f1(int i10, Object obj, Object obj2) {
        this.f15128a = i10;
        this.f15129b = obj;
        this.f15130c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f15128a) {
            case 0:
                ((ChatThemeController) this.f15129b).lambda$requestNextChatThemes$21((ResultCallback) this.f15130c, (TL_account.ChatThemes) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((GiftAuctionController) this.f15129b).lambda$requestGiftAuctionInternal$4((Utilities.Callback2) this.f15130c, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                ((MessagesController) this.f15129b).lambda$fetchJoinedCommunities$251((Utilities.Callback) this.f15130c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                PasskeysController.lambda$create$4((org.telegram.ui.ActionBar.d2) this.f15129b, (Utilities.Callback2) this.f15130c, (TL_account.Passkey) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((UnconfirmedAuthController.UnconfirmedAuth) this.f15129b).lambda$confirm$0((Utilities.Callback) this.f15130c, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
