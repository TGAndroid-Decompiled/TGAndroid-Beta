package defpackage;
public final class yi8 implements Runnable {
    public final byte a;
    public final zi8 b;

    public yi8(zi8 zi8Var, byte b) {
        this.a = b;
        this.b = zi8Var;
    }

    @Override
    public final void run() {
        boolean z;
        byte b = this.a;
        boolean z2 = true;
        zi8 zi8Var = this.b;
        switch (b) {
            case 0:
            case 1:
                zi8Var.r();
                return;
            case 2:
                zi8Var.m(0L);
                return;
            case 3:
                yi8 yi8Var = zi8Var.L;
                lbc lbcVar = zi8Var.e;
                if (lbcVar != null && zi8Var.G != null) {
                    long S = lbcVar.S();
                    if (zi8Var.getDuration() > 1) {
                        float duration = ((float) S) / ((float) zi8Var.getDuration());
                        if (!zi8Var.G.n1) {
                            f4b f4bVar = zi8Var.d;
                            if ((duration < f4bVar.Z || duration > f4bVar.a0) && System.currentTimeMillis() - zi8Var.K > 500) {
                                zi8Var.K = System.currentTimeMillis();
                                lbc lbcVar2 = zi8Var.e;
                                S = zi8Var.d.Z * ((float) zi8Var.getDuration());
                                lbcVar2.p0(S, false);
                                zi8Var.w(true);
                                zi8Var.y(true);
                                zi8Var.G.setProgress(zi8Var.e.S());
                            }
                        }
                        if (S < zi8Var.J) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zi8Var.w(z);
                        if (S >= zi8Var.J) {
                            z2 = false;
                        }
                        zi8Var.y(z2);
                        zi8Var.G.setProgress(zi8Var.e.S());
                    } else {
                        zi8Var.G.setProgress(zi8Var.e.S());
                    }
                    if (zi8Var.e.c0()) {
                        gl.r(yi8Var);
                        gl.e3(yi8Var, 1000.0f / gl.r);
                    }
                    zi8Var.J = S;
                    return;
                }
                return;
            case 4:
                yi8 yi8Var2 = zi8Var.M;
                if (zi8Var.E != null && zi8Var.e == null && zi8Var.y == null && zi8Var.G != null && !zi8Var.i()) {
                    long S2 = zi8Var.E.S();
                    f4b f4bVar2 = zi8Var.d;
                    if (f4bVar2 != null) {
                        float f = (float) S2;
                        float f2 = f4bVar2.E;
                        float f3 = (float) f4bVar2.C;
                        if ((f < f2 * f3 || f > f4bVar2.F * f3) && System.currentTimeMillis() - zi8Var.K > 500) {
                            zi8Var.K = System.currentTimeMillis();
                            lbc lbcVar3 = zi8Var.E;
                            f4b f4bVar3 = zi8Var.d;
                            S2 = f4bVar3.E * ((float) f4bVar3.C);
                            lbcVar3.p0(S2, false);
                        }
                    }
                    zi8Var.G.setProgress(S2);
                    if (zi8Var.E.c0()) {
                        gl.r(yi8Var2);
                        gl.e3(yi8Var2, 1000.0f / gl.r);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                yi8 yi8Var3 = zi8Var.N;
                if (zi8Var.y != null && zi8Var.e == null && !zi8Var.i() && zi8Var.G != null) {
                    long S3 = zi8Var.y.S();
                    f4b f4bVar4 = zi8Var.d;
                    if (f4bVar4 != null) {
                        float f4 = (float) S3;
                        float f5 = f4bVar4.s0;
                        float f6 = (float) f4bVar4.q0;
                        if ((f4 < f5 * f6 || f4 > f4bVar4.t0 * f6) && System.currentTimeMillis() - zi8Var.K > 500) {
                            zi8Var.K = System.currentTimeMillis();
                            lbc lbcVar4 = zi8Var.y;
                            f4b f4bVar5 = zi8Var.d;
                            S3 = f4bVar5.s0 * ((float) f4bVar5.q0);
                            lbcVar4.p0(S3, false);
                            zi8Var.w(true);
                        }
                    }
                    zi8Var.G.setProgress(S3);
                    if (zi8Var.y.c0()) {
                        gl.r(yi8Var3);
                        gl.e3(yi8Var3, 1000.0f / gl.r);
                        return;
                    }
                    return;
                }
                return;
            default:
                kac kacVar = zi8Var.n;
                if (kacVar != null) {
                    td4 td4Var = kacVar.b;
                    if (td4Var != null) {
                        td4Var.postRunnable(new rd4(td4Var, (byte) 0));
                    }
                    kacVar.a = null;
                    zi8Var.removeView(zi8Var.n);
                    zi8Var.n = null;
                    return;
                }
                return;
        }
    }
}
