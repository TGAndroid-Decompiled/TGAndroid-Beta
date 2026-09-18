package fh;

import ah.f;
import ah.i;
import ah.k;
import ah.l;
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
    public final a f9073a;
    public l f9075c;
    public i d;
    public int e;
    public a f9076f;
    public boolean h;
    public boolean f9077n;
    public RecordingCanvas f9078r;
    public Runnable v;
    public final pe.b f9079s = new pe.b(true);
    public final RenderNode f9074b = f.c();

    public d(a aVar) {
        this.f9073a = aVar;
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f9077n) {
            this.f9077n = true;
            this.f9074b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f9074b.beginRecording(i10, i11);
            this.f9078r = beginRecording;
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
        if (this.f9077n) {
            this.f9074b.endRecording();
            this.f9077n = false;
            this.f9078r = null;
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public final ch.d d() {
        ch.e eVar = new ch.e(this);
        this.f9079s.add(eVar);
        return eVar;
    }

    public final int e(int i10, int i11, List list) {
        RectF rectF;
        Iterator it = this.f9079s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            ch.e eVar = (ch.e) it.next();
            boolean j3 = eVar.j();
            ch.c cVar = eVar.f4288j;
            if (j3 && eVar.f4290l > 0 && !cVar.f4279m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(cVar.f4279m);
                rectF.offset(eVar.f4282a, eVar.f4283b);
                float f7 = -i11;
                rectF.inset(f7, f7);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void f() {
        Iterator it = this.f9079s.iterator();
        while (it.hasNext()) {
            ((ch.e) it.next()).O = true;
        }
    }

    public final boolean g(int i10, int i11) {
        if (this.f9074b.hasDisplayList() && this.f9074b.getWidth() == i10 && this.f9074b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void h(float f7) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f9074b;
        if (f7 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void i(float f7, RenderEffect renderEffect) {
        this.f9074b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void j(int i10, int i11) {
        this.f9074b.setPosition(0, 0, i10, i11);
    }

    public final void k(k kVar) {
        if (this.f9075c == null) {
            this.f9075c = new l(this.f9074b, kVar);
        }
    }

    public final void l() {
        this.f9075c.a();
    }

    @Override
    public final void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        i iVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f9073a;
            if (aVar != null) {
                aVar.y(canvas, f7, f10, f11, f12);
            }
        } else if (!this.f9077n) {
            a aVar2 = this.f9076f;
            if (aVar2 != null) {
                aVar2.y(canvas, f7, f10, f11, f12);
            }
            canvas.save();
            if (!this.h) {
                canvas.clipRect(f7, f10, f11, f12);
            }
            if (Build.VERSION.SDK_INT >= 31 && (iVar = this.d) != null) {
                iVar.c(canvas, this.e);
            } else {
                canvas.drawRenderNode(this.f9074b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }
}
