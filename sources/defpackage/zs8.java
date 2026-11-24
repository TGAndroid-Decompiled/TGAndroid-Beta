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
public final class zs8 implements at8 {
    public final float f;
    public final Paint i;
    public final RectF j;
    public final bt8 k;
    public final Paint a = new Paint(1);
    public final RenderNode b = new RenderNode("render");
    public final RenderNode c = new RenderNode("effectNotch");
    public final RenderNode d = new RenderNode("effect");
    public final RenderNode e = new RenderNode("blur");
    public final RectF g = new RectF();
    public final RectF h = new RectF();

    public zs8(bt8 bt8Var, float f) {
        BlendMode blendMode;
        this.k = bt8Var;
        Paint paint = new Paint();
        this.i = paint;
        this.j = new RectF();
        this.f = f;
        paint.setColor(-16777216);
        blendMode = BlendMode.SRC_IN;
        paint.setBlendMode(blendMode);
    }

    @Override
    public final void a(h68 h68Var, Canvas canvas) {
        Paint paint;
        float R1;
        float f;
        float f2;
        float f3;
        float f4;
        Paint paint2;
        bt8 bt8Var = this.k;
        Paint paint3 = bt8Var.a;
        Path path = bt8Var.b;
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        RectF rectF = this.g;
        rectF.set(0.0f, 0.0f, bt8Var.getWidth(), bt8Var.getHeight());
        int childCount = bt8Var.getChildCount();
        RectF rectF2 = this.j;
        if (childCount > 0) {
            View childAt = bt8Var.getChildAt(0);
            float scaleX = childAt.getScaleX() * childAt.getWidth();
            float scaleY = childAt.getScaleY() * childAt.getHeight();
            float x = childAt.getX();
            float y = childAt.getY();
            rectF2.set(x, y, scaleX + x, scaleY + y);
            yl7 yl7Var = bt8Var.n;
            if (yl7Var != null) {
                rectF2.union(yl7Var.e);
            }
            rectF2.inset(-gm.L(20.0f), -gm.L(20.0f));
            rectF2.intersect(rectF);
            rectF2.top = 0.0f;
        } else {
            rectF2.set(rectF);
        }
        rectF2.bottom += gm.L(32.0f);
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
        int x1 = (int) ((1.0f - gm.x1(bt8Var.e, 0.5f, 1.0f)) * 255.0f);
        int b = pqe.b(x1, 0, 255);
        ((bt8) h68Var.b).a(beginRecording);
        this.b.endRecording();
        float f11 = this.f;
        float A = td4.A(f11, 1.0f, 2.0f, b10.w(bt8Var.f, 0.5f, f11, (f11 / 4.0f) + 1.0f));
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
        float L = gm.L(7.0f) * f13;
        float f15 = bt8Var.e;
        if (f15 < 0.5f) {
            paint = paint4;
            R1 = gm.R1(0.0f, L, f15 / 0.5f);
        } else {
            paint = paint4;
            R1 = gm.R1(L, 0.0f, (f15 - 0.5f) / 0.5f);
        }
        if (bt8Var.getChildCount() > 0) {
            View childAt2 = bt8Var.getChildAt(0);
            float scaleX2 = (((childAt2.getScaleX() * childAt2.getWidth()) / 2.0f) + childAt2.getX()) - f5;
            f = R1;
            float scaleY2 = ((((childAt2.getScaleY() * childAt2.getHeight()) / 2.0f) + childAt2.getY()) + gm.L(32.0f)) - f6;
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
        if (bt8Var.n != null) {
            beginRecording4.translate(f9, f10);
            beginRecording4.translate(0.0f, gm.L(32.0f));
            yl7 yl7Var2 = bt8Var.n;
            if (yl7Var2.c) {
                float min = Math.min(yl7Var2.e.width(), bt8Var.n.e.height()) / 2.0f;
                RectF rectF3 = bt8Var.n.e;
                float width = rectF3.bottom - (rectF3.width() / 2.0f);
                beginRecording4.drawCircle(bt8Var.n.e.centerX(), width, min, paint3);
                path.rewind();
                float f18 = f / 2.0f;
                path.moveTo(bt8Var.n.e.centerX() - f18, width);
                path.lineTo(bt8Var.n.e.centerX(), min + width + f);
                path.lineTo(bt8Var.n.e.centerX() + f18, width);
                path.close();
                beginRecording4.drawPath(path, paint3);
            } else if (yl7Var2.b) {
                beginRecording4.drawPath(yl7Var2.d, paint3);
            } else {
                float max = Math.max(yl7Var2.e.width(), bt8Var.n.e.height()) / 2.0f;
                RectF rectF4 = bt8Var.n.e;
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
            beginRecording4.drawRect(0.0f, 0.0f, f3, gm.L(32.0f), paint3);
            path.rewind();
            path.moveTo((f3 - f) / 2.0f, gm.L(32.0f));
            path.lineTo(f3 / 2.0f, gm.L(32.0f) + f);
            path.lineTo((f3 + f) / 2.0f, gm.L(32.0f));
            path.close();
            beginRecording4.drawPath(path, paint3);
        }
        this.c.endRecording();
        canvas.save();
        canvas.translate(f5, f6 - gm.L(32.0f));
        yl7 yl7Var3 = bt8Var.n;
        if (yl7Var3 != null) {
            canvas.clipRect(0.0f, yl7Var3.e.top, f3, f2);
        }
        Paint paint5 = this.a;
        canvas.saveLayer(rectF2, paint5);
        canvas.scale(f13, f13);
        canvas.drawRenderNode(this.c);
        canvas.drawRenderNode(this.d);
        canvas.restore();
        int b2 = pqe.b((x1 * 3) / 4, 0, 255);
        if (b2 < 255) {
            canvas.saveLayer(rectF2, null);
            if (bt8Var.f != 0.0f) {
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
            if (bt8Var.f != 0.0f) {
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
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(f2, f2, qn0.e()));
    }

    @Override
    public final void d(int i, int i2) {
    }
}
