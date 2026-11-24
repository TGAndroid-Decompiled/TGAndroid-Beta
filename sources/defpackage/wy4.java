package defpackage;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
public final class wy4 extends yke {
    public final RenderNode a = new RenderNode("glass-fade-content");
    public final RenderNode b = new RenderNode("glass-fade-overlay");
    public final Paint c;
    public final Paint d;
    public final Matrix e;
    public LinearGradient f;
    public int g;
    public int h;
    public int i;
    public final yy4 j;

    public wy4(yy4 yy4Var) {
        BlendMode blendMode;
        this.j = yy4Var;
        Paint paint = new Paint();
        this.c = paint;
        this.d = new Paint(1);
        this.e = new Matrix();
        this.g = -1;
        this.h = -1;
        blendMode = BlendMode.DST_IN;
        paint.setBlendMode(blendMode);
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        int i;
        float f;
        float f2;
        int i2;
        int height;
        int i3;
        float f3;
        int i4;
        int i5;
        float f4;
        float f5;
        yy4 yy4Var = this.j;
        ty4 ty4Var = yy4Var.h;
        if (ty4Var != null && ty4Var.h() && ty4Var.f() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            int f6 = ty4Var.f();
            float f7 = i * f6;
            f = yy4.k(rectF.left, ty4Var.g(), f6) - f7;
            f2 = yy4.k(rectF.top, ty4Var.a(), f6) - f7;
            i2 = f6;
        } else {
            f = rectF.left;
            f2 = rectF.top;
            i2 = 1;
        }
        float f8 = f - rectF.left;
        float f9 = f2 - rectF.top;
        float f10 = i2;
        int ceil = ((int) Math.ceil((rectF.right - f) / f10)) + i;
        int ceil2 = ((int) Math.ceil((rectF.bottom - f2) / f10)) + i;
        int ceil3 = (int) Math.ceil(rect.width() / f10);
        int ceil4 = (int) Math.ceil(rect.height() / f10);
        boolean z = yy4Var.w;
        Paint paint = this.c;
        if (!z && this.g == rect.width() && this.h == rect.height() && this.i == i2) {
            f3 = f2;
            i3 = i;
            f4 = f;
            i5 = ceil;
            i4 = ceil2;
            f5 = 0.0f;
        } else {
            int i6 = yy4Var.y;
            if (i6 != 1 && i6 != 4) {
                height = rect.width();
            } else {
                height = rect.height();
            }
            float f11 = height;
            zy4 zy4Var = yy4Var.E;
            zy4Var.getClass();
            i3 = i;
            f3 = f2;
            i4 = ceil2;
            i5 = ceil;
            f4 = f;
            f5 = 0.0f;
            LinearGradient l = yy4Var.l(zy4Var, f11, 0.0f, -1, i2);
            this.f = l;
            paint.setShader(l);
            zy4 zy4Var2 = yy4Var.F;
            zy4Var2.getClass();
            LinearGradient l2 = yy4Var.l(zy4Var2, f11, 0.0f, yy4Var.I, i2);
            this.b.setPosition(0, 0, ceil3, ceil4);
            this.b.setPivotX(0.0f);
            this.b.setPivotY(0.0f);
            this.b.setScaleX(f10);
            this.b.setScaleY(f10);
            Paint paint2 = this.d;
            paint2.setShader(l2);
            this.b.beginRecording().drawRect(0.0f, 0.0f, ceil3, ceil4, paint2);
            this.b.endRecording();
            paint2.setShader(null);
            this.g = rect.width();
            this.h = rect.height();
            this.i = i2;
        }
        Matrix matrix = this.e;
        matrix.setTranslate((-f8) / f10, (-f9) / f10);
        this.f.setLocalMatrix(matrix);
        this.a.setPosition(0, 0, i5, i4);
        this.a.setPivotX(f5);
        this.a.setPivotY(f5);
        this.a.setScaleX(f10);
        this.a.setScaleY(f10);
        this.a.setTranslationX(f8);
        this.a.setTranslationY(f9);
        RecordingCanvas beginRecording = this.a.beginRecording();
        float f12 = i5;
        float f13 = i4;
        beginRecording.saveLayer(0.0f, 0.0f, f12, f13, null);
        beginRecording.drawColor((yy4Var.I & 16777215) | (-16777216));
        if (i3 != 0) {
            yy4Var.h.d(f4, f3, i2, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            yy4Var.f.e(rectF.left, rectF.top, rectF.right, rectF.bottom, beginRecording);
            beginRecording.restore();
        }
        beginRecording.drawRect(0.0f, 0.0f, f12, f13, paint);
        beginRecording.restore();
        this.a.endRecording();
        yy4Var.w = false;
    }

    @Override
    public final void b() {
        this.a.discardDisplayList();
        this.b.discardDisplayList();
        this.g = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
        canvas.drawRenderNode(this.b);
    }

    @Override
    public final boolean d() {
        if (this.a.hasDisplayList() && this.b.hasDisplayList()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f) {
        this.a.setAlpha(f);
        this.b.setAlpha(f);
    }
}
