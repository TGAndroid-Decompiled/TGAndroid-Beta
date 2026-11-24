package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class qv4 extends pv4 {
    public final rv4 r;

    public qv4(rv4 rv4Var, ylb ylbVar) {
        super(ylbVar);
        this.r = rv4Var;
    }

    @Override
    public final void E() {
        String M0;
        rv4 rv4Var = this.r;
        String str = rv4Var.V1;
        if ((str == null || str.isEmpty()) && rv4Var.S1.to_id == -1) {
            M0 = jb6.M0(2131753299, null);
        } else {
            M0 = jb6.M0(2131753298, null);
        }
        new c41(rv4Var.c, rv4Var.J0).Q(2131623982, 36, M0).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        rv4 rv4Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = rv4Var.S1;
        d dVar = rv4Var.r1;
        rv4Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            dVar.presentFragment(yv1.ga(-((TLRPC.Chat) tLObject).id));
        } else if (tLObject instanceof TLRPC.User) {
            dVar.presentFragment(yv1.ga(((TLRPC.User) tLObject).id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -pg3.n(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            dVar.presentFragment(new yv1(bundle));
        }
    }
}
