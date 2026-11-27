package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Date;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public abstract class ym0 {
    public static void a(id idVar, boolean z) {
        tpa tpaVar = idVar.f;
        if (tpaVar != null) {
            tpaVar.setTextSize(1, 20.0f);
        }
        uu3 uu3Var = idVar.n;
        if (uu3Var != null) {
            uu3Var.setTextSize(1, 14.0f);
        }
        uu3 uu3Var2 = idVar.n;
        if (uu3Var2 != null) {
            uu3Var2.setLineSpacing(hl.L(2.5f), 1.0f);
        }
        if (!z) {
            ((ViewGroup.MarginLayoutParams) idVar.u0.getLayoutParams()).topMargin = hl.L(-14.0f);
        }
    }

    public static String b(r47 r47Var) {
        if (r47Var == null) {
            return "";
        }
        String Y0 = r47Var.Y0();
        if (Y0 == null) {
            TLRPC.Chat M0 = uc7.s1(yac.t0).M0(Long.valueOf(-r47.B1(r47Var.k.peer_id)));
            if (M0 == null) {
                return "";
            }
            return M0.title;
        }
        return Y0;
    }

    public static void c(TLRPC.TL_error tL_error, FrameLayout frameLayout, vnb vnbVar, Runnable runnable) {
        String str;
        if (tL_error != null && (str = tL_error.text) != null) {
            if (str.contains("PREMIUM_SUB_ACTIVE_UNTIL_")) {
                String format = ob6.D0().n0().format(new Date(Long.parseLong(tL_error.text.replace("PREMIUM_SUB_ACTIVE_UNTIL_", "")) * 1000));
                SpannableStringBuilder N2 = hl.N2(ob6.M0(2131749466, "GiftPremiumActivateErrorText"), aob.xj, 0, runnable, null);
                d31 d31Var = new d31(frameLayout, vnbVar);
                String M0 = ob6.M0(2131749465, null);
                d31Var.I(2131623982, M0, hl.G2(N2, hl.S2("**" + format + "**"), "%1$s")).j();
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

    public static void d(boolean z, String str, TLRPC.TL_payments_giveawayInfo tL_payments_giveawayInfo, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Activity activity, vnb vnbVar) {
        boolean z2;
        boolean z3;
        int i;
        String str2;
        String str3;
        String str4;
        int i2;
        String str5;
        int i3 = tL_messageMediaGiveaway.quantity;
        String G = ob6.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = ob6.D0().s0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = ob6.D0().o0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        String format3 = ob6.D0().t0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        if (tL_messageMediaGiveaway.channels.size() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((tL_messageMediaGiveaway.flags & 32) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
        String M0 = ob6.M0(2131753487, "BoostingGiveAwayAbout");
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z3) {
            if (z) {
                str5 = "BoostingStarsGiveawayHowItWorksText";
            } else {
                str5 = "BoostingStarsGiveawayHowItWorksTextGroup";
            }
            str2 = format;
            i = 0;
            spannableStringBuilder.append((CharSequence) hl.S2(ob6.K(str5, (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            i = 0;
            str2 = format;
            if (z) {
                str3 = "BoostingGiveawayHowItWorksText";
            } else {
                str3 = "BoostingGiveawayHowItWorksTextGroup";
            }
            spannableStringBuilder.append((CharSequence) hl.S2(ob6.G(i3, str3, str, Integer.valueOf(i3), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str6 = tL_messageMediaGiveaway.prize_description;
        if (str6 != null && !str6.isEmpty()) {
            String str7 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[2];
            objArr[i] = str;
            objArr[1] = str7;
            spannableStringBuilder.append((CharSequence) hl.S2(ob6.G(i3, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z2) {
                Object[] objArr2 = new Object[2];
                objArr2[i] = format2;
                objArr2[1] = format3;
                String G2 = ob6.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i3);
                Object[] objArr3 = new Object[4];
                objArr3[i] = str2;
                objArr3[1] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) hl.S2(ob6.G(i3, "BoostingGiveawayHowItWorksSubTextDateSeveral1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i3);
                Object[] objArr4 = new Object[5];
                objArr4[i] = str2;
                objArr4[1] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) hl.S2(ob6.G(i3, "BoostingGiveawayHowItWorksSubTextDate", objArr4)));
            }
        } else if (z2) {
            int i4 = i;
            String G3 = ob6.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[i4]);
            Integer valueOf3 = Integer.valueOf(i3);
            Object[] objArr5 = new Object[4];
            objArr5[i4] = str2;
            objArr5[1] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) hl.S2(ob6.G(i3, "BoostingGiveawayHowItWorksSubTextSeveral1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i3);
            Object[] objArr6 = new Object[3];
            objArr6[i] = str2;
            objArr6[1] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) hl.S2(ob6.G(i3, "BoostingGiveawayHowItWorksSubText", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        if (tL_payments_giveawayInfo.participating) {
            if (z2) {
                spannableStringBuilder.append((CharSequence) hl.S2(ob6.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayParticipantMultiPlural", str)));
            } else {
                qu6.s("BoostingGiveawayParticipant", null, 2131753394, new Object[]{str}, spannableStringBuilder);
            }
        } else {
            String str8 = tL_payments_giveawayInfo.disallowed_country;
            if (str8 != null && !str8.isEmpty()) {
                spannableStringBuilder.append((CharSequence) hl.S2(ob6.M0(2131753395, "BoostingGiveawayNotEligibleCountry")));
            } else if (tL_payments_giveawayInfo.admin_disallowed_chat_id != 0) {
                TLRPC.Chat M02 = uc7.s1(yac.t0).M0(Long.valueOf(tL_payments_giveawayInfo.admin_disallowed_chat_id));
                if (M02 != null) {
                    str4 = M02.title;
                } else {
                    str4 = "";
                }
                if (z) {
                    i2 = 2131753397;
                } else {
                    i2 = 2131753396;
                }
                qu6.s(null, null, i2, new Object[]{str4}, spannableStringBuilder);
            } else if (tL_payments_giveawayInfo.joined_too_early_date != 0) {
                qu6.s("BoostingGiveawayNotEligible", null, 2131753398, new Object[]{ob6.D0().t0().format(new Date(tL_payments_giveawayInfo.joined_too_early_date * 1000))}, spannableStringBuilder);
            } else if (z2) {
                spannableStringBuilder.append((CharSequence) hl.S2(ob6.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayTakePartMultiPlural", str, str2)));
            } else {
                qu6.s("BoostingGiveawayTakePart", null, 2131753359, new Object[]{str, str2}, spannableStringBuilder);
            }
        }
        idVar.U = spannableStringBuilder;
        alertDialog$Builder.j(ob6.M0(2131747558, "OK"), new vr9((byte) 16));
        a(alertDialog$Builder.o(), false);
    }

    public static void e(boolean z, String str, TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Activity activity, vnb vnbVar) {
        boolean z2;
        boolean z3;
        String str2;
        int i;
        int i2;
        String str3;
        String M0;
        String str4;
        if (tL_messageMediaGiveaway.until_date == 0) {
            tL_messageMediaGiveaway.until_date = tL_payments_giveawayInfoResults.finish_date;
        }
        int i3 = tL_messageMediaGiveaway.quantity;
        String G = ob6.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = ob6.D0().s0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = ob6.D0().o0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        String format3 = ob6.D0().t0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        if (tL_messageMediaGiveaway.channels.size() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((tL_messageMediaGiveaway.flags & 32) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
        String M02 = ob6.M0(2131753471, "BoostingGiveawayEnd");
        id idVar = alertDialog$Builder.a;
        idVar.S = M02;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z3) {
            if (z) {
                str4 = "BoostingStarsGiveawayHowItWorksTextEnd";
            } else {
                str4 = "BoostingStarsGiveawayHowItWorksTextEndGroup";
            }
            str2 = format;
            i2 = 2;
            i = 1;
            spannableStringBuilder.append((CharSequence) hl.S2(ob6.K(str4, (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            str2 = format;
            i = 1;
            i2 = 2;
            if (z) {
                str3 = "BoostingGiveawayHowItWorksTextEnd";
            } else {
                str3 = "BoostingGiveawayHowItWorksTextEndGroup";
            }
            spannableStringBuilder.append((CharSequence) hl.S2(ob6.G(i3, str3, str, Integer.valueOf(i3), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str5 = tL_messageMediaGiveaway.prize_description;
        if (str5 != null && !str5.isEmpty()) {
            String str6 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[i2];
            objArr[0] = str;
            objArr[i] = str6;
            spannableStringBuilder.append((CharSequence) hl.S2(ob6.G(i3, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z2) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = format2;
                objArr2[i] = format3;
                String G2 = ob6.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i3);
                Object[] objArr3 = new Object[4];
                objArr3[0] = str2;
                objArr3[i] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) hl.S2(ob6.G(i3, "BoostingGiveawayHowItWorksSubTextDateSeveralEnd1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i3);
                Object[] objArr4 = new Object[5];
                objArr4[0] = str2;
                objArr4[i] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) hl.S2(ob6.G(i3, "BoostingGiveawayHowItWorksSubTextDateEnd", objArr4)));
            }
        } else if (z2) {
            String G3 = ob6.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[0]);
            Integer valueOf3 = Integer.valueOf(i3);
            Object[] objArr5 = new Object[4];
            objArr5[0] = str2;
            objArr5[i] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) hl.S2(ob6.G(i3, "BoostingGiveawayHowItWorksSubTextSeveralEnd1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i3);
            Object[] objArr6 = new Object[3];
            objArr6[0] = str2;
            objArr6[i] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) hl.S2(ob6.G(i3, "BoostingGiveawayHowItWorksSubTextEnd", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) " ");
        int i4 = tL_payments_giveawayInfoResults.activated_count;
        if (i4 > 0) {
            spannableStringBuilder.append((CharSequence) hl.S2(ob6.G(i4, "BoostingGiveawayUsedLinksPlural", new Object[0])));
        }
        if (tL_payments_giveawayInfoResults.refunded) {
            String M03 = ob6.M0(2131753476, "BoostingGiveawayCanceledByPayment");
            TextView textView = new TextView(activity);
            textView.setTextSize(i, 14.0f);
            textView.setTypeface(hl.o());
            textView.setGravity(17);
            textView.setText(M03);
            int i5 = aob.p7;
            yob.X(textView, i5, vnbVar);
            ShapeDrawable c0 = aob.c0(hl.L(10.0f), hl.L(10.0f), aob.p1(0.1f, aob.v0(i5, vnbVar)));
            uob K = yob.K(0.1f, i5);
            textView.setBackground(c0);
            yob.j(textView, c0, K, null, vnbVar);
            textView.setPadding(hl.L(12.0f), hl.L(12.0f), hl.L(12.0f), hl.L(12.0f));
            idVar.c = textView;
            idVar.U = spannableStringBuilder;
            alertDialog$Builder.j(ob6.M0(2131752006, "Close"), new vr9((byte) 16));
            a(alertDialog$Builder.o(), true);
            return;
        }
        idVar.U = spannableStringBuilder;
        if (tL_payments_giveawayInfoResults.winner) {
            M0 = ob6.M0(2131753350, null);
            if ((tL_payments_giveawayInfoResults.flags & 16) == 0) {
                alertDialog$Builder.j(ob6.M0(2131753352, "BoostingGiveawayViewPrize"), new tg0(tL_payments_giveawayInfoResults, (byte) 6));
            }
            alertDialog$Builder.g(ob6.M0(2131752006, "Close"), new vr9((byte) 16));
        } else {
            M0 = ob6.M0(2131753351, "BoostingGiveawayYouNotWon");
            alertDialog$Builder.j(ob6.M0(2131752006, "Close"), new vr9((byte) 16));
        }
        uu3 uu3Var = new uu3(activity);
        jn7.i(uu3Var);
        yob.X(uu3Var, aob.j5, vnbVar);
        uu3Var.setTextSize(1, 14.0f);
        uu3Var.setGravity(17);
        uu3Var.setText(M0);
        int L = hl.L(8.0f);
        int L2 = hl.L(8.0f);
        int i6 = aob.pi;
        ShapeDrawable c02 = aob.c0(L, L2, aob.v0(i6, vnbVar));
        uob M = yob.M(i6);
        uu3Var.setBackground(c02);
        yob.j(uu3Var, c02, M, null, vnbVar);
        uu3Var.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(9.0f));
        idVar.d = uu3Var;
        a(alertDialog$Builder.o(), false);
    }

    public static void f(e eVar, TLRPC.Chat chat, boolean z) {
        if (eVar == null) {
            return;
        }
        hl.d3(new lg(d31.b0(eVar), z, chat, eVar.getResourceProvider()), 300L);
    }

    public static void g(int i) {
        String str;
        e Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (i < 60) {
            str = ob6.G(i, "Seconds", new Object[0]);
        } else if (i < 3600) {
            str = ob6.G(i / 60, "Minutes", new Object[0]);
        } else {
            int i2 = (i / 60) / 60;
            if (i2 > 2) {
                str = ob6.G(i2, "Hours", new Object[0]);
            } else {
                str = ob6.G(i2, "Hours", new Object[0]) + " " + ob6.G(i % 60, "Minutes", new Object[0]);
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getResourceProvider(), Q.getContext());
        String M0 = ob6.M0(2131752546, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = hl.S2(ob6.a0("CantBoostTooOftenDescription", null, 2131752545, str));
        alertDialog$Builder.j(ob6.M0(2131747558, null), new rm0((byte) 2));
        alertDialog$Builder.o();
    }

    public static void h(long j) {
        SpannableStringBuilder S2;
        if (j == yac.h(yac.t0).n) {
            S2 = hl.S2(ob6.M0(2131753491, null));
        } else {
            boolean y = wf3.y(j);
            int i = yac.t0;
            if (y) {
                S2 = hl.S2(ob6.a0("BoostingGiftLinkForwardedTo", null, 2131753492, uc7.s1(i).M0(Long.valueOf(-j)).title));
            } else {
                S2 = hl.S2(ob6.a0("BoostingGiftLinkForwardedTo", null, 2131753492, lbc.k(uc7.s1(i).X1(Long.valueOf(j)), true)));
            }
        }
        hl.d3(new om0(S2, (byte) 0), 450L);
    }

    public static void i(long j, nx0 nx0Var) {
        TLRPC.Chat M0 = uc7.s1(yac.t0).M0(Long.valueOf(-j));
        e Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getResourceProvider(), Q.getContext());
        String M02 = ob6.M0(2131753331, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M02;
        idVar.U = hl.S2(ob6.G(on0.b(), "BoostingGetMoreBoostByGiftingCount", M0.title));
        alertDialog$Builder.g(ob6.M0(2131749469, "GiftPremium"), new tm0(nx0Var));
        alertDialog$Builder.j(ob6.M0(2131752006, "Close"), new vr9((byte) 16));
        alertDialog$Builder.o();
    }

    public static void j(Context context, TLRPC.TL_error tL_error) {
        String str;
        if (tL_error != null && (str = tL_error.text) != null && !TextUtils.isEmpty(str)) {
            Toast.makeText(context, tL_error.text, 1).show();
        }
    }
}
