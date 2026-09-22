package ah;

import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class i {
    public final RenderNode f461a;
    public final RuntimeShader f462b;
    public float f463c;
    public float d;
    public float e;
    public float f464f;
    public float f465g;
    public float h;
    public float f466i;
    public float f467j;
    public float f468k;
    public float f469l;
    public float f470m;
    public float f471n;
    public float f472o;
    public int f473p;

    public i(RenderNode renderNode) {
        this.f461a = renderNode;
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.liquid_glass_shader));
        this.f462b = runtimeShader;
        renderNode.setRenderEffect(RenderEffect.createRuntimeShaderEffect(runtimeShader, "img"));
    }

    public final void a(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i10) {
        float f18;
        float f19;
        float f20;
        float f21;
        float width = this.f461a.getWidth();
        float height = this.f461a.getHeight();
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
        if (Math.abs(this.f463c - width) <= 0.1f && Math.abs(this.d - height) <= 0.1f && Math.abs(this.e - f22) <= 0.1f && Math.abs(this.f464f - f23) <= 0.1f && Math.abs(this.f465g - f25) <= 0.1f && Math.abs(this.h - f26) <= 0.1f && Math.abs(this.f466i - f18) <= 0.1f && Math.abs(this.f467j - f20) <= 0.1f && Math.abs(this.f468k - f21) <= 0.1f && Math.abs(this.f469l - f19) <= 0.1f && Math.abs(this.f470m - f15) <= 0.1f && Math.abs(this.f471n - f16) <= 0.1f && Math.abs(this.f472o - f17) <= 0.1f && this.f473p == i10) {
            return;
        }
        this.f473p = i10;
        float alpha = Color.alpha(i10) / 255.0f;
        RuntimeShader runtimeShader = this.f462b;
        this.f463c = width;
        this.d = height;
        runtimeShader.setFloatUniform("resolution", width, height);
        RuntimeShader runtimeShader2 = this.f462b;
        this.e = f22;
        this.f464f = f23;
        runtimeShader2.setFloatUniform("center", f22, f23);
        RuntimeShader runtimeShader3 = this.f462b;
        this.f465g = f25;
        this.h = f26;
        runtimeShader3.setFloatUniform("size", f25, f26);
        RuntimeShader runtimeShader4 = this.f462b;
        this.f468k = f21;
        this.f467j = f20;
        this.f469l = f19;
        this.f466i = f18;
        runtimeShader4.setFloatUniform("radius", f21, f20, f19, f18);
        RuntimeShader runtimeShader5 = this.f462b;
        this.f470m = f15;
        runtimeShader5.setFloatUniform("thickness", f15);
        RuntimeShader runtimeShader6 = this.f462b;
        this.f471n = f16;
        runtimeShader6.setFloatUniform("refract_intensity", f16);
        RuntimeShader runtimeShader7 = this.f462b;
        this.f472o = f17;
        runtimeShader7.setFloatUniform("refract_index", f17);
        this.f462b.setFloatUniform("foreground_color_premultiplied", (Color.red(i10) / 255.0f) * alpha, (Color.green(i10) / 255.0f) * alpha, (Color.blue(i10) / 255.0f) * alpha, alpha);
        this.f461a.setRenderEffect(RenderEffect.createRuntimeShaderEffect(this.f462b, "img"));
    }
}
