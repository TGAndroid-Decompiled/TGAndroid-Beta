package org.telegram.messenger;

import androidx.core.util.Consumer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;

public final class AiTonesController$$ExternalSyntheticLambda1 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;

    public AiTonesController$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((AiTonesController) this.f$0).lambda$request$0((TL_aicompose.Tones) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                MessagesController.AnonymousClass5.lambda$getRemote$0((Utilities.Callback4) this.f$0, (TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                ((ChatThemeController) this.f$0).lambda$setDialogTheme$4((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                ((GiftAuctionController) this.f$0).lambda$requestUserAuctions$10((TL_payments.StarGiftActiveAuctions) obj, (TLRPC.TL_error) obj2);
                break;
            case 4:
                ((MediaDataController) this.f$0).lambda$loadHints$148((TLRPC.contacts_TopPeers) obj, (TLRPC.TL_error) obj2);
                break;
            case 5:
                MessagesController.lambda$getNextReactionMentionInternal$3((Consumer) this.f$0, (TLRPC.messages_Messages) obj, (TLRPC.TL_error) obj2);
                break;
            case 6:
                MessagesController.lambda$createCommunity$255((Utilities.Callback2) this.f$0, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((SendMessagesHelper) this.f$0).lambda$deletePollOption$27((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
