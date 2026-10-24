package gi;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.k6;
public final class v3 extends FrameLayout implements b6 {
    public Path f11538a;
    public float f11539b;
    public int f11540c;
    public boolean d;
    public int e;
    public int f11541f;
    public View h;
    public b0 f11542n;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f21174cf));
        hashSet.add(Integer.valueOf(k6.Oh));
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - AndroidUtilities.dp(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.f11541f) - AndroidUtilities.dp(4.0f), getHeight()) * this.f11539b;
        float dp = AndroidUtilities.dp(16.0f) + max;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(14.0f) - max, (AndroidUtilities.dp(4.0f) + height) - max, AndroidUtilities.dp(6.0f) + this.f11541f + max, (getHeight() - AndroidUtilities.dp(12.0f)) + max);
        Path path = this.f11538a;
        path.rewind();
        path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.e);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.f11539b) / 0.5f)) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(10.0f), height);
        b0 b0Var = this.f11542n;
        if (b0Var != null) {
            b0Var.setDrawBackgroundDrawable(false);
            this.f11542n.draw(canvas);
            this.f11542n.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.f11539b) * (-AndroidUtilities.dp(8.0f)), 0.0f);
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

    public void setBotMenuButton(b0 b0Var) {
        this.f11542n = b0Var;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i10) {
        this.f11541f = i10;
        invalidate();
    }

    public void setProgress(float f7) {
        this.f11539b = f7;
        this.e = i0.a.f(f7, k6.x0(null, k6.f21174cf, false), this.f11540c);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).setAlpha(f7);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d) {
                this.f11540c = k6.x0(null, k6.Oh, false);
            }
            if (this.e != 0) {
                this.e = i0.a.f(this.f11539b, k6.x0(null, k6.f21174cf, false), this.f11540c);
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
