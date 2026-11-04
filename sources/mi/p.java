package mi;

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
import b8.mf;
import ci.o7;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.messenger.zv;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.uf;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.xq;
import org.telegram.ui.mj;
import org.telegram.ui.mm;
import org.telegram.ui.vf0;
import org.telegram.ui.wm;
public final class p extends th implements cs {
    public static final int[] R = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public boolean E;
    public int F;
    public h1 G;
    public int H;
    public f60 I;
    public int J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public boolean O;
    public vf0 P;
    public final d Q;
    public final int f19792n;
    public final t3 f19793r;
    public final y3 f19794s;
    public fa.f f19795w;
    public ey f19796x;
    public boolean f19797y;

    public p(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, bi biVar) {
        super(context, e6Var, biVar);
        l lVar = new l(this);
        this.K = true;
        this.Q = new d(this, 3);
        this.f19792n = i3;
        this.h = true;
        this.f38419f = true;
        t3 t3Var = new t3(context, i3, e6Var, new m2.t(1, this, e6Var));
        this.f19793r = t3Var;
        t3Var.setAdaptiveLinkDialogs(false);
        t3Var.setAllowTapAboveContent(false);
        addView(t3Var, mf.e(-1, -1, 119));
        addView(t3Var.getOverlayView(), mf.e(-1, -1, 119));
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
        this.f19794s = y3Var;
        y3Var.setBackVisible(false);
        y3Var.setTopGradientVisible(false);
        d0();
        addView(y3Var, mf.e(-1, -1, 119));
        c0();
        e0();
        a0(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void O(p pVar) {
        boolean z10;
        int i3 = 0;
        if (!pVar.f19793r.n3() && !pVar.f19797y) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            bi biVar = pVar.f38416b;
            if (!biVar.J1 && biVar.N2) {
                i3 = org.telegram.messenger.g0.L(62.0f);
            }
        }
        if (pVar.L != i3) {
            pVar.L = i3;
            pVar.W();
        }
    }

    public static void P(p pVar) {
        t3 t3Var = pVar.f19793r;
        if (pVar.f19797y) {
            h1 S2 = t3Var.S2();
            if (S2 != null) {
                S2.N();
                org.telegram.messenger.g0.K3(S2);
            }
            pVar.V(true);
            return;
        }
        bi biVar = pVar.f38416b;
        if (pVar.f19796x == null) {
            ey eyVar = new ey(biVar.X1, true, false, false, pVar.getContext(), true, null, biVar.f32249m3, true, pVar.f38415a, false, false);
            pVar.f19796x = eyVar;
            eyVar.setVisibility(8);
            ey eyVar2 = pVar.f19796x;
            eyVar2.f33598y2 = false;
            eyVar2.setBottomInset(org.telegram.messenger.g0.f22603n);
            View view = pVar.f19796x.f33587w;
            if (view != null) {
                view.setVisibility(8);
            }
            pVar.f19796x.setDelegate(new o(pVar));
            pVar.addView(pVar.f19796x, mf.e(-1, pVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = pVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pVar.f19796x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        pVar.f19796x.setLayoutParams(layoutParams);
        pVar.f19796x.setTranslationY(0.0f);
        pVar.f19796x.setVisibility(0);
        pVar.f19797y = true;
        pVar.F = emojiPanelHeight;
        h1 S22 = t3Var.S2();
        if (S22 != null) {
            org.telegram.messenger.g0.v1(S22);
        }
        y3 y3Var = pVar.f19794s;
        if (y3Var != null) {
            y3Var.setEmojiOpened(true);
        }
        pVar.a0(false);
        pVar.requestLayout();
    }

    public static h1 Q(p pVar) {
        t3 t3Var = pVar.f19793r;
        h1 focusedEditTextOrNull = t3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            pVar.G = focusedEditTextOrNull;
            pVar.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        h1 h1Var = pVar.G;
        if (h1Var != null) {
            return h1Var;
        }
        return t3Var.S2();
    }

    public static int R(p pVar, h1 h1Var) {
        if (h1Var == pVar.G && pVar.f19793r.getFocusedEditTextOrNull() != h1Var) {
            return Math.min(pVar.H, h1Var.length());
        }
        return Math.max(0, h1Var.getSelectionEnd());
    }

    public static void S(p pVar, int i3, int i10) {
        bi biVar = pVar.f38416b;
        if (biVar.X1 == null) {
            return;
        }
        bi biVar2 = new bi(pVar.getContext(), biVar.X1, false, false, true, pVar.f38415a);
        biVar2.U3 = new m(pVar, biVar2);
        biVar2.f32215b2.i0();
        biVar2.y1(1, true);
        biVar2.V0(i3);
        biVar2.f32269r4 = new e(pVar, biVar2);
        biVar2.Q1 = new e(pVar, biVar2);
        biVar2.P1 = new n(pVar, biVar2);
        biVar2.e1();
        if (i10 != 0) {
            biVar2.o1(i10);
        }
        biVar2.A0(true);
        biVar2.show();
    }

    public static void Z(Context context, final String str, final u10 u10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        String str2;
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, true);
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
        int i3 = k6.G6;
        ShapeDrawable d02 = k6.d0(L, k6.r1(0.05f, k6.w0(i3, e6Var)));
        n6 L2 = r6.L(0.05f, i3);
        imageView.setBackground(d02);
        r6.k(imageView, d02, L2, null, e6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f10.addView(horizontalScrollView, mf.t(-1, -2, 49, 12, 2, 12, 0));
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        o7 o7Var = new o7(strArr, horizontalScrollView, h, zArr2, new gi.q4(strArr, 26), imageView, e6Var, new int[]{6}, 2);
        final org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, bd.M0(2131754008, null), true, false, -1, e6Var);
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        int L3 = org.telegram.messenger.g0.L(24.0f);
        int i10 = k6.f27878d6;
        ShapeDrawable d03 = k6.d0(L3, k6.w0(i10, e6Var));
        n6 N = r6.N(i10);
        k3Var.setBackground(d03);
        r6.k(k3Var, d03, N, null, e6Var);
        k3Var.setText(strArr[0]);
        i3Var.addTextChangedListener(new ai.a0(strArr, o7Var, false, 9));
        f10.addView(k3Var, mf.t(-1, -2, 55, 12, 8, 12, 0));
        h.setText(bd.M0(2131751355, null));
        f10.addView(h, mf.t(-1, 48, 55, 12, 12, 12, 12));
        o7Var.run();
        l10.O = f10;
        l10.I0 = new DialogInterface.OnDismissListener() {
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
                        u10Var.a(strArr2[0]);
                    }
                }
            }
        };
        l10.show();
        int i11 = k6.f27824a7;
        l10.w0(i11);
        l10.P(i11);
        h.setOnClickListener(new ei.f0(h, zArr, u10Var, strArr, l10, 4));
        org.telegram.messenger.g0.i3(new lg.n(k3Var, 10), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int Q = this.f38416b.f32249m3.Q();
        if (Q <= 0) {
            SharedPreferences d12 = hp.d1();
            Point point = org.telegram.messenger.g0.f22608q;
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
        return Q + org.telegram.messenger.g0.f22603n;
    }

    @Override
    public final void B(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: mi.p.B(int, int):void");
    }

    @Override
    public final void H(th thVar) {
        this.f38416b.S2.setTitle("");
        this.f19793r.f35594g3.O(false);
        a0(false);
        post(new d(this, 4));
    }

    @Override
    public final void J() {
        this.f19793r.y0(0);
    }

    @Override
    public final boolean L(boolean z10, int i3, int i10, long j10, boolean z11) {
        zi ziVar;
        mm mmVar;
        zv zvVar;
        long j11;
        zi ziVar2;
        mj mjVar;
        uf ufVar;
        mj mjVar2;
        int i11 = this.f19792n;
        boolean s42 = hp.s1(i11).s4();
        t3 t3Var = this.f19793r;
        if (!s42 && !h10.i(i11).q() && b5.d(t3Var.f19924t3, t3Var.f19926u3)) {
            c2.u0(getContext(), new b(t3Var, 0), new d(this, 2), this.f38415a);
            return false;
        }
        if (t3Var.n3() && !t3Var.p3()) {
            if (!t3Var.P3()) {
                y3 y3Var = this.f19794s;
                if (y3Var != null) {
                    y3Var.setSendEnabled(t3Var.P3());
                    return false;
                }
            } else {
                boolean s43 = hp.s1(i11).s4();
                bi biVar = this.f38416b;
                if (!s43) {
                    org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                    if ((d2Var instanceof wm) && (mjVar2 = ((wm) d2Var).f51237a0) != null) {
                        mjVar2.Q0(b5.g(t3Var.f19924t3), z10, i3, i10);
                        biVar.a(true);
                        return true;
                    }
                } else {
                    ArrayList c32 = t3Var.c3();
                    if (!c32.isEmpty()) {
                        ArrayList E2 = t3Var.E2();
                        ArrayList B2 = t3Var.B2();
                        ArrayList a10 = a5.a(i11, c32);
                        org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
                        if (d2Var2 instanceof wm) {
                            wm wmVar = (wm) d2Var2;
                            zi ziVar3 = wmVar.E5;
                            zi ziVar4 = wmVar.f51397m4;
                            mm mmVar2 = wmVar.C5;
                            long h92 = wmVar.h9();
                            zvVar = wmVar.W8();
                            ziVar = ziVar4;
                            mmVar = mmVar2;
                            j11 = h92;
                            ziVar2 = ziVar3;
                        } else {
                            ziVar = null;
                            mmVar = null;
                            zvVar = null;
                            j11 = 0;
                            ziVar2 = null;
                        }
                        yy.R(org.telegram.messenger.c.a(biVar.E3), c32, E2, B2, a10, biVar.b1(), ziVar2, ziVar, mmVar, z10, i3, i10, zvVar, j10, j11, 0L);
                        org.telegram.ui.ActionBar.d2 d2Var3 = biVar.X1;
                        if ((d2Var3 instanceof wm) && (mjVar = ((wm) d2Var3).f51237a0) != null && (ufVar = mjVar.f31087a3) != null) {
                            ufVar.G(null, z10, i3, i10, 0L);
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
    public final boolean M() {
        return !this.f19793r.n3();
    }

    public final void T(f60 f60Var, a aVar, TL_iv.PageBlock pageBlock, int i3, String str, int i10, f60 f60Var2) {
        boolean z10;
        if (aVar != null && aVar.f19431b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        f60Var.j(z10, i3, null, str, new ai.z3(this, aVar, pageBlock, f60Var2, 25));
        f60Var.y().f28812a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        f60Var.y().f28812a.setTextSize(1, i10);
    }

    public final boolean U() {
        t3 t3Var = this.f19793r;
        if (t3Var == null || !t3Var.n3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f38415a);
        String M0 = bd.M0(2131753993, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = bd.M0(2131753994, null);
        alertDialog$Builder.h(bd.M0(2131751599, null), new org.telegram.ui.ActionBar.p1(this) {
            public final p f19696b;

            {
                this.f19696b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i3) {
                switch (r2) {
                    case 0:
                        this.f19696b.f38416b.dismiss();
                        return;
                    default:
                        p pVar = this.f19696b;
                        pVar.X();
                        pVar.f38416b.dismiss();
                        return;
                }
            }
        });
        alertDialog$Builder.k(bd.M0(2131745956, null), new org.telegram.ui.ActionBar.p1(this) {
            public final p f19696b;

            {
                this.f19696b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i3) {
                switch (r2) {
                    case 0:
                        this.f19696b.f38416b.dismiss();
                        return;
                    default:
                        p pVar = this.f19696b;
                        pVar.X();
                        pVar.f38416b.dismiss();
                        return;
                }
            }
        });
        alertDialog$Builder.d(-2);
        alertDialog$Builder.p();
        return false;
    }

    public final void V(boolean z10) {
        if (this.E) {
            this.E = false;
            ey eyVar = this.f19796x;
            if (eyVar != null) {
                eyVar.t(false);
                if (!z10) {
                    this.f19796x.A();
                }
            }
        }
        this.G = null;
        ey eyVar2 = this.f19796x;
        if (eyVar2 != null) {
            eyVar2.setTranslationY(0.0f);
            this.f19796x.setVisibility(8);
        }
        this.f19797y = false;
        this.F = 0;
        y3 y3Var = this.f19794s;
        if (y3Var != null) {
            y3Var.setEmojiOpened(false);
        }
        a0(false);
        requestLayout();
    }

    public final void W() {
        int i3;
        int i10;
        float f10;
        int i11;
        float f11;
        float f12;
        if (this.E) {
            i3 = org.telegram.messenger.g0.L(245.0f);
        } else {
            i3 = this.F;
        }
        ey eyVar = this.f19796x;
        float f13 = 0.0f;
        bi biVar = this.f38416b;
        if (eyVar != null) {
            if (this.f19797y) {
                float f14 = this.F - i3;
                if (this.E) {
                    f12 = -biVar.f32231g4;
                } else {
                    f12 = 0.0f;
                }
                f11 = f14 + f12;
            } else {
                f11 = 0.0f;
            }
            eyVar.setTranslationY(f11);
        }
        y3 y3Var = this.f19794s;
        if (y3Var != null) {
            boolean z10 = this.f19797y;
            if (z10) {
                f10 = i3;
            } else {
                if (!this.M && this.F <= 0) {
                    i10 = org.telegram.messenger.g0.f22603n;
                } else {
                    i10 = 0;
                }
                f10 = i10;
            }
            if (!z10 || this.E) {
                f10 += biVar.f32231g4;
            }
            y3Var.getBottomContainer().animate().cancel();
            y3Var.getBottomContainer().setTranslationY(-f10);
            boolean z11 = this.f19797y;
            if (z11) {
                f13 = i3;
            }
            if (!z11 || this.E) {
                f13 += biVar.f32231g4;
            }
            y3Var.setBottomGradientTranslationY(-f13);
            if (this.N != this.L) {
                ViewPropertyAnimator animate = y3Var.getBottomInnerContainer().animate();
                this.N = this.L;
                animate.translationY(-i11).setDuration(320L).setInterpolator(xq.h).start();
            }
        }
    }

    public final boolean X() {
        org.telegram.ui.ActionBar.d2 d2Var = this.f38416b.X1;
        if (d2Var instanceof wm) {
            wm wmVar = (wm) d2Var;
            t3 t3Var = this.f19793r;
            if (!t3Var.u2()) {
                return false;
            }
            TL_iv.RichMessage m22 = t3Var.m2();
            li.b0(org.telegram.messenger.c.a(this.f19792n).f21919a).Q1(wmVar.a(), wmVar.P7(wmVar.E5), "", null, null, null, null, 0L, false, false, m22);
            mj mjVar = wmVar.f51237a0;
            if (mjVar != null) {
                mjVar.setRichDraftPreview(m22);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void a0(boolean z10) {
        boolean z11;
        int i3;
        int i10 = 0;
        if (!this.f19793r.n3() && !this.f19797y) {
            z11 = false;
        } else {
            z11 = true;
        }
        bi biVar = this.f38416b;
        ah ahVar = biVar.f32272s3;
        if (biVar.f32273s4 != z11) {
            biVar.f32273s4 = z11;
            if (biVar.N2) {
                ahVar.animate().cancel();
                if (!z11) {
                    ahVar.setVisibility(0);
                }
                float f10 = 1.0f;
                float f11 = 0.0f;
                if (z10) {
                    ViewPropertyAnimator animate = ahVar.animate();
                    if (z11) {
                        f10 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f10);
                    if (z11) {
                        f11 = org.telegram.messenger.g0.L(48.0f);
                    }
                    alpha.translationY(f11).setDuration(180L).withEndAction(new wg(biVar, z11, 3)).start();
                } else {
                    if (z11) {
                        f10 = 0.0f;
                    }
                    ahVar.setAlpha(f10);
                    if (z11) {
                        f11 = org.telegram.messenger.g0.L(48.0f);
                    }
                    ahVar.setTranslationY(f11);
                    if (z11) {
                        i3 = 4;
                    } else {
                        i3 = 0;
                    }
                    ahVar.setVisibility(i3);
                }
            }
        }
        if (!z11 && !biVar.J1 && biVar.N2) {
            i10 = org.telegram.messenger.g0.L(62.0f);
        }
        this.L = i10;
        W();
        if (this.K == z11) {
            this.K = !z11;
            requestLayout();
        }
    }

    public final void b0() {
        throw new UnsupportedOperationException("Method not decompiled: mi.p.b0():void");
    }

    public final void c0() {
        boolean z10;
        float f10;
        y3 y3Var = this.f19794s;
        if (y3Var != null) {
            t3 t3Var = this.f19793r;
            boolean u22 = t3Var.u2();
            g2 g2Var = t3Var.R3;
            if (g2Var != null && !g2Var.f19624c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = y3Var.f20073r;
            ImageView imageView2 = y3Var.f20070n;
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
        y3 y3Var = this.f19794s;
        if (y3Var != null) {
            int i3 = this.f19792n;
            boolean z11 = false;
            if (!hp.s1(i3).s4() && !h10.i(i3).q()) {
                z10 = true;
            } else {
                z10 = false;
            }
            bg sendButton = y3Var.getSendButton();
            if (z10) {
                t3 t3Var = this.f19793r;
                if (b5.d(t3Var.f19924t3, t3Var.f19926u3)) {
                    z11 = true;
                }
            }
            sendButton.setLocked(z11);
            y3Var.setPremiumLocked(z10);
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23230f5) {
            d0();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        t3 t3Var = this.f19793r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f38416b.X1 instanceof wm) && t3Var.u2() && X()) {
                org.telegram.messenger.k5.o(null, 2131746013, new fc(this.f19794s, this.f38415a), 2131623989, 36);
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
        ey eyVar;
        t3 t3Var = this.f19793r;
        h3 h3Var = t3Var.f19928v3;
        t9 t9Var = t3Var.f19930w3;
        if (!h3Var.x() || !t9Var.onTouchEvent(motionEvent)) {
            if (this.E && (eyVar = this.f19796x) != null) {
                height = (int) eyVar.getY();
            } else {
                height = getHeight() - this.F;
            }
            int L = (height - org.telegram.messenger.g0.L(60.0f)) - this.L;
            if (motionEvent.getAction() == 0 && this.f19797y && motionEvent.getY() < L) {
                V(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > org.telegram.messenger.g0.L(60.0f) && motionEvent.getY() < L)) && t9Var.b(motionEvent)) {
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
        throw new UnsupportedOperationException("Method not decompiled: mi.p.e0():void");
    }

    public final void f0() {
        int i3;
        y3 y3Var = this.f19794s;
        if (y3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(44.0f)) / 2) + org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.L(8.0f);
        t3 t3Var = this.f19793r;
        if (t3Var.getChildCount() <= 0) {
            i3 = t3Var.getPaddingTop();
        } else {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < t3Var.getChildCount(); i11++) {
                View childAt = t3Var.getChildAt(i11);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            if (i10 == Integer.MAX_VALUE) {
                i3 = t3Var.getPaddingTop();
            } else {
                i3 = i10;
            }
        }
        y3Var.setTopButtonsOffset(Math.max(currentActionBarHeight, i3));
    }

    @Override
    public int getCurrentItemTop() {
        t3 t3Var = this.f19793r;
        if (t3Var.getChildCount() <= 0) {
            int paddingTop = t3Var.getPaddingTop();
            this.J = paddingTop;
            t3Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        boolean z10 = false;
        int i3 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < t3Var.getChildCount(); i10++) {
            View childAt = t3Var.getChildAt(i10);
            int R2 = RecyclerView.R(childAt);
            if (R2 == 0) {
                z10 = true;
            }
            if (R2 >= 0 && childAt.getTop() < i3) {
                i3 = childAt.getTop();
            }
        }
        if (i3 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        t3Var.setTopGlowOffset(Math.max(0, i3));
        int i11 = i3 - org.telegram.messenger.g0.f22602m;
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
        return (this.f19793r.getPaddingTop() - org.telegram.messenger.g0.f22602m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public h9 getTextSelectionHelper() {
        return this.f19793r.getTextSelectionHelper();
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
                ey eyVar = this.f19796x;
                if (eyVar != null) {
                    eyVar.t(false);
                    this.f19796x.A();
                }
                W();
                return false;
            }
        } else if (this.f19797y) {
            V(false);
            return false;
        } else if (!this.f19793r.I2() && !U()) {
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
        hs.f(this.f19792n).c(this, hs.f23230f5);
        d0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.f19792n).n(this, hs.f23230f5);
    }

    @Override
    public final void p() {
        vf0 vf0Var = this.P;
        if (vf0Var != null) {
            vf0Var.h();
            this.P = null;
        }
        fa.f fVar = this.f19795w;
        if (fVar != null) {
            fVar.c();
        }
        t3 t3Var = this.f19793r;
        if (t3Var != null) {
            t3Var.y2();
        }
        ey eyVar = this.f19796x;
        if (eyVar != null) {
            eyVar.B();
        }
    }

    @Override
    public final boolean q() {
        t3 t3Var = this.f19793r;
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
        if (!U()) {
            return false;
        }
        return true;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38416b.f28586b.invalidate();
        invalidate();
    }

    @Override
    public final void u() {
        fa.f fVar = this.f19795w;
        if (fVar != null) {
            fVar.c();
        }
        if (this.f19797y) {
            V(false);
        }
    }

    @Override
    public final void y() {
        boolean z10;
        if (this.f38416b.f32249m3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.M = z10;
        W();
        f0();
    }

    @Override
    public final void z(int i3, boolean z10) {
        this.M = z10;
        W();
        if (z10 && this.f19797y && !this.E) {
            V(false);
        }
        f0();
    }

    @Override
    public final void t() {
    }
}
