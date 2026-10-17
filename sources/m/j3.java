package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class j3 implements l.x {
    public l.k f16228a;
    public l.m f16229b;
    public final Toolbar f16230c;

    public j3(Toolbar toolbar) {
        this.f16230c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f16230c;
        toolbar.c();
        ViewParent parent = toolbar.f2804n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2804n);
            }
            toolbar.addView(toolbar.f2804n);
        }
        View actionView = mVar.getActionView();
        toolbar.f2805r = actionView;
        this.f16229b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2805r);
            }
            k3 h = Toolbar.h();
            h.f16237a = (toolbar.f2809y & 112) | 8388611;
            h.f16238b = 2;
            toolbar.f2805r.setLayoutParams(h);
            toolbar.addView(toolbar.f2805r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((k3) childAt.getLayoutParams()).f16238b != 2 && childAt != toolbar.f2790a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f15780n.p(false);
        View view = toolbar.f2805r;
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
        if (this.f16229b != null) {
            l.k kVar = this.f16228a;
            if (kVar != null) {
                int size = kVar.f15750f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f16228a.getItem(i10) == this.f16229b) {
                        return;
                    }
                }
            }
            k(this.f16229b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f16228a;
        if (kVar2 != null && (mVar = this.f16229b) != null) {
            kVar2.d(mVar);
        }
        this.f16228a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f16230c;
        View view = toolbar.f2805r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f2805r);
        toolbar.removeView(toolbar.f2804n);
        toolbar.f2805r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f16229b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f15780n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void d(l.k kVar, boolean z10) {
    }
}
