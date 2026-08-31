package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.x21;
public final class o2 implements org.telegram.ui.ActionBar.c2, MessagesController.IsInChatCheckedCallback {
    public final long f14515a;
    public final Object f14516b;
    public final Object f14517c;
    public final Object d;
    public final TLObject f14518e;
    public final Object f14519f;

    public o2(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f14516b = g5Var;
        this.f14517c = tL_starGiftUnique;
        this.d = paymentForm;
        this.f14518e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f14515a = j10;
        this.f14519f = charSequence;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        g5.L0((g5) this.f14516b, (TL_stars.TL_starGiftUnique) this.f14517c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f14518e, this.f14515a, (CharSequence) this.f14519f, d2Var);
    }

    @Override
    public void run(boolean z4, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new f((x21) this.f14516b, z4, (org.telegram.ui.ActionBar.g1) this.f14517c, (q70) this.d, this.f14515a, (TLRPC.User) this.f14518e, (TLRPC.Chat) this.f14519f));
    }

    public o2(x21 x21Var, org.telegram.ui.ActionBar.g1 g1Var, q70 q70Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f14516b = x21Var;
        this.f14517c = g1Var;
        this.d = q70Var;
        this.f14515a = j10;
        this.f14518e = user;
        this.f14519f = chat;
    }
}
