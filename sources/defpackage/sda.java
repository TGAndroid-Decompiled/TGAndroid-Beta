package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sda extends n7 {
    public final nfa a;

    public sda(nfa nfaVar) {
        this.a = nfaVar;
    }

    @Override
    public final void g() {
        r7 r7Var = this.a.q0;
        r7Var.setTranslationX(((View) r7Var.getParent()).getMeasuredWidth() - r7Var.getRight());
    }

    @Override
    public final void h() {
        nfa nfaVar = this.a;
        hda hdaVar = nfaVar.M0;
        ImageView imageView = nfaVar.u0;
        nfaVar.Y0 = false;
        nfaVar.Z0 = null;
        r7 r7Var = nfaVar.p0;
        if (r7Var != null) {
            r7Var.setVisibility(0);
        }
        if (imageView != null && nfaVar.U(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (hdaVar != null) {
            hdaVar.d.M(new d42((byte) 2));
            hdaVar.h = 0L;
            hdaVar.g(false);
        }
        vda vdaVar = nfaVar.W;
        if (vdaVar != null) {
            tu1 tu1Var = vdaVar.a;
            du1 du1Var = tu1Var.Vc;
            if (du1Var != null) {
                du1Var.h();
            }
            tu1Var.H3 = false;
            tu1Var.r0 = false;
            tu1Var.Bc(false);
            tu1Var.cd();
        }
        nfaVar.X0 = false;
        nfaVar.setSearchItemVisibility(0);
        nfaVar.j0.G(null, true);
        nfaVar.l0.G(null, true);
        nfaVar.k0.G(null, true);
        nfaVar.m0.F(null, true);
        zea zeaVar = nfaVar.V;
        if (zeaVar != null) {
            zeaVar.E(null, null);
        }
        nfaVar.R0(false);
        ry8 ry8Var = nfaVar.v0;
        if (ry8Var != null) {
            ry8Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(s33.h).start();
        }
        if (nfaVar.C0) {
            nfaVar.C0 = false;
        } else {
            nfaVar.z1(false);
        }
    }

    @Override
    public final void i() {
        boolean z;
        nfa nfaVar = this.a;
        nfaVar.Y0 = true;
        hda hdaVar = nfaVar.M0;
        if (hdaVar != null) {
            if ((nfaVar.getSelectedTab() == 11 || nfaVar.getSelectedTab() == 12) && hdaVar.a()) {
                z = true;
            } else {
                z = false;
            }
            hdaVar.g(z);
        }
        ImageView imageView = nfaVar.u0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        r7 r7Var = nfaVar.p0;
        if (r7Var != null) {
            r7Var.setVisibility(8);
        }
        nfaVar.setSearchItemVisibility(8);
        nfaVar.R0(true);
        ry8 ry8Var = nfaVar.v0;
        if (ry8Var != null) {
            ry8Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(s33.h).start();
        }
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        vda vdaVar = this.a.W;
        if (vdaVar != null) {
            vdaVar.a.C7();
        }
    }

    @Override
    public final void l(EditTextBoldCursor editTextBoldCursor) {
        boolean z;
        zea zeaVar;
        String obj = editTextBoldCursor.getText().toString();
        nfa nfaVar = this.a;
        vda vdaVar = nfaVar.W;
        if (vdaVar != null) {
            tu1 tu1Var = vdaVar.a;
            r7 r7Var = tu1Var.k0;
            if (r7Var != null) {
                tu1Var.I3 = obj;
                r7Var.P(obj, false);
            }
            if (TextUtils.isEmpty(obj) && nfaVar.Z0 == null) {
                tu1 tu1Var2 = vdaVar.a;
                du1 du1Var = tu1Var2.Vc;
                if (du1Var != null) {
                    du1Var.h();
                }
                tu1Var2.H3 = false;
                tu1Var2.r0 = false;
                tu1Var2.Bc(false);
                tu1Var2.cd();
            }
        }
        nfaVar.setSearchItemVisibility(8);
        if (obj.length() == 0 && nfaVar.Z0 == null) {
            z = false;
        } else {
            z = true;
        }
        nfaVar.X0 = z;
        nfaVar.post(new z6a(this, (byte) 5));
        int i = nfaVar.n0[0].F;
        if (i == 1) {
            kea keaVar = nfaVar.j0;
            if (keaVar != null) {
                keaVar.G(obj, true);
            }
        } else if (i == 3) {
            kea keaVar2 = nfaVar.l0;
            if (keaVar2 != null) {
                keaVar2.G(obj, true);
            }
        } else if (i == 4) {
            kea keaVar3 = nfaVar.k0;
            if (keaVar3 != null) {
                keaVar3.G(obj, true);
            }
        } else if (i == 7) {
            gea geaVar = nfaVar.m0;
            if (geaVar != null) {
                geaVar.F(obj, true);
            }
        } else if (i == 11 && (zeaVar = nfaVar.V) != null) {
            zeaVar.E(nfaVar.Z0, obj);
        }
    }
}
