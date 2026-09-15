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
    public final a f9069a;
    public k f9071c;
    public h d;
    public int e;
    public a f9072f;
    public boolean h;
    public boolean f9073n;
    public RecordingCanvas f9074r;
    public Runnable v;
    public final pe.b f9075s = new pe.b(true);
    public final RenderNode f9070b = ah.e.c();

    public d(a aVar) {
        this.f9069a = aVar;
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f9073n) {
            this.f9073n = true;
            this.f9070b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f9070b.beginRecording(i10, i11);
            this.f9074r = beginRecording;
            return beginRecording;
        }
        throw new IllegalStateException();
    }

    public final void b() {
        if (this.f9073n) {
            this.f9070b.endRecording();
            this.f9073n = false;
            this.f9074r = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final int c(int i10, int i11, List list) {
        RectF rectF;
        Iterator it = this.f9075s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            ch.e eVar = (ch.e) it.next();
            boolean j3 = eVar.j();
            ch.c cVar = eVar.f4283j;
            if (j3 && eVar.f4285l > 0 && !cVar.f4274m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(cVar.f4274m);
                rectF.offset(eVar.f4277a, eVar.f4278b);
                float f7 = -i11;
                rectF.inset(f7, f7);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    @Override
    public final void d() {
        Runnable runnable = this.v;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e() {
        Iterator it = this.f9075s.iterator();
        while (it.hasNext()) {
            ((ch.e) it.next()).O = true;
        }
    }

    public final boolean f(int i10, int i11) {
        if (this.f9070b.hasDisplayList() && this.f9070b.getWidth() == i10 && this.f9070b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void g(float f7) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f9070b;
        if (f7 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void h(float f7, RenderEffect renderEffect) {
        this.f9070b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void i(int i10, int i11) {
        this.f9070b.setPosition(0, 0, i10, i11);
    }

    public final void j(j jVar) {
        if (this.f9071c == null) {
            this.f9071c = new k(this.f9070b, jVar);
        }
    }

    public final void k() {
        this.f9071c.a();
    }

    @Override
    public final ch.d l() {
        ch.e eVar = new ch.e(this);
        this.f9075s.add(eVar);
        return eVar;
    }

    @Override
    public final void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        h hVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f9069a;
            if (aVar != null) {
                aVar.y(canvas, f7, f10, f11, f12);
            }
        } else if (!this.f9073n) {
            a aVar2 = this.f9072f;
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
                canvas.drawRenderNode(this.f9070b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }
}
