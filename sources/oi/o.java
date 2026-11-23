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
import hi.e7;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.cw;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.si;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.ug;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.ui;
import org.telegram.ui.bn;
import org.telegram.ui.eg0;
import org.telegram.ui.rj;
import org.telegram.ui.rm;
public final class o extends mi implements gs {
    public static final int[] R = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public boolean E;
    public int F;
    public e1 G;
    public int H;
    public a70 I;
    public int J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public boolean O;
    public eg0 P;
    public final d Q;
    public final int f22236n;
    public final s3 f22237r;
    public final x3 f22238s;
    public ga.d f22239w;
    public ty f22240x;
    public boolean f22241y;

    public o(int i7, Context context, h6 h6Var, ui uiVar) {
        super(context, h6Var, uiVar);
        k kVar = new k(this);
        this.K = true;
        this.Q = new d(this, 3);
        this.f22236n = i7;
        this.h = true;
        this.f37480f = true;
        s3 s3Var = new s3(context, i7, h6Var, new k8.a(7, this, h6Var));
        this.f22237r = s3Var;
        s3Var.setAdaptiveLinkDialogs(false);
        s3Var.setAllowTapAboveContent(false);
        addView(s3Var, na.e(-1, -1, 119));
        addView(s3Var.getOverlayView(), na.e(-1, -1, 119));
        s3Var.C4();
        e2 e2Var = s3Var.R3;
        if (e2Var != null) {
            e2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        x3 x3Var = new x3(context, kVar);
        this.f22238s = x3Var;
        x3Var.setBackVisible(false);
        x3Var.setTopGradientVisible(false);
        d0();
        addView(x3Var, na.e(-1, -1, 119));
        c0();
        e0();
        a0(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 0));
    }

    public static void P(o oVar) {
        boolean z10;
        int i7 = 0;
        if (!oVar.f22237r.n3() && !oVar.f22241y) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            ui uiVar = oVar.f37477b;
            if (!uiVar.M1 && uiVar.Q2) {
                i7 = org.telegram.messenger.g0.L(62.0f);
            }
        }
        if (oVar.L != i7) {
            oVar.L = i7;
            oVar.X();
        }
    }

    public static void Q(o oVar) {
        s3 s3Var = oVar.f22237r;
        if (oVar.f22241y) {
            e1 S2 = s3Var.S2();
            if (S2 != null) {
                S2.O();
                org.telegram.messenger.g0.I3(S2);
            }
            oVar.W(true);
            return;
        }
        ui uiVar = oVar.f37477b;
        if (oVar.f22240x == null) {
            ty tyVar = new ty(uiVar.f40352a2, true, false, false, oVar.getContext(), true, null, uiVar.f40398p3, true, oVar.f37476a, false, false);
            oVar.f22240x = tyVar;
            tyVar.setVisibility(8);
            ty tyVar2 = oVar.f22240x;
            tyVar2.f40142y2 = false;
            tyVar2.setBottomInset(org.telegram.messenger.g0.f24005n);
            View view = oVar.f22240x.f40131w;
            if (view != null) {
                view.setVisibility(8);
            }
            oVar.f22240x.setDelegate(new n(oVar));
            oVar.addView(oVar.f22240x, na.e(-1, oVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = oVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oVar.f22240x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        oVar.f22240x.setLayoutParams(layoutParams);
        oVar.f22240x.setTranslationY(0.0f);
        oVar.f22240x.setVisibility(0);
        oVar.f22241y = true;
        oVar.F = emojiPanelHeight;
        e1 S22 = s3Var.S2();
        if (S22 != null) {
            org.telegram.messenger.g0.v1(S22);
        }
        x3 x3Var = oVar.f22238s;
        if (x3Var != null) {
            x3Var.setEmojiOpened(true);
        }
        oVar.a0(false);
        oVar.requestLayout();
    }

    public static e1 R(o oVar) {
        s3 s3Var = oVar.f22237r;
        e1 focusedEditTextOrNull = s3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            oVar.G = focusedEditTextOrNull;
            oVar.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        e1 e1Var = oVar.G;
        if (e1Var != null) {
            return e1Var;
        }
        return s3Var.S2();
    }

    public static int S(o oVar, e1 e1Var) {
        if (e1Var == oVar.G && oVar.f22237r.getFocusedEditTextOrNull() != e1Var) {
            return Math.min(oVar.H, e1Var.length());
        }
        return Math.max(0, e1Var.getSelectionEnd());
    }

    public static void T(o oVar, int i7, int i10) {
        ui uiVar = oVar.f37477b;
        if (uiVar.f40352a2 == null) {
            return;
        }
        ui uiVar2 = new ui(oVar.getContext(), uiVar.f40352a2, false, false, true, oVar.f37476a);
        uiVar2.X3 = new l(oVar, uiVar2);
        uiVar2.f40363e2.i0();
        uiVar2.z1(1, true);
        uiVar2.W0(i7);
        uiVar2.f40419u4 = new e(oVar, uiVar2);
        uiVar2.T1 = new e(oVar, uiVar2);
        uiVar2.S1 = new m(oVar, uiVar2);
        uiVar2.f1();
        if (i10 != 0) {
            uiVar2.p1(i10);
        }
        uiVar2.A0(true);
        uiVar2.show();
    }

    public static void Z(Context context, final String str, final y10 y10Var, h6 h6Var) {
        String str2;
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, h6Var, true);
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
        int i7 = m6.G6;
        ShapeDrawable d02 = m6.d0(L, m6.r1(0.05f, m6.w0(i7, h6Var)));
        p6 K = t6.K(0.05f, i7);
        imageView.setBackground(d02);
        t6.j(imageView, d02, K, null, h6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        g10.addView(horizontalScrollView, na.t(-1, -2, 49, 12, 2, 12, 0));
        hi.d g11 = o10.g(24, context, h6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        j7 j7Var = new j7(strArr, horizontalScrollView, g11, zArr2, new e7(strArr, 26), imageView, h6Var, new int[]{6}, 2);
        final org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, hd.N0(2131754005, null), true, false, -1, h6Var);
        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
        j3Var.setImeOptions(6);
        j3Var.setMaxLines(5);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        int i10 = m6.f29347d6;
        ShapeDrawable d03 = m6.d0(L2, m6.w0(i10, h6Var));
        p6 M = t6.M(i10);
        l3Var.setBackground(d03);
        t6.j(l3Var, d03, M, null, h6Var);
        l3Var.setText(strArr[0]);
        j3Var.addTextChangedListener(new bi.v(strArr, j7Var, false, 9));
        g10.addView(l3Var, na.t(-1, -2, 55, 12, 8, 12, 0));
        g11.setText(hd.N0(2131751342, null));
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
                        y10Var.a(strArr2[0]);
                    }
                }
            }
        };
        j3.show();
        int i11 = m6.f29290a7;
        j3.w0(i11);
        j3.Q(i11);
        g11.setOnClickListener(new fi.d0(g11, zArr, y10Var, strArr, j3, 4));
        org.telegram.messenger.g0.h3(new kg.s0(l3Var, 24), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int Q = this.f37477b.f40398p3.Q();
        if (Q <= 0) {
            SharedPreferences f12 = np.f1();
            Point point = org.telegram.messenger.g0.f24010q;
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
        return Q + org.telegram.messenger.g0.f24005n;
    }

    @Override
    public final void B(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: oi.o.B(int, int):void");
    }

    @Override
    public final void I(mi miVar) {
        this.f37477b.V2.setTitle("");
        this.f22237r.f35742g3.O(false);
        a0(false);
        post(new d(this, 4));
    }

    @Override
    public final void K() {
        this.f22237r.y0(0);
    }

    @Override
    public final boolean M(boolean z10, int i7, int i10, long j3, boolean z11) {
        gj gjVar;
        rm rmVar;
        cw cwVar;
        long j10;
        gj gjVar2;
        rj rjVar;
        mg mgVar;
        rj rjVar2;
        int i11 = this.f22236n;
        boolean B4 = np.u1(i11).B4();
        s3 s3Var = this.f22237r;
        if (!B4 && !k10.i(i11).q() && z4.d(s3Var.f22373t3, s3Var.f22375u3)) {
            a2.u0(getContext(), new b(s3Var, 0), new d(this, 2), this.f37476a);
            return false;
        }
        if (s3Var.n3() && !s3Var.p3()) {
            if (!s3Var.P3()) {
                x3 x3Var = this.f22238s;
                if (x3Var != null) {
                    x3Var.setSendEnabled(s3Var.P3());
                    return false;
                }
            } else {
                boolean B42 = np.u1(i11).B4();
                ui uiVar = this.f37477b;
                if (!B42) {
                    org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40352a2;
                    if ((g2Var instanceof bn) && (rjVar2 = ((bn) g2Var).f45903a0) != null) {
                        rjVar2.u1(z4.g(s3Var.f22373t3), z10, i7, i10);
                        uiVar.a(true);
                        return true;
                    }
                } else {
                    ArrayList c32 = s3Var.c3();
                    if (!c32.isEmpty()) {
                        ArrayList E2 = s3Var.E2();
                        ArrayList B2 = s3Var.B2();
                        ArrayList a10 = y4.a(i11, c32);
                        org.telegram.ui.ActionBar.g2 g2Var2 = uiVar.f40352a2;
                        if (g2Var2 instanceof bn) {
                            bn bnVar = (bn) g2Var2;
                            gj gjVar3 = bnVar.F5;
                            gj gjVar4 = bnVar.f46067m4;
                            rm rmVar2 = bnVar.D5;
                            long j92 = bnVar.j9();
                            cwVar = bnVar.Y8();
                            gjVar = gjVar4;
                            rmVar = rmVar2;
                            j10 = j92;
                            gjVar2 = gjVar3;
                        } else {
                            gjVar = null;
                            rmVar = null;
                            cwVar = null;
                            j10 = 0;
                            gjVar2 = null;
                        }
                        az.R(org.telegram.messenger.c.a(uiVar.H3), c32, E2, B2, a10, uiVar.c1(), gjVar2, gjVar, rmVar, z10, i7, i10, cwVar, j3, j10, 0L);
                        org.telegram.ui.ActionBar.g2 g2Var3 = uiVar.f40352a2;
                        if ((g2Var3 instanceof bn) && (rjVar = ((bn) g2Var3).f45903a0) != null && (mgVar = rjVar.P3) != null) {
                            mgVar.H(null, z10, i7, i10, 0L);
                        }
                        uiVar.a(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean N() {
        return !this.f22237r.n3();
    }

    public final void U(a70 a70Var, a aVar, TL_iv.PageBlock pageBlock, int i7, String str, int i10, a70 a70Var2) {
        boolean z10;
        if (aVar != null && aVar.f21901b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        a70Var.j(z10, i7, null, str, new ai.m(this, aVar, pageBlock, a70Var2, 29));
        a70Var.z().f30253a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        a70Var.z().f30253a.setTextSize(1, i10);
    }

    public final boolean V() {
        s3 s3Var = this.f22237r;
        if (s3Var == null || !s3Var.n3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f37476a);
        String N0 = hd.N0(2131753990, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
        t1Var.S = N0;
        t1Var.U = hd.N0(2131753991, null);
        alertDialog$Builder.h(hd.N0(2131751586, null), new org.telegram.ui.ActionBar.q1(this) {
            public final o f22128b;

            {
                this.f22128b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f22128b.f37477b.dismiss();
                        return;
                    default:
                        o oVar = this.f22128b;
                        oVar.Y();
                        oVar.f37477b.dismiss();
                        return;
                }
            }
        });
        alertDialog$Builder.k(hd.N0(2131745750, null), new org.telegram.ui.ActionBar.q1(this) {
            public final o f22128b;

            {
                this.f22128b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f22128b.f37477b.dismiss();
                        return;
                    default:
                        o oVar = this.f22128b;
                        oVar.Y();
                        oVar.f37477b.dismiss();
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
            ty tyVar = this.f22240x;
            if (tyVar != null) {
                tyVar.t(false);
                if (!z10) {
                    this.f22240x.A();
                }
            }
        }
        this.G = null;
        ty tyVar2 = this.f22240x;
        if (tyVar2 != null) {
            tyVar2.setTranslationY(0.0f);
            this.f22240x.setVisibility(8);
        }
        this.f22241y = false;
        this.F = 0;
        x3 x3Var = this.f22238s;
        if (x3Var != null) {
            x3Var.setEmojiOpened(false);
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
        ty tyVar = this.f22240x;
        float f13 = 0.0f;
        ui uiVar = this.f37477b;
        if (tyVar != null) {
            if (this.f22241y) {
                float f14 = this.F - i7;
                if (this.E) {
                    f12 = -uiVar.f40379j4;
                } else {
                    f12 = 0.0f;
                }
                f11 = f14 + f12;
            } else {
                f11 = 0.0f;
            }
            tyVar.setTranslationY(f11);
        }
        x3 x3Var = this.f22238s;
        if (x3Var != null) {
            boolean z10 = this.f22241y;
            if (z10) {
                f10 = i7;
            } else {
                if (!this.M && this.F <= 0) {
                    i10 = org.telegram.messenger.g0.f24005n;
                } else {
                    i10 = 0;
                }
                f10 = i10;
            }
            if (!z10 || this.E) {
                f10 += uiVar.f40379j4;
            }
            x3Var.getBottomContainer().animate().cancel();
            x3Var.getBottomContainer().setTranslationY(-f10);
            boolean z11 = this.f22241y;
            if (z11) {
                f13 = i7;
            }
            if (!z11 || this.E) {
                f13 += uiVar.f40379j4;
            }
            x3Var.setBottomGradientTranslationY(-f13);
            if (this.N != this.L) {
                ViewPropertyAnimator animate = x3Var.getBottomInnerContainer().animate();
                this.N = this.L;
                animate.translationY(-i11).setDuration(320L).setInterpolator(nr.h).start();
            }
        }
    }

    public final boolean Y() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f37477b.f40352a2;
        if (g2Var instanceof bn) {
            bn bnVar = (bn) g2Var;
            s3 s3Var = this.f22237r;
            if (!s3Var.u2()) {
                return false;
            }
            TL_iv.RichMessage m22 = s3Var.m2();
            si.d0(org.telegram.messenger.c.a(this.f22236n).f23166a).V1(bnVar.a(), bnVar.Q7(bnVar.F5), "", null, null, null, null, 0L, false, false, m22);
            rj rjVar = bnVar.f45903a0;
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
        if (!this.f22237r.n3() && !this.f22241y) {
            z11 = false;
        } else {
            z11 = true;
        }
        ui uiVar = this.f37477b;
        uh uhVar = uiVar.f40422v3;
        if (uiVar.f40423v4 != z11) {
            uiVar.f40423v4 = z11;
            if (uiVar.Q2) {
                uhVar.animate().cancel();
                if (!z11) {
                    uhVar.setVisibility(0);
                }
                float f10 = 1.0f;
                float f11 = 0.0f;
                if (z10) {
                    ViewPropertyAnimator animate = uhVar.animate();
                    if (z11) {
                        f10 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f10);
                    if (z11) {
                        f11 = org.telegram.messenger.g0.L(48.0f);
                    }
                    alpha.translationY(f11).setDuration(180L).withEndAction(new ph(uiVar, z11, 3)).start();
                } else {
                    if (z11) {
                        f10 = 0.0f;
                    }
                    uhVar.setAlpha(f10);
                    if (z11) {
                        f11 = org.telegram.messenger.g0.L(48.0f);
                    }
                    uhVar.setTranslationY(f11);
                    if (z11) {
                        i7 = 4;
                    } else {
                        i7 = 0;
                    }
                    uhVar.setVisibility(i7);
                }
            }
        }
        if (!z11 && !uiVar.M1 && uiVar.Q2) {
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
        throw new UnsupportedOperationException("Method not decompiled: oi.o.b0():void");
    }

    public final void c0() {
        boolean z10;
        float f10;
        x3 x3Var = this.f22238s;
        if (x3Var != null) {
            s3 s3Var = this.f22237r;
            boolean u22 = s3Var.u2();
            e2 e2Var = s3Var.R3;
            if (e2Var != null && !e2Var.f22060c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = x3Var.f22501r;
            ImageView imageView2 = x3Var.f22498n;
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
        x3 x3Var = this.f22238s;
        if (x3Var != null) {
            int i7 = this.f22236n;
            boolean z11 = false;
            if (!np.u1(i7).B4() && !k10.i(i7).q()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ug sendButton = x3Var.getSendButton();
            if (z10) {
                s3 s3Var = this.f22237r;
                if (z4.d(s3Var.f22373t3, s3Var.f22375u3)) {
                    z11 = true;
                }
            }
            sendButton.setLocked(z11);
            x3Var.setPremiumLocked(z10);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.f25291i5) {
            d0();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        s3 s3Var = this.f22237r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f37477b.f40352a2 instanceof bn) && s3Var.u2() && Y()) {
                org.telegram.messenger.f3.n(null, 2131745807, new lc(this.f22238s, this.f37476a), 2131623990, 36);
                return true;
            }
        } else if (!s3Var.k3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        ty tyVar;
        s3 s3Var = this.f22237r;
        g3 g3Var = s3Var.f22377v3;
        v9 v9Var = s3Var.f22379w3;
        if (!g3Var.x() || !v9Var.onTouchEvent(motionEvent)) {
            if (this.E && (tyVar = this.f22240x) != null) {
                height = (int) tyVar.getY();
            } else {
                height = getHeight() - this.F;
            }
            int L = (height - org.telegram.messenger.g0.L(60.0f)) - this.L;
            if (motionEvent.getAction() == 0 && this.f22241y && motionEvent.getY() < L) {
                W(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > org.telegram.messenger.g0.L(60.0f) && motionEvent.getY() < L)) && v9Var.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < L && s3Var.l3(motionEvent)) {
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
        throw new UnsupportedOperationException("Method not decompiled: oi.o.e0():void");
    }

    public final void f0() {
        int i7;
        x3 x3Var = this.f22238s;
        if (x3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(44.0f)) / 2) + org.telegram.messenger.g0.f24004m) - org.telegram.messenger.g0.L(8.0f);
        s3 s3Var = this.f22237r;
        if (s3Var.getChildCount() <= 0) {
            i7 = s3Var.getPaddingTop();
        } else {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < s3Var.getChildCount(); i11++) {
                View childAt = s3Var.getChildAt(i11);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            if (i10 == Integer.MAX_VALUE) {
                i7 = s3Var.getPaddingTop();
            } else {
                i7 = i10;
            }
        }
        x3Var.setTopButtonsOffset(Math.max(currentActionBarHeight, i7));
    }

    @Override
    public int getCurrentItemTop() {
        s3 s3Var = this.f22237r;
        if (s3Var.getChildCount() <= 0) {
            int paddingTop = s3Var.getPaddingTop();
            this.J = paddingTop;
            s3Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        boolean z10 = false;
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < s3Var.getChildCount(); i10++) {
            View childAt = s3Var.getChildAt(i10);
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
        s3Var.setTopGlowOffset(Math.max(0, i7));
        int i11 = i7 - org.telegram.messenger.g0.f24004m;
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
        return (this.f22237r.getPaddingTop() - org.telegram.messenger.g0.f24004m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public j9 getTextSelectionHelper() {
        return this.f22237r.getTextSelectionHelper();
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
                ty tyVar = this.f22240x;
                if (tyVar != null) {
                    tyVar.t(false);
                    this.f22240x.A();
                }
                X();
                return false;
            }
        } else if (this.f22241y) {
            W(false);
            return false;
        } else if (!this.f22237r.I2() && !V()) {
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
        ls.f(this.f22236n).c(this, ls.f25291i5);
        d0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.f(this.f22236n).n(this, ls.f25291i5);
    }

    @Override
    public final void p() {
        eg0 eg0Var = this.P;
        if (eg0Var != null) {
            eg0Var.i();
            this.P = null;
        }
        ga.d dVar = this.f22239w;
        if (dVar != null) {
            dVar.c();
        }
        s3 s3Var = this.f22237r;
        if (s3Var != null) {
            s3Var.y2();
        }
        ty tyVar = this.f22240x;
        if (tyVar != null) {
            tyVar.B();
        }
    }

    @Override
    public final boolean q() {
        s3 s3Var = this.f22237r;
        if (s3Var != null) {
            s3Var.y2();
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
        this.f37477b.f30142b.invalidate();
        invalidate();
    }

    @Override
    public final void u() {
        ga.d dVar = this.f22239w;
        if (dVar != null) {
            dVar.c();
        }
        if (this.f22241y) {
            W(false);
        }
    }

    @Override
    public final void y() {
        boolean z10;
        if (this.f37477b.f40398p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
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
        if (z10 && this.f22241y && !this.E) {
            W(false);
        }
        f0();
    }

    @Override
    public final void t() {
    }
}
