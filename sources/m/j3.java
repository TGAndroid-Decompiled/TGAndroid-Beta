package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class j3 implements l.x {
    public l.k f16236a;
    public l.m f16237b;
    public final Toolbar f16238c;

    public j3(Toolbar toolbar) {
        this.f16238c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f16238c;
        toolbar.c();
        ViewParent parent = toolbar.f2803n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2803n);
            }
            toolbar.addView(toolbar.f2803n);
        }
        View actionView = mVar.getActionView();
        toolbar.f2804r = actionView;
        this.f16237b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2804r);
            }
            k3 h = Toolbar.h();
            h.f16245a = (toolbar.f2808y & 112) | 8388611;
            h.f16246b = 2;
            toolbar.f2804r.setLayoutParams(h);
            toolbar.addView(toolbar.f2804r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((k3) childAt.getLayoutParams()).f16246b != 2 && childAt != toolbar.f2789a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f15788n.p(false);
        View view = toolbar.f2804r;
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
        if (this.f16237b != null) {
            l.k kVar = this.f16236a;
            if (kVar != null) {
                int size = kVar.f15758f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f16236a.getItem(i10) == this.f16237b) {
                        return;
                    }
                }
            }
            k(this.f16237b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f16236a;
        if (kVar2 != null && (mVar = this.f16237b) != null) {
            kVar2.d(mVar);
        }
        this.f16236a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f16238c;
        View view = toolbar.f2804r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f2804r);
        toolbar.removeView(toolbar.f2803n);
        toolbar.f2804r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f16237b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f15788n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void d(l.k kVar, boolean z10) {
    }
}
