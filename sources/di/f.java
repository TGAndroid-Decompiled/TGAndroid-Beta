package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pt;
import org.telegram.ui.qu0;
import org.telegram.ui.vv0;
import org.telegram.ui.zw0;
public final class f implements eh.a {
    public final int f8766a;
    public final Object f8767b;
    public final Object f8768c;

    public f(int i7, Object obj, Object obj2) {
        this.f8766a = i7;
        this.f8767b = obj;
        this.f8768c = obj2;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f8766a) {
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
                aVar.f8398a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        float f10;
        Canvas canvas2;
        float f11;
        switch (this.f8766a) {
            case 0:
                ((t) this.f8767b).f9775f.d(canvas, rectF, (e) this.f8768c);
                return;
            case 1:
                ((pb) this.f8767b).V.d(canvas, rectF, (e) this.f8768c);
                return;
            case 2:
                ((ii.t) this.f8767b).V.d(canvas, rectF, (e) this.f8768c);
                return;
            case 3:
                ((org.telegram.ui.x6) this.f8767b).f53649c0.d(canvas, rectF, (org.telegram.ui.z5) this.f8768c);
                return;
            case 4:
                ((f30) this.f8767b).f35073n.L(canvas, rectF, (FrameLayout) this.f8768c);
                return;
            case 5:
                ((k90) this.f8767b).S.L(canvas, rectF, (bi.e3) this.f8768c);
                return;
            case 6:
                pt ptVar = (pt) this.f8767b;
                bi.t2 t2Var = (bi.t2) this.f8768c;
                int childCount = ptVar.f50975a.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = ptVar.f50975a.getChildAt(i7);
                    if (childAt instanceof ek0) {
                        ek0 ek0Var = (ek0) childAt;
                        ih.d.a(ek0Var, canvas, rectF, ek0Var, t2Var);
                    }
                }
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.f8767b;
                dh.k kVar = (dh.k) this.f8768c;
                Paint paint = profileActivity.T6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                vv0 vv0Var = profileActivity.O;
                if (vv0Var != null && vv0Var.getParent() == profileActivity.f43549a) {
                    f10 = profileActivity.W5;
                } else {
                    f10 = 0.0f;
                }
                int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i10 < 0) {
                    zw0 zw0Var = profileActivity.f43574d1;
                    RectF rectF2 = ProfileActivity.Z6;
                    if (jh.k.c(zw0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        ih.d.a(new org.telegram.ui.oa(profileActivity, 4), canvas, rectF, profileActivity.f43574d1, viewGroup);
                    }
                    qu0 qu0Var = profileActivity.f43549a;
                    Objects.requireNonNull(qu0Var);
                    ih.d.a(new org.telegram.ui.oa(qu0Var, 5), canvas, rectF, profileActivity.f43549a, viewGroup);
                    kVar.d(canvas, rectF);
                }
                if (f10 > 0.0f) {
                    if (i10 < 0) {
                        f11 = profileActivity.O.getY() + profileActivity.f43549a.getY();
                    } else {
                        f11 = Float.MAX_VALUE;
                    }
                    paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29321a7, profileActivity.A0));
                    paint.setAlpha((int) (f10 * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, f11), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.O.L(canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f43689u0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f43648o0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f43642n0, canvas2, rectF, viewGroup);
                return;
            case 8:
                wm0 wm0Var = (wm0) this.f8767b;
                ih.d.a(wm0Var, canvas, rectF, wm0Var, (FrameLayout) this.f8768c);
                return;
            default:
                ek0 ek0Var2 = (ek0) this.f8767b;
                ih.d.a(ek0Var2, canvas, rectF, ek0Var2, (FrameLayout) this.f8768c);
                return;
        }
    }
}
