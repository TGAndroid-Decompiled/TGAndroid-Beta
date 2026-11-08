package li;

import android.os.SystemClock;
import org.telegram.ui.ActionBar.k6;
public final class d1 implements Runnable {
    public final int f18510a;
    public final g1 f18511b;

    public d1(g1 g1Var, int i7) {
        this.f18510a = i7;
        this.f18511b = g1Var;
    }

    @Override
    public final void run() {
        switch (this.f18510a) {
            case 0:
                g1 g1Var = this.f18511b;
                if (g1Var.f18602t2 >= 0) {
                    long uptimeMillis = (g1Var.f18601s2 + 500) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0 && g1Var.isFocused()) {
                        g1Var.postDelayed(this, uptimeMillis);
                        return;
                    }
                    int i7 = g1Var.f18602t2;
                    g1Var.f18602t2 = -1;
                    g1Var.setInputType(i7);
                    return;
                }
                return;
            default:
                boolean h12 = k6.h1();
                g1 g1Var2 = this.f18511b;
                if (h12) {
                    g1Var2.postDelayed(this, 100L);
                    return;
                } else {
                    g1Var2.I();
                    return;
                }
        }
    }
}
