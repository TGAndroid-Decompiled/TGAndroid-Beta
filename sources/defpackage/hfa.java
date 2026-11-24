package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.d;
public final class hfa extends xu9 {
    public final nha J;

    public hfa(nha nhaVar, Context context, d dVar, int i, long j, ylb ylbVar) {
        super(context, dVar, i, j, ylbVar);
        this.J = nhaVar;
    }

    @Override
    public final void b(boolean z) {
        kfa kfaVar = this.J.L0;
        kfaVar.setAlpha(1.0f - this.F);
        kfaVar.setPivotX(kfaVar.getWidth() / 2.0f);
        kfaVar.setScaleX(((1.0f - this.F) * 0.2f) + 0.8f);
        kfaVar.setPivotY(gm.L(48.0f));
        kfaVar.setScaleY(((1.0f - this.F) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(k39 k39Var) {
        boolean z;
        vfa vfaVar;
        boolean z2;
        nha nhaVar = this.J;
        r7 r7Var = nhaVar.q0;
        if (r7Var == null) {
            return false;
        }
        nhaVar.Z0 = k39Var;
        String obj = r7Var.getSearchField().getText().toString();
        if (obj.length() == 0 && nhaVar.Z0 == null) {
            z = false;
        } else {
            z = true;
        }
        nhaVar.X0 = z;
        nhaVar.z1(false);
        int i = nhaVar.n0[0].F;
        if (i == 11) {
            zga zgaVar = nhaVar.V;
            if (zgaVar != null) {
                zgaVar.E(nhaVar.Z0, obj);
            }
            gm.t1(r7Var.getSearchField());
            return true;
        }
        if (i == 12 && (vfaVar = nhaVar.W) != null) {
            fw1 fw1Var = vfaVar.a;
            ys1 ys1Var = fw1Var.D1;
            if (ys1Var != null) {
                ys1Var.e(k39Var, true);
            }
            if (TextUtils.isEmpty(fw1Var.I3) && fw1Var.F3 == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            fw1Var.H3 = z2;
            fw1Var.r0 = z2;
            fw1Var.Pc(false);
            fw1Var.qd();
        }
        return true;
    }

    @Override
    public final void h(boolean z) {
        boolean z2;
        int i;
        int i2;
        super.h(z);
        nha nhaVar = this.J;
        hfa hfaVar = nhaVar.M0;
        if (nhaVar.Y0 && ((nhaVar.getSelectedTab() == 11 || nhaVar.getSelectedTab() == 12) && hfaVar.a())) {
            z2 = true;
        } else {
            z2 = false;
        }
        g(z2);
        r7 r7Var = nhaVar.p0;
        if (r7Var != null) {
            if (a() && nhaVar.y1.getUserConfig().p()) {
                i2 = 2131232449;
            } else {
                i2 = 2131232503;
            }
            s09 s09Var = r7Var.y;
            if (s09Var != null && r7Var.E != i2) {
                if (z) {
                    r7Var.E = i2;
                    gm.L3(s09Var, i2);
                } else {
                    r7Var.E = i2;
                    s09Var.setImageResource(i2);
                }
            }
        }
        r7 r7Var2 = nhaVar.q0;
        if (r7Var2 != null) {
            if (hfaVar != null && hfaVar.a() && nhaVar.getSelectedTab() == 11) {
                i = 2131745602;
            } else {
                i = 2131745570;
            }
            r7Var2.setSearchFieldHint(jb6.M0(i, null));
        }
    }
}
