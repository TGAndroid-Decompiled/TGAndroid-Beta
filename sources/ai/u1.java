package ai;

import android.os.SystemClock;
import org.telegram.ui.Dictation.DictationLid;
public final class u1 implements Runnable {
    public final int f1550a;
    public final w1 f1551b;

    public u1(w1 w1Var, int i7) {
        this.f1550a = i7;
        this.f1551b = w1Var;
    }

    @Override
    public final void run() {
        switch (this.f1550a) {
            case 0:
                w1 w1Var = this.f1551b;
                if (!w1Var.h && !w1Var.f1569g) {
                    w1Var.f1567e.postDelayed(this, 700L);
                    if (!w1Var.f1579r && DictationLid.f43152c != 0) {
                        int c10 = w1Var.f1572k.c();
                        if (c10 - w1Var.f1582u >= 16000) {
                            w1Var.f1582u = c10;
                            w1Var.f1579r = true;
                            byte[] b10 = w1Var.f1572k.b(0, c10);
                            DictationLid.f43150a.execute(new a1.e(16, b10, new s1(0, this, b10)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                w1 w1Var2 = this.f1551b;
                if (!w1Var2.h) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    double d = elapsedRealtime - w1Var2.D;
                    float sin = (((float) Math.sin(d / 90.0d)) * 0.03f) + 0.04f;
                    if (elapsedRealtime < w1Var2.B) {
                        sin = (((float) Math.random()) * 0.12f) + (((float) Math.sin(d / 61.0d)) * 0.28f * ((float) Math.sin((d / 173.0d) + 1.3d))) + 0.45f;
                    }
                    w1Var2.f1566c.f(Math.max(0.0f, Math.min(1.0f, sin)));
                    w1Var2.f1567e.postDelayed(this, 50L);
                    return;
                }
                return;
        }
    }
}
