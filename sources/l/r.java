package l;

import android.view.MenuItem;
public final class r implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener f11548a;
    public final s f11549b;

    public r(s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f11549b = sVar;
        this.f11548a = onMenuItemClickListener;
    }

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f11548a.onMenuItemClick(this.f11549b.f(menuItem));
    }
}
