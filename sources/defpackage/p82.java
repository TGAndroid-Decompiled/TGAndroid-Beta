package defpackage;

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
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class p82 extends a22 implements jm7 {
    public static final int[] R = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public boolean E;
    public int F;
    public ne9 G;
    public int H;
    public bu5 I;
    public int J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public boolean O;
    public j67 P;
    public final e82 Q;
    public final int n;
    public final ch9 r;
    public final hh9 s;
    public pr2 w;
    public e34 x;
    public boolean y;

    public p82(int i, i22 i22Var, ylb ylbVar, Context context) {
        super(i22Var, ylbVar, context);
        l82 l82Var = new l82(this);
        this.K = true;
        this.Q = new e82(this, (byte) 3);
        this.n = i;
        this.h = true;
        this.f = true;
        ch9 ch9Var = new ch9(context, i, ylbVar, new lx6(this, ylbVar, false, (byte) 14));
        this.r = ch9Var;
        ch9Var.setAdaptiveLinkDialogs(false);
        ch9Var.setAllowTapAboveContent(false);
        addView(ch9Var, qoe.e(-1, -1, 119));
        addView(ch9Var.getOverlayView(), qoe.e(-1, -1, 119));
        ch9Var.B4();
        of9 of9Var = ch9Var.R3;
        if (of9Var != null) {
            of9Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        hh9 hh9Var = new hh9(context, l82Var);
        this.s = hh9Var;
        hh9Var.setBackVisible(false);
        hh9Var.setTopGradientVisible(false);
        d0();
        addView(hh9Var, qoe.e(-1, -1, 119));
        c0();
        e0();
        Z(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i82(this, (byte) 0));
    }

    public static void X(Context context, final String str, final qac qacVar, ylb ylbVar) {
        String str2;
        my0 h = hg9.h(1, ylbVar, context, true);
        LinearLayout i = hg9.i(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        int L = gm.L(8.0f);
        int i2 = cmb.F6;
        ShapeDrawable b0 = cmb.b0(L, cmb.p1(0.05f, cmb.v0(i2, ylbVar)));
        wmb K = anb.K(0.05f, i2);
        imageView.setBackground(b0);
        anb.j(imageView, b0, K, null, ylbVar);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        i.addView(horizontalScrollView, qoe.t(-1, -2, 49, 12, 2, 12, 0));
        b61 i3 = mlb.i(24, ylbVar, context, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        lo0 lo0Var = new lo0(strArr, horizontalScrollView, i3, zArr2, new f(strArr, (byte) 29), imageView, ylbVar, new int[]{6}, (byte) 2);
        final su3 su3Var = new su3(context, jb6.M0(2131753973, null), true, false, -1, ylbVar);
        ru3 ru3Var = su3Var.d;
        ru3Var.setImeOptions(6);
        ru3Var.setMaxLines(5);
        int L2 = gm.L(24.0f);
        int i4 = cmb.c6;
        ShapeDrawable b02 = cmb.b0(L2, cmb.v0(i4, ylbVar));
        wmb M = anb.M(i4);
        su3Var.setBackground(b02);
        anb.j(su3Var, b02, M, null, ylbVar);
        su3Var.setText(strArr[0]);
        ru3Var.addTextChangedListener(new qz(strArr, lo0Var, false, (byte) 3));
        i.addView(su3Var, qoe.t(-1, -2, 55, 12, 8, 12, 0));
        i3.setText(jb6.M0(2131751291, null));
        i.addView(i3, qoe.t(-1, 48, 55, 12, 12, 12, 12));
        lo0Var.run();
        h.O = i;
        h.I0 = new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                ru3 ru3Var2 = su3.this.d;
                ru3Var2.clearFocus();
                gm.t1(ru3Var2);
                boolean[] zArr3 = zArr;
                if (!zArr3[0] && !zArr2[0]) {
                    String[] strArr2 = strArr;
                    if (!TextUtils.equals(str, strArr2[0])) {
                        zArr3[0] = true;
                        qacVar.a(strArr2[0]);
                    }
                }
            }
        };
        h.show();
        int i5 = cmb.Z6;
        h.t0(i5);
        h.L(i5);
        i3.setOnClickListener(new oh(i3, zArr, qacVar, strArr, h, (byte) 6));
        gm.d3(new c82(su3Var, (byte) 0), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int Q = this.b.o3.Q();
        if (Q <= 0) {
            SharedPreferences c1 = oc7.c1();
            Point point = gm.q;
            if (point.x > point.y) {
                str = "kbd_height_land3";
            } else {
                str = "kbd_height";
            }
            Q = c1.getInt(str, gm.L(200.0f));
        }
        if (Q <= 0) {
            Q = gm.L(200.0f);
        }
        return Q + gm.n;
    }

    @Override
    public final void B(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p82.B(int, int):void");
    }

    @Override
    public final void H(a22 a22Var) {
        this.b.U2.setTitle("");
        this.r.g3.O(false);
        Z(false);
        post(new e82(this, (byte) 4));
    }

    @Override
    public final void J() {
        this.r.z0(0);
    }

    @Override
    public final boolean K(boolean z, int i, int i2, long j, boolean z2) {
        k47 k47Var;
        nv1 nv1Var;
        l3a l3aVar;
        long j2;
        k47 k47Var2;
        ms1 ms1Var;
        uz1 uz1Var;
        ms1 ms1Var2;
        int i3 = this.n;
        boolean x4 = oc7.r1(i3).x4();
        ch9 ch9Var = this.r;
        if (!x4 && !z8c.h(i3).p() && hi9.d(ch9Var.t3, ch9Var.u3)) {
            jf9.r0(this.a, getContext(), new b82(ch9Var, (byte) 0), new e82(this, (byte) 2));
            return false;
        }
        if (ch9Var.g3() && !ch9Var.i3()) {
            if (!ch9Var.I3()) {
                hh9 hh9Var = this.s;
                if (hh9Var != null) {
                    hh9Var.setSendEnabled(ch9Var.I3());
                    return false;
                }
            } else {
                boolean x42 = oc7.r1(i3).x4();
                i22 i22Var = this.b;
                if (!x42) {
                    d dVar = i22Var.Z1;
                    if ((dVar instanceof yv1) && (ms1Var2 = ((yv1) dVar).a0) != null) {
                        ms1Var2.v1(hi9.g(ch9Var.t3), z, i, i2);
                        i22Var.a(true);
                        return true;
                    }
                } else {
                    ArrayList V2 = ch9Var.V2();
                    if (!V2.isEmpty()) {
                        ArrayList x2 = ch9Var.x2();
                        ArrayList u2 = ch9Var.u2();
                        ArrayList a = gi9.a(i3, V2);
                        d dVar2 = i22Var.Z1;
                        if (dVar2 instanceof yv1) {
                            yv1 yv1Var = (yv1) dVar2;
                            k47 k47Var3 = yv1Var.F5;
                            k47 k47Var4 = yv1Var.m4;
                            nv1 nv1Var2 = yv1Var.D5;
                            long k7 = yv1Var.k7();
                            l3aVar = yv1Var.X6();
                            k47Var = k47Var4;
                            nv1Var = nv1Var2;
                            j2 = k7;
                            k47Var2 = k47Var3;
                        } else {
                            k47Var = null;
                            nv1Var = null;
                            l3aVar = null;
                            j2 = 0;
                            k47Var2 = null;
                        }
                        a6a.Q(j5.a(i22Var.G3), V2, x2, u2, a, i22Var.V0(), k47Var2, k47Var, nv1Var, z, i, i2, l3aVar, j, j2, 0L);
                        d dVar3 = i22Var.Z1;
                        if ((dVar3 instanceof yv1) && (ms1Var = ((yv1) dVar3).a0) != null && (uz1Var = ms1Var.P3) != null) {
                            uz1Var.w(null, z, i, i2, 0L);
                        }
                        i22Var.a(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean M() {
        return !this.r.g3();
    }

    public final void O(bu5 bu5Var, ll0 ll0Var, TL_iv.PageBlock pageBlock, int i, String str, int i2, bu5 bu5Var2) {
        boolean z;
        if (ll0Var != null && ll0Var.b.getClass() == pageBlock.getClass()) {
            z = true;
        } else {
            z = false;
        }
        bu5Var.i(z, i, null, str, new xo1(this, ll0Var, pageBlock, bu5Var2, (byte) 7));
        bu5Var.z().a.setTypeface(gm.n1("fonts/mw_bold.ttf"));
        bu5Var.z().a.setTextSize(1, i2);
    }

    public final boolean P() {
        ch9 ch9Var = this.r;
        if (ch9Var == null || !ch9Var.g3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
        String M0 = jb6.M0(2131753958, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131753959, null);
        alertDialog$Builder.g(jb6.M0(2131751535, null), new ee(this) {
            public final p82 b;

            {
                this.b = this;
            }

            @Override
            public final void r(he heVar2, int i) {
                byte b = r2;
                p82 p82Var = this.b;
                switch (b) {
                    case 0:
                        p82Var.b.dismiss();
                        return;
                    default:
                        p82Var.T();
                        p82Var.b.dismiss();
                        return;
                }
            }
        });
        alertDialog$Builder.j(jb6.M0(2131745680, null), new ee(this) {
            public final p82 b;

            {
                this.b = this;
            }

            @Override
            public final void r(he heVar2, int i) {
                byte b = r2;
                p82 p82Var = this.b;
                switch (b) {
                    case 0:
                        p82Var.b.dismiss();
                        return;
                    default:
                        p82Var.T();
                        p82Var.b.dismiss();
                        return;
                }
            }
        });
        alertDialog$Builder.c(-2);
        alertDialog$Builder.o();
        return false;
    }

    public final void Q(boolean z) {
        if (this.E) {
            this.E = false;
            e34 e34Var = this.x;
            if (e34Var != null) {
                e34Var.r(false);
                if (!z) {
                    this.x.y();
                }
            }
        }
        this.G = null;
        e34 e34Var2 = this.x;
        if (e34Var2 != null) {
            e34Var2.setTranslationY(0.0f);
            this.x.setVisibility(8);
        }
        this.y = false;
        this.F = 0;
        hh9 hh9Var = this.s;
        if (hh9Var != null) {
            hh9Var.setEmojiOpened(false);
        }
        Z(false);
        requestLayout();
    }

    public final void R() {
        int i;
        int i2;
        float f;
        int i3;
        float f2;
        float f3;
        if (this.E) {
            i = gm.L(245.0f);
        } else {
            i = this.F;
        }
        e34 e34Var = this.x;
        float f4 = 0.0f;
        i22 i22Var = this.b;
        if (e34Var != null) {
            if (this.y) {
                float f5 = this.F - i;
                if (this.E) {
                    f3 = -i22Var.i4;
                } else {
                    f3 = 0.0f;
                }
                f2 = f5 + f3;
            } else {
                f2 = 0.0f;
            }
            e34Var.setTranslationY(f2);
        }
        hh9 hh9Var = this.s;
        if (hh9Var != null) {
            boolean z = this.y;
            if (z) {
                f = i;
            } else {
                if (!this.M && this.F <= 0) {
                    i2 = gm.n;
                } else {
                    i2 = 0;
                }
                f = i2;
            }
            if (!z || this.E) {
                f += i22Var.i4;
            }
            hh9Var.getBottomContainer().animate().cancel();
            hh9Var.getBottomContainer().setTranslationY(-f);
            boolean z2 = this.y;
            if (z2) {
                f4 = i;
            }
            if (!z2 || this.E) {
                f4 += i22Var.i4;
            }
            hh9Var.setBottomGradientTranslationY(-f4);
            if (this.N != this.L) {
                ViewPropertyAnimator animate = hh9Var.getBottomInnerContainer().animate();
                this.N = this.L;
                animate.translationY(-i3).setDuration(320L).setInterpolator(d53.h).start();
            }
        }
    }

    public final void S(int i, int i2) {
        i22 i22Var = this.b;
        if (i22Var.Z1 == null) {
            return;
        }
        i22 i22Var2 = new i22(getContext(), i22Var.Z1, false, false, true, this.a);
        i22Var2.W3 = new m82(this, i22Var2);
        i22Var2.d2.h0();
        i22Var2.t1(1, true);
        i22Var2.P0(i);
        i22Var2.t4 = new f82(this, i22Var2);
        i22Var2.S1 = new f82(this, i22Var2);
        i22Var2.R1 = new n82(this, i22Var2);
        i22Var2.Z0();
        if (i2 != 0) {
            i22Var2.j1(i2);
        }
        i22Var2.v0(true);
        i22Var2.show();
    }

    public final boolean T() {
        d dVar = this.b.Z1;
        if (dVar instanceof yv1) {
            yv1 yv1Var = (yv1) dVar;
            ch9 ch9Var = this.r;
            if (!ch9Var.m2()) {
                return false;
            }
            TL_iv.RichMessage e2 = ch9Var.e2();
            hs6.d0(j5.a(this.n).a).T1(yv1Var.a(), yv1Var.O5(yv1Var.F5), "", null, null, null, null, 0L, false, false, e2);
            ms1 ms1Var = yv1Var.a0;
            if (ms1Var != null) {
                ms1Var.setRichDraftPreview(e2);
                return true;
            }
            return true;
        }
        return false;
    }

    public final ne9 U() {
        ch9 ch9Var = this.r;
        ne9 focusedEditTextOrNull = ch9Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            this.G = focusedEditTextOrNull;
            this.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        ne9 ne9Var = this.G;
        if (ne9Var != null) {
            return ne9Var;
        }
        return ch9Var.L2();
    }

    public final int W(ne9 ne9Var) {
        if (ne9Var == this.G && this.r.getFocusedEditTextOrNull() != ne9Var) {
            return Math.min(this.H, ne9Var.length());
        }
        return Math.max(0, ne9Var.getSelectionEnd());
    }

    public final void Y() {
        boolean z = this.y;
        ch9 ch9Var = this.r;
        if (z) {
            ne9 L2 = ch9Var.L2();
            if (L2 != null) {
                L2.O();
                gm.E3(L2);
            }
            Q(true);
            return;
        }
        if (this.x == null) {
            i22 i22Var = this.b;
            e34 e34Var = new e34(i22Var.Z1, true, false, false, getContext(), true, null, i22Var.o3, true, this.a, false, false);
            this.x = e34Var;
            e34Var.setVisibility(8);
            e34 e34Var2 = this.x;
            e34Var2.x2 = false;
            e34Var2.setBottomInset(gm.n);
            View view = this.x.w;
            if (view != null) {
                view.setVisibility(8);
            }
            this.x.setDelegate(new o82(this));
            addView(this.x, qoe.e(-1, getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        this.x.setLayoutParams(layoutParams);
        this.x.setTranslationY(0.0f);
        this.x.setVisibility(0);
        this.y = true;
        this.F = emojiPanelHeight;
        ne9 L22 = ch9Var.L2();
        if (L22 != null) {
            gm.t1(L22);
        }
        hh9 hh9Var = this.s;
        if (hh9Var != null) {
            hh9Var.setEmojiOpened(true);
        }
        Z(false);
        requestLayout();
    }

    public final void Z(boolean z) {
        boolean z2;
        int i;
        int i2 = 0;
        if (!this.r.g3() && !this.y) {
            z2 = false;
        } else {
            z2 = true;
        }
        i22 i22Var = this.b;
        h12 h12Var = i22Var.u3;
        if (i22Var.u4 != z2) {
            i22Var.u4 = z2;
            if (i22Var.P2) {
                h12Var.animate().cancel();
                if (!z2) {
                    h12Var.setVisibility(0);
                }
                float f = 1.0f;
                float f2 = 0.0f;
                if (z) {
                    ViewPropertyAnimator animate = h12Var.animate();
                    if (z2) {
                        f = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f);
                    if (z2) {
                        f2 = gm.L(48.0f);
                    }
                    alpha.translationY(f2).setDuration(180L).withEndAction(new c12(i22Var, z2, (byte) 3)).start();
                } else {
                    if (z2) {
                        f = 0.0f;
                    }
                    h12Var.setAlpha(f);
                    if (z2) {
                        f2 = gm.L(48.0f);
                    }
                    h12Var.setTranslationY(f2);
                    if (z2) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    h12Var.setVisibility(i);
                }
            }
        }
        if (!z2 && !i22Var.L1 && i22Var.P2) {
            i2 = gm.L(62.0f);
        }
        this.L = i2;
        R();
        if (this.K == z2) {
            this.K = !z2;
            requestLayout();
        }
    }

    public final void a0() {
        boolean z;
        int i = 0;
        if (!this.r.g3() && !this.y) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            i22 i22Var = this.b;
            if (!i22Var.L1 && i22Var.P2) {
                i = gm.L(62.0f);
            }
        }
        if (this.L != i) {
            this.L = i;
            R();
        }
    }

    public final void b0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p82.b0():void");
    }

    public final void c0() {
        boolean z;
        float f;
        hh9 hh9Var = this.s;
        if (hh9Var != null) {
            ch9 ch9Var = this.r;
            boolean m2 = ch9Var.m2();
            of9 of9Var = ch9Var.R3;
            if (of9Var != null && !of9Var.c.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            ImageView imageView = hh9Var.r;
            ImageView imageView2 = hh9Var.n;
            imageView2.setEnabled(m2);
            float f2 = 0.35f;
            if (m2) {
                f = 1.0f;
            } else {
                f = 0.35f;
            }
            imageView2.setAlpha(f);
            imageView.setEnabled(z);
            if (z) {
                f2 = 1.0f;
            }
            imageView.setAlpha(f2);
        }
    }

    public final void d0() {
        boolean z;
        hh9 hh9Var = this.s;
        if (hh9Var != null) {
            int i = this.n;
            boolean z2 = false;
            if (!oc7.r1(i).x4() && !z8c.h(i).p()) {
                z = true;
            } else {
                z = false;
            }
            xz1 sendButton = hh9Var.getSendButton();
            if (z) {
                ch9 ch9Var = this.r;
                if (hi9.d(ch9Var.t3, ch9Var.u3)) {
                    z2 = true;
                }
            }
            sendButton.setLocked(z2);
            hh9Var.setPremiumLocked(z);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.j5) {
            d0();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        ch9 ch9Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.Z1 instanceof yv1) && ch9Var.m2() && T()) {
                ts2.u(null, 2131745736, new c41(this.s, this.a), 2131623990, 36);
                return true;
            }
        } else if (!ch9Var.d3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        e34 e34Var;
        ch9 ch9Var = this.r;
        qg9 qg9Var = ch9Var.v3;
        rkb rkbVar = ch9Var.w3;
        if (!qg9Var.w() || !rkbVar.onTouchEvent(motionEvent)) {
            if (this.E && (e34Var = this.x) != null) {
                height = (int) e34Var.getY();
            } else {
                height = getHeight() - this.F;
            }
            int L = (height - gm.L(60.0f)) - this.L;
            if (motionEvent.getAction() == 0 && this.y && motionEvent.getY() < L) {
                Q(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > gm.L(60.0f) && motionEvent.getY() < L)) && rkbVar.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < L && ch9Var.e3(motionEvent)) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p82.e0():void");
    }

    public final void f0() {
        int i;
        hh9 hh9Var = this.s;
        if (hh9Var == null) {
            return;
        }
        int currentActionBarHeight = (((a.getCurrentActionBarHeight() - gm.L(44.0f)) / 2) + gm.m) - gm.L(8.0f);
        ch9 ch9Var = this.r;
        if (ch9Var.getChildCount() <= 0) {
            i = ch9Var.getPaddingTop();
        } else {
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < ch9Var.getChildCount(); i3++) {
                View childAt = ch9Var.getChildAt(i3);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i2) {
                    i2 = childAt.getTop();
                }
            }
            if (i2 == Integer.MAX_VALUE) {
                i = ch9Var.getPaddingTop();
            } else {
                i = i2;
            }
        }
        hh9Var.setTopButtonsOffset(Math.max(currentActionBarHeight, i));
    }

    @Override
    public int getCurrentItemTop() {
        ch9 ch9Var = this.r;
        if (ch9Var.getChildCount() <= 0) {
            int paddingTop = ch9Var.getPaddingTop();
            this.J = paddingTop;
            ch9Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        boolean z = false;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < ch9Var.getChildCount(); i2++) {
            View childAt = ch9Var.getChildAt(i2);
            int R2 = RecyclerView.R(childAt);
            if (R2 == 0) {
                z = true;
            }
            if (R2 >= 0 && childAt.getTop() < i) {
                i = childAt.getTop();
            }
        }
        if (i == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        ch9Var.setTopGlowOffset(Math.max(0, i));
        int i3 = i - gm.m;
        int L = gm.L(7.0f);
        if (i3 < gm.L(7.0f) || !z) {
            i3 = L;
        }
        this.J = i3;
        return i3;
    }

    @Override
    public int getFirstOffset() {
        return gm.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (this.r.getPaddingTop() - gm.m) - a.getCurrentActionBarHeight();
    }

    public gkb getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final boolean k() {
        boolean z = this.E;
        if (z) {
            if (z) {
                this.E = false;
                e34 e34Var = this.x;
                if (e34Var != null) {
                    e34Var.r(false);
                    this.x.y();
                }
                R();
                return false;
            }
        } else if (this.y) {
            Q(false);
            return false;
        } else if (!this.r.B2() && !P()) {
            return true;
        }
        return false;
    }

    @Override
    public final void m(float f) {
        R();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.n).b(this, nm7.j5);
        d0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.n).n(this, nm7.j5);
    }

    @Override
    public final void p() {
        j67 j67Var = this.P;
        if (j67Var != null) {
            j67Var.g();
            this.P = null;
        }
        pr2 pr2Var = this.w;
        if (pr2Var != null) {
            pr2Var.m();
        }
        ch9 ch9Var = this.r;
        if (ch9Var != null) {
            ch9Var.r2();
        }
        e34 e34Var = this.x;
        if (e34Var != null) {
            e34Var.z();
        }
    }

    @Override
    public final boolean q() {
        ch9 ch9Var = this.r;
        if (ch9Var != null) {
            ch9Var.r2();
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
        if (!P()) {
            return false;
        }
        return true;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        invalidate();
    }

    @Override
    public final void u() {
        pr2 pr2Var = this.w;
        if (pr2Var != null) {
            pr2Var.m();
        }
        if (this.y) {
            Q(false);
        }
    }

    @Override
    public final void y() {
        boolean z;
        if (this.b.o3.Q() > gm.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        this.M = z;
        R();
        f0();
    }

    @Override
    public final void z(int i, boolean z) {
        this.M = z;
        R();
        if (z && this.y && !this.E) {
            Q(false);
        }
        f0();
    }

    @Override
    public final void t() {
    }
}
