package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import k2.p1;
public final class d0 extends k implements SubMenu {
    public final m A;
    public final k f17393z;

    public d0(Context context, k kVar, m mVar) {
        super(context);
        this.f17393z = kVar;
        this.A = mVar;
    }

    @Override
    public final boolean d(m mVar) {
        return this.f17393z.d(mVar);
    }

    @Override
    public final boolean e(k kVar, MenuItem menuItem) {
        if (!super.e(kVar, menuItem) && !this.f17393z.e(kVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(m mVar) {
        return this.f17393z.f(mVar);
    }

    @Override
    public final MenuItem getItem() {
        return this.A;
    }

    @Override
    public final String j() {
        int i3;
        m mVar = this.A;
        if (mVar != null) {
            i3 = mVar.f17441a;
        } else {
            i3 = 0;
        }
        if (i3 == 0) {
            return null;
        }
        return p1.i(i3, "android:menu:actionviewstates:");
    }

    @Override
    public final k k() {
        return this.f17393z.k();
    }

    @Override
    public final boolean m() {
        return this.f17393z.m();
    }

    @Override
    public final boolean n() {
        return this.f17393z.n();
    }

    @Override
    public final boolean o() {
        return this.f17393z.o();
    }

    @Override
    public final void setGroupDividerEnabled(boolean z10) {
        this.f17393z.setGroupDividerEnabled(z10);
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
    public final void setQwertyMode(boolean z10) {
        this.f17393z.setQwertyMode(z10);
    }

    @Override
    public final SubMenu setHeaderIcon(int i3) {
        u(0, null, i3, null, null);
        return this;
    }

    @Override
    public final SubMenu setHeaderTitle(int i3) {
        u(i3, null, 0, null, null);
        return this;
    }

    @Override
    public final SubMenu setIcon(int i3) {
        this.A.setIcon(i3);
        return this;
    }
}
