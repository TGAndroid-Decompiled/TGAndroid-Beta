package bh;

import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class g {
    public final RenderNode f2719a;
    public final RuntimeShader f2720b;
    public float f2721c;
    public float d;
    public float f2722e;
    public float f2723f;
    public float f2724g;
    public float h;
    public float f2725i;
    public float f2726j;
    public float f2727k;
    public float f2728l;
    public float f2729m;
    public float f2730n;
    public float f2731o;
    public int f2732p;

    public g(RenderNode renderNode) {
        this.f2719a = renderNode;
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.liquid_glass_shader));
        this.f2720b = runtimeShader;
        renderNode.setRenderEffect(RenderEffect.createRuntimeShaderEffect(runtimeShader, "img"));
    }

    public final void a(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i10) {
        float f18;
        float f19;
        float f20;
        float f21;
        float width = this.f2719a.getWidth();
        float height = this.f2719a.getHeight();
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
        if (Math.abs(this.f2721c - width) <= 0.1f && Math.abs(this.d - height) <= 0.1f && Math.abs(this.f2722e - f22) <= 0.1f && Math.abs(this.f2723f - f23) <= 0.1f && Math.abs(this.f2724g - f25) <= 0.1f && Math.abs(this.h - f26) <= 0.1f && Math.abs(this.f2725i - f18) <= 0.1f && Math.abs(this.f2726j - f20) <= 0.1f && Math.abs(this.f2727k - f21) <= 0.1f && Math.abs(this.f2728l - f19) <= 0.1f && Math.abs(this.f2729m - f15) <= 0.1f && Math.abs(this.f2730n - f16) <= 0.1f && Math.abs(this.f2731o - f17) <= 0.1f && this.f2732p == i10) {
            return;
        }
        this.f2732p = i10;
        float alpha = Color.alpha(i10) / 255.0f;
        RuntimeShader runtimeShader = this.f2720b;
        this.f2721c = width;
        this.d = height;
        runtimeShader.setFloatUniform("resolution", width, height);
        RuntimeShader runtimeShader2 = this.f2720b;
        this.f2722e = f22;
        this.f2723f = f23;
        runtimeShader2.setFloatUniform("center", f22, f23);
        RuntimeShader runtimeShader3 = this.f2720b;
        this.f2724g = f25;
        this.h = f26;
        runtimeShader3.setFloatUniform("size", f25, f26);
        RuntimeShader runtimeShader4 = this.f2720b;
        this.f2727k = f21;
        this.f2726j = f20;
        this.f2728l = f19;
        this.f2725i = f18;
        runtimeShader4.setFloatUniform("radius", f21, f20, f19, f18);
        RuntimeShader runtimeShader5 = this.f2720b;
        this.f2729m = f15;
        runtimeShader5.setFloatUniform("thickness", f15);
        RuntimeShader runtimeShader6 = this.f2720b;
        this.f2730n = f16;
        runtimeShader6.setFloatUniform("refract_intensity", f16);
        RuntimeShader runtimeShader7 = this.f2720b;
        this.f2731o = f17;
        runtimeShader7.setFloatUniform("refract_index", f17);
        this.f2720b.setFloatUniform("foreground_color_premultiplied", (Color.red(i10) / 255.0f) * alpha, (Color.green(i10) / 255.0f) * alpha, (Color.blue(i10) / 255.0f) * alpha, alpha);
        this.f2719a.setRenderEffect(RenderEffect.createRuntimeShaderEffect(this.f2720b, "img"));
    }
}
