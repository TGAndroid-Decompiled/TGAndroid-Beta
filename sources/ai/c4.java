package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.v31;
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
        AndroidUtilities.runOnUIThread(new j((v31) this.f1076b, z10, (org.telegram.ui.ActionBar.e1) this.f1077c, (h80) this.d, this.f1075a, (TLRPC.User) this.e, (TLRPC.Chat) this.f1078f));
    }

    public c4(v31 v31Var, org.telegram.ui.ActionBar.e1 e1Var, h80 h80Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f1076b = v31Var;
        this.f1077c = e1Var;
        this.d = h80Var;
        this.f1075a = j10;
        this.e = user;
        this.f1078f = chat;
    }
}
