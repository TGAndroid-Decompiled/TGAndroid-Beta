package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class ze3 extends bn4 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler l0;
    public boolean u0;
    public Dialog w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;
    public final o1 m0 = new o1(this, (byte) 20);
    public final we3 n0 = new we3(this);
    public final xe3 o0 = new xe3(this, (byte) 0);
    public int p0 = 0;
    public int q0 = 0;
    public boolean r0 = true;
    public boolean s0 = true;
    public int t0 = -1;
    public final qx4 v0 = new qx4(this);
    public boolean A0 = false;

    @Override
    public final void B() {
        this.V = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            this.x0 = true;
            dialog.setOnDismissListener(null);
            this.w0.dismiss();
            if (!this.y0) {
                onDismiss(this.w0);
            }
            this.w0 = null;
            this.A0 = false;
        }
    }

    @Override
    public final void C() {
        this.V = true;
        if (!this.z0 && !this.y0) {
            this.y0 = true;
        }
        this.f0.h(this.v0);
    }

    @Override
    public final android.view.LayoutInflater D(android.os.Bundle r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze3.D(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override
    public final void G(Bundle bundle) {
        Dialog dialog = this.w0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.p0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.q0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.r0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.s0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.t0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override
    public final void H() {
        this.V = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            this.x0 = false;
            dialog.show();
            View decorView = this.w0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(2131296731, this);
            decorView.setTag(2131296734, this);
            decorView.setTag(2131296733, this);
        }
    }

    @Override
    public void I() {
        this.V = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override
    public final void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.J(layoutInflater, viewGroup, bundle);
        if (this.w0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.w0.onRestoreInstanceState(bundle2);
        }
    }

    public final void O(boolean z) {
        if (this.y0) {
            return;
        }
        this.y0 = true;
        this.z0 = false;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.w0.dismiss();
            if (!z) {
                if (Looper.myLooper() == this.l0.getLooper()) {
                    onDismiss(this.w0);
                } else {
                    this.l0.post(this.m0);
                }
            }
        }
        this.x0 = true;
        if (this.t0 >= 0) {
            go4 p = p();
            int i = this.t0;
            if (i >= 0) {
                p.y(new eo4(p, i), true);
                this.t0 = -1;
                return;
            }
            w26.j(de9.k(i, "Bad id: "));
            return;
        }
        id0 id0Var = new id0(p());
        id0Var.o = true;
        id0Var.h(this);
        id0Var.e(true, true);
    }

    public Dialog P() {
        if (go4.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new yp2(K(), this.q0);
    }

    @Override
    public final iie h() {
        return new ye3(this, new ye3(this));
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.x0) {
            if (go4.K(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            O(true);
        }
    }

    @Override
    public final void w() {
        this.V = true;
    }

    @Override
    public final void y(Context context) {
        Object obj;
        super.y(context);
        hh7 hh7Var = this.f0;
        hh7Var.getClass();
        hh7.a("observeForever");
        qx4 qx4Var = this.v0;
        n76 n76Var = new n76(hh7Var, qx4Var);
        wo9 wo9Var = hh7Var.b;
        to9 h = wo9Var.h(qx4Var);
        if (h != null) {
            obj = h.b;
        } else {
            to9 to9Var = new to9(qx4Var, n76Var);
            wo9Var.d++;
            to9 to9Var2 = wo9Var.b;
            if (to9Var2 == null) {
                wo9Var.a = to9Var;
                wo9Var.b = to9Var;
            } else {
                to9Var2.c = to9Var;
                to9Var.d = to9Var2;
                wo9Var.b = to9Var;
            }
            obj = null;
        }
        n76 n76Var2 = (n76) obj;
        if (!(n76Var2 instanceof m76)) {
            if (n76Var2 == null) {
                n76Var.a(true);
            }
            if (!this.z0) {
                this.y0 = false;
                return;
            }
            return;
        }
        w26.j("Cannot add the same observer with different lifecycles");
    }

    @Override
    public void z(Bundle bundle) {
        boolean z;
        super.z(bundle);
        this.l0 = new Handler();
        if (this.P == 0) {
            z = true;
        } else {
            z = false;
        }
        this.s0 = z;
        if (bundle != null) {
            this.p0 = bundle.getInt("android:style", 0);
            this.q0 = bundle.getInt("android:theme", 0);
            this.r0 = bundle.getBoolean("android:cancelable", true);
            this.s0 = bundle.getBoolean("android:showsDialog", this.s0);
            this.t0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
