package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class rg1 extends la {
    public int d = -1;
    public int e = -1;
    public final tg1 f;

    public rg1(tg1 tg1Var) {
        this.f = tg1Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return ((sg1) this.f.y.get(f89Var.b())).b;
    }

    @Override
    public final int b() {
        return this.f.y.size();
    }

    @Override
    public final int d(int i) {
        return ((sg1) this.f.y.get(i)).a;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        tg1 tg1Var;
        int i2;
        sg1 sg1Var;
        String a0;
        int i3 = f89Var.f;
        if (i3 != 4) {
            if (i3 != 1 && i3 != 12) {
                if (i3 == 0) {
                    q1b q1bVar = (q1b) f89Var.a;
                    q1bVar.a(Integer.toString(this.f.d.level), 0, null, ob6.M0(2131753152, null));
                    tg1 tg1Var2 = this.f;
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = tg1Var2.d.premium_audience;
                    int i4 = 2131746768;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) this.f.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (xc2.V(this.f.J)) {
                                i4 = 2131746658;
                            }
                            q1bVar.a(str, 1, concat, ob6.M0(i4, null));
                            q1bVar.a(String.valueOf(this.f.d.boosts), 2, null, ob6.M0(2131753155, null));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f.d;
                            q1bVar.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, ob6.M0(2131753150, null));
                            return;
                        }
                    }
                    if (xc2.V(tg1Var2.J)) {
                        i4 = 2131746658;
                    }
                    q1bVar.a("≈0", 1, "0%", ob6.M0(i4, null));
                    q1bVar.a(String.valueOf(this.f.d.boosts), 2, null, ob6.M0(2131753155, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.f.d;
                    q1bVar.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, ob6.M0(2131753150, null));
                    return;
                } else if (i3 == 5) {
                    TL_stories.Boost boost = ((sg1) this.f.y.get(i)).d;
                    TLRPC.User X1 = uc7.s1(this.f.b).X1(Long.valueOf(boost.user_id));
                    zx4 zx4Var = (zx4) f89Var.a;
                    int i5 = boost.multiplier;
                    int i6 = boost.expires;
                    if (i5 > 1) {
                        a0 = ob6.a0("BoostsExpireOn", null, 2131753154, ob6.r(i6, false));
                    } else {
                        a0 = ob6.a0("BoostExpireOn", null, 2131753654, ob6.r(i6, false));
                    }
                    zx4Var.d(X1, lv2.p(X1), a0, !((sg1) this.f.y.get(i)).f);
                    zx4Var.setStatus(boost);
                    zx4Var.setAvatarPadding(5);
                    return;
                } else if (i3 == 6) {
                    ((ilb) f89Var.a).setText(((sg1) this.f.y.get(i)).c);
                    return;
                } else if (i3 == 9) {
                    ij6 ij6Var = (ij6) f89Var.a;
                    tg1 tg1Var3 = this.f;
                    if (tg1Var3.E == 0) {
                        ij6Var.b(2131230871, 5, ob6.G(tg1Var3.s, "BoostingShowMoreBoosts", new Object[0]), false);
                        return;
                    } else {
                        ij6Var.b(2131230871, 5, ob6.G(tg1Var3.x, "BoostingShowMoreGifts", new Object[0]), false);
                        return;
                    }
                } else if (i3 == 3) {
                    ((i56) f89Var.a).setLink(((sg1) this.f.y.get(i)).c);
                    return;
                } else if (i3 == 11) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = ((sg1) this.f.y.get(i)).e;
                    cy4 cy4Var = (cy4) f89Var.a;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cy4Var.d(prepaidGiveaway, ob6.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), ob6.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", ob6.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !sg1Var.f);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cy4Var.d(prepaidGiveaway, ob6.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), ob6.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !sg1Var.f);
                    }
                    cy4Var.setImage(prepaidGiveaway);
                    cy4Var.setAvatarPadding(5);
                    return;
                } else if (i3 == 13) {
                    int i7 = this.d;
                    tg1 tg1Var4 = this.f;
                    int i8 = tg1Var4.P;
                    if (i7 != i8 || this.e != tg1Var4.O) {
                        this.d = i8;
                        this.e = tg1Var4.O;
                        tg1Var4.f.f();
                        tg1 tg1Var5 = this.f;
                        tg1Var5.f.a(0, ob6.G(tg1Var5.P, "BoostingBoostsCount", new Object[0]), null);
                        if (uc7.s1(this.f.b).k4.W1.f && (i2 = (tg1Var = this.f).O) > 0 && i2 != tg1Var.P) {
                            tg1Var.f.a(1, ob6.G(i2, "BoostingGiftsCount", new Object[0]), null);
                        }
                        tg1 tg1Var6 = this.f;
                        tg1Var6.f.setInitialTabId(tg1Var6.E);
                        this.f.f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            qk1 qk1Var = (qk1) f89Var.a;
            qk1Var.setTitle(((sg1) this.f.y.get(i)).c);
            qk1Var.c(false);
            if (f89Var.f == 12) {
                qk1Var.setPadding(hl.L(3.0f), qk1Var.getPaddingTop(), qk1Var.getPaddingRight(), qk1Var.getPaddingBottom());
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        tt ttVar;
        int i2;
        tg1 tg1Var = this.f;
        vnb vnbVar = tg1Var.e;
        w1b w1bVar = tg1Var.c;
        switch (i) {
            case 0:
                ttVar = new q1b(tg1Var.getContext(), 2);
                break;
            case 1:
                View qk1Var = new qk1(tg1Var.getContext(), null);
                qk1Var.setPadding(qk1Var.getPaddingLeft(), hl.L(16.0f), qk1Var.getRight(), hl.L(16.0f));
                ttVar = qk1Var;
                break;
            case 2:
                Context context = viewGroup.getContext();
                int i3 = aob.a7;
                View rcaVar = new rca(context, aob.w0(null, i3, false), 0);
                yob.h(i3, null, rcaVar);
                ttVar = rcaVar;
                break;
            case 3:
                i56 i56Var = new i56(tg1Var.getContext(), tg1Var.c, null, false, false);
                i56Var.d.setVisibility(8);
                i56Var.a.setGravity(17);
                i56Var.h.setVisibility(8);
                i56Var.w.setVisibility(8);
                i56Var.setPadding(hl.L(11.0f), 0, hl.L(11.0f), hl.L(24.0f));
                ttVar = i56Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(tg1Var.getContext(), 2131231129, 0, 0, tg1Var.e);
                limitPreviewView.d0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, hl.L(20.0f), 0, hl.L(20.0f));
                limitPreviewView.h(tg1Var.d, false);
                ttVar = limitPreviewView;
                break;
            case 5:
                ttVar = new zx4(tg1Var.getContext());
                break;
            case 6:
                ttVar = new ilb(20, vnbVar, viewGroup.getContext());
                break;
            case 7:
                ttVar = new ak4(tg1Var.getContext(), 8, (byte) 0);
                break;
            case 8:
                b6 b6Var = new b6(tg1Var.getContext(), (byte) 3);
                TextView textView = new TextView(tg1Var.getContext());
                if (xc2.V(tg1Var.J)) {
                    i2 = 2131747965;
                } else {
                    i2 = 2131747966;
                }
                qd4.u(14.0f, i2, 1, textView, null);
                yob.X(textView, aob.y6, null);
                textView.setGravity(17);
                b6Var.addView(textView, tre.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                ttVar = b6Var;
                break;
            case 9:
                do0 do0Var = new do0(tg1Var.getContext(), (byte) 1);
                do0Var.a(aob.v6, aob.u6);
                ttVar = do0Var;
                break;
            case 10:
                skb skbVar = new skb(tg1Var.getContext());
                skbVar.o(2131232177, ob6.a0("BoostingGetBoostsViaGifts", null, 2131753505, new Object[0]), false);
                skbVar.s = 64;
                int i4 = aob.q6;
                skbVar.g(i4, i4);
                ttVar = skbVar;
                break;
            case 11:
                ttVar = new cy4(tg1Var.getContext());
                break;
            case 12:
                View qk1Var2 = new qk1(tg1Var.getContext(), null);
                qk1Var2.setPadding(qk1Var2.getPaddingLeft(), hl.L(16.0f), qk1Var2.getRight(), hl.L(8.0f));
                ttVar = qk1Var2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(w1bVar.getParentActivity(), vnbVar);
                tg1Var.f = scrollSlidingTextTabStrip;
                int i5 = aob.wi;
                int i6 = aob.vi;
                scrollSlidingTextTabStrip.M = i5;
                scrollSlidingTextTabStrip.N = i6;
                scrollSlidingTextTabStrip.updateColors();
                tt ttVar2 = new tt(this, w1bVar.getParentActivity());
                tg1Var.f.setDelegate(new zm9(this, (byte) 15));
                ttVar2.addView(tg1Var.f, tre.c(48.0f, -2));
                ttVar = ttVar2;
                break;
            default:
                p3d.a();
                return null;
        }
        return qu6.h(ttVar, ttVar, -1, -2);
    }
}
