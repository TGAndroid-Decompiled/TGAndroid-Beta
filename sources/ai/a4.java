package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.r31;
public final class a4 implements org.telegram.ui.ActionBar.a2, MessagesController.IsInChatCheckedCallback {
    public final long f952a;
    public final Object f953b;
    public final Object f954c;
    public final Object d;
    public final TLObject e;
    public final Object f955f;

    public a4(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f953b = k7Var;
        this.f954c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f952a = j10;
        this.f955f = charSequence;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        k7.c0((k7) this.f953b, (TL_stars.TL_starGiftUnique) this.f954c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f952a, (CharSequence) this.f955f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new j((r31) this.f953b, z10, (org.telegram.ui.ActionBar.e1) this.f954c, (i80) this.d, this.f952a, (TLRPC.User) this.e, (TLRPC.Chat) this.f955f));
    }

    public a4(r31 r31Var, org.telegram.ui.ActionBar.e1 e1Var, i80 i80Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f953b = r31Var;
        this.f954c = e1Var;
        this.d = i80Var;
        this.f952a = j10;
        this.e = user;
        this.f955f = chat;
    }
}
