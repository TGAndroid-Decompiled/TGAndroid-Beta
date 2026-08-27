package hh;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class lb extends b8.a {

    public final ArrayList f9693b;

    public final RuntimeShader f9694c;
    public RenderEffect d;

    public int f9695e;

    public int f9696f;

    public int f9697g;
    public float h;

    public final float[] f9698i;

    public final float[] f9699j;

    public final float[] f9700k;

    public final float[] f9701l;

    public lb(View view) {
        super(view);
        this.f9693b = new ArrayList();
        this.f9698i = new float[7];
        this.f9699j = new float[7];
        this.f9700k = new float[7];
        this.f9701l = new float[7];
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.superripple_effect));
        this.f9694c = runtimeShader;
        Q(true);
        this.d = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
    }

    public final void Q(boolean z10) {
        View view = (View) this.f2040a;
        if (z10 || this.f9696f != view.getWidth() || this.f9697g != view.getHeight() || Math.abs(this.h - AndroidUtilities.density) > 0.01f) {
            RuntimeShader runtimeShader = this.f9694c;
            int width = view.getWidth();
            this.f9696f = width;
            int height = view.getHeight();
            this.f9697g = height;
            runtimeShader.setFloatUniform("size", width, height);
            RuntimeShader runtimeShader2 = this.f9694c;
            float f10 = AndroidUtilities.density;
            this.h = f10;
            runtimeShader2.setFloatUniform("density", f10);
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            RoundedCorner roundedCorner = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(0);
            RoundedCorner roundedCorner2 = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(1);
            RoundedCorner roundedCorner3 = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(3);
            RoundedCorner roundedCorner4 = rootWindowInsets != null ? rootWindowInsets.getRoundedCorner(2) : null;
            this.f9694c.setFloatUniform("radius", (roundedCorner4 == null || (view != view.getRootView() && AndroidUtilities.navigationBarHeight > 0)) ? 0.0f : roundedCorner4.getRadius(), roundedCorner2 == null ? 0.0f : roundedCorner2.getRadius(), (roundedCorner3 == null || (view != view.getRootView() && AndroidUtilities.navigationBarHeight > 0)) ? 0.0f : roundedCorner3.getRadius(), roundedCorner == null ? 0.0f : roundedCorner.getRadius());
        }
    }

    public final void R() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        View view = (View) this.f2040a;
        ArrayList arrayList = this.f9693b;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            boolean z11 = true;
            boolean z12 = this.f9695e != Math.min(7, arrayList.size());
            this.f9695e = Math.min(7, arrayList.size());
            int i10 = 0;
            while (true) {
                int i11 = this.f9695e;
                fArr = this.f9701l;
                fArr2 = this.f9700k;
                fArr3 = this.f9699j;
                fArr4 = this.f9698i;
                if (i10 >= i11) {
                    break;
                }
                kb kbVar = (kb) arrayList.get(i10);
                boolean z13 = z12 || Math.abs(fArr4[i10] - kbVar.d) > 0.001f;
                float f10 = kbVar.d;
                float f11 = kbVar.f9630c;
                float f12 = kbVar.f9629b;
                float f13 = kbVar.f9628a;
                fArr4[i10] = f10;
                boolean z14 = z13 || Math.abs(fArr3[i10] - f13) > 0.001f;
                fArr3[i10] = f13;
                boolean z15 = z14 || Math.abs(fArr2[i10] - f12) > 0.001f;
                fArr2[i10] = f12;
                z12 = z15 || Math.abs(fArr[i10] - f11) > 0.001f;
                fArr[i10] = f11;
                i10++;
            }
            if (!z12 && this.f9696f == view.getWidth() && this.f9697g == view.getHeight() && Math.abs(this.h - AndroidUtilities.density) <= 0.01f) {
                z11 = false;
            }
            if (z11) {
                this.f9694c.setIntUniform("count", this.f9695e);
                this.f9694c.setFloatUniform("t", fArr4);
                this.f9694c.setFloatUniform("centerX", fArr3);
                this.f9694c.setFloatUniform("centerY", fArr2);
                this.f9694c.setFloatUniform("intensity", fArr);
                Q(false);
                this.d = RenderEffect.createRuntimeShaderEffect(this.f9694c, "img");
            }
            z10 = z11;
        }
        view.setRenderEffect(arrayList.isEmpty() ? null : this.d);
        if (z10) {
            view.invalidate();
        }
    }
}
