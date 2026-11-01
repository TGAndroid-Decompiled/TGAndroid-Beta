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
public final class a implements l0.a {
    public CharSequence f11447a;
    public CharSequence f11448b;
    public Intent f11449c;
    public char d;
    public int e;
    public char f11450f;
    public int f11451g;
    public Drawable h;
    public Context f11452i;
    public CharSequence f11453j;
    public CharSequence f11454k;
    public ColorStateList f11455l;
    public PorterDuff.Mode f11456m;
    public boolean f11457n;
    public boolean f11458o;
    public int f11459p;

    @Override
    public final l0.a a(o oVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final o b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.f11457n || this.f11458o) {
                this.h = drawable;
                Drawable mutate = drawable.mutate();
                this.h = mutate;
                if (this.f11457n) {
                    mutate.setTintList(this.f11455l);
                }
                if (this.f11458o) {
                    this.h.setTintMode(this.f11456m);
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
        return this.f11451g;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f11450f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f11453j;
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
        return this.f11455l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f11456m;
    }

    @Override
    public final Intent getIntent() {
        return this.f11449c;
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
        return this.e;
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
        return this.f11447a;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f11448b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f11447a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f11454k;
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
        if ((this.f11459p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f11459p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f11459p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        if ((this.f11459p & 8) == 0) {
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
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f11450f = Character.toLowerCase(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f11459p = (z10 ? 1 : 0) | (this.f11459p & (-2));
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        int i10;
        int i11 = this.f11459p & (-3);
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f11459p = i10 | i11;
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f11453j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        int i10;
        int i11 = this.f11459p & (-17);
        if (z10) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        this.f11459p = i10 | i11;
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
        this.f11455l = colorStateList;
        this.f11457n = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11456m = mode;
        this.f11458o = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f11449c = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        this.d = c10;
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.d = c10;
        this.f11450f = Character.toLowerCase(c11);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f11447a = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11448b = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f11454k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f11459p & 8;
        if (z10) {
            i10 = 0;
        }
        this.f11459p = i11 | i10;
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f11450f = Character.toLowerCase(c10);
        this.f11451g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f11453j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.d = c10;
        this.e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f11447a = this.f11452i.getResources().getString(i10);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f11454k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.h = this.f11452i.getDrawable(i10);
        c();
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.d = c10;
        this.e = KeyEvent.normalizeMetaState(i10);
        this.f11450f = Character.toLowerCase(c11);
        this.f11451g = KeyEvent.normalizeMetaState(i11);
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
