package mh;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class v3 extends FrameLayout {
    public Path f18169a;
    public float f18170b;
    public int f18171c;
    public int d;
    public int f18172e;
    public c0 f18173f;

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - AndroidUtilities.dp(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.f18172e) - AndroidUtilities.dp(4.0f), getHeight()) * this.f18170b;
        float dp = AndroidUtilities.dp(16.0f) + max;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(14.0f) - max, (AndroidUtilities.dp(4.0f) + height) - max, AndroidUtilities.dp(6.0f) + this.f18172e + max, (getHeight() - AndroidUtilities.dp(12.0f)) + max);
        Path path = this.f18169a;
        path.rewind();
        path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.d);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.f18170b) / 0.5f)) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(10.0f), height);
        c0 c0Var = this.f18173f;
        if (c0Var != null) {
            c0Var.setDrawBackgroundDrawable(false);
            this.f18173f.draw(canvas);
            this.f18173f.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.f18170b) * (-AndroidUtilities.dp(8.0f)), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10);
        if (getParent() instanceof View) {
            i11 = ((View) getParent()).getHeight();
        } else {
            i11 = 0;
        }
        if (i11 > 0) {
            size = Math.min(size, i11);
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i10)));
    }

    public void setBotMenuButton(c0 c0Var) {
        this.f18173f = c0Var;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i9) {
        this.f18172e = i9;
        invalidate();
    }

    public void setProgress(float f10) {
        this.f18170b = f10;
        this.d = i0.a.d(f10, f6.w0(null, f6.f22992cf, false), this.f18171c);
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            getChildAt(i9).setAlpha(f10);
        }
        invalidate();
    }
}
