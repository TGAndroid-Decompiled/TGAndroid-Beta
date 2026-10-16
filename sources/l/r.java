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
public final class r extends g.o implements MenuItem {
    public final l0.a f14467c;
    public Method d;

    public r(Context context, l0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f14467c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public final boolean collapseActionView() {
        return this.f14467c.collapseActionView();
    }

    @Override
    public final boolean expandActionView() {
        return this.f14467c.expandActionView();
    }

    @Override
    public final ActionProvider getActionProvider() {
        n b10 = this.f14467c.b();
        if (b10 != null) {
            return b10.f14460a;
        }
        return null;
    }

    @Override
    public final View getActionView() {
        View actionView = this.f14467c.getActionView();
        if (actionView instanceof o) {
            return (View) ((o) actionView).f14462a;
        }
        return actionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f14467c.getAlphabeticModifiers();
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f14467c.getAlphabeticShortcut();
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f14467c.getContentDescription();
    }

    @Override
    public final int getGroupId() {
        return this.f14467c.getGroupId();
    }

    @Override
    public final Drawable getIcon() {
        return this.f14467c.getIcon();
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f14467c.getIconTintList();
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f14467c.getIconTintMode();
    }

    @Override
    public final Intent getIntent() {
        return this.f14467c.getIntent();
    }

    @Override
    public final int getItemId() {
        return this.f14467c.getItemId();
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f14467c.getMenuInfo();
    }

    @Override
    public final int getNumericModifiers() {
        return this.f14467c.getNumericModifiers();
    }

    @Override
    public final char getNumericShortcut() {
        return this.f14467c.getNumericShortcut();
    }

    @Override
    public final int getOrder() {
        return this.f14467c.getOrder();
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f14467c.getSubMenu();
    }

    @Override
    public final CharSequence getTitle() {
        return this.f14467c.getTitle();
    }

    @Override
    public final CharSequence getTitleCondensed() {
        return this.f14467c.getTitleCondensed();
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f14467c.getTooltipText();
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f14467c.hasSubMenu();
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.f14467c.isActionViewExpanded();
    }

    @Override
    public final boolean isCheckable() {
        return this.f14467c.isCheckable();
    }

    @Override
    public final boolean isChecked() {
        return this.f14467c.isChecked();
    }

    @Override
    public final boolean isEnabled() {
        return this.f14467c.isEnabled();
    }

    @Override
    public final boolean isVisible() {
        return this.f14467c.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        n nVar = new n(this, actionProvider);
        if (actionProvider == null) {
            nVar = null;
        }
        this.f14467c.a(nVar);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new o(view);
        }
        this.f14467c.setActionView(view);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f14467c.setAlphabeticShortcut(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f14467c.setCheckable(z10);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        this.f14467c.setChecked(z10);
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f14467c.setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        this.f14467c.setEnabled(z10);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f14467c.setIcon(drawable);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f14467c.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f14467c.setIconTintMode(mode);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f14467c.setIntent(intent);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        this.f14467c.setNumericShortcut(c10);
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
        this.f14467c.setOnActionExpandListener(pVar);
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
        this.f14467c.setOnMenuItemClickListener(qVar);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.f14467c.setShortcut(c10, c11);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        this.f14467c.setShowAsAction(i10);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        this.f14467c.setShowAsActionFlags(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f14467c.setTitle(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f14467c.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f14467c.setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        return this.f14467c.setVisible(z10);
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f14467c.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f14467c.setIcon(i10);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f14467c.setNumericShortcut(c10, i10);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f14467c.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f14467c.setTitle(i10);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        l0.a aVar = this.f14467c;
        aVar.setActionView(i10);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new o(actionView));
        }
        return this;
    }
}
