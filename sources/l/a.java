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
    public CharSequence f17620a;
    public CharSequence f17621b;
    public Intent f17622c;
    public char d;
    public int f17623e;
    public char f17624f;
    public int f17625g;
    public Drawable h;
    public Context f17626i;
    public CharSequence f17627j;
    public CharSequence f17628k;
    public ColorStateList f17629l;
    public PorterDuff.Mode f17630m;
    public boolean f17631n;
    public boolean f17632o;
    public int f17633p;

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
            if (this.f17631n || this.f17632o) {
                this.h = drawable;
                Drawable mutate = drawable.mutate();
                this.h = mutate;
                if (this.f17631n) {
                    mutate.setTintList(this.f17629l);
                }
                if (this.f17632o) {
                    this.h.setTintMode(this.f17630m);
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
        return this.f17625g;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f17624f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f17627j;
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
        return this.f17629l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f17630m;
    }

    @Override
    public final Intent getIntent() {
        return this.f17622c;
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
        return this.f17623e;
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
        return this.f17620a;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f17621b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f17620a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f17628k;
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
        if ((this.f17633p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f17633p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f17633p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        if ((this.f17633p & 8) == 0) {
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
        this.f17624f = Character.toLowerCase(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z9) {
        this.f17633p = (z9 ? 1 : 0) | (this.f17633p & (-2));
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z9) {
        int i7;
        int i10 = this.f17633p & (-3);
        if (z9) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        this.f17633p = i7 | i10;
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f17627j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z9) {
        int i7;
        int i10 = this.f17633p & (-17);
        if (z9) {
            i7 = 16;
        } else {
            i7 = 0;
        }
        this.f17633p = i7 | i10;
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
        this.f17629l = colorStateList;
        this.f17631n = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f17630m = mode;
        this.f17632o = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f17622c = intent;
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
        this.f17624f = Character.toLowerCase(c11);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f17620a = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f17621b = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f17628k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z9) {
        int i7 = 8;
        int i10 = this.f17633p & 8;
        if (z9) {
            i7 = 0;
        }
        this.f17633p = i10 | i7;
        return this;
    }

    @Override
    public final MenuItem setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i7) {
        this.f17624f = Character.toLowerCase(c10);
        this.f17625g = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f17627j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i7) {
        this.d = c10;
        this.f17623e = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i7) {
        this.f17620a = this.f17626i.getResources().getString(i7);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f17628k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setIcon(int i7) {
        this.h = this.f17626i.getDrawable(i7);
        c();
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i7, int i10) {
        this.d = c10;
        this.f17623e = KeyEvent.normalizeMetaState(i7);
        this.f17624f = Character.toLowerCase(c11);
        this.f17625g = KeyEvent.normalizeMetaState(i10);
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
