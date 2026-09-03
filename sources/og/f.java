package og;

import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class f {
    public final RenderNode f16795a;
    public final RuntimeShader f16796b;
    public float f16797c;
    public float d;
    public float f16798e;
    public float f16799f;
    public float f16800g;
    public float h;
    public float f16801i;
    public float f16802j;
    public float f16803k;
    public float f16804l;
    public float f16805m;
    public float f16806n;
    public float f16807o;
    public int f16808p;

    public f(RenderNode renderNode) {
        this.f16795a = renderNode;
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.liquid_glass_shader));
        this.f16796b = runtimeShader;
        renderNode.setRenderEffect(RenderEffect.createRuntimeShaderEffect(runtimeShader, "img"));
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i10) {
        float f19;
        float f20;
        float f21;
        float f22;
        float width = this.f16795a.getWidth();
        float height = this.f16795a.getHeight();
        float f23 = (0.0f + f10) / 2.0f;
        float f24 = (0.0f + f11) / 2.0f;
        float f25 = f11 - 0.0f;
        float f26 = (f10 - 0.0f) / 2.0f;
        float f27 = f25 / 2.0f;
        float f28 = f12 + f15;
        if (f28 > f25) {
            float f29 = f12 / f28;
            f19 = f25 * f29;
            f20 = (1.0f - f29) * f25;
        } else {
            f19 = f12;
            f20 = f15;
        }
        float f30 = f13 + f14;
        if (f30 > f25) {
            float f31 = f13 / f30;
            f22 = f25 * (1.0f - f31);
            f21 = f25 * f31;
        } else {
            f21 = f13;
            f22 = f14;
        }
        if (Math.abs(this.f16797c - width) <= 0.1f && Math.abs(this.d - height) <= 0.1f && Math.abs(this.f16798e - f23) <= 0.1f && Math.abs(this.f16799f - f24) <= 0.1f && Math.abs(this.f16800g - f26) <= 0.1f && Math.abs(this.h - f27) <= 0.1f && Math.abs(this.f16801i - f19) <= 0.1f && Math.abs(this.f16802j - f21) <= 0.1f && Math.abs(this.f16803k - f22) <= 0.1f && Math.abs(this.f16804l - f20) <= 0.1f && Math.abs(this.f16805m - f16) <= 0.1f && Math.abs(this.f16806n - f17) <= 0.1f && Math.abs(this.f16807o - f18) <= 0.1f && this.f16808p == i10) {
            return;
        }
        this.f16808p = i10;
        float alpha = Color.alpha(i10) / 255.0f;
        RuntimeShader runtimeShader = this.f16796b;
        this.f16797c = width;
        this.d = height;
        runtimeShader.setFloatUniform("resolution", width, height);
        RuntimeShader runtimeShader2 = this.f16796b;
        this.f16798e = f23;
        this.f16799f = f24;
        runtimeShader2.setFloatUniform("center", f23, f24);
        RuntimeShader runtimeShader3 = this.f16796b;
        this.f16800g = f26;
        this.h = f27;
        runtimeShader3.setFloatUniform("size", f26, f27);
        RuntimeShader runtimeShader4 = this.f16796b;
        this.f16803k = f22;
        this.f16802j = f21;
        this.f16804l = f20;
        this.f16801i = f19;
        runtimeShader4.setFloatUniform("radius", f22, f21, f20, f19);
        RuntimeShader runtimeShader5 = this.f16796b;
        this.f16805m = f16;
        runtimeShader5.setFloatUniform("thickness", f16);
        RuntimeShader runtimeShader6 = this.f16796b;
        this.f16806n = f17;
        runtimeShader6.setFloatUniform("refract_intensity", f17);
        RuntimeShader runtimeShader7 = this.f16796b;
        this.f16807o = f18;
        runtimeShader7.setFloatUniform("refract_index", f18);
        this.f16796b.setFloatUniform("foreground_color_premultiplied", (Color.red(i10) / 255.0f) * alpha, (Color.green(i10) / 255.0f) * alpha, (Color.blue(i10) / 255.0f) * alpha, alpha);
        this.f16795a.setRenderEffect(RenderEffect.createRuntimeShaderEffect(this.f16796b, "img"));
    }
}
