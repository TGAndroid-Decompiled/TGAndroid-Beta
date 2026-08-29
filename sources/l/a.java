package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import h7.l8;
public final class a implements l0.a {
    public CharSequence f13929a;
    public CharSequence f13930b;
    public Intent f13931c;
    public char d;
    public int f13932e;
    public char f13933f;
    public int f13934g;
    public Drawable h;
    public Context f13935i;
    public CharSequence f13936j;
    public CharSequence f13937k;
    public ColorStateList f13938l;
    public PorterDuff.Mode f13939m;
    public boolean f13940n;
    public boolean f13941o;
    public int f13942p;

    @Override
    public final l0.a a(n nVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final n b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.f13940n || this.f13941o) {
                Drawable d = l8.d(drawable);
                this.h = d;
                Drawable mutate = d.mutate();
                this.h = mutate;
                if (this.f13940n) {
                    mutate.setTintList(this.f13938l);
                }
                if (this.f13941o) {
                    this.h.setTintMode(this.f13939m);
                }
            }
        }
    }

    @Override
    public final boolean collapseActionView() {
        return false;
    }

    @Override
    public final boolean expandActionView() {
        return false;
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final View getActionView() {
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f13934g;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f13933f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f13936j;
    }

    @Override
    public final int getGroupId() {
        return 0;
    }

    @Override
    public final Drawable getIcon() {
        return this.h;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f13938l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f13939m;
    }

    @Override
    public final Intent getIntent() {
        return this.f13931c;
    }

    @Override
    public final int getItemId() {
        return 16908332;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f13932e;
    }

    @Override
    public final char getNumericShortcut() {
        return this.d;
    }

    @Override
    public final int getOrder() {
        return 0;
    }

    @Override
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f13929a;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13930b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f13929a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f13937k;
    }

    @Override
    public final boolean hasSubMenu() {
        return false;
    }

    @Override
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override
    public final boolean isCheckable() {
        if ((this.f13942p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f13942p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f13942p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        if ((this.f13942p & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c3) {
        this.f13933f = Character.toLowerCase(c3);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f13942p = (z10 ? 1 : 0) | (this.f13942p & (-2));
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        int i10;
        int i11 = this.f13942p & (-3);
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f13942p = i10 | i11;
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f13936j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        int i10;
        int i11 = this.f13942p & (-17);
        if (z10) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        this.f13942p = i10 | i11;
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13938l = colorStateList;
        this.f13940n = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13939m = mode;
        this.f13941o = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f13931c = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c3) {
        this.d = c3;
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setShortcut(char c3, char c6) {
        this.d = c3;
        this.f13933f = Character.toLowerCase(c6);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13929a = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13930b = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f13937k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f13942p & 8;
        if (z10) {
            i10 = 0;
        }
        this.f13942p = i11 | i10;
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c3, int i10) {
        this.f13933f = Character.toLowerCase(c3);
        this.f13934g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f13936j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c3, int i10) {
        this.d = c3;
        this.f13932e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f13929a = this.f13935i.getResources().getString(i10);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f13937k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.h = this.f13935i.getDrawable(i10);
        c();
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c3, char c6, int i10, int i11) {
        this.d = c3;
        this.f13932e = KeyEvent.normalizeMetaState(i10);
        this.f13933f = Character.toLowerCase(c6);
        this.f13934g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }
}
