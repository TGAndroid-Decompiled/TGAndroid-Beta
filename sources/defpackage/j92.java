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
public final class j92 extends FrameLayout implements tjb {
    public boolean E;
    public float F;
    public float G;
    public float H;
    public int I;
    public final Rect J;
    public final RectF K;
    public ql0 L;
    public float M;
    public float N;
    public int O;
    public float P;
    public boolean Q;
    public cyc a;
    public final sb b;
    public final FrameLayout c;
    public final yc d;
    public boolean e;
    public bm3 f;
    public q31 h;
    public il0 n;
    public il0 r;
    public final Path s;
    public int w;
    public float x;
    public float y;

    public j92(Context context) {
        super(context);
        this.e = true;
        this.s = new Path();
        this.J = new Rect();
        this.K = new RectF();
        this.O = 255;
        this.P = 1.0f;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, nme.e(-1, -2, 80));
        yc ycVar = new yc((byte) 13, context, this);
        this.d = ycVar;
        addView(ycVar, nme.e(-1, -2, 80));
        this.b = new sb((byte) 7, context, this);
    }

    public final void a(boolean z) {
        e();
        int round = Math.round(this.x) + gl.L(9.0f) + this.I;
        if (this.w == round && !z) {
            return;
        }
        this.w = round;
        int L = gl.L(29.0f);
        RectF rectF = this.K;
        rectF.set(0.0f, getMeasuredHeight() - this.y, getMeasuredWidth(), getMeasuredHeight());
        Path path = this.s;
        path.rewind();
        float f = L;
        path.addRoundRect(rectF, new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        path.close();
        invalidate();
    }

    public final void b() {
        int i;
        int measuredHeight;
        ql0 ql0Var = this.L;
        if (ql0Var != null && (i = ql0Var.getBounds().top) != (measuredHeight = getMeasuredHeight() - Math.round(this.M))) {
            this.L.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            this.b.invalidate(0, Math.max(0, Math.min(i, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
            invalidate(0, Math.max(0, Math.min(i, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void c() {
        int i;
        vxc vxcVar = ((fyc) this.a).r;
        if (vxcVar != null) {
            i = vxcVar.a.f(2).d;
        } else {
            i = 0;
        }
        float c = ((fyc) this.a).c();
        yc ycVar = this.d;
        int childCount = ycVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = ycVar.getChildAt(i2);
            if (childAt instanceof cn5) {
                cn5 cn5Var = (cn5) childAt;
                cn5Var.a(i);
                cn5Var.b(c);
            }
        }
    }

    public final void d() {
        boolean z;
        int i;
        WindowInsets rootWindowInsets;
        int i2;
        this.x = ((fyc) this.a).d();
        this.y = ((fyc) this.a).c();
        int i3 = 0;
        boolean z2 = true;
        if (((fyc) this.a).s != 1) {
            z = true;
        } else {
            z = false;
        }
        this.E = z;
        yc ycVar = this.d;
        if (ycVar.getVisibility() != 0) {
            z2 = false;
        }
        boolean z3 = this.E;
        if (z2 != z3) {
            if (z3) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            ycVar.setVisibility(i2);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ycVar.getLayoutParams();
        int i4 = layoutParams.height;
        int i5 = ((fyc) this.a).x;
        if (i4 != i5) {
            layoutParams.height = i5;
            requestLayout();
        }
        a(false);
        c();
        if (this.r != null) {
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
            this.r.t(gl.L(29.0f), gl.L(29.0f), i3, i, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j92.dispatchDraw(android.graphics.Canvas):void");
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
            canvas.clipPath(this.r.S.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (z) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.c.setTranslationY((-this.x) - gl.L(9.0f));
        yc ycVar = this.d;
        ycVar.setTranslationY(ycVar.getMeasuredHeight() - this.y);
    }

    public View getFadeView() {
        return this.b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.x) - gl.L(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.H;
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
        il0 il0Var;
        boolean z;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            il0 il0Var2 = this.n;
            if ((il0Var2 != null && il0Var2.c == 255 && il0Var2.getBounds().contains(x, y)) || ((il0Var = this.r) != null && il0Var.getBounds().contains(x, y))) {
                z = true;
            } else {
                z = false;
            }
            this.Q = z;
        }
        if (action == 1 || action == 3) {
            this.Q = false;
        }
        return this.Q;
    }

    public void setBackgroundWithFadeDrawable(ql0 ql0Var) {
        this.L = ql0Var;
    }

    public void setBlurredBottomHeight(float f) {
        if (this.M != f) {
            this.M = f;
            b();
        }
    }

    public void setInputBubbleAlpha(int i) {
        this.O = i;
        il0 il0Var = this.n;
        if (il0Var != null) {
            il0Var.setAlpha((int) (i * this.P));
        }
    }

    public void setInputBubbleExtraAlpha(float f) {
        if (this.P != f) {
            this.P = f;
            il0 il0Var = this.n;
            if (il0Var != null) {
                il0Var.setAlpha((int) (this.O * f));
            }
            invalidate();
        }
    }

    public void setInputBubbleHeight(float f) {
        this.H = f;
        this.I = Math.round(f);
        a(false);
    }

    public void setInputBubbleTranslationY(float f) {
        this.N = f;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(il0 il0Var) {
        this.n = il0Var;
        il0Var.q(gl.L(7.0f));
        this.n.r(gl.L(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(il0 il0Var) {
        this.r = il0Var;
        il0Var.U = true;
        il0Var.s(gl.L(29.0f), gl.L(29.0f), 0.0f, 0.0f);
        this.r.u(gl.L(32.0f));
        il0 il0Var2 = this.r;
        il0Var2.S.g = 0.4f;
        il0Var2.n();
    }

    public void setWindowInsetsProvider(cyc cycVar) {
        this.a = cycVar;
    }

    @Override
    public final void updateColors() {
        il0 il0Var = this.n;
        if (il0Var != null) {
            il0Var.updateColors();
        }
        il0 il0Var2 = this.r;
        if (il0Var2 != null) {
            il0Var2.updateColors();
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
