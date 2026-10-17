package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f15795a;
    public final r f15796b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15796b = rVar;
        this.f15795a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15795a.onMenuItemActionCollapse(this.f15796b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15795a.onMenuItemActionExpand(this.f15796b.f(menuItem));
    }
}
