package hi;

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
import bi.hc;
import c8.ha;
import c8.ka;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.q00;
public final class q3 extends q00 implements ls {
    public final long R;
    public FrameLayout S;
    public vg.m T;
    public tm U;
    public hc V;

    public q3(long j3) {
        this.R = j3;
        this.M = true;
        this.L = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(q3 q3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, q3Var.resourceProvider);
        String M0 = id.M0(2131749007, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(id.a0(null, null, 2131749006, t10.p(user)));
        alertDialog$Builder.k(id.M0(2131749005, null), new ab.g(15, q3Var, connectedbotstarref));
        alertDialog$Builder.h(id.M0(2131752589, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void B0(q3 q3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, q3Var.getParentActivity(), null);
        u1Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = qp.s1(q3Var.currentAccount).j1(q3Var.R);
        editconnectedstarrefbot.revoked = true;
        q3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new bi.j(16, q3Var, u1Var));
    }

    public static void C0(q3 q3Var, Context context, int i7) {
        hc hcVar = q3Var.V;
        if (hcVar != null) {
            Object obj = hcVar.G(i7).G;
            if (obj instanceof TL_payments.starRefProgram) {
                J0(context, q3Var.currentAccount, (TL_payments.starRefProgram) obj, q3Var.R, q3Var.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                K0(context, q3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, q3Var.R, q3Var.resourceProvider);
            }
        }
    }

    public static void D0(q3 q3Var, TLObject tLObject, org.telegram.ui.ActionBar.u1 u1Var) {
        long j3 = q3Var.R;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            bi.k0 d = bi.n0.g(q3Var.currentAccount).d(j3);
            ArrayList arrayList = d.f4131e;
            int i7 = d.f4128a;
            qp.s1(i7).Y3(connectedstarrefbots.users, false);
            for (int i10 = 0; i10 < connectedstarrefbots.connected_bots.size(); i10++) {
                TL_payments.connectedBotStarRef connectedbotstarref = connectedstarrefbots.connected_bots.get(i10);
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (((TL_payments.connectedBotStarRef) arrayList.get(i11)).bot_id == connectedbotstarref.bot_id) {
                        if (connectedbotstarref.revoked) {
                            arrayList.remove(i11);
                            d.f4130c = Math.max(d.f4130c - 1, 0);
                        } else {
                            arrayList.set(i11, connectedbotstarref);
                        }
                    } else {
                        i11++;
                    }
                }
            }
            qs.f(i7).k(qs.L3, Long.valueOf(d.f4129b));
            d.a();
            bi.l0 e10 = bi.n0.g(q3Var.currentAccount).e(j3);
            e10.f4246c = 0;
            e10.d = false;
            e10.f4250i = false;
            e10.f4248f = 0L;
            e10.f4251j = null;
            e10.h = false;
            e10.a();
            q3Var.V.O(true);
        }
        u1Var.dismiss();
    }

    public static boolean E0(q3 q3Var, Context context, View view, int i7) {
        hc hcVar = q3Var.V;
        if (hcVar != null) {
            Object obj = hcVar.G(i7).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User a22 = qp.s1(q3Var.currentAccount).a2(Long.valueOf(connectedbotstarref.bot_id));
                l60 H = l60.H(q3Var, view);
                H.l(2131232072, id.M0(2131746708, null), new ha.b(5, q3Var, a22), a22.bot_has_main_app);
                H.l(2131232072, id.M0(2131752912, null), new ha.b(6, q3Var, connectedbotstarref), !a22.bot_has_main_app);
                H.c(2131232204, id.M0(2131751762, null), new fi.x1(q3Var, connectedbotstarref, a22, 14), false);
                H.m(2131232195, new ai.d0(q3Var, context, a22, connectedbotstarref, 19), id.M0(2131749005, null), !connectedbotstarref.revoked, true);
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

    public static void J0(android.content.Context r34, int r35, final org.telegram.tgnet.tl.TL_payments.starRefProgram r36, long r37, org.telegram.ui.ActionBar.g6 r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: hi.q3.J0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, org.telegram.ui.ActionBar.g6, boolean):void");
    }

    public static org.telegram.ui.ActionBar.v2 K0(Context context, int i7, TL_payments.connectedBotStarRef connectedbotstarref, long j3, g6 g6Var) {
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        int i10;
        org.telegram.ui.ActionBar.v2 v2Var;
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
        org.telegram.ui.ActionBar.v2 l10 = k5.l(1, context, g6Var, false);
        TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout f10 = k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        Drawable L = l6.L(org.telegram.messenger.g0.L(40.0f), l6.w0(connectedbotstarref.revoked ? l6.kk : l6.Ci, g6Var));
        o6 M = s6.M(connectedbotstarref.revoked ? l6.kk : l6.Ci);
        view.setBackground(L);
        s6.j(view, L, M, null, g6Var);
        frameLayout.addView(view, ha.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? 2131232206 : 2131232200);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, ha.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int L2 = org.telegram.messenger.g0.L(50.0f);
            int i12 = l6.f27938h5;
            Drawable d02 = l6.d0(L2, l6.w0(i12, g6Var));
            o6 M2 = s6.M(i12);
            frameLayout2.setBackground(d02);
            s6.j(frameLayout2, d02, M2, null, g6Var);
            frameLayout.addView(frameLayout2, ha.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 12.0f);
            Drawable d03 = l6.d0(org.telegram.messenger.g0.L(9.5f), l6.w0(connectedbotstarref.revoked ? l6.kk : l6.ik, g6Var));
            o6 M3 = s6.M(connectedbotstarref.revoked ? l6.kk : l6.ik);
            textView.setBackground(d03);
            s6.j(textView, d03, M3, null, g6Var);
            textView.setTextColor(-1);
            textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            wp wpVar = new wp(2131231970, 0);
            wpVar.H = 0.937f;
            wpVar.I = 0.937f;
            wpVar.f40120r = -org.telegram.messenger.g0.L(1.33f);
            wpVar.f40121s = org.telegram.messenger.g0.L(1.0f);
            wpVar.G = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, ha.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        f10.addView(frameLayout, ha.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i13 = l6.G6;
        s6.U(textView2, i13, g6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(id.M0(2131752482, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView2, ha.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L3 = org.telegram.messenger.g0.L(28.0f);
        int i14 = l6.f27809a7;
        ShapeDrawable d04 = l6.d0(L3, l6.w0(i14, g6Var));
        o6 M4 = s6.M(i14);
        linearLayout3.setBackground(d04);
        s6.j(linearLayout3, d04, M4, null, g6Var);
        l9 l9Var = new l9(context);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        w8 w8Var = new w8((g6) null);
        linearLayout3.addView(l9Var, ha.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        s6.U(textView3, i13, g6Var);
        textView3.setText(m5.l(i7, connectedbotstarref.bot_id));
        w8Var.r(a22);
        l9Var.e(a22, w8Var);
        linearLayout3.addView(textView3, ha.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i15 = l6.f28123r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        s6.s(imageView2, i15, g6Var, mode);
        imageView2.setImageResource(2131232697);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, ha.t(-2, -2, 16, 5, 0, 8, 0));
        f10.addView(linearLayout3, ha.t(-2, 28, 1, 4, 0, 4, 0));
        ka.a(linearLayout3);
        TextView textView4 = new TextView(context);
        s6.U(textView4, i13, g6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(org.telegram.messenger.g0.X2(id.M0(2131752484, null)));
            i10 = i15;
            v2Var = l10;
            linearLayout = linearLayout3;
        } else {
            linearLayout = linearLayout3;
            if (j3 < 0) {
                String J0 = j.J0(connectedbotstarref.commission_permille);
                String p10 = t10.p(a22);
                int i16 = connectedbotstarref.duration_months;
                i10 = i15;
                v2Var = l10;
                if (i16 <= 0) {
                    G2 = id.M0(2131752501, null);
                    c11 = 0;
                } else if (i16 < 12 || i16 % 12 != 0) {
                    c11 = 0;
                    G2 = id.G(i16, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c11 = 0;
                    G2 = id.G(i16 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr = new Object[3];
                objArr[c11] = J0;
                objArr[1] = p10;
                objArr[2] = G2;
                k5.r(null, null, 2131752485, objArr, textView4);
            } else {
                i10 = i15;
                v2Var = l10;
                String J02 = j.J0(connectedbotstarref.commission_permille);
                String p11 = t10.p(a22);
                int i17 = connectedbotstarref.duration_months;
                if (i17 <= 0) {
                    G = id.M0(2131752501, null);
                    c10 = 0;
                } else if (i17 < 12 || i17 % 12 != 0) {
                    c10 = 0;
                    G = id.G(i17, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c10 = 0;
                    G = id.G(i17 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr2 = new Object[3];
                objArr2[c10] = J02;
                objArr2[1] = p11;
                objArr2[2] = G;
                k5.r(null, null, 2131752483, objArr2, textView4);
            }
        }
        f10.addView(textView4, ha.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i11 = i14;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            s6.U(textView5, i13, g6Var);
            textView5.setTextSize(1, 14.0f);
            k5.m(textView5, 17, null, 2131752486);
            f10.addView(textView5, ha.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            ShapeDrawable d05 = l6.d0(org.telegram.messenger.g0.L(28.0f), l6.w0(i14, g6Var));
            o6 M5 = s6.M(i14);
            linearLayout4.setBackground(d05);
            s6.j(linearLayout4, d05, M5, null, g6Var);
            l9 l9Var2 = new l9(context);
            l9Var2.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
            w8 w8Var2 = new w8((g6) null);
            linearLayout4.addView(l9Var2, ha.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            s6.U(textView6, i13, g6Var);
            if (j3 >= 0) {
                TLRPC.User a23 = qp.s1(i7).a2(Long.valueOf(j3));
                w8Var2.r(a23);
                l9Var2.e(a23, w8Var2);
                textView6.setText(t10.p(a23));
                i11 = i14;
            } else {
                i11 = i14;
                TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
                w8Var2.q(M0);
                l9Var2.e(M0, w8Var2);
                textView6.setText(M0 == null ? "" : M0.title);
            }
            linearLayout4.addView(textView6, ha.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            s6.s(imageView3, i10, g6Var, mode);
            imageView3.setImageResource(2131230873);
            linearLayout4.addView(imageView3, ha.t(-2, -2, 16, 2, 0, 5, 0));
            f10.addView(linearLayout4, ha.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        s6.U(textView7, i13, g6Var);
        int L4 = org.telegram.messenger.g0.L(8.0f);
        int i18 = i11;
        int w02 = l6.w0(i18, g6Var);
        int w03 = l6.w0(i18, g6Var);
        int i19 = l6.f27957i6;
        int w10 = l6.w(w03, l6.w0(i19, g6Var));
        org.telegram.ui.Cells.y k02 = l6.k0(L4, L4, L4, L4, w02, w10, w10);
        o6 M6 = s6.M(i18);
        o6 p12 = s6.p(i18, i19);
        textView7.setBackground(k02);
        s6.j(textView7, k02, M6, p12, g6Var);
        textView7.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f));
        String str = connectedbotstarref.url;
        textView7.setText((str == null || !str.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        f10.addView(textView7, ha.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        fi.d dVar = new fi.d(context, g6Var, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new wp(2131232104, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) id.M0(2131752492, null));
            dVar.i(spannableStringBuilder2, false, true);
        } else {
            dVar.i(id.M0(2131752487, null), false, true);
        }
        f10.addView(dVar, ha.o(-1, 48));
        x70 x70Var = new x70(context, g6Var);
        long j10 = connectedbotstarref.participants;
        if (j10 <= 0) {
            G3 = id.a0(null, null, 2131752490, t10.p(a22));
        } else {
            G3 = id.G((int) j10, "ChannelAffiliateProgramLinkOpened", t10.p(a22));
        }
        x70Var.setText(G3);
        x70Var.setGravity(17);
        x70Var.setTextSize(1, 12.0f);
        s6.U(x70Var, l6.B6, g6Var);
        s6.G(x70Var, l6.Uc, g6Var);
        f10.addView(x70Var, ha.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.v2 v2Var2 = v2Var;
        v2Var2.N = f10;
        ai.d0 d0Var = new ai.d0(connectedbotstarref, v2Var2, g6Var, a22, 18);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new ah.d(d0Var, 29));
        }
        h3 h3Var = new h3(connectedbotstarref, i7, v2Var2, context, j3, g6Var, d0Var);
        org.telegram.ui.ActionBar.v2 v2Var3 = v2Var2;
        dVar.setOnClickListener(h3Var);
        v2Var3.setOnDismissListener(new fi.d1(6));
        if (linearLayout2 != null) {
            bi.n0.g(i7).n();
            bi.n0.g(i7).o();
            LinearLayout linearLayout5 = linearLayout2;
            h3 h3Var2 = new h3(i7, v2Var3, g6Var, linearLayout5, j3, context, connectedbotstarref);
            v2Var3 = v2Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(h3Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new bi.r(18, v2Var3, connectedbotstarref2));
        v2Var3.P(l6.f27938h5);
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && T != null && !org.telegram.messenger.g0.u1(T)) {
            v2Var3.a0(T);
        }
        v2Var3.show();
        return v2Var3;
    }

    public final void I0(java.util.ArrayList r17, org.telegram.ui.Components.m41 r18) {
        throw new UnsupportedOperationException("Method not decompiled: hi.q3.I0(java.util.ArrayList, org.telegram.ui.Components.m41):void");
    }

    @Override
    public final View createView(Context context) {
        this.G = false;
        this.E = org.telegram.messenger.g0.L(238.0f);
        tm tmVar = new tm(context, 2);
        this.U = tmVar;
        s6.h(l6.f27956i5, tmVar, null);
        super.createView(context);
        this.S = new FrameLayout(context);
        vg.m mVar = new vg.m(context, 1, 3);
        this.T = mVar;
        mVar.setImportantForAccessibility(4);
        vg.f fVar = this.T.f57424b;
        fVar.f57408z = l6.Tk;
        fVar.A = l6.Uk;
        fVar.b();
        this.T.setStarParticlesView(this.f48843e);
        this.S.addView(this.T, ha.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(id.M0(2131752472, null), org.telegram.messenger.g0.X2(id.M0(2131752473, null)), this.S, null);
        this.f48842c.setOnItemClickListener(new di.q4(2, this, context));
        this.f48842c.setOnItemLongClickListener(new ab.g(16, this, context));
        v4.k kVar = new v4.k();
        kVar.f57083m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f48842c.setItemAnimator(kVar);
        this.f48842c.setOnScrollListener(new ai.b(this, 15));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        hc hcVar;
        int i11 = qs.L3;
        long j3 = this.R;
        if (i7 == i11) {
            if (((Long) objArr[0]).longValue() == j3) {
                hc hcVar2 = this.V;
                if (hcVar2 != null) {
                    hcVar2.O(true);
                }
                bi.n0.g(this.currentAccount).d(j3).a();
            }
        } else if (i7 == qs.K3 && ((Long) objArr[0]).longValue() == j3 && (hcVar = this.V) != null) {
            hcVar.O(true);
        }
    }

    @Override
    public final v4.g0 k0() {
        hc hcVar = new hc(this, this.f48842c, getParentActivity(), this.currentAccount, this.classGuid, new u1(this, 1), getResourceProvider(), 4);
        this.V = hcVar;
        return hcVar;
    }

    @Override
    public final ug.q1 m0() {
        e eVar = new e(getParentActivity(), 1);
        eVar.c();
        return eVar;
    }

    @Override
    public final boolean onFragmentCreate() {
        qs.f(this.currentAccount).c(this, qs.L3);
        qs.f(this.currentAccount).c(this, qs.K3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        qs.f(this.currentAccount).n(this, qs.L3);
        qs.f(this.currentAccount).n(this, qs.K3);
    }

    @Override
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        vg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }
}
