package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.m21;
public final class o2 implements org.telegram.ui.ActionBar.b2, MessagesController.IsInChatCheckedCallback {
    public final long f12535a;
    public final Object f12536b;
    public final Object f12537c;
    public final Object d;
    public final TLObject f12538e;
    public final Object f12539f;

    public o2(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f12536b = h5Var;
        this.f12537c = tL_starGiftUnique;
        this.d = paymentForm;
        this.f12538e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f12535a = j10;
        this.f12539f = charSequence;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        h5.L0((h5) this.f12536b, (TL_stars.TL_starGiftUnique) this.f12537c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f12538e, this.f12535a, (CharSequence) this.f12539f, c2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new f((m21) this.f12536b, z10, (org.telegram.ui.ActionBar.g1) this.f12537c, (j70) this.d, this.f12535a, (TLRPC.User) this.f12538e, (TLRPC.Chat) this.f12539f));
    }

    public o2(m21 m21Var, org.telegram.ui.ActionBar.g1 g1Var, j70 j70Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f12536b = m21Var;
        this.f12537c = g1Var;
        this.d = j70Var;
        this.f12535a = j10;
        this.f12538e = user;
        this.f12539f = chat;
    }
}
