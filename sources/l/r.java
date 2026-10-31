package l;

import android.view.MenuItem;
public final class r implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener f11547a;
    public final s f11548b;

    public r(s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f11548b = sVar;
        this.f11547a = onMenuItemClickListener;
    }

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f11547a.onMenuItemClick(this.f11548b.f(menuItem));
    }
}
