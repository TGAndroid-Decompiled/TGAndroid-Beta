package kg;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import ki.o2;
import ki.x2;
import ki.x3;
import m.r3;
import org.telegram.messenger.h2;
public final class m implements View.OnLayoutChangeListener {
    public final int f17992a;
    public final Object f17993b;

    public m(Object obj, int i7) {
        this.f17992a = i7;
        this.f17993b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17;
        int i18 = this.f17992a;
        int i19 = 0;
        Object obj = this.f17993b;
        switch (i18) {
            case 0:
                n.g0((n) obj);
                return;
            case 1:
                view.removeOnLayoutChangeListener(this);
                x2 x2Var = (x2) obj;
                h2 h2Var = x2Var.f18671o0;
                o2 o2Var = x2Var.f18683x;
                o2Var.setSwipeOffsetY(o2Var.getHeight());
                x2Var.f18661f.setAlpha(1.0f);
                if (x2Var.I0 != Float.MAX_VALUE) {
                    o2Var.setSwipeOffsetAnimationDisallowed(true);
                    o2Var.setOffsetY(x2Var.I0);
                    o2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                x2Var.E.n(true, true);
                h2.f fVar = new h2.f((int[]) null);
                fVar.d();
                if (!x2Var.H0 && !x2Var.r()) {
                    r1.g gVar = new r1.g((Object) o2Var, (r1.e) x3.f18688c0, 0.0f);
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.75f);
                    hVar.b(500.0f);
                    gVar.f55748m = hVar;
                    gVar.a(new wi.c(fVar, 2));
                    gVar.h();
                } else {
                    o2Var.f(o2Var.getTopActionBarOffsetY() + (-o2Var.getOffsetY()), false, new j1(fVar, 10));
                }
                o2Var.L = true;
                if (x2Var.f18662f0 && h2Var != null) {
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
                    if (searchView.f1905g0) {
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
