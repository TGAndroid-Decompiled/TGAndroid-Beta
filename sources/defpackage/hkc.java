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
public final class hkc extends View {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final lhc I;
    public final Paint J;
    public final Rect K;
    public final boolean L;
    public final slc[] a;
    public final slc[] b;
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

    public hkc(Activity activity, TLRPC.User user, lhc lhcVar) {
        super(activity);
        Paint paint = new Paint(1);
        this.J = paint;
        this.K = new Rect();
        boolean e = e86.e(512);
        this.L = e;
        this.I = lhcVar;
        if (!e) {
            return;
        }
        this.a = new slc[]{new slc(user, this, gm.L(32.0f)), new slc(user, this, gm.L(28.0f)), new slc(user, this, gm.L(35.0f)), new slc(user, this, gm.L(28.0f)), new slc(user, this, gm.L(26.0f))};
        this.b = new slc[]{new slc(user, this, gm.L(32.0f)), new slc(user, this, gm.L(28.0f)), new slc(user, this, gm.L(35.0f)), new slc(user, this, gm.L(28.0f)), new slc(user, this, gm.L(26.0f))};
        lhcVar.a(this);
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onAttachedToWindow() {
        slc[] slcVarArr;
        slc[] slcVarArr2;
        super.onAttachedToWindow();
        if (this.L) {
            for (slc slcVar : this.a) {
                tm tmVar = slcVar.a;
                if (tmVar != null) {
                    tmVar.a();
                    ValueAnimator valueAnimator = slcVar.b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (slc slcVar2 : this.b) {
                tm tmVar2 = slcVar2.a;
                if (tmVar2 != null) {
                    tmVar2.a();
                    ValueAnimator valueAnimator2 = slcVar2.b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        slc[] slcVarArr;
        slc[] slcVarArr2;
        super.onDetachedFromWindow();
        if (this.L) {
            for (slc slcVar : this.a) {
                tm tmVar = slcVar.a;
                if (tmVar != null) {
                    ValueAnimator valueAnimator = slcVar.b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        slcVar.b = null;
                    }
                    tmVar.b();
                }
            }
            for (slc slcVar2 : this.b) {
                tm tmVar2 = slcVar2.a;
                if (tmVar2 != null) {
                    ValueAnimator valueAnimator2 = slcVar2.b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        slcVar2.b = null;
                    }
                    tmVar2.b();
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
        lhc lhcVar = this.I;
        lhcVar.d(x, y);
        int measuredWidth = getMeasuredWidth() / 2;
        slc[] slcVarArr = this.a;
        slcVarArr[0].b((measuredWidth - gm.L(120.0f)) - this.d, gm.L(120.0f) - this.r);
        slcVarArr[1].b((measuredWidth - gm.L(180.0f)) - this.e, gm.L(150.0f) - this.s);
        slcVarArr[2].b((measuredWidth - gm.L(150.0f)) - this.f, gm.L(185.0f) - this.w);
        slcVarArr[3].b((measuredWidth - gm.L(176.0f)) - this.h, gm.L(240.0f) - this.x);
        slcVarArr[4].b((measuredWidth - gm.L(130.0f)) - this.n, gm.L(265.0f) - this.y);
        for (slc slcVar : slcVarArr) {
            slcVar.a(canvas);
        }
        slc[] slcVarArr2 = this.b;
        slcVarArr2[0].b(gm.L(50.0f) + measuredWidth + this.d, gm.L(120.0f) - this.r);
        slcVarArr2[1].b(gm.L(110.0f) + measuredWidth + this.e, gm.L(150.0f) - this.s);
        slcVarArr2[2].b(gm.L(80.0f) + measuredWidth + this.f, gm.L(185.0f) - this.w);
        slcVarArr2[3].b(gm.L(106.0f) + measuredWidth + this.h, gm.L(240.0f) - this.x);
        slcVarArr2[4].b(gm.L(60.0f) + measuredWidth + this.n, gm.L(265.0f) - this.y);
        for (slc slcVar2 : slcVarArr2) {
            slcVar2.a(canvas);
        }
        int alpha = lhcVar.b().getAlpha();
        Paint paint = this.J;
        paint.setAlpha(255);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
        lhcVar.b().setAlpha(255);
        canvas.drawRect(rect, lhcVar.b());
        lhcVar.b().setAlpha(alpha);
        if (lhcVar.e) {
            int alpha2 = ((Paint) lhcVar.d.a).getAlpha();
            ((Paint) lhcVar.d.a).setAlpha(255);
            canvas.drawRect(rect, (Paint) lhcVar.d.a);
            ((Paint) lhcVar.d.a).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        slc[] slcVarArr;
        slc[] slcVarArr2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.L) {
            for (slc slcVar : this.a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                slcVar.o = measuredWidth;
                slcVar.k.invalidate();
            }
            for (slc slcVar2 : this.b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                slcVar2.o = measuredWidth2;
                slcVar2.k.invalidate();
            }
        }
    }

    public void setState(boolean z) {
        this.H = z;
        invalidate();
    }
}
