package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class x0c extends View implements vlb {
    public int a;
    public float b;
    public final Paint c;
    public final Paint d;
    public Drawable e;
    public boolean f;
    public int h;
    public final RectF n;

    public x0c(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f = true;
        this.h = 0;
        this.n = new RectF();
        int w0 = cmb.w0(null, cmb.O9, false);
        this.a = w0;
        paint.setColor(w0);
        paint2.setStrokeWidth(gm.L(2.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z;
        float f;
        Canvas canvas2 = canvas;
        if (this.f) {
            if (this.h == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f = this.b;
            } else {
                f = 1.0f;
            }
            float L = gm.L((f * 26.0f) + 6.0f);
            RectF rectF = this.n;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(rectF, L, L, this.c);
        }
        int i = this.h;
        Paint paint = this.d;
        if (i != 0) {
            if (i == 1) {
                float L2 = gm.L(21.0f);
                float width = getWidth() - gm.L(21.0f);
                float height = getHeight() / 2.0f;
                canvas2.save();
                canvas2.translate((-gm.L(2.0f)) * this.b, 0.0f);
                canvas2.rotate(this.b * 90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas2.drawLine(L2 + ((width - L2) * this.b), height, width, height, paint);
                int L3 = gm.L((this.b * (-1.0f)) + 9.0f);
                int L4 = gm.L((this.b * 7.0f) + 9.0f);
                double d = width;
                double d2 = L3;
                double d3 = height;
                canvas.drawLine(width, height, (float) (d - (d2 * 0.7071067811865476d)), (float) ((d2 * 0.7071067811865475d) + d3), paint);
                double d4 = L4;
                canvas2 = canvas;
                canvas2.drawLine(width, height, (float) (d - (0.7071067811865476d * d4)), (float) (d3 - (d4 * 0.7071067811865475d)), paint);
                canvas.restore();
            }
        } else {
            float max = (Math.max(0.4f, this.b) - 0.4f) / 0.6f;
            if (max != 0.0f) {
                float width2 = ((getWidth() - (gm.L(21.0f) << 1)) * max) + gm.L(21.0f);
                float height2 = getHeight() / 2.0f;
                canvas.drawLine(gm.L(21.0f), height2, width2, height2, paint);
                double L5 = gm.L(9.0f) * max;
                float f2 = (float) (width2 - (0.7071067811865476d * L5));
                float f3 = (float) (L5 * 0.7071067811865475d);
                canvas2 = canvas;
                canvas2.drawLine(width2, height2, f2, height2 - f3, paint);
                canvas2.drawLine(width2, height2, f2, height2 + f3, paint);
            } else {
                canvas2 = canvas;
            }
        }
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.e.setHotspotBounds(0, 0, getWidth(), getHeight());
            this.e.draw(canvas2);
        }
    }

    @Override
    public void setBackgroundColor(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public void setColor(int i) {
        this.d.setColor(i);
        invalidate();
    }

    public void setDrawBackground(boolean z) {
        this.f = z;
    }

    public void setProgress(float f) {
        this.b = f;
        invalidate();
    }

    public void setRippleDrawable(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    public void setTransformType(int i) {
        this.h = i;
        invalidate();
    }

    @Override
    public final void updateColors() {
        Paint paint = this.c;
        try {
            if (paint.getColor() == this.a) {
                this.a = cmb.w0(null, cmb.O9, false);
                int color = paint.getColor();
                int i = this.a;
                if (color != i) {
                    paint.setColor(i);
                    invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            Drawable drawable2 = this.e;
            if (drawable2 == null || drawable != drawable2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
