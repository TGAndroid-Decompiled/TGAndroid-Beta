package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f19258a;
    public final r f19259b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f19259b = rVar;
        this.f19258a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f19258a.onMenuItemActionCollapse(this.f19259b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f19258a.onMenuItemActionExpand(this.f19259b.f(menuItem));
    }
}
