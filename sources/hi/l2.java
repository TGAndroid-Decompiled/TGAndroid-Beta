package hi;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import fi.h9;
public final class l2 implements View.OnLayoutChangeListener {
    public final int f14779a;
    public final Object f14780b;

    public l2(Object obj, int i7) {
        this.f14779a = i7;
        this.f14780b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17;
        int i18 = this.f14779a;
        int i19 = 0;
        Object obj = this.f14780b;
        switch (i18) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                a3 a3Var = (a3) obj;
                org.telegram.messenger.h2 h2Var = a3Var.f14528n0;
                r2 r2Var = a3Var.f14541x;
                r2Var.setSwipeOffsetY(r2Var.getHeight());
                a3Var.f14519f.setAlpha(1.0f);
                if (a3Var.H0 != Float.MAX_VALUE) {
                    r2Var.setSwipeOffsetAnimationDisallowed(true);
                    r2Var.setOffsetY(a3Var.H0);
                    r2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                a3Var.D.n(true, true);
                h2.f fVar = new h2.f((int[]) null);
                fVar.d();
                if (!a3Var.G0 && !a3Var.r()) {
                    r1.g gVar = new r1.g((Object) r2Var, (r1.e) b4.f14559b0, 0.0f);
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.75f);
                    hVar.b(500.0f);
                    gVar.f54175m = hVar;
                    gVar.a(new ti.c(fVar, 2));
                    gVar.h();
                } else {
                    r2Var.f(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()), false, new h9(fVar, 19));
                }
                r2Var.K = true;
                if (a3Var.f14518e0 && h2Var != null) {
                    h2Var.setAlpha(0.0f);
                    h2Var.animate().alpha(1.0f).setDuration(220L).start();
                    return;
                }
                return;
            case 1:
                kg.m.g0((kg.m) obj);
                return;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.F;
                View view2 = searchView.N;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.H.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a10 = m.t3.a(searchView);
                    if (searchView.f1954f0) {
                        i19 = resources.getDimensionPixelSize(2131165225) + resources.getDimensionPixelSize(2131165226);
                    }
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    if (a10) {
                        i17 = -rect.left;
                    } else {
                        i17 = paddingLeft - (rect.left + i19);
                    }
                    searchAutoComplete.setDropDownHorizontalOffset(i17);
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i19) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
