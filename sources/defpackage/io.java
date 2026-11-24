package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public class io extends View {
    public boolean a;
    public Drawable b;
    public final ho c;
    public int d;
    public int e;
    public CharSequence f;
    public boolean h;
    public boolean n;
    public boolean r;

    public io(Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(context);
        this.n = true;
        this.r = true;
        ho hoVar = new ho(z, z2, z3, z4, z5);
        this.c = hoVar;
        hoVar.setCallback(this);
        hoVar.J = new b1(this, (byte) 19);
    }

    public final void a() {
        this.c.a();
    }

    public final void b(float f, long j, d53 d53Var) {
        this.c.n(f, j, d53Var);
    }

    public final void c(CharSequence charSequence, boolean z, boolean z2) {
        boolean z3;
        if (!this.r && z) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.r = false;
        ho hoVar = this.c;
        if (z3 && !TextUtils.equals(charSequence, hoVar.i)) {
            if (hoVar.K) {
                ValueAnimator valueAnimator = hoVar.t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    hoVar.t = null;
                }
            } else if (hoVar.h()) {
                this.f = charSequence;
                this.h = z2;
                return;
            }
        }
        hoVar.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        hoVar.t(charSequence, z3, z2);
        float e = (int) hoVar.e();
        if (e >= hoVar.e() && (z3 || e == hoVar.e())) {
            return;
        }
        requestLayout();
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.c.c()));
    }

    public ho getDrawable() {
        return this.c;
    }

    public TextPaint getPaint() {
        return this.c.a;
    }

    public float getRightPadding() {
        return this.c.O;
    }

    public Drawable getSizeableBackground() {
        return this.b;
    }

    public CharSequence getText() {
        return this.c.i;
    }

    public int getTextColor() {
        return this.c.a.getColor();
    }

    public int getTextHeight() {
        return getPaint().getFontMetricsInt().descent - getPaint().getFontMetricsInt().ascent;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i;
        Drawable drawable = this.b;
        ho hoVar = this.c;
        if (drawable != null && (!this.a || hoVar.i() > 0.0f)) {
            int c = (int) (hoVar.c() + getPaddingLeft() + getPaddingRight());
            int i2 = hoVar.b & 7;
            if (i2 == 5) {
                i = getWidth() - c;
            } else if (i2 == 1) {
                i = (getWidth() - c) / 2;
            } else {
                i = 0;
            }
            this.b.setBounds(i, 0, c + i, getHeight());
            this.b.draw(canvas);
        }
        hoVar.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        hoVar.draw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(getText());
    }

    @Override
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.e;
        if (i3 > 0) {
            size = Math.min(size, i3);
        }
        int i4 = this.d;
        ho hoVar = this.c;
        if (i4 != size && getLayoutParams().width != 0) {
            hoVar.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            hoVar.t(hoVar.i, false, true);
        }
        this.d = size;
        if (this.n && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(hoVar.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z) {
        this.c.K = z;
    }

    public void setEllipsizeByGradient(boolean z) {
        this.c.q(z);
    }

    public void setEmojiCacheType(int i) {
        this.c.p = i;
    }

    public void setEmojiColor(int i) {
        ho hoVar = this.c;
        if (hoVar.a0 != i) {
            hoVar.a0 = i;
            hoVar.b0 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.c.b0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i) {
        this.c.b = i;
    }

    public void setHideBackgroundIfEmpty(boolean z) {
        this.a = z;
    }

    public void setIgnoreRTL(boolean z) {
        this.c.L = z;
    }

    public void setIncludeFontPadding(boolean z) {
        this.c.T = z;
    }

    public void setMaxWidth(int i) {
        this.e = i;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.c.c0 = runnable;
    }

    public void setRightPadding(float f) {
        ho hoVar = this.c;
        hoVar.O = f;
        hoVar.invalidateSelf();
    }

    public void setScaleProperty(float f) {
        this.c.B = f;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i) {
        this.c.u(i);
        invalidate();
    }

    public void setTextSize(float f) {
        this.c.w(f);
    }

    public void setTypeface(Typeface typeface) {
        this.c.x(typeface);
    }

    public io(Context context, boolean z, boolean z2, boolean z3) {
        this(context, z, z2, z3, false, false);
    }
}
