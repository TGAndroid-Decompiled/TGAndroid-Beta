package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f14032a;
    public final r f14033b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f14033b = rVar;
        this.f14032a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f14032a.onMenuItemActionCollapse(this.f14033b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f14032a.onMenuItemActionExpand(this.f14033b.f(menuItem));
    }
}
