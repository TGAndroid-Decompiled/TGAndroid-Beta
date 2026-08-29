package nh;

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
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jr;
public final class v5 extends View {
    public final Paint f18749a;
    public final Paint f18750b;
    public final StaticLayout f18751c;
    public final float d;
    public final float f18752e;
    public final int f18753f;
    public final int h;
    public final boolean f18754n;
    public final org.telegram.ui.Components.d6 f18755r;
    public boolean f18756s;
    public float v;
    public ValueAnimator f18757w;
    public final w5 f18758x;

    public v5(w5 w5Var, Context context, String str, boolean z10) {
        super(context);
        CharSequence upperCase;
        float f9;
        this.f18758x = w5Var;
        TextPaint textPaint = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f18749a = paint;
        Paint paint2 = new Paint(1);
        this.f18750b = paint2;
        this.f18755r = new org.telegram.ui.Components.d6(this, 0L, 220L, jr.h);
        this.f18756s = true;
        this.f18754n = z10;
        paint.setColor(-15098625);
        paint2.setColor(1610612736);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        if (z10) {
            SpannableString spannableString = new SpannableString(">");
            Drawable mutate = getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            mutate.setBounds(0, 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            spannableString.setSpan(new ImageSpan(mutate, 2), 0, spannableString.length(), 33);
            if (LocaleController.isRTL) {
                upperCase = new SpannableStringBuilder(spannableString).append((CharSequence) "\u2009").append((CharSequence) str.toUpperCase());
            } else {
                upperCase = new SpannableStringBuilder(str.toUpperCase()).append((CharSequence) "\u2009").append((CharSequence) spannableString);
            }
        } else {
            upperCase = str.toUpperCase();
        }
        StaticLayout staticLayout = new StaticLayout(upperCase, textPaint, AndroidUtilities.dp(180.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f18751c = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f9 = staticLayout.getLineLeft(0);
        } else {
            f9 = 0.0f;
        }
        this.d = f9;
        float lineWidth = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.f18752e = lineWidth;
        int dp = AndroidUtilities.dp(48.0f) + ((int) lineWidth);
        this.f18753f = dp;
        if (!z10) {
            this.f18753f = Math.max(AndroidUtilities.dp(80.0f), dp);
        }
        this.h = AndroidUtilities.dp(40.0f);
        setOnClickListener(new mh.n(this, 5));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        float f10 = 0.0f;
        if (isPressed()) {
            float f11 = this.v;
            if (f11 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 80.0f) + f11;
                this.v = min;
                this.v = Utilities.clamp(min, 1.0f, 0.0f);
                invalidate();
            }
        }
        if (this.f18756s) {
            f9 = 1.0f;
        } else {
            f9 = 0.5f;
        }
        float d = this.f18755r.d(f9, false);
        int saveCount = canvas.getSaveCount();
        if (d < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (d * 255.0f), 31);
        }
        float f12 = ((1.0f - this.v) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(f12, f12, getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.drawRect(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(4.0f), getWidth() - AndroidUtilities.dp(25.0f), getHeight() - AndroidUtilities.dp(4.0f), this.f18750b);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), getWidth() - AndroidUtilities.dp(10.0f), getHeight() - AndroidUtilities.dp(4.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), this.f18749a);
        canvas.save();
        float f13 = (this.f18753f - this.f18752e) / 2.0f;
        if (this.f18754n) {
            f10 = 3.0f;
        }
        float dp = (f13 + AndroidUtilities.dp(f10)) - this.d;
        int height = getHeight();
        StaticLayout staticLayout = this.f18751c;
        canvas.translate(dp, (height - staticLayout.getHeight()) / 2.0f);
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f18753f, 1073741824), View.MeasureSpec.makeMeasureSpec(this.h, 1073741824));
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.f18757w) != null) {
                valueAnimator.removeAllListeners();
                this.f18757w.cancel();
            }
            if (!z10) {
                float f9 = this.v;
                if (f9 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, 0.0f);
                    this.f18757w = ofFloat;
                    ofFloat.addUpdateListener(new lh.d5(this, 11));
                    this.f18757w.addListener(new q5(this, 1));
                    this.f18757w.setInterpolator(new OvershootInterpolator(1.5f));
                    this.f18757w.setDuration(350L);
                    this.f18757w.start();
                }
            }
        }
    }
}
