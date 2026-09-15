package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class h3 implements l.x {
    public l.k f14194a;
    public l.m f14195b;
    public final Toolbar f14196c;

    public h3(Toolbar toolbar) {
        this.f14196c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f14196c;
        toolbar.c();
        ViewParent parent = toolbar.f2034n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2034n);
            }
            toolbar.addView(toolbar.f2034n);
        }
        View actionView = mVar.getActionView();
        toolbar.f2035r = actionView;
        this.f14195b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2035r);
            }
            i3 h = Toolbar.h();
            h.f14202a = (toolbar.f2039y & 112) | 8388611;
            h.f14203b = 2;
            toolbar.f2035r.setLayoutParams(h);
            toolbar.addView(toolbar.f2035r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((i3) childAt.getLayoutParams()).f14203b != 2 && childAt != toolbar.f2020a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f13769n.p(false);
        View view = toolbar.f2035r;
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
        if (this.f14195b != null) {
            l.k kVar = this.f14194a;
            if (kVar != null) {
                int size = kVar.f13739f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f14194a.getItem(i10) == this.f14195b) {
                        return;
                    }
                }
            }
            k(this.f14195b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f14194a;
        if (kVar2 != null && (mVar = this.f14195b) != null) {
            kVar2.d(mVar);
        }
        this.f14194a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f14196c;
        View view = toolbar.f2035r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f2035r);
        toolbar.removeView(toolbar.f2034n);
        toolbar.f2035r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f14195b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f13769n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void g(l.k kVar, boolean z10) {
    }
}
