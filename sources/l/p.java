package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f14461a;
    public final r f14462b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f14462b = rVar;
        this.f14461a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f14461a.onMenuItemActionCollapse(this.f14462b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f14461a.onMenuItemActionExpand(this.f14462b.f(menuItem));
    }
}
