package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
public final class d1 implements Utilities.Callback2 {
    public final int f18443a;
    public final Object f18444b;
    public final Object f18445c;

    public d1(int i10, Object obj, Object obj2) {
        this.f18443a = i10;
        this.f18444b = obj;
        this.f18445c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18443a) {
            case 0:
                ((ChatThemeController) this.f18444b).lambda$requestNextChatThemes$21((ResultCallback) this.f18445c, (TL_account.ChatThemes) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((GiftAuctionController) this.f18444b).lambda$requestGiftAuctionInternal$4((Utilities.Callback2) this.f18445c, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                ((MessagesController) this.f18444b).lambda$fetchJoinedCommunities$251((Utilities.Callback) this.f18445c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                PasskeysController.lambda$create$4((org.telegram.ui.ActionBar.d2) this.f18444b, (Utilities.Callback2) this.f18445c, (TL_account.Passkey) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((UnconfirmedAuthController.UnconfirmedAuth) this.f18444b).lambda$confirm$0((Utilities.Callback) this.f18445c, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
