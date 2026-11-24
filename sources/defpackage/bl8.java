package defpackage;
public final class bl8 implements Runnable {
    public final byte a;
    public final cl8 b;

    public bl8(cl8 cl8Var, byte b) {
        this.a = b;
        this.b = cl8Var;
    }

    @Override
    public final void run() {
        boolean z;
        byte b = this.a;
        boolean z2 = true;
        cl8 cl8Var = this.b;
        switch (b) {
            case 0:
                cl8Var.r();
                return;
            case 1:
                cl8Var.m(0L);
                return;
            case 2:
                bl8 bl8Var = cl8Var.L;
                ndc ndcVar = cl8Var.e;
                if (ndcVar != null && cl8Var.G != null) {
                    long S = ndcVar.S();
                    if (cl8Var.getDuration() > 1) {
                        float duration = ((float) S) / ((float) cl8Var.getDuration());
                        if (!cl8Var.G.n1) {
                            g6b g6bVar = cl8Var.d;
                            if ((duration < g6bVar.Z || duration > g6bVar.a0) && System.currentTimeMillis() - cl8Var.K > 500) {
                                cl8Var.K = System.currentTimeMillis();
                                ndc ndcVar2 = cl8Var.e;
                                S = cl8Var.d.Z * ((float) cl8Var.getDuration());
                                ndcVar2.p0(S, false);
                                cl8Var.w(true);
                                cl8Var.y(true);
                                cl8Var.G.setProgress(cl8Var.e.S());
                            }
                        }
                        if (S < cl8Var.J) {
                            z = true;
                        } else {
                            z = false;
                        }
                        cl8Var.w(z);
                        if (S >= cl8Var.J) {
                            z2 = false;
                        }
                        cl8Var.y(z2);
                        cl8Var.G.setProgress(cl8Var.e.S());
                    } else {
                        cl8Var.G.setProgress(cl8Var.e.S());
                    }
                    if (cl8Var.e.c0()) {
                        gm.r(bl8Var);
                        gm.d3(bl8Var, 1000.0f / gm.r);
                    }
                    cl8Var.J = S;
                    return;
                }
                return;
            case 3:
                bl8 bl8Var2 = cl8Var.M;
                if (cl8Var.E != null && cl8Var.e == null && cl8Var.y == null && cl8Var.G != null && !cl8Var.i()) {
                    long S2 = cl8Var.E.S();
                    g6b g6bVar2 = cl8Var.d;
                    if (g6bVar2 != null) {
                        float f = (float) S2;
                        float f2 = g6bVar2.E;
                        float f3 = (float) g6bVar2.C;
                        if ((f < f2 * f3 || f > g6bVar2.F * f3) && System.currentTimeMillis() - cl8Var.K > 500) {
                            cl8Var.K = System.currentTimeMillis();
                            ndc ndcVar3 = cl8Var.E;
                            g6b g6bVar3 = cl8Var.d;
                            S2 = g6bVar3.E * ((float) g6bVar3.C);
                            ndcVar3.p0(S2, false);
                        }
                    }
                    cl8Var.G.setProgress(S2);
                    if (cl8Var.E.c0()) {
                        gm.r(bl8Var2);
                        gm.d3(bl8Var2, 1000.0f / gm.r);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                bl8 bl8Var3 = cl8Var.N;
                if (cl8Var.y != null && cl8Var.e == null && !cl8Var.i() && cl8Var.G != null) {
                    long S3 = cl8Var.y.S();
                    g6b g6bVar4 = cl8Var.d;
                    if (g6bVar4 != null) {
                        float f4 = (float) S3;
                        float f5 = g6bVar4.s0;
                        float f6 = (float) g6bVar4.q0;
                        if ((f4 < f5 * f6 || f4 > g6bVar4.t0 * f6) && System.currentTimeMillis() - cl8Var.K > 500) {
                            cl8Var.K = System.currentTimeMillis();
                            ndc ndcVar4 = cl8Var.y;
                            g6b g6bVar5 = cl8Var.d;
                            S3 = g6bVar5.s0 * ((float) g6bVar5.q0);
                            ndcVar4.p0(S3, false);
                            cl8Var.w(true);
                        }
                    }
                    cl8Var.G.setProgress(S3);
                    if (cl8Var.y.c0()) {
                        gm.r(bl8Var3);
                        gm.d3(bl8Var3, 1000.0f / gm.r);
                        return;
                    }
                    return;
                }
                return;
            default:
                ncc nccVar = cl8Var.n;
                if (nccVar != null) {
                    uf4 uf4Var = nccVar.b;
                    if (uf4Var != null) {
                        uf4Var.postRunnable(new sf4(uf4Var, (byte) 0));
                    }
                    nccVar.a = null;
                    cl8Var.removeView(cl8Var.n);
                    cl8Var.n = null;
                    return;
                }
                return;
        }
    }
}
