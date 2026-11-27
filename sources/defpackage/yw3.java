package defpackage;

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
public final class yw3 extends View {
    public final RectF E;
    public final RectF F;
    public float G;
    public uv3 H;
    public int I;
    public final TextPaint a;
    public final Paint b;
    public StaticLayout c;
    public float d;
    public float e;
    public StaticLayout f;
    public float h;
    public float n;
    public StaticLayout r;
    public float s;
    public float w;
    public final RectF x;
    public final RectF y;

    public yw3(Context context) {
        super(context);
        this.a = new TextPaint(1);
        this.b = new Paint(1);
        this.x = new RectF();
        this.y = new RectF();
        this.E = new RectF();
        this.F = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        canvas.drawColor(-14737633);
        Paint paint = this.b;
        paint.setColor(-13224394);
        float f = this.G;
        int i = (int) f;
        RectF rectF3 = this.E;
        RectF rectF4 = this.y;
        RectF rectF5 = this.x;
        if (i <= 0) {
            rectF = rectF5;
        } else if (i == 1) {
            rectF = rectF4;
        } else {
            rectF = rectF3;
        }
        int ceil = (int) Math.ceil(f);
        if (ceil <= 0) {
            rectF2 = rectF5;
        } else if (ceil == 1) {
            rectF2 = rectF4;
        } else {
            rectF2 = rectF3;
        }
        float f2 = this.G;
        RectF rectF6 = this.F;
        hl.X1(rectF, rectF2, f2 - ((int) f2), rectF6);
        canvas.drawRoundRect(rectF6, hl.L(20.0f), hl.L(20.0f), paint);
        StaticLayout staticLayout = this.c;
        TextPaint textPaint = this.a;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate((rectF5.left + hl.L(12.0f)) - this.e, bp1.z(rectF5.height(), this.c.getHeight(), 2.0f, rectF5.top));
            textPaint.setColor(vm2.f(Utilities.i(1.0f - Math.abs(this.G - 0.0f), 1.0f, 0.0f), -8158333, -1));
            this.c.draw(canvas);
            canvas.restore();
        }
        if (this.f != null) {
            canvas.save();
            canvas.translate((rectF4.left + hl.L(12.0f)) - this.n, bp1.z(rectF4.height(), this.f.getHeight(), 2.0f, rectF4.top));
            textPaint.setColor(vm2.f(Utilities.i(1.0f - Math.abs(this.G - 1.0f), 1.0f, 0.0f), -8158333, -1));
            this.f.draw(canvas);
            canvas.restore();
        }
        if (this.r != null) {
            canvas.save();
            canvas.translate((rectF3.left + hl.L(12.0f)) - this.w, bp1.z(rectF3.height(), this.r.getHeight(), 2.0f, rectF3.top));
            textPaint.setColor(vm2.f(Utilities.i(1.0f - Math.abs(this.G - 2.0f), 1.0f, 0.0f), -8158333, -1));
            this.r.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(40.0f) + hl.n);
        if (getMeasuredWidth() != this.I || this.c == null) {
            TextPaint textPaint = this.a;
            textPaint.setTextSize(hl.L(14.0f));
            textPaint.setTypeface(hl.o());
            String N0 = ob6.N0("Emoji");
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(N0, textPaint, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.c = staticLayout;
            float f6 = 0.0f;
            if (staticLayout.getLineCount() >= 1) {
                f = this.c.getLineWidth(0);
            } else {
                f = 0.0f;
            }
            this.d = f;
            if (this.c.getLineCount() >= 1) {
                f2 = this.c.getLineLeft(0);
            } else {
                f2 = 0.0f;
            }
            this.e = f2;
            StaticLayout staticLayout2 = new StaticLayout(ob6.N0("AccDescrStickers"), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f = staticLayout2;
            if (staticLayout2.getLineCount() >= 1) {
                f3 = this.f.getLineWidth(0);
            } else {
                f3 = 0.0f;
            }
            this.h = f3;
            if (this.f.getLineCount() >= 1) {
                f4 = this.f.getLineLeft(0);
            } else {
                f4 = 0.0f;
            }
            this.n = f4;
            StaticLayout staticLayout3 = new StaticLayout(ob6.M0(2131754875, null), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.r = staticLayout3;
            if (staticLayout3.getLineCount() >= 1) {
                f5 = this.r.getLineWidth(0);
            } else {
                f5 = 0.0f;
            }
            this.s = f5;
            if (this.r.getLineCount() >= 1) {
                f6 = this.r.getLineLeft(0);
            }
            this.w = f6;
            float L = hl.L(14.0f) / 2.0f;
            float L2 = hl.L(66.0f) / 2.0f;
            float measuredWidth2 = (getMeasuredWidth() - ((((((hl.L(12.0f) + this.d) + hl.L(36.0f)) + this.h) + hl.L(36.0f)) + this.s) + hl.L(12.0f))) / 2.0f;
            this.x.set(measuredWidth2, L, this.d + measuredWidth2 + hl.L(24.0f), L2);
            float L3 = this.d + hl.L(36.0f) + measuredWidth2;
            this.y.set(L3, L, this.h + L3 + hl.L(24.0f), L2);
            float L4 = this.h + hl.L(36.0f) + L3;
            this.E.set(L4, L, this.s + L4 + hl.L(24.0f), L2);
            hl.L(36.0f);
        }
        this.I = getMeasuredWidth();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() == 1 && this.H != null) {
                if (this.x.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.H.a(0);
                    return true;
                }
                if (this.y.contains(motionEvent.getX(), motionEvent.getY())) {
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
