package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f13784a;
    public final r f13785b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13785b = rVar;
        this.f13784a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f13784a.onMenuItemActionCollapse(this.f13785b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f13784a.onMenuItemActionExpand(this.f13785b.f(menuItem));
    }
}
