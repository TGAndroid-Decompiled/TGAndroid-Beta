package ng;

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
    public final qg.a E;
    public final Outline F = new Outline();
    public final Rect G = new Rect();
    public final RenderNode H;
    public final RenderNode I;
    public final Paint J;
    public final Paint K;
    public final Paint L;
    public boolean M;
    public lg.f N;

    public e(qg.a aVar) {
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
        if (cVar.f17336m.isEmpty()) {
            return;
        }
        boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
        qg.a aVar = this.E;
        if (!isHardwareAccelerated) {
            c(canvas, aVar);
            return;
        }
        if (!this.H.hasDisplayList()) {
            aVar.q();
            w();
        } else if (this.M) {
            w();
        }
        this.M = false;
        int l1 = g6.l1(this.H.getAlpha() * this.f17350n, this.d);
        if (Color.alpha(l1) != 0) {
            float f9 = this.f17348l;
            float f10 = this.f17349m;
            Paint paint = this.J;
            paint.setShadowLayer(f9, 0.0f, f10, l1);
            cVar.c(canvas, paint, this.f17347k);
        }
        canvas.save();
        Rect rect = cVar.f17336m;
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.H);
        canvas.restore();
    }

    @Override
    public final qg.a i() {
        return this.E;
    }

    @Override
    public final void j() {
        b();
        c cVar = this.h;
        this.K.setStrokeWidth(cVar.f17332i);
        this.L.setStrokeWidth(cVar.f17333j);
        int width = cVar.f17336m.width();
        int height = cVar.f17336m.height();
        Rect rect = this.G;
        rect.set(0, 0, width, height);
        float[] fArr = cVar.f17327b;
        Outline outline = this.F;
        d.h(outline, rect, fArr);
        outline.setAlpha(1.0f);
        if (!cVar.f17336m.isEmpty()) {
            this.I.setPosition(0, 0, cVar.f17336m.width(), cVar.f17336m.height());
            this.H.setPosition(0, 0, cVar.f17336m.width(), cVar.f17336m.height());
            this.H.setOutline(outline);
            this.M = true;
        }
    }

    @Override
    public final void k() {
        b();
        this.M = true;
    }

    @Override
    public final void l() {
        this.E.q();
    }

    @Override
    public final d m() {
        this.H.setClipToOutline(false);
        return this;
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f17346j;
        this.f17346j = i10;
        this.H.setAlpha(i10 / 255.0f);
        this.M = true;
        if (i11 == 0 && i10 > 0) {
            this.E.q();
        }
    }

    @Override
    public final void u() {
        super.u();
        this.J.setShadowLayer(this.f17348l, 0.0f, this.f17349m, this.d);
        this.K.setColor(this.f17343f);
        this.L.setColor(this.f17344g);
        this.M = true;
    }

    public final boolean v() {
        return this.H.hasDisplayList();
    }

    public final void w() {
        float f9 = this.f17339a;
        float f10 = this.f17340b;
        c cVar = this.h;
        Rect rect = cVar.f17336m;
        Rect rect2 = cVar.f17336m;
        float f11 = rect.left + f9;
        float f12 = rect.top + f10;
        float f13 = rect.right + f9;
        float f14 = rect.bottom + f10;
        RecordingCanvas beginRecording = this.I.beginRecording();
        beginRecording.save();
        beginRecording.translate(-f11, -f12);
        if (this.N != null && Build.VERSION.SDK_INT >= 33) {
            int i10 = cVar.f17330f;
            if (i10 <= 0) {
                i10 = AndroidUtilities.dp(11.0f);
            }
            int max = Math.max(Math.min(i10, Math.min(rect2.width(), rect2.height()) / 5), 1);
            lg.f fVar = this.N;
            float width = rect2.width();
            float height = rect2.height();
            float[] fArr = cVar.f17328c;
            fVar.a(width, height, fArr[0], fArr[2], fArr[4], fArr[6], max, cVar.f17331g, cVar.h, this.f17342e);
        }
        this.E.E0(beginRecording, f11, f12, f13, f14);
        beginRecording.save();
        this.I.endRecording();
        RecordingCanvas beginRecording2 = this.H.beginRecording();
        if (Color.alpha(this.f17342e) == 255) {
            beginRecording2.drawColor(this.f17342e);
        } else {
            beginRecording2.drawRenderNode(this.I);
            if (this.N == null && Color.alpha(this.f17342e) != 0) {
                beginRecording2.drawColor(this.f17342e);
            }
        }
        if (this.f17343f != 0) {
            d.e(beginRecording2, rect2.width(), rect2.height(), cVar.f17327b, cVar.f17332i, true, this.K);
        }
        if (this.f17344g != 0) {
            d.e(beginRecording2, rect2.width(), rect2.height(), cVar.f17327b, cVar.f17333j, false, this.L);
        }
        this.H.endRecording();
    }
}
