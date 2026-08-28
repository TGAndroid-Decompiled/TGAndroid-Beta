package ng;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.z;
import ig.g;
import ig.h;
import java.util.Iterator;
import java.util.List;
public final class d implements a {
    public final a f18601a;
    public h f18603c;
    public ig.e d;
    public int f18604e;
    public a f18605f;
    public boolean h;
    public boolean f18606n;
    public RecordingCanvas f18607r;
    public Runnable v;
    public final xd.b f18608s = new xd.b(true);
    public final RenderNode f18602b = z.c();

    public d(a aVar) {
        this.f18601a = aVar;
    }

    @Override
    public final void T0(Canvas canvas, float f10, float f11, float f12, float f13) {
        ig.e eVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f18601a;
            if (aVar != null) {
                aVar.T0(canvas, f10, f11, f12, f13);
            }
        } else if (!this.f18606n) {
            a aVar2 = this.f18605f;
            if (aVar2 != null) {
                aVar2.T0(canvas, f10, f11, f12, f13);
            }
            canvas.save();
            if (!this.h) {
                canvas.clipRect(f10, f11, f12, f13);
            }
            if (Build.VERSION.SDK_INT >= 31 && (eVar = this.d) != null) {
                eVar.c(canvas, this.f18604e);
            } else {
                canvas.drawRenderNode(this.f18602b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }

    public final RecordingCanvas a(int i9, int i10) {
        if (!this.f18606n) {
            this.f18606n = true;
            this.f18602b.setPosition(0, 0, i9, i10);
            RecordingCanvas beginRecording = this.f18602b.beginRecording(i9, i10);
            this.f18607r = beginRecording;
            return beginRecording;
        }
        throw new IllegalStateException();
    }

    public final void b() {
        if (this.f18606n) {
            this.f18602b.endRecording();
            this.f18606n = false;
            this.f18607r = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final int c(List list, int i9, int i10) {
        RectF rectF;
        Iterator it = this.f18608s.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            kg.e eVar = (kg.e) it.next();
            boolean v = eVar.v();
            kg.c cVar = eVar.h;
            if (v && eVar.f14822j > 0 && !cVar.f14812m.isEmpty()) {
                if (i9 < list.size()) {
                    rectF = (RectF) list.get(i9);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(cVar.f14812m);
                rectF.offset(eVar.f14815a, eVar.f14816b);
                float f10 = -i10;
                rectF.inset(f10, f10);
                i9++;
                i11++;
            }
        }
        return i11;
    }

    public final void d() {
        Iterator it = this.f18608s.iterator();
        while (it.hasNext()) {
            ((kg.e) it.next()).M = true;
        }
    }

    public final boolean e(int i9, int i10) {
        if (this.f18602b.hasDisplayList() && this.f18602b.getWidth() == i9 && this.f18602b.getHeight() == i10) {
            return false;
        }
        return true;
    }

    public final void f(float f10) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f18602b;
        if (f10 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void g(float f10, RenderEffect renderEffect) {
        this.f18602b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void h(int i9, int i10) {
        this.f18602b.setPosition(0, 0, i9, i10);
    }

    public final void i(g gVar) {
        if (this.f18603c == null) {
            this.f18603c = new h(this.f18602b, gVar);
        }
    }

    public final void j() {
        this.f18603c.a();
    }

    @Override
    public final void t() {
        Runnable runnable = this.v;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final kg.d y() {
        kg.e eVar = new kg.e(this);
        this.f18608s.add(eVar);
        return eVar;
    }
}
