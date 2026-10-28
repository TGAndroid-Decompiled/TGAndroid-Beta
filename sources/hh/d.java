package hh;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.x;
import ch.f;
import ch.h;
public final class d implements a {
    public final a f12837a;
    public h f12839c;
    public f d;
    public int e;
    public a f12840f;
    public oi.c h;
    public boolean f12841n;
    public boolean f12842r;
    public RecordingCanvas f12843s;
    public final se.b v = new se.b();
    public final RenderNode f12838b = x.c();

    public d(a aVar) {
        this.f12837a = aVar;
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f12842r) {
            this.f12842r = true;
            this.f12838b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f12838b.beginRecording(i10, i11);
            this.f12843s = beginRecording;
            return beginRecording;
        }
        throw new IllegalStateException();
    }

    public final void b() {
        if (this.f12842r) {
            this.f12838b.endRecording();
            this.f12842r = false;
            this.f12843s = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean c(int i10, int i11) {
        if (this.f12838b.hasDisplayList() && this.f12838b.getWidth() == i10 && this.f12838b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void d(float f7) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f12838b;
        if (f7 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void e(float f7, RenderEffect renderEffect) {
        this.f12838b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    @Override
    public final eh.d f() {
        eh.e eVar = new eh.e(this);
        this.v.add(eVar);
        return eVar;
    }

    public final void g(int i10, int i11) {
        this.f12838b.setPosition(0, 0, i10, i11);
    }

    @Override
    public final void w(Canvas canvas, float f7, float f10, float f11, float f12) {
        f fVar;
        oi.c cVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f12837a;
            if (aVar != null) {
                aVar.w(canvas, f7, f10, f11, f12);
            }
        } else if (!this.f12842r) {
            a aVar2 = this.f12840f;
            if (aVar2 != null) {
                aVar2.w(canvas, f7, f10, f11, f12);
            }
            canvas.save();
            if (!this.f12841n) {
                canvas.clipRect(f7, f10, f11, f12);
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31 && (cVar = this.h) != null) {
                cVar.w(canvas, f7, f10, f11, f12);
            } else if (i10 >= 31 && (fVar = this.d) != null) {
                fVar.c(canvas, this.e);
            } else {
                canvas.drawRenderNode(this.f12838b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }
}
