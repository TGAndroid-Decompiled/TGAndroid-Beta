package og;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.z;
import java.util.Iterator;
import java.util.List;
import jg.g;
import jg.h;

public final class d implements a {

    public final a f19450a;

    public h f19452c;
    public jg.e d;

    public int f19453e;

    public a f19454f;
    public boolean h;

    public boolean f19455n;

    public RecordingCanvas f19456r;
    public Runnable v;

    public final yd.b f19457s = new yd.b(true);

    public final RenderNode f19451b = z.c();

    public d(a aVar) {
        this.f19450a = aVar;
    }

    @Override
    public final void T0(Canvas canvas, float f10, float f11, float f12, float f13) {
        jg.e eVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f19450a;
            if (aVar != null) {
                aVar.T0(canvas, f10, f11, f12, f13);
                return;
            }
            return;
        }
        if (this.f19455n) {
            throw new IllegalStateException();
        }
        a aVar2 = this.f19454f;
        if (aVar2 != null) {
            aVar2.T0(canvas, f10, f11, f12, f13);
        }
        canvas.save();
        if (!this.h) {
            canvas.clipRect(f10, f11, f12, f13);
        }
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.d) == null) {
            canvas.drawRenderNode(this.f19451b);
        } else {
            eVar.c(canvas, this.f19453e);
        }
        canvas.restore();
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (this.f19455n) {
            throw new IllegalStateException();
        }
        this.f19455n = true;
        this.f19451b.setPosition(0, 0, i10, i11);
        RecordingCanvas recordingCanvasBeginRecording = this.f19451b.beginRecording(i10, i11);
        this.f19456r = recordingCanvasBeginRecording;
        return recordingCanvasBeginRecording;
    }

    public final void b() {
        if (!this.f19455n) {
            throw new IllegalStateException();
        }
        this.f19451b.endRecording();
        this.f19455n = false;
        this.f19456r = null;
    }

    public final int c(List list, int i10, int i11) {
        RectF rectF;
        int i12 = 0;
        for (lg.e eVar : this.f19457s) {
            boolean zV = eVar.v();
            lg.c cVar = eVar.h;
            if (zV && eVar.f15600j > 0 && !cVar.f15590m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(cVar.f15590m);
                rectF.offset(eVar.f15593a, eVar.f15594b);
                float f10 = -i11;
                rectF.inset(f10, f10);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void d() {
        Iterator it = this.f19457s.iterator();
        while (it.hasNext()) {
            ((lg.e) it.next()).M = true;
        }
    }

    public final boolean e(int i10, int i11) {
        return (this.f19451b.hasDisplayList() && this.f19451b.getWidth() == i10 && this.f19451b.getHeight() == i11) ? false : true;
    }

    public final void f(float f10) {
        this.f19451b.setRenderEffect(f10 > 0.0f ? RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP) : null);
    }

    public final void g(float f10, RenderEffect renderEffect) {
        this.f19451b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void h(int i10, int i11) {
        this.f19451b.setPosition(0, 0, i10, i11);
    }

    public final void i(g gVar) {
        if (this.f19452c == null) {
            this.f19452c = new h(this.f19451b, gVar);
        }
    }

    public final void j() {
        this.f19452c.a();
    }

    @Override
    public final void r() {
        Runnable runnable = this.v;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final lg.d w() {
        lg.e eVar = new lg.e(this);
        this.f19457s.add(eVar);
        return eVar;
    }
}
