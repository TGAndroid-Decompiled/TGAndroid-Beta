package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.w21;
public final class o2 implements org.telegram.ui.ActionBar.c2, MessagesController.IsInChatCheckedCallback {
    public final long f14517a;
    public final Object f14518b;
    public final Object f14519c;
    public final Object d;
    public final TLObject f14520e;
    public final Object f14521f;

    public o2(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f14518b = g5Var;
        this.f14519c = tL_starGiftUnique;
        this.d = paymentForm;
        this.f14520e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f14517a = j10;
        this.f14521f = charSequence;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        g5.L0((g5) this.f14518b, (TL_stars.TL_starGiftUnique) this.f14519c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f14520e, this.f14517a, (CharSequence) this.f14521f, d2Var);
    }

    @Override
    public void run(boolean z4, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new f((w21) this.f14518b, z4, (org.telegram.ui.ActionBar.g1) this.f14519c, (q70) this.d, this.f14517a, (TLRPC.User) this.f14520e, (TLRPC.Chat) this.f14521f));
    }

    public o2(w21 w21Var, org.telegram.ui.ActionBar.g1 g1Var, q70 q70Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f14518b = w21Var;
        this.f14519c = g1Var;
        this.d = q70Var;
        this.f14517a = j10;
        this.f14520e = user;
        this.f14521f = chat;
    }
}
