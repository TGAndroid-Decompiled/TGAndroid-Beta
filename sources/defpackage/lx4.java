package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
public final class lx4 implements gx4, jl0, rw4 {
    public final gx4 a;
    public t69 c;
    public cq3 d;
    public int e;
    public gx4 f;
    public dw4 h;
    public boolean n;
    public boolean r;
    public RecordingCanvas s;
    public final e59 w = new e59(0, false);
    public final RenderNode b = mk1.k();

    public lx4(gx4 gx4Var) {
        this.a = gx4Var;
    }

    @Override
    public final int a() {
        dw4 dw4Var = this.h;
        if (dw4Var == null) {
            dw4Var = null;
        }
        if (dw4Var != null) {
            return dw4Var.a();
        }
        return 0;
    }

    @Override
    public final il0 b() {
        il0 il0Var = new il0(this, this, this);
        c(il0Var);
        return il0Var;
    }

    @Override
    public final void c(il0 il0Var) {
        this.w.add(il0Var);
    }

    @Override
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        cq3 cq3Var;
        dw4 dw4Var = this.h;
        if (dw4Var == null) {
            dw4Var = null;
        }
        if (this.f != null || dw4Var == null) {
            canvas.save();
            float f3 = 1.0f / i;
            canvas.scale(f3, f3);
            canvas.translate(-f, -f2);
            gx4 gx4Var = this.f;
            if (gx4Var != null) {
                float f4 = i << 1;
                gx4Var.e(rectF.left - f4, rectF.top - f4, rectF.right + f4, rectF.bottom + f4, canvas);
            }
            if (dw4Var == null && Build.VERSION.SDK_INT >= 31 && (cq3Var = this.d) != null) {
                cq3Var.c(canvas, this.e);
            }
            canvas.restore();
        }
        if (dw4Var != null) {
            dw4Var.d(f, f2, i, canvas, rectF);
        }
    }

    @Override
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        if (!canvas.isHardwareAccelerated()) {
            gx4 gx4Var = this.a;
            if (gx4Var != null) {
                gx4Var.e(f, f2, f3, f4, canvas);
            }
        } else if (!this.r) {
            gx4 gx4Var2 = this.f;
            if (gx4Var2 != null) {
                gx4Var2.e(f, f2, f3, f4, canvas);
            }
            canvas.save();
            if (!this.n) {
                canvas.clipRect(f, f2, f3, f4);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                dw4 dw4Var = this.h;
                if (dw4Var != null) {
                    dw4Var.e(f, f2, f3, f4, canvas);
                } else {
                    cq3 cq3Var = this.d;
                    if (cq3Var != null) {
                        cq3Var.c(canvas, this.e);
                    }
                }
                canvas.restore();
            }
            canvas.drawRenderNode(this.b);
            canvas.restore();
        } else {
            sdb.a();
        }
    }

    @Override
    public final int f() {
        cq3 cq3Var;
        aq3 aq3Var;
        dw4 dw4Var = this.h;
        if (dw4Var == null) {
            dw4Var = null;
        }
        if (dw4Var != null) {
            return dw4Var.f();
        }
        if (Build.VERSION.SDK_INT >= 31 && (cq3Var = this.d) != null) {
            int i = this.e;
            if (cq3Var.a && cq3Var.k != 0) {
                bq3 bq3Var = (bq3) cq3Var.j.get(0);
                if ((i == -2 || i == -4) && (aq3Var = bq3Var.c) != null) {
                    return aq3Var.e;
                }
                return bq3Var.b.e;
            }
            return 1;
        }
        return 1;
    }

    @Override
    public final int g() {
        dw4 dw4Var = this.h;
        if (dw4Var == null) {
            dw4Var = null;
        }
        if (dw4Var != null) {
            return dw4Var.g();
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

    public final RecordingCanvas i(int i, int i2) {
        if (!this.r) {
            this.r = true;
            this.b.setPosition(0, 0, i, i2);
            RecordingCanvas beginRecording = this.b.beginRecording(i, i2);
            this.s = beginRecording;
            return beginRecording;
        }
        sdb.a();
        return null;
    }

    public final void j() {
        if (this.r) {
            this.b.endRecording();
            this.r = false;
            this.s = null;
            return;
        }
        sdb.a();
    }

    public final boolean k(int i, int i2) {
        if (this.b.hasDisplayList() && this.b.getWidth() == i && this.b.getHeight() == i2) {
            return false;
        }
        return true;
    }

    public final void l(float f) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.b;
        if (f > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void m(float f, RenderEffect renderEffect) {
        this.b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void n(int i, int i2) {
        this.b.setPosition(0, 0, i, i2);
    }
}
