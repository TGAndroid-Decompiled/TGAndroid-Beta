package kg;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import ki.j2;
import ki.r3;
import ki.s2;
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
                s2 s2Var = (s2) obj;
                h2 h2Var = s2Var.f18916o0;
                j2 j2Var = s2Var.f18928x;
                j2Var.setSwipeOffsetY(j2Var.getHeight());
                s2Var.f18906f.setAlpha(1.0f);
                if (s2Var.I0 != Float.MAX_VALUE) {
                    j2Var.setSwipeOffsetAnimationDisallowed(true);
                    j2Var.setOffsetY(s2Var.I0);
                    j2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                s2Var.E.n(true, true);
                h2.f fVar = new h2.f((int[]) null);
                fVar.d();
                if (!s2Var.H0 && !s2Var.r()) {
                    r1.g gVar = new r1.g((Object) j2Var, (r1.e) r3.f18867c0, 0.0f);
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.75f);
                    hVar.b(500.0f);
                    gVar.f56333m = hVar;
                    gVar.a(new wi.c(fVar, 2));
                    gVar.h();
                } else {
                    j2Var.f(j2Var.getTopActionBarOffsetY() + (-j2Var.getOffsetY()), false, new s0(fVar, 13));
                }
                j2Var.L = true;
                if (s2Var.f18907f0 && h2Var != null) {
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
                    boolean a10 = m.r3.a(searchView);
                    if (searchView.f1867g0) {
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
