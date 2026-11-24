package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.Utilities;
public final class xk8 extends View {
    public final Paint a;
    public final Paint b;
    public final StaticLayout c;
    public final float d;
    public final float e;
    public final int f;
    public final int h;
    public final boolean n;
    public final ln r;
    public boolean s;
    public float w;
    public ValueAnimator x;
    public final yk8 y;

    public xk8(yk8 yk8Var, Context context, String str, boolean z) {
        super(context);
        CharSequence upperCase;
        float f;
        this.y = yk8Var;
        TextPaint textPaint = new TextPaint(1);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.r = new ln(this, 0L, 220L, d53.h);
        this.s = true;
        this.n = z;
        paint.setColor(-15098625);
        paint2.setColor(1610612736);
        textPaint.setTextSize(gm.L(13.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(gm.o());
        if (z) {
            SpannableString spannableString = new SpannableString(">");
            Drawable mutate = getResources().getDrawable(2131230876).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            mutate.setBounds(0, 0, gm.L(12.0f), gm.L(12.0f));
            spannableString.setSpan(new ImageSpan(mutate, 2), 0, spannableString.length(), 33);
            if (jb6.a0) {
                upperCase = new SpannableStringBuilder(spannableString).append((CharSequence) "\u2009").append((CharSequence) str.toUpperCase());
            } else {
                upperCase = new SpannableStringBuilder(str.toUpperCase()).append((CharSequence) "\u2009").append((CharSequence) spannableString);
            }
        } else {
            upperCase = str.toUpperCase();
        }
        StaticLayout staticLayout = new StaticLayout(upperCase, textPaint, gm.L(180.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.c = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f = staticLayout.getLineLeft(0);
        } else {
            f = 0.0f;
        }
        this.d = f;
        float lineWidth = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.e = lineWidth;
        int L = gm.L(48.0f) + ((int) lineWidth);
        this.f = L;
        if (!z) {
            this.f = Math.max(gm.L(80.0f), L);
        }
        this.h = gm.L(40.0f);
        setOnClickListener(new wk8(this, (byte) 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2 = 0.0f;
        if (isPressed()) {
            float f3 = this.w;
            if (f3 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / gm.r) / 80.0f) + f3;
                this.w = min;
                this.w = Utilities.i(min, 1.0f, 0.0f);
                invalidate();
            }
        }
        if (this.s) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        float e = this.r.e(false, f);
        int saveCount = canvas.getSaveCount();
        if (e < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e * 255.0f), 31);
        }
        float f4 = ((1.0f - this.w) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(f4, f4, getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.drawRect(gm.L(25.0f), gm.L(4.0f), getWidth() - gm.L(25.0f), getHeight() - gm.L(4.0f), this.b);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        RectF rectF = gm.P;
        rectF.set(gm.L(10.0f), gm.L(4.0f), getWidth() - gm.L(10.0f), getHeight() - gm.L(4.0f));
        canvas.drawRoundRect(rectF, gm.L(20.0f), gm.L(20.0f), this.a);
        canvas.save();
        float f5 = (this.f - this.e) / 2.0f;
        if (this.n) {
            f2 = 3.0f;
        }
        float L = (f5 + gm.L(f2)) - this.d;
        int height = getHeight();
        StaticLayout staticLayout = this.c;
        canvas.translate(L, (height - staticLayout.getHeight()) / 2.0f);
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restoreToCount(saveCount);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f, 1073741824), View.MeasureSpec.makeMeasureSpec(this.h, 1073741824));
    }

    @Override
    public final void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        if (isPressed() != z) {
            super.setPressed(z);
            invalidate();
            if (z && (valueAnimator = this.x) != null) {
                valueAnimator.removeAllListeners();
                this.x.cancel();
            }
            if (!z) {
                float f = this.w;
                if (f != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.x = ofFloat;
                    ofFloat.addUpdateListener(new fx7(this, (byte) 13));
                    this.x.addListener(new s38(this, (byte) 20));
                    b10.n(1.5f, this.x);
                    this.x.setDuration(350L);
                    this.x.start();
                }
            }
        }
    }
}
