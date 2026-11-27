package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ula extends FrameLayout {
    public int E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public boolean I;
    public boolean J;
    public boolean K;
    public long L;
    public Runnable M;
    public pcc N;
    public boolean O;
    public long P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public boolean U;
    public final pn V;
    public final RectF W;
    public float a;
    public final RectF a0;
    public fj8 b;
    public final RectF b0;
    public final pq8 c;
    public final RectF c0;
    public o27 d;
    public final RectF d0;
    public s7 e;
    public final float[] e0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final Path f0;
    public final ArrayList g0;
    public jl0 h;
    public float h0;
    public float i0;
    public float j0;
    public int k0;
    public int l0;
    public final int[] m0;
    public o27 n;
    public final float[] n0;
    public final RectF o0;
    public final WeakHashMap r;
    public boolean s;
    public boolean w;
    public boolean x;
    public int y;

    public ula(Context context) {
        super(context);
        this.a = 1.0f;
        this.c = new pq8(this, (byte) 15);
        this.r = new WeakHashMap();
        this.F = new Paint(1);
        this.G = new Paint(1);
        Paint paint = new Paint();
        this.H = paint;
        this.V = new pn(null);
        this.W = new RectF();
        this.a0 = new RectF();
        this.b0 = new RectF();
        this.c0 = new RectF();
        this.d0 = new RectF();
        this.e0 = new float[8];
        this.f0 = new Path();
        this.g0 = new ArrayList();
        this.m0 = new int[2];
        this.n0 = new float[2];
        this.o0 = new RectF();
        setWillNotDraw(false);
        setClipChildren(false);
        setVisibility(8);
        paint.setColor(-16777216);
    }

    public static void f(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        if (f5 >= 1.0f) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(f, f2, f3, f4, (int) (f5 * 255.0f));
        }
    }

    public static float g(float f, float f2, float f3) {
        float l = Utilities.l((f3 - f) / (f2 - f));
        return xnb.B(l, 2.0f, 3.0f, l * l);
    }

    private float getAnimatorDurationScale() {
        if (Build.VERSION.SDK_INT >= 33) {
            return ValueAnimator.getDurationScale();
        }
        try {
            return Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    private int getRawContentBottom() {
        this.d.getClass();
        return this.d.getMenuExtraBelow() + ((int) this.W.bottom);
    }

    private int getRawContentTop() {
        int i = (int) this.W.top;
        return Math.max(Math.min(i, 0), i - this.d.getMenuRise());
    }

    public static double h(double d, double d2, double d3) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d4 = 6.283185307179586d / d3;
        double d5 = 1.0d - (d2 * d2);
        double sqrt = Math.sqrt(d5) * d4;
        double d6 = sqrt * d;
        return 1.0d - (((Math.sin(d6) * (d2 / Math.sqrt(d5))) + Math.cos(d6)) * Math.exp(((-d2) * d4) * d));
    }

    private void setAnimating(boolean z) {
        if (this.U == z) {
            return;
        }
        this.U = z;
        pn pnVar = this.V;
        if (z) {
            pnVar.d();
        } else {
            pnVar.e();
        }
    }

    public final void a(boolean z) {
        if (!this.I) {
            if (!this.U) {
                return;
            }
        } else {
            this.I = false;
            if (z && isAttachedToWindow() && isLaidOut()) {
                i();
                return;
            }
        }
        c();
    }

    public final void b() {
        o27 o27Var = this.d;
        if (o27Var == null) {
            return;
        }
        s7 s7Var = this.e;
        RectF rectF = this.W;
        this.J = o27Var.c(s7Var, rectF);
        View menuHostView = this.d.getMenuHostView();
        RectF rectF2 = this.o0;
        boolean c = yic.c(menuHostView, this, rectF2);
        float[] fArr = this.n0;
        if (c) {
            fArr[0] = rectF2.left;
            fArr[1] = rectF2.top;
        } else {
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
        }
        rectF.offset(fArr[0], fArr[1]);
    }

    public final void c() {
        ArrayList arrayList;
        jl0 jl0Var = this.h;
        if (jl0Var != null) {
            jl0Var.a.setEmpty();
        }
        setAnimating(false);
        this.I = false;
        this.x = false;
        this.T = 0.0f;
        this.S = 0.0f;
        this.R = 0.0f;
        clearFocus();
        setVisibility(8);
        int i = 0;
        while (true) {
            arrayList = this.g0;
            if (i >= arrayList.size()) {
                break;
            }
            tla tlaVar = (tla) arrayList.get(i);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = tlaVar.a;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(tlaVar.b);
            Drawable drawable = tlaVar.c;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(drawable);
            if (drawable != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(tlaVar.d);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(tlaVar.e, tlaVar.f, tlaVar.g, tlaVar.h);
            i++;
        }
        arrayList.clear();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null && actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
            this.f.getSwipeBack().setForegroundOnGlass(false);
        }
        s7 s7Var = this.e;
        o27 o27Var = this.d;
        this.e = null;
        this.d = null;
        if (o27Var != null) {
            o27Var.b(null, null);
        }
        if (s7Var != null) {
            s7Var.getIconView().setAlpha(1.0f);
            p7 p7Var = s7Var.R;
            if (p7Var != null) {
                p7Var.A();
            }
        }
        if (this.O) {
            this.O = false;
            pcc pccVar = this.N;
            if (pccVar != null) {
                pccVar.a(Boolean.FALSE);
            }
        }
        Runnable runnable = this.M;
        if (runnable != null) {
            this.M = null;
            runnable.run();
        }
    }

    public final boolean d(o27 o27Var) {
        if (this.d == o27Var && this.e == null) {
            if (this.I || this.U) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ula.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.I && keyEvent.getAction() == 1 && keyEvent.getRepeatCount() == 0 && (keyEvent.getKeyCode() == 82 || keyEvent.getKeyCode() == 4)) {
            a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ula.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void e(defpackage.o27 r10, defpackage.s7 r11, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ula.e(o27, s7, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    public s7 getItem() {
        return this.e;
    }

    public final void i() {
        this.Q = Math.max(this.R, this.S);
        this.h0 = this.S;
        this.j0 = 0.0f;
        this.P = 0L;
        setAnimating(true);
        invalidate();
    }

    public final float j(bl0 bl0Var, boolean z) {
        float f;
        bl0 bl0Var2;
        if (bl0Var == this.c) {
            o27 o27Var = this.d;
            if (o27Var != null) {
                bl0Var2 = o27Var.getMenuGlassColorProvider();
            } else {
                bl0Var2 = null;
            }
            bl0Var = bl0Var2;
        }
        if (bl0Var instanceof ol0) {
            ol0 ol0Var = (ol0) bl0Var;
            if (z) {
                return ol0Var.f;
            }
            return ol0Var.h;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.6666667f;
        }
        return hl.N(f);
    }

    public final void k(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.g0;
            if (i2 < arrayList.size()) {
                if (((tla) arrayList.get(i2)).a == actionBarPopupWindow$ActionBarPopupWindowLayout) {
                    break;
                }
                i2++;
            } else {
                arrayList.add(new tla(actionBarPopupWindow$ActionBarPopupWindowLayout));
                break;
            }
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(null);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, i, 0, i);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.I && !this.U) {
            return;
        }
        c();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (this.d != null && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.f) != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == this) {
            b();
            int measuredWidth = this.f.getMeasuredWidth();
            int measuredHeight = this.f.getMeasuredHeight();
            boolean z2 = this.s;
            RectF rectF = this.W;
            if (z2) {
                this.d.getClass();
                int max = (int) Math.max(hl.L(8.0f), Math.min(qu6.x(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
                int rawContentBottom = getRawContentBottom();
                if (rawContentBottom - measuredHeight < this.k0) {
                    rawContentBottom = Math.min(Math.max(rawContentBottom, this.l0), this.k0 + measuredHeight);
                }
                this.f.layout(max, rawContentBottom - measuredHeight, measuredWidth + max, rawContentBottom);
            } else if (this.w) {
                if (!this.x) {
                    this.x = true;
                    int rawContentTop = getRawContentTop();
                    if (rawContentTop + measuredHeight > this.l0) {
                        rawContentTop = Math.max(Math.min(rawContentTop, this.k0), this.l0 - measuredHeight);
                    }
                    this.E = rawContentTop;
                    this.y = (int) Math.max(hl.L(8.0f), Math.min(qu6.x(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f;
                int i5 = this.y;
                int i6 = this.E;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
            } else {
                int i7 = (int) rectF.right;
                int rawContentTop2 = getRawContentTop();
                if (rawContentTop2 + measuredHeight > this.l0) {
                    rawContentTop2 = Math.max(Math.min(rawContentTop2, this.k0), this.l0 - measuredHeight);
                }
                int max2 = Math.max(hl.L(8.0f), i7 - measuredWidth);
                this.f.layout(max2, rawContentTop2, measuredWidth + max2, measuredHeight + rawContentTop2);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        int L;
        int min;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        if (this.d != null && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.f) != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == this) {
            b();
            View rootView = getRootView();
            WeakHashMap weakHashMap = ihc.a;
            l2d a = bhc.a(this);
            if (rootView != null && a != null) {
                i2d i2dVar = a.a;
                int[] iArr = this.m0;
                getLocationInWindow(iArr);
                int i3 = i2dVar.f(1).b;
                int i4 = i2dVar.f(10).d;
                this.k0 = hl.L(8.0f) + Math.max(0, i3 - iArr[1]);
                L = Math.min(size2, (rootView.getHeight() - i4) - iArr[1]) - hl.L(16.0f);
                this.l0 = L;
            } else {
                this.k0 = hl.L(8.0f);
                L = (size2 - hl.L(16.0f)) - hl.n;
                this.l0 = L;
            }
            if (this.s) {
                L = Math.max(L, getRawContentBottom());
                min = this.k0;
            } else {
                min = Math.min(getRawContentTop(), this.k0);
            }
            int i5 = L - min;
            int menuMaxHeight = this.d.getMenuMaxHeight();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f;
            int f = ik8.f(16.0f, size, Integer.MIN_VALUE);
            int L2 = hl.L(48.0f);
            if (menuMaxHeight > 0) {
                i5 = Math.min(menuMaxHeight, i5);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(f, View.MeasureSpec.makeMeasureSpec(Math.max(L2, i5), Integer.MIN_VALUE));
        }
    }

    public void setOnClosed(Runnable runnable) {
        this.M = runnable;
    }

    public void setOnShownChanged(pcc pccVar) {
        this.N = pccVar;
    }
}
