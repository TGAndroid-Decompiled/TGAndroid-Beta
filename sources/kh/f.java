package kh;

import ai.o2;
import ai.x2;
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
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.z5;
import r0.k1;
public final class f extends FrameLayout implements z5 {
    public float E;
    public float F;
    public int G;
    public final Rect H;
    public final RectF I;
    public eh.d J;
    public float K;
    public float L;
    public boolean M;
    public sh.f f17280a;
    public final x2 f17281b;
    public final FrameLayout f17282c;
    public final o2 d;
    public boolean f17283e;
    public gh.g f17284f;
    public gh.g h;
    public final Path f17285n;
    public int f17286r;
    public float f17287s;
    public float f17288w;
    public boolean f17289x;
    public float f17290y;

    public f(Context context) {
        super(context);
        this.f17283e = true;
        this.f17285n = new Path();
        this.H = new Rect();
        this.I = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17282c = frameLayout;
        addView(frameLayout, mf.e(-1, -2, 80));
        o2 o2Var = new o2(9, context, this);
        this.d = o2Var;
        addView(o2Var, mf.e(-1, -2, 80));
        this.f17281b = new x2(8, context, this);
    }

    public final void a(boolean z10) {
        e();
        int round = Math.round(this.f17287s) + g0.L(9.0f) + this.G;
        if (this.f17286r == round && !z10) {
            return;
        }
        this.f17286r = round;
        int L = g0.L(29.0f);
        RectF rectF = this.I;
        rectF.set(0.0f, getMeasuredHeight() - this.f17288w, getMeasuredWidth(), getMeasuredHeight());
        Path path = this.f17285n;
        path.rewind();
        float f10 = L;
        path.addRoundRect(rectF, new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        path.close();
        invalidate();
    }

    public final void b() {
        int i3;
        int measuredHeight;
        eh.d dVar = this.J;
        if (dVar != null && (i3 = dVar.getBounds().top) != (measuredHeight = getMeasuredHeight() - Math.round(this.K))) {
            this.J.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            this.f17281b.invalidate(0, Math.max(0, Math.min(i3, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
            invalidate(0, Math.max(0, Math.min(i3, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void c() {
        int i3;
        k1 k1Var = ((sh.h) this.f17280a).f54735r;
        if (k1Var != null) {
            i3 = k1Var.f54026a.f(2).d;
        } else {
            i3 = 0;
        }
        float c2 = ((sh.h) this.f17280a).c();
        o2 o2Var = this.d;
        int childCount = o2Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = o2Var.getChildAt(i10);
            if (childAt instanceof sh.a) {
                sh.a aVar = (sh.a) childAt;
                aVar.c(i3);
                aVar.d(c2);
            }
        }
    }

    public final void d() {
        boolean z10;
        int i3;
        WindowInsets rootWindowInsets;
        int i10;
        this.f17287s = ((sh.h) this.f17280a).d();
        this.f17288w = ((sh.h) this.f17280a).c();
        int i11 = 0;
        boolean z11 = true;
        if (((sh.h) this.f17280a).f54736s != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f17289x = z10;
        o2 o2Var = this.d;
        if (o2Var.getVisibility() != 0) {
            z11 = false;
        }
        boolean z12 = this.f17289x;
        if (z11 != z12) {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            o2Var.setVisibility(i10);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o2Var.getLayoutParams();
        int i12 = layoutParams.height;
        int i13 = ((sh.h) this.f17280a).f54738x;
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
                    i3 = 0;
                } else {
                    i3 = roundedCorner.getRadius();
                }
                if (roundedCorner2 != null) {
                    i11 = roundedCorner2.getRadius();
                }
            } else {
                i3 = 0;
            }
            this.h.t(g0.L(29.0f), g0.L(29.0f), i11, i3, true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.f17288w), getMeasuredWidth(), k5.b(58.0f, getMeasuredHeight() - ((int) this.f17288w), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.f17286r;
        int round = Math.round(this.f17290y);
        int measuredWidth = getMeasuredWidth() - Math.round(this.E);
        int i3 = this.G;
        Rect rect = this.H;
        rect.set(round, 0, measuredWidth, i3);
        rect.inset(0, -g0.L(7.0f));
        rect.offset(0, measuredHeight + ((int) this.L));
        this.f17284f.setBounds(rect);
        if (this.f17283e) {
            this.f17284f.draw(canvas);
        }
        if (this.f17289x) {
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
            canvas.clipPath(this.h.R.f12307k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.f17282c.setTranslationY((-this.f17287s) - g0.L(9.0f));
        o2 o2Var = this.d;
        o2Var.setTranslationY(o2Var.getMeasuredHeight() - this.f17288w);
    }

    public View getFadeView() {
        return this.f17281b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.f17287s) - g0.L(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.F;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.f17282c;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        e();
        c();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        a(true);
        b();
        e();
        c();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gh.g gVar;
        boolean z10;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            gh.g gVar2 = this.f17284f;
            if ((gVar2 != null && gVar2.f53579c == 255 && gVar2.getBounds().contains(x10, y9)) || ((gVar = this.h) != null && gVar.getBounds().contains(x10, y9))) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.M = z10;
        }
        if (action == 1 || action == 3) {
            this.M = false;
        }
        return this.M;
    }

    public void setBackgroundWithFadeDrawable(eh.d dVar) {
        this.J = dVar;
    }

    public void setBlurredBottomHeight(float f10) {
        if (this.K != f10) {
            this.K = f10;
            b();
        }
    }

    public void setInputBubbleAlpha(int i3) {
        gh.g gVar = this.f17284f;
        if (gVar != null) {
            gVar.setAlpha(i3);
        }
    }

    public void setInputBubbleHeight(float f10) {
        this.F = f10;
        this.G = Math.round(f10);
        a(false);
    }

    public void setInputBubbleTranslationY(float f10) {
        this.L = f10;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(gh.g gVar) {
        this.f17284f = gVar;
        gVar.q(g0.L(7.0f));
        this.f17284f.r(g0.L(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(gh.g gVar) {
        this.h = gVar;
        gVar.T = true;
        gVar.s(g0.L(29.0f), g0.L(29.0f), 0.0f, 0.0f);
        this.h.u(g0.L(32.0f));
        gh.g gVar2 = this.h;
        gVar2.R.f12304g = 0.4f;
        gVar2.n();
    }

    public void setWindowInsetsProvider(sh.f fVar) {
        this.f17280a = fVar;
    }

    @Override
    public final void updateColors() {
        gh.g gVar = this.f17284f;
        if (gVar != null) {
            gVar.updateColors();
        }
        gh.g gVar2 = this.h;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
