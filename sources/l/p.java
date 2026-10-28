package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f16766a;
    public final r f16767b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f16767b = rVar;
        this.f16766a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f16766a.onMenuItemActionCollapse(this.f16767b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f16766a.onMenuItemActionExpand(this.f16767b.f(menuItem));
    }
}
