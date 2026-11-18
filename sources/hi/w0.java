package hi;

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
import org.telegram.messenger.gd;
import org.telegram.ui.Components.lr;
public final class w0 extends View {
    public final Paint f15620a;
    public final TextPaint f15621b;
    public final StaticLayout f15622c;
    public final float d;
    public final float f15623e;
    public final Path f15624f;
    public k h;
    public boolean f15625n;
    public final org.telegram.ui.Components.c6 f15626r;

    public w0(Context context) {
        super(context);
        Point point;
        float f10;
        float f11;
        Paint paint = new Paint(1);
        this.f15620a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f15621b = textPaint;
        this.f15624f = new Path();
        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(this);
        this.f15626r = c6Var;
        paint.setColor(-869783512);
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(6.0f)));
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-1);
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(gd.N0("StoryDraftSaved"), textPaint, point.x, TextUtils.TruncateAt.END), textPaint, org.telegram.messenger.g0.f24118q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f15622c = staticLayout;
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
        this.f15623e = f11;
        c6Var.e(true, 0.0f);
    }

    public final void a(boolean z10) {
        k kVar;
        if (!z10 && (kVar = this.h) != null) {
            org.telegram.messenger.g0.r(kVar);
            this.h = null;
        }
        this.f15625n = z10;
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float d = this.f15626r.d(this.f15625n);
        if (d <= 0.0f) {
            return;
        }
        canvas.save();
        if (this.f15625n) {
            f10 = lr.f37212k.getInterpolation(d);
        } else {
            f10 = 1.0f;
        }
        canvas.translate(0.0f, f10 * org.telegram.messenger.g0.L(12.0f));
        float interpolation = lr.h.getInterpolation(d);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float L = org.telegram.messenger.g0.L(22.0f) + this.d;
        float min = (measuredWidth / 2.0f) - Math.min(org.telegram.messenger.g0.L(135.0f), 0.35f * measuredWidth);
        float max = Math.max(org.telegram.messenger.g0.L(8.0f), min - (L / 2.0f));
        Path path = this.f15624f;
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
        Paint paint = this.f15620a;
        paint.setAlpha((int) (204.0f * interpolation));
        canvas.drawPath(path, paint);
        canvas.save();
        StaticLayout staticLayout = this.f15622c;
        canvas.translate((max + org.telegram.messenger.g0.L(11.0f)) - this.f15623e, ((measuredHeight - org.telegram.messenger.g0.L(18.0f)) - staticLayout.getHeight()) / 2.0f);
        this.f15621b.setAlpha((int) (interpolation * 255.0f));
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f));
    }
}
