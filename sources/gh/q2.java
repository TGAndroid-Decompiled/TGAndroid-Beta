package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.x60;
public final class q2 implements org.telegram.ui.ActionBar.b2, MessagesController.IsInChatCheckedCallback {
    public final long f8743a;
    public final Object f8744b;
    public final Object f8745c;
    public final Object d;
    public final TLObject f8746e;
    public final Object f8747f;

    public q2(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f8744b = k5Var;
        this.f8745c = tL_starGiftUnique;
        this.d = paymentForm;
        this.f8746e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f8743a = j10;
        this.f8747f = charSequence;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        k5.L0((k5) this.f8744b, (TL_stars.TL_starGiftUnique) this.f8745c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f8746e, this.f8743a, (CharSequence) this.f8747f, c2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new f((b21) this.f8744b, z10, (org.telegram.ui.ActionBar.g1) this.f8745c, (x60) this.d, this.f8743a, (TLRPC.User) this.f8746e, (TLRPC.Chat) this.f8747f));
    }

    public q2(b21 b21Var, org.telegram.ui.ActionBar.g1 g1Var, x60 x60Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f8744b = b21Var;
        this.f8745c = g1Var;
        this.d = x60Var;
        this.f8743a = j10;
        this.f8746e = user;
        this.f8747f = chat;
    }
}
