package bh;

import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class g {
    public final RenderNode f4396a;
    public final RuntimeShader f4397b;
    public float f4398c;
    public float d;
    public float e;
    public float f4399f;
    public float f4400g;
    public float h;
    public float f4401i;
    public float f4402j;
    public float f4403k;
    public float f4404l;
    public float f4405m;
    public float f4406n;
    public float f4407o;
    public int f4408p;

    public g(RenderNode renderNode) {
        this.f4396a = renderNode;
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.liquid_glass_shader));
        this.f4397b = runtimeShader;
        renderNode.setRenderEffect(RenderEffect.createRuntimeShaderEffect(runtimeShader, "img"));
    }

    public final void a(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i10) {
        float f18;
        float f19;
        float f20;
        float f21;
        float width = this.f4396a.getWidth();
        float height = this.f4396a.getHeight();
        float f22 = (0.0f + f7) / 2.0f;
        float f23 = (0.0f + f10) / 2.0f;
        float f24 = f10 - 0.0f;
        float f25 = (f7 - 0.0f) / 2.0f;
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
        if (Math.abs(this.f4398c - width) <= 0.1f && Math.abs(this.d - height) <= 0.1f && Math.abs(this.e - f22) <= 0.1f && Math.abs(this.f4399f - f23) <= 0.1f && Math.abs(this.f4400g - f25) <= 0.1f && Math.abs(this.h - f26) <= 0.1f && Math.abs(this.f4401i - f18) <= 0.1f && Math.abs(this.f4402j - f20) <= 0.1f && Math.abs(this.f4403k - f21) <= 0.1f && Math.abs(this.f4404l - f19) <= 0.1f && Math.abs(this.f4405m - f15) <= 0.1f && Math.abs(this.f4406n - f16) <= 0.1f && Math.abs(this.f4407o - f17) <= 0.1f && this.f4408p == i10) {
            return;
        }
        this.f4408p = i10;
        float alpha = Color.alpha(i10) / 255.0f;
        RuntimeShader runtimeShader = this.f4397b;
        this.f4398c = width;
        this.d = height;
        runtimeShader.setFloatUniform("resolution", width, height);
        RuntimeShader runtimeShader2 = this.f4397b;
        this.e = f22;
        this.f4399f = f23;
        runtimeShader2.setFloatUniform("center", f22, f23);
        RuntimeShader runtimeShader3 = this.f4397b;
        this.f4400g = f25;
        this.h = f26;
        runtimeShader3.setFloatUniform("size", f25, f26);
        RuntimeShader runtimeShader4 = this.f4397b;
        this.f4403k = f21;
        this.f4402j = f20;
        this.f4404l = f19;
        this.f4401i = f18;
        runtimeShader4.setFloatUniform("radius", f21, f20, f19, f18);
        RuntimeShader runtimeShader5 = this.f4397b;
        this.f4405m = f15;
        runtimeShader5.setFloatUniform("thickness", f15);
        RuntimeShader runtimeShader6 = this.f4397b;
        this.f4406n = f16;
        runtimeShader6.setFloatUniform("refract_intensity", f16);
        RuntimeShader runtimeShader7 = this.f4397b;
        this.f4407o = f17;
        runtimeShader7.setFloatUniform("refract_index", f17);
        this.f4397b.setFloatUniform("foreground_color_premultiplied", (Color.red(i10) / 255.0f) * alpha, (Color.green(i10) / 255.0f) * alpha, (Color.blue(i10) / 255.0f) * alpha, alpha);
        this.f4396a.setRenderEffect(RenderEffect.createRuntimeShaderEffect(this.f4397b, "img"));
    }
}
