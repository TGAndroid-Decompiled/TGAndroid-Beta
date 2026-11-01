package ei;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import g.y;
import j$.util.Objects;
import jg.l0;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Cells.a5;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.aw0;
import org.telegram.ui.hx0;
import org.telegram.ui.jy0;
import org.telegram.ui.lu;
import org.telegram.ui.sa;
import org.telegram.ui.y6;
import org.telegram.ui.z5;
import rh.h8;
public final class a implements ug.a {
    public final int f6594a;
    public final Object f6595b;
    public final Object f6596c;

    public a(int i10, Object obj, Object obj2) {
        this.f6594a = i10;
        this.f6596c = obj;
        this.f6595b = obj2;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        float f7;
        Canvas canvas2;
        float f10;
        switch (this.f6594a) {
            case 0:
                jn0 jn0Var = (jn0) this.f6596c;
                yg.d.a(jn0Var, canvas, rectF, jn0Var, (FrameLayout) this.f6595b);
                return;
            case 1:
                uk0 uk0Var = (uk0) this.f6596c;
                yg.d.a(uk0Var, canvas, rectF, uk0Var, (FrameLayout) this.f6595b);
                return;
            case 2:
                ((y6) this.f6596c).f43574b0.d(canvas, rectF, (z5) this.f6595b);
                return;
            case 3:
                ((j30) this.f6596c).f27259n.K(canvas, rectF, (FrameLayout) this.f6595b);
                return;
            case 4:
                ((n90) this.f6596c).R.K(canvas, rectF, (l0) this.f6595b);
                return;
            case 5:
                lu luVar = (lu) this.f6596c;
                a5 a5Var = (a5) this.f6595b;
                int childCount = luVar.f39382a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = luVar.f39382a.getChildAt(i10);
                    if (childAt instanceof uk0) {
                        uk0 uk0Var2 = (uk0) childAt;
                        yg.d.a(uk0Var2, canvas, rectF, uk0Var2, a5Var);
                    }
                }
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f6596c;
                tg.j jVar = (tg.j) this.f6595b;
                Paint paint = profileActivity.M6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                hx0 hx0Var = profileActivity.N;
                if (hx0Var != null && hx0Var.getParent() == profileActivity.f33779a) {
                    f7 = profileActivity.Q5;
                } else {
                    f7 = 0.0f;
                }
                int i11 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i11 < 0) {
                    jy0 jy0Var = profileActivity.f33796c1;
                    RectF rectF2 = ProfileActivity.S6;
                    if (zg.h.c(jy0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        yg.d.a(new sa(profileActivity, 4), canvas, rectF, profileActivity.f33796c1, viewGroup);
                    }
                    aw0 aw0Var = profileActivity.f33779a;
                    Objects.requireNonNull(aw0Var);
                    yg.d.a(new sa(aw0Var, 5), canvas, rectF, profileActivity.f33779a, viewGroup);
                    jVar.d(canvas, rectF);
                }
                if (f7 > 0.0f) {
                    if (i11 < 0) {
                        f10 = profileActivity.N.getY() + profileActivity.f33779a.getY();
                    } else {
                        f10 = Float.MAX_VALUE;
                    }
                    paint.setColor(t6.w0(t6.f20873a7, profileActivity.f33957z0));
                    paint.setAlpha((int) (f7 * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, f10), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.N.K(canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f33913t0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f33871n0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.m0, canvas2, rectF, viewGroup);
                return;
            case 7:
                ((rh.i) this.f6596c).f47055f.d(canvas, rectF, (y1) this.f6595b);
                return;
            case 8:
                ((h8) this.f6596c).U.d(canvas, rectF, (y1) this.f6595b);
                return;
            default:
                ((wh.g) this.f6596c).U.d(canvas, rectF, (y1) this.f6595b);
                return;
        }
    }

    @Override
    public final void g(y yVar, RectF rectF) {
        switch (this.f6594a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                yVar.f7259b = true;
                return;
        }
    }
}
