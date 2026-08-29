package jh;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class fb extends ab.e {
    public final ArrayList f12078b;
    public final RuntimeShader f12079c;
    public RenderEffect d;
    public int f12080e;
    public int f12081f;
    public int f12082g;
    public float h;
    public final float[] f12083i;
    public final float[] f12084j;
    public final float[] f12085k;
    public final float[] f12086l;

    public fb(View view) {
        super(view);
        this.f12078b = new ArrayList();
        this.f12083i = new float[7];
        this.f12084j = new float[7];
        this.f12085k = new float[7];
        this.f12086l = new float[7];
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.superripple_effect));
        this.f12079c = runtimeShader;
        Q(true);
        this.d = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
    }

    public final void Q(boolean z10) {
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        float f9;
        float radius;
        float f10;
        float radius2;
        View view = (View) this.f306a;
        if (!z10 && this.f12081f == view.getWidth() && this.f12082g == view.getHeight() && Math.abs(this.h - AndroidUtilities.density) <= 0.01f) {
            return;
        }
        RuntimeShader runtimeShader = this.f12079c;
        int width = view.getWidth();
        this.f12081f = width;
        int height = view.getHeight();
        this.f12082g = height;
        runtimeShader.setFloatUniform("size", width, height);
        RuntimeShader runtimeShader2 = this.f12079c;
        float f11 = AndroidUtilities.density;
        this.h = f11;
        runtimeShader2.setFloatUniform("density", f11);
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
        RuntimeShader runtimeShader3 = this.f12079c;
        if (roundedCorner4 != null && (view == view.getRootView() || AndroidUtilities.navigationBarHeight <= 0)) {
            f9 = roundedCorner4.getRadius();
        } else {
            f9 = 0.0f;
        }
        if (roundedCorner2 == null) {
            radius = 0.0f;
        } else {
            radius = roundedCorner2.getRadius();
        }
        if (roundedCorner3 != null && (view == view.getRootView() || AndroidUtilities.navigationBarHeight <= 0)) {
            f10 = roundedCorner3.getRadius();
        } else {
            f10 = 0.0f;
        }
        if (roundedCorner == null) {
            radius2 = 0.0f;
        } else {
            radius2 = roundedCorner.getRadius();
        }
        runtimeShader3.setFloatUniform("radius", f9, radius, f10, radius2);
    }

    public final void R() {
        RenderEffect renderEffect;
        boolean z10;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        boolean z11;
        boolean z12;
        boolean z13;
        View view = (View) this.f306a;
        ArrayList arrayList = this.f12078b;
        boolean z14 = false;
        if (!arrayList.isEmpty()) {
            boolean z15 = true;
            if (this.f12080e != Math.min(7, arrayList.size())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f12080e = Math.min(7, arrayList.size());
            int i10 = 0;
            while (true) {
                int i11 = this.f12080e;
                fArr = this.f12086l;
                fArr2 = this.f12085k;
                fArr3 = this.f12084j;
                fArr4 = this.f12083i;
                if (i10 >= i11) {
                    break;
                }
                eb ebVar = (eb) arrayList.get(i10);
                if (!z10 && Math.abs(fArr4[i10] - ebVar.d) <= 0.001f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                float f9 = ebVar.d;
                float f10 = ebVar.f12036c;
                float f11 = ebVar.f12035b;
                float f12 = ebVar.f12034a;
                fArr4[i10] = f9;
                if (!z11 && Math.abs(fArr3[i10] - f12) <= 0.001f) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                fArr3[i10] = f12;
                if (!z12 && Math.abs(fArr2[i10] - f11) <= 0.001f) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                fArr2[i10] = f11;
                if (!z13 && Math.abs(fArr[i10] - f10) <= 0.001f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                fArr[i10] = f10;
                i10++;
            }
            if (!z10 && this.f12081f == view.getWidth() && this.f12082g == view.getHeight() && Math.abs(this.h - AndroidUtilities.density) <= 0.01f) {
                z15 = false;
            }
            if (z15) {
                this.f12079c.setIntUniform("count", this.f12080e);
                this.f12079c.setFloatUniform("t", fArr4);
                this.f12079c.setFloatUniform("centerX", fArr3);
                this.f12079c.setFloatUniform("centerY", fArr2);
                this.f12079c.setFloatUniform("intensity", fArr);
                Q(false);
                this.d = RenderEffect.createRuntimeShaderEffect(this.f12079c, "img");
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
