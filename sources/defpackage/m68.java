package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class m68 extends bf0 {
    public final Paint H;
    public long I;
    public Drawable J;
    public Drawable K;
    public final q68 L;

    public m68(q68 q68Var, Context context) {
        super(context);
        this.L = q68Var;
        this.H = new Paint(1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        jo6 jo6Var;
        Drawable drawable;
        float floatValue;
        vm vmVar = this.e;
        if (vmVar != null) {
            imageReceiver = vmVar.k;
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
            q68 q68Var = this.L;
            if (q68Var.P) {
                this.b.h(canvas, null);
                if (q68Var.O == null) {
                    if (q68Var.N == null) {
                        rna rnaVar = new rna();
                        q68Var.N = rnaVar;
                        rnaVar.h(on2.p(-1, 82));
                    }
                    q68Var.N.setBounds(0, 0, getWidth(), getHeight());
                    q68Var.N.draw(canvas);
                }
                invalidate();
            }
            float f = q68Var.V;
            int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            Bitmap bitmap = q68Var.T;
            if (i3 != 0) {
                if (bitmap != null) {
                    Paint paint = this.H;
                    paint.setAlpha((int) (d53.f.getInterpolation(1.0f - f) * 255.0f));
                    canvas.drawBitmap(q68Var.T, 0.0f, 0.0f, paint);
                    long min = Math.min(16L, System.currentTimeMillis() - this.I);
                    Float f2 = q68Var.U;
                    if (f2 == null) {
                        floatValue = 250.0f;
                    } else {
                        floatValue = f2.floatValue();
                    }
                    q68Var.V = kt6.A((float) min, floatValue, q68Var.V, 1.0f);
                    this.I = System.currentTimeMillis();
                    invalidate();
                    if (q68Var.O != null) {
                        q68Var.b.invalidate();
                    }
                }
            } else if (bitmap != null) {
                bitmap.recycle();
                q68Var.T = null;
                q68Var.U = null;
                invalidate();
            }
            if (q68Var.s) {
                o68 o68Var = q68Var.W;
                if ((o68Var == null || !((p62) ((cd1) o68Var).b).s) && (jo6Var = q68Var.I) != null && jo6Var.i() && q68Var.I.d()) {
                    if (q68Var.I.j()) {
                        drawable = this.K;
                        if (drawable == null) {
                            drawable = getContext().getResources().getDrawable(2131231751).mutate();
                            this.K = drawable;
                        }
                    } else {
                        drawable = this.J;
                        if (drawable == null) {
                            drawable = getContext().getResources().getDrawable(2131231752).mutate();
                            this.J = drawable;
                        }
                    }
                    drawable.setBounds((int) (imageReceiver.L0 + gm.L(8.0f)), (int) (imageReceiver.M0 + gm.L(8.0f)), (int) (imageReceiver.L0 + gm.L(30.0f)), (int) (imageReceiver.M0 + gm.L(26.0f)));
                    drawable.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        q68 q68Var = this.L;
        jo6 jo6Var = q68Var.I;
        if (jo6Var != null && jo6Var.M) {
            z = true;
        } else {
            z = false;
        }
        q68Var.h(z);
    }
}
