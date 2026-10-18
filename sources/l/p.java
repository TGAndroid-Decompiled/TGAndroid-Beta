package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f15800a;
    public final r f15801b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15801b = rVar;
        this.f15800a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15800a.onMenuItemActionCollapse(this.f15801b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15800a.onMenuItemActionExpand(this.f15801b.f(menuItem));
    }
}
