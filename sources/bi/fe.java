package bi;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
public final class fe extends b1 {
    public final ArrayList f3898b;
    public final RuntimeShader f3899c;
    public RenderEffect d;
    public int f3900e;
    public int f3901f;
    public int f3902g;
    public float h;
    public final float[] f3903i;
    public final float[] f3904j;
    public final float[] f3905k;
    public final float[] f3906l;

    public fe(View view) {
        super(view);
        this.f3898b = new ArrayList();
        this.f3903i = new float[7];
        this.f3904j = new float[7];
        this.f3905k = new float[7];
        this.f3906l = new float[7];
        RuntimeShader runtimeShader = new RuntimeShader(org.telegram.messenger.g0.y2(null, 2131624241));
        this.f3899c = runtimeShader;
        e1(true);
        this.d = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
    }

    public final void e1(boolean z9) {
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        float f10;
        float radius;
        float f11;
        View view = (View) this.f3500a;
        if (!z9 && this.f3901f == view.getWidth() && this.f3902g == view.getHeight() && Math.abs(this.h - org.telegram.messenger.g0.f22536p) <= 0.01f) {
            return;
        }
        RuntimeShader runtimeShader = this.f3899c;
        int width = view.getWidth();
        this.f3901f = width;
        int height = view.getHeight();
        this.f3902g = height;
        runtimeShader.setFloatUniform("size", width, height);
        RuntimeShader runtimeShader2 = this.f3899c;
        float f12 = org.telegram.messenger.g0.f22536p;
        this.h = f12;
        runtimeShader2.setFloatUniform("density", f12);
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        RoundedCorner roundedCorner4 = null;
        if (rootWindowInsets == null) {
            roundedCorner = null;
        } else {
            roundedCorner = rootWindowInsets.getRoundedCorner(0);
        }
        if (rootWindowInsets == null) {
            roundedCorner2 = null;
        } else {
            roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
        }
        if (rootWindowInsets == null) {
            roundedCorner3 = null;
        } else {
            roundedCorner3 = rootWindowInsets.getRoundedCorner(3);
        }
        if (rootWindowInsets != null) {
            roundedCorner4 = rootWindowInsets.getRoundedCorner(2);
        }
        RuntimeShader runtimeShader3 = this.f3899c;
        float f13 = 0.0f;
        if (roundedCorner4 != null && (view == view.getRootView() || org.telegram.messenger.g0.f22532n <= 0)) {
            f10 = roundedCorner4.getRadius();
        } else {
            f10 = 0.0f;
        }
        if (roundedCorner2 == null) {
            radius = 0.0f;
        } else {
            radius = roundedCorner2.getRadius();
        }
        if (roundedCorner3 != null && (view == view.getRootView() || org.telegram.messenger.g0.f22532n <= 0)) {
            f11 = roundedCorner3.getRadius();
        } else {
            f11 = 0.0f;
        }
        if (roundedCorner != null) {
            f13 = roundedCorner.getRadius();
        }
        runtimeShader3.setFloatUniform("radius", f10, radius, f11, f13);
    }

    public final void f1() {
        RenderEffect renderEffect;
        boolean z9;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        boolean z10;
        boolean z11;
        boolean z12;
        View view = (View) this.f3500a;
        ArrayList arrayList = this.f3898b;
        boolean z13 = false;
        if (!arrayList.isEmpty()) {
            boolean z14 = true;
            if (this.f3900e != Math.min(7, arrayList.size())) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f3900e = Math.min(7, arrayList.size());
            int i7 = 0;
            while (true) {
                int i10 = this.f3900e;
                fArr = this.f3906l;
                fArr2 = this.f3905k;
                fArr3 = this.f3904j;
                fArr4 = this.f3903i;
                if (i7 >= i10) {
                    break;
                }
                ee eeVar = (ee) arrayList.get(i7);
                if (!z9 && Math.abs(fArr4[i7] - eeVar.d) <= 0.001f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                float f10 = eeVar.d;
                float f11 = eeVar.f3838c;
                float f12 = eeVar.f3837b;
                float f13 = eeVar.f3836a;
                fArr4[i7] = f10;
                if (!z10 && Math.abs(fArr3[i7] - f13) <= 0.001f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                fArr3[i7] = f13;
                if (!z11 && Math.abs(fArr2[i7] - f12) <= 0.001f) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                fArr2[i7] = f12;
                if (!z12 && Math.abs(fArr[i7] - f11) <= 0.001f) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                fArr[i7] = f11;
                i7++;
            }
            if (!z9 && this.f3901f == view.getWidth() && this.f3902g == view.getHeight() && Math.abs(this.h - org.telegram.messenger.g0.f22536p) <= 0.01f) {
                z14 = false;
            }
            if (z14) {
                this.f3899c.setIntUniform("count", this.f3900e);
                this.f3899c.setFloatUniform("t", fArr4);
                this.f3899c.setFloatUniform("centerX", fArr3);
                this.f3899c.setFloatUniform("centerY", fArr2);
                this.f3899c.setFloatUniform("intensity", fArr);
                e1(false);
                this.d = RenderEffect.createRuntimeShaderEffect(this.f3899c, "img");
            }
            z13 = z14;
        }
        if (arrayList.isEmpty()) {
            renderEffect = null;
        } else {
            renderEffect = this.d;
        }
        view.setRenderEffect(renderEffect);
        if (z13) {
            view.invalidate();
        }
    }
}
