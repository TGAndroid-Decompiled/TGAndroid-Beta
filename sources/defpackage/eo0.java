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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class eo0 extends la {
    public final lo0 d;

    public eo0(lo0 lo0Var) {
        this.d = lo0Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return ((ko0) this.d.d0.get(f89Var.b())).b;
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
    public final void t(f89 f89Var, int i) {
        lo0 lo0Var;
        int i2;
        ko0 ko0Var;
        String a0;
        int i3 = f89Var.f;
        if (i3 != 4 && i3 != 14 && i3 != 15) {
            if (i3 != 1 && i3 != 12 && i3 != 16) {
                if (i3 == 0) {
                    q1b q1bVar = (q1b) f89Var.a;
                    q1bVar.a(Integer.toString(this.d.U.level), 0, null, ob6.M0(2131753152, null));
                    lo0 lo0Var2 = this.d;
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = lo0Var2.U.premium_audience;
                    int i4 = 2131746768;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) this.d.U.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (xc2.V(this.d.j0)) {
                                i4 = 2131746658;
                            }
                            q1bVar.a(str, 1, concat, ob6.M0(i4, null));
                            q1bVar.a(String.valueOf(this.d.U.boosts), 2, null, ob6.M0(2131753155, null));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.d.U;
                            q1bVar.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, ob6.M0(2131753150, null));
                            q1bVar.setPadding(hl.L(23.0f), q1bVar.getPaddingTop(), hl.L(23.0f), q1bVar.getPaddingBottom());
                            return;
                        }
                    }
                    if (xc2.V(lo0Var2.j0)) {
                        i4 = 2131746658;
                    }
                    q1bVar.a("~0", 1, "0%", ob6.M0(i4, null));
                    q1bVar.a(String.valueOf(this.d.U.boosts), 2, null, ob6.M0(2131753155, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.d.U;
                    q1bVar.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, ob6.M0(2131753150, null));
                    q1bVar.setPadding(hl.L(23.0f), q1bVar.getPaddingTop(), hl.L(23.0f), q1bVar.getPaddingBottom());
                    return;
                } else if (i3 == 5) {
                    TL_stories.Boost boost = ((ko0) this.d.d0.get(i)).d;
                    TLRPC.User X1 = uc7.s1(this.d.T).X1(Long.valueOf(boost.user_id));
                    zx4 zx4Var = (zx4) f89Var.a;
                    int i5 = boost.multiplier;
                    long j = boost.expires;
                    if (i5 > 1) {
                        a0 = ob6.a0("BoostsExpireOn", null, 2131753154, ob6.r(j, false));
                    } else {
                        a0 = ob6.a0("BoostExpireOn", null, 2131753654, ob6.r(j, false));
                    }
                    zx4Var.d(X1, lv2.p(X1), a0, !((ko0) this.d.d0.get(i)).f);
                    zx4Var.setStatus(boost);
                    zx4Var.setAvatarPadding(5);
                    return;
                } else if (i3 == 6) {
                    ilb ilbVar = (ilb) f89Var.a;
                    ilbVar.setText(((ko0) this.d.d0.get(i)).c);
                    ilbVar.setTextColor(aob.p1(0.875f, -1));
                    return;
                } else if (i3 == 9) {
                    ij6 ij6Var = (ij6) f89Var.a;
                    lo0 lo0Var3 = this.d;
                    if (lo0Var3.e0 == 0) {
                        ij6Var.b(2131230871, 5, ob6.G(lo0Var3.a0, "BoostingShowMoreBoosts", new Object[0]), false);
                        return;
                    } else {
                        ij6Var.b(2131230871, 5, ob6.G(lo0Var3.c0, "BoostingShowMoreGifts", new Object[0]), false);
                        return;
                    }
                } else if (i3 == 3) {
                    ((i56) f89Var.a).setLink(((ko0) this.d.d0.get(i)).c);
                    return;
                } else if (i3 == 11) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = ((ko0) this.d.d0.get(i)).e;
                    cy4 cy4Var = (cy4) f89Var.a;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cy4Var.d(prepaidGiveaway, ob6.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), ob6.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", ob6.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !ko0Var.f);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cy4Var.d(prepaidGiveaway, ob6.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), ob6.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !ko0Var.f);
                    }
                    cy4Var.setImage(prepaidGiveaway);
                    cy4Var.setAvatarPadding(5);
                    return;
                } else if (i3 == 13) {
                    if (this.d.W.getTag() == null || ((Integer) this.d.W.getTag()).intValue() != Objects.hash(Integer.valueOf(this.d.p0), Integer.valueOf(this.d.o0))) {
                        lo0 lo0Var4 = this.d;
                        lo0Var4.W.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(lo0Var4.p0), Integer.valueOf(this.d.o0))));
                        this.d.W.f();
                        lo0 lo0Var5 = this.d;
                        lo0Var5.W.a(0, ob6.G(lo0Var5.p0, "BoostingBoostsCount", new Object[0]), null);
                        if (uc7.s1(this.d.T).k4.W1.f && (i2 = (lo0Var = this.d).o0) > 0 && i2 != lo0Var.p0) {
                            lo0Var.W.a(1, ob6.G(i2, "BoostingGiftsCount", new Object[0]), null);
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
            qk1 qk1Var = (qk1) f89Var.a;
            qk1Var.setTitle(((ko0) this.d.d0.get(i)).c);
            qk1Var.c(false);
            if (f89Var.f == 12) {
                qk1Var.setPadding(hl.L(3.0f), qk1Var.getPaddingTop(), qk1Var.getPaddingRight(), qk1Var.getPaddingBottom());
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        ViewGroup q1bVar;
        ViewGroup viewGroup2;
        vnb vnbVar;
        int i2;
        vnb vnbVar2;
        lo0 lo0Var = this.d;
        switch (i) {
            case 0:
                q1bVar = new q1b(lo0Var.getParentActivity(), 2);
                viewGroup2 = q1bVar;
                break;
            case 1:
            case 16:
                ViewGroup qk1Var = new qk1(lo0Var.getParentActivity(), null);
                qk1Var.setPadding(qk1Var.getPaddingLeft(), hl.L(16.0f), qk1Var.getRight(), hl.L(16.0f));
                viewGroup2 = qk1Var;
                break;
            case 2:
                viewGroup2 = new rca(viewGroup.getContext(), 0, 0);
                break;
            case 3:
                i56 i56Var = new i56(lo0Var.getParentActivity(), lo0Var, null, false, false);
                i56Var.d.setVisibility(8);
                i56Var.a.setGravity(17);
                i56Var.h.setVisibility(8);
                i56Var.w.setVisibility(8);
                i56Var.setPadding(hl.L(11.0f), 0, hl.L(11.0f), hl.L(24.0f));
                viewGroup2 = i56Var;
                break;
            case 4:
            default:
                p3d.a();
                return null;
            case 5:
                viewGroup2 = new zx4(lo0Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                vnbVar = ((e) lo0Var).resourceProvider;
                viewGroup2 = new ilb(20, vnbVar, context);
                break;
            case 7:
                viewGroup2 = new ak4(lo0Var.getParentActivity(), 8, (byte) 0);
                break;
            case 8:
                q1bVar = new b6(lo0Var.getParentActivity(), (byte) 2);
                TextView textView = new TextView(lo0Var.getParentActivity());
                if (xc2.V(lo0Var.j0)) {
                    i2 = 2131747965;
                } else {
                    i2 = 2131747966;
                }
                qd4.u(14.0f, i2, 1, textView, null);
                yob.X(textView, aob.y6, null);
                textView.setGravity(17);
                q1bVar.addView(textView, tre.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                viewGroup2 = q1bVar;
                break;
            case 9:
                do0 do0Var = new do0(lo0Var.getParentActivity(), (byte) 0);
                do0Var.a(aob.v6, aob.u6);
                viewGroup2 = do0Var;
                break;
            case 10:
                skb skbVar = new skb(lo0Var.getParentActivity());
                skbVar.o(2131232177, ob6.a0(null, null, 2131753505, new Object[0]), false);
                skbVar.s = 64;
                int i3 = aob.q6;
                skbVar.g(i3, i3);
                viewGroup2 = skbVar;
                break;
            case 11:
                viewGroup2 = new cy4(lo0Var.getParentActivity());
                break;
            case 12:
                qk1 qk1Var2 = new qk1(lo0Var.getParentActivity(), null);
                qk1Var2.setPadding(qk1Var2.getPaddingLeft(), hl.L(16.0f), qk1Var2.getRight(), hl.L(8.0f));
                viewGroup2 = qk1Var2;
                break;
            case 13:
                Activity parentActivity = lo0Var.getParentActivity();
                vnbVar2 = ((e) lo0Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, vnbVar2);
                lo0Var.W = scrollSlidingTextTabStrip;
                int i4 = aob.wi;
                int i5 = aob.vi;
                scrollSlidingTextTabStrip.M = i4;
                scrollSlidingTextTabStrip.N = i5;
                scrollSlidingTextTabStrip.updateColors();
                tt ttVar = new tt(this, lo0Var.getParentActivity());
                lo0Var.W.setDelegate(new z8d(this, (byte) 12));
                ttVar.addView(lo0Var.W, tre.c(48.0f, -2));
                viewGroup2 = ttVar;
                break;
            case 14:
                viewGroup2 = lo0Var.n0(lo0Var.getParentActivity());
                break;
            case 15:
                tb tbVar = new tb((byte) 1, lo0Var.getParentActivity(), this);
                tbVar.setTag(-33024);
                viewGroup2 = tbVar;
                break;
        }
        return qu6.h(viewGroup2, viewGroup2, -1, -2);
    }
}
