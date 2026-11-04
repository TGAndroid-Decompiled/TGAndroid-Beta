package mi;

import android.os.SystemClock;
import org.telegram.ui.ActionBar.k6;
public final class e1 implements Runnable {
    public final int f19569a;
    public final h1 f19570b;

    public e1(h1 h1Var, int i3) {
        this.f19569a = i3;
        this.f19570b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f19569a) {
            case 0:
                h1 h1Var = this.f19570b;
                if (h1Var.f19665u2 >= 0) {
                    long uptimeMillis = (h1Var.f19664t2 + 500) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0 && h1Var.isFocused()) {
                        h1Var.postDelayed(this, uptimeMillis);
                        return;
                    }
                    int i3 = h1Var.f19665u2;
                    h1Var.f19665u2 = -1;
                    h1Var.setInputType(i3);
                    return;
                }
                return;
            default:
                boolean h12 = k6.h1();
                h1 h1Var2 = this.f19570b;
                if (h12) {
                    h1Var2.postDelayed(this, 100L);
                    return;
                } else {
                    h1Var2.I();
                    return;
                }
        }
    }
}
