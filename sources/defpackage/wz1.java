package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.FragmentContextView;
public final class wz1 extends pm {
    public jl0 s;
    public final Path w;
    public final RectF x;
    public FragmentContextView y;

    public wz1(Context context) {
        super(context);
        this.w = new Path();
        this.x = new RectF();
        setOrientation(1);
        jl0 jl0Var = this.s;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        aob.w0(null, aob.d6, false);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        FragmentContextView fragmentContextView;
        int currentStyle;
        FragmentContextView fragmentContextView2;
        Canvas canvas2 = canvas;
        if (getMetadata().c.a == 0.0f) {
            return;
        }
        jl0 jl0Var = this.s;
        if (jl0Var != null) {
            jl0Var.draw(canvas2);
        }
        FragmentContextView fragmentContextView3 = this.y;
        b76 b76Var = this.c;
        if (fragmentContextView3 != null && ((currentStyle = fragmentContextView3.getCurrentStyle()) == 3 || currentStyle == 1)) {
            int entriesCount = getEntriesCount();
            boolean z2 = false;
            for (int i = 0; i < entriesCount; i++) {
                y66 i2 = b76Var.i(i);
                float paddingTop = getPaddingTop() + i2.b().top;
                View view = ((om) i2.a).a;
                float c = i2.c();
                if (c > 0.0f && ((fragmentContextView2 = this.y) == view || fragmentContextView2.getParent() == view)) {
                    cb1 capsuleBlobDrawable = this.y.getCapsuleBlobDrawable();
                    int L = hl.L(1.0f) + ((int) capsuleBlobDrawable.d());
                    int i3 = -L;
                    capsuleBlobDrawable.setBounds(getPaddingLeft() - L, i3, (getMeasuredWidth() - getPaddingRight()) + L, hl.L(36.0f) + (L << 1) + i3);
                    capsuleBlobDrawable.setAlpha((int) (c * 255.0f));
                    canvas2.save();
                    canvas2.translate(0.0f, paddingTop);
                    capsuleBlobDrawable.draw(canvas2);
                    canvas2.restore();
                    z2 = true;
                }
            }
            z = z2;
        } else {
            z = false;
        }
        canvas2.save();
        canvas2.clipPath(this.w);
        int entriesCount2 = getEntriesCount();
        int i4 = 0;
        while (i4 < entriesCount2) {
            y66 i5 = b76Var.i(i4);
            float paddingTop2 = getPaddingTop() + i5.b().top;
            View view2 = ((om) i5.a).a;
            float min = Math.min(1.0f, i5.c.a) * i5.c();
            if (min > 0.0f && (!z || (fragmentContextView = this.y) == null || (fragmentContextView != view2 && fragmentContextView.getParent() != view2))) {
                int alpha = aob.j0.getAlpha();
                aob.j0.setAlpha((int) (alpha * min));
                float f = 1.0f - min;
                canvas2.drawLine(getPaddingLeft() + (hl.L(16.0f) * f), paddingTop2, getWidth() - ((hl.L(16.0f) * f) + getPaddingRight()), paddingTop2, aob.j0);
                aob.j0.setAlpha(alpha);
            }
            i4++;
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        jl0 jl0Var;
        if (!super.dispatchTouchEvent(motionEvent)) {
            if (motionEvent.getAction() != 0 || (jl0Var = this.s) == null || !jl0Var.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void f() {
        k();
        invalidate();
    }

    public final void k() {
        float f = getMetadata().g.a;
        float f2 = getMetadata().c.a;
        RectF rectF = this.x;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f);
        float min = Math.min(hl.L(18.0f), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.w;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        jl0 jl0Var = this.s;
        if (jl0Var != null) {
            jl0Var.setAlpha((int) (f2 * 255.0f));
            this.s.setBounds(getPaddingLeft() - hl.L(7.0f), 0, hl.L(7.0f) + (getMeasuredWidth() - getPaddingRight()), getPaddingBottom() + getPaddingTop() + ((int) f));
            this.s.r(Math.min(hl.L(18.0f), f / 2.0f));
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k();
    }

    public void setBlurredBackground(jl0 jl0Var) {
        this.s = jl0Var;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.y = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    @Override
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        k();
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            FragmentContextView fragmentContextView = this.y;
            if (fragmentContextView == null || fragmentContextView.getCapsuleBlobDrawable() != drawable) {
                return false;
            }
            return true;
        }
        return true;
    }
}
