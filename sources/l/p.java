package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f16604a;
    public final r f16605b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f16605b = rVar;
        this.f16604a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f16604a.onMenuItemActionCollapse(this.f16605b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f16604a.onMenuItemActionExpand(this.f16605b.f(menuItem));
    }
}
