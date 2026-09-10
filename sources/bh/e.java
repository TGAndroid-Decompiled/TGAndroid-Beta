package bh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class e extends d {
    public final eh.a E;
    public final Outline F = new Outline();
    public final Rect G = new Rect();
    public final RenderNode H;
    public final RenderNode I;
    public final Paint J;
    public final Paint K;
    public final Paint L;
    public boolean M;
    public zg.f N;

    public e(eh.a aVar) {
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
        if (cVar.f2266m.isEmpty()) {
            return;
        }
        boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
        eh.a aVar = this.E;
        if (!isHardwareAccelerated) {
            c(canvas, aVar);
            return;
        }
        if (!this.H.hasDisplayList()) {
            aVar.b();
            w();
        } else if (this.M) {
            w();
        }
        this.M = false;
        int l1 = j6.l1(this.H.getAlpha() * this.f2279n, this.d);
        if (Color.alpha(l1) != 0) {
            float f7 = this.f2277l;
            float f10 = this.f2278m;
            Paint paint = this.J;
            paint.setShadowLayer(f7, 0.0f, f10, l1);
            cVar.c(canvas, paint, this.f2276k);
        }
        canvas.save();
        Rect rect = cVar.f2266m;
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.H);
        canvas.restore();
    }

    @Override
    public final eh.a i() {
        return this.E;
    }

    @Override
    public final void j() {
        b();
        c cVar = this.h;
        this.K.setStrokeWidth(cVar.f2262i);
        this.L.setStrokeWidth(cVar.f2263j);
        int width = cVar.f2266m.width();
        int height = cVar.f2266m.height();
        Rect rect = this.G;
        rect.set(0, 0, width, height);
        float[] fArr = cVar.f2258b;
        Outline outline = this.F;
        d.h(outline, rect, fArr);
        outline.setAlpha(1.0f);
        if (!cVar.f2266m.isEmpty()) {
            this.I.setPosition(0, 0, cVar.f2266m.width(), cVar.f2266m.height());
            this.H.setPosition(0, 0, cVar.f2266m.width(), cVar.f2266m.height());
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
        this.E.b();
    }

    @Override
    public final d m() {
        this.H.setClipToOutline(false);
        return this;
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f2275j;
        this.f2275j = i10;
        this.H.setAlpha(i10 / 255.0f);
        this.M = true;
        if (i11 == 0 && i10 > 0) {
            this.E.b();
        }
    }

    @Override
    public final void u() {
        super.u();
        this.J.setShadowLayer(this.f2277l, 0.0f, this.f2278m, this.d);
        this.K.setColor(this.f2272f);
        this.L.setColor(this.f2273g);
        this.M = true;
    }

    public final boolean v() {
        return this.H.hasDisplayList();
    }

    public final void w() {
        float f7 = this.f2269a;
        float f10 = this.f2270b;
        c cVar = this.h;
        Rect rect = cVar.f2266m;
        Rect rect2 = cVar.f2266m;
        float f11 = rect.left + f7;
        float f12 = rect.top + f10;
        float f13 = rect.right + f7;
        float f14 = rect.bottom + f10;
        RecordingCanvas beginRecording = this.I.beginRecording();
        beginRecording.save();
        beginRecording.translate(-f11, -f12);
        if (this.N != null && Build.VERSION.SDK_INT >= 33) {
            int i10 = cVar.f2260f;
            if (i10 <= 0) {
                i10 = AndroidUtilities.dp(11.0f);
            }
            int max = Math.max(Math.min(i10, Math.min(rect2.width(), rect2.height()) / 5), 1);
            zg.f fVar = this.N;
            float width = rect2.width();
            float height = rect2.height();
            float[] fArr = cVar.f2259c;
            fVar.a(width, height, fArr[0], fArr[2], fArr[4], fArr[6], max, cVar.f2261g, cVar.h, this.e);
        }
        this.E.u(beginRecording, f11, f12, f13, f14);
        beginRecording.save();
        this.I.endRecording();
        RecordingCanvas beginRecording2 = this.H.beginRecording();
        if (Color.alpha(this.e) == 255) {
            beginRecording2.drawColor(this.e);
        } else {
            beginRecording2.drawRenderNode(this.I);
            if (this.N == null && Color.alpha(this.e) != 0) {
                beginRecording2.drawColor(this.e);
            }
        }
        if (this.f2272f != 0) {
            d.e(beginRecording2, rect2.width(), rect2.height(), cVar.f2258b, cVar.f2262i, true, this.K);
        }
        if (this.f2273g != 0) {
            d.e(beginRecording2, rect2.width(), rect2.height(), cVar.f2258b, cVar.f2263j, false, this.L);
        }
        this.H.endRecording();
    }
}
