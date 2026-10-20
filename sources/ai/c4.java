package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.s31;
public final class c4 implements org.telegram.ui.ActionBar.a2, MessagesController.IsInChatCheckedCallback {
    public final long f1073a;
    public final Object f1074b;
    public final Object f1075c;
    public final Object d;
    public final TLObject e;
    public final Object f1076f;

    public c4(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f1074b = l7Var;
        this.f1075c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f1073a = j10;
        this.f1076f = charSequence;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        l7.b0((l7) this.f1074b, (TL_stars.TL_starGiftUnique) this.f1075c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f1073a, (CharSequence) this.f1076f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new j((s31) this.f1074b, z10, (org.telegram.ui.ActionBar.e1) this.f1075c, (i80) this.d, this.f1073a, (TLRPC.User) this.e, (TLRPC.Chat) this.f1076f));
    }

    public c4(s31 s31Var, org.telegram.ui.ActionBar.e1 e1Var, i80 i80Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f1074b = s31Var;
        this.f1075c = e1Var;
        this.d = i80Var;
        this.f1073a = j10;
        this.e = user;
        this.f1076f = chat;
    }
}
