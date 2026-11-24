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
public final class eg1 extends iz4 implements gk7 {
    public final long S;
    public FrameLayout T;
    public er4 U;
    public d62 V;
    public vb W;

    public eg1(long j) {
        this.S = j;
        this.N = true;
        this.M = gl.L(60.0f);
    }

    public static int A0(eg1 eg1Var) {
        return eg1Var.currentAccount;
    }

    public static void I0(android.content.Context r34, int r35, final org.telegram.tgnet.tl.TL_payments.starRefProgram r36, long r37, defpackage.wjb r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg1.I0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, wjb, boolean):void");
    }

    public static fx0 J0(Context context, int i, TL_payments.connectedBotStarRef connectedbotstarref, long j, wjb wjbVar) {
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        fx0 fx0Var;
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
        fx0 h = de9.h(1, wjbVar, context, false);
        TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout j2 = de9.j(context, 1);
        j2.setPadding(gl.L(16.0f), gl.L(20.0f), gl.L(16.0f), gl.L(8.0f));
        j2.setClipChildren(false);
        j2.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        int L = gl.L(40.0f);
        if (connectedbotstarref.revoked) {
            i2 = bkb.mk;
        } else {
            i2 = bkb.Ei;
        }
        Drawable K = bkb.K(L, bkb.v0(i2, wjbVar));
        if (connectedbotstarref.revoked) {
            i3 = bkb.mk;
        } else {
            i3 = bkb.Ei;
        }
        vkb M = zkb.M(i3);
        view.setBackground(K);
        zkb.j(view, K, M, null, wjbVar);
        frameLayout.addView(view, nme.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
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
        frameLayout.addView(imageView, nme.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int L2 = gl.L(50.0f);
            int i10 = bkb.g5;
            Drawable b0 = bkb.b0(L2, bkb.v0(i10, wjbVar));
            vkb M2 = zkb.M(i10);
            frameLayout2.setBackground(b0);
            zkb.j(frameLayout2, b0, M2, null, wjbVar);
            frameLayout.addView(frameLayout2, nme.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(gl.o());
            textView.setTextSize(1, 12.0f);
            int L3 = gl.L(9.5f);
            if (connectedbotstarref.revoked) {
                i8 = bkb.mk;
            } else {
                i8 = bkb.kk;
            }
            Drawable b02 = bkb.b0(L3, bkb.v0(i8, wjbVar));
            if (connectedbotstarref.revoked) {
                i9 = bkb.mk;
            } else {
                i9 = bkb.kk;
            }
            vkb M3 = zkb.M(i9);
            textView.setBackground(b02);
            zkb.j(textView, b02, M3, null, wjbVar);
            textView.setTextColor(-1);
            textView.setPadding(gl.L(6.66f), 0, gl.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            cm2 cm2Var = new cm2(2131231974, 0);
            cm2Var.I = 0.937f;
            cm2Var.J = 0.937f;
            cm2Var.r = -gl.L(1.33f);
            cm2Var.s = gl.L(1.0f);
            cm2Var.H = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, nme.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        j2.addView(frameLayout, nme.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i11 = bkb.F6;
        zkb.X(textView2, i11, wjbVar);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(k96.M0(2131752470, null));
        textView2.setTypeface(gl.o());
        j2.addView(textView2, nme.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L4 = gl.L(28.0f);
        int i12 = bkb.Z6;
        ShapeDrawable b03 = bkb.b0(L4, bkb.v0(i12, wjbVar));
        vkb M4 = zkb.M(i12);
        linearLayout3.setBackground(b03);
        zkb.j(linearLayout3, b03, M4, null, wjbVar);
        be0 be0Var = new be0(context);
        be0Var.setRoundRadius(gl.L(14.0f));
        pb0 pb0Var = new pb0((wjb) null);
        linearLayout3.addView(be0Var, nme.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        zkb.X(textView3, i11, wjbVar);
        textView3.setText(cf3.k(i, connectedbotstarref.bot_id));
        pb0Var.q(V1);
        be0Var.f(V1, pb0Var);
        linearLayout3.addView(textView3, nme.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i13 = bkb.q5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        zkb.s(imageView2, i13, wjbVar, mode);
        imageView2.setImageResource(2131232702);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, nme.t(-2, -2, 16, 5, 0, 8, 0));
        j2.addView(linearLayout3, nme.t(-2, 28, 1, 4, 0, 4, 0));
        ote.a(linearLayout3);
        TextView textView4 = new TextView(context);
        zkb.X(textView4, i11, wjbVar);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(gl.S2(k96.M0(2131752472, null)));
            fx0Var = h;
            i5 = i13;
            linearLayout = linearLayout3;
        } else {
            int i14 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            int i15 = connectedbotstarref.commission_permille;
            linearLayout = linearLayout3;
            if (i14 < 0) {
                String I0 = bc.I0(i15);
                String r = l7c.r(V1);
                int i16 = connectedbotstarref.duration_months;
                fx0Var = h;
                i5 = i13;
                if (i16 <= 0) {
                    G2 = k96.M0(2131752489, null);
                    c2 = 0;
                } else if (i16 >= 12 && i16 % 12 == 0) {
                    c2 = 0;
                    G2 = k96.G(i16 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                } else {
                    c2 = 0;
                    G2 = k96.G(i16, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                }
                Object[] objArr = new Object[3];
                objArr[c2] = I0;
                objArr[1] = r;
                objArr[2] = G2;
                de9.r(null, null, 2131752473, objArr, textView4);
            } else {
                fx0Var = h;
                i5 = i13;
                String I02 = bc.I0(i15);
                String r2 = l7c.r(V1);
                int i17 = connectedbotstarref.duration_months;
                if (i17 <= 0) {
                    G = k96.M0(2131752489, null);
                    i6 = 3;
                    c = 0;
                } else {
                    if (i17 >= 12 && i17 % 12 == 0) {
                        c = 0;
                        G = k96.G(i17 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                    } else {
                        c = 0;
                        G = k96.G(i17, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                    }
                    i6 = 3;
                }
                Object[] objArr2 = new Object[i6];
                objArr2[c] = I02;
                objArr2[1] = r2;
                objArr2[2] = G;
                de9.r(null, null, 2131752471, objArr2, textView4);
            }
        }
        j2.addView(textView4, nme.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (!connectedbotstarref.revoked) {
            TextView textView5 = new TextView(context);
            zkb.X(textView5, i11, wjbVar);
            textView5.setTextSize(1, 14.0f);
            de9.q(textView5, 17, null, 2131752474);
            j2.addView(textView5, nme.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            ShapeDrawable b04 = bkb.b0(gl.L(28.0f), bkb.v0(i12, wjbVar));
            vkb M5 = zkb.M(i12);
            linearLayout4.setBackground(b04);
            zkb.j(linearLayout4, b04, M5, null, wjbVar);
            be0 be0Var2 = new be0(context);
            be0Var2.setRoundRadius(gl.L(14.0f));
            pb0 pb0Var2 = new pb0((wjb) null);
            linearLayout4.addView(be0Var2, nme.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            zkb.X(textView6, i11, wjbVar);
            if (j >= 0) {
                TLRPC.User V12 = na7.q1(i).V1(Long.valueOf(j));
                pb0Var2.q(V12);
                be0Var2.f(V12, pb0Var2);
                textView6.setText(l7c.r(V12));
                i7 = i12;
            } else {
                i7 = i12;
                TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
                pb0Var2.p(K0);
                be0Var2.f(K0, pb0Var2);
                if (K0 == null) {
                    str2 = "";
                } else {
                    str2 = K0.title;
                }
                textView6.setText(str2);
            }
            linearLayout4.addView(textView6, nme.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            zkb.s(imageView3, i5, wjbVar, mode);
            imageView3.setImageResource(2131230873);
            linearLayout4.addView(imageView3, nme.t(-2, -2, 16, 2, 0, 5, 0));
            j2.addView(linearLayout4, nme.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        } else {
            i7 = i12;
            linearLayout2 = null;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        zkb.X(textView7, i11, wjbVar);
        int L5 = gl.L(8.0f);
        int i18 = i7;
        int v0 = bkb.v0(i18, wjbVar);
        int v02 = bkb.v0(i18, wjbVar);
        int i19 = bkb.h6;
        int v = bkb.v(v02, bkb.v0(i19, wjbVar));
        ff0 i0 = bkb.i0(L5, L5, L5, L5, v0, v, v);
        vkb M6 = zkb.M(i18);
        vkb p = zkb.p(i18, i19);
        textView7.setBackground(i0);
        zkb.j(textView7, i0, M6, p, wjbVar);
        textView7.setPadding(gl.L(16.0f), gl.L(14.66f), gl.L(16.0f), gl.L(14.66f));
        String str3 = connectedbotstarref.url;
        if (str3 != null && str3.startsWith("https://")) {
            str = connectedbotstarref.url.substring(8);
        } else {
            str = connectedbotstarref.url;
        }
        textView7.setText(str);
        j2.addView(textView7, nme.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        u41 u41Var = new u41(wjbVar, context, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new cm2(2131232109, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) k96.M0(2131752480, null));
            u41Var.i(spannableStringBuilder2, false, true);
        } else {
            u41Var.i(k96.M0(2131752475, null), false, true);
        }
        j2.addView(u41Var, nme.o(-1, 48));
        l46 l46Var = new l46(context, wjbVar);
        long j3 = connectedbotstarref.participants;
        if (j3 <= 0) {
            G3 = k96.a0(null, null, 2131752478, l7c.r(V1));
        } else {
            G3 = k96.G((int) j3, "ChannelAffiliateProgramLinkOpened", l7c.r(V1));
        }
        l46Var.setText(G3);
        l46Var.setGravity(17);
        l46Var.setTextSize(1, 12.0f);
        zkb.X(l46Var, bkb.A6, wjbVar);
        zkb.G(l46Var, bkb.Wc, wjbVar);
        j2.addView(l46Var, nme.t(-1, -2, 49, 14, 12, 14, 2));
        fx0 fx0Var2 = fx0Var;
        fx0Var2.O = j2;
        s67 s67Var = new s67(connectedbotstarref, fx0Var2, wjbVar, V1, (byte) 23);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new x91(s67Var, (byte) 4));
        }
        uf1 uf1Var = new uf1(connectedbotstarref, i, fx0Var2, context, j, wjbVar, s67Var);
        fx0 fx0Var3 = fx0Var2;
        u41Var.setOnClickListener(uf1Var);
        fx0Var3.setOnDismissListener(new g5((byte) 6));
        if (linearLayout2 != null) {
            ct0.g(i).n();
            ct0.g(i).o();
            LinearLayout linearLayout5 = linearLayout2;
            uf1 uf1Var2 = new uf1(i, fx0Var3, wjbVar, linearLayout5, j, context, connectedbotstarref);
            fx0Var3 = fx0Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(uf1Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new kb1(fx0Var3, connectedbotstarref2, (byte) 1));
        fx0Var3.M(bkb.g5);
        d S = LaunchActivity.S();
        if (!gl.O1() && S != null && !gl.s1(S)) {
            fx0Var3.X(S);
        }
        fx0Var3.show();
        return fx0Var3;
    }

    public static int z0(eg1 eg1Var) {
        return eg1Var.currentAccount;
    }

    public final void C0(java.util.ArrayList r18, defpackage.l5c r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg1.C0(java.util.ArrayList, l5c):void");
    }

    public final void D0(Context context, int i) {
        vb vbVar = this.W;
        if (vbVar != null) {
            Object obj = vbVar.G(i).H;
            if (obj instanceof TL_payments.starRefProgram) {
                I0(context, this.currentAccount, (TL_payments.starRefProgram) obj, this.S, this.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                J0(context, this.currentAccount, (TL_payments.connectedBotStarRef) obj, this.S, this.resourceProvider);
            }
        }
    }

    public final void E0(TLObject tLObject, hd hdVar) {
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            ct0 g = ct0.g(this.currentAccount);
            long j = this.S;
            zs0 d = g.d(j);
            ArrayList arrayList = d.e;
            int i = d.a;
            na7.q1(i).b4(connectedstarrefbots.users, false);
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
            kk7.f(i).k(kk7.N3, Long.valueOf(d.b));
            d.a();
            at0 e = ct0.g(this.currentAccount).e(j);
            e.c = 0;
            e.d = false;
            e.i = false;
            e.f = 0L;
            e.j = null;
            e.h = false;
            e.a();
            this.W.O(true);
        }
        hdVar.dismiss();
    }

    public final void F0(TL_payments.connectedBotStarRef connectedbotstarref) {
        hd hdVar = new hd(3, null, getParentActivity());
        hdVar.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = na7.q1(this.currentAccount).h1(this.S);
        editconnectedstarrefbot.revoked = true;
        getConnectionsManager().sendRequest(editconnectedstarrefbot, new pl(this, hdVar, (byte) 10));
    }

    public final void G0(Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, context);
        String M0 = k96.M0(2131748815, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = gl.S2(k96.a0(null, null, 2131748814, l7c.r(user)));
        alertDialog$Builder.j(k96.M0(2131748813, null), new q31(this, connectedbotstarref, (byte) 7));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.c(-1);
        alertDialog$Builder.o();
    }

    public final boolean H0(Context context, View view, int i) {
        vb vbVar = this.W;
        if (vbVar != null) {
            Object obj = vbVar.G(i).H;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(connectedbotstarref.bot_id));
                cs5 I = cs5.I(this, view);
                I.k(2131232077, k96.M0(2131746515, null), new q21(this, V1, (byte) 20), V1.bot_has_main_app);
                I.k(2131232077, k96.M0(2131752900, null), new q21(this, connectedbotstarref, (byte) 21), !V1.bot_has_main_app);
                I.b(2131232209, k96.M0(2131751750, null), new fv0(this, connectedbotstarref, V1, (byte) 16), false);
                I.l(2131232200, new s67(this, context, V1, connectedbotstarref, (byte) 24), k96.M0(2131748813, null), !connectedbotstarref.revoked, true);
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
        this.F = gl.L(238.0f);
        d62 d62Var = new d62(context, (byte) 4);
        this.V = d62Var;
        zkb.h(bkb.h5, null, d62Var);
        super.createView(context);
        this.T = new FrameLayout(context);
        er4 er4Var = new er4(context, 1, 3);
        this.U = er4Var;
        er4Var.setImportantForAccessibility(4);
        uq4 uq4Var = this.U.b;
        uq4Var.z = bkb.Vk;
        uq4Var.A = bkb.Wk;
        uq4Var.b();
        this.U.setStarParticlesView(this.e);
        this.T.addView(this.U, nme.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        i0(k96.M0(2131752460, null), gl.S2(k96.M0(2131752461, null)), this.T, null);
        this.c.setOnItemClickListener(new k0(this, context, (byte) 4));
        this.c.setOnItemLongClickListener(new q31(this, context, (byte) 8));
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        this.c.setItemAnimator(gb3Var);
        this.c.setOnScrollListener(new y(this, (byte) 14));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        vb vbVar;
        int i3 = kk7.N3;
        long j = this.S;
        if (i == i3) {
            if (((Long) objArr[0]).longValue() == j) {
                vb vbVar2 = this.W;
                if (vbVar2 != null) {
                    vbVar2.O(true);
                }
                ct0.g(this.currentAccount).d(j).a();
            }
        } else if (i == kk7.M3 && ((Long) objArr[0]).longValue() == j && (vbVar = this.W) != null) {
            vbVar.O(true);
        }
    }

    @Override
    public final w39 j0() {
        vb vbVar = new vb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new f(this, (byte) 23), getResourceProvider(), (byte) 1);
        this.W = vbVar;
        return vbVar;
    }

    @Override
    public final cra l0() {
        ub ubVar = new ub(getParentActivity(), (byte) 1);
        ubVar.c();
        return ubVar;
    }

    @Override
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.N3);
        kk7.f(this.currentAccount).b(this, kk7.M3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.N3);
        kk7.f(this.currentAccount).n(this, kk7.M3);
    }

    @Override
    public final void onPause() {
        super.onPause();
        er4 er4Var = this.U;
        if (er4Var != null) {
            er4Var.setPaused(true);
            this.U.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        er4 er4Var = this.U;
        if (er4Var != null) {
            er4Var.setPaused(false);
            this.U.setDialogVisible(false);
        }
    }
}
