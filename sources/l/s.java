package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

public final class s extends f2.w implements MenuItem {

    public final l0.a f15364c;
    public Method d;

    public s(Context context, l0.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f15364c = aVar;
    }

    @Override
    public final boolean collapseActionView() {
        return this.f15364c.collapseActionView();
    }

    @Override
    public final boolean expandActionView() {
        return this.f15364c.expandActionView();
    }

    @Override
    public final ActionProvider getActionProvider() {
        o oVarB = this.f15364c.b();
        if (oVarB != null) {
            return oVarB.f15357a;
        }
        return null;
    }

    @Override
    public final View getActionView() {
        View actionView = this.f15364c.getActionView();
        return actionView instanceof p ? (View) ((p) actionView).f15359a : actionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f15364c.getAlphabeticModifiers();
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f15364c.getAlphabeticShortcut();
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f15364c.getContentDescription();
    }

    @Override
    public final int getGroupId() {
        return this.f15364c.getGroupId();
    }

    @Override
    public final Drawable getIcon() {
        return this.f15364c.getIcon();
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f15364c.getIconTintList();
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f15364c.getIconTintMode();
    }

    @Override
    public final Intent getIntent() {
        return this.f15364c.getIntent();
    }

    @Override
    public final int getItemId() {
        return this.f15364c.getItemId();
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f15364c.getMenuInfo();
    }

    @Override
    public final int getNumericModifiers() {
        return this.f15364c.getNumericModifiers();
    }

    @Override
    public final char getNumericShortcut() {
        return this.f15364c.getNumericShortcut();
    }

    @Override
    public final int getOrder() {
        return this.f15364c.getOrder();
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f15364c.getSubMenu();
    }

    @Override
    public final CharSequence getTitle() {
        return this.f15364c.getTitle();
    }

    @Override
    public final CharSequence getTitleCondensed() {
        return this.f15364c.getTitleCondensed();
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f15364c.getTooltipText();
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f15364c.hasSubMenu();
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.f15364c.isActionViewExpanded();
    }

    @Override
    public final boolean isCheckable() {
        return this.f15364c.isCheckable();
    }

    @Override
    public final boolean isChecked() {
        return this.f15364c.isChecked();
    }

    @Override
    public final boolean isEnabled() {
        return this.f15364c.isEnabled();
    }

    @Override
    public final boolean isVisible() {
        return this.f15364c.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        o oVar = new o(this, actionProvider);
        if (actionProvider == null) {
            oVar = null;
        }
        this.f15364c.a(oVar);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new p(view);
        }
        this.f15364c.setActionView(view);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f15364c.setAlphabeticShortcut(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f15364c.setCheckable(z10);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        this.f15364c.setChecked(z10);
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f15364c.setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        this.f15364c.setEnabled(z10);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f15364c.setIcon(drawable);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15364c.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15364c.setIconTintMode(mode);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f15364c.setIntent(intent);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        this.f15364c.setNumericShortcut(c10);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15364c.setOnActionExpandListener(onActionExpandListener != null ? new q(this, onActionExpandListener) : null);
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15364c.setOnMenuItemClickListener(onMenuItemClickListener != null ? new r(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.f15364c.setShortcut(c10, c11);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        this.f15364c.setShowAsAction(i10);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        this.f15364c.setShowAsActionFlags(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f15364c.setTitle(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15364c.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f15364c.setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        return this.f15364c.setVisible(z10);
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f15364c.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f15364c.setIcon(i10);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f15364c.setNumericShortcut(c10, i10);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f15364c.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f15364c.setTitle(i10);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        l0.a aVar = this.f15364c;
        aVar.setActionView(i10);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new p(actionView));
        }
        return this;
    }
}
