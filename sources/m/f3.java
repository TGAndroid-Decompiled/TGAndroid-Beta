package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class f3 implements l.x {
    public l.k f20052a;
    public l.m f20053b;
    public final Toolbar f20054c;

    public f3(Toolbar toolbar) {
        this.f20054c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f20054c;
        toolbar.c();
        ViewParent parent = toolbar.f1932n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1932n);
            }
            toolbar.addView(toolbar.f1932n);
        }
        View actionView = mVar.getActionView();
        toolbar.f1933r = actionView;
        this.f20053b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1933r);
            }
            g3 h = Toolbar.h();
            h.f20066a = (toolbar.E & 112) | 8388611;
            h.f20067b = 2;
            toolbar.f1933r.setLayoutParams(h);
            toolbar.addView(toolbar.f1933r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((g3) childAt.getLayoutParams()).f20067b != 2 && childAt != toolbar.f1916a) {
                toolbar.removeViewAt(childCount);
                toolbar.V.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f19212n.p(false);
        View view = toolbar.f1933r;
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
        if (this.f20053b != null) {
            l.k kVar = this.f20052a;
            if (kVar != null) {
                int size = kVar.f19181f.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (this.f20052a.getItem(i7) == this.f20053b) {
                        return;
                    }
                }
            }
            k(this.f20053b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f20052a;
        if (kVar2 != null && (mVar = this.f20053b) != null) {
            kVar2.d(mVar);
        }
        this.f20052a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f20054c;
        View view = toolbar.f1933r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f1933r);
        toolbar.removeView(toolbar.f1932n);
        toolbar.f1933r = null;
        ArrayList arrayList = toolbar.V;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f20053b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f19212n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void d(l.k kVar, boolean z10) {
    }
}
