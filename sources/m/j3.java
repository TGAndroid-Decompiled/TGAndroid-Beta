package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class j3 implements l.x {
    public l.k f16580a;
    public l.m f16581b;
    public final Toolbar f16582c;

    public j3(Toolbar toolbar) {
        this.f16582c = toolbar;
    }

    @Override
    public final boolean c(l.m mVar) {
        Toolbar toolbar = this.f16582c;
        toolbar.c();
        ViewParent parent = toolbar.f1015n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1015n);
            }
            toolbar.addView(toolbar.f1015n);
        }
        View actionView = mVar.getActionView();
        toolbar.f1016r = actionView;
        this.f16581b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1016r);
            }
            k3 h = Toolbar.h();
            h.f16590a = (toolbar.f1020y & 112) | 8388611;
            h.f16591b = 2;
            toolbar.f1016r.setLayoutParams(h);
            toolbar.addView(toolbar.f1016r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((k3) childAt.getLayoutParams()).f16591b != 2 && childAt != toolbar.f1004a) {
                toolbar.removeViewAt(childCount);
                toolbar.Q.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f14017n.p(false);
        View view = toolbar.f1016r;
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
        if (this.f16581b != null) {
            l.k kVar = this.f16580a;
            if (kVar != null) {
                int size = kVar.f13986f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f16580a.getItem(i10) == this.f16581b) {
                        return;
                    }
                }
            }
            k(this.f16581b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f16580a;
        if (kVar2 != null && (mVar = this.f16581b) != null) {
            kVar2.d(mVar);
        }
        this.f16580a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f16582c;
        View view = toolbar.f1016r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f1016r);
        toolbar.removeView(toolbar.f1015n);
        toolbar.f1016r = null;
        ArrayList arrayList = toolbar.Q;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f16581b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f14017n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void b(l.k kVar, boolean z10) {
    }
}
