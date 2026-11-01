package fi;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.support.v4.media.session.w;
import java.util.Arrays;
import v7.i7;
public final class f extends i7 {
    public final RenderNode f7119a = w.m();
    public final RuntimeShader f7120b = e.a();
    public int f7121c = -1;
    public int d = -1;
    public int e;
    public RenderEffect[] f7122f;
    public float[] f7123g;
    public float[] h;
    public final g f7124i;

    public f(g gVar) {
        this.f7124i = gVar;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        int i10;
        int i11;
        float f7;
        float f10;
        int height;
        float f11;
        a aVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int a2;
        int a10;
        int g10;
        int g11;
        g gVar = this.f7124i;
        a aVar2 = gVar.h;
        if (aVar2 != null && aVar2.h() && aVar2.f() > 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (i10 != 0) {
            i11 = aVar2.f();
        } else {
            i11 = 1;
        }
        if (i10 != 0) {
            f7 = g.l(rectF.left, aVar2.g(), i11) - (i10 * i11);
        } else {
            f7 = rectF.left;
        }
        if (i10 != 0) {
            f10 = g.l(rectF.top, aVar2.a(), i11) - (i10 * i11);
        } else {
            f10 = rectF.top;
        }
        float f12 = f7 - rectF.left;
        float f13 = f10 - rectF.top;
        float f14 = i11;
        int ceil = ((int) Math.ceil((rectF.right - f7) / f14)) + i10;
        int ceil2 = ((int) Math.ceil((rectF.bottom - f10) / f14)) + i10;
        if (!gVar.f7129w && this.f7121c == rect.width() && this.d == rect.height() && this.e == i11) {
            aVar = aVar2;
            i13 = i10;
            i12 = ceil;
            f11 = f14;
            i14 = ceil2;
        } else {
            int i17 = gVar.f7131y;
            if (i17 != 1 && i17 != 4) {
                height = rect.width();
            } else {
                height = rect.height();
            }
            float f15 = height;
            RuntimeShader runtimeShader = this.f7120b;
            h hVar = gVar.D;
            hVar.getClass();
            float f16 = 0;
            f11 = f14;
            aVar = aVar2;
            i12 = ceil;
            i13 = i10;
            i14 = ceil2;
            runtimeShader.setInputShader("alphaMask", g.k(gVar, hVar, f15, f16, -1, i11));
            RuntimeShader runtimeShader2 = this.f7120b;
            h hVar2 = gVar.E;
            hVar2.getClass();
            runtimeShader2.setInputShader("overlay", g.k(gVar, hVar2, f15, f16, gVar.H, i11));
            this.f7120b.setFloatUniform("background_color_premultiplied", Color.red(gVar.H) / 255.0f, Color.green(gVar.H) / 255.0f, Color.blue(gVar.H) / 255.0f, 1.0f);
            this.f7121c = rect.width();
            this.d = rect.height();
            this.e = i11;
            int i18 = i11 * i11;
            RenderEffect[] renderEffectArr = this.f7122f;
            if (renderEffectArr != null && renderEffectArr.length == i18) {
                Arrays.fill(renderEffectArr, (Object) null);
            } else {
                this.f7122f = new RenderEffect[i18];
                this.f7123g = new float[i18];
                this.h = new float[i18];
            }
        }
        if (i13 != 0 && (g11 = (g10 = aVar.g()) % i11) != 0) {
            if ((((g10 ^ i11) >> 31) | 1) > 0) {
                i15 = g11;
            } else {
                i15 = g11 + i11;
            }
        } else {
            i15 = 0;
        }
        if (i13 != 0 && (a10 = (a2 = aVar.a()) % i11) != 0) {
            if ((((a2 ^ i11) >> 31) | 1) > 0) {
                i16 = a10;
            } else {
                i16 = a10 + i11;
            }
        } else {
            i16 = 0;
        }
        int i19 = (i16 * i11) + i15;
        float f17 = f12 / f11;
        float f18 = f13 / f11;
        RenderEffect renderEffect = this.f7122f[i19];
        if (renderEffect == null || this.f7123g[i19] != f17 || this.h[i19] != f18) {
            this.f7120b.setFloatUniform("shader_offset", f17, f18);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.f7120b, "content");
            this.f7122f[i19] = renderEffect;
            this.f7123g[i19] = f17;
            this.h[i19] = f18;
        }
        this.f7119a.setPosition(0, 0, i12, i14);
        this.f7119a.setPivotX(0.0f);
        this.f7119a.setPivotY(0.0f);
        this.f7119a.setScaleX(f11);
        this.f7119a.setScaleY(f11);
        this.f7119a.setTranslationX(f12);
        this.f7119a.setTranslationY(f13);
        RecordingCanvas beginRecording = this.f7119a.beginRecording();
        if (i13 != 0) {
            gVar.h.d(f7, f10, i11, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            gVar.f7125f.e(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
            beginRecording.restore();
        }
        this.f7119a.endRecording();
        this.f7119a.setRenderEffect(renderEffect);
        gVar.f7129w = false;
    }

    @Override
    public final void b() {
        this.f7119a.discardDisplayList();
        this.f7121c = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f7119a);
    }

    @Override
    public final boolean d() {
        return this.f7119a.hasDisplayList();
    }

    @Override
    public final void e(float f7) {
        this.f7119a.setAlpha(f7);
    }
}
