package lg;

import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class f {
    public final RenderNode f15263a;
    public final RuntimeShader f15264b;
    public float f15265c;
    public float d;
    public float f15266e;
    public float f15267f;
    public float f15268g;
    public float h;
    public float f15269i;
    public float f15270j;
    public float f15271k;
    public float f15272l;
    public float f15273m;
    public float f15274n;
    public float f15275o;
    public int f15276p;

    public f(RenderNode renderNode) {
        this.f15263a = renderNode;
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.liquid_glass_shader));
        this.f15264b = runtimeShader;
        renderNode.setRenderEffect(RenderEffect.createRuntimeShaderEffect(runtimeShader, "img"));
    }

    public final void a(float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i10) {
        float f18;
        float f19;
        float f20;
        float f21;
        float width = this.f15263a.getWidth();
        float height = this.f15263a.getHeight();
        float f22 = (0.0f + f9) / 2.0f;
        float f23 = (0.0f + f10) / 2.0f;
        float f24 = f10 - 0.0f;
        float f25 = (f9 - 0.0f) / 2.0f;
        float f26 = f24 / 2.0f;
        float f27 = f11 + f14;
        if (f27 > f24) {
            float f28 = f11 / f27;
            f18 = f24 * f28;
            f19 = (1.0f - f28) * f24;
        } else {
            f18 = f11;
            f19 = f14;
        }
        float f29 = f12 + f13;
        if (f29 > f24) {
            float f30 = f12 / f29;
            f21 = f24 * (1.0f - f30);
            f20 = f24 * f30;
        } else {
            f20 = f12;
            f21 = f13;
        }
        if (Math.abs(this.f15265c - width) <= 0.1f && Math.abs(this.d - height) <= 0.1f && Math.abs(this.f15266e - f22) <= 0.1f && Math.abs(this.f15267f - f23) <= 0.1f && Math.abs(this.f15268g - f25) <= 0.1f && Math.abs(this.h - f26) <= 0.1f && Math.abs(this.f15269i - f18) <= 0.1f && Math.abs(this.f15270j - f20) <= 0.1f && Math.abs(this.f15271k - f21) <= 0.1f && Math.abs(this.f15272l - f19) <= 0.1f && Math.abs(this.f15273m - f15) <= 0.1f && Math.abs(this.f15274n - f16) <= 0.1f && Math.abs(this.f15275o - f17) <= 0.1f && this.f15276p == i10) {
            return;
        }
        this.f15276p = i10;
        float alpha = Color.alpha(i10) / 255.0f;
        RuntimeShader runtimeShader = this.f15264b;
        this.f15265c = width;
        this.d = height;
        runtimeShader.setFloatUniform("resolution", width, height);
        RuntimeShader runtimeShader2 = this.f15264b;
        this.f15266e = f22;
        this.f15267f = f23;
        runtimeShader2.setFloatUniform("center", f22, f23);
        RuntimeShader runtimeShader3 = this.f15264b;
        this.f15268g = f25;
        this.h = f26;
        runtimeShader3.setFloatUniform("size", f25, f26);
        RuntimeShader runtimeShader4 = this.f15264b;
        this.f15271k = f21;
        this.f15270j = f20;
        this.f15272l = f19;
        this.f15269i = f18;
        runtimeShader4.setFloatUniform("radius", f21, f20, f19, f18);
        RuntimeShader runtimeShader5 = this.f15264b;
        this.f15273m = f15;
        runtimeShader5.setFloatUniform("thickness", f15);
        RuntimeShader runtimeShader6 = this.f15264b;
        this.f15274n = f16;
        runtimeShader6.setFloatUniform("refract_intensity", f16);
        RuntimeShader runtimeShader7 = this.f15264b;
        this.f15275o = f17;
        runtimeShader7.setFloatUniform("refract_index", f17);
        this.f15264b.setFloatUniform("foreground_color_premultiplied", (Color.red(i10) / 255.0f) * alpha, (Color.green(i10) / 255.0f) * alpha, (Color.blue(i10) / 255.0f) * alpha, alpha);
        this.f15263a.setRenderEffect(RenderEffect.createRuntimeShaderEffect(this.f15264b, "img"));
    }
}
