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
public final class r extends g.p implements MenuItem {
    public final l0.a f19327c;
    public Method d;

    public r(Context context, l0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f19327c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public final boolean collapseActionView() {
        return this.f19327c.collapseActionView();
    }

    @Override
    public final boolean expandActionView() {
        return this.f19327c.expandActionView();
    }

    @Override
    public final ActionProvider getActionProvider() {
        n b10 = this.f19327c.b();
        if (b10 != null) {
            return b10.f19320a;
        }
        return null;
    }

    @Override
    public final View getActionView() {
        View actionView = this.f19327c.getActionView();
        if (actionView instanceof o) {
            return (View) ((o) actionView).f19322a;
        }
        return actionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f19327c.getAlphabeticModifiers();
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f19327c.getAlphabeticShortcut();
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f19327c.getContentDescription();
    }

    @Override
    public final int getGroupId() {
        return this.f19327c.getGroupId();
    }

    @Override
    public final Drawable getIcon() {
        return this.f19327c.getIcon();
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f19327c.getIconTintList();
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f19327c.getIconTintMode();
    }

    @Override
    public final Intent getIntent() {
        return this.f19327c.getIntent();
    }

    @Override
    public final int getItemId() {
        return this.f19327c.getItemId();
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f19327c.getMenuInfo();
    }

    @Override
    public final int getNumericModifiers() {
        return this.f19327c.getNumericModifiers();
    }

    @Override
    public final char getNumericShortcut() {
        return this.f19327c.getNumericShortcut();
    }

    @Override
    public final int getOrder() {
        return this.f19327c.getOrder();
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f19327c.getSubMenu();
    }

    @Override
    public final CharSequence getTitle() {
        return this.f19327c.getTitle();
    }

    @Override
    public final CharSequence getTitleCondensed() {
        return this.f19327c.getTitleCondensed();
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f19327c.getTooltipText();
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f19327c.hasSubMenu();
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.f19327c.isActionViewExpanded();
    }

    @Override
    public final boolean isCheckable() {
        return this.f19327c.isCheckable();
    }

    @Override
    public final boolean isChecked() {
        return this.f19327c.isChecked();
    }

    @Override
    public final boolean isEnabled() {
        return this.f19327c.isEnabled();
    }

    @Override
    public final boolean isVisible() {
        return this.f19327c.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        n nVar = new n(this, actionProvider);
        if (actionProvider == null) {
            nVar = null;
        }
        this.f19327c.a(nVar);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new o(view);
        }
        this.f19327c.setActionView(view);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f19327c.setAlphabeticShortcut(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f19327c.setCheckable(z10);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        this.f19327c.setChecked(z10);
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f19327c.setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        this.f19327c.setEnabled(z10);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f19327c.setIcon(drawable);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f19327c.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f19327c.setIconTintMode(mode);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f19327c.setIntent(intent);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        this.f19327c.setNumericShortcut(c10);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        p pVar;
        if (onActionExpandListener != null) {
            pVar = new p(this, onActionExpandListener);
        } else {
            pVar = null;
        }
        this.f19327c.setOnActionExpandListener(pVar);
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        q qVar;
        if (onMenuItemClickListener != null) {
            qVar = new q(this, onMenuItemClickListener);
        } else {
            qVar = null;
        }
        this.f19327c.setOnMenuItemClickListener(qVar);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.f19327c.setShortcut(c10, c11);
        return this;
    }

    @Override
    public final void setShowAsAction(int i7) {
        this.f19327c.setShowAsAction(i7);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i7) {
        this.f19327c.setShowAsActionFlags(i7);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f19327c.setTitle(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f19327c.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f19327c.setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        return this.f19327c.setVisible(z10);
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i7) {
        this.f19327c.setAlphabeticShortcut(c10, i7);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i7) {
        this.f19327c.setIcon(i7);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i7) {
        this.f19327c.setNumericShortcut(c10, i7);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i7, int i10) {
        this.f19327c.setShortcut(c10, c11, i7, i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i7) {
        this.f19327c.setTitle(i7);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i7) {
        l0.a aVar = this.f19327c;
        aVar.setActionView(i7);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new o(actionView));
        }
        return this;
    }
}
