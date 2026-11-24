package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
public final class og8 extends zf8 {
    public final ho d;
    public final u09 e;
    public final fn0 f;
    public float h;

    public og8(View view, ylb ylbVar) {
        super(ylbVar);
        u09 u09Var = new u09(view);
        this.e = u09Var;
        u09Var.d(null, true, false);
        u09Var.t = 650.0f;
        u09Var.e(false, 0.69f);
        u09Var.p.setStrokeWidth(gm.L(1.5f));
        this.f = new fn0(260L, view, d53.h);
        ho hoVar = new ho(true, false, false);
        this.d = hoVar;
        hoVar.x(gm.o());
        hoVar.w(gm.L(13.0f));
        hoVar.b = 17;
        int v0 = cmb.v0(cmb.h6, ylbVar);
        if (this.b != v0) {
            cmb.F1(this.a, v0, false);
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
            ur3.b(canvas, this.d, 1.0f - f);
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
        int L = gm.L(11.0f);
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        this.e.f(centerX - L, centerY - L, centerX + L, centerY + L);
    }
}
