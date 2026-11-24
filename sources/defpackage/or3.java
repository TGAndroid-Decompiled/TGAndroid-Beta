package defpackage;

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
public final class or3 extends View {
    public final Paint a;
    public final TextPaint b;
    public final StaticLayout c;
    public final float d;
    public final float e;
    public final Path f;
    public bi3 h;
    public boolean n;
    public final ln r;

    public or3(Context context) {
        super(context);
        Point point;
        float f;
        float f2;
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        this.f = new Path();
        ln lnVar = new ln(this);
        this.r = lnVar;
        paint.setColor(-869783512);
        paint.setPathEffect(new CornerPathEffect(gm.L(6.0f)));
        textPaint.setTextSize(gm.L(14.0f));
        textPaint.setColor(-1);
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(jb6.N0("StoryDraftSaved"), textPaint, point.x, TextUtils.TruncateAt.END), textPaint, gm.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.c = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f = staticLayout.getLineWidth(0);
        } else {
            f = 0.0f;
        }
        this.d = f;
        if (staticLayout.getLineCount() > 0) {
            f2 = staticLayout.getLineLeft(0);
        } else {
            f2 = 0.0f;
        }
        this.e = f2;
        lnVar.e(true, 0.0f);
    }

    public final void a(boolean z) {
        bi3 bi3Var;
        if (!z && (bi3Var = this.h) != null) {
            gm.r(bi3Var);
            this.h = null;
        }
        this.n = z;
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float d = this.r.d(this.n);
        if (d <= 0.0f) {
            return;
        }
        canvas.save();
        if (this.n) {
            f = d53.k.getInterpolation(d);
        } else {
            f = 1.0f;
        }
        canvas.translate(0.0f, f * gm.L(12.0f));
        float interpolation = d53.h.getInterpolation(d);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float L = gm.L(22.0f) + this.d;
        float min = (measuredWidth / 2.0f) - Math.min(gm.L(135.0f), 0.35f * measuredWidth);
        float max = Math.max(gm.L(8.0f), min - (L / 2.0f));
        Path path = this.f;
        path.rewind();
        path.moveTo(max, 0.0f);
        float f2 = L + max;
        path.lineTo(f2, 0.0f);
        path.lineTo(f2, measuredHeight - gm.L(18.0f));
        path.lineTo(gm.L(7.0f) + min, measuredHeight - gm.L(18.0f));
        path.lineTo(gm.L(1.0f) + min, measuredHeight - gm.L(12.0f));
        path.lineTo(min - gm.L(1.0f), measuredHeight - gm.L(12.0f));
        path.lineTo(min - gm.L(7.0f), measuredHeight - gm.L(18.0f));
        path.lineTo(max, measuredHeight - gm.L(18.0f));
        path.close();
        Paint paint = this.a;
        paint.setAlpha((int) (204.0f * interpolation));
        canvas.drawPath(path, paint);
        canvas.save();
        StaticLayout staticLayout = this.c;
        canvas.translate((max + gm.L(11.0f)) - this.e, ((measuredHeight - gm.L(18.0f)) - staticLayout.getHeight()) / 2.0f);
        this.b.setAlpha((int) (interpolation * 255.0f));
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(50.0f));
    }
}
