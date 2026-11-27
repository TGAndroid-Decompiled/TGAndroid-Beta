package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class z78 extends de0 {
    public final Paint H;
    public long I;
    public Drawable J;
    public Drawable K;
    public final d88 L;

    public z78(d88 d88Var, Context context) {
        super(context);
        this.L = d88Var;
        this.H = new Paint(1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        no6 no6Var;
        Drawable drawable;
        float floatValue;
        wl wlVar = this.e;
        if (wlVar != null) {
            imageReceiver = wlVar.k;
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
            d88 d88Var = this.L;
            if (d88Var.P) {
                this.b.h(canvas, null);
                if (d88Var.O == null) {
                    if (d88Var.N == null) {
                        npa npaVar = new npa();
                        d88Var.N = npaVar;
                        npaVar.h(vm2.o(-1, 82));
                    }
                    d88Var.N.setBounds(0, 0, getWidth(), getHeight());
                    d88Var.N.draw(canvas);
                }
                invalidate();
            }
            float f = d88Var.V;
            int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            Bitmap bitmap = d88Var.T;
            if (i3 != 0) {
                if (bitmap != null) {
                    Paint paint = this.H;
                    paint.setAlpha((int) (k43.f.getInterpolation(1.0f - f) * 255.0f));
                    canvas.drawBitmap(d88Var.T, 0.0f, 0.0f, paint);
                    long min = Math.min(16L, System.currentTimeMillis() - this.I);
                    Float f2 = d88Var.U;
                    if (f2 == null) {
                        floatValue = 250.0f;
                    } else {
                        floatValue = f2.floatValue();
                    }
                    d88Var.V = qu6.z((float) min, floatValue, d88Var.V, 1.0f);
                    this.I = System.currentTimeMillis();
                    invalidate();
                    if (d88Var.O != null) {
                        d88Var.b.invalidate();
                    }
                }
            } else if (bitmap != null) {
                bitmap.recycle();
                d88Var.T = null;
                d88Var.U = null;
                invalidate();
            }
            if (d88Var.s) {
                b88 b88Var = d88Var.W;
                if ((b88Var == null || !((u52) ((rd1) b88Var).b).s) && (no6Var = d88Var.I) != null && no6Var.i() && d88Var.I.d()) {
                    if (d88Var.I.j()) {
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
                    drawable.setBounds((int) (imageReceiver.L0 + hl.L(8.0f)), (int) (imageReceiver.M0 + hl.L(8.0f)), (int) (imageReceiver.L0 + hl.L(30.0f)), (int) (imageReceiver.M0 + hl.L(26.0f)));
                    drawable.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        d88 d88Var = this.L;
        no6 no6Var = d88Var.I;
        if (no6Var != null && no6Var.M) {
            z = true;
        } else {
            z = false;
        }
        d88Var.h(z);
    }
}
