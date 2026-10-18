package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.q31;
public final class y3 implements org.telegram.ui.ActionBar.a2, MessagesController.IsInChatCheckedCallback {
    public final long f2472a;
    public final Object f2473b;
    public final Object f2474c;
    public final Object d;
    public final TLObject e;
    public final Object f2475f;

    public y3(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f2473b = k7Var;
        this.f2474c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f2472a = j10;
        this.f2475f = charSequence;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        k7.c0((k7) this.f2473b, (TL_stars.TL_starGiftUnique) this.f2474c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f2472a, (CharSequence) this.f2475f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new j((q31) this.f2473b, z10, (org.telegram.ui.ActionBar.e1) this.f2474c, (i80) this.d, this.f2472a, (TLRPC.User) this.e, (TLRPC.Chat) this.f2475f));
    }

    public y3(q31 q31Var, org.telegram.ui.ActionBar.e1 e1Var, i80 i80Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f2473b = q31Var;
        this.f2474c = e1Var;
        this.d = i80Var;
        this.f2472a = j10;
        this.e = user;
        this.f2475f = chat;
    }
}
