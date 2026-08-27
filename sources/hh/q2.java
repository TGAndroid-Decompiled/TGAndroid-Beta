package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.d21;

public final class q2 implements org.telegram.ui.ActionBar.a2, MessagesController.IsInChatCheckedCallback {

    public final long f9895a;

    public final Object f9896b;

    public final Object f9897c;
    public final Object d;

    public final TLObject f9898e;

    public final Object f9899f;

    public q2(i5 i5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f9896b = i5Var;
        this.f9897c = tL_starGiftUnique;
        this.d = paymentForm;
        this.f9898e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f9895a = j10;
        this.f9899f = charSequence;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        i5.L0((i5) this.f9896b, (TL_stars.TL_starGiftUnique) this.f9897c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f9898e, this.f9895a, (CharSequence) this.f9899f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new f((d21) this.f9896b, z10, (org.telegram.ui.ActionBar.f1) this.f9897c, (b70) this.d, this.f9895a, (TLRPC.User) this.f9898e, (TLRPC.Chat) this.f9899f));
    }

    public q2(d21 d21Var, org.telegram.ui.ActionBar.f1 f1Var, b70 b70Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f9896b = d21Var;
        this.f9897c = f1Var;
        this.d = b70Var;
        this.f9895a = j10;
        this.f9898e = user;
        this.f9899f = chat;
    }
}
