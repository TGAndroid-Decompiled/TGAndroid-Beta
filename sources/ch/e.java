package ch;

import ah.i;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
public final class e extends d {
    public final fh.a G;
    public final Outline H = new Outline();
    public final Rect I = new Rect();
    public final RenderNode J;
    public final RenderNode K;
    public final Paint L;
    public final Paint M;
    public final Paint N;
    public boolean O;
    public i P;

    public e(fh.a aVar) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.M = paint2;
        Paint paint3 = new Paint(1);
        this.N = paint3;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.J = renderNode;
        this.K = new RenderNode("BlurredFill");
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        this.G = aVar;
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint3.setStyle(style);
    }

    @Override
    public final void draw(Canvas canvas) {
        c cVar = this.f4685j;
        if (cVar.f4675m.isEmpty()) {
            return;
        }
        boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
        fh.a aVar = this.G;
        if (!isHardwareAccelerated) {
            c(canvas, aVar);
            return;
        }
        if (!this.J.hasDisplayList()) {
            aVar.d();
            w();
        } else if (this.O) {
            w();
        }
        this.O = false;
        int m12 = i6.m1(this.J.getAlpha() * this.f4691p, this.d);
        if (Color.alpha(m12) != 0) {
            float f7 = this.f4689n;
            float f10 = this.f4690o;
            Paint paint = this.L;
            paint.setShadowLayer(f7, 0.0f, f10, m12);
            cVar.c(canvas, paint, this.f4688m);
        }
        canvas.save();
        Rect rect = cVar.f4675m;
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.J);
        canvas.restore();
    }

    @Override
    public final fh.a i() {
        return this.G;
    }

    @Override
    public final boolean j() {
        return this.J.hasDisplayList();
    }

    @Override
    public final void k() {
        b();
        c cVar = this.f4685j;
        this.M.setStrokeWidth(cVar.f4671i);
        this.N.setStrokeWidth(cVar.f4672j);
        int width = cVar.f4675m.width();
        int height = cVar.f4675m.height();
        Rect rect = this.I;
        rect.set(0, 0, width, height);
        float[] fArr = cVar.f4666b;
        Outline outline = this.H;
        d.h(outline, rect, fArr);
        outline.setAlpha(1.0f);
        if (!cVar.f4675m.isEmpty()) {
            this.K.setPosition(0, 0, cVar.f4675m.width(), cVar.f4675m.height());
            this.J.setPosition(0, 0, cVar.f4675m.width(), cVar.f4675m.height());
            this.J.setOutline(outline);
            this.O = true;
        }
    }

    @Override
    public final void l() {
        b();
        this.O = true;
    }

    @Override
    public final void m() {
        this.G.d();
    }

    @Override
    public final d n() {
        this.J.setClipToOutline(false);
        return this;
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f4687l;
        this.f4687l = i10;
        this.J.setAlpha(i10 / 255.0f);
        this.O = true;
        if (i11 == 0 && i10 > 0) {
            this.G.d();
        }
    }

    @Override
    public final void v() {
        super.v();
        this.L.setShadowLayer(this.f4689n, 0.0f, this.f4690o, this.d);
        this.M.setColor(this.f4682f);
        this.N.setColor(this.f4683g);
        this.O = true;
    }

    @Override
    public final void w() {
        float f7 = this.f4678a;
        float f10 = this.f4679b;
        c cVar = this.f4685j;
        Rect rect = cVar.f4675m;
        Rect rect2 = cVar.f4675m;
        float f11 = rect.left + f7;
        float f12 = rect.top + f10;
        float f13 = rect.right + f7;
        float f14 = rect.bottom + f10;
        RecordingCanvas beginRecording = this.K.beginRecording();
        beginRecording.save();
        beginRecording.translate(-f11, -f12);
        if (this.P != null && Build.VERSION.SDK_INT >= 33) {
            int i10 = cVar.f4669f;
            if (i10 <= 0) {
                i10 = AndroidUtilities.dp(11.0f);
            }
            int max = Math.max(Math.min(i10, Math.min(rect2.width(), rect2.height()) / 5), 1);
            i iVar = this.P;
            float width = rect2.width();
            float height = rect2.height();
            float[] fArr = cVar.f4667c;
            iVar.a(width, height, fArr[0], fArr[2], fArr[4], fArr[6], max, cVar.f4670g, cVar.h, this.f4681e);
        }
        this.G.v(beginRecording, f11, f12, f13, f14);
        beginRecording.save();
        this.K.endRecording();
        RecordingCanvas beginRecording2 = this.J.beginRecording();
        if (Color.alpha(this.f4681e) == 255) {
            beginRecording2.drawColor(this.f4681e);
        } else {
            beginRecording2.drawRenderNode(this.K);
            if (this.P == null && Color.alpha(this.f4681e) != 0) {
                beginRecording2.drawColor(this.f4681e);
            }
        }
        if (this.f4682f != 0) {
            d.e(beginRecording2, rect2.width(), rect2.height(), cVar.f4666b, cVar.f4671i, true, this.M);
        }
        if (this.f4683g != 0) {
            d.e(beginRecording2, rect2.width(), rect2.height(), cVar.f4666b, cVar.f4672j, false, this.N);
        }
        this.J.endRecording();
    }
}
