package ci;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
public final class wc extends u0 {
    public final ArrayList f6297b;
    public final RuntimeShader f6298c;
    public RenderEffect d;
    public int f6299e;
    public int f6300f;
    public int f6301g;
    public float h;
    public final float[] f6302i;
    public final float[] f6303j;
    public final float[] f6304k;
    public final float[] f6305l;

    public wc(View view) {
        super(view);
        this.f6297b = new ArrayList();
        this.f6302i = new float[7];
        this.f6303j = new float[7];
        this.f6304k = new float[7];
        this.f6305l = new float[7];
        RuntimeShader runtimeShader = new RuntimeShader(org.telegram.messenger.g0.y2(null, 2131624241));
        this.f6298c = runtimeShader;
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
        View view = (View) this.f6076a;
        if (!z10 && this.f6300f == view.getWidth() && this.f6301g == view.getHeight() && Math.abs(this.h - org.telegram.messenger.g0.f22607p) <= 0.01f) {
            return;
        }
        RuntimeShader runtimeShader = this.f6298c;
        int width = view.getWidth();
        this.f6300f = width;
        int height = view.getHeight();
        this.f6301g = height;
        runtimeShader.setFloatUniform("size", width, height);
        RuntimeShader runtimeShader2 = this.f6298c;
        float f12 = org.telegram.messenger.g0.f22607p;
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
        RuntimeShader runtimeShader3 = this.f6298c;
        float f13 = 0.0f;
        if (roundedCorner4 != null && (view == view.getRootView() || org.telegram.messenger.g0.f22603n <= 0)) {
            f10 = roundedCorner4.getRadius();
        } else {
            f10 = 0.0f;
        }
        if (roundedCorner2 == null) {
            radius = 0.0f;
        } else {
            radius = roundedCorner2.getRadius();
        }
        if (roundedCorner3 != null && (view == view.getRootView() || org.telegram.messenger.g0.f22603n <= 0)) {
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
        View view = (View) this.f6076a;
        ArrayList arrayList = this.f6297b;
        boolean z14 = false;
        if (!arrayList.isEmpty()) {
            boolean z15 = true;
            if (this.f6299e != Math.min(7, arrayList.size())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f6299e = Math.min(7, arrayList.size());
            int i3 = 0;
            while (true) {
                int i10 = this.f6299e;
                fArr = this.f6305l;
                fArr2 = this.f6304k;
                fArr3 = this.f6303j;
                fArr4 = this.f6302i;
                if (i3 >= i10) {
                    break;
                }
                vc vcVar = (vc) arrayList.get(i3);
                if (!z10 && Math.abs(fArr4[i3] - vcVar.d) <= 0.001f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                float f10 = vcVar.d;
                float f11 = vcVar.f6221c;
                float f12 = vcVar.f6220b;
                float f13 = vcVar.f6219a;
                fArr4[i3] = f10;
                if (!z11 && Math.abs(fArr3[i3] - f13) <= 0.001f) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                fArr3[i3] = f13;
                if (!z12 && Math.abs(fArr2[i3] - f12) <= 0.001f) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                fArr2[i3] = f12;
                if (!z13 && Math.abs(fArr[i3] - f11) <= 0.001f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                fArr[i3] = f11;
                i3++;
            }
            if (!z10 && this.f6300f == view.getWidth() && this.f6301g == view.getHeight() && Math.abs(this.h - org.telegram.messenger.g0.f22607p) <= 0.01f) {
                z15 = false;
            }
            if (z15) {
                this.f6298c.setIntUniform("count", this.f6299e);
                this.f6298c.setFloatUniform("t", fArr4);
                this.f6298c.setFloatUniform("centerX", fArr3);
                this.f6298c.setFloatUniform("centerY", fArr2);
                this.f6298c.setFloatUniform("intensity", fArr);
                e1(false);
                this.d = RenderEffect.createRuntimeShaderEffect(this.f6298c, "img");
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
