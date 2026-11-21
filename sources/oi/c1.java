package oi;

import android.os.SystemClock;
import org.telegram.ui.ActionBar.m6;
public final class c1 implements Runnable {
    public final int f22038a;
    public final f1 f22039b;

    public c1(f1 f1Var, int i7) {
        this.f22038a = i7;
        this.f22039b = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f22038a) {
            case 0:
                f1 f1Var = this.f22039b;
                if (f1Var.f22118z2 >= 0) {
                    long uptimeMillis = (f1Var.f22117y2 + 500) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0 && f1Var.isFocused()) {
                        f1Var.postDelayed(this, uptimeMillis);
                        return;
                    }
                    int i7 = f1Var.f22118z2;
                    f1Var.f22118z2 = -1;
                    f1Var.setInputType(i7);
                    return;
                }
                return;
            default:
                boolean h12 = m6.h1();
                f1 f1Var2 = this.f22039b;
                if (h12) {
                    f1Var2.postDelayed(this, 100L);
                    return;
                } else {
                    f1Var2.J();
                    return;
                }
        }
    }
}
