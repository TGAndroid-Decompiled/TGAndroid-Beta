package lh;

import android.os.SystemClock;

public final class v6 implements Runnable {

    public final int f16940a;

    public final y6 f16941b;

    public v6(y6 y6Var, int i10) {
        this.f16940a = i10;
        this.f16941b = y6Var;
    }

    @Override
    public final void run() {
        switch (this.f16940a) {
            case 0:
                y6 y6Var = this.f16941b;
                y6Var.f17102n0 = false;
                y6Var.f17112v0 = false;
                y6Var.f17107r0 = SystemClock.elapsedRealtime();
                y6Var.f17105q0 = true;
                y6Var.f17109s0 = false;
                y6Var.F.c(false);
                y6Var.G.c(false);
                y6Var.H.c(false);
                ((oa) y6Var.f17084a).d(true);
                break;
            case 1:
                long jCurrentTimeMillis = System.currentTimeMillis();
                y6 y6Var2 = this.f16941b;
                y6Var2.M = jCurrentTimeMillis;
                y6Var2.N = 0L;
                y6Var2.f17102n0 = true;
                ((oa) y6Var2.f17084a).f16494a.F0.a(0L, true);
                break;
            case 2:
                y6 y6Var3 = this.f16941b;
                if (!y6Var3.f17102n0 && !y6Var3.b()) {
                    if (!sb.d(((oa) y6Var3.f17084a).f16494a)) {
                        y6Var3.f17109s0 = false;
                        y6Var3.F.c(false);
                        y6Var3.G.c(false);
                        y6Var3.H.c(false);
                    } else {
                        y6Var3.f17112v0 = true;
                        y6Var3.f17114w0 = true;
                        ((oa) y6Var3.f17084a).e(new v6(y6Var3, 4), true);
                    }
                    break;
                }
                break;
            case 3:
                y6 y6Var4 = this.f16941b;
                if (!y6Var4.f17102n0 && !y6Var4.b()) {
                    wa waVar = ((oa) y6Var4.f17084a).f16494a.f16818x0;
                    if (waVar != null) {
                        waVar.toggleDual();
                    }
                    y6Var4.d(360.0f);
                    y6Var4.f17109s0 = false;
                    y6Var4.F.c(false);
                    y6Var4.G.c(false);
                    y6Var4.H.c(false);
                    break;
                }
                break;
            default:
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                y6 y6Var5 = this.f16941b;
                y6Var5.M = jCurrentTimeMillis2;
                y6Var5.f17102n0 = true;
                w6 w6Var = y6Var5.f17084a;
                y6Var5.N = 0L;
                ((oa) w6Var).f16494a.F0.a(0L, true);
                break;
        }
    }
}
