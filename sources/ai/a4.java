package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.q31;
public final class a4 implements org.telegram.ui.ActionBar.a2, MessagesController.IsInChatCheckedCallback {
    public final long f955a;
    public final Object f956b;
    public final Object f957c;
    public final Object d;
    public final TLObject e;
    public final Object f958f;

    public a4(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f956b = k7Var;
        this.f957c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f955a = j10;
        this.f958f = charSequence;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        k7.c0((k7) this.f956b, (TL_stars.TL_starGiftUnique) this.f957c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f955a, (CharSequence) this.f958f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new j((q31) this.f956b, z10, (org.telegram.ui.ActionBar.e1) this.f957c, (i80) this.d, this.f955a, (TLRPC.User) this.e, (TLRPC.Chat) this.f958f));
    }

    public a4(q31 q31Var, org.telegram.ui.ActionBar.e1 e1Var, i80 i80Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f956b = q31Var;
        this.f957c = e1Var;
        this.d = i80Var;
        this.f955a = j10;
        this.e = user;
        this.f958f = chat;
    }
}
