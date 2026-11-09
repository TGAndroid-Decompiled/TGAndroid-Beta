package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.id;
import org.telegram.ui.Components.xq;
public final class u0 extends View {
    public final Paint f12875a;
    public final TextPaint f12876b;
    public final StaticLayout f12877c;
    public final float d;
    public final float f12878e;
    public final Path f12879f;
    public di.f8 h;
    public boolean f12880n;
    public final org.telegram.ui.Components.w5 f12881r;

    public u0(Context context) {
        super(context);
        Point point;
        float f10;
        float f11;
        Paint paint = new Paint(1);
        this.f12875a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f12876b = textPaint;
        this.f12879f = new Path();
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(this);
        this.f12881r = w5Var;
        paint.setColor(-869783512);
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(6.0f)));
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-1);
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(id.N0("StoryDraftSaved"), textPaint, point.x, TextUtils.TruncateAt.END), textPaint, org.telegram.messenger.g0.f22563q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f12877c = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineWidth(0);
        } else {
            f10 = 0.0f;
        }
        this.d = f10;
        if (staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineLeft(0);
        } else {
            f11 = 0.0f;
        }
        this.f12878e = f11;
        w5Var.e(true, 0.0f);
    }

    public final void a(boolean z9) {
        di.f8 f8Var;
        if (!z9 && (f8Var = this.h) != null) {
            org.telegram.messenger.g0.r(f8Var);
            this.h = null;
        }
        this.f12880n = z9;
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float d = this.f12881r.d(this.f12880n);
        if (d <= 0.0f) {
            return;
        }
        canvas.save();
        if (this.f12880n) {
            f10 = xq.f40462k.getInterpolation(d);
        } else {
            f10 = 1.0f;
        }
        canvas.translate(0.0f, f10 * org.telegram.messenger.g0.L(12.0f));
        float interpolation = xq.h.getInterpolation(d);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float L = org.telegram.messenger.g0.L(22.0f) + this.d;
        float min = (measuredWidth / 2.0f) - Math.min(org.telegram.messenger.g0.L(135.0f), 0.35f * measuredWidth);
        float max = Math.max(org.telegram.messenger.g0.L(8.0f), min - (L / 2.0f));
        Path path = this.f12879f;
        path.rewind();
        path.moveTo(max, 0.0f);
        float f11 = L + max;
        path.lineTo(f11, 0.0f);
        path.lineTo(f11, measuredHeight - org.telegram.messenger.g0.L(18.0f));
        path.lineTo(org.telegram.messenger.g0.L(7.0f) + min, measuredHeight - org.telegram.messenger.g0.L(18.0f));
        path.lineTo(org.telegram.messenger.g0.L(1.0f) + min, measuredHeight - org.telegram.messenger.g0.L(12.0f));
        path.lineTo(min - org.telegram.messenger.g0.L(1.0f), measuredHeight - org.telegram.messenger.g0.L(12.0f));
        path.lineTo(min - org.telegram.messenger.g0.L(7.0f), measuredHeight - org.telegram.messenger.g0.L(18.0f));
        path.lineTo(max, measuredHeight - org.telegram.messenger.g0.L(18.0f));
        path.close();
        Paint paint = this.f12875a;
        paint.setAlpha((int) (204.0f * interpolation));
        canvas.drawPath(path, paint);
        canvas.save();
        StaticLayout staticLayout = this.f12877c;
        canvas.translate((max + org.telegram.messenger.g0.L(11.0f)) - this.f12878e, ((measuredHeight - org.telegram.messenger.g0.L(18.0f)) - staticLayout.getHeight()) / 2.0f);
        this.f12876b.setAlpha((int) (interpolation * 255.0f));
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f));
    }
}
