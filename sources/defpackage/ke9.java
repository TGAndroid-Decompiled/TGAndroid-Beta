package defpackage;

import android.os.SystemClock;
public final class ke9 implements Runnable {
    public final byte a;
    public final ne9 b;

    public ke9(ne9 ne9Var, byte b) {
        this.a = b;
        this.b = ne9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ne9 ne9Var = this.b;
        switch (b) {
            case 0:
                if (ne9Var.z2 >= 0) {
                    long uptimeMillis = (ne9Var.y2 + 500) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0 && ne9Var.isFocused()) {
                        ne9Var.postDelayed(this, uptimeMillis);
                        return;
                    }
                    int i = ne9Var.z2;
                    ne9Var.z2 = -1;
                    ne9Var.setInputType(i);
                    return;
                }
                return;
            default:
                if (cmb.f1()) {
                    ne9Var.postDelayed(this, 100L);
                    return;
                } else {
                    ne9Var.J();
                    return;
                }
        }
    }
}
