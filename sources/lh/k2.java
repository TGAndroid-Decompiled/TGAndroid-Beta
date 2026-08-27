package lh;

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

public final class k2 extends View {
    public final RectF A;
    public float B;
    public d1 C;
    public int D;

    public final TextPaint f16216a;

    public final Paint f16217b;

    public StaticLayout f16218c;
    public float d;

    public float f16219e;

    public StaticLayout f16220f;
    public float h;

    public float f16221n;

    public StaticLayout f16222r;

    public float f16223s;
    public float v;

    public final RectF f16224w;

    public final RectF f16225x;

    public final RectF f16226y;

    public k2(Context context) {
        super(context);
        this.f16216a = new TextPaint(1);
        this.f16217b = new Paint(1);
        this.f16224w = new RectF();
        this.f16225x = new RectF();
        this.f16226y = new RectF();
        this.A = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        canvas.drawColor(-14737633);
        Paint paint = this.f16217b;
        paint.setColor(-13224394);
        float f10 = this.B;
        int i10 = (int) f10;
        RectF rectF3 = this.f16226y;
        RectF rectF4 = this.f16225x;
        RectF rectF5 = this.f16224w;
        if (i10 <= 0) {
            rectF = rectF5;
        } else {
            rectF = i10 == 1 ? rectF4 : rectF3;
        }
        int iCeil = (int) Math.ceil(f10);
        if (iCeil <= 0) {
            rectF2 = rectF5;
        } else {
            rectF2 = iCeil == 1 ? rectF4 : rectF3;
        }
        float f11 = this.B;
        RectF rectF6 = this.A;
        AndroidUtilities.lerp(rectF, rectF2, f11 - ((int) f11), rectF6);
        canvas.drawRoundRect(rectF6, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        StaticLayout staticLayout = this.f16218c;
        TextPaint textPaint = this.f16216a;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate((rectF5.left + AndroidUtilities.dp(12.0f)) - this.f16219e, com.google.android.recaptcha.internal.a.A(rectF5.height(), this.f16218c.getHeight(), 2.0f, rectF5.top));
            textPaint.setColor(i0.b.d(Utilities.clamp(1.0f - Math.abs(this.B - 0.0f), 1.0f, 0.0f), -8158333, -1));
            this.f16218c.draw(canvas);
            canvas.restore();
        }
        if (this.f16220f != null) {
            canvas.save();
            canvas.translate((rectF4.left + AndroidUtilities.dp(12.0f)) - this.f16221n, com.google.android.recaptcha.internal.a.A(rectF4.height(), this.f16220f.getHeight(), 2.0f, rectF4.top));
            textPaint.setColor(i0.b.d(Utilities.clamp(1.0f - Math.abs(this.B - 1.0f), 1.0f, 0.0f), -8158333, -1));
            this.f16220f.draw(canvas);
            canvas.restore();
        }
        if (this.f16222r != null) {
            canvas.save();
            canvas.translate((rectF3.left + AndroidUtilities.dp(12.0f)) - this.v, com.google.android.recaptcha.internal.a.A(rectF3.height(), this.f16222r.getHeight(), 2.0f, rectF3.top));
            textPaint.setColor(i0.b.d(Utilities.clamp(1.0f - Math.abs(this.B - 2.0f), 1.0f, 0.0f), -8158333, -1));
            this.f16222r.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(40.0f) + AndroidUtilities.navigationBarHeight);
        if (getMeasuredWidth() != this.D || this.f16218c == null) {
            float fDp = AndroidUtilities.dp(14.0f);
            TextPaint textPaint = this.f16216a;
            textPaint.setTextSize(fDp);
            textPaint.setTypeface(AndroidUtilities.bold());
            String string = LocaleController.getString("Emoji");
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(string, textPaint, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.f16218c = staticLayout;
            this.d = staticLayout.getLineCount() >= 1 ? this.f16218c.getLineWidth(0) : 0.0f;
            this.f16219e = this.f16218c.getLineCount() >= 1 ? this.f16218c.getLineLeft(0) : 0.0f;
            StaticLayout staticLayout2 = new StaticLayout(LocaleController.getString("AccDescrStickers"), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f16220f = staticLayout2;
            this.h = staticLayout2.getLineCount() >= 1 ? this.f16220f.getLineWidth(0) : 0.0f;
            this.f16221n = this.f16220f.getLineCount() >= 1 ? this.f16220f.getLineLeft(0) : 0.0f;
            StaticLayout staticLayout3 = new StaticLayout(LocaleController.getString(R.string.AccDescrGIFs), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f16222r = staticLayout3;
            this.f16223s = staticLayout3.getLineCount() >= 1 ? this.f16222r.getLineWidth(0) : 0.0f;
            this.v = this.f16222r.getLineCount() >= 1 ? this.f16222r.getLineLeft(0) : 0.0f;
            float fDp2 = AndroidUtilities.dp(12.0f) + this.d + AndroidUtilities.dp(36.0f) + this.h + AndroidUtilities.dp(36.0f) + this.f16223s + AndroidUtilities.dp(12.0f);
            float fDp3 = AndroidUtilities.dp(14.0f) / 2.0f;
            float fDp4 = AndroidUtilities.dp(66.0f) / 2.0f;
            float measuredWidth2 = (getMeasuredWidth() - fDp2) / 2.0f;
            this.f16224w.set(measuredWidth2, fDp3, this.d + measuredWidth2 + AndroidUtilities.dp(24.0f), fDp4);
            float fDp5 = this.d + AndroidUtilities.dp(36.0f) + measuredWidth2;
            this.f16225x.set(fDp5, fDp3, this.h + fDp5 + AndroidUtilities.dp(24.0f), fDp4);
            float fDp6 = this.h + AndroidUtilities.dp(36.0f) + fDp5;
            this.f16226y.set(fDp6, fDp3, this.f16223s + fDp6 + AndroidUtilities.dp(24.0f), fDp4);
            AndroidUtilities.dp(36.0f);
        }
        this.D = getMeasuredWidth();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() != 1 || this.C == null) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.f16224w.contains(motionEvent.getX(), motionEvent.getY())) {
                this.C.run(0);
                return true;
            }
            if (this.f16225x.contains(motionEvent.getX(), motionEvent.getY())) {
                this.C.run(1);
                return true;
            }
            if (this.f16226y.contains(motionEvent.getX(), motionEvent.getY())) {
                this.C.run(2);
            }
        }
        return true;
    }
}
