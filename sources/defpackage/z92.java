package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class z92 extends FrameLayout implements snb {
    public float E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public final Rect K;
    public final RectF L;
    public rl0 M;
    public float N;
    public float O;
    public int P;
    public float Q;
    public boolean R;
    public s2d a;
    public final tb b;
    public final FrameLayout c;
    public final zc d;
    public boolean e;
    public um3 f;
    public h01 h;
    public h01 n;
    public jl0 r;
    public jl0 s;
    public final Path w;
    public int x;
    public float y;

    public z92(Context context) {
        super(context);
        this.e = true;
        this.w = new Path();
        this.K = new Rect();
        this.L = new RectF();
        this.P = 255;
        this.Q = 1.0f;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, tre.e(-1, -2, 80));
        zc zcVar = new zc((byte) 13, context, this);
        this.d = zcVar;
        addView(zcVar, tre.e(-1, -2, 80));
        this.b = new tb((byte) 8, context, this);
    }

    public final void a(boolean z) {
        e();
        int round = Math.round(this.y) + hl.L(9.0f) + this.J;
        if (this.x == round && !z) {
            return;
        }
        this.x = round;
        int L = hl.L(29.0f);
        RectF rectF = this.L;
        rectF.set(0.0f, getMeasuredHeight() - this.E, getMeasuredWidth(), getMeasuredHeight());
        Path path = this.w;
        path.rewind();
        float f = L;
        path.addRoundRect(rectF, new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        path.close();
        invalidate();
    }

    public final void b() {
        int i;
        int measuredHeight;
        rl0 rl0Var = this.M;
        if (rl0Var != null && (i = rl0Var.getBounds().top) != (measuredHeight = getMeasuredHeight() - Math.round(this.N))) {
            this.M.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            this.b.invalidate(0, Math.max(0, Math.min(i, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
            invalidate(0, Math.max(0, Math.min(i, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void c() {
        int i;
        l2d l2dVar = ((v2d) this.a).r;
        if (l2dVar != null) {
            i = l2dVar.a.f(2).d;
        } else {
            i = 0;
        }
        float c = ((v2d) this.a).c();
        zc zcVar = this.d;
        int childCount = zcVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = zcVar.getChildAt(i2);
            if (childAt instanceof fp5) {
                fp5 fp5Var = (fp5) childAt;
                fp5Var.a(i);
                fp5Var.b(c);
            }
        }
    }

    public final void d() {
        boolean z;
        int i;
        WindowInsets rootWindowInsets;
        int i2;
        this.y = ((v2d) this.a).d();
        this.E = ((v2d) this.a).c();
        int i3 = 0;
        boolean z2 = true;
        if (((v2d) this.a).s != 1) {
            z = true;
        } else {
            z = false;
        }
        this.F = z;
        zc zcVar = this.d;
        if (zcVar.getVisibility() != 0) {
            z2 = false;
        }
        boolean z3 = this.F;
        if (z2 != z3) {
            if (z3) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            zcVar.setVisibility(i2);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zcVar.getLayoutParams();
        int i4 = layoutParams.height;
        int i5 = ((v2d) this.a).x;
        if (i4 != i5) {
            layoutParams.height = i5;
            requestLayout();
        }
        a(false);
        c();
        if (this.s != null) {
            if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                if (roundedCorner == null) {
                    i = 0;
                } else {
                    i = roundedCorner.getRadius();
                }
                if (roundedCorner2 != null) {
                    i3 = roundedCorner2.getRadius();
                }
            } else {
                i = 0;
            }
            this.s.t(hl.L(29.0f), hl.L(29.0f), i3, i, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z92.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (view == this.d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            canvas.save();
            canvas.clipPath(this.s.S.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (z) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.c.setTranslationY((-this.y) - hl.L(9.0f));
        zc zcVar = this.d;
        zcVar.setTranslationY(zcVar.getMeasuredHeight() - this.E);
    }

    public View getFadeView() {
        return this.b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.y) - hl.L(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.I;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.c;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e();
        c();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        a(true);
        b();
        e();
        c();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jl0 jl0Var;
        boolean z;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            jl0 jl0Var2 = this.r;
            if ((jl0Var2 != null && jl0Var2.c == 255 && jl0Var2.getBounds().contains(x, y)) || ((jl0Var = this.s) != null && jl0Var.getBounds().contains(x, y))) {
                z = true;
            } else {
                z = false;
            }
            this.R = z;
        }
        if (action == 1 || action == 3) {
            this.R = false;
        }
        return this.R;
    }

    public void setBackgroundWithFadeDrawable(rl0 rl0Var) {
        this.M = rl0Var;
    }

    public void setBlurredBottomHeight(float f) {
        if (this.N != f) {
            this.N = f;
            b();
        }
    }

    public void setInputBubbleAlpha(int i) {
        this.P = i;
        jl0 jl0Var = this.r;
        if (jl0Var != null) {
            jl0Var.setAlpha((int) (i * this.Q));
        }
    }

    public void setInputBubbleExtraAlpha(float f) {
        if (this.Q != f) {
            this.Q = f;
            jl0 jl0Var = this.r;
            if (jl0Var != null) {
                jl0Var.setAlpha((int) (this.P * f));
            }
            invalidate();
        }
    }

    public void setInputBubbleHeight(float f) {
        this.I = f;
        this.J = Math.round(f);
        a(false);
    }

    public void setInputBubbleTranslationY(float f) {
        this.O = f;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(jl0 jl0Var) {
        this.r = jl0Var;
        jl0Var.q(hl.L(7.0f));
        this.r.r(hl.L(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(jl0 jl0Var) {
        this.s = jl0Var;
        jl0Var.U = true;
        jl0Var.s(hl.L(29.0f), hl.L(29.0f), 0.0f, 0.0f);
        this.s.u(hl.L(32.0f));
        jl0 jl0Var2 = this.s;
        jl0Var2.S.g = 0.4f;
        jl0Var2.n();
    }

    public void setWindowInsetsProvider(s2d s2dVar) {
        this.a = s2dVar;
    }

    @Override
    public final void updateColors() {
        jl0 jl0Var = this.r;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        jl0 jl0Var2 = this.s;
        if (jl0Var2 != null) {
            jl0Var2.updateColors();
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
