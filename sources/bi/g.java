package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.v80;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.mt;
import org.telegram.ui.su0;
import org.telegram.ui.xv0;
import org.telegram.ui.zw0;
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
                aVar.f8698a = true;
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
                ((z) this.f3908b).f5115f.d(canvas, rectF, (f) this.f3909c);
                return;
            case 1:
                ((dd) this.f3908b).U.d(canvas, rectF, (f) this.f3909c);
                return;
            case 2:
                ((gi.f) this.f3908b).U.d(canvas, rectF, (f) this.f3909c);
                return;
            case 3:
                im0 im0Var = (im0) this.f3908b;
                ih.d.a(im0Var, canvas, rectF, im0Var, (FrameLayout) this.f3909c);
                return;
            case 4:
                qj0 qj0Var = (qj0) this.f3908b;
                ih.d.a(qj0Var, canvas, rectF, qj0Var, (FrameLayout) this.f3909c);
                return;
            case 5:
                ((org.telegram.ui.y6) this.f3908b).f51924b0.d(canvas, rectF, (org.telegram.ui.z5) this.f3909c);
                return;
            case 6:
                ((s20) this.f3908b).f37889n.L(canvas, rectF, (FrameLayout) this.f3909c);
                return;
            case 7:
                ((v80) this.f3908b).R.L(canvas, rectF, (e5) this.f3909c);
                return;
            case 8:
                mt mtVar = (mt) this.f3908b;
                di.b4 b4Var = (di.b4) this.f3909c;
                int childCount = mtVar.f47991a.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = mtVar.f47991a.getChildAt(i7);
                    if (childAt instanceof qj0) {
                        qj0 qj0Var2 = (qj0) childAt;
                        ih.d.a(qj0Var2, canvas, rectF, qj0Var2, b4Var);
                    }
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f3908b;
                dh.k kVar = (dh.k) this.f3909c;
                Paint paint = profileActivity.P6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                xv0 xv0Var = profileActivity.N;
                if (xv0Var != null && xv0Var.getParent() == profileActivity.f41698a) {
                    f10 = profileActivity.S5;
                } else {
                    f10 = 0.0f;
                }
                int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i10 < 0) {
                    zw0 zw0Var = profileActivity.f41716c1;
                    RectF rectF2 = ProfileActivity.V6;
                    if (jh.k.c(zw0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        ih.d.a(new org.telegram.ui.oa(profileActivity, 4), canvas, rectF, profileActivity.f41716c1, viewGroup);
                    }
                    su0 su0Var = profileActivity.f41698a;
                    Objects.requireNonNull(su0Var);
                    ih.d.a(new org.telegram.ui.oa(su0Var, 5), canvas, rectF, profileActivity.f41698a, viewGroup);
                    kVar.d(canvas, rectF);
                }
                if (f10 > 0.0f) {
                    if (i10 < 0) {
                        f11 = profileActivity.N.getY() + profileActivity.f41698a.getY();
                    } else {
                        f11 = Float.MAX_VALUE;
                    }
                    paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27809a7, profileActivity.f41876z0));
                    paint.setAlpha((int) (f10 * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, f11), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.N.L(canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f41832t0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f41791n0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.m0, canvas2, rectF, viewGroup);
                return;
        }
    }
}
