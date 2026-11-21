package di;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
public final class oc extends com.google.android.gms.common.api.q {
    public final ArrayList f9500b;
    public final RuntimeShader f9501c;
    public RenderEffect d;
    public int f9502e;
    public int f9503f;
    public int f9504g;
    public float h;
    public final float[] f9505i;
    public final float[] f9506j;
    public final float[] f9507k;
    public final float[] f9508l;

    public oc(View view) {
        super(view);
        this.f9500b = new ArrayList();
        this.f9505i = new float[7];
        this.f9506j = new float[7];
        this.f9507k = new float[7];
        this.f9508l = new float[7];
        RuntimeShader runtimeShader = new RuntimeShader(org.telegram.messenger.g0.y2(null, 2131624242));
        this.f9501c = runtimeShader;
        e1(true);
        this.d = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
    }

    public final void e1(boolean z10) {
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        float f10;
        float radius;
        float f11;
        View view = (View) this.f6424a;
        if (!z10 && this.f9503f == view.getWidth() && this.f9504g == view.getHeight() && Math.abs(this.h - org.telegram.messenger.g0.f24145p) <= 0.01f) {
            return;
        }
        RuntimeShader runtimeShader = this.f9501c;
        int width = view.getWidth();
        this.f9503f = width;
        int height = view.getHeight();
        this.f9504g = height;
        runtimeShader.setFloatUniform("size", width, height);
        RuntimeShader runtimeShader2 = this.f9501c;
        float f12 = org.telegram.messenger.g0.f24145p;
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
        RuntimeShader runtimeShader3 = this.f9501c;
        float f13 = 0.0f;
        if (roundedCorner4 != null && (view == view.getRootView() || org.telegram.messenger.g0.f24141n <= 0)) {
            f10 = roundedCorner4.getRadius();
        } else {
            f10 = 0.0f;
        }
        if (roundedCorner2 == null) {
            radius = 0.0f;
        } else {
            radius = roundedCorner2.getRadius();
        }
        if (roundedCorner3 != null && (view == view.getRootView() || org.telegram.messenger.g0.f24141n <= 0)) {
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
        boolean z10;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        boolean z11;
        boolean z12;
        boolean z13;
        View view = (View) this.f6424a;
        ArrayList arrayList = this.f9500b;
        boolean z14 = false;
        if (!arrayList.isEmpty()) {
            boolean z15 = true;
            if (this.f9502e != Math.min(7, arrayList.size())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f9502e = Math.min(7, arrayList.size());
            int i7 = 0;
            while (true) {
                int i10 = this.f9502e;
                fArr = this.f9508l;
                fArr2 = this.f9507k;
                fArr3 = this.f9506j;
                fArr4 = this.f9505i;
                if (i7 >= i10) {
                    break;
                }
                nc ncVar = (nc) arrayList.get(i7);
                if (!z10 && Math.abs(fArr4[i7] - ncVar.d) <= 0.001f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                float f10 = ncVar.d;
                float f11 = ncVar.f9425c;
                float f12 = ncVar.f9424b;
                float f13 = ncVar.f9423a;
                fArr4[i7] = f10;
                if (!z11 && Math.abs(fArr3[i7] - f13) <= 0.001f) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                fArr3[i7] = f13;
                if (!z12 && Math.abs(fArr2[i7] - f12) <= 0.001f) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                fArr2[i7] = f12;
                if (!z13 && Math.abs(fArr[i7] - f11) <= 0.001f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                fArr[i7] = f11;
                i7++;
            }
            if (!z10 && this.f9503f == view.getWidth() && this.f9504g == view.getHeight() && Math.abs(this.h - org.telegram.messenger.g0.f24145p) <= 0.01f) {
                z15 = false;
            }
            if (z15) {
                this.f9501c.setIntUniform("count", this.f9502e);
                this.f9501c.setFloatUniform("t", fArr4);
                this.f9501c.setFloatUniform("centerX", fArr3);
                this.f9501c.setFloatUniform("centerY", fArr2);
                this.f9501c.setFloatUniform("intensity", fArr);
                e1(false);
                this.d = RenderEffect.createRuntimeShaderEffect(this.f9501c, "img");
            }
            z14 = z15;
        }
        if (arrayList.isEmpty()) {
            renderEffect = null;
        } else {
            renderEffect = this.d;
        }
        view.setRenderEffect(renderEffect);
        if (z14) {
            view.invalidate();
        }
    }
}
