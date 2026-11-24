package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.d;
public final class hda extends vs9 {
    public final nfa J;

    public hda(nfa nfaVar, Context context, d dVar, int i, long j, wjb wjbVar) {
        super(context, dVar, i, j, wjbVar);
        this.J = nfaVar;
    }

    @Override
    public final void b(boolean z) {
        kda kdaVar = this.J.L0;
        kdaVar.setAlpha(1.0f - this.F);
        kdaVar.setPivotX(kdaVar.getWidth() / 2.0f);
        kdaVar.setScaleX(((1.0f - this.F) * 0.2f) + 0.8f);
        kdaVar.setPivotY(gl.L(48.0f));
        kdaVar.setScaleY(((1.0f - this.F) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(h19 h19Var) {
        boolean z;
        vda vdaVar;
        boolean z2;
        nfa nfaVar = this.J;
        r7 r7Var = nfaVar.q0;
        if (r7Var == null) {
            return false;
        }
        nfaVar.Z0 = h19Var;
        String obj = r7Var.getSearchField().getText().toString();
        if (obj.length() == 0 && nfaVar.Z0 == null) {
            z = false;
        } else {
            z = true;
        }
        nfaVar.X0 = z;
        nfaVar.z1(false);
        int i = nfaVar.n0[0].F;
        if (i == 11) {
            zea zeaVar = nfaVar.V;
            if (zeaVar != null) {
                zeaVar.E(nfaVar.Z0, obj);
            }
            gl.t1(r7Var.getSearchField());
            return true;
        }
        if (i == 12 && (vdaVar = nfaVar.W) != null) {
            tu1 tu1Var = vdaVar.a;
            lr1 lr1Var = tu1Var.D1;
            if (lr1Var != null) {
                lr1Var.e(h19Var, true);
            }
            if (TextUtils.isEmpty(tu1Var.I3) && tu1Var.F3 == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            tu1Var.H3 = z2;
            tu1Var.r0 = z2;
            tu1Var.Bc(false);
            tu1Var.cd();
        }
        return true;
    }

    @Override
    public final void h(boolean z) {
        boolean z2;
        int i;
        int i2;
        super.h(z);
        nfa nfaVar = this.J;
        hda hdaVar = nfaVar.M0;
        if (nfaVar.Y0 && ((nfaVar.getSelectedTab() == 11 || nfaVar.getSelectedTab() == 12) && hdaVar.a())) {
            z2 = true;
        } else {
            z2 = false;
        }
        g(z2);
        r7 r7Var = nfaVar.p0;
        if (r7Var != null) {
            if (a() && nfaVar.y1.getUserConfig().p()) {
                i2 = 2131232448;
            } else {
                i2 = 2131232491;
            }
            ry8 ry8Var = r7Var.y;
            if (ry8Var != null && r7Var.E != i2) {
                if (z) {
                    r7Var.E = i2;
                    gl.M3(ry8Var, i2);
                } else {
                    r7Var.E = i2;
                    ry8Var.setImageResource(i2);
                }
            }
        }
        r7 r7Var2 = nfaVar.q0;
        if (r7Var2 != null) {
            if (hdaVar != null && hdaVar.a() && nfaVar.getSelectedTab() == 11) {
                i = 2131745676;
            } else {
                i = 2131745644;
            }
            r7Var2.setSearchFieldHint(k96.M0(i, null));
        }
    }
}
