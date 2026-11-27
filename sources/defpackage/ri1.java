package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
public final class ri1 implements RequestDelegate {
    public final byte a;
    public final ij1 b;

    public ri1(ij1 ij1Var, byte b) {
        this.a = b;
        this.b = ij1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final ij1 ij1Var = this.b;
        switch (b) {
            case 0:
                if (tL_error != null) {
                    hl.c3(new ti1(tL_error, (byte) 0));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    hl.c3(new ni1(ij1Var, (byte) 3));
                    uc7.s1(ij1Var.o0).Y3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        ij1 ij1Var2 = ij1Var;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    ij1Var2.l1 = w1b.f0(tL_payments_starsRevenueStats.top_hours_graph, ob6.M0(2131748156, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    ij1Var2.m1 = w1b.f0(statsGraph, ob6.M0(2131748155, null), 2, false);
                                    i1b i1bVar = ij1Var2.l1;
                                    if (i1bVar != null) {
                                        i1bVar.n = true;
                                    }
                                    ij1Var2.g1 = tL_payments_starsRevenueStats.usd_rate;
                                    ij1Var2.M(true, tL_payments_starsRevenueStats.status);
                                    ij1Var2.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(k43.h).withEndAction(new ni1(ij1Var2, (byte) 5)).start();
                                    ij1Var2.F();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    ij1Var2.E((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        ij1 ij1Var2 = ij1Var;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    ij1Var2.l1 = w1b.f0(tL_payments_starsRevenueStats.top_hours_graph, ob6.M0(2131748156, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    ij1Var2.m1 = w1b.f0(statsGraph, ob6.M0(2131748155, null), 2, false);
                                    i1b i1bVar = ij1Var2.l1;
                                    if (i1bVar != null) {
                                        i1bVar.n = true;
                                    }
                                    ij1Var2.g1 = tL_payments_starsRevenueStats.usd_rate;
                                    ij1Var2.M(true, tL_payments_starsRevenueStats.status);
                                    ij1Var2.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(k43.h).withEndAction(new ni1(ij1Var2, (byte) 5)).start();
                                    ij1Var2.F();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    ij1Var2.E((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
