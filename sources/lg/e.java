package lg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

public final class e extends d {
    public final og.a E;
    public final Outline F = new Outline();
    public final Rect G = new Rect();
    public final RenderNode H;
    public final RenderNode I;
    public final Paint J;
    public final Paint K;
    public final Paint L;
    public boolean M;
    public jg.f N;

    public e(og.a aVar) {
        Paint paint = new Paint(1);
        this.J = paint;
        Paint paint2 = new Paint(1);
        this.K = paint2;
        Paint paint3 = new Paint(1);
        this.L = paint3;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.H = renderNode;
        this.I = new RenderNode("BlurredFill");
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        this.E = aVar;
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint3.setStyle(style);
    }

    @Override
    public final void draw(Canvas canvas) {
        c cVar = this.h;
        if (cVar.f15590m.isEmpty()) {
            return;
        }
        boolean zIsHardwareAccelerated = canvas.isHardwareAccelerated();
        og.a aVar = this.E;
        if (!zIsHardwareAccelerated) {
            c(canvas, aVar);
            return;
        }
        if (!this.H.hasDisplayList()) {
            aVar.r();
            w();
        } else if (this.M) {
            w();
        }
        this.M = false;
        int iL1 = g6.l1(this.H.getAlpha() * this.f15604n, this.d);
        if (Color.alpha(iL1) != 0) {
            float f10 = this.f15602l;
            float f11 = this.f15603m;
            Paint paint = this.J;
            paint.setShadowLayer(f10, 0.0f, f11, iL1);
            cVar.c(canvas, paint, this.f15601k);
        }
        canvas.save();
        Rect rect = cVar.f15590m;
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.H);
        canvas.restore();
    }

    @Override
    public final og.a i() {
        return this.E;
    }

    @Override
    public final void j() {
        b();
        c cVar = this.h;
        this.K.setStrokeWidth(cVar.f15586i);
        this.L.setStrokeWidth(cVar.f15587j);
        int iWidth = cVar.f15590m.width();
        int iHeight = cVar.f15590m.height();
        Rect rect = this.G;
        rect.set(0, 0, iWidth, iHeight);
        float[] fArr = cVar.f15581b;
        Outline outline = this.F;
        d.h(outline, rect, fArr);
        outline.setAlpha(1.0f);
        if (cVar.f15590m.isEmpty()) {
            return;
        }
        this.I.setPosition(0, 0, cVar.f15590m.width(), cVar.f15590m.height());
        this.H.setPosition(0, 0, cVar.f15590m.width(), cVar.f15590m.height());
        this.H.setOutline(outline);
        this.M = true;
    }

    @Override
    public final void k() {
        b();
        this.M = true;
    }

    @Override
    public final void l() {
        this.E.r();
    }

    @Override
    public final d m() {
        this.H.setClipToOutline(false);
        return this;
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f15600j;
        this.f15600j = i10;
        this.H.setAlpha(i10 / 255.0f);
        this.M = true;
        if (i11 != 0 || i10 <= 0) {
            return;
        }
        this.E.r();
    }

    @Override
    public final void u() {
        super.u();
        this.J.setShadowLayer(this.f15602l, 0.0f, this.f15603m, this.d);
        this.K.setColor(this.f15597f);
        this.L.setColor(this.f15598g);
        this.M = true;
    }

    public final boolean v() {
        return this.H.hasDisplayList();
    }

    public final void w() {
        float f10 = this.f15593a;
        float f11 = this.f15594b;
        c cVar = this.h;
        Rect rect = cVar.f15590m;
        Rect rect2 = cVar.f15590m;
        float f12 = rect.left + f10;
        float f13 = rect.top + f11;
        float f14 = rect.right + f10;
        float f15 = rect.bottom + f11;
        RecordingCanvas recordingCanvasBeginRecording = this.I.beginRecording();
        recordingCanvasBeginRecording.save();
        recordingCanvasBeginRecording.translate(-f12, -f13);
        if (this.N != null && Build.VERSION.SDK_INT >= 33) {
            int iDp = cVar.f15584f;
            if (iDp <= 0) {
                iDp = AndroidUtilities.dp(11.0f);
            }
            int iMax = Math.max(Math.min(iDp, Math.min(rect2.width(), rect2.height()) / 5), 1);
            jg.f fVar = this.N;
            float fWidth = rect2.width();
            float fHeight = rect2.height();
            float[] fArr = cVar.f15582c;
            fVar.a(fWidth, fHeight, fArr[0], fArr[2], fArr[4], fArr[6], iMax, cVar.f15585g, cVar.h, this.f15596e);
        }
        this.E.T0(recordingCanvasBeginRecording, f12, f13, f14, f15);
        recordingCanvasBeginRecording.save();
        this.I.endRecording();
        RecordingCanvas recordingCanvasBeginRecording2 = this.H.beginRecording();
        if (Color.alpha(this.f15596e) == 255) {
            recordingCanvasBeginRecording2.drawColor(this.f15596e);
        } else {
            recordingCanvasBeginRecording2.drawRenderNode(this.I);
            if (this.N == null && Color.alpha(this.f15596e) != 0) {
                recordingCanvasBeginRecording2.drawColor(this.f15596e);
            }
        }
        if (this.f15597f != 0) {
            d.e(recordingCanvasBeginRecording2, rect2.width(), rect2.height(), cVar.f15581b, cVar.f15586i, true, this.K);
        }
        if (this.f15598g != 0) {
            d.e(recordingCanvasBeginRecording2, rect2.width(), rect2.height(), cVar.f15581b, cVar.f15587j, false, this.L);
        }
        this.H.endRecording();
    }
}
