package eh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import ch.g;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
public final class e extends d {
    public final hh.a Y;
    public final Outline Z = new Outline();
    public final Rect f9967a0 = new Rect();
    public final RenderNode f9968b0;
    public final RenderNode f9969c0;
    public final Paint f9970d0;
    public final Paint f9971e0;
    public final Paint f9972f0;
    public boolean f9973g0;
    public g f9974h0;

    public e(hh.a aVar) {
        Paint paint = new Paint(1);
        this.f9970d0 = paint;
        Paint paint2 = new Paint(1);
        this.f9971e0 = paint2;
        Paint paint3 = new Paint(1);
        this.f9972f0 = paint3;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.f9968b0 = renderNode;
        this.f9969c0 = new RenderNode("BlurredFill");
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        this.Y = aVar;
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint3.setStyle(style);
    }

    public final void B() {
        float f7 = this.f19461c;
        float f10 = this.d;
        c cVar = this.f9965x;
        Rect rect = cVar.f9957m;
        Rect rect2 = cVar.f9957m;
        float f11 = rect.left + f7;
        float f12 = rect.top + f10;
        float f13 = rect.right + f7;
        float f14 = rect.bottom + f10;
        RecordingCanvas beginRecording = this.f9969c0.beginRecording();
        beginRecording.save();
        beginRecording.translate(-f11, -f12);
        if (this.f9974h0 != null && Build.VERSION.SDK_INT >= 33) {
            int i10 = cVar.f9951f;
            if (i10 <= 0) {
                i10 = AndroidUtilities.dp(11.0f);
            }
            int max = Math.max(Math.min(i10, Math.min(rect2.width(), rect2.height()) / 5), 1);
            g gVar = this.f9974h0;
            float width = rect2.width();
            float height = rect2.height();
            float[] fArr = cVar.f9950c;
            gVar.a(width, height, fArr[0], fArr[2], fArr[4], fArr[6], max, cVar.f9952g, cVar.h, this.h);
        }
        this.Y.w(beginRecording, f11, f12, f13, f14);
        beginRecording.save();
        this.f9969c0.endRecording();
        RecordingCanvas beginRecording2 = this.f9968b0.beginRecording();
        if (Color.alpha(this.h) == 255) {
            beginRecording2.drawColor(this.h);
        } else {
            beginRecording2.drawRenderNode(this.f9969c0);
            if (this.f9974h0 == null && Color.alpha(this.h) != 0) {
                beginRecording2.drawColor(this.h);
            }
        }
        if (this.f9961n != 0) {
            d.o(beginRecording2, rect2.width(), rect2.height(), cVar.f9949b, cVar.f9953i, true, this.f9971e0);
        }
        if (this.f9962r != 0) {
            d.o(beginRecording2, rect2.width(), rect2.height(), cVar.f9949b, cVar.f9954j, false, this.f9972f0);
        }
        this.f9968b0.endRecording();
    }

    @Override
    public final void a() {
        B();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = f7.f22629b;
        if (this.f9964w != i10) {
            this.f9964w = i10;
            try {
                updateColors();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        c cVar = this.f9965x;
        if (cVar.f9957m.isEmpty()) {
            return;
        }
        if (!canvas.isHardwareAccelerated()) {
            m(canvas, this.Y);
            return;
        }
        if (!this.f9968b0.hasDisplayList()) {
            B();
        } else if (this.f9973g0) {
            B();
        }
        this.f9973g0 = false;
        int o12 = y6.o1(this.f9968b0.getAlpha() * this.H, this.f9960f);
        if (Color.alpha(o12) != 0) {
            float f7 = this.F;
            float f10 = this.G;
            Paint paint = this.f9970d0;
            paint.setShadowLayer(f7, 0.0f, f10, o12);
            cVar.c(canvas, paint, this.E);
        }
        canvas.save();
        Rect rect = cVar.f9957m;
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.f9968b0);
        canvas.restore();
    }

    @Override
    public final boolean e() {
        return this.f9968b0.hasDisplayList();
    }

    @Override
    public final void f(int i10) {
        this.f9968b0.setAlpha(i10 / 255.0f);
        this.f9973g0 = true;
    }

    @Override
    public final void h() {
        l();
        this.f9973g0 = true;
    }

    @Override
    public final hh.a s() {
        return this.Y;
    }

    @Override
    public final void t() {
        l();
        c cVar = this.f9965x;
        this.f9971e0.setStrokeWidth(cVar.f9953i);
        this.f9972f0.setStrokeWidth(cVar.f9954j);
        int width = cVar.f9957m.width();
        int height = cVar.f9957m.height();
        Rect rect = this.f9967a0;
        rect.set(0, 0, width, height);
        float[] fArr = cVar.f9949b;
        Outline outline = this.Z;
        d.r(outline, rect, fArr);
        outline.setAlpha(1.0f);
        if (!cVar.f9957m.isEmpty()) {
            this.f9969c0.setPosition(0, 0, cVar.f9957m.width(), cVar.f9957m.height());
            this.f9968b0.setPosition(0, 0, cVar.f9957m.width(), cVar.f9957m.height());
            this.f9968b0.setOutline(outline);
            this.f9973g0 = true;
        }
    }

    @Override
    public final d u() {
        this.f9968b0.setClipToOutline(false);
        return this;
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        this.f9970d0.setShadowLayer(this.F, 0.0f, this.G, this.f9960f);
        this.f9971e0.setColor(this.f9961n);
        this.f9972f0.setColor(this.f9962r);
        this.f9973g0 = true;
    }
}
