package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class g3 implements l.y {
    public l.l f12417a;
    public l.n f12418b;
    public final Toolbar f12419c;

    public g3(Toolbar toolbar) {
        this.f12419c = toolbar;
    }

    @Override
    public final boolean b(l.n nVar) {
        Toolbar toolbar = this.f12419c;
        toolbar.c();
        ViewParent parent = toolbar.f1086n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1086n);
            }
            toolbar.addView(toolbar.f1086n);
        }
        View actionView = nVar.getActionView();
        toolbar.f1087r = actionView;
        this.f12418b = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1087r);
            }
            h3 h = Toolbar.h();
            h.f12433a = (toolbar.D & 112) | 8388611;
            h.f12434b = 2;
            toolbar.f1087r.setLayoutParams(h);
            toolbar.addView(toolbar.f1087r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((h3) childAt.getLayoutParams()).f12434b != 2 && childAt != toolbar.f1072a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.C = true;
        nVar.f11530n.p(false);
        View view = toolbar.f1087r;
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
        if (this.f12418b != null) {
            l.l lVar = this.f12417a;
            if (lVar != null) {
                int size = lVar.f11500f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f12417a.getItem(i10) == this.f12418b) {
                        return;
                    }
                }
            }
            k(this.f12418b);
        }
    }

    @Override
    public final void i(Context context, l.l lVar) {
        l.n nVar;
        l.l lVar2 = this.f12417a;
        if (lVar2 != null && (nVar = this.f12418b) != null) {
            lVar2.d(nVar);
        }
        this.f12417a = lVar;
    }

    @Override
    public final boolean j(l.e0 e0Var) {
        return false;
    }

    @Override
    public final boolean k(l.n nVar) {
        Toolbar toolbar = this.f12419c;
        View view = toolbar.f1087r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f1087r);
        toolbar.removeView(toolbar.f1086n);
        toolbar.f1087r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f12418b = null;
        toolbar.requestLayout();
        nVar.C = false;
        nVar.f11530n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void g(l.l lVar, boolean z10) {
    }
}
