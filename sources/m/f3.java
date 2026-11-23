package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class f3 implements l.x {
    public l.k f20083a;
    public l.m f20084b;
    public final Toolbar f20085c;

    public f3(Toolbar toolbar) {
        this.f20085c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f20085c;
        toolbar.c();
        ViewParent parent = toolbar.f1951n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1951n);
            }
            toolbar.addView(toolbar.f1951n);
        }
        View actionView = mVar.getActionView();
        toolbar.f1952r = actionView;
        this.f20084b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1952r);
            }
            g3 h = Toolbar.h();
            h.f20097a = (toolbar.E & 112) | 8388611;
            h.f20098b = 2;
            toolbar.f1952r.setLayoutParams(h);
            toolbar.addView(toolbar.f1952r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((g3) childAt.getLayoutParams()).f20098b != 2 && childAt != toolbar.f1935a) {
                toolbar.removeViewAt(childCount);
                toolbar.V.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f19243n.p(false);
        View view = toolbar.f1952r;
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
        if (this.f20084b != null) {
            l.k kVar = this.f20083a;
            if (kVar != null) {
                int size = kVar.f19212f.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (this.f20083a.getItem(i7) == this.f20084b) {
                        return;
                    }
                }
            }
            k(this.f20084b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f20083a;
        if (kVar2 != null && (mVar = this.f20084b) != null) {
            kVar2.d(mVar);
        }
        this.f20083a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f20085c;
        View view = toolbar.f1952r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f1952r);
        toolbar.removeView(toolbar.f1951n);
        toolbar.f1952r = null;
        ArrayList arrayList = toolbar.V;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f20084b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f19243n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void d(l.k kVar, boolean z10) {
    }
}
