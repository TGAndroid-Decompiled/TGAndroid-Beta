package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f15289a;
    public final r f15290b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15290b = rVar;
        this.f15289a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15289a.onMenuItemActionCollapse(this.f15290b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15289a.onMenuItemActionExpand(this.f15290b.f(menuItem));
    }
}
