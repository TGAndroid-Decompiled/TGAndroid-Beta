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
    public final TextPaint f12214a;
    public final Paint f12215b;
    public StaticLayout f12216c;
    public float d;
    public float f12217e;
    public StaticLayout f12218f;
    public float h;
    public float f12219n;
    public StaticLayout f12220r;
    public float f12221s;
    public float f12222w;
    public final RectF f12223x;
    public final RectF f12224y;

    public j2(Context context) {
        super(context);
        this.f12214a = new TextPaint(1);
        this.f12215b = new Paint(1);
        this.f12223x = new RectF();
        this.f12224y = new RectF();
        this.D = new RectF();
        this.E = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        canvas.drawColor(-14737633);
        Paint paint = this.f12215b;
        paint.setColor(-13224394);
        float f10 = this.F;
        int i7 = (int) f10;
        RectF rectF3 = this.D;
        RectF rectF4 = this.f12224y;
        RectF rectF5 = this.f12223x;
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
        StaticLayout staticLayout = this.f12216c;
        TextPaint textPaint = this.f12214a;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate((rectF5.left + org.telegram.messenger.g0.L(12.0f)) - this.f12217e, com.google.android.recaptcha.internal.a.A(rectF5.height(), this.f12216c.getHeight(), 2.0f, rectF5.top));
            textPaint.setColor(i0.a.f(Utilities.i(1.0f - Math.abs(this.F - 0.0f), 1.0f, 0.0f), -8158333, -1));
            this.f12216c.draw(canvas);
            canvas.restore();
        }
        if (this.f12218f != null) {
            canvas.save();
            canvas.translate((rectF4.left + org.telegram.messenger.g0.L(12.0f)) - this.f12219n, com.google.android.recaptcha.internal.a.A(rectF4.height(), this.f12218f.getHeight(), 2.0f, rectF4.top));
            textPaint.setColor(i0.a.f(Utilities.i(1.0f - Math.abs(this.F - 1.0f), 1.0f, 0.0f), -8158333, -1));
            this.f12218f.draw(canvas);
            canvas.restore();
        }
        if (this.f12220r != null) {
            canvas.save();
            canvas.translate((rectF3.left + org.telegram.messenger.g0.L(12.0f)) - this.f12222w, com.google.android.recaptcha.internal.a.A(rectF3.height(), this.f12220r.getHeight(), 2.0f, rectF3.top));
            textPaint.setColor(i0.a.f(Utilities.i(1.0f - Math.abs(this.F - 2.0f), 1.0f, 0.0f), -8158333, -1));
            this.f12220r.draw(canvas);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(40.0f) + org.telegram.messenger.g0.f22562n);
        if (getMeasuredWidth() != this.H || this.f12216c == null) {
            TextPaint textPaint = this.f12214a;
            textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            String N0 = id.N0("Emoji");
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(N0, textPaint, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.f12216c = staticLayout;
            float f15 = 0.0f;
            if (staticLayout.getLineCount() >= 1) {
                f10 = this.f12216c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f12216c.getLineCount() >= 1) {
                f11 = this.f12216c.getLineLeft(0);
            } else {
                f11 = 0.0f;
            }
            this.f12217e = f11;
            StaticLayout staticLayout2 = new StaticLayout(id.N0("AccDescrStickers"), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f12218f = staticLayout2;
            if (staticLayout2.getLineCount() >= 1) {
                f12 = this.f12218f.getLineWidth(0);
            } else {
                f12 = 0.0f;
            }
            this.h = f12;
            if (this.f12218f.getLineCount() >= 1) {
                f13 = this.f12218f.getLineLeft(0);
            } else {
                f13 = 0.0f;
            }
            this.f12219n = f13;
            StaticLayout staticLayout3 = new StaticLayout(id.M0(2131754879, null), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f12220r = staticLayout3;
            if (staticLayout3.getLineCount() >= 1) {
                f14 = this.f12220r.getLineWidth(0);
            } else {
                f14 = 0.0f;
            }
            this.f12221s = f14;
            if (this.f12220r.getLineCount() >= 1) {
                f15 = this.f12220r.getLineLeft(0);
            }
            this.f12222w = f15;
            float L = org.telegram.messenger.g0.L(14.0f) / 2.0f;
            float L2 = org.telegram.messenger.g0.L(66.0f) / 2.0f;
            float measuredWidth2 = (getMeasuredWidth() - ((((((org.telegram.messenger.g0.L(12.0f) + this.d) + org.telegram.messenger.g0.L(36.0f)) + this.h) + org.telegram.messenger.g0.L(36.0f)) + this.f12221s) + org.telegram.messenger.g0.L(12.0f))) / 2.0f;
            this.f12223x.set(measuredWidth2, L, this.d + measuredWidth2 + org.telegram.messenger.g0.L(24.0f), L2);
            float L3 = this.d + org.telegram.messenger.g0.L(36.0f) + measuredWidth2;
            this.f12224y.set(L3, L, this.h + L3 + org.telegram.messenger.g0.L(24.0f), L2);
            float L4 = this.h + org.telegram.messenger.g0.L(36.0f) + L3;
            this.D.set(L4, L, this.f12221s + L4 + org.telegram.messenger.g0.L(24.0f), L2);
            org.telegram.messenger.g0.L(36.0f);
        }
        this.H = getMeasuredWidth();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() == 1 && this.G != null) {
                if (this.f12223x.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.G.a(0);
                    return true;
                }
                if (this.f12224y.contains(motionEvent.getX(), motionEvent.getY())) {
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
