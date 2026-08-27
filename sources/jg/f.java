package jg;

import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class f {

    public final RenderNode f12982a;

    public final RuntimeShader f12983b;

    public float f12984c;
    public float d;

    public float f12985e;

    public float f12986f;

    public float f12987g;
    public float h;

    public float f12988i;

    public float f12989j;

    public float f12990k;

    public float f12991l;

    public float f12992m;

    public float f12993n;

    public float f12994o;

    public int f12995p;

    public f(RenderNode renderNode) {
        this.f12982a = renderNode;
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.liquid_glass_shader));
        this.f12983b = runtimeShader;
        renderNode.setRenderEffect(RenderEffect.createRuntimeShaderEffect(runtimeShader, "img"));
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i10) {
        float f19;
        float f20;
        float f21;
        float f22;
        float width = this.f12982a.getWidth();
        float height = this.f12982a.getHeight();
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
        if (Math.abs(this.f12984c - width) > 0.1f || Math.abs(this.d - height) > 0.1f || Math.abs(this.f12985e - f23) > 0.1f || Math.abs(this.f12986f - f24) > 0.1f || Math.abs(this.f12987g - f26) > 0.1f || Math.abs(this.h - f27) > 0.1f || Math.abs(this.f12988i - f19) > 0.1f || Math.abs(this.f12989j - f21) > 0.1f || Math.abs(this.f12990k - f22) > 0.1f || Math.abs(this.f12991l - f20) > 0.1f || Math.abs(this.f12992m - f16) > 0.1f || Math.abs(this.f12993n - f17) > 0.1f || Math.abs(this.f12994o - f18) > 0.1f || this.f12995p != i10) {
            this.f12995p = i10;
            float fAlpha = Color.alpha(i10) / 255.0f;
            float fRed = (Color.red(i10) / 255.0f) * fAlpha;
            float fGreen = (Color.green(i10) / 255.0f) * fAlpha;
            float fBlue = (Color.blue(i10) / 255.0f) * fAlpha;
            RuntimeShader runtimeShader = this.f12983b;
            this.f12984c = width;
            this.d = height;
            runtimeShader.setFloatUniform("resolution", width, height);
            RuntimeShader runtimeShader2 = this.f12983b;
            this.f12985e = f23;
            this.f12986f = f24;
            runtimeShader2.setFloatUniform("center", f23, f24);
            RuntimeShader runtimeShader3 = this.f12983b;
            this.f12987g = f26;
            this.h = f27;
            runtimeShader3.setFloatUniform("size", f26, f27);
            RuntimeShader runtimeShader4 = this.f12983b;
            this.f12990k = f22;
            this.f12989j = f21;
            this.f12991l = f20;
            this.f12988i = f19;
            runtimeShader4.setFloatUniform("radius", f22, f21, f20, f19);
            RuntimeShader runtimeShader5 = this.f12983b;
            this.f12992m = f16;
            runtimeShader5.setFloatUniform("thickness", f16);
            RuntimeShader runtimeShader6 = this.f12983b;
            this.f12993n = f17;
            runtimeShader6.setFloatUniform("refract_intensity", f17);
            RuntimeShader runtimeShader7 = this.f12983b;
            this.f12994o = f18;
            runtimeShader7.setFloatUniform("refract_index", f18);
            this.f12983b.setFloatUniform("foreground_color_premultiplied", fRed, fGreen, fBlue, fAlpha);
            this.f12982a.setRenderEffect(RenderEffect.createRuntimeShaderEffect(this.f12983b, "img"));
        }
    }
}
