package hi;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.l6;
public final class r3 extends FrameLayout implements b6 {
    public Path f14930a;
    public float f14931b;
    public int f14932c;
    public boolean d;
    public int f14933e;
    public int f14934f;
    public View h;
    public y f14935n;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6.Rf));
        hashSet.add(Integer.valueOf(l6.Ci));
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - org.telegram.messenger.g0.L(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.f14934f) - org.telegram.messenger.g0.L(4.0f), getHeight()) * this.f14931b;
        float L = org.telegram.messenger.g0.L(16.0f) + max;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.L(14.0f) - max, (org.telegram.messenger.g0.L(4.0f) + height) - max, org.telegram.messenger.g0.L(6.0f) + this.f14934f + max, (getHeight() - org.telegram.messenger.g0.L(12.0f)) + max);
        Path path = this.f14930a;
        path.rewind();
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.f14933e);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.f14931b) / 0.5f)) * 255.0f), 31);
        canvas.translate(org.telegram.messenger.g0.L(10.0f), height);
        y yVar = this.f14935n;
        if (yVar != null) {
            yVar.setDrawBackgroundDrawable(false);
            this.f14935n.draw(canvas);
            this.f14935n.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.f14931b) * (-org.telegram.messenger.g0.L(8.0f)), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
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
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i10)));
    }

    public void setBotMenuButton(y yVar) {
        this.f14935n = yVar;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i7) {
        this.f14934f = i7;
        invalidate();
    }

    public void setProgress(float f10) {
        this.f14931b = f10;
        this.f14933e = i0.a.f(f10, l6.x0(null, l6.Rf, false), this.f14932c);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            getChildAt(i7).setAlpha(f10);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d) {
                this.f14932c = l6.x0(null, l6.Ci, false);
            }
            if (this.f14933e != 0) {
                this.f14933e = i0.a.f(this.f14931b, l6.x0(null, l6.Rf, false), this.f14932c);
                invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
