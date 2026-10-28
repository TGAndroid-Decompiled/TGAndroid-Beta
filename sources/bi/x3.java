package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l80;
public final class x3 implements org.telegram.ui.ActionBar.b2, MessagesController.IsInChatCheckedCallback {
    public final long f5670a;
    public final Object f5671b;
    public final Object f5672c;
    public final Object d;
    public final TLObject e;
    public final Object f5673f;

    public x3(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f5671b = h7Var;
        this.f5672c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f5670a = j10;
        this.f5673f = charSequence;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        h7.a0((h7) this.f5671b, (TL_stars.TL_starGiftUnique) this.f5672c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f5670a, (CharSequence) this.f5673f, e2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new l((f41) this.f5671b, z10, (org.telegram.ui.ActionBar.g1) this.f5672c, (l80) this.d, this.f5670a, (TLRPC.User) this.e, (TLRPC.Chat) this.f5673f));
    }

    public x3(f41 f41Var, org.telegram.ui.ActionBar.g1 g1Var, l80 l80Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f5671b = f41Var;
        this.f5672c = g1Var;
        this.d = l80Var;
        this.f5670a = j10;
        this.e = user;
        this.f5673f = chat;
    }
}
