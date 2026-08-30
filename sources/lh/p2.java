package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.w21;
public final class p2 implements org.telegram.ui.ActionBar.c2, MessagesController.IsInChatCheckedCallback {
    public final long f12911a;
    public final Object f12912b;
    public final Object f12913c;
    public final Object d;
    public final TLObject e;
    public final Object f12914f;

    public p2(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f12912b = g5Var;
        this.f12913c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f12911a = j10;
        this.f12914f = charSequence;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        g5.L0((g5) this.f12912b, (TL_stars.TL_starGiftUnique) this.f12913c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f12911a, (CharSequence) this.f12914f, d2Var);
    }

    @Override
    public void run(boolean z4, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new g((w21) this.f12912b, z4, (org.telegram.ui.ActionBar.g1) this.f12913c, (o70) this.d, this.f12911a, (TLRPC.User) this.e, (TLRPC.Chat) this.f12914f));
    }

    public p2(w21 w21Var, org.telegram.ui.ActionBar.g1 g1Var, o70 o70Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f12912b = w21Var;
        this.f12913c = g1Var;
        this.d = o70Var;
        this.f12911a = j10;
        this.e = user;
        this.f12914f = chat;
    }
}
