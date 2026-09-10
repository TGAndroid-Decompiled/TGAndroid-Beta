package eh;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import zg.g;
import zg.h;
public final class d implements a {
    public final a f7518a;
    public h f7520c;
    public zg.e d;
    public int e;
    public a f7521f;
    public boolean h;
    public boolean f7522n;
    public RecordingCanvas f7523r;
    public Runnable v;
    public final pe.b f7524s = new pe.b(true);
    public final RenderNode f7519b = ah.b.k();

    public d(a aVar) {
        this.f7518a = aVar;
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f7522n) {
            this.f7522n = true;
            this.f7519b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f7519b.beginRecording(i10, i11);
            this.f7523r = beginRecording;
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
        if (this.f7522n) {
            this.f7519b.endRecording();
            this.f7522n = false;
            this.f7523r = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final int d(int i10, int i11, List list) {
        RectF rectF;
        Iterator it = this.f7524s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            bh.e eVar = (bh.e) it.next();
            boolean v = eVar.v();
            bh.c cVar = eVar.h;
            if (v && eVar.f2275j > 0 && !cVar.f2266m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(cVar.f2266m);
                rectF.offset(eVar.f2269a, eVar.f2270b);
                float f7 = -i11;
                rectF.inset(f7, f7);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void e() {
        Iterator it = this.f7524s.iterator();
        while (it.hasNext()) {
            ((bh.e) it.next()).M = true;
        }
    }

    public final boolean f(int i10, int i11) {
        if (this.f7519b.hasDisplayList() && this.f7519b.getWidth() == i10 && this.f7519b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void g(float f7) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f7519b;
        if (f7 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void h(float f7, RenderEffect renderEffect) {
        this.f7519b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void i(int i10, int i11) {
        this.f7519b.setPosition(0, 0, i10, i11);
    }

    public final void j(g gVar) {
        if (this.f7520c == null) {
            this.f7520c = new h(this.f7519b, gVar);
        }
    }

    @Override
    public final bh.d k() {
        bh.e eVar = new bh.e(this);
        this.f7524s.add(eVar);
        return eVar;
    }

    public final void l() {
        this.f7520c.a();
    }

    @Override
    public final void u(Canvas canvas, float f7, float f10, float f11, float f12) {
        zg.e eVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f7518a;
            if (aVar != null) {
                aVar.u(canvas, f7, f10, f11, f12);
            }
        } else if (!this.f7522n) {
            a aVar2 = this.f7521f;
            if (aVar2 != null) {
                aVar2.u(canvas, f7, f10, f11, f12);
            }
            canvas.save();
            if (!this.h) {
                canvas.clipRect(f7, f10, f11, f12);
            }
            if (Build.VERSION.SDK_INT >= 31 && (eVar = this.d) != null) {
                eVar.c(canvas, this.e);
            } else {
                canvas.drawRenderNode(this.f7519b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }
}
