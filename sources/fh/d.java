package fh;

import ah.f;
import ah.i;
import ah.k;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
public final class d implements a {
    public final a f9859a;
    public final RenderNode f9860b = f.c();
    public k f9861c;
    public i d;
    public int f9862e;
    public a f9863f;
    public li.c h;
    public boolean f9864n;
    public boolean f9865r;
    public RecordingCanvas f9866s;

    public d(a aVar) {
        this.f9859a = aVar;
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f9865r) {
            this.f9865r = true;
            this.f9860b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f9860b.beginRecording(i10, i11);
            this.f9866s = beginRecording;
            return beginRecording;
        }
        throw new IllegalStateException();
    }

    @Override
    public final ch.d b() {
        return new ch.e(this);
    }

    public final void c() {
        if (this.f9865r) {
            this.f9860b.endRecording();
            this.f9865r = false;
            this.f9866s = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean d(int i10, int i11) {
        if (this.f9860b.hasDisplayList() && this.f9860b.getWidth() == i10 && this.f9860b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void e(float f7) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f9860b;
        if (f7 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void f(float f7, RenderEffect renderEffect) {
        this.f9860b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void g(int i10, int i11) {
        this.f9860b.setPosition(0, 0, i10, i11);
    }

    @Override
    public final void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        i iVar;
        li.c cVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f9859a;
            if (aVar != null) {
                aVar.v(canvas, f7, f10, f11, f12);
            }
        } else if (!this.f9865r) {
            a aVar2 = this.f9863f;
            if (aVar2 != null) {
                aVar2.v(canvas, f7, f10, f11, f12);
            }
            canvas.save();
            if (!this.f9864n) {
                canvas.clipRect(f7, f10, f11, f12);
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31 && (cVar = this.h) != null) {
                cVar.v(canvas, f7, f10, f11, f12);
            } else if (i10 >= 31 && (iVar = this.d) != null) {
                iVar.c(canvas, this.f9862e);
            } else {
                canvas.drawRenderNode(this.f9860b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }
}
