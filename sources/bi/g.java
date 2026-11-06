package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.u80;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.kt;
import org.telegram.ui.qu0;
import org.telegram.ui.vv0;
import org.telegram.ui.ww0;
public final class g implements eh.a {
    public final int f3907a;
    public final Object f3908b;
    public final Object f3909c;

    public g(int i7, Object obj, Object obj2) {
        this.f3907a = i7;
        this.f3908b = obj;
        this.f3909c = obj2;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f3907a) {
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
                aVar.f8700a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        float f10;
        Canvas canvas2;
        float f11;
        switch (this.f3907a) {
            case 0:
                ((z) this.f3908b).f5117f.d(canvas, rectF, (f) this.f3909c);
                return;
            case 1:
                ((dd) this.f3908b).U.d(canvas, rectF, (f) this.f3909c);
                return;
            case 2:
                ((gi.f) this.f3908b).U.d(canvas, rectF, (f) this.f3909c);
                return;
            case 3:
                hm0 hm0Var = (hm0) this.f3908b;
                ih.d.a(hm0Var, canvas, rectF, hm0Var, (FrameLayout) this.f3909c);
                return;
            case 4:
                pj0 pj0Var = (pj0) this.f3908b;
                ih.d.a(pj0Var, canvas, rectF, pj0Var, (FrameLayout) this.f3909c);
                return;
            case 5:
                ((org.telegram.ui.y6) this.f3908b).f52107b0.d(canvas, rectF, (org.telegram.ui.z5) this.f3909c);
                return;
            case 6:
                ((r20) this.f3908b).f37472n.L(canvas, rectF, (FrameLayout) this.f3909c);
                return;
            case 7:
                ((u80) this.f3908b).R.L(canvas, rectF, (e5) this.f3909c);
                return;
            case 8:
                kt ktVar = (kt) this.f3908b;
                di.a4 a4Var = (di.a4) this.f3909c;
                int childCount = ktVar.f47302a.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = ktVar.f47302a.getChildAt(i7);
                    if (childAt instanceof pj0) {
                        pj0 pj0Var2 = (pj0) childAt;
                        ih.d.a(pj0Var2, canvas, rectF, pj0Var2, a4Var);
                    }
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f3908b;
                dh.k kVar = (dh.k) this.f3909c;
                Paint paint = profileActivity.M6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                vv0 vv0Var = profileActivity.N;
                if (vv0Var != null && vv0Var.getParent() == profileActivity.f41687a) {
                    f10 = profileActivity.Q5;
                } else {
                    f10 = 0.0f;
                }
                int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i10 < 0) {
                    ww0 ww0Var = profileActivity.f41705c1;
                    RectF rectF2 = ProfileActivity.S6;
                    if (jh.k.c(ww0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        ih.d.a(new org.telegram.ui.oa(profileActivity, 4), canvas, rectF, profileActivity.f41705c1, viewGroup);
                    }
                    qu0 qu0Var = profileActivity.f41687a;
                    Objects.requireNonNull(qu0Var);
                    ih.d.a(new org.telegram.ui.oa(qu0Var, 5), canvas, rectF, profileActivity.f41687a, viewGroup);
                    kVar.d(canvas, rectF);
                }
                if (f10 > 0.0f) {
                    if (i10 < 0) {
                        f11 = profileActivity.N.getY() + profileActivity.f41687a.getY();
                    } else {
                        f11 = Float.MAX_VALUE;
                    }
                    paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27793a7, profileActivity.f41865z0));
                    paint.setAlpha((int) (f10 * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, f11), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.N.L(canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f41821t0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f41780n0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.m0, canvas2, rectF, viewGroup);
                return;
        }
    }
}
