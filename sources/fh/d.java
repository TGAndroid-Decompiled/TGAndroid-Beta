package fh;

import ah.f;
import ah.i;
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
    public final a f9059a;
    public k f9061c;
    public i d;
    public int e;
    public a f9062f;
    public li.d h;
    public int f9063n;
    public boolean f9064r;
    public boolean f9065s;
    public RecordingCanvas v;
    public Runnable f9067x;
    public final pe.b f9066w = new pe.b();
    public final RenderNode f9060b = f.c();

    public d(a aVar) {
        this.f9059a = aVar;
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f9065s) {
            this.f9065s = true;
            this.f9060b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f9060b.beginRecording(i10, i11);
            this.v = beginRecording;
            return beginRecording;
        }
        throw new IllegalStateException();
    }

    @Override
    public final void b() {
        Runnable runnable = this.f9067x;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c() {
        if (this.f9065s) {
            this.f9060b.endRecording();
            this.f9065s = false;
            this.v = null;
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public final ch.d d() {
        ch.e eVar = new ch.e(this);
        this.f9066w.add(eVar);
        return eVar;
    }

    public final int e(int i10, int i11, List list) {
        RectF rectF;
        Iterator it = this.f9066w.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            ch.e eVar = (ch.e) it.next();
            boolean d = eVar.d();
            ch.c cVar = eVar.f4282j;
            if (d && eVar.f4284l > 0 && !cVar.f4273m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(cVar.f4273m);
                rectF.offset(eVar.f4276a, eVar.f4277b);
                float f7 = -i11;
                rectF.inset(f7, f7);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void f() {
        Iterator it = this.f9066w.iterator();
        while (it.hasNext()) {
            ((ch.e) it.next()).O = true;
        }
    }

    public final boolean g(int i10, int i11) {
        if (this.f9060b.hasDisplayList() && this.f9060b.getWidth() == i10 && this.f9060b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void h(float f7) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f9060b;
        if (f7 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void i(float f7, RenderEffect renderEffect) {
        this.f9060b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void j(int i10, int i11) {
        this.f9060b.setPosition(0, 0, i10, i11);
    }

    @Override
    public final void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        i iVar;
        li.d dVar;
        RenderNode renderNode;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f9059a;
            if (aVar != null) {
                aVar.y(canvas, f7, f10, f11, f12);
            }
        } else if (!this.f9065s) {
            a aVar2 = this.f9062f;
            if (aVar2 != null) {
                aVar2.y(canvas, f7, f10, f11, f12);
            }
            canvas.save();
            if (!this.f9064r) {
                canvas.clipRect(f7, f10, f11, f12);
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31 && (dVar = this.h) != null) {
                int i11 = this.f9063n;
                for (int i12 = 0; i12 < dVar.f14369b; i12++) {
                    li.c cVar = (li.c) dVar.f14368a.get(i12);
                    if (cVar.f14362a.intersects(f7, f10, f11, f12)) {
                        canvas.save();
                        canvas.clipRect(cVar.f14362a);
                        RectF rectF = cVar.f14364c;
                        canvas.translate(rectF.left, rectF.top);
                        float f13 = cVar.h;
                        canvas.scale(f13, f13);
                        if (i11 == 1) {
                            renderNode = cVar.e;
                        } else {
                            renderNode = cVar.d;
                        }
                        canvas.drawRenderNode(renderNode);
                        canvas.restore();
                    }
                }
            } else if (i10 >= 31 && (iVar = this.d) != null) {
                iVar.c(canvas, this.e);
            } else {
                canvas.drawRenderNode(this.f9060b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }
}
