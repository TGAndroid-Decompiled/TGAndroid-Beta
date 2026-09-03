package lh;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class gb extends cb.e {
    public final ArrayList f12500b;
    public final RuntimeShader f12501c;
    public RenderEffect d;
    public int e;
    public int f12502f;
    public int f12503g;
    public float h;
    public final float[] f12504i;
    public final float[] f12505j;
    public final float[] f12506k;
    public final float[] f12507l;

    public gb(View view) {
        super(view);
        this.f12500b = new ArrayList();
        this.f12504i = new float[7];
        this.f12505j = new float[7];
        this.f12506k = new float[7];
        this.f12507l = new float[7];
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.superripple_effect));
        this.f12501c = runtimeShader;
        L(true);
        this.d = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
    }

    public final void L(boolean z4) {
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        float f10;
        float radius;
        float f11;
        float radius2;
        View view = (View) this.f2238a;
        if (!z4 && this.f12502f == view.getWidth() && this.f12503g == view.getHeight() && Math.abs(this.h - AndroidUtilities.density) <= 0.01f) {
            return;
        }
        RuntimeShader runtimeShader = this.f12501c;
        int width = view.getWidth();
        this.f12502f = width;
        int height = view.getHeight();
        this.f12503g = height;
        runtimeShader.setFloatUniform("size", width, height);
        RuntimeShader runtimeShader2 = this.f12501c;
        float f12 = AndroidUtilities.density;
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
        RuntimeShader runtimeShader3 = this.f12501c;
        if (roundedCorner4 != null && (view == view.getRootView() || AndroidUtilities.navigationBarHeight <= 0)) {
            f10 = roundedCorner4.getRadius();
        } else {
            f10 = 0.0f;
        }
        if (roundedCorner2 == null) {
            radius = 0.0f;
        } else {
            radius = roundedCorner2.getRadius();
        }
        if (roundedCorner3 != null && (view == view.getRootView() || AndroidUtilities.navigationBarHeight <= 0)) {
            f11 = roundedCorner3.getRadius();
        } else {
            f11 = 0.0f;
        }
        if (roundedCorner == null) {
            radius2 = 0.0f;
        } else {
            radius2 = roundedCorner.getRadius();
        }
        runtimeShader3.setFloatUniform("radius", f10, radius, f11, radius2);
    }

    public final void M() {
        RenderEffect renderEffect;
        boolean z4;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        boolean z10;
        boolean z11;
        boolean z12;
        View view = (View) this.f2238a;
        ArrayList arrayList = this.f12500b;
        boolean z13 = false;
        if (!arrayList.isEmpty()) {
            boolean z14 = true;
            if (this.e != Math.min(7, arrayList.size())) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.e = Math.min(7, arrayList.size());
            int i10 = 0;
            while (true) {
                int i11 = this.e;
                fArr = this.f12507l;
                fArr2 = this.f12506k;
                fArr3 = this.f12505j;
                fArr4 = this.f12504i;
                if (i10 >= i11) {
                    break;
                }
                fb fbVar = (fb) arrayList.get(i10);
                if (!z4 && Math.abs(fArr4[i10] - fbVar.d) <= 0.001f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                float f10 = fbVar.d;
                float f11 = fbVar.f12431c;
                float f12 = fbVar.f12430b;
                float f13 = fbVar.f12429a;
                fArr4[i10] = f10;
                if (!z10 && Math.abs(fArr3[i10] - f13) <= 0.001f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                fArr3[i10] = f13;
                if (!z11 && Math.abs(fArr2[i10] - f12) <= 0.001f) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                fArr2[i10] = f12;
                if (!z12 && Math.abs(fArr[i10] - f11) <= 0.001f) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                fArr[i10] = f11;
                i10++;
            }
            if (!z4 && this.f12502f == view.getWidth() && this.f12503g == view.getHeight() && Math.abs(this.h - AndroidUtilities.density) <= 0.01f) {
                z14 = false;
            }
            if (z14) {
                this.f12501c.setIntUniform("count", this.e);
                this.f12501c.setFloatUniform("t", fArr4);
                this.f12501c.setFloatUniform("centerX", fArr3);
                this.f12501c.setFloatUniform("centerY", fArr2);
                this.f12501c.setFloatUniform("intensity", fArr);
                L(false);
                this.d = RenderEffect.createRuntimeShaderEffect(this.f12501c, "img");
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
