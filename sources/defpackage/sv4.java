package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class sv4 extends rv4 {
    public final tv4 r;

    public sv4(tv4 tv4Var, vnb vnbVar) {
        super(vnbVar);
        this.r = tv4Var;
    }

    @Override
    public final void E() {
        String M0;
        tv4 tv4Var = this.r;
        String str = tv4Var.V1;
        if ((str == null || str.isEmpty()) && tv4Var.S1.to_id == -1) {
            M0 = ob6.M0(2131753327, null);
        } else {
            M0 = ob6.M0(2131753326, null);
        }
        new d31(tv4Var.c, tv4Var.J0).Q(2131623982, 36, M0).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        tv4 tv4Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = tv4Var.S1;
        e eVar = tv4Var.r1;
        tv4Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            eVar.presentFragment(zu1.ha(-((TLRPC.Chat) tLObject).id));
        } else if (tLObject instanceof TLRPC.User) {
            eVar.presentFragment(zu1.ha(((TLRPC.User) tLObject).id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -wf3.n(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            eVar.presentFragment(new zu1(bundle));
        }
    }
}
