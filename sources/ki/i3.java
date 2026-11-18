package ki;

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
import bi.e8;
import c8.ma;
import c8.ra;
import fi.g4;
import hi.e7;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.y60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s00;
public final class i3 extends s00 implements fs {
    public final long S;
    public FrameLayout T;
    public vg.m U;
    public jn V;
    public e8 W;

    public i3(long j3) {
        this.S = j3;
        this.N = true;
        this.M = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(i3 i3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i3Var.resourceProvider);
        String M0 = gd.M0(2131748815, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131748814, o10.q(user)));
        alertDialog$Builder.k(gd.M0(2131748813, null), new ab.g(24, i3Var, connectedbotstarref));
        alertDialog$Builder.h(gd.M0(2131752578, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void B0(i3 i3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, i3Var.getParentActivity(), null);
        u1Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = mp.u1(i3Var.currentAccount).l1(i3Var.S);
        editconnectedstarrefbot.revoked = true;
        i3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new bi.k1(25, i3Var, u1Var));
    }

    public static void C0(i3 i3Var, Context context, int i7) {
        e8 e8Var = i3Var.W;
        if (e8Var != null) {
            Object obj = e8Var.G(i7).H;
            if (obj instanceof TL_payments.starRefProgram) {
                J0(context, i3Var.currentAccount, (TL_payments.starRefProgram) obj, i3Var.S, i3Var.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                K0(context, i3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, i3Var.S, i3Var.resourceProvider);
            }
        }
    }

    public static void D0(i3 i3Var, TLObject tLObject, org.telegram.ui.ActionBar.u1 u1Var) {
        long j3 = i3Var.S;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            di.b0 d = di.e0.g(i3Var.currentAccount).d(j3);
            ArrayList arrayList = d.f8519e;
            int i7 = d.f8516a;
            mp.u1(i7).f4(connectedstarrefbots.users, false);
            for (int i10 = 0; i10 < connectedstarrefbots.connected_bots.size(); i10++) {
                TL_payments.connectedBotStarRef connectedbotstarref = connectedstarrefbots.connected_bots.get(i10);
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (((TL_payments.connectedBotStarRef) arrayList.get(i11)).bot_id == connectedbotstarref.bot_id) {
                        if (connectedbotstarref.revoked) {
                            arrayList.remove(i11);
                            d.f8518c = Math.max(d.f8518c - 1, 0);
                        } else {
                            arrayList.set(i11, connectedbotstarref);
                        }
                    } else {
                        i11++;
                    }
                }
            }
            ks.f(i7).k(ks.N3, Long.valueOf(d.f8517b));
            d.a();
            di.c0 e10 = di.e0.g(i3Var.currentAccount).e(j3);
            e10.f8585c = 0;
            e10.d = false;
            e10.f8589i = false;
            e10.f8587f = 0L;
            e10.f8590j = null;
            e10.h = false;
            e10.a();
            i3Var.W.O(true);
        }
        u1Var.dismiss();
    }

    public static boolean E0(i3 i3Var, Context context, View view, int i7) {
        e8 e8Var = i3Var.W;
        if (e8Var != null) {
            Object obj = e8Var.G(i7).H;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User c22 = mp.u1(i3Var.currentAccount).c2(Long.valueOf(connectedbotstarref.bot_id));
                y60 I = y60.I(i3Var, view);
                I.l(2131232074, gd.M0(2131746513, null), new kg.h0(10, i3Var, c22), c22.bot_has_main_app);
                I.l(2131232074, gd.M0(2131752901, null), new kg.h0(11, i3Var, connectedbotstarref), !c22.bot_has_main_app);
                I.c(2131232206, gd.M0(2131751751, null), new kg.i0(i3Var, connectedbotstarref, c22, 7), false);
                I.m(2131232197, new ai.s(i3Var, context, c22, connectedbotstarref, 27), gd.M0(2131748813, null), !connectedbotstarref.revoked, true);
                I.W(5);
                I.a0();
                return true;
            }
        }
        return false;
    }

    public static int F0(i3 i3Var) {
        return i3Var.currentAccount;
    }

    public static int G0(i3 i3Var) {
        return i3Var.currentAccount;
    }

    public static void J0(android.content.Context r34, int r35, final org.telegram.tgnet.tl.TL_payments.starRefProgram r36, long r37, org.telegram.ui.ActionBar.i6 r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: ki.i3.J0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, org.telegram.ui.ActionBar.i6, boolean):void");
    }

    public static org.telegram.ui.ActionBar.x2 K0(Context context, int i7, TL_payments.connectedBotStarRef connectedbotstarref, long j3, i6 i6Var) {
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        int i13;
        org.telegram.ui.ActionBar.x2 x2Var;
        char c10;
        String G;
        char c11;
        String G2;
        int i14;
        LinearLayout linearLayout2;
        String str;
        String G3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        String str2;
        int i15;
        int i16;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.x2 j10 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        int L = org.telegram.messenger.g0.L(40.0f);
        if (connectedbotstarref.revoked) {
            i10 = n6.nk;
        } else {
            i10 = n6.Fi;
        }
        Drawable L2 = n6.L(L, n6.w0(i10, i6Var));
        if (connectedbotstarref.revoked) {
            i11 = n6.nk;
        } else {
            i11 = n6.Fi;
        }
        q6 M = u6.M(i11);
        view.setBackground(L2);
        u6.j(view, L2, M, null, i6Var);
        frameLayout.addView(view, ma.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        if (connectedbotstarref.revoked) {
            i12 = 2131232208;
        } else {
            i12 = 2131232202;
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
        frameLayout.addView(imageView, ma.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int L3 = org.telegram.messenger.g0.L(50.0f);
            int i17 = n6.f29469h5;
            Drawable d02 = n6.d0(L3, n6.w0(i17, i6Var));
            q6 M2 = u6.M(i17);
            frameLayout2.setBackground(d02);
            u6.j(frameLayout2, d02, M2, null, i6Var);
            frameLayout.addView(frameLayout2, ma.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 12.0f);
            int L4 = org.telegram.messenger.g0.L(9.5f);
            if (connectedbotstarref.revoked) {
                i15 = n6.nk;
            } else {
                i15 = n6.lk;
            }
            Drawable d03 = n6.d0(L4, n6.w0(i15, i6Var));
            if (connectedbotstarref.revoked) {
                i16 = n6.nk;
            } else {
                i16 = n6.lk;
            }
            q6 M3 = u6.M(i16);
            textView.setBackground(d03);
            u6.j(textView, d03, M3, null, i6Var);
            textView.setTextColor(-1);
            textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            lq lqVar = new lq(2131231971, 0);
            lqVar.I = 0.937f;
            lqVar.J = 0.937f;
            lqVar.f37198r = -org.telegram.messenger.g0.L(1.33f);
            lqVar.f37199s = org.telegram.messenger.g0.L(1.0f);
            lqVar.H = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, ma.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        g10.addView(frameLayout, ma.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i18 = n6.G6;
        u6.U(textView2, i18, i6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(gd.M0(2131752471, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        g10.addView(textView2, ma.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L5 = org.telegram.messenger.g0.L(28.0f);
        int i19 = n6.f29339a7;
        ShapeDrawable d04 = n6.d0(L5, n6.w0(i19, i6Var));
        q6 M4 = u6.M(i19);
        linearLayout3.setBackground(d04);
        u6.j(linearLayout3, d04, M4, null, i6Var);
        q9 q9Var = new q9(context);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        b9 b9Var = new b9((i6) null);
        linearLayout3.addView(q9Var, ma.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        u6.U(textView3, i18, i6Var);
        textView3.setText(n5.l(i7, connectedbotstarref.bot_id));
        b9Var.r(c22);
        q9Var.f(c22, b9Var);
        linearLayout3.addView(textView3, ma.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i20 = n6.f29654r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        u6.s(imageView2, i20, i6Var, mode);
        imageView2.setImageResource(2131232699);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, ma.t(-2, -2, 16, 5, 0, 8, 0));
        g10.addView(linearLayout3, ma.t(-2, 28, 1, 4, 0, 4, 0));
        ra.a(linearLayout3);
        TextView textView4 = new TextView(context);
        u6.U(textView4, i18, i6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(org.telegram.messenger.g0.W2(gd.M0(2131752473, null)));
            i13 = i20;
            x2Var = j10;
            linearLayout = linearLayout3;
        } else {
            linearLayout = linearLayout3;
            if (j3 < 0) {
                String J0 = k.J0(connectedbotstarref.commission_permille);
                String q10 = o10.q(c22);
                int i21 = connectedbotstarref.duration_months;
                i13 = i20;
                x2Var = j10;
                if (i21 <= 0) {
                    G2 = gd.M0(2131752490, null);
                    c11 = 0;
                } else if (i21 < 12 || i21 % 12 != 0) {
                    c11 = 0;
                    G2 = gd.G(i21, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c11 = 0;
                    G2 = gd.G(i21 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr = new Object[3];
                objArr[c11] = J0;
                objArr[1] = q10;
                objArr[2] = G2;
                org.telegram.messenger.f3.q(null, null, 2131752474, objArr, textView4);
            } else {
                i13 = i20;
                x2Var = j10;
                String J02 = k.J0(connectedbotstarref.commission_permille);
                String q11 = o10.q(c22);
                int i22 = connectedbotstarref.duration_months;
                if (i22 <= 0) {
                    G = gd.M0(2131752490, null);
                    c10 = 0;
                } else if (i22 < 12 || i22 % 12 != 0) {
                    c10 = 0;
                    G = gd.G(i22, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c10 = 0;
                    G = gd.G(i22 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr2 = new Object[3];
                objArr2[c10] = J02;
                objArr2[1] = q11;
                objArr2[2] = G;
                org.telegram.messenger.f3.q(null, null, 2131752472, objArr2, textView4);
            }
        }
        g10.addView(textView4, ma.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (!connectedbotstarref.revoked) {
            TextView textView5 = new TextView(context);
            u6.U(textView5, i18, i6Var);
            textView5.setTextSize(1, 14.0f);
            org.telegram.messenger.f3.k(textView5, 17, null, 2131752475);
            g10.addView(textView5, ma.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            ShapeDrawable d05 = n6.d0(org.telegram.messenger.g0.L(28.0f), n6.w0(i19, i6Var));
            q6 M5 = u6.M(i19);
            linearLayout4.setBackground(d05);
            u6.j(linearLayout4, d05, M5, null, i6Var);
            q9 q9Var2 = new q9(context);
            q9Var2.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
            b9 b9Var2 = new b9((i6) null);
            linearLayout4.addView(q9Var2, ma.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            u6.U(textView6, i18, i6Var);
            if (j3 >= 0) {
                TLRPC.User c23 = mp.u1(i7).c2(Long.valueOf(j3));
                b9Var2.r(c23);
                q9Var2.f(c23, b9Var2);
                textView6.setText(o10.q(c23));
                i14 = i19;
            } else {
                i14 = i19;
                TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
                b9Var2.q(O0);
                q9Var2.f(O0, b9Var2);
                if (O0 == null) {
                    str2 = "";
                } else {
                    str2 = O0.title;
                }
                textView6.setText(str2);
            }
            linearLayout4.addView(textView6, ma.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            u6.s(imageView3, i13, i6Var, mode);
            imageView3.setImageResource(2131230873);
            linearLayout4.addView(imageView3, ma.t(-2, -2, 16, 2, 0, 5, 0));
            g10.addView(linearLayout4, ma.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        } else {
            i14 = i19;
            linearLayout2 = null;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        u6.U(textView7, i18, i6Var);
        int L6 = org.telegram.messenger.g0.L(8.0f);
        int i23 = i14;
        int w02 = n6.w0(i23, i6Var);
        int w03 = n6.w0(i23, i6Var);
        int i24 = n6.f29488i6;
        int w10 = n6.w(w03, n6.w0(i24, i6Var));
        org.telegram.ui.Cells.y k02 = n6.k0(L6, L6, L6, L6, w02, w10, w10);
        q6 M6 = u6.M(i23);
        q6 p10 = u6.p(i23, i24);
        textView7.setBackground(k02);
        u6.j(textView7, k02, M6, p10, i6Var);
        textView7.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f));
        String str3 = connectedbotstarref.url;
        if (str3 != null && str3.startsWith("https://")) {
            str = connectedbotstarref.url.substring(8);
        } else {
            str = connectedbotstarref.url;
        }
        textView7.setText(str);
        g10.addView(textView7, ma.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        hi.d dVar = new hi.d(context, i6Var, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new lq(2131232106, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) gd.M0(2131752481, null));
            dVar.i(spannableStringBuilder2, false, true);
        } else {
            dVar.i(gd.M0(2131752476, null), false, true);
        }
        g10.addView(dVar, ma.o(-1, 48));
        k80 k80Var = new k80(context, i6Var);
        long j11 = connectedbotstarref.participants;
        if (j11 <= 0) {
            G3 = gd.a0(null, null, 2131752479, o10.q(c22));
        } else {
            G3 = gd.G((int) j11, "ChannelAffiliateProgramLinkOpened", o10.q(c22));
        }
        k80Var.setText(G3);
        k80Var.setGravity(17);
        k80Var.setTextSize(1, 12.0f);
        u6.U(k80Var, n6.B6, i6Var);
        u6.G(k80Var, n6.Xc, i6Var);
        g10.addView(k80Var, ma.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.x2 x2Var2 = x2Var;
        x2Var2.O = g10;
        ai.s sVar = new ai.s(connectedbotstarref, x2Var2, i6Var, c22, 26);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new hi.o0(sVar, 13));
        }
        z2 z2Var = new z2(connectedbotstarref, i7, x2Var2, context, j3, i6Var, sVar);
        org.telegram.ui.ActionBar.x2 x2Var3 = x2Var2;
        dVar.setOnClickListener(z2Var);
        x2Var3.setOnDismissListener(new hi.f1(6));
        if (linearLayout2 != null) {
            di.e0.g(i7).n();
            di.e0.g(i7).o();
            LinearLayout linearLayout5 = linearLayout2;
            z2 z2Var2 = new z2(i7, x2Var3, i6Var, linearLayout5, j3, context, connectedbotstarref);
            x2Var3 = x2Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(z2Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new ai.v2(29, x2Var3, connectedbotstarref2));
        x2Var3.Q(n6.f29469h5);
        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && T != null && !org.telegram.messenger.g0.u1(T)) {
            x2Var3.a0(T);
        }
        x2Var3.show();
        return x2Var3;
    }

    public final void I0(java.util.ArrayList r17, org.telegram.ui.Components.z41 r18) {
        throw new UnsupportedOperationException("Method not decompiled: ki.i3.I0(java.util.ArrayList, org.telegram.ui.Components.z41):void");
    }

    @Override
    public final View createView(Context context) {
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        jn jnVar = new jn(context, 6);
        this.V = jnVar;
        u6.h(n6.f29487i5, jnVar, null);
        super.createView(context);
        this.T = new FrameLayout(context);
        vg.m mVar = new vg.m(context, 1, 3);
        this.U = mVar;
        mVar.setImportantForAccessibility(4);
        vg.f fVar = this.U.f59462b;
        fVar.f59446z = n6.Wk;
        fVar.A = n6.Xk;
        fVar.b();
        this.U.setStarParticlesView(this.f51835e);
        this.T.addView(this.U, ma.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(gd.M0(2131752461, null), org.telegram.messenger.g0.W2(gd.M0(2131752462, null)), this.T, null);
        this.f51834c.setOnItemClickListener(new g4(2, this, context));
        this.f51834c.setOnItemLongClickListener(new ab.g(25, this, context));
        v4.k kVar = new v4.k();
        kVar.f59151m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        this.f51834c.setItemAnimator(kVar);
        this.f51834c.setOnScrollListener(new bi.q1(this, 22));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        e8 e8Var;
        int i11 = ks.N3;
        long j3 = this.S;
        if (i7 == i11) {
            if (((Long) objArr[0]).longValue() == j3) {
                e8 e8Var2 = this.W;
                if (e8Var2 != null) {
                    e8Var2.O(true);
                }
                di.e0.g(this.currentAccount).d(j3).a();
            }
        } else if (i7 == ks.M3 && ((Long) objArr[0]).longValue() == j3 && (e8Var = this.W) != null) {
            e8Var.O(true);
        }
    }

    @Override
    public final v4.i0 k0() {
        e8 e8Var = new e8(this, this.f51834c, getParentActivity(), this.currentAccount, this.classGuid, new e7(this, 21), getResourceProvider(), 5);
        this.W = e8Var;
        return e8Var;
    }

    @Override
    public final ug.u1 m0() {
        f fVar = new f(getParentActivity(), 1);
        fVar.c();
        return fVar;
    }

    @Override
    public final boolean onFragmentCreate() {
        ks.f(this.currentAccount).c(this, ks.N3);
        ks.f(this.currentAccount).c(this, ks.M3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ks.f(this.currentAccount).n(this, ks.N3);
        ks.f(this.currentAccount).n(this, ks.M3);
    }

    @Override
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        vg.m mVar = this.U;
        if (mVar != null) {
            mVar.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }
}
