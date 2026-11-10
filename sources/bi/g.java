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
import org.telegram.ui.Components.v80;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bx0;
import org.telegram.ui.nt;
import org.telegram.ui.tu0;
import org.telegram.ui.yv0;
public final class g implements eh.a {
    public final int f3904a;
    public final Object f3905b;
    public final Object f3906c;

    public g(int i7, Object obj, Object obj2) {
        this.f3904a = i7;
        this.f3905b = obj;
        this.f3906c = obj2;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f3904a) {
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
                aVar.f8703a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        float f10;
        Canvas canvas2;
        float f11;
        switch (this.f3904a) {
            case 0:
                ((z) this.f3905b).f5120f.d(canvas, rectF, (f) this.f3906c);
                return;
            case 1:
                ((dd) this.f3905b).U.d(canvas, rectF, (f) this.f3906c);
                return;
            case 2:
                ((gi.f) this.f3905b).U.d(canvas, rectF, (f) this.f3906c);
                return;
            case 3:
                hm0 hm0Var = (hm0) this.f3905b;
                ih.d.a(hm0Var, canvas, rectF, hm0Var, (FrameLayout) this.f3906c);
                return;
            case 4:
                pj0 pj0Var = (pj0) this.f3905b;
                ih.d.a(pj0Var, canvas, rectF, pj0Var, (FrameLayout) this.f3906c);
                return;
            case 5:
                ((org.telegram.ui.y6) this.f3905b).f51912b0.d(canvas, rectF, (org.telegram.ui.z5) this.f3906c);
                return;
            case 6:
                ((r20) this.f3905b).f37478n.L(canvas, rectF, (FrameLayout) this.f3906c);
                return;
            case 7:
                ((v80) this.f3905b).R.L(canvas, rectF, (e5) this.f3906c);
                return;
            case 8:
                nt ntVar = (nt) this.f3905b;
                di.b4 b4Var = (di.b4) this.f3906c;
                int childCount = ntVar.f48288a.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = ntVar.f48288a.getChildAt(i7);
                    if (childAt instanceof pj0) {
                        pj0 pj0Var2 = (pj0) childAt;
                        ih.d.a(pj0Var2, canvas, rectF, pj0Var2, b4Var);
                    }
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f3905b;
                dh.k kVar = (dh.k) this.f3906c;
                Paint paint = profileActivity.P6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                yv0 yv0Var = profileActivity.N;
                if (yv0Var != null && yv0Var.getParent() == profileActivity.f41689a) {
                    f10 = profileActivity.S5;
                } else {
                    f10 = 0.0f;
                }
                int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i10 < 0) {
                    bx0 bx0Var = profileActivity.f41707c1;
                    RectF rectF2 = ProfileActivity.V6;
                    if (jh.k.c(bx0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        ih.d.a(new org.telegram.ui.oa(profileActivity, 4), canvas, rectF, profileActivity.f41707c1, viewGroup);
                    }
                    tu0 tu0Var = profileActivity.f41689a;
                    Objects.requireNonNull(tu0Var);
                    ih.d.a(new org.telegram.ui.oa(tu0Var, 5), canvas, rectF, profileActivity.f41689a, viewGroup);
                    kVar.d(canvas, rectF);
                }
                if (f10 > 0.0f) {
                    if (i10 < 0) {
                        f11 = profileActivity.N.getY() + profileActivity.f41689a.getY();
                    } else {
                        f11 = Float.MAX_VALUE;
                    }
                    paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, profileActivity.f41867z0));
                    paint.setAlpha((int) (f10 * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, f11), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.N.L(canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f41823t0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f41782n0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.m0, canvas2, rectF, viewGroup);
                return;
        }
    }
}
