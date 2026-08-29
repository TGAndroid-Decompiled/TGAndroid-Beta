package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.jr;
public final class v0 extends View {
    public final Paint f18733a;
    public final TextPaint f18734b;
    public final StaticLayout f18735c;
    public final float d;
    public final float f18736e;
    public final Path f18737f;
    public lh.m5 h;
    public boolean f18738n;
    public final org.telegram.ui.Components.d6 f18739r;

    public v0(Context context) {
        super(context);
        float f9;
        float f10;
        Paint paint = new Paint(1);
        this.f18733a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f18734b = textPaint;
        this.f18737f = new Path();
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(this);
        this.f18739r = d6Var;
        paint.setColor(-869783512);
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(6.0f)));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-1);
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(LocaleController.getString("StoryDraftSaved"), textPaint, AndroidUtilities.displaySize.x, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f18735c = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f9 = staticLayout.getLineWidth(0);
        } else {
            f9 = 0.0f;
        }
        this.d = f9;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f18736e = f10;
        d6Var.d(0.0f, true);
    }

    public final void a(boolean z10) {
        lh.m5 m5Var;
        if (!z10 && (m5Var = this.h) != null) {
            AndroidUtilities.cancelRunOnUIThread(m5Var);
            this.h = null;
        }
        this.f18738n = z10;
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        float e10 = this.f18739r.e(this.f18738n);
        if (e10 <= 0.0f) {
            return;
        }
        canvas.save();
        if (this.f18738n) {
            f9 = jr.f29804k.getInterpolation(e10);
        } else {
            f9 = 1.0f;
        }
        canvas.translate(0.0f, f9 * AndroidUtilities.dp(12.0f));
        float interpolation = jr.h.getInterpolation(e10);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float dp = AndroidUtilities.dp(22.0f) + this.d;
        float min = (measuredWidth / 2.0f) - Math.min(AndroidUtilities.dp(135.0f), 0.35f * measuredWidth);
        float max = Math.max(AndroidUtilities.dp(8.0f), min - (dp / 2.0f));
        Path path = this.f18737f;
        path.rewind();
        path.moveTo(max, 0.0f);
        float f10 = dp + max;
        path.lineTo(f10, 0.0f);
        path.lineTo(f10, measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(AndroidUtilities.dp(7.0f) + min, measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(AndroidUtilities.dp(1.0f) + min, measuredHeight - AndroidUtilities.dp(12.0f));
        path.lineTo(min - AndroidUtilities.dp(1.0f), measuredHeight - AndroidUtilities.dp(12.0f));
        path.lineTo(min - AndroidUtilities.dp(7.0f), measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(max, measuredHeight - AndroidUtilities.dp(18.0f));
        path.close();
        Paint paint = this.f18733a;
        paint.setAlpha((int) (204.0f * interpolation));
        canvas.drawPath(path, paint);
        canvas.save();
        StaticLayout staticLayout = this.f18735c;
        canvas.translate((max + AndroidUtilities.dp(11.0f)) - this.f18736e, ((measuredHeight - AndroidUtilities.dp(18.0f)) - staticLayout.getHeight()) / 2.0f);
        this.f18734b.setAlpha((int) (interpolation * 255.0f));
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f));
    }
}
