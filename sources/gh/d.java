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
    public final a f11059a;
    public i f11061c;
    public f d;
    public int e;
    public a f11062f;
    public boolean h;
    public boolean f11063n;
    public RecordingCanvas f11064r;
    public Runnable v;
    public final re.b f11065s = new re.b();
    public final RenderNode f11060b = x.c();

    public d(a aVar) {
        this.f11059a = aVar;
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f11063n) {
            this.f11063n = true;
            this.f11060b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f11060b.beginRecording(i10, i11);
            this.f11064r = beginRecording;
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
        if (this.f11063n) {
            this.f11060b.endRecording();
            this.f11063n = false;
            this.f11064r = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final int d(int i10, int i11, List list) {
        RectF rectF;
        Iterator it = this.f11065s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            dh.e eVar = (dh.e) it.next();
            boolean j10 = eVar.j();
            dh.c cVar = eVar.f8017j;
            if (j10 && eVar.f8019l > 0 && !cVar.f8008m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(cVar.f8008m);
                rectF.offset(eVar.f8011a, eVar.f8012b);
                float f7 = -i11;
                rectF.inset(f7, f7);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void e() {
        Iterator it = this.f11065s.iterator();
        while (it.hasNext()) {
            ((dh.e) it.next()).O = true;
        }
    }

    @Override
    public final dh.d f() {
        dh.e eVar = new dh.e(this);
        this.f11065s.add(eVar);
        return eVar;
    }

    public final boolean g(int i10, int i11) {
        if (this.f11060b.hasDisplayList() && this.f11060b.getWidth() == i10 && this.f11060b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void h(float f7) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f11060b;
        if (f7 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void i(float f7, RenderEffect renderEffect) {
        this.f11060b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void j(int i10, int i11) {
        this.f11060b.setPosition(0, 0, i10, i11);
    }

    public final void k(h hVar) {
        if (this.f11061c == null) {
            this.f11061c = new i(this.f11060b, hVar);
        }
    }

    public final void l() {
        this.f11061c.a();
    }

    @Override
    public final void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        f fVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f11059a;
            if (aVar != null) {
                aVar.y(canvas, f7, f10, f11, f12);
            }
        } else if (!this.f11063n) {
            a aVar2 = this.f11062f;
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
                canvas.drawRenderNode(this.f11060b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }
}
