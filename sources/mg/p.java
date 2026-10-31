package mg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import bi.n4;
import java.util.Date;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.xt;
import org.telegram.ui.LaunchActivity;
public abstract class p {
    public static void a(org.telegram.ui.ActionBar.x1 x1Var, boolean z10) {
        nh.p pVar = x1Var.f21481f;
        if (pVar != null) {
            pVar.setTextSize(1, 20);
        }
        xt xtVar = x1Var.f21495n;
        if (xtVar != null) {
            xtVar.setTextSize(1, 14);
        }
        xt xtVar2 = x1Var.f21495n;
        if (xtVar2 != null) {
            xtVar2.setLineSpacing(org.telegram.messenger.i0.L(2.5f), 1.0f);
        }
        if (!z10) {
            ((ViewGroup.MarginLayoutParams) x1Var.f21506v0.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(-14.0f);
        }
    }

    public static String b(jj jjVar) {
        if (jjVar == null) {
            return "";
        }
        String Y0 = jjVar.Y0();
        if (Y0 == null) {
            TLRPC.Chat L0 = vp.r1(d20.f15147s0).L0(Long.valueOf(-jj.C1(jjVar.f16337k.peer_id)));
            if (L0 == null) {
                return "";
            }
            return L0.title;
        }
        return Y0;
    }

    public static void c(TLRPC.TL_error tL_error, FrameLayout frameLayout, p6 p6Var, Runnable runnable) {
        String str;
        if (tL_error != null && (str = tL_error.text) != null) {
            if (str.contains("PREMIUM_SUB_ACTIVE_UNTIL_")) {
                String format = cd.D0().n0().format(new Date(Long.parseLong(tL_error.text.replace("PREMIUM_SUB_ACTIVE_UNTIL_", "")) * 1000));
                SpannableStringBuilder R2 = org.telegram.messenger.i0.R2(cd.L0(2131749686, "GiftPremiumActivateErrorText"), t6.uj, 0, runnable, null);
                cc ccVar = new cc(frameLayout, p6Var);
                String L0 = cd.L0(2131749685, null);
                ccVar.I(2131623981, L0, org.telegram.messenger.i0.J2(R2, org.telegram.messenger.i0.W2("**" + format + "**"), "%1$s")).j();
                try {
                    frameLayout.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            j(frameLayout.getContext(), tL_error);
        }
    }

    public static void d(boolean z10, String str, TLRPC.TL_payments_giveawayInfo tL_payments_giveawayInfo, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Context context, p6 p6Var) {
        boolean z11;
        boolean z12;
        int i10;
        String str2;
        String str3;
        String str4;
        int i11;
        String str5;
        int i12 = tL_messageMediaGiveaway.quantity;
        String G = cd.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = cd.D0().s0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = cd.D0().o0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        String format3 = cd.D0().t0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        if (tL_messageMediaGiveaway.channels.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((tL_messageMediaGiveaway.flags & 32) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        String L0 = cd.L0(2131753494, "BoostingGiveAwayAbout");
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z12) {
            if (z10) {
                str5 = "BoostingStarsGiveawayHowItWorksText";
            } else {
                str5 = "BoostingStarsGiveawayHowItWorksTextGroup";
            }
            str2 = format;
            i10 = 0;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.K(str5, (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            i10 = 0;
            str2 = format;
            if (z10) {
                str3 = "BoostingGiveawayHowItWorksText";
            } else {
                str3 = "BoostingGiveawayHowItWorksTextGroup";
            }
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(i12, str3, str, Integer.valueOf(i12), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str6 = tL_messageMediaGiveaway.prize_description;
        if (str6 != null && !str6.isEmpty()) {
            String str7 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[2];
            objArr[i10] = str;
            objArr[1] = str7;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(i12, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z11) {
                Object[] objArr2 = new Object[2];
                objArr2[i10] = format2;
                objArr2[1] = format3;
                String G2 = cd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i12);
                Object[] objArr3 = new Object[4];
                objArr3[i10] = str2;
                objArr3[1] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(i12, "BoostingGiveawayHowItWorksSubTextDateSeveral1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i12);
                Object[] objArr4 = new Object[5];
                objArr4[i10] = str2;
                objArr4[1] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(i12, "BoostingGiveawayHowItWorksSubTextDate", objArr4)));
            }
        } else if (z11) {
            int i13 = i10;
            String G3 = cd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[i13]);
            Integer valueOf3 = Integer.valueOf(i12);
            Object[] objArr5 = new Object[4];
            objArr5[i13] = str2;
            objArr5[1] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(i12, "BoostingGiveawayHowItWorksSubTextSeveral1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i12);
            Object[] objArr6 = new Object[3];
            objArr6[i10] = str2;
            objArr6[1] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(i12, "BoostingGiveawayHowItWorksSubText", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        if (tL_payments_giveawayInfo.participating) {
            if (z11) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayParticipantMultiPlural", str)));
            } else {
                m5.p("BoostingGiveawayParticipant", null, 2131753401, new Object[]{str}, spannableStringBuilder);
            }
        } else {
            String str8 = tL_payments_giveawayInfo.disallowed_country;
            if (str8 != null && !str8.isEmpty()) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.L0(2131753402, "BoostingGiveawayNotEligibleCountry")));
            } else if (tL_payments_giveawayInfo.admin_disallowed_chat_id != 0) {
                TLRPC.Chat L02 = vp.r1(d20.f15147s0).L0(Long.valueOf(tL_payments_giveawayInfo.admin_disallowed_chat_id));
                if (L02 != null) {
                    str4 = L02.title;
                } else {
                    str4 = "";
                }
                if (z10) {
                    i11 = 2131753404;
                } else {
                    i11 = 2131753403;
                }
                m5.p(null, null, i11, new Object[]{str4}, spannableStringBuilder);
            } else if (tL_payments_giveawayInfo.joined_too_early_date != 0) {
                m5.p("BoostingGiveawayNotEligible", null, 2131753405, new Object[]{cd.D0().t0().format(new Date(tL_payments_giveawayInfo.joined_too_early_date * 1000))}, spannableStringBuilder);
            } else if (z11) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayTakePartMultiPlural", str, str2)));
            } else {
                m5.p("BoostingGiveawayTakePart", null, 2131753366, new Object[]{str, str2}, spannableStringBuilder);
            }
        }
        x1Var.T = spannableStringBuilder;
        alertDialog$Builder.k(cd.L0(2131747847, "OK"), new m4.v0(13));
        a(alertDialog$Builder.p(), false);
    }

    public static void e(boolean z10, String str, TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Context context, p6 p6Var) {
        boolean z11;
        boolean z12;
        String str2;
        int i10;
        int i11;
        String str3;
        String L0;
        String str4;
        if (tL_messageMediaGiveaway.until_date == 0) {
            tL_messageMediaGiveaway.until_date = tL_payments_giveawayInfoResults.finish_date;
        }
        int i12 = tL_messageMediaGiveaway.quantity;
        String G = cd.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = cd.D0().s0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = cd.D0().o0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        String format3 = cd.D0().t0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        if (tL_messageMediaGiveaway.channels.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((tL_messageMediaGiveaway.flags & 32) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        String L02 = cd.L0(2131753478, "BoostingGiveawayEnd");
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L02;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z12) {
            if (z10) {
                str4 = "BoostingStarsGiveawayHowItWorksTextEnd";
            } else {
                str4 = "BoostingStarsGiveawayHowItWorksTextEndGroup";
            }
            str2 = format;
            i11 = 2;
            i10 = 1;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.K(str4, (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            str2 = format;
            i10 = 1;
            i11 = 2;
            if (z10) {
                str3 = "BoostingGiveawayHowItWorksTextEnd";
            } else {
                str3 = "BoostingGiveawayHowItWorksTextEndGroup";
            }
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(i12, str3, str, Integer.valueOf(i12), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str5 = tL_messageMediaGiveaway.prize_description;
        if (str5 != null && !str5.isEmpty()) {
            String str6 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[i11];
            objArr[0] = str;
            objArr[i10] = str6;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(i12, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z11) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = format2;
                objArr2[i10] = format3;
                String G2 = cd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i12);
                Object[] objArr3 = new Object[4];
                objArr3[0] = str2;
                objArr3[i10] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(i12, "BoostingGiveawayHowItWorksSubTextDateSeveralEnd1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i12);
                Object[] objArr4 = new Object[5];
                objArr4[0] = str2;
                objArr4[i10] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(i12, "BoostingGiveawayHowItWorksSubTextDateEnd", objArr4)));
            }
        } else if (z11) {
            String G3 = cd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[0]);
            Integer valueOf3 = Integer.valueOf(i12);
            Object[] objArr5 = new Object[4];
            objArr5[0] = str2;
            objArr5[i10] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(i12, "BoostingGiveawayHowItWorksSubTextSeveralEnd1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i12);
            Object[] objArr6 = new Object[3];
            objArr6[0] = str2;
            objArr6[i10] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(i12, "BoostingGiveawayHowItWorksSubTextEnd", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) " ");
        int i13 = tL_payments_giveawayInfoResults.activated_count;
        if (i13 > 0) {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(i13, "BoostingGiveawayUsedLinksPlural", new Object[0])));
        }
        if (tL_payments_giveawayInfoResults.refunded) {
            String L03 = cd.L0(2131753483, "BoostingGiveawayCanceledByPayment");
            TextView g10 = m5.g(context, i10, 14.0f);
            g10.setTypeface(org.telegram.messenger.i0.o());
            g10.setGravity(17);
            g10.setText(L03);
            int i14 = t6.f21153p7;
            a7.V(g10, i14, p6Var);
            ShapeDrawable e02 = t6.e0(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), t6.r1(0.1f, t6.w0(i14, p6Var)));
            w6 L = a7.L(0.1f, i14);
            g10.setBackground(e02);
            a7.k(g10, e02, L, null, p6Var);
            g10.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
            x1Var.f21474c = g10;
            x1Var.T = spannableStringBuilder;
            alertDialog$Builder.k(cd.L0(2131752041, "Close"), new m4.v0(13));
            a(alertDialog$Builder.p(), true);
            return;
        }
        x1Var.T = spannableStringBuilder;
        if (tL_payments_giveawayInfoResults.winner) {
            L0 = cd.L0(2131753357, null);
            if ((tL_payments_giveawayInfoResults.flags & 16) == 0) {
                alertDialog$Builder.k(cd.L0(2131753359, "BoostingGiveawayViewPrize"), new ig.c0(tL_payments_giveawayInfoResults, 28));
            }
            alertDialog$Builder.h(cd.L0(2131752041, "Close"), new m4.v0(13));
        } else {
            L0 = cd.L0(2131753358, "BoostingGiveawayYouNotWon");
            alertDialog$Builder.k(cd.L0(2131752041, "Close"), new m4.v0(13));
        }
        xt xtVar = new xt(context);
        zs.i(xtVar);
        a7.V(xtVar, t6.f21037j5, p6Var);
        xtVar.setTextSize(1, 14.0f);
        xtVar.setGravity(17);
        xtVar.setText(L0);
        int L2 = org.telegram.messenger.i0.L(8.0f);
        int L3 = org.telegram.messenger.i0.L(8.0f);
        int i15 = t6.f21107mi;
        ShapeDrawable e03 = t6.e0(L2, L3, t6.w0(i15, p6Var));
        w6 N = a7.N(i15);
        xtVar.setBackground(e03);
        a7.k(xtVar, e03, N, null, p6Var);
        xtVar.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(9.0f));
        x1Var.d = xtVar;
        a(alertDialog$Builder.p(), false);
    }

    public static void f(k2 k2Var, TLRPC.Chat chat, boolean z10) {
        if (k2Var == null) {
            return;
        }
        org.telegram.messenger.i0.h3(new n4(cc.a0(k2Var), z10, chat, k2Var.getResourceProvider(), 5), 300L);
    }

    public static void g(int i10) {
        String str;
        k2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (i10 < 60) {
            str = cd.G(i10, "Seconds", new Object[0]);
        } else if (i10 < 3600) {
            str = cd.G(i10 / 60, "Minutes", new Object[0]);
        } else {
            int i11 = (i10 / 60) / 60;
            if (i11 > 2) {
                str = cd.G(i11, "Hours", new Object[0]);
            } else {
                str = cd.G(i11, "Hours", new Object[0]) + " " + cd.G(i10 % 60, "Minutes", new Object[0]);
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
        String L0 = cd.L0(2131752565, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.i0.W2(cd.a0("CantBoostTooOftenDescription", null, 2131752564, str));
        alertDialog$Builder.k(cd.L0(2131747847, null), new m4.v0(17));
        alertDialog$Builder.p();
    }

    public static void h(long j10) {
        SpannableStringBuilder W2;
        if (j10 == d20.i(d20.f15147s0).f15165n) {
            W2 = org.telegram.messenger.i0.W2(cd.L0(2131753498, null));
        } else if (o5.z(j10)) {
            W2 = org.telegram.messenger.i0.W2(cd.a0("BoostingGiftLinkForwardedTo", null, 2131753499, vp.r1(d20.f15147s0).L0(Long.valueOf(-j10)).title));
        } else {
            W2 = org.telegram.messenger.i0.W2(cd.a0("BoostingGiftLinkForwardedTo", null, 2131753499, h20.j(vp.r1(d20.f15147s0).Z1(Long.valueOf(j10)), true)));
        }
        org.telegram.messenger.i0.h3(new lg.s(W2, 5), 450L);
    }

    public static void i(long j10, z2 z2Var) {
        TLRPC.Chat L0 = vp.r1(d20.f15147s0).L0(Long.valueOf(-j10));
        k2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
        String L02 = cd.L0(2131753338, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L02;
        x1Var.T = org.telegram.messenger.i0.W2(cd.G((int) vp.r1(d20.f15147s0).f18884r0, "BoostingGetMoreBoostByGiftingCount", L0.title));
        alertDialog$Builder.h(cd.L0(2131749689, "GiftPremium"), new c(z2Var));
        alertDialog$Builder.k(cd.L0(2131752041, "Close"), new m4.v0(13));
        alertDialog$Builder.p();
    }

    public static void j(Context context, TLRPC.TL_error tL_error) {
        String str;
        if (tL_error != null && (str = tL_error.text) != null && !TextUtils.isEmpty(str)) {
            Toast.makeText(context, tL_error.text, 1).show();
        }
    }
}
