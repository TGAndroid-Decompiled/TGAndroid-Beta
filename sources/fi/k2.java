package fi;

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
    public final RectF E;
    public float F;
    public d1 G;
    public int H;
    public final TextPaint f11079a;
    public final Paint f11080b;
    public StaticLayout f11081c;
    public float d;
    public float e;
    public StaticLayout f11082f;
    public float h;
    public float f11083n;
    public StaticLayout f11084r;
    public float f11085s;
    public float v;
    public final RectF f11086w;
    public final RectF f11087x;
    public final RectF f11088y;

    public k2(Context context) {
        super(context);
        this.f11079a = new TextPaint(1);
        this.f11080b = new Paint(1);
        this.f11086w = new RectF();
        this.f11087x = new RectF();
        this.f11088y = new RectF();
        this.E = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        canvas.drawColor(-14737633);
        Paint paint = this.f11080b;
        paint.setColor(-13224394);
        float f7 = this.F;
        int i10 = (int) f7;
        RectF rectF3 = this.f11088y;
        RectF rectF4 = this.f11087x;
        RectF rectF5 = this.f11086w;
        if (i10 <= 0) {
            rectF = rectF5;
        } else if (i10 == 1) {
            rectF = rectF4;
        } else {
            rectF = rectF3;
        }
        int ceil = (int) Math.ceil(f7);
        if (ceil <= 0) {
            rectF2 = rectF5;
        } else if (ceil == 1) {
            rectF2 = rectF4;
        } else {
            rectF2 = rectF3;
        }
        float f10 = this.F;
        RectF rectF6 = this.E;
        AndroidUtilities.lerp(rectF, rectF2, f10 - ((int) f10), rectF6);
        canvas.drawRoundRect(rectF6, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        StaticLayout staticLayout = this.f11081c;
        TextPaint textPaint = this.f11079a;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate((rectF5.left + AndroidUtilities.dp(12.0f)) - this.e, c3.h0.B(rectF5.height(), this.f11081c.getHeight(), 2.0f, rectF5.top));
            textPaint.setColor(i0.a.f(Utilities.clamp(1.0f - Math.abs(this.F - 0.0f), 1.0f, 0.0f), -8158333, -1));
            this.f11081c.draw(canvas);
            canvas.restore();
        }
        if (this.f11082f != null) {
            canvas.save();
            canvas.translate((rectF4.left + AndroidUtilities.dp(12.0f)) - this.f11083n, c3.h0.B(rectF4.height(), this.f11082f.getHeight(), 2.0f, rectF4.top));
            textPaint.setColor(i0.a.f(Utilities.clamp(1.0f - Math.abs(this.F - 1.0f), 1.0f, 0.0f), -8158333, -1));
            this.f11082f.draw(canvas);
            canvas.restore();
        }
        if (this.f11084r != null) {
            canvas.save();
            canvas.translate((rectF3.left + AndroidUtilities.dp(12.0f)) - this.v, c3.h0.B(rectF3.height(), this.f11084r.getHeight(), 2.0f, rectF3.top));
            textPaint.setColor(i0.a.f(Utilities.clamp(1.0f - Math.abs(this.F - 2.0f), 1.0f, 0.0f), -8158333, -1));
            this.f11084r.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(40.0f) + AndroidUtilities.navigationBarHeight);
        if (getMeasuredWidth() != this.H || this.f11081c == null) {
            TextPaint textPaint = this.f11079a;
            textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            String string = LocaleController.getString("Emoji");
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(string, textPaint, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.f11081c = staticLayout;
            float f14 = 0.0f;
            if (staticLayout.getLineCount() >= 1) {
                f7 = this.f11081c.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.d = f7;
            if (this.f11081c.getLineCount() >= 1) {
                f10 = this.f11081c.getLineLeft(0);
            } else {
                f10 = 0.0f;
            }
            this.e = f10;
            StaticLayout staticLayout2 = new StaticLayout(LocaleController.getString("AccDescrStickers"), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f11082f = staticLayout2;
            if (staticLayout2.getLineCount() >= 1) {
                f11 = this.f11082f.getLineWidth(0);
            } else {
                f11 = 0.0f;
            }
            this.h = f11;
            if (this.f11082f.getLineCount() >= 1) {
                f12 = this.f11082f.getLineLeft(0);
            } else {
                f12 = 0.0f;
            }
            this.f11083n = f12;
            StaticLayout staticLayout3 = new StaticLayout(LocaleController.getString(R.string.AccDescrGIFs), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f11084r = staticLayout3;
            if (staticLayout3.getLineCount() >= 1) {
                f13 = this.f11084r.getLineWidth(0);
            } else {
                f13 = 0.0f;
            }
            this.f11085s = f13;
            if (this.f11084r.getLineCount() >= 1) {
                f14 = this.f11084r.getLineLeft(0);
            }
            this.v = f14;
            float dp = AndroidUtilities.dp(14.0f) / 2.0f;
            float dp2 = AndroidUtilities.dp(66.0f) / 2.0f;
            float measuredWidth2 = (getMeasuredWidth() - ((((((AndroidUtilities.dp(12.0f) + this.d) + AndroidUtilities.dp(36.0f)) + this.h) + AndroidUtilities.dp(36.0f)) + this.f11085s) + AndroidUtilities.dp(12.0f))) / 2.0f;
            this.f11086w.set(measuredWidth2, dp, this.d + measuredWidth2 + AndroidUtilities.dp(24.0f), dp2);
            float dp3 = this.d + AndroidUtilities.dp(36.0f) + measuredWidth2;
            this.f11087x.set(dp3, dp, this.h + dp3 + AndroidUtilities.dp(24.0f), dp2);
            float dp4 = this.h + AndroidUtilities.dp(36.0f) + dp3;
            this.f11088y.set(dp4, dp, this.f11085s + dp4 + AndroidUtilities.dp(24.0f), dp2);
            AndroidUtilities.dp(36.0f);
        }
        this.H = getMeasuredWidth();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() == 1 && this.G != null) {
                if (this.f11086w.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.G.run(0);
                    return true;
                }
                if (this.f11087x.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.G.run(1);
                    return true;
                }
                if (this.f11088y.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.G.run(2);
                }
            } else {
                return super.onTouchEvent(motionEvent);
            }
        }
        return true;
    }
}
