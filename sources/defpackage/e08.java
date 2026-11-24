package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
public class e08 extends View {
    public final Paint E;
    public boolean F;
    public boolean G;
    public int a;
    public final wjb b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    public final kl h;
    public final kl n;
    public int r;
    public int s;
    public int w;
    public int x;
    public RadialGradient y;

    public e08(Context context, wjb wjbVar) {
        super(context);
        this.c = 0.0f;
        s33 s33Var = s33.h;
        this.h = new kl(this, 350L, s33Var);
        this.n = new kl(this, 350L, s33Var);
        this.E = new Paint(1);
        this.b = wjbVar;
        this.a = bkb.v0(bkb.r8, wjbVar);
        b(-1, -1, false);
    }

    public final void b(int i, int i2, boolean z) {
        ea7 ea7Var;
        da7 da7Var = null;
        if (i2 >= 0 && i >= 0 && (ea7Var = na7.q1(i).F3) != null) {
            da7Var = ea7Var.d(i2);
        }
        c(da7Var, z);
    }

    public final void c(da7 da7Var, boolean z) {
        boolean o;
        this.d = false;
        wjb wjbVar = this.b;
        if (da7Var == null) {
            this.d = true;
            int v0 = bkb.v0(bkb.r8, wjbVar);
            this.f = v0;
            this.e = v0;
        } else {
            if (wjbVar != null) {
                o = wjbVar.a();
            } else {
                o = bkb.I.o();
            }
            this.e = da7Var.c(o);
            this.f = da7Var.d(o);
        }
        if (!z) {
            this.h.a(this.e, true);
            this.n.a(this.f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        int v0;
        boolean z = this.d;
        kl klVar = this.n;
        kl klVar2 = this.h;
        if (z && (this.e != (v0 = bkb.v0(bkb.r8, this.b)) || this.f != v0)) {
            this.f = v0;
            this.e = v0;
            klVar2.a(v0, true);
            klVar.a(v0, true);
        }
        int a = klVar2.a(this.e, false);
        int a2 = klVar.a(this.f, false);
        RadialGradient radialGradient = this.y;
        Paint paint = this.E;
        if (radialGradient == null || this.r != a || this.s != a2 || this.w != getWidth() || this.x != getHeight()) {
            this.w = getWidth();
            this.x = getHeight();
            float f = this.w;
            float f2 = f / 2.0f;
            float f3 = this.x;
            float f4 = f3 * 0.4f;
            Typeface typeface = gl.a;
            float f5 = f - 0.0f;
            float f6 = f3 - 0.0f;
            this.s = a2;
            this.r = a;
            RadialGradient radialGradient2 = new RadialGradient(f2, f4, ((float) Math.sqrt((f6 * f6) + (f5 * f5))) * 0.75f, new int[]{a2, a}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.y = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.c < 1.0f && !this.F) {
            canvas2 = canvas;
            canvas2.drawColor(this.a);
        } else {
            canvas2 = canvas;
        }
        if (this.F) {
            i = 255;
        } else {
            i = (int) (this.c * 255.0f);
        }
        paint.setAlpha(i);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i;
        int i2 = bkb.u8;
        wjb wjbVar = this.b;
        int v0 = bkb.v0(i2, wjbVar);
        if (this.d) {
            i = bkb.v0(i2, wjbVar);
        } else {
            i = -1;
        }
        return bm2.f(this.c, v0, i);
    }

    public int getColor() {
        return bm2.f(this.c, bkb.v0(bkb.r8, this.b), bm2.f(0.75f, this.h.c, this.n.c));
    }

    public int getTabsViewBackgroundColor() {
        int a;
        int a2;
        int i = bkb.r8;
        wjb wjbVar = this.b;
        if (gl.B(bkb.v0(i, wjbVar)) > 0.721f) {
            a = bkb.v0(bkb.u8, wjbVar);
        } else {
            a = bkb.a(0.08f, -0.08f, bkb.v0(i, wjbVar));
        }
        kl klVar = this.h;
        int i2 = klVar.c;
        kl klVar2 = this.n;
        if (gl.B(bm2.f(0.75f, i2, klVar2.c)) > 0.721f) {
            a2 = bkb.v0(bkb.u6, wjbVar);
        } else {
            a2 = bkb.a(0.08f, -0.08f, bm2.f(0.75f, klVar.c, klVar2.c));
        }
        return bm2.f(this.c, a, a2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (!this.G) {
            i2 = ug8.E(230.0f, gl.m, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setProgressToGradient(float f) {
        if (Math.abs(this.c - f) > 0.001f) {
            this.c = f;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
