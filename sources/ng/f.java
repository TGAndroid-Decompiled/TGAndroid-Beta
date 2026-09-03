package ng;

import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class f {
    public final RenderNode f14986a;
    public final RuntimeShader f14987b;
    public float f14988c;
    public float d;
    public float e;
    public float f14989f;
    public float f14990g;
    public float h;
    public float f14991i;
    public float f14992j;
    public float f14993k;
    public float f14994l;
    public float f14995m;
    public float f14996n;
    public float f14997o;
    public int f14998p;

    public f(RenderNode renderNode) {
        this.f14986a = renderNode;
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.liquid_glass_shader));
        this.f14987b = runtimeShader;
        renderNode.setRenderEffect(RenderEffect.createRuntimeShaderEffect(runtimeShader, "img"));
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i10) {
        float f19;
        float f20;
        float f21;
        float f22;
        float width = this.f14986a.getWidth();
        float height = this.f14986a.getHeight();
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
        if (Math.abs(this.f14988c - width) <= 0.1f && Math.abs(this.d - height) <= 0.1f && Math.abs(this.e - f23) <= 0.1f && Math.abs(this.f14989f - f24) <= 0.1f && Math.abs(this.f14990g - f26) <= 0.1f && Math.abs(this.h - f27) <= 0.1f && Math.abs(this.f14991i - f19) <= 0.1f && Math.abs(this.f14992j - f21) <= 0.1f && Math.abs(this.f14993k - f22) <= 0.1f && Math.abs(this.f14994l - f20) <= 0.1f && Math.abs(this.f14995m - f16) <= 0.1f && Math.abs(this.f14996n - f17) <= 0.1f && Math.abs(this.f14997o - f18) <= 0.1f && this.f14998p == i10) {
            return;
        }
        this.f14998p = i10;
        float alpha = Color.alpha(i10) / 255.0f;
        RuntimeShader runtimeShader = this.f14987b;
        this.f14988c = width;
        this.d = height;
        runtimeShader.setFloatUniform("resolution", width, height);
        RuntimeShader runtimeShader2 = this.f14987b;
        this.e = f23;
        this.f14989f = f24;
        runtimeShader2.setFloatUniform("center", f23, f24);
        RuntimeShader runtimeShader3 = this.f14987b;
        this.f14990g = f26;
        this.h = f27;
        runtimeShader3.setFloatUniform("size", f26, f27);
        RuntimeShader runtimeShader4 = this.f14987b;
        this.f14993k = f22;
        this.f14992j = f21;
        this.f14994l = f20;
        this.f14991i = f19;
        runtimeShader4.setFloatUniform("radius", f22, f21, f20, f19);
        RuntimeShader runtimeShader5 = this.f14987b;
        this.f14995m = f16;
        runtimeShader5.setFloatUniform("thickness", f16);
        RuntimeShader runtimeShader6 = this.f14987b;
        this.f14996n = f17;
        runtimeShader6.setFloatUniform("refract_intensity", f17);
        RuntimeShader runtimeShader7 = this.f14987b;
        this.f14997o = f18;
        runtimeShader7.setFloatUniform("refract_index", f18);
        this.f14987b.setFloatUniform("foreground_color_premultiplied", (Color.red(i10) / 255.0f) * alpha, (Color.green(i10) / 255.0f) * alpha, (Color.blue(i10) / 255.0f) * alpha, alpha);
        this.f14986a.setRenderEffect(RenderEffect.createRuntimeShaderEffect(this.f14987b, "img"));
    }
}
