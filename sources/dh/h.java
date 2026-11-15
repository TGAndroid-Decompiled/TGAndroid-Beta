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
    public final RenderNode f8135a;
    public final RuntimeShader f8136b;
    public RuntimeShader f8137c;
    public RuntimeShader d;
    public RenderEffect f8138e;
    public RenderEffect[] f8139f;
    public float[] f8140g;
    public float[] h;
    public int f8141i;
    public float f8142j;
    public float f8143k;
    public float f8144l;
    public float f8145m;
    public float f8146n;
    public float f8147o;
    public float f8148p;
    public float f8149q;
    public float f8150r;
    public int f8151s;
    public float f8152t;
    public float f8153u;
    public float v;
    public float f8154w;
    public float f8155x;
    public float f8156y;
    public float f8157z;

    public h(RenderNode renderNode) {
        this.f8135a = renderNode;
        RuntimeShader runtimeShader = new RuntimeShader(g0.y2(null, 2131624083));
        this.f8136b = runtimeShader;
        this.d = runtimeShader;
        RenderEffect createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
        this.f8138e = createRuntimeShaderEffect;
        renderNode.setRenderEffect(createRuntimeShaderEffect);
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        if (this.f8155x == f10 && this.f8156y == f11 && this.f8157z == f12 && this.A == f13 && this.f8152t == f14 && this.f8153u == f15 && this.v == f16 && this.f8154w == f17) {
            return;
        }
        this.f8155x = f10;
        this.f8156y = f11;
        this.f8157z = f12;
        this.A = f13;
        this.f8152t = f14;
        this.f8153u = f15;
        this.v = f16;
        this.f8154w = f17;
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
        if (this.f8141i != i10 || Math.abs(this.f8142j - f10) > 0.1f || Math.abs(this.f8143k - f11) > 0.1f || Math.abs(this.f8144l - f23) > 0.1f || Math.abs(this.f8145m - f25) > 0.1f || Math.abs(this.f8146n - f26) > 0.1f || Math.abs(this.f8147o - f24) > 0.1f || Math.abs(this.f8148p - f18) > 0.1f || Math.abs(this.f8149q - f19) > 0.1f || Math.abs(this.f8150r - f20) > 0.1f || this.f8151s != i7 || this.B) {
            this.B = false;
            if (this.f8152t > 0.0f) {
                if (this.f8137c == null) {
                    this.f8137c = new RuntimeShader(g0.y2(null, 2131624082));
                }
                this.d = this.f8137c;
            } else {
                this.d = this.f8136b;
            }
            this.f8151s = i7;
            float alpha = Color.alpha(i7) / 255.0f;
            float f31 = 1.0f / i10;
            this.f8141i = i10;
            this.f8142j = f10;
            this.f8143k = f11;
            this.f8146n = f26;
            this.f8145m = f25;
            this.f8147o = f24;
            this.f8144l = f23;
            this.f8148p = f18;
            this.d.setFloatUniform("size", (f10 / 2.0f) * f31, (f11 / 2.0f) * f31);
            this.d.setFloatUniform("radius", f26 * f31, f25 * f31, f24 * f31, f23 * f31);
            this.d.setFloatUniform("thickness", f18 * f31);
            RuntimeShader runtimeShader = this.d;
            this.f8149q = f19;
            runtimeShader.setFloatUniform("refract_intensity", f19);
            RuntimeShader runtimeShader2 = this.d;
            this.f8150r = f20;
            runtimeShader2.setFloatUniform("refract_index", f20);
            this.d.setFloatUniform("foreground_color_premultiplied", (Color.red(i7) / 255.0f) * alpha, (Color.green(i7) / 255.0f) * alpha, (Color.blue(i7) / 255.0f) * alpha, alpha);
            RuntimeShader runtimeShader3 = this.d;
            if (runtimeShader3 == this.f8137c) {
                runtimeShader3.setFloatUniform("arrow", this.f8152t * f31, this.f8153u * f31, this.v * f31, this.f8154w * f31);
                this.d.setFloatUniform("arrow_axis", this.f8155x * f31, this.f8156y * f31, this.f8157z, this.A);
            }
            int i11 = (i10 * i10) + 1;
            RenderEffect[] renderEffectArr = this.f8139f;
            if (renderEffectArr != null && renderEffectArr.length == i11) {
                Arrays.fill(renderEffectArr, (Object) null);
            } else {
                this.f8139f = new RenderEffect[i11];
                this.f8140g = new float[i11];
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
            length = this.f8139f.length - 1;
        }
        RenderEffect renderEffect = this.f8139f[length];
        if (renderEffect == null || this.f8140g[length] != f33 || this.h[length] != f34) {
            this.d.setFloatUniform("center", f33, f34);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.d, "img");
            this.f8139f[length] = renderEffect;
            this.f8140g[length] = f33;
            this.h[length] = f34;
        }
        if (this.f8138e != renderEffect) {
            RenderNode renderNode = this.f8135a;
            this.f8138e = renderEffect;
            renderNode.setRenderEffect(renderEffect);
        }
    }
}
