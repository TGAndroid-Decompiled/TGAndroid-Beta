package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class i3 implements l.x {
    public l.k f15455a;
    public l.m f15456b;
    public final Toolbar f15457c;

    public i3(Toolbar toolbar) {
        this.f15457c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f15457c;
        toolbar.c();
        ViewParent parent = toolbar.f2286n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2286n);
            }
            toolbar.addView(toolbar.f2286n);
        }
        View actionView = mVar.getActionView();
        toolbar.f2287r = actionView;
        this.f15456b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2287r);
            }
            j3 h = Toolbar.h();
            h.f15467a = (toolbar.f2291y & 112) | 8388611;
            h.f15468b = 2;
            toolbar.f2287r.setLayoutParams(h);
            toolbar.addView(toolbar.f2287r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((j3) childAt.getLayoutParams()).f15468b != 2 && childAt != toolbar.f2271a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f15018n.p(false);
        View view = toolbar.f2287r;
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
        if (this.f15456b != null) {
            l.k kVar = this.f15455a;
            if (kVar != null) {
                int size = kVar.f14987f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f15455a.getItem(i10) == this.f15456b) {
                        return;
                    }
                }
            }
            k(this.f15456b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f15455a;
        if (kVar2 != null && (mVar = this.f15456b) != null) {
            kVar2.d(mVar);
        }
        this.f15455a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f15457c;
        View view = toolbar.f2287r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f2287r);
        toolbar.removeView(toolbar.f2286n);
        toolbar.f2287r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f15456b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f15018n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void d(l.k kVar, boolean z10) {
    }
}
