package defpackage;

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
public final class v8 implements aeb {
    public CharSequence a;
    public CharSequence b;
    public Intent c;
    public char d;
    public int e;
    public char f;
    public int g;
    public Drawable h;
    public Context i;
    public CharSequence j;
    public CharSequence k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public boolean n;
    public boolean o;
    public int p;

    @Override
    public final aeb a(d27 d27Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final d27 b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.n || this.o) {
                this.h = drawable;
                Drawable mutate = drawable.mutate();
                this.h = mutate;
                if (this.n) {
                    mutate.setTintList(this.l);
                }
                if (this.o) {
                    this.h.setTintMode(this.m);
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
        return this.g;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.j;
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
        return this.l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    @Override
    public final Intent getIntent() {
        return this.c;
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
        return this.a;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.k;
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
        if ((this.p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        if ((this.p & 8) == 0) {
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
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f = Character.toLowerCase(c);
        this.g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z) {
        this.p = (this.p & (-2)) | (z ? 1 : 0);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z) {
        int i;
        int i2 = this.p & (-3);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.p = i2 | i;
        return this;
    }

    @Override
    public final aeb setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z) {
        int i;
        int i2 = this.p & (-17);
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        this.p = i2 | i;
        return this;
    }

    @Override
    public final MenuItem setIcon(int i) {
        this.h = this.i.getDrawable(i);
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.n = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.o = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c, int i) {
        this.d = c;
        this.e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.d = c;
        this.e = KeyEvent.normalizeMetaState(i);
        this.f = Character.toLowerCase(c2);
        this.g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i) {
        this.a = this.i.getResources().getString(i);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    @Override
    public final aeb setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.p & 8;
        if (z) {
            i = 0;
        }
        this.p = i2 | i;
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setNumericShortcut(char c) {
        this.d = c;
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f = Character.toLowerCase(c);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c, char c2) {
        this.d = c;
        this.f = Character.toLowerCase(c2);
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override
    public final void setShowAsAction(int i) {
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
