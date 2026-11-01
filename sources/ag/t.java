package ag;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import m.s3;
public final class t implements View.OnLayoutChangeListener {
    public final int f708a;
    public final Object f709b;

    public t(Object obj, int i10) {
        this.f708a = i10;
        this.f709b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19 = this.f708a;
        int i20 = 0;
        Object obj = this.f709b;
        switch (i19) {
            case 0:
                w.g0((w) obj);
                return;
            case 1:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.F;
                View view2 = searchView.N;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.H.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a2 = s3.a(searchView);
                    if (searchView.f1054f0) {
                        i20 = resources.getDimensionPixelSize(2131165225) + resources.getDimensionPixelSize(2131165226);
                    }
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    if (a2) {
                        i18 = -rect.left;
                    } else {
                        i18 = paddingLeft - (rect.left + i20);
                    }
                    searchAutoComplete.setDropDownHorizontalOffset(i18);
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i20) - paddingLeft);
                    return;
                }
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                xh.m2 m2Var = (xh.m2) obj;
                org.telegram.messenger.l2 l2Var = m2Var.f53908n0;
                xh.d2 d2Var = m2Var.f53921x;
                d2Var.setSwipeOffsetY(d2Var.getHeight());
                m2Var.f53899f.setAlpha(1.0f);
                if (m2Var.H0 != Float.MAX_VALUE) {
                    d2Var.setSwipeOffsetAnimationDisallowed(true);
                    d2Var.setOffsetY(m2Var.H0);
                    d2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                m2Var.D.n(true, true);
                final e2.f fVar = new e2.f((int[]) null);
                fVar.d();
                if (!m2Var.G0 && !m2Var.r()) {
                    o1.j jVar = new o1.j((Object) d2Var, (o1.h) xh.i3.f53818b0, 0.0f);
                    o1.k kVar = new o1.k(0.0f);
                    kVar.a(0.75f);
                    kVar.b(500.0f);
                    jVar.f13958m = kVar;
                    jVar.a(new o1.f() {
                        @Override
                        public final void a(o1.j jVar2, boolean z10, float f7, float f10) {
                            e2.f.this.e();
                        }
                    });
                    jVar.h();
                } else {
                    d2Var.f(d2Var.getTopActionBarOffsetY() + (-d2Var.getOffsetY()), false, new xh.d0(fVar, 6));
                }
                d2Var.K = true;
                if (m2Var.f53898e0 && l2Var != null) {
                    l2Var.setAlpha(0.0f);
                    l2Var.animate().alpha(1.0f).setDuration(220L).start();
                    return;
                }
                return;
        }
    }
}
