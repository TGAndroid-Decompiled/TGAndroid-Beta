package kh;

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
public final class m2 extends View {
    public final RectF A;
    public float B;
    public e1 C;
    public int D;
    public final TextPaint f15664a;
    public final Paint f15665b;
    public StaticLayout f15666c;
    public float d;
    public float f15667e;
    public StaticLayout f15668f;
    public float h;
    public float f15669n;
    public StaticLayout f15670r;
    public float f15671s;
    public float v;
    public final RectF f15672w;
    public final RectF f15673x;
    public final RectF f15674y;

    public m2(Context context) {
        super(context);
        this.f15664a = new TextPaint(1);
        this.f15665b = new Paint(1);
        this.f15672w = new RectF();
        this.f15673x = new RectF();
        this.f15674y = new RectF();
        this.A = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        canvas.drawColor(-14737633);
        Paint paint = this.f15665b;
        paint.setColor(-13224394);
        float f10 = this.B;
        int i9 = (int) f10;
        RectF rectF3 = this.f15674y;
        RectF rectF4 = this.f15673x;
        RectF rectF5 = this.f15672w;
        if (i9 <= 0) {
            rectF = rectF5;
        } else if (i9 == 1) {
            rectF = rectF4;
        } else {
            rectF = rectF3;
        }
        int ceil = (int) Math.ceil(f10);
        if (ceil <= 0) {
            rectF2 = rectF5;
        } else if (ceil == 1) {
            rectF2 = rectF4;
        } else {
            rectF2 = rectF3;
        }
        float f11 = this.B;
        RectF rectF6 = this.A;
        AndroidUtilities.lerp(rectF, rectF2, f11 - ((int) f11), rectF6);
        canvas.drawRoundRect(rectF6, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        StaticLayout staticLayout = this.f15666c;
        TextPaint textPaint = this.f15664a;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate((rectF5.left + AndroidUtilities.dp(12.0f)) - this.f15667e, e2.c.A(rectF5.height(), this.f15666c.getHeight(), 2.0f, rectF5.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.B - 0.0f), 1.0f, 0.0f), -8158333, -1));
            this.f15666c.draw(canvas);
            canvas.restore();
        }
        if (this.f15668f != null) {
            canvas.save();
            canvas.translate((rectF4.left + AndroidUtilities.dp(12.0f)) - this.f15669n, e2.c.A(rectF4.height(), this.f15668f.getHeight(), 2.0f, rectF4.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.B - 1.0f), 1.0f, 0.0f), -8158333, -1));
            this.f15668f.draw(canvas);
            canvas.restore();
        }
        if (this.f15670r != null) {
            canvas.save();
            canvas.translate((rectF3.left + AndroidUtilities.dp(12.0f)) - this.v, e2.c.A(rectF3.height(), this.f15670r.getHeight(), 2.0f, rectF3.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.B - 2.0f), 1.0f, 0.0f), -8158333, -1));
            this.f15670r.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(40.0f) + AndroidUtilities.navigationBarHeight);
        if (getMeasuredWidth() != this.D || this.f15666c == null) {
            TextPaint textPaint = this.f15664a;
            textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            String string = LocaleController.getString("Emoji");
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(string, textPaint, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.f15666c = staticLayout;
            float f15 = 0.0f;
            if (staticLayout.getLineCount() >= 1) {
                f10 = this.f15666c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f15666c.getLineCount() >= 1) {
                f11 = this.f15666c.getLineLeft(0);
            } else {
                f11 = 0.0f;
            }
            this.f15667e = f11;
            StaticLayout staticLayout2 = new StaticLayout(LocaleController.getString("AccDescrStickers"), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f15668f = staticLayout2;
            if (staticLayout2.getLineCount() >= 1) {
                f12 = this.f15668f.getLineWidth(0);
            } else {
                f12 = 0.0f;
            }
            this.h = f12;
            if (this.f15668f.getLineCount() >= 1) {
                f13 = this.f15668f.getLineLeft(0);
            } else {
                f13 = 0.0f;
            }
            this.f15669n = f13;
            StaticLayout staticLayout3 = new StaticLayout(LocaleController.getString(R.string.AccDescrGIFs), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f15670r = staticLayout3;
            if (staticLayout3.getLineCount() >= 1) {
                f14 = this.f15670r.getLineWidth(0);
            } else {
                f14 = 0.0f;
            }
            this.f15671s = f14;
            if (this.f15670r.getLineCount() >= 1) {
                f15 = this.f15670r.getLineLeft(0);
            }
            this.v = f15;
            float dp = AndroidUtilities.dp(14.0f) / 2.0f;
            float dp2 = AndroidUtilities.dp(66.0f) / 2.0f;
            float measuredWidth2 = (getMeasuredWidth() - ((((((AndroidUtilities.dp(12.0f) + this.d) + AndroidUtilities.dp(36.0f)) + this.h) + AndroidUtilities.dp(36.0f)) + this.f15671s) + AndroidUtilities.dp(12.0f))) / 2.0f;
            this.f15672w.set(measuredWidth2, dp, this.d + measuredWidth2 + AndroidUtilities.dp(24.0f), dp2);
            float dp3 = this.d + AndroidUtilities.dp(36.0f) + measuredWidth2;
            this.f15673x.set(dp3, dp, this.h + dp3 + AndroidUtilities.dp(24.0f), dp2);
            float dp4 = this.h + AndroidUtilities.dp(36.0f) + dp3;
            this.f15674y.set(dp4, dp, this.f15671s + dp4 + AndroidUtilities.dp(24.0f), dp2);
            AndroidUtilities.dp(36.0f);
        }
        this.D = getMeasuredWidth();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() == 1 && this.C != null) {
                if (this.f15672w.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.C.run(0);
                    return true;
                }
                if (this.f15673x.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.C.run(1);
                    return true;
                }
                if (this.f15674y.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.C.run(2);
                }
            } else {
                return super.onTouchEvent(motionEvent);
            }
        }
        return true;
    }
}
