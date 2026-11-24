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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class mh1 extends h15 implements jm7 {
    public final long S;
    public FrameLayout T;
    public ft4 U;
    public o72 V;
    public vb W;

    public mh1(long j) {
        this.S = j;
        this.N = true;
        this.M = gm.L(60.0f);
    }

    public static int A0(mh1 mh1Var) {
        return mh1Var.currentAccount;
    }

    public static int B0(mh1 mh1Var) {
        return mh1Var.currentAccount;
    }

    public static void J0(android.content.Context r34, int r35, final org.telegram.tgnet.tl.TL_payments.starRefProgram r36, long r37, defpackage.ylb r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh1.J0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, ylb, boolean):void");
    }

    public static my0 K0(Context context, int i, TL_payments.connectedBotStarRef connectedbotstarref, long j, ylb ylbVar) {
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        my0 my0Var;
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
        my0 h = hg9.h(1, ylbVar, context, false);
        TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout i10 = hg9.i(context, 1);
        i10.setPadding(gm.L(16.0f), gm.L(20.0f), gm.L(16.0f), gm.L(8.0f));
        i10.setClipChildren(false);
        i10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        int L = gm.L(40.0f);
        if (connectedbotstarref.revoked) {
            i2 = cmb.mk;
        } else {
            i2 = cmb.Ei;
        }
        Drawable K = cmb.K(L, cmb.v0(i2, ylbVar));
        if (connectedbotstarref.revoked) {
            i3 = cmb.mk;
        } else {
            i3 = cmb.Ei;
        }
        wmb M = anb.M(i3);
        view.setBackground(K);
        anb.j(view, K, M, null, ylbVar);
        frameLayout.addView(view, qoe.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        if (connectedbotstarref.revoked) {
            i4 = 2131232212;
        } else {
            i4 = 2131232206;
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
        frameLayout.addView(imageView, qoe.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int L2 = gm.L(50.0f);
            int i11 = cmb.g5;
            Drawable b0 = cmb.b0(L2, cmb.v0(i11, ylbVar));
            wmb M2 = anb.M(i11);
            frameLayout2.setBackground(b0);
            anb.j(frameLayout2, b0, M2, null, ylbVar);
            frameLayout.addView(frameLayout2, qoe.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(gm.o());
            textView.setTextSize(1, 12.0f);
            int L3 = gm.L(9.5f);
            if (connectedbotstarref.revoked) {
                i8 = cmb.mk;
            } else {
                i8 = cmb.kk;
            }
            Drawable b02 = cmb.b0(L3, cmb.v0(i8, ylbVar));
            if (connectedbotstarref.revoked) {
                i9 = cmb.mk;
            } else {
                i9 = cmb.kk;
            }
            wmb M3 = anb.M(i9);
            textView.setBackground(b02);
            anb.j(textView, b02, M3, null, ylbVar);
            textView.setTextColor(-1);
            textView.setPadding(gm.L(6.66f), 0, gm.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            pn2 pn2Var = new pn2(2131231975, 0);
            pn2Var.I = 0.937f;
            pn2Var.J = 0.937f;
            pn2Var.r = -gm.L(1.33f);
            pn2Var.s = gm.L(1.0f);
            pn2Var.H = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, qoe.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        i10.addView(frameLayout, qoe.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i12 = cmb.F6;
        anb.X(textView2, i12, ylbVar);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(jb6.M0(2131752429, null));
        textView2.setTypeface(gm.o());
        i10.addView(textView2, qoe.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L4 = gm.L(28.0f);
        int i13 = cmb.Z6;
        ShapeDrawable b03 = cmb.b0(L4, cmb.v0(i13, ylbVar));
        wmb M4 = anb.M(i13);
        linearLayout3.setBackground(b03);
        anb.j(linearLayout3, b03, M4, null, ylbVar);
        bf0 bf0Var = new bf0(context);
        bf0Var.setRoundRadius(gm.L(14.0f));
        pc0 pc0Var = new pc0((ylb) null);
        linearLayout3.addView(bf0Var, qoe.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        anb.X(textView3, i12, ylbVar);
        textView3.setText(pg3.k(i, connectedbotstarref.bot_id));
        pc0Var.q(W1);
        bf0Var.f(W1, pc0Var);
        linearLayout3.addView(textView3, qoe.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i14 = cmb.q5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(imageView2, i14, ylbVar, mode);
        imageView2.setImageResource(2131232714);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, qoe.t(-2, -2, 16, 5, 0, 8, 0));
        i10.addView(linearLayout3, qoe.t(-2, 28, 1, 4, 0, 4, 0));
        rve.a(linearLayout3);
        TextView textView4 = new TextView(context);
        anb.X(textView4, i12, ylbVar);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(gm.S2(jb6.M0(2131752431, null)));
            my0Var = h;
            i5 = i14;
            linearLayout = linearLayout3;
        } else {
            int i15 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            int i16 = connectedbotstarref.commission_permille;
            linearLayout = linearLayout3;
            if (i15 < 0) {
                String J0 = bc.J0(i16);
                String r = m9c.r(W1);
                int i17 = connectedbotstarref.duration_months;
                my0Var = h;
                i5 = i14;
                if (i17 <= 0) {
                    G2 = jb6.M0(2131752448, null);
                    c2 = 0;
                } else if (i17 >= 12 && i17 % 12 == 0) {
                    c2 = 0;
                    G2 = jb6.G(i17 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                } else {
                    c2 = 0;
                    G2 = jb6.G(i17, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                }
                Object[] objArr = new Object[3];
                objArr[c2] = J0;
                objArr[1] = r;
                objArr[2] = G2;
                hg9.q(null, null, 2131752432, objArr, textView4);
            } else {
                my0Var = h;
                i5 = i14;
                String J02 = bc.J0(i16);
                String r2 = m9c.r(W1);
                int i18 = connectedbotstarref.duration_months;
                if (i18 <= 0) {
                    G = jb6.M0(2131752448, null);
                    i6 = 3;
                    c = 0;
                } else {
                    if (i18 >= 12 && i18 % 12 == 0) {
                        c = 0;
                        G = jb6.G(i18 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                    } else {
                        c = 0;
                        G = jb6.G(i18, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                    }
                    i6 = 3;
                }
                Object[] objArr2 = new Object[i6];
                objArr2[c] = J02;
                objArr2[1] = r2;
                objArr2[2] = G;
                hg9.q(null, null, 2131752430, objArr2, textView4);
            }
        }
        i10.addView(textView4, qoe.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (!connectedbotstarref.revoked) {
            TextView textView5 = new TextView(context);
            anb.X(textView5, i12, ylbVar);
            textView5.setTextSize(1, 14.0f);
            hg9.p(textView5, 17, null, 2131752433);
            i10.addView(textView5, qoe.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            ShapeDrawable b04 = cmb.b0(gm.L(28.0f), cmb.v0(i13, ylbVar));
            wmb M5 = anb.M(i13);
            linearLayout4.setBackground(b04);
            anb.j(linearLayout4, b04, M5, null, ylbVar);
            bf0 bf0Var2 = new bf0(context);
            bf0Var2.setRoundRadius(gm.L(14.0f));
            pc0 pc0Var2 = new pc0((ylb) null);
            linearLayout4.addView(bf0Var2, qoe.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            anb.X(textView6, i12, ylbVar);
            if (j >= 0) {
                TLRPC.User W12 = oc7.r1(i).W1(Long.valueOf(j));
                pc0Var2.q(W12);
                bf0Var2.f(W12, pc0Var2);
                textView6.setText(m9c.r(W12));
                i7 = i13;
            } else {
                i7 = i13;
                TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
                pc0Var2.p(L0);
                bf0Var2.f(L0, pc0Var2);
                if (L0 == null) {
                    str2 = "";
                } else {
                    str2 = L0.title;
                }
                textView6.setText(str2);
            }
            linearLayout4.addView(textView6, qoe.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            anb.s(imageView3, i5, ylbVar, mode);
            imageView3.setImageResource(2131230874);
            linearLayout4.addView(imageView3, qoe.t(-2, -2, 16, 2, 0, 5, 0));
            i10.addView(linearLayout4, qoe.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        } else {
            i7 = i13;
            linearLayout2 = null;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        anb.X(textView7, i12, ylbVar);
        int L5 = gm.L(8.0f);
        int i19 = i7;
        int v0 = cmb.v0(i19, ylbVar);
        int v02 = cmb.v0(i19, ylbVar);
        int i20 = cmb.h6;
        int v = cmb.v(v02, cmb.v0(i20, ylbVar));
        fg0 i0 = cmb.i0(L5, L5, L5, L5, v0, v, v);
        wmb M6 = anb.M(i19);
        wmb p = anb.p(i19, i20);
        textView7.setBackground(i0);
        anb.j(textView7, i0, M6, p, ylbVar);
        textView7.setPadding(gm.L(16.0f), gm.L(14.66f), gm.L(16.0f), gm.L(14.66f));
        String str3 = connectedbotstarref.url;
        if (str3 != null && str3.startsWith("https://")) {
            str = connectedbotstarref.url.substring(8);
        } else {
            str = connectedbotstarref.url;
        }
        textView7.setText(str);
        i10.addView(textView7, qoe.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        b61 b61Var = new b61(ylbVar, context, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new pn2(2131232110, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) jb6.M0(2131752439, null));
            b61Var.i(spannableStringBuilder2, false, true);
        } else {
            b61Var.i(jb6.M0(2131752434, null), false, true);
        }
        i10.addView(b61Var, qoe.o(-1, 48));
        l66 l66Var = new l66(context, ylbVar);
        long j2 = connectedbotstarref.participants;
        if (j2 <= 0) {
            G3 = jb6.a0(null, null, 2131752437, m9c.r(W1));
        } else {
            G3 = jb6.G((int) j2, "ChannelAffiliateProgramLinkOpened", m9c.r(W1));
        }
        l66Var.setText(G3);
        l66Var.setGravity(17);
        l66Var.setTextSize(1, 12.0f);
        anb.X(l66Var, cmb.A6, ylbVar);
        anb.G(l66Var, cmb.Wc, ylbVar);
        i10.addView(l66Var, qoe.t(-1, -2, 49, 14, 12, 14, 2));
        my0 my0Var2 = my0Var;
        my0Var2.O = i10;
        l97 l97Var = new l97(connectedbotstarref, my0Var2, ylbVar, W1, (byte) 23);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new k81(l97Var, (byte) 7));
        }
        ch1 ch1Var = new ch1(connectedbotstarref, i, my0Var2, context, j, ylbVar, l97Var);
        my0 my0Var3 = my0Var2;
        b61Var.setOnClickListener(ch1Var);
        my0Var3.setOnDismissListener(new g5((byte) 6));
        if (linearLayout2 != null) {
            ku0.g(i).n();
            ku0.g(i).o();
            LinearLayout linearLayout5 = linearLayout2;
            ch1 ch1Var2 = new ch1(i, my0Var3, ylbVar, linearLayout5, j, context, connectedbotstarref);
            my0Var3 = my0Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(ch1Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new rc1(my0Var3, connectedbotstarref2, (byte) 1));
        my0Var3.L(cmb.g5);
        d S = LaunchActivity.S();
        if (!gm.O1() && S != null && !gm.s1(S)) {
            my0Var3.X(S);
        }
        my0Var3.show();
        return my0Var3;
    }

    public final void D0(java.util.ArrayList r18, defpackage.l7c r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh1.D0(java.util.ArrayList, l7c):void");
    }

    public final void E0(Context context, int i) {
        vb vbVar = this.W;
        if (vbVar != null) {
            Object obj = vbVar.G(i).H;
            if (obj instanceof TL_payments.starRefProgram) {
                J0(context, this.currentAccount, (TL_payments.starRefProgram) obj, this.S, this.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                K0(context, this.currentAccount, (TL_payments.connectedBotStarRef) obj, this.S, this.resourceProvider);
            }
        }
    }

    public final void F0(TLObject tLObject, he heVar) {
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            ku0 g = ku0.g(this.currentAccount);
            long j = this.S;
            hu0 d = g.d(j);
            ArrayList arrayList = d.e;
            int i = d.a;
            oc7.r1(i).d4(connectedstarrefbots.users, false);
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
            nm7.f(i).k(nm7.O3, Long.valueOf(d.b));
            d.a();
            iu0 e = ku0.g(this.currentAccount).e(j);
            e.c = 0;
            e.d = false;
            e.i = false;
            e.f = 0L;
            e.j = null;
            e.h = false;
            e.a();
            this.W.O(true);
        }
        heVar.dismiss();
    }

    public final void G0(TL_payments.connectedBotStarRef connectedbotstarref) {
        he heVar = new he(3, null, getParentActivity());
        heVar.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = oc7.r1(this.currentAccount).i1(this.S);
        editconnectedstarrefbot.revoked = true;
        getConnectionsManager().sendRequest(editconnectedstarrefbot, new pm(this, heVar, (byte) 10));
    }

    public final void H0(Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, context);
        String M0 = jb6.M0(2131748764, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = gm.S2(jb6.a0(null, null, 2131748763, m9c.r(user)));
        alertDialog$Builder.j(jb6.M0(2131748762, null), new g11(this, connectedbotstarref, (byte) 8));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.c(-1);
        alertDialog$Builder.o();
    }

    public final boolean I0(Context context, View view, int i) {
        vb vbVar = this.W;
        if (vbVar != null) {
            Object obj = vbVar.G(i).H;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(connectedbotstarref.bot_id));
                bu5 I = bu5.I(this, view);
                I.k(2131232078, jb6.M0(2131746441, null), new y31(this, W1, (byte) 21), W1.bot_has_main_app);
                I.k(2131232078, jb6.M0(2131752865, null), new y31(this, connectedbotstarref, (byte) 22), !W1.bot_has_main_app);
                I.b(2131232210, jb6.M0(2131751699, null), new tv0(this, connectedbotstarref, W1, (byte) 17), false);
                I.l(2131232201, new l97(this, context, W1, connectedbotstarref, (byte) 24), jb6.M0(2131748762, null), !connectedbotstarref.revoked, true);
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
        this.F = gm.L(238.0f);
        o72 o72Var = new o72(context, (byte) 4);
        this.V = o72Var;
        anb.h(cmb.h5, null, o72Var);
        super.createView(context);
        this.T = new FrameLayout(context);
        ft4 ft4Var = new ft4(context, 1, 3);
        this.U = ft4Var;
        ft4Var.setImportantForAccessibility(4);
        vs4 vs4Var = this.U.b;
        vs4Var.z = cmb.Vk;
        vs4Var.A = cmb.Wk;
        vs4Var.b();
        this.U.setStarParticlesView(this.e);
        this.T.addView(this.U, qoe.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(jb6.M0(2131752419, null), gm.S2(jb6.M0(2131752420, null)), this.T, null);
        this.c.setOnItemClickListener(new k0(this, context, (byte) 4));
        this.c.setOnItemLongClickListener(new g11(this, context, (byte) 9));
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.c.setItemAnimator(sc3Var);
        this.c.setOnScrollListener(new y(this, (byte) 15));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        vb vbVar;
        int i3 = nm7.O3;
        long j = this.S;
        if (i == i3) {
            if (((Long) objArr[0]).longValue() == j) {
                vb vbVar2 = this.W;
                if (vbVar2 != null) {
                    vbVar2.O(true);
                }
                ku0.g(this.currentAccount).d(j).a();
            }
        } else if (i == nm7.N3 && ((Long) objArr[0]).longValue() == j && (vbVar = this.W) != null) {
            vbVar.O(true);
        }
    }

    @Override
    public final y59 k0() {
        vb vbVar = new vb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new f(this, (byte) 23), getResourceProvider(), (byte) 1);
        this.W = vbVar;
        return vbVar;
    }

    @Override
    public final dta m0() {
        ub ubVar = new ub(getParentActivity(), (byte) 1);
        ubVar.c();
        return ubVar;
    }

    @Override
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.O3);
        nm7.f(this.currentAccount).b(this, nm7.N3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, nm7.O3);
        nm7.f(this.currentAccount).n(this, nm7.N3);
    }

    @Override
    public final void onPause() {
        super.onPause();
        ft4 ft4Var = this.U;
        if (ft4Var != null) {
            ft4Var.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ft4 ft4Var = this.U;
        if (ft4Var != null) {
            ft4Var.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }
}
