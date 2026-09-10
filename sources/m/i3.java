package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public final class i3 implements l.y {
    public l.l f13037a;
    public l.n f13038b;
    public final Toolbar f13039c;

    public i3(Toolbar toolbar) {
        this.f13039c = toolbar;
    }

    @Override
    public final boolean b(l.n nVar) {
        Toolbar toolbar = this.f13039c;
        toolbar.c();
        ViewParent parent = toolbar.f724n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f724n);
            }
            toolbar.addView(toolbar.f724n);
        }
        View actionView = nVar.getActionView();
        toolbar.f725r = actionView;
        this.f13038b = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f725r);
            }
            j3 h = Toolbar.h();
            h.f13046a = (toolbar.f729y & 112) | 8388611;
            h.f13047b = 2;
            toolbar.f725r.setLayoutParams(h);
            toolbar.addView(toolbar.f725r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((j3) childAt.getLayoutParams()).f13047b != 2 && childAt != toolbar.f710a) {
                toolbar.removeViewAt(childCount);
                toolbar.U.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.C = true;
        nVar.f12661n.p(false);
        View view = toolbar.f725r;
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
        if (this.f13038b != null) {
            l.l lVar = this.f13037a;
            if (lVar != null) {
                int size = lVar.f12631f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f13037a.getItem(i10) == this.f13038b) {
                        return;
                    }
                }
            }
            k(this.f13038b);
        }
    }

    @Override
    public final void i(Context context, l.l lVar) {
        l.n nVar;
        l.l lVar2 = this.f13037a;
        if (lVar2 != null && (nVar = this.f13038b) != null) {
            lVar2.d(nVar);
        }
        this.f13037a = lVar;
    }

    @Override
    public final boolean j(l.e0 e0Var) {
        return false;
    }

    @Override
    public final boolean k(l.n nVar) {
        Toolbar toolbar = this.f13039c;
        View view = toolbar.f725r;
        if (view instanceof k.b) {
            ((k.b) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f725r);
        toolbar.removeView(toolbar.f724n);
        toolbar.f725r = null;
        ArrayList arrayList = toolbar.U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f13038b = null;
        toolbar.requestLayout();
        nVar.C = false;
        nVar.f12661n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void c(l.l lVar, boolean z10) {
    }
}
