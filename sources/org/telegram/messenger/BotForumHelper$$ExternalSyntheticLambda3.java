package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog;

public final class BotForumHelper$$ExternalSyntheticLambda3 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final Object f$2;

    public BotForumHelper$$ExternalSyntheticLambda3(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = j;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((BotForumHelper) this.f$0).lambda$performSendBotTopicCreate$5(this.f$1, (String) this.f$2, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                PasskeysController.AnonymousClass1.lambda$onResult$0((AlertDialog) this.f$0, (Utilities.Callback3) this.f$2, this.f$1, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((GiftAuctionController) this.f$0).lambda$getOrRequestAuction$12((Utilities.Callback2) this.f$2, this.f$1, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public BotForumHelper$$ExternalSyntheticLambda3(BotForumHelper botForumHelper, long j, String str) {
        this.$r8$classId = 0;
        this.f$0 = botForumHelper;
        this.f$1 = j;
        this.f$2 = str;
    }
}
