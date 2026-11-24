package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class dtb implements s07 {
    public yz6 a;
    public c07 b;
    public final Toolbar c;

    public dtb(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override
    public final boolean b(bab babVar) {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final boolean g(c07 c07Var) {
        Toolbar toolbar = this.c;
        View view = toolbar.r;
        if (view instanceof sk2) {
            ((sk2) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.r);
        toolbar.removeView(toolbar.n);
        toolbar.r = null;
        ArrayList arrayList = toolbar.V;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        c07Var.C = false;
        c07Var.n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final boolean i(c07 c07Var) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.n);
            }
            toolbar.addView(toolbar.n);
        }
        View actionView = c07Var.getActionView();
        toolbar.r = actionView;
        this.b = c07Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.r);
            }
            etb h = Toolbar.h();
            h.a = (toolbar.E & 112) | 8388611;
            h.b = (byte) 2;
            toolbar.r.setLayoutParams(h);
            toolbar.addView(toolbar.r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((etb) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.V.add(childAt);
            }
        }
        toolbar.requestLayout();
        c07Var.C = true;
        c07Var.n.p(false);
        View view = toolbar.r;
        if (view instanceof sk2) {
            ((sk2) view).onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override
    public final void j() {
        if (this.b != null) {
            yz6 yz6Var = this.a;
            if (yz6Var != null) {
                int size = yz6Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            g(this.b);
        }
    }

    @Override
    public final void k(Context context, yz6 yz6Var) {
        c07 c07Var;
        yz6 yz6Var2 = this.a;
        if (yz6Var2 != null && (c07Var = this.b) != null) {
            yz6Var2.d(c07Var);
        }
        this.a = yz6Var;
    }

    @Override
    public final void d(yz6 yz6Var, boolean z) {
    }
}
