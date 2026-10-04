package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class g3 implements l.x {
    public l.k f15741a;
    public l.m f15742b;
    public final Toolbar f15743c;

    public g3(Toolbar toolbar) {
        this.f15743c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f15743c;
        toolbar.c();
        ViewParent parent = toolbar.f2209n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2209n);
            }
            toolbar.addView(toolbar.f2209n);
        }
        View actionView = mVar.getActionView();
        toolbar.f2210r = actionView;
        this.f15742b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2210r);
            }
            h3 h = Toolbar.h();
            h.f15758a = (toolbar.f2214y & 112) | 8388611;
            h.f15759b = 2;
            toolbar.f2210r.setLayoutParams(h);
            toolbar.addView(toolbar.f2210r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((h3) childAt.getLayoutParams()).f15759b != 2 && childAt != toolbar.f2194a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f15205n.p(false);
        View view = toolbar.f2210r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e() {
        if (this.f15742b != null) {
            l.k kVar = this.f15741a;
            if (kVar != null) {
                int size = kVar.f15174f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f15741a.getItem(i10) == this.f15742b) {
                        return;
                    }
                }
            }
            k(this.f15742b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f15741a;
        if (kVar2 != null && (mVar = this.f15742b) != null) {
            kVar2.d(mVar);
        }
        this.f15741a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f15743c;
        View view = toolbar.f2210r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f2210r);
        toolbar.removeView(toolbar.f2209n);
        toolbar.f2210r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f15742b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f15205n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void c(l.k kVar, boolean z10) {
    }
}
