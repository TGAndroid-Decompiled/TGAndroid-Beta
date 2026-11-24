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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public abstract class ym0 {
    public static void a(hd hdVar, boolean z) {
        wla wlaVar = hdVar.f;
        if (wlaVar != null) {
            wlaVar.setTextSize(1, 20.0f);
        }
        bu3 bu3Var = hdVar.n;
        if (bu3Var != null) {
            bu3Var.setTextSize(1, 14.0f);
        }
        bu3 bu3Var2 = hdVar.n;
        if (bu3Var2 != null) {
            bu3Var2.setLineSpacing(gl.L(2.5f), 1.0f);
        }
        if (!z) {
            ((ViewGroup.MarginLayoutParams) hdVar.u0.getLayoutParams()).topMargin = gl.L(-14.0f);
        }
    }

    public static String b(k27 k27Var) {
        if (k27Var == null) {
            return "";
        }
        String Y0 = k27Var.Y0();
        if (Y0 == null) {
            TLRPC.Chat K0 = na7.q1(y6c.t0).K0(Long.valueOf(-k27.B1(k27Var.k.peer_id)));
            if (K0 == null) {
                return "";
            }
            return K0.title;
        }
        return Y0;
    }

    public static void c(TLRPC.TL_error tL_error, FrameLayout frameLayout, wjb wjbVar, Runnable runnable) {
        String str;
        if (tL_error != null && (str = tL_error.text) != null) {
            if (str.contains("PREMIUM_SUB_ACTIVE_UNTIL_")) {
                String format = k96.D0().n0().format(new Date(Long.parseLong(tL_error.text.replace("PREMIUM_SUB_ACTIVE_UNTIL_", "")) * 1000));
                SpannableStringBuilder N2 = gl.N2(k96.M0(2131749505, "GiftPremiumActivateErrorText"), bkb.wj, 0, runnable, null);
                u21 u21Var = new u21(frameLayout, wjbVar);
                String M0 = k96.M0(2131749504, null);
                u21Var.I(2131623982, M0, gl.G2(N2, gl.S2("**" + format + "**"), "%1$s")).j();
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

    public static void d(boolean z, String str, TLRPC.TL_payments_giveawayInfo tL_payments_giveawayInfo, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Activity activity, wjb wjbVar) {
        boolean z2;
        boolean z3;
        int i;
        String str2;
        String str3;
        String str4;
        int i2;
        String str5;
        int i3 = tL_messageMediaGiveaway.quantity;
        String G = k96.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = k96.D0().s0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = k96.D0().o0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        String format3 = k96.D0().t0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, activity);
        String M0 = k96.M0(2131753491, "BoostingGiveAwayAbout");
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z3) {
            if (z) {
                str5 = "BoostingStarsGiveawayHowItWorksText";
            } else {
                str5 = "BoostingStarsGiveawayHowItWorksTextGroup";
            }
            str2 = format;
            i = 0;
            spannableStringBuilder.append((CharSequence) gl.S2(k96.K(str5, (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            i = 0;
            str2 = format;
            if (z) {
                str3 = "BoostingGiveawayHowItWorksText";
            } else {
                str3 = "BoostingGiveawayHowItWorksTextGroup";
            }
            spannableStringBuilder.append((CharSequence) gl.S2(k96.G(i3, str3, str, Integer.valueOf(i3), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str6 = tL_messageMediaGiveaway.prize_description;
        if (str6 != null && !str6.isEmpty()) {
            String str7 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[2];
            objArr[i] = str;
            objArr[1] = str7;
            spannableStringBuilder.append((CharSequence) gl.S2(k96.G(i3, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z2) {
                Object[] objArr2 = new Object[2];
                objArr2[i] = format2;
                objArr2[1] = format3;
                String G2 = k96.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i3);
                Object[] objArr3 = new Object[4];
                objArr3[i] = str2;
                objArr3[1] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) gl.S2(k96.G(i3, "BoostingGiveawayHowItWorksSubTextDateSeveral1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i3);
                Object[] objArr4 = new Object[5];
                objArr4[i] = str2;
                objArr4[1] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) gl.S2(k96.G(i3, "BoostingGiveawayHowItWorksSubTextDate", objArr4)));
            }
        } else if (z2) {
            int i4 = i;
            String G3 = k96.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[i4]);
            Integer valueOf3 = Integer.valueOf(i3);
            Object[] objArr5 = new Object[4];
            objArr5[i4] = str2;
            objArr5[1] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) gl.S2(k96.G(i3, "BoostingGiveawayHowItWorksSubTextSeveral1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i3);
            Object[] objArr6 = new Object[3];
            objArr6[i] = str2;
            objArr6[1] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) gl.S2(k96.G(i3, "BoostingGiveawayHowItWorksSubText", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        if (tL_payments_giveawayInfo.participating) {
            if (z2) {
                spannableStringBuilder.append((CharSequence) gl.S2(k96.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayParticipantMultiPlural", str)));
            } else {
                ls6.s("BoostingGiveawayParticipant", null, 2131753398, new Object[]{str}, spannableStringBuilder);
            }
        } else {
            String str8 = tL_payments_giveawayInfo.disallowed_country;
            if (str8 != null && !str8.isEmpty()) {
                spannableStringBuilder.append((CharSequence) gl.S2(k96.M0(2131753399, "BoostingGiveawayNotEligibleCountry")));
            } else if (tL_payments_giveawayInfo.admin_disallowed_chat_id != 0) {
                TLRPC.Chat K0 = na7.q1(y6c.t0).K0(Long.valueOf(tL_payments_giveawayInfo.admin_disallowed_chat_id));
                if (K0 != null) {
                    str4 = K0.title;
                } else {
                    str4 = "";
                }
                if (z) {
                    i2 = 2131753401;
                } else {
                    i2 = 2131753400;
                }
                ls6.s(null, null, i2, new Object[]{str4}, spannableStringBuilder);
            } else if (tL_payments_giveawayInfo.joined_too_early_date != 0) {
                ls6.s("BoostingGiveawayNotEligible", null, 2131753402, new Object[]{k96.D0().t0().format(new Date(tL_payments_giveawayInfo.joined_too_early_date * 1000))}, spannableStringBuilder);
            } else if (z2) {
                spannableStringBuilder.append((CharSequence) gl.S2(k96.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayTakePartMultiPlural", str, str2)));
            } else {
                ls6.s("BoostingGiveawayTakePart", null, 2131753363, new Object[]{str, str2}, spannableStringBuilder);
            }
        }
        hdVar.U = spannableStringBuilder;
        alertDialog$Builder.j(k96.M0(2131747638, "OK"), new ho9((byte) 13));
        a(alertDialog$Builder.o(), false);
    }

    public static void e(boolean z, String str, TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Activity activity, wjb wjbVar) {
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
        String G = k96.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = k96.D0().s0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = k96.D0().o0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        String format3 = k96.D0().t0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, activity);
        String M02 = k96.M0(2131753475, "BoostingGiveawayEnd");
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M02;
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
            spannableStringBuilder.append((CharSequence) gl.S2(k96.K(str4, (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            str2 = format;
            i = 1;
            i2 = 2;
            if (z) {
                str3 = "BoostingGiveawayHowItWorksTextEnd";
            } else {
                str3 = "BoostingGiveawayHowItWorksTextEndGroup";
            }
            spannableStringBuilder.append((CharSequence) gl.S2(k96.G(i3, str3, str, Integer.valueOf(i3), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str5 = tL_messageMediaGiveaway.prize_description;
        if (str5 != null && !str5.isEmpty()) {
            String str6 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[i2];
            objArr[0] = str;
            objArr[i] = str6;
            spannableStringBuilder.append((CharSequence) gl.S2(k96.G(i3, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z2) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = format2;
                objArr2[i] = format3;
                String G2 = k96.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i3);
                Object[] objArr3 = new Object[4];
                objArr3[0] = str2;
                objArr3[i] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) gl.S2(k96.G(i3, "BoostingGiveawayHowItWorksSubTextDateSeveralEnd1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i3);
                Object[] objArr4 = new Object[5];
                objArr4[0] = str2;
                objArr4[i] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) gl.S2(k96.G(i3, "BoostingGiveawayHowItWorksSubTextDateEnd", objArr4)));
            }
        } else if (z2) {
            String G3 = k96.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[0]);
            Integer valueOf3 = Integer.valueOf(i3);
            Object[] objArr5 = new Object[4];
            objArr5[0] = str2;
            objArr5[i] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) gl.S2(k96.G(i3, "BoostingGiveawayHowItWorksSubTextSeveralEnd1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i3);
            Object[] objArr6 = new Object[3];
            objArr6[0] = str2;
            objArr6[i] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) gl.S2(k96.G(i3, "BoostingGiveawayHowItWorksSubTextEnd", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) " ");
        int i4 = tL_payments_giveawayInfoResults.activated_count;
        if (i4 > 0) {
            spannableStringBuilder.append((CharSequence) gl.S2(k96.G(i4, "BoostingGiveawayUsedLinksPlural", new Object[0])));
        }
        if (tL_payments_giveawayInfoResults.refunded) {
            String M03 = k96.M0(2131753480, "BoostingGiveawayCanceledByPayment");
            TextView textView = new TextView(activity);
            textView.setTextSize(i, 14.0f);
            textView.setTypeface(gl.o());
            textView.setGravity(17);
            textView.setText(M03);
            int i5 = bkb.o7;
            zkb.X(textView, i5, wjbVar);
            ShapeDrawable c0 = bkb.c0(gl.L(10.0f), gl.L(10.0f), bkb.p1(0.1f, bkb.v0(i5, wjbVar)));
            vkb K = zkb.K(0.1f, i5);
            textView.setBackground(c0);
            zkb.j(textView, c0, K, null, wjbVar);
            textView.setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), gl.L(12.0f));
            hdVar.c = textView;
            hdVar.U = spannableStringBuilder;
            alertDialog$Builder.j(k96.M0(2131752029, "Close"), new ho9((byte) 13));
            a(alertDialog$Builder.o(), true);
            return;
        }
        hdVar.U = spannableStringBuilder;
        if (tL_payments_giveawayInfoResults.winner) {
            M0 = k96.M0(2131753354, null);
            if ((tL_payments_giveawayInfoResults.flags & 16) == 0) {
                alertDialog$Builder.j(k96.M0(2131753356, "BoostingGiveawayViewPrize"), new sg0(tL_payments_giveawayInfoResults, (byte) 4));
            }
            alertDialog$Builder.g(k96.M0(2131752029, "Close"), new ho9((byte) 13));
        } else {
            M0 = k96.M0(2131753355, "BoostingGiveawayYouNotWon");
            alertDialog$Builder.j(k96.M0(2131752029, "Close"), new ho9((byte) 13));
        }
        bu3 bu3Var = new bu3(activity);
        kk7.i(bu3Var);
        zkb.X(bu3Var, bkb.i5, wjbVar);
        bu3Var.setTextSize(1, 14.0f);
        bu3Var.setGravity(17);
        bu3Var.setText(M0);
        int L = gl.L(8.0f);
        int L2 = gl.L(8.0f);
        int i6 = bkb.oi;
        ShapeDrawable c02 = bkb.c0(L, L2, bkb.v0(i6, wjbVar));
        vkb M = zkb.M(i6);
        bu3Var.setBackground(c02);
        zkb.j(bu3Var, c02, M, null, wjbVar);
        bu3Var.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(9.0f));
        hdVar.d = bu3Var;
        a(alertDialog$Builder.o(), false);
    }

    public static void f(d dVar, TLRPC.Chat chat, boolean z) {
        if (dVar == null) {
            return;
        }
        gl.d3(new rg(u21.b0(dVar), z, chat, dVar.getResourceProvider()), 300L);
    }

    public static void g(int i) {
        String str;
        d Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (i < 60) {
            str = k96.G(i, "Seconds", new Object[0]);
        } else if (i < 3600) {
            str = k96.G(i / 60, "Minutes", new Object[0]);
        } else {
            int i2 = (i / 60) / 60;
            if (i2 > 2) {
                str = k96.G(i2, "Hours", new Object[0]);
            } else {
                str = k96.G(i2, "Hours", new Object[0]) + " " + k96.G(i % 60, "Minutes", new Object[0]);
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getResourceProvider(), Q.getContext());
        String M0 = k96.M0(2131752553, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = gl.S2(k96.a0("CantBoostTooOftenDescription", null, 2131752552, str));
        alertDialog$Builder.j(k96.M0(2131747638, null), new qm0((byte) 1));
        alertDialog$Builder.o();
    }

    public static void h(long j) {
        SpannableStringBuilder S2;
        if (j == y6c.h(y6c.t0).n) {
            S2 = gl.S2(k96.M0(2131753495, null));
        } else {
            boolean y = cf3.y(j);
            int i = y6c.t0;
            if (y) {
                S2 = gl.S2(k96.a0("BoostingGiftLinkForwardedTo", null, 2131753496, na7.q1(i).K0(Long.valueOf(-j)).title));
            } else {
                S2 = gl.S2(k96.a0("BoostingGiftLinkForwardedTo", null, 2131753496, l7c.k(na7.q1(i).V1(Long.valueOf(j)), true)));
            }
        }
        gl.d3(new rm0(S2, (byte) 0), 450L);
    }

    public static void i(long j, fx0 fx0Var) {
        TLRPC.Chat K0 = na7.q1(y6c.t0).K0(Long.valueOf(-j));
        d Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getResourceProvider(), Q.getContext());
        String M0 = k96.M0(2131753335, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = gl.S2(k96.G(on0.b(), "BoostingGetMoreBoostByGiftingCount", K0.title));
        alertDialog$Builder.g(k96.M0(2131749508, "GiftPremium"), new nm0(fx0Var));
        alertDialog$Builder.j(k96.M0(2131752029, "Close"), new ho9((byte) 13));
        alertDialog$Builder.o();
    }

    public static void j(Context context, TLRPC.TL_error tL_error) {
        String str;
        if (tL_error != null && (str = tL_error.text) != null && !TextUtils.isEmpty(str)) {
            Toast.makeText(context, tL_error.text, 1).show();
        }
    }
}
