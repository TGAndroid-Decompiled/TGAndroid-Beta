package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class cw1 extends FrameLayout implements vlb {
    public Path a;
    public float b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public View h;
    public eq0 n;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Tf));
        hashSet.add(Integer.valueOf(cmb.Ei));
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - gm.L(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.f) - gm.L(4.0f), getHeight()) * this.b;
        float L = gm.L(16.0f) + max;
        RectF rectF = gm.P;
        rectF.set(gm.L(14.0f) - max, (gm.L(4.0f) + height) - max, gm.L(6.0f) + this.f + max, (getHeight() - gm.L(12.0f)) + max);
        Path path = this.a;
        path.rewind();
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.e);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.b) / 0.5f)) * 255.0f), 31);
        canvas.translate(gm.L(10.0f), height);
        eq0 eq0Var = this.n;
        if (eq0Var != null) {
            eq0Var.setDrawBackgroundDrawable(false);
            this.n.draw(canvas);
            this.n.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.b) * (-gm.L(8.0f)), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i2);
        if (getParent() instanceof View) {
            i3 = ((View) getParent()).getHeight();
        } else {
            i3 = 0;
        }
        if (i3 > 0) {
            size = Math.min(size, i3);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i2)));
    }

    public void setBotMenuButton(eq0 eq0Var) {
        this.n = eq0Var;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i) {
        this.f = i;
        invalidate();
    }

    public void setProgress(float f) {
        this.b = f;
        this.e = on2.f(f, cmb.w0(null, cmb.Tf, false), this.c);
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setAlpha(f);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d) {
                this.c = cmb.w0(null, cmb.Ei, false);
            }
            if (this.e != 0) {
                this.e = on2.f(this.b, cmb.w0(null, cmb.Tf, false), this.c);
                invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
