package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
public final class hob extends bf0 {
    public Drawable H;
    public final boolean I;
    public float J;
    public float K;
    public final rob L;

    public hob(rob robVar, Activity activity) {
        super(activity);
        this.L = robVar;
        this.I = true;
    }

    @Override
    public Drawable getBackground() {
        return this.H;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.J = 0.0f;
        this.K = 0.0f;
        boolean z = this.I;
        rob robVar = this.L;
        if (z) {
            Drawable drawable = this.H;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof ah7)) {
                if (drawable instanceof BitmapDrawable) {
                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                        canvas.save();
                        float f = 2.0f / gm.p;
                        canvas.scale(f, f);
                        this.H.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                        this.H.draw(canvas);
                        canvas.restore();
                    } else {
                        int measuredHeight = getMeasuredHeight();
                        float max = Math.max(getMeasuredWidth() / this.H.getIntrinsicWidth(), measuredHeight / this.H.getIntrinsicHeight());
                        int ceil = (int) Math.ceil(this.H.getIntrinsicWidth() * max * robVar.A1);
                        int ceil2 = (int) Math.ceil(this.H.getIntrinsicHeight() * max * robVar.A1);
                        int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                        int i = (measuredHeight - ceil2) / 2;
                        this.K = i;
                        this.H.setBounds(measuredWidth, i, ceil + measuredWidth, ceil2 + i);
                        this.H.draw(canvas);
                    }
                }
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.H.draw(canvas);
            }
        }
        if (robVar.c2) {
            if (!robVar.c.isFinished() && robVar.c.computeScrollOffset()) {
                if (robVar.c.getStartX() < robVar.Y1 && robVar.c.getStartX() > 0) {
                    robVar.Z1 = robVar.c.getCurrX();
                }
                robVar.X0();
                invalidate();
            }
            canvas.save();
            float f2 = -robVar.Z1;
            this.J = f2;
            canvas.translate(f2, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (robVar.O1) {
            float f3 = robVar.p1;
            if (f3 > 0.0f) {
                canvas.drawColor(on2.p(-16777216, (int) (f3 * 255.0f * robVar.q1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        rob robVar = this.L;
        dtc dtcVar = robVar.x1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        dtcVar.getClass();
        float a = dtc.a(measuredWidth, measuredHeight);
        robVar.A1 = a;
        if (robVar.G1) {
            setScaleX(a);
            setScaleY(robVar.A1);
        }
        if (robVar.b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (robVar.d2 != measuredWidth2) {
            robVar.c2 = false;
            Bitmap bitmap = robVar.E1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / robVar.E1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    robVar.c2 = true;
                    robVar.b2 = (int) ((robVar.E1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    robVar.Z1 = measuredWidth3;
                    robVar.a2 = measuredWidth3;
                    robVar.Y1 = measuredWidth3 * 2.0f;
                    t(measuredHeight2, getMeasuredHeight());
                    this.w = true;
                    robVar.X0();
                }
            }
            if (!robVar.c2) {
                t(-1, -1);
                this.w = false;
            }
        }
        robVar.d2 = measuredWidth2;
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.H = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.H != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
