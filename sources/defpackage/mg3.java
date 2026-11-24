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
public class mg3 extends dp4 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler l0;
    public boolean u0;
    public Dialog w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;
    public final o1 m0 = new o1(this, (byte) 20);
    public final jg3 n0 = new jg3(this);
    public final kg3 o0 = new kg3(this, (byte) 0);
    public int p0 = 0;
    public int q0 = 0;
    public boolean r0 = true;
    public boolean s0 = true;
    public int t0 = -1;
    public final ni6 v0 = new ni6(this, (byte) 26);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mg3.D(android.os.Bundle):android.view.LayoutInflater");
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
            hq4 p = p();
            int i = this.t0;
            if (i >= 0) {
                p.y(new fq4(p, i), true);
                this.t0 = -1;
                return;
            }
            u36.j(hg9.j(i, "Bad id: "));
            return;
        }
        ie0 ie0Var = new ie0(p());
        ie0Var.o = true;
        ie0Var.h(this);
        ie0Var.e(true, true);
    }

    public Dialog P() {
        if (hq4.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new jr2(K(), this.q0);
    }

    @Override
    public final jke h() {
        return new lg3(this, new lg3(this));
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.x0) {
            if (hq4.K(3)) {
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
        kj7 kj7Var = this.f0;
        kj7Var.getClass();
        kj7.a("observeForever");
        ni6 ni6Var = this.v0;
        n96 n96Var = new n96(kj7Var, ni6Var);
        xq9 xq9Var = kj7Var.b;
        uq9 h = xq9Var.h(ni6Var);
        if (h != null) {
            obj = h.b;
        } else {
            uq9 uq9Var = new uq9(ni6Var, n96Var);
            xq9Var.d++;
            uq9 uq9Var2 = xq9Var.b;
            if (uq9Var2 == null) {
                xq9Var.a = uq9Var;
                xq9Var.b = uq9Var;
            } else {
                uq9Var2.c = uq9Var;
                uq9Var.d = uq9Var2;
                xq9Var.b = uq9Var;
            }
            obj = null;
        }
        n96 n96Var2 = (n96) obj;
        if (!(n96Var2 instanceof m96)) {
            if (n96Var2 == null) {
                n96Var.a(true);
            }
            if (!this.z0) {
                this.y0 = false;
                return;
            }
            return;
        }
        u36.j("Cannot add the same observer with different lifecycles");
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
