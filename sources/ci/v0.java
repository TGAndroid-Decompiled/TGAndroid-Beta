package ci;

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
import org.telegram.ui.Components.tr;
public final class v0 extends View {
    public final Paint f6095a;
    public final TextPaint f6096b;
    public final StaticLayout f6097c;
    public final float d;
    public final float f6098e;
    public final Path f6099f;
    public androidx.fragment.app.a0 h;
    public boolean f6100n;
    public final org.telegram.ui.Components.e6 f6101r;

    public v0(Context context) {
        super(context);
        float f7;
        float f10;
        Paint paint = new Paint(1);
        this.f6095a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f6096b = textPaint;
        this.f6099f = new Path();
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(this);
        this.f6101r = e6Var;
        paint.setColor(-869783512);
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(6.0f)));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-1);
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(LocaleController.getString("StoryDraftSaved"), textPaint, AndroidUtilities.displaySize.x, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f6097c = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.d = f7;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f6098e = f10;
        e6Var.d(0.0f, true);
    }

    public final void a(boolean z10) {
        androidx.fragment.app.a0 a0Var;
        if (!z10 && (a0Var = this.h) != null) {
            AndroidUtilities.cancelRunOnUIThread(a0Var);
            this.h = null;
        }
        this.f6100n = z10;
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float e7 = this.f6101r.e(this.f6100n);
        if (e7 <= 0.0f) {
            return;
        }
        canvas.save();
        if (this.f6100n) {
            f7 = tr.f31145k.getInterpolation(e7);
        } else {
            f7 = 1.0f;
        }
        canvas.translate(0.0f, f7 * AndroidUtilities.dp(12.0f));
        float interpolation = tr.h.getInterpolation(e7);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float dp = AndroidUtilities.dp(22.0f) + this.d;
        float min = (measuredWidth / 2.0f) - Math.min(AndroidUtilities.dp(135.0f), 0.35f * measuredWidth);
        float max = Math.max(AndroidUtilities.dp(8.0f), min - (dp / 2.0f));
        Path path = this.f6099f;
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
        Paint paint = this.f6095a;
        paint.setAlpha((int) (204.0f * interpolation));
        canvas.drawPath(path, paint);
        canvas.save();
        StaticLayout staticLayout = this.f6097c;
        canvas.translate((max + AndroidUtilities.dp(11.0f)) - this.f6098e, ((measuredHeight - AndroidUtilities.dp(18.0f)) - staticLayout.getHeight()) / 2.0f);
        this.f6096b.setAlpha((int) (interpolation * 255.0f));
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f));
    }
}
