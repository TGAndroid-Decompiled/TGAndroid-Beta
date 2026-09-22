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
    public final a f9074a;
    public l f9076c;
    public i d;
    public int e;
    public a f9077f;
    public boolean h;
    public boolean f9078n;
    public RecordingCanvas f9079r;
    public Runnable v;
    public final pe.b f9080s = new pe.b(true);
    public final RenderNode f9075b = f.c();

    public d(a aVar) {
        this.f9074a = aVar;
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f9078n) {
            this.f9078n = true;
            this.f9075b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f9075b.beginRecording(i10, i11);
            this.f9079r = beginRecording;
            return beginRecording;
        }
        throw new IllegalStateException();
    }

    public final void b() {
        if (this.f9078n) {
            this.f9075b.endRecording();
            this.f9078n = false;
            this.f9079r = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final int c(int i10, int i11, List list) {
        RectF rectF;
        Iterator it = this.f9080s.iterator();
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

    @Override
    public final void d() {
        Runnable runnable = this.v;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e() {
        Iterator it = this.f9080s.iterator();
        while (it.hasNext()) {
            ((ch.e) it.next()).O = true;
        }
    }

    public final boolean f(int i10, int i11) {
        if (this.f9075b.hasDisplayList() && this.f9075b.getWidth() == i10 && this.f9075b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void g(float f7) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f9075b;
        if (f7 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void h(float f7, RenderEffect renderEffect) {
        this.f9075b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void i(int i10, int i11) {
        this.f9075b.setPosition(0, 0, i10, i11);
    }

    public final void j(k kVar) {
        if (this.f9076c == null) {
            this.f9076c = new l(this.f9075b, kVar);
        }
    }

    public final void k() {
        this.f9076c.a();
    }

    @Override
    public final ch.d l() {
        ch.e eVar = new ch.e(this);
        this.f9080s.add(eVar);
        return eVar;
    }

    @Override
    public final void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        i iVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f9074a;
            if (aVar != null) {
                aVar.v(canvas, f7, f10, f11, f12);
            }
        } else if (!this.f9078n) {
            a aVar2 = this.f9077f;
            if (aVar2 != null) {
                aVar2.v(canvas, f7, f10, f11, f12);
            }
            canvas.save();
            if (!this.h) {
                canvas.clipRect(f7, f10, f11, f12);
            }
            if (Build.VERSION.SDK_INT >= 31 && (iVar = this.d) != null) {
                iVar.c(canvas, this.e);
            } else {
                canvas.drawRenderNode(this.f9075b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }
}
