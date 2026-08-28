package gh;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class lb extends a8.a {
    public final ArrayList f8520b;
    public final RuntimeShader f8521c;
    public RenderEffect d;
    public int f8522e;
    public int f8523f;
    public int f8524g;
    public float h;
    public final float[] f8525i;
    public final float[] f8526j;
    public final float[] f8527k;
    public final float[] f8528l;

    public lb(View view) {
        super(view);
        this.f8520b = new ArrayList();
        this.f8525i = new float[7];
        this.f8526j = new float[7];
        this.f8527k = new float[7];
        this.f8528l = new float[7];
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.superripple_effect));
        this.f8521c = runtimeShader;
        Q(true);
        this.d = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
    }

    public final void Q(boolean z10) {
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        float f10;
        float radius;
        float f11;
        float radius2;
        View view = (View) this.f108a;
        if (!z10 && this.f8523f == view.getWidth() && this.f8524g == view.getHeight() && Math.abs(this.h - AndroidUtilities.density) <= 0.01f) {
            return;
        }
        RuntimeShader runtimeShader = this.f8521c;
        int width = view.getWidth();
        this.f8523f = width;
        int height = view.getHeight();
        this.f8524g = height;
        runtimeShader.setFloatUniform("size", width, height);
        RuntimeShader runtimeShader2 = this.f8521c;
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
        RuntimeShader runtimeShader3 = this.f8521c;
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
        View view = (View) this.f108a;
        ArrayList arrayList = this.f8520b;
        boolean z14 = false;
        if (!arrayList.isEmpty()) {
            boolean z15 = true;
            if (this.f8522e != Math.min(7, arrayList.size())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f8522e = Math.min(7, arrayList.size());
            int i9 = 0;
            while (true) {
                int i10 = this.f8522e;
                fArr = this.f8528l;
                fArr2 = this.f8527k;
                fArr3 = this.f8526j;
                fArr4 = this.f8525i;
                if (i9 >= i10) {
                    break;
                }
                kb kbVar = (kb) arrayList.get(i9);
                if (!z10 && Math.abs(fArr4[i9] - kbVar.d) <= 0.001f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                float f10 = kbVar.d;
                float f11 = kbVar.f8453c;
                float f12 = kbVar.f8452b;
                float f13 = kbVar.f8451a;
                fArr4[i9] = f10;
                if (!z11 && Math.abs(fArr3[i9] - f13) <= 0.001f) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                fArr3[i9] = f13;
                if (!z12 && Math.abs(fArr2[i9] - f12) <= 0.001f) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                fArr2[i9] = f12;
                if (!z13 && Math.abs(fArr[i9] - f11) <= 0.001f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                fArr[i9] = f11;
                i9++;
            }
            if (!z10 && this.f8523f == view.getWidth() && this.f8524g == view.getHeight() && Math.abs(this.h - AndroidUtilities.density) <= 0.01f) {
                z15 = false;
            }
            if (z15) {
                this.f8521c.setIntUniform("count", this.f8522e);
                this.f8521c.setFloatUniform("t", fArr4);
                this.f8521c.setFloatUniform("centerX", fArr3);
                this.f8521c.setFloatUniform("centerY", fArr2);
                this.f8521c.setFloatUniform("intensity", fArr);
                Q(false);
                this.d = RenderEffect.createRuntimeShaderEffect(this.f8521c, "img");
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
