package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f15219a;
    public final r f15220b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15220b = rVar;
        this.f15219a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15219a.onMenuItemActionCollapse(this.f15220b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15219a.onMenuItemActionExpand(this.f15220b.f(menuItem));
    }
}
