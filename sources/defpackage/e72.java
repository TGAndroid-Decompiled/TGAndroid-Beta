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
public final class e72 extends p02 implements gk7 {
    public static final int[] R = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public boolean E;
    public int F;
    public mc9 G;
    public int H;
    public cs5 I;
    public int J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public boolean O;
    public j47 P;
    public final t62 Q;
    public final int n;
    public final ye9 r;
    public final df9 s;
    public eq2 w;
    public t14 x;
    public boolean y;

    public e72(int i, x02 x02Var, wjb wjbVar, Context context) {
        super(x02Var, wjbVar, context);
        a72 a72Var = new a72(this);
        this.K = true;
        this.Q = new t62(this, (byte) 3);
        this.n = i;
        this.h = true;
        this.f = true;
        ye9 ye9Var = new ye9(context, i, wjbVar, new tg2(this, wjbVar, false, (byte) 15));
        this.r = ye9Var;
        ye9Var.setAdaptiveLinkDialogs(false);
        ye9Var.setAllowTapAboveContent(false);
        addView(ye9Var, nme.e(-1, -1, 119));
        addView(ye9Var.getOverlayView(), nme.e(-1, -1, 119));
        ye9Var.B4();
        ld9 ld9Var = ye9Var.R3;
        if (ld9Var != null) {
            ld9Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        df9 df9Var = new df9(context, a72Var);
        this.s = df9Var;
        df9Var.setBackVisible(false);
        df9Var.setTopGradientVisible(false);
        d0();
        addView(df9Var, nme.e(-1, -1, 119));
        c0();
        e0();
        Z(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new x62(this, (byte) 0));
    }

    public static void X(Context context, final String str, final p8c p8cVar, wjb wjbVar) {
        String str2;
        fx0 h = de9.h(1, wjbVar, context, true);
        LinearLayout j = de9.j(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        int L = gl.L(8.0f);
        int i = bkb.F6;
        ShapeDrawable b0 = bkb.b0(L, bkb.p1(0.05f, bkb.v0(i, wjbVar)));
        vkb K = zkb.K(0.05f, i);
        imageView.setBackground(b0);
        zkb.j(imageView, b0, K, null, wjbVar);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        j.addView(horizontalScrollView, nme.t(-1, -2, 49, 12, 2, 12, 0));
        u41 i2 = yjb.i(24, wjbVar, context, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        ln0 ln0Var = new ln0(strArr, horizontalScrollView, i2, zArr2, new f(strArr, (byte) 29), imageView, wjbVar, new int[]{6}, (byte) 2);
        final it3 it3Var = new it3(context, k96.M0(2131754005, null), true, false, -1, wjbVar);
        ht3 ht3Var = it3Var.d;
        ht3Var.setImeOptions(6);
        ht3Var.setMaxLines(5);
        int L2 = gl.L(24.0f);
        int i3 = bkb.c6;
        ShapeDrawable b02 = bkb.b0(L2, bkb.v0(i3, wjbVar));
        vkb M = zkb.M(i3);
        it3Var.setBackground(b02);
        zkb.j(it3Var, b02, M, null, wjbVar);
        it3Var.setText(strArr[0]);
        ht3Var.addTextChangedListener(new qy(strArr, ln0Var, false, (byte) 3));
        j.addView(it3Var, nme.t(-1, -2, 55, 12, 8, 12, 0));
        i2.setText(k96.M0(2131751342, null));
        j.addView(i2, nme.t(-1, 48, 55, 12, 12, 12, 12));
        ln0Var.run();
        h.O = j;
        h.I0 = new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                ht3 ht3Var2 = it3.this.d;
                ht3Var2.clearFocus();
                gl.t1(ht3Var2);
                boolean[] zArr3 = zArr;
                if (!zArr3[0] && !zArr2[0]) {
                    String[] strArr2 = strArr;
                    if (!TextUtils.equals(str, strArr2[0])) {
                        zArr3[0] = true;
                        p8cVar.a(strArr2[0]);
                    }
                }
            }
        };
        h.show();
        int i4 = bkb.Z6;
        h.t0(i4);
        h.M(i4);
        i2.setOnClickListener(new ng(i2, zArr, p8cVar, strArr, h, (byte) 6));
        gl.e3(new r62(it3Var, (byte) 0), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int Q = this.b.o3.Q();
        if (Q <= 0) {
            SharedPreferences b1 = na7.b1();
            Point point = gl.q;
            if (point.x > point.y) {
                str = "kbd_height_land3";
            } else {
                str = "kbd_height";
            }
            Q = b1.getInt(str, gl.L(200.0f));
        }
        if (Q <= 0) {
            Q = gl.L(200.0f);
        }
        return Q + gl.n;
    }

    @Override
    public final void A(int i, boolean z) {
        this.M = z;
        S();
        if (z && this.y && !this.E) {
            R(false);
        }
        f0();
    }

    @Override
    public final void C(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e72.C(int, int):void");
    }

    @Override
    public final void I(p02 p02Var) {
        this.b.U2.setTitle("");
        this.r.g3.O(false);
        Z(false);
        post(new t62(this, (byte) 4));
    }

    @Override
    public final void K() {
        this.r.z0(0);
    }

    @Override
    public final boolean M(boolean z, int i, int i2, long j, boolean z2) {
        k27 k27Var;
        bu1 bu1Var;
        j1a j1aVar;
        long j2;
        k27 k27Var2;
        ar1 ar1Var;
        hy1 hy1Var;
        ar1 ar1Var2;
        int i3 = this.n;
        boolean u4 = na7.q1(i3).u4();
        ye9 ye9Var = this.r;
        if (!u4 && !y6c.h(i3).p() && dg9.d(ye9Var.t3, ye9Var.u3)) {
            hd9.q0(this.a, getContext(), new q62(ye9Var, (byte) 0), new t62(this, (byte) 2));
            return false;
        }
        if (ye9Var.g3() && !ye9Var.i3()) {
            if (!ye9Var.I3()) {
                df9 df9Var = this.s;
                if (df9Var != null) {
                    df9Var.setSendEnabled(ye9Var.I3());
                    return false;
                }
            } else {
                boolean u42 = na7.q1(i3).u4();
                x02 x02Var = this.b;
                if (!u42) {
                    d dVar = x02Var.Z1;
                    if ((dVar instanceof mu1) && (ar1Var2 = ((mu1) dVar).a0) != null) {
                        ar1Var2.t1(dg9.g(ye9Var.t3), z, i, i2);
                        x02Var.a(true);
                        return true;
                    }
                } else {
                    ArrayList V2 = ye9Var.V2();
                    if (!V2.isEmpty()) {
                        ArrayList x2 = ye9Var.x2();
                        ArrayList u2 = ye9Var.u2();
                        ArrayList a = cg9.a(i3, V2);
                        d dVar2 = x02Var.Z1;
                        if (dVar2 instanceof mu1) {
                            mu1 mu1Var = (mu1) dVar2;
                            k27 k27Var3 = mu1Var.F5;
                            k27 k27Var4 = mu1Var.m4;
                            bu1 bu1Var2 = mu1Var.D5;
                            long a7 = mu1Var.a7();
                            j1aVar = mu1Var.O6();
                            k27Var = k27Var4;
                            bu1Var = bu1Var2;
                            j2 = a7;
                            k27Var2 = k27Var3;
                        } else {
                            k27Var = null;
                            bu1Var = null;
                            j1aVar = null;
                            j2 = 0;
                            k27Var2 = null;
                        }
                        z3a.Q(j5.a(x02Var.G3), V2, x2, u2, a, x02Var.V0(), k27Var2, k27Var, bu1Var, z, i, i2, j1aVar, j, j2, 0L);
                        d dVar3 = x02Var.Z1;
                        if ((dVar3 instanceof mu1) && (ar1Var = ((mu1) dVar3).a0) != null && (hy1Var = ar1Var.P3) != null) {
                            hy1Var.u(null, z, i, i2, 0L);
                        }
                        x02Var.a(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean N() {
        return !this.r.g3();
    }

    public final void P(cs5 cs5Var, lk0 lk0Var, TL_iv.PageBlock pageBlock, int i, String str, int i2, cs5 cs5Var2) {
        boolean z;
        if (lk0Var != null && lk0Var.b.getClass() == pageBlock.getClass()) {
            z = true;
        } else {
            z = false;
        }
        cs5Var.i(z, i, null, str, new hn1(this, lk0Var, pageBlock, cs5Var2, (byte) 7));
        cs5Var.z().a.setTypeface(gl.n1("fonts/mw_bold.ttf"));
        cs5Var.z().a.setTextSize(1, i2);
    }

    public final boolean Q() {
        ye9 ye9Var = this.r;
        if (ye9Var == null || !ye9Var.g3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
        String M0 = k96.M0(2131753990, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131753991, null);
        alertDialog$Builder.g(k96.M0(2131751586, null), new ed(this) {
            public final e72 b;

            {
                this.b = this;
            }

            @Override
            public final void u(hd hdVar2, int i) {
                byte b = r2;
                e72 e72Var = this.b;
                switch (b) {
                    case 0:
                        e72Var.b.dismiss();
                        return;
                    default:
                        e72Var.U();
                        e72Var.b.dismiss();
                        return;
                }
            }
        });
        alertDialog$Builder.j(k96.M0(2131745754, null), new ed(this) {
            public final e72 b;

            {
                this.b = this;
            }

            @Override
            public final void u(hd hdVar2, int i) {
                byte b = r2;
                e72 e72Var = this.b;
                switch (b) {
                    case 0:
                        e72Var.b.dismiss();
                        return;
                    default:
                        e72Var.U();
                        e72Var.b.dismiss();
                        return;
                }
            }
        });
        alertDialog$Builder.c(-2);
        alertDialog$Builder.o();
        return false;
    }

    public final void R(boolean z) {
        if (this.E) {
            this.E = false;
            t14 t14Var = this.x;
            if (t14Var != null) {
                t14Var.s(false);
                if (!z) {
                    this.x.z();
                }
            }
        }
        this.G = null;
        t14 t14Var2 = this.x;
        if (t14Var2 != null) {
            t14Var2.setTranslationY(0.0f);
            this.x.setVisibility(8);
        }
        this.y = false;
        this.F = 0;
        df9 df9Var = this.s;
        if (df9Var != null) {
            df9Var.setEmojiOpened(false);
        }
        Z(false);
        requestLayout();
    }

    public final void S() {
        int i;
        int i2;
        float f;
        int i3;
        float f2;
        float f3;
        if (this.E) {
            i = gl.L(245.0f);
        } else {
            i = this.F;
        }
        t14 t14Var = this.x;
        float f4 = 0.0f;
        x02 x02Var = this.b;
        if (t14Var != null) {
            if (this.y) {
                float f5 = this.F - i;
                if (this.E) {
                    f3 = -x02Var.i4;
                } else {
                    f3 = 0.0f;
                }
                f2 = f5 + f3;
            } else {
                f2 = 0.0f;
            }
            t14Var.setTranslationY(f2);
        }
        df9 df9Var = this.s;
        if (df9Var != null) {
            boolean z = this.y;
            if (z) {
                f = i;
            } else {
                if (!this.M && this.F <= 0) {
                    i2 = gl.n;
                } else {
                    i2 = 0;
                }
                f = i2;
            }
            if (!z || this.E) {
                f += x02Var.i4;
            }
            df9Var.getBottomContainer().animate().cancel();
            df9Var.getBottomContainer().setTranslationY(-f);
            boolean z2 = this.y;
            if (z2) {
                f4 = i;
            }
            if (!z2 || this.E) {
                f4 += x02Var.i4;
            }
            df9Var.setBottomGradientTranslationY(-f4);
            if (this.N != this.L) {
                ViewPropertyAnimator animate = df9Var.getBottomInnerContainer().animate();
                this.N = this.L;
                animate.translationY(-i3).setDuration(320L).setInterpolator(s33.h).start();
            }
        }
    }

    public final void T(int i, int i2) {
        x02 x02Var = this.b;
        if (x02Var.Z1 == null) {
            return;
        }
        x02 x02Var2 = new x02(getContext(), x02Var.Z1, false, false, true, this.a);
        x02Var2.W3 = new b72(this, x02Var2);
        x02Var2.d2.h0();
        x02Var2.t1(1, true);
        x02Var2.P0(i);
        x02Var2.t4 = new u62(this, x02Var2);
        x02Var2.S1 = new u62(this, x02Var2);
        x02Var2.R1 = new c72(this, x02Var2);
        x02Var2.Z0();
        if (i2 != 0) {
            x02Var2.j1(i2);
        }
        x02Var2.v0(true);
        x02Var2.show();
    }

    public final boolean U() {
        d dVar = this.b.Z1;
        if (dVar instanceof mu1) {
            mu1 mu1Var = (mu1) dVar;
            ye9 ye9Var = this.r;
            if (!ye9Var.m2()) {
                return false;
            }
            TL_iv.RichMessage e2 = ye9Var.e2();
            hq6.d0(j5.a(this.n).a).T1(mu1Var.a(), mu1Var.G5(mu1Var.F5), "", null, null, null, null, 0L, false, false, e2);
            ar1 ar1Var = mu1Var.a0;
            if (ar1Var != null) {
                ar1Var.setRichDraftPreview(e2);
                return true;
            }
            return true;
        }
        return false;
    }

    public final mc9 V() {
        ye9 ye9Var = this.r;
        mc9 focusedEditTextOrNull = ye9Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            this.G = focusedEditTextOrNull;
            this.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        mc9 mc9Var = this.G;
        if (mc9Var != null) {
            return mc9Var;
        }
        return ye9Var.L2();
    }

    public final int W(mc9 mc9Var) {
        if (mc9Var == this.G && this.r.getFocusedEditTextOrNull() != mc9Var) {
            return Math.min(this.H, mc9Var.length());
        }
        return Math.max(0, mc9Var.getSelectionEnd());
    }

    public final void Y() {
        boolean z = this.y;
        ye9 ye9Var = this.r;
        if (z) {
            mc9 L2 = ye9Var.L2();
            if (L2 != null) {
                L2.O();
                gl.F3(L2);
            }
            R(true);
            return;
        }
        if (this.x == null) {
            x02 x02Var = this.b;
            t14 t14Var = new t14(x02Var.Z1, true, false, false, getContext(), true, null, x02Var.o3, true, this.a, false, false);
            this.x = t14Var;
            t14Var.setVisibility(8);
            t14 t14Var2 = this.x;
            t14Var2.x2 = false;
            t14Var2.setBottomInset(gl.n);
            View view = this.x.w;
            if (view != null) {
                view.setVisibility(8);
            }
            this.x.setDelegate(new d72(this));
            addView(this.x, nme.e(-1, getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        this.x.setLayoutParams(layoutParams);
        this.x.setTranslationY(0.0f);
        this.x.setVisibility(0);
        this.y = true;
        this.F = emojiPanelHeight;
        mc9 L22 = ye9Var.L2();
        if (L22 != null) {
            gl.t1(L22);
        }
        df9 df9Var = this.s;
        if (df9Var != null) {
            df9Var.setEmojiOpened(true);
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
        x02 x02Var = this.b;
        wz1 wz1Var = x02Var.u3;
        if (x02Var.u4 != z2) {
            x02Var.u4 = z2;
            if (x02Var.P2) {
                wz1Var.animate().cancel();
                if (!z2) {
                    wz1Var.setVisibility(0);
                }
                float f = 1.0f;
                float f2 = 0.0f;
                if (z) {
                    ViewPropertyAnimator animate = wz1Var.animate();
                    if (z2) {
                        f = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f);
                    if (z2) {
                        f2 = gl.L(48.0f);
                    }
                    alpha.translationY(f2).setDuration(180L).withEndAction(new qz1(x02Var, z2, (byte) 3)).start();
                } else {
                    if (z2) {
                        f = 0.0f;
                    }
                    wz1Var.setAlpha(f);
                    if (z2) {
                        f2 = gl.L(48.0f);
                    }
                    wz1Var.setTranslationY(f2);
                    if (z2) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    wz1Var.setVisibility(i);
                }
            }
        }
        if (!z2 && !x02Var.L1 && x02Var.P2) {
            i2 = gl.L(62.0f);
        }
        this.L = i2;
        S();
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
            x02 x02Var = this.b;
            if (!x02Var.L1 && x02Var.P2) {
                i = gl.L(62.0f);
            }
        }
        if (this.L != i) {
            this.L = i;
            S();
        }
    }

    public final void b0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e72.b0():void");
    }

    public final void c0() {
        boolean z;
        float f;
        df9 df9Var = this.s;
        if (df9Var != null) {
            ye9 ye9Var = this.r;
            boolean m2 = ye9Var.m2();
            ld9 ld9Var = ye9Var.R3;
            if (ld9Var != null && !ld9Var.c.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            ImageView imageView = df9Var.r;
            ImageView imageView2 = df9Var.n;
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
        df9 df9Var = this.s;
        if (df9Var != null) {
            int i = this.n;
            boolean z2 = false;
            if (!na7.q1(i).u4() && !y6c.h(i).p()) {
                z = true;
            } else {
                z = false;
            }
            ky1 sendButton = df9Var.getSendButton();
            if (z) {
                ye9 ye9Var = this.r;
                if (dg9.d(ye9Var.t3, ye9Var.u3)) {
                    z2 = true;
                }
            }
            sendButton.setLocked(z2);
            df9Var.setPremiumLocked(z);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.h5) {
            d0();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        ye9 ye9Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.Z1 instanceof mu1) && ye9Var.m2() && U()) {
                ir2.v(null, 2131745810, new u21(this.s, this.a), 2131623990, 36);
                return true;
            }
        } else if (!ye9Var.d3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        t14 t14Var;
        ye9 ye9Var = this.r;
        me9 me9Var = ye9Var.v3;
        qib qibVar = ye9Var.w3;
        if (!me9Var.w() || !qibVar.onTouchEvent(motionEvent)) {
            if (this.E && (t14Var = this.x) != null) {
                height = (int) t14Var.getY();
            } else {
                height = getHeight() - this.F;
            }
            int L = (height - gl.L(60.0f)) - this.L;
            if (motionEvent.getAction() == 0 && this.y && motionEvent.getY() < L) {
                R(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > gl.L(60.0f) && motionEvent.getY() < L)) && qibVar.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < L && ye9Var.e3(motionEvent)) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e72.e0():void");
    }

    public final void f0() {
        int i;
        df9 df9Var = this.s;
        if (df9Var == null) {
            return;
        }
        int currentActionBarHeight = (((a.getCurrentActionBarHeight() - gl.L(44.0f)) / 2) + gl.m) - gl.L(8.0f);
        ye9 ye9Var = this.r;
        if (ye9Var.getChildCount() <= 0) {
            i = ye9Var.getPaddingTop();
        } else {
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < ye9Var.getChildCount(); i3++) {
                View childAt = ye9Var.getChildAt(i3);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i2) {
                    i2 = childAt.getTop();
                }
            }
            if (i2 == Integer.MAX_VALUE) {
                i = ye9Var.getPaddingTop();
            } else {
                i = i2;
            }
        }
        df9Var.setTopButtonsOffset(Math.max(currentActionBarHeight, i));
    }

    @Override
    public int getCurrentItemTop() {
        ye9 ye9Var = this.r;
        if (ye9Var.getChildCount() <= 0) {
            int paddingTop = ye9Var.getPaddingTop();
            this.J = paddingTop;
            ye9Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        boolean z = false;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < ye9Var.getChildCount(); i2++) {
            View childAt = ye9Var.getChildAt(i2);
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
        ye9Var.setTopGlowOffset(Math.max(0, i));
        int i3 = i - gl.m;
        int L = gl.L(7.0f);
        if (i3 < gl.L(7.0f) || !z) {
            i3 = L;
        }
        this.J = i3;
        return i3;
    }

    @Override
    public int getFirstOffset() {
        return gl.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (this.r.getPaddingTop() - gl.m) - a.getCurrentActionBarHeight();
    }

    public fib getTextSelectionHelper() {
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
                t14 t14Var = this.x;
                if (t14Var != null) {
                    t14Var.s(false);
                    this.x.z();
                }
                S();
                return false;
            }
        } else if (this.y) {
            R(false);
            return false;
        } else if (!this.r.B2() && !Q()) {
            return true;
        }
        return false;
    }

    @Override
    public final void m(float f) {
        S();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.n).b(this, kk7.h5);
        d0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.n).n(this, kk7.h5);
    }

    @Override
    public final void q() {
        j47 j47Var = this.P;
        if (j47Var != null) {
            j47Var.g();
            this.P = null;
        }
        eq2 eq2Var = this.w;
        if (eq2Var != null) {
            eq2Var.n();
        }
        ye9 ye9Var = this.r;
        if (ye9Var != null) {
            ye9Var.r2();
        }
        t14 t14Var = this.x;
        if (t14Var != null) {
            t14Var.A();
        }
    }

    @Override
    public final boolean r() {
        ye9 ye9Var = this.r;
        if (ye9Var != null) {
            ye9Var.r2();
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
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        invalidate();
    }

    @Override
    public final boolean t() {
        if (!Q()) {
            return false;
        }
        return true;
    }

    @Override
    public final void v() {
        eq2 eq2Var = this.w;
        if (eq2Var != null) {
            eq2Var.n();
        }
        if (this.y) {
            R(false);
        }
    }

    @Override
    public final void z() {
        boolean z;
        if (this.b.o3.Q() > gl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        this.M = z;
        S();
        f0();
    }

    @Override
    public final void u() {
    }
}
