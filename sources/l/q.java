package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f14022a;
    public final s f14023b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f14023b = sVar;
        this.f14022a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f14022a.onMenuItemActionCollapse(this.f14023b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f14022a.onMenuItemActionExpand(this.f14023b.f(menuItem));
    }
}
