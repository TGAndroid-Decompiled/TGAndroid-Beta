package kh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;
import rf.o;
public final class d extends c {
    public final e6 d;
    public final fi0 e;
    public final fe.b f11386f;
    public float h;

    public d(View view, p6 p6Var) {
        super(p6Var);
        fi0 fi0Var = new fi0(view);
        this.e = fi0Var;
        fi0Var.d(null, true, false);
        fi0Var.v = 650.0f;
        fi0Var.e(false, 0.69f);
        fi0Var.f26082p.setStrokeWidth(i0.L(1.5f));
        this.f11386f = new fe.b(view, gr.h, 260L);
        e6 e6Var = new e6(true, false, false);
        this.d = e6Var;
        e6Var.x(i0.o());
        e6Var.w(i0.L(13.0f));
        e6Var.f25695b = 17;
        int w02 = t6.w0(t6.f21020i6, p6Var);
        if (this.f11384b != w02) {
            t6.H1(this.f11383a, w02, false);
            this.f11384b = w02;
        }
    }

    @Override
    public final void a(int i10) {
        this.f11383a.setAlpha(i10);
        this.d.B = i10;
    }

    public final float b() {
        return this.f11386f.e;
    }

    public final void c(int i10) {
        this.d.u(i10);
        this.e.f26081o = i10;
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
        float f7 = this.f11386f.e;
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
