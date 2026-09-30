package l;

import android.view.MenuItem;
public final class r implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener f14024a;
    public final s f14025b;

    public r(s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f14025b = sVar;
        this.f14024a = onMenuItemClickListener;
    }

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f14024a.onMenuItemClick(this.f14025b.f(menuItem));
    }
}
