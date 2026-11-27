package defpackage;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public final class lj3 implements ag4 {
    public final Context a;
    public final uj3 b;

    public lj3(uj3 uj3Var, Context context) {
        this.b = uj3Var;
        this.a = context;
    }

    @Override
    public final void a(float f) {
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        uj3 uj3Var = this.b;
        if (i != 0 || uj3Var.f0[1].getVisibility() == 0 || uj3Var.l2) {
            boolean z = uj3Var.k3;
            tj3[] tj3VarArr = uj3Var.f0;
            if (z) {
                tj3 tj3Var = tj3VarArr[0];
                tj3Var.setTranslationX((-f) * tj3Var.getMeasuredWidth());
                tj3[] tj3VarArr2 = uj3Var.f0;
                tj3VarArr2[1].setTranslationX(tj3VarArr2[0].getMeasuredWidth() - (f * uj3Var.f0[0].getMeasuredWidth()));
            } else {
                tj3 tj3Var2 = tj3VarArr[0];
                tj3Var2.setTranslationX(tj3Var2.getMeasuredWidth() * f);
                tj3[] tj3VarArr3 = uj3Var.f0;
                tj3VarArr3[1].setTranslationX((f * tj3VarArr3[0].getMeasuredWidth()) - uj3Var.f0[0].getMeasuredWidth());
            }
            if (i == 0) {
                tj3[] tj3VarArr4 = uj3Var.f0;
                tj3 tj3Var3 = tj3VarArr4[0];
                tj3VarArr4[0] = tj3VarArr4[1];
                tj3VarArr4[1] = tj3Var3;
                tj3Var3.setVisibility(8);
                uj3Var.j5(true);
                uj3Var.p5(false);
                uj3Var.F5(-1, true);
                uj3Var.A0.Q = false;
                uj3Var.M2(uj3Var.f0[0]);
                uj3Var.f0[0].d.getClass();
                uj3Var.f0[1].d.getClass();
            }
        }
    }

    @Override
    public final boolean b() {
        return !this.b.l2;
    }

    public final void c(ac7 ac7Var) {
        boolean c = ac7Var.c();
        uj3 uj3Var = this.b;
        if (c) {
            qn4.c1(uj3Var, ac7Var.a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uj3Var.getParentActivity());
        String M0 = ob6.M0(2131750755, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131750754, null);
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(ob6.M0(2131751563, null), new q72(this, ac7Var, (byte) 27));
        uj3Var.showDialog(idVar);
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, uj3Var.getResourceProvider());
        }
    }

    @Override
    public final void e() {
        this.b.R4(true, false);
    }

    @Override
    public final boolean g(defpackage.dg4 r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj3.g(dg4):boolean");
    }

    @Override
    public final boolean i() {
        fu5 fu5Var = this.b.M0;
        if (fu5Var != null && fu5Var.E()) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(int i) {
        c((ac7) this.b.getMessagesController().T0().get(i));
    }

    @Override
    public final void p(int i, int i2) {
        int i3 = 0;
        while (true) {
            tj3[] tj3VarArr = this.b.f0;
            if (i3 < tj3VarArr.length) {
                tj3 tj3Var = tj3VarArr[i3];
                int i4 = tj3Var.h;
                if (i4 == i) {
                    tj3Var.h = i2;
                } else if (i4 == i2) {
                    tj3Var.h = i;
                }
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final int q(int i) {
        uj3 uj3Var = this.b;
        if (uj3Var.T0 != 3) {
            if (i == uj3Var.A0.getDefaultTabId()) {
                return uj3Var.getMessagesStorage().L;
            }
            ArrayList T0 = uj3Var.getMessagesController().T0();
            if (i >= 0 && i < T0.size()) {
                return ((ac7) uj3Var.getMessagesController().T0().get(i)).d;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void s(bg4 bg4Var, boolean z) {
        int i;
        int i2;
        uj3 uj3Var = this.b;
        int i3 = uj3Var.f0[0].h;
        int i4 = bg4Var.a;
        if (i3 != i4) {
            if (bg4Var.f) {
                uj3Var.A0.n(i4);
                i2 = ((e) uj3Var).currentAccount;
                uj3Var.showDialog(new l46(3, i2, null, this.a, uj3Var));
                return;
            }
            ArrayList T0 = uj3Var.getMessagesController().T0();
            if (!bg4Var.e && ((i = bg4Var.a) < 0 || i >= T0.size())) {
                return;
            }
            tj3 tj3Var = uj3Var.f0[1];
            tj3Var.h = bg4Var.a;
            tj3Var.setVisibility(0);
            tj3[] tj3VarArr = uj3Var.f0;
            tj3VarArr[1].setTranslationX(tj3VarArr[0].getMeasuredWidth());
            uj3Var.j5(false);
            uj3Var.n5(true);
            uj3Var.F5(bg4Var.a, true);
            uj3Var.k3 = z;
        }
    }
}
