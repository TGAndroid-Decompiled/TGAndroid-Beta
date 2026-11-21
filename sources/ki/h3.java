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
import bi.h8;
import c8.ma;
import c8.ra;
import fi.g4;
import hi.d7;
import hi.o4;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s00;
public final class h3 extends s00 implements fs {
    public final long S;
    public FrameLayout T;
    public vg.m U;
    public ln V;
    public h8 W;

    public h3(long j3) {
        this.S = j3;
        this.N = true;
        this.M = org.telegram.messenger.g0.L(60.0f);
    }

    public static void A0(h3 h3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h3Var.resourceProvider);
        String N0 = gd.N0(2131748814, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131748813, o10.q(user)));
        alertDialog$Builder.k(gd.N0(2131748812, null), new ab.g(24, h3Var, connectedbotstarref));
        alertDialog$Builder.h(gd.N0(2131752577, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void B0(h3 h3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, h3Var.getParentActivity(), null);
        t1Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = mp.u1(h3Var.currentAccount).l1(h3Var.S);
        editconnectedstarrefbot.revoked = true;
        h3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new bi.o1(25, h3Var, t1Var));
    }

    public static void C0(h3 h3Var, Context context, int i7) {
        h8 h8Var = h3Var.W;
        if (h8Var != null) {
            Object obj = h8Var.G(i7).H;
            if (obj instanceof TL_payments.starRefProgram) {
                J0(context, h3Var.currentAccount, (TL_payments.starRefProgram) obj, h3Var.S, h3Var.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                K0(context, h3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, h3Var.S, h3Var.resourceProvider);
            }
        }
    }

    public static void D0(h3 h3Var, TLObject tLObject, org.telegram.ui.ActionBar.t1 t1Var) {
        long j3 = h3Var.S;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            di.b0 d = di.e0.g(h3Var.currentAccount).d(j3);
            ArrayList arrayList = d.f8537e;
            int i7 = d.f8534a;
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
                            d.f8536c = Math.max(d.f8536c - 1, 0);
                        } else {
                            arrayList.set(i11, connectedbotstarref);
                        }
                    } else {
                        i11++;
                    }
                }
            }
            ks.f(i7).k(ks.O3, Long.valueOf(d.f8535b));
            d.a();
            di.c0 e10 = di.e0.g(h3Var.currentAccount).e(j3);
            e10.f8607c = 0;
            e10.d = false;
            e10.f8611i = false;
            e10.f8609f = 0L;
            e10.f8612j = null;
            e10.h = false;
            e10.a();
            h3Var.W.O(true);
        }
        t1Var.dismiss();
    }

    public static boolean E0(h3 h3Var, Context context, View view, int i7) {
        h8 h8Var = h3Var.W;
        if (h8Var != null) {
            Object obj = h8Var.G(i7).H;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User c22 = mp.u1(h3Var.currentAccount).c2(Long.valueOf(connectedbotstarref.bot_id));
                a70 I = a70.I(h3Var, view);
                I.l(2131232074, gd.N0(2131746512, null), new ji.i(12, h3Var, c22), c22.bot_has_main_app);
                I.l(2131232074, gd.N0(2131752900, null), new ji.i(13, h3Var, connectedbotstarref), !c22.bot_has_main_app);
                I.c(2131232206, gd.N0(2131751750, null), new kg.y(h3Var, connectedbotstarref, c22, 8), false);
                I.m(2131232197, new ai.r(h3Var, context, c22, connectedbotstarref, 27), gd.N0(2131748812, null), !connectedbotstarref.revoked, true);
                I.W(5);
                I.a0();
                return true;
            }
        }
        return false;
    }

    public static int F0(h3 h3Var) {
        return h3Var.currentAccount;
    }

    public static int G0(h3 h3Var) {
        return h3Var.currentAccount;
    }

    public static void J0(android.content.Context r34, int r35, final org.telegram.tgnet.tl.TL_payments.starRefProgram r36, long r37, org.telegram.ui.ActionBar.h6 r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: ki.h3.J0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, org.telegram.ui.ActionBar.h6, boolean):void");
    }

    public static org.telegram.ui.ActionBar.w2 K0(Context context, int i7, TL_payments.connectedBotStarRef connectedbotstarref, long j3, h6 h6Var) {
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        int i13;
        org.telegram.ui.ActionBar.w2 w2Var;
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
        org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context, h6Var, false);
        TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        int L = org.telegram.messenger.g0.L(40.0f);
        if (connectedbotstarref.revoked) {
            i10 = m6.nk;
        } else {
            i10 = m6.Fi;
        }
        Drawable L2 = m6.L(L, m6.w0(i10, h6Var));
        if (connectedbotstarref.revoked) {
            i11 = m6.nk;
        } else {
            i11 = m6.Fi;
        }
        p6 M = t6.M(i11);
        view.setBackground(L2);
        t6.j(view, L2, M, null, h6Var);
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
            int i17 = m6.f29451h5;
            Drawable d02 = m6.d0(L3, m6.w0(i17, h6Var));
            p6 M2 = t6.M(i17);
            frameLayout2.setBackground(d02);
            t6.j(frameLayout2, d02, M2, null, h6Var);
            frameLayout.addView(frameLayout2, ma.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 12.0f);
            int L4 = org.telegram.messenger.g0.L(9.5f);
            if (connectedbotstarref.revoked) {
                i15 = m6.nk;
            } else {
                i15 = m6.lk;
            }
            Drawable d03 = m6.d0(L4, m6.w0(i15, h6Var));
            if (connectedbotstarref.revoked) {
                i16 = m6.nk;
            } else {
                i16 = m6.lk;
            }
            p6 M3 = t6.M(i16);
            textView.setBackground(d03);
            t6.j(textView, d03, M3, null, h6Var);
            textView.setTextColor(-1);
            textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            nq nqVar = new nq(2131231971, 0);
            nqVar.I = 0.937f;
            nqVar.J = 0.937f;
            nqVar.f37946r = -org.telegram.messenger.g0.L(1.33f);
            nqVar.f37947s = org.telegram.messenger.g0.L(1.0f);
            nqVar.H = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, ma.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        g10.addView(frameLayout, ma.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i18 = m6.G6;
        t6.U(textView2, i18, h6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(gd.N0(2131752470, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        g10.addView(textView2, ma.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L5 = org.telegram.messenger.g0.L(28.0f);
        int i19 = m6.f29321a7;
        ShapeDrawable d04 = m6.d0(L5, m6.w0(i19, h6Var));
        p6 M4 = t6.M(i19);
        linearLayout3.setBackground(d04);
        t6.j(linearLayout3, d04, M4, null, h6Var);
        q9 q9Var = new q9(context);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        b9 b9Var = new b9((h6) null);
        linearLayout3.addView(q9Var, ma.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        t6.U(textView3, i18, h6Var);
        textView3.setText(n5.l(i7, connectedbotstarref.bot_id));
        b9Var.r(c22);
        q9Var.f(c22, b9Var);
        linearLayout3.addView(textView3, ma.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i20 = m6.f29636r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        t6.s(imageView2, i20, h6Var, mode);
        imageView2.setImageResource(2131232699);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, ma.t(-2, -2, 16, 5, 0, 8, 0));
        g10.addView(linearLayout3, ma.t(-2, 28, 1, 4, 0, 4, 0));
        ra.a(linearLayout3);
        TextView textView4 = new TextView(context);
        t6.U(textView4, i18, h6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(org.telegram.messenger.g0.W2(gd.N0(2131752472, null)));
            i13 = i20;
            w2Var = j10;
            linearLayout = linearLayout3;
        } else {
            linearLayout = linearLayout3;
            if (j3 < 0) {
                String J0 = j.J0(connectedbotstarref.commission_permille);
                String q10 = o10.q(c22);
                int i21 = connectedbotstarref.duration_months;
                i13 = i20;
                w2Var = j10;
                if (i21 <= 0) {
                    G2 = gd.N0(2131752489, null);
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
                org.telegram.messenger.f3.q(null, null, 2131752473, objArr, textView4);
            } else {
                i13 = i20;
                w2Var = j10;
                String J02 = j.J0(connectedbotstarref.commission_permille);
                String q11 = o10.q(c22);
                int i22 = connectedbotstarref.duration_months;
                if (i22 <= 0) {
                    G = gd.N0(2131752489, null);
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
                org.telegram.messenger.f3.q(null, null, 2131752471, objArr2, textView4);
            }
        }
        g10.addView(textView4, ma.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (!connectedbotstarref.revoked) {
            TextView textView5 = new TextView(context);
            t6.U(textView5, i18, h6Var);
            textView5.setTextSize(1, 14.0f);
            org.telegram.messenger.f3.k(textView5, 17, null, 2131752474);
            g10.addView(textView5, ma.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            ShapeDrawable d05 = m6.d0(org.telegram.messenger.g0.L(28.0f), m6.w0(i19, h6Var));
            p6 M5 = t6.M(i19);
            linearLayout4.setBackground(d05);
            t6.j(linearLayout4, d05, M5, null, h6Var);
            q9 q9Var2 = new q9(context);
            q9Var2.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
            b9 b9Var2 = new b9((h6) null);
            linearLayout4.addView(q9Var2, ma.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            t6.U(textView6, i18, h6Var);
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
            t6.s(imageView3, i13, h6Var, mode);
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
        t6.U(textView7, i18, h6Var);
        int L6 = org.telegram.messenger.g0.L(8.0f);
        int i23 = i14;
        int w02 = m6.w0(i23, h6Var);
        int w03 = m6.w0(i23, h6Var);
        int i24 = m6.f29470i6;
        int w10 = m6.w(w03, m6.w0(i24, h6Var));
        org.telegram.ui.Cells.y k02 = m6.k0(L6, L6, L6, L6, w02, w10, w10);
        p6 M6 = t6.M(i23);
        p6 p10 = t6.p(i23, i24);
        textView7.setBackground(k02);
        t6.j(textView7, k02, M6, p10, h6Var);
        textView7.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.66f));
        String str3 = connectedbotstarref.url;
        if (str3 != null && str3.startsWith("https://")) {
            str = connectedbotstarref.url.substring(8);
        } else {
            str = connectedbotstarref.url;
        }
        textView7.setText(str);
        g10.addView(textView7, ma.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        hi.e eVar = new hi.e(context, h6Var, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new nq(2131232106, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) gd.N0(2131752480, null));
            eVar.i(spannableStringBuilder2, false, true);
        } else {
            eVar.i(gd.N0(2131752475, null), false, true);
        }
        g10.addView(eVar, ma.o(-1, 48));
        m80 m80Var = new m80(context, h6Var);
        long j11 = connectedbotstarref.participants;
        if (j11 <= 0) {
            G3 = gd.a0(null, null, 2131752478, o10.q(c22));
        } else {
            G3 = gd.G((int) j11, "ChannelAffiliateProgramLinkOpened", o10.q(c22));
        }
        m80Var.setText(G3);
        m80Var.setGravity(17);
        m80Var.setTextSize(1, 12.0f);
        t6.U(m80Var, m6.B6, h6Var);
        t6.G(m80Var, m6.Xc, h6Var);
        g10.addView(m80Var, ma.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
        w2Var2.O = g10;
        ai.r rVar = new ai.r(connectedbotstarref, w2Var2, h6Var, c22, 26);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new o4(rVar, 12));
        }
        y2 y2Var = new y2(connectedbotstarref, i7, w2Var2, context, j3, h6Var, rVar);
        org.telegram.ui.ActionBar.w2 w2Var3 = w2Var2;
        eVar.setOnClickListener(y2Var);
        w2Var3.setOnDismissListener(new hi.f1(6));
        if (linearLayout2 != null) {
            di.e0.g(i7).n();
            di.e0.g(i7).o();
            LinearLayout linearLayout5 = linearLayout2;
            y2 y2Var2 = new y2(i7, w2Var3, h6Var, linearLayout5, j3, context, connectedbotstarref);
            w2Var3 = w2Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(y2Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new ai.x2(28, w2Var3, connectedbotstarref2));
        w2Var3.Q(m6.f29451h5);
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && T != null && !org.telegram.messenger.g0.u1(T)) {
            w2Var3.a0(T);
        }
        w2Var3.show();
        return w2Var3;
    }

    public final void I0(java.util.ArrayList r17, org.telegram.ui.Components.c51 r18) {
        throw new UnsupportedOperationException("Method not decompiled: ki.h3.I0(java.util.ArrayList, org.telegram.ui.Components.c51):void");
    }

    @Override
    public final View createView(Context context) {
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        ln lnVar = new ln(context, 6);
        this.V = lnVar;
        t6.h(m6.f29469i5, lnVar, null);
        super.createView(context);
        this.T = new FrameLayout(context);
        vg.m mVar = new vg.m(context, 1, 3);
        this.U = mVar;
        mVar.setImportantForAccessibility(4);
        vg.f fVar = this.U.f59501b;
        fVar.f59485z = m6.Wk;
        fVar.A = m6.Xk;
        fVar.b();
        this.U.setStarParticlesView(this.f51800e);
        this.T.addView(this.U, ma.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(gd.N0(2131752460, null), org.telegram.messenger.g0.W2(gd.N0(2131752461, null)), this.T, null);
        this.f51799c.setOnItemClickListener(new g4(2, this, context));
        this.f51799c.setOnItemLongClickListener(new ab.g(25, this, context));
        v4.k kVar = new v4.k();
        kVar.f59190m = false;
        kVar.C = false;
        kVar.o(nr.h);
        kVar.n(350L);
        this.f51799c.setItemAnimator(kVar);
        this.f51799c.setOnScrollListener(new bi.u1(this, 22));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h8 h8Var;
        int i11 = ks.O3;
        long j3 = this.S;
        if (i7 == i11) {
            if (((Long) objArr[0]).longValue() == j3) {
                h8 h8Var2 = this.W;
                if (h8Var2 != null) {
                    h8Var2.O(true);
                }
                di.e0.g(this.currentAccount).d(j3).a();
            }
        } else if (i7 == ks.N3 && ((Long) objArr[0]).longValue() == j3 && (h8Var = this.W) != null) {
            h8Var.O(true);
        }
    }

    @Override
    public final v4.i0 k0() {
        h8 h8Var = new h8(this, this.f51799c, getParentActivity(), this.currentAccount, this.classGuid, new d7(this, 21), getResourceProvider(), 5);
        this.W = h8Var;
        return h8Var;
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
