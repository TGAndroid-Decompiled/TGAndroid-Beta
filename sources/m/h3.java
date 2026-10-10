package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class h3 implements l.x {
    public l.k f15698a;
    public l.m f15699b;
    public final Toolbar f15700c;

    public h3(Toolbar toolbar) {
        this.f15700c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f15700c;
        toolbar.c();
        ViewParent parent = toolbar.f2288n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2288n);
            }
            toolbar.addView(toolbar.f2288n);
        }
        View actionView = mVar.getActionView();
        toolbar.f2289r = actionView;
        this.f15699b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2289r);
            }
            i3 h = Toolbar.h();
            h.f15706a = (toolbar.f2293y & 112) | 8388611;
            h.f15707b = 2;
            toolbar.f2289r.setLayoutParams(h);
            toolbar.addView(toolbar.f2289r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((i3) childAt.getLayoutParams()).f15707b != 2 && childAt != toolbar.f2273a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f15274n.p(false);
        View view = toolbar.f2289r;
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
        if (this.f15699b != null) {
            l.k kVar = this.f15698a;
            if (kVar != null) {
                int size = kVar.f15243f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f15698a.getItem(i10) == this.f15699b) {
                        return;
                    }
                }
            }
            k(this.f15699b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f15698a;
        if (kVar2 != null && (mVar = this.f15699b) != null) {
            kVar2.d(mVar);
        }
        this.f15698a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f15700c;
        View view = toolbar.f2289r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f2289r);
        toolbar.removeView(toolbar.f2288n);
        toolbar.f2289r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f15699b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f15274n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void d(l.k kVar, boolean z10) {
    }
}
