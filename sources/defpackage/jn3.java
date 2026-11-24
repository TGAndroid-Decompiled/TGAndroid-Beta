package defpackage;

import android.os.SystemClock;
import org.telegram.ui.Dictation.DictationLid;
public final class jn3 implements Runnable {
    public final byte a;
    public final ln3 b;

    public jn3(ln3 ln3Var, byte b) {
        this.a = b;
        this.b = ln3Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                ln3 ln3Var = this.b;
                if (!ln3Var.h && !ln3Var.g) {
                    ln3Var.e.postDelayed(this, 700L);
                    if (!ln3Var.r && DictationLid.c != 0) {
                        int c = ln3Var.k.c();
                        if (c - ln3Var.u >= 16000) {
                            ln3Var.u = c;
                            ln3Var.r = true;
                            byte[] b = ln3Var.k.b(0, c);
                            DictationLid.a.execute(new wc3(b, new pz1(this, b, (byte) 13), (byte) 22));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ln3 ln3Var2 = this.b;
                if (!ln3Var2.h) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    double d = elapsedRealtime - ln3Var2.D;
                    float sin = (((float) Math.sin(d / 90.0d)) * 0.03f) + 0.04f;
                    if (elapsedRealtime < ln3Var2.B) {
                        sin = (((float) Math.random()) * 0.12f) + (((float) Math.sin(d / 61.0d)) * 0.28f * ((float) Math.sin((d / 173.0d) + 1.3d))) + 0.45f;
                    }
                    ln3Var2.c.d(Math.max(0.0f, Math.min(1.0f, sin)));
                    ln3Var2.e.postDelayed(this, 50L);
                    return;
                }
                return;
        }
    }
}
