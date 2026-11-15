package jh;

import ai.a0;
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
import bi.g2;
import bi.o2;
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.z5;
import r0.k1;
public final class f extends FrameLayout implements z5 {
    public float E;
    public float F;
    public float G;
    public int H;
    public final Rect I;
    public final RectF J;
    public dh.d K;
    public float L;
    public float M;
    public int N;
    public float O;
    public boolean P;
    public rh.f f17390a;
    public final o2 f17391b;
    public final FrameLayout f17392c;
    public final g2 d;
    public boolean f17393e;
    public a0 f17394f;
    public fh.g h;
    public fh.g f17395n;
    public final Path f17396r;
    public int f17397s;
    public float f17398w;
    public float f17399x;
    public boolean f17400y;

    public f(Context context) {
        super(context);
        this.f17393e = true;
        this.f17396r = new Path();
        this.I = new Rect();
        this.J = new RectF();
        this.N = 255;
        this.O = 1.0f;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17392c = frameLayout;
        addView(frameLayout, ja.e(-1, -2, 80));
        g2 g2Var = new g2(8, context, this);
        this.d = g2Var;
        addView(g2Var, ja.e(-1, -2, 80));
        this.f17391b = new o2(6, context, this);
    }

    public final void a(boolean z10) {
        e();
        int round = Math.round(this.f17398w) + g0.L(9.0f) + this.H;
        if (this.f17397s == round && !z10) {
            return;
        }
        this.f17397s = round;
        int L = g0.L(29.0f);
        RectF rectF = this.J;
        rectF.set(0.0f, getMeasuredHeight() - this.f17399x, getMeasuredWidth(), getMeasuredHeight());
        Path path = this.f17396r;
        path.rewind();
        float f10 = L;
        path.addRoundRect(rectF, new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        path.close();
        invalidate();
    }

    public final void b() {
        int i7;
        int measuredHeight;
        dh.d dVar = this.K;
        if (dVar != null && (i7 = dVar.getBounds().top) != (measuredHeight = getMeasuredHeight() - Math.round(this.L))) {
            this.K.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            this.f17391b.invalidate(0, Math.max(0, Math.min(i7, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
            invalidate(0, Math.max(0, Math.min(i7, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void c() {
        int i7;
        k1 k1Var = ((rh.h) this.f17390a).f56035r;
        if (k1Var != null) {
            i7 = k1Var.f55682a.f(2).d;
        } else {
            i7 = 0;
        }
        float c10 = ((rh.h) this.f17390a).c();
        g2 g2Var = this.d;
        int childCount = g2Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = g2Var.getChildAt(i10);
            if (childAt instanceof rh.a) {
                rh.a aVar = (rh.a) childAt;
                aVar.b(i7);
                aVar.c(c10);
            }
        }
    }

    public final void d() {
        boolean z10;
        int i7;
        WindowInsets rootWindowInsets;
        int i10;
        this.f17398w = ((rh.h) this.f17390a).d();
        this.f17399x = ((rh.h) this.f17390a).c();
        int i11 = 0;
        boolean z11 = true;
        if (((rh.h) this.f17390a).f56036s != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f17400y = z10;
        g2 g2Var = this.d;
        if (g2Var.getVisibility() != 0) {
            z11 = false;
        }
        boolean z12 = this.f17400y;
        if (z11 != z12) {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            g2Var.setVisibility(i10);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g2Var.getLayoutParams();
        int i12 = layoutParams.height;
        int i13 = ((rh.h) this.f17390a).f56038x;
        if (i12 != i13) {
            layoutParams.height = i13;
            requestLayout();
        }
        a(false);
        c();
        if (this.f17395n != null) {
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
            this.f17395n.t(g0.L(29.0f), g0.L(29.0f), i11, i7, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: jh.f.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        if (view == this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.save();
            canvas.clipPath(this.f17395n.R.f11327k);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.f17392c.setTranslationY((-this.f17398w) - g0.L(9.0f));
        g2 g2Var = this.d;
        g2Var.setTranslationY(g2Var.getMeasuredHeight() - this.f17399x);
    }

    public View getFadeView() {
        return this.f17391b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.f17398w) - g0.L(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.G;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.f17392c;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
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
        boolean z10;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            fh.g gVar2 = this.h;
            if ((gVar2 != null && gVar2.f56097c == 255 && gVar2.getBounds().contains(x10, y10)) || ((gVar = this.f17395n) != null && gVar.getBounds().contains(x10, y10))) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.P = z10;
        }
        if (action == 1 || action == 3) {
            this.P = false;
        }
        return this.P;
    }

    public void setBackgroundWithFadeDrawable(dh.d dVar) {
        this.K = dVar;
    }

    public void setBlurredBottomHeight(float f10) {
        if (this.L != f10) {
            this.L = f10;
            b();
        }
    }

    public void setInputBubbleAlpha(int i7) {
        this.N = i7;
        fh.g gVar = this.h;
        if (gVar != null) {
            gVar.setAlpha((int) (i7 * this.O));
        }
    }

    public void setInputBubbleExtraAlpha(float f10) {
        if (this.O != f10) {
            this.O = f10;
            fh.g gVar = this.h;
            if (gVar != null) {
                gVar.setAlpha((int) (this.N * f10));
            }
            invalidate();
        }
    }

    public void setInputBubbleHeight(float f10) {
        this.G = f10;
        this.H = Math.round(f10);
        a(false);
    }

    public void setInputBubbleTranslationY(float f10) {
        this.M = f10;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(fh.g gVar) {
        this.h = gVar;
        gVar.q(g0.L(7.0f));
        this.h.r(g0.L(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(fh.g gVar) {
        this.f17395n = gVar;
        gVar.T = true;
        gVar.s(g0.L(29.0f), g0.L(29.0f), 0.0f, 0.0f);
        this.f17395n.u(g0.L(32.0f));
        fh.g gVar2 = this.f17395n;
        gVar2.R.f11324g = 0.4f;
        gVar2.n();
    }

    public void setWindowInsetsProvider(rh.f fVar) {
        this.f17390a = fVar;
    }

    @Override
    public final void updateColors() {
        fh.g gVar = this.h;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.f17395n;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
