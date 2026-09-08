package ih;

import ah.y;
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
import di.eb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.w1;
import r0.l1;
import w7.x5;
public final class g extends FrameLayout {
    public float E;
    public int F;
    public final Rect G;
    public final RectF H;
    public bh.c I;
    public float J;
    public float K;
    public boolean L;
    public qh.g f12355a;
    public final eb f12356b;
    public final FrameLayout f12357c;
    public final y d;
    public boolean f12358e;
    public dh.d f12359f;
    public dh.d h;
    public final Path f12360n;
    public int f12361r;
    public float f12362s;
    public float v;
    public boolean f12363w;
    public float f12364x;
    public float f12365y;

    public g(Context context) {
        super(context);
        this.f12358e = true;
        this.f12360n = new Path();
        this.G = new Rect();
        this.H = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12357c = frameLayout;
        addView(frameLayout, x5.e(-1, -2, 80));
        y yVar = new y(this, context, 6);
        this.d = yVar;
        addView(yVar, x5.e(-1, -2, 80));
        this.f12356b = new eb(this, context, 5);
    }

    public final void a(boolean z10) {
        e();
        int round = Math.round(this.f12362s) + AndroidUtilities.dp(9.0f) + this.F;
        if (this.f12361r == round && !z10) {
            return;
        }
        this.f12361r = round;
        int dp = AndroidUtilities.dp(29.0f);
        RectF rectF = this.H;
        rectF.set(0.0f, getMeasuredHeight() - this.v, getMeasuredWidth(), getMeasuredHeight());
        Path path = this.f12360n;
        path.rewind();
        float f7 = dp;
        path.addRoundRect(rectF, new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        path.close();
        invalidate();
    }

    public final void b() {
        int i10;
        int measuredHeight;
        bh.c cVar = this.I;
        if (cVar != null && (i10 = cVar.getBounds().top) != (measuredHeight = getMeasuredHeight() - Math.round(this.J))) {
            this.I.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            this.f12356b.invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
            invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void c() {
        int i10;
        l1 l1Var = ((qh.i) this.f12355a).f44683r;
        if (l1Var != null) {
            i10 = l1Var.f44739a.f(2).d;
        } else {
            i10 = 0;
        }
        float b10 = ((qh.i) this.f12355a).b();
        y yVar = this.d;
        int childCount = yVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = yVar.getChildAt(i11);
            if (childAt instanceof qh.a) {
                qh.a aVar = (qh.a) childAt;
                aVar.a(i10);
                aVar.b(b10);
            }
        }
    }

    public final void d() {
        boolean z10;
        int i10;
        WindowInsets rootWindowInsets;
        int i11;
        this.f12362s = ((qh.i) this.f12355a).c();
        this.v = ((qh.i) this.f12355a).b();
        int i12 = 0;
        boolean z11 = true;
        if (((qh.i) this.f12355a).f44684s != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12363w = z10;
        y yVar = this.d;
        if (yVar.getVisibility() != 0) {
            z11 = false;
        }
        boolean z12 = this.f12363w;
        if (z11 != z12) {
            if (z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            yVar.setVisibility(i11);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yVar.getLayoutParams();
        int i13 = layoutParams.height;
        int i14 = ((qh.i) this.f12355a).f44685w;
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
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.v), getMeasuredWidth(), w1.b(58.0f, getMeasuredHeight() - ((int) this.v), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.f12361r;
        int round = Math.round(this.f12364x);
        int measuredWidth = getMeasuredWidth() - Math.round(this.f12365y);
        int i10 = this.F;
        Rect rect = this.G;
        rect.set(round, 0, measuredWidth, i10);
        rect.inset(0, -AndroidUtilities.dp(7.0f));
        rect.offset(0, measuredHeight + ((int) this.K));
        this.f12359f.setBounds(rect);
        if (this.f12358e) {
            this.f12359f.draw(canvas);
        }
        if (this.f12363w) {
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
            canvas.clipPath(this.h.h.f6854k);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.f12357c.setTranslationY((-this.f12362s) - AndroidUtilities.dp(9.0f));
        y yVar = this.d;
        yVar.setTranslationY(yVar.getMeasuredHeight() - this.v);
    }

    public View getFadeView() {
        return this.f12356b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.f12362s) - AndroidUtilities.dp(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.E;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.f12357c;
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
        dh.d dVar;
        boolean z10;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            dh.d dVar2 = this.f12359f;
            if ((dVar2 != null && dVar2.f6866j == 255 && dVar2.getBounds().contains(x10, y3)) || ((dVar = this.h) != null && dVar.getBounds().contains(x10, y3))) {
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

    public void setBackgroundWithFadeDrawable(bh.c cVar) {
        this.I = cVar;
    }

    public void setBlurredBottomHeight(float f7) {
        if (this.J != f7) {
            this.J = f7;
            b();
        }
    }

    public void setInputBubbleAlpha(int i10) {
        dh.d dVar = this.f12359f;
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

    public void setInputIslandBubbleDrawable(dh.d dVar) {
        this.f12359f = dVar;
        dVar.o(AndroidUtilities.dp(7.0f));
        this.f12359f.p(AndroidUtilities.dp(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(dh.d dVar) {
        this.h = dVar;
        dVar.f6867k = true;
        dVar.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.h.t(AndroidUtilities.dp(32.0f));
        dh.d dVar2 = this.h;
        dVar2.h.f6851g = 0.4f;
        dVar2.j();
    }

    public void setWindowInsetsProvider(qh.g gVar) {
        this.f12355a = gVar;
    }
}
