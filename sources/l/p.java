package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f15324a;
    public final r f15325b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15325b = rVar;
        this.f15324a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15324a.onMenuItemActionCollapse(this.f15325b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15324a.onMenuItemActionExpand(this.f15325b.f(menuItem));
    }
}
