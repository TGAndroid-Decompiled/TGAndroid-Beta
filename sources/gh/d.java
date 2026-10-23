package gh;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.x;
import bh.f;
import bh.h;
import bh.i;
import java.util.Iterator;
import java.util.List;
public final class d implements a {
    public final a f11075a;
    public i f11077c;
    public f d;
    public int e;
    public a f11078f;
    public boolean h;
    public boolean f11079n;
    public RecordingCanvas f11080r;
    public Runnable v;
    public final re.b f11081s = new re.b();
    public final RenderNode f11076b = x.c();

    public d(a aVar) {
        this.f11075a = aVar;
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f11079n) {
            this.f11079n = true;
            this.f11076b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f11076b.beginRecording(i10, i11);
            this.f11080r = beginRecording;
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
        if (this.f11079n) {
            this.f11076b.endRecording();
            this.f11079n = false;
            this.f11080r = null;
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public final dh.d d() {
        dh.e eVar = new dh.e(this);
        this.f11081s.add(eVar);
        return eVar;
    }

    public final int e(int i10, int i11, List list) {
        RectF rectF;
        Iterator it = this.f11081s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            dh.e eVar = (dh.e) it.next();
            boolean j10 = eVar.j();
            dh.c cVar = eVar.v;
            if (j10 && eVar.f8028x > 0 && !cVar.f8017m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(cVar.f8017m);
                rectF.offset(eVar.f8020a, eVar.f8021b);
                float f7 = -i11;
                rectF.inset(f7, f7);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void f() {
        Iterator it = this.f11081s.iterator();
        while (it.hasNext()) {
            ((dh.e) it.next()).f8035f0 = true;
        }
    }

    public final boolean g(int i10, int i11) {
        if (this.f11076b.hasDisplayList() && this.f11076b.getWidth() == i10 && this.f11076b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void h(float f7) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f11076b;
        if (f7 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void i(float f7, RenderEffect renderEffect) {
        this.f11076b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void j(int i10, int i11) {
        this.f11076b.setPosition(0, 0, i10, i11);
    }

    public final void k(h hVar) {
        if (this.f11077c == null) {
            this.f11077c = new i(this.f11076b, hVar);
        }
    }

    public final void l() {
        this.f11077c.a();
    }

    @Override
    public final void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        f fVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f11075a;
            if (aVar != null) {
                aVar.y(canvas, f7, f10, f11, f12);
            }
        } else if (!this.f11079n) {
            a aVar2 = this.f11078f;
            if (aVar2 != null) {
                aVar2.y(canvas, f7, f10, f11, f12);
            }
            canvas.save();
            if (!this.h) {
                canvas.clipRect(f7, f10, f11, f12);
            }
            if (Build.VERSION.SDK_INT >= 31 && (fVar = this.d) != null) {
                fVar.c(canvas, this.e);
            } else {
                canvas.drawRenderNode(this.f11076b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }
}
