package defpackage;

import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import java.util.Arrays;
public final class w66 {
    public float A;
    public boolean B;
    public final RenderNode a;
    public final RuntimeShader b;
    public RuntimeShader c;
    public RuntimeShader d;
    public RenderEffect e;
    public RenderEffect[] f;
    public float[] g;
    public float[] h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public int s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public w66(RenderNode renderNode) {
        this.a = renderNode;
        RuntimeShader b = fn3.b(hl.v2(null, 2131624083));
        this.b = b;
        this.d = b;
        RenderEffect createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(b, "img");
        this.e = createRuntimeShaderEffect;
        renderNode.setRenderEffect(createRuntimeShaderEffect);
    }

    public final void a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (this.x == f && this.y == f2 && this.z == f3 && this.A == f4 && this.t == f5 && this.u == f6 && this.v == f7 && this.w == f8) {
            return;
        }
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = f4;
        this.t = f5;
        this.u = f6;
        this.v = f7;
        this.w = f8;
        this.B = true;
    }

    public final void b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, int i, float f12, float f13, int i2) {
        float f14;
        float f15;
        float f16;
        float f17;
        int length;
        float f18 = f5 + f8;
        if (f18 > f2) {
            float f19 = f5 / f18;
            f14 = f2 * f19;
            f15 = (1.0f - f19) * f2;
        } else {
            f14 = f5;
            f15 = f8;
        }
        float f20 = f6 + f7;
        if (f20 > f2) {
            float f21 = f6 / f20;
            f16 = f2 * f21;
            f17 = (1.0f - f21) * f2;
        } else {
            f16 = f6;
            f17 = f7;
        }
        if (this.i != i2 || Math.abs(this.j - f) > 0.1f || Math.abs(this.k - f2) > 0.1f || Math.abs(this.l - f14) > 0.1f || Math.abs(this.m - f16) > 0.1f || Math.abs(this.n - f17) > 0.1f || Math.abs(this.o - f15) > 0.1f || Math.abs(this.p - f9) > 0.1f || Math.abs(this.q - f10) > 0.1f || Math.abs(this.r - f11) > 0.1f || this.s != i || this.B) {
            this.B = false;
            if (this.t > 0.0f) {
                RuntimeShader runtimeShader = this.c;
                if (runtimeShader == null) {
                    fn3.c();
                    runtimeShader = fn3.b(hl.v2(null, 2131624082));
                    this.c = runtimeShader;
                }
                this.d = runtimeShader;
            } else {
                this.d = this.b;
            }
            this.s = i;
            float alpha = Color.alpha(i) / 255.0f;
            float f22 = 1.0f / i2;
            this.i = i2;
            this.j = f;
            this.k = f2;
            this.n = f17;
            this.m = f16;
            this.o = f15;
            this.l = f14;
            this.p = f9;
            this.d.setFloatUniform("size", (f / 2.0f) * f22, (f2 / 2.0f) * f22);
            this.d.setFloatUniform("radius", f17 * f22, f16 * f22, f15 * f22, f14 * f22);
            this.d.setFloatUniform("thickness", f9 * f22);
            RuntimeShader runtimeShader2 = this.d;
            this.q = f10;
            runtimeShader2.setFloatUniform("refract_intensity", f10);
            RuntimeShader runtimeShader3 = this.d;
            this.r = f11;
            runtimeShader3.setFloatUniform("refract_index", f11);
            this.d.setFloatUniform("foreground_color_premultiplied", (Color.red(i) / 255.0f) * alpha, (Color.green(i) / 255.0f) * alpha, (Color.blue(i) / 255.0f) * alpha, alpha);
            RuntimeShader runtimeShader4 = this.d;
            if (runtimeShader4 == this.c) {
                runtimeShader4.setFloatUniform("arrow", this.t * f22, this.u * f22, this.v * f22, this.w * f22);
                this.d.setFloatUniform("arrow_axis", this.x * f22, this.y * f22, this.z, this.A);
            }
            int i3 = (i2 * i2) + 1;
            RenderEffect[] renderEffectArr = this.f;
            if (renderEffectArr != null && renderEffectArr.length == i3) {
                Arrays.fill(renderEffectArr, (Object) null);
            } else {
                this.f = new RenderEffect[i3];
                this.g = new float[i3];
                this.h = new float[i3];
            }
        }
        float f23 = i2;
        float f24 = (((f / 2.0f) + f3) - f12) / f23;
        float f25 = (((f2 / 2.0f) + f4) - f13) / f23;
        if (f12 == ((int) f12) && f13 == ((int) f13)) {
            int i4 = (int) (-f13);
            int i5 = i4 % i2;
            if (i5 == 0) {
                i5 = 0;
            } else if ((((i4 ^ i2) >> 31) | 1) <= 0) {
                i5 += i2;
            }
            int i6 = (int) (-f12);
            int i7 = i6 % i2;
            length = (i5 * i2) + (i7 == 0 ? 0 : (((i6 ^ i2) >> 31) | 1) > 0 ? i7 : i7 + i2);
        } else {
            length = this.f.length - 1;
        }
        RenderEffect renderEffect = this.f[length];
        if (renderEffect == null || this.g[length] != f24 || this.h[length] != f25) {
            this.d.setFloatUniform("center", f24, f25);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.d, "img");
            this.f[length] = renderEffect;
            this.g[length] = f24;
            this.h[length] = f25;
        }
        if (this.e != renderEffect) {
            RenderNode renderNode = this.a;
            this.e = renderEffect;
            renderNode.setRenderEffect(renderEffect);
        }
    }
}
