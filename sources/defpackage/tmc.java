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
public final class tmc extends View {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final kjc I;
    public final Paint J;
    public final Rect K;
    public final boolean L;
    public final foc[] a;
    public final foc[] b;
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

    public tmc(Activity activity, TLRPC.User user, kjc kjcVar) {
        super(activity);
        Paint paint = new Paint(1);
        this.J = paint;
        this.K = new Rect();
        boolean e = i86.e(512);
        this.L = e;
        this.I = kjcVar;
        if (!e) {
            return;
        }
        this.a = new foc[]{new foc(user, this, hl.L(32.0f)), new foc(user, this, hl.L(28.0f)), new foc(user, this, hl.L(35.0f)), new foc(user, this, hl.L(28.0f)), new foc(user, this, hl.L(26.0f))};
        this.b = new foc[]{new foc(user, this, hl.L(32.0f)), new foc(user, this, hl.L(28.0f)), new foc(user, this, hl.L(35.0f)), new foc(user, this, hl.L(28.0f)), new foc(user, this, hl.L(26.0f))};
        kjcVar.a(this);
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onAttachedToWindow() {
        foc[] focVarArr;
        foc[] focVarArr2;
        super.onAttachedToWindow();
        if (this.L) {
            for (foc focVar : this.a) {
                ul ulVar = focVar.a;
                if (ulVar != null) {
                    ulVar.a();
                    ValueAnimator valueAnimator = focVar.b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (foc focVar2 : this.b) {
                ul ulVar2 = focVar2.a;
                if (ulVar2 != null) {
                    ulVar2.a();
                    ValueAnimator valueAnimator2 = focVar2.b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        foc[] focVarArr;
        foc[] focVarArr2;
        super.onDetachedFromWindow();
        if (this.L) {
            for (foc focVar : this.a) {
                ul ulVar = focVar.a;
                if (ulVar != null) {
                    ValueAnimator valueAnimator = focVar.b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        focVar.b = null;
                    }
                    ulVar.b();
                }
            }
            for (foc focVar2 : this.b) {
                ul ulVar2 = focVar2.a;
                if (ulVar2 != null) {
                    ValueAnimator valueAnimator2 = focVar2.b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        focVar2.b = null;
                    }
                    ulVar2.b();
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
        kjc kjcVar = this.I;
        kjcVar.d(x, y);
        int measuredWidth = getMeasuredWidth() / 2;
        foc[] focVarArr = this.a;
        focVarArr[0].b((measuredWidth - hl.L(120.0f)) - this.d, hl.L(120.0f) - this.r);
        focVarArr[1].b((measuredWidth - hl.L(180.0f)) - this.e, hl.L(150.0f) - this.s);
        focVarArr[2].b((measuredWidth - hl.L(150.0f)) - this.f, hl.L(185.0f) - this.w);
        focVarArr[3].b((measuredWidth - hl.L(176.0f)) - this.h, hl.L(240.0f) - this.x);
        focVarArr[4].b((measuredWidth - hl.L(130.0f)) - this.n, hl.L(265.0f) - this.y);
        for (foc focVar : focVarArr) {
            focVar.a(canvas);
        }
        foc[] focVarArr2 = this.b;
        focVarArr2[0].b(hl.L(50.0f) + measuredWidth + this.d, hl.L(120.0f) - this.r);
        focVarArr2[1].b(hl.L(110.0f) + measuredWidth + this.e, hl.L(150.0f) - this.s);
        focVarArr2[2].b(hl.L(80.0f) + measuredWidth + this.f, hl.L(185.0f) - this.w);
        focVarArr2[3].b(hl.L(106.0f) + measuredWidth + this.h, hl.L(240.0f) - this.x);
        focVarArr2[4].b(hl.L(60.0f) + measuredWidth + this.n, hl.L(265.0f) - this.y);
        for (foc focVar2 : focVarArr2) {
            focVar2.a(canvas);
        }
        int alpha = kjcVar.b().getAlpha();
        Paint paint = this.J;
        paint.setAlpha(255);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
        kjcVar.b().setAlpha(255);
        canvas.drawRect(rect, kjcVar.b());
        kjcVar.b().setAlpha(alpha);
        if (kjcVar.e) {
            int alpha2 = ((Paint) kjcVar.d.a).getAlpha();
            ((Paint) kjcVar.d.a).setAlpha(255);
            canvas.drawRect(rect, (Paint) kjcVar.d.a);
            ((Paint) kjcVar.d.a).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        foc[] focVarArr;
        foc[] focVarArr2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.L) {
            for (foc focVar : this.a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                focVar.o = measuredWidth;
                focVar.k.invalidate();
            }
            for (foc focVar2 : this.b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                focVar2.o = measuredWidth2;
                focVar2.k.invalidate();
            }
        }
    }

    public void setState(boolean z) {
        this.H = z;
        invalidate();
    }
}
