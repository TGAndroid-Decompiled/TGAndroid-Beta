package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class g3 implements l.y {
    public l.l f14407a;
    public l.n f14408b;
    public final Toolbar f14409c;

    public g3(Toolbar toolbar) {
        this.f14409c = toolbar;
    }

    @Override
    public final boolean b(l.n nVar) {
        Toolbar toolbar = this.f14409c;
        toolbar.c();
        ViewParent parent = toolbar.f2031n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2031n);
            }
            toolbar.addView(toolbar.f2031n);
        }
        View actionView = nVar.getActionView();
        toolbar.f2032r = actionView;
        this.f14408b = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2032r);
            }
            h3 h = Toolbar.h();
            h.f14423a = (toolbar.f2036y & 112) | 8388611;
            h.f14424b = 2;
            toolbar.f2032r.setLayoutParams(h);
            toolbar.addView(toolbar.f2032r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((h3) childAt.getLayoutParams()).f14424b != 2 && childAt != toolbar.f2017a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.C = true;
        nVar.f13976n.p(false);
        View view = toolbar.f2032r;
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
        if (this.f14408b != null) {
            l.l lVar = this.f14407a;
            if (lVar != null) {
                int size = lVar.f13946f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f14407a.getItem(i10) == this.f14408b) {
                        return;
                    }
                }
            }
            k(this.f14408b);
        }
    }

    @Override
    public final void i(Context context, l.l lVar) {
        l.n nVar;
        l.l lVar2 = this.f14407a;
        if (lVar2 != null && (nVar = this.f14408b) != null) {
            lVar2.d(nVar);
        }
        this.f14407a = lVar;
    }

    @Override
    public final boolean j(l.e0 e0Var) {
        return false;
    }

    @Override
    public final boolean k(l.n nVar) {
        Toolbar toolbar = this.f14409c;
        View view = toolbar.f2032r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f2032r);
        toolbar.removeView(toolbar.f2031n);
        toolbar.f2032r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f14408b = null;
        toolbar.requestLayout();
        nVar.C = false;
        nVar.f13976n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void g(l.l lVar, boolean z10) {
    }
}
