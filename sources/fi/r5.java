package fi;

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
import org.telegram.messenger.id;
import org.telegram.ui.Components.wq;
public final class r5 extends View {
    public final Paint f12737a;
    public final Paint f12738b;
    public final StaticLayout f12739c;
    public final float d;
    public final float f12740e;
    public final int f12741f;
    public final int h;
    public final boolean f12742n;
    public final org.telegram.ui.Components.v5 f12743r;
    public boolean f12744s;
    public float f12745w;
    public ValueAnimator f12746x;
    public final s5 f12747y;

    public r5(s5 s5Var, Context context, String str, boolean z9) {
        super(context);
        CharSequence upperCase;
        float f10;
        this.f12747y = s5Var;
        TextPaint textPaint = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f12737a = paint;
        Paint paint2 = new Paint(1);
        this.f12738b = paint2;
        this.f12743r = new org.telegram.ui.Components.v5(this, 0L, 220L, wq.h);
        this.f12744s = true;
        this.f12742n = z9;
        paint.setColor(-15098625);
        paint2.setColor(1610612736);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        if (z9) {
            SpannableString spannableString = new SpannableString(">");
            Drawable mutate = getResources().getDrawable(2131230875).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            mutate.setBounds(0, 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            spannableString.setSpan(new ImageSpan(mutate, 2), 0, spannableString.length(), 33);
            if (id.f23161a0) {
                upperCase = new SpannableStringBuilder(spannableString).append((CharSequence) "\u2009").append((CharSequence) str.toUpperCase());
            } else {
                upperCase = new SpannableStringBuilder(str.toUpperCase()).append((CharSequence) "\u2009").append((CharSequence) spannableString);
            }
        } else {
            upperCase = str.toUpperCase();
        }
        StaticLayout staticLayout = new StaticLayout(upperCase, textPaint, org.telegram.messenger.g0.L(180.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f12739c = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.d = f10;
        float lineWidth = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.f12740e = lineWidth;
        int L = org.telegram.messenger.g0.L(48.0f) + ((int) lineWidth);
        this.f12741f = L;
        if (!z9) {
            this.f12741f = Math.max(org.telegram.messenger.g0.L(80.0f), L);
        }
        this.h = org.telegram.messenger.g0.L(40.0f);
        setOnClickListener(new ah.d(this, 24));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = 0.0f;
        if (isPressed()) {
            float f12 = this.f12745w;
            if (f12 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f22568r) / 80.0f) + f12;
                this.f12745w = min;
                this.f12745w = Utilities.i(min, 1.0f, 0.0f);
                invalidate();
            }
        }
        if (this.f12744s) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        float e10 = this.f12743r.e(false, f10);
        int saveCount = canvas.getSaveCount();
        if (e10 < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e10 * 255.0f), 31);
        }
        float f13 = ((1.0f - this.f12745w) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(f13, f13, getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.drawRect(org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(4.0f), getWidth() - org.telegram.messenger.g0.L(25.0f), getHeight() - org.telegram.messenger.g0.L(4.0f), this.f12738b);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), getWidth() - org.telegram.messenger.g0.L(10.0f), getHeight() - org.telegram.messenger.g0.L(4.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), this.f12737a);
        canvas.save();
        float f14 = (this.f12741f - this.f12740e) / 2.0f;
        if (this.f12742n) {
            f11 = 3.0f;
        }
        float L = (f14 + org.telegram.messenger.g0.L(f11)) - this.d;
        int height = getHeight();
        StaticLayout staticLayout = this.f12739c;
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f12741f, 1073741824), View.MeasureSpec.makeMeasureSpec(this.h, 1073741824));
    }

    @Override
    public final void setPressed(boolean z9) {
        ValueAnimator valueAnimator;
        if (isPressed() != z9) {
            super.setPressed(z9);
            invalidate();
            if (z9 && (valueAnimator = this.f12746x) != null) {
                valueAnimator.removeAllListeners();
                this.f12746x.cancel();
            }
            if (!z9) {
                float f10 = this.f12745w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f12746x = ofFloat;
                    ofFloat.addUpdateListener(new v3(this, 2));
                    this.f12746x.addListener(new bi.t5(this, 22));
                    org.telegram.messenger.camera.q.i(1.5f, this.f12746x);
                    this.f12746x.setDuration(350L);
                    this.f12746x.start();
                }
            }
        }
    }
}
