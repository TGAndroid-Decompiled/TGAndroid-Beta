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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
public final class j2 extends View {
    public final RectF D;
    public final RectF E;
    public float F;
    public c1 G;
    public int H;
    public final TextPaint f12210a;
    public final Paint f12211b;
    public StaticLayout f12212c;
    public float d;
    public float f12213e;
    public StaticLayout f12214f;
    public float h;
    public float f12215n;
    public StaticLayout f12216r;
    public float f12217s;
    public float f12218w;
    public final RectF f12219x;
    public final RectF f12220y;

    public j2(Context context) {
        super(context);
        this.f12210a = new TextPaint(1);
        this.f12211b = new Paint(1);
        this.f12219x = new RectF();
        this.f12220y = new RectF();
        this.D = new RectF();
        this.E = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        canvas.drawColor(-14737633);
        Paint paint = this.f12211b;
        paint.setColor(-13224394);
        float f10 = this.F;
        int i7 = (int) f10;
        RectF rectF3 = this.D;
        RectF rectF4 = this.f12220y;
        RectF rectF5 = this.f12219x;
        if (i7 <= 0) {
            rectF = rectF5;
        } else if (i7 == 1) {
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
        float f11 = this.F;
        RectF rectF6 = this.E;
        org.telegram.messenger.g0.Z1(rectF, rectF2, f11 - ((int) f11), rectF6);
        canvas.drawRoundRect(rectF6, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint);
        StaticLayout staticLayout = this.f12212c;
        TextPaint textPaint = this.f12210a;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate((rectF5.left + org.telegram.messenger.g0.L(12.0f)) - this.f12213e, com.google.android.recaptcha.internal.a.A(rectF5.height(), this.f12212c.getHeight(), 2.0f, rectF5.top));
            textPaint.setColor(i0.a.f(Utilities.i(1.0f - Math.abs(this.F - 0.0f), 1.0f, 0.0f), -8158333, -1));
            this.f12212c.draw(canvas);
            canvas.restore();
        }
        if (this.f12214f != null) {
            canvas.save();
            canvas.translate((rectF4.left + org.telegram.messenger.g0.L(12.0f)) - this.f12215n, com.google.android.recaptcha.internal.a.A(rectF4.height(), this.f12214f.getHeight(), 2.0f, rectF4.top));
            textPaint.setColor(i0.a.f(Utilities.i(1.0f - Math.abs(this.F - 1.0f), 1.0f, 0.0f), -8158333, -1));
            this.f12214f.draw(canvas);
            canvas.restore();
        }
        if (this.f12216r != null) {
            canvas.save();
            canvas.translate((rectF3.left + org.telegram.messenger.g0.L(12.0f)) - this.f12218w, com.google.android.recaptcha.internal.a.A(rectF3.height(), this.f12216r.getHeight(), 2.0f, rectF3.top));
            textPaint.setColor(i0.a.f(Utilities.i(1.0f - Math.abs(this.F - 2.0f), 1.0f, 0.0f), -8158333, -1));
            this.f12216r.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(40.0f) + org.telegram.messenger.g0.f22558n);
        if (getMeasuredWidth() != this.H || this.f12212c == null) {
            TextPaint textPaint = this.f12210a;
            textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            String N0 = id.N0("Emoji");
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(N0, textPaint, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.f12212c = staticLayout;
            float f15 = 0.0f;
            if (staticLayout.getLineCount() >= 1) {
                f10 = this.f12212c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f12212c.getLineCount() >= 1) {
                f11 = this.f12212c.getLineLeft(0);
            } else {
                f11 = 0.0f;
            }
            this.f12213e = f11;
            StaticLayout staticLayout2 = new StaticLayout(id.N0("AccDescrStickers"), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f12214f = staticLayout2;
            if (staticLayout2.getLineCount() >= 1) {
                f12 = this.f12214f.getLineWidth(0);
            } else {
                f12 = 0.0f;
            }
            this.h = f12;
            if (this.f12214f.getLineCount() >= 1) {
                f13 = this.f12214f.getLineLeft(0);
            } else {
                f13 = 0.0f;
            }
            this.f12215n = f13;
            StaticLayout staticLayout3 = new StaticLayout(id.M0(2131754879, null), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f12216r = staticLayout3;
            if (staticLayout3.getLineCount() >= 1) {
                f14 = this.f12216r.getLineWidth(0);
            } else {
                f14 = 0.0f;
            }
            this.f12217s = f14;
            if (this.f12216r.getLineCount() >= 1) {
                f15 = this.f12216r.getLineLeft(0);
            }
            this.f12218w = f15;
            float L = org.telegram.messenger.g0.L(14.0f) / 2.0f;
            float L2 = org.telegram.messenger.g0.L(66.0f) / 2.0f;
            float measuredWidth2 = (getMeasuredWidth() - ((((((org.telegram.messenger.g0.L(12.0f) + this.d) + org.telegram.messenger.g0.L(36.0f)) + this.h) + org.telegram.messenger.g0.L(36.0f)) + this.f12217s) + org.telegram.messenger.g0.L(12.0f))) / 2.0f;
            this.f12219x.set(measuredWidth2, L, this.d + measuredWidth2 + org.telegram.messenger.g0.L(24.0f), L2);
            float L3 = this.d + org.telegram.messenger.g0.L(36.0f) + measuredWidth2;
            this.f12220y.set(L3, L, this.h + L3 + org.telegram.messenger.g0.L(24.0f), L2);
            float L4 = this.h + org.telegram.messenger.g0.L(36.0f) + L3;
            this.D.set(L4, L, this.f12217s + L4 + org.telegram.messenger.g0.L(24.0f), L2);
            org.telegram.messenger.g0.L(36.0f);
        }
        this.H = getMeasuredWidth();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() == 1 && this.G != null) {
                if (this.f12219x.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.G.a(0);
                    return true;
                }
                if (this.f12220y.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.G.a(1);
                    return true;
                }
                if (this.D.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.G.a(2);
                }
            } else {
                return super.onTouchEvent(motionEvent);
            }
        }
        return true;
    }
}
