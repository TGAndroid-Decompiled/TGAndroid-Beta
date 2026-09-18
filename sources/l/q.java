package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f13941a;
    public final s f13942b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13942b = sVar;
        this.f13941a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f13941a.onMenuItemActionCollapse(this.f13942b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f13941a.onMenuItemActionExpand(this.f13942b.f(menuItem));
    }
}
