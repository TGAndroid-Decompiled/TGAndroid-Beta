package defpackage;

import android.os.SystemClock;
import org.telegram.ui.Dictation.DictationLid;
public final class ao3 implements Runnable {
    public final byte a;
    public final co3 b;

    public ao3(co3 co3Var, byte b) {
        this.a = b;
        this.b = co3Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                co3 co3Var = this.b;
                if (!co3Var.h && !co3Var.g) {
                    co3Var.e.postDelayed(this, 700L);
                    if (!co3Var.r && DictationLid.c != 0) {
                        int c = co3Var.k.c();
                        if (c - co3Var.u >= 16000) {
                            co3Var.u = c;
                            co3Var.r = true;
                            byte[] b = co3Var.k.b(0, c);
                            DictationLid.a.execute(new wd3(b, new rx1(this, b, (byte) 14), (byte) 20));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                co3 co3Var2 = this.b;
                if (!co3Var2.h) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    double d = elapsedRealtime - co3Var2.D;
                    float sin = (((float) Math.sin(d / 90.0d)) * 0.03f) + 0.04f;
                    if (elapsedRealtime < co3Var2.B) {
                        sin = (((float) Math.random()) * 0.12f) + (((float) Math.sin(d / 61.0d)) * 0.28f * ((float) Math.sin((d / 173.0d) + 1.3d))) + 0.45f;
                    }
                    co3Var2.c.e(Math.max(0.0f, Math.min(1.0f, sin)));
                    co3Var2.e.postDelayed(this, 50L);
                    return;
                }
                return;
        }
    }
}
