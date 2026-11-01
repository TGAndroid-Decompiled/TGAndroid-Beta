package kh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.gr;
import rf.o;
public final class d extends c {
    public final e6 d;
    public final gi0 e;
    public final fe.b f11387f;
    public float h;

    public d(View view, p6 p6Var) {
        super(p6Var);
        gi0 gi0Var = new gi0(view);
        this.e = gi0Var;
        gi0Var.d(null, true, false);
        gi0Var.v = 650.0f;
        gi0Var.e(false, 0.69f);
        gi0Var.f26453p.setStrokeWidth(i0.L(1.5f));
        this.f11387f = new fe.b(view, gr.h, 260L);
        e6 e6Var = new e6(true, false, false);
        this.d = e6Var;
        e6Var.x(i0.o());
        e6Var.w(i0.L(13.0f));
        e6Var.f25744b = 17;
        int w02 = t6.w0(t6.f21021i6, p6Var);
        if (this.f11385b != w02) {
            t6.H1(this.f11384a, w02, false);
            this.f11385b = w02;
        }
    }

    @Override
    public final void a(int i10) {
        this.f11384a.setAlpha(i10);
        this.d.B = i10;
    }

    public final float b() {
        return this.f11387f.e;
    }

    public final void c(int i10) {
        this.d.u(i10);
        this.e.f26452o = i10;
    }

    public final void d(float f7) {
        if (this.h != f7) {
            this.h = f7;
            Rect bounds = getBounds();
            int i10 = (int) this.h;
            this.d.setBounds(bounds.left, bounds.top + i10, bounds.right, bounds.bottom + i10);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7 = this.f11387f.e;
        if (f7 < 1.0f) {
            o.b(canvas, this.d, 1.0f - f7);
        }
        if (f7 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f7, f7, exactCenterX, exactCenterY);
            this.e.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        int i10 = (int) this.h;
        this.d.setBounds(bounds.left, bounds.top + i10, bounds.right, bounds.bottom + i10);
        int L = i0.L(11.0f);
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        this.e.f(centerX - L, centerY - L, centerX + L, centerY + L);
    }
}
