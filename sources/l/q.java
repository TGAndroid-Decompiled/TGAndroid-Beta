package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener f19229a;
    public final r f19230b;

    public q(r rVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f19230b = rVar;
        this.f19229a = onMenuItemClickListener;
    }

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f19229a.onMenuItemClick(this.f19230b.f(menuItem));
    }
}
