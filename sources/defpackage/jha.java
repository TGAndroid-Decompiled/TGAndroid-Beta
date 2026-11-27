package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jha extends o7 {
    public final eja a;

    public jha(eja ejaVar) {
        this.a = ejaVar;
    }

    @Override
    public final void g() {
        s7 s7Var = this.a.q0;
        s7Var.setTranslationX(((View) s7Var.getParent()).getMeasuredWidth() - s7Var.getRight());
    }

    @Override
    public final void h() {
        eja ejaVar = this.a;
        yga ygaVar = ejaVar.M0;
        ImageView imageView = ejaVar.u0;
        ejaVar.Y0 = false;
        ejaVar.Z0 = null;
        s7 s7Var = ejaVar.p0;
        if (s7Var != null) {
            s7Var.setVisibility(0);
        }
        if (imageView != null && ejaVar.U(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ygaVar != null) {
            ygaVar.d.N(new t42((byte) 2));
            ygaVar.h = 0L;
            ygaVar.g(false);
        }
        mha mhaVar = ejaVar.W;
        if (mhaVar != null) {
            gv1 gv1Var = mhaVar.a;
            qu1 qu1Var = gv1Var.jd;
            if (qu1Var != null) {
                qu1Var.h();
            }
            gv1Var.H3 = false;
            gv1Var.r0 = false;
            gv1Var.Pc(false);
            gv1Var.qd();
        }
        ejaVar.X0 = false;
        ejaVar.setSearchItemVisibility(0);
        ejaVar.j0.G(null, true);
        ejaVar.l0.G(null, true);
        ejaVar.k0.G(null, true);
        ejaVar.m0.F(null, true);
        qia qiaVar = ejaVar.V;
        if (qiaVar != null) {
            qiaVar.E(null, null);
        }
        ejaVar.R0(false);
        e29 e29Var = ejaVar.v0;
        if (e29Var != null) {
            e29Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(k43.h).start();
        }
        if (ejaVar.C0) {
            ejaVar.C0 = false;
        } else {
            ejaVar.z1(false);
        }
    }

    @Override
    public final void i() {
        boolean z;
        eja ejaVar = this.a;
        ejaVar.Y0 = true;
        yga ygaVar = ejaVar.M0;
        if (ygaVar != null) {
            if ((ejaVar.getSelectedTab() == 11 || ejaVar.getSelectedTab() == 12) && ygaVar.a()) {
                z = true;
            } else {
                z = false;
            }
            ygaVar.g(z);
        }
        ImageView imageView = ejaVar.u0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        s7 s7Var = ejaVar.p0;
        if (s7Var != null) {
            s7Var.setVisibility(8);
        }
        ejaVar.setSearchItemVisibility(8);
        ejaVar.R0(true);
        e29 e29Var = ejaVar.v0;
        if (e29Var != null) {
            e29Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(k43.h).start();
        }
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        mha mhaVar = this.a.W;
        if (mhaVar != null) {
            mhaVar.a.M7();
        }
    }

    @Override
    public final void l(EditTextBoldCursor editTextBoldCursor) {
        boolean z;
        qia qiaVar;
        String obj = editTextBoldCursor.getText().toString();
        eja ejaVar = this.a;
        mha mhaVar = ejaVar.W;
        if (mhaVar != null) {
            gv1 gv1Var = mhaVar.a;
            s7 s7Var = gv1Var.k0;
            if (s7Var != null) {
                gv1Var.I3 = obj;
                s7Var.P(obj, false);
            }
            if (TextUtils.isEmpty(obj) && ejaVar.Z0 == null) {
                gv1 gv1Var2 = mhaVar.a;
                qu1 qu1Var = gv1Var2.jd;
                if (qu1Var != null) {
                    qu1Var.h();
                }
                gv1Var2.H3 = false;
                gv1Var2.r0 = false;
                gv1Var2.Pc(false);
                gv1Var2.qd();
            }
        }
        ejaVar.setSearchItemVisibility(8);
        if (obj.length() == 0 && ejaVar.Z0 == null) {
            z = false;
        } else {
            z = true;
        }
        ejaVar.X0 = z;
        ejaVar.post(new ux9(this, (byte) 22));
        int i = ejaVar.n0[0].F;
        if (i == 1) {
            bia biaVar = ejaVar.j0;
            if (biaVar != null) {
                biaVar.G(obj, true);
            }
        } else if (i == 3) {
            bia biaVar2 = ejaVar.l0;
            if (biaVar2 != null) {
                biaVar2.G(obj, true);
            }
        } else if (i == 4) {
            bia biaVar3 = ejaVar.k0;
            if (biaVar3 != null) {
                biaVar3.G(obj, true);
            }
        } else if (i == 7) {
            xha xhaVar = ejaVar.m0;
            if (xhaVar != null) {
                xhaVar.F(obj, true);
            }
        } else if (i == 11 && (qiaVar = ejaVar.V) != null) {
            qiaVar.E(ejaVar.Z0, obj);
        }
    }
}
