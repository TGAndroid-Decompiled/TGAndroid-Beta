package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class eo0 extends ka {
    public final lo0 d;

    public eo0(lo0 lo0Var) {
        this.d = lo0Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return ((ko0) this.d.d0.get(s49Var.b())).b;
    }

    @Override
    public final int b() {
        return this.d.d0.size();
    }

    @Override
    public final int d(int i) {
        return ((ko0) this.d.d0.get(i)).a;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        lo0 lo0Var;
        int i2;
        ko0 ko0Var;
        String a0;
        int i3 = s49Var.f;
        if (i3 != 4 && i3 != 14 && i3 != 15) {
            if (i3 != 1 && i3 != 12 && i3 != 16) {
                if (i3 == 0) {
                    oxa oxaVar = (oxa) s49Var.a;
                    oxaVar.a(Integer.toString(this.d.U.level), 0, null, k96.M0(2131753156, null));
                    lo0 lo0Var2 = this.d;
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = lo0Var2.U.premium_audience;
                    int i4 = 2131746848;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) this.d.U.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (hc2.V(this.d.j0)) {
                                i4 = 2131746738;
                            }
                            oxaVar.a(str, 1, concat, k96.M0(i4, null));
                            oxaVar.a(String.valueOf(this.d.U.boosts), 2, null, k96.M0(2131753159, null));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.d.U;
                            oxaVar.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, k96.M0(2131753154, null));
                            oxaVar.setPadding(gl.L(23.0f), oxaVar.getPaddingTop(), gl.L(23.0f), oxaVar.getPaddingBottom());
                            return;
                        }
                    }
                    if (hc2.V(lo0Var2.j0)) {
                        i4 = 2131746738;
                    }
                    oxaVar.a("~0", 1, "0%", k96.M0(i4, null));
                    oxaVar.a(String.valueOf(this.d.U.boosts), 2, null, k96.M0(2131753159, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.d.U;
                    oxaVar.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, k96.M0(2131753154, null));
                    oxaVar.setPadding(gl.L(23.0f), oxaVar.getPaddingTop(), gl.L(23.0f), oxaVar.getPaddingBottom());
                    return;
                } else if (i3 == 5) {
                    TL_stories.Boost boost = ((ko0) this.d.d0.get(i)).d;
                    TLRPC.User V1 = na7.q1(this.d.T).V1(Long.valueOf(boost.user_id));
                    uv4 uv4Var = (uv4) s49Var.a;
                    int i5 = boost.multiplier;
                    long j = boost.expires;
                    if (i5 > 1) {
                        a0 = k96.a0("BoostsExpireOn", null, 2131753158, k96.r(j, false));
                    } else {
                        a0 = k96.a0("BoostExpireOn", null, 2131753658, k96.r(j, false));
                    }
                    uv4Var.d(V1, qu2.p(V1), a0, !((ko0) this.d.d0.get(i)).f);
                    uv4Var.setStatus(boost);
                    uv4Var.setAvatarPadding(5);
                    return;
                } else if (i3 == 6) {
                    mhb mhbVar = (mhb) s49Var.a;
                    mhbVar.setText(((ko0) this.d.d0.get(i)).c);
                    mhbVar.setTextColor(bkb.p1(0.875f, -1));
                    return;
                } else if (i3 == 9) {
                    dh6 dh6Var = (dh6) s49Var.a;
                    lo0 lo0Var3 = this.d;
                    if (lo0Var3.e0 == 0) {
                        dh6Var.b(2131230871, 5, k96.G(lo0Var3.a0, "BoostingShowMoreBoosts", new Object[0]), false);
                        return;
                    } else {
                        dh6Var.b(2131230871, 5, k96.G(lo0Var3.c0, "BoostingShowMoreGifts", new Object[0]), false);
                        return;
                    }
                } else if (i3 == 3) {
                    ((f36) s49Var.a).setLink(((ko0) this.d.d0.get(i)).c);
                    return;
                } else if (i3 == 11) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = ((ko0) this.d.d0.get(i)).e;
                    xv4 xv4Var = (xv4) s49Var.a;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        xv4Var.d(prepaidGiveaway, k96.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), k96.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", k96.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !ko0Var.f);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        xv4Var.d(prepaidGiveaway, k96.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), k96.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !ko0Var.f);
                    }
                    xv4Var.setImage(prepaidGiveaway);
                    xv4Var.setAvatarPadding(5);
                    return;
                } else if (i3 == 13) {
                    if (this.d.W.getTag() == null || ((Integer) this.d.W.getTag()).intValue() != Objects.hash(Integer.valueOf(this.d.p0), Integer.valueOf(this.d.o0))) {
                        lo0 lo0Var4 = this.d;
                        lo0Var4.W.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(lo0Var4.p0), Integer.valueOf(this.d.o0))));
                        this.d.W.f();
                        lo0 lo0Var5 = this.d;
                        lo0Var5.W.a(0, k96.G(lo0Var5.p0, "BoostingBoostsCount", new Object[0]), null);
                        if (na7.q1(this.d.T).k4.O1.f && (i2 = (lo0Var = this.d).o0) > 0 && i2 != lo0Var.p0) {
                            lo0Var.W.a(1, k96.G(i2, "BoostingGiftsCount", new Object[0]), null);
                        }
                        lo0 lo0Var6 = this.d;
                        lo0Var6.W.setInitialTabId(lo0Var6.e0);
                        this.d.W.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            hk1 hk1Var = (hk1) s49Var.a;
            hk1Var.setTitle(((ko0) this.d.d0.get(i)).c);
            hk1Var.c(false);
            if (s49Var.f == 12) {
                hk1Var.setPadding(gl.L(3.0f), hk1Var.getPaddingTop(), hk1Var.getPaddingRight(), hk1Var.getPaddingBottom());
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        ViewGroup oxaVar;
        ViewGroup viewGroup2;
        wjb wjbVar;
        int i2;
        wjb wjbVar2;
        lo0 lo0Var = this.d;
        switch (i) {
            case 0:
                oxaVar = new oxa(lo0Var.getParentActivity(), 2);
                viewGroup2 = oxaVar;
                break;
            case 1:
            case 16:
                ViewGroup hk1Var = new hk1(lo0Var.getParentActivity(), null);
                hk1Var.setPadding(hk1Var.getPaddingLeft(), gl.L(16.0f), hk1Var.getRight(), gl.L(16.0f));
                viewGroup2 = hk1Var;
                break;
            case 2:
                viewGroup2 = new b9a(viewGroup.getContext(), 0, 0);
                break;
            case 3:
                f36 f36Var = new f36(lo0Var.getParentActivity(), lo0Var, null, false, false);
                f36Var.d.setVisibility(8);
                f36Var.a.setGravity(17);
                f36Var.h.setVisibility(8);
                f36Var.w.setVisibility(8);
                f36Var.setPadding(gl.L(11.0f), 0, gl.L(11.0f), gl.L(24.0f));
                viewGroup2 = f36Var;
                break;
            case 4:
            default:
                fvc.b();
                return null;
            case 5:
                viewGroup2 = new uv4(lo0Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                wjbVar = ((d) lo0Var).resourceProvider;
                viewGroup2 = new mhb(20, wjbVar, context);
                break;
            case 7:
                viewGroup2 = new wh4(lo0Var.getParentActivity(), 8, (byte) 0);
                break;
            case 8:
                oxaVar = new a6(lo0Var.getParentActivity(), (byte) 2);
                TextView textView = new TextView(lo0Var.getParentActivity());
                if (hc2.V(lo0Var.j0)) {
                    i2 = 2131748042;
                } else {
                    i2 = 2131748043;
                }
                tb4.u(14.0f, i2, 1, textView, null);
                zkb.X(textView, bkb.x6, null);
                textView.setGravity(17);
                oxaVar.addView(textView, nme.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                viewGroup2 = oxaVar;
                break;
            case 9:
                do0 do0Var = new do0(lo0Var.getParentActivity(), (byte) 0);
                do0Var.a(bkb.u6, bkb.t6);
                viewGroup2 = do0Var;
                break;
            case 10:
                wgb wgbVar = new wgb(lo0Var.getParentActivity());
                wgbVar.o(2131232177, k96.a0(null, null, 2131753509, new Object[0]), false);
                wgbVar.s = 64;
                int i3 = bkb.p6;
                wgbVar.g(i3, i3);
                viewGroup2 = wgbVar;
                break;
            case 11:
                viewGroup2 = new xv4(lo0Var.getParentActivity());
                break;
            case 12:
                hk1 hk1Var2 = new hk1(lo0Var.getParentActivity(), null);
                hk1Var2.setPadding(hk1Var2.getPaddingLeft(), gl.L(16.0f), hk1Var2.getRight(), gl.L(8.0f));
                viewGroup2 = hk1Var2;
                break;
            case 13:
                Activity parentActivity = lo0Var.getParentActivity();
                wjbVar2 = ((d) lo0Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, wjbVar2);
                lo0Var.W = scrollSlidingTextTabStrip;
                int i4 = bkb.vi;
                int i5 = bkb.ui;
                scrollSlidingTextTabStrip.M = i4;
                scrollSlidingTextTabStrip.N = i5;
                scrollSlidingTextTabStrip.updateColors();
                st stVar = new st(this, lo0Var.getParentActivity());
                lo0Var.W.setDelegate(new i4d(this));
                stVar.addView(lo0Var.W, nme.c(48.0f, -2));
                viewGroup2 = stVar;
                break;
            case 14:
                viewGroup2 = lo0Var.n0(lo0Var.getParentActivity());
                break;
            case 15:
                sb sbVar = new sb((byte) 1, lo0Var.getParentActivity(), this);
                sbVar.setTag(-33024);
                viewGroup2 = sbVar;
                break;
        }
        return ls6.h(viewGroup2, viewGroup2, -1, -2);
    }
}
