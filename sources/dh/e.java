package dh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import bh.g;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class e extends d {
    public final gh.a E;
    public final Outline F = new Outline();
    public final Rect G = new Rect();
    public final RenderNode H;
    public final RenderNode I;
    public final Paint J;
    public final Paint K;
    public final Paint L;
    public boolean M;
    public g N;

    public e(gh.a aVar) {
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
        if (cVar.f6828m.isEmpty()) {
            return;
        }
        boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
        gh.a aVar = this.E;
        if (!isHardwareAccelerated) {
            c(canvas, aVar);
            return;
        }
        if (!this.H.hasDisplayList()) {
            aVar.e();
            w();
        } else if (this.M) {
            w();
        }
        this.M = false;
        int l1 = j6.l1(this.H.getAlpha() * this.f6842n, this.d);
        if (Color.alpha(l1) != 0) {
            float f7 = this.f6840l;
            float f10 = this.f6841m;
            Paint paint = this.J;
            paint.setShadowLayer(f7, 0.0f, f10, l1);
            cVar.c(canvas, paint, this.f6839k);
        }
        canvas.save();
        Rect rect = cVar.f6828m;
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.H);
        canvas.restore();
    }

    @Override
    public final gh.a i() {
        return this.E;
    }

    @Override
    public final void j() {
        b();
        c cVar = this.h;
        this.K.setStrokeWidth(cVar.f6824i);
        this.L.setStrokeWidth(cVar.f6825j);
        int width = cVar.f6828m.width();
        int height = cVar.f6828m.height();
        Rect rect = this.G;
        rect.set(0, 0, width, height);
        float[] fArr = cVar.f6819b;
        Outline outline = this.F;
        d.h(outline, rect, fArr);
        outline.setAlpha(1.0f);
        if (!cVar.f6828m.isEmpty()) {
            this.I.setPosition(0, 0, cVar.f6828m.width(), cVar.f6828m.height());
            this.H.setPosition(0, 0, cVar.f6828m.width(), cVar.f6828m.height());
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
        this.E.e();
    }

    @Override
    public final d m() {
        this.H.setClipToOutline(false);
        return this;
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f6838j;
        this.f6838j = i10;
        this.H.setAlpha(i10 / 255.0f);
        this.M = true;
        if (i11 == 0 && i10 > 0) {
            this.E.e();
        }
    }

    @Override
    public final void u() {
        super.u();
        this.J.setShadowLayer(this.f6840l, 0.0f, this.f6841m, this.d);
        this.K.setColor(this.f6835f);
        this.L.setColor(this.f6836g);
        this.M = true;
    }

    public final boolean v() {
        return this.H.hasDisplayList();
    }

    public final void w() {
        float f7 = this.f6831a;
        float f10 = this.f6832b;
        c cVar = this.h;
        Rect rect = cVar.f6828m;
        Rect rect2 = cVar.f6828m;
        float f11 = rect.left + f7;
        float f12 = rect.top + f10;
        float f13 = rect.right + f7;
        float f14 = rect.bottom + f10;
        RecordingCanvas beginRecording = this.I.beginRecording();
        beginRecording.save();
        beginRecording.translate(-f11, -f12);
        if (this.N != null && Build.VERSION.SDK_INT >= 33) {
            int i10 = cVar.f6822f;
            if (i10 <= 0) {
                i10 = AndroidUtilities.dp(11.0f);
            }
            int max = Math.max(Math.min(i10, Math.min(rect2.width(), rect2.height()) / 5), 1);
            g gVar = this.N;
            float width = rect2.width();
            float height = rect2.height();
            float[] fArr = cVar.f6820c;
            gVar.a(width, height, fArr[0], fArr[2], fArr[4], fArr[6], max, cVar.f6823g, cVar.h, this.f6834e);
        }
        this.E.v(beginRecording, f11, f12, f13, f14);
        beginRecording.save();
        this.I.endRecording();
        RecordingCanvas beginRecording2 = this.H.beginRecording();
        if (Color.alpha(this.f6834e) == 255) {
            beginRecording2.drawColor(this.f6834e);
        } else {
            beginRecording2.drawRenderNode(this.I);
            if (this.N == null && Color.alpha(this.f6834e) != 0) {
                beginRecording2.drawColor(this.f6834e);
            }
        }
        if (this.f6835f != 0) {
            d.e(beginRecording2, rect2.width(), rect2.height(), cVar.f6819b, cVar.f6824i, true, this.K);
        }
        if (this.f6836g != 0) {
            d.e(beginRecording2, rect2.width(), rect2.height(), cVar.f6819b, cVar.f6825j, false, this.L);
        }
        this.H.endRecording();
    }
}
