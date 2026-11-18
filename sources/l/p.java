package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f19230a;
    public final r f19231b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f19231b = rVar;
        this.f19230a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f19230a.onMenuItemActionCollapse(this.f19231b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f19230a.onMenuItemActionExpand(this.f19231b.f(menuItem));
    }
}
