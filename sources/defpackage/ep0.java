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
public final class ep0 extends ka {
    public final lp0 d;

    public ep0(lp0 lp0Var) {
        this.d = lp0Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return ((kp0) this.d.d0.get(u69Var.b())).b;
    }

    @Override
    public final int b() {
        return this.d.d0.size();
    }

    @Override
    public final int d(int i) {
        return ((kp0) this.d.d0.get(i)).a;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        lp0 lp0Var;
        int i2;
        kp0 kp0Var;
        String a0;
        int i3 = u69Var.f;
        if (i3 != 4 && i3 != 14 && i3 != 15) {
            if (i3 != 1 && i3 != 12 && i3 != 16) {
                if (i3 == 0) {
                    rza rzaVar = (rza) u69Var.a;
                    rzaVar.a(Integer.toString(this.d.U.level), 0, null, jb6.M0(2131753124, null));
                    lp0 lp0Var2 = this.d;
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = lp0Var2.U.premium_audience;
                    int i4 = 2131746774;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) this.d.U.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (sd2.V(this.d.j0)) {
                                i4 = 2131746664;
                            }
                            rzaVar.a(str, 1, concat, jb6.M0(i4, null));
                            rzaVar.a(String.valueOf(this.d.U.boosts), 2, null, jb6.M0(2131753127, null));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.d.U;
                            rzaVar.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, jb6.M0(2131753122, null));
                            rzaVar.setPadding(gm.L(23.0f), rzaVar.getPaddingTop(), gm.L(23.0f), rzaVar.getPaddingBottom());
                            return;
                        }
                    }
                    if (sd2.V(lp0Var2.j0)) {
                        i4 = 2131746664;
                    }
                    rzaVar.a("~0", 1, "0%", jb6.M0(i4, null));
                    rzaVar.a(String.valueOf(this.d.U.boosts), 2, null, jb6.M0(2131753127, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.d.U;
                    rzaVar.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, jb6.M0(2131753122, null));
                    rzaVar.setPadding(gm.L(23.0f), rzaVar.getPaddingTop(), gm.L(23.0f), rzaVar.getPaddingBottom());
                    return;
                } else if (i3 == 5) {
                    TL_stories.Boost boost = ((kp0) this.d.d0.get(i)).d;
                    TLRPC.User W1 = oc7.r1(this.d.T).W1(Long.valueOf(boost.user_id));
                    vx4 vx4Var = (vx4) u69Var.a;
                    int i5 = boost.multiplier;
                    long j = boost.expires;
                    if (i5 > 1) {
                        a0 = jb6.a0("BoostsExpireOn", null, 2131753126, jb6.r(j, false));
                    } else {
                        a0 = jb6.a0("BoostExpireOn", null, 2131753626, jb6.r(j, false));
                    }
                    vx4Var.d(W1, bw2.p(W1), a0, !((kp0) this.d.d0.get(i)).f);
                    vx4Var.setStatus(boost);
                    vx4Var.setAvatarPadding(5);
                    return;
                } else if (i3 == 6) {
                    njb njbVar = (njb) u69Var.a;
                    njbVar.setText(((kp0) this.d.d0.get(i)).c);
                    njbVar.setTextColor(cmb.p1(0.875f, -1));
                    return;
                } else if (i3 == 9) {
                    fj6 fj6Var = (fj6) u69Var.a;
                    lp0 lp0Var3 = this.d;
                    if (lp0Var3.e0 == 0) {
                        fj6Var.b(2131230872, 5, jb6.G(lp0Var3.a0, "BoostingShowMoreBoosts", new Object[0]), false);
                        return;
                    } else {
                        fj6Var.b(2131230872, 5, jb6.G(lp0Var3.c0, "BoostingShowMoreGifts", new Object[0]), false);
                        return;
                    }
                } else if (i3 == 3) {
                    ((f56) u69Var.a).setLink(((kp0) this.d.d0.get(i)).c);
                    return;
                } else if (i3 == 11) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = ((kp0) this.d.d0.get(i)).e;
                    zx4 zx4Var = (zx4) u69Var.a;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        zx4Var.d(prepaidGiveaway, jb6.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), jb6.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", jb6.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !kp0Var.f);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        zx4Var.d(prepaidGiveaway, jb6.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), jb6.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !kp0Var.f);
                    }
                    zx4Var.setImage(prepaidGiveaway);
                    zx4Var.setAvatarPadding(5);
                    return;
                } else if (i3 == 13) {
                    if (this.d.W.getTag() == null || ((Integer) this.d.W.getTag()).intValue() != Objects.hash(Integer.valueOf(this.d.p0), Integer.valueOf(this.d.o0))) {
                        lp0 lp0Var4 = this.d;
                        lp0Var4.W.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(lp0Var4.p0), Integer.valueOf(this.d.o0))));
                        this.d.W.f();
                        lp0 lp0Var5 = this.d;
                        lp0Var5.W.a(0, jb6.G(lp0Var5.p0, "BoostingBoostsCount", new Object[0]), null);
                        if (oc7.r1(this.d.T).l4.O1.f && (i2 = (lp0Var = this.d).o0) > 0 && i2 != lp0Var.p0) {
                            lp0Var.W.a(1, jb6.G(i2, "BoostingGiftsCount", new Object[0]), null);
                        }
                        lp0 lp0Var6 = this.d;
                        lp0Var6.W.setInitialTabId(lp0Var6.e0);
                        this.d.W.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            pl1 pl1Var = (pl1) u69Var.a;
            pl1Var.setTitle(((kp0) this.d.d0.get(i)).c);
            pl1Var.c(false);
            if (u69Var.f == 12) {
                pl1Var.setPadding(gm.L(3.0f), pl1Var.getPaddingTop(), pl1Var.getPaddingRight(), pl1Var.getPaddingBottom());
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        ViewGroup rzaVar;
        ViewGroup viewGroup2;
        ylb ylbVar;
        int i2;
        ylb ylbVar2;
        lp0 lp0Var = this.d;
        switch (i) {
            case 0:
                rzaVar = new rza(lp0Var.getParentActivity(), 2);
                viewGroup2 = rzaVar;
                break;
            case 1:
            case 16:
                ViewGroup pl1Var = new pl1(lp0Var.getParentActivity(), null);
                pl1Var.setPadding(pl1Var.getPaddingLeft(), gm.L(16.0f), pl1Var.getRight(), gm.L(16.0f));
                viewGroup2 = pl1Var;
                break;
            case 2:
                viewGroup2 = new bba(viewGroup.getContext(), 0, 0);
                break;
            case 3:
                f56 f56Var = new f56(lp0Var.getParentActivity(), lp0Var, null, false, false);
                f56Var.d.setVisibility(8);
                f56Var.a.setGravity(17);
                f56Var.h.setVisibility(8);
                f56Var.w.setVisibility(8);
                f56Var.setPadding(gm.L(11.0f), 0, gm.L(11.0f), gm.L(24.0f));
                viewGroup2 = f56Var;
                break;
            case 4:
            default:
                gxc.b();
                return null;
            case 5:
                viewGroup2 = new vx4(lp0Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                ylbVar = ((d) lp0Var).resourceProvider;
                viewGroup2 = new njb(20, ylbVar, context);
                break;
            case 7:
                viewGroup2 = new ak4(lp0Var.getParentActivity(), 8, (byte) 0);
                break;
            case 8:
                rzaVar = new a6(lp0Var.getParentActivity(), (byte) 2);
                TextView textView = new TextView(lp0Var.getParentActivity());
                if (sd2.V(lp0Var.j0)) {
                    i2 = 2131747968;
                } else {
                    i2 = 2131747969;
                }
                td4.v(14.0f, i2, 1, textView, null);
                anb.X(textView, cmb.x6, null);
                textView.setGravity(17);
                rzaVar.addView(textView, qoe.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                viewGroup2 = rzaVar;
                break;
            case 9:
                dp0 dp0Var = new dp0(lp0Var.getParentActivity(), (byte) 0);
                dp0Var.a(cmb.u6, cmb.t6);
                viewGroup2 = dp0Var;
                break;
            case 10:
                xib xibVar = new xib(lp0Var.getParentActivity());
                xibVar.o(2131232178, jb6.a0(null, null, 2131753477, new Object[0]), false);
                xibVar.s = 64;
                int i3 = cmb.p6;
                xibVar.g(i3, i3);
                viewGroup2 = xibVar;
                break;
            case 11:
                viewGroup2 = new zx4(lp0Var.getParentActivity());
                break;
            case 12:
                pl1 pl1Var2 = new pl1(lp0Var.getParentActivity(), null);
                pl1Var2.setPadding(pl1Var2.getPaddingLeft(), gm.L(16.0f), pl1Var2.getRight(), gm.L(8.0f));
                viewGroup2 = pl1Var2;
                break;
            case 13:
                Activity parentActivity = lp0Var.getParentActivity();
                ylbVar2 = ((d) lp0Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, ylbVar2);
                lp0Var.W = scrollSlidingTextTabStrip;
                int i4 = cmb.vi;
                int i5 = cmb.ui;
                scrollSlidingTextTabStrip.M = i4;
                scrollSlidingTextTabStrip.N = i5;
                scrollSlidingTextTabStrip.updateColors();
                su suVar = new su(this, lp0Var.getParentActivity());
                lp0Var.W.setDelegate(new k6d(this, (byte) 12));
                suVar.addView(lp0Var.W, qoe.c(48.0f, -2));
                viewGroup2 = suVar;
                break;
            case 14:
                viewGroup2 = lp0Var.o0(lp0Var.getParentActivity());
                break;
            case 15:
                sb sbVar = new sb((byte) 1, lp0Var.getParentActivity(), this);
                sbVar.setTag(-33024);
                viewGroup2 = sbVar;
                break;
        }
        return kt6.h(viewGroup2, viewGroup2, -1, -2);
    }
}
