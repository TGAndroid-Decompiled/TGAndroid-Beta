package ai;

import android.os.SystemClock;
import org.telegram.ui.Dictation.DictationLid;
public final class t1 implements Runnable {
    public final int f1538a;
    public final v1 f1539b;

    public t1(v1 v1Var, int i7) {
        this.f1538a = i7;
        this.f1539b = v1Var;
    }

    @Override
    public final void run() {
        switch (this.f1538a) {
            case 0:
                v1 v1Var = this.f1539b;
                if (!v1Var.h && !v1Var.f1557g) {
                    v1Var.f1555e.postDelayed(this, 700L);
                    if (!v1Var.f1567r && DictationLid.f43042c != 0) {
                        int c10 = v1Var.f1560k.c();
                        if (c10 - v1Var.f1570u >= 16000) {
                            v1Var.f1570u = c10;
                            v1Var.f1567r = true;
                            byte[] b10 = v1Var.f1560k.b(0, c10);
                            DictationLid.f43040a.execute(new a1.e(14, b10, new r1(0, this, b10)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                v1 v1Var2 = this.f1539b;
                if (!v1Var2.h) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    double d = elapsedRealtime - v1Var2.D;
                    float sin = (((float) Math.sin(d / 90.0d)) * 0.03f) + 0.04f;
                    if (elapsedRealtime < v1Var2.B) {
                        sin = (((float) Math.random()) * 0.12f) + (((float) Math.sin(d / 61.0d)) * 0.28f * ((float) Math.sin((d / 173.0d) + 1.3d))) + 0.45f;
                    }
                    v1Var2.f1554c.h(Math.max(0.0f, Math.min(1.0f, sin)));
                    v1Var2.f1555e.postDelayed(this, 50L);
                    return;
                }
                return;
        }
    }
}
