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
import bi.a3;
import bi.i3;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.g2;
import r0.l1;
public final class f extends FrameLayout implements c6 {
    public boolean E;
    public float F;
    public float G;
    public float H;
    public int I;
    public final Rect J;
    public final RectF K;
    public dh.d L;
    public float M;
    public float N;
    public int O;
    public float P;
    public boolean Q;
    public rh.f f17773a;
    public final i3 f17774b;
    public final FrameLayout f17775c;
    public final a3 d;
    public boolean f17776e;
    public a0 f17777f;
    public g2 h;
    public fh.g f17778n;
    public fh.g f17779r;
    public final Path f17780s;
    public int f17781w;
    public float f17782x;
    public float f17783y;

    public f(Context context) {
        super(context);
        this.f17776e = true;
        this.f17780s = new Path();
        this.J = new Rect();
        this.K = new RectF();
        this.O = 255;
        this.P = 1.0f;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17775c = frameLayout;
        addView(frameLayout, ma.e(-1, -2, 80));
        a3 a3Var = new a3(8, context, this);
        this.d = a3Var;
        addView(a3Var, ma.e(-1, -2, 80));
        this.f17774b = new i3(6, context, this);
    }

    public final void a(boolean z10) {
        e();
        int round = Math.round(this.f17782x) + g0.L(9.0f) + this.I;
        if (this.f17781w == round && !z10) {
            return;
        }
        this.f17781w = round;
        int L = g0.L(29.0f);
        RectF rectF = this.K;
        rectF.set(0.0f, getMeasuredHeight() - this.f17783y, getMeasuredWidth(), getMeasuredHeight());
        Path path = this.f17780s;
        path.rewind();
        float f10 = L;
        path.addRoundRect(rectF, new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        path.close();
        invalidate();
    }

    public final void b() {
        int i7;
        int measuredHeight;
        dh.d dVar = this.L;
        if (dVar != null && (i7 = dVar.getBounds().top) != (measuredHeight = getMeasuredHeight() - Math.round(this.M))) {
            this.L.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            this.f17774b.invalidate(0, Math.max(0, Math.min(i7, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
            invalidate(0, Math.max(0, Math.min(i7, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void c() {
        int i7;
        l1 l1Var = ((rh.h) this.f17773a).f56609r;
        if (l1Var != null) {
            i7 = l1Var.f56258a.f(2).d;
        } else {
            i7 = 0;
        }
        float c10 = ((rh.h) this.f17773a).c();
        a3 a3Var = this.d;
        int childCount = a3Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = a3Var.getChildAt(i10);
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
        this.f17782x = ((rh.h) this.f17773a).d();
        this.f17783y = ((rh.h) this.f17773a).c();
        int i11 = 0;
        boolean z11 = true;
        if (((rh.h) this.f17773a).f56610s != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z10;
        a3 a3Var = this.d;
        if (a3Var.getVisibility() != 0) {
            z11 = false;
        }
        boolean z12 = this.E;
        if (z11 != z12) {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            a3Var.setVisibility(i10);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a3Var.getLayoutParams();
        int i12 = layoutParams.height;
        int i13 = ((rh.h) this.f17773a).f56612x;
        if (i12 != i13) {
            layoutParams.height = i13;
            requestLayout();
        }
        a(false);
        c();
        if (this.f17779r != null) {
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
            this.f17779r.t(g0.L(29.0f), g0.L(29.0f), i11, i7, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
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
            canvas.clipPath(this.f17779r.R.f11644k);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.f17775c.setTranslationY((-this.f17782x) - g0.L(9.0f));
        a3 a3Var = this.d;
        a3Var.setTranslationY(a3Var.getMeasuredHeight() - this.f17783y);
    }

    public View getFadeView() {
        return this.f17774b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.f17782x) - g0.L(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.H;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.f17775c;
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
            fh.g gVar2 = this.f17778n;
            if ((gVar2 != null && gVar2.f56671c == 255 && gVar2.getBounds().contains(x10, y10)) || ((gVar = this.f17779r) != null && gVar.getBounds().contains(x10, y10))) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.Q = z10;
        }
        if (action == 1 || action == 3) {
            this.Q = false;
        }
        return this.Q;
    }

    public void setBackgroundWithFadeDrawable(dh.d dVar) {
        this.L = dVar;
    }

    public void setBlurredBottomHeight(float f10) {
        if (this.M != f10) {
            this.M = f10;
            b();
        }
    }

    public void setInputBubbleAlpha(int i7) {
        this.O = i7;
        fh.g gVar = this.f17778n;
        if (gVar != null) {
            gVar.setAlpha((int) (i7 * this.P));
        }
    }

    public void setInputBubbleExtraAlpha(float f10) {
        if (this.P != f10) {
            this.P = f10;
            fh.g gVar = this.f17778n;
            if (gVar != null) {
                gVar.setAlpha((int) (this.O * f10));
            }
            invalidate();
        }
    }

    public void setInputBubbleHeight(float f10) {
        this.H = f10;
        this.I = Math.round(f10);
        a(false);
    }

    public void setInputBubbleTranslationY(float f10) {
        this.N = f10;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(fh.g gVar) {
        this.f17778n = gVar;
        gVar.q(g0.L(7.0f));
        this.f17778n.r(g0.L(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(fh.g gVar) {
        this.f17779r = gVar;
        gVar.T = true;
        gVar.s(g0.L(29.0f), g0.L(29.0f), 0.0f, 0.0f);
        this.f17779r.u(g0.L(32.0f));
        fh.g gVar2 = this.f17779r;
        gVar2.R.f11641g = 0.4f;
        gVar2.n();
    }

    public void setWindowInsetsProvider(rh.f fVar) {
        this.f17773a = fVar;
    }

    @Override
    public final void updateColors() {
        fh.g gVar = this.f17778n;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.f17779r;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
