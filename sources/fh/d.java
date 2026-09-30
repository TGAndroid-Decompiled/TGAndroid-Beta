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
    public final a f9068a;
    public k f9070c;
    public h d;
    public int e;
    public a f9071f;
    public boolean h;
    public boolean f9072n;
    public RecordingCanvas f9073r;
    public Runnable v;
    public final pe.b f9074s = new pe.b();
    public final RenderNode f9069b = ah.e.c();

    public d(a aVar) {
        this.f9068a = aVar;
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f9072n) {
            this.f9072n = true;
            this.f9069b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f9069b.beginRecording(i10, i11);
            this.f9073r = beginRecording;
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
        if (this.f9072n) {
            this.f9069b.endRecording();
            this.f9072n = false;
            this.f9073r = null;
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public final ch.d d() {
        ch.e eVar = new ch.e(this);
        this.f9074s.add(eVar);
        return eVar;
    }

    public final int e(int i10, int i11, List list) {
        RectF rectF;
        Iterator it = this.f9074s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            ch.e eVar = (ch.e) it.next();
            boolean j3 = eVar.j();
            ch.c cVar = eVar.f4287j;
            if (j3 && eVar.f4289l > 0 && !cVar.f4278m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(cVar.f4278m);
                rectF.offset(eVar.f4281a, eVar.f4282b);
                float f7 = -i11;
                rectF.inset(f7, f7);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void f() {
        Iterator it = this.f9074s.iterator();
        while (it.hasNext()) {
            ((ch.e) it.next()).O = true;
        }
    }

    public final boolean g(int i10, int i11) {
        if (this.f9069b.hasDisplayList() && this.f9069b.getWidth() == i10 && this.f9069b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void h(float f7) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f9069b;
        if (f7 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void i(float f7, RenderEffect renderEffect) {
        this.f9069b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void j(int i10, int i11) {
        this.f9069b.setPosition(0, 0, i10, i11);
    }

    public final void k(j jVar) {
        if (this.f9070c == null) {
            this.f9070c = new k(this.f9069b, jVar);
        }
    }

    public final void l() {
        this.f9070c.a();
    }

    @Override
    public final void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        h hVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f9068a;
            if (aVar != null) {
                aVar.y(canvas, f7, f10, f11, f12);
            }
        } else if (!this.f9072n) {
            a aVar2 = this.f9071f;
            if (aVar2 != null) {
                aVar2.y(canvas, f7, f10, f11, f12);
            }
            canvas.save();
            if (!this.h) {
                canvas.clipRect(f7, f10, f11, f12);
            }
            if (Build.VERSION.SDK_INT >= 31 && (hVar = this.d) != null) {
                hVar.c(canvas, this.e);
            } else {
                canvas.drawRenderNode(this.f9069b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }
}
