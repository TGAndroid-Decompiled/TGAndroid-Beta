package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f15801a;
    public final r f15802b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15802b = rVar;
        this.f15801a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15801a.onMenuItemActionCollapse(this.f15802b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15801a.onMenuItemActionExpand(this.f15802b.f(menuItem));
    }
}
