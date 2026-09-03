package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.w21;
public final class p2 implements org.telegram.ui.ActionBar.c2, MessagesController.IsInChatCheckedCallback {
    public final long f12895a;
    public final Object f12896b;
    public final Object f12897c;
    public final Object d;
    public final TLObject e;
    public final Object f12898f;

    public p2(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f12896b = g5Var;
        this.f12897c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f12895a = j10;
        this.f12898f = charSequence;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        g5.L0((g5) this.f12896b, (TL_stars.TL_starGiftUnique) this.f12897c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f12895a, (CharSequence) this.f12898f, d2Var);
    }

    @Override
    public void run(boolean z4, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new g((w21) this.f12896b, z4, (org.telegram.ui.ActionBar.g1) this.f12897c, (p70) this.d, this.f12895a, (TLRPC.User) this.e, (TLRPC.Chat) this.f12898f));
    }

    public p2(w21 w21Var, org.telegram.ui.ActionBar.g1 g1Var, p70 p70Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f12896b = w21Var;
        this.f12897c = g1Var;
        this.d = p70Var;
        this.f12895a = j10;
        this.e = user;
        this.f12898f = chat;
    }
}
