package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
public final class ai8 extends lh8 {
    public final hn d;
    public final g29 e;
    public final fm0 f;
    public float h;

    public ai8(View view, vnb vnbVar) {
        super(vnbVar);
        g29 g29Var = new g29(view);
        this.e = g29Var;
        g29Var.d(null, true, false);
        g29Var.t = 650.0f;
        g29Var.e(false, 0.69f);
        g29Var.p.setStrokeWidth(hl.L(1.5f));
        this.f = new fm0(260L, view, k43.h);
        hn hnVar = new hn(true, false, false);
        this.d = hnVar;
        hnVar.x(hl.o());
        hnVar.w(hl.L(13.0f));
        hnVar.b = 17;
        int v0 = aob.v0(aob.i6, vnbVar);
        if (this.b != v0) {
            aob.F1(this.a, v0, false);
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
            br3.b(canvas, this.d, 1.0f - f);
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
        int L = hl.L(11.0f);
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        this.e.f(centerX - L, centerY - L, centerX + L, centerY + L);
    }
}
