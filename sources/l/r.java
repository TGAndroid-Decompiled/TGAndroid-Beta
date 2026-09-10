package l;

import android.view.MenuItem;
public final class r implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener f12678a;
    public final s f12679b;

    public r(s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f12679b = sVar;
        this.f12678a = onMenuItemClickListener;
    }

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f12678a.onMenuItemClick(this.f12679b.f(menuItem));
    }
}
