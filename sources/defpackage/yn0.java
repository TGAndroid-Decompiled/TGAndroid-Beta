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
public abstract class yn0 {
    public static void a(he heVar, boolean z) {
        xna xnaVar = heVar.f;
        if (xnaVar != null) {
            xnaVar.setTextSize(1, 20.0f);
        }
        mv3 mv3Var = heVar.n;
        if (mv3Var != null) {
            mv3Var.setTextSize(1, 14.0f);
        }
        mv3 mv3Var2 = heVar.n;
        if (mv3Var2 != null) {
            mv3Var2.setLineSpacing(gm.L(2.5f), 1.0f);
        }
        if (!z) {
            ((ViewGroup.MarginLayoutParams) heVar.u0.getLayoutParams()).topMargin = gm.L(-14.0f);
        }
    }

    public static String b(k47 k47Var) {
        if (k47Var == null) {
            return "";
        }
        String Y0 = k47Var.Y0();
        if (Y0 == null) {
            TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(-k47.B1(k47Var.k.peer_id)));
            if (L0 == null) {
                return "";
            }
            return L0.title;
        }
        return Y0;
    }

    public static void c(TLRPC.TL_error tL_error, FrameLayout frameLayout, ylb ylbVar, Runnable runnable) {
        String str;
        if (tL_error != null && (str = tL_error.text) != null) {
            if (str.contains("PREMIUM_SUB_ACTIVE_UNTIL_")) {
                String format = jb6.D0().n0().format(new Date(Long.parseLong(tL_error.text.replace("PREMIUM_SUB_ACTIVE_UNTIL_", "")) * 1000));
                SpannableStringBuilder N2 = gm.N2(jb6.M0(2131749454, "GiftPremiumActivateErrorText"), cmb.wj, 0, runnable, null);
                c41 c41Var = new c41(frameLayout, ylbVar);
                String M0 = jb6.M0(2131749453, null);
                c41Var.I(2131623982, M0, gm.G2(N2, gm.S2("**" + format + "**"), "%1$s")).j();
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

    public static void d(boolean z, String str, TLRPC.TL_payments_giveawayInfo tL_payments_giveawayInfo, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Activity activity, ylb ylbVar) {
        boolean z2;
        boolean z3;
        int i;
        String str2;
        String str3;
        String str4;
        int i2;
        String str5;
        int i3 = tL_messageMediaGiveaway.quantity;
        String G = jb6.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = jb6.D0().s0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = jb6.D0().o0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        String format3 = jb6.D0().t0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, activity);
        String M0 = jb6.M0(2131753459, "BoostingGiveAwayAbout");
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z3) {
            if (z) {
                str5 = "BoostingStarsGiveawayHowItWorksText";
            } else {
                str5 = "BoostingStarsGiveawayHowItWorksTextGroup";
            }
            str2 = format;
            i = 0;
            spannableStringBuilder.append((CharSequence) gm.S2(jb6.K(str5, (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            i = 0;
            str2 = format;
            if (z) {
                str3 = "BoostingGiveawayHowItWorksText";
            } else {
                str3 = "BoostingGiveawayHowItWorksTextGroup";
            }
            spannableStringBuilder.append((CharSequence) gm.S2(jb6.G(i3, str3, str, Integer.valueOf(i3), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str6 = tL_messageMediaGiveaway.prize_description;
        if (str6 != null && !str6.isEmpty()) {
            String str7 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[2];
            objArr[i] = str;
            objArr[1] = str7;
            spannableStringBuilder.append((CharSequence) gm.S2(jb6.G(i3, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z2) {
                Object[] objArr2 = new Object[2];
                objArr2[i] = format2;
                objArr2[1] = format3;
                String G2 = jb6.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i3);
                Object[] objArr3 = new Object[4];
                objArr3[i] = str2;
                objArr3[1] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) gm.S2(jb6.G(i3, "BoostingGiveawayHowItWorksSubTextDateSeveral1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i3);
                Object[] objArr4 = new Object[5];
                objArr4[i] = str2;
                objArr4[1] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) gm.S2(jb6.G(i3, "BoostingGiveawayHowItWorksSubTextDate", objArr4)));
            }
        } else if (z2) {
            int i4 = i;
            String G3 = jb6.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[i4]);
            Integer valueOf3 = Integer.valueOf(i3);
            Object[] objArr5 = new Object[4];
            objArr5[i4] = str2;
            objArr5[1] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) gm.S2(jb6.G(i3, "BoostingGiveawayHowItWorksSubTextSeveral1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i3);
            Object[] objArr6 = new Object[3];
            objArr6[i] = str2;
            objArr6[1] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) gm.S2(jb6.G(i3, "BoostingGiveawayHowItWorksSubText", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        if (tL_payments_giveawayInfo.participating) {
            if (z2) {
                spannableStringBuilder.append((CharSequence) gm.S2(jb6.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayParticipantMultiPlural", str)));
            } else {
                kt6.t("BoostingGiveawayParticipant", null, 2131753366, new Object[]{str}, spannableStringBuilder);
            }
        } else {
            String str8 = tL_payments_giveawayInfo.disallowed_country;
            if (str8 != null && !str8.isEmpty()) {
                spannableStringBuilder.append((CharSequence) gm.S2(jb6.M0(2131753367, "BoostingGiveawayNotEligibleCountry")));
            } else if (tL_payments_giveawayInfo.admin_disallowed_chat_id != 0) {
                TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(tL_payments_giveawayInfo.admin_disallowed_chat_id));
                if (L0 != null) {
                    str4 = L0.title;
                } else {
                    str4 = "";
                }
                if (z) {
                    i2 = 2131753369;
                } else {
                    i2 = 2131753368;
                }
                kt6.t(null, null, i2, new Object[]{str4}, spannableStringBuilder);
            } else if (tL_payments_giveawayInfo.joined_too_early_date != 0) {
                kt6.t("BoostingGiveawayNotEligible", null, 2131753370, new Object[]{jb6.D0().t0().format(new Date(tL_payments_giveawayInfo.joined_too_early_date * 1000))}, spannableStringBuilder);
            } else if (z2) {
                spannableStringBuilder.append((CharSequence) gm.S2(jb6.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayTakePartMultiPlural", str, str2)));
            } else {
                kt6.t("BoostingGiveawayTakePart", null, 2131753331, new Object[]{str, str2}, spannableStringBuilder);
            }
        }
        heVar.U = spannableStringBuilder;
        alertDialog$Builder.j(jb6.M0(2131747564, "OK"), new dq9((byte) 14));
        a(alertDialog$Builder.o(), false);
    }

    public static void e(boolean z, String str, TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Activity activity, ylb ylbVar) {
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
        String G = jb6.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = jb6.D0().s0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = jb6.D0().o0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        String format3 = jb6.D0().t0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, activity);
        String M02 = jb6.M0(2131753443, "BoostingGiveawayEnd");
        he heVar = alertDialog$Builder.a;
        heVar.S = M02;
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
            spannableStringBuilder.append((CharSequence) gm.S2(jb6.K(str4, (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            str2 = format;
            i = 1;
            i2 = 2;
            if (z) {
                str3 = "BoostingGiveawayHowItWorksTextEnd";
            } else {
                str3 = "BoostingGiveawayHowItWorksTextEndGroup";
            }
            spannableStringBuilder.append((CharSequence) gm.S2(jb6.G(i3, str3, str, Integer.valueOf(i3), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str5 = tL_messageMediaGiveaway.prize_description;
        if (str5 != null && !str5.isEmpty()) {
            String str6 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[i2];
            objArr[0] = str;
            objArr[i] = str6;
            spannableStringBuilder.append((CharSequence) gm.S2(jb6.G(i3, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z2) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = format2;
                objArr2[i] = format3;
                String G2 = jb6.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i3);
                Object[] objArr3 = new Object[4];
                objArr3[0] = str2;
                objArr3[i] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) gm.S2(jb6.G(i3, "BoostingGiveawayHowItWorksSubTextDateSeveralEnd1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i3);
                Object[] objArr4 = new Object[5];
                objArr4[0] = str2;
                objArr4[i] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) gm.S2(jb6.G(i3, "BoostingGiveawayHowItWorksSubTextDateEnd", objArr4)));
            }
        } else if (z2) {
            String G3 = jb6.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[0]);
            Integer valueOf3 = Integer.valueOf(i3);
            Object[] objArr5 = new Object[4];
            objArr5[0] = str2;
            objArr5[i] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) gm.S2(jb6.G(i3, "BoostingGiveawayHowItWorksSubTextSeveralEnd1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i3);
            Object[] objArr6 = new Object[3];
            objArr6[0] = str2;
            objArr6[i] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) gm.S2(jb6.G(i3, "BoostingGiveawayHowItWorksSubTextEnd", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) " ");
        int i4 = tL_payments_giveawayInfoResults.activated_count;
        if (i4 > 0) {
            spannableStringBuilder.append((CharSequence) gm.S2(jb6.G(i4, "BoostingGiveawayUsedLinksPlural", new Object[0])));
        }
        if (tL_payments_giveawayInfoResults.refunded) {
            String M03 = jb6.M0(2131753448, "BoostingGiveawayCanceledByPayment");
            TextView textView = new TextView(activity);
            textView.setTextSize(i, 14.0f);
            textView.setTypeface(gm.o());
            textView.setGravity(17);
            textView.setText(M03);
            int i5 = cmb.o7;
            anb.X(textView, i5, ylbVar);
            ShapeDrawable c0 = cmb.c0(gm.L(10.0f), gm.L(10.0f), cmb.p1(0.1f, cmb.v0(i5, ylbVar)));
            wmb K = anb.K(0.1f, i5);
            textView.setBackground(c0);
            anb.j(textView, c0, K, null, ylbVar);
            textView.setPadding(gm.L(12.0f), gm.L(12.0f), gm.L(12.0f), gm.L(12.0f));
            heVar.c = textView;
            heVar.U = spannableStringBuilder;
            alertDialog$Builder.j(jb6.M0(2131751978, "Close"), new dq9((byte) 14));
            a(alertDialog$Builder.o(), true);
            return;
        }
        heVar.U = spannableStringBuilder;
        if (tL_payments_giveawayInfoResults.winner) {
            M0 = jb6.M0(2131753322, null);
            if ((tL_payments_giveawayInfoResults.flags & 16) == 0) {
                alertDialog$Builder.j(jb6.M0(2131753324, "BoostingGiveawayViewPrize"), new xg0(tL_payments_giveawayInfoResults, (byte) 6));
            }
            alertDialog$Builder.g(jb6.M0(2131751978, "Close"), new dq9((byte) 14));
        } else {
            M0 = jb6.M0(2131753323, "BoostingGiveawayYouNotWon");
            alertDialog$Builder.j(jb6.M0(2131751978, "Close"), new dq9((byte) 14));
        }
        mv3 mv3Var = new mv3(activity);
        nm7.i(mv3Var);
        anb.X(mv3Var, cmb.i5, ylbVar);
        mv3Var.setTextSize(1, 14.0f);
        mv3Var.setGravity(17);
        mv3Var.setText(M0);
        int L = gm.L(8.0f);
        int L2 = gm.L(8.0f);
        int i6 = cmb.oi;
        ShapeDrawable c02 = cmb.c0(L, L2, cmb.v0(i6, ylbVar));
        wmb M = anb.M(i6);
        mv3Var.setBackground(c02);
        anb.j(mv3Var, c02, M, null, ylbVar);
        mv3Var.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(9.0f));
        heVar.d = mv3Var;
        a(alertDialog$Builder.o(), false);
    }

    public static void f(d dVar, TLRPC.Chat chat, boolean z) {
        if (dVar == null) {
            return;
        }
        gm.d3(new rh(c41.b0(dVar), z, chat, dVar.getResourceProvider()), 300L);
    }

    public static void g(int i) {
        String str;
        d Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (i < 60) {
            str = jb6.G(i, "Seconds", new Object[0]);
        } else if (i < 3600) {
            str = jb6.G(i / 60, "Minutes", new Object[0]);
        } else {
            int i2 = (i / 60) / 60;
            if (i2 > 2) {
                str = jb6.G(i2, "Hours", new Object[0]);
            } else {
                str = jb6.G(i2, "Hours", new Object[0]) + " " + jb6.G(i % 60, "Minutes", new Object[0]);
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getResourceProvider(), Q.getContext());
        String M0 = jb6.M0(2131752518, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = gm.S2(jb6.a0("CantBoostTooOftenDescription", null, 2131752517, str));
        alertDialog$Builder.j(jb6.M0(2131747564, null), new qn0((byte) 1));
        alertDialog$Builder.o();
    }

    public static void h(long j) {
        SpannableStringBuilder S2;
        if (j == z8c.h(z8c.t0).n) {
            S2 = gm.S2(jb6.M0(2131753463, null));
        } else {
            boolean y = pg3.y(j);
            int i = z8c.t0;
            if (y) {
                S2 = gm.S2(jb6.a0("BoostingGiftLinkForwardedTo", null, 2131753464, oc7.r1(i).L0(Long.valueOf(-j)).title));
            } else {
                S2 = gm.S2(jb6.a0("BoostingGiftLinkForwardedTo", null, 2131753464, m9c.k(oc7.r1(i).W1(Long.valueOf(j)), true)));
            }
        }
        gm.d3(new rn0(S2, (byte) 0), 450L);
    }

    public static void i(long j, my0 my0Var) {
        TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(-j));
        d Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getResourceProvider(), Q.getContext());
        String M0 = jb6.M0(2131753303, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = gm.S2(jb6.G(oo0.b(), "BoostingGetMoreBoostByGiftingCount", L0.title));
        alertDialog$Builder.g(jb6.M0(2131749457, "GiftPremium"), new nn0(my0Var));
        alertDialog$Builder.j(jb6.M0(2131751978, "Close"), new dq9((byte) 14));
        alertDialog$Builder.o();
    }

    public static void j(Context context, TLRPC.TL_error tL_error) {
        String str;
        if (tL_error != null && (str = tL_error.text) != null && !TextUtils.isEmpty(str)) {
            Toast.makeText(context, tL_error.text, 1).show();
        }
    }
}
