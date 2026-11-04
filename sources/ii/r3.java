package ii;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
public final class r3 extends FrameLayout implements z5 {
    public Path f15201a;
    public float f15202b;
    public int f15203c;
    public boolean d;
    public int f15204e;
    public int f15205f;
    public View h;
    public a0 f15206n;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Rf));
        hashSet.add(Integer.valueOf(k6.Ci));
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - org.telegram.messenger.g0.L(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.f15205f) - org.telegram.messenger.g0.L(4.0f), getHeight()) * this.f15202b;
        float L = org.telegram.messenger.g0.L(16.0f) + max;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.L(14.0f) - max, (org.telegram.messenger.g0.L(4.0f) + height) - max, org.telegram.messenger.g0.L(6.0f) + this.f15205f + max, (getHeight() - org.telegram.messenger.g0.L(12.0f)) + max);
        Path path = this.f15201a;
        path.rewind();
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.f15204e);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.f15202b) / 0.5f)) * 255.0f), 31);
        canvas.translate(org.telegram.messenger.g0.L(10.0f), height);
        a0 a0Var = this.f15206n;
        if (a0Var != null) {
            a0Var.setDrawBackgroundDrawable(false);
            this.f15206n.draw(canvas);
            this.f15206n.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.f15202b) * (-org.telegram.messenger.g0.L(8.0f)), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
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
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i10)));
    }

    public void setBotMenuButton(a0 a0Var) {
        this.f15206n = a0Var;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i3) {
        this.f15205f = i3;
        invalidate();
    }

    public void setProgress(float f10) {
        this.f15202b = f10;
        this.f15204e = i0.a.f(f10, k6.x0(null, k6.Rf, false), this.f15203c);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).setAlpha(f10);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d) {
                this.f15203c = k6.x0(null, k6.Ci, false);
            }
            if (this.f15204e != 0) {
                this.f15204e = i0.a.f(this.f15202b, k6.x0(null, k6.Rf, false), this.f15203c);
                invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
