package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class k3 implements l.x {
    public l.k f16990a;
    public l.m f16991b;
    public final Toolbar f16992c;

    public k3(Toolbar toolbar) {
        this.f16992c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f16992c;
        toolbar.c();
        ViewParent parent = toolbar.f523n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f523n);
            }
            toolbar.addView(toolbar.f523n);
        }
        View actionView = mVar.getActionView();
        toolbar.f524r = actionView;
        this.f16991b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f524r);
            }
            l3 h = Toolbar.h();
            h.f16995a = (toolbar.f528y & 112) | 8388611;
            h.f16996b = 2;
            toolbar.f524r.setLayoutParams(h);
            toolbar.addView(toolbar.f524r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((l3) childAt.getLayoutParams()).f16996b != 2 && childAt != toolbar.f512a) {
                toolbar.removeViewAt(childCount);
                toolbar.Q.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f16589n.p(false);
        View view = toolbar.f524r;
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
        if (this.f16991b != null) {
            l.k kVar = this.f16990a;
            if (kVar != null) {
                int size = kVar.f16558f.size();
                for (int i9 = 0; i9 < size; i9++) {
                    if (this.f16990a.getItem(i9) == this.f16991b) {
                        return;
                    }
                }
            }
            k(this.f16991b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f16990a;
        if (kVar2 != null && (mVar = this.f16991b) != null) {
            kVar2.d(mVar);
        }
        this.f16990a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f16992c;
        View view = toolbar.f524r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f524r);
        toolbar.removeView(toolbar.f523n);
        toolbar.f524r = null;
        ArrayList arrayList = toolbar.Q;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f16991b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f16589n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void c(l.k kVar, boolean z10) {
    }
}
