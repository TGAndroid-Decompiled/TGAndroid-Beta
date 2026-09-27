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
    public final fh.a G;
    public final Outline H = new Outline();
    public final Rect I = new Rect();
    public final RenderNode J;
    public final RenderNode K;
    public final Paint L;
    public final Paint M;
    public final Paint N;
    public boolean O;
    public j P;

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

    public final void A() {
        float f7 = this.f4276a;
        float f10 = this.f4277b;
        c cVar = this.f4282j;
        Rect rect = cVar.f4273m;
        Rect rect2 = cVar.f4273m;
        float f11 = rect.left + f7;
        float f12 = rect.top + f10;
        float f13 = rect.right + f7;
        float f14 = rect.bottom + f10;
        RecordingCanvas beginRecording = this.K.beginRecording();
        beginRecording.save();
        beginRecording.translate(-f11, -f12);
        if (this.P != null && Build.VERSION.SDK_INT >= 33) {
            int i10 = cVar.f4267f;
            if (i10 <= 0) {
                i10 = AndroidUtilities.dp(11.0f);
            }
            int max = Math.max(Math.min(i10, Math.min(rect2.width(), rect2.height()) / 5), 1);
            j jVar = this.P;
            float width = rect2.width();
            float height = rect2.height();
            float[] fArr = cVar.f4266c;
            jVar.a(width, height, fArr[0], fArr[2], fArr[4], fArr[6], max, cVar.f4268g, cVar.h, this.e);
        }
        this.G.y(beginRecording, f11, f12, f13, f14);
        beginRecording.save();
        this.K.endRecording();
        RecordingCanvas beginRecording2 = this.J.beginRecording();
        if (Color.alpha(this.e) == 255) {
            beginRecording2.drawColor(this.e);
        } else {
            beginRecording2.drawRenderNode(this.K);
            if (this.P == null && Color.alpha(this.e) != 0) {
                beginRecording2.drawColor(this.e);
            }
        }
        if (this.f4279f != 0) {
            d.l(beginRecording2, rect2.width(), rect2.height(), cVar.f4265b, cVar.f4269i, true, this.M);
        }
        if (this.f4280g != 0) {
            d.l(beginRecording2, rect2.width(), rect2.height(), cVar.f4265b, cVar.f4270j, false, this.N);
        }
        this.J.endRecording();
    }

    @Override
    public final void a() {
        A();
    }

    @Override
    public final boolean d() {
        return this.J.hasDisplayList();
    }

    @Override
    public final void draw(Canvas canvas) {
        c cVar = this.f4282j;
        if (cVar.f4273m.isEmpty()) {
            return;
        }
        boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
        fh.a aVar = this.G;
        if (!isHardwareAccelerated) {
            j(canvas, aVar);
            return;
        }
        if (!this.J.hasDisplayList()) {
            aVar.b();
            A();
        } else if (this.O) {
            A();
        }
        this.O = false;
        int l1 = i6.l1(this.J.getAlpha() * this.f4288p, this.d);
        if (Color.alpha(l1) != 0) {
            float f7 = this.f4286n;
            float f10 = this.f4287o;
            Paint paint = this.L;
            paint.setShadowLayer(f7, 0.0f, f10, l1);
            cVar.c(canvas, paint, this.f4285m);
        }
        canvas.save();
        Rect rect = cVar.f4273m;
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.J);
        canvas.restore();
    }

    @Override
    public final void g() {
        super.g();
        this.L.setShadowLayer(this.f4286n, 0.0f, this.f4287o, this.d);
        this.M.setColor(this.f4279f);
        this.N.setColor(this.f4280g);
        this.O = true;
    }

    @Override
    public final fh.a p() {
        return this.G;
    }

    @Override
    public final void q() {
        i();
        c cVar = this.f4282j;
        this.M.setStrokeWidth(cVar.f4269i);
        this.N.setStrokeWidth(cVar.f4270j);
        int width = cVar.f4273m.width();
        int height = cVar.f4273m.height();
        Rect rect = this.I;
        rect.set(0, 0, width, height);
        float[] fArr = cVar.f4265b;
        Outline outline = this.H;
        d.o(outline, rect, fArr);
        outline.setAlpha(1.0f);
        if (!cVar.f4273m.isEmpty()) {
            this.K.setPosition(0, 0, cVar.f4273m.width(), cVar.f4273m.height());
            this.J.setPosition(0, 0, cVar.f4273m.width(), cVar.f4273m.height());
            this.J.setOutline(outline);
            this.O = true;
        }
    }

    @Override
    public final void r() {
        i();
        this.O = true;
    }

    @Override
    public final void s() {
        this.G.b();
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f4284l;
        this.f4284l = i10;
        this.J.setAlpha(i10 / 255.0f);
        this.O = true;
        if (i11 == 0 && i10 > 0) {
            this.G.b();
        }
    }

    @Override
    public final d t() {
        this.J.setClipToOutline(false);
        return this;
    }
}
