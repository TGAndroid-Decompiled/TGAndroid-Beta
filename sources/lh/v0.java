package lh;

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
import org.telegram.ui.Components.er;

public final class v0 extends View {

    public final Paint f16928a;

    public final TextPaint f16929b;

    public final StaticLayout f16930c;
    public final float d;

    public final float f16931e;

    public final Path f16932f;
    public kh.c h;

    public boolean f16933n;

    public final org.telegram.ui.Components.y5 f16934r;

    public v0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f16928a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f16929b = textPaint;
        this.f16932f = new Path();
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(this);
        this.f16934r = y5Var;
        paint.setColor(-869783512);
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(6.0f)));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-1);
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(LocaleController.getString("StoryDraftSaved"), textPaint, AndroidUtilities.displaySize.x, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f16930c = staticLayout;
        this.d = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.f16931e = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        y5Var.d(0.0f, true);
    }

    public final void a(boolean z10) {
        kh.c cVar;
        if (!z10 && (cVar = this.h) != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar);
            this.h = null;
        }
        this.f16933n = z10;
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float fE = this.f16934r.e(this.f16933n);
        if (fE <= 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, (this.f16933n ? er.f28126k.getInterpolation(fE) : 1.0f) * AndroidUtilities.dp(12.0f));
        float interpolation = er.h.getInterpolation(fE);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float fDp = AndroidUtilities.dp(22.0f) + this.d;
        float fMin = (measuredWidth / 2.0f) - Math.min(AndroidUtilities.dp(135.0f), 0.35f * measuredWidth);
        float fMax = Math.max(AndroidUtilities.dp(8.0f), fMin - (fDp / 2.0f));
        Path path = this.f16932f;
        path.rewind();
        path.moveTo(fMax, 0.0f);
        float f10 = fDp + fMax;
        path.lineTo(f10, 0.0f);
        path.lineTo(f10, measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(AndroidUtilities.dp(7.0f) + fMin, measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(AndroidUtilities.dp(1.0f) + fMin, measuredHeight - AndroidUtilities.dp(12.0f));
        path.lineTo(fMin - AndroidUtilities.dp(1.0f), measuredHeight - AndroidUtilities.dp(12.0f));
        path.lineTo(fMin - AndroidUtilities.dp(7.0f), measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(fMax, measuredHeight - AndroidUtilities.dp(18.0f));
        path.close();
        Paint paint = this.f16928a;
        paint.setAlpha((int) (204.0f * interpolation));
        canvas.drawPath(path, paint);
        canvas.save();
        float fDp2 = (fMax + AndroidUtilities.dp(11.0f)) - this.f16931e;
        float fDp3 = measuredHeight - AndroidUtilities.dp(18.0f);
        StaticLayout staticLayout = this.f16930c;
        canvas.translate(fDp2, (fDp3 - staticLayout.getHeight()) / 2.0f);
        this.f16929b.setAlpha((int) (interpolation * 255.0f));
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f));
    }
}
