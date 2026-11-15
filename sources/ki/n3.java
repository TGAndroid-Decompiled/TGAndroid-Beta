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
import bi.x5;
import bi.z4;
import c8.ja;
import c8.na;
import hi.p5;
import hi.q4;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p00;
public final class n3 extends p00 implements is {
    public final long S;
    public FrameLayout T;
    public vg.m U;
    public bn V;
    public x5 W;

    public n3(long j3) {
        this.S = j3;
        this.N = true;
        this.M = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(n3 n3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, n3Var.resourceProvider);
        String M0 = hd.M0(2131749007, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749006, q10.p(user)));
        alertDialog$Builder.k(hd.M0(2131749005, null), new ab.g(26, n3Var, connectedbotstarref));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void B0(n3 n3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, n3Var.getParentActivity(), null);
        t1Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = np.s1(n3Var.currentAccount).j1(n3Var.S);
        editconnectedstarrefbot.revoked = true;
        n3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new bi.v2(23, n3Var, t1Var));
    }

    public static void C0(n3 n3Var, Context context, int i7) {
        x5 x5Var = n3Var.W;
        if (x5Var != null) {
            Object obj = x5Var.G(i7).G;
            if (obj instanceof TL_payments.starRefProgram) {
                J0(context, n3Var.currentAccount, (TL_payments.starRefProgram) obj, n3Var.S, n3Var.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                K0(context, n3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, n3Var.S, n3Var.resourceProvider);
            }
        }
    }

    public static void D0(n3 n3Var, TLObject tLObject, org.telegram.ui.ActionBar.t1 t1Var) {
        long j3 = n3Var.S;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            di.b0 d = di.e0.g(n3Var.currentAccount).d(j3);
            ArrayList arrayList = d.f8238e;
            int i7 = d.f8235a;
            np.s1(i7).Y3(connectedstarrefbots.users, false);
            for (int i10 = 0; i10 < connectedstarrefbots.connected_bots.size(); i10++) {
                TL_payments.connectedBotStarRef connectedbotstarref = connectedstarrefbots.connected_bots.get(i10);
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (((TL_payments.connectedBotStarRef) arrayList.get(i11)).bot_id == connectedbotstarref.bot_id) {
                        if (connectedbotstarref.revoked) {
                            arrayList.remove(i11);
                            d.f8237c = Math.max(d.f8237c - 1, 0);
                        } else {
                            arrayList.set(i11, connectedbotstarref);
                        }
                    } else {
                        i11++;
                    }
                }
            }
            ns.f(i7).k(ns.L3, Long.valueOf(d.f8236b));
            d.a();
            di.c0 e10 = di.e0.g(n3Var.currentAccount).e(j3);
            e10.f8284c = 0;
            e10.d = false;
            e10.f8288i = false;
            e10.f8286f = 0L;
            e10.f8289j = null;
            e10.h = false;
            e10.a();
            n3Var.W.O(true);
        }
        t1Var.dismiss();
    }

    public static boolean E0(n3 n3Var, Context context, View view, int i7) {
        x5 x5Var = n3Var.W;
        if (x5Var != null) {
            Object obj = x5Var.G(i7).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User a22 = np.s1(n3Var.currentAccount).a2(Long.valueOf(connectedbotstarref.bot_id));
                m60 H = m60.H(n3Var, view);
                H.l(2131232073, hd.M0(2131746708, null), new kg.t1(7, n3Var, a22), a22.bot_has_main_app);
                H.l(2131232073, hd.M0(2131752912, null), new kg.t1(8, n3Var, connectedbotstarref), !a22.bot_has_main_app);
                H.c(2131232205, hd.M0(2131751762, null), new n(n3Var, connectedbotstarref, a22, 3), false);
                H.m(2131232196, new ai.r(n3Var, context, a22, connectedbotstarref, 24), hd.M0(2131749005, null), !connectedbotstarref.revoked, true);
                H.V(5);
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static int F0(n3 n3Var) {
        return n3Var.currentAccount;
    }

    public static int G0(n3 n3Var) {
        return n3Var.currentAccount;
    }

    public static void J0(android.content.Context r34, int r35, final org.telegram.tgnet.tl.TL_payments.starRefProgram r36, long r37, org.telegram.ui.ActionBar.e6 r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: ki.n3.J0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, org.telegram.ui.ActionBar.e6, boolean):void");
    }

    public static org.telegram.ui.ActionBar.u2 K0(Context context, int i7, TL_payments.connectedBotStarRef connectedbotstarref, long j3, e6 e6Var) {
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        int i10;
        org.telegram.ui.ActionBar.u2 u2Var;
        char c10;
        String G;
        char c11;
        String G2;
        int i11;
        LinearLayout linearLayout2;
        String G3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.u2 k10 = k5.k(1, context, e6Var, false);
        TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout f10 = k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        Drawable L = j6.L(org.telegram.messenger.g0.L(40.0f), j6.w0(connectedbotstarref.revoked ? j6.nk : j6.Fi, e6Var));
        m6 M = q6.M(connectedbotstarref.revoked ? j6.nk : j6.Fi);
        view.setBackground(L);
        q6.j(view, L, M, null, e6Var);
        frameLayout.addView(view, ja.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? 2131232207 : 2131232201);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, ja.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int L2 = org.telegram.messenger.g0.L(50.0f);
            int i12 = j6.f28922h5;
            Drawable d02 = j6.d0(L2, j6.w0(i12, e6Var));
            m6 M2 = q6.M(i12);
            frameLayout2.setBackground(d02);
            q6.j(frameLayout2, d02, M2, null, e6Var);
            frameLayout.addView(frameLayout2, ja.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 12.0f);
            Drawable d03 = j6.d0(org.telegram.messenger.g0.L(9.5f), j6.w0(connectedbotstarref.revoked ? j6.nk : j6.lk, e6Var));
            m6 M3 = q6.M(connectedbotstarref.revoked ? j6.nk : j6.lk);
            textView.setBackground(d03);
            q6.j(textView, d03, M3, null, e6Var);
            textView.setTextColor(-1);
            textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            eq eqVar = new eq(2131231970, 0);
            eqVar.I = 0.937f;
            eqVar.J = 0.937f;
            eqVar.f34414r = -org.telegram.messenger.g0.L(1.33f);
            eqVar.f34415s = org.telegram.messenger.g0.L(1.0f);
            eqVar.H = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, ja.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        f10.addView(frameLayout, ja.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i13 = j6.G6;
        q6.U(textView2, i13, e6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(hd.M0(2131752482, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView2, ja.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L3 = org.telegram.messenger.g0.L(28.0f);
        int i14 = j6.f28792a7;
        ShapeDrawable d04 = j6.d0(L3, j6.w0(i14, e6Var));
        m6 M4 = q6.M(i14);
        linearLayout3.setBackground(d04);
        q6.j(linearLayout3, d04, M4, null, e6Var);
        i9 i9Var = new i9(context);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        t8 t8Var = new t8((e6) null);
        linearLayout3.addView(i9Var, ja.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        q6.U(textView3, i13, e6Var);
        textView3.setText(m5.l(i7, connectedbotstarref.bot_id));
        t8Var.r(a22);
        i9Var.f(a22, t8Var);
        linearLayout3.addView(textView3, ja.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i15 = j6.f29107r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        q6.s(imageView2, i15, e6Var, mode);
        imageView2.setImageResource(2131232698);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, ja.t(-2, -2, 16, 5, 0, 8, 0));
        f10.addView(linearLayout3, ja.t(-2, 28, 1, 4, 0, 4, 0));
        na.a(linearLayout3);
        TextView textView4 = new TextView(context);
        q6.U(textView4, i13, e6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(org.telegram.messenger.g0.X2(hd.M0(2131752484, null)));
            i10 = i15;
            u2Var = k10;
            linearLayout = linearLayout3;
        } else {
            linearLayout = linearLayout3;
            if (j3 < 0) {
                String J0 = k.J0(connectedbotstarref.commission_permille);
                String p10 = q10.p(a22);
                int i16 = connectedbotstarref.duration_months;
                i10 = i15;
                u2Var = k10;
                if (i16 <= 0) {
                    G2 = hd.M0(2131752501, null);
                    c11 = 0;
                } else if (i16 < 12 || i16 % 12 != 0) {
                    c11 = 0;
                    G2 = hd.G(i16, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c11 = 0;
                    G2 = hd.G(i16 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr = new Object[3];
                objArr[c11] = J0;
                objArr[1] = p10;
                objArr[2] = G2;
                k5.q(null, null, 2131752485, objArr, textView4);
            } else {
                i10 = i15;
                u2Var = k10;
                String J02 = k.J0(connectedbotstarref.commission_permille);
                String p11 = q10.p(a22);
                int i17 = connectedbotstarref.duration_months;
                if (i17 <= 0) {
                    G = hd.M0(2131752501, null);
                    c10 = 0;
                } else if (i17 < 12 || i17 % 12 != 0) {
                    c10 = 0;
                    G = hd.G(i17, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c10 = 0;
                    G = hd.G(i17 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr2 = new Object[3];
                objArr2[c10] = J02;
                objArr2[1] = p11;
                objArr2[2] = G;
                k5.q(null, null, 2131752483, objArr2, textView4);
            }
        }
        f10.addView(textView4, ja.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i11 = i14;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            q6.U(textView5, i13, e6Var);
            textView5.setTextSize(1, 14.0f);
            k5.l(textView5, 17, null, 2131752486);
            f10.addView(textView5, ja.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            ShapeDrawable d05 = j6.d0(org.telegram.messenger.g0.L(28.0f), j6.w0(i14, e6Var));
            m6 M5 = q6.M(i14);
            linearLayout4.setBackground(d05);
            q6.j(linearLayout4, d05, M5, null, e6Var);
            i9 i9Var2 = new i9(context);
            i9Var2.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
            t8 t8Var2 = new t8((e6) null);
            linearLayout4.addView(i9Var2, ja.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            q6.U(textView6, i13, e6Var);
            if (j3 >= 0) {
                TLRPC.User a23 = np.s1(i7).a2(Long.valueOf(j3));
                t8Var2.r(a23);
                i9Var2.f(a23, t8Var2);
                textView6.setText(q10.p(a23));
                i11 = i14;
            } else {
                i11 = i14;
                TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
                t8Var2.q(M0);
                i9Var2.f(M0, t8Var2);
                textView6.setText(M0 == null ? "" : M0.title);
            }
            linearLayout4.addView(textView6, ja.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            q6.s(imageView3, i10, e6Var, mode);
            imageView3.setImageResource(2131230873);
            linearLayout4.addView(imageView3, ja.t(-2, -2, 16, 2, 0, 5, 0));
            f10.addView(linearLayout4, ja.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        q6.U(textView7, i13, e6Var);
        int L4 = org.telegram.messenger.g0.L(8.0f);
        int i18 = i11;
        int w02 = j6.w0(i18, e6Var);
        int w03 = j6.w0(i18, e6Var);
        int i19 = j6.f28941i6;
        int w10 = j6.w(w03, j6.w0(i19, e6Var));
        org.telegram.ui.Cells.y k02 = j6.k0(L4, L4, L4, L4, w02, w10, w10);
        m6 M6 = q6.M(i18);
        m6 p12 = q6.p(i18, i19);
        textView7.setBackground(k02);
        q6.j(textView7, k02, M6, p12, e6Var);
        textView7.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f));
        String str = connectedbotstarref.url;
        textView7.setText((str == null || !str.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        f10.addView(textView7, ja.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        hi.d dVar = new hi.d(context, e6Var, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new eq(2131232105, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) hd.M0(2131752492, null));
            dVar.i(spannableStringBuilder2, false, true);
        } else {
            dVar.i(hd.M0(2131752487, null), false, true);
        }
        f10.addView(dVar, ja.o(-1, 48));
        z70 z70Var = new z70(context, e6Var);
        long j10 = connectedbotstarref.participants;
        if (j10 <= 0) {
            G3 = hd.a0(null, null, 2131752490, q10.p(a22));
        } else {
            G3 = hd.G((int) j10, "ChannelAffiliateProgramLinkOpened", q10.p(a22));
        }
        z70Var.setText(G3);
        z70Var.setGravity(17);
        z70Var.setTextSize(1, 12.0f);
        q6.U(z70Var, j6.B6, e6Var);
        q6.G(z70Var, j6.Xc, e6Var);
        f10.addView(z70Var, ja.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.u2 u2Var2 = u2Var;
        u2Var2.O = f10;
        ai.r rVar = new ai.r(connectedbotstarref, u2Var2, e6Var, a22, 23);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new p5(rVar, 11));
        }
        e3 e3Var = new e3(connectedbotstarref, i7, u2Var2, context, j3, e6Var, rVar);
        org.telegram.ui.ActionBar.u2 u2Var3 = u2Var2;
        dVar.setOnClickListener(e3Var);
        u2Var3.setOnDismissListener(new hi.f1(6));
        if (linearLayout2 != null) {
            di.e0.g(i7).n();
            di.e0.g(i7).o();
            LinearLayout linearLayout5 = linearLayout2;
            e3 e3Var2 = new e3(i7, u2Var3, e6Var, linearLayout5, j3, context, connectedbotstarref);
            u2Var3 = u2Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(e3Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new ai.v2(27, u2Var3, connectedbotstarref2));
        u2Var3.Q(j6.f28922h5);
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && T != null && !org.telegram.messenger.g0.u1(T)) {
            u2Var3.a0(T);
        }
        u2Var3.show();
        return u2Var3;
    }

    public final void I0(java.util.ArrayList r17, org.telegram.ui.Components.p41 r18) {
        throw new UnsupportedOperationException("Method not decompiled: ki.n3.I0(java.util.ArrayList, org.telegram.ui.Components.p41):void");
    }

    @Override
    public final View createView(Context context) {
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        bn bnVar = new bn(context, 6);
        this.V = bnVar;
        q6.h(j6.f28940i5, bnVar, null);
        super.createView(context);
        this.T = new FrameLayout(context);
        vg.m mVar = new vg.m(context, 1, 3);
        this.U = mVar;
        mVar.setImportantForAccessibility(4);
        vg.f fVar = this.U.f58893b;
        fVar.f58877z = j6.Wk;
        fVar.A = j6.Xk;
        fVar.b();
        this.U.setStarParticlesView(this.f50076e);
        this.T.addView(this.U, ja.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(hd.M0(2131752472, null), org.telegram.messenger.g0.X2(hd.M0(2131752473, null)), this.T, null);
        this.f50075c.setOnItemClickListener(new fi.i4(2, this, context));
        this.f50075c.setOnItemLongClickListener(new ab.g(27, this, context));
        v4.k kVar = new v4.k();
        kVar.f58564m = false;
        kVar.C = false;
        kVar.o(er.h);
        kVar.n(350L);
        this.f50075c.setItemAnimator(kVar);
        this.f50075c.setOnScrollListener(new z4(this, 21));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        x5 x5Var;
        int i11 = ns.L3;
        long j3 = this.S;
        if (i7 == i11) {
            if (((Long) objArr[0]).longValue() == j3) {
                x5 x5Var2 = this.W;
                if (x5Var2 != null) {
                    x5Var2.O(true);
                }
                di.e0.g(this.currentAccount).d(j3).a();
            }
        } else if (i7 == ns.K3 && ((Long) objArr[0]).longValue() == j3 && (x5Var = this.W) != null) {
            x5Var.O(true);
        }
    }

    @Override
    public final v4.h0 k0() {
        x5 x5Var = new x5(this, this.f50075c, getParentActivity(), this.currentAccount, this.classGuid, new q4(this, 21), getResourceProvider(), 5);
        this.W = x5Var;
        return x5Var;
    }

    @Override
    public final ug.s1 m0() {
        f fVar = new f(getParentActivity(), 1);
        fVar.c();
        return fVar;
    }

    @Override
    public final boolean onFragmentCreate() {
        ns.f(this.currentAccount).c(this, ns.L3);
        ns.f(this.currentAccount).c(this, ns.K3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ns.f(this.currentAccount).n(this, ns.L3);
        ns.f(this.currentAccount).n(this, ns.K3);
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
