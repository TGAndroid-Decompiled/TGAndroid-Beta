package ii;

import ai.f6;
import ai.j5;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import ei.h9;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.l00;
public final class q3 extends l00 implements cs {
    public final long S;
    public FrameLayout T;
    public wg.m U;
    public sm V;
    public f6 W;

    public q3(long j10) {
        this.S = j10;
        this.N = true;
        this.M = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(q3 q3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, q3Var.resourceProvider);
        String M0 = bd.M0(2131749015, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749014, l10.p(user)));
        alertDialog$Builder.k(bd.M0(2131749013, null), new ai.n(19, q3Var, connectedbotstarref));
        alertDialog$Builder.h(bd.M0(2131752589, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void B0(q3 q3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, q3Var.getParentActivity(), null);
        s1Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = hp.s1(q3Var.currentAccount).j1(q3Var.S);
        editconnectedstarrefbot.revoked = true;
        q3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new ai.f3(19, q3Var, s1Var));
    }

    public static void C0(q3 q3Var, Context context, int i3) {
        f6 f6Var = q3Var.W;
        if (f6Var != null) {
            Object obj = f6Var.G(i3).G;
            if (obj instanceof TL_payments.starRefProgram) {
                J0(context, q3Var.currentAccount, (TL_payments.starRefProgram) obj, q3Var.S, q3Var.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                K0(context, q3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, q3Var.S, q3Var.resourceProvider);
            }
        }
    }

    public static void D0(q3 q3Var, TLObject tLObject, org.telegram.ui.ActionBar.s1 s1Var) {
        long j10 = q3Var.S;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            ci.f0 d = ci.i0.g(q3Var.currentAccount).d(j10);
            ArrayList arrayList = d.f5063e;
            int i3 = d.f5060a;
            hp.s1(i3).Y3(connectedstarrefbots.users, false);
            for (int i10 = 0; i10 < connectedstarrefbots.connected_bots.size(); i10++) {
                TL_payments.connectedBotStarRef connectedbotstarref = connectedstarrefbots.connected_bots.get(i10);
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (((TL_payments.connectedBotStarRef) arrayList.get(i11)).bot_id == connectedbotstarref.bot_id) {
                        if (connectedbotstarref.revoked) {
                            arrayList.remove(i11);
                            d.f5062c = Math.max(d.f5062c - 1, 0);
                        } else {
                            arrayList.set(i11, connectedbotstarref);
                        }
                    } else {
                        i11++;
                    }
                }
            }
            hs.f(i3).k(hs.L3, Long.valueOf(d.f5061b));
            d.a();
            ci.g0 e10 = ci.i0.g(q3Var.currentAccount).e(j10);
            e10.f5150c = 0;
            e10.d = false;
            e10.f5154i = false;
            e10.f5152f = 0L;
            e10.f5155j = null;
            e10.h = false;
            e10.a();
            q3Var.W.O(true);
        }
        s1Var.dismiss();
    }

    public static boolean E0(q3 q3Var, Context context, View view, int i3) {
        f6 f6Var = q3Var.W;
        if (f6Var != null) {
            Object obj = f6Var.G(i3).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User a22 = hp.s1(q3Var.currentAccount).a2(Long.valueOf(connectedbotstarref.bot_id));
                f60 H = f60.H(q3Var, view);
                H.l(2131232072, bd.M0(2131746716, null), new e(4, q3Var, a22), a22.bot_has_main_app);
                H.l(2131232072, bd.M0(2131752912, null), new e(5, q3Var, connectedbotstarref), !a22.bot_has_main_app);
                H.c(2131232204, bd.M0(2131751762, null), new h9(q3Var, connectedbotstarref, a22, 16), false);
                H.m(2131232195, new ai.z3(q3Var, context, a22, connectedbotstarref, 20), bd.M0(2131749013, null), !connectedbotstarref.revoked, true);
                H.V(5);
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static int F0(q3 q3Var) {
        return q3Var.currentAccount;
    }

    public static int G0(q3 q3Var) {
        return q3Var.currentAccount;
    }

    public static void J0(android.content.Context r34, int r35, final org.telegram.tgnet.tl.TL_payments.starRefProgram r36, long r37, org.telegram.ui.ActionBar.e6 r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: ii.q3.J0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, org.telegram.ui.ActionBar.e6, boolean):void");
    }

    public static org.telegram.ui.ActionBar.t2 K0(Context context, int i3, TL_payments.connectedBotStarRef connectedbotstarref, long j10, e6 e6Var) {
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        ImageView.ScaleType scaleType;
        int i13;
        LinearLayout linearLayout;
        int i14;
        org.telegram.ui.ActionBar.t2 t2Var;
        char c2;
        String G;
        char c10;
        String G2;
        int i15;
        LinearLayout linearLayout2;
        String str;
        String G3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        String str2;
        int i16;
        int i17;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.t2 l10 = k5.l(1, context, e6Var, false);
        TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout f12 = k5.f(context, 1);
        f12.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        f12.setClipChildren(false);
        f12.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        int L = org.telegram.messenger.g0.L(40.0f);
        if (connectedbotstarref.revoked) {
            i10 = k6.kk;
        } else {
            i10 = k6.Ci;
        }
        Drawable L2 = k6.L(L, k6.w0(i10, e6Var));
        if (connectedbotstarref.revoked) {
            i11 = k6.kk;
        } else {
            i11 = k6.Ci;
        }
        n6 N = r6.N(i11);
        view.setBackground(L2);
        r6.k(view, L2, N, null, e6Var);
        frameLayout.addView(view, mf.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        if (connectedbotstarref.revoked) {
            i12 = 2131232206;
        } else {
            i12 = 2131232200;
        }
        imageView.setImageResource(i12);
        if (connectedbotstarref.revoked) {
            f10 = 2.0f;
        } else {
            f10 = 1.8f;
        }
        imageView.setScaleX(f10);
        if (connectedbotstarref.revoked) {
            f11 = 2.0f;
        } else {
            f11 = 1.8f;
        }
        imageView.setScaleY(f11);
        frameLayout.addView(imageView, mf.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int L3 = org.telegram.messenger.g0.L(50.0f);
            int i18 = k6.f27954h5;
            Drawable d02 = k6.d0(L3, k6.w0(i18, e6Var));
            n6 N2 = r6.N(i18);
            frameLayout2.setBackground(d02);
            r6.k(frameLayout2, d02, N2, null, e6Var);
            frameLayout.addView(frameLayout2, mf.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 12.0f);
            int L4 = org.telegram.messenger.g0.L(9.5f);
            if (connectedbotstarref.revoked) {
                i16 = k6.kk;
            } else {
                i16 = k6.ik;
            }
            Drawable d03 = k6.d0(L4, k6.w0(i16, e6Var));
            if (connectedbotstarref.revoked) {
                i17 = k6.kk;
            } else {
                i17 = k6.ik;
            }
            n6 N3 = r6.N(i17);
            textView.setBackground(d03);
            r6.k(textView, d03, N3, null, e6Var);
            textView.setTextColor(-1);
            textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            wp wpVar = new wp(2131231970, 0);
            wpVar.I = 0.937f;
            wpVar.J = 0.937f;
            wpVar.f40045r = -org.telegram.messenger.g0.L(1.33f);
            wpVar.f40046s = org.telegram.messenger.g0.L(1.0f);
            wpVar.H = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, mf.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        f12.addView(frameLayout, mf.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i19 = k6.G6;
        r6.V(textView2, i19, e6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(bd.M0(2131752482, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        f12.addView(textView2, mf.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L5 = org.telegram.messenger.g0.L(28.0f);
        int i20 = k6.f27824a7;
        ShapeDrawable d04 = k6.d0(L5, k6.w0(i20, e6Var));
        n6 N4 = r6.N(i20);
        linearLayout3.setBackground(d04);
        r6.k(linearLayout3, d04, N4, null, e6Var);
        k9 k9Var = new k9(context);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        u8 u8Var = new u8((e6) null);
        linearLayout3.addView(k9Var, mf.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        r6.V(textView3, i19, e6Var);
        textView3.setText(m5.l(i3, connectedbotstarref.bot_id));
        u8Var.r(a22);
        k9Var.e(a22, u8Var);
        linearLayout3.addView(textView3, mf.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i21 = k6.r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView2, i21, e6Var, mode);
        imageView2.setImageResource(2131232695);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, mf.t(-2, -2, 16, 5, 0, 8, 0));
        f12.addView(linearLayout3, mf.t(-2, 28, 1, 4, 0, 4, 0));
        pf.a(linearLayout3);
        TextView textView4 = new TextView(context);
        r6.V(textView4, i19, e6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            i13 = 2;
            textView4.setText(org.telegram.messenger.g0.X2(bd.M0(2131752484, null)));
            i14 = i21;
            t2Var = l10;
            linearLayout = linearLayout3;
        } else {
            i13 = 2;
            linearLayout = linearLayout3;
            if (j10 < 0) {
                String J0 = k.J0(connectedbotstarref.commission_permille);
                String p10 = l10.p(a22);
                int i22 = connectedbotstarref.duration_months;
                i14 = i21;
                t2Var = l10;
                if (i22 <= 0) {
                    G2 = bd.M0(2131752501, null);
                    c10 = 0;
                } else if (i22 < 12 || i22 % 12 != 0) {
                    c10 = 0;
                    G2 = bd.G(i22, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c10 = 0;
                    G2 = bd.G(i22 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr = new Object[3];
                objArr[c10] = J0;
                objArr[1] = p10;
                objArr[2] = G2;
                k5.r(null, null, 2131752485, objArr, textView4);
            } else {
                i14 = i21;
                t2Var = l10;
                String J02 = k.J0(connectedbotstarref.commission_permille);
                String p11 = l10.p(a22);
                int i23 = connectedbotstarref.duration_months;
                if (i23 <= 0) {
                    G = bd.M0(2131752501, null);
                    c2 = 0;
                } else if (i23 < 12 || i23 % 12 != 0) {
                    c2 = 0;
                    G = bd.G(i23, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c2 = 0;
                    G = bd.G(i23 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr2 = new Object[3];
                objArr2[c2] = J02;
                objArr2[1] = p11;
                objArr2[2] = G;
                k5.r(null, null, 2131752483, objArr2, textView4);
            }
        }
        f12.addView(textView4, mf.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (!connectedbotstarref.revoked) {
            TextView textView5 = new TextView(context);
            r6.V(textView5, i19, e6Var);
            textView5.setTextSize(1, 14.0f);
            k5.m(textView5, 17, null, 2131752486);
            f12.addView(textView5, mf.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            ShapeDrawable d05 = k6.d0(org.telegram.messenger.g0.L(28.0f), k6.w0(i20, e6Var));
            n6 N5 = r6.N(i20);
            linearLayout4.setBackground(d05);
            r6.k(linearLayout4, d05, N5, null, e6Var);
            k9 k9Var2 = new k9(context);
            k9Var2.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
            u8 u8Var2 = new u8((e6) null);
            linearLayout4.addView(k9Var2, mf.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            r6.V(textView6, i19, e6Var);
            if (j10 >= 0) {
                TLRPC.User a23 = hp.s1(i3).a2(Long.valueOf(j10));
                u8Var2.r(a23);
                k9Var2.e(a23, u8Var2);
                textView6.setText(l10.p(a23));
                i15 = i20;
            } else {
                i15 = i20;
                TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
                u8Var2.q(M0);
                k9Var2.e(M0, u8Var2);
                if (M0 == null) {
                    str2 = "";
                } else {
                    str2 = M0.title;
                }
                textView6.setText(str2);
            }
            linearLayout4.addView(textView6, mf.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            r6.t(imageView3, i14, e6Var, mode);
            imageView3.setImageResource(2131230873);
            linearLayout4.addView(imageView3, mf.t(-2, -2, 16, 2, 0, 5, 0));
            f12.addView(linearLayout4, mf.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        } else {
            i15 = i20;
            linearLayout2 = null;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        r6.V(textView7, i19, e6Var);
        int L6 = org.telegram.messenger.g0.L(8.0f);
        int i24 = i15;
        int w02 = k6.w0(i24, e6Var);
        int w03 = k6.w0(i24, e6Var);
        int i25 = k6.f27972i6;
        int w10 = k6.w(w03, k6.w0(i25, e6Var));
        org.telegram.ui.Cells.y k02 = k6.k0(L6, L6, L6, L6, w02, w10, w10);
        n6 N6 = r6.N(i24);
        n6 q10 = r6.q(i24, i25);
        textView7.setBackground(k02);
        r6.k(textView7, k02, N6, q10, e6Var);
        textView7.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f));
        String str3 = connectedbotstarref.url;
        if (str3 != null && str3.startsWith("https://")) {
            str = connectedbotstarref.url.substring(8);
        } else {
            str = connectedbotstarref.url;
        }
        textView7.setText(str);
        f12.addView(textView7, mf.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        gi.d dVar = new gi.d(context, e6Var, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new wp(2131232104, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) bd.M0(2131752492, null));
            dVar.i(spannableStringBuilder2, false, true);
        } else {
            dVar.i(bd.M0(2131752487, null), false, true);
        }
        f12.addView(dVar, mf.o(-1, 48));
        s70 s70Var = new s70(context, e6Var);
        long j11 = connectedbotstarref.participants;
        if (j11 <= 0) {
            G3 = bd.a0(null, null, 2131752490, l10.p(a22));
        } else {
            G3 = bd.G((int) j11, "ChannelAffiliateProgramLinkOpened", l10.p(a22));
        }
        s70Var.setText(G3);
        s70Var.setGravity(17);
        s70Var.setTextSize(1, 12.0f);
        r6.V(s70Var, k6.B6, e6Var);
        r6.H(s70Var, k6.Uc, e6Var);
        f12.addView(s70Var, mf.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.t2 t2Var2 = t2Var;
        t2Var2.O = f12;
        ai.z3 z3Var = new ai.z3(connectedbotstarref, t2Var2, e6Var, a22, 19);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new m(z3Var, i13));
        }
        h3 h3Var = new h3(connectedbotstarref, i3, t2Var2, context, j10, e6Var, z3Var);
        org.telegram.ui.ActionBar.t2 t2Var3 = t2Var2;
        dVar.setOnClickListener(h3Var);
        t2Var3.setOnDismissListener(new gi.d1(6));
        if (linearLayout2 != null) {
            ci.i0.g(i3).n();
            ci.i0.g(i3).o();
            LinearLayout linearLayout5 = linearLayout2;
            h3 h3Var2 = new h3(i3, t2Var3, e6Var, linearLayout5, j10, context, connectedbotstarref);
            t2Var3 = t2Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(h3Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new ai.d(24, t2Var3, connectedbotstarref2));
        t2Var3.P(k6.f27954h5);
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && T != null && !org.telegram.messenger.g0.u1(T)) {
            t2Var3.a0(T);
        }
        t2Var3.show();
        return t2Var3;
    }

    public final void I0(java.util.ArrayList r17, org.telegram.ui.Components.f41 r18) {
        throw new UnsupportedOperationException("Method not decompiled: ii.q3.I0(java.util.ArrayList, org.telegram.ui.Components.f41):void");
    }

    @Override
    public final View createView(Context context) {
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        sm smVar = new sm(context, 3);
        this.V = smVar;
        r6.i(k6.f27971i5, smVar, null);
        super.createView(context);
        this.T = new FrameLayout(context);
        wg.m mVar = new wg.m(context, 1, 3);
        this.U = mVar;
        mVar.setImportantForAccessibility(4);
        wg.f fVar = this.U.f57666b;
        fVar.f57650z = k6.Tk;
        fVar.A = k6.Uk;
        fVar.b();
        this.U.setStarParticlesView(this.f47064e);
        this.T.addView(this.U, mf.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(bd.M0(2131752472, null), org.telegram.messenger.g0.X2(bd.M0(2131752473, null)), this.T, null);
        this.f47063c.setOnItemClickListener(new ei.q4(2, this, context));
        this.f47063c.setOnItemLongClickListener(new ai.n(20, this, context));
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f47063c.setItemAnimator(kVar);
        this.f47063c.setOnScrollListener(new j5(this, 18));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        f6 f6Var;
        int i11 = hs.L3;
        long j10 = this.S;
        if (i3 == i11) {
            if (((Long) objArr[0]).longValue() == j10) {
                f6 f6Var2 = this.W;
                if (f6Var2 != null) {
                    f6Var2.O(true);
                }
                ci.i0.g(this.currentAccount).d(j10).a();
            }
        } else if (i3 == hs.K3 && ((Long) objArr[0]).longValue() == j10 && (f6Var = this.W) != null) {
            f6Var.O(true);
        }
    }

    @Override
    public final u4.h0 k0() {
        f6 f6Var = new f6(this, this.f47063c, getParentActivity(), this.currentAccount, this.classGuid, new gi.q4(this, 11), getResourceProvider(), 5);
        this.W = f6Var;
        return f6Var;
    }

    @Override
    public final vg.t1 m0() {
        f fVar = new f(getParentActivity(), 1);
        fVar.c();
        return fVar;
    }

    @Override
    public final boolean onFragmentCreate() {
        hs.f(this.currentAccount).c(this, hs.L3);
        hs.f(this.currentAccount).c(this, hs.K3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        hs.f(this.currentAccount).n(this, hs.L3);
        hs.f(this.currentAccount).n(this, hs.K3);
    }

    @Override
    public final void onPause() {
        super.onPause();
        wg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        wg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }
}
