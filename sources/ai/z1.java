package ai;

import android.os.SystemClock;
import org.telegram.ui.Dictation.DictationLid;
public final class z1 implements Runnable {
    public final int f1647a;
    public final e2 f1648b;

    public z1(e2 e2Var, int i7) {
        this.f1647a = i7;
        this.f1648b = e2Var;
    }

    @Override
    public final void run() {
        z zVar;
        switch (this.f1647a) {
            case 0:
                e2 e2Var = this.f1648b;
                if (!e2Var.f1178j && !e2Var.f1176i) {
                    e2Var.f1171f.postDelayed(this, 700L);
                    if (!e2Var.E && DictationLid.f()) {
                        int c10 = e2Var.f1189u.c();
                        if (c10 - e2Var.H >= 16000) {
                            e2Var.H = c10;
                            e2Var.E = true;
                            byte[] b10 = e2Var.f1189u.b(0, c10);
                            DictationLid.f43071a.execute(new a1.e(16, b10, new x1(0, this, b10)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                e2 e2Var2 = this.f1648b;
                if (!e2Var2.f1178j) {
                    e2Var2.f1171f.postDelayed(this, 700L);
                    if (!e2Var2.W && !e2Var2.f1176i && (zVar = e2Var2.f1189u) != null) {
                        int i7 = e2Var2.Y;
                        int c11 = zVar.c();
                        if (c11 - e2Var2.Z >= 16000) {
                            e2Var2.Z = c11;
                            e2Var2.W = true;
                            int max = Math.max(e2Var2.X, c11 - 960000);
                            if (DictationLid.f() && DictationLid.e(e2Var2.f1185q) && e2Var2.f1187s < 3) {
                                DictationLid.j(e2Var2.f1189u.b(max, c11), 2000, new u1(this, i7, 1));
                                return;
                            } else {
                                DictationLid.f43071a.execute(new a1.e(16, e2Var2.f1189u.b(max, c11), new a2(this, i7, 0)));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                e2 e2Var3 = this.f1648b;
                if (!e2Var3.f1178j) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    double d = elapsedRealtime - e2Var3.f1175h0;
                    float sin = (((float) Math.sin(d / 90.0d)) * 0.03f) + 0.04f;
                    if (elapsedRealtime < e2Var3.f1172f0) {
                        sin = (((float) Math.random()) * 0.12f) + (((float) Math.sin(d / 61.0d)) * 0.28f * ((float) Math.sin((d / 173.0d) + 1.3d))) + 0.45f;
                    }
                    e2Var3.d.h(Math.max(0.0f, Math.min(1.0f, sin)));
                    e2Var3.f1171f.postDelayed(this, 50L);
                    return;
                }
                return;
        }
    }
}
