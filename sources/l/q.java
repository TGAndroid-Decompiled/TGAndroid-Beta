package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f13991a;
    public final s f13992b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13992b = sVar;
        this.f13991a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f13991a.onMenuItemActionCollapse(this.f13992b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f13991a.onMenuItemActionExpand(this.f13992b.f(menuItem));
    }
}
