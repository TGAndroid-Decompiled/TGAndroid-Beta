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
import j7.i8;
public final class a implements l0.a {
    public CharSequence f11102a;
    public CharSequence f11103b;
    public Intent f11104c;
    public char d;
    public int e;
    public char f11105f;
    public int f11106g;
    public Drawable h;
    public Context f11107i;
    public CharSequence f11108j;
    public CharSequence f11109k;
    public ColorStateList f11110l;
    public PorterDuff.Mode f11111m;
    public boolean f11112n;
    public boolean f11113o;
    public int f11114p;

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
            if (this.f11112n || this.f11113o) {
                Drawable d = i8.d(drawable);
                this.h = d;
                Drawable mutate = d.mutate();
                this.h = mutate;
                if (this.f11112n) {
                    mutate.setTintList(this.f11110l);
                }
                if (this.f11113o) {
                    this.h.setTintMode(this.f11111m);
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
        return this.f11106g;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f11105f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f11108j;
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
        return this.f11110l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f11111m;
    }

    @Override
    public final Intent getIntent() {
        return this.f11104c;
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
        return this.f11102a;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f11103b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f11102a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f11109k;
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
        if ((this.f11114p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f11114p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f11114p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        if ((this.f11114p & 8) == 0) {
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
        this.f11105f = Character.toLowerCase(c3);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z4) {
        this.f11114p = (z4 ? 1 : 0) | (this.f11114p & (-2));
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z4) {
        int i10;
        int i11 = this.f11114p & (-3);
        if (z4) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f11114p = i10 | i11;
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f11108j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z4) {
        int i10;
        int i11 = this.f11114p & (-17);
        if (z4) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        this.f11114p = i10 | i11;
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
        this.f11110l = colorStateList;
        this.f11112n = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11111m = mode;
        this.f11113o = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f11104c = intent;
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
    public final MenuItem setShortcut(char c3, char c10) {
        this.d = c3;
        this.f11105f = Character.toLowerCase(c10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f11102a = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11103b = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f11109k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z4) {
        int i10 = 8;
        int i11 = this.f11114p & 8;
        if (z4) {
            i10 = 0;
        }
        this.f11114p = i11 | i10;
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c3, int i10) {
        this.f11105f = Character.toLowerCase(c3);
        this.f11106g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f11108j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c3, int i10) {
        this.d = c3;
        this.e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f11102a = this.f11107i.getResources().getString(i10);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f11109k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.h = this.f11107i.getDrawable(i10);
        c();
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c3, char c10, int i10, int i11) {
        this.d = c3;
        this.e = KeyEvent.normalizeMetaState(i10);
        this.f11105f = Character.toLowerCase(c10);
        this.f11106g = KeyEvent.normalizeMetaState(i11);
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
