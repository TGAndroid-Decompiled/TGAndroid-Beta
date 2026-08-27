package nh;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

public final class t3 extends FrameLayout {

    public Path f18972a;

    public float f18973b;

    public int f18974c;
    public int d;

    public int f18975e;

    public a0 f18976f;

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - AndroidUtilities.dp(32.0f)) / 2.0f;
        float fMax = Math.max((getWidth() - this.f18975e) - AndroidUtilities.dp(4.0f), getHeight()) * this.f18973b;
        float fDp = AndroidUtilities.dp(16.0f) + fMax;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(14.0f) - fMax, (AndroidUtilities.dp(4.0f) + height) - fMax, AndroidUtilities.dp(6.0f) + this.f18975e + fMax, (getHeight() - AndroidUtilities.dp(12.0f)) + fMax);
        Path path = this.f18972a;
        path.rewind();
        path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.d);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.f18973b) / 0.5f)) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(10.0f), height);
        a0 a0Var = this.f18976f;
        if (a0Var != null) {
            a0Var.setDrawBackgroundDrawable(false);
            this.f18976f.draw(canvas);
            this.f18976f.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.f18973b) * (-AndroidUtilities.dp(8.0f)), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        if (height > 0) {
            size = Math.min(size, height);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i11)));
    }

    public void setBotMenuButton(a0 a0Var) {
        this.f18976f = a0Var;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i10) {
        this.f18975e = i10;
        invalidate();
    }

    public void setProgress(float f10) {
        this.f18973b = f10;
        this.d = i0.b.d(f10, g6.w0(null, g6.f23044cf, false), this.f18974c);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).setAlpha(f10);
        }
        invalidate();
    }
}
