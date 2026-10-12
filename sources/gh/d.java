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
    public final a f10149a;
    public i f10151c;
    public f d;
    public int e;
    public a f10152f;
    public boolean h;
    public boolean f10153n;
    public RecordingCanvas f10154r;
    public Runnable v;
    public final re.b f10155s = new re.b();
    public final RenderNode f10150b = x.c();

    public d(a aVar) {
        this.f10149a = aVar;
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f10153n) {
            this.f10153n = true;
            this.f10150b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f10150b.beginRecording(i10, i11);
            this.f10154r = beginRecording;
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
        if (this.f10153n) {
            this.f10150b.endRecording();
            this.f10153n = false;
            this.f10154r = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final int d(int i10, int i11, List list) {
        RectF rectF;
        Iterator it = this.f10155s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            dh.e eVar = (dh.e) it.next();
            boolean j10 = eVar.j();
            dh.c cVar = eVar.f6558j;
            if (j10 && eVar.f6560l > 0 && !cVar.f6549m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(cVar.f6549m);
                rectF.offset(eVar.f6552a, eVar.f6553b);
                float f7 = -i11;
                rectF.inset(f7, f7);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void e() {
        Iterator it = this.f10155s.iterator();
        while (it.hasNext()) {
            ((dh.e) it.next()).O = true;
        }
    }

    public final boolean f(int i10, int i11) {
        if (this.f10150b.hasDisplayList() && this.f10150b.getWidth() == i10 && this.f10150b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void g(float f7) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f10150b;
        if (f7 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void h(float f7, RenderEffect renderEffect) {
        this.f10150b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void i(int i10, int i11) {
        this.f10150b.setPosition(0, 0, i10, i11);
    }

    public final void j(h hVar) {
        if (this.f10151c == null) {
            this.f10151c = new i(this.f10150b, hVar);
        }
    }

    @Override
    public final dh.d k() {
        dh.e eVar = new dh.e(this);
        this.f10155s.add(eVar);
        return eVar;
    }

    public final void l() {
        this.f10151c.a();
    }

    @Override
    public final void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        f fVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f10149a;
            if (aVar != null) {
                aVar.v(canvas, f7, f10, f11, f12);
            }
        } else if (!this.f10153n) {
            a aVar2 = this.f10152f;
            if (aVar2 != null) {
                aVar2.v(canvas, f7, f10, f11, f12);
            }
            canvas.save();
            if (!this.h) {
                canvas.clipRect(f7, f10, f11, f12);
            }
            if (Build.VERSION.SDK_INT >= 31 && (fVar = this.d) != null) {
                fVar.c(canvas, this.e);
            } else {
                canvas.drawRenderNode(this.f10150b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }
}
