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
public final class r extends f2.v implements MenuItem {
    public final l0.a f11092c;
    public Method d;

    public r(Context context, l0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f11092c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public final boolean collapseActionView() {
        return this.f11092c.collapseActionView();
    }

    @Override
    public final boolean expandActionView() {
        return this.f11092c.expandActionView();
    }

    @Override
    public final ActionProvider getActionProvider() {
        n b10 = this.f11092c.b();
        if (b10 != null) {
            return b10.f11085a;
        }
        return null;
    }

    @Override
    public final View getActionView() {
        View actionView = this.f11092c.getActionView();
        if (actionView instanceof o) {
            return (View) ((o) actionView).f11087a;
        }
        return actionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f11092c.getAlphabeticModifiers();
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f11092c.getAlphabeticShortcut();
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f11092c.getContentDescription();
    }

    @Override
    public final int getGroupId() {
        return this.f11092c.getGroupId();
    }

    @Override
    public final Drawable getIcon() {
        return this.f11092c.getIcon();
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f11092c.getIconTintList();
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f11092c.getIconTintMode();
    }

    @Override
    public final Intent getIntent() {
        return this.f11092c.getIntent();
    }

    @Override
    public final int getItemId() {
        return this.f11092c.getItemId();
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f11092c.getMenuInfo();
    }

    @Override
    public final int getNumericModifiers() {
        return this.f11092c.getNumericModifiers();
    }

    @Override
    public final char getNumericShortcut() {
        return this.f11092c.getNumericShortcut();
    }

    @Override
    public final int getOrder() {
        return this.f11092c.getOrder();
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f11092c.getSubMenu();
    }

    @Override
    public final CharSequence getTitle() {
        return this.f11092c.getTitle();
    }

    @Override
    public final CharSequence getTitleCondensed() {
        return this.f11092c.getTitleCondensed();
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f11092c.getTooltipText();
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f11092c.hasSubMenu();
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.f11092c.isActionViewExpanded();
    }

    @Override
    public final boolean isCheckable() {
        return this.f11092c.isCheckable();
    }

    @Override
    public final boolean isChecked() {
        return this.f11092c.isChecked();
    }

    @Override
    public final boolean isEnabled() {
        return this.f11092c.isEnabled();
    }

    @Override
    public final boolean isVisible() {
        return this.f11092c.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        n nVar = new n(this, actionProvider);
        if (actionProvider == null) {
            nVar = null;
        }
        this.f11092c.a(nVar);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new o(view);
        }
        this.f11092c.setActionView(view);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c3) {
        this.f11092c.setAlphabeticShortcut(c3);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z4) {
        this.f11092c.setCheckable(z4);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z4) {
        this.f11092c.setChecked(z4);
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f11092c.setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z4) {
        this.f11092c.setEnabled(z4);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f11092c.setIcon(drawable);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11092c.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11092c.setIconTintMode(mode);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f11092c.setIntent(intent);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c3) {
        this.f11092c.setNumericShortcut(c3);
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
        this.f11092c.setOnActionExpandListener(pVar);
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
        this.f11092c.setOnMenuItemClickListener(qVar);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c3, char c10) {
        this.f11092c.setShortcut(c3, c10);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        this.f11092c.setShowAsAction(i10);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        this.f11092c.setShowAsActionFlags(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f11092c.setTitle(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11092c.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f11092c.setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z4) {
        return this.f11092c.setVisible(z4);
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c3, int i10) {
        this.f11092c.setAlphabeticShortcut(c3, i10);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f11092c.setIcon(i10);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c3, int i10) {
        this.f11092c.setNumericShortcut(c3, i10);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c3, char c10, int i10, int i11) {
        this.f11092c.setShortcut(c3, c10, i10, i11);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f11092c.setTitle(i10);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        l0.a aVar = this.f11092c;
        aVar.setActionView(i10);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new o(actionView));
        }
        return this;
    }
}
