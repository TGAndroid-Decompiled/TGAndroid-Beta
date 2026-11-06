package li;

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
import bi.n8;
import c8.ha;
import fi.h7;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.hw;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.wf;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.qj;
import org.telegram.ui.qm;
public final class p extends vh implements ls {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public boolean D;
    public int E;
    public g1 F;
    public int G;
    public k60 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public bg0 O;
    public final d P;
    public final int f18756n;
    public final t3 f18757r;
    public final y3 f18758s;
    public ga.d f18759w;
    public gy f18760x;
    public boolean f18761y;

    public p(int i7, Context context, f6 f6Var, di diVar) {
        super(context, f6Var, diVar);
        l lVar = new l(this);
        this.J = true;
        this.P = new d(this, 3);
        this.f18756n = i7;
        this.h = true;
        this.f38972f = true;
        t3 t3Var = new t3(context, i7, f6Var, new wf.b(this, f6Var, false, 28));
        this.f18757r = t3Var;
        t3Var.setAdaptiveLinkDialogs(false);
        t3Var.setAllowTapAboveContent(false);
        addView(t3Var, ha.e(-1, -1, 119));
        addView(t3Var.getOverlayView(), ha.e(-1, -1, 119));
        t3Var.C4();
        f2 f2Var = t3Var.Q3;
        if (f2Var != null) {
            f2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        y3 y3Var = new y3(context, lVar);
        this.f18758s = y3Var;
        y3Var.setBackVisible(false);
        y3Var.setTopGradientVisible(false);
        d0();
        addView(y3Var, ha.e(-1, -1, 119));
        c0();
        e0();
        a0(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void O(p pVar) {
        boolean z9;
        int i7 = 0;
        if (!pVar.f18757r.n3() && !pVar.f18761y) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            di diVar = pVar.f38969b;
            if (!diVar.I1 && diVar.M2) {
                i7 = org.telegram.messenger.g0.L(62.0f);
            }
        }
        if (pVar.K != i7) {
            pVar.K = i7;
            pVar.W();
        }
    }

    public static void P(p pVar) {
        t3 t3Var = pVar.f18757r;
        if (pVar.f18761y) {
            g1 S2 = t3Var.S2();
            if (S2 != null) {
                S2.N();
                org.telegram.messenger.g0.K3(S2);
            }
            pVar.V(true);
            return;
        }
        di diVar = pVar.f38969b;
        if (pVar.f18760x == null) {
            gy gyVar = new gy(diVar.W1, true, false, false, pVar.getContext(), true, null, diVar.f32959l3, true, pVar.f38968a, false, false);
            pVar.f18760x = gyVar;
            gyVar.setVisibility(8);
            gy gyVar2 = pVar.f18760x;
            gyVar2.f34099x2 = false;
            gyVar2.setBottomInset(org.telegram.messenger.g0.f22539n);
            View view = pVar.f18760x.f34092w;
            if (view != null) {
                view.setVisibility(8);
            }
            pVar.f18760x.setDelegate(new o(pVar));
            pVar.addView(pVar.f18760x, ha.e(-1, pVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = pVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pVar.f18760x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        pVar.f18760x.setLayoutParams(layoutParams);
        pVar.f18760x.setTranslationY(0.0f);
        pVar.f18760x.setVisibility(0);
        pVar.f18761y = true;
        pVar.E = emojiPanelHeight;
        g1 S22 = t3Var.S2();
        if (S22 != null) {
            org.telegram.messenger.g0.v1(S22);
        }
        y3 y3Var = pVar.f18758s;
        if (y3Var != null) {
            y3Var.setEmojiOpened(true);
        }
        pVar.a0(false);
        pVar.requestLayout();
    }

    public static g1 Q(p pVar) {
        t3 t3Var = pVar.f18757r;
        g1 focusedEditTextOrNull = t3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            pVar.F = focusedEditTextOrNull;
            pVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        g1 g1Var = pVar.F;
        if (g1Var != null) {
            return g1Var;
        }
        return t3Var.S2();
    }

    public static int R(p pVar, g1 g1Var) {
        if (g1Var == pVar.F && pVar.f18757r.getFocusedEditTextOrNull() != g1Var) {
            return Math.min(pVar.G, g1Var.length());
        }
        return Math.max(0, g1Var.getSelectionEnd());
    }

    public static void S(p pVar, int i7, int i10) {
        di diVar = pVar.f38969b;
        if (diVar.W1 == null) {
            return;
        }
        di diVar2 = new di(pVar.getContext(), diVar.W1, false, false, true, pVar.f38968a);
        diVar2.T3 = new m(pVar, diVar2);
        diVar2.f32924a2.i0();
        diVar2.y1(1, true);
        diVar2.V0(i7);
        diVar2.f32978q4 = new e(pVar, diVar2);
        diVar2.P1 = new e(pVar, diVar2);
        diVar2.O1 = new n(pVar, diVar2);
        diVar2.e1();
        if (i10 != 0) {
            diVar2.o1(i10);
        }
        diVar2.A0(true);
        diVar2.show();
    }

    public static void Z(Context context, final String str, final c20 c20Var, f6 f6Var) {
        String str2;
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, true);
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
        int i7 = k6.G6;
        ShapeDrawable d02 = k6.d0(L, k6.r1(0.05f, k6.w0(i7, f6Var)));
        n6 L2 = r6.L(0.05f, i7);
        imageView.setBackground(d02);
        r6.k(imageView, d02, L2, null, f6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f10.addView(horizontalScrollView, ha.t(-1, -2, 49, 12, 2, 12, 0));
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        n8 n8Var = new n8(strArr, horizontalScrollView, h, zArr2, new hi.u1(strArr, 16), imageView, f6Var, new int[]{6}, 2);
        final org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, hd.M0(2131754008, null), true, false, -1, f6Var);
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        int L3 = org.telegram.messenger.g0.L(24.0f);
        int i10 = k6.f27849d6;
        ShapeDrawable d03 = k6.d0(L3, k6.w0(i10, f6Var));
        n6 N = r6.N(i10);
        k3Var.setBackground(d03);
        r6.k(k3Var, d03, N, null, f6Var);
        k3Var.setText(strArr[0]);
        i3Var.addTextChangedListener(new h7(strArr, n8Var, false, 2));
        f10.addView(k3Var, ha.t(-1, -2, 55, 12, 8, 12, 0));
        h.setText(hd.M0(2131751355, null));
        f10.addView(h, ha.t(-1, 48, 55, 12, 12, 12, 12));
        n8Var.run();
        l10.N = f10;
        l10.H0 = new DialogInterface.OnDismissListener() {
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
                        c20Var.a(strArr2[0]);
                    }
                }
            }
        };
        l10.show();
        int i11 = k6.f27793a7;
        l10.w0(i11);
        l10.P(i11);
        h.setOnClickListener(new di.d0(h, zArr, c20Var, strArr, l10, 4));
        org.telegram.messenger.g0.i3(new l2.w(k3Var, 3), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int Q2 = this.f38969b.f32959l3.Q();
        if (Q2 <= 0) {
            SharedPreferences d12 = qp.d1();
            Point point = org.telegram.messenger.g0.f22544q;
            if (point.x > point.y) {
                str = "kbd_height_land3";
            } else {
                str = "kbd_height";
            }
            Q2 = d12.getInt(str, org.telegram.messenger.g0.L(200.0f));
        }
        if (Q2 <= 0) {
            Q2 = org.telegram.messenger.g0.L(200.0f);
        }
        return Q2 + org.telegram.messenger.g0.f22539n;
    }

    @Override
    public final void B(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: li.p.B(int, int):void");
    }

    @Override
    public final void H(vh vhVar) {
        this.f38969b.R2.setTitle("");
        this.f18757r.f37160f3.O(false);
        a0(false);
        post(new d(this, 4));
    }

    @Override
    public final void J() {
        this.f18757r.y0(0);
    }

    @Override
    public final boolean L(boolean z9, int i7, int i10, long j3, boolean z10) {
        ij ijVar;
        qm qmVar;
        hw hwVar;
        long j10;
        ij ijVar2;
        qj qjVar;
        wf wfVar;
        qj qjVar2;
        int i11 = this.f18756n;
        boolean s42 = qp.s1(i11).s4();
        t3 t3Var = this.f18757r;
        if (!s42 && !p10.i(i11).q() && a5.d(t3Var.f18894s3, t3Var.f18896t3)) {
            b2.u0(getContext(), new b(t3Var, 0), new d(this, 2), this.f38968a);
            return false;
        }
        if (t3Var.n3() && !t3Var.p3()) {
            if (!t3Var.P3()) {
                y3 y3Var = this.f18758s;
                if (y3Var != null) {
                    y3Var.setSendEnabled(t3Var.P3());
                    return false;
                }
            } else {
                boolean s43 = qp.s1(i11).s4();
                di diVar = this.f38969b;
                if (!s43) {
                    org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                    if ((f2Var instanceof an) && (qjVar2 = ((an) f2Var).Z) != null) {
                        qjVar2.R0(a5.g(t3Var.f18894s3), z9, i7, i10);
                        diVar.a(true);
                        return true;
                    }
                } else {
                    ArrayList c32 = t3Var.c3();
                    if (!c32.isEmpty()) {
                        ArrayList E2 = t3Var.E2();
                        ArrayList B2 = t3Var.B2();
                        ArrayList a10 = z4.a(i11, c32);
                        org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
                        if (f2Var2 instanceof an) {
                            an anVar = (an) f2Var2;
                            ij ijVar3 = anVar.D5;
                            ij ijVar4 = anVar.f43864l4;
                            qm qmVar2 = anVar.B5;
                            long h92 = anVar.h9();
                            hwVar = anVar.W8();
                            ijVar = ijVar4;
                            qmVar = qmVar2;
                            j10 = h92;
                            ijVar2 = ijVar3;
                        } else {
                            ijVar = null;
                            qmVar = null;
                            hwVar = null;
                            j10 = 0;
                            ijVar2 = null;
                        }
                        gz.R(org.telegram.messenger.c.a(diVar.D3), c32, E2, B2, a10, diVar.b1(), ijVar2, ijVar, qmVar, z9, i7, i10, hwVar, j3, j10, 0L);
                        org.telegram.ui.ActionBar.f2 f2Var3 = diVar.W1;
                        if ((f2Var3 instanceof an) && (qjVar = ((an) f2Var3).Z) != null && (wfVar = qjVar.Z2) != null) {
                            wfVar.F(null, z9, i7, i10, 0L);
                        }
                        diVar.a(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean M() {
        return !this.f18757r.n3();
    }

    public final void T(k60 k60Var, a aVar, TL_iv.PageBlock pageBlock, int i7, String str, int i10, k60 k60Var2) {
        boolean z9;
        if (aVar != null && aVar.f18389b.getClass() == pageBlock.getClass()) {
            z9 = true;
        } else {
            z9 = false;
        }
        k60Var.j(z9, i7, null, str, new ai.d0(this, aVar, pageBlock, k60Var2, 24));
        k60Var.y().f28811a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        k60Var.y().f28811a.setTextSize(1, i10);
    }

    public final boolean U() {
        t3 t3Var = this.f18757r;
        if (t3Var == null || !t3Var.n3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f38968a);
        String M0 = hd.M0(2131753993, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M0;
        u1Var.T = hd.M0(2131753994, null);
        alertDialog$Builder.h(hd.M0(2131751599, null), new org.telegram.ui.ActionBar.r1(this) {
            public final p f18647b;

            {
                this.f18647b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f18647b.f38969b.dismiss();
                        return;
                    default:
                        p pVar = this.f18647b;
                        pVar.X();
                        pVar.f38969b.dismiss();
                        return;
                }
            }
        });
        alertDialog$Builder.k(hd.M0(2131745947, null), new org.telegram.ui.ActionBar.r1(this) {
            public final p f18647b;

            {
                this.f18647b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f18647b.f38969b.dismiss();
                        return;
                    default:
                        p pVar = this.f18647b;
                        pVar.X();
                        pVar.f38969b.dismiss();
                        return;
                }
            }
        });
        alertDialog$Builder.d(-2);
        alertDialog$Builder.p();
        return false;
    }

    public final void V(boolean z9) {
        if (this.D) {
            this.D = false;
            gy gyVar = this.f18760x;
            if (gyVar != null) {
                gyVar.t(false);
                if (!z9) {
                    this.f18760x.A();
                }
            }
        }
        this.F = null;
        gy gyVar2 = this.f18760x;
        if (gyVar2 != null) {
            gyVar2.setTranslationY(0.0f);
            this.f18760x.setVisibility(8);
        }
        this.f18761y = false;
        this.E = 0;
        y3 y3Var = this.f18758s;
        if (y3Var != null) {
            y3Var.setEmojiOpened(false);
        }
        a0(false);
        requestLayout();
    }

    public final void W() {
        int i7;
        int i10;
        float f10;
        int i11;
        float f11;
        float f12;
        if (this.D) {
            i7 = org.telegram.messenger.g0.L(245.0f);
        } else {
            i7 = this.E;
        }
        gy gyVar = this.f18760x;
        float f13 = 0.0f;
        di diVar = this.f38969b;
        if (gyVar != null) {
            if (this.f18761y) {
                float f14 = this.E - i7;
                if (this.D) {
                    f12 = -diVar.f32940f4;
                } else {
                    f12 = 0.0f;
                }
                f11 = f14 + f12;
            } else {
                f11 = 0.0f;
            }
            gyVar.setTranslationY(f11);
        }
        y3 y3Var = this.f18758s;
        if (y3Var != null) {
            boolean z9 = this.f18761y;
            if (z9) {
                f10 = i7;
            } else {
                if (!this.L && this.E <= 0) {
                    i10 = org.telegram.messenger.g0.f22539n;
                } else {
                    i10 = 0;
                }
                f10 = i10;
            }
            if (!z9 || this.D) {
                f10 += diVar.f32940f4;
            }
            y3Var.getBottomContainer().animate().cancel();
            y3Var.getBottomContainer().setTranslationY(-f10);
            boolean z10 = this.f18761y;
            if (z10) {
                f13 = i7;
            }
            if (!z10 || this.D) {
                f13 += diVar.f32940f4;
            }
            y3Var.setBottomGradientTranslationY(-f13);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = y3Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-i11).setDuration(320L).setInterpolator(xq.h).start();
            }
        }
    }

    public final boolean X() {
        org.telegram.ui.ActionBar.f2 f2Var = this.f38969b.W1;
        if (f2Var instanceof an) {
            an anVar = (an) f2Var;
            t3 t3Var = this.f18757r;
            if (!t3Var.u2()) {
                return false;
            }
            TL_iv.RichMessage m22 = t3Var.m2();
            ui.b0(org.telegram.messenger.c.a(this.f18756n).f21729a).Q1(anVar.a(), anVar.P7(anVar.D5), "", null, null, null, null, 0L, false, false, m22);
            qj qjVar = anVar.Z;
            if (qjVar != null) {
                qjVar.setRichDraftPreview(m22);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void a0(boolean z9) {
        boolean z10;
        int i7;
        int i10 = 0;
        if (!this.f18757r.n3() && !this.f18761y) {
            z10 = false;
        } else {
            z10 = true;
        }
        di diVar = this.f38969b;
        dh dhVar = diVar.f32981r3;
        if (diVar.f32982r4 != z10) {
            diVar.f32982r4 = z10;
            if (diVar.M2) {
                dhVar.animate().cancel();
                if (!z10) {
                    dhVar.setVisibility(0);
                }
                float f10 = 1.0f;
                float f11 = 0.0f;
                if (z9) {
                    ViewPropertyAnimator animate = dhVar.animate();
                    if (z10) {
                        f10 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f10);
                    if (z10) {
                        f11 = org.telegram.messenger.g0.L(48.0f);
                    }
                    alpha.translationY(f11).setDuration(180L).withEndAction(new zg(diVar, z10, 3)).start();
                } else {
                    if (z10) {
                        f10 = 0.0f;
                    }
                    dhVar.setAlpha(f10);
                    if (z10) {
                        f11 = org.telegram.messenger.g0.L(48.0f);
                    }
                    dhVar.setTranslationY(f11);
                    if (z10) {
                        i7 = 4;
                    } else {
                        i7 = 0;
                    }
                    dhVar.setVisibility(i7);
                }
            }
        }
        if (!z10 && !diVar.I1 && diVar.M2) {
            i10 = org.telegram.messenger.g0.L(62.0f);
        }
        this.K = i10;
        W();
        if (this.J == z10) {
            this.J = !z10;
            requestLayout();
        }
    }

    public final void b0() {
        throw new UnsupportedOperationException("Method not decompiled: li.p.b0():void");
    }

    public final void c0() {
        boolean z9;
        float f10;
        y3 y3Var = this.f18758s;
        if (y3Var != null) {
            t3 t3Var = this.f18757r;
            boolean u22 = t3Var.u2();
            f2 f2Var = t3Var.Q3;
            if (f2Var != null && !f2Var.f18557c.isEmpty()) {
                z9 = true;
            } else {
                z9 = false;
            }
            ImageView imageView = y3Var.f19015r;
            ImageView imageView2 = y3Var.f19013n;
            imageView2.setEnabled(u22);
            float f11 = 0.35f;
            if (u22) {
                f10 = 1.0f;
            } else {
                f10 = 0.35f;
            }
            imageView2.setAlpha(f10);
            imageView.setEnabled(z9);
            if (z9) {
                f11 = 1.0f;
            }
            imageView.setAlpha(f11);
        }
    }

    public final void d0() {
        boolean z9;
        y3 y3Var = this.f18758s;
        if (y3Var != null) {
            int i7 = this.f18756n;
            boolean z10 = false;
            if (!qp.s1(i7).s4() && !p10.i(i7).q()) {
                z9 = true;
            } else {
                z9 = false;
            }
            dg sendButton = y3Var.getSendButton();
            if (z9) {
                t3 t3Var = this.f18757r;
                if (a5.d(t3Var.f18894s3, t3Var.f18896t3)) {
                    z10 = true;
                }
            }
            sendButton.setLocked(z10);
            y3Var.setPremiumLocked(z9);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f24992f5) {
            d0();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        t3 t3Var = this.f18757r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f38969b.W1 instanceof an) && t3Var.u2() && X()) {
                org.telegram.messenger.k5.o(null, 2131746004, new hc(this.f18758s, this.f38968a), 2131623989, 36);
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
        gy gyVar;
        t3 t3Var = this.f18757r;
        g3 g3Var = t3Var.f18898u3;
        u9 u9Var = t3Var.f18900v3;
        if (!g3Var.x() || !u9Var.onTouchEvent(motionEvent)) {
            if (this.D && (gyVar = this.f18760x) != null) {
                height = (int) gyVar.getY();
            } else {
                height = getHeight() - this.E;
            }
            int L = (height - org.telegram.messenger.g0.L(60.0f)) - this.K;
            if (motionEvent.getAction() == 0 && this.f18761y && motionEvent.getY() < L) {
                V(false);
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
        throw new UnsupportedOperationException("Method not decompiled: li.p.e0():void");
    }

    public final void f0() {
        int i7;
        y3 y3Var = this.f18758s;
        if (y3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(44.0f)) / 2) + org.telegram.messenger.g0.f22538m) - org.telegram.messenger.g0.L(8.0f);
        t3 t3Var = this.f18757r;
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
        t3 t3Var = this.f18757r;
        if (t3Var.getChildCount() <= 0) {
            int paddingTop = t3Var.getPaddingTop();
            this.I = paddingTop;
            t3Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        boolean z9 = false;
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < t3Var.getChildCount(); i10++) {
            View childAt = t3Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                z9 = true;
            }
            if (R >= 0 && childAt.getTop() < i7) {
                i7 = childAt.getTop();
            }
        }
        if (i7 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        t3Var.setTopGlowOffset(Math.max(0, i7));
        int i11 = i7 - org.telegram.messenger.g0.f22538m;
        int L = org.telegram.messenger.g0.L(7.0f);
        if (i11 < org.telegram.messenger.g0.L(7.0f) || !z9) {
            i11 = L;
        }
        this.I = i11;
        return i11;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (this.f18757r.getPaddingTop() - org.telegram.messenger.g0.f22538m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public i9 getTextSelectionHelper() {
        return this.f18757r.getTextSelectionHelper();
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final boolean k() {
        boolean z9 = this.D;
        if (z9) {
            if (z9) {
                this.D = false;
                gy gyVar = this.f18760x;
                if (gyVar != null) {
                    gyVar.t(false);
                    this.f18760x.A();
                }
                W();
                return false;
            }
        } else if (this.f18761y) {
            V(false);
            return false;
        } else if (!this.f18757r.I2() && !U()) {
            return true;
        }
        return false;
    }

    @Override
    public final void m(float f10) {
        W();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.f18756n).c(this, qs.f24992f5);
        d0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f18756n).n(this, qs.f24992f5);
    }

    @Override
    public final void p() {
        bg0 bg0Var = this.O;
        if (bg0Var != null) {
            bg0Var.h();
            this.O = null;
        }
        ga.d dVar = this.f18759w;
        if (dVar != null) {
            dVar.c();
        }
        t3 t3Var = this.f18757r;
        if (t3Var != null) {
            t3Var.y2();
        }
        gy gyVar = this.f18760x;
        if (gyVar != null) {
            gyVar.B();
        }
    }

    @Override
    public final boolean q() {
        t3 t3Var = this.f18757r;
        if (t3Var != null) {
            t3Var.y2();
            return false;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.N) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final boolean s() {
        if (!U()) {
            return false;
        }
        return true;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38969b.f28616b.invalidate();
        invalidate();
    }

    @Override
    public final void u() {
        ga.d dVar = this.f18759w;
        if (dVar != null) {
            dVar.c();
        }
        if (this.f18761y) {
            V(false);
        }
    }

    @Override
    public final void y() {
        boolean z9;
        if (this.f38969b.f32959l3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.L = z9;
        W();
        f0();
    }

    @Override
    public final void z(int i7, boolean z9) {
        this.L = z9;
        W();
        if (z9 && this.f18761y && !this.D) {
            V(false);
        }
        f0();
    }

    @Override
    public final void t() {
    }
}
