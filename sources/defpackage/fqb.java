package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
public final class fqb extends de0 {
    public Drawable H;
    public final boolean I;
    public float J;
    public float K;
    public final pqb L;

    public fqb(pqb pqbVar, Activity activity) {
        super(activity);
        this.L = pqbVar;
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
        pqb pqbVar = this.L;
        if (z) {
            Drawable drawable = this.H;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof ih7)) {
                if (drawable instanceof BitmapDrawable) {
                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                        canvas.save();
                        float f = 2.0f / hl.p;
                        canvas.scale(f, f);
                        this.H.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                        this.H.draw(canvas);
                        canvas.restore();
                    } else {
                        int measuredHeight = getMeasuredHeight();
                        float max = Math.max(getMeasuredWidth() / this.H.getIntrinsicWidth(), measuredHeight / this.H.getIntrinsicHeight());
                        int ceil = (int) Math.ceil(this.H.getIntrinsicWidth() * max * pqbVar.A1);
                        int ceil2 = (int) Math.ceil(this.H.getIntrinsicHeight() * max * pqbVar.A1);
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
        if (pqbVar.c2) {
            if (!pqbVar.c.isFinished() && pqbVar.c.computeScrollOffset()) {
                if (pqbVar.c.getStartX() < pqbVar.Y1 && pqbVar.c.getStartX() > 0) {
                    pqbVar.Z1 = pqbVar.c.getCurrX();
                }
                pqbVar.X0();
                invalidate();
            }
            canvas.save();
            float f2 = -pqbVar.Z1;
            this.J = f2;
            canvas.translate(f2, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (pqbVar.O1) {
            float f3 = pqbVar.p1;
            if (f3 > 0.0f) {
                canvas.drawColor(vm2.o(-16777216, (int) (f3 * 255.0f * pqbVar.q1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        pqb pqbVar = this.L;
        pvc pvcVar = pqbVar.x1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        pvcVar.getClass();
        float a = pvc.a(measuredWidth, measuredHeight);
        pqbVar.A1 = a;
        if (pqbVar.G1) {
            setScaleX(a);
            setScaleY(pqbVar.A1);
        }
        if (pqbVar.b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (pqbVar.d2 != measuredWidth2) {
            pqbVar.c2 = false;
            Bitmap bitmap = pqbVar.E1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / pqbVar.E1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    pqbVar.c2 = true;
                    pqbVar.b2 = (int) ((pqbVar.E1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    pqbVar.Z1 = measuredWidth3;
                    pqbVar.a2 = measuredWidth3;
                    pqbVar.Y1 = measuredWidth3 * 2.0f;
                    t(measuredHeight2, getMeasuredHeight());
                    this.w = true;
                    pqbVar.X0();
                }
            }
            if (!pqbVar.c2) {
                t(-1, -1);
                this.w = false;
            }
        }
        pqbVar.d2 = measuredWidth2;
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
