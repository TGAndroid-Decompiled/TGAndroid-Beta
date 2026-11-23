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
    public final int f8769a;
    public final Object f8770b;
    public final Object f8771c;

    public f(int i7, Object obj, Object obj2) {
        this.f8769a = i7;
        this.f8770b = obj;
        this.f8771c = obj2;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f8769a) {
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
                aVar.f8401a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        float f10;
        Canvas canvas2;
        float f11;
        switch (this.f8769a) {
            case 0:
                ((t) this.f8770b).f9778f.d(canvas, rectF, (e) this.f8771c);
                return;
            case 1:
                ((pb) this.f8770b).V.d(canvas, rectF, (e) this.f8771c);
                return;
            case 2:
                ((ii.t) this.f8770b).V.d(canvas, rectF, (e) this.f8771c);
                return;
            case 3:
                ((org.telegram.ui.x6) this.f8770b).f53653c0.d(canvas, rectF, (org.telegram.ui.z5) this.f8771c);
                return;
            case 4:
                ((f30) this.f8770b).f35075n.L(canvas, rectF, (FrameLayout) this.f8771c);
                return;
            case 5:
                ((k90) this.f8770b).S.L(canvas, rectF, (bi.e3) this.f8771c);
                return;
            case 6:
                pt ptVar = (pt) this.f8770b;
                bi.t2 t2Var = (bi.t2) this.f8771c;
                int childCount = ptVar.f50979a.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = ptVar.f50979a.getChildAt(i7);
                    if (childAt instanceof ek0) {
                        ek0 ek0Var = (ek0) childAt;
                        ih.d.a(ek0Var, canvas, rectF, ek0Var, t2Var);
                    }
                }
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.f8770b;
                dh.k kVar = (dh.k) this.f8771c;
                Paint paint = profileActivity.T6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                vv0 vv0Var = profileActivity.O;
                if (vv0Var != null && vv0Var.getParent() == profileActivity.f43553a) {
                    f10 = profileActivity.W5;
                } else {
                    f10 = 0.0f;
                }
                int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i10 < 0) {
                    zw0 zw0Var = profileActivity.f43578d1;
                    RectF rectF2 = ProfileActivity.Z6;
                    if (jh.k.c(zw0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        ih.d.a(new org.telegram.ui.oa(profileActivity, 4), canvas, rectF, profileActivity.f43578d1, viewGroup);
                    }
                    qu0 qu0Var = profileActivity.f43553a;
                    Objects.requireNonNull(qu0Var);
                    ih.d.a(new org.telegram.ui.oa(qu0Var, 5), canvas, rectF, profileActivity.f43553a, viewGroup);
                    kVar.d(canvas, rectF);
                }
                if (f10 > 0.0f) {
                    if (i10 < 0) {
                        f11 = profileActivity.O.getY() + profileActivity.f43553a.getY();
                    } else {
                        f11 = Float.MAX_VALUE;
                    }
                    paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29324a7, profileActivity.A0));
                    paint.setAlpha((int) (f10 * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, f11), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.O.L(canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f43693u0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f43652o0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f43646n0, canvas2, rectF, viewGroup);
                return;
            case 8:
                wm0 wm0Var = (wm0) this.f8770b;
                ih.d.a(wm0Var, canvas, rectF, wm0Var, (FrameLayout) this.f8771c);
                return;
            default:
                ek0 ek0Var2 = (ek0) this.f8770b;
                ih.d.a(ek0Var2, canvas, rectF, ek0Var2, (FrameLayout) this.f8771c);
                return;
        }
    }
}
