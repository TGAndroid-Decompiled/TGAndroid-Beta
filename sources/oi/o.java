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
import c8.ja;
import di.g7;
import java.util.ArrayList;
import org.telegram.messenger.ez;
import org.telegram.messenger.fw;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.kh;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.m60;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.qj;
import org.telegram.ui.qm;
public final class o extends ci implements is {
    public static final int[] R = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public boolean E;
    public int F;
    public e1 G;
    public int H;
    public m60 I;
    public int J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public boolean O;
    public bg0 P;
    public final d Q;
    public final int f21847n;
    public final q3 f21848r;
    public final v3 f21849s;
    public ga.d f21850w;
    public ly f21851x;
    public boolean f21852y;

    public o(int i7, Context context, e6 e6Var, ki kiVar) {
        super(context, e6Var, kiVar);
        k kVar = new k(this);
        this.K = true;
        this.Q = new d(this, 3);
        this.f21847n = i7;
        this.h = true;
        this.f33610f = true;
        q3 q3Var = new q3(context, i7, e6Var, new k8.a(7, this, e6Var));
        this.f21848r = q3Var;
        q3Var.setAdaptiveLinkDialogs(false);
        q3Var.setAllowTapAboveContent(false);
        addView(q3Var, ja.e(-1, -1, 119));
        addView(q3Var.getOverlayView(), ja.e(-1, -1, 119));
        q3Var.C4();
        d2 d2Var = q3Var.R3;
        if (d2Var != null) {
            d2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        v3 v3Var = new v3(context, kVar);
        this.f21849s = v3Var;
        v3Var.setBackVisible(false);
        v3Var.setTopGradientVisible(false);
        d0();
        addView(v3Var, ja.e(-1, -1, 119));
        c0();
        e0();
        a0(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 0));
    }

    public static void P(o oVar) {
        boolean z10;
        int i7 = 0;
        if (!oVar.f21848r.n3() && !oVar.f21852y) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            ki kiVar = oVar.f33607b;
            if (!kiVar.M1 && kiVar.Q2) {
                i7 = org.telegram.messenger.g0.L(62.0f);
            }
        }
        if (oVar.L != i7) {
            oVar.L = i7;
            oVar.X();
        }
    }

    public static void Q(o oVar) {
        q3 q3Var = oVar.f21848r;
        if (oVar.f21852y) {
            e1 S2 = q3Var.S2();
            if (S2 != null) {
                S2.O();
                org.telegram.messenger.g0.J3(S2);
            }
            oVar.W(true);
            return;
        }
        ki kiVar = oVar.f33607b;
        if (oVar.f21851x == null) {
            ly lyVar = new ly(kiVar.f36436a2, true, false, false, oVar.getContext(), true, null, kiVar.f36482p3, true, oVar.f33606a, false, false);
            oVar.f21851x = lyVar;
            lyVar.setVisibility(8);
            ly lyVar2 = oVar.f21851x;
            lyVar2.f37009y2 = false;
            lyVar2.setBottomInset(org.telegram.messenger.g0.f23604n);
            View view = oVar.f21851x.f36998w;
            if (view != null) {
                view.setVisibility(8);
            }
            oVar.f21851x.setDelegate(new n(oVar));
            oVar.addView(oVar.f21851x, ja.e(-1, oVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = oVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oVar.f21851x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        oVar.f21851x.setLayoutParams(layoutParams);
        oVar.f21851x.setTranslationY(0.0f);
        oVar.f21851x.setVisibility(0);
        oVar.f21852y = true;
        oVar.F = emojiPanelHeight;
        e1 S22 = q3Var.S2();
        if (S22 != null) {
            org.telegram.messenger.g0.v1(S22);
        }
        v3 v3Var = oVar.f21849s;
        if (v3Var != null) {
            v3Var.setEmojiOpened(true);
        }
        oVar.a0(false);
        oVar.requestLayout();
    }

    public static e1 R(o oVar) {
        q3 q3Var = oVar.f21848r;
        e1 focusedEditTextOrNull = q3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            oVar.G = focusedEditTextOrNull;
            oVar.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        e1 e1Var = oVar.G;
        if (e1Var != null) {
            return e1Var;
        }
        return q3Var.S2();
    }

    public static int S(o oVar, e1 e1Var) {
        if (e1Var == oVar.G && oVar.f21848r.getFocusedEditTextOrNull() != e1Var) {
            return Math.min(oVar.H, e1Var.length());
        }
        return Math.max(0, e1Var.getSelectionEnd());
    }

    public static void T(o oVar, int i7, int i10) {
        ki kiVar = oVar.f33607b;
        if (kiVar.f36436a2 == null) {
            return;
        }
        ki kiVar2 = new ki(oVar.getContext(), kiVar.f36436a2, false, false, true, oVar.f33606a);
        kiVar2.X3 = new l(oVar, kiVar2);
        kiVar2.f36447e2.i0();
        kiVar2.y1(1, true);
        kiVar2.V0(i7);
        kiVar2.f36503u4 = new e(oVar, kiVar2);
        kiVar2.T1 = new e(oVar, kiVar2);
        kiVar2.S1 = new m(oVar, kiVar2);
        kiVar2.e1();
        if (i10 != 0) {
            kiVar2.o1(i10);
        }
        kiVar2.A0(true);
        kiVar2.show();
    }

    public static void Z(Context context, final String str, final z10 z10Var, e6 e6Var) {
        String str2;
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        int L = org.telegram.messenger.g0.L(8.0f);
        int i7 = j6.G6;
        ShapeDrawable d02 = j6.d0(L, j6.r1(0.05f, j6.w0(i7, e6Var)));
        m6 K = q6.K(0.05f, i7);
        imageView.setBackground(d02);
        q6.j(imageView, d02, K, null, e6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f10.addView(horizontalScrollView, ja.t(-1, -2, 49, 12, 2, 12, 0));
        hi.d g10 = i20.g(24, context, e6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        g7 g7Var = new g7(strArr, horizontalScrollView, g10, zArr2, new hi.q4(strArr, 26), imageView, e6Var, new int[]{6}, 2);
        final org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, hd.M0(2131754008, null), true, false, -1, e6Var);
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        int i10 = j6.f28849d6;
        ShapeDrawable d03 = j6.d0(L2, j6.w0(i10, e6Var));
        m6 M = q6.M(i10);
        k3Var.setBackground(d03);
        q6.j(k3Var, d03, M, null, e6Var);
        k3Var.setText(strArr[0]);
        i3Var.addTextChangedListener(new bi.v(strArr, g7Var, false, 9));
        f10.addView(k3Var, ja.t(-1, -2, 55, 12, 8, 12, 0));
        g10.setText(hd.M0(2131751354, null));
        f10.addView(g10, ja.t(-1, 48, 55, 12, 12, 12, 12));
        g7Var.run();
        k10.O = f10;
        k10.I0 = new DialogInterface.OnDismissListener() {
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
                        z10Var.a(strArr2[0]);
                    }
                }
            }
        };
        k10.show();
        int i11 = j6.f28792a7;
        k10.w0(i11);
        k10.Q(i11);
        g10.setOnClickListener(new fi.d0(g10, zArr, z10Var, strArr, k10, 4));
        org.telegram.messenger.g0.i3(new kg.j1(k3Var, 21), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int Q = this.f33607b.f36482p3.Q();
        if (Q <= 0) {
            SharedPreferences d12 = np.d1();
            Point point = org.telegram.messenger.g0.f23609q;
            if (point.x > point.y) {
                str = "kbd_height_land3";
            } else {
                str = "kbd_height";
            }
            Q = d12.getInt(str, org.telegram.messenger.g0.L(200.0f));
        }
        if (Q <= 0) {
            Q = org.telegram.messenger.g0.L(200.0f);
        }
        return Q + org.telegram.messenger.g0.f23604n;
    }

    @Override
    public final void B(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: oi.o.B(int, int):void");
    }

    @Override
    public final void I(ci ciVar) {
        this.f33607b.V2.setTitle("");
        this.f21848r.f39895g3.O(false);
        a0(false);
        post(new d(this, 4));
    }

    @Override
    public final void K() {
        this.f21848r.y0(0);
    }

    @Override
    public final boolean M(boolean z10, int i7, int i10, long j3, boolean z11) {
        gj gjVar;
        qm qmVar;
        fw fwVar;
        long j10;
        gj gjVar2;
        qj qjVar;
        cg cgVar;
        qj qjVar2;
        int i11 = this.f21847n;
        boolean s42 = np.s1(i11).s4();
        q3 q3Var = this.f21848r;
        if (!s42 && !m10.i(i11).q() && y4.d(q3Var.f21939t3, q3Var.f21941u3)) {
            z1.u0(getContext(), new b(q3Var, 0), new d(this, 2), this.f33606a);
            return false;
        }
        if (q3Var.n3() && !q3Var.p3()) {
            if (!q3Var.P3()) {
                v3 v3Var = this.f21849s;
                if (v3Var != null) {
                    v3Var.setSendEnabled(q3Var.P3());
                    return false;
                }
            } else {
                boolean s43 = np.s1(i11).s4();
                ki kiVar = this.f33607b;
                if (!s43) {
                    org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36436a2;
                    if ((e2Var instanceof an) && (qjVar2 = ((an) e2Var).f45118a0) != null) {
                        qjVar2.i1(y4.g(q3Var.f21939t3), z10, i7, i10);
                        kiVar.a(true);
                        return true;
                    }
                } else {
                    ArrayList c32 = q3Var.c3();
                    if (!c32.isEmpty()) {
                        ArrayList E2 = q3Var.E2();
                        ArrayList B2 = q3Var.B2();
                        ArrayList a10 = x4.a(i11, c32);
                        org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.f36436a2;
                        if (e2Var2 instanceof an) {
                            an anVar = (an) e2Var2;
                            gj gjVar3 = anVar.E5;
                            gj gjVar4 = anVar.f45281m4;
                            qm qmVar2 = anVar.C5;
                            long j92 = anVar.j9();
                            fwVar = anVar.Y8();
                            gjVar = gjVar4;
                            qmVar = qmVar2;
                            j10 = j92;
                            gjVar2 = gjVar3;
                        } else {
                            gjVar = null;
                            qmVar = null;
                            fwVar = null;
                            j10 = 0;
                            gjVar2 = null;
                        }
                        ez.R(org.telegram.messenger.c.a(kiVar.H3), c32, E2, B2, a10, kiVar.b1(), gjVar2, gjVar, qmVar, z10, i7, i10, fwVar, j3, j10, 0L);
                        org.telegram.ui.ActionBar.e2 e2Var3 = kiVar.f36436a2;
                        if ((e2Var3 instanceof an) && (qjVar = ((an) e2Var3).f45118a0) != null && (cgVar = qjVar.H3) != null) {
                            cgVar.M(null, z10, i7, i10, 0L);
                        }
                        kiVar.a(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean N() {
        return !this.f21848r.n3();
    }

    public final void U(m60 m60Var, a aVar, TL_iv.PageBlock pageBlock, int i7, String str, int i10, m60 m60Var2) {
        boolean z10;
        if (aVar != null && aVar.f21544b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        m60Var.j(z10, i7, null, str, new androidx.car.app.utils.a(this, aVar, pageBlock, m60Var2, 25));
        m60Var.y().f29899a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        m60Var.y().f29899a.setTextSize(1, i10);
    }

    public final boolean V() {
        q3 q3Var = this.f21848r;
        if (q3Var == null || !q3Var.n3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f33606a);
        String M0 = hd.M0(2131753993, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = hd.M0(2131753994, null);
        alertDialog$Builder.h(hd.M0(2131751598, null), new org.telegram.ui.ActionBar.q1(this) {
            public final o f21732b;

            {
                this.f21732b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f21732b.f33607b.dismiss();
                        return;
                    default:
                        o oVar = this.f21732b;
                        oVar.Y();
                        oVar.f33607b.dismiss();
                        return;
                }
            }
        });
        alertDialog$Builder.k(hd.M0(2131745946, null), new org.telegram.ui.ActionBar.q1(this) {
            public final o f21732b;

            {
                this.f21732b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f21732b.f33607b.dismiss();
                        return;
                    default:
                        o oVar = this.f21732b;
                        oVar.Y();
                        oVar.f33607b.dismiss();
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
            ly lyVar = this.f21851x;
            if (lyVar != null) {
                lyVar.t(false);
                if (!z10) {
                    this.f21851x.A();
                }
            }
        }
        this.G = null;
        ly lyVar2 = this.f21851x;
        if (lyVar2 != null) {
            lyVar2.setTranslationY(0.0f);
            this.f21851x.setVisibility(8);
        }
        this.f21852y = false;
        this.F = 0;
        v3 v3Var = this.f21849s;
        if (v3Var != null) {
            v3Var.setEmojiOpened(false);
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
        ly lyVar = this.f21851x;
        float f13 = 0.0f;
        ki kiVar = this.f33607b;
        if (lyVar != null) {
            if (this.f21852y) {
                float f14 = this.F - i7;
                if (this.E) {
                    f12 = -kiVar.f36463j4;
                } else {
                    f12 = 0.0f;
                }
                f11 = f14 + f12;
            } else {
                f11 = 0.0f;
            }
            lyVar.setTranslationY(f11);
        }
        v3 v3Var = this.f21849s;
        if (v3Var != null) {
            boolean z10 = this.f21852y;
            if (z10) {
                f10 = i7;
            } else {
                if (!this.M && this.F <= 0) {
                    i10 = org.telegram.messenger.g0.f23604n;
                } else {
                    i10 = 0;
                }
                f10 = i10;
            }
            if (!z10 || this.E) {
                f10 += kiVar.f36463j4;
            }
            v3Var.getBottomContainer().animate().cancel();
            v3Var.getBottomContainer().setTranslationY(-f10);
            boolean z11 = this.f21852y;
            if (z11) {
                f13 = i7;
            }
            if (!z11 || this.E) {
                f13 += kiVar.f36463j4;
            }
            v3Var.setBottomGradientTranslationY(-f13);
            if (this.N != this.L) {
                ViewPropertyAnimator animate = v3Var.getBottomInnerContainer().animate();
                this.N = this.L;
                animate.translationY(-i11).setDuration(320L).setInterpolator(er.h).start();
            }
        }
    }

    public final boolean Y() {
        org.telegram.ui.ActionBar.e2 e2Var = this.f33607b.f36436a2;
        if (e2Var instanceof an) {
            an anVar = (an) e2Var;
            q3 q3Var = this.f21848r;
            if (!q3Var.u2()) {
                return false;
            }
            TL_iv.RichMessage m22 = q3Var.m2();
            si.b0(org.telegram.messenger.c.a(this.f21847n).f22778a).Q1(anVar.a(), anVar.Q7(anVar.E5), "", null, null, null, null, 0L, false, false, m22);
            qj qjVar = anVar.f45118a0;
            if (qjVar != null) {
                qjVar.setRichDraftPreview(m22);
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
        if (!this.f21848r.n3() && !this.f21852y) {
            z11 = false;
        } else {
            z11 = true;
        }
        ki kiVar = this.f33607b;
        kh khVar = kiVar.f36506v3;
        if (kiVar.f36507v4 != z11) {
            kiVar.f36507v4 = z11;
            if (kiVar.Q2) {
                khVar.animate().cancel();
                if (!z11) {
                    khVar.setVisibility(0);
                }
                float f10 = 1.0f;
                float f11 = 0.0f;
                if (z10) {
                    ViewPropertyAnimator animate = khVar.animate();
                    if (z11) {
                        f10 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f10);
                    if (z11) {
                        f11 = org.telegram.messenger.g0.L(48.0f);
                    }
                    alpha.translationY(f11).setDuration(180L).withEndAction(new eh(kiVar, z11, 3)).start();
                } else {
                    if (z11) {
                        f10 = 0.0f;
                    }
                    khVar.setAlpha(f10);
                    if (z11) {
                        f11 = org.telegram.messenger.g0.L(48.0f);
                    }
                    khVar.setTranslationY(f11);
                    if (z11) {
                        i7 = 4;
                    } else {
                        i7 = 0;
                    }
                    khVar.setVisibility(i7);
                }
            }
        }
        if (!z11 && !kiVar.M1 && kiVar.Q2) {
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
        v3 v3Var = this.f21849s;
        if (v3Var != null) {
            q3 q3Var = this.f21848r;
            boolean u22 = q3Var.u2();
            d2 d2Var = q3Var.R3;
            if (d2Var != null && !d2Var.f21634c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = v3Var.f22077r;
            ImageView imageView2 = v3Var.f22074n;
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
        v3 v3Var = this.f21849s;
        if (v3Var != null) {
            int i7 = this.f21847n;
            boolean z11 = false;
            if (!np.s1(i7).s4() && !m10.i(i7).q()) {
                z10 = true;
            } else {
                z10 = false;
            }
            jg sendButton = v3Var.getSendButton();
            if (z10) {
                q3 q3Var = this.f21848r;
                if (y4.d(q3Var.f21939t3, q3Var.f21941u3)) {
                    z11 = true;
                }
            }
            sendButton.setLocked(z11);
            v3Var.setPremiumLocked(z10);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25497f5) {
            d0();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        q3 q3Var = this.f21848r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f33607b.f36436a2 instanceof an) && q3Var.u2() && Y()) {
                org.telegram.messenger.k5.n(null, 2131746003, new cc(this.f21849s, this.f33606a), 2131623990, 36);
                return true;
            }
        } else if (!q3Var.k3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        ly lyVar;
        q3 q3Var = this.f21848r;
        e3 e3Var = q3Var.f21943v3;
        t9 t9Var = q3Var.f21945w3;
        if (!e3Var.x() || !t9Var.onTouchEvent(motionEvent)) {
            if (this.E && (lyVar = this.f21851x) != null) {
                height = (int) lyVar.getY();
            } else {
                height = getHeight() - this.F;
            }
            int L = (height - org.telegram.messenger.g0.L(60.0f)) - this.L;
            if (motionEvent.getAction() == 0 && this.f21852y && motionEvent.getY() < L) {
                W(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > org.telegram.messenger.g0.L(60.0f) && motionEvent.getY() < L)) && t9Var.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < L && q3Var.l3(motionEvent)) {
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
        v3 v3Var = this.f21849s;
        if (v3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(44.0f)) / 2) + org.telegram.messenger.g0.f23603m) - org.telegram.messenger.g0.L(8.0f);
        q3 q3Var = this.f21848r;
        if (q3Var.getChildCount() <= 0) {
            i7 = q3Var.getPaddingTop();
        } else {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < q3Var.getChildCount(); i11++) {
                View childAt = q3Var.getChildAt(i11);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            if (i10 == Integer.MAX_VALUE) {
                i7 = q3Var.getPaddingTop();
            } else {
                i7 = i10;
            }
        }
        v3Var.setTopButtonsOffset(Math.max(currentActionBarHeight, i7));
    }

    @Override
    public int getCurrentItemTop() {
        q3 q3Var = this.f21848r;
        if (q3Var.getChildCount() <= 0) {
            int paddingTop = q3Var.getPaddingTop();
            this.J = paddingTop;
            q3Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        boolean z10 = false;
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < q3Var.getChildCount(); i10++) {
            View childAt = q3Var.getChildAt(i10);
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
        q3Var.setTopGlowOffset(Math.max(0, i7));
        int i11 = i7 - org.telegram.messenger.g0.f23603m;
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
        return (this.f21848r.getPaddingTop() - org.telegram.messenger.g0.f23603m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public h9 getTextSelectionHelper() {
        return this.f21848r.getTextSelectionHelper();
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
                ly lyVar = this.f21851x;
                if (lyVar != null) {
                    lyVar.t(false);
                    this.f21851x.A();
                }
                X();
                return false;
            }
        } else if (this.f21852y) {
            W(false);
            return false;
        } else if (!this.f21848r.I2() && !V()) {
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
        ns.f(this.f21847n).c(this, ns.f25497f5);
        d0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.f21847n).n(this, ns.f25497f5);
    }

    @Override
    public final void p() {
        bg0 bg0Var = this.P;
        if (bg0Var != null) {
            bg0Var.i();
            this.P = null;
        }
        ga.d dVar = this.f21850w;
        if (dVar != null) {
            dVar.c();
        }
        q3 q3Var = this.f21848r;
        if (q3Var != null) {
            q3Var.y2();
        }
        ly lyVar = this.f21851x;
        if (lyVar != null) {
            lyVar.B();
        }
    }

    @Override
    public final boolean q() {
        q3 q3Var = this.f21848r;
        if (q3Var != null) {
            q3Var.y2();
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
        this.f33607b.f29682b.invalidate();
        invalidate();
    }

    @Override
    public final void u() {
        ga.d dVar = this.f21850w;
        if (dVar != null) {
            dVar.c();
        }
        if (this.f21852y) {
            W(false);
        }
    }

    @Override
    public final void y() {
        boolean z10;
        if (this.f33607b.f36482p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
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
        if (z10 && this.f21852y && !this.E) {
            W(false);
        }
        f0();
    }

    @Override
    public final void t() {
    }
}
