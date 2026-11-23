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
import bi.j8;
import c8.na;
import c8.sa;
import fi.g4;
import hi.y7;
import hi.z4;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r00;
public final class i3 extends r00 implements fs {
    public final long S;
    public FrameLayout T;
    public vg.m U;
    public in V;
    public j8 W;

    public i3(long j3) {
        this.S = j3;
        this.N = true;
        this.M = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(i3 i3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i3Var.resourceProvider);
        String N0 = gd.N0(2131748814, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131748813, n10.q(user)));
        alertDialog$Builder.k(gd.N0(2131748812, null), new ab.g(24, i3Var, connectedbotstarref));
        alertDialog$Builder.h(gd.N0(2131752577, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void B0(i3 i3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, i3Var.getParentActivity(), null);
        t1Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = mp.u1(i3Var.currentAccount).l1(i3Var.S);
        editconnectedstarrefbot.revoked = true;
        i3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new bi.o1(25, i3Var, t1Var));
    }

    public static void C0(i3 i3Var, Context context, int i7) {
        j8 j8Var = i3Var.W;
        if (j8Var != null) {
            Object obj = j8Var.G(i7).H;
            if (obj instanceof TL_payments.starRefProgram) {
                J0(context, i3Var.currentAccount, (TL_payments.starRefProgram) obj, i3Var.S, i3Var.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                K0(context, i3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, i3Var.S, i3Var.resourceProvider);
            }
        }
    }

    public static void D0(i3 i3Var, TLObject tLObject, org.telegram.ui.ActionBar.t1 t1Var) {
        long j3 = i3Var.S;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            di.b0 d = di.e0.g(i3Var.currentAccount).d(j3);
            ArrayList arrayList = d.f8502e;
            int i7 = d.f8499a;
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
                            d.f8501c = Math.max(d.f8501c - 1, 0);
                        } else {
                            arrayList.set(i11, connectedbotstarref);
                        }
                    } else {
                        i11++;
                    }
                }
            }
            ks.f(i7).k(ks.O3, Long.valueOf(d.f8500b));
            d.a();
            di.c0 e10 = di.e0.g(i3Var.currentAccount).e(j3);
            e10.f8572c = 0;
            e10.d = false;
            e10.f8576i = false;
            e10.f8574f = 0L;
            e10.f8577j = null;
            e10.h = false;
            e10.a();
            i3Var.W.O(true);
        }
        t1Var.dismiss();
    }

    public static boolean E0(i3 i3Var, Context context, View view, int i7) {
        j8 j8Var = i3Var.W;
        if (j8Var != null) {
            Object obj = j8Var.G(i7).H;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User c22 = mp.u1(i3Var.currentAccount).c2(Long.valueOf(connectedbotstarref.bot_id));
                x60 I = x60.I(i3Var, view);
                I.l(2131232077, gd.N0(2131746512, null), new ji.f(14, i3Var, c22), c22.bot_has_main_app);
                I.l(2131232077, gd.N0(2131752900, null), new ji.f(15, i3Var, connectedbotstarref), !c22.bot_has_main_app);
                I.c(2131232209, gd.N0(2131751750, null), new kg.x(i3Var, connectedbotstarref, c22, 9), false);
                I.m(2131232200, new ai.j(i3Var, context, c22, connectedbotstarref, 28), gd.N0(2131748812, null), !connectedbotstarref.revoked, true);
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

    public static org.telegram.ui.ActionBar.w2 K0(Context context, int i7, TL_payments.connectedBotStarRef connectedbotstarref, long j3, i6 i6Var) {
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        int i10;
        org.telegram.ui.ActionBar.w2 w2Var;
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
        org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        Drawable L = n6.L(org.telegram.messenger.g0.L(40.0f), n6.w0(connectedbotstarref.revoked ? n6.nk : n6.Fi, i6Var));
        q6 M = u6.M(connectedbotstarref.revoked ? n6.nk : n6.Fi);
        view.setBackground(L);
        u6.j(view, L, M, null, i6Var);
        frameLayout.addView(view, na.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? 2131232211 : 2131232205);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, na.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int L2 = org.telegram.messenger.g0.L(50.0f);
            int i12 = n6.f29524h5;
            Drawable d02 = n6.d0(L2, n6.w0(i12, i6Var));
            q6 M2 = u6.M(i12);
            frameLayout2.setBackground(d02);
            u6.j(frameLayout2, d02, M2, null, i6Var);
            frameLayout.addView(frameLayout2, na.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 12.0f);
            Drawable d03 = n6.d0(org.telegram.messenger.g0.L(9.5f), n6.w0(connectedbotstarref.revoked ? n6.nk : n6.lk, i6Var));
            q6 M3 = u6.M(connectedbotstarref.revoked ? n6.nk : n6.lk);
            textView.setBackground(d03);
            u6.j(textView, d03, M3, null, i6Var);
            textView.setTextColor(-1);
            textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            kq kqVar = new kq(2131231974, 0);
            kqVar.I = 0.937f;
            kqVar.J = 0.937f;
            kqVar.f36853r = -org.telegram.messenger.g0.L(1.33f);
            kqVar.f36854s = org.telegram.messenger.g0.L(1.0f);
            kqVar.H = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(kqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, na.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        g10.addView(frameLayout, na.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i13 = n6.G6;
        u6.U(textView2, i13, i6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(gd.N0(2131752470, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        g10.addView(textView2, na.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L3 = org.telegram.messenger.g0.L(28.0f);
        int i14 = n6.f29394a7;
        ShapeDrawable d04 = n6.d0(L3, n6.w0(i14, i6Var));
        q6 M4 = u6.M(i14);
        linearLayout3.setBackground(d04);
        u6.j(linearLayout3, d04, M4, null, i6Var);
        p9 p9Var = new p9(context);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        a9 a9Var = new a9((i6) null);
        linearLayout3.addView(p9Var, na.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        u6.U(textView3, i13, i6Var);
        textView3.setText(n5.l(i7, connectedbotstarref.bot_id));
        a9Var.r(c22);
        p9Var.f(c22, a9Var);
        linearLayout3.addView(textView3, na.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i15 = n6.f29709r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        u6.s(imageView2, i15, i6Var, mode);
        imageView2.setImageResource(2131232702);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, na.t(-2, -2, 16, 5, 0, 8, 0));
        g10.addView(linearLayout3, na.t(-2, 28, 1, 4, 0, 4, 0));
        sa.a(linearLayout3);
        TextView textView4 = new TextView(context);
        u6.U(textView4, i13, i6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(org.telegram.messenger.g0.W2(gd.N0(2131752472, null)));
            i10 = i15;
            w2Var = j10;
            linearLayout = linearLayout3;
        } else {
            linearLayout = linearLayout3;
            if (j3 < 0) {
                String J0 = j.J0(connectedbotstarref.commission_permille);
                String q10 = n10.q(c22);
                int i16 = connectedbotstarref.duration_months;
                i10 = i15;
                w2Var = j10;
                if (i16 <= 0) {
                    G2 = gd.N0(2131752489, null);
                    c11 = 0;
                } else if (i16 < 12 || i16 % 12 != 0) {
                    c11 = 0;
                    G2 = gd.G(i16, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c11 = 0;
                    G2 = gd.G(i16 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr = new Object[3];
                objArr[c11] = J0;
                objArr[1] = q10;
                objArr[2] = G2;
                org.telegram.messenger.f3.q(null, null, 2131752473, objArr, textView4);
            } else {
                i10 = i15;
                w2Var = j10;
                String J02 = j.J0(connectedbotstarref.commission_permille);
                String q11 = n10.q(c22);
                int i17 = connectedbotstarref.duration_months;
                if (i17 <= 0) {
                    G = gd.N0(2131752489, null);
                    c10 = 0;
                } else if (i17 < 12 || i17 % 12 != 0) {
                    c10 = 0;
                    G = gd.G(i17, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c10 = 0;
                    G = gd.G(i17 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr2 = new Object[3];
                objArr2[c10] = J02;
                objArr2[1] = q11;
                objArr2[2] = G;
                org.telegram.messenger.f3.q(null, null, 2131752471, objArr2, textView4);
            }
        }
        g10.addView(textView4, na.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i11 = i14;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            u6.U(textView5, i13, i6Var);
            textView5.setTextSize(1, 14.0f);
            org.telegram.messenger.f3.k(textView5, 17, null, 2131752474);
            g10.addView(textView5, na.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            ShapeDrawable d05 = n6.d0(org.telegram.messenger.g0.L(28.0f), n6.w0(i14, i6Var));
            q6 M5 = u6.M(i14);
            linearLayout4.setBackground(d05);
            u6.j(linearLayout4, d05, M5, null, i6Var);
            p9 p9Var2 = new p9(context);
            p9Var2.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
            a9 a9Var2 = new a9((i6) null);
            linearLayout4.addView(p9Var2, na.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            u6.U(textView6, i13, i6Var);
            if (j3 >= 0) {
                TLRPC.User c23 = mp.u1(i7).c2(Long.valueOf(j3));
                a9Var2.r(c23);
                p9Var2.f(c23, a9Var2);
                textView6.setText(n10.q(c23));
                i11 = i14;
            } else {
                i11 = i14;
                TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
                a9Var2.q(O0);
                p9Var2.f(O0, a9Var2);
                textView6.setText(O0 == null ? "" : O0.title);
            }
            linearLayout4.addView(textView6, na.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            u6.s(imageView3, i10, i6Var, mode);
            imageView3.setImageResource(2131230873);
            linearLayout4.addView(imageView3, na.t(-2, -2, 16, 2, 0, 5, 0));
            g10.addView(linearLayout4, na.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        u6.U(textView7, i13, i6Var);
        int L4 = org.telegram.messenger.g0.L(8.0f);
        int i18 = i11;
        int w02 = n6.w0(i18, i6Var);
        int w03 = n6.w0(i18, i6Var);
        int i19 = n6.f29543i6;
        int w10 = n6.w(w03, n6.w0(i19, i6Var));
        org.telegram.ui.Cells.y k02 = n6.k0(L4, L4, L4, L4, w02, w10, w10);
        q6 M6 = u6.M(i18);
        q6 p10 = u6.p(i18, i19);
        textView7.setBackground(k02);
        u6.j(textView7, k02, M6, p10, i6Var);
        textView7.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f));
        String str = connectedbotstarref.url;
        textView7.setText((str == null || !str.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        g10.addView(textView7, na.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        hi.e eVar = new hi.e(context, i6Var, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new kq(2131232109, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) gd.N0(2131752480, null));
            eVar.i(spannableStringBuilder2, false, true);
        } else {
            eVar.i(gd.N0(2131752475, null), false, true);
        }
        g10.addView(eVar, na.o(-1, 48));
        j80 j80Var = new j80(context, i6Var);
        long j11 = connectedbotstarref.participants;
        if (j11 <= 0) {
            G3 = gd.a0(null, null, 2131752478, n10.q(c22));
        } else {
            G3 = gd.G((int) j11, "ChannelAffiliateProgramLinkOpened", n10.q(c22));
        }
        j80Var.setText(G3);
        j80Var.setGravity(17);
        j80Var.setTextSize(1, 12.0f);
        u6.U(j80Var, n6.B6, i6Var);
        u6.G(j80Var, n6.Xc, i6Var);
        g10.addView(j80Var, na.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
        w2Var2.O = g10;
        ai.j jVar = new ai.j(connectedbotstarref, w2Var2, i6Var, c22, 27);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new z4(jVar, 12));
        }
        z2 z2Var = new z2(connectedbotstarref, i7, w2Var2, context, j3, i6Var, jVar);
        org.telegram.ui.ActionBar.w2 w2Var3 = w2Var2;
        eVar.setOnClickListener(z2Var);
        w2Var3.setOnDismissListener(new hi.n1(6));
        if (linearLayout2 != null) {
            di.e0.g(i7).n();
            di.e0.g(i7).o();
            LinearLayout linearLayout5 = linearLayout2;
            z2 z2Var2 = new z2(i7, w2Var3, i6Var, linearLayout5, j3, context, connectedbotstarref);
            w2Var3 = w2Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(z2Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new ai.p2(28, w2Var3, connectedbotstarref2));
        w2Var3.Q(n6.f29524h5);
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && T != null && !org.telegram.messenger.g0.u1(T)) {
            w2Var3.a0(T);
        }
        w2Var3.show();
        return w2Var3;
    }

    public final void I0(java.util.ArrayList r17, org.telegram.ui.Components.b51 r18) {
        throw new UnsupportedOperationException("Method not decompiled: ki.i3.I0(java.util.ArrayList, org.telegram.ui.Components.b51):void");
    }

    @Override
    public final View createView(Context context) {
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        in inVar = new in(context, 6);
        this.V = inVar;
        u6.h(n6.f29542i5, inVar, null);
        super.createView(context);
        this.T = new FrameLayout(context);
        vg.m mVar = new vg.m(context, 1, 3);
        this.U = mVar;
        mVar.setImportantForAccessibility(4);
        vg.f fVar = this.U.f59590b;
        fVar.f59574z = n6.Wk;
        fVar.A = n6.Xk;
        fVar.b();
        this.U.setStarParticlesView(this.f51570e);
        this.T.addView(this.U, na.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(gd.N0(2131752460, null), org.telegram.messenger.g0.W2(gd.N0(2131752461, null)), this.T, null);
        this.f51569c.setOnItemClickListener(new g4(2, this, context));
        this.f51569c.setOnItemLongClickListener(new ab.g(25, this, context));
        v4.l lVar = new v4.l();
        lVar.f59274m = false;
        lVar.C = false;
        lVar.o(kr.h);
        lVar.n(350L);
        this.f51569c.setItemAnimator(lVar);
        this.f51569c.setOnScrollListener(new bi.v1(this, 22));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        j8 j8Var;
        int i11 = ks.O3;
        long j3 = this.S;
        if (i7 == i11) {
            if (((Long) objArr[0]).longValue() == j3) {
                j8 j8Var2 = this.W;
                if (j8Var2 != null) {
                    j8Var2.O(true);
                }
                di.e0.g(this.currentAccount).d(j3).a();
            }
        } else if (i7 == ks.N3 && ((Long) objArr[0]).longValue() == j3 && (j8Var = this.W) != null) {
            j8Var.O(true);
        }
    }

    @Override
    public final v4.i0 k0() {
        j8 j8Var = new j8(this, this.f51569c, getParentActivity(), this.currentAccount, this.classGuid, new y7(this, 21), getResourceProvider(), 5);
        this.W = j8Var;
        return j8Var;
    }

    @Override
    public final ug.t1 m0() {
        e eVar = new e(getParentActivity(), 1);
        eVar.c();
        return eVar;
    }

    @Override
    public final boolean onFragmentCreate() {
        ks.f(this.currentAccount).c(this, ks.O3);
        ks.f(this.currentAccount).c(this, ks.N3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ks.f(this.currentAccount).n(this, ks.O3);
        ks.f(this.currentAccount).n(this, ks.N3);
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
