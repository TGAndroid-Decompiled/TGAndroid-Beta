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
import g7.k8;

public final class a implements l0.a {

    public CharSequence f15255a;

    public CharSequence f15256b;

    public Intent f15257c;
    public char d;

    public int f15258e;

    public char f15259f;

    public int f15260g;
    public Drawable h;

    public Context f15261i;

    public CharSequence f15262j;

    public CharSequence f15263k;

    public ColorStateList f15264l;

    public PorterDuff.Mode f15265m;

    public boolean f15266n;

    public boolean f15267o;

    public int f15268p;

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
            if (this.f15266n || this.f15267o) {
                Drawable drawableD = k8.d(drawable);
                this.h = drawableD;
                Drawable drawableMutate = drawableD.mutate();
                this.h = drawableMutate;
                if (this.f15266n) {
                    drawableMutate.setTintList(this.f15264l);
                }
                if (this.f15267o) {
                    this.h.setTintMode(this.f15265m);
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
        return this.f15260g;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f15259f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f15262j;
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
        return this.f15264l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f15265m;
    }

    @Override
    public final Intent getIntent() {
        return this.f15257c;
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
        return this.f15258e;
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
        return this.f15255a;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15256b;
        return charSequence != null ? charSequence : this.f15255a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f15263k;
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
        return (this.f15268p & 1) != 0;
    }

    @Override
    public final boolean isChecked() {
        return (this.f15268p & 2) != 0;
    }

    @Override
    public final boolean isEnabled() {
        return (this.f15268p & 16) != 0;
    }

    @Override
    public final boolean isVisible() {
        return (this.f15268p & 8) == 0;
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
        this.f15259f = Character.toLowerCase(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f15268p = (z10 ? 1 : 0) | (this.f15268p & (-2));
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        this.f15268p = (z10 ? 2 : 0) | (this.f15268p & (-3));
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f15262j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        this.f15268p = (z10 ? 16 : 0) | (this.f15268p & (-17));
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
        this.f15264l = colorStateList;
        this.f15266n = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15265m = mode;
        this.f15267o = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f15257c = intent;
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
        this.f15259f = Character.toLowerCase(c11);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f15255a = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15256b = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f15263k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        this.f15268p = (this.f15268p & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f15259f = Character.toLowerCase(c10);
        this.f15260g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f15262j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.d = c10;
        this.f15258e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f15255a = this.f15261i.getResources().getString(i10);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f15263k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.h = this.f15261i.getDrawable(i10);
        c();
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.d = c10;
        this.f15258e = KeyEvent.normalizeMetaState(i10);
        this.f15259f = Character.toLowerCase(c11);
        this.f15260g = KeyEvent.normalizeMetaState(i11);
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
