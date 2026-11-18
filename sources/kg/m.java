package kg;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import ki.k2;
import ki.s3;
import ki.t2;
import m.r3;
import org.telegram.messenger.h2;
public final class m implements View.OnLayoutChangeListener {
    public final int f18376a;
    public final Object f18377b;

    public m(Object obj, int i7) {
        this.f18376a = i7;
        this.f18377b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17;
        int i18 = this.f18376a;
        int i19 = 0;
        Object obj = this.f18377b;
        switch (i18) {
            case 0:
                n.g0((n) obj);
                return;
            case 1:
                view.removeOnLayoutChangeListener(this);
                t2 t2Var = (t2) obj;
                h2 h2Var = t2Var.f18937o0;
                k2 k2Var = t2Var.f18949x;
                k2Var.setSwipeOffsetY(k2Var.getHeight());
                t2Var.f18927f.setAlpha(1.0f);
                if (t2Var.I0 != Float.MAX_VALUE) {
                    k2Var.setSwipeOffsetAnimationDisallowed(true);
                    k2Var.setOffsetY(t2Var.I0);
                    k2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                t2Var.E.n(true, true);
                h2.f fVar = new h2.f((int[]) null);
                fVar.d();
                if (!t2Var.H0 && !t2Var.r()) {
                    r1.g gVar = new r1.g((Object) k2Var, (r1.e) s3.f18888c0, 0.0f);
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.75f);
                    hVar.b(500.0f);
                    gVar.f56323m = hVar;
                    gVar.a(new wi.c(fVar, 2));
                    gVar.h();
                } else {
                    k2Var.f(k2Var.getTopActionBarOffsetY() + (-k2Var.getOffsetY()), false, new j0(fVar, 14));
                }
                k2Var.L = true;
                if (t2Var.f18928f0 && h2Var != null) {
                    h2Var.setAlpha(0.0f);
                    h2Var.animate().alpha(1.0f).setDuration(220L).start();
                    return;
                }
                return;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.G;
                View view2 = searchView.O;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.I.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a10 = r3.a(searchView);
                    if (searchView.f1897g0) {
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
