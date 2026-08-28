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
import f7.q8;
public final class a implements l0.a {
    public CharSequence f16501a;
    public CharSequence f16502b;
    public Intent f16503c;
    public char d;
    public int f16504e;
    public char f16505f;
    public int f16506g;
    public Drawable h;
    public Context f16507i;
    public CharSequence f16508j;
    public CharSequence f16509k;
    public ColorStateList f16510l;
    public PorterDuff.Mode f16511m;
    public boolean f16512n;
    public boolean f16513o;
    public int f16514p;

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
            if (this.f16512n || this.f16513o) {
                Drawable d = q8.d(drawable);
                this.h = d;
                Drawable mutate = d.mutate();
                this.h = mutate;
                if (this.f16512n) {
                    mutate.setTintList(this.f16510l);
                }
                if (this.f16513o) {
                    this.h.setTintMode(this.f16511m);
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
        return this.f16506g;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f16505f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f16508j;
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
        return this.f16510l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f16511m;
    }

    @Override
    public final Intent getIntent() {
        return this.f16503c;
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
        return this.f16504e;
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
        return this.f16501a;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f16502b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f16501a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f16509k;
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
        if ((this.f16514p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f16514p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f16514p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        if ((this.f16514p & 8) == 0) {
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
        this.f16505f = Character.toLowerCase(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f16514p = (z10 ? 1 : 0) | (this.f16514p & (-2));
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        int i9;
        int i10 = this.f16514p & (-3);
        if (z10) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        this.f16514p = i9 | i10;
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f16508j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        int i9;
        int i10 = this.f16514p & (-17);
        if (z10) {
            i9 = 16;
        } else {
            i9 = 0;
        }
        this.f16514p = i9 | i10;
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
        this.f16510l = colorStateList;
        this.f16512n = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f16511m = mode;
        this.f16513o = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f16503c = intent;
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
        this.f16505f = Character.toLowerCase(c11);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f16501a = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f16502b = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f16509k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        int i9 = 8;
        int i10 = this.f16514p & 8;
        if (z10) {
            i9 = 0;
        }
        this.f16514p = i10 | i9;
        return this;
    }

    @Override
    public final MenuItem setActionView(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i9) {
        this.f16505f = Character.toLowerCase(c10);
        this.f16506g = KeyEvent.normalizeMetaState(i9);
        return this;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f16508j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i9) {
        this.d = c10;
        this.f16504e = KeyEvent.normalizeMetaState(i9);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i9) {
        this.f16501a = this.f16507i.getResources().getString(i9);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f16509k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setIcon(int i9) {
        this.h = this.f16507i.getDrawable(i9);
        c();
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i9, int i10) {
        this.d = c10;
        this.f16504e = KeyEvent.normalizeMetaState(i9);
        this.f16505f = Character.toLowerCase(c11);
        this.f16506g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override
    public final void setShowAsAction(int i9) {
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i9) {
        return this;
    }
}
