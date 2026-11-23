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
    public CharSequence f19219a;
    public CharSequence f19220b;
    public Intent f19221c;
    public char d;
    public int f19222e;
    public char f19223f;
    public int f19224g;
    public Drawable h;
    public Context f19225i;
    public CharSequence f19226j;
    public CharSequence f19227k;
    public ColorStateList f19228l;
    public PorterDuff.Mode f19229m;
    public boolean f19230n;
    public boolean f19231o;
    public int f19232p;

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
            if (this.f19230n || this.f19231o) {
                this.h = drawable;
                Drawable mutate = drawable.mutate();
                this.h = mutate;
                if (this.f19230n) {
                    mutate.setTintList(this.f19228l);
                }
                if (this.f19231o) {
                    this.h.setTintMode(this.f19229m);
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
        return this.f19224g;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f19223f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f19226j;
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
        return this.f19228l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f19229m;
    }

    @Override
    public final Intent getIntent() {
        return this.f19221c;
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
        return this.f19222e;
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
        return this.f19219a;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f19220b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f19219a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f19227k;
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
        if ((this.f19232p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f19232p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f19232p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        if ((this.f19232p & 8) == 0) {
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
        this.f19223f = Character.toLowerCase(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f19232p = (z10 ? 1 : 0) | (this.f19232p & (-2));
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        int i7;
        int i10 = this.f19232p & (-3);
        if (z10) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        this.f19232p = i7 | i10;
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f19226j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        int i7;
        int i10 = this.f19232p & (-17);
        if (z10) {
            i7 = 16;
        } else {
            i7 = 0;
        }
        this.f19232p = i7 | i10;
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
        this.f19228l = colorStateList;
        this.f19230n = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f19229m = mode;
        this.f19231o = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f19221c = intent;
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
        this.f19223f = Character.toLowerCase(c11);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f19219a = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f19220b = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f19227k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        int i7 = 8;
        int i10 = this.f19232p & 8;
        if (z10) {
            i7 = 0;
        }
        this.f19232p = i10 | i7;
        return this;
    }

    @Override
    public final MenuItem setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i7) {
        this.f19223f = Character.toLowerCase(c10);
        this.f19224g = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f19226j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i7) {
        this.d = c10;
        this.f19222e = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i7) {
        this.f19219a = this.f19225i.getResources().getString(i7);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f19227k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setIcon(int i7) {
        this.h = this.f19225i.getDrawable(i7);
        c();
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i7, int i10) {
        this.d = c10;
        this.f19222e = KeyEvent.normalizeMetaState(i7);
        this.f19223f = Character.toLowerCase(c11);
        this.f19224g = KeyEvent.normalizeMetaState(i10);
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
