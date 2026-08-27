package lh;

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
import org.telegram.ui.Components.er;

public final class h6 extends View {

    public final Paint f16065a;

    public final Paint f16066b;

    public final StaticLayout f16067c;
    public final float d;

    public final float f16068e;

    public final int f16069f;
    public final int h;

    public final boolean f16070n;

    public final org.telegram.ui.Components.y5 f16071r;

    public boolean f16072s;
    public float v;

    public ValueAnimator f16073w;

    public final i6 f16074x;

    public h6(i6 i6Var, Context context, String str, boolean z10) {
        CharSequence upperCase;
        super(context);
        this.f16074x = i6Var;
        TextPaint textPaint = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f16065a = paint;
        Paint paint2 = new Paint(1);
        this.f16066b = paint2;
        this.f16071r = new org.telegram.ui.Components.y5(this, 0L, 220L, er.h);
        this.f16072s = true;
        this.f16070n = z10;
        paint.setColor(-15098625);
        paint2.setColor(1610612736);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        if (z10) {
            SpannableString spannableString = new SpannableString(">");
            Drawable drawableMutate = getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            drawableMutate.setBounds(0, 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            spannableString.setSpan(new ImageSpan(drawableMutate, 2), 0, spannableString.length(), 33);
            upperCase = LocaleController.isRTL ? new SpannableStringBuilder(spannableString).append((CharSequence) "\u2009").append((CharSequence) str.toUpperCase()) : new SpannableStringBuilder(str.toUpperCase()).append((CharSequence) "\u2009").append((CharSequence) spannableString);
        } else {
            upperCase = str.toUpperCase();
        }
        StaticLayout staticLayout = new StaticLayout(upperCase, textPaint, AndroidUtilities.dp(180.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f16067c = staticLayout;
        this.d = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        float lineWidth = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.f16068e = lineWidth;
        int iDp = AndroidUtilities.dp(48.0f) + ((int) lineWidth);
        this.f16069f = iDp;
        if (!z10) {
            this.f16069f = Math.max(AndroidUtilities.dp(80.0f), iDp);
        }
        this.h = AndroidUtilities.dp(40.0f);
        setOnClickListener(new c5(this, 1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.v;
            if (f10 != 1.0f) {
                float fMin = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 80.0f) + f10;
                this.v = fMin;
                this.v = Utilities.clamp(fMin, 1.0f, 0.0f);
                invalidate();
            }
        }
        float fD = this.f16071r.d(this.f16072s ? 1.0f : 0.5f, false);
        int saveCount = canvas.getSaveCount();
        if (fD < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (fD * 255.0f), 31);
        }
        float f11 = ((1.0f - this.v) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(f11, f11, getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.drawRect(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(4.0f), getWidth() - AndroidUtilities.dp(25.0f), getHeight() - AndroidUtilities.dp(4.0f), this.f16066b);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), getWidth() - AndroidUtilities.dp(10.0f), getHeight() - AndroidUtilities.dp(4.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), this.f16065a);
        canvas.save();
        float fDp = (((this.f16069f - this.f16068e) / 2.0f) + AndroidUtilities.dp(this.f16070n ? 3.0f : 0.0f)) - this.d;
        int height = getHeight();
        StaticLayout staticLayout = this.f16067c;
        canvas.translate(fDp, (height - staticLayout.getHeight()) / 2.0f);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f16069f, 1073741824), View.MeasureSpec.makeMeasureSpec(this.h, 1073741824));
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.f16073w) != null) {
                valueAnimator.removeAllListeners();
                this.f16073w.cancel();
            }
            if (z10) {
                return;
            }
            float f10 = this.v;
            if (f10 != 0.0f) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.f16073w = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new m2(this, 5));
                this.f16073w.addListener(new ag.r1(this, 27));
                this.f16073w.setInterpolator(new OvershootInterpolator(1.5f));
                this.f16073w.setDuration(350L);
                this.f16073w.start();
            }
        }
    }
}
