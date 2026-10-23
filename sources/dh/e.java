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
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class e extends d {
    public final gh.a X;
    public final Outline Y = new Outline();
    public final Rect Z = new Rect();
    public final RenderNode f8030a0;
    public final RenderNode f8031b0;
    public final Paint f8032c0;
    public final Paint f8033d0;
    public final Paint f8034e0;
    public boolean f8035f0;
    public g f8036g0;

    public e(gh.a aVar) {
        Paint paint = new Paint(1);
        this.f8032c0 = paint;
        Paint paint2 = new Paint(1);
        this.f8033d0 = paint2;
        Paint paint3 = new Paint(1);
        this.f8034e0 = paint3;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.f8030a0 = renderNode;
        this.f8031b0 = new RenderNode("BlurredFill");
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        this.X = aVar;
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint3.setStyle(style);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = r6.f21817b;
        if (this.f8026s != i10) {
            this.f8026s = i10;
            try {
                updateColors();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        c cVar = this.v;
        if (cVar.f8017m.isEmpty()) {
            return;
        }
        boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
        gh.a aVar = this.X;
        if (!isHardwareAccelerated) {
            c(canvas, aVar);
            return;
        }
        if (!this.f8030a0.hasDisplayList()) {
            aVar.b();
            v();
        } else if (this.f8035f0) {
            v();
        }
        this.f8035f0 = false;
        int o12 = k6.o1(this.f8030a0.getAlpha() * this.G, this.d);
        if (Color.alpha(o12) != 0) {
            float f7 = this.E;
            float f10 = this.F;
            Paint paint = this.f8032c0;
            paint.setShadowLayer(f7, 0.0f, f10, o12);
            cVar.c(canvas, paint, this.f8029y);
        }
        canvas.save();
        Rect rect = cVar.f8017m;
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.f8030a0);
        canvas.restore();
    }

    @Override
    public final gh.a i() {
        return this.X;
    }

    @Override
    public final boolean j() {
        return this.f8030a0.hasDisplayList();
    }

    @Override
    public final void k() {
        b();
        c cVar = this.v;
        this.f8033d0.setStrokeWidth(cVar.f8013i);
        this.f8034e0.setStrokeWidth(cVar.f8014j);
        int width = cVar.f8017m.width();
        int height = cVar.f8017m.height();
        Rect rect = this.Z;
        rect.set(0, 0, width, height);
        float[] fArr = cVar.f8009b;
        Outline outline = this.Y;
        d.h(outline, rect, fArr);
        outline.setAlpha(1.0f);
        if (!cVar.f8017m.isEmpty()) {
            this.f8031b0.setPosition(0, 0, cVar.f8017m.width(), cVar.f8017m.height());
            this.f8030a0.setPosition(0, 0, cVar.f8017m.width(), cVar.f8017m.height());
            this.f8030a0.setOutline(outline);
            this.f8035f0 = true;
        }
    }

    @Override
    public final void l() {
        b();
        this.f8035f0 = true;
    }

    @Override
    public final void m() {
        this.X.b();
    }

    @Override
    public final d n() {
        this.f8030a0.setClipToOutline(false);
        return this;
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f8028x;
        this.f8028x = i10;
        this.f8030a0.setAlpha(i10 / 255.0f);
        this.f8035f0 = true;
        if (i11 == 0 && i10 > 0) {
            this.X.b();
        }
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        this.f8032c0.setShadowLayer(this.E, 0.0f, this.F, this.d);
        this.f8033d0.setColor(this.f8023f);
        this.f8034e0.setColor(this.h);
        this.f8035f0 = true;
    }

    @Override
    public final void v() {
        float f7 = this.f8020a;
        float f10 = this.f8021b;
        c cVar = this.v;
        Rect rect = cVar.f8017m;
        Rect rect2 = cVar.f8017m;
        float f11 = rect.left + f7;
        float f12 = rect.top + f10;
        float f13 = rect.right + f7;
        float f14 = rect.bottom + f10;
        RecordingCanvas beginRecording = this.f8031b0.beginRecording();
        beginRecording.save();
        beginRecording.translate(-f11, -f12);
        if (this.f8036g0 != null && Build.VERSION.SDK_INT >= 33) {
            int i10 = cVar.f8011f;
            if (i10 <= 0) {
                i10 = AndroidUtilities.dp(11.0f);
            }
            int max = Math.max(Math.min(i10, Math.min(rect2.width(), rect2.height()) / 5), 1);
            g gVar = this.f8036g0;
            float width = rect2.width();
            float height = rect2.height();
            float[] fArr = cVar.f8010c;
            gVar.a(width, height, fArr[0], fArr[2], fArr[4], fArr[6], max, cVar.f8012g, cVar.h, this.e);
        }
        this.X.y(beginRecording, f11, f12, f13, f14);
        beginRecording.save();
        this.f8031b0.endRecording();
        RecordingCanvas beginRecording2 = this.f8030a0.beginRecording();
        if (Color.alpha(this.e) == 255) {
            beginRecording2.drawColor(this.e);
        } else {
            beginRecording2.drawRenderNode(this.f8031b0);
            if (this.f8036g0 == null && Color.alpha(this.e) != 0) {
                beginRecording2.drawColor(this.e);
            }
        }
        if (this.f8023f != 0) {
            d.e(beginRecording2, rect2.width(), rect2.height(), cVar.f8009b, cVar.f8013i, true, this.f8033d0);
        }
        if (this.h != 0) {
            d.e(beginRecording2, rect2.width(), rect2.height(), cVar.f8009b, cVar.f8014j, false, this.f8034e0);
        }
        this.f8030a0.endRecording();
    }
}
