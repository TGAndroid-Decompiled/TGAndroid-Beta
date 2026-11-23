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
    public final RenderNode f8408a;
    public final RuntimeShader f8409b;
    public RuntimeShader f8410c;
    public RuntimeShader d;
    public RenderEffect f8411e;
    public RenderEffect[] f8412f;
    public float[] f8413g;
    public float[] h;
    public int f8414i;
    public float f8415j;
    public float f8416k;
    public float f8417l;
    public float f8418m;
    public float f8419n;
    public float f8420o;
    public float f8421p;
    public float f8422q;
    public float f8423r;
    public int f8424s;
    public float f8425t;
    public float f8426u;
    public float v;
    public float f8427w;
    public float f8428x;
    public float f8429y;
    public float f8430z;

    public h(RenderNode renderNode) {
        this.f8408a = renderNode;
        RuntimeShader runtimeShader = new RuntimeShader(g0.y2(null, 2131624083));
        this.f8409b = runtimeShader;
        this.d = runtimeShader;
        RenderEffect createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
        this.f8411e = createRuntimeShaderEffect;
        renderNode.setRenderEffect(createRuntimeShaderEffect);
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        if (this.f8428x == f10 && this.f8429y == f11 && this.f8430z == f12 && this.A == f13 && this.f8425t == f14 && this.f8426u == f15 && this.v == f16 && this.f8427w == f17) {
            return;
        }
        this.f8428x = f10;
        this.f8429y = f11;
        this.f8430z = f12;
        this.A = f13;
        this.f8425t = f14;
        this.f8426u = f15;
        this.v = f16;
        this.f8427w = f17;
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
        if (this.f8414i != i10 || Math.abs(this.f8415j - f10) > 0.1f || Math.abs(this.f8416k - f11) > 0.1f || Math.abs(this.f8417l - f23) > 0.1f || Math.abs(this.f8418m - f25) > 0.1f || Math.abs(this.f8419n - f26) > 0.1f || Math.abs(this.f8420o - f24) > 0.1f || Math.abs(this.f8421p - f18) > 0.1f || Math.abs(this.f8422q - f19) > 0.1f || Math.abs(this.f8423r - f20) > 0.1f || this.f8424s != i7 || this.B) {
            this.B = false;
            if (this.f8425t > 0.0f) {
                if (this.f8410c == null) {
                    this.f8410c = new RuntimeShader(g0.y2(null, 2131624082));
                }
                this.d = this.f8410c;
            } else {
                this.d = this.f8409b;
            }
            this.f8424s = i7;
            float alpha = Color.alpha(i7) / 255.0f;
            float f31 = 1.0f / i10;
            this.f8414i = i10;
            this.f8415j = f10;
            this.f8416k = f11;
            this.f8419n = f26;
            this.f8418m = f25;
            this.f8420o = f24;
            this.f8417l = f23;
            this.f8421p = f18;
            this.d.setFloatUniform("size", (f10 / 2.0f) * f31, (f11 / 2.0f) * f31);
            this.d.setFloatUniform("radius", f26 * f31, f25 * f31, f24 * f31, f23 * f31);
            this.d.setFloatUniform("thickness", f18 * f31);
            RuntimeShader runtimeShader = this.d;
            this.f8422q = f19;
            runtimeShader.setFloatUniform("refract_intensity", f19);
            RuntimeShader runtimeShader2 = this.d;
            this.f8423r = f20;
            runtimeShader2.setFloatUniform("refract_index", f20);
            this.d.setFloatUniform("foreground_color_premultiplied", (Color.red(i7) / 255.0f) * alpha, (Color.green(i7) / 255.0f) * alpha, (Color.blue(i7) / 255.0f) * alpha, alpha);
            RuntimeShader runtimeShader3 = this.d;
            if (runtimeShader3 == this.f8410c) {
                runtimeShader3.setFloatUniform("arrow", this.f8425t * f31, this.f8426u * f31, this.v * f31, this.f8427w * f31);
                this.d.setFloatUniform("arrow_axis", this.f8428x * f31, this.f8429y * f31, this.f8430z, this.A);
            }
            int i11 = (i10 * i10) + 1;
            RenderEffect[] renderEffectArr = this.f8412f;
            if (renderEffectArr != null && renderEffectArr.length == i11) {
                Arrays.fill(renderEffectArr, (Object) null);
            } else {
                this.f8412f = new RenderEffect[i11];
                this.f8413g = new float[i11];
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
            length = this.f8412f.length - 1;
        }
        RenderEffect renderEffect = this.f8412f[length];
        if (renderEffect == null || this.f8413g[length] != f33 || this.h[length] != f34) {
            this.d.setFloatUniform("center", f33, f34);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.d, "img");
            this.f8412f[length] = renderEffect;
            this.f8413g[length] = f33;
            this.h[length] = f34;
        }
        if (this.f8411e != renderEffect) {
            RenderNode renderNode = this.f8408a;
            this.f8411e = renderEffect;
            renderNode.setRenderEffect(renderEffect);
        }
    }
}
