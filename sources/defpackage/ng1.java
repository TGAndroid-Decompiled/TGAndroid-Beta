package defpackage;

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
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class ng1 extends m15 implements fn7 {
    public final long S;
    public FrameLayout T;
    public it4 U;
    public t62 V;
    public wb W;

    public ng1(long j) {
        this.S = j;
        this.N = true;
        this.M = hl.L(60.0f);
    }

    public static int A0(ng1 ng1Var) {
        return ng1Var.currentAccount;
    }

    public static int B0(ng1 ng1Var) {
        return ng1Var.currentAccount;
    }

    public static void J0(android.content.Context r34, int r35, final org.telegram.tgnet.tl.TL_payments.starRefProgram r36, long r37, defpackage.vnb r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ng1.J0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, vnb, boolean):void");
    }

    public static nx0 K0(Context context, int i, TL_payments.connectedBotStarRef connectedbotstarref, long j, vnb vnbVar) {
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        nx0 nx0Var;
        int i5;
        char c;
        String G;
        int i6;
        char c2;
        String G2;
        int i7;
        LinearLayout linearLayout2;
        String str;
        String G3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        String str2;
        int i8;
        int i9;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        nx0 h = uh9.h(1, vnbVar, context, false);
        TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout j2 = uh9.j(context, 1);
        j2.setPadding(hl.L(16.0f), hl.L(20.0f), hl.L(16.0f), hl.L(8.0f));
        j2.setClipChildren(false);
        j2.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        int L = hl.L(40.0f);
        if (connectedbotstarref.revoked) {
            i2 = aob.nk;
        } else {
            i2 = aob.Fi;
        }
        Drawable K = aob.K(L, aob.v0(i2, vnbVar));
        if (connectedbotstarref.revoked) {
            i3 = aob.nk;
        } else {
            i3 = aob.Fi;
        }
        uob M = yob.M(i3);
        view.setBackground(K);
        yob.j(view, K, M, null, vnbVar);
        frameLayout.addView(view, tre.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        if (connectedbotstarref.revoked) {
            i4 = 2131232211;
        } else {
            i4 = 2131232205;
        }
        imageView.setImageResource(i4);
        if (connectedbotstarref.revoked) {
            f = 2.0f;
        } else {
            f = 1.8f;
        }
        imageView.setScaleX(f);
        if (connectedbotstarref.revoked) {
            f2 = 2.0f;
        } else {
            f2 = 1.8f;
        }
        imageView.setScaleY(f2);
        frameLayout.addView(imageView, tre.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int L2 = hl.L(50.0f);
            int i10 = aob.h5;
            Drawable b0 = aob.b0(L2, aob.v0(i10, vnbVar));
            uob M2 = yob.M(i10);
            frameLayout2.setBackground(b0);
            yob.j(frameLayout2, b0, M2, null, vnbVar);
            frameLayout.addView(frameLayout2, tre.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(hl.o());
            textView.setTextSize(1, 12.0f);
            int L3 = hl.L(9.5f);
            if (connectedbotstarref.revoked) {
                i8 = aob.nk;
            } else {
                i8 = aob.lk;
            }
            Drawable b02 = aob.b0(L3, aob.v0(i8, vnbVar));
            if (connectedbotstarref.revoked) {
                i9 = aob.nk;
            } else {
                i9 = aob.lk;
            }
            uob M3 = yob.M(i9);
            textView.setBackground(b02);
            yob.j(textView, b02, M3, null, vnbVar);
            textView.setTextColor(-1);
            textView.setPadding(hl.L(6.66f), 0, hl.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            wm2 wm2Var = new wm2(2131231974, 0);
            wm2Var.I = 0.937f;
            wm2Var.J = 0.937f;
            wm2Var.r = -hl.L(1.33f);
            wm2Var.s = hl.L(1.0f);
            wm2Var.H = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, tre.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        j2.addView(frameLayout, tre.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i11 = aob.G6;
        yob.X(textView2, i11, vnbVar);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(ob6.M0(2131752457, null));
        textView2.setTypeface(hl.o());
        j2.addView(textView2, tre.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L4 = hl.L(28.0f);
        int i12 = aob.a7;
        ShapeDrawable b03 = aob.b0(L4, aob.v0(i12, vnbVar));
        uob M4 = yob.M(i12);
        linearLayout3.setBackground(b03);
        yob.j(linearLayout3, b03, M4, null, vnbVar);
        de0 de0Var = new de0(context);
        de0Var.setRoundRadius(hl.L(14.0f));
        rb0 rb0Var = new rb0((vnb) null);
        linearLayout3.addView(de0Var, tre.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        yob.X(textView3, i11, vnbVar);
        textView3.setText(wf3.k(i, connectedbotstarref.bot_id));
        rb0Var.q(X1);
        de0Var.f(X1, rb0Var);
        linearLayout3.addView(textView3, tre.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i13 = aob.r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.s(imageView2, i13, vnbVar, mode);
        imageView2.setImageResource(2131232713);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, tre.t(-2, -2, 16, 5, 0, 8, 0));
        j2.addView(linearLayout3, tre.t(-2, 28, 1, 4, 0, 4, 0));
        iye.a(linearLayout3);
        TextView textView4 = new TextView(context);
        yob.X(textView4, i11, vnbVar);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(hl.S2(ob6.M0(2131752459, null)));
            nx0Var = h;
            i5 = i13;
            linearLayout = linearLayout3;
        } else {
            int i14 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            int i15 = connectedbotstarref.commission_permille;
            linearLayout = linearLayout3;
            if (i14 < 0) {
                String J0 = cc.J0(i15);
                String r = lbc.r(X1);
                int i16 = connectedbotstarref.duration_months;
                nx0Var = h;
                i5 = i13;
                if (i16 <= 0) {
                    G2 = ob6.M0(2131752476, null);
                    c2 = 0;
                } else if (i16 >= 12 && i16 % 12 == 0) {
                    c2 = 0;
                    G2 = ob6.G(i16 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                } else {
                    c2 = 0;
                    G2 = ob6.G(i16, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                }
                Object[] objArr = new Object[3];
                objArr[c2] = J0;
                objArr[1] = r;
                objArr[2] = G2;
                uh9.r(null, null, 2131752460, objArr, textView4);
            } else {
                nx0Var = h;
                i5 = i13;
                String J02 = cc.J0(i15);
                String r2 = lbc.r(X1);
                int i17 = connectedbotstarref.duration_months;
                if (i17 <= 0) {
                    G = ob6.M0(2131752476, null);
                    i6 = 3;
                    c = 0;
                } else {
                    if (i17 >= 12 && i17 % 12 == 0) {
                        c = 0;
                        G = ob6.G(i17 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                    } else {
                        c = 0;
                        G = ob6.G(i17, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                    }
                    i6 = 3;
                }
                Object[] objArr2 = new Object[i6];
                objArr2[c] = J02;
                objArr2[1] = r2;
                objArr2[2] = G;
                uh9.r(null, null, 2131752458, objArr2, textView4);
            }
        }
        j2.addView(textView4, tre.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (!connectedbotstarref.revoked) {
            TextView textView5 = new TextView(context);
            yob.X(textView5, i11, vnbVar);
            textView5.setTextSize(1, 14.0f);
            uh9.q(textView5, 17, null, 2131752461);
            j2.addView(textView5, tre.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            ShapeDrawable b04 = aob.b0(hl.L(28.0f), aob.v0(i12, vnbVar));
            uob M5 = yob.M(i12);
            linearLayout4.setBackground(b04);
            yob.j(linearLayout4, b04, M5, null, vnbVar);
            de0 de0Var2 = new de0(context);
            de0Var2.setRoundRadius(hl.L(14.0f));
            rb0 rb0Var2 = new rb0((vnb) null);
            linearLayout4.addView(de0Var2, tre.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            yob.X(textView6, i11, vnbVar);
            if (j >= 0) {
                TLRPC.User X12 = uc7.s1(i).X1(Long.valueOf(j));
                rb0Var2.q(X12);
                de0Var2.f(X12, rb0Var2);
                textView6.setText(lbc.r(X12));
                i7 = i12;
            } else {
                i7 = i12;
                TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
                rb0Var2.p(M0);
                de0Var2.f(M0, rb0Var2);
                if (M0 == null) {
                    str2 = "";
                } else {
                    str2 = M0.title;
                }
                textView6.setText(str2);
            }
            linearLayout4.addView(textView6, tre.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            yob.s(imageView3, i5, vnbVar, mode);
            imageView3.setImageResource(2131230873);
            linearLayout4.addView(imageView3, tre.t(-2, -2, 16, 2, 0, 5, 0));
            j2.addView(linearLayout4, tre.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        } else {
            i7 = i12;
            linearLayout2 = null;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        yob.X(textView7, i11, vnbVar);
        int L5 = hl.L(8.0f);
        int i18 = i7;
        int v0 = aob.v0(i18, vnbVar);
        int v02 = aob.v0(i18, vnbVar);
        int i19 = aob.i6;
        int v = aob.v(v02, aob.v0(i19, vnbVar));
        hf0 i0 = aob.i0(L5, L5, L5, L5, v0, v, v);
        uob M6 = yob.M(i18);
        uob p = yob.p(i18, i19);
        textView7.setBackground(i0);
        yob.j(textView7, i0, M6, p, vnbVar);
        textView7.setPadding(hl.L(16.0f), hl.L(14.66f), hl.L(16.0f), hl.L(14.66f));
        String str3 = connectedbotstarref.url;
        if (str3 != null && str3.startsWith("https://")) {
            str = connectedbotstarref.url.substring(8);
        } else {
            str = connectedbotstarref.url;
        }
        textView7.setText(str);
        j2.addView(textView7, tre.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        c51 c51Var = new c51(vnbVar, context, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new wm2(2131232109, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) ob6.M0(2131752467, null));
            c51Var.i(spannableStringBuilder2, false, true);
        } else {
            c51Var.i(ob6.M0(2131752462, null), false, true);
        }
        j2.addView(c51Var, tre.o(-1, 48));
        p66 p66Var = new p66(context, vnbVar);
        long j3 = connectedbotstarref.participants;
        if (j3 <= 0) {
            G3 = ob6.a0(null, null, 2131752465, lbc.r(X1));
        } else {
            G3 = ob6.G((int) j3, "ChannelAffiliateProgramLinkOpened", lbc.r(X1));
        }
        p66Var.setText(G3);
        p66Var.setGravity(17);
        p66Var.setTextSize(1, 12.0f);
        yob.X(p66Var, aob.B6, vnbVar);
        yob.G(p66Var, aob.Xc, vnbVar);
        j2.addView(p66Var, tre.t(-1, -2, 49, 14, 12, 14, 2));
        nx0 nx0Var2 = nx0Var;
        nx0Var2.O = j2;
        o97 o97Var = new o97(connectedbotstarref, nx0Var2, vnbVar, X1, (byte) 24);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new r81(o97Var, (byte) 6));
        }
        fg1 fg1Var = new fg1(connectedbotstarref, i, nx0Var2, context, j, vnbVar, o97Var);
        nx0 nx0Var3 = nx0Var2;
        c51Var.setOnClickListener(fg1Var);
        nx0Var3.setOnDismissListener(new h5((byte) 6));
        if (linearLayout2 != null) {
            kt0.g(i).n();
            kt0.g(i).o();
            LinearLayout linearLayout5 = linearLayout2;
            fg1 fg1Var2 = new fg1(i, nx0Var3, vnbVar, linearLayout5, j, context, connectedbotstarref);
            nx0Var3 = nx0Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(fg1Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new sb1(nx0Var3, connectedbotstarref2, (byte) 1));
        nx0Var3.L(aob.h5);
        e S = LaunchActivity.S();
        if (!hl.O1() && S != null && !hl.s1(S)) {
            nx0Var3.X(S);
        }
        nx0Var3.show();
        return nx0Var3;
    }

    public final void D0(java.util.ArrayList r18, defpackage.l9c r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ng1.D0(java.util.ArrayList, l9c):void");
    }

    public final void E0(Context context, int i) {
        wb wbVar = this.W;
        if (wbVar != null) {
            Object obj = wbVar.G(i).H;
            if (obj instanceof TL_payments.starRefProgram) {
                J0(context, this.currentAccount, (TL_payments.starRefProgram) obj, this.S, this.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                K0(context, this.currentAccount, (TL_payments.connectedBotStarRef) obj, this.S, this.resourceProvider);
            }
        }
    }

    public final void F0(TLObject tLObject, id idVar) {
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            kt0 g = kt0.g(this.currentAccount);
            long j = this.S;
            ht0 d = g.d(j);
            ArrayList arrayList = d.e;
            int i = d.a;
            uc7.s1(i).j4(connectedstarrefbots.users, false);
            for (int i2 = 0; i2 < connectedstarrefbots.connected_bots.size(); i2++) {
                TL_payments.connectedBotStarRef connectedbotstarref = connectedstarrefbots.connected_bots.get(i2);
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        break;
                    } else if (((TL_payments.connectedBotStarRef) arrayList.get(i3)).bot_id == connectedbotstarref.bot_id) {
                        if (connectedbotstarref.revoked) {
                            arrayList.remove(i3);
                            d.c = Math.max(d.c - 1, 0);
                        } else {
                            arrayList.set(i3, connectedbotstarref);
                        }
                    } else {
                        i3++;
                    }
                }
            }
            jn7.f(i).k(jn7.O3, Long.valueOf(d.b));
            d.a();
            it0 e = kt0.g(this.currentAccount).e(j);
            e.c = 0;
            e.d = false;
            e.i = false;
            e.f = 0L;
            e.j = null;
            e.h = false;
            e.a();
            this.W.O(true);
        }
        idVar.dismiss();
    }

    public final void G0(TL_payments.connectedBotStarRef connectedbotstarref) {
        id idVar = new id(3, null, getParentActivity());
        idVar.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = uc7.s1(this.currentAccount).j1(this.S);
        editconnectedstarrefbot.revoked = true;
        getConnectionsManager().sendRequest(editconnectedstarrefbot, new ql(this, idVar, (byte) 10));
    }

    public final void H0(Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, context);
        String M0 = ob6.M0(2131748761, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = hl.S2(ob6.a0(null, null, 2131748760, lbc.r(user)));
        alertDialog$Builder.j(ob6.M0(2131748759, null), new h01(this, connectedbotstarref, (byte) 9));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.c(-1);
        alertDialog$Builder.o();
    }

    public final boolean I0(Context context, View view, int i) {
        wb wbVar = this.W;
        if (wbVar != null) {
            Object obj = wbVar.G(i).H;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(connectedbotstarref.bot_id));
                fu5 I = fu5.I(this, view);
                I.k(2131232077, ob6.M0(2131746435, null), new z21(this, X1, (byte) 20), X1.bot_has_main_app);
                I.k(2131232077, ob6.M0(2131752893, null), new z21(this, connectedbotstarref, (byte) 21), !X1.bot_has_main_app);
                I.b(2131232209, ob6.M0(2131751727, null), new tu0(this, connectedbotstarref, X1, (byte) 17), false);
                I.l(2131232200, new o97(this, context, X1, connectedbotstarref, (byte) 23), ob6.M0(2131748759, null), !connectedbotstarref.revoked, true);
                I.W(5);
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.H = false;
        this.F = hl.L(238.0f);
        t62 t62Var = new t62(context, (byte) 4);
        this.V = t62Var;
        yob.h(aob.i5, null, t62Var);
        super.createView(context);
        this.T = new FrameLayout(context);
        it4 it4Var = new it4(context, 1, 3);
        this.U = it4Var;
        it4Var.setImportantForAccessibility(4);
        ys4 ys4Var = this.U.b;
        ys4Var.z = aob.Wk;
        ys4Var.A = aob.Xk;
        ys4Var.b();
        this.U.setStarParticlesView(this.e);
        this.T.addView(this.U, tre.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        i0(ob6.M0(2131752447, null), hl.S2(ob6.M0(2131752448, null)), this.T, null);
        this.c.setOnItemClickListener(new l0(this, context, (byte) 4));
        this.c.setOnItemLongClickListener(new h01(this, context, (byte) 8));
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.c.setItemAnimator(zb3Var);
        this.c.setOnScrollListener(new y(this, (byte) 14));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        wb wbVar;
        int i3 = jn7.O3;
        long j = this.S;
        if (i == i3) {
            if (((Long) objArr[0]).longValue() == j) {
                wb wbVar2 = this.W;
                if (wbVar2 != null) {
                    wbVar2.O(true);
                }
                kt0.g(this.currentAccount).d(j).a();
            }
        } else if (i == jn7.N3 && ((Long) objArr[0]).longValue() == j && (wbVar = this.W) != null) {
            wbVar.O(true);
        }
    }

    @Override
    public final j79 j0() {
        wb wbVar = new wb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new c(this, (byte) 23), getResourceProvider(), (byte) 1);
        this.W = wbVar;
        return wbVar;
    }

    @Override
    public final eva l0() {
        vb vbVar = new vb(getParentActivity(), (byte) 1);
        vbVar.c();
        return vbVar;
    }

    @Override
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.O3);
        jn7.f(this.currentAccount).b(this, jn7.N3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, jn7.O3);
        jn7.f(this.currentAccount).n(this, jn7.N3);
    }

    @Override
    public final void onPause() {
        super.onPause();
        it4 it4Var = this.U;
        if (it4Var != null) {
            it4Var.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        it4 it4Var = this.U;
        if (it4Var != null) {
            it4Var.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }
}
