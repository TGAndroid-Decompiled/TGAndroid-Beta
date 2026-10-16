package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class k3 implements l.x {
    public l.k f14886a;
    public l.m f14887b;
    public final Toolbar f14888c;

    public k3(Toolbar toolbar) {
        this.f14888c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f14888c;
        toolbar.c();
        ViewParent parent = toolbar.f1186n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1186n);
            }
            toolbar.addView(toolbar.f1186n);
        }
        View actionView = mVar.getActionView();
        toolbar.f1187r = actionView;
        this.f14887b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1187r);
            }
            l3 h = Toolbar.h();
            h.f14892a = (toolbar.f1191y & 112) | 8388611;
            h.f14893b = 2;
            toolbar.f1187r.setLayoutParams(h);
            toolbar.addView(toolbar.f1187r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((l3) childAt.getLayoutParams()).f14893b != 2 && childAt != toolbar.f1172a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f14448n.p(false);
        View view = toolbar.f1187r;
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
        if (this.f14887b != null) {
            l.k kVar = this.f14886a;
            if (kVar != null) {
                int size = kVar.f14418f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f14886a.getItem(i10) == this.f14887b) {
                        return;
                    }
                }
            }
            k(this.f14887b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f14886a;
        if (kVar2 != null && (mVar = this.f14887b) != null) {
            kVar2.d(mVar);
        }
        this.f14886a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f14888c;
        View view = toolbar.f1187r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f1187r);
        toolbar.removeView(toolbar.f1186n);
        toolbar.f1187r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f14887b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f14448n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void d(l.k kVar, boolean z10) {
    }
}
