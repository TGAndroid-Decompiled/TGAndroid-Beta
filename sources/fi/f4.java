package fi;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class f4 extends FrameLayout {
    public Path f9686a;
    public float f9687b;
    public int f9688c;
    public int d;
    public int f9689e;
    public c0 f9690f;

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - AndroidUtilities.dp(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.f9689e) - AndroidUtilities.dp(4.0f), getHeight()) * this.f9687b;
        float dp = AndroidUtilities.dp(16.0f) + max;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(14.0f) - max, (AndroidUtilities.dp(4.0f) + height) - max, AndroidUtilities.dp(6.0f) + this.f9689e + max, (getHeight() - AndroidUtilities.dp(12.0f)) + max);
        Path path = this.f9686a;
        path.rewind();
        path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.d);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.f9687b) / 0.5f)) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(10.0f), height);
        c0 c0Var = this.f9690f;
        if (c0Var != null) {
            c0Var.setDrawBackgroundDrawable(false);
            this.f9690f.draw(canvas);
            this.f9690f.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.f9687b) * (-AndroidUtilities.dp(8.0f)), 0.0f);
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

    public void setBotMenuButton(c0 c0Var) {
        this.f9690f = c0Var;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i10) {
        this.f9689e = i10;
        invalidate();
    }

    public void setProgress(float f7) {
        this.f9687b = f7;
        this.d = i0.a.d(f7, j6.w0(null, j6.f20680cf, false), this.f9688c);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).setAlpha(f7);
        }
        invalidate();
    }
}
