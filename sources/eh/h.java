package eh;

import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.g0;
public final class h {
    public float A;
    public boolean B;
    public final RenderNode f10023a;
    public final RuntimeShader f10024b;
    public RuntimeShader f10025c;
    public RuntimeShader d;
    public RenderEffect f10026e;
    public RenderEffect[] f10027f;
    public float[] f10028g;
    public float[] h;
    public int f10029i;
    public float f10030j;
    public float f10031k;
    public float f10032l;
    public float f10033m;
    public float f10034n;
    public float f10035o;
    public float f10036p;
    public float f10037q;
    public float f10038r;
    public int f10039s;
    public float f10040t;
    public float f10041u;
    public float v;
    public float f10042w;
    public float f10043x;
    public float f10044y;
    public float f10045z;

    public h(RenderNode renderNode) {
        this.f10023a = renderNode;
        RuntimeShader runtimeShader = new RuntimeShader(g0.y2(null, 2131624082));
        this.f10024b = runtimeShader;
        this.d = runtimeShader;
        RenderEffect createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
        this.f10026e = createRuntimeShaderEffect;
        renderNode.setRenderEffect(createRuntimeShaderEffect);
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        if (this.f10043x == f10 && this.f10044y == f11 && this.f10045z == f12 && this.A == f13 && this.f10040t == f14 && this.f10041u == f15 && this.v == f16 && this.f10042w == f17) {
            return;
        }
        this.f10043x = f10;
        this.f10044y = f11;
        this.f10045z = f12;
        this.A = f13;
        this.f10040t = f14;
        this.f10041u = f15;
        this.v = f16;
        this.f10042w = f17;
        this.B = true;
    }

    public final void b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, int i3, float f21, float f22, int i10) {
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
        if (this.f10029i != i10 || Math.abs(this.f10030j - f10) > 0.1f || Math.abs(this.f10031k - f11) > 0.1f || Math.abs(this.f10032l - f23) > 0.1f || Math.abs(this.f10033m - f25) > 0.1f || Math.abs(this.f10034n - f26) > 0.1f || Math.abs(this.f10035o - f24) > 0.1f || Math.abs(this.f10036p - f18) > 0.1f || Math.abs(this.f10037q - f19) > 0.1f || Math.abs(this.f10038r - f20) > 0.1f || this.f10039s != i3 || this.B) {
            this.B = false;
            if (this.f10040t > 0.0f) {
                if (this.f10025c == null) {
                    this.f10025c = new RuntimeShader(g0.y2(null, 2131624081));
                }
                this.d = this.f10025c;
            } else {
                this.d = this.f10024b;
            }
            this.f10039s = i3;
            float alpha = Color.alpha(i3) / 255.0f;
            float f31 = 1.0f / i10;
            this.f10029i = i10;
            this.f10030j = f10;
            this.f10031k = f11;
            this.f10034n = f26;
            this.f10033m = f25;
            this.f10035o = f24;
            this.f10032l = f23;
            this.f10036p = f18;
            this.d.setFloatUniform("size", (f10 / 2.0f) * f31, (f11 / 2.0f) * f31);
            this.d.setFloatUniform("radius", f26 * f31, f25 * f31, f24 * f31, f23 * f31);
            this.d.setFloatUniform("thickness", f18 * f31);
            RuntimeShader runtimeShader = this.d;
            this.f10037q = f19;
            runtimeShader.setFloatUniform("refract_intensity", f19);
            RuntimeShader runtimeShader2 = this.d;
            this.f10038r = f20;
            runtimeShader2.setFloatUniform("refract_index", f20);
            this.d.setFloatUniform("foreground_color_premultiplied", (Color.red(i3) / 255.0f) * alpha, (Color.green(i3) / 255.0f) * alpha, (Color.blue(i3) / 255.0f) * alpha, alpha);
            RuntimeShader runtimeShader3 = this.d;
            if (runtimeShader3 == this.f10025c) {
                runtimeShader3.setFloatUniform("arrow", this.f10040t * f31, this.f10041u * f31, this.v * f31, this.f10042w * f31);
                this.d.setFloatUniform("arrow_axis", this.f10043x * f31, this.f10044y * f31, this.f10045z, this.A);
            }
            int i11 = (i10 * i10) + 1;
            RenderEffect[] renderEffectArr = this.f10027f;
            if (renderEffectArr != null && renderEffectArr.length == i11) {
                Arrays.fill(renderEffectArr, (Object) null);
            } else {
                this.f10027f = new RenderEffect[i11];
                this.f10028g = new float[i11];
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
            length = this.f10027f.length - 1;
        }
        RenderEffect renderEffect = this.f10027f[length];
        if (renderEffect == null || this.f10028g[length] != f33 || this.h[length] != f34) {
            this.d.setFloatUniform("center", f33, f34);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.d, "img");
            this.f10027f[length] = renderEffect;
            this.f10028g[length] = f33;
            this.h[length] = f34;
        }
        if (this.f10026e != renderEffect) {
            RenderNode renderNode = this.f10023a;
            this.f10026e = renderEffect;
            renderNode.setRenderEffect(renderEffect);
        }
    }
}
