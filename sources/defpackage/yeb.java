package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public final class yeb extends View {
    public static final int h = 0;
    public String a;
    public Drawable b;
    public boolean c;
    public int d;
    public final mm e;
    public final zeb f;

    public yeb(zeb zebVar, Context context) {
        super(context);
        this.f = zebVar;
        this.d = 0;
        this.e = new mm(350L, this, new OvershootInterpolator(5.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        if (isPressed()) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float e = ((1.0f - this.e.e(false, f)) * 0.2f) + 0.8f;
        if (this.b != null) {
            int height = getHeight() - getPaddingBottom();
            this.b.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.scale(e, e, getWidth() / 2, (getPaddingTop() + height) / 2);
            Drawable drawable = this.b;
            if (drawable instanceof wl) {
                ((wl) drawable).p(System.currentTimeMillis());
            }
            this.b.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.b;
        if (drawable instanceof wl) {
            ((wl) drawable).b(this);
        }
        this.c = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.b;
        if (drawable instanceof wl) {
            ((wl) drawable).o(this);
        }
        this.c = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int L = hl.L(3.0f);
        float f2 = 6.66f;
        if (this.d == 0) {
            f = 0.0f;
        } else {
            f = 6.66f;
        }
        int L2 = hl.L(f + 3.0f);
        int L3 = hl.L(3.0f);
        if (this.d != 0) {
            f2 = 0.0f;
        }
        setPadding(L, L2, L3, hl.L(f2 + 3.0f));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(52.0f), 1073741824));
    }

    public void setDirection(int i) {
        this.d = i;
        invalidate();
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 instanceof wl) {
            ((wl) drawable2).o(this);
        }
        this.b = drawable;
        if ((drawable instanceof wl) && this.c) {
            ((wl) drawable).b(this);
        }
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        invalidate();
    }
}
