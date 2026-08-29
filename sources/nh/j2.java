package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class j2 extends View {
    public final RectF A;
    public float B;
    public d1 C;
    public int D;
    public final TextPaint f17929a;
    public final Paint f17930b;
    public StaticLayout f17931c;
    public float d;
    public float f17932e;
    public StaticLayout f17933f;
    public float h;
    public float f17934n;
    public StaticLayout f17935r;
    public float f17936s;
    public float v;
    public final RectF f17937w;
    public final RectF f17938x;
    public final RectF f17939y;

    public j2(Context context) {
        super(context);
        this.f17929a = new TextPaint(1);
        this.f17930b = new Paint(1);
        this.f17937w = new RectF();
        this.f17938x = new RectF();
        this.f17939y = new RectF();
        this.A = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        canvas.drawColor(-14737633);
        Paint paint = this.f17930b;
        paint.setColor(-13224394);
        float f9 = this.B;
        int i10 = (int) f9;
        RectF rectF3 = this.f17939y;
        RectF rectF4 = this.f17938x;
        RectF rectF5 = this.f17937w;
        if (i10 <= 0) {
            rectF = rectF5;
        } else if (i10 == 1) {
            rectF = rectF4;
        } else {
            rectF = rectF3;
        }
        int ceil = (int) Math.ceil(f9);
        if (ceil <= 0) {
            rectF2 = rectF5;
        } else if (ceil == 1) {
            rectF2 = rectF4;
        } else {
            rectF2 = rectF3;
        }
        float f10 = this.B;
        RectF rectF6 = this.A;
        AndroidUtilities.lerp(rectF, rectF2, f10 - ((int) f10), rectF6);
        canvas.drawRoundRect(rectF6, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        StaticLayout staticLayout = this.f17931c;
        TextPaint textPaint = this.f17929a;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate((rectF5.left + AndroidUtilities.dp(12.0f)) - this.f17932e, com.google.android.recaptcha.internal.a.A(rectF5.height(), this.f17931c.getHeight(), 2.0f, rectF5.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.B - 0.0f), 1.0f, 0.0f), -8158333, -1));
            this.f17931c.draw(canvas);
            canvas.restore();
        }
        if (this.f17933f != null) {
            canvas.save();
            canvas.translate((rectF4.left + AndroidUtilities.dp(12.0f)) - this.f17934n, com.google.android.recaptcha.internal.a.A(rectF4.height(), this.f17933f.getHeight(), 2.0f, rectF4.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.B - 1.0f), 1.0f, 0.0f), -8158333, -1));
            this.f17933f.draw(canvas);
            canvas.restore();
        }
        if (this.f17935r != null) {
            canvas.save();
            canvas.translate((rectF3.left + AndroidUtilities.dp(12.0f)) - this.v, com.google.android.recaptcha.internal.a.A(rectF3.height(), this.f17935r.getHeight(), 2.0f, rectF3.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.B - 2.0f), 1.0f, 0.0f), -8158333, -1));
            this.f17935r.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(40.0f) + AndroidUtilities.navigationBarHeight);
        if (getMeasuredWidth() != this.D || this.f17931c == null) {
            TextPaint textPaint = this.f17929a;
            textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            String string = LocaleController.getString("Emoji");
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(string, textPaint, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.f17931c = staticLayout;
            float f14 = 0.0f;
            if (staticLayout.getLineCount() >= 1) {
                f9 = this.f17931c.getLineWidth(0);
            } else {
                f9 = 0.0f;
            }
            this.d = f9;
            if (this.f17931c.getLineCount() >= 1) {
                f10 = this.f17931c.getLineLeft(0);
            } else {
                f10 = 0.0f;
            }
            this.f17932e = f10;
            StaticLayout staticLayout2 = new StaticLayout(LocaleController.getString("AccDescrStickers"), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f17933f = staticLayout2;
            if (staticLayout2.getLineCount() >= 1) {
                f11 = this.f17933f.getLineWidth(0);
            } else {
                f11 = 0.0f;
            }
            this.h = f11;
            if (this.f17933f.getLineCount() >= 1) {
                f12 = this.f17933f.getLineLeft(0);
            } else {
                f12 = 0.0f;
            }
            this.f17934n = f12;
            StaticLayout staticLayout3 = new StaticLayout(LocaleController.getString(R.string.AccDescrGIFs), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f17935r = staticLayout3;
            if (staticLayout3.getLineCount() >= 1) {
                f13 = this.f17935r.getLineWidth(0);
            } else {
                f13 = 0.0f;
            }
            this.f17936s = f13;
            if (this.f17935r.getLineCount() >= 1) {
                f14 = this.f17935r.getLineLeft(0);
            }
            this.v = f14;
            float dp = AndroidUtilities.dp(14.0f) / 2.0f;
            float dp2 = AndroidUtilities.dp(66.0f) / 2.0f;
            float measuredWidth2 = (getMeasuredWidth() - ((((((AndroidUtilities.dp(12.0f) + this.d) + AndroidUtilities.dp(36.0f)) + this.h) + AndroidUtilities.dp(36.0f)) + this.f17936s) + AndroidUtilities.dp(12.0f))) / 2.0f;
            this.f17937w.set(measuredWidth2, dp, this.d + measuredWidth2 + AndroidUtilities.dp(24.0f), dp2);
            float dp3 = this.d + AndroidUtilities.dp(36.0f) + measuredWidth2;
            this.f17938x.set(dp3, dp, this.h + dp3 + AndroidUtilities.dp(24.0f), dp2);
            float dp4 = this.h + AndroidUtilities.dp(36.0f) + dp3;
            this.f17939y.set(dp4, dp, this.f17936s + dp4 + AndroidUtilities.dp(24.0f), dp2);
            AndroidUtilities.dp(36.0f);
        }
        this.D = getMeasuredWidth();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() == 1 && this.C != null) {
                if (this.f17937w.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.C.run(0);
                    return true;
                }
                if (this.f17938x.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.C.run(1);
                    return true;
                }
                if (this.f17939y.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.C.run(2);
                }
            } else {
                return super.onTouchEvent(motionEvent);
            }
        }
        return true;
    }
}
