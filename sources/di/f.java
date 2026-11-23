package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ot;
import org.telegram.ui.pu0;
import org.telegram.ui.uv0;
import org.telegram.ui.xw0;
public final class f implements eh.a {
    public final int f8730a;
    public final Object f8731b;
    public final Object f8732c;

    public f(int i7, Object obj, Object obj2) {
        this.f8730a = i7;
        this.f8731b = obj;
        this.f8732c = obj2;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f8730a) {
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
                aVar.f8363a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        float f10;
        Canvas canvas2;
        float f11;
        switch (this.f8730a) {
            case 0:
                ((t) this.f8731b).f9739f.d(canvas, rectF, (e) this.f8732c);
                return;
            case 1:
                ((pb) this.f8731b).V.d(canvas, rectF, (e) this.f8732c);
                return;
            case 2:
                ((ii.t) this.f8731b).V.d(canvas, rectF, (e) this.f8732c);
                return;
            case 3:
                ((org.telegram.ui.y6) this.f8731b).f54245c0.d(canvas, rectF, (org.telegram.ui.a6) this.f8732c);
                return;
            case 4:
                ((c30) this.f8731b).f33913n.L(canvas, rectF, (FrameLayout) this.f8732c);
                return;
            case 5:
                ((h90) this.f8731b).S.L(canvas, rectF, (bi.g3) this.f8732c);
                return;
            case 6:
                ot otVar = (ot) this.f8731b;
                bi.v2 v2Var = (bi.v2) this.f8732c;
                int childCount = otVar.f50757a.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = otVar.f50757a.getChildAt(i7);
                    if (childAt instanceof ek0) {
                        ek0 ek0Var = (ek0) childAt;
                        ih.d.a(ek0Var, canvas, rectF, ek0Var, v2Var);
                    }
                }
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.f8731b;
                dh.k kVar = (dh.k) this.f8732c;
                Paint paint = profileActivity.T6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                uv0 uv0Var = profileActivity.O;
                if (uv0Var != null && uv0Var.getParent() == profileActivity.f43634a) {
                    f10 = profileActivity.W5;
                } else {
                    f10 = 0.0f;
                }
                int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i10 < 0) {
                    xw0 xw0Var = profileActivity.f43659d1;
                    RectF rectF2 = ProfileActivity.Z6;
                    if (jh.k.c(xw0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        ih.d.a(new org.telegram.ui.oa(profileActivity, 4), canvas, rectF, profileActivity.f43659d1, viewGroup);
                    }
                    pu0 pu0Var = profileActivity.f43634a;
                    Objects.requireNonNull(pu0Var);
                    ih.d.a(new org.telegram.ui.oa(pu0Var, 5), canvas, rectF, profileActivity.f43634a, viewGroup);
                    kVar.d(canvas, rectF);
                }
                if (f10 > 0.0f) {
                    if (i10 < 0) {
                        f11 = profileActivity.O.getY() + profileActivity.f43634a.getY();
                    } else {
                        f11 = Float.MAX_VALUE;
                    }
                    paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, profileActivity.A0));
                    paint.setAlpha((int) (f10 * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, f11), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.O.L(canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f43774u0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f43733o0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f43727n0, canvas2, rectF, viewGroup);
                return;
            case 8:
                vm0 vm0Var = (vm0) this.f8731b;
                ih.d.a(vm0Var, canvas, rectF, vm0Var, (FrameLayout) this.f8732c);
                return;
            default:
                ek0 ek0Var2 = (ek0) this.f8731b;
                ih.d.a(ek0Var2, canvas, rectF, ek0Var2, (FrameLayout) this.f8732c);
                return;
        }
    }
}
