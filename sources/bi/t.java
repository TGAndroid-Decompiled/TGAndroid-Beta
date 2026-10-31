package bi;

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
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.qz;
import org.telegram.messenger.sw;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.sf;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zf;
import org.telegram.ui.kh0;
import org.telegram.ui.kn;
import org.telegram.ui.mk;
import org.telegram.ui.un;
public final class t extends uh implements us {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public boolean D;
    public int E;
    public n1 F;
    public int G;
    public z60 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public kh0 O;
    public final f P;
    public final int f3349n;
    public final d4 f3350r;
    public final i4 f3351s;
    public m.p3 f3352w;
    public vy f3353x;
    public boolean f3354y;

    public t(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, bi biVar) {
        super(context, p6Var, biVar);
        p pVar = new p(this);
        this.J = true;
        this.P = new f(this, 3);
        this.f3349n = i10;
        this.h = true;
        this.f30949f = true;
        d4 d4Var = new d4(context, i10, p6Var, new n4.q(this, p6Var, false));
        this.f3350r = d4Var;
        d4Var.setAdaptiveLinkDialogs(false);
        d4Var.setAllowTapAboveContent(false);
        addView(d4Var, w7.b6.e(-1, -1, 119));
        addView(d4Var.getOverlayView(), w7.b6.e(-1, -1, 119));
        d4Var.C4();
        o2 o2Var = d4Var.Q3;
        if (o2Var != null) {
            o2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        i4 i4Var = new i4(context, pVar);
        this.f3351s = i4Var;
        i4Var.setBackVisible(false);
        i4Var.setTopGradientVisible(false);
        b0();
        addView(i4Var, w7.b6.e(-1, -1, 119));
        a0();
        c0();
        Y(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new l(this, 0));
    }

    public static void N(t tVar) {
        boolean z10;
        int i10 = 0;
        if (!tVar.f3350r.n3() && !tVar.f3354y) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            bi biVar = tVar.f30947b;
            if (!biVar.I1 && biVar.M2) {
                i10 = org.telegram.messenger.i0.L(62.0f);
            }
        }
        if (tVar.K != i10) {
            tVar.K = i10;
            tVar.V();
        }
    }

    public static void O(t tVar) {
        d4 d4Var = tVar.f3350r;
        if (tVar.f3354y) {
            n1 S2 = d4Var.S2();
            if (S2 != null) {
                S2.N();
                org.telegram.messenger.i0.J3(S2);
            }
            tVar.U(true);
            return;
        }
        bi biVar = tVar.f30947b;
        if (tVar.f3353x == null) {
            vy vyVar = new vy(biVar.W1, true, false, false, tVar.getContext(), true, null, biVar.f24695l3, true, tVar.f30946a, false, false);
            tVar.f3353x = vyVar;
            vyVar.setVisibility(8);
            vy vyVar2 = tVar.f3353x;
            vyVar2.f31933x2 = false;
            vyVar2.setBottomInset(org.telegram.messenger.i0.f16021n);
            View view = tVar.f3353x.f31926w;
            if (view != null) {
                view.setVisibility(8);
            }
            tVar.f3353x.setDelegate(new s(tVar));
            tVar.addView(tVar.f3353x, w7.b6.e(-1, tVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = tVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tVar.f3353x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        tVar.f3353x.setLayoutParams(layoutParams);
        tVar.f3353x.setTranslationY(0.0f);
        tVar.f3353x.setVisibility(0);
        tVar.f3354y = true;
        tVar.E = emojiPanelHeight;
        n1 S22 = d4Var.S2();
        if (S22 != null) {
            org.telegram.messenger.i0.v1(S22);
        }
        i4 i4Var = tVar.f3351s;
        if (i4Var != null) {
            i4Var.setEmojiOpened(true);
        }
        tVar.Y(false);
        tVar.requestLayout();
    }

    public static n1 P(t tVar) {
        d4 d4Var = tVar.f3350r;
        n1 focusedEditTextOrNull = d4Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            tVar.F = focusedEditTextOrNull;
            tVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        n1 n1Var = tVar.F;
        if (n1Var != null) {
            return n1Var;
        }
        return d4Var.S2();
    }

    public static int Q(t tVar, n1 n1Var) {
        if (n1Var == tVar.F && tVar.f3350r.getFocusedEditTextOrNull() != n1Var) {
            return Math.min(tVar.G, n1Var.length());
        }
        return Math.max(0, n1Var.getSelectionEnd());
    }

    public static void R(t tVar, int i10, int i11) {
        bi biVar = tVar.f30947b;
        if (biVar.W1 == null) {
            return;
        }
        bi biVar2 = new bi(tVar.getContext(), biVar.W1, false, false, true, tVar.f30946a);
        biVar2.T3 = new q(tVar, biVar2);
        biVar2.a2.g0();
        biVar2.x1(1, true);
        biVar2.U0(i10);
        biVar2.f24715q4 = new g(tVar, biVar2);
        biVar2.P1 = new g(tVar, biVar2);
        biVar2.O1 = new r(tVar, biVar2);
        biVar2.d1();
        if (i11 != 0) {
            biVar2.n1(i11);
        }
        biVar2.A0(true);
        biVar2.show();
    }

    public static void X(Context context, final String str, final q20 q20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        String str2;
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, true);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        int L = org.telegram.messenger.i0.L(8.0f);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.r1(0.05f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
        org.telegram.ui.ActionBar.w6 L2 = a7.L(0.05f, i10);
        imageView.setBackground(d02);
        a7.k(imageView, d02, L2, null, p6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f7.addView(horizontalScrollView, w7.b6.t(-1, -2, 49, 12, 2, 12, 0));
        vh.d i11 = z20.i(24, context, p6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        n nVar = new n(strArr, horizontalScrollView, i11, zArr2, new ag.a(strArr, 11), imageView, p6Var, new int[]{6}, 0);
        final org.telegram.ui.Cells.m3 m3Var = new org.telegram.ui.Cells.m3(context, cd.L0(2131754008, null), true, false, -1, p6Var);
        org.telegram.ui.Cells.k3 k3Var = m3Var.d;
        k3Var.setImeOptions(6);
        k3Var.setMaxLines(5);
        int L3 = org.telegram.messenger.i0.L(24.0f);
        int i12 = org.telegram.ui.ActionBar.t6.f20929d6;
        ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(L3, org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        org.telegram.ui.ActionBar.w6 N = a7.N(i12);
        m3Var.setBackground(d03);
        a7.k(m3Var, d03, N, null, p6Var);
        m3Var.setText(strArr[0]);
        k3Var.addTextChangedListener(new ag.u2(1, strArr, nVar));
        f7.addView(m3Var, w7.b6.t(-1, -2, 55, 12, 8, 12, 0));
        i11.setText(cd.L0(2131751355, null));
        f7.addView(i11, w7.b6.t(-1, 48, 55, 12, 12, 12, 12));
        nVar.run();
        k10.N = f7;
        k10.H0 = new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.k3 k3Var2 = org.telegram.ui.Cells.m3.this.d;
                k3Var2.clearFocus();
                org.telegram.messenger.i0.v1(k3Var2);
                boolean[] zArr3 = zArr;
                if (!zArr3[0] && !zArr2[0]) {
                    String[] strArr2 = strArr;
                    if (!TextUtils.equals(str, strArr2[0])) {
                        zArr3[0] = true;
                        q20Var.a(strArr2[0]);
                    }
                }
            }
        };
        k10.show();
        int i13 = org.telegram.ui.ActionBar.t6.f20872a7;
        k10.w0(i13);
        k10.Q(i13);
        i11.setOnClickListener(new c(i11, zArr, q20Var, strArr, k10, 0));
        org.telegram.messenger.i0.h3(new a3.d(m3Var, 18), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int Q2 = this.f30947b.f24695l3.Q();
        if (Q2 <= 0) {
            SharedPreferences c12 = vp.c1();
            Point point = org.telegram.messenger.i0.f16026q;
            if (point.x > point.y) {
                str = "kbd_height_land3";
            } else {
                str = "kbd_height";
            }
            Q2 = c12.getInt(str, org.telegram.messenger.i0.L(200.0f));
        }
        if (Q2 <= 0) {
            Q2 = org.telegram.messenger.i0.L(200.0f);
        }
        return Q2 + org.telegram.messenger.i0.f16021n;
    }

    @Override
    public final void B(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: bi.t.B(int, int):void");
    }

    @Override
    public final void G(uh uhVar) {
        this.f30947b.R2.setTitle("");
        this.f3350r.f30819f3.O(false);
        Y(false);
        post(new f(this, 4));
    }

    @Override
    public final void I() {
        this.f3350r.y0(0);
    }

    @Override
    public final boolean J(boolean z10, int i10, int i11, long j10, boolean z11) {
        jj jjVar;
        kn knVar;
        sw swVar;
        long j11;
        jj jjVar2;
        mk mkVar;
        sf sfVar;
        mk mkVar2;
        int i12 = this.f3349n;
        boolean p42 = vp.r1(i12).p4();
        d4 d4Var = this.f3350r;
        if (!p42 && !d20.i(i12).q() && n5.d(d4Var.f2946s3, d4Var.f2948t3)) {
            k2.t0(getContext(), new b(d4Var, 0), new f(this, 2), this.f30946a);
            return false;
        }
        if (d4Var.n3() && !d4Var.p3()) {
            if (!d4Var.P3()) {
                i4 i4Var = this.f3351s;
                if (i4Var != null) {
                    i4Var.setSendEnabled(d4Var.P3());
                    return false;
                }
            } else {
                boolean p43 = vp.r1(i12).p4();
                bi biVar = this.f30947b;
                if (!p43) {
                    org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
                    if ((k2Var instanceof un) && (mkVar2 = ((un) k2Var).Z) != null) {
                        mkVar2.P0(n5.g(d4Var.f2946s3), z10, i10, i11);
                        biVar.a(true);
                        return true;
                    }
                } else {
                    ArrayList c32 = d4Var.c3();
                    if (!c32.isEmpty()) {
                        ArrayList E2 = d4Var.E2();
                        ArrayList B2 = d4Var.B2();
                        ArrayList a2 = m5.a(i12, c32);
                        org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
                        if (k2Var2 instanceof un) {
                            un unVar = (un) k2Var2;
                            jj jjVar3 = unVar.D5;
                            jj jjVar4 = unVar.l4;
                            kn knVar2 = unVar.B5;
                            long a92 = unVar.a9();
                            swVar = unVar.P8();
                            jjVar = jjVar4;
                            knVar = knVar2;
                            j11 = a92;
                            jjVar2 = jjVar3;
                        } else {
                            jjVar = null;
                            knVar = null;
                            swVar = null;
                            j11 = 0;
                            jjVar2 = null;
                        }
                        qz.R(org.telegram.messenger.c.a(biVar.D3), c32, E2, B2, a2, biVar.a1(), jjVar2, jjVar, knVar, z10, i10, i11, swVar, j10, j11, 0L);
                        org.telegram.ui.ActionBar.k2 k2Var3 = biVar.W1;
                        if ((k2Var3 instanceof un) && (mkVar = ((un) k2Var3).Z) != null && (sfVar = mkVar.Z2) != null) {
                            sfVar.E(null, z10, i10, i11, 0L);
                        }
                        biVar.a(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean L() {
        return !this.f3350r.n3();
    }

    public final void S(z60 z60Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, z60 z60Var2) {
        boolean z10;
        if (aVar != null && aVar.f2818b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        z60Var.j(z10, i10, null, str, new ag.q0((Object) this, (Object) aVar, (Object) pageBlock, (Object) z60Var2, 4));
        z60Var.y().f20164a.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
        z60Var.y().f20164a.setTextSize(1, i11);
    }

    public final boolean T() {
        d4 d4Var = this.f3350r;
        if (d4Var == null || !d4Var.n3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f30946a);
        String L0 = cd.L0(2131753993, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = cd.L0(2131753994, null);
        alertDialog$Builder.h(cd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1(this) {
            public final t f3195b;

            {
                this.f3195b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i10) {
                switch (r2) {
                    case 0:
                        this.f3195b.f30947b.dismiss();
                        return;
                    default:
                        t tVar = this.f3195b;
                        tVar.W();
                        tVar.f30947b.dismiss();
                        return;
                }
            }
        });
        alertDialog$Builder.k(cd.L0(2131745963, null), new org.telegram.ui.ActionBar.u1(this) {
            public final t f3195b;

            {
                this.f3195b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i10) {
                switch (r2) {
                    case 0:
                        this.f3195b.f30947b.dismiss();
                        return;
                    default:
                        t tVar = this.f3195b;
                        tVar.W();
                        tVar.f30947b.dismiss();
                        return;
                }
            }
        });
        alertDialog$Builder.d(-2);
        alertDialog$Builder.p();
        return false;
    }

    public final void U(boolean z10) {
        if (this.D) {
            this.D = false;
            vy vyVar = this.f3353x;
            if (vyVar != null) {
                vyVar.t(false);
                if (!z10) {
                    this.f3353x.B();
                }
            }
        }
        this.F = null;
        vy vyVar2 = this.f3353x;
        if (vyVar2 != null) {
            vyVar2.setTranslationY(0.0f);
            this.f3353x.setVisibility(8);
        }
        this.f3354y = false;
        this.E = 0;
        i4 i4Var = this.f3351s;
        if (i4Var != null) {
            i4Var.setEmojiOpened(false);
        }
        Y(false);
        requestLayout();
    }

    public final void V() {
        int i10;
        int i11;
        float f7;
        int i12;
        float f10;
        float f11;
        if (this.D) {
            i10 = org.telegram.messenger.i0.L(245.0f);
        } else {
            i10 = this.E;
        }
        vy vyVar = this.f3353x;
        float f12 = 0.0f;
        bi biVar = this.f30947b;
        if (vyVar != null) {
            if (this.f3354y) {
                float f13 = this.E - i10;
                if (this.D) {
                    f11 = -biVar.f24675f4;
                } else {
                    f11 = 0.0f;
                }
                f10 = f13 + f11;
            } else {
                f10 = 0.0f;
            }
            vyVar.setTranslationY(f10);
        }
        i4 i4Var = this.f3351s;
        if (i4Var != null) {
            boolean z10 = this.f3354y;
            if (z10) {
                f7 = i10;
            } else {
                if (!this.L && this.E <= 0) {
                    i11 = org.telegram.messenger.i0.f16021n;
                } else {
                    i11 = 0;
                }
                f7 = i11;
            }
            if (!z10 || this.D) {
                f7 += biVar.f24675f4;
            }
            i4Var.getBottomContainer().animate().cancel();
            i4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.f3354y;
            if (z11) {
                f12 = i10;
            }
            if (!z11 || this.D) {
                f12 += biVar.f24675f4;
            }
            i4Var.setBottomGradientTranslationY(-f12);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = i4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-i12).setDuration(320L).setInterpolator(gr.h).start();
            }
        }
    }

    public final boolean W() {
        org.telegram.ui.ActionBar.k2 k2Var = this.f30947b.W1;
        if (k2Var instanceof un) {
            un unVar = (un) k2Var;
            d4 d4Var = this.f3350r;
            if (!d4Var.u2()) {
                return false;
            }
            TL_iv.RichMessage m22 = d4Var.m2();
            ui.b0(org.telegram.messenger.c.a(this.f3349n).f14863a).Q1(unVar.a(), unVar.J7(unVar.D5), "", null, null, null, null, 0L, false, false, m22);
            mk mkVar = unVar.Z;
            if (mkVar != null) {
                mkVar.setRichDraftPreview(m22);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void Y(boolean z10) {
        boolean z11;
        int i10;
        int i11 = 0;
        if (!this.f3350r.n3() && !this.f3354y) {
            z11 = false;
        } else {
            z11 = true;
        }
        bi biVar = this.f30947b;
        ah ahVar = biVar.f24718r3;
        if (biVar.f24719r4 != z11) {
            biVar.f24719r4 = z11;
            if (biVar.M2) {
                ahVar.animate().cancel();
                if (!z11) {
                    ahVar.setVisibility(0);
                }
                float f7 = 1.0f;
                float f10 = 0.0f;
                if (z10) {
                    ViewPropertyAnimator animate = ahVar.animate();
                    if (z11) {
                        f7 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f7);
                    if (z11) {
                        f10 = org.telegram.messenger.i0.L(48.0f);
                    }
                    alpha.translationY(f10).setDuration(180L).withEndAction(new wg(biVar, z11, 3)).start();
                } else {
                    if (z11) {
                        f7 = 0.0f;
                    }
                    ahVar.setAlpha(f7);
                    if (z11) {
                        f10 = org.telegram.messenger.i0.L(48.0f);
                    }
                    ahVar.setTranslationY(f10);
                    if (z11) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    ahVar.setVisibility(i10);
                }
            }
        }
        if (!z11 && !biVar.I1 && biVar.M2) {
            i11 = org.telegram.messenger.i0.L(62.0f);
        }
        this.K = i11;
        V();
        if (this.J == z11) {
            this.J = !z11;
            requestLayout();
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: bi.t.Z():void");
    }

    public final void a0() {
        boolean z10;
        float f7;
        i4 i4Var = this.f3351s;
        if (i4Var != null) {
            d4 d4Var = this.f3350r;
            boolean u22 = d4Var.u2();
            o2 o2Var = d4Var.Q3;
            if (o2Var != null && !o2Var.f3258c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = i4Var.f3093r;
            ImageView imageView2 = i4Var.f3091n;
            imageView2.setEnabled(u22);
            float f10 = 0.35f;
            if (u22) {
                f7 = 1.0f;
            } else {
                f7 = 0.35f;
            }
            imageView2.setAlpha(f7);
            imageView.setEnabled(z10);
            if (z10) {
                f10 = 1.0f;
            }
            imageView.setAlpha(f10);
        }
    }

    public final void b0() {
        boolean z10;
        i4 i4Var = this.f3351s;
        if (i4Var != null) {
            int i10 = this.f3349n;
            boolean z11 = false;
            if (!vp.r1(i10).p4() && !d20.i(i10).q()) {
                z10 = true;
            } else {
                z10 = false;
            }
            zf sendButton = i4Var.getSendButton();
            if (z10) {
                d4 d4Var = this.f3350r;
                if (n5.d(d4Var.f2946s3, d4Var.f2948t3)) {
                    z11 = true;
                }
            }
            sendButton.setLocked(z11);
            i4Var.setPremiumLocked(z10);
        }
    }

    public final void c0() {
        throw new UnsupportedOperationException("Method not decompiled: bi.t.c0():void");
    }

    public final void d0() {
        int i10;
        i4 i4Var = this.f3351s;
        if (i4Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(44.0f)) / 2) + org.telegram.messenger.i0.f16020m) - org.telegram.messenger.i0.L(8.0f);
        d4 d4Var = this.f3350r;
        if (d4Var.getChildCount() <= 0) {
            i10 = d4Var.getPaddingTop();
        } else {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < d4Var.getChildCount(); i12++) {
                View childAt = d4Var.getChildAt(i12);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                }
            }
            if (i11 == Integer.MAX_VALUE) {
                i10 = d4Var.getPaddingTop();
            } else {
                i10 = i11;
            }
        }
        i4Var.setTopButtonsOffset(Math.max(currentActionBarHeight, i10));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.f19613f5) {
            b0();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        d4 d4Var = this.f3350r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f30947b.W1 instanceof un) && d4Var.u2() && W()) {
                org.telegram.messenger.m5.n(null, 2131746020, new cc(this.f3351s, this.f30946a), 2131623989, 36);
                return true;
            }
        } else if (!d4Var.k3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        vy vyVar;
        d4 d4Var = this.f3350r;
        q3 q3Var = d4Var.f2950u3;
        v9 v9Var = d4Var.f2952v3;
        if (!q3Var.x() || !v9Var.onTouchEvent(motionEvent)) {
            if (this.D && (vyVar = this.f3353x) != null) {
                height = (int) vyVar.getY();
            } else {
                height = getHeight() - this.E;
            }
            int L = (height - org.telegram.messenger.i0.L(60.0f)) - this.K;
            if (motionEvent.getAction() == 0 && this.f3354y && motionEvent.getY() < L) {
                U(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > org.telegram.messenger.i0.L(60.0f) && motionEvent.getY() < L)) && v9Var.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < L && d4Var.l3(motionEvent)) {
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

    @Override
    public int getCurrentItemTop() {
        d4 d4Var = this.f3350r;
        if (d4Var.getChildCount() <= 0) {
            int paddingTop = d4Var.getPaddingTop();
            this.I = paddingTop;
            d4Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        boolean z10 = false;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < d4Var.getChildCount(); i11++) {
            View childAt = d4Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                z10 = true;
            }
            if (R >= 0 && childAt.getTop() < i10) {
                i10 = childAt.getTop();
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        d4Var.setTopGlowOffset(Math.max(0, i10));
        int i12 = i10 - org.telegram.messenger.i0.f16020m;
        int L = org.telegram.messenger.i0.L(7.0f);
        if (i12 < org.telegram.messenger.i0.L(7.0f) || !z10) {
            i12 = L;
        }
        this.I = i12;
        return i12;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (this.f3350r.getPaddingTop() - org.telegram.messenger.i0.f16020m) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
    }

    public k9 getTextSelectionHelper() {
        return this.f3350r.getTextSelectionHelper();
    }

    @Override
    public final int i() {
        return 0;
    }

    @Override
    public final boolean j() {
        boolean z10 = this.D;
        if (z10) {
            if (z10) {
                this.D = false;
                vy vyVar = this.f3353x;
                if (vyVar != null) {
                    vyVar.t(false);
                    this.f3353x.B();
                }
                V();
                return false;
            }
        } else if (this.f3354y) {
            U(false);
            return false;
        } else if (!this.f3350r.I2() && !T()) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(float f7) {
        V();
    }

    @Override
    public final void o() {
        kh0 kh0Var = this.O;
        if (kh0Var != null) {
            kh0Var.h();
            this.O = null;
        }
        m.p3 p3Var = this.f3352w;
        if (p3Var != null) {
            p3Var.a();
        }
        d4 d4Var = this.f3350r;
        if (d4Var != null) {
            d4Var.y2();
        }
        vy vyVar = this.f3353x;
        if (vyVar != null) {
            vyVar.C();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.f3349n).c(this, zs.f19613f5);
        b0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.f3349n).n(this, zs.f19613f5);
    }

    @Override
    public final boolean p() {
        d4 d4Var = this.f3350r;
        if (d4Var != null) {
            d4Var.y2();
            return false;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (!T()) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.N) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30947b.f21586b.invalidate();
        invalidate();
    }

    @Override
    public final void t() {
        m.p3 p3Var = this.f3352w;
        if (p3Var != null) {
            p3Var.a();
        }
        if (this.f3354y) {
            U(false);
        }
    }

    @Override
    public final void y() {
        boolean z10;
        if (this.f30947b.f24695l3.Q() > org.telegram.messenger.i0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.L = z10;
        V();
        d0();
    }

    @Override
    public final void z(int i10, boolean z10) {
        this.L = z10;
        V();
        if (z10 && this.f3354y && !this.D) {
            U(false);
        }
        d0();
    }

    @Override
    public final void s() {
    }
}
