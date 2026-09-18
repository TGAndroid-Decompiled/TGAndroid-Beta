package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class g3 implements l.x {
    public l.k f14191a;
    public l.m f14192b;
    public final Toolbar f14193c;

    public g3(Toolbar toolbar) {
        this.f14193c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f14193c;
        toolbar.c();
        ViewParent parent = toolbar.f2039n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2039n);
            }
            toolbar.addView(toolbar.f2039n);
        }
        View actionView = mVar.getActionView();
        toolbar.f2040r = actionView;
        this.f14192b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2040r);
            }
            h3 h = Toolbar.h();
            h.f14207a = (toolbar.f2044y & 112) | 8388611;
            h.f14208b = 2;
            toolbar.f2040r.setLayoutParams(h);
            toolbar.addView(toolbar.f2040r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((h3) childAt.getLayoutParams()).f14208b != 2 && childAt != toolbar.f2025a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f13779n.p(false);
        View view = toolbar.f2040r;
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
        if (this.f14192b != null) {
            l.k kVar = this.f14191a;
            if (kVar != null) {
                int size = kVar.f13749f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f14191a.getItem(i10) == this.f14192b) {
                        return;
                    }
                }
            }
            k(this.f14192b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f14191a;
        if (kVar2 != null && (mVar = this.f14192b) != null) {
            kVar2.d(mVar);
        }
        this.f14191a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f14193c;
        View view = toolbar.f2040r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f2040r);
        toolbar.removeView(toolbar.f2039n);
        toolbar.f2040r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f14192b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f13779n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void g(l.k kVar, boolean z10) {
    }
}
