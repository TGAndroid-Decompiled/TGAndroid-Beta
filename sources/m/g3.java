package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class g3 implements l.y {
    public l.l f15552a;
    public l.n f15553b;
    public final Toolbar f15554c;

    public g3(Toolbar toolbar) {
        this.f15554c = toolbar;
    }

    @Override
    public final boolean b(l.n nVar) {
        Toolbar toolbar = this.f15554c;
        toolbar.c();
        ViewParent parent = toolbar.f1037n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1037n);
            }
            toolbar.addView(toolbar.f1037n);
        }
        View actionView = nVar.getActionView();
        toolbar.f1038r = actionView;
        this.f15553b = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1038r);
            }
            h3 h = Toolbar.h();
            h.f15569a = (toolbar.f1042y & 112) | 8388611;
            h.f15570b = 2;
            toolbar.f1038r.setLayoutParams(h);
            toolbar.addView(toolbar.f1038r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((h3) childAt.getLayoutParams()).f15570b != 2 && childAt != toolbar.f1022a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.C = true;
        nVar.f15171n.p(false);
        View view = toolbar.f1038r;
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
    public final void e() {
        if (this.f15553b != null) {
            l.l lVar = this.f15552a;
            if (lVar != null) {
                int size = lVar.f15140f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f15552a.getItem(i10) == this.f15553b) {
                        return;
                    }
                }
            }
            k(this.f15553b);
        }
    }

    @Override
    public final void i(Context context, l.l lVar) {
        l.n nVar;
        l.l lVar2 = this.f15552a;
        if (lVar2 != null && (nVar = this.f15553b) != null) {
            lVar2.d(nVar);
        }
        this.f15552a = lVar;
    }

    @Override
    public final boolean j(l.e0 e0Var) {
        return false;
    }

    @Override
    public final boolean k(l.n nVar) {
        Toolbar toolbar = this.f15554c;
        View view = toolbar.f1038r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f1038r);
        toolbar.removeView(toolbar.f1037n);
        toolbar.f1038r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f15553b = null;
        toolbar.requestLayout();
        nVar.C = false;
        nVar.f15171n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void d(l.l lVar, boolean z10) {
    }
}
