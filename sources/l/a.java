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
    public CharSequence f17617a;
    public CharSequence f17618b;
    public Intent f17619c;
    public char d;
    public int f17620e;
    public char f17621f;
    public int f17622g;
    public Drawable h;
    public Context f17623i;
    public CharSequence f17624j;
    public CharSequence f17625k;
    public ColorStateList f17626l;
    public PorterDuff.Mode f17627m;
    public boolean f17628n;
    public boolean f17629o;
    public int f17630p;

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
            if (this.f17628n || this.f17629o) {
                this.h = drawable;
                Drawable mutate = drawable.mutate();
                this.h = mutate;
                if (this.f17628n) {
                    mutate.setTintList(this.f17626l);
                }
                if (this.f17629o) {
                    this.h.setTintMode(this.f17627m);
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
        return this.f17622g;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f17621f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f17624j;
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
        return this.f17626l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f17627m;
    }

    @Override
    public final Intent getIntent() {
        return this.f17619c;
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
        return this.f17620e;
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
        return this.f17617a;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f17618b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f17617a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f17625k;
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
        if ((this.f17630p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f17630p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f17630p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        if ((this.f17630p & 8) == 0) {
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
        this.f17621f = Character.toLowerCase(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z9) {
        this.f17630p = (z9 ? 1 : 0) | (this.f17630p & (-2));
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z9) {
        int i7;
        int i10 = this.f17630p & (-3);
        if (z9) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        this.f17630p = i7 | i10;
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f17624j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z9) {
        int i7;
        int i10 = this.f17630p & (-17);
        if (z9) {
            i7 = 16;
        } else {
            i7 = 0;
        }
        this.f17630p = i7 | i10;
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
        this.f17626l = colorStateList;
        this.f17628n = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f17627m = mode;
        this.f17629o = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f17619c = intent;
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
        this.f17621f = Character.toLowerCase(c11);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f17617a = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f17618b = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f17625k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z9) {
        int i7 = 8;
        int i10 = this.f17630p & 8;
        if (z9) {
            i7 = 0;
        }
        this.f17630p = i10 | i7;
        return this;
    }

    @Override
    public final MenuItem setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i7) {
        this.f17621f = Character.toLowerCase(c10);
        this.f17622g = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f17624j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i7) {
        this.d = c10;
        this.f17620e = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i7) {
        this.f17617a = this.f17623i.getResources().getString(i7);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f17625k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setIcon(int i7) {
        this.h = this.f17623i.getDrawable(i7);
        c();
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i7, int i10) {
        this.d = c10;
        this.f17620e = KeyEvent.normalizeMetaState(i7);
        this.f17621f = Character.toLowerCase(c11);
        this.f17622g = KeyEvent.normalizeMetaState(i10);
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
