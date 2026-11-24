package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
public final class ii1 implements RequestDelegate {
    public final byte a;
    public final zi1 b;

    public ii1(zi1 zi1Var, byte b) {
        this.a = b;
        this.b = zi1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final zi1 zi1Var = this.b;
        switch (b) {
            case 0:
                if (tL_error != null) {
                    gl.d3(new ki1(tL_error, (byte) 0));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    gl.d3(new ei1(zi1Var, (byte) 3));
                    na7.q1(zi1Var.o0).Q3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        zi1 zi1Var2 = zi1Var;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    zi1Var2.l1 = uxa.f0(tL_payments_starsRevenueStats.top_hours_graph, k96.M0(2131748210, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    zi1Var2.m1 = uxa.f0(statsGraph, k96.M0(2131748209, null), 2, false);
                                    gxa gxaVar = zi1Var2.l1;
                                    if (gxaVar != null) {
                                        gxaVar.n = true;
                                    }
                                    zi1Var2.g1 = tL_payments_starsRevenueStats.usd_rate;
                                    zi1Var2.M(true, tL_payments_starsRevenueStats.status);
                                    zi1Var2.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(s33.h).withEndAction(new ei1(zi1Var2, (byte) 5)).start();
                                    zi1Var2.F();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    zi1Var2.E((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        zi1 zi1Var2 = zi1Var;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    zi1Var2.l1 = uxa.f0(tL_payments_starsRevenueStats.top_hours_graph, k96.M0(2131748210, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    zi1Var2.m1 = uxa.f0(statsGraph, k96.M0(2131748209, null), 2, false);
                                    gxa gxaVar = zi1Var2.l1;
                                    if (gxaVar != null) {
                                        gxaVar.n = true;
                                    }
                                    zi1Var2.g1 = tL_payments_starsRevenueStats.usd_rate;
                                    zi1Var2.M(true, tL_payments_starsRevenueStats.status);
                                    zi1Var2.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(s33.h).withEndAction(new ei1(zi1Var2, (byte) 5)).start();
                                    zi1Var2.F();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    zi1Var2.E((TLRPC.TL_payments_starsRevenueStats) tLObject2);
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
