package oi;

import android.os.SystemClock;
import org.telegram.ui.ActionBar.m6;
public final class b1 implements Runnable {
    public final int f21972a;
    public final e1 f21973b;

    public b1(e1 e1Var, int i7) {
        this.f21972a = i7;
        this.f21973b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f21972a) {
            case 0:
                e1 e1Var = this.f21973b;
                if (e1Var.f22057z2 >= 0) {
                    long uptimeMillis = (e1Var.f22056y2 + 500) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0 && e1Var.isFocused()) {
                        e1Var.postDelayed(this, uptimeMillis);
                        return;
                    }
                    int i7 = e1Var.f22057z2;
                    e1Var.f22057z2 = -1;
                    e1Var.setInputType(i7);
                    return;
                }
                return;
            default:
                boolean h12 = m6.h1();
                e1 e1Var2 = this.f21973b;
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
