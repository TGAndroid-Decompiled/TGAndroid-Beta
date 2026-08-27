package m;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

public final class k3 implements l.y {

    public l.l f17365a;

    public l.n f17366b;

    public final Toolbar f17367c;

    public k3(Toolbar toolbar) {
        this.f17367c = toolbar;
    }

    @Override
    public final boolean c(l.n nVar) {
        Toolbar toolbar = this.f17367c;
        toolbar.c();
        ViewParent parent = toolbar.f1029n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1029n);
            }
            toolbar.addView(toolbar.f1029n);
        }
        View actionView = nVar.getActionView();
        toolbar.f1030r = actionView;
        this.f17366b = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1030r);
            }
            l3 l3VarH = Toolbar.h();
            l3VarH.f17370a = (toolbar.f1034y & 112) | 8388611;
            l3VarH.f17371b = 2;
            toolbar.f1030r.setLayoutParams(l3VarH);
            toolbar.addView(toolbar.f1030r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((l3) childAt.getLayoutParams()).f17371b != 2 && childAt != toolbar.f1018a) {
                toolbar.removeViewAt(childCount);
                toolbar.Q.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.C = true;
        nVar.f15345n.p(false);
        KeyEvent.Callback callback = toolbar.f1030r;
        if (callback instanceof k.b) {
            ((k.b) callback).onActionViewExpanded();
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
        if (this.f17366b != null) {
            l.l lVar = this.f17365a;
            if (lVar != null) {
                int size = lVar.f15314f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f17365a.getItem(i10) == this.f17366b) {
                        return;
                    }
                }
            }
            k(this.f17366b);
        }
    }

    @Override
    public final void i(Context context, l.l lVar) {
        l.n nVar;
        l.l lVar2 = this.f17365a;
        if (lVar2 != null && (nVar = this.f17366b) != null) {
            lVar2.d(nVar);
        }
        this.f17365a = lVar;
    }

    @Override
    public final boolean j(l.e0 e0Var) {
        return false;
    }

    @Override
    public final boolean k(l.n nVar) {
        Toolbar toolbar = this.f17367c;
        KeyEvent.Callback callback = toolbar.f1030r;
        if (callback instanceof k.b) {
            ((k.b) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f1030r);
        toolbar.removeView(toolbar.f1029n);
        toolbar.f1030r = null;
        ArrayList arrayList = toolbar.Q;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f17366b = null;
        toolbar.requestLayout();
        nVar.C = false;
        nVar.f15345n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void b(l.l lVar, boolean z10) {
    }
}
