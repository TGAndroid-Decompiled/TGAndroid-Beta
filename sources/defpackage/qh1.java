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
public final class qh1 extends ka {
    public int d = -1;
    public int e = -1;
    public final sh1 f;

    public qh1(sh1 sh1Var) {
        this.f = sh1Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return ((rh1) this.f.y.get(u69Var.b())).b;
    }

    @Override
    public final int b() {
        return this.f.y.size();
    }

    @Override
    public final int d(int i) {
        return ((rh1) this.f.y.get(i)).a;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        sh1 sh1Var;
        int i2;
        rh1 rh1Var;
        String a0;
        int i3 = u69Var.f;
        if (i3 != 4) {
            if (i3 != 1 && i3 != 12) {
                if (i3 == 0) {
                    rza rzaVar = (rza) u69Var.a;
                    rzaVar.a(Integer.toString(this.f.d.level), 0, null, jb6.M0(2131753124, null));
                    sh1 sh1Var2 = this.f;
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = sh1Var2.d.premium_audience;
                    int i4 = 2131746774;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) this.f.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (sd2.V(this.f.J)) {
                                i4 = 2131746664;
                            }
                            rzaVar.a(str, 1, concat, jb6.M0(i4, null));
                            rzaVar.a(String.valueOf(this.f.d.boosts), 2, null, jb6.M0(2131753127, null));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f.d;
                            rzaVar.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, jb6.M0(2131753122, null));
                            return;
                        }
                    }
                    if (sd2.V(sh1Var2.J)) {
                        i4 = 2131746664;
                    }
                    rzaVar.a("≈0", 1, "0%", jb6.M0(i4, null));
                    rzaVar.a(String.valueOf(this.f.d.boosts), 2, null, jb6.M0(2131753127, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.f.d;
                    rzaVar.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, jb6.M0(2131753122, null));
                    return;
                } else if (i3 == 5) {
                    TL_stories.Boost boost = ((rh1) this.f.y.get(i)).d;
                    TLRPC.User W1 = oc7.r1(this.f.b).W1(Long.valueOf(boost.user_id));
                    vx4 vx4Var = (vx4) u69Var.a;
                    int i5 = boost.multiplier;
                    int i6 = boost.expires;
                    if (i5 > 1) {
                        a0 = jb6.a0("BoostsExpireOn", null, 2131753126, jb6.r(i6, false));
                    } else {
                        a0 = jb6.a0("BoostExpireOn", null, 2131753626, jb6.r(i6, false));
                    }
                    vx4Var.d(W1, bw2.p(W1), a0, !((rh1) this.f.y.get(i)).f);
                    vx4Var.setStatus(boost);
                    vx4Var.setAvatarPadding(5);
                    return;
                } else if (i3 == 6) {
                    ((njb) u69Var.a).setText(((rh1) this.f.y.get(i)).c);
                    return;
                } else if (i3 == 9) {
                    fj6 fj6Var = (fj6) u69Var.a;
                    sh1 sh1Var3 = this.f;
                    if (sh1Var3.E == 0) {
                        fj6Var.b(2131230872, 5, jb6.G(sh1Var3.s, "BoostingShowMoreBoosts", new Object[0]), false);
                        return;
                    } else {
                        fj6Var.b(2131230872, 5, jb6.G(sh1Var3.x, "BoostingShowMoreGifts", new Object[0]), false);
                        return;
                    }
                } else if (i3 == 3) {
                    ((f56) u69Var.a).setLink(((rh1) this.f.y.get(i)).c);
                    return;
                } else if (i3 == 11) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = ((rh1) this.f.y.get(i)).e;
                    zx4 zx4Var = (zx4) u69Var.a;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        zx4Var.d(prepaidGiveaway, jb6.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), jb6.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", jb6.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !rh1Var.f);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        zx4Var.d(prepaidGiveaway, jb6.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), jb6.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !rh1Var.f);
                    }
                    zx4Var.setImage(prepaidGiveaway);
                    zx4Var.setAvatarPadding(5);
                    return;
                } else if (i3 == 13) {
                    int i7 = this.d;
                    sh1 sh1Var4 = this.f;
                    int i8 = sh1Var4.P;
                    if (i7 != i8 || this.e != sh1Var4.O) {
                        this.d = i8;
                        this.e = sh1Var4.O;
                        sh1Var4.f.f();
                        sh1 sh1Var5 = this.f;
                        sh1Var5.f.a(0, jb6.G(sh1Var5.P, "BoostingBoostsCount", new Object[0]), null);
                        if (oc7.r1(this.f.b).l4.O1.f && (i2 = (sh1Var = this.f).O) > 0 && i2 != sh1Var.P) {
                            sh1Var.f.a(1, jb6.G(i2, "BoostingGiftsCount", new Object[0]), null);
                        }
                        sh1 sh1Var6 = this.f;
                        sh1Var6.f.setInitialTabId(sh1Var6.E);
                        this.f.f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            pl1 pl1Var = (pl1) u69Var.a;
            pl1Var.setTitle(((rh1) this.f.y.get(i)).c);
            pl1Var.c(false);
            if (u69Var.f == 12) {
                pl1Var.setPadding(gm.L(3.0f), pl1Var.getPaddingTop(), pl1Var.getPaddingRight(), pl1Var.getPaddingBottom());
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        su suVar;
        int i2;
        sh1 sh1Var = this.f;
        ylb ylbVar = sh1Var.e;
        xza xzaVar = sh1Var.c;
        switch (i) {
            case 0:
                suVar = new rza(sh1Var.getContext(), 2);
                break;
            case 1:
                View pl1Var = new pl1(sh1Var.getContext(), null);
                pl1Var.setPadding(pl1Var.getPaddingLeft(), gm.L(16.0f), pl1Var.getRight(), gm.L(16.0f));
                suVar = pl1Var;
                break;
            case 2:
                Context context = viewGroup.getContext();
                int i3 = cmb.Z6;
                View bbaVar = new bba(context, cmb.w0(null, i3, false), 0);
                anb.h(i3, null, bbaVar);
                suVar = bbaVar;
                break;
            case 3:
                f56 f56Var = new f56(sh1Var.getContext(), sh1Var.c, null, false, false);
                f56Var.d.setVisibility(8);
                f56Var.a.setGravity(17);
                f56Var.h.setVisibility(8);
                f56Var.w.setVisibility(8);
                f56Var.setPadding(gm.L(11.0f), 0, gm.L(11.0f), gm.L(24.0f));
                suVar = f56Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(sh1Var.getContext(), 2131231130, 0, 0, sh1Var.e);
                limitPreviewView.d0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, gm.L(20.0f), 0, gm.L(20.0f));
                limitPreviewView.h(sh1Var.d, false);
                suVar = limitPreviewView;
                break;
            case 5:
                suVar = new vx4(sh1Var.getContext());
                break;
            case 6:
                suVar = new njb(20, ylbVar, viewGroup.getContext());
                break;
            case 7:
                suVar = new ak4(sh1Var.getContext(), 8, (byte) 0);
                break;
            case 8:
                a6 a6Var = new a6(sh1Var.getContext(), (byte) 3);
                TextView textView = new TextView(sh1Var.getContext());
                if (sd2.V(sh1Var.J)) {
                    i2 = 2131747968;
                } else {
                    i2 = 2131747969;
                }
                td4.v(14.0f, i2, 1, textView, null);
                anb.X(textView, cmb.x6, null);
                textView.setGravity(17);
                a6Var.addView(textView, qoe.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                suVar = a6Var;
                break;
            case 9:
                dp0 dp0Var = new dp0(sh1Var.getContext(), (byte) 1);
                dp0Var.a(cmb.u6, cmb.t6);
                suVar = dp0Var;
                break;
            case 10:
                xib xibVar = new xib(sh1Var.getContext());
                xibVar.o(2131232178, jb6.a0("BoostingGetBoostsViaGifts", null, 2131753477, new Object[0]), false);
                xibVar.s = 64;
                int i4 = cmb.p6;
                xibVar.g(i4, i4);
                suVar = xibVar;
                break;
            case 11:
                suVar = new zx4(sh1Var.getContext());
                break;
            case 12:
                View pl1Var2 = new pl1(sh1Var.getContext(), null);
                pl1Var2.setPadding(pl1Var2.getPaddingLeft(), gm.L(16.0f), pl1Var2.getRight(), gm.L(8.0f));
                suVar = pl1Var2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(xzaVar.getParentActivity(), ylbVar);
                sh1Var.f = scrollSlidingTextTabStrip;
                int i5 = cmb.vi;
                int i6 = cmb.ui;
                scrollSlidingTextTabStrip.M = i5;
                scrollSlidingTextTabStrip.N = i6;
                scrollSlidingTextTabStrip.updateColors();
                su suVar2 = new su(this, xzaVar.getParentActivity());
                sh1Var.f.setDelegate(new nl9(this, (byte) 15));
                suVar2.addView(sh1Var.f, qoe.c(48.0f, -2));
                suVar = suVar2;
                break;
            default:
                gxc.b();
                return null;
        }
        return kt6.h(suVar, suVar, -1, -2);
    }
}
