package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
public final class qj1 implements RequestDelegate {
    public final byte a;
    public final ik1 b;

    public qj1(ik1 ik1Var, byte b) {
        this.a = b;
        this.b = ik1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final ik1 ik1Var = this.b;
        switch (b) {
            case 0:
                if (tL_error != null) {
                    gm.c3(new sj1(tL_error, (byte) 0));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    gm.c3(new mj1(ik1Var, (byte) 3));
                    oc7.r1(ik1Var.o0).T3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        ik1 ik1Var2 = ik1Var;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    ik1Var2.l1 = xza.g0(tL_payments_starsRevenueStats.top_hours_graph, jb6.M0(2131748159, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    ik1Var2.m1 = xza.g0(statsGraph, jb6.M0(2131748158, null), 2, false);
                                    jza jzaVar = ik1Var2.l1;
                                    if (jzaVar != null) {
                                        jzaVar.n = true;
                                    }
                                    ik1Var2.g1 = tL_payments_starsRevenueStats.usd_rate;
                                    ik1Var2.M(true, tL_payments_starsRevenueStats.status);
                                    ik1Var2.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(d53.h).withEndAction(new mj1(ik1Var2, (byte) 5)).start();
                                    ik1Var2.F();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    ik1Var2.E((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        ik1 ik1Var2 = ik1Var;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    ik1Var2.l1 = xza.g0(tL_payments_starsRevenueStats.top_hours_graph, jb6.M0(2131748159, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    ik1Var2.m1 = xza.g0(statsGraph, jb6.M0(2131748158, null), 2, false);
                                    jza jzaVar = ik1Var2.l1;
                                    if (jzaVar != null) {
                                        jzaVar.n = true;
                                    }
                                    ik1Var2.g1 = tL_payments_starsRevenueStats.usd_rate;
                                    ik1Var2.M(true, tL_payments_starsRevenueStats.status);
                                    ik1Var2.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(d53.h).withEndAction(new mj1(ik1Var2, (byte) 5)).start();
                                    ik1Var2.F();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    ik1Var2.E((TLRPC.TL_payments_starsRevenueStats) tLObject2);
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
