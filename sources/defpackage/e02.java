package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import java.util.HashSet;
public final class e02 extends View implements vlb {
    public LinearGradient E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public qm0 a;
    public qm0 b;
    public int c;
    public int d;
    public kz4 e;
    public int f;
    public int h;
    public final Paint n;
    public LinearGradient r;
    public LinearGradient s;
    public ylb w;
    public final Paint x;
    public LinearGradient y;

    public e02(Context context) {
        super(context);
        this.n = new Paint();
        this.x = new Paint();
    }

    public final void a() {
        this.a.setBounds(0, 0, getMeasuredWidth(), this.c);
        this.b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
        this.s = null;
        this.r = null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.f));
    }

    public final LinearGradient b(boolean z) {
        int i = this.h;
        int p = on2.p(i, (Color.alpha(i) << 1) / 3);
        int p2 = on2.p(this.h, 0);
        if (z) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, this.c, new int[]{i, p, p2}, new float[]{0.0f, 0.82f, 1.0f}, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, getMeasuredHeight() - this.d, 0.0f, getMeasuredHeight(), new int[]{p2, p, i}, new float[]{0.0f, 0.18f, 1.0f}, Shader.TileMode.CLAMP);
    }

    public final void c(km0 km0Var, nm0 nm0Var) {
        im0 c = km0Var.c(this, null, false);
        c.p(nm0Var);
        qm0 qm0Var = new qm0(c);
        this.a = qm0Var;
        qm0Var.b(-gm.L(30.0f), true);
        im0 c2 = km0Var.c(this, null, false);
        c2.p(nm0Var);
        qm0 qm0Var2 = new qm0(c2);
        this.b = qm0Var2;
        qm0Var2.b(gm.L(30.0f), true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (cmb.g1(this.w)) {
            int w0 = cmb.w0(null, cmb.Ba, false);
            int w02 = cmb.w0(null, cmb.Ca, false);
            int measuredHeight = getMeasuredHeight();
            if (this.y == null || this.G != w0 || this.F != w02 || this.H != this.c || this.I != this.d || this.J != measuredHeight) {
                this.G = w0;
                this.F = w02;
                this.H = this.c;
                this.I = this.d;
                this.J = measuredHeight;
                int[] iArr = {w0, w02, on2.p(w02, 0)};
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.y = new LinearGradient(0.0f, 0.0f, 0.0f, Math.max(1, this.c), iArr, new float[]{0.0f, 0.557f, 1.0f}, tileMode);
                this.E = new LinearGradient(0.0f, measuredHeight, 0.0f, measuredHeight - Math.max(1, this.d), iArr, new float[]{0.0f, 0.557f, 1.0f}, tileMode);
            }
            int i = this.c;
            Paint paint2 = this.x;
            if (i > 0 && this.a.H > 0) {
                paint2.setShader(this.y);
                paint2.setAlpha(this.a.H);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.c, paint2);
            }
            if (this.d > 0) {
                paint2.setShader(this.E);
                paint2.setAlpha(255);
                canvas2 = canvas;
                canvas2.drawRect(0.0f, measuredHeight - this.d, getMeasuredWidth(), measuredHeight, paint2);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
            this.a.draw(canvas2);
            this.b.draw(canvas2);
        }
        if (Color.alpha(this.h) != 0) {
            int i2 = this.c;
            Paint paint3 = this.n;
            if (i2 > 0 && this.a.H > 0) {
                LinearGradient linearGradient = this.r;
                if (linearGradient == null) {
                    linearGradient = b(true);
                    this.r = linearGradient;
                }
                paint3.setShader(linearGradient);
                paint3.setAlpha(this.a.H);
                paint = paint3;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.c, paint);
            } else {
                paint = paint3;
            }
            if (this.d > 0) {
                LinearGradient linearGradient2 = this.s;
                if (linearGradient2 == null) {
                    linearGradient2 = b(false);
                    this.s = linearGradient2;
                }
                paint.setShader(linearGradient2);
                paint.setAlpha(255);
                canvas.drawRect(0.0f, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    public void setFadeHeightBottom(int i) {
        this.b.b(i, true);
    }

    public void setFadeHeightTop(int i) {
        this.a.b(-i, true);
    }

    public void setFadeTopAlpha(int i) {
        qm0 qm0Var = this.a;
        if (qm0Var.H != i) {
            qm0Var.H = i;
            invalidate();
        }
    }

    public void setFadeZoneBottom(int i) {
        if (this.d != i) {
            this.d = i;
            a();
            invalidate();
        }
    }

    public void setFadeZoneTop(int i) {
        if (this.c != i) {
            this.c = i;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z) {
        this.a.G = z;
        this.b.G = z;
    }

    public void setOverlayColor(int i) {
        if (this.h != i) {
            this.h = i;
            this.s = null;
            this.r = null;
            invalidate();
        }
    }

    public void setResourcesProvider(ylb ylbVar) {
        this.w = ylbVar;
    }

    public void setup(km0 km0Var) {
        c(km0Var, null);
    }

    public void setupColorKey(int i) {
        this.f = i;
        if (this.e == null) {
            kz4 kz4Var = new kz4();
            this.e = kz4Var;
            kz4Var.a(cmb.w0(null, i, false));
            kz4 kz4Var2 = this.e;
            setup(new km0(kz4Var2, kz4Var2, kz4Var2));
        }
    }

    @Override
    public final void updateColors() {
        int i;
        kz4 kz4Var = this.e;
        if (kz4Var != null && (i = this.f) != -1) {
            kz4Var.a(cmb.w0(null, i, false));
            invalidate();
        }
    }
}
