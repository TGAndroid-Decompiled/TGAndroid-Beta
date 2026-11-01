package fi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import org.telegram.ui.Components.au;
import v7.i7;
public final class d extends i7 {
    public final RenderNode f7112a = new RenderNode("glass-fade-content");
    public final RenderNode f7113b = new RenderNode("glass-fade-overlay");
    public final Paint f7114c;
    public final Paint d;
    public final Matrix e;
    public LinearGradient f7115f;
    public int f7116g;
    public int h;
    public int f7117i;
    public final g f7118j;

    public d(g gVar) {
        this.f7118j = gVar;
        Paint paint = new Paint();
        this.f7114c = paint;
        this.d = new Paint(1);
        this.e = new Matrix();
        this.f7116g = -1;
        this.h = -1;
        paint.setBlendMode(au.k());
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        int i10;
        int i11;
        float f7;
        float f10;
        int height;
        float f11;
        float f12;
        int i12;
        int i13;
        int i14;
        g gVar = this.f7118j;
        a aVar = gVar.h;
        if (aVar != null && aVar.h() && aVar.f() > 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (i10 != 0) {
            i11 = aVar.f();
        } else {
            i11 = 1;
        }
        if (i10 != 0) {
            f7 = g.l(rectF.left, aVar.g(), i11) - (i10 * i11);
        } else {
            f7 = rectF.left;
        }
        if (i10 != 0) {
            f10 = g.l(rectF.top, aVar.a(), i11) - (i10 * i11);
        } else {
            f10 = rectF.top;
        }
        float f13 = f7 - rectF.left;
        float f14 = f10 - rectF.top;
        float f15 = i11;
        int ceil = ((int) Math.ceil((rectF.right - f7) / f15)) + i10;
        int ceil2 = ((int) Math.ceil((rectF.bottom - f10) / f15)) + i10;
        int ceil3 = (int) Math.ceil(rect.width() / f15);
        int ceil4 = (int) Math.ceil(rect.height() / f15);
        boolean z10 = gVar.f7129w;
        Paint paint = this.f7114c;
        if (!z10 && this.f7116g == rect.width() && this.h == rect.height() && this.f7117i == i11) {
            f12 = f10;
            i14 = i10;
            f11 = f7;
            i13 = ceil;
            i12 = ceil2;
        } else {
            int i15 = gVar.f7131y;
            if (i15 != 1 && i15 != 4) {
                height = rect.width();
            } else {
                height = rect.height();
            }
            float f16 = height;
            h hVar = gVar.D;
            hVar.getClass();
            float f17 = 0;
            f11 = f7;
            f12 = f10;
            i12 = ceil2;
            i13 = ceil;
            i14 = i10;
            LinearGradient k10 = g.k(gVar, hVar, f16, f17, -1, i11);
            this.f7115f = k10;
            paint.setShader(k10);
            h hVar2 = gVar.E;
            hVar2.getClass();
            LinearGradient k11 = g.k(gVar, hVar2, f16, f17, gVar.H, i11);
            this.f7113b.setPosition(0, 0, ceil3, ceil4);
            this.f7113b.setPivotX(0.0f);
            this.f7113b.setPivotY(0.0f);
            this.f7113b.setScaleX(f15);
            this.f7113b.setScaleY(f15);
            Paint paint2 = this.d;
            paint2.setShader(k11);
            this.f7113b.beginRecording().drawRect(0.0f, 0.0f, ceil3, ceil4, paint2);
            this.f7113b.endRecording();
            paint2.setShader(null);
            this.f7116g = rect.width();
            this.h = rect.height();
            this.f7117i = i11;
        }
        Matrix matrix = this.e;
        matrix.setTranslate((-f13) / f15, (-f14) / f15);
        this.f7115f.setLocalMatrix(matrix);
        this.f7112a.setPosition(0, 0, i13, i12);
        this.f7112a.setPivotX(0.0f);
        this.f7112a.setPivotY(0.0f);
        this.f7112a.setScaleX(f15);
        this.f7112a.setScaleY(f15);
        this.f7112a.setTranslationX(f13);
        this.f7112a.setTranslationY(f14);
        RecordingCanvas beginRecording = this.f7112a.beginRecording();
        float f18 = i13;
        float f19 = i12;
        beginRecording.saveLayer(0.0f, 0.0f, f18, f19, null);
        beginRecording.drawColor((gVar.H & 16777215) | (-16777216));
        if (i14 != 0) {
            gVar.h.d(f11, f12, i11, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            gVar.f7125f.e(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
            beginRecording.restore();
        }
        beginRecording.drawRect(0.0f, 0.0f, f18, f19, paint);
        beginRecording.restore();
        this.f7112a.endRecording();
        gVar.f7129w = false;
    }

    @Override
    public final void b() {
        this.f7112a.discardDisplayList();
        this.f7113b.discardDisplayList();
        this.f7116g = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f7112a);
        canvas.drawRenderNode(this.f7113b);
    }

    @Override
    public final boolean d() {
        if (this.f7112a.hasDisplayList() && this.f7113b.hasDisplayList()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7) {
        this.f7112a.setAlpha(f7);
        this.f7113b.setAlpha(f7);
    }
}
