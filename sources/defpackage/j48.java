package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class j48 extends be0 {
    public final Paint H;
    public long I;
    public Drawable J;
    public Drawable K;
    public final o48 L;

    public j48(o48 o48Var, Context context) {
        super(context);
        this.L = o48Var;
        this.H = new Paint(1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        jm6 jm6Var;
        Drawable drawable;
        float floatValue;
        vl vlVar = this.e;
        if (vlVar != null) {
            imageReceiver = vlVar.k;
        } else {
            imageReceiver = this.a;
        }
        if (imageReceiver != null) {
            if (this.c != -1 && this.d != -1) {
                int height = getHeight();
                int i = this.d;
                imageReceiver.i0((getWidth() - this.c) / 2, (height - i) / 2, this.c, i);
                int height2 = getHeight();
                int i2 = this.d;
                this.b.i0((getWidth() - this.c) / 2, (height2 - i2) / 2, this.c, i2);
            } else {
                imageReceiver.i0(0.0f, 0.0f, getWidth(), getHeight());
                this.b.i0(0.0f, 0.0f, getWidth(), getHeight());
            }
            imageReceiver.h(canvas, null);
            o48 o48Var = this.L;
            if (o48Var.P) {
                this.b.h(canvas, null);
                if (o48Var.O == null) {
                    if (o48Var.N == null) {
                        qla qlaVar = new qla();
                        o48Var.N = qlaVar;
                        qlaVar.h(bm2.o(-1, 82));
                    }
                    o48Var.N.setBounds(0, 0, getWidth(), getHeight());
                    o48Var.N.draw(canvas);
                }
                invalidate();
            }
            float f = o48Var.V;
            int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            Bitmap bitmap = o48Var.T;
            if (i3 != 0) {
                if (bitmap != null) {
                    Paint paint = this.H;
                    paint.setAlpha((int) (s33.f.getInterpolation(1.0f - f) * 255.0f));
                    canvas.drawBitmap(o48Var.T, 0.0f, 0.0f, paint);
                    long min = Math.min(16L, System.currentTimeMillis() - this.I);
                    Float f2 = o48Var.U;
                    if (f2 == null) {
                        floatValue = 250.0f;
                    } else {
                        floatValue = f2.floatValue();
                    }
                    o48Var.V = ls6.z((float) min, floatValue, o48Var.V, 1.0f);
                    this.I = System.currentTimeMillis();
                    invalidate();
                    if (o48Var.O != null) {
                        o48Var.b.invalidate();
                    }
                }
            } else if (bitmap != null) {
                bitmap.recycle();
                o48Var.T = null;
                o48Var.U = null;
                invalidate();
            }
            if (o48Var.s) {
                m48 m48Var = o48Var.W;
                if ((m48Var == null || !((e52) ((rh1) m48Var).b).s) && (jm6Var = o48Var.I) != null && jm6Var.i() && o48Var.I.d()) {
                    if (o48Var.I.j()) {
                        drawable = this.K;
                        if (drawable == null) {
                            drawable = getContext().getResources().getDrawable(2131231750).mutate();
                            this.K = drawable;
                        }
                    } else {
                        drawable = this.J;
                        if (drawable == null) {
                            drawable = getContext().getResources().getDrawable(2131231751).mutate();
                            this.J = drawable;
                        }
                    }
                    drawable.setBounds((int) (imageReceiver.L0 + gl.L(8.0f)), (int) (imageReceiver.M0 + gl.L(8.0f)), (int) (imageReceiver.L0 + gl.L(30.0f)), (int) (imageReceiver.M0 + gl.L(26.0f)));
                    drawable.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        o48 o48Var = this.L;
        jm6 jm6Var = o48Var.I;
        if (jm6Var != null && jm6Var.M) {
            z = true;
        } else {
            z = false;
        }
        o48Var.h(z);
    }
}
