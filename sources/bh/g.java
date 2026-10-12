package bh;

import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class g {
    public final RenderNode f2781a;
    public final RuntimeShader f2782b;
    public float f2783c;
    public float d;
    public float e;
    public float f2784f;
    public float f2785g;
    public float h;
    public float f2786i;
    public float f2787j;
    public float f2788k;
    public float f2789l;
    public float f2790m;
    public float f2791n;
    public float f2792o;
    public int f2793p;

    public g(RenderNode renderNode) {
        this.f2781a = renderNode;
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.liquid_glass_shader));
        this.f2782b = runtimeShader;
        renderNode.setRenderEffect(RenderEffect.createRuntimeShaderEffect(runtimeShader, "img"));
    }

    public final void a(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i10) {
        float f18;
        float f19;
        float f20;
        float f21;
        float width = this.f2781a.getWidth();
        float height = this.f2781a.getHeight();
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
        if (Math.abs(this.f2783c - width) <= 0.1f && Math.abs(this.d - height) <= 0.1f && Math.abs(this.e - f22) <= 0.1f && Math.abs(this.f2784f - f23) <= 0.1f && Math.abs(this.f2785g - f25) <= 0.1f && Math.abs(this.h - f26) <= 0.1f && Math.abs(this.f2786i - f18) <= 0.1f && Math.abs(this.f2787j - f20) <= 0.1f && Math.abs(this.f2788k - f21) <= 0.1f && Math.abs(this.f2789l - f19) <= 0.1f && Math.abs(this.f2790m - f15) <= 0.1f && Math.abs(this.f2791n - f16) <= 0.1f && Math.abs(this.f2792o - f17) <= 0.1f && this.f2793p == i10) {
            return;
        }
        this.f2793p = i10;
        float alpha = Color.alpha(i10) / 255.0f;
        RuntimeShader runtimeShader = this.f2782b;
        this.f2783c = width;
        this.d = height;
        runtimeShader.setFloatUniform("resolution", width, height);
        RuntimeShader runtimeShader2 = this.f2782b;
        this.e = f22;
        this.f2784f = f23;
        runtimeShader2.setFloatUniform("center", f22, f23);
        RuntimeShader runtimeShader3 = this.f2782b;
        this.f2785g = f25;
        this.h = f26;
        runtimeShader3.setFloatUniform("size", f25, f26);
        RuntimeShader runtimeShader4 = this.f2782b;
        this.f2788k = f21;
        this.f2787j = f20;
        this.f2789l = f19;
        this.f2786i = f18;
        runtimeShader4.setFloatUniform("radius", f21, f20, f19, f18);
        RuntimeShader runtimeShader5 = this.f2782b;
        this.f2790m = f15;
        runtimeShader5.setFloatUniform("thickness", f15);
        RuntimeShader runtimeShader6 = this.f2782b;
        this.f2791n = f16;
        runtimeShader6.setFloatUniform("refract_intensity", f16);
        RuntimeShader runtimeShader7 = this.f2782b;
        this.f2792o = f17;
        runtimeShader7.setFloatUniform("refract_index", f17);
        this.f2782b.setFloatUniform("foreground_color_premultiplied", (Color.red(i10) / 255.0f) * alpha, (Color.green(i10) / 255.0f) * alpha, (Color.blue(i10) / 255.0f) * alpha, alpha);
        this.f2781a.setRenderEffect(RenderEffect.createRuntimeShaderEffect(this.f2782b, "img"));
    }
}
