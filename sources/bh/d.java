package bh;

import android.graphics.Canvas;
import android.graphics.Rect;
import gf.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.si0;

public final class d extends c {
    public final i6 d;

    public final si0 f2185e;

    public final ud.a f2186f;
    public float h;

    public d(s1 s1Var, c6 c6Var) {
        super(c6Var);
        si0 si0Var = new si0(s1Var);
        this.f2185e = si0Var;
        si0Var.d(null, true, false);
        si0Var.v = 650.0f;
        si0Var.e(0.69f, false);
        si0Var.f32466p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f2186f = new ud.a(s1Var, er.h, 260L);
        i6 i6Var = new i6(true, false, false, false);
        this.d = i6Var;
        i6Var.u(AndroidUtilities.bold());
        i6Var.t(AndroidUtilities.dp(13.0f));
        i6Var.f29239b = 17;
        int iV0 = g6.v0(g6.f23144i6, c6Var);
        if (this.f2183b != iV0) {
            g6.B1(this.f2182a, iV0, false);
            this.f2183b = iV0;
        }
    }

    @Override
    public final void a(int i10) {
        this.f2182a.setAlpha(i10);
        this.d.f29257w = i10;
    }

    public final float b() {
        return this.f2186f.f48497e;
    }

    public final void c(int i10) {
        this.d.r(i10);
        this.f2185e.f32465o = i10;
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
        float f10 = this.f2186f.f48497e;
        if (f10 < 1.0f) {
            s.b(canvas, this.d, 1.0f - f10);
        }
        if (f10 > 0.0f) {
            float fExactCenterX = getBounds().exactCenterX();
            float fExactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f10, f10, fExactCenterX, fExactCenterY);
            this.f2185e.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        int i10 = (int) this.h;
        this.d.setBounds(bounds.left, bounds.top + i10, bounds.right, bounds.bottom + i10);
        int iDp = AndroidUtilities.dp(11.0f);
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        this.f2185e.f(iCenterX - iDp, iCenterY - iDp, iCenterX + iDp, iCenterY + iDp);
    }
}
