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
import j7.h8;
public final class a implements l0.a {
    public CharSequence f10992a;
    public CharSequence f10993b;
    public Intent f10994c;
    public char d;
    public int e;
    public char f10995f;
    public int f10996g;
    public Drawable h;
    public Context f10997i;
    public CharSequence f10998j;
    public CharSequence f10999k;
    public ColorStateList f11000l;
    public PorterDuff.Mode f11001m;
    public boolean f11002n;
    public boolean f11003o;
    public int f11004p;

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
            if (this.f11002n || this.f11003o) {
                Drawable d = h8.d(drawable);
                this.h = d;
                Drawable mutate = d.mutate();
                this.h = mutate;
                if (this.f11002n) {
                    mutate.setTintList(this.f11000l);
                }
                if (this.f11003o) {
                    this.h.setTintMode(this.f11001m);
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
        return this.f10996g;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f10995f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f10998j;
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
        return this.f11000l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f11001m;
    }

    @Override
    public final Intent getIntent() {
        return this.f10994c;
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
        return this.f10992a;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f10993b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f10992a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f10999k;
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
        if ((this.f11004p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f11004p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f11004p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        if ((this.f11004p & 8) == 0) {
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
        this.f10995f = Character.toLowerCase(c3);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z4) {
        this.f11004p = (z4 ? 1 : 0) | (this.f11004p & (-2));
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z4) {
        int i10;
        int i11 = this.f11004p & (-3);
        if (z4) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f11004p = i10 | i11;
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f10998j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z4) {
        int i10;
        int i11 = this.f11004p & (-17);
        if (z4) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        this.f11004p = i10 | i11;
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
        this.f11000l = colorStateList;
        this.f11002n = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11001m = mode;
        this.f11003o = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f10994c = intent;
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
        this.f10995f = Character.toLowerCase(c10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f10992a = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f10993b = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f10999k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z4) {
        int i10 = 8;
        int i11 = this.f11004p & 8;
        if (z4) {
            i10 = 0;
        }
        this.f11004p = i11 | i10;
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c3, int i10) {
        this.f10995f = Character.toLowerCase(c3);
        this.f10996g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f10998j = charSequence;
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
        this.f10992a = this.f10997i.getResources().getString(i10);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f10999k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.h = this.f10997i.getDrawable(i10);
        c();
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c3, char c10, int i10, int i11) {
        this.d = c3;
        this.e = KeyEvent.normalizeMetaState(i10);
        this.f10995f = Character.toLowerCase(c10);
        this.f10996g = KeyEvent.normalizeMetaState(i11);
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
