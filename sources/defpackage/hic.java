package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class hic extends View {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final lfc I;
    public final Paint J;
    public final Rect K;
    public final boolean L;
    public final sjc[] a;
    public final sjc[] b;
    public ValueAnimator c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public hic(Activity activity, TLRPC.User user, lfc lfcVar) {
        super(activity);
        Paint paint = new Paint(1);
        this.J = paint;
        this.K = new Rect();
        boolean e = e66.e(512);
        this.L = e;
        this.I = lfcVar;
        if (!e) {
            return;
        }
        this.a = new sjc[]{new sjc(user, this, gl.L(32.0f)), new sjc(user, this, gl.L(28.0f)), new sjc(user, this, gl.L(35.0f)), new sjc(user, this, gl.L(28.0f)), new sjc(user, this, gl.L(26.0f))};
        this.b = new sjc[]{new sjc(user, this, gl.L(32.0f)), new sjc(user, this, gl.L(28.0f)), new sjc(user, this, gl.L(35.0f)), new sjc(user, this, gl.L(28.0f)), new sjc(user, this, gl.L(26.0f))};
        lfcVar.a(this);
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onAttachedToWindow() {
        sjc[] sjcVarArr;
        sjc[] sjcVarArr2;
        super.onAttachedToWindow();
        if (this.L) {
            for (sjc sjcVar : this.a) {
                tl tlVar = sjcVar.a;
                if (tlVar != null) {
                    tlVar.a();
                    ValueAnimator valueAnimator = sjcVar.b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (sjc sjcVar2 : this.b) {
                tl tlVar2 = sjcVar2.a;
                if (tlVar2 != null) {
                    tlVar2.a();
                    ValueAnimator valueAnimator2 = sjcVar2.b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        sjc[] sjcVarArr;
        sjc[] sjcVarArr2;
        super.onDetachedFromWindow();
        if (this.L) {
            for (sjc sjcVar : this.a) {
                tl tlVar = sjcVar.a;
                if (tlVar != null) {
                    ValueAnimator valueAnimator = sjcVar.b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        sjcVar.b = null;
                    }
                    tlVar.b();
                }
            }
            for (sjc sjcVar2 : this.b) {
                tl tlVar2 = sjcVar2.a;
                if (tlVar2 != null) {
                    ValueAnimator valueAnimator2 = sjcVar2.b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        sjcVar2.b = null;
                    }
                    tlVar2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.c;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.L || this.H) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        Rect rect = this.K;
        rect.set(0, 0, width, height);
        float x = getX();
        float y = getY();
        lfc lfcVar = this.I;
        lfcVar.d(x, y);
        int measuredWidth = getMeasuredWidth() / 2;
        sjc[] sjcVarArr = this.a;
        sjcVarArr[0].b((measuredWidth - gl.L(120.0f)) - this.d, gl.L(120.0f) - this.r);
        sjcVarArr[1].b((measuredWidth - gl.L(180.0f)) - this.e, gl.L(150.0f) - this.s);
        sjcVarArr[2].b((measuredWidth - gl.L(150.0f)) - this.f, gl.L(185.0f) - this.w);
        sjcVarArr[3].b((measuredWidth - gl.L(176.0f)) - this.h, gl.L(240.0f) - this.x);
        sjcVarArr[4].b((measuredWidth - gl.L(130.0f)) - this.n, gl.L(265.0f) - this.y);
        for (sjc sjcVar : sjcVarArr) {
            sjcVar.a(canvas);
        }
        sjc[] sjcVarArr2 = this.b;
        sjcVarArr2[0].b(gl.L(50.0f) + measuredWidth + this.d, gl.L(120.0f) - this.r);
        sjcVarArr2[1].b(gl.L(110.0f) + measuredWidth + this.e, gl.L(150.0f) - this.s);
        sjcVarArr2[2].b(gl.L(80.0f) + measuredWidth + this.f, gl.L(185.0f) - this.w);
        sjcVarArr2[3].b(gl.L(106.0f) + measuredWidth + this.h, gl.L(240.0f) - this.x);
        sjcVarArr2[4].b(gl.L(60.0f) + measuredWidth + this.n, gl.L(265.0f) - this.y);
        for (sjc sjcVar2 : sjcVarArr2) {
            sjcVar2.a(canvas);
        }
        int alpha = lfcVar.b().getAlpha();
        Paint paint = this.J;
        paint.setAlpha(255);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
        lfcVar.b().setAlpha(255);
        canvas.drawRect(rect, lfcVar.b());
        lfcVar.b().setAlpha(alpha);
        if (lfcVar.e) {
            int alpha2 = ((Paint) lfcVar.d.a).getAlpha();
            ((Paint) lfcVar.d.a).setAlpha(255);
            canvas.drawRect(rect, (Paint) lfcVar.d.a);
            ((Paint) lfcVar.d.a).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        sjc[] sjcVarArr;
        sjc[] sjcVarArr2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.L) {
            for (sjc sjcVar : this.a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                sjcVar.o = measuredWidth;
                sjcVar.k.invalidate();
            }
            for (sjc sjcVar2 : this.b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                sjcVar2.o = measuredWidth2;
                sjcVar2.k.invalidate();
            }
        }
    }

    public void setState(boolean z) {
        this.H = z;
        invalidate();
    }
}
