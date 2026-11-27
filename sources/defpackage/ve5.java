package defpackage;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ve5 implements ncc, occ {
    public final we5 a;

    public ve5(we5 we5Var) {
        this.a = we5Var;
    }

    @Override
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        int i = b8cVar.d;
        boolean z = false;
        if (i != 0) {
            we5 we5Var = this.a;
            String str = (String) we5Var.c.get(i - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, we5Var.b, we5Var.getContext());
            String M0 = ob6.M0(2131752019, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.a0(null, null, 2131752017, str);
            alertDialog$Builder.j(ob6.M0(2131752020, null), new u34(we5Var, str, (byte) 8));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            idVar.show();
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
        int i = ((b8c) obj).d;
        we5 we5Var = this.a;
        if (i == 0) {
            df5 a = df5.a(we5Var.a);
            a.f.clear();
            a.d();
            we5Var.f.O(true);
            return;
        }
        pcc pccVar = we5Var.h;
        if (pccVar != null) {
            pccVar.a((String) we5Var.c.get(i - 1));
        }
    }
}
