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
    public CharSequence f11342a;
    public CharSequence f11343b;
    public Intent f11344c;
    public char d;
    public int f11345e;
    public char f11346f;
    public int f11347g;
    public Drawable h;
    public Context f11348i;
    public CharSequence f11349j;
    public CharSequence f11350k;
    public ColorStateList f11351l;
    public PorterDuff.Mode f11352m;
    public boolean f11353n;
    public boolean f11354o;
    public int f11355p;

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
            if (this.f11353n || this.f11354o) {
                Drawable d = i8.d(drawable);
                this.h = d;
                Drawable mutate = d.mutate();
                this.h = mutate;
                if (this.f11353n) {
                    mutate.setTintList(this.f11351l);
                }
                if (this.f11354o) {
                    this.h.setTintMode(this.f11352m);
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
        return this.f11347g;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f11346f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f11349j;
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
        return this.f11351l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f11352m;
    }

    @Override
    public final Intent getIntent() {
        return this.f11344c;
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
        return this.f11345e;
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
        return this.f11342a;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f11343b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f11342a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f11350k;
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
        if ((this.f11355p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f11355p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f11355p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        if ((this.f11355p & 8) == 0) {
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
        this.f11346f = Character.toLowerCase(c3);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z4) {
        this.f11355p = (z4 ? 1 : 0) | (this.f11355p & (-2));
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z4) {
        int i10;
        int i11 = this.f11355p & (-3);
        if (z4) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f11355p = i10 | i11;
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f11349j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z4) {
        int i10;
        int i11 = this.f11355p & (-17);
        if (z4) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        this.f11355p = i10 | i11;
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
        this.f11351l = colorStateList;
        this.f11353n = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11352m = mode;
        this.f11354o = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f11344c = intent;
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
        this.f11346f = Character.toLowerCase(c10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f11342a = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11343b = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f11350k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z4) {
        int i10 = 8;
        int i11 = this.f11355p & 8;
        if (z4) {
            i10 = 0;
        }
        this.f11355p = i11 | i10;
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c3, int i10) {
        this.f11346f = Character.toLowerCase(c3);
        this.f11347g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f11349j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c3, int i10) {
        this.d = c3;
        this.f11345e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f11342a = this.f11348i.getResources().getString(i10);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f11350k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.h = this.f11348i.getDrawable(i10);
        c();
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c3, char c10, int i10, int i11) {
        this.d = c3;
        this.f11345e = KeyEvent.normalizeMetaState(i10);
        this.f11346f = Character.toLowerCase(c10);
        this.f11347g = KeyEvent.normalizeMetaState(i11);
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
