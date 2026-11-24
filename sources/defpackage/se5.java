package defpackage;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class se5 implements oac, pac {
    public final te5 a;

    public se5(te5 te5Var) {
        this.a = te5Var;
    }

    @Override
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        int i = c6cVar.d;
        boolean z = false;
        if (i != 0) {
            te5 te5Var = this.a;
            String str = (String) te5Var.c.get(i - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, te5Var.b, te5Var.getContext());
            String M0 = jb6.M0(2131751991, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.a0(null, null, 2131751989, str);
            alertDialog$Builder.j(jb6.M0(2131751992, null), new nv4(te5Var, str, (byte) 4));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            heVar.show();
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        int i = ((c6c) obj).d;
        te5 te5Var = this.a;
        if (i == 0) {
            af5 a = af5.a(te5Var.a);
            a.f.clear();
            a.d();
            te5Var.f.O(true);
            return;
        }
        qac qacVar = te5Var.h;
        if (qacVar != null) {
            qacVar.a((String) te5Var.c.get(i - 1));
        }
    }
}
