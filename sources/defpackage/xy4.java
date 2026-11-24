package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import java.util.Arrays;
public final class xy4 extends yke {
    public final RenderNode a = ul1.q();
    public final RuntimeShader b = yn3.d();
    public int c = -1;
    public int d = -1;
    public int e;
    public RenderEffect[] f;
    public float[] g;
    public float[] h;
    public final yy4 i;

    public xy4(yy4 yy4Var) {
        this.i = yy4Var;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        int i;
        float f;
        float f2;
        int i2;
        int height;
        ty4 ty4Var;
        int i3;
        float f3;
        float f4;
        int i4;
        int i5;
        int i6;
        int a;
        int a2;
        int g;
        int g2;
        yy4 yy4Var = this.i;
        ty4 ty4Var2 = yy4Var.h;
        if (ty4Var2 != null && ty4Var2.h() && ty4Var2.f() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            int f5 = ty4Var2.f();
            float f6 = i * f5;
            f = yy4.k(rectF.left, ty4Var2.g(), f5) - f6;
            f2 = yy4.k(rectF.top, ty4Var2.a(), f5) - f6;
            i2 = f5;
        } else {
            f = rectF.left;
            f2 = rectF.top;
            i2 = 1;
        }
        int i7 = i;
        float f7 = f2;
        float f8 = f - rectF.left;
        float f9 = f7 - rectF.top;
        float f10 = i2;
        int ceil = ((int) Math.ceil((rectF.right - f) / f10)) + i7;
        int ceil2 = ((int) Math.ceil((rectF.bottom - f7) / f10)) + i7;
        if (!yy4Var.w && this.c == rect.width() && this.d == rect.height() && this.e == i2) {
            ty4Var = ty4Var2;
            f4 = f7;
            i3 = ceil;
            f3 = f10;
            i4 = ceil2;
        } else {
            int i8 = yy4Var.y;
            if (i8 != 1 && i8 != 4) {
                height = rect.width();
            } else {
                height = rect.height();
            }
            float f11 = height;
            RuntimeShader runtimeShader = this.b;
            zy4 zy4Var = yy4Var.E;
            zy4Var.getClass();
            ty4Var = ty4Var2;
            i3 = ceil;
            f3 = f10;
            f4 = f7;
            i4 = ceil2;
            runtimeShader.setInputShader("alphaMask", yy4Var.l(zy4Var, f11, 0.0f, -1, i2));
            RuntimeShader runtimeShader2 = this.b;
            zy4 zy4Var2 = yy4Var.F;
            zy4Var2.getClass();
            runtimeShader2.setInputShader("overlay", yy4Var.l(zy4Var2, f11, 0.0f, yy4Var.I, i2));
            this.b.setFloatUniform("background_color_premultiplied", Color.red(yy4Var.I) / 255.0f, Color.green(yy4Var.I) / 255.0f, Color.blue(yy4Var.I) / 255.0f, 1.0f);
            this.c = rect.width();
            this.d = rect.height();
            this.e = i2;
            int i9 = i2 * i2;
            RenderEffect[] renderEffectArr = this.f;
            if (renderEffectArr != null && renderEffectArr.length == i9) {
                Arrays.fill(renderEffectArr, (Object) null);
            } else {
                this.f = new RenderEffect[i9];
                this.g = new float[i9];
                this.h = new float[i9];
            }
        }
        if (i7 != 0 && (g2 = (g = ty4Var.g()) % i2) != 0) {
            if ((((g ^ i2) >> 31) | 1) > 0) {
                i5 = g2;
            } else {
                i5 = g2 + i2;
            }
        } else {
            i5 = 0;
        }
        if (i7 != 0 && (a2 = (a = ty4Var.a()) % i2) != 0) {
            if ((((a ^ i2) >> 31) | 1) > 0) {
                i6 = a2;
            } else {
                i6 = a2 + i2;
            }
        } else {
            i6 = 0;
        }
        int i10 = (i6 * i2) + i5;
        float f12 = f8 / f3;
        float f13 = f9 / f3;
        RenderEffect renderEffect = this.f[i10];
        if (renderEffect == null || this.g[i10] != f12 || this.h[i10] != f13) {
            this.b.setFloatUniform("shader_offset", f12, f13);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
            this.f[i10] = renderEffect;
            this.g[i10] = f12;
            this.h[i10] = f13;
        }
        this.a.setPosition(0, 0, i3, i4);
        this.a.setPivotX(0.0f);
        this.a.setPivotY(0.0f);
        this.a.setScaleX(f3);
        this.a.setScaleY(f3);
        this.a.setTranslationX(f8);
        this.a.setTranslationY(f9);
        RecordingCanvas beginRecording = this.a.beginRecording();
        if (i7 != 0) {
            yy4Var.h.d(f, f4, i2, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            yy4Var.f.e(rectF.left, rectF.top, rectF.right, rectF.bottom, beginRecording);
            beginRecording.restore();
        }
        this.a.endRecording();
        this.a.setRenderEffect(renderEffect);
        yy4Var.w = false;
    }

    @Override
    public final void b() {
        this.a.discardDisplayList();
        this.c = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override
    public final boolean d() {
        return this.a.hasDisplayList();
    }

    @Override
    public final void e(float f) {
        this.a.setAlpha(f);
    }
}
