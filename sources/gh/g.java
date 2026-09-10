package gh;

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
import bi.ld;
import bi.nc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.a2;
import r0.l1;
import w7.a6;
public final class g extends FrameLayout {
    public float E;
    public int F;
    public final Rect G;
    public final RectF H;
    public zg.b I;
    public float J;
    public float K;
    public boolean L;
    public oh.g f9133a;
    public final nc f9134b;
    public final FrameLayout f9135c;
    public final ld d;
    public boolean e;
    public bh.d f9136f;
    public bh.d h;
    public final Path f9137n;
    public int f9138r;
    public float f9139s;
    public float v;
    public boolean f9140w;
    public float f9141x;
    public float f9142y;

    public g(Context context) {
        super(context);
        this.e = true;
        this.f9137n = new Path();
        this.G = new Rect();
        this.H = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9135c = frameLayout;
        addView(frameLayout, a6.e(-1, -2, 80));
        ld ldVar = new ld(this, context, 3);
        this.d = ldVar;
        addView(ldVar, a6.e(-1, -2, 80));
        this.f9134b = new nc(this, context, 5);
    }

    public final void a(boolean z10) {
        e();
        int round = Math.round(this.f9139s) + AndroidUtilities.dp(9.0f) + this.F;
        if (this.f9138r == round && !z10) {
            return;
        }
        this.f9138r = round;
        int dp = AndroidUtilities.dp(29.0f);
        RectF rectF = this.H;
        rectF.set(0.0f, getMeasuredHeight() - this.v, getMeasuredWidth(), getMeasuredHeight());
        Path path = this.f9137n;
        path.rewind();
        float f7 = dp;
        path.addRoundRect(rectF, new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        path.close();
        invalidate();
    }

    public final void b() {
        int i10;
        int measuredHeight;
        zg.b bVar = this.I;
        if (bVar != null && (i10 = bVar.getBounds().top) != (measuredHeight = getMeasuredHeight() - Math.round(this.J))) {
            this.I.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            this.f9134b.invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
            invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void c() {
        int i10;
        l1 l1Var = ((oh.i) this.f9133a).f14596r;
        if (l1Var != null) {
            i10 = l1Var.f41074a.f(2).d;
        } else {
            i10 = 0;
        }
        float b10 = ((oh.i) this.f9133a).b();
        ld ldVar = this.d;
        int childCount = ldVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ldVar.getChildAt(i11);
            if (childAt instanceof oh.a) {
                oh.a aVar = (oh.a) childAt;
                aVar.b(i10);
                aVar.c(b10);
            }
        }
    }

    public final void d() {
        boolean z10;
        int i10;
        WindowInsets rootWindowInsets;
        int i11;
        this.f9139s = ((oh.i) this.f9133a).c();
        this.v = ((oh.i) this.f9133a).b();
        int i12 = 0;
        boolean z11 = true;
        if (((oh.i) this.f9133a).f14597s != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9140w = z10;
        ld ldVar = this.d;
        if (ldVar.getVisibility() != 0) {
            z11 = false;
        }
        boolean z12 = this.f9140w;
        if (z11 != z12) {
            if (z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            ldVar.setVisibility(i11);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ldVar.getLayoutParams();
        int i13 = layoutParams.height;
        int i14 = ((oh.i) this.f9133a).f14598w;
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
            this.h.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i12, i10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.v), getMeasuredWidth(), a2.b(58.0f, getMeasuredHeight() - ((int) this.v), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.f9138r;
        int round = Math.round(this.f9141x);
        int measuredWidth = getMeasuredWidth() - Math.round(this.f9142y);
        int i10 = this.F;
        Rect rect = this.G;
        rect.set(round, 0, measuredWidth, i10);
        rect.inset(0, -AndroidUtilities.dp(7.0f));
        rect.offset(0, measuredHeight + ((int) this.K));
        this.f9136f.setBounds(rect);
        if (this.e) {
            this.f9136f.draw(canvas);
        }
        if (this.f9140w) {
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
            canvas.clipPath(this.h.h.f2264k);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.f9135c.setTranslationY((-this.f9139s) - AndroidUtilities.dp(9.0f));
        ld ldVar = this.d;
        ldVar.setTranslationY(ldVar.getMeasuredHeight() - this.v);
    }

    public View getFadeView() {
        return this.f9134b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.f9139s) - AndroidUtilities.dp(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.E;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.f9135c;
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
        bh.d dVar;
        boolean z10;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            bh.d dVar2 = this.f9136f;
            if ((dVar2 != null && dVar2.f2275j == 255 && dVar2.getBounds().contains(x10, y3)) || ((dVar = this.h) != null && dVar.getBounds().contains(x10, y3))) {
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

    public void setBackgroundWithFadeDrawable(zg.b bVar) {
        this.I = bVar;
    }

    public void setBlurredBottomHeight(float f7) {
        if (this.J != f7) {
            this.J = f7;
            b();
        }
    }

    public void setInputBubbleAlpha(int i10) {
        bh.d dVar = this.f9136f;
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

    public void setInputIslandBubbleDrawable(bh.d dVar) {
        this.f9136f = dVar;
        dVar.o(AndroidUtilities.dp(7.0f));
        this.f9136f.p(AndroidUtilities.dp(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(bh.d dVar) {
        this.h = dVar;
        dVar.f2276k = true;
        dVar.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.h.t(AndroidUtilities.dp(32.0f));
        bh.d dVar2 = this.h;
        dVar2.h.f2261g = 0.4f;
        dVar2.j();
    }

    public void setWindowInsetsProvider(oh.g gVar) {
        this.f9133a = gVar;
    }
}
