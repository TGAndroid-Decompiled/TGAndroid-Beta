package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.nu;
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
                hp0 hp0Var = (hp0) obj2;
                ih.d.a(hp0Var, canvas, rectF, hp0Var, (FrameLayout) obj);
                return;
            case 4:
                nm0 nm0Var = (nm0) obj2;
                ih.d.a(nm0Var, canvas, rectF, nm0Var, (FrameLayout) obj);
                return;
            case 5:
                ((org.telegram.ui.c7) obj2).f38191b0.d(canvas, rectF, (org.telegram.ui.e6) obj);
                return;
            case 6:
                ((m40) obj2).f30379n.J(canvas, rectF, (FrameLayout) obj);
                return;
            case 7:
                ((ua0) obj2).R.J(canvas, rectF, (bh.r) obj);
                return;
            case 8:
                nu nuVar = (nu) obj2;
                di.i4 i4Var = (di.i4) obj;
                int childCount = nuVar.f41890a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = nuVar.f41890a.getChildAt(i11);
                    if (childAt instanceof nm0) {
                        nm0 nm0Var2 = (nm0) childAt;
                        ih.d.a(nm0Var2, canvas, rectF, nm0Var2, i4Var);
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
