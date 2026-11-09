package jh;

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
import bi.e5;
import bi.ec;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.b6;
import r0.k1;
public final class f extends FrameLayout implements b6 {
    public float D;
    public float E;
    public int F;
    public final Rect G;
    public final RectF H;
    public dh.d I;
    public float J;
    public float K;
    public boolean L;
    public rh.f f17038a;
    public final ec f17039b;
    public final FrameLayout f17040c;
    public final e5 d;
    public boolean f17041e;
    public fh.g f17042f;
    public fh.g h;
    public final Path f17043n;
    public int f17044r;
    public float f17045s;
    public float f17046w;
    public boolean f17047x;
    public float f17048y;

    public f(Context context) {
        super(context);
        this.f17041e = true;
        this.f17043n = new Path();
        this.G = new Rect();
        this.H = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17040c = frameLayout;
        addView(frameLayout, ha.e(-1, -2, 80));
        e5 e5Var = new e5(8, context, this);
        this.d = e5Var;
        addView(e5Var, ha.e(-1, -2, 80));
        this.f17039b = new ec(7, context, this);
    }

    public final void a(boolean z9) {
        e();
        int round = Math.round(this.f17045s) + g0.L(9.0f) + this.F;
        if (this.f17044r == round && !z9) {
            return;
        }
        this.f17044r = round;
        int L = g0.L(29.0f);
        RectF rectF = this.H;
        rectF.set(0.0f, getMeasuredHeight() - this.f17046w, getMeasuredWidth(), getMeasuredHeight());
        Path path = this.f17043n;
        path.rewind();
        float f10 = L;
        path.addRoundRect(rectF, new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        path.close();
        invalidate();
    }

    public final void b() {
        int i7;
        int measuredHeight;
        dh.d dVar = this.I;
        if (dVar != null && (i7 = dVar.getBounds().top) != (measuredHeight = getMeasuredHeight() - Math.round(this.J))) {
            this.I.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            this.f17039b.invalidate(0, Math.max(0, Math.min(i7, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
            invalidate(0, Math.max(0, Math.min(i7, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void c() {
        int i7;
        k1 k1Var = ((rh.h) this.f17038a).f54564r;
        if (k1Var != null) {
            i7 = k1Var.f54214a.f(2).d;
        } else {
            i7 = 0;
        }
        float c10 = ((rh.h) this.f17038a).c();
        e5 e5Var = this.d;
        int childCount = e5Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = e5Var.getChildAt(i10);
            if (childAt instanceof rh.a) {
                rh.a aVar = (rh.a) childAt;
                aVar.b(i7);
                aVar.c(c10);
            }
        }
    }

    public final void d() {
        boolean z9;
        int i7;
        WindowInsets rootWindowInsets;
        int i10;
        this.f17045s = ((rh.h) this.f17038a).d();
        this.f17046w = ((rh.h) this.f17038a).c();
        int i11 = 0;
        boolean z10 = true;
        if (((rh.h) this.f17038a).f54565s != 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f17047x = z9;
        e5 e5Var = this.d;
        if (e5Var.getVisibility() != 0) {
            z10 = false;
        }
        boolean z11 = this.f17047x;
        if (z10 != z11) {
            if (z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            e5Var.setVisibility(i10);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e5Var.getLayoutParams();
        int i12 = layoutParams.height;
        int i13 = ((rh.h) this.f17038a).f54567x;
        if (i12 != i13) {
            layoutParams.height = i13;
            requestLayout();
        }
        a(false);
        c();
        if (this.h != null) {
            if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                if (roundedCorner == null) {
                    i7 = 0;
                } else {
                    i7 = roundedCorner.getRadius();
                }
                if (roundedCorner2 != null) {
                    i11 = roundedCorner2.getRadius();
                }
            } else {
                i7 = 0;
            }
            this.h.t(g0.L(29.0f), g0.L(29.0f), i11, i7, true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.f17046w), getMeasuredWidth(), k5.b(58.0f, getMeasuredHeight() - ((int) this.f17046w), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.f17044r;
        int round = Math.round(this.f17048y);
        int measuredWidth = getMeasuredWidth() - Math.round(this.D);
        int i7 = this.F;
        Rect rect = this.G;
        rect.set(round, 0, measuredWidth, i7);
        rect.inset(0, -g0.L(7.0f));
        rect.offset(0, measuredHeight + ((int) this.K));
        this.f17042f.setBounds(rect);
        if (this.f17041e) {
            this.f17042f.draw(canvas);
        }
        if (this.f17047x) {
            this.h.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9;
        if (view == this.d) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            canvas.save();
            canvas.clipPath(this.h.Q.f11513k);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z9) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.f17040c.setTranslationY((-this.f17045s) - g0.L(9.0f));
        e5 e5Var = this.d;
        e5Var.setTranslationY(e5Var.getMeasuredHeight() - this.f17046w);
    }

    public View getFadeView() {
        return this.f17039b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.f17045s) - g0.L(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.E;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.f17040c;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        e();
        c();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        a(true);
        b();
        e();
        c();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fh.g gVar;
        boolean z9;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            fh.g gVar2 = this.f17042f;
            if ((gVar2 != null && gVar2.f21076c == 255 && gVar2.getBounds().contains(x10, y10)) || ((gVar = this.h) != null && gVar.getBounds().contains(x10, y10))) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.L = z9;
        }
        if (action == 1 || action == 3) {
            this.L = false;
        }
        return this.L;
    }

    public void setBackgroundWithFadeDrawable(dh.d dVar) {
        this.I = dVar;
    }

    public void setBlurredBottomHeight(float f10) {
        if (this.J != f10) {
            this.J = f10;
            b();
        }
    }

    public void setInputBubbleAlpha(int i7) {
        fh.g gVar = this.f17042f;
        if (gVar != null) {
            gVar.setAlpha(i7);
        }
    }

    public void setInputBubbleHeight(float f10) {
        this.E = f10;
        this.F = Math.round(f10);
        a(false);
    }

    public void setInputBubbleTranslationY(float f10) {
        this.K = f10;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(fh.g gVar) {
        this.f17042f = gVar;
        gVar.q(g0.L(7.0f));
        this.f17042f.r(g0.L(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(fh.g gVar) {
        this.h = gVar;
        gVar.S = true;
        gVar.s(g0.L(29.0f), g0.L(29.0f), 0.0f, 0.0f);
        this.h.u(g0.L(32.0f));
        fh.g gVar2 = this.h;
        gVar2.Q.f11510g = 0.4f;
        gVar2.n();
    }

    public void setWindowInsetsProvider(rh.f fVar) {
        this.f17038a = fVar;
    }

    @Override
    public final void updateColors() {
        fh.g gVar = this.f17042f;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.h;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
