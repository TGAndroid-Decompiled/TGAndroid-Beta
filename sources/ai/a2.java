package ai;

import android.os.SystemClock;
import android.text.TextUtils;
import org.telegram.ui.Dictation.DictationLid;
public final class a2 implements Runnable {
    public final int f1117a;
    public final f2 f1118b;

    public a2(f2 f2Var, int i7) {
        this.f1117a = i7;
        this.f1118b = f2Var;
    }

    @Override
    public final void run() {
        z zVar;
        switch (this.f1117a) {
            case 0:
                f2 f2Var = this.f1118b;
                if (!f2Var.f1193j && !f2Var.f1191i) {
                    f2Var.f1186f.postDelayed(this, 700L);
                    if (!f2Var.E && DictationLid.f()) {
                        int c10 = f2Var.f1204u.c();
                        if (c10 - f2Var.H >= 16000) {
                            f2Var.H = c10;
                            f2Var.E = true;
                            byte[] b10 = f2Var.f1204u.b(0, c10);
                            DictationLid.f43075a.execute(new a1.e(16, b10, new y1(0, this, b10)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                f2 f2Var2 = this.f1118b;
                if (!f2Var2.f1193j) {
                    f2Var2.f1186f.postDelayed(this, 700L);
                    if (!f2Var2.W && !f2Var2.f1191i && (zVar = f2Var2.f1204u) != null) {
                        int i7 = f2Var2.Y;
                        int c11 = zVar.c();
                        if (c11 - f2Var2.Z >= 16000) {
                            f2Var2.Z = c11;
                            f2Var2.W = true;
                            int max = Math.max(f2Var2.X, c11 - 960000);
                            if (DictationLid.f() && DictationLid.e(f2Var2.f1200q) && f2Var2.f1202s < 3) {
                                DictationLid.j(2000, new v1(this, i7, 1), TextUtils.join(",", f2Var2.f1200q), f2Var2.f1204u.b(max, c11));
                                return;
                            }
                            DictationLid.f43075a.execute(new a1.e(16, f2Var2.f1204u.b(max, c11), new b2(this, i7, 0)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                f2 f2Var3 = this.f1118b;
                if (!f2Var3.f1193j) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    double d = elapsedRealtime - f2Var3.f1190h0;
                    float sin = (((float) Math.sin(d / 90.0d)) * 0.03f) + 0.04f;
                    if (elapsedRealtime < f2Var3.f1187f0) {
                        sin = (((float) Math.random()) * 0.12f) + (((float) Math.sin(d / 61.0d)) * 0.28f * ((float) Math.sin((d / 173.0d) + 1.3d))) + 0.45f;
                    }
                    f2Var3.d.h(Math.max(0.0f, Math.min(1.0f, sin)));
                    f2Var3.f1186f.postDelayed(this, 50L);
                    return;
                }
                return;
        }
    }
}
