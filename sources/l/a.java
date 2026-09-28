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
import v7.s8;
public final class a implements l0.a {
    public CharSequence f13909a;
    public CharSequence f13910b;
    public Intent f13911c;
    public char d;
    public int e;
    public char f13912f;
    public int f13913g;
    public Drawable h;
    public Context f13914i;
    public CharSequence f13915j;
    public CharSequence f13916k;
    public ColorStateList f13917l;
    public PorterDuff.Mode f13918m;
    public boolean f13919n;
    public boolean f13920o;
    public int f13921p;

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
            if (this.f13919n || this.f13920o) {
                Drawable d = s8.d(drawable);
                this.h = d;
                Drawable mutate = d.mutate();
                this.h = mutate;
                if (this.f13919n) {
                    mutate.setTintList(this.f13917l);
                }
                if (this.f13920o) {
                    this.h.setTintMode(this.f13918m);
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
        return this.f13913g;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f13912f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f13915j;
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
        return this.f13917l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f13918m;
    }

    @Override
    public final Intent getIntent() {
        return this.f13911c;
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
        return this.f13909a;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13910b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f13909a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f13916k;
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
        if ((this.f13921p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f13921p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f13921p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        if ((this.f13921p & 8) == 0) {
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
        this.f13912f = Character.toLowerCase(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f13921p = (z10 ? 1 : 0) | (this.f13921p & (-2));
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        int i10;
        int i11 = this.f13921p & (-3);
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f13921p = i10 | i11;
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f13915j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        int i10;
        int i11 = this.f13921p & (-17);
        if (z10) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        this.f13921p = i10 | i11;
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
        this.f13917l = colorStateList;
        this.f13919n = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13918m = mode;
        this.f13920o = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f13911c = intent;
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
        this.f13912f = Character.toLowerCase(c11);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13909a = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13910b = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f13916k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f13921p & 8;
        if (z10) {
            i10 = 0;
        }
        this.f13921p = i11 | i10;
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f13912f = Character.toLowerCase(c10);
        this.f13913g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f13915j = charSequence;
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
        this.f13909a = this.f13914i.getResources().getString(i10);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f13916k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.h = this.f13914i.getDrawable(i10);
        c();
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.d = c10;
        this.e = KeyEvent.normalizeMetaState(i10);
        this.f13912f = Character.toLowerCase(c11);
        this.f13913g = KeyEvent.normalizeMetaState(i11);
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
