package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.nt;
import org.telegram.ui.ou0;
import org.telegram.ui.uv0;
import org.telegram.ui.vw0;
public final class f implements eh.a {
    public final int f8524a;
    public final Object f8525b;
    public final Object f8526c;

    public f(int i7, Object obj, Object obj2) {
        this.f8524a = i7;
        this.f8525b = obj;
        this.f8526c = obj2;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f8524a) {
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
                aVar.f8090a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        float f10;
        Canvas canvas2;
        float f11;
        switch (this.f8524a) {
            case 0:
                ((t) this.f8525b).f9420f.d(canvas, rectF, (e) this.f8526c);
                return;
            case 1:
                ((lb) this.f8525b).V.d(canvas, rectF, (e) this.f8526c);
                return;
            case 2:
                ((ii.f) this.f8525b).V.d(canvas, rectF, (e) this.f8526c);
                return;
            case 3:
                ((org.telegram.ui.y6) this.f8525b).f53443c0.d(canvas, rectF, (org.telegram.ui.a6) this.f8526c);
                return;
            case 4:
                ((u20) this.f8525b).f39878n.L(canvas, rectF, (FrameLayout) this.f8526c);
                return;
            case 5:
                ((y80) this.f8525b).S.L(canvas, rectF, (bi.g2) this.f8526c);
                return;
            case 6:
                nt ntVar = (nt) this.f8525b;
                bi.v1 v1Var = (bi.v1) this.f8526c;
                int childCount = ntVar.f49678a.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = ntVar.f49678a.getChildAt(i7);
                    if (childAt instanceof uj0) {
                        uj0 uj0Var = (uj0) childAt;
                        ih.d.a(uj0Var, canvas, rectF, uj0Var, v1Var);
                    }
                }
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.f8525b;
                dh.k kVar = (dh.k) this.f8526c;
                Paint paint = profileActivity.R6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                uv0 uv0Var = profileActivity.O;
                if (uv0Var != null && uv0Var.getParent() == profileActivity.f43062a) {
                    f10 = profileActivity.U5;
                } else {
                    f10 = 0.0f;
                }
                int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i10 < 0) {
                    vw0 vw0Var = profileActivity.f43087d1;
                    RectF rectF2 = ProfileActivity.X6;
                    if (jh.k.c(vw0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        ih.d.a(new org.telegram.ui.oa(profileActivity, 4), canvas, rectF, profileActivity.f43087d1, viewGroup);
                    }
                    ou0 ou0Var = profileActivity.f43062a;
                    Objects.requireNonNull(ou0Var);
                    ih.d.a(new org.telegram.ui.oa(ou0Var, 5), canvas, rectF, profileActivity.f43062a, viewGroup);
                    kVar.d(canvas, rectF);
                }
                if (f10 > 0.0f) {
                    if (i10 < 0) {
                        f11 = profileActivity.O.getY() + profileActivity.f43062a.getY();
                    } else {
                        f11 = Float.MAX_VALUE;
                    }
                    paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, profileActivity.A0));
                    paint.setAlpha((int) (f10 * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, f11), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.O.L(canvas2, rectF, viewGroup);
                ProfileActivity.M3(profileActivity.f43202u0, canvas2, rectF, viewGroup);
                ProfileActivity.M3(profileActivity.f43161o0, canvas2, rectF, viewGroup);
                ProfileActivity.M3(profileActivity.f43155n0, canvas2, rectF, viewGroup);
                return;
            case 8:
                lm0 lm0Var = (lm0) this.f8525b;
                ih.d.a(lm0Var, canvas, rectF, lm0Var, (FrameLayout) this.f8526c);
                return;
            default:
                uj0 uj0Var2 = (uj0) this.f8525b;
                ih.d.a(uj0Var2, canvas, rectF, uj0Var2, (FrameLayout) this.f8526c);
                return;
        }
    }
}
