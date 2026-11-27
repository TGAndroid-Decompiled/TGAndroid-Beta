package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.e;
public final class yga extends ow9 {
    public final eja J;

    public yga(eja ejaVar, Context context, e eVar, int i, long j, vnb vnbVar) {
        super(context, eVar, i, j, vnbVar);
        this.J = ejaVar;
    }

    @Override
    public final void b(boolean z) {
        bha bhaVar = this.J.L0;
        bhaVar.setAlpha(1.0f - this.F);
        bhaVar.setPivotX(bhaVar.getWidth() / 2.0f);
        bhaVar.setScaleX(((1.0f - this.F) * 0.2f) + 0.8f);
        bhaVar.setPivotY(hl.L(48.0f));
        bhaVar.setScaleY(((1.0f - this.F) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(w49 w49Var) {
        boolean z;
        mha mhaVar;
        boolean z2;
        eja ejaVar = this.J;
        s7 s7Var = ejaVar.q0;
        if (s7Var == null) {
            return false;
        }
        ejaVar.Z0 = w49Var;
        String obj = s7Var.getSearchField().getText().toString();
        if (obj.length() == 0 && ejaVar.Z0 == null) {
            z = false;
        } else {
            z = true;
        }
        ejaVar.X0 = z;
        ejaVar.z1(false);
        int i = ejaVar.n0[0].F;
        if (i == 11) {
            qia qiaVar = ejaVar.V;
            if (qiaVar != null) {
                qiaVar.E(ejaVar.Z0, obj);
            }
            hl.t1(s7Var.getSearchField());
            return true;
        }
        if (i == 12 && (mhaVar = ejaVar.W) != null) {
            gv1 gv1Var = mhaVar.a;
            zr1 zr1Var = gv1Var.D1;
            if (zr1Var != null) {
                zr1Var.e(w49Var, true);
            }
            if (TextUtils.isEmpty(gv1Var.I3) && gv1Var.F3 == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            gv1Var.H3 = z2;
            gv1Var.r0 = z2;
            gv1Var.Pc(false);
            gv1Var.qd();
        }
        return true;
    }

    @Override
    public final void h(boolean z) {
        boolean z2;
        int i;
        int i2;
        super.h(z);
        eja ejaVar = this.J;
        yga ygaVar = ejaVar.M0;
        if (ejaVar.Y0 && ((ejaVar.getSelectedTab() == 11 || ejaVar.getSelectedTab() == 12) && ygaVar.a())) {
            z2 = true;
        } else {
            z2 = false;
        }
        g(z2);
        s7 s7Var = ejaVar.p0;
        if (s7Var != null) {
            if (a() && ejaVar.y1.getUserConfig().p()) {
                i2 = 2131232448;
            } else {
                i2 = 2131232502;
            }
            e29 e29Var = s7Var.y;
            if (e29Var != null && s7Var.E != i2) {
                if (z) {
                    s7Var.E = i2;
                    hl.L3(e29Var, i2);
                } else {
                    s7Var.E = i2;
                    e29Var.setImageResource(i2);
                }
            }
        }
        s7 s7Var2 = ejaVar.q0;
        if (s7Var2 != null) {
            if (ygaVar != null && ygaVar.a() && ejaVar.getSelectedTab() == 11) {
                i = 2131745596;
            } else {
                i = 2131745564;
            }
            s7Var2.setSearchFieldHint(ob6.M0(i, null));
        }
    }
}
