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
    public final l0.a f19228c;
    public Method d;

    public r(Context context, l0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f19228c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public final boolean collapseActionView() {
        return this.f19228c.collapseActionView();
    }

    @Override
    public final boolean expandActionView() {
        return this.f19228c.expandActionView();
    }

    @Override
    public final ActionProvider getActionProvider() {
        n b10 = this.f19228c.b();
        if (b10 != null) {
            return b10.f19221a;
        }
        return null;
    }

    @Override
    public final View getActionView() {
        View actionView = this.f19228c.getActionView();
        if (actionView instanceof o) {
            return (View) ((o) actionView).f19223a;
        }
        return actionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f19228c.getAlphabeticModifiers();
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f19228c.getAlphabeticShortcut();
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f19228c.getContentDescription();
    }

    @Override
    public final int getGroupId() {
        return this.f19228c.getGroupId();
    }

    @Override
    public final Drawable getIcon() {
        return this.f19228c.getIcon();
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f19228c.getIconTintList();
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f19228c.getIconTintMode();
    }

    @Override
    public final Intent getIntent() {
        return this.f19228c.getIntent();
    }

    @Override
    public final int getItemId() {
        return this.f19228c.getItemId();
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f19228c.getMenuInfo();
    }

    @Override
    public final int getNumericModifiers() {
        return this.f19228c.getNumericModifiers();
    }

    @Override
    public final char getNumericShortcut() {
        return this.f19228c.getNumericShortcut();
    }

    @Override
    public final int getOrder() {
        return this.f19228c.getOrder();
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f19228c.getSubMenu();
    }

    @Override
    public final CharSequence getTitle() {
        return this.f19228c.getTitle();
    }

    @Override
    public final CharSequence getTitleCondensed() {
        return this.f19228c.getTitleCondensed();
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f19228c.getTooltipText();
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f19228c.hasSubMenu();
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.f19228c.isActionViewExpanded();
    }

    @Override
    public final boolean isCheckable() {
        return this.f19228c.isCheckable();
    }

    @Override
    public final boolean isChecked() {
        return this.f19228c.isChecked();
    }

    @Override
    public final boolean isEnabled() {
        return this.f19228c.isEnabled();
    }

    @Override
    public final boolean isVisible() {
        return this.f19228c.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        n nVar = new n(this, actionProvider);
        if (actionProvider == null) {
            nVar = null;
        }
        this.f19228c.a(nVar);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new o(view);
        }
        this.f19228c.setActionView(view);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f19228c.setAlphabeticShortcut(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f19228c.setCheckable(z10);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        this.f19228c.setChecked(z10);
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f19228c.setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        this.f19228c.setEnabled(z10);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f19228c.setIcon(drawable);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f19228c.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f19228c.setIconTintMode(mode);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f19228c.setIntent(intent);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        this.f19228c.setNumericShortcut(c10);
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
        this.f19228c.setOnActionExpandListener(pVar);
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
        this.f19228c.setOnMenuItemClickListener(qVar);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.f19228c.setShortcut(c10, c11);
        return this;
    }

    @Override
    public final void setShowAsAction(int i7) {
        this.f19228c.setShowAsAction(i7);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i7) {
        this.f19228c.setShowAsActionFlags(i7);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f19228c.setTitle(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f19228c.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f19228c.setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        return this.f19228c.setVisible(z10);
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i7) {
        this.f19228c.setAlphabeticShortcut(c10, i7);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i7) {
        this.f19228c.setIcon(i7);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i7) {
        this.f19228c.setNumericShortcut(c10, i7);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i7, int i10) {
        this.f19228c.setShortcut(c10, c11, i7, i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i7) {
        this.f19228c.setTitle(i7);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i7) {
        l0.a aVar = this.f19228c;
        aVar.setActionView(i7);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new o(actionView));
        }
        return this;
    }
}
