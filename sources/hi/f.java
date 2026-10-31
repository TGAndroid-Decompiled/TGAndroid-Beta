package hi;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.w;
import tg.h;
public final class f implements a, tg.a {
    public final a f7716a;
    public h f7718c;
    public tg.f d;
    public int e;
    public a f7719f;
    public ei.d h;
    public boolean f7720n;
    public boolean f7721r;
    public RecordingCanvas f7722s;
    public final je.b f7723w = new je.b();
    public final RenderNode f7717b = w.n();

    public f(a aVar) {
        this.f7716a = aVar;
    }

    @Override
    public final vg.f a() {
        vg.f fVar = new vg.f(this);
        this.f7723w.add(fVar);
        return fVar;
    }

    public final RecordingCanvas b(int i10, int i11) {
        if (!this.f7721r) {
            this.f7721r = true;
            this.f7717b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f7717b.beginRecording(i10, i11);
            this.f7722s = beginRecording;
            return beginRecording;
        }
        throw new IllegalStateException();
    }

    public final void c() {
        if (this.f7721r) {
            this.f7717b.endRecording();
            this.f7721r = false;
            this.f7722s = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean d(int i10, int i11) {
        if (this.f7717b.hasDisplayList() && this.f7717b.getWidth() == i10 && this.f7717b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        tg.f fVar;
        ei.d dVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f7716a;
            if (aVar != null) {
                aVar.e(canvas, f7, f10, f11, f12);
            }
        } else if (!this.f7721r) {
            a aVar2 = this.f7719f;
            if (aVar2 != null) {
                aVar2.e(canvas, f7, f10, f11, f12);
            }
            canvas.save();
            if (!this.f7720n) {
                canvas.clipRect(f7, f10, f11, f12);
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31 && (dVar = this.h) != null) {
                dVar.e(canvas, f7, f10, f11, f12);
            } else if (i10 >= 31 && (fVar = this.d) != null) {
                fVar.c(canvas, this.e);
            } else {
                canvas.drawRenderNode(this.f7717b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }

    public final void f(float f7) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f7717b;
        if (f7 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void g(float f7, RenderEffect renderEffect) {
        this.f7717b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void h(int i10, int i11) {
        this.f7717b.setPosition(0, 0, i10, i11);
    }
}
