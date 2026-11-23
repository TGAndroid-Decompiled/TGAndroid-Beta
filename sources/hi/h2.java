package hi;

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
import org.telegram.messenger.hd;
public final class h2 extends View {
    public final RectF E;
    public final RectF F;
    public float G;
    public e1 H;
    public int I;
    public final TextPaint f14733a;
    public final Paint f14734b;
    public StaticLayout f14735c;
    public float d;
    public float f14736e;
    public StaticLayout f14737f;
    public float h;
    public float f14738n;
    public StaticLayout f14739r;
    public float f14740s;
    public float f14741w;
    public final RectF f14742x;
    public final RectF f14743y;

    public h2(Context context) {
        super(context);
        this.f14733a = new TextPaint(1);
        this.f14734b = new Paint(1);
        this.f14742x = new RectF();
        this.f14743y = new RectF();
        this.E = new RectF();
        this.F = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        canvas.drawColor(-14737633);
        Paint paint = this.f14734b;
        paint.setColor(-13224394);
        float f10 = this.G;
        int i7 = (int) f10;
        RectF rectF3 = this.E;
        RectF rectF4 = this.f14743y;
        RectF rectF5 = this.f14742x;
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
        float f11 = this.G;
        RectF rectF6 = this.F;
        org.telegram.messenger.g0.Z1(rectF, rectF2, f11 - ((int) f11), rectF6);
        canvas.drawRoundRect(rectF6, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint);
        StaticLayout staticLayout = this.f14735c;
        TextPaint textPaint = this.f14733a;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate((rectF5.left + org.telegram.messenger.g0.L(12.0f)) - this.f14736e, com.google.android.gms.internal.vision.e2.A(rectF5.height(), this.f14735c.getHeight(), 2.0f, rectF5.top));
            textPaint.setColor(i0.a.f(Utilities.i(1.0f - Math.abs(this.G - 0.0f), 1.0f, 0.0f), -8158333, -1));
            this.f14735c.draw(canvas);
            canvas.restore();
        }
        if (this.f14737f != null) {
            canvas.save();
            canvas.translate((rectF4.left + org.telegram.messenger.g0.L(12.0f)) - this.f14738n, com.google.android.gms.internal.vision.e2.A(rectF4.height(), this.f14737f.getHeight(), 2.0f, rectF4.top));
            textPaint.setColor(i0.a.f(Utilities.i(1.0f - Math.abs(this.G - 1.0f), 1.0f, 0.0f), -8158333, -1));
            this.f14737f.draw(canvas);
            canvas.restore();
        }
        if (this.f14739r != null) {
            canvas.save();
            canvas.translate((rectF3.left + org.telegram.messenger.g0.L(12.0f)) - this.f14741w, com.google.android.gms.internal.vision.e2.A(rectF3.height(), this.f14739r.getHeight(), 2.0f, rectF3.top));
            textPaint.setColor(i0.a.f(Utilities.i(1.0f - Math.abs(this.G - 2.0f), 1.0f, 0.0f), -8158333, -1));
            this.f14739r.draw(canvas);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(40.0f) + org.telegram.messenger.g0.f24041n);
        if (getMeasuredWidth() != this.I || this.f14735c == null) {
            TextPaint textPaint = this.f14733a;
            textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            String O0 = hd.O0("Emoji");
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(O0, textPaint, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.f14735c = staticLayout;
            float f15 = 0.0f;
            if (staticLayout.getLineCount() >= 1) {
                f10 = this.f14735c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f14735c.getLineCount() >= 1) {
                f11 = this.f14735c.getLineLeft(0);
            } else {
                f11 = 0.0f;
            }
            this.f14736e = f11;
            StaticLayout staticLayout2 = new StaticLayout(hd.O0("AccDescrStickers"), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f14737f = staticLayout2;
            if (staticLayout2.getLineCount() >= 1) {
                f12 = this.f14737f.getLineWidth(0);
            } else {
                f12 = 0.0f;
            }
            this.h = f12;
            if (this.f14737f.getLineCount() >= 1) {
                f13 = this.f14737f.getLineLeft(0);
            } else {
                f13 = 0.0f;
            }
            this.f14738n = f13;
            StaticLayout staticLayout3 = new StaticLayout(hd.N0(2131754879, null), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f14739r = staticLayout3;
            if (staticLayout3.getLineCount() >= 1) {
                f14 = this.f14739r.getLineWidth(0);
            } else {
                f14 = 0.0f;
            }
            this.f14740s = f14;
            if (this.f14739r.getLineCount() >= 1) {
                f15 = this.f14739r.getLineLeft(0);
            }
            this.f14741w = f15;
            float L = org.telegram.messenger.g0.L(14.0f) / 2.0f;
            float L2 = org.telegram.messenger.g0.L(66.0f) / 2.0f;
            float measuredWidth2 = (getMeasuredWidth() - ((((((org.telegram.messenger.g0.L(12.0f) + this.d) + org.telegram.messenger.g0.L(36.0f)) + this.h) + org.telegram.messenger.g0.L(36.0f)) + this.f14740s) + org.telegram.messenger.g0.L(12.0f))) / 2.0f;
            this.f14742x.set(measuredWidth2, L, this.d + measuredWidth2 + org.telegram.messenger.g0.L(24.0f), L2);
            float L3 = this.d + org.telegram.messenger.g0.L(36.0f) + measuredWidth2;
            this.f14743y.set(L3, L, this.h + L3 + org.telegram.messenger.g0.L(24.0f), L2);
            float L4 = this.h + org.telegram.messenger.g0.L(36.0f) + L3;
            this.E.set(L4, L, this.f14740s + L4 + org.telegram.messenger.g0.L(24.0f), L2);
            org.telegram.messenger.g0.L(36.0f);
        }
        this.I = getMeasuredWidth();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() == 1 && this.H != null) {
                if (this.f14742x.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.H.a(0);
                    return true;
                }
                if (this.f14743y.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.H.a(1);
                    return true;
                }
                if (this.E.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.H.a(2);
                }
            } else {
                return super.onTouchEvent(motionEvent);
            }
        }
        return true;
    }
}
