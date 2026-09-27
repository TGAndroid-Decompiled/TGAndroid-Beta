package mi;

import ah.f;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import li.d;
import org.telegram.ui.ActionBar.i6;
import yf.y;
public final class b extends c {
    public final d f15087a;
    public int d;
    public int f15091g;
    public com.google.android.gms.internal.cast.a f15093j;
    public fh.c f15095l;
    public int f15096m;
    public float f15099p;
    public float f15100q;
    public final RenderNode f15088b = f.n();
    public final RuntimeShader f15089c = a.a();
    public int e = -1;
    public float f15090f = -1.0f;
    public boolean h = true;
    public int f15092i = 1;
    public com.google.android.gms.internal.cast.a f15094k = new com.google.android.gms.internal.cast.a(-1);
    public int f15097n = 255;
    public int f15098o = 255;
    public final RectF f15101r = new RectF();

    public b(d dVar) {
        this.f15087a = dVar;
    }

    @Override
    public final void a() {
        int i10;
        float f7;
        float f10;
        Rect bounds = getBounds();
        this.d = 0;
        if (bounds.isEmpty()) {
            this.f15088b.discardDisplayList();
            return;
        }
        RectF rectF = this.f15101r;
        rectF.set(bounds);
        rectF.offset(this.f15099p, this.f15100q);
        RenderNode renderNode = this.f15088b;
        int i11 = 0;
        while (true) {
            d dVar = this.f15087a;
            if (i11 >= dVar.f14369b) {
                break;
            }
            li.c cVar = (li.c) dVar.f14368a.get(i11);
            if (!RectF.intersects(cVar.f14362a, rectF)) {
                i11++;
            } else {
                i10 = cVar.h;
                float f11 = i10;
                int ceil = (int) Math.ceil(rectF.width() / f11);
                int ceil2 = (int) Math.ceil(rectF.height() / f11);
                if (ceil > 0 && ceil2 > 0 && cVar.d.hasDisplayList()) {
                    renderNode.setPosition(0, 0, ceil, ceil2);
                    renderNode.setPivotX(0.0f);
                    renderNode.setPivotY(0.0f);
                    renderNode.setScaleX(f11);
                    renderNode.setScaleY(f11);
                    RecordingCanvas beginRecording = renderNode.beginRecording();
                    beginRecording.save();
                    RectF rectF2 = cVar.f14362a;
                    float f12 = rectF2.left;
                    float f13 = rectF.left;
                    float f14 = rectF2.top;
                    float f15 = rectF.top;
                    beginRecording.clipRect((f12 - f13) / f11, (f14 - f15) / f11, (rectF2.right - f13) / f11, (rectF2.bottom - f15) / f11);
                    RectF rectF3 = cVar.f14364c;
                    beginRecording.translate((rectF3.left - rectF.left) / f11, (rectF3.top - rectF.top) / f11);
                    beginRecording.drawRenderNode(cVar.d);
                    beginRecording.restore();
                    renderNode.endRecording();
                }
            }
        }
        i10 = 0;
        this.d = i10;
        if (i10 == 0) {
            this.f15088b.discardDisplayList();
        } else if (i10 > 0) {
            Rect bounds2 = getBounds();
            if (!bounds2.isEmpty()) {
                int width = bounds2.width();
                float height = bounds2.height();
                if (!this.h && width == this.e && height == this.f15090f && this.f15091g == this.d) {
                    return;
                }
                int i12 = this.f15092i;
                if (i12 != 1 && i12 != 4) {
                    f7 = width;
                } else {
                    f7 = height;
                }
                com.google.android.gms.internal.cast.a aVar = this.f15093j;
                if (aVar == null) {
                    f10 = 0.5f * f7;
                } else {
                    f10 = 0;
                }
                LinearGradient h = h(aVar, f7, f10, -1);
                com.google.android.gms.internal.cast.a aVar2 = this.f15094k;
                aVar2.getClass();
                LinearGradient h10 = h(aVar2, f7, 0, this.f15096m);
                this.f15089c.setInputShader("alphaMask", h);
                this.f15089c.setInputShader("overlay", h10);
                this.f15089c.setFloatUniform("background_color_premultiplied", Color.red(this.f15096m) / 255.0f, Color.green(this.f15096m) / 255.0f, Color.blue(this.f15096m) / 255.0f, 1.0f);
                this.f15088b.setRenderEffect(RenderEffect.createRuntimeShaderEffect(this.f15089c, "content"));
                this.e = width;
                this.f15090f = height;
                this.f15091g = this.d;
                this.h = false;
            }
        }
    }

    @Override
    public final boolean d() {
        return this.f15088b.hasDisplayList();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f15098o > 0) {
            canvas.save();
            canvas.clipRect(bounds);
            canvas.translate(bounds.left, bounds.top);
            if (canvas.isHardwareAccelerated()) {
                canvas.drawRenderNode(this.f15088b);
            }
            canvas.restore();
        }
    }

    @Override
    public final void e(float f7, float f10) {
        if (this.f15099p == f7 && this.f15100q == f10) {
            return;
        }
        this.f15099p = f7;
        this.f15100q = f10;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final void g() {
        fh.c cVar = this.f15095l;
        if (cVar != null) {
            this.f15096m = i6.l1(this.f15097n / 255.0f, cVar.f9058a.getColor());
        }
        this.h = true;
    }

    @Override
    public final int getAlpha() {
        return this.f15098o;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    public final LinearGradient h(com.google.android.gms.internal.cast.a aVar, float f7, float f10, int i10) {
        int i11;
        if (aVar == null) {
            i11 = -1;
        } else {
            i11 = aVar.f6229a;
        }
        boolean z10 = false;
        float f11 = 0;
        float f12 = f7 - f11;
        float f13 = 0.0f;
        float max = Math.max(0.0f, f12 - f10);
        if (i11 != -1) {
            max = Math.min(i11, max);
        }
        float f14 = 1.0f;
        float f15 = 1.0f / this.d;
        int i12 = this.f15092i;
        z10 = (i12 == 1 || i12 == 2) ? true : true;
        if (z10) {
            f11 = f12;
        }
        if (z10) {
            f13 = -0.0f;
        }
        float f16 = (f11 + f13) * f15;
        if (z10) {
            f14 = -1.0f;
        }
        float max2 = (Math.max(max * f15, 0.001f) * f14) + f16;
        int[] iArr = new int[8];
        y.a(y.f47196i, i10, iArr);
        int i13 = this.f15092i;
        if (i13 != 1 && i13 != 4) {
            return new LinearGradient(max2, 0.0f, f16, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, max2, 0.0f, f16, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.e = -1;
        this.f15090f = -1.0f;
        this.h = true;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f15088b.setAlpha(i10 / 255.0f);
        this.f15098o = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
