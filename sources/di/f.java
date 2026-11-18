package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pt;
import org.telegram.ui.qu0;
import org.telegram.ui.vv0;
import org.telegram.ui.zw0;
public final class f implements eh.a {
    public final int f8746a;
    public final Object f8747b;
    public final Object f8748c;

    public f(int i7, Object obj, Object obj2) {
        this.f8746a = i7;
        this.f8747b = obj;
        this.f8748c = obj2;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f8746a) {
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
                aVar.f8372a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        float f10;
        Canvas canvas2;
        float f11;
        switch (this.f8746a) {
            case 0:
                ((t) this.f8747b).f9759f.d(canvas, rectF, (e) this.f8748c);
                return;
            case 1:
                ((pb) this.f8747b).V.d(canvas, rectF, (e) this.f8748c);
                return;
            case 2:
                ((ii.t) this.f8747b).V.d(canvas, rectF, (e) this.f8748c);
                return;
            case 3:
                ((org.telegram.ui.x6) this.f8747b).f53657c0.d(canvas, rectF, (org.telegram.ui.z5) this.f8748c);
                return;
            case 4:
                ((c30) this.f8747b).f33873n.L(canvas, rectF, (FrameLayout) this.f8748c);
                return;
            case 5:
                ((i90) this.f8747b).S.L(canvas, rectF, (bi.a3) this.f8748c);
                return;
            case 6:
                pt ptVar = (pt) this.f8747b;
                bi.p2 p2Var = (bi.p2) this.f8748c;
                int childCount = ptVar.f51009a.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = ptVar.f51009a.getChildAt(i7);
                    if (childAt instanceof ck0) {
                        ck0 ck0Var = (ck0) childAt;
                        ih.d.a(ck0Var, canvas, rectF, ck0Var, p2Var);
                    }
                }
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.f8747b;
                dh.k kVar = (dh.k) this.f8748c;
                Paint paint = profileActivity.T6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                vv0 vv0Var = profileActivity.O;
                if (vv0Var != null && vv0Var.getParent() == profileActivity.f43508a) {
                    f10 = profileActivity.W5;
                } else {
                    f10 = 0.0f;
                }
                int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i10 < 0) {
                    zw0 zw0Var = profileActivity.f43533d1;
                    RectF rectF2 = ProfileActivity.Z6;
                    if (jh.k.c(zw0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        ih.d.a(new org.telegram.ui.oa(profileActivity, 4), canvas, rectF, profileActivity.f43533d1, viewGroup);
                    }
                    qu0 qu0Var = profileActivity.f43508a;
                    Objects.requireNonNull(qu0Var);
                    ih.d.a(new org.telegram.ui.oa(qu0Var, 5), canvas, rectF, profileActivity.f43508a, viewGroup);
                    kVar.d(canvas, rectF);
                }
                if (f10 > 0.0f) {
                    if (i10 < 0) {
                        f11 = profileActivity.O.getY() + profileActivity.f43508a.getY();
                    } else {
                        f11 = Float.MAX_VALUE;
                    }
                    paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29339a7, profileActivity.A0));
                    paint.setAlpha((int) (f10 * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, f11), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.O.L(canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f43648u0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f43607o0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f43601n0, canvas2, rectF, viewGroup);
                return;
            case 8:
                tm0 tm0Var = (tm0) this.f8747b;
                ih.d.a(tm0Var, canvas, rectF, tm0Var, (FrameLayout) this.f8748c);
                return;
            default:
                ck0 ck0Var2 = (ck0) this.f8747b;
                ih.d.a(ck0Var2, canvas, rectF, ck0Var2, (FrameLayout) this.f8748c);
                return;
        }
    }
}
