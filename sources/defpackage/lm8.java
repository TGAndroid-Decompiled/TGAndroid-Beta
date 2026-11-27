package defpackage;
public final class lm8 implements Runnable {
    public final byte a;
    public final mm8 b;

    public lm8(mm8 mm8Var, byte b) {
        this.a = b;
        this.b = mm8Var;
    }

    @Override
    public final void run() {
        boolean z;
        byte b = this.a;
        boolean z2 = true;
        mm8 mm8Var = this.b;
        switch (b) {
            case 0:
                mm8Var.r();
                return;
            case 1:
                mm8Var.m(0L);
                return;
            case 2:
                lm8 lm8Var = mm8Var.L;
                kfc kfcVar = mm8Var.e;
                if (kfcVar != null && mm8Var.G != null) {
                    long S = kfcVar.S();
                    if (mm8Var.getDuration() > 1) {
                        float duration = ((float) S) / ((float) mm8Var.getDuration());
                        if (!mm8Var.G.n1) {
                            c8b c8bVar = mm8Var.d;
                            if ((duration < c8bVar.Z || duration > c8bVar.a0) && System.currentTimeMillis() - mm8Var.K > 500) {
                                mm8Var.K = System.currentTimeMillis();
                                kfc kfcVar2 = mm8Var.e;
                                S = mm8Var.d.Z * ((float) mm8Var.getDuration());
                                kfcVar2.p0(S, false);
                                mm8Var.w(true);
                                mm8Var.y(true);
                                mm8Var.G.setProgress(mm8Var.e.S());
                            }
                        }
                        if (S < mm8Var.J) {
                            z = true;
                        } else {
                            z = false;
                        }
                        mm8Var.w(z);
                        if (S >= mm8Var.J) {
                            z2 = false;
                        }
                        mm8Var.y(z2);
                        mm8Var.G.setProgress(mm8Var.e.S());
                    } else {
                        mm8Var.G.setProgress(mm8Var.e.S());
                    }
                    if (mm8Var.e.c0()) {
                        hl.r(lm8Var);
                        hl.d3(lm8Var, 1000.0f / hl.r);
                    }
                    mm8Var.J = S;
                    return;
                }
                return;
            case 3:
                lm8 lm8Var2 = mm8Var.M;
                if (mm8Var.E != null && mm8Var.e == null && mm8Var.y == null && mm8Var.G != null && !mm8Var.i()) {
                    long S2 = mm8Var.E.S();
                    c8b c8bVar2 = mm8Var.d;
                    if (c8bVar2 != null) {
                        float f = (float) S2;
                        float f2 = c8bVar2.E;
                        float f3 = (float) c8bVar2.C;
                        if ((f < f2 * f3 || f > c8bVar2.F * f3) && System.currentTimeMillis() - mm8Var.K > 500) {
                            mm8Var.K = System.currentTimeMillis();
                            kfc kfcVar3 = mm8Var.E;
                            c8b c8bVar3 = mm8Var.d;
                            S2 = c8bVar3.E * ((float) c8bVar3.C);
                            kfcVar3.p0(S2, false);
                        }
                    }
                    mm8Var.G.setProgress(S2);
                    if (mm8Var.E.c0()) {
                        hl.r(lm8Var2);
                        hl.d3(lm8Var2, 1000.0f / hl.r);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                lm8 lm8Var3 = mm8Var.N;
                if (mm8Var.y != null && mm8Var.e == null && !mm8Var.i() && mm8Var.G != null) {
                    long S3 = mm8Var.y.S();
                    c8b c8bVar4 = mm8Var.d;
                    if (c8bVar4 != null) {
                        float f4 = (float) S3;
                        float f5 = c8bVar4.s0;
                        float f6 = (float) c8bVar4.q0;
                        if ((f4 < f5 * f6 || f4 > c8bVar4.t0 * f6) && System.currentTimeMillis() - mm8Var.K > 500) {
                            mm8Var.K = System.currentTimeMillis();
                            kfc kfcVar4 = mm8Var.y;
                            c8b c8bVar5 = mm8Var.d;
                            S3 = c8bVar5.s0 * ((float) c8bVar5.q0);
                            kfcVar4.p0(S3, false);
                            mm8Var.w(true);
                        }
                    }
                    mm8Var.G.setProgress(S3);
                    if (mm8Var.y.c0()) {
                        hl.r(lm8Var3);
                        hl.d3(lm8Var3, 1000.0f / hl.r);
                        return;
                    }
                    return;
                }
                return;
            default:
                kec kecVar = mm8Var.n;
                if (kecVar != null) {
                    rf4 rf4Var = kecVar.b;
                    if (rf4Var != null) {
                        rf4Var.postRunnable(new pf4(rf4Var, (byte) 0));
                    }
                    kecVar.a = null;
                    mm8Var.removeView(mm8Var.n);
                    mm8Var.n = null;
                    return;
                }
                return;
        }
    }
}
