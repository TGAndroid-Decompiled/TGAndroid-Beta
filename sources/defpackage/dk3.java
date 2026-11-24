package defpackage;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class dk3 implements dg4 {
    public final Context a;
    public final nk3 b;

    public dk3(nk3 nk3Var, Context context) {
        this.b = nk3Var;
        this.a = context;
    }

    public final int a(int i) {
        nk3 nk3Var = this.b;
        if (nk3Var.T0 != 3) {
            if (i == nk3Var.A0.getDefaultTabId()) {
                return nk3Var.getMessagesStorage().L;
            }
            ArrayList S0 = nk3Var.getMessagesController().S0();
            if (i >= 0 && i < S0.size()) {
                return ((ub7) nk3Var.getMessagesController().S0().get(i)).d;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f) {
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        nk3 nk3Var = this.b;
        if (i != 0 || nk3Var.f0[1].getVisibility() == 0 || nk3Var.l2) {
            boolean z = nk3Var.k3;
            mk3[] mk3VarArr = nk3Var.f0;
            if (z) {
                mk3 mk3Var = mk3VarArr[0];
                mk3Var.setTranslationX((-f) * mk3Var.getMeasuredWidth());
                mk3[] mk3VarArr2 = nk3Var.f0;
                mk3VarArr2[1].setTranslationX(mk3VarArr2[0].getMeasuredWidth() - (f * nk3Var.f0[0].getMeasuredWidth()));
            } else {
                mk3 mk3Var2 = mk3VarArr[0];
                mk3Var2.setTranslationX(mk3Var2.getMeasuredWidth() * f);
                mk3[] mk3VarArr3 = nk3Var.f0;
                mk3VarArr3[1].setTranslationX((f * mk3VarArr3[0].getMeasuredWidth()) - nk3Var.f0[0].getMeasuredWidth());
            }
            if (i == 0) {
                mk3[] mk3VarArr4 = nk3Var.f0;
                mk3 mk3Var3 = mk3VarArr4[0];
                mk3VarArr4[0] = mk3VarArr4[1];
                mk3VarArr4[1] = mk3Var3;
                mk3Var3.setVisibility(8);
                nk3Var.j5(true);
                nk3Var.p5(false);
                nk3Var.F5(-1, true);
                nk3Var.A0.P = false;
                nk3Var.M2(nk3Var.f0[0]);
                nk3Var.f0[0].d.getClass();
                nk3Var.f0[1].d.getClass();
            }
        }
    }

    public final void c(eg4 eg4Var, boolean z) {
        int i;
        int i2;
        nk3 nk3Var = this.b;
        int i3 = nk3Var.f0[0].h;
        int i4 = eg4Var.a;
        if (i3 != i4) {
            if (eg4Var.f) {
                nk3Var.A0.l(i4);
                i2 = ((d) nk3Var).currentAccount;
                nk3Var.showDialog(new i46(3, i2, null, this.a, nk3Var));
                return;
            }
            ArrayList S0 = nk3Var.getMessagesController().S0();
            if (!eg4Var.e && ((i = eg4Var.a) < 0 || i >= S0.size())) {
                return;
            }
            mk3 mk3Var = nk3Var.f0[1];
            mk3Var.h = eg4Var.a;
            mk3Var.setVisibility(0);
            mk3[] mk3VarArr = nk3Var.f0;
            mk3VarArr[1].setTranslationX(mk3VarArr[0].getMeasuredWidth());
            nk3Var.j5(false);
            nk3Var.n5(true);
            nk3Var.F5(eg4Var.a, true);
            nk3Var.k3 = z;
        }
    }

    public final void d(ub7 ub7Var) {
        boolean c = ub7Var.c();
        nk3 nk3Var = this.b;
        if (c) {
            ln4.b1(nk3Var, ub7Var.a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nk3Var.getParentActivity());
        String M0 = jb6.M0(2131750727, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131750726, null);
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(jb6.M0(2131751535, null), new x92(this, ub7Var, (byte) 24));
        nk3Var.showDialog(heVar);
        TextView textView = (TextView) heVar.c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, nk3Var.getResourceProvider());
        }
    }
}
