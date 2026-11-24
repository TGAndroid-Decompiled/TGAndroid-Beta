package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
public final class bab extends yz6 implements SubMenu {
    public final c07 A;
    public final yz6 z;

    public bab(Context context, yz6 yz6Var, c07 c07Var) {
        super(context);
        this.z = yz6Var;
        this.A = c07Var;
    }

    @Override
    public final boolean d(c07 c07Var) {
        return this.z.d(c07Var);
    }

    @Override
    public final boolean e(yz6 yz6Var, MenuItem menuItem) {
        if (!super.e(yz6Var, menuItem) && !this.z.e(yz6Var, menuItem)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(c07 c07Var) {
        return this.z.f(c07Var);
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
        return de9.k(i, "android:menu:actionviewstates:");
    }

    @Override
    public final yz6 k() {
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
