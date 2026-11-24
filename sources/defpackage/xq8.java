package defpackage;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.view.View;
public final class xq8 implements yq8 {
    public final float f;
    public final Paint i;
    public final RectF j;
    public final zq8 k;
    public final Paint a = new Paint(1);
    public final RenderNode b = new RenderNode("render");
    public final RenderNode c = new RenderNode("effectNotch");
    public final RenderNode d = new RenderNode("effect");
    public final RenderNode e = new RenderNode("blur");
    public final RectF g = new RectF();
    public final RectF h = new RectF();

    public xq8(zq8 zq8Var, float f) {
        BlendMode blendMode;
        this.k = zq8Var;
        Paint paint = new Paint();
        this.i = paint;
        this.j = new RectF();
        this.f = f;
        paint.setColor(-16777216);
        blendMode = BlendMode.SRC_IN;
        paint.setBlendMode(blendMode);
    }

    @Override
    public final void a(k88 k88Var, Canvas canvas) {
        Paint paint;
        float R1;
        float f;
        float f2;
        float f3;
        float f4;
        Paint paint2;
        zq8 zq8Var = this.k;
        Paint paint3 = zq8Var.a;
        Path path = zq8Var.b;
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        RectF rectF = this.g;
        rectF.set(0.0f, 0.0f, zq8Var.getWidth(), zq8Var.getHeight());
        int childCount = zq8Var.getChildCount();
        RectF rectF2 = this.j;
        if (childCount > 0) {
            View childAt = zq8Var.getChildAt(0);
            float scaleX = childAt.getScaleX() * childAt.getWidth();
            float scaleY = childAt.getScaleY() * childAt.getHeight();
            float x = childAt.getX();
            float y = childAt.getY();
            rectF2.set(x, y, scaleX + x, scaleY + y);
            vj7 vj7Var = zq8Var.n;
            if (vj7Var != null) {
                rectF2.union(vj7Var.e);
            }
            rectF2.inset(-gl.L(20.0f), -gl.L(20.0f));
            rectF2.intersect(rectF);
            rectF2.top = 0.0f;
        } else {
            rectF2.set(rectF);
        }
        rectF2.bottom += gl.L(32.0f);
        int ceil = (int) Math.ceil(rectF2.width());
        int ceil2 = (int) Math.ceil(rectF2.height());
        float f5 = rectF2.left;
        float f6 = rectF2.top;
        this.b.setPosition(0, 0, ceil, ceil2);
        this.e.setPosition(0, 0, ceil, ceil2);
        this.d.setPosition(0, 0, ceil, ceil2);
        this.c.setPosition(0, 0, ceil, ceil2);
        float f7 = ceil;
        float f8 = ceil2;
        rectF2.set(0.0f, 0.0f, f7, f8);
        RecordingCanvas beginRecording = this.b.beginRecording();
        float f9 = -f5;
        float f10 = -f6;
        beginRecording.translate(f9, f10);
        int x1 = (int) ((1.0f - gl.x1(zq8Var.e, 0.5f, 1.0f)) * 255.0f);
        int b = moe.b(x1, 0, 255);
        ((zq8) k88Var.b).a(beginRecording);
        this.b.endRecording();
        float f11 = this.f;
        float A = tb4.A(f11, 1.0f, 2.0f, b00.w(zq8Var.f, 0.5f, f11, (f11 / 4.0f) + 1.0f));
        RecordingCanvas beginRecording2 = this.e.beginRecording();
        float f12 = 1.0f / A;
        beginRecording2.scale(f12, f12, 0.0f, 0.0f);
        beginRecording2.drawRenderNode(this.b);
        this.e.endRecording();
        float f13 = f11 + 2.0f;
        RecordingCanvas beginRecording3 = this.d.beginRecording();
        float f14 = 1.0f / f13;
        beginRecording3.scale(f14, f14, 0.0f, 0.0f);
        Paint paint4 = this.i;
        if (b < 255) {
            beginRecording3.saveLayer(rectF2, null);
            beginRecording3.drawRenderNode(this.b);
            beginRecording3.drawRect(rectF2, paint4);
            beginRecording3.restore();
        }
        float L = gl.L(7.0f) * f13;
        float f15 = zq8Var.e;
        if (f15 < 0.5f) {
            paint = paint4;
            R1 = gl.R1(0.0f, L, f15 / 0.5f);
        } else {
            paint = paint4;
            R1 = gl.R1(L, 0.0f, (f15 - 0.5f) / 0.5f);
        }
        if (zq8Var.getChildCount() > 0) {
            View childAt2 = zq8Var.getChildAt(0);
            float scaleX2 = (((childAt2.getScaleX() * childAt2.getWidth()) / 2.0f) + childAt2.getX()) - f5;
            f = R1;
            float scaleY2 = ((((childAt2.getScaleY() * childAt2.getHeight()) / 2.0f) + childAt2.getY()) + gl.L(32.0f)) - f6;
            float scaleX3 = childAt2.getScaleX() * (childAt2.getWidth() / 2.0f);
            path.rewind();
            float f16 = scaleX2 - scaleX3;
            float f17 = scaleY2 - (0.70710677f * scaleX3);
            path.moveTo(f16, f17);
            path.lineTo(scaleX2, (scaleY2 - scaleX3) - (0.25f * f));
            path.lineTo(scaleX2 + scaleX3, f17);
            path.close();
            beginRecording3.drawPath(path, paint3);
        } else {
            f = R1;
        }
        if (b > 0) {
            if (b != 255) {
                beginRecording3.saveLayerAlpha(rectF2, b);
            }
            beginRecording3.drawRenderNode(this.b);
            if (b != 255) {
                beginRecording3.restore();
            }
        }
        this.d.endRecording();
        RecordingCanvas beginRecording4 = this.c.beginRecording();
        beginRecording4.scale(f14, f14, 0.0f, 0.0f);
        if (zq8Var.n != null) {
            beginRecording4.translate(f9, f10);
            beginRecording4.translate(0.0f, gl.L(32.0f));
            vj7 vj7Var2 = zq8Var.n;
            if (vj7Var2.c) {
                float min = Math.min(vj7Var2.e.width(), zq8Var.n.e.height()) / 2.0f;
                RectF rectF3 = zq8Var.n.e;
                float width = rectF3.bottom - (rectF3.width() / 2.0f);
                beginRecording4.drawCircle(zq8Var.n.e.centerX(), width, min, paint3);
                path.rewind();
                float f18 = f / 2.0f;
                path.moveTo(zq8Var.n.e.centerX() - f18, width);
                path.lineTo(zq8Var.n.e.centerX(), min + width + f);
                path.lineTo(zq8Var.n.e.centerX() + f18, width);
                path.close();
                beginRecording4.drawPath(path, paint3);
            } else if (vj7Var2.b) {
                beginRecording4.drawPath(vj7Var2.d, paint3);
            } else {
                float max = Math.max(vj7Var2.e.width(), zq8Var.n.e.height()) / 2.0f;
                RectF rectF4 = zq8Var.n.e;
                RectF rectF5 = this.h;
                rectF5.set(rectF4);
                beginRecording4.drawRoundRect(rectF5, max, max, paint3);
                path.rewind();
                float f19 = f / 2.0f;
                path.moveTo(rectF5.centerX() - f19, rectF5.bottom);
                path.lineTo(rectF5.centerX(), rectF5.bottom + f);
                path.lineTo(rectF5.centerX() + f19, rectF5.bottom);
                path.close();
                beginRecording4.drawPath(path, paint3);
            }
            f2 = f8;
            f3 = f7;
            f4 = A;
            paint2 = paint;
        } else {
            f2 = f8;
            f3 = f7;
            f4 = A;
            paint2 = paint;
            beginRecording4.drawRect(0.0f, 0.0f, f3, gl.L(32.0f), paint3);
            path.rewind();
            path.moveTo((f3 - f) / 2.0f, gl.L(32.0f));
            path.lineTo(f3 / 2.0f, gl.L(32.0f) + f);
            path.lineTo((f3 + f) / 2.0f, gl.L(32.0f));
            path.close();
            beginRecording4.drawPath(path, paint3);
        }
        this.c.endRecording();
        canvas.save();
        canvas.translate(f5, f6 - gl.L(32.0f));
        vj7 vj7Var3 = zq8Var.n;
        if (vj7Var3 != null) {
            canvas.clipRect(0.0f, vj7Var3.e.top, f3, f2);
        }
        Paint paint5 = this.a;
        canvas.saveLayer(rectF2, paint5);
        canvas.scale(f13, f13);
        canvas.drawRenderNode(this.c);
        canvas.drawRenderNode(this.d);
        canvas.restore();
        int b2 = moe.b((x1 * 3) / 4, 0, 255);
        if (b2 < 255) {
            canvas.saveLayer(rectF2, null);
            if (zq8Var.f != 0.0f) {
                canvas.saveLayer(rectF2, paint5);
                canvas.scale(f4, f4);
                canvas.drawRenderNode(this.e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.b);
            }
            canvas.drawRect(rectF2, paint2);
            canvas.restore();
        }
        if (b2 > 0) {
            if (b2 != 255) {
                canvas.saveLayerAlpha(rectF2, b2);
            }
            if (zq8Var.f != 0.0f) {
                canvas.saveLayer(rectF2, paint5);
                canvas.scale(f4, f4);
                canvas.drawRenderNode(this.e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.b);
            }
            if (b2 != 255) {
                canvas.restore();
            }
        }
        canvas.restore();
    }

    @Override
    public final void b(float f) {
        RenderNode renderNode = this.d;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(f, f, tileMode));
        this.c.setRenderEffect(RenderEffect.createBlurEffect(f, f, tileMode));
        this.a.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
    }

    @Override
    public final void c(float f) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        RenderNode renderNode = this.e;
        if (i == 0) {
            renderNode.setRenderEffect(null);
            return;
        }
        float f2 = (f * this.k.d) / this.f;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(f2, f2, qm0.f()));
    }

    @Override
    public final void d(int i, int i2) {
    }
}
