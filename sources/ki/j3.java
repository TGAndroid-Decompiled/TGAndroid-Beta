package ki;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.n6;
public final class j3 extends FrameLayout implements c6 {
    public Path f18730a;
    public float f18731b;
    public int f18732c;
    public boolean d;
    public int f18733e;
    public int f18734f;
    public View h;
    public z f18735n;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.Uf));
        hashSet.add(Integer.valueOf(n6.Fi));
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - org.telegram.messenger.g0.L(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.f18734f) - org.telegram.messenger.g0.L(4.0f), getHeight()) * this.f18731b;
        float L = org.telegram.messenger.g0.L(16.0f) + max;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.L(14.0f) - max, (org.telegram.messenger.g0.L(4.0f) + height) - max, org.telegram.messenger.g0.L(6.0f) + this.f18734f + max, (getHeight() - org.telegram.messenger.g0.L(12.0f)) + max);
        Path path = this.f18730a;
        path.rewind();
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.f18733e);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.f18731b) / 0.5f)) * 255.0f), 31);
        canvas.translate(org.telegram.messenger.g0.L(10.0f), height);
        z zVar = this.f18735n;
        if (zVar != null) {
            zVar.setDrawBackgroundDrawable(false);
            this.f18735n.draw(canvas);
            this.f18735n.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.f18731b) * (-org.telegram.messenger.g0.L(8.0f)), 0.0f);
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

    public void setBotMenuButton(z zVar) {
        this.f18735n = zVar;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i7) {
        this.f18734f = i7;
        invalidate();
    }

    public void setProgress(float f10) {
        this.f18731b = f10;
        this.f18733e = i0.a.f(f10, n6.x0(null, n6.Uf, false), this.f18732c);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            getChildAt(i7).setAlpha(f10);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d) {
                this.f18732c = n6.x0(null, n6.Fi, false);
            }
            if (this.f18733e != 0) {
                this.f18733e = i0.a.f(this.f18731b, n6.x0(null, n6.Uf, false), this.f18732c);
                invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
