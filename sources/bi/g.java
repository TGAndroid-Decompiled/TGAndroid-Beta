package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.lu;
public final class g implements dh.a {
    public final int f4627a;
    public final Object f4628b;
    public final Object f4629c;

    public g(int i10, Object obj, Object obj2) {
        this.f4627a = i10;
        this.f4628b = obj;
        this.f4629c = obj2;
    }

    @Override
    public final void b(ch.a aVar, RectF rectF) {
        switch (this.f4627a) {
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
                aVar.f6296a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        int i10 = this.f4627a;
        Object obj = this.f4629c;
        Object obj2 = this.f4628b;
        switch (i10) {
            case 0:
                ((y) obj2).f5722f.d(canvas, rectF, (f) obj);
                return;
            case 1:
                ((dd) obj2).U.d(canvas, rectF, (f) obj);
                return;
            case 2:
                ((gi.h) obj2).U.d(canvas, rectF, (f) obj);
                return;
            case 3:
                gp0 gp0Var = (gp0) obj2;
                ih.d.a(gp0Var, canvas, rectF, gp0Var, (FrameLayout) obj);
                return;
            case 4:
                mm0 mm0Var = (mm0) obj2;
                ih.d.a(mm0Var, canvas, rectF, mm0Var, (FrameLayout) obj);
                return;
            case 5:
                ((org.telegram.ui.c7) obj2).f38345b0.d(canvas, rectF, (org.telegram.ui.e6) obj);
                return;
            case 6:
                ((m40) obj2).f30379n.J(canvas, rectF, (FrameLayout) obj);
                return;
            case 7:
                ((ta0) obj2).R.J(canvas, rectF, (bh.r) obj);
                return;
            case 8:
                lu luVar = (lu) obj2;
                di.i4 i4Var = (di.i4) obj;
                int childCount = luVar.f41364a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = luVar.f41364a.getChildAt(i11);
                    if (childAt instanceof mm0) {
                        mm0 mm0Var2 = (mm0) childAt;
                        ih.d.a(mm0Var2, canvas, rectF, mm0Var2, i4Var);
                    }
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                int i12 = ProfileActivity.R6;
                ((ch.j) obj).f(canvas, rectF);
                profileActivity.N.J(canvas, rectF, (ViewGroup) profileActivity.fragmentView);
                return;
        }
    }
}
