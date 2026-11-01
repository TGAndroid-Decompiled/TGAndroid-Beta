package mg;

import android.os.Bundle;
import org.telegram.messenger.dd;
import org.telegram.messenger.o5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.un;
public final class x0 extends ng.f {
    public final y0 f13287r;

    public x0(y0 y0Var, p6 p6Var) {
        super(p6Var);
        this.f13287r = y0Var;
    }

    @Override
    public final void E() {
        String L0;
        y0 y0Var = this.f13287r;
        String str = y0Var.S1;
        if ((str == null || str.isEmpty()) && y0Var.P1.to_id == -1) {
            L0 = dd.L0(2131753334, null);
        } else {
            L0 = dd.L0(2131753333, null);
        }
        new cc(y0Var.f21590c, y0Var.I0).Q(2131623981, 36, L0).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        y0 y0Var = this.f13287r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = y0Var.P1;
        k2 k2Var = y0Var.f26727o1;
        y0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            k2Var.presentFragment(un.ma(-((TLRPC.Chat) tLObject).f19794id));
        } else if (tLObject instanceof TLRPC.User) {
            k2Var.presentFragment(un.ma(((TLRPC.User) tLObject).f19943id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -o5.o(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            k2Var.presentFragment(new un(bundle));
        }
    }
}
