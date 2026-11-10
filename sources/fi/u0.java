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
import org.telegram.ui.Components.wq;
public final class u0 extends View {
    public final Paint f12876a;
    public final TextPaint f12877b;
    public final StaticLayout f12878c;
    public final float d;
    public final float f12879e;
    public final Path f12880f;
    public di.f8 h;
    public boolean f12881n;
    public final org.telegram.ui.Components.v5 f12882r;

    public u0(Context context) {
        super(context);
        Point point;
        float f10;
        float f11;
        Paint paint = new Paint(1);
        this.f12876a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f12877b = textPaint;
        this.f12880f = new Path();
        org.telegram.ui.Components.v5 v5Var = new org.telegram.ui.Components.v5(this);
        this.f12882r = v5Var;
        paint.setColor(-869783512);
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(6.0f)));
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-1);
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(id.N0("StoryDraftSaved"), textPaint, point.x, TextUtils.TruncateAt.END), textPaint, org.telegram.messenger.g0.f22567q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f12878c = staticLayout;
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
        this.f12879e = f11;
        v5Var.e(true, 0.0f);
    }

    public final void a(boolean z9) {
        di.f8 f8Var;
        if (!z9 && (f8Var = this.h) != null) {
            org.telegram.messenger.g0.r(f8Var);
            this.h = null;
        }
        this.f12881n = z9;
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float d = this.f12882r.d(this.f12881n);
        if (d <= 0.0f) {
            return;
        }
        canvas.save();
        if (this.f12881n) {
            f10 = wq.f40050k.getInterpolation(d);
        } else {
            f10 = 1.0f;
        }
        canvas.translate(0.0f, f10 * org.telegram.messenger.g0.L(12.0f));
        float interpolation = wq.h.getInterpolation(d);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float L = org.telegram.messenger.g0.L(22.0f) + this.d;
        float min = (measuredWidth / 2.0f) - Math.min(org.telegram.messenger.g0.L(135.0f), 0.35f * measuredWidth);
        float max = Math.max(org.telegram.messenger.g0.L(8.0f), min - (L / 2.0f));
        Path path = this.f12880f;
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
        Paint paint = this.f12876a;
        paint.setAlpha((int) (204.0f * interpolation));
        canvas.drawPath(path, paint);
        canvas.save();
        StaticLayout staticLayout = this.f12878c;
        canvas.translate((max + org.telegram.messenger.g0.L(11.0f)) - this.f12879e, ((measuredHeight - org.telegram.messenger.g0.L(18.0f)) - staticLayout.getHeight()) / 2.0f);
        this.f12877b.setAlpha((int) (interpolation * 255.0f));
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f));
    }
}
