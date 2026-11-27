package defpackage;

import android.view.View;
import java.io.Serializable;
public final class nn2 implements ncc, if7 {
    public final qn2 a;

    @Override
    public final void a(String str) {
        qn2 qn2Var = this.a;
        qn2Var.getMessagesController().M0(Long.valueOf(-qn2Var.b));
        qn2Var.showDialog(new kn2(qn2Var.getParentActivity(), null, qn2Var.b, new rx1(qn2Var, str, (byte) 9)));
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.a0((b8c) obj);
    }
}
