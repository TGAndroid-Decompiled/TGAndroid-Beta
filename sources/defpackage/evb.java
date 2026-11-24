package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class evb implements s27 {
    public y17 a;
    public c27 b;
    public final Toolbar c;

    public evb(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override
    public final boolean b(dcb dcbVar) {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final boolean g(c27 c27Var) {
        Toolbar toolbar = this.c;
        View view = toolbar.r;
        if (view instanceof em2) {
            ((em2) view).onActionViewCollapsed();
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
        c27Var.C = false;
        c27Var.n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final boolean i(c27 c27Var) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.n);
            }
            toolbar.addView(toolbar.n);
        }
        View actionView = c27Var.getActionView();
        toolbar.r = actionView;
        this.b = c27Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.r);
            }
            fvb h = Toolbar.h();
            h.a = (toolbar.E & 112) | 8388611;
            h.b = (byte) 2;
            toolbar.r.setLayoutParams(h);
            toolbar.addView(toolbar.r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((fvb) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.V.add(childAt);
            }
        }
        toolbar.requestLayout();
        c27Var.C = true;
        c27Var.n.p(false);
        View view = toolbar.r;
        if (view instanceof em2) {
            ((em2) view).onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override
    public final void j() {
        if (this.b != null) {
            y17 y17Var = this.a;
            if (y17Var != null) {
                int size = y17Var.f.size();
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
    public final void k(Context context, y17 y17Var) {
        c27 c27Var;
        y17 y17Var2 = this.a;
        if (y17Var2 != null && (c27Var = this.b) != null) {
            y17Var2.d(c27Var);
        }
        this.a = y17Var;
    }

    @Override
    public final void d(y17 y17Var, boolean z) {
    }
}
