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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds;
public final class h6 extends View {
    public final Paint f10953a;
    public final Paint f10954b;
    public final StaticLayout f10955c;
    public final float d;
    public final float e;
    public final int f10956f;
    public final int h;
    public final boolean f10957n;
    public final org.telegram.ui.Components.h6 f10958r;
    public boolean f10959s;
    public float v;
    public ValueAnimator f10960w;
    public final i6 f10961x;

    public h6(i6 i6Var, Context context, String str, boolean z10) {
        super(context);
        CharSequence upperCase;
        float f7;
        this.f10961x = i6Var;
        TextPaint textPaint = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f10953a = paint;
        Paint paint2 = new Paint(1);
        this.f10954b = paint2;
        this.f10958r = new org.telegram.ui.Components.h6(this, 0L, 220L, ds.h);
        this.f10959s = true;
        this.f10957n = z10;
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
        this.f10955c = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineLeft(0);
        } else {
            f7 = 0.0f;
        }
        this.d = f7;
        float lineWidth = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.e = lineWidth;
        int dp = AndroidUtilities.dp(48.0f) + ((int) lineWidth);
        this.f10956f = dp;
        if (!z10) {
            this.f10956f = Math.max(AndroidUtilities.dp(80.0f), dp);
        }
        this.h = AndroidUtilities.dp(40.0f);
        setOnClickListener(new ai.s(this, 23));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
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
        if (this.f10959s) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        float d = this.f10958r.d(f7, false);
        int saveCount = canvas.getSaveCount();
        if (d < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (d * 255.0f), 31);
        }
        float f12 = ((1.0f - this.v) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(f12, f12, getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.drawRect(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(4.0f), getWidth() - AndroidUtilities.dp(25.0f), getHeight() - AndroidUtilities.dp(4.0f), this.f10954b);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), getWidth() - AndroidUtilities.dp(10.0f), getHeight() - AndroidUtilities.dp(4.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), this.f10953a);
        canvas.save();
        float f13 = (this.f10956f - this.e) / 2.0f;
        if (this.f10957n) {
            f10 = 3.0f;
        }
        float dp = (f13 + AndroidUtilities.dp(f10)) - this.d;
        int height = getHeight();
        StaticLayout staticLayout = this.f10955c;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f10956f, 1073741824), View.MeasureSpec.makeMeasureSpec(this.h, 1073741824));
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.f10960w) != null) {
                valueAnimator.removeAllListeners();
                this.f10960w.cancel();
            }
            if (!z10) {
                float f7 = this.v;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f10960w = ofFloat;
                    ofFloat.addUpdateListener(new e4(this, 2));
                    this.f10960w.addListener(new bh.b(this, 22));
                    org.telegram.ui.d3.m(1.5f, this.f10960w);
                    this.f10960w.setDuration(350L);
                    this.f10960w.start();
                }
            }
        }
    }
}
