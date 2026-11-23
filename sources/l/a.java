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
    public CharSequence f19154a;
    public CharSequence f19155b;
    public Intent f19156c;
    public char d;
    public int f19157e;
    public char f19158f;
    public int f19159g;
    public Drawable h;
    public Context f19160i;
    public CharSequence f19161j;
    public CharSequence f19162k;
    public ColorStateList f19163l;
    public PorterDuff.Mode f19164m;
    public boolean f19165n;
    public boolean f19166o;
    public int f19167p;

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
            if (this.f19165n || this.f19166o) {
                this.h = drawable;
                Drawable mutate = drawable.mutate();
                this.h = mutate;
                if (this.f19165n) {
                    mutate.setTintList(this.f19163l);
                }
                if (this.f19166o) {
                    this.h.setTintMode(this.f19164m);
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
        return this.f19159g;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f19158f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f19161j;
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
        return this.f19163l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f19164m;
    }

    @Override
    public final Intent getIntent() {
        return this.f19156c;
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
        return this.f19157e;
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
        return this.f19154a;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f19155b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f19154a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f19162k;
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
        if ((this.f19167p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f19167p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f19167p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        if ((this.f19167p & 8) == 0) {
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
        this.f19158f = Character.toLowerCase(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f19167p = (z10 ? 1 : 0) | (this.f19167p & (-2));
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        int i7;
        int i10 = this.f19167p & (-3);
        if (z10) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        this.f19167p = i7 | i10;
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f19161j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        int i7;
        int i10 = this.f19167p & (-17);
        if (z10) {
            i7 = 16;
        } else {
            i7 = 0;
        }
        this.f19167p = i7 | i10;
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
        this.f19163l = colorStateList;
        this.f19165n = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f19164m = mode;
        this.f19166o = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f19156c = intent;
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
        this.f19158f = Character.toLowerCase(c11);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f19154a = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f19155b = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f19162k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        int i7 = 8;
        int i10 = this.f19167p & 8;
        if (z10) {
            i7 = 0;
        }
        this.f19167p = i10 | i7;
        return this;
    }

    @Override
    public final MenuItem setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i7) {
        this.f19158f = Character.toLowerCase(c10);
        this.f19159g = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f19161j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i7) {
        this.d = c10;
        this.f19157e = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i7) {
        this.f19154a = this.f19160i.getResources().getString(i7);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f19162k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setIcon(int i7) {
        this.h = this.f19160i.getDrawable(i7);
        c();
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i7, int i10) {
        this.d = c10;
        this.f19157e = KeyEvent.normalizeMetaState(i7);
        this.f19158f = Character.toLowerCase(c11);
        this.f19159g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override
    public final void setShowAsAction(int i7) {
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i7) {
        return this;
    }
}
