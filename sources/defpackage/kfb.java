package defpackage;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
public final class kfb extends e23 {
    public final ArrayList b;
    public final RuntimeShader c;
    public RenderEffect d;
    public int e;
    public int f;
    public int g;
    public float h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public final float[] l;

    public kfb(View view) {
        super(view);
        this.b = new ArrayList();
        this.i = new float[7];
        this.j = new float[7];
        this.k = new float[7];
        this.l = new float[7];
        RuntimeShader b = fn3.b(hl.v2(null, 2131624236));
        this.c = b;
        h(true);
        this.d = RenderEffect.createRuntimeShaderEffect(b, "img");
    }

    public final void h(boolean z) {
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        RoundedCorner roundedCorner4;
        float f;
        float radius;
        float f2;
        View view = (View) this.a;
        if (!z && this.f == view.getWidth() && this.g == view.getHeight() && Math.abs(this.h - hl.p) <= 0.01f) {
            return;
        }
        RuntimeShader runtimeShader = this.c;
        int width = view.getWidth();
        this.f = width;
        int height = view.getHeight();
        this.g = height;
        runtimeShader.setFloatUniform("size", width, height);
        RuntimeShader runtimeShader2 = this.c;
        float f3 = hl.p;
        this.h = f3;
        runtimeShader2.setFloatUniform("density", f3);
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            roundedCorner4 = null;
            roundedCorner = null;
            roundedCorner2 = null;
            roundedCorner3 = null;
        } else {
            roundedCorner = rootWindowInsets.getRoundedCorner(0);
            roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
            roundedCorner3 = rootWindowInsets.getRoundedCorner(3);
            roundedCorner4 = rootWindowInsets.getRoundedCorner(2);
        }
        RuntimeShader runtimeShader3 = this.c;
        float f4 = 0.0f;
        if (roundedCorner4 != null && (view == view.getRootView() || hl.n <= 0)) {
            f = roundedCorner4.getRadius();
        } else {
            f = 0.0f;
        }
        if (roundedCorner2 == null) {
            radius = 0.0f;
        } else {
            radius = roundedCorner2.getRadius();
        }
        if (roundedCorner3 != null && (view == view.getRootView() || hl.n <= 0)) {
            f2 = roundedCorner3.getRadius();
        } else {
            f2 = 0.0f;
        }
        if (roundedCorner != null) {
            f4 = roundedCorner.getRadius();
        }
        runtimeShader3.setFloatUniform("radius", f, radius, f2, f4);
    }

    public final void i() {
        RenderEffect renderEffect;
        boolean z;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        boolean z2;
        boolean z3;
        boolean z4;
        View view = (View) this.a;
        ArrayList arrayList = this.b;
        boolean z5 = false;
        if (!arrayList.isEmpty()) {
            boolean z6 = true;
            if (this.e != Math.min(7, arrayList.size())) {
                z = true;
            } else {
                z = false;
            }
            this.e = Math.min(7, arrayList.size());
            int i = 0;
            while (true) {
                int i2 = this.e;
                fArr = this.l;
                fArr2 = this.k;
                fArr3 = this.j;
                fArr4 = this.i;
                if (i >= i2) {
                    break;
                }
                jfb jfbVar = (jfb) arrayList.get(i);
                if (!z && Math.abs(fArr4[i] - jfbVar.d) <= 0.001f) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                float f = jfbVar.d;
                float f2 = jfbVar.c;
                float f3 = jfbVar.b;
                float f4 = jfbVar.a;
                fArr4[i] = f;
                if (!z2 && Math.abs(fArr3[i] - f4) <= 0.001f) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                fArr3[i] = f4;
                if (!z3 && Math.abs(fArr2[i] - f3) <= 0.001f) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                fArr2[i] = f3;
                if (!z4 && Math.abs(fArr[i] - f2) <= 0.001f) {
                    z = false;
                } else {
                    z = true;
                }
                fArr[i] = f2;
                i++;
            }
            if (!z && this.f == view.getWidth() && this.g == view.getHeight() && Math.abs(this.h - hl.p) <= 0.01f) {
                z6 = false;
            }
            if (z6) {
                this.c.setIntUniform("count", this.e);
                this.c.setFloatUniform("t", fArr4);
                this.c.setFloatUniform("centerX", fArr3);
                this.c.setFloatUniform("centerY", fArr2);
                this.c.setFloatUniform("intensity", fArr);
                h(false);
                this.d = RenderEffect.createRuntimeShaderEffect(this.c, "img");
            }
            z5 = z6;
        }
        if (arrayList.isEmpty()) {
            renderEffect = null;
        } else {
            renderEffect = this.d;
        }
        view.setRenderEffect(renderEffect);
        if (z5) {
            view.invalidate();
        }
    }
}
