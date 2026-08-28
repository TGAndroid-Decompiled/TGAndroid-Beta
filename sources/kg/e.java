package kg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class e extends d {
    public final ng.a E;
    public final Outline F = new Outline();
    public final Rect G = new Rect();
    public final RenderNode H;
    public final RenderNode I;
    public final Paint J;
    public final Paint K;
    public final Paint L;
    public boolean M;
    public ig.f N;

    public e(ng.a aVar) {
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
        if (cVar.f14812m.isEmpty()) {
            return;
        }
        boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
        ng.a aVar = this.E;
        if (!isHardwareAccelerated) {
            c(canvas, aVar);
            return;
        }
        if (!this.H.hasDisplayList()) {
            aVar.t();
            w();
        } else if (this.M) {
            w();
        }
        this.M = false;
        int l1 = f6.l1(this.H.getAlpha() * this.f14826n, this.d);
        if (Color.alpha(l1) != 0) {
            float f10 = this.f14824l;
            float f11 = this.f14825m;
            Paint paint = this.J;
            paint.setShadowLayer(f10, 0.0f, f11, l1);
            cVar.c(canvas, paint, this.f14823k);
        }
        canvas.save();
        Rect rect = cVar.f14812m;
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.H);
        canvas.restore();
    }

    @Override
    public final ng.a i() {
        return this.E;
    }

    @Override
    public final void j() {
        b();
        c cVar = this.h;
        this.K.setStrokeWidth(cVar.f14808i);
        this.L.setStrokeWidth(cVar.f14809j);
        int width = cVar.f14812m.width();
        int height = cVar.f14812m.height();
        Rect rect = this.G;
        rect.set(0, 0, width, height);
        float[] fArr = cVar.f14803b;
        Outline outline = this.F;
        d.h(outline, rect, fArr);
        outline.setAlpha(1.0f);
        if (!cVar.f14812m.isEmpty()) {
            this.I.setPosition(0, 0, cVar.f14812m.width(), cVar.f14812m.height());
            this.H.setPosition(0, 0, cVar.f14812m.width(), cVar.f14812m.height());
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
        this.E.t();
    }

    @Override
    public final d m() {
        this.H.setClipToOutline(false);
        return this;
    }

    @Override
    public final void setAlpha(int i9) {
        int i10 = this.f14822j;
        this.f14822j = i9;
        this.H.setAlpha(i9 / 255.0f);
        this.M = true;
        if (i10 == 0 && i9 > 0) {
            this.E.t();
        }
    }

    @Override
    public final void u() {
        super.u();
        this.J.setShadowLayer(this.f14824l, 0.0f, this.f14825m, this.d);
        this.K.setColor(this.f14819f);
        this.L.setColor(this.f14820g);
        this.M = true;
    }

    public final boolean v() {
        return this.H.hasDisplayList();
    }

    public final void w() {
        float f10 = this.f14815a;
        float f11 = this.f14816b;
        c cVar = this.h;
        Rect rect = cVar.f14812m;
        Rect rect2 = cVar.f14812m;
        float f12 = rect.left + f10;
        float f13 = rect.top + f11;
        float f14 = rect.right + f10;
        float f15 = rect.bottom + f11;
        RecordingCanvas beginRecording = this.I.beginRecording();
        beginRecording.save();
        beginRecording.translate(-f12, -f13);
        if (this.N != null && Build.VERSION.SDK_INT >= 33) {
            int i9 = cVar.f14806f;
            if (i9 <= 0) {
                i9 = AndroidUtilities.dp(11.0f);
            }
            int max = Math.max(Math.min(i9, Math.min(rect2.width(), rect2.height()) / 5), 1);
            ig.f fVar = this.N;
            float width = rect2.width();
            float height = rect2.height();
            float[] fArr = cVar.f14804c;
            fVar.a(width, height, fArr[0], fArr[2], fArr[4], fArr[6], max, cVar.f14807g, cVar.h, this.f14818e);
        }
        this.E.T0(beginRecording, f12, f13, f14, f15);
        beginRecording.save();
        this.I.endRecording();
        RecordingCanvas beginRecording2 = this.H.beginRecording();
        if (Color.alpha(this.f14818e) == 255) {
            beginRecording2.drawColor(this.f14818e);
        } else {
            beginRecording2.drawRenderNode(this.I);
            if (this.N == null && Color.alpha(this.f14818e) != 0) {
                beginRecording2.drawColor(this.f14818e);
            }
        }
        if (this.f14819f != 0) {
            d.e(beginRecording2, rect2.width(), rect2.height(), cVar.f14803b, cVar.f14808i, true, this.K);
        }
        if (this.f14820g != 0) {
            d.e(beginRecording2, rect2.width(), rect2.height(), cVar.f14803b, cVar.f14809j, false, this.L);
        }
        this.H.endRecording();
    }
}
