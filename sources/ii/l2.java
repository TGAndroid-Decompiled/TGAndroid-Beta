package ii;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import gi.f6;
public final class l2 implements View.OnLayoutChangeListener {
    public final int f15057a;
    public final Object f15058b;

    public l2(Object obj, int i3) {
        this.f15057a = i3;
        this.f15058b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17;
        int i18 = this.f15057a;
        int i19 = 0;
        Object obj = this.f15058b;
        switch (i18) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                a3 a3Var = (a3) obj;
                org.telegram.messenger.h2 h2Var = a3Var.f14812o0;
                r2 r2Var = a3Var.f14824x;
                r2Var.setSwipeOffsetY(r2Var.getHeight());
                a3Var.f14802f.setAlpha(1.0f);
                if (a3Var.I0 != Float.MAX_VALUE) {
                    r2Var.setSwipeOffsetAnimationDisallowed(true);
                    r2Var.setOffsetY(a3Var.I0);
                    r2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                a3Var.E.n(true, true);
                final g2.g gVar = new g2.g((int[]) null);
                gVar.d();
                if (!a3Var.H0 && !a3Var.r()) {
                    q1.g gVar2 = new q1.g((Object) r2Var, (q1.e) c4.f14871c0, 0.0f);
                    q1.h hVar = new q1.h(0.0f);
                    hVar.a(0.75f);
                    hVar.b(500.0f);
                    gVar2.f53653m = hVar;
                    gVar2.a(new q1.c() {
                        @Override
                        public final void a(q1.g gVar3, boolean z10, float f10, float f11) {
                            g2.g.this.e();
                        }
                    });
                    gVar2.h();
                } else {
                    r2Var.f(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()), false, new f6(gVar, 22));
                }
                r2Var.L = true;
                if (a3Var.f14803f0 && h2Var != null) {
                    h2Var.setAlpha(0.0f);
                    h2Var.animate().alpha(1.0f).setDuration(220L).start();
                    return;
                }
                return;
            case 1:
                lg.m.g0((lg.m) obj);
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
                    if (searchView.f1377g0) {
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
