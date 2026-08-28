package kh;

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
import org.telegram.ui.Components.gr;
public final class w0 extends View {
    public final Paint f16221a;
    public final TextPaint f16222b;
    public final StaticLayout f16223c;
    public final float d;
    public final float f16224e;
    public final Path f16225f;
    public ih.g h;
    public boolean f16226n;
    public final org.telegram.ui.Components.y5 f16227r;

    public w0(Context context) {
        super(context);
        float f10;
        float f11;
        Paint paint = new Paint(1);
        this.f16221a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f16222b = textPaint;
        this.f16225f = new Path();
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(this);
        this.f16227r = y5Var;
        paint.setColor(-869783512);
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(6.0f)));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-1);
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(LocaleController.getString("StoryDraftSaved"), textPaint, AndroidUtilities.displaySize.x, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f16223c = staticLayout;
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
        this.f16224e = f11;
        y5Var.d(0.0f, true);
    }

    public final void a(boolean z10) {
        ih.g gVar;
        if (!z10 && (gVar = this.h) != null) {
            AndroidUtilities.cancelRunOnUIThread(gVar);
            this.h = null;
        }
        this.f16226n = z10;
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float e10 = this.f16227r.e(this.f16226n);
        if (e10 <= 0.0f) {
            return;
        }
        canvas.save();
        if (this.f16226n) {
            f10 = gr.f28848k.getInterpolation(e10);
        } else {
            f10 = 1.0f;
        }
        canvas.translate(0.0f, f10 * AndroidUtilities.dp(12.0f));
        float interpolation = gr.h.getInterpolation(e10);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float dp = AndroidUtilities.dp(22.0f) + this.d;
        float min = (measuredWidth / 2.0f) - Math.min(AndroidUtilities.dp(135.0f), 0.35f * measuredWidth);
        float max = Math.max(AndroidUtilities.dp(8.0f), min - (dp / 2.0f));
        Path path = this.f16225f;
        path.rewind();
        path.moveTo(max, 0.0f);
        float f11 = dp + max;
        path.lineTo(f11, 0.0f);
        path.lineTo(f11, measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(AndroidUtilities.dp(7.0f) + min, measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(AndroidUtilities.dp(1.0f) + min, measuredHeight - AndroidUtilities.dp(12.0f));
        path.lineTo(min - AndroidUtilities.dp(1.0f), measuredHeight - AndroidUtilities.dp(12.0f));
        path.lineTo(min - AndroidUtilities.dp(7.0f), measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(max, measuredHeight - AndroidUtilities.dp(18.0f));
        path.close();
        Paint paint = this.f16221a;
        paint.setAlpha((int) (204.0f * interpolation));
        canvas.drawPath(path, paint);
        canvas.save();
        StaticLayout staticLayout = this.f16223c;
        canvas.translate((max + AndroidUtilities.dp(11.0f)) - this.f16224e, ((measuredHeight - AndroidUtilities.dp(18.0f)) - staticLayout.getHeight()) / 2.0f);
        this.f16222b.setAlpha((int) (interpolation * 255.0f));
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(50.0f));
    }
}
