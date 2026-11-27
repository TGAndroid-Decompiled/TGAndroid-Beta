package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
public class k38 extends View {
    public final Paint E;
    public boolean F;
    public boolean G;
    public int a;
    public final vnb b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    public final ll h;
    public final ll n;
    public int r;
    public int s;
    public int w;
    public int x;
    public RadialGradient y;

    public k38(Context context, vnb vnbVar) {
        super(context);
        this.c = 0.0f;
        k43 k43Var = k43.h;
        this.h = new ll(this, 350L, k43Var);
        this.n = new ll(this, 350L, k43Var);
        this.E = new Paint(1);
        this.b = vnbVar;
        this.a = aob.v0(aob.s8, vnbVar);
        b(-1, -1, false);
    }

    public final void b(int i, int i2, boolean z) {
        lc7 lc7Var;
        kc7 kc7Var = null;
        if (i2 >= 0 && i >= 0 && (lc7Var = uc7.s1(i).F3) != null) {
            kc7Var = lc7Var.d(i2);
        }
        c(kc7Var, z);
    }

    public final void c(kc7 kc7Var, boolean z) {
        boolean o;
        this.d = false;
        vnb vnbVar = this.b;
        if (kc7Var == null) {
            this.d = true;
            int v0 = aob.v0(aob.s8, vnbVar);
            this.f = v0;
            this.e = v0;
        } else {
            if (vnbVar != null) {
                o = vnbVar.a();
            } else {
                o = aob.I.o();
            }
            this.e = kc7Var.c(o);
            this.f = kc7Var.d(o);
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
        ll llVar = this.n;
        ll llVar2 = this.h;
        if (z && (this.e != (v0 = aob.v0(aob.s8, this.b)) || this.f != v0)) {
            this.f = v0;
            this.e = v0;
            llVar2.a(v0, true);
            llVar.a(v0, true);
        }
        int a = llVar2.a(this.e, false);
        int a2 = llVar.a(this.f, false);
        RadialGradient radialGradient = this.y;
        Paint paint = this.E;
        if (radialGradient == null || this.r != a || this.s != a2 || this.w != getWidth() || this.x != getHeight()) {
            this.w = getWidth();
            this.x = getHeight();
            float f = this.w;
            float f2 = f / 2.0f;
            float f3 = this.x;
            float f4 = f3 * 0.4f;
            Typeface typeface = hl.a;
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
        int i2 = aob.v8;
        vnb vnbVar = this.b;
        int v0 = aob.v0(i2, vnbVar);
        if (this.d) {
            i = aob.v0(i2, vnbVar);
        } else {
            i = -1;
        }
        return vm2.f(this.c, v0, i);
    }

    public int getColor() {
        return vm2.f(this.c, aob.v0(aob.s8, this.b), vm2.f(0.75f, this.h.c, this.n.c));
    }

    public int getTabsViewBackgroundColor() {
        int a;
        int a2;
        int i = aob.s8;
        vnb vnbVar = this.b;
        if (hl.B(aob.v0(i, vnbVar)) > 0.721f) {
            a = aob.v0(aob.v8, vnbVar);
        } else {
            a = aob.a(0.08f, -0.08f, aob.v0(i, vnbVar));
        }
        ll llVar = this.h;
        int i2 = llVar.c;
        ll llVar2 = this.n;
        if (hl.B(vm2.f(0.75f, i2, llVar2.c)) > 0.721f) {
            a2 = aob.v0(aob.v6, vnbVar);
        } else {
            a2 = aob.a(0.08f, -0.08f, vm2.f(0.75f, llVar.c, llVar2.c));
        }
        return vm2.f(this.c, a, a2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (!this.G) {
            i2 = ik8.E(230.0f, hl.m, 1073741824);
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
