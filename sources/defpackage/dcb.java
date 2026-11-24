package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
public final class dcb extends y17 implements SubMenu {
    public final c27 A;
    public final y17 z;

    public dcb(Context context, y17 y17Var, c27 c27Var) {
        super(context);
        this.z = y17Var;
        this.A = c27Var;
    }

    @Override
    public final boolean d(c27 c27Var) {
        return this.z.d(c27Var);
    }

    @Override
    public final boolean e(y17 y17Var, MenuItem menuItem) {
        if (!super.e(y17Var, menuItem) && !this.z.e(y17Var, menuItem)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(c27 c27Var) {
        return this.z.f(c27Var);
    }

    @Override
    public final MenuItem getItem() {
        return this.A;
    }

    @Override
    public final String j() {
        int i = this.A.a;
        if (i == 0) {
            return null;
        }
        return hg9.j(i, "android:menu:actionviewstates:");
    }

    @Override
    public final y17 k() {
        return this.z.k();
    }

    @Override
    public final boolean m() {
        return this.z.m();
    }

    @Override
    public final boolean n() {
        return this.z.n();
    }

    @Override
    public final boolean o() {
        return this.z.o();
    }

    @Override
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
