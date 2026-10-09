package ah;

import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class i {
    public final RenderNode f585a;
    public final RuntimeShader f586b;
    public float f587c;
    public float d;
    public float f588e;
    public float f589f;
    public float f590g;
    public float h;
    public float f591i;
    public float f592j;
    public float f593k;
    public float f594l;
    public float f595m;
    public float f596n;
    public float f597o;
    public int f598p;

    public i(RenderNode renderNode) {
        this.f585a = renderNode;
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.liquid_glass_shader));
        this.f586b = runtimeShader;
        renderNode.setRenderEffect(RenderEffect.createRuntimeShaderEffect(runtimeShader, "img"));
    }

    public final void a(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i10) {
        float f18;
        float f19;
        float f20;
        float f21;
        float width = this.f585a.getWidth();
        float height = this.f585a.getHeight();
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
        if (Math.abs(this.f587c - width) <= 0.1f && Math.abs(this.d - height) <= 0.1f && Math.abs(this.f588e - f22) <= 0.1f && Math.abs(this.f589f - f23) <= 0.1f && Math.abs(this.f590g - f25) <= 0.1f && Math.abs(this.h - f26) <= 0.1f && Math.abs(this.f591i - f18) <= 0.1f && Math.abs(this.f592j - f20) <= 0.1f && Math.abs(this.f593k - f21) <= 0.1f && Math.abs(this.f594l - f19) <= 0.1f && Math.abs(this.f595m - f15) <= 0.1f && Math.abs(this.f596n - f16) <= 0.1f && Math.abs(this.f597o - f17) <= 0.1f && this.f598p == i10) {
            return;
        }
        this.f598p = i10;
        float alpha = Color.alpha(i10) / 255.0f;
        RuntimeShader runtimeShader = this.f586b;
        this.f587c = width;
        this.d = height;
        runtimeShader.setFloatUniform("resolution", width, height);
        RuntimeShader runtimeShader2 = this.f586b;
        this.f588e = f22;
        this.f589f = f23;
        runtimeShader2.setFloatUniform("center", f22, f23);
        RuntimeShader runtimeShader3 = this.f586b;
        this.f590g = f25;
        this.h = f26;
        runtimeShader3.setFloatUniform("size", f25, f26);
        RuntimeShader runtimeShader4 = this.f586b;
        this.f593k = f21;
        this.f592j = f20;
        this.f594l = f19;
        this.f591i = f18;
        runtimeShader4.setFloatUniform("radius", f21, f20, f19, f18);
        RuntimeShader runtimeShader5 = this.f586b;
        this.f595m = f15;
        runtimeShader5.setFloatUniform("thickness", f15);
        RuntimeShader runtimeShader6 = this.f586b;
        this.f596n = f16;
        runtimeShader6.setFloatUniform("refract_intensity", f16);
        RuntimeShader runtimeShader7 = this.f586b;
        this.f597o = f17;
        runtimeShader7.setFloatUniform("refract_index", f17);
        this.f586b.setFloatUniform("foreground_color_premultiplied", (Color.red(i10) / 255.0f) * alpha, (Color.green(i10) / 255.0f) * alpha, (Color.blue(i10) / 255.0f) * alpha, alpha);
        this.f585a.setRenderEffect(RenderEffect.createRuntimeShaderEffect(this.f586b, "img"));
    }
}
