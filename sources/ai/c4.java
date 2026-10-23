package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.w31;
public final class c4 implements org.telegram.ui.ActionBar.z1, MessagesController.IsInChatCheckedCallback {
    public final long f1075a;
    public final Object f1076b;
    public final Object f1077c;
    public final Object d;
    public final TLObject e;
    public final Object f1078f;

    public c4(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f1076b = l7Var;
        this.f1077c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f1075a = j10;
        this.f1078f = charSequence;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        l7.a0((l7) this.f1076b, (TL_stars.TL_starGiftUnique) this.f1077c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f1075a, (CharSequence) this.f1078f, c2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new j((w31) this.f1076b, z10, (org.telegram.ui.ActionBar.e1) this.f1077c, (j80) this.d, this.f1075a, (TLRPC.User) this.e, (TLRPC.Chat) this.f1078f));
    }

    public c4(w31 w31Var, org.telegram.ui.ActionBar.e1 e1Var, j80 j80Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f1076b = w31Var;
        this.f1077c = e1Var;
        this.d = j80Var;
        this.f1075a = j10;
        this.e = user;
        this.f1078f = chat;
    }
}
