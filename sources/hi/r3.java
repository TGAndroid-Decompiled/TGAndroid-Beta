package hi;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.k6;
public final class r3 extends FrameLayout implements a6 {
    public Path f14927a;
    public float f14928b;
    public int f14929c;
    public boolean d;
    public int f14930e;
    public int f14931f;
    public View h;
    public y f14932n;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Rf));
        hashSet.add(Integer.valueOf(k6.Ci));
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - org.telegram.messenger.g0.L(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.f14931f) - org.telegram.messenger.g0.L(4.0f), getHeight()) * this.f14928b;
        float L = org.telegram.messenger.g0.L(16.0f) + max;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.L(14.0f) - max, (org.telegram.messenger.g0.L(4.0f) + height) - max, org.telegram.messenger.g0.L(6.0f) + this.f14931f + max, (getHeight() - org.telegram.messenger.g0.L(12.0f)) + max);
        Path path = this.f14927a;
        path.rewind();
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.f14930e);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.f14928b) / 0.5f)) * 255.0f), 31);
        canvas.translate(org.telegram.messenger.g0.L(10.0f), height);
        y yVar = this.f14932n;
        if (yVar != null) {
            yVar.setDrawBackgroundDrawable(false);
            this.f14932n.draw(canvas);
            this.f14932n.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.f14928b) * (-org.telegram.messenger.g0.L(8.0f)), 0.0f);
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
        this.f14932n = yVar;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i7) {
        this.f14931f = i7;
        invalidate();
    }

    public void setProgress(float f10) {
        this.f14928b = f10;
        this.f14930e = i0.a.f(f10, k6.x0(null, k6.Rf, false), this.f14929c);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            getChildAt(i7).setAlpha(f10);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d) {
                this.f14929c = k6.x0(null, k6.Ci, false);
            }
            if (this.f14930e != 0) {
                this.f14930e = i0.a.f(this.f14928b, k6.x0(null, k6.Rf, false), this.f14929c);
                invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
