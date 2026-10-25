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
import bh.r;
import bi.cc;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.t;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.gb1;
import r0.k1;
public final class f extends FrameLayout implements p6 {
    public float E;
    public int F;
    public final Rect G;
    public final RectF H;
    public ch.c I;
    public float J;
    public float K;
    public boolean L;
    public rh.g f15943a;
    public final cc f15944b;
    public final FrameLayout f15945c;
    public final r d;
    public boolean e;
    public eh.d f15946f;
    public eh.d h;
    public final Path f15947n;
    public int f15948r;
    public float f15949s;
    public float v;
    public boolean f15950w;
    public float f15951x;
    public float f15952y;

    public f(Context context) {
        super(context);
        this.e = true;
        this.f15947n = new Path();
        this.G = new Rect();
        this.H = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15945c = frameLayout;
        addView(frameLayout, gb1.i(-1, -2, 80));
        r rVar = new r(this, context, 8);
        this.d = rVar;
        addView(rVar, gb1.i(-1, -2, 80));
        this.f15944b = new cc(this, context, 6);
    }

    public final void a(boolean z10) {
        e();
        int round = Math.round(this.f15949s) + AndroidUtilities.dp(9.0f) + this.F;
        if (this.f15948r == round && !z10) {
            return;
        }
        this.f15948r = round;
        int dp = AndroidUtilities.dp(29.0f);
        RectF rectF = this.H;
        rectF.set(0.0f, getMeasuredHeight() - this.v, getMeasuredWidth(), getMeasuredHeight());
        Path path = this.f15947n;
        path.rewind();
        float f7 = dp;
        path.addRoundRect(rectF, new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        path.close();
        invalidate();
    }

    public final void b() {
        int i10;
        int measuredHeight;
        ch.c cVar = this.I;
        if (cVar != null && (i10 = cVar.getBounds().top) != (measuredHeight = getMeasuredHeight() - Math.round(this.J))) {
            this.I.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            this.f15944b.invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
            invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void c() {
        int i10;
        k1 k1Var = ((rh.i) this.f15943a).f47621r;
        if (k1Var != null) {
            i10 = k1Var.f47115a.f(2).d;
        } else {
            i10 = 0;
        }
        float c10 = ((rh.i) this.f15943a).c();
        r rVar = this.d;
        int childCount = rVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = rVar.getChildAt(i11);
            if (childAt instanceof rh.a) {
                rh.a aVar = (rh.a) childAt;
                aVar.c(i10);
                aVar.d(c10);
            }
        }
    }

    public final void d() {
        boolean z10;
        int i10;
        WindowInsets rootWindowInsets;
        int i11;
        this.f15949s = ((rh.i) this.f15943a).d();
        this.v = ((rh.i) this.f15943a).c();
        int i12 = 0;
        boolean z11 = true;
        if (((rh.i) this.f15943a).f47622s != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15950w = z10;
        r rVar = this.d;
        if (rVar.getVisibility() != 0) {
            z11 = false;
        }
        boolean z12 = this.f15950w;
        if (z11 != z12) {
            if (z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            rVar.setVisibility(i11);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rVar.getLayoutParams();
        int i13 = layoutParams.height;
        int i14 = ((rh.i) this.f15943a).f47623w;
        if (i13 != i14) {
            layoutParams.height = i14;
            requestLayout();
        }
        a(false);
        c();
        if (this.h != null) {
            if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                if (roundedCorner == null) {
                    i10 = 0;
                } else {
                    i10 = roundedCorner.getRadius();
                }
                if (roundedCorner2 != null) {
                    i12 = roundedCorner2.getRadius();
                }
            } else {
                i10 = 0;
            }
            this.h.z(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i12, i10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.v), getMeasuredWidth(), t.z(58.0f, getMeasuredHeight() - ((int) this.v), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.f15948r;
        int round = Math.round(this.f15951x);
        int measuredWidth = getMeasuredWidth() - Math.round(this.f15952y);
        int i10 = this.F;
        Rect rect = this.G;
        rect.set(round, 0, measuredWidth, i10);
        rect.inset(0, -AndroidUtilities.dp(7.0f));
        rect.offset(0, measuredHeight + ((int) this.K));
        this.f15946f.setBounds(rect);
        if (this.e) {
            this.f15946f.draw(canvas);
        }
        if (this.f15950w) {
            this.h.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (view == this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.save();
            canvas.clipPath(this.h.f9966x.f9956k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.f15945c.setTranslationY((-this.f15949s) - AndroidUtilities.dp(9.0f));
        r rVar = this.d;
        rVar.setTranslationY(rVar.getMeasuredHeight() - this.v);
    }

    public View getFadeView() {
        return this.f15944b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.f15949s) - AndroidUtilities.dp(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.E;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.f15945c;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e();
        c();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        a(true);
        b();
        e();
        c();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        eh.d dVar;
        boolean z10;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x9 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            eh.d dVar2 = this.f15946f;
            if ((dVar2 != null && dVar2.f19461b == 255 && dVar2.getBounds().contains(x9, y3)) || ((dVar = this.h) != null && dVar.getBounds().contains(x9, y3))) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.L = z10;
        }
        if (action == 1 || action == 3) {
            this.L = false;
        }
        return this.L;
    }

    public void setBackgroundWithFadeDrawable(ch.c cVar) {
        this.I = cVar;
    }

    public void setBlurredBottomHeight(float f7) {
        if (this.J != f7) {
            this.J = f7;
            b();
        }
    }

    public void setInputBubbleAlpha(int i10) {
        eh.d dVar = this.f15946f;
        if (dVar != null) {
            dVar.setAlpha(i10);
        }
    }

    public void setInputBubbleHeight(float f7) {
        this.E = f7;
        this.F = Math.round(f7);
        a(false);
    }

    public void setInputBubbleTranslationY(float f7) {
        this.K = f7;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(eh.d dVar) {
        this.f15946f = dVar;
        dVar.w(AndroidUtilities.dp(7.0f));
        this.f15946f.x(AndroidUtilities.dp(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(eh.d dVar) {
        this.h = dVar;
        dVar.E = true;
        dVar.y(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.h.A(AndroidUtilities.dp(32.0f));
        eh.d dVar2 = this.h;
        dVar2.f9966x.f9953g = 0.4f;
        dVar2.t();
    }

    public void setWindowInsetsProvider(rh.g gVar) {
        this.f15943a = gVar;
    }

    @Override
    public final void updateColors() {
        eh.d dVar = this.f15946f;
        if (dVar != null) {
            dVar.updateColors();
        }
        eh.d dVar2 = this.h;
        if (dVar2 != null) {
            dVar2.updateColors();
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
