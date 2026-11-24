package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ot4 extends nt4 {
    public final pt4 r;

    public ot4(pt4 pt4Var, wjb wjbVar) {
        super(wjbVar);
        this.r = pt4Var;
    }

    @Override
    public final void E() {
        String M0;
        pt4 pt4Var = this.r;
        String str = pt4Var.V1;
        if ((str == null || str.isEmpty()) && pt4Var.S1.to_id == -1) {
            M0 = k96.M0(2131753331, null);
        } else {
            M0 = k96.M0(2131753330, null);
        }
        new u21(pt4Var.c, pt4Var.J0).Q(2131623982, 36, M0).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        pt4 pt4Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = pt4Var.S1;
        d dVar = pt4Var.r1;
        pt4Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            dVar.presentFragment(mu1.U9(-((TLRPC.Chat) tLObject).id));
        } else if (tLObject instanceof TLRPC.User) {
            dVar.presentFragment(mu1.U9(((TLRPC.User) tLObject).id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -cf3.n(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            dVar.presentFragment(new mu1(bundle));
        }
    }
}
