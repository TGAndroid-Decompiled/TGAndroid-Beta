package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class h3 implements l.x {
    public l.k f19116a;
    public l.m f19117b;
    public final Toolbar f19118c;

    public h3(Toolbar toolbar) {
        this.f19118c = toolbar;
    }

    @Override
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.f19118c;
        toolbar.c();
        ViewParent parent = toolbar.f1988n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1988n);
            }
            toolbar.addView(toolbar.f1988n);
        }
        View actionView = mVar.getActionView();
        toolbar.f1989r = actionView;
        this.f19117b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1989r);
            }
            i3 h = Toolbar.h();
            h.f19133a = (toolbar.D & 112) | 8388611;
            h.f19134b = 2;
            toolbar.f1989r.setLayoutParams(h);
            toolbar.addView(toolbar.f1989r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((i3) childAt.getLayoutParams()).f19134b != 2 && childAt != toolbar.f1973a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.f17703n.p(false);
        View view = toolbar.f1989r;
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
        if (this.f19117b != null) {
            l.k kVar = this.f19116a;
            if (kVar != null) {
                int size = kVar.f17672f.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (this.f19116a.getItem(i7) == this.f19117b) {
                        return;
                    }
                }
            }
            k(this.f19117b);
        }
    }

    @Override
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.f19116a;
        if (kVar2 != null && (mVar = this.f19117b) != null) {
            kVar2.d(mVar);
        }
        this.f19116a = kVar;
    }

    @Override
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.f19118c;
        View view = toolbar.f1989r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f1989r);
        toolbar.removeView(toolbar.f1988n);
        toolbar.f1989r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f19117b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.f17703n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void c(l.k kVar, boolean z9) {
    }
}
