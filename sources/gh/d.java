package gh;

import android.graphics.Canvas;
import android.graphics.Rect;
import lf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.pr;
public final class d extends c {
    public final j6 d;
    public final mj0 f7143e;
    public final xd.a f7144f;
    public float h;

    public d(t1 t1Var, g6 g6Var) {
        super(g6Var);
        mj0 mj0Var = new mj0(t1Var);
        this.f7143e = mj0Var;
        mj0Var.d(null, true, false);
        mj0Var.v = 650.0f;
        mj0Var.e(0.69f, false);
        mj0Var.f29136p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f7144f = new xd.a(t1Var, pr.h, 260L);
        j6 j6Var = new j6(true, false, false, false);
        this.d = j6Var;
        j6Var.u(AndroidUtilities.bold());
        j6Var.t(AndroidUtilities.dp(13.0f));
        j6Var.f28029b = 17;
        int v02 = k6.v0(k6.f21750i6, g6Var);
        if (this.f7141b != v02) {
            k6.B1(this.f7140a, v02, false);
            this.f7141b = v02;
        }
    }

    @Override
    public final void a(int i10) {
        this.f7140a.setAlpha(i10);
        this.d.f28047w = i10;
    }

    public final float b() {
        return this.f7144f.f50504e;
    }

    public final void c(int i10) {
        this.d.r(i10);
        this.f7143e.f29135o = i10;
    }

    public final void d(float f10) {
        if (this.h != f10) {
            this.h = f10;
            Rect bounds = getBounds();
            int i10 = (int) this.h;
            this.d.setBounds(bounds.left, bounds.top + i10, bounds.right, bounds.bottom + i10);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10 = this.f7144f.f50504e;
        if (f10 < 1.0f) {
            r.b(canvas, this.d, 1.0f - f10);
        }
        if (f10 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f10, f10, exactCenterX, exactCenterY);
            this.f7143e.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        int i10 = (int) this.h;
        this.d.setBounds(bounds.left, bounds.top + i10, bounds.right, bounds.bottom + i10);
        int dp = AndroidUtilities.dp(11.0f);
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        this.f7143e.f(centerX - dp, centerY - dp, centerX + dp, centerY + dp);
    }
}
