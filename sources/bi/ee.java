package bi;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ee extends b2.h {
    public final ArrayList f4580b;
    public final RuntimeShader f4581c;
    public RenderEffect d;
    public int e;
    public int f4582f;
    public int f4583g;
    public float h;
    public final float[] f4584i;
    public final float[] f4585j;
    public final float[] f4586k;
    public final float[] f4587l;

    public ee(View view) {
        super(view);
        this.f4580b = new ArrayList();
        this.f4584i = new float[7];
        this.f4585j = new float[7];
        this.f4586k = new float[7];
        this.f4587l = new float[7];
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.superripple_effect));
        this.f4581c = runtimeShader;
        e1(true);
        this.d = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
    }

    public final void e1(boolean z10) {
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        float f7;
        float radius;
        float f10;
        View view = (View) this.f3212a;
        if (!z10 && this.f4582f == view.getWidth() && this.f4583g == view.getHeight() && Math.abs(this.h - AndroidUtilities.density) <= 0.01f) {
            return;
        }
        RuntimeShader runtimeShader = this.f4581c;
        int width = view.getWidth();
        this.f4582f = width;
        int height = view.getHeight();
        this.f4583g = height;
        runtimeShader.setFloatUniform("size", width, height);
        RuntimeShader runtimeShader2 = this.f4581c;
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
        RuntimeShader runtimeShader3 = this.f4581c;
        float f12 = 0.0f;
        if (roundedCorner4 != null && (view == view.getRootView() || AndroidUtilities.navigationBarHeight <= 0)) {
            f7 = roundedCorner4.getRadius();
        } else {
            f7 = 0.0f;
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
        if (roundedCorner != null) {
            f12 = roundedCorner.getRadius();
        }
        runtimeShader3.setFloatUniform("radius", f7, radius, f10, f12);
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
        View view = (View) this.f3212a;
        ArrayList arrayList = this.f4580b;
        boolean z14 = false;
        if (!arrayList.isEmpty()) {
            boolean z15 = true;
            if (this.e != Math.min(7, arrayList.size())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.e = Math.min(7, arrayList.size());
            int i10 = 0;
            while (true) {
                int i11 = this.e;
                fArr = this.f4587l;
                fArr2 = this.f4586k;
                fArr3 = this.f4585j;
                fArr4 = this.f4584i;
                if (i10 >= i11) {
                    break;
                }
                de deVar = (de) arrayList.get(i10);
                if (!z10 && Math.abs(fArr4[i10] - deVar.d) <= 0.001f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                float f7 = deVar.d;
                float f10 = deVar.f4535c;
                float f11 = deVar.f4534b;
                float f12 = deVar.f4533a;
                fArr4[i10] = f7;
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
            if (!z10 && this.f4582f == view.getWidth() && this.f4583g == view.getHeight() && Math.abs(this.h - AndroidUtilities.density) <= 0.01f) {
                z15 = false;
            }
            if (z15) {
                this.f4581c.setIntUniform("count", this.e);
                this.f4581c.setFloatUniform("t", fArr4);
                this.f4581c.setFloatUniform("centerX", fArr3);
                this.f4581c.setFloatUniform("centerY", fArr2);
                this.f4581c.setFloatUniform("intensity", fArr);
                e1(false);
                this.d = RenderEffect.createRuntimeShaderEffect(this.f4581c, "img");
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
