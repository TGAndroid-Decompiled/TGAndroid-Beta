package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class i3 implements l.y {
    public l.l f13221a;
    public l.n f13222b;
    public final Toolbar f13223c;

    public i3(Toolbar toolbar) {
        this.f13223c = toolbar;
    }

    @Override
    public final boolean b(l.n nVar) {
        Toolbar toolbar = this.f13223c;
        toolbar.c();
        ViewParent parent = toolbar.f492n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f492n);
            }
            toolbar.addView(toolbar.f492n);
        }
        View actionView = nVar.getActionView();
        toolbar.f493r = actionView;
        this.f13222b = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f493r);
            }
            j3 h = Toolbar.h();
            h.f13231a = (toolbar.f497y & 112) | 8388611;
            h.f13232b = 2;
            toolbar.f493r.setLayoutParams(h);
            toolbar.addView(toolbar.f493r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((j3) childAt.getLayoutParams()).f13232b != 2 && childAt != toolbar.f480a) {
                toolbar.removeViewAt(childCount);
                toolbar.R.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.C = true;
        nVar.f11430n.p(false);
        View view = toolbar.f493r;
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
        if (this.f13222b != null) {
            l.l lVar = this.f13221a;
            if (lVar != null) {
                int size = lVar.f11399f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f13221a.getItem(i10) == this.f13222b) {
                        return;
                    }
                }
            }
            k(this.f13222b);
        }
    }

    @Override
    public final void i(Context context, l.l lVar) {
        l.n nVar;
        l.l lVar2 = this.f13221a;
        if (lVar2 != null && (nVar = this.f13222b) != null) {
            lVar2.d(nVar);
        }
        this.f13221a = lVar;
    }

    @Override
    public final boolean j(l.e0 e0Var) {
        return false;
    }

    @Override
    public final boolean k(l.n nVar) {
        Toolbar toolbar = this.f13223c;
        View view = toolbar.f493r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f493r);
        toolbar.removeView(toolbar.f492n);
        toolbar.f493r = null;
        ArrayList arrayList = toolbar.R;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f13222b = null;
        toolbar.requestLayout();
        nVar.C = false;
        nVar.f11430n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void c(l.l lVar, boolean z4) {
    }
}
