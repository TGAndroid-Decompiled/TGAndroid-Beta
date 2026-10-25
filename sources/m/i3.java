package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class i3 implements l.x {
    public l.k f17744a;
    public l.m f17745b;
    public final Toolbar f17746c;

    public i3(Toolbar toolbar) {
        this.f17746c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f17746c;
        toolbar.c();
        ViewParent parent = toolbar.f2254n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2254n);
            }
            toolbar.addView(toolbar.f2254n);
        }
        View actionView = mVar.getActionView();
        toolbar.f2255r = actionView;
        this.f17745b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2255r);
            }
            j3 h = Toolbar.h();
            h.f17753a = (toolbar.f2259y & 112) | 8388611;
            h.f17754b = 2;
            toolbar.f2255r.setLayoutParams(h);
            toolbar.addView(toolbar.f2255r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((j3) childAt.getLayoutParams()).f17754b != 2 && childAt != toolbar.f2240a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f16752n.p(false);
        View view = toolbar.f2255r;
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
        if (this.f17745b != null) {
            l.k kVar = this.f17744a;
            if (kVar != null) {
                int size = kVar.f16722f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f17744a.getItem(i10) == this.f17745b) {
                        return;
                    }
                }
            }
            k(this.f17745b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f17744a;
        if (kVar2 != null && (mVar = this.f17745b) != null) {
            kVar2.d(mVar);
        }
        this.f17744a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f17746c;
        View view = toolbar.f2255r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f2255r);
        toolbar.removeView(toolbar.f2254n);
        toolbar.f2255r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f17745b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f16752n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void g(l.k kVar, boolean z10) {
    }
}
