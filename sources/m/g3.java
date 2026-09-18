package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class g3 implements l.y {
    public l.l f14366a;
    public l.n f14367b;
    public final Toolbar f14368c;

    public g3(Toolbar toolbar) {
        this.f14368c = toolbar;
    }

    @Override
    public final boolean b(l.n nVar) {
        Toolbar toolbar = this.f14368c;
        toolbar.c();
        ViewParent parent = toolbar.f2039n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2039n);
            }
            toolbar.addView(toolbar.f2039n);
        }
        View actionView = nVar.getActionView();
        toolbar.f2040r = actionView;
        this.f14367b = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2040r);
            }
            h3 h = Toolbar.h();
            h.f14382a = (toolbar.f2044y & 112) | 8388611;
            h.f14383b = 2;
            toolbar.f2040r.setLayoutParams(h);
            toolbar.addView(toolbar.f2040r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((h3) childAt.getLayoutParams()).f14383b != 2 && childAt != toolbar.f2025a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.C = true;
        nVar.f13926n.p(false);
        View view = toolbar.f2040r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d() {
        if (this.f14367b != null) {
            l.l lVar = this.f14366a;
            if (lVar != null) {
                int size = lVar.f13896f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f14366a.getItem(i10) == this.f14367b) {
                        return;
                    }
                }
            }
            k(this.f14367b);
        }
    }

    @Override
    public final void i(Context context, l.l lVar) {
        l.n nVar;
        l.l lVar2 = this.f14366a;
        if (lVar2 != null && (nVar = this.f14367b) != null) {
            lVar2.d(nVar);
        }
        this.f14366a = lVar;
    }

    @Override
    public final boolean j(l.e0 e0Var) {
        return false;
    }

    @Override
    public final boolean k(l.n nVar) {
        Toolbar toolbar = this.f14368c;
        View view = toolbar.f2040r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f2040r);
        toolbar.removeView(toolbar.f2039n);
        toolbar.f2040r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f14367b = null;
        toolbar.requestLayout();
        nVar.C = false;
        nVar.f13926n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void g(l.l lVar, boolean z10) {
    }
}
