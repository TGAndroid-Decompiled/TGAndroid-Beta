package oi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.na;
import di.j7;
import hi.y7;
import java.util.ArrayList;
import org.telegram.messenger.bw;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.w10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x60;
import org.telegram.ui.bn;
import org.telegram.ui.dg0;
import org.telegram.ui.rj;
import org.telegram.ui.rm;
public final class p extends li implements fs {
    public static final int[] R = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public boolean E;
    public int F;
    public f1 G;
    public int H;
    public x60 I;
    public int J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public boolean O;
    public dg0 P;
    public final d Q;
    public final int f22366n;
    public final t3 f22367r;
    public final y3 f22368s;
    public m.o3 f22369w;
    public qy f22370x;
    public boolean f22371y;

    public p(int i7, Context context, i6 i6Var, ti tiVar) {
        super(context, i6Var, tiVar);
        l lVar = new l(this);
        this.K = true;
        this.Q = new d(this, 3);
        this.f22366n = i7;
        this.h = true;
        this.f37138f = true;
        t3 t3Var = new t3(context, i7, i6Var, new jb.m(this, i6Var, false, 8));
        this.f22367r = t3Var;
        t3Var.setAdaptiveLinkDialogs(false);
        t3Var.setAllowTapAboveContent(false);
        addView(t3Var, na.e(-1, -1, 119));
        addView(t3Var.getOverlayView(), na.e(-1, -1, 119));
        t3Var.C4();
        g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        y3 y3Var = new y3(context, lVar);
        this.f22368s = y3Var;
        y3Var.setBackVisible(false);
        y3Var.setTopGradientVisible(false);
        d0();
        addView(y3Var, na.e(-1, -1, 119));
        c0();
        e0();
        a0(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void P(p pVar) {
        boolean z10;
        int i7 = 0;
        if (!pVar.f22367r.n3() && !pVar.f22371y) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            ti tiVar = pVar.f37135b;
            if (!tiVar.M1 && tiVar.Q2) {
                i7 = org.telegram.messenger.g0.L(62.0f);
            }
        }
        if (pVar.L != i7) {
            pVar.L = i7;
            pVar.X();
        }
    }

    public static void Q(p pVar) {
        t3 t3Var = pVar.f22367r;
        if (pVar.f22371y) {
            f1 S2 = t3Var.S2();
            if (S2 != null) {
                S2.O();
                org.telegram.messenger.g0.I3(S2);
            }
            pVar.W(true);
            return;
        }
        ti tiVar = pVar.f37135b;
        if (pVar.f22370x == null) {
            qy qyVar = new qy(tiVar.f39956a2, true, false, false, pVar.getContext(), true, null, tiVar.f40002p3, true, pVar.f37134a, false, false);
            pVar.f22370x = qyVar;
            qyVar.setVisibility(8);
            qy qyVar2 = pVar.f22370x;
            qyVar2.f39115y2 = false;
            qyVar2.setBottomInset(org.telegram.messenger.g0.f24221n);
            View view = pVar.f22370x.f39104w;
            if (view != null) {
                view.setVisibility(8);
            }
            pVar.f22370x.setDelegate(new o(pVar));
            pVar.addView(pVar.f22370x, na.e(-1, pVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = pVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pVar.f22370x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        pVar.f22370x.setLayoutParams(layoutParams);
        pVar.f22370x.setTranslationY(0.0f);
        pVar.f22370x.setVisibility(0);
        pVar.f22371y = true;
        pVar.F = emojiPanelHeight;
        f1 S22 = t3Var.S2();
        if (S22 != null) {
            org.telegram.messenger.g0.v1(S22);
        }
        y3 y3Var = pVar.f22368s;
        if (y3Var != null) {
            y3Var.setEmojiOpened(true);
        }
        pVar.a0(false);
        pVar.requestLayout();
    }

    public static f1 R(p pVar) {
        t3 t3Var = pVar.f22367r;
        f1 focusedEditTextOrNull = t3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            pVar.G = focusedEditTextOrNull;
            pVar.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        f1 f1Var = pVar.G;
        if (f1Var != null) {
            return f1Var;
        }
        return t3Var.S2();
    }

    public static int S(p pVar, f1 f1Var) {
        if (f1Var == pVar.G && pVar.f22367r.getFocusedEditTextOrNull() != f1Var) {
            return Math.min(pVar.H, f1Var.length());
        }
        return Math.max(0, f1Var.getSelectionEnd());
    }

    public static void T(p pVar, int i7, int i10) {
        ti tiVar = pVar.f37135b;
        if (tiVar.f39956a2 == null) {
            return;
        }
        ti tiVar2 = new ti(pVar.getContext(), tiVar.f39956a2, false, false, true, pVar.f37134a);
        tiVar2.X3 = new m(pVar, tiVar2);
        tiVar2.f39967e2.i0();
        tiVar2.z1(1, true);
        tiVar2.W0(i7);
        tiVar2.f40023u4 = new e(pVar, tiVar2);
        tiVar2.T1 = new e(pVar, tiVar2);
        tiVar2.S1 = new n(pVar, tiVar2);
        tiVar2.f1();
        if (i10 != 0) {
            tiVar2.p1(i10);
        }
        tiVar2.A0(true);
        tiVar2.show();
    }

    public static void Z(Context context, final String str, final w10 w10Var, i6 i6Var) {
        String str2;
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, i6Var, true);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        int L = org.telegram.messenger.g0.L(8.0f);
        int i7 = n6.G6;
        ShapeDrawable d02 = n6.d0(L, n6.r1(0.05f, n6.w0(i7, i6Var)));
        q6 K = u6.K(0.05f, i7);
        imageView.setBackground(d02);
        u6.j(imageView, d02, K, null, i6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        g10.addView(horizontalScrollView, na.t(-1, -2, 49, 12, 2, 12, 0));
        hi.e g11 = m10.g(24, context, i6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        j7 j7Var = new j7(strArr, horizontalScrollView, g11, zArr2, new y7(strArr, 26), imageView, i6Var, new int[]{6}, 2);
        final org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, gd.N0(2131754005, null), true, false, -1, i6Var);
        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
        j3Var.setImeOptions(6);
        j3Var.setMaxLines(5);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        int i10 = n6.f29451d6;
        ShapeDrawable d03 = n6.d0(L2, n6.w0(i10, i6Var));
        q6 M = u6.M(i10);
        l3Var.setBackground(d03);
        u6.j(l3Var, d03, M, null, i6Var);
        l3Var.setText(strArr[0]);
        j3Var.addTextChangedListener(new bi.v(strArr, j7Var, false, 9));
        g10.addView(l3Var, na.t(-1, -2, 55, 12, 8, 12, 0));
        g11.setText(gd.N0(2131751342, null));
        g10.addView(g11, na.t(-1, 48, 55, 12, 12, 12, 12));
        j7Var.run();
        j3.O = g10;
        j3.I0 = new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.j3 j3Var2 = org.telegram.ui.Cells.l3.this.d;
                j3Var2.clearFocus();
                org.telegram.messenger.g0.v1(j3Var2);
                boolean[] zArr3 = zArr;
                if (!zArr3[0] && !zArr2[0]) {
                    String[] strArr2 = strArr;
                    if (!TextUtils.equals(str, strArr2[0])) {
                        zArr3[0] = true;
                        w10Var.a(strArr2[0]);
                    }
                }
            }
        };
        j3.show();
        int i11 = n6.f29394a7;
        j3.w0(i11);
        j3.Q(i11);
        g11.setOnClickListener(new fi.d0(g11, zArr, w10Var, strArr, j3, 4));
        org.telegram.messenger.g0.h3(new kg.i0(l3Var, 25), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int Q = this.f37135b.f40002p3.Q();
        if (Q <= 0) {
            SharedPreferences f12 = mp.f1();
            Point point = org.telegram.messenger.g0.f24226q;
            if (point.x > point.y) {
                str = "kbd_height_land3";
            } else {
                str = "kbd_height";
            }
            Q = f12.getInt(str, org.telegram.messenger.g0.L(200.0f));
        }
        if (Q <= 0) {
            Q = org.telegram.messenger.g0.L(200.0f);
        }
        return Q + org.telegram.messenger.g0.f24221n;
    }

    @Override
    public final void B(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: oi.p.B(int, int):void");
    }

    @Override
    public final void H(li liVar) {
        this.f37135b.V2.setTitle("");
        this.f22367r.f35323g3.O(false);
        a0(false);
        post(new d(this, 4));
    }

    @Override
    public final void J() {
        this.f22367r.y0(0);
    }

    @Override
    public final boolean M(boolean z10, int i7, int i10, long j3, boolean z11) {
        fj fjVar;
        rm rmVar;
        bw bwVar;
        long j10;
        fj fjVar2;
        rj rjVar;
        mg mgVar;
        rj rjVar2;
        int i11 = this.f22366n;
        boolean B4 = mp.u1(i11).B4();
        t3 t3Var = this.f22367r;
        if (!B4 && !i10.i(i11).q() && a5.d(t3Var.f22503t3, t3Var.f22505u3)) {
            b2.u0(getContext(), new b(t3Var, 0), new d(this, 2), this.f37134a);
            return false;
        }
        if (t3Var.n3() && !t3Var.p3()) {
            if (!t3Var.P3()) {
                y3 y3Var = this.f22368s;
                if (y3Var != null) {
                    y3Var.setSendEnabled(t3Var.P3());
                    return false;
                }
            } else {
                boolean B42 = mp.u1(i11).B4();
                ti tiVar = this.f37135b;
                if (!B42) {
                    org.telegram.ui.ActionBar.g2 g2Var = tiVar.f39956a2;
                    if ((g2Var instanceof bn) && (rjVar2 = ((bn) g2Var).f46118a0) != null) {
                        rjVar2.v1(a5.g(t3Var.f22503t3), z10, i7, i10);
                        tiVar.a(true);
                        return true;
                    }
                } else {
                    ArrayList c32 = t3Var.c3();
                    if (!c32.isEmpty()) {
                        ArrayList E2 = t3Var.E2();
                        ArrayList B2 = t3Var.B2();
                        ArrayList a10 = z4.a(i11, c32);
                        org.telegram.ui.ActionBar.g2 g2Var2 = tiVar.f39956a2;
                        if (g2Var2 instanceof bn) {
                            bn bnVar = (bn) g2Var2;
                            fj fjVar3 = bnVar.F5;
                            fj fjVar4 = bnVar.f46282m4;
                            rm rmVar2 = bnVar.D5;
                            long j92 = bnVar.j9();
                            bwVar = bnVar.Y8();
                            fjVar = fjVar4;
                            rmVar = rmVar2;
                            j10 = j92;
                            fjVar2 = fjVar3;
                        } else {
                            fjVar = null;
                            rmVar = null;
                            bwVar = null;
                            j10 = 0;
                            fjVar2 = null;
                        }
                        zy.R(org.telegram.messenger.c.a(tiVar.H3), c32, E2, B2, a10, tiVar.c1(), fjVar2, fjVar, rmVar, z10, i7, i10, bwVar, j3, j10, 0L);
                        org.telegram.ui.ActionBar.g2 g2Var3 = tiVar.f39956a2;
                        if ((g2Var3 instanceof bn) && (rjVar = ((bn) g2Var3).f46118a0) != null && (mgVar = rjVar.P3) != null) {
                            mgVar.G(null, z10, i7, i10, 0L);
                        }
                        tiVar.a(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean N() {
        return !this.f22367r.n3();
    }

    public final void U(x60 x60Var, a aVar, TL_iv.PageBlock pageBlock, int i7, String str, int i10, x60 x60Var2) {
        boolean z10;
        if (aVar != null && aVar.f22001b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        x60Var.j(z10, i7, null, str, new h(this, aVar, pageBlock, x60Var2, 0));
        x60Var.z().f30344a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        x60Var.z().f30344a.setTextSize(1, i10);
    }

    public final boolean V() {
        t3 t3Var = this.f22367r;
        if (t3Var == null || !t3Var.n3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f37134a);
        String N0 = gd.N0(2131753990, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = gd.N0(2131753991, null);
        alertDialog$Builder.h(gd.N0(2131751586, null), new org.telegram.ui.ActionBar.q1(this) {
            public final p f22259b;

            {
                this.f22259b = this;
            }

            @Override
            public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f22259b.f37135b.dismiss();
                        return;
                    default:
                        p pVar = this.f22259b;
                        pVar.Y();
                        pVar.f37135b.dismiss();
                        return;
                }
            }
        });
        alertDialog$Builder.k(gd.N0(2131745750, null), new org.telegram.ui.ActionBar.q1(this) {
            public final p f22259b;

            {
                this.f22259b = this;
            }

            @Override
            public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f22259b.f37135b.dismiss();
                        return;
                    default:
                        p pVar = this.f22259b;
                        pVar.Y();
                        pVar.f37135b.dismiss();
                        return;
                }
            }
        });
        alertDialog$Builder.d(-2);
        alertDialog$Builder.p();
        return false;
    }

    public final void W(boolean z10) {
        if (this.E) {
            this.E = false;
            qy qyVar = this.f22370x;
            if (qyVar != null) {
                qyVar.t(false);
                if (!z10) {
                    this.f22370x.A();
                }
            }
        }
        this.G = null;
        qy qyVar2 = this.f22370x;
        if (qyVar2 != null) {
            qyVar2.setTranslationY(0.0f);
            this.f22370x.setVisibility(8);
        }
        this.f22371y = false;
        this.F = 0;
        y3 y3Var = this.f22368s;
        if (y3Var != null) {
            y3Var.setEmojiOpened(false);
        }
        a0(false);
        requestLayout();
    }

    public final void X() {
        int i7;
        int i10;
        float f10;
        int i11;
        float f11;
        float f12;
        if (this.E) {
            i7 = org.telegram.messenger.g0.L(245.0f);
        } else {
            i7 = this.F;
        }
        qy qyVar = this.f22370x;
        float f13 = 0.0f;
        ti tiVar = this.f37135b;
        if (qyVar != null) {
            if (this.f22371y) {
                float f14 = this.F - i7;
                if (this.E) {
                    f12 = -tiVar.f39983j4;
                } else {
                    f12 = 0.0f;
                }
                f11 = f14 + f12;
            } else {
                f11 = 0.0f;
            }
            qyVar.setTranslationY(f11);
        }
        y3 y3Var = this.f22368s;
        if (y3Var != null) {
            boolean z10 = this.f22371y;
            if (z10) {
                f10 = i7;
            } else {
                if (!this.M && this.F <= 0) {
                    i10 = org.telegram.messenger.g0.f24221n;
                } else {
                    i10 = 0;
                }
                f10 = i10;
            }
            if (!z10 || this.E) {
                f10 += tiVar.f39983j4;
            }
            y3Var.getBottomContainer().animate().cancel();
            y3Var.getBottomContainer().setTranslationY(-f10);
            boolean z11 = this.f22371y;
            if (z11) {
                f13 = i7;
            }
            if (!z11 || this.E) {
                f13 += tiVar.f39983j4;
            }
            y3Var.setBottomGradientTranslationY(-f13);
            if (this.N != this.L) {
                ViewPropertyAnimator animate = y3Var.getBottomInnerContainer().animate();
                this.N = this.L;
                animate.translationY(-i11).setDuration(320L).setInterpolator(kr.h).start();
            }
        }
    }

    public final boolean Y() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f37135b.f39956a2;
        if (g2Var instanceof bn) {
            bn bnVar = (bn) g2Var;
            t3 t3Var = this.f22367r;
            if (!t3Var.u2()) {
                return false;
            }
            TL_iv.RichMessage m22 = t3Var.m2();
            ri.d0(org.telegram.messenger.c.a(this.f22366n).f23343a).V1(bnVar.a(), bnVar.Q7(bnVar.F5), "", null, null, null, null, 0L, false, false, m22);
            rj rjVar = bnVar.f46118a0;
            if (rjVar != null) {
                rjVar.setRichDraftPreview(m22);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void a0(boolean z10) {
        boolean z11;
        int i7;
        int i10 = 0;
        if (!this.f22367r.n3() && !this.f22371y) {
            z11 = false;
        } else {
            z11 = true;
        }
        ti tiVar = this.f37135b;
        th thVar = tiVar.f40026v3;
        if (tiVar.f40027v4 != z11) {
            tiVar.f40027v4 = z11;
            if (tiVar.Q2) {
                thVar.animate().cancel();
                if (!z11) {
                    thVar.setVisibility(0);
                }
                float f10 = 1.0f;
                float f11 = 0.0f;
                if (z10) {
                    ViewPropertyAnimator animate = thVar.animate();
                    if (z11) {
                        f10 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f10);
                    if (z11) {
                        f11 = org.telegram.messenger.g0.L(48.0f);
                    }
                    alpha.translationY(f11).setDuration(180L).withEndAction(new oh(tiVar, z11, 3)).start();
                } else {
                    if (z11) {
                        f10 = 0.0f;
                    }
                    thVar.setAlpha(f10);
                    if (z11) {
                        f11 = org.telegram.messenger.g0.L(48.0f);
                    }
                    thVar.setTranslationY(f11);
                    if (z11) {
                        i7 = 4;
                    } else {
                        i7 = 0;
                    }
                    thVar.setVisibility(i7);
                }
            }
        }
        if (!z11 && !tiVar.M1 && tiVar.Q2) {
            i10 = org.telegram.messenger.g0.L(62.0f);
        }
        this.L = i10;
        X();
        if (this.K == z11) {
            this.K = !z11;
            requestLayout();
        }
    }

    public final void b0() {
        throw new UnsupportedOperationException("Method not decompiled: oi.p.b0():void");
    }

    public final void c0() {
        boolean z10;
        float f10;
        y3 y3Var = this.f22368s;
        if (y3Var != null) {
            t3 t3Var = this.f22367r;
            boolean u22 = t3Var.u2();
            g2 g2Var = t3Var.R3;
            if (g2Var != null && !g2Var.f22212c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = y3Var.f22631r;
            ImageView imageView2 = y3Var.f22628n;
            imageView2.setEnabled(u22);
            float f11 = 0.35f;
            if (u22) {
                f10 = 1.0f;
            } else {
                f10 = 0.35f;
            }
            imageView2.setAlpha(f10);
            imageView.setEnabled(z10);
            if (z10) {
                f11 = 1.0f;
            }
            imageView.setAlpha(f11);
        }
    }

    public final void d0() {
        boolean z10;
        y3 y3Var = this.f22368s;
        if (y3Var != null) {
            int i7 = this.f22366n;
            boolean z11 = false;
            if (!mp.u1(i7).B4() && !i10.i(i7).q()) {
                z10 = true;
            } else {
                z10 = false;
            }
            tg sendButton = y3Var.getSendButton();
            if (z10) {
                t3 t3Var = this.f22367r;
                if (a5.d(t3Var.f22503t3, t3Var.f22505u3)) {
                    z11 = true;
                }
            }
            sendButton.setLocked(z11);
            y3Var.setPremiumLocked(z10);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25232i5) {
            d0();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        t3 t3Var = this.f22367r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f37135b.f39956a2 instanceof bn) && t3Var.u2() && Y()) {
                org.telegram.messenger.f3.n(null, 2131745807, new kc(this.f22368s, this.f37134a), 2131623990, 36);
                return true;
            }
        } else if (!t3Var.k3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        qy qyVar;
        t3 t3Var = this.f22367r;
        h3 h3Var = t3Var.f22507v3;
        u9 u9Var = t3Var.f22509w3;
        if (!h3Var.x() || !u9Var.onTouchEvent(motionEvent)) {
            if (this.E && (qyVar = this.f22370x) != null) {
                height = (int) qyVar.getY();
            } else {
                height = getHeight() - this.F;
            }
            int L = (height - org.telegram.messenger.g0.L(60.0f)) - this.L;
            if (motionEvent.getAction() == 0 && this.f22371y && motionEvent.getY() < L) {
                W(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > org.telegram.messenger.g0.L(60.0f) && motionEvent.getY() < L)) && u9Var.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < L && t3Var.l3(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final void e0() {
        throw new UnsupportedOperationException("Method not decompiled: oi.p.e0():void");
    }

    public final void f0() {
        int i7;
        y3 y3Var = this.f22368s;
        if (y3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(44.0f)) / 2) + org.telegram.messenger.g0.f24220m) - org.telegram.messenger.g0.L(8.0f);
        t3 t3Var = this.f22367r;
        if (t3Var.getChildCount() <= 0) {
            i7 = t3Var.getPaddingTop();
        } else {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < t3Var.getChildCount(); i11++) {
                View childAt = t3Var.getChildAt(i11);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            if (i10 == Integer.MAX_VALUE) {
                i7 = t3Var.getPaddingTop();
            } else {
                i7 = i10;
            }
        }
        y3Var.setTopButtonsOffset(Math.max(currentActionBarHeight, i7));
    }

    @Override
    public int getCurrentItemTop() {
        t3 t3Var = this.f22367r;
        if (t3Var.getChildCount() <= 0) {
            int paddingTop = t3Var.getPaddingTop();
            this.J = paddingTop;
            t3Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        boolean z10 = false;
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < t3Var.getChildCount(); i10++) {
            View childAt = t3Var.getChildAt(i10);
            int R2 = RecyclerView.R(childAt);
            if (R2 == 0) {
                z10 = true;
            }
            if (R2 >= 0 && childAt.getTop() < i7) {
                i7 = childAt.getTop();
            }
        }
        if (i7 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        t3Var.setTopGlowOffset(Math.max(0, i7));
        int i11 = i7 - org.telegram.messenger.g0.f24220m;
        int L = org.telegram.messenger.g0.L(7.0f);
        if (i11 < org.telegram.messenger.g0.L(7.0f) || !z10) {
            i11 = L;
        }
        this.J = i11;
        return i11;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (this.f22367r.getPaddingTop() - org.telegram.messenger.g0.f24220m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public i9 getTextSelectionHelper() {
        return this.f22367r.getTextSelectionHelper();
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final boolean k() {
        boolean z10 = this.E;
        if (z10) {
            if (z10) {
                this.E = false;
                qy qyVar = this.f22370x;
                if (qyVar != null) {
                    qyVar.t(false);
                    this.f22370x.A();
                }
                X();
                return false;
            }
        } else if (this.f22371y) {
            W(false);
            return false;
        } else if (!this.f22367r.I2() && !V()) {
            return true;
        }
        return false;
    }

    @Override
    public final void m(float f10) {
        X();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f22366n).c(this, ks.f25232i5);
        d0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f22366n).n(this, ks.f25232i5);
    }

    @Override
    public final void p() {
        dg0 dg0Var = this.P;
        if (dg0Var != null) {
            dg0Var.i();
            this.P = null;
        }
        m.o3 o3Var = this.f22369w;
        if (o3Var != null) {
            o3Var.a();
        }
        t3 t3Var = this.f22367r;
        if (t3Var != null) {
            t3Var.y2();
        }
        qy qyVar = this.f22370x;
        if (qyVar != null) {
            qyVar.B();
        }
    }

    @Override
    public final boolean q() {
        t3 t3Var = this.f22367r;
        if (t3Var != null) {
            t3Var.y2();
            return false;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.O) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final boolean s() {
        if (!V()) {
            return false;
        }
        return true;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37135b.f30226b.invalidate();
        invalidate();
    }

    @Override
    public final void u() {
        m.o3 o3Var = this.f22369w;
        if (o3Var != null) {
            o3Var.a();
        }
        if (this.f22371y) {
            W(false);
        }
    }

    @Override
    public final void y() {
        boolean z10;
        if (this.f37135b.f40002p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.M = z10;
        X();
        f0();
    }

    @Override
    public final void z(int i7, boolean z10) {
        this.M = z10;
        X();
        if (z10 && this.f22371y && !this.E) {
            W(false);
        }
        f0();
    }

    @Override
    public final void t() {
    }
}
