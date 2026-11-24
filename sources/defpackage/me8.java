package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
public final class me8 extends xd8 {
    public final gn d;
    public final ty8 e;
    public final fm0 f;
    public float h;

    public me8(View view, wjb wjbVar) {
        super(wjbVar);
        ty8 ty8Var = new ty8(view);
        this.e = ty8Var;
        ty8Var.d(null, true, false);
        ty8Var.t = 650.0f;
        ty8Var.e(false, 0.69f);
        ty8Var.p.setStrokeWidth(gl.L(1.5f));
        this.f = new fm0(260L, view, s33.h);
        gn gnVar = new gn(true, false, false);
        this.d = gnVar;
        gnVar.x(gl.o());
        gnVar.w(gl.L(13.0f));
        gnVar.b = 17;
        int v0 = bkb.v0(bkb.h6, wjbVar);
        if (this.b != v0) {
            bkb.F1(this.a, v0, false);
            this.b = v0;
        }
    }

    @Override
    public final void a(int i) {
        this.a.setAlpha(i);
        this.d.C = i;
    }

    public final float b() {
        return this.f.e;
    }

    public final void c(int i) {
        this.d.u(i);
        this.e.o = i;
    }

    public final void d(float f) {
        if (this.h != f) {
            this.h = f;
            Rect bounds = getBounds();
            int i = (int) this.h;
            this.d.setBounds(bounds.left, bounds.top + i, bounds.right, bounds.bottom + i);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f = this.f.e;
        if (f < 1.0f) {
            kq3.b(canvas, this.d, 1.0f - f);
        }
        if (f > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f, f, exactCenterX, exactCenterY);
            this.e.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        int i = (int) this.h;
        this.d.setBounds(bounds.left, bounds.top + i, bounds.right, bounds.bottom + i);
        int L = gl.L(11.0f);
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        this.e.f(centerX - L, centerY - L, centerX + L, centerY + L);
    }
}
