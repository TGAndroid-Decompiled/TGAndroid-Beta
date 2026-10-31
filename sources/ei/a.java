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
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bw0;
import org.telegram.ui.ix0;
import org.telegram.ui.ky0;
import org.telegram.ui.mu;
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
                in0 in0Var = (in0) this.f6596c;
                yg.d.a(in0Var, canvas, rectF, in0Var, (FrameLayout) this.f6595b);
                return;
            case 1:
                tk0 tk0Var = (tk0) this.f6596c;
                yg.d.a(tk0Var, canvas, rectF, tk0Var, (FrameLayout) this.f6595b);
                return;
            case 2:
                ((y6) this.f6596c).f43718b0.d(canvas, rectF, (z5) this.f6595b);
                return;
            case 3:
                ((j30) this.f6596c).f27213n.K(canvas, rectF, (FrameLayout) this.f6595b);
                return;
            case 4:
                ((n90) this.f6596c).R.K(canvas, rectF, (l0) this.f6595b);
                return;
            case 5:
                mu muVar = (mu) this.f6596c;
                a5 a5Var = (a5) this.f6595b;
                int childCount = muVar.f39772a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = muVar.f39772a.getChildAt(i10);
                    if (childAt instanceof tk0) {
                        tk0 tk0Var2 = (tk0) childAt;
                        yg.d.a(tk0Var2, canvas, rectF, tk0Var2, a5Var);
                    }
                }
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f6596c;
                tg.j jVar = (tg.j) this.f6595b;
                Paint paint = profileActivity.L6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                ix0 ix0Var = profileActivity.N;
                if (ix0Var != null && ix0Var.getParent() == profileActivity.f33772a) {
                    f7 = profileActivity.P5;
                } else {
                    f7 = 0.0f;
                }
                int i11 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i11 < 0) {
                    ky0 ky0Var = profileActivity.f33789c1;
                    RectF rectF2 = ProfileActivity.R6;
                    if (zg.h.c(ky0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        yg.d.a(new sa(profileActivity, 4), canvas, rectF, profileActivity.f33789c1, viewGroup);
                    }
                    bw0 bw0Var = profileActivity.f33772a;
                    Objects.requireNonNull(bw0Var);
                    yg.d.a(new sa(bw0Var, 5), canvas, rectF, profileActivity.f33772a, viewGroup);
                    jVar.d(canvas, rectF);
                }
                if (f7 > 0.0f) {
                    if (i11 < 0) {
                        f10 = profileActivity.N.getY() + profileActivity.f33772a.getY();
                    } else {
                        f10 = Float.MAX_VALUE;
                    }
                    paint.setColor(t6.w0(t6.f20872a7, profileActivity.f33950z0));
                    paint.setAlpha((int) (f7 * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, f10), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.N.K(canvas2, rectF, viewGroup);
                ProfileActivity.M3(profileActivity.f33906t0, canvas2, rectF, viewGroup);
                ProfileActivity.M3(profileActivity.f33864n0, canvas2, rectF, viewGroup);
                ProfileActivity.M3(profileActivity.m0, canvas2, rectF, viewGroup);
                return;
            case 7:
                ((rh.i) this.f6596c).f47041f.d(canvas, rectF, (y1) this.f6595b);
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
                yVar.f7258b = true;
                return;
        }
    }
}
