package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f15220a;
    public final r f15221b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15221b = rVar;
        this.f15220a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15220a.onMenuItemActionCollapse(this.f15221b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15220a.onMenuItemActionExpand(this.f15221b.f(menuItem));
    }
}
