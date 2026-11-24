package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public class fx0 extends Dialog implements zf0 {
    public static final int k1 = 0;
    public AnimatorSet A0;
    public byte B0;
    public ValueAnimator C0;
    public float D0;
    public boolean E;
    public boolean E0;
    public FrameLayout F;
    public float F0;
    public boolean G;
    public int G0;
    public o1 H;
    public int H0;
    public int I;
    public DialogInterface.OnDismissListener I0;
    public boolean J;
    public wjb J0;
    public final boolean K;
    public boolean K0;
    public DialogInterface.OnClickListener L;
    public boolean L0;
    public CharSequence[] M;
    public final on M0;
    public int[] N;
    public byte N0;
    public ViewGroup O;
    public boolean O0;
    public CharSequence P;
    public ValueAnimator P0;
    public boolean Q;
    public boolean Q0;
    public boolean R;
    public boolean R0;
    public int S;
    public boolean S0;
    public int T;
    public boolean T0;
    public int U;
    public byte U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public boolean W0;
    public byte X;
    public final qw4 X0;
    public Integer Y;
    public zha Y0;
    public final gc Z;
    public dg0 Z0;
    public int a;
    public boolean a0;
    public cu6 a1;
    public ViewGroup b;
    public int b0;
    public int b1;
    public final ww0 c;
    public boolean c0;
    public int c1;
    public boolean d;
    public boolean d0;
    public int d1;
    public int e;
    public boolean e0;
    public PorterDuffColorFilter e1;
    public int f;
    public boolean f0;
    public boolean f1;
    public boolean g0;
    public int g1;
    public WindowInsets h;
    public int h0;
    public long h1;
    public boolean i0;
    public d i1;
    public final int j0;
    public c9c j1;
    public final short k0;
    public Interpolator l0;
    public xw0 m0;
    public boolean n;
    public boolean n0;
    public final byte o0;
    public boolean p0;
    public byte q0;
    public boolean r;
    public boolean r0;
    public boolean s;
    public Drawable s0;
    public int t0;
    public int u0;
    public boolean v0;
    public boolean w;
    public boolean w0;
    public boolean x;
    public final ArrayList x0;
    public boolean y;
    public final rw0 y0;
    public ax0 z0;

    public fx0(int i, wjb wjbVar, Context context, boolean z) {
        super(context, 2131755352);
        this.a = y6c.t0;
        this.K = true;
        gc gcVar = new gc();
        this.Z = gcVar;
        this.a0 = true;
        int i2 = bkb.g5;
        this.b0 = i2;
        this.c0 = true;
        this.d0 = true;
        this.e0 = true;
        this.h0 = gl.m;
        this.k0 = (short) 400;
        this.l0 = s33.h;
        this.o0 = (byte) 16;
        this.p0 = true;
        this.q0 = (byte) 51;
        this.r0 = true;
        this.v0 = true;
        this.w0 = true;
        this.x0 = new ArrayList();
        this.y0 = new rw0(this, (byte) 1);
        this.D0 = 0.0f;
        this.G0 = bkb.Z6;
        this.L0 = true;
        this.M0 = new on(null);
        this.T0 = true;
        this.U0 = (byte) 51;
        this.X0 = new qw4();
        this.b1 = -1;
        this.d1 = i2;
        this.h1 = -1L;
        this.J0 = wjbVar;
        if (i == 3) {
            gl.S(getWindow());
            this.n = false;
            this.r = false;
            this.s = false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            getWindow().addFlags(-2147483392);
            if (i != 1) {
                this.o0 = (byte) 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.j0 = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        DrawableWrapper drawableWrapper = new DrawableWrapper(b00.d(context, 2131232733));
        this.s0 = drawableWrapper;
        int v0 = bkb.v0(i2, this.J0);
        this.c1 = v0;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY);
        this.e1 = porterDuffColorFilter;
        drawableWrapper.setColorFilter(porterDuffColorFilter);
        this.s0.getPadding(rect);
        this.u0 = rect.left;
        this.t0 = rect.top;
        ww0 ww0Var = new ww0(this, getContext());
        this.c = ww0Var;
        ww0Var.setClipChildren(false);
        ww0Var.setClipToPadding(false);
        ww0Var.setBackground(gcVar);
        this.n0 = z;
        if (i == 1) {
            ww0Var.setFitsSystemWindows(true);
            ww0Var.setOnApplyWindowInsetsListener(new qv0(this, (byte) 1));
        }
        if (i3 >= 30) {
            ww0Var.setSystemUiVisibility(1792);
        } else {
            ww0Var.setSystemUiVisibility(1280);
        }
        gcVar.setAlpha(0);
        if (i == 3) {
            nm0 nm0Var = new nm0(this);
            WeakHashMap weakHashMap = jdc.a;
            bdc.i(ww0Var, nm0Var);
        }
    }

    public boolean A0() {
        return false;
    }

    public final void B0(View view, cs5 cs5Var, boolean z) {
        if ((cs5Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) && view.isLaidOut()) {
            ww0 ww0Var = this.c;
            if (ww0Var.isAttachedToWindow()) {
                if (this.Y0 == null) {
                    qw4 qw4Var = new qw4();
                    qw4Var.i(ww0Var);
                    dg0 dg0Var = new dg0(qw4Var, new nm0(this));
                    this.Z0 = dg0Var;
                    wjb wjbVar = this.J0;
                    dg0Var.m = ww0Var;
                    dg0Var.n = null;
                    dg0Var.g(ww0Var, null, wjbVar);
                    this.Z0.o = new vw0(this, (byte) 0);
                    zha zhaVar = new zha(getContext());
                    this.Y0 = zhaVar;
                    ww0Var.addView(zhaVar, nme.c(-1.0f, -1));
                }
                zha zhaVar2 = this.Y0;
                if (zhaVar2.I) {
                    return;
                }
                cu6 cu6Var = this.a1;
                if (cu6Var == null) {
                    cu6Var = new cu6(zhaVar2, this.Z0, this.J0);
                    this.a1 = cu6Var;
                }
                if (!cu6Var.c) {
                    cu6Var.r = view;
                    cu6Var.d = z;
                }
                cs5Var.p = new uw0(zhaVar2, (byte) 0);
                zhaVar2.d(cu6Var, null, (ActionBarPopupWindow$ActionBarPopupWindowLayout) cs5Var.A);
                return;
            }
        }
        cs5Var.a0();
    }

    public final void C0() {
        int v0;
        boolean z;
        Drawable drawable;
        int v02;
        int i = this.d1;
        ww0 ww0Var = this.c;
        if (i >= 0 && (drawable = this.s0) != null && this.e1 != null && drawable.getColorFilter() == this.e1 && (v02 = bkb.v0(this.d1, this.J0)) != this.c1) {
            Drawable drawable2 = this.s0;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY);
            this.e1 = porterDuffColorFilter;
            drawable2.setColorFilter(porterDuffColorFilter);
            this.c1 = v02;
            if (ww0Var != null) {
                ww0Var.invalidate();
            }
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        int i2 = this.b1;
        if (i2 >= 0 && this.G0 < 0 && this.g1 == this.H0 && (v0 = bkb.v0(i2, this.J0)) != this.H0) {
            this.H0 = v0;
            this.g1 = v0;
            if (ww0Var != null) {
                ww0Var.invalidate();
            }
            if (gl.B(v0) > 0.721d) {
                z = true;
            } else {
                z = false;
            }
            if (this.i1 != null) {
                gl.k3(ww0Var, z);
                return;
            }
            gl.p3(this, v0, false, null);
            gl.j3(this, z);
        }
    }

    public boolean E() {
        return this.c0;
    }

    public boolean F() {
        return this.d0;
    }

    public boolean G(MotionEvent motionEvent) {
        return false;
    }

    public void H() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.A0 = null;
        }
        this.B0 = (byte) 0;
    }

    public void I() {
        d dVar = this.i1;
        if (dVar != null) {
            dVar.removeSheet(this);
            gl.B2(this.c);
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            fa4.g(e, false);
        }
    }

    public void J(int i) {
        long j;
        Integer num;
        if (!this.J) {
            this.J = true;
            H();
            this.B0 = (byte) 2;
            this.A0 = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, View.TRANSLATION_Y, Math.max(0, Math.min(gl.n, P())) + gl.L(10.0f) + Q() + this.f);
            ofFloat.addUpdateListener(new sw0(this, (byte) 2));
            this.A0.playTogether(ofFloat, ObjectAnimator.ofInt(this.Z, rn.d, 0));
            AnimatorSet animatorSet = this.A0;
            if (this.X == 4) {
                j = 330;
            } else {
                j = 180;
            }
            animatorSet.setDuration(j);
            this.A0.setInterpolator(s33.g);
            this.A0.addListener(new cn(this, i, (byte) 2));
            kk7.e().k(kk7.i1, 512);
            this.A0.start();
            if (this.X == 4 && (num = this.Y) != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.x0;
                int currentTextColor = ((zw0) arrayList.get(intValue)).getTextView().getCurrentTextColor();
                int currentTextColor2 = ((zw0) arrayList.get(i)).getTextView().getCurrentTextColor();
                ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
                ofArgb.addUpdateListener(new sw0(this, (byte) 3));
                ofArgb.setDuration(130L);
                s33 s33Var = s33.f;
                ofArgb.setInterpolator(s33Var);
                ofArgb.start();
                ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
                ofArgb2.addUpdateListener(new tw0(this, i, (byte) 0));
                ofArgb2.setDuration(130L);
                ofArgb2.setInterpolator(s33Var);
                ofArgb2.start();
            }
        }
    }

    public final void K() {
        M(bkb.Z6);
    }

    public final void L(int i) {
        this.n = !this.x;
        this.s = true;
        this.w = true;
        this.G0 = -1;
        this.b1 = -1;
        this.H0 = i;
        x0(i);
    }

    public final void M(int i) {
        L(bkb.v0(i, this.J0));
        this.b1 = i;
    }

    public final int O() {
        WindowInsets windowInsets;
        int i;
        int i2;
        int i3;
        if (this.i0 && (windowInsets = this.h) != null) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            if (!this.d && this.n && systemGestureInsets != null) {
                i = systemGestureInsets.left;
                if (i == 0) {
                    i3 = systemGestureInsets.right;
                    if (i3 == 0) {
                        return 0;
                    }
                }
                i2 = systemGestureInsets.bottom;
                return i2;
            }
            return 0;
        }
        return 0;
    }

    public int P() {
        return (int) (this.S * 1.0f);
    }

    public int Q() {
        ViewGroup viewGroup = this.b;
        if (viewGroup == null) {
            return 0;
        }
        return viewGroup.getMeasuredHeight();
    }

    public final int R() {
        WindowInsets windowInsets = this.h;
        if (windowInsets != null) {
            return (int) (windowInsets.getSystemWindowInsetLeft() * 1.0f);
        }
        return 0;
    }

    public ArrayList S() {
        return null;
    }

    public final int T(int i) {
        return bkb.v0(i, this.J0);
    }

    public boolean U(float f, float f2) {
        FrameLayout frameLayout = this.F;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.F.getChildAt(0);
            if (f2 >= childAt.getY() + this.F.getY()) {
                if (f2 <= childAt.getY() + this.F.getY() + childAt.getHeight()) {
                    if (f >= childAt.getX() + this.F.getX()) {
                        if (f <= childAt.getX() + this.F.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        if (f2 >= this.b.getTop() && f >= this.b.getLeft() && f <= this.b.getRight()) {
            return false;
        }
        return true;
    }

    public final WindowInsets V(WindowInsets windowInsets) {
        q0(windowInsets);
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public final void X(d dVar) {
        if (!gl.O1()) {
            if (dVar == null || !dVar.isSupportEdgeToEdge()) {
                this.i1 = dVar;
                gc gcVar = this.Z;
                if (gcVar != null) {
                    ((Paint) gcVar.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                }
            }
        }
    }

    @Override
    public void a(boolean z) {
        dismiss();
    }

    public boolean c0(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final View d() {
        return this.c;
    }

    public void d0(float f) {
        ww0 ww0Var = this.c;
        if (ww0Var != null) {
            ww0Var.invalidate();
        }
    }

    @Override
    public void dismiss() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx0.dismiss():void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.J) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int e(int i) {
        float f;
        ViewGroup viewGroup;
        if (z() && (viewGroup = this.b) != null) {
            if (this.V0) {
                f = viewGroup.getAlpha();
            } else {
                int L = gl.L(10.0f) + Q() + this.f;
                int i2 = 0;
                if (this.w) {
                    i2 = Math.max(0, Math.min(gl.n, P()));
                }
                f = Utilities.l(1.0f - (this.b.getTranslationY() / (L + i2)));
            }
        } else {
            f = 0.0f;
        }
        return bm2.f(f, i, this.H0);
    }

    @Override
    public boolean f() {
        return this.a0;
    }

    public final void f0() {
        Window window;
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        int i3;
        int i4;
        d dVar = this.i1;
        ww0 ww0Var = this.c;
        if (dVar != null) {
            dVar.addSheet(this);
            if (this.i1.getLayoutContainer() != null) {
                if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.i1.getLayoutContainer().getWindowToken(), 2)) {
                    gl.e3(new rw0(this, (byte) 0), 80L);
                } else {
                    gl.B2(ww0Var);
                    this.i1.getLayoutContainer().addView(ww0Var);
                }
                window = null;
            } else {
                return;
            }
        } else {
            window = getWindow();
            window.setWindowAnimations(2131755178);
            setContentView(ww0Var, new ViewGroup.LayoutParams(-1, -1));
        }
        if (this.a0 && bkb.w0(null, bkb.r8, true) == -1) {
            ww0Var.setSystemUiVisibility(ww0Var.getSystemUiVisibility() | 8192);
        }
        if (this.b == null) {
            yc ycVar = new yc((byte) 5, getContext(), this);
            this.b = ycVar;
            ycVar.setBackgroundDrawable(this.s0);
            ViewGroup viewGroup = this.b;
            int i5 = this.u0;
            if (this.v0) {
                i3 = gl.L(8.0f);
            } else {
                i3 = 0;
            }
            int i6 = (i3 + this.t0) - 1;
            int i7 = this.u0;
            if (this.w0) {
                i4 = gl.L(8.0f);
            } else {
                i4 = 0;
            }
            viewGroup.setPadding(i5, i6, i7, i4);
        }
        this.b.setVisibility(4);
        ww0Var.addView(this.b, 0, nme.e(-1, -2, 80));
        if (this.F == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.F = frameLayout;
            ww0Var.addView(frameLayout, ww0Var.indexOfChild(this.b) + 1, nme.e(-1, -2, 80));
        }
        if (this.P != null) {
            xw0 xw0Var = new xw0((byte) 0, getContext(), this);
            this.m0 = xw0Var;
            xw0Var.setText(this.P);
            boolean z = this.Q;
            xw0 xw0Var2 = this.m0;
            if (z) {
                zkb.X(xw0Var2, bkb.i5, this.J0);
                this.m0.setTextSize(1, 20.0f);
                this.m0.setTypeface(gl.o());
                xw0 xw0Var3 = this.m0;
                int L = gl.L(21.0f);
                if (this.R) {
                    f3 = 14.0f;
                } else {
                    f3 = 6.0f;
                }
                xw0Var3.setPadding(L, gl.L(f3), gl.L(21.0f), gl.L(8.0f));
            } else {
                zkb.X(xw0Var2, bkb.p5, this.J0);
                this.m0.setTextSize(1, 16.0f);
                xw0 xw0Var4 = this.m0;
                int L2 = gl.L(16.0f);
                if (this.R) {
                    f = 8.0f;
                } else {
                    f = 0.0f;
                }
                xw0Var4.setPadding(L2, gl.L(f), gl.L(16.0f), gl.L(8.0f));
            }
            boolean z2 = this.R;
            xw0 xw0Var5 = this.m0;
            if (z2) {
                xw0Var5.setSingleLine(false);
                this.m0.setMaxLines(5);
                this.m0.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                xw0Var5.setLines(1);
                this.m0.setSingleLine(true);
                this.m0.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
            this.m0.setGravity(16);
            ViewGroup viewGroup2 = this.b;
            xw0 xw0Var6 = this.m0;
            if (this.R) {
                f2 = -2.0f;
            } else {
                f2 = 48.0f;
            }
            viewGroup2.addView(xw0Var6, nme.c(f2, -1));
            this.m0.setOnTouchListener(new p8((byte) 19));
            i = 48;
        } else {
            i = 0;
        }
        ViewGroup viewGroup3 = this.O;
        if (viewGroup3 != null) {
            if (viewGroup3.getParent() != null) {
                ((ViewGroup) this.O.getParent()).removeView(this.O);
            }
            boolean z3 = this.T0;
            ViewGroup viewGroup4 = this.b;
            if (!z3) {
                viewGroup4.setClipToPadding(false);
                this.b.setClipChildren(false);
                ww0Var.setClipToPadding(false);
                ww0Var.setClipChildren(false);
                float f4 = i;
                this.b.addView(this.O, nme.d(-1, -2.0f, this.U0, 0.0f, f4, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = gl.L(f4) + (-this.t0);
            } else {
                viewGroup4.addView(this.O, nme.d(-1, -2.0f, this.U0, 0.0f, i, 0.0f, 0.0f));
            }
        } else if (this.M != null) {
            int i8 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.M;
                if (i8 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i8] != null) {
                    zw0 zw0Var = new zw0(this.X, this.J0, getContext());
                    CharSequence charSequence = this.M[i8];
                    int[] iArr = this.N;
                    if (iArr != null) {
                        i2 = iArr[i8];
                    } else {
                        i2 = 0;
                    }
                    zw0Var.a(charSequence, i2, null, this.Q);
                    this.b.addView(zw0Var, nme.d(-1, 48.0f, 51, 0.0f, i, 0.0f, 0.0f));
                    i += 48;
                    zw0Var.setTag(Integer.valueOf(i8));
                    zw0Var.setOnClickListener(new dh(this, (byte) 1));
                    this.x0.add(zw0Var);
                }
                i8++;
            }
        }
        if (this.i1 == null && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            int i9 = attributes.flags & (-3);
            attributes.flags = i9;
            if (this.n0) {
                attributes.softInputMode = this.o0;
            } else {
                i9 |= 131072;
                attributes.flags = i9;
            }
            if (this.W) {
                attributes.flags = i9 | (-2147416832);
                ww0Var.setSystemUiVisibility(1284);
            }
            attributes.height = -1;
            gl.m(attributes);
            window.setAttributes(attributes);
        }
    }

    public boolean g0() {
        return false;
    }

    @Override
    public final boolean h() {
        return false;
    }

    public boolean h0(View view, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean i0(View view, int i, int i2) {
        return false;
    }

    @Override
    public u21 j() {
        return new u21(this.F, this.J0);
    }

    public boolean j0() {
        return false;
    }

    public void l0() {
        dismiss();
    }

    @Override
    public void n(Runnable runnable) {
        this.I0 = new ne(runnable, (byte) 1);
    }

    public void n0(float f) {
        ww0 ww0Var = this.c;
        if (ww0Var != null) {
            ww0Var.invalidate();
        }
    }

    @Override
    public void onBackPressed() {
        zha zhaVar = this.Y0;
        if (zhaVar != null && zhaVar.I) {
            zhaVar.a(true);
        } else if (this.i1 == null) {
            super.onBackPressed();
        } else {
            dismiss();
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f0();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    public void p0() {
        if ((this instanceof tjb) && !this.W0) {
            this.W0 = true;
            try {
                try {
                    ((tjb) this).updateColors();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            } finally {
                this.W0 = false;
            }
        }
    }

    @Override
    public final void q() {
        onBackPressed();
    }

    public final void q0(WindowInsets windowInsets) {
        if (windowInsets == null) {
            return;
        }
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        if ((systemWindowInsetTop != 0 || gl.E) && this.h0 != systemWindowInsetTop) {
            this.h0 = systemWindowInsetTop;
        }
        this.h = windowInsets;
        this.c.requestLayout();
        m0();
    }

    public void r0(boolean z) {
        this.r0 = z;
        if (!z) {
            this.b.setTranslationY(0.0f);
            e0();
        }
    }

    public final void s0(int i) {
        this.s0.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        if (this.c1 != i) {
            this.c1 = i;
            ww0 ww0Var = this.c;
            if (ww0Var != null) {
                ww0Var.invalidate(0, ww0Var.getMeasuredHeight() - ww0Var.x, ww0Var.getMeasuredWidth(), ww0Var.getMeasuredHeight());
            }
        }
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        this.P = charSequence;
        this.Q = false;
    }

    @Override
    public void show() {
        long j;
        if (!gl.K1(getContext())) {
            return;
        }
        if (this.i1 != null) {
            f0();
        } else {
            super.show();
        }
        y0(true);
        if (this.n0) {
            getWindow().setSoftInputMode(this.o0);
        }
        int i = 0;
        this.J = false;
        H();
        ViewGroup viewGroup = this.b;
        Point point = gl.q;
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(point.x + (this.u0 << 1), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        boolean z = this.f0;
        gc gcVar = this.Z;
        if (z) {
            if (this.p0) {
                i = this.q0;
            }
            gcVar.setAlpha(i);
            this.b.setTranslationY(0.0f);
            e0();
            return;
        }
        gcVar.setAlpha(0);
        this.I = 2;
        ViewGroup viewGroup2 = this.b;
        float measuredHeight = (gl.m * 1.0f) + viewGroup2.getMeasuredHeight();
        if (this.w) {
            i = Math.max(0, Math.min(gl.n, P()));
        }
        viewGroup2.setTranslationY(measuredHeight + i);
        e0();
        if (this.S0) {
            j = 0;
        } else {
            j = 150;
        }
        if (this.E) {
            j = 500;
        }
        o1 o1Var = new o1(this, (byte) 9);
        this.H = o1Var;
        gl.e3(o1Var, j);
    }

    @Override
    public final boolean t() {
        return !this.J;
    }

    public final void t0(int i) {
        s0(bkb.v0(i, this.J0));
        Drawable drawable = this.s0;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.c1, PorterDuff.Mode.MULTIPLY);
        this.e1 = porterDuffColorFilter;
        drawable.setColorFilter(porterDuffColorFilter);
        this.d1 = i;
    }

    @Override
    public boolean u(Dialog dialog) {
        return false;
    }

    public final void u0(boolean z) {
        this.i0 = z;
        this.n = z;
    }

    public final void v0(boolean z) {
        if (this.n0 == z) {
            return;
        }
        this.n0 = z;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.n0) {
            attributes.softInputMode = this.o0;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void w0(int i, int i2, int i3) {
        if (i >= 0) {
            ArrayList arrayList = this.x0;
            if (i < arrayList.size()) {
                zw0 zw0Var = (zw0) arrayList.get(i);
                zw0Var.a.setTextColor(i2);
                zw0Var.b.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public void x0(int i) {
        this.g1 = i;
        ww0 ww0Var = this.c;
        if (ww0Var != null) {
            ww0Var.invalidate();
        }
        boolean z = false;
        if (this.i1 != null) {
            LaunchActivity.H1.H(true, true, true);
            if (gl.B(e(bkb.v0(bkb.Z6, this.J0))) >= 0.721f) {
                z = true;
            }
            gl.k3(ww0Var, z);
            return;
        }
        gl.p3(this, this.g1, true, null);
        if (gl.B(this.g1) > 0.721d) {
            z = true;
        }
        gl.j3(this, z);
    }

    public final void y0(boolean z) {
        if (this.g0 != z) {
            this.g0 = z;
            if (this.N0 > 0) {
                if (z) {
                    kk7.e().k(kk7.i1, Integer.valueOf(this.N0));
                } else {
                    kk7.e().k(kk7.j1, Integer.valueOf(this.N0));
                }
            }
        }
    }

    @Override
    public final boolean z() {
        ww0 ww0Var = this.c;
        if (ww0Var != null && ww0Var.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    public final void z0(boolean z) {
        int i;
        this.a0 = z;
        int w0 = bkb.w0(null, bkb.r8, true);
        ww0 ww0Var = this.c;
        int systemUiVisibility = ww0Var.getSystemUiVisibility();
        if (this.a0 && w0 == -1) {
            i = systemUiVisibility | 8192;
        } else {
            i = systemUiVisibility & (-8193);
        }
        ww0Var.setSystemUiVisibility(i);
        if (this.i1 != null) {
            LaunchActivity.H1.H(true, true, true);
        }
    }

    public void a0() {
    }

    public void b0() {
    }

    public void e0() {
    }

    public void k0() {
    }

    public void m0() {
    }

    public void o0() {
    }

    public void x() {
    }

    public void A(HashSet hashSet) {
    }

    public void W(Canvas canvas) {
    }

    public vxc Y(vxc vxcVar) {
        return vxcVar;
    }

    public void Z(Configuration configuration) {
    }

    @Override
    public final void b(boolean z) {
    }

    @Override
    public final void g(int i) {
    }

    public void C(ArrayList arrayList, boolean z) {
    }

    public fx0(Context context, boolean z) {
        this(1, (wjb) null, context, z);
    }

    public fx0(wjb wjbVar, Context context, boolean z, boolean z2) {
        this(z2 ? 2 : 1, wjbVar, context, z);
    }
}
