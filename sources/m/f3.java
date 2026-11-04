package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class f3 implements l.x {
    public l.k f18576a;
    public l.m f18577b;
    public final Toolbar f18578c;

    public f3(Toolbar toolbar) {
        this.f18578c = toolbar;
    }

    @Override
    public final boolean c(l.m mVar) {
        Toolbar toolbar = this.f18578c;
        toolbar.c();
        ViewParent parent = toolbar.f1412n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1412n);
            }
            toolbar.addView(toolbar.f1412n);
        }
        View actionView = mVar.getActionView();
        toolbar.f1413r = actionView;
        this.f18577b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1413r);
            }
            g3 h = Toolbar.h();
            h.f18590a = (toolbar.E & 112) | 8388611;
            h.f18591b = 2;
            toolbar.f1413r.setLayoutParams(h);
            toolbar.addView(toolbar.f1413r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((g3) childAt.getLayoutParams()).f18591b != 2 && childAt != toolbar.f1396a) {
                toolbar.removeViewAt(childCount);
                toolbar.V.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f17452n.p(false);
        View view = toolbar.f1413r;
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
        if (this.f18577b != null) {
            l.k kVar = this.f18576a;
            if (kVar != null) {
                int size = kVar.f17421f.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (this.f18576a.getItem(i3) == this.f18577b) {
                        return;
                    }
                }
            }
            k(this.f18577b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f18576a;
        if (kVar2 != null && (mVar = this.f18577b) != null) {
            kVar2.d(mVar);
        }
        this.f18576a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f18578c;
        View view = toolbar.f1413r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f1413r);
        toolbar.removeView(toolbar.f1412n);
        toolbar.f1413r = null;
        ArrayList arrayList = toolbar.V;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f18577b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f17452n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void b(l.k kVar, boolean z10) {
    }
}
