package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class f3 implements l.x {
    public l.k f19688a;
    public l.m f19689b;
    public final Toolbar f19690c;

    public f3(Toolbar toolbar) {
        this.f19690c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f19690c;
        toolbar.c();
        ViewParent parent = toolbar.f1933n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1933n);
            }
            toolbar.addView(toolbar.f1933n);
        }
        View actionView = mVar.getActionView();
        toolbar.f1934r = actionView;
        this.f19689b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1934r);
            }
            g3 h = Toolbar.h();
            h.f19702a = (toolbar.E & 112) | 8388611;
            h.f19703b = 2;
            toolbar.f1934r.setLayoutParams(h);
            toolbar.addView(toolbar.f1934r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((g3) childAt.getLayoutParams()).f19703b != 2 && childAt != toolbar.f1917a) {
                toolbar.removeViewAt(childCount);
                toolbar.V.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f18848n.p(false);
        View view = toolbar.f1934r;
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
        if (this.f19689b != null) {
            l.k kVar = this.f19688a;
            if (kVar != null) {
                int size = kVar.f18817f.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (this.f19688a.getItem(i7) == this.f19689b) {
                        return;
                    }
                }
            }
            k(this.f19689b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f19688a;
        if (kVar2 != null && (mVar = this.f19689b) != null) {
            kVar2.d(mVar);
        }
        this.f19688a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f19690c;
        View view = toolbar.f1934r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f1934r);
        toolbar.removeView(toolbar.f1933n);
        toolbar.f1934r = null;
        ArrayList arrayList = toolbar.V;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f19689b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f18848n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void e(l.k kVar, boolean z10) {
    }
}
