package defpackage;

import android.os.SystemClock;
public final class jc9 implements Runnable {
    public final byte a;
    public final mc9 b;

    public jc9(mc9 mc9Var, byte b) {
        this.a = b;
        this.b = mc9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mc9 mc9Var = this.b;
        switch (b) {
            case 0:
                if (mc9Var.z2 >= 0) {
                    long uptimeMillis = (mc9Var.y2 + 500) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0 && mc9Var.isFocused()) {
                        mc9Var.postDelayed(this, uptimeMillis);
                        return;
                    }
                    int i = mc9Var.z2;
                    mc9Var.z2 = -1;
                    mc9Var.setInputType(i);
                    return;
                }
                return;
            default:
                if (bkb.f1()) {
                    mc9Var.postDelayed(this, 100L);
                    return;
                } else {
                    mc9Var.J();
                    return;
                }
        }
    }
}
