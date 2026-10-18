package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.q31;
public final class z3 implements org.telegram.ui.ActionBar.a2, MessagesController.IsInChatCheckedCallback {
    public final long f2526a;
    public final Object f2527b;
    public final Object f2528c;
    public final Object d;
    public final TLObject e;
    public final Object f2529f;

    public z3(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f2527b = k7Var;
        this.f2528c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f2526a = j10;
        this.f2529f = charSequence;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        k7.d0((k7) this.f2527b, (TL_stars.TL_starGiftUnique) this.f2528c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f2526a, (CharSequence) this.f2529f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new j((q31) this.f2527b, z10, (org.telegram.ui.ActionBar.e1) this.f2528c, (i80) this.d, this.f2526a, (TLRPC.User) this.e, (TLRPC.Chat) this.f2529f));
    }

    public z3(q31 q31Var, org.telegram.ui.ActionBar.e1 e1Var, i80 i80Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f2527b = q31Var;
        this.f2528c = e1Var;
        this.d = i80Var;
        this.f2526a = j10;
        this.e = user;
        this.f2529f = chat;
    }
}
