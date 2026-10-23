package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class j3 implements l.x {
    public l.k f16297a;
    public l.m f16298b;
    public final Toolbar f16299c;

    public j3(Toolbar toolbar) {
        this.f16299c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f16299c;
        toolbar.c();
        ViewParent parent = toolbar.f2808n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2808n);
            }
            toolbar.addView(toolbar.f2808n);
        }
        View actionView = mVar.getActionView();
        toolbar.f2809r = actionView;
        this.f16298b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2809r);
            }
            k3 h = Toolbar.h();
            h.f16306a = (toolbar.f2813y & 112) | 8388611;
            h.f16307b = 2;
            toolbar.f2809r.setLayoutParams(h);
            toolbar.addView(toolbar.f2809r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((k3) childAt.getLayoutParams()).f16307b != 2 && childAt != toolbar.f2794a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f15849n.p(false);
        View view = toolbar.f2809r;
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
        if (this.f16298b != null) {
            l.k kVar = this.f16297a;
            if (kVar != null) {
                int size = kVar.f15819f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f16297a.getItem(i10) == this.f16298b) {
                        return;
                    }
                }
            }
            k(this.f16298b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f16297a;
        if (kVar2 != null && (mVar = this.f16298b) != null) {
            kVar2.d(mVar);
        }
        this.f16297a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f16299c;
        View view = toolbar.f2809r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f2809r);
        toolbar.removeView(toolbar.f2808n);
        toolbar.f2809r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f16298b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f15849n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void d(l.k kVar, boolean z10) {
    }
}
