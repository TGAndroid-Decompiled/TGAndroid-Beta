package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class h3 implements l.x {
    public l.k f15125a;
    public l.m f15126b;
    public final Toolbar f15127c;

    public h3(Toolbar toolbar) {
        this.f15127c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f15127c;
        toolbar.c();
        ViewParent parent = toolbar.f1182n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1182n);
            }
            toolbar.addView(toolbar.f1182n);
        }
        View actionView = mVar.getActionView();
        toolbar.f1183r = actionView;
        this.f15126b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1183r);
            }
            i3 h = Toolbar.h();
            h.f15133a = (toolbar.f1187y & 112) | 8388611;
            h.f15134b = 2;
            toolbar.f1183r.setLayoutParams(h);
            toolbar.addView(toolbar.f1183r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((i3) childAt.getLayoutParams()).f15134b != 2 && childAt != toolbar.f1168a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f14446n.p(false);
        View view = toolbar.f1183r;
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
        if (this.f15126b != null) {
            l.k kVar = this.f15125a;
            if (kVar != null) {
                int size = kVar.f14416f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f15125a.getItem(i10) == this.f15126b) {
                        return;
                    }
                }
            }
            k(this.f15126b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f15125a;
        if (kVar2 != null && (mVar = this.f15126b) != null) {
            kVar2.d(mVar);
        }
        this.f15125a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f15127c;
        View view = toolbar.f1183r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f1183r);
        toolbar.removeView(toolbar.f1182n);
        toolbar.f1183r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f15126b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f14446n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void d(l.k kVar, boolean z10) {
    }
}
