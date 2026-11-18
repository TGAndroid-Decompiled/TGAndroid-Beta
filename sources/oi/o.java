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
import c8.ma;
import di.j7;
import hi.e7;
import java.util.ArrayList;
import org.telegram.messenger.bw;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.sh;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.y60;
import org.telegram.ui.bn;
import org.telegram.ui.eg0;
import org.telegram.ui.rj;
import org.telegram.ui.rm;
public final class o extends ki implements fs {
    public static final int[] R = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public boolean E;
    public int F;
    public e1 G;
    public int H;
    public y60 I;
    public int J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public boolean O;
    public eg0 P;
    public final d Q;
    public final int f22209n;
    public final s3 f22210r;
    public final x3 f22211s;
    public ga.d f22212w;
    public ry f22213x;
    public boolean f22214y;

    public o(int i7, Context context, i6 i6Var, si siVar) {
        super(context, i6Var, siVar);
        k kVar = new k(this);
        this.K = true;
        this.Q = new d(this, 3);
        this.f22209n = i7;
        this.h = true;
        this.f36769f = true;
        s3 s3Var = new s3(context, i7, i6Var, new k8.a(7, this, i6Var));
        this.f22210r = s3Var;
        s3Var.setAdaptiveLinkDialogs(false);
        s3Var.setAllowTapAboveContent(false);
        addView(s3Var, ma.e(-1, -1, 119));
        addView(s3Var.getOverlayView(), ma.e(-1, -1, 119));
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
        this.f22211s = x3Var;
        x3Var.setBackVisible(false);
        x3Var.setTopGradientVisible(false);
        d0();
        addView(x3Var, ma.e(-1, -1, 119));
        c0();
        e0();
        a0(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 0));
    }

    public static void P(o oVar) {
        boolean z10;
        int i7 = 0;
        if (!oVar.f22210r.n3() && !oVar.f22214y) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            si siVar = oVar.f36766b;
            if (!siVar.M1 && siVar.Q2) {
                i7 = org.telegram.messenger.g0.L(62.0f);
            }
        }
        if (oVar.L != i7) {
            oVar.L = i7;
            oVar.X();
        }
    }

    public static void Q(o oVar) {
        s3 s3Var = oVar.f22210r;
        if (oVar.f22214y) {
            e1 S2 = s3Var.S2();
            if (S2 != null) {
                S2.O();
                org.telegram.messenger.g0.I3(S2);
            }
            oVar.W(true);
            return;
        }
        si siVar = oVar.f36766b;
        if (oVar.f22213x == null) {
            ry ryVar = new ry(siVar.f39659a2, true, false, false, oVar.getContext(), true, null, siVar.f39705p3, true, oVar.f36765a, false, false);
            oVar.f22213x = ryVar;
            ryVar.setVisibility(8);
            ry ryVar2 = oVar.f22213x;
            ryVar2.f39413y2 = false;
            ryVar2.setBottomInset(org.telegram.messenger.g0.f24116n);
            View view = oVar.f22213x.f39402w;
            if (view != null) {
                view.setVisibility(8);
            }
            oVar.f22213x.setDelegate(new n(oVar));
            oVar.addView(oVar.f22213x, ma.e(-1, oVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = oVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oVar.f22213x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        oVar.f22213x.setLayoutParams(layoutParams);
        oVar.f22213x.setTranslationY(0.0f);
        oVar.f22213x.setVisibility(0);
        oVar.f22214y = true;
        oVar.F = emojiPanelHeight;
        e1 S22 = s3Var.S2();
        if (S22 != null) {
            org.telegram.messenger.g0.v1(S22);
        }
        x3 x3Var = oVar.f22211s;
        if (x3Var != null) {
            x3Var.setEmojiOpened(true);
        }
        oVar.a0(false);
        oVar.requestLayout();
    }

    public static e1 R(o oVar) {
        s3 s3Var = oVar.f22210r;
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
        if (e1Var == oVar.G && oVar.f22210r.getFocusedEditTextOrNull() != e1Var) {
            return Math.min(oVar.H, e1Var.length());
        }
        return Math.max(0, e1Var.getSelectionEnd());
    }

    public static void T(o oVar, int i7, int i10) {
        si siVar = oVar.f36766b;
        if (siVar.f39659a2 == null) {
            return;
        }
        si siVar2 = new si(oVar.getContext(), siVar.f39659a2, false, false, true, oVar.f36765a);
        siVar2.X3 = new l(oVar, siVar2);
        siVar2.f39670e2.i0();
        siVar2.z1(1, true);
        siVar2.W0(i7);
        siVar2.f39726u4 = new e(oVar, siVar2);
        siVar2.T1 = new e(oVar, siVar2);
        siVar2.S1 = new m(oVar, siVar2);
        siVar2.f1();
        if (i10 != 0) {
            siVar2.p1(i10);
        }
        siVar2.A0(true);
        siVar2.show();
    }

    public static void Z(Context context, final String str, final x10 x10Var, i6 i6Var) {
        String str2;
        org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.f3.j(1, context, i6Var, true);
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
        g10.addView(horizontalScrollView, ma.t(-1, -2, 49, 12, 2, 12, 0));
        hi.d g11 = n10.g(24, context, i6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        j7 j7Var = new j7(strArr, horizontalScrollView, g11, zArr2, new e7(strArr, 26), imageView, i6Var, new int[]{6}, 2);
        final org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, gd.M0(2131754006, null), true, false, -1, i6Var);
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        int i10 = n6.f29396d6;
        ShapeDrawable d03 = n6.d0(L2, n6.w0(i10, i6Var));
        q6 M = u6.M(i10);
        k3Var.setBackground(d03);
        u6.j(k3Var, d03, M, null, i6Var);
        k3Var.setText(strArr[0]);
        i3Var.addTextChangedListener(new bi.v(strArr, j7Var, false, 9));
        g10.addView(k3Var, ma.t(-1, -2, 55, 12, 8, 12, 0));
        g11.setText(gd.M0(2131751343, null));
        g10.addView(g11, ma.t(-1, 48, 55, 12, 12, 12, 12));
        j7Var.run();
        j3.O = g10;
        j3.I0 = new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.i3 i3Var2 = org.telegram.ui.Cells.k3.this.d;
                i3Var2.clearFocus();
                org.telegram.messenger.g0.v1(i3Var2);
                boolean[] zArr3 = zArr;
                if (!zArr3[0] && !zArr2[0]) {
                    String[] strArr2 = strArr;
                    if (!TextUtils.equals(str, strArr2[0])) {
                        zArr3[0] = true;
                        x10Var.a(strArr2[0]);
                    }
                }
            }
        };
        j3.show();
        int i11 = n6.f29339a7;
        j3.w0(i11);
        j3.Q(i11);
        g11.setOnClickListener(new fi.d0(g11, zArr, x10Var, strArr, j3, 4));
        org.telegram.messenger.g0.h3(new kg.j0(k3Var, 25), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int Q = this.f36766b.f39705p3.Q();
        if (Q <= 0) {
            SharedPreferences f12 = mp.f1();
            Point point = org.telegram.messenger.g0.f24121q;
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
        return Q + org.telegram.messenger.g0.f24116n;
    }

    @Override
    public final void B(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: oi.o.B(int, int):void");
    }

    @Override
    public final void I(ki kiVar) {
        this.f36766b.V2.setTitle("");
        this.f22210r.f34607g3.O(false);
        a0(false);
        post(new d(this, 4));
    }

    @Override
    public final void K() {
        this.f22210r.y0(0);
    }

    @Override
    public final boolean M(boolean z10, int i7, int i10, long j3, boolean z11) {
        fj fjVar;
        rm rmVar;
        bw bwVar;
        long j10;
        fj fjVar2;
        rj rjVar;
        kg kgVar;
        rj rjVar2;
        int i11 = this.f22209n;
        boolean B4 = mp.u1(i11).B4();
        s3 s3Var = this.f22210r;
        if (!B4 && !j10.i(i11).q() && z4.d(s3Var.f22345t3, s3Var.f22347u3)) {
            z1.u0(getContext(), new b(s3Var, 0), new d(this, 2), this.f36765a);
            return false;
        }
        if (s3Var.n3() && !s3Var.p3()) {
            if (!s3Var.P3()) {
                x3 x3Var = this.f22211s;
                if (x3Var != null) {
                    x3Var.setSendEnabled(s3Var.P3());
                    return false;
                }
            } else {
                boolean B42 = mp.u1(i11).B4();
                si siVar = this.f36766b;
                if (!B42) {
                    org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
                    if ((h2Var instanceof bn) && (rjVar2 = ((bn) h2Var).f45932a0) != null) {
                        rjVar2.q1(z4.g(s3Var.f22345t3), z10, i7, i10);
                        siVar.a(true);
                        return true;
                    }
                } else {
                    ArrayList c32 = s3Var.c3();
                    if (!c32.isEmpty()) {
                        ArrayList E2 = s3Var.E2();
                        ArrayList B2 = s3Var.B2();
                        ArrayList a10 = y4.a(i11, c32);
                        org.telegram.ui.ActionBar.h2 h2Var2 = siVar.f39659a2;
                        if (h2Var2 instanceof bn) {
                            bn bnVar = (bn) h2Var2;
                            fj fjVar3 = bnVar.F5;
                            fj fjVar4 = bnVar.f46096m4;
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
                        zy.R(org.telegram.messenger.c.a(siVar.H3), c32, E2, B2, a10, siVar.c1(), fjVar2, fjVar, rmVar, z10, i7, i10, bwVar, j3, j10, 0L);
                        org.telegram.ui.ActionBar.h2 h2Var3 = siVar.f39659a2;
                        if ((h2Var3 instanceof bn) && (rjVar = ((bn) h2Var3).f45932a0) != null && (kgVar = rjVar.N3) != null) {
                            kgVar.H(null, z10, i7, i10, 0L);
                        }
                        siVar.a(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean N() {
        return !this.f22210r.n3();
    }

    public final void U(y60 y60Var, a aVar, TL_iv.PageBlock pageBlock, int i7, String str, int i10, y60 y60Var2) {
        boolean z10;
        if (aVar != null && aVar.f21910b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        y60Var.j(z10, i7, null, str, new ai.s(this, aVar, pageBlock, y60Var2, 29));
        y60Var.z().f30303a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        y60Var.z().f30303a.setTextSize(1, i10);
    }

    public final boolean V() {
        s3 s3Var = this.f22210r;
        if (s3Var == null || !s3Var.n3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f36765a);
        String M0 = gd.M0(2131753991, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        u1Var.U = gd.M0(2131753992, null);
        alertDialog$Builder.h(gd.M0(2131751587, null), new org.telegram.ui.ActionBar.r1(this) {
            public final o f22101b;

            {
                this.f22101b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f22101b.f36766b.dismiss();
                        return;
                    default:
                        o oVar = this.f22101b;
                        oVar.Y();
                        oVar.f36766b.dismiss();
                        return;
                }
            }
        });
        alertDialog$Builder.k(gd.M0(2131745751, null), new org.telegram.ui.ActionBar.r1(this) {
            public final o f22101b;

            {
                this.f22101b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f22101b.f36766b.dismiss();
                        return;
                    default:
                        o oVar = this.f22101b;
                        oVar.Y();
                        oVar.f36766b.dismiss();
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
            ry ryVar = this.f22213x;
            if (ryVar != null) {
                ryVar.t(false);
                if (!z10) {
                    this.f22213x.A();
                }
            }
        }
        this.G = null;
        ry ryVar2 = this.f22213x;
        if (ryVar2 != null) {
            ryVar2.setTranslationY(0.0f);
            this.f22213x.setVisibility(8);
        }
        this.f22214y = false;
        this.F = 0;
        x3 x3Var = this.f22211s;
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
        ry ryVar = this.f22213x;
        float f13 = 0.0f;
        si siVar = this.f36766b;
        if (ryVar != null) {
            if (this.f22214y) {
                float f14 = this.F - i7;
                if (this.E) {
                    f12 = -siVar.f39686j4;
                } else {
                    f12 = 0.0f;
                }
                f11 = f14 + f12;
            } else {
                f11 = 0.0f;
            }
            ryVar.setTranslationY(f11);
        }
        x3 x3Var = this.f22211s;
        if (x3Var != null) {
            boolean z10 = this.f22214y;
            if (z10) {
                f10 = i7;
            } else {
                if (!this.M && this.F <= 0) {
                    i10 = org.telegram.messenger.g0.f24116n;
                } else {
                    i10 = 0;
                }
                f10 = i10;
            }
            if (!z10 || this.E) {
                f10 += siVar.f39686j4;
            }
            x3Var.getBottomContainer().animate().cancel();
            x3Var.getBottomContainer().setTranslationY(-f10);
            boolean z11 = this.f22214y;
            if (z11) {
                f13 = i7;
            }
            if (!z11 || this.E) {
                f13 += siVar.f39686j4;
            }
            x3Var.setBottomGradientTranslationY(-f13);
            if (this.N != this.L) {
                ViewPropertyAnimator animate = x3Var.getBottomInnerContainer().animate();
                this.N = this.L;
                animate.translationY(-i11).setDuration(320L).setInterpolator(lr.h).start();
            }
        }
    }

    public final boolean Y() {
        org.telegram.ui.ActionBar.h2 h2Var = this.f36766b.f39659a2;
        if (h2Var instanceof bn) {
            bn bnVar = (bn) h2Var;
            s3 s3Var = this.f22210r;
            if (!s3Var.u2()) {
                return false;
            }
            TL_iv.RichMessage m22 = s3Var.m2();
            ri.d0(org.telegram.messenger.c.a(this.f22209n).f23221a).V1(bnVar.a(), bnVar.Q7(bnVar.F5), "", null, null, null, null, 0L, false, false, m22);
            rj rjVar = bnVar.f45932a0;
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
        if (!this.f22210r.n3() && !this.f22214y) {
            z11 = false;
        } else {
            z11 = true;
        }
        si siVar = this.f36766b;
        sh shVar = siVar.f39729v3;
        if (siVar.f39730v4 != z11) {
            siVar.f39730v4 = z11;
            if (siVar.Q2) {
                shVar.animate().cancel();
                if (!z11) {
                    shVar.setVisibility(0);
                }
                float f10 = 1.0f;
                float f11 = 0.0f;
                if (z10) {
                    ViewPropertyAnimator animate = shVar.animate();
                    if (z11) {
                        f10 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f10);
                    if (z11) {
                        f11 = org.telegram.messenger.g0.L(48.0f);
                    }
                    alpha.translationY(f11).setDuration(180L).withEndAction(new nh(siVar, z11, 3)).start();
                } else {
                    if (z11) {
                        f10 = 0.0f;
                    }
                    shVar.setAlpha(f10);
                    if (z11) {
                        f11 = org.telegram.messenger.g0.L(48.0f);
                    }
                    shVar.setTranslationY(f11);
                    if (z11) {
                        i7 = 4;
                    } else {
                        i7 = 0;
                    }
                    shVar.setVisibility(i7);
                }
            }
        }
        if (!z11 && !siVar.M1 && siVar.Q2) {
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
        x3 x3Var = this.f22211s;
        if (x3Var != null) {
            s3 s3Var = this.f22210r;
            boolean u22 = s3Var.u2();
            e2 e2Var = s3Var.R3;
            if (e2Var != null && !e2Var.f22034c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = x3Var.f22478r;
            ImageView imageView2 = x3Var.f22475n;
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
        x3 x3Var = this.f22211s;
        if (x3Var != null) {
            int i7 = this.f22209n;
            boolean z11 = false;
            if (!mp.u1(i7).B4() && !j10.i(i7).q()) {
                z10 = true;
            } else {
                z10 = false;
            }
            sg sendButton = x3Var.getSendButton();
            if (z10) {
                s3 s3Var = this.f22210r;
                if (z4.d(s3Var.f22345t3, s3Var.f22347u3)) {
                    z11 = true;
                }
            }
            sendButton.setLocked(z11);
            x3Var.setPremiumLocked(z10);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25129h5) {
            d0();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        s3 s3Var = this.f22210r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f36766b.f39659a2 instanceof bn) && s3Var.u2() && Y()) {
                org.telegram.messenger.f3.n(null, 2131745808, new lc(this.f22211s, this.f36765a), 2131623990, 36);
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
        ry ryVar;
        s3 s3Var = this.f22210r;
        g3 g3Var = s3Var.f22349v3;
        u9 u9Var = s3Var.f22351w3;
        if (!g3Var.x() || !u9Var.onTouchEvent(motionEvent)) {
            if (this.E && (ryVar = this.f22213x) != null) {
                height = (int) ryVar.getY();
            } else {
                height = getHeight() - this.F;
            }
            int L = (height - org.telegram.messenger.g0.L(60.0f)) - this.L;
            if (motionEvent.getAction() == 0 && this.f22214y && motionEvent.getY() < L) {
                W(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > org.telegram.messenger.g0.L(60.0f) && motionEvent.getY() < L)) && u9Var.b(motionEvent)) {
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
        x3 x3Var = this.f22211s;
        if (x3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(44.0f)) / 2) + org.telegram.messenger.g0.f24115m) - org.telegram.messenger.g0.L(8.0f);
        s3 s3Var = this.f22210r;
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
        s3 s3Var = this.f22210r;
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
        int i11 = i7 - org.telegram.messenger.g0.f24115m;
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
        return (this.f22210r.getPaddingTop() - org.telegram.messenger.g0.f24115m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public i9 getTextSelectionHelper() {
        return this.f22210r.getTextSelectionHelper();
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
                ry ryVar = this.f22213x;
                if (ryVar != null) {
                    ryVar.t(false);
                    this.f22213x.A();
                }
                X();
                return false;
            }
        } else if (this.f22214y) {
            W(false);
            return false;
        } else if (!this.f22210r.I2() && !V()) {
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
        ks.f(this.f22209n).c(this, ks.f25129h5);
        d0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f22209n).n(this, ks.f25129h5);
    }

    @Override
    public final void p() {
        eg0 eg0Var = this.P;
        if (eg0Var != null) {
            eg0Var.i();
            this.P = null;
        }
        ga.d dVar = this.f22212w;
        if (dVar != null) {
            dVar.c();
        }
        s3 s3Var = this.f22210r;
        if (s3Var != null) {
            s3Var.y2();
        }
        ry ryVar = this.f22213x;
        if (ryVar != null) {
            ryVar.B();
        }
    }

    @Override
    public final boolean q() {
        s3 s3Var = this.f22210r;
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
        this.f36766b.f30192b.invalidate();
        invalidate();
    }

    @Override
    public final void u() {
        ga.d dVar = this.f22212w;
        if (dVar != null) {
            dVar.c();
        }
        if (this.f22214y) {
            W(false);
        }
    }

    @Override
    public final void y() {
        boolean z10;
        if (this.f36766b.f39705p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
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
        if (z10 && this.f22214y && !this.E) {
            W(false);
        }
        f0();
    }

    @Override
    public final void t() {
    }
}
