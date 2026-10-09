package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class h3 implements l.x {
    public l.k f15694a;
    public l.m f15695b;
    public final Toolbar f15696c;

    public h3(Toolbar toolbar) {
        this.f15696c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f15696c;
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
        this.f15695b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2289r);
            }
            i3 h = Toolbar.h();
            h.f15702a = (toolbar.f2293y & 112) | 8388611;
            h.f15703b = 2;
            toolbar.f2289r.setLayoutParams(h);
            toolbar.addView(toolbar.f2289r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((i3) childAt.getLayoutParams()).f15703b != 2 && childAt != toolbar.f2273a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f15270n.p(false);
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
        if (this.f15695b != null) {
            l.k kVar = this.f15694a;
            if (kVar != null) {
                int size = kVar.f15239f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f15694a.getItem(i10) == this.f15695b) {
                        return;
                    }
                }
            }
            k(this.f15695b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f15694a;
        if (kVar2 != null && (mVar = this.f15695b) != null) {
            kVar2.d(mVar);
        }
        this.f15694a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f15696c;
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
        this.f15695b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f15270n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void d(l.k kVar, boolean z10) {
    }
}
