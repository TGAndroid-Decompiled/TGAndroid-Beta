package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sfa extends n7 {
    public final nha a;

    public sfa(nha nhaVar) {
        this.a = nhaVar;
    }

    @Override
    public final void g() {
        r7 r7Var = this.a.q0;
        r7Var.setTranslationX(((View) r7Var.getParent()).getMeasuredWidth() - r7Var.getRight());
    }

    @Override
    public final void h() {
        nha nhaVar = this.a;
        hfa hfaVar = nhaVar.M0;
        ImageView imageView = nhaVar.u0;
        nhaVar.Y0 = false;
        nhaVar.Z0 = null;
        r7 r7Var = nhaVar.p0;
        if (r7Var != null) {
            r7Var.setVisibility(0);
        }
        if (imageView != null && nhaVar.U(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (hfaVar != null) {
            hfaVar.d.M(new o52((byte) 2));
            hfaVar.h = 0L;
            hfaVar.g(false);
        }
        vfa vfaVar = nhaVar.W;
        if (vfaVar != null) {
            fw1 fw1Var = vfaVar.a;
            pv1 pv1Var = fw1Var.gd;
            if (pv1Var != null) {
                pv1Var.h();
            }
            fw1Var.H3 = false;
            fw1Var.r0 = false;
            fw1Var.Pc(false);
            fw1Var.qd();
        }
        nhaVar.X0 = false;
        nhaVar.setSearchItemVisibility(0);
        nhaVar.j0.G(null, true);
        nhaVar.l0.G(null, true);
        nhaVar.k0.G(null, true);
        nhaVar.m0.F(null, true);
        zga zgaVar = nhaVar.V;
        if (zgaVar != null) {
            zgaVar.E(null, null);
        }
        nhaVar.R0(false);
        s09 s09Var = nhaVar.v0;
        if (s09Var != null) {
            s09Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(d53.h).start();
        }
        if (nhaVar.C0) {
            nhaVar.C0 = false;
        } else {
            nhaVar.z1(false);
        }
    }

    @Override
    public final void i() {
        boolean z;
        nha nhaVar = this.a;
        nhaVar.Y0 = true;
        hfa hfaVar = nhaVar.M0;
        if (hfaVar != null) {
            if ((nhaVar.getSelectedTab() == 11 || nhaVar.getSelectedTab() == 12) && hfaVar.a()) {
                z = true;
            } else {
                z = false;
            }
            hfaVar.g(z);
        }
        ImageView imageView = nhaVar.u0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        r7 r7Var = nhaVar.p0;
        if (r7Var != null) {
            r7Var.setVisibility(8);
        }
        nhaVar.setSearchItemVisibility(8);
        nhaVar.R0(true);
        s09 s09Var = nhaVar.v0;
        if (s09Var != null) {
            s09Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(d53.h).start();
        }
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        vfa vfaVar = this.a.W;
        if (vfaVar != null) {
            vfaVar.a.M7();
        }
    }

    @Override
    public final void l(EditTextBoldCursor editTextBoldCursor) {
        boolean z;
        zga zgaVar;
        String obj = editTextBoldCursor.getText().toString();
        nha nhaVar = this.a;
        vfa vfaVar = nhaVar.W;
        if (vfaVar != null) {
            fw1 fw1Var = vfaVar.a;
            r7 r7Var = fw1Var.k0;
            if (r7Var != null) {
                fw1Var.I3 = obj;
                r7Var.P(obj, false);
            }
            if (TextUtils.isEmpty(obj) && nhaVar.Z0 == null) {
                fw1 fw1Var2 = vfaVar.a;
                pv1 pv1Var = fw1Var2.gd;
                if (pv1Var != null) {
                    pv1Var.h();
                }
                fw1Var2.H3 = false;
                fw1Var2.r0 = false;
                fw1Var2.Pc(false);
                fw1Var2.qd();
            }
        }
        nhaVar.setSearchItemVisibility(8);
        if (obj.length() == 0 && nhaVar.Z0 == null) {
            z = false;
        } else {
            z = true;
        }
        nhaVar.X0 = z;
        nhaVar.post(new c0a(this, (byte) 13));
        int i = nhaVar.n0[0].F;
        if (i == 1) {
            kga kgaVar = nhaVar.j0;
            if (kgaVar != null) {
                kgaVar.G(obj, true);
            }
        } else if (i == 3) {
            kga kgaVar2 = nhaVar.l0;
            if (kgaVar2 != null) {
                kgaVar2.G(obj, true);
            }
        } else if (i == 4) {
            kga kgaVar3 = nhaVar.k0;
            if (kgaVar3 != null) {
                kgaVar3.G(obj, true);
            }
        } else if (i == 7) {
            gga ggaVar = nhaVar.m0;
            if (ggaVar != null) {
                ggaVar.F(obj, true);
            }
        } else if (i == 11 && (zgaVar = nhaVar.V) != null) {
            zgaVar.E(nhaVar.Z0, obj);
        }
    }
}
