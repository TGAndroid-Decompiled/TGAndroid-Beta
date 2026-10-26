package hi;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.y6;
public final class e4 extends FrameLayout implements p6 {
    public Path f12958a;
    public float f12959b;
    public int f12960c;
    public boolean d;
    public int e;
    public int f12961f;
    public View h;
    public i0 f12962n;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.f23346cf));
        hashSet.add(Integer.valueOf(y6.Oh));
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - AndroidUtilities.dp(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.f12961f) - AndroidUtilities.dp(4.0f), getHeight()) * this.f12959b;
        float dp = AndroidUtilities.dp(16.0f) + max;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(14.0f) - max, (AndroidUtilities.dp(4.0f) + height) - max, AndroidUtilities.dp(6.0f) + this.f12961f + max, (getHeight() - AndroidUtilities.dp(12.0f)) + max);
        Path path = this.f12958a;
        path.rewind();
        path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.e);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.f12959b) / 0.5f)) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(10.0f), height);
        i0 i0Var = this.f12962n;
        if (i0Var != null) {
            i0Var.setDrawBackgroundDrawable(false);
            this.f12962n.draw(canvas);
            this.f12962n.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.f12959b) * (-AndroidUtilities.dp(8.0f)), 0.0f);
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

    public void setBotMenuButton(i0 i0Var) {
        this.f12962n = i0Var;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i10) {
        this.f12961f = i10;
        invalidate();
    }

    public void setProgress(float f7) {
        this.f12959b = f7;
        this.e = i0.a.f(f7, y6.x0(null, y6.f23346cf, false), this.f12960c);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).setAlpha(f7);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d) {
                this.f12960c = y6.x0(null, y6.Oh, false);
            }
            if (this.e != 0) {
                this.e = i0.a.f(this.f12959b, y6.x0(null, y6.f23346cf, false), this.f12960c);
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
