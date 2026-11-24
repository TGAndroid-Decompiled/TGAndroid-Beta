package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class qu1 extends FrameLayout implements tjb {
    public Path a;
    public float b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public View h;
    public ep0 n;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Tf));
        hashSet.add(Integer.valueOf(bkb.Ei));
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - gl.L(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.f) - gl.L(4.0f), getHeight()) * this.b;
        float L = gl.L(16.0f) + max;
        RectF rectF = gl.P;
        rectF.set(gl.L(14.0f) - max, (gl.L(4.0f) + height) - max, gl.L(6.0f) + this.f + max, (getHeight() - gl.L(12.0f)) + max);
        Path path = this.a;
        path.rewind();
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.e);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.b) / 0.5f)) * 255.0f), 31);
        canvas.translate(gl.L(10.0f), height);
        ep0 ep0Var = this.n;
        if (ep0Var != null) {
            ep0Var.setDrawBackgroundDrawable(false);
            this.n.draw(canvas);
            this.n.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.b) * (-gl.L(8.0f)), 0.0f);
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

    public void setBotMenuButton(ep0 ep0Var) {
        this.n = ep0Var;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i) {
        this.f = i;
        invalidate();
    }

    public void setProgress(float f) {
        this.b = f;
        this.e = bm2.f(f, bkb.w0(null, bkb.Tf, false), this.c);
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setAlpha(f);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d) {
                this.c = bkb.w0(null, bkb.Ei, false);
            }
            if (this.e != 0) {
                this.e = bm2.f(this.b, bkb.w0(null, bkb.Tf, false), this.c);
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
