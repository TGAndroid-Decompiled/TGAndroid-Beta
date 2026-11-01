package hi;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.w;
import tg.h;
public final class f implements a, tg.a, fi.a {
    public final a f7717a;
    public h f7719c;
    public tg.f d;
    public int e;
    public a f7720f;
    public ei.d h;
    public boolean f7721n;
    public boolean f7722r;
    public RecordingCanvas f7723s;
    public final je.b f7724w = new je.b();
    public final RenderNode f7718b = w.n();

    public f(a aVar) {
        this.f7717a = aVar;
    }

    @Override
    public final int a() {
        ei.d dVar = this.h;
        if (dVar == null) {
            dVar = null;
        }
        if (dVar != null) {
            return dVar.a();
        }
        return 0;
    }

    @Override
    public final vg.f b() {
        vg.f fVar = new vg.f(this, this, this);
        c(fVar);
        return fVar;
    }

    @Override
    public final void c(vg.f fVar) {
        this.f7724w.add(fVar);
    }

    @Override
    public final void d(float f7, float f10, int i10, Canvas canvas, RectF rectF) {
        Canvas canvas2;
        tg.f fVar;
        ei.d dVar = this.h;
        if (dVar == null) {
            dVar = null;
        }
        ei.d dVar2 = dVar;
        if (this.f7720f == null && dVar2 != null) {
            canvas2 = canvas;
        } else {
            canvas.save();
            float f11 = 1.0f / i10;
            canvas.scale(f11, f11);
            canvas.translate(-f7, -f10);
            a aVar = this.f7720f;
            if (aVar != null) {
                float f12 = i10 * 2;
                canvas2 = canvas;
                aVar.e(canvas2, rectF.left - f12, rectF.top - f12, rectF.right + f12, rectF.bottom + f12);
            } else {
                canvas2 = canvas;
            }
            if (dVar2 == null && Build.VERSION.SDK_INT >= 31 && (fVar = this.d) != null) {
                fVar.c(canvas2, this.e);
            }
            canvas2.restore();
        }
        if (dVar2 != null) {
            dVar2.d(f7, f10, i10, canvas2, rectF);
        }
    }

    @Override
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        tg.f fVar;
        ei.d dVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f7717a;
            if (aVar != null) {
                aVar.e(canvas, f7, f10, f11, f12);
            }
        } else if (!this.f7722r) {
            a aVar2 = this.f7720f;
            if (aVar2 != null) {
                aVar2.e(canvas, f7, f10, f11, f12);
            }
            canvas.save();
            if (!this.f7721n) {
                canvas.clipRect(f7, f10, f11, f12);
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31 && (dVar = this.h) != null) {
                dVar.e(canvas, f7, f10, f11, f12);
            } else if (i10 >= 31 && (fVar = this.d) != null) {
                fVar.c(canvas, this.e);
            } else {
                canvas.drawRenderNode(this.f7718b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public final int f() {
        tg.f fVar;
        tg.d dVar;
        ei.d dVar2 = this.h;
        if (dVar2 == null) {
            dVar2 = null;
        }
        if (dVar2 != null) {
            return dVar2.f();
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.d) != null) {
            int i10 = this.e;
            if (fVar.f48736a && fVar.f48743k != 0) {
                tg.e eVar = (tg.e) fVar.f48742j.get(0);
                if ((i10 == -2 || i10 == -4) && (dVar = eVar.f48735c) != null) {
                    return dVar.e;
                }
                return eVar.f48734b.e;
            }
            return 1;
        }
        return 1;
    }

    @Override
    public final int g() {
        ei.d dVar = this.h;
        if (dVar == null) {
            dVar = null;
        }
        if (dVar != null) {
            return dVar.g();
        }
        return 0;
    }

    @Override
    public final boolean h() {
        if (f() > 1) {
            return true;
        }
        return false;
    }

    public final RecordingCanvas i(int i10, int i11) {
        if (!this.f7722r) {
            this.f7722r = true;
            this.f7718b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f7718b.beginRecording(i10, i11);
            this.f7723s = beginRecording;
            return beginRecording;
        }
        throw new IllegalStateException();
    }

    public final void j() {
        if (this.f7722r) {
            this.f7718b.endRecording();
            this.f7722r = false;
            this.f7723s = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean k(int i10, int i11) {
        if (this.f7718b.hasDisplayList() && this.f7718b.getWidth() == i10 && this.f7718b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void l(float f7) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f7718b;
        if (f7 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void m(float f7, RenderEffect renderEffect) {
        this.f7718b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void n(int i10, int i11) {
        this.f7718b.setPosition(0, 0, i10, i11);
    }
}
