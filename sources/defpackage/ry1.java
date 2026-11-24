package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import java.util.HashSet;
public final class ry1 extends View implements tjb {
    public LinearGradient E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public ql0 a;
    public ql0 b;
    public int c;
    public int d;
    public ix4 e;
    public int f;
    public int h;
    public final Paint n;
    public LinearGradient r;
    public LinearGradient s;
    public wjb w;
    public final Paint x;
    public LinearGradient y;

    public ry1(Context context) {
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
        int o = bm2.o(i, (Color.alpha(i) << 1) / 3);
        int o2 = bm2.o(this.h, 0);
        if (z) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, this.c, new int[]{i, o, o2}, new float[]{0.0f, 0.82f, 1.0f}, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, getMeasuredHeight() - this.d, 0.0f, getMeasuredHeight(), new int[]{o2, o, i}, new float[]{0.0f, 0.18f, 1.0f}, Shader.TileMode.CLAMP);
    }

    public final void c(kl0 kl0Var, nl0 nl0Var) {
        il0 c = kl0Var.c(this, null, false);
        c.p(nl0Var);
        ql0 ql0Var = new ql0(c);
        this.a = ql0Var;
        ql0Var.b(-gl.L(30.0f), true);
        il0 c2 = kl0Var.c(this, null, false);
        c2.p(nl0Var);
        ql0 ql0Var2 = new ql0(c2);
        this.b = ql0Var2;
        ql0Var2.b(gl.L(30.0f), true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (bkb.g1(this.w)) {
            int w0 = bkb.w0(null, bkb.Ba, false);
            int w02 = bkb.w0(null, bkb.Ca, false);
            int measuredHeight = getMeasuredHeight();
            if (this.y == null || this.G != w0 || this.F != w02 || this.H != this.c || this.I != this.d || this.J != measuredHeight) {
                this.G = w0;
                this.F = w02;
                this.H = this.c;
                this.I = this.d;
                this.J = measuredHeight;
                int[] iArr = {w0, w02, bm2.o(w02, 0)};
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
        ql0 ql0Var = this.a;
        if (ql0Var.H != i) {
            ql0Var.H = i;
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

    public void setResourcesProvider(wjb wjbVar) {
        this.w = wjbVar;
    }

    public void setup(kl0 kl0Var) {
        c(kl0Var, null);
    }

    public void setupColorKey(int i) {
        this.f = i;
        if (this.e == null) {
            ix4 ix4Var = new ix4();
            this.e = ix4Var;
            ix4Var.a(bkb.w0(null, i, false));
            ix4 ix4Var2 = this.e;
            setup(new kl0(ix4Var2, ix4Var2, ix4Var2));
        }
    }

    @Override
    public final void updateColors() {
        int i;
        ix4 ix4Var = this.e;
        if (ix4Var != null && (i = this.f) != -1) {
            ix4Var.a(bkb.w0(null, i, false));
            invalidate();
        }
    }
}
