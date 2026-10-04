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
import v7.r8;
public final class a implements l0.a {
    public CharSequence f15118a;
    public CharSequence f15119b;
    public Intent f15120c;
    public char d;
    public int f15121e;
    public char f15122f;
    public int f15123g;
    public Drawable h;
    public Context f15124i;
    public CharSequence f15125j;
    public CharSequence f15126k;
    public ColorStateList f15127l;
    public PorterDuff.Mode f15128m;
    public boolean f15129n;
    public boolean f15130o;
    public int f15131p;

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
            if (this.f15129n || this.f15130o) {
                Drawable d = r8.d(drawable);
                this.h = d;
                Drawable mutate = d.mutate();
                this.h = mutate;
                if (this.f15129n) {
                    mutate.setTintList(this.f15127l);
                }
                if (this.f15130o) {
                    this.h.setTintMode(this.f15128m);
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
        return this.f15123g;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f15122f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f15125j;
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
        return this.f15127l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f15128m;
    }

    @Override
    public final Intent getIntent() {
        return this.f15120c;
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
        return this.f15121e;
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
        return this.f15118a;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15119b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f15118a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f15126k;
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
        if ((this.f15131p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f15131p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f15131p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        if ((this.f15131p & 8) == 0) {
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
        this.f15122f = Character.toLowerCase(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f15131p = (z10 ? 1 : 0) | (this.f15131p & (-2));
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        int i10;
        int i11 = this.f15131p & (-3);
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f15131p = i10 | i11;
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f15125j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        int i10;
        int i11 = this.f15131p & (-17);
        if (z10) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        this.f15131p = i10 | i11;
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
        this.f15127l = colorStateList;
        this.f15129n = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15128m = mode;
        this.f15130o = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f15120c = intent;
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
        this.f15122f = Character.toLowerCase(c11);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f15118a = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15119b = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f15126k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f15131p & 8;
        if (z10) {
            i10 = 0;
        }
        this.f15131p = i11 | i10;
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f15122f = Character.toLowerCase(c10);
        this.f15123g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f15125j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.d = c10;
        this.f15121e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f15118a = this.f15124i.getResources().getString(i10);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f15126k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.h = this.f15124i.getDrawable(i10);
        c();
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.d = c10;
        this.f15121e = KeyEvent.normalizeMetaState(i10);
        this.f15122f = Character.toLowerCase(c11);
        this.f15123g = KeyEvent.normalizeMetaState(i11);
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
