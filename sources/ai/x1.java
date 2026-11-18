package ai;

import android.os.SystemClock;
import org.telegram.ui.Dictation.DictationLid;
public final class x1 implements Runnable {
    public final int f1611a;
    public final c2 f1612b;

    public x1(c2 c2Var, int i7) {
        this.f1611a = i7;
        this.f1612b = c2Var;
    }

    @Override
    public final void run() {
        z zVar;
        switch (this.f1611a) {
            case 0:
                c2 c2Var = this.f1612b;
                if (!c2Var.f1153j && !c2Var.f1151i) {
                    c2Var.f1146f.postDelayed(this, 700L);
                    if (!c2Var.E && DictationLid.f()) {
                        int c10 = c2Var.f1164u.c();
                        if (c10 - c2Var.H >= 16000) {
                            c2Var.H = c10;
                            c2Var.E = true;
                            byte[] b10 = c2Var.f1164u.b(0, c10);
                            DictationLid.f43030a.execute(new a1.e(16, b10, new v1(0, this, b10)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                c2 c2Var2 = this.f1612b;
                if (!c2Var2.f1153j) {
                    c2Var2.f1146f.postDelayed(this, 700L);
                    if (!c2Var2.W && !c2Var2.f1151i && (zVar = c2Var2.f1164u) != null) {
                        int i7 = c2Var2.Y;
                        int c11 = zVar.c();
                        if (c11 - c2Var2.Z >= 16000) {
                            c2Var2.Z = c11;
                            c2Var2.W = true;
                            int max = Math.max(c2Var2.X, c11 - 960000);
                            if (DictationLid.f() && DictationLid.e(c2Var2.f1160q) && c2Var2.f1162s < 3) {
                                DictationLid.j(c2Var2.f1164u.b(max, c11), 2000, new s1(this, i7, 1));
                                return;
                            } else {
                                DictationLid.f43030a.execute(new a1.e(16, c2Var2.f1164u.b(max, c11), new y1(this, i7, 0)));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                c2 c2Var3 = this.f1612b;
                if (!c2Var3.f1153j) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    double d = elapsedRealtime - c2Var3.f1150h0;
                    float sin = (((float) Math.sin(d / 90.0d)) * 0.03f) + 0.04f;
                    if (elapsedRealtime < c2Var3.f1147f0) {
                        sin = (((float) Math.random()) * 0.12f) + (((float) Math.sin(d / 61.0d)) * 0.28f * ((float) Math.sin((d / 173.0d) + 1.3d))) + 0.45f;
                    }
                    c2Var3.d.h(Math.max(0.0f, Math.min(1.0f, sin)));
                    c2Var3.f1146f.postDelayed(this, 50L);
                    return;
                }
                return;
        }
    }
}
