package l;

import android.view.MenuItem;
public final class r implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener f14010a;
    public final s f14011b;

    public r(s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f14011b = sVar;
        this.f14010a = onMenuItemClickListener;
    }

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f14010a.onMenuItemClick(this.f14011b.f(menuItem));
    }
}
