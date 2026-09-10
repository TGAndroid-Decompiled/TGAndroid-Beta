package di;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class i4 extends FrameLayout {
    public Path f6680a;
    public float f6681b;
    public int f6682c;
    public int d;
    public int e;
    public f0 f6683f;

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - AndroidUtilities.dp(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.e) - AndroidUtilities.dp(4.0f), getHeight()) * this.f6681b;
        float dp = AndroidUtilities.dp(16.0f) + max;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(14.0f) - max, (AndroidUtilities.dp(4.0f) + height) - max, AndroidUtilities.dp(6.0f) + this.e + max, (getHeight() - AndroidUtilities.dp(12.0f)) + max);
        Path path = this.f6680a;
        path.rewind();
        path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.d);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.f6681b) / 0.5f)) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(10.0f), height);
        f0 f0Var = this.f6683f;
        if (f0Var != null) {
            f0Var.setDrawBackgroundDrawable(false);
            this.f6683f.draw(canvas);
            this.f6683f.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.f6681b) * (-AndroidUtilities.dp(8.0f)), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        if (getParent() instanceof View) {
            i12 = ((View) getParent()).getHeight();
        } else {
            i12 = 0;
        }
        if (i12 > 0) {
            size = Math.min(size, i12);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i11)));
    }

    public void setBotMenuButton(f0 f0Var) {
        this.f6683f = f0Var;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i10) {
        this.e = i10;
        invalidate();
    }

    public void setProgress(float f7) {
        this.f6681b = f7;
        this.d = i0.a.d(f7, j6.w0(null, j6.f17918cf, false), this.f6682c);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).setAlpha(f7);
        }
        invalidate();
    }
}
