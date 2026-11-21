package dh;

import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.g0;
public final class h {
    public float A;
    public boolean B;
    public final RenderNode f8443a;
    public final RuntimeShader f8444b;
    public RuntimeShader f8445c;
    public RuntimeShader d;
    public RenderEffect f8446e;
    public RenderEffect[] f8447f;
    public float[] f8448g;
    public float[] h;
    public int f8449i;
    public float f8450j;
    public float f8451k;
    public float f8452l;
    public float f8453m;
    public float f8454n;
    public float f8455o;
    public float f8456p;
    public float f8457q;
    public float f8458r;
    public int f8459s;
    public float f8460t;
    public float f8461u;
    public float v;
    public float f8462w;
    public float f8463x;
    public float f8464y;
    public float f8465z;

    public h(RenderNode renderNode) {
        this.f8443a = renderNode;
        RuntimeShader runtimeShader = new RuntimeShader(g0.y2(null, 2131624083));
        this.f8444b = runtimeShader;
        this.d = runtimeShader;
        RenderEffect createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
        this.f8446e = createRuntimeShaderEffect;
        renderNode.setRenderEffect(createRuntimeShaderEffect);
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        if (this.f8463x == f10 && this.f8464y == f11 && this.f8465z == f12 && this.A == f13 && this.f8460t == f14 && this.f8461u == f15 && this.v == f16 && this.f8462w == f17) {
            return;
        }
        this.f8463x = f10;
        this.f8464y = f11;
        this.f8465z = f12;
        this.A = f13;
        this.f8460t = f14;
        this.f8461u = f15;
        this.v = f16;
        this.f8462w = f17;
        this.B = true;
    }

    public final void b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, int i7, float f21, float f22, int i10) {
        float f23;
        float f24;
        float f25;
        float f26;
        int length;
        float f27 = f14 + f17;
        if (f27 > f11) {
            float f28 = f14 / f27;
            f23 = f11 * f28;
            f24 = (1.0f - f28) * f11;
        } else {
            f23 = f14;
            f24 = f17;
        }
        float f29 = f15 + f16;
        if (f29 > f11) {
            float f30 = f15 / f29;
            f25 = f11 * f30;
            f26 = (1.0f - f30) * f11;
        } else {
            f25 = f15;
            f26 = f16;
        }
        if (this.f8449i != i10 || Math.abs(this.f8450j - f10) > 0.1f || Math.abs(this.f8451k - f11) > 0.1f || Math.abs(this.f8452l - f23) > 0.1f || Math.abs(this.f8453m - f25) > 0.1f || Math.abs(this.f8454n - f26) > 0.1f || Math.abs(this.f8455o - f24) > 0.1f || Math.abs(this.f8456p - f18) > 0.1f || Math.abs(this.f8457q - f19) > 0.1f || Math.abs(this.f8458r - f20) > 0.1f || this.f8459s != i7 || this.B) {
            this.B = false;
            if (this.f8460t > 0.0f) {
                if (this.f8445c == null) {
                    this.f8445c = new RuntimeShader(g0.y2(null, 2131624082));
                }
                this.d = this.f8445c;
            } else {
                this.d = this.f8444b;
            }
            this.f8459s = i7;
            float alpha = Color.alpha(i7) / 255.0f;
            float f31 = 1.0f / i10;
            this.f8449i = i10;
            this.f8450j = f10;
            this.f8451k = f11;
            this.f8454n = f26;
            this.f8453m = f25;
            this.f8455o = f24;
            this.f8452l = f23;
            this.f8456p = f18;
            this.d.setFloatUniform("size", (f10 / 2.0f) * f31, (f11 / 2.0f) * f31);
            this.d.setFloatUniform("radius", f26 * f31, f25 * f31, f24 * f31, f23 * f31);
            this.d.setFloatUniform("thickness", f18 * f31);
            RuntimeShader runtimeShader = this.d;
            this.f8457q = f19;
            runtimeShader.setFloatUniform("refract_intensity", f19);
            RuntimeShader runtimeShader2 = this.d;
            this.f8458r = f20;
            runtimeShader2.setFloatUniform("refract_index", f20);
            this.d.setFloatUniform("foreground_color_premultiplied", (Color.red(i7) / 255.0f) * alpha, (Color.green(i7) / 255.0f) * alpha, (Color.blue(i7) / 255.0f) * alpha, alpha);
            RuntimeShader runtimeShader3 = this.d;
            if (runtimeShader3 == this.f8445c) {
                runtimeShader3.setFloatUniform("arrow", this.f8460t * f31, this.f8461u * f31, this.v * f31, this.f8462w * f31);
                this.d.setFloatUniform("arrow_axis", this.f8463x * f31, this.f8464y * f31, this.f8465z, this.A);
            }
            int i11 = (i10 * i10) + 1;
            RenderEffect[] renderEffectArr = this.f8447f;
            if (renderEffectArr != null && renderEffectArr.length == i11) {
                Arrays.fill(renderEffectArr, (Object) null);
            } else {
                this.f8447f = new RenderEffect[i11];
                this.f8448g = new float[i11];
                this.h = new float[i11];
            }
        }
        float f32 = i10;
        float f33 = (((f10 / 2.0f) + f12) - f21) / f32;
        float f34 = (((f11 / 2.0f) + f13) - f22) / f32;
        if (f21 == ((int) f21) && f22 == ((int) f22)) {
            int i12 = (int) (-f22);
            int i13 = i12 % i10;
            if (i13 == 0) {
                i13 = 0;
            } else if ((((i12 ^ i10) >> 31) | 1) <= 0) {
                i13 += i10;
            }
            int i14 = (int) (-f21);
            int i15 = i14 % i10;
            length = (i13 * i10) + (i15 == 0 ? 0 : (((i14 ^ i10) >> 31) | 1) > 0 ? i15 : i15 + i10);
        } else {
            length = this.f8447f.length - 1;
        }
        RenderEffect renderEffect = this.f8447f[length];
        if (renderEffect == null || this.f8448g[length] != f33 || this.h[length] != f34) {
            this.d.setFloatUniform("center", f33, f34);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.d, "img");
            this.f8447f[length] = renderEffect;
            this.f8448g[length] = f33;
            this.h[length] = f34;
        }
        if (this.f8446e != renderEffect) {
            RenderNode renderNode = this.f8443a;
            this.f8446e = renderEffect;
            renderNode.setRenderEffect(renderEffect);
        }
    }
}
