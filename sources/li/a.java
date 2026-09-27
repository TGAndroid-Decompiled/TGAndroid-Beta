package li;

import ah.n;
import ai.w0;
import ai.w5;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.lh;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.y81;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b7;
import org.telegram.ui.dc;
import org.telegram.ui.de;
import org.telegram.ui.ge;
import org.telegram.ui.j6;
import org.telegram.ui.me;
import org.telegram.ui.ra1;
import org.telegram.ui.xu;
import org.telegram.ui.y6;
public final class a implements bh.a {
    public final int f14351a;
    public final Object f14352b;
    public final Object f14353c;

    public a(int i10, Object obj, Object obj2) {
        this.f14351a = i10;
        this.f14352b = obj;
        this.f14353c = obj2;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f14351a) {
            case 0:
            case 1:
            case 2:
            case 3:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        de deVar;
        t61 t61Var;
        yl0 yl0Var;
        dc dcVar;
        switch (this.f14351a) {
            case 0:
                yl0 yl0Var2 = (yl0) this.f14352b;
                gh.d.a(yl0Var2, canvas, rectF, yl0Var2, (FrameLayout) this.f14353c);
                return;
            case 1:
                b7 b7Var = (b7) this.f14352b;
                j6 j6Var = (j6) this.f14353c;
                w0 w0Var = b7Var.f32257b;
                gh.d.a(w0Var, canvas, rectF, w0Var, j6Var);
                y6 y6Var = b7Var.M;
                if (y6Var != null) {
                    int childCount = y6Var.h.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = b7Var.M.h.getChildAt(i10);
                        if (childAt instanceof yl0) {
                            yl0 yl0Var3 = (yl0) childAt;
                            gh.d.a(yl0Var3, canvas, rectF, yl0Var3, j6Var);
                        }
                    }
                    return;
                }
                return;
            case 2:
                xu xuVar = (xu) this.f14352b;
                w5 w5Var = (w5) this.f14353c;
                int childCount2 = xuVar.f40044a.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    View childAt2 = xuVar.f40044a.getChildAt(i11);
                    if (childAt2 instanceof yl0) {
                        yl0 yl0Var4 = (yl0) childAt2;
                        gh.d.a(yl0Var4, canvas, rectF, yl0Var4, w5Var);
                    }
                }
                return;
            case 3:
                ((n) this.f14353c).f(canvas, rectF);
                lh lhVar = ((ProfileActivity) this.f14352b).O.f26172c2;
                if (lhVar != null) {
                    lhVar.f(canvas, rectF);
                    return;
                }
                return;
            default:
                ra1 ra1Var = (ra1) this.f14352b;
                FrameLayout frameLayout = (FrameLayout) this.f14353c;
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == 0) {
                        yl0Var = ra1Var.S;
                    } else if (i12 == 1 && (dcVar = ra1Var.f37066i0) != null) {
                        yl0Var = dcVar.F;
                    } else {
                        me meVar = ra1Var.f37067j0;
                        if (meVar != null) {
                            yl0Var = meVar.f35641a1;
                        } else {
                            yl0Var = null;
                        }
                    }
                    if (yl0Var != null) {
                        gh.d.a(yl0Var, canvas, rectF, yl0Var, frameLayout);
                    }
                }
                me meVar2 = ra1Var.f37067j0;
                if (meVar2 != null && meVar2.f35644d1 != null && (deVar = meVar2.f35641a1) != null && !deVar.a1()) {
                    y81 y81Var = ra1Var.f37067j0.f35644d1.f34449b;
                    int childCount3 = y81Var.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = y81Var.getChildAt(i13);
                        if ((childAt3 instanceof ge) && (t61Var = ((ge) childAt3).f33908a) != null) {
                            gh.d.a(t61Var, canvas, rectF, t61Var, frameLayout);
                        }
                    }
                    return;
                }
                return;
        }
    }
}
