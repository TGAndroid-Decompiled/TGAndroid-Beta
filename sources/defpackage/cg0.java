package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.ProfileActivity;
public final class cg0 implements wg5 {
    public final byte a;
    public final Object b;
    public final Object c;

    public cg0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override
    public final void a(tab tabVar, RectF rectF) {
        byte b = this.a;
        tabVar.b = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        float f;
        Canvas canvas2;
        float f2;
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                tu9 tu9Var = (tu9) obj2;
                tk0.a(tu9Var, canvas, rectF, tu9Var, (FrameLayout) obj);
                return;
            case 1:
                o39 o39Var = (o39) obj2;
                tk0.a(o39Var, canvas, rectF, o39Var, (FrameLayout) obj);
                return;
            case 2:
                ((ss0) obj2).f.d(canvas, rectF, (jd) obj);
                return;
            case 3:
                ((r61) obj2).c0.d(canvas, rectF, (sg0) obj);
                return;
            case 4:
                h83 h83Var = (h83) obj2;
                a6 a6Var = (a6) obj;
                int childCount = h83Var.a.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = h83Var.a.getChildAt(i);
                    if (childAt instanceof o39) {
                        o39 o39Var2 = (o39) childAt;
                        tk0.a(o39Var2, canvas, rectF, o39Var2, a6Var);
                    }
                }
                return;
            case 5:
                ((tc5) obj2).n.u(canvas, rectF, (FrameLayout) obj);
                return;
            case 6:
                ((zj6) obj2).S.u(canvas, rectF, (oc6) obj);
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                mdc mdcVar = (mdc) obj;
                RectF rectF2 = ProfileActivity.Z6;
                Paint paint = profileActivity.T6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                vn8 vn8Var = profileActivity.O;
                if (vn8Var != null && vn8Var.getParent() == profileActivity.a) {
                    f = profileActivity.W5;
                } else {
                    f = 0.0f;
                }
                int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                if (i2 < 0) {
                    wo8 wo8Var = profileActivity.d1;
                    RectF rectF3 = ProfileActivity.Z6;
                    if (zec.c(wo8Var, viewGroup, rectF3) && RectF.intersects(rectF3, rectF)) {
                        tk0.a(new vw0(profileActivity, (byte) 7), canvas, rectF, profileActivity.d1, viewGroup);
                    }
                    om8 om8Var = profileActivity.a;
                    Objects.requireNonNull(om8Var);
                    tk0.a(new vw0(om8Var, (byte) 8), canvas, rectF, profileActivity.a, viewGroup);
                    mdcVar.d(canvas, rectF);
                }
                if (f > 0.0f) {
                    if (i2 < 0) {
                        f2 = profileActivity.O.getY() + profileActivity.a.getY();
                    } else {
                        f2 = Float.MAX_VALUE;
                    }
                    paint.setColor(bkb.v0(bkb.Z6, profileActivity.A0));
                    paint.setAlpha((int) (f * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, f2), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.O.u(canvas2, rectF, viewGroup);
                ProfileActivity.E1(profileActivity.u0, canvas2, rectF, viewGroup);
                ProfileActivity.E1(profileActivity.o0, canvas2, rectF, viewGroup);
                ProfileActivity.E1(profileActivity.n0, canvas2, rectF, viewGroup);
                return;
            case 8:
                ((jva) obj2).V.d(canvas, rectF, (gua) obj);
                return;
            default:
                ((ydb) obj2).V.d(canvas, rectF, (gua) obj);
                return;
        }
    }
}
