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
public final class va2 extends FrameLayout implements vlb {
    public boolean E;
    public float F;
    public float G;
    public float H;
    public int I;
    public final Rect J;
    public final RectF K;
    public qm0 L;
    public float M;
    public float N;
    public int O;
    public float P;
    public boolean Q;
    public d0d a;
    public final sb b;
    public final FrameLayout c;
    public final yd d;
    public boolean e;
    public mn3 f;
    public g11 h;
    public im0 n;
    public im0 r;
    public final Path s;
    public int w;
    public float x;
    public float y;

    public va2(Context context) {
        super(context);
        this.e = true;
        this.s = new Path();
        this.J = new Rect();
        this.K = new RectF();
        this.O = 255;
        this.P = 1.0f;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, qoe.e(-1, -2, 80));
        yd ydVar = new yd((byte) 13, context, this);
        this.d = ydVar;
        addView(ydVar, qoe.e(-1, -2, 80));
        this.b = new sb((byte) 8, context, this);
    }

    public final void a(boolean z) {
        e();
        int round = Math.round(this.x) + gm.L(9.0f) + this.I;
        if (this.w == round && !z) {
            return;
        }
        this.w = round;
        int L = gm.L(29.0f);
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
        qm0 qm0Var = this.L;
        if (qm0Var != null && (i = qm0Var.getBounds().top) != (measuredHeight = getMeasuredHeight() - Math.round(this.M))) {
            this.L.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            this.b.invalidate(0, Math.max(0, Math.min(i, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
            invalidate(0, Math.max(0, Math.min(i, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void c() {
        int i;
        wzc wzcVar = ((g0d) this.a).r;
        if (wzcVar != null) {
            i = wzcVar.a.f(2).d;
        } else {
            i = 0;
        }
        float c = ((g0d) this.a).c();
        yd ydVar = this.d;
        int childCount = ydVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = ydVar.getChildAt(i2);
            if (childAt instanceof cp5) {
                cp5 cp5Var = (cp5) childAt;
                cp5Var.a(i);
                cp5Var.b(c);
            }
        }
    }

    public final void d() {
        boolean z;
        int i;
        WindowInsets rootWindowInsets;
        int i2;
        this.x = ((g0d) this.a).d();
        this.y = ((g0d) this.a).c();
        int i3 = 0;
        boolean z2 = true;
        if (((g0d) this.a).s != 1) {
            z = true;
        } else {
            z = false;
        }
        this.E = z;
        yd ydVar = this.d;
        if (ydVar.getVisibility() != 0) {
            z2 = false;
        }
        boolean z3 = this.E;
        if (z2 != z3) {
            if (z3) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            ydVar.setVisibility(i2);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ydVar.getLayoutParams();
        int i4 = layoutParams.height;
        int i5 = ((g0d) this.a).x;
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
            this.r.t(gm.L(29.0f), gm.L(29.0f), i3, i, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va2.dispatchDraw(android.graphics.Canvas):void");
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
        this.c.setTranslationY((-this.x) - gm.L(9.0f));
        yd ydVar = this.d;
        ydVar.setTranslationY(ydVar.getMeasuredHeight() - this.y);
    }

    public View getFadeView() {
        return this.b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.x) - gm.L(9.0f);
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
        im0 im0Var;
        boolean z;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            im0 im0Var2 = this.n;
            if ((im0Var2 != null && im0Var2.c == 255 && im0Var2.getBounds().contains(x, y)) || ((im0Var = this.r) != null && im0Var.getBounds().contains(x, y))) {
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

    public void setBackgroundWithFadeDrawable(qm0 qm0Var) {
        this.L = qm0Var;
    }

    public void setBlurredBottomHeight(float f) {
        if (this.M != f) {
            this.M = f;
            b();
        }
    }

    public void setInputBubbleAlpha(int i) {
        this.O = i;
        im0 im0Var = this.n;
        if (im0Var != null) {
            im0Var.setAlpha((int) (i * this.P));
        }
    }

    public void setInputBubbleExtraAlpha(float f) {
        if (this.P != f) {
            this.P = f;
            im0 im0Var = this.n;
            if (im0Var != null) {
                im0Var.setAlpha((int) (this.O * f));
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

    public void setInputIslandBubbleDrawable(im0 im0Var) {
        this.n = im0Var;
        im0Var.q(gm.L(7.0f));
        this.n.r(gm.L(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(im0 im0Var) {
        this.r = im0Var;
        im0Var.U = true;
        im0Var.s(gm.L(29.0f), gm.L(29.0f), 0.0f, 0.0f);
        this.r.u(gm.L(32.0f));
        im0 im0Var2 = this.r;
        im0Var2.S.g = 0.4f;
        im0Var2.n();
    }

    public void setWindowInsetsProvider(d0d d0dVar) {
        this.a = d0dVar;
    }

    @Override
    public final void updateColors() {
        im0 im0Var = this.n;
        if (im0Var != null) {
            im0Var.updateColors();
        }
        im0 im0Var2 = this.r;
        if (im0Var2 != null) {
            im0Var2.updateColors();
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
