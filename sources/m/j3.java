package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class j3 implements l.x {
    public l.k f13525a;
    public l.m f13526b;
    public final Toolbar f13527c;

    public j3(Toolbar toolbar) {
        this.f13527c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f13527c;
        toolbar.c();
        ViewParent parent = toolbar.f460n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f460n);
            }
            toolbar.addView(toolbar.f460n);
        }
        View actionView = mVar.getActionView();
        toolbar.f461r = actionView;
        this.f13526b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f461r);
            }
            k3 h = Toolbar.h();
            h.f13530a = (toolbar.f465y & 112) | 8388611;
            h.f13531b = 2;
            toolbar.f461r.setLayoutParams(h);
            toolbar.addView(toolbar.f461r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((k3) childAt.getLayoutParams()).f13531b != 2 && childAt != toolbar.f449a) {
                toolbar.removeViewAt(childCount);
                toolbar.R.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f11183n.p(false);
        View view = toolbar.f461r;
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
        if (this.f13526b != null) {
            l.k kVar = this.f13525a;
            if (kVar != null) {
                int size = kVar.f11153f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f13525a.getItem(i10) == this.f13526b) {
                        return;
                    }
                }
            }
            k(this.f13526b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f13525a;
        if (kVar2 != null && (mVar = this.f13526b) != null) {
            kVar2.d(mVar);
        }
        this.f13525a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f13527c;
        View view = toolbar.f461r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f461r);
        toolbar.removeView(toolbar.f460n);
        toolbar.f461r = null;
        ArrayList arrayList = toolbar.R;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f13526b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f11183n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void c(l.k kVar, boolean z4) {
    }
}
