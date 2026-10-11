package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f15288a;
    public final r f15289b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15289b = rVar;
        this.f15288a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15288a.onMenuItemActionCollapse(this.f15289b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15288a.onMenuItemActionExpand(this.f15289b.f(menuItem));
    }
}
