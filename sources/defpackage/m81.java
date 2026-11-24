package defpackage;

import android.view.View;
import java.io.Serializable;
public final class m81 implements n8c, o8c, no7 {
    public final z81 a;

    public m81(z81 z81Var) {
        this.a = z81Var;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        return this.a.onInsetsInternal(view, vxcVar);
    }

    @Override
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        boolean z;
        Object obj = c4cVar.H;
        if (obj instanceof w81) {
            this.a.Z(((w81) obj).c, (v81) view);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.i0((c4c) obj, (View) obj2);
    }
}
