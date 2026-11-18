package oi;

import android.os.SystemClock;
import org.telegram.ui.ActionBar.n6;
public final class b1 implements Runnable {
    public final int f21943a;
    public final e1 f21944b;

    public b1(e1 e1Var, int i7) {
        this.f21943a = i7;
        this.f21944b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f21943a) {
            case 0:
                e1 e1Var = this.f21944b;
                if (e1Var.f22028z2 >= 0) {
                    long uptimeMillis = (e1Var.f22027y2 + 500) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0 && e1Var.isFocused()) {
                        e1Var.postDelayed(this, uptimeMillis);
                        return;
                    }
                    int i7 = e1Var.f22028z2;
                    e1Var.f22028z2 = -1;
                    e1Var.setInputType(i7);
                    return;
                }
                return;
            default:
                boolean h12 = n6.h1();
                e1 e1Var2 = this.f21944b;
                if (h12) {
                    e1Var2.postDelayed(this, 100L);
                    return;
                } else {
                    e1Var2.J();
                    return;
                }
        }
    }
}
