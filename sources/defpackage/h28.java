package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
public class h28 extends View {
    public final Paint E;
    public boolean F;
    public boolean G;
    public int a;
    public final ylb b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    public final km h;
    public final km n;
    public int r;
    public int s;
    public int w;
    public int x;
    public RadialGradient y;

    public h28(Context context, ylb ylbVar) {
        super(context);
        this.c = 0.0f;
        d53 d53Var = d53.h;
        this.h = new km(this, 350L, d53Var);
        this.n = new km(this, 350L, d53Var);
        this.E = new Paint(1);
        this.b = ylbVar;
        this.a = cmb.v0(cmb.r8, ylbVar);
        b(-1, -1, false);
    }

    public final void b(int i, int i2, boolean z) {
        fc7 fc7Var;
        ec7 ec7Var = null;
        if (i2 >= 0 && i >= 0 && (fc7Var = oc7.r1(i).F3) != null) {
            ec7Var = fc7Var.d(i2);
        }
        c(ec7Var, z);
    }

    public final void c(ec7 ec7Var, boolean z) {
        boolean o;
        this.d = false;
        ylb ylbVar = this.b;
        if (ec7Var == null) {
            this.d = true;
            int v0 = cmb.v0(cmb.r8, ylbVar);
            this.f = v0;
            this.e = v0;
        } else {
            if (ylbVar != null) {
                o = ylbVar.a();
            } else {
                o = cmb.I.o();
            }
            this.e = ec7Var.c(o);
            this.f = ec7Var.d(o);
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
        km kmVar = this.n;
        km kmVar2 = this.h;
        if (z && (this.e != (v0 = cmb.v0(cmb.r8, this.b)) || this.f != v0)) {
            this.f = v0;
            this.e = v0;
            kmVar2.a(v0, true);
            kmVar.a(v0, true);
        }
        int a = kmVar2.a(this.e, false);
        int a2 = kmVar.a(this.f, false);
        RadialGradient radialGradient = this.y;
        Paint paint = this.E;
        if (radialGradient == null || this.r != a || this.s != a2 || this.w != getWidth() || this.x != getHeight()) {
            this.w = getWidth();
            this.x = getHeight();
            float f = this.w;
            float f2 = f / 2.0f;
            float f3 = this.x;
            float f4 = f3 * 0.4f;
            Typeface typeface = gm.a;
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
        int i2 = cmb.u8;
        ylb ylbVar = this.b;
        int v0 = cmb.v0(i2, ylbVar);
        if (this.d) {
            i = cmb.v0(i2, ylbVar);
        } else {
            i = -1;
        }
        return on2.f(this.c, v0, i);
    }

    public int getColor() {
        return on2.f(this.c, cmb.v0(cmb.r8, this.b), on2.f(0.75f, this.h.c, this.n.c));
    }

    public int getTabsViewBackgroundColor() {
        int a;
        int a2;
        int i = cmb.r8;
        ylb ylbVar = this.b;
        if (gm.B(cmb.v0(i, ylbVar)) > 0.721f) {
            a = cmb.v0(cmb.u8, ylbVar);
        } else {
            a = cmb.a(0.08f, -0.08f, cmb.v0(i, ylbVar));
        }
        km kmVar = this.h;
        int i2 = kmVar.c;
        km kmVar2 = this.n;
        if (gm.B(on2.f(0.75f, i2, kmVar2.c)) > 0.721f) {
            a2 = cmb.v0(cmb.u6, ylbVar);
        } else {
            a2 = cmb.a(0.08f, -0.08f, on2.f(0.75f, kmVar.c, kmVar2.c));
        }
        return on2.f(this.c, a, a2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (!this.G) {
            i2 = wi8.E(230.0f, gm.m, 1073741824);
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
