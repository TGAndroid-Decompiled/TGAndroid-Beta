package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class j3 implements l.x {
    public l.k f16235a;
    public l.m f16236b;
    public final Toolbar f16237c;

    public j3(Toolbar toolbar) {
        this.f16237c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f16237c;
        toolbar.c();
        ViewParent parent = toolbar.f2805n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2805n);
            }
            toolbar.addView(toolbar.f2805n);
        }
        View actionView = mVar.getActionView();
        toolbar.f2806r = actionView;
        this.f16236b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2806r);
            }
            k3 h = Toolbar.h();
            h.f16244a = (toolbar.f2810y & 112) | 8388611;
            h.f16245b = 2;
            toolbar.f2806r.setLayoutParams(h);
            toolbar.addView(toolbar.f2806r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((k3) childAt.getLayoutParams()).f16245b != 2 && childAt != toolbar.f2791a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f15787n.p(false);
        View view = toolbar.f2806r;
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
        if (this.f16236b != null) {
            l.k kVar = this.f16235a;
            if (kVar != null) {
                int size = kVar.f15757f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f16235a.getItem(i10) == this.f16236b) {
                        return;
                    }
                }
            }
            k(this.f16236b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f16235a;
        if (kVar2 != null && (mVar = this.f16236b) != null) {
            kVar2.d(mVar);
        }
        this.f16235a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f16237c;
        View view = toolbar.f2806r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f2806r);
        toolbar.removeView(toolbar.f2805n);
        toolbar.f2806r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f16236b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f15787n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void d(l.k kVar, boolean z10) {
    }
}
