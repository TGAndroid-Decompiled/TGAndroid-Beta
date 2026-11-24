package defpackage;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class ti3 implements ce4 {
    public final Context a;
    public final cj3 b;

    public ti3(cj3 cj3Var, Context context) {
        this.b = cj3Var;
        this.a = context;
    }

    public final int a(int i) {
        cj3 cj3Var = this.b;
        if (cj3Var.T0 != 3) {
            if (i == cj3Var.A0.getDefaultTabId()) {
                return cj3Var.getMessagesStorage().L;
            }
            ArrayList R0 = cj3Var.getMessagesController().R0();
            if (i >= 0 && i < R0.size()) {
                return ((t97) cj3Var.getMessagesController().R0().get(i)).d;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f) {
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        cj3 cj3Var = this.b;
        if (i != 0 || cj3Var.f0[1].getVisibility() == 0 || cj3Var.l2) {
            boolean z = cj3Var.k3;
            bj3[] bj3VarArr = cj3Var.f0;
            if (z) {
                bj3 bj3Var = bj3VarArr[0];
                bj3Var.setTranslationX((-f) * bj3Var.getMeasuredWidth());
                bj3[] bj3VarArr2 = cj3Var.f0;
                bj3VarArr2[1].setTranslationX(bj3VarArr2[0].getMeasuredWidth() - (f * cj3Var.f0[0].getMeasuredWidth()));
            } else {
                bj3 bj3Var2 = bj3VarArr[0];
                bj3Var2.setTranslationX(bj3Var2.getMeasuredWidth() * f);
                bj3[] bj3VarArr3 = cj3Var.f0;
                bj3VarArr3[1].setTranslationX((f * bj3VarArr3[0].getMeasuredWidth()) - cj3Var.f0[0].getMeasuredWidth());
            }
            if (i == 0) {
                bj3[] bj3VarArr4 = cj3Var.f0;
                bj3 bj3Var3 = bj3VarArr4[0];
                bj3VarArr4[0] = bj3VarArr4[1];
                bj3VarArr4[1] = bj3Var3;
                bj3Var3.setVisibility(8);
                cj3Var.f5(true);
                cj3Var.l5(false);
                cj3Var.B5(-1, true);
                cj3Var.A0.P = false;
                cj3Var.K2(cj3Var.f0[0]);
                cj3Var.f0[0].d.getClass();
                cj3Var.f0[1].d.getClass();
            }
        }
    }

    public final void c(de4 de4Var, boolean z) {
        int i;
        int i2;
        cj3 cj3Var = this.b;
        int i3 = cj3Var.f0[0].h;
        int i4 = de4Var.a;
        if (i3 != i4) {
            if (de4Var.f) {
                cj3Var.A0.l(i4);
                i2 = ((d) cj3Var).currentAccount;
                cj3Var.showDialog(new h26(3, i2, null, this.a, cj3Var));
                return;
            }
            ArrayList R0 = cj3Var.getMessagesController().R0();
            if (!de4Var.e && ((i = de4Var.a) < 0 || i >= R0.size())) {
                return;
            }
            bj3 bj3Var = cj3Var.f0[1];
            bj3Var.h = de4Var.a;
            bj3Var.setVisibility(0);
            bj3[] bj3VarArr = cj3Var.f0;
            bj3VarArr[1].setTranslationX(bj3VarArr[0].getMeasuredWidth());
            cj3Var.f5(false);
            cj3Var.j5(true);
            cj3Var.B5(de4Var.a, true);
            cj3Var.k3 = z;
        }
    }

    public final void d(t97 t97Var) {
        boolean c = t97Var.c();
        cj3 cj3Var = this.b;
        if (c) {
            ll4.b1(cj3Var, t97Var.a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cj3Var.getParentActivity());
        String M0 = k96.M0(2131750778, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131750777, null);
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(k96.M0(2131751586, null), new v82(this, t97Var, (byte) 23));
        cj3Var.showDialog(hdVar);
        TextView textView = (TextView) hdVar.c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, cj3Var.getResourceProvider());
        }
    }
}
