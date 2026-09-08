package gh;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.y;
import bh.f;
import bh.h;
import bh.i;
import java.util.Iterator;
import java.util.List;
public final class d implements a {
    public final a f10681a;
    public i f10683c;
    public f d;
    public int f10684e;
    public a f10685f;
    public boolean h;
    public boolean f10686n;
    public RecordingCanvas f10687r;
    public Runnable v;
    public final pe.b f10688s = new pe.b(true);
    public final RenderNode f10682b = y.c();

    public d(a aVar) {
        this.f10681a = aVar;
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f10686n) {
            this.f10686n = true;
            this.f10682b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f10682b.beginRecording(i10, i11);
            this.f10687r = beginRecording;
            return beginRecording;
        }
        throw new IllegalStateException();
    }

    public final void b() {
        if (this.f10686n) {
            this.f10682b.endRecording();
            this.f10686n = false;
            this.f10687r = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final int c(int i10, int i11, List list) {
        RectF rectF;
        Iterator it = this.f10688s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            dh.e eVar = (dh.e) it.next();
            boolean v = eVar.v();
            dh.c cVar = eVar.h;
            if (v && eVar.f6866j > 0 && !cVar.f6856m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(cVar.f6856m);
                rectF.offset(eVar.f6859a, eVar.f6860b);
                float f7 = -i11;
                rectF.inset(f7, f7);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void d() {
        Iterator it = this.f10688s.iterator();
        while (it.hasNext()) {
            ((dh.e) it.next()).M = true;
        }
    }

    @Override
    public final void e() {
        Runnable runnable = this.v;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final boolean f(int i10, int i11) {
        if (this.f10682b.hasDisplayList() && this.f10682b.getWidth() == i10 && this.f10682b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void g(float f7) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f10682b;
        if (f7 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void h(float f7, RenderEffect renderEffect) {
        this.f10682b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void i(int i10, int i11) {
        this.f10682b.setPosition(0, 0, i10, i11);
    }

    public final void j(h hVar) {
        if (this.f10683c == null) {
            this.f10683c = new i(this.f10682b, hVar);
        }
    }

    @Override
    public final dh.d k() {
        dh.e eVar = new dh.e(this);
        this.f10688s.add(eVar);
        return eVar;
    }

    public final void l() {
        this.f10683c.a();
    }

    @Override
    public final void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        f fVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f10681a;
            if (aVar != null) {
                aVar.v(canvas, f7, f10, f11, f12);
            }
        } else if (!this.f10686n) {
            a aVar2 = this.f10685f;
            if (aVar2 != null) {
                aVar2.v(canvas, f7, f10, f11, f12);
            }
            canvas.save();
            if (!this.h) {
                canvas.clipRect(f7, f10, f11, f12);
            }
            if (Build.VERSION.SDK_INT >= 31 && (fVar = this.d) != null) {
                fVar.c(canvas, this.f10684e);
            } else {
                canvas.drawRenderNode(this.f10682b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }
}
