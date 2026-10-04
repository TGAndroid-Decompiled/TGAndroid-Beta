package ch;

import ah.j;
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
    public final fh.a H;
    public final Outline I = new Outline();
    public final Rect J = new Rect();
    public final RenderNode K;
    public final RenderNode L;
    public final Paint M;
    public final Paint N;
    public final Paint O;
    public boolean P;
    public j Q;

    public e(fh.a aVar) {
        Paint paint = new Paint(1);
        this.M = paint;
        Paint paint2 = new Paint(1);
        this.N = paint2;
        Paint paint3 = new Paint(1);
        this.O = paint3;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.K = renderNode;
        this.L = new RenderNode("BlurredFill");
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        this.H = aVar;
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint3.setStyle(style);
    }

    public final void D() {
        float f7 = this.f15650c;
        float f10 = this.d;
        c cVar = this.f4632l;
        Rect rect = cVar.f4623m;
        Rect rect2 = cVar.f4623m;
        float f11 = rect.left + f7;
        float f12 = rect.top + f10;
        float f13 = rect.right + f7;
        float f14 = rect.bottom + f10;
        RecordingCanvas beginRecording = this.L.beginRecording();
        beginRecording.save();
        beginRecording.translate(-f11, -f12);
        if (this.Q != null && Build.VERSION.SDK_INT >= 33) {
            int i10 = cVar.f4617f;
            if (i10 <= 0) {
                i10 = AndroidUtilities.dp(11.0f);
            }
            int max = Math.max(Math.min(i10, Math.min(rect2.width(), rect2.height()) / 5), 1);
            j jVar = this.Q;
            float width = rect2.width();
            float height = rect2.height();
            float[] fArr = cVar.f4615c;
            jVar.a(width, height, fArr[0], fArr[2], fArr[4], fArr[6], max, cVar.f4618g, cVar.h, this.f4628g);
        }
        this.H.y(beginRecording, f11, f12, f13, f14);
        beginRecording.save();
        this.L.endRecording();
        RecordingCanvas beginRecording2 = this.K.beginRecording();
        if (Color.alpha(this.f4628g) == 255) {
            beginRecording2.drawColor(this.f4628g);
        } else {
            beginRecording2.drawRenderNode(this.L);
            if (this.Q == null && Color.alpha(this.f4628g) != 0) {
                beginRecording2.drawColor(this.f4628g);
            }
        }
        if (this.h != 0) {
            d.p(beginRecording2, rect2.width(), rect2.height(), cVar.f4614b, cVar.f4619i, true, this.N);
        }
        if (this.f4629i != 0) {
            d.p(beginRecording2, rect2.width(), rect2.height(), cVar.f4614b, cVar.f4620j, false, this.O);
        }
        this.K.endRecording();
    }

    @Override
    public final void a() {
        D();
    }

    @Override
    public final void draw(Canvas canvas) {
        c cVar = this.f4632l;
        if (cVar.f4623m.isEmpty()) {
            return;
        }
        boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
        fh.a aVar = this.H;
        if (!isHardwareAccelerated) {
            n(canvas, aVar);
            return;
        }
        if (!this.K.hasDisplayList()) {
            aVar.b();
            D();
        } else if (this.P) {
            D();
        }
        this.P = false;
        int l1 = i6.l1(this.K.getAlpha() * this.f4637q, this.f4627f);
        if (Color.alpha(l1) != 0) {
            float f7 = this.f4635o;
            float f10 = this.f4636p;
            Paint paint = this.M;
            paint.setShadowLayer(f7, 0.0f, f10, l1);
            cVar.c(canvas, paint, this.f4634n);
        }
        canvas.save();
        Rect rect = cVar.f4623m;
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.K);
        canvas.restore();
    }

    @Override
    public final boolean e() {
        return this.K.hasDisplayList();
    }

    @Override
    public final void f(int i10, int i11) {
        this.K.setAlpha(i11 / 255.0f);
        this.P = true;
        if (i10 == 0 && i11 > 0) {
            this.H.b();
        }
    }

    @Override
    public final void h() {
        m();
        this.P = true;
    }

    @Override
    public final void k() {
        super.k();
        this.M.setShadowLayer(this.f4635o, 0.0f, this.f4636p, this.f4627f);
        this.N.setColor(this.h);
        this.O.setColor(this.f4629i);
        this.P = true;
    }

    @Override
    public final fh.a t() {
        return this.H;
    }

    @Override
    public final void u() {
        m();
        c cVar = this.f4632l;
        this.N.setStrokeWidth(cVar.f4619i);
        this.O.setStrokeWidth(cVar.f4620j);
        int width = cVar.f4623m.width();
        int height = cVar.f4623m.height();
        Rect rect = this.J;
        rect.set(0, 0, width, height);
        float[] fArr = cVar.f4614b;
        Outline outline = this.I;
        d.s(outline, rect, fArr);
        outline.setAlpha(1.0f);
        if (!cVar.f4623m.isEmpty()) {
            this.L.setPosition(0, 0, cVar.f4623m.width(), cVar.f4623m.height());
            this.K.setPosition(0, 0, cVar.f4623m.width(), cVar.f4623m.height());
            this.K.setOutline(outline);
            this.P = true;
        }
    }

    @Override
    public final void v() {
        this.H.b();
    }

    @Override
    public final d w() {
        this.K.setClipToOutline(false);
        return this;
    }
}
