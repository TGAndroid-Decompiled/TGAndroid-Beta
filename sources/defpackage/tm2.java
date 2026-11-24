package defpackage;

import android.view.View;
import java.io.Serializable;
public final class tm2 implements n8c, yc7 {
    public final xm2 a;

    @Override
    public final void a(String str) {
        xm2 xm2Var = this.a;
        xm2Var.getMessagesController().K0(Long.valueOf(-xm2Var.b));
        xm2Var.showDialog(new qm2(xm2Var.getParentActivity(), null, xm2Var.b, new pz1(xm2Var, str, (byte) 8)));
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.a0((c4c) obj);
    }
}
