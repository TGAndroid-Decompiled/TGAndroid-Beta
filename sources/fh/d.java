package fh;

import ah.h;
import ah.j;
import ah.k;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
public final class d implements a {
    public final a f9932a;
    public k f9934c;
    public h d;
    public int f9935e;
    public a f9936f;
    public boolean h;
    public boolean f9937n;
    public RecordingCanvas f9938r;
    public Runnable v;
    public final qe.b f9939s = new qe.b();
    public final RenderNode f9933b = ah.e.c();

    public d(a aVar) {
        this.f9932a = aVar;
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f9937n) {
            this.f9937n = true;
            this.f9933b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f9933b.beginRecording(i10, i11);
            this.f9938r = beginRecording;
            return beginRecording;
        }
        throw new IllegalStateException();
    }

    @Override
    public final void b() {
        Runnable runnable = this.v;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c() {
        if (this.f9937n) {
            this.f9933b.endRecording();
            this.f9937n = false;
            this.f9938r = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final int d(int i10, int i11, List list) {
        RectF rectF;
        Iterator it = this.f9939s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            ch.e eVar = (ch.e) it.next();
            boolean j3 = eVar.j();
            ch.c cVar = eVar.f4683j;
            if (j3 && eVar.f4685l > 0 && !cVar.f4673m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(cVar.f4673m);
                rectF.offset(eVar.f4676a, eVar.f4677b);
                float f7 = -i11;
                rectF.inset(f7, f7);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void e() {
        Iterator it = this.f9939s.iterator();
        while (it.hasNext()) {
            ((ch.e) it.next()).O = true;
        }
    }

    public final boolean f(int i10, int i11) {
        if (this.f9933b.hasDisplayList() && this.f9933b.getWidth() == i10 && this.f9933b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void g(float f7) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f9933b;
        if (f7 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void h(float f7, RenderEffect renderEffect) {
        this.f9933b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void i(int i10, int i11) {
        this.f9933b.setPosition(0, 0, i10, i11);
    }

    public final void j(j jVar) {
        if (this.f9934c == null) {
            this.f9934c = new k(this.f9933b, jVar);
        }
    }

    public final void k() {
        this.f9934c.a();
    }

    @Override
    public final ch.d l() {
        ch.e eVar = new ch.e(this);
        this.f9939s.add(eVar);
        return eVar;
    }

    @Override
    public final void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        h hVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f9932a;
            if (aVar != null) {
                aVar.v(canvas, f7, f10, f11, f12);
            }
        } else if (!this.f9937n) {
            a aVar2 = this.f9936f;
            if (aVar2 != null) {
                aVar2.v(canvas, f7, f10, f11, f12);
            }
            canvas.save();
            if (!this.h) {
                canvas.clipRect(f7, f10, f11, f12);
            }
            if (Build.VERSION.SDK_INT >= 31 && (hVar = this.d) != null) {
                hVar.c(canvas, this.f9935e);
            } else {
                canvas.drawRenderNode(this.f9933b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }
}
