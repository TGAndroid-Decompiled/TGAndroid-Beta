package ki;

import ah.o;
import ai.w0;
import ai.x5;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a7;
import org.telegram.ui.bv;
import org.telegram.ui.i6;
import org.telegram.ui.x6;
public final class a implements bh.a {
    public final int f13652a;
    public final Object f13653b;
    public final Object f13654c;

    public a(int i10, Object obj, Object obj2) {
        this.f13652a = i10;
        this.f13653b = obj;
        this.f13654c = obj2;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f13652a) {
            case 0:
            case 1:
            case 2:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f13652a) {
            case 0:
                ml0 ml0Var = (ml0) this.f13653b;
                gh.d.a(ml0Var, canvas, rectF, ml0Var, (FrameLayout) this.f13654c);
                return;
            case 1:
                a7 a7Var = (a7) this.f13653b;
                i6 i6Var = (i6) this.f13654c;
                w0 w0Var = a7Var.f31734b;
                gh.d.a(w0Var, canvas, rectF, w0Var, i6Var);
                x6 x6Var = a7Var.M;
                if (x6Var != null) {
                    int childCount = x6Var.h.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = a7Var.M.h.getChildAt(i10);
                        if (childAt instanceof ml0) {
                            ml0 ml0Var2 = (ml0) childAt;
                            gh.d.a(ml0Var2, canvas, rectF, ml0Var2, i6Var);
                        }
                    }
                    return;
                }
                return;
            case 2:
                bv bvVar = (bv) this.f13653b;
                x5 x5Var = (x5) this.f13654c;
                int childCount2 = bvVar.f32569a.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    View childAt2 = bvVar.f32569a.getChildAt(i11);
                    if (childAt2 instanceof ml0) {
                        ml0 ml0Var3 = (ml0) childAt2;
                        gh.d.a(ml0Var3, canvas, rectF, ml0Var3, x5Var);
                    }
                }
                return;
            default:
                ((o) this.f13654c).f(canvas, rectF);
                jh jhVar = ((ProfileActivity) this.f13653b).O.f30616c2;
                if (jhVar != null) {
                    jhVar.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
