package ai;

import android.os.SystemClock;
import org.telegram.ui.Dictation.DictationLid;
public final class w1 implements Runnable {
    public final int f1610a;
    public final b2 f1611b;

    public w1(b2 b2Var, int i7) {
        this.f1610a = i7;
        this.f1611b = b2Var;
    }

    @Override
    public final void run() {
        y yVar;
        switch (this.f1610a) {
            case 0:
                b2 b2Var = this.f1611b;
                if (!b2Var.f1146j && !b2Var.f1144i) {
                    b2Var.f1139f.postDelayed(this, 700L);
                    if (!b2Var.E && DictationLid.f()) {
                        int c10 = b2Var.f1159u.c();
                        if (c10 - b2Var.H >= 16000) {
                            b2Var.H = c10;
                            b2Var.E = true;
                            byte[] b10 = b2Var.f1159u.b(0, c10);
                            DictationLid.f42585a.execute(new a1.e(17, b10, new u1(0, this, b10)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                b2 b2Var2 = this.f1611b;
                if (!b2Var2.f1146j) {
                    b2Var2.f1139f.postDelayed(this, 700L);
                    if (!b2Var2.Y && !b2Var2.f1144i && (yVar = b2Var2.f1159u) != null) {
                        int i7 = b2Var2.f1131a0;
                        int c11 = yVar.c();
                        if (c11 - b2Var2.f1133b0 >= 16000) {
                            b2Var2.f1133b0 = c11;
                            b2Var2.Y = true;
                            int max = Math.max(b2Var2.Z, c11 - 960000);
                            if (DictationLid.f() && DictationLid.e(b2Var2.f1155q) && b2Var2.f1157s < 3) {
                                DictationLid.j(b2Var2.f1159u.b(max, c11), 2000, new r1(this, i7, 1));
                                return;
                            } else {
                                DictationLid.f42585a.execute(new a1.e(17, b2Var2.f1159u.b(max, c11), new x1(this, i7, 0)));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                b2 b2Var3 = this.f1611b;
                if (!b2Var3.f1146j) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    double d = elapsedRealtime - b2Var3.f1147j0;
                    float sin = (((float) Math.sin(d / 90.0d)) * 0.03f) + 0.04f;
                    if (elapsedRealtime < b2Var3.f1143h0) {
                        sin = (((float) Math.random()) * 0.12f) + (((float) Math.sin(d / 61.0d)) * 0.28f * ((float) Math.sin((d / 173.0d) + 1.3d))) + 0.45f;
                    }
                    b2Var3.d.h(Math.max(0.0f, Math.min(1.0f, sin)));
                    b2Var3.f1139f.postDelayed(this, 50L);
                    return;
                }
                return;
        }
    }
}
