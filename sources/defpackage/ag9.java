package defpackage;

import android.os.SystemClock;
public final class ag9 implements Runnable {
    public final byte a;
    public final dg9 b;

    public ag9(dg9 dg9Var, byte b) {
        this.a = b;
        this.b = dg9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        dg9 dg9Var = this.b;
        switch (b) {
            case 0:
                if (dg9Var.A2 >= 0) {
                    long uptimeMillis = (dg9Var.z2 + 500) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0 && dg9Var.isFocused()) {
                        dg9Var.postDelayed(this, uptimeMillis);
                        return;
                    }
                    int i = dg9Var.A2;
                    dg9Var.A2 = -1;
                    dg9Var.setInputType(i);
                    return;
                }
                return;
            default:
                if (aob.f1()) {
                    dg9Var.postDelayed(this, 100L);
                    return;
                } else {
                    dg9Var.J();
                    return;
                }
        }
    }
}
