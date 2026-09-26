package hh;

import ai.f0;
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
import ci.bb;
import org.telegram.messenger.AndroidUtilities;
import r0.l1;
import w7.y5;
public final class g extends FrameLayout {
    public float E;
    public int F;
    public final Rect G;
    public final RectF H;
    public ah.d I;
    public float J;
    public float K;
    public boolean L;
    public ph.g f10507a;
    public final bb f10508b;
    public final FrameLayout f10509c;
    public final f0 d;
    public boolean e;
    public ch.d f10510f;
    public ch.d h;
    public final Path f10511n;
    public int f10512r;
    public float f10513s;
    public float v;
    public boolean f10514w;
    public float f10515x;
    public float f10516y;

    public g(Context context) {
        super(context);
        this.e = true;
        this.f10511n = new Path();
        this.G = new Rect();
        this.H = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10509c = frameLayout;
        addView(frameLayout, y5.e(-1, -2, 80));
        f0 f0Var = new f0(this, context, 5);
        this.d = f0Var;
        addView(f0Var, y5.e(-1, -2, 80));
        this.f10508b = new bb(this, context, 5);
    }

    public final void a(boolean z10) {
        e();
        int round = Math.round(this.f10513s) + AndroidUtilities.dp(9.0f) + this.F;
        if (this.f10512r == round && !z10) {
            return;
        }
        this.f10512r = round;
        int dp = AndroidUtilities.dp(29.0f);
        RectF rectF = this.H;
        rectF.set(0.0f, getMeasuredHeight() - this.v, getMeasuredWidth(), getMeasuredHeight());
        Path path = this.f10511n;
        path.rewind();
        float f7 = dp;
        path.addRoundRect(rectF, new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        path.close();
        invalidate();
    }

    public final void b() {
        int i10;
        int measuredHeight;
        ah.d dVar = this.I;
        if (dVar != null && (i10 = dVar.getBounds().top) != (measuredHeight = getMeasuredHeight() - Math.round(this.J))) {
            this.I.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            this.f10508b.invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
            invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void c() {
        int i10;
        l1 l1Var = ((ph.i) this.f10507a).f41343r;
        if (l1Var != null) {
            i10 = l1Var.f42139a.f(2).d;
        } else {
            i10 = 0;
        }
        float b10 = ((ph.i) this.f10507a).b();
        f0 f0Var = this.d;
        int childCount = f0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = f0Var.getChildAt(i11);
            if (childAt instanceof ph.a) {
                ph.a aVar = (ph.a) childAt;
                aVar.b(i10);
                aVar.d(b10);
            }
        }
    }

    public final void d() {
        boolean z10;
        int i10;
        WindowInsets rootWindowInsets;
        int i11;
        this.f10513s = ((ph.i) this.f10507a).c();
        this.v = ((ph.i) this.f10507a).b();
        int i12 = 0;
        boolean z11 = true;
        if (((ph.i) this.f10507a).f41344s != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10514w = z10;
        f0 f0Var = this.d;
        if (f0Var.getVisibility() != 0) {
            z11 = false;
        }
        boolean z12 = this.f10514w;
        if (z11 != z12) {
            if (z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            f0Var.setVisibility(i11);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f0Var.getLayoutParams();
        int i13 = layoutParams.height;
        int i14 = ((ph.i) this.f10507a).f41345w;
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
            this.h.s(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i12, i10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.v), getMeasuredWidth(), org.telegram.messenger.f0.y(58.0f, getMeasuredHeight() - ((int) this.v), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.f10512r;
        int round = Math.round(this.f10515x);
        int measuredWidth = getMeasuredWidth() - Math.round(this.f10516y);
        int i10 = this.F;
        Rect rect = this.G;
        rect.set(round, 0, measuredWidth, i10);
        rect.inset(0, -AndroidUtilities.dp(7.0f));
        rect.offset(0, measuredHeight + ((int) this.K));
        this.f10510f.setBounds(rect);
        if (this.e) {
            this.f10510f.draw(canvas);
        }
        if (this.f10514w) {
            this.h.draw(canvas);
        }
        super.dispatchDraw(canvas);
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
            canvas.clipPath(this.h.f4280j.f4269k);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.f10509c.setTranslationY((-this.f10513s) - AndroidUtilities.dp(9.0f));
        f0 f0Var = this.d;
        f0Var.setTranslationY(f0Var.getMeasuredHeight() - this.v);
    }

    public View getFadeView() {
        return this.f10508b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.f10513s) - AndroidUtilities.dp(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.E;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.f10509c;
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
        ch.d dVar;
        boolean z10;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            ch.d dVar2 = this.f10510f;
            if ((dVar2 != null && dVar2.f4282l == 255 && dVar2.getBounds().contains(x10, y3)) || ((dVar = this.h) != null && dVar.getBounds().contains(x10, y3))) {
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

    public void setBackgroundWithFadeDrawable(ah.d dVar) {
        this.I = dVar;
    }

    public void setBlurredBottomHeight(float f7) {
        if (this.J != f7) {
            this.J = f7;
            b();
        }
    }

    public void setInputBubbleAlpha(int i10) {
        ch.d dVar = this.f10510f;
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

    public void setInputIslandBubbleDrawable(ch.d dVar) {
        this.f10510f = dVar;
        dVar.p(AndroidUtilities.dp(7.0f));
        this.f10510f.q(AndroidUtilities.dp(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(ch.d dVar) {
        this.h = dVar;
        dVar.f4283m = true;
        dVar.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.h.u(AndroidUtilities.dp(32.0f));
        ch.d dVar2 = this.h;
        dVar2.f4280j.f4266g = 0.4f;
        dVar2.k();
    }

    public void setWindowInsetsProvider(ph.g gVar) {
        this.f10507a = gVar;
    }
}
