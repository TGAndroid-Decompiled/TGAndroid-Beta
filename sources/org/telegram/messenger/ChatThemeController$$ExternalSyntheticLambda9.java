package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ChatThemeController$$ExternalSyntheticLambda9 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ChatThemeController$$ExternalSyntheticLambda9(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatThemeController) this.f$0).lambda$requestNextChatThemes$21((ResultCallback) this.f$1, (TL_account.ChatThemes) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                ((GiftAuctionController) this.f$0).lambda$requestGiftAuctionInternal$4((Utilities.Callback2) this.f$1, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                ((MessagesController) this.f$0).lambda$fetchJoinedCommunities$251((Utilities.Callback) this.f$1, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                PasskeysController.lambda$create$4((AlertDialog) this.f$0, (Utilities.Callback2) this.f$1, (TL_account.Passkey) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((UnconfirmedAuthController.UnconfirmedAuth) this.f$0).lambda$confirm$0((Utilities.Callback) this.f$1, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
