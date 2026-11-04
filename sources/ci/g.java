package ci;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ht;
import org.telegram.ui.hu0;
import org.telegram.ui.mv0;
import org.telegram.ui.ow0;
public final class g implements fh.a {
    public final int f5145a;
    public final Object f5146b;
    public final Object f5147c;

    public g(int i3, Object obj, Object obj2) {
        this.f5145a = i3;
        this.f5146b = obj;
        this.f5147c = obj2;
    }

    @Override
    public final void b(eh.a aVar, RectF rectF) {
        switch (this.f5145a) {
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
                aVar.f9978a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        float f10;
        Canvas canvas2;
        float f11;
        switch (this.f5145a) {
            case 0:
                ((v) this.f5146b).f6139f.d(canvas, rectF, (f) this.f5147c);
                return;
            case 1:
                ((wb) this.f5146b).V.d(canvas, rectF, (f) this.f5147c);
                return;
            case 2:
                ((hi.g) this.f5146b).V.d(canvas, rectF, (f) this.f5147c);
                return;
            case 3:
                ((org.telegram.ui.z6) this.f5146b).f52550c0.d(canvas, rectF, (org.telegram.ui.b6) this.f5147c);
                return;
            case 4:
                ((n20) this.f5146b).f36342n.L(canvas, rectF, (FrameLayout) this.f5147c);
                return;
            case 5:
                ((r80) this.f5146b).S.L(canvas, rectF, (ai.o2) this.f5147c);
                return;
            case 6:
                ht htVar = (ht) this.f5146b;
                ai.d2 d2Var = (ai.d2) this.f5147c;
                int childCount = htVar.f45980a.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = htVar.f45980a.getChildAt(i3);
                    if (childAt instanceof tj0) {
                        tj0 tj0Var = (tj0) childAt;
                        jh.d.a(tj0Var, canvas, rectF, tj0Var, d2Var);
                    }
                }
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.f5146b;
                eh.k kVar = (eh.k) this.f5147c;
                Paint paint = profileActivity.N6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                mv0 mv0Var = profileActivity.O;
                if (mv0Var != null && mv0Var.getParent() == profileActivity.f41719a) {
                    f10 = profileActivity.R5;
                } else {
                    f10 = 0.0f;
                }
                int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i10 < 0) {
                    ow0 ow0Var = profileActivity.f41743d1;
                    RectF rectF2 = ProfileActivity.T6;
                    if (kh.k.c(ow0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        jh.d.a(new org.telegram.ui.na(profileActivity, 4), canvas, rectF, profileActivity.f41743d1, viewGroup);
                    }
                    hu0 hu0Var = profileActivity.f41719a;
                    Objects.requireNonNull(hu0Var);
                    jh.d.a(new org.telegram.ui.na(hu0Var, 5), canvas, rectF, profileActivity.f41719a, viewGroup);
                    kVar.d(canvas, rectF);
                }
                if (f10 > 0.0f) {
                    if (i10 < 0) {
                        f11 = profileActivity.O.getY() + profileActivity.f41719a.getY();
                    } else {
                        f11 = Float.MAX_VALUE;
                    }
                    paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, profileActivity.A0));
                    paint.setAlpha((int) (f10 * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, f11), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.O.L(canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f41859u0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f41817o0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.f41811n0, canvas2, rectF, viewGroup);
                return;
            case 8:
                km0 km0Var = (km0) this.f5146b;
                jh.d.a(km0Var, canvas, rectF, km0Var, (FrameLayout) this.f5147c);
                return;
            default:
                tj0 tj0Var2 = (tj0) this.f5146b;
                jh.d.a(tj0Var2, canvas, rectF, tj0Var2, (FrameLayout) this.f5147c);
                return;
        }
    }
}
