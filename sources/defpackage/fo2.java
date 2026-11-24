package defpackage;

import android.view.View;
import java.io.Serializable;
public final class fo2 implements oac, af7 {
    public final io2 a;

    @Override
    public final void a(String str) {
        io2 io2Var = this.a;
        io2Var.getMessagesController().L0(Long.valueOf(-io2Var.b));
        io2Var.showDialog(new co2(io2Var.getParentActivity(), null, io2Var.b, new qy1(io2Var, str, (byte) 9)));
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.b0((c6c) obj);
    }
}
