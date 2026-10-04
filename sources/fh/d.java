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
import yh.k0;
public final class d implements a {
    public final a f9858a;
    public final RenderNode f9859b = f.c();
    public k f9860c;
    public i d;
    public int f9861e;
    public a f9862f;
    public li.c h;
    public boolean f9863n;
    public boolean f9864r;
    public RecordingCanvas f9865s;
    public k0 v;

    public d(a aVar) {
        this.f9858a = aVar;
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f9864r) {
            this.f9864r = true;
            this.f9859b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f9859b.beginRecording(i10, i11);
            this.f9865s = beginRecording;
            return beginRecording;
        }
        throw new IllegalStateException();
    }

    @Override
    public final void b() {
        k0 k0Var = this.v;
        if (k0Var != null) {
            k0Var.run();
        }
    }

    public final void c() {
        if (this.f9864r) {
            this.f9859b.endRecording();
            this.f9864r = false;
            this.f9865s = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean d(int i10, int i11) {
        if (this.f9859b.hasDisplayList() && this.f9859b.getWidth() == i10 && this.f9859b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void e(float f7) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f9859b;
        if (f7 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    @Override
    public final ch.d f() {
        return new ch.e(this);
    }

    public final void g(float f7, RenderEffect renderEffect) {
        this.f9859b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void h(int i10, int i11) {
        this.f9859b.setPosition(0, 0, i10, i11);
    }

    @Override
    public final void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        i iVar;
        li.c cVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f9858a;
            if (aVar != null) {
                aVar.y(canvas, f7, f10, f11, f12);
            }
        } else if (!this.f9864r) {
            a aVar2 = this.f9862f;
            if (aVar2 != null) {
                aVar2.y(canvas, f7, f10, f11, f12);
            }
            canvas.save();
            if (!this.f9863n) {
                canvas.clipRect(f7, f10, f11, f12);
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31 && (cVar = this.h) != null) {
                cVar.y(canvas, f7, f10, f11, f12);
            } else if (i10 >= 31 && (iVar = this.d) != null) {
                iVar.c(canvas, this.f9861e);
            } else {
                canvas.drawRenderNode(this.f9859b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }
}
