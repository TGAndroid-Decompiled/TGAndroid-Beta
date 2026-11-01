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
public final class s extends g.o implements MenuItem {
    public final l0.a f11550c;
    public Method d;

    public s(Context context, l0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f11550c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public final boolean collapseActionView() {
        return this.f11550c.collapseActionView();
    }

    @Override
    public final boolean expandActionView() {
        return this.f11550c.expandActionView();
    }

    @Override
    public final ActionProvider getActionProvider() {
        o b10 = this.f11550c.b();
        if (b10 != null) {
            return b10.f11543a;
        }
        return null;
    }

    @Override
    public final View getActionView() {
        View actionView = this.f11550c.getActionView();
        if (actionView instanceof p) {
            return (View) ((p) actionView).f11545a;
        }
        return actionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f11550c.getAlphabeticModifiers();
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f11550c.getAlphabeticShortcut();
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f11550c.getContentDescription();
    }

    @Override
    public final int getGroupId() {
        return this.f11550c.getGroupId();
    }

    @Override
    public final Drawable getIcon() {
        return this.f11550c.getIcon();
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f11550c.getIconTintList();
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f11550c.getIconTintMode();
    }

    @Override
    public final Intent getIntent() {
        return this.f11550c.getIntent();
    }

    @Override
    public final int getItemId() {
        return this.f11550c.getItemId();
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f11550c.getMenuInfo();
    }

    @Override
    public final int getNumericModifiers() {
        return this.f11550c.getNumericModifiers();
    }

    @Override
    public final char getNumericShortcut() {
        return this.f11550c.getNumericShortcut();
    }

    @Override
    public final int getOrder() {
        return this.f11550c.getOrder();
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f11550c.getSubMenu();
    }

    @Override
    public final CharSequence getTitle() {
        return this.f11550c.getTitle();
    }

    @Override
    public final CharSequence getTitleCondensed() {
        return this.f11550c.getTitleCondensed();
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f11550c.getTooltipText();
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f11550c.hasSubMenu();
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.f11550c.isActionViewExpanded();
    }

    @Override
    public final boolean isCheckable() {
        return this.f11550c.isCheckable();
    }

    @Override
    public final boolean isChecked() {
        return this.f11550c.isChecked();
    }

    @Override
    public final boolean isEnabled() {
        return this.f11550c.isEnabled();
    }

    @Override
    public final boolean isVisible() {
        return this.f11550c.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        o oVar = new o(this, actionProvider);
        if (actionProvider == null) {
            oVar = null;
        }
        this.f11550c.a(oVar);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new p(view);
        }
        this.f11550c.setActionView(view);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f11550c.setAlphabeticShortcut(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f11550c.setCheckable(z10);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        this.f11550c.setChecked(z10);
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f11550c.setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        this.f11550c.setEnabled(z10);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f11550c.setIcon(drawable);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11550c.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11550c.setIconTintMode(mode);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f11550c.setIntent(intent);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        this.f11550c.setNumericShortcut(c10);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        q qVar;
        if (onActionExpandListener != null) {
            qVar = new q(this, onActionExpandListener);
        } else {
            qVar = null;
        }
        this.f11550c.setOnActionExpandListener(qVar);
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        r rVar;
        if (onMenuItemClickListener != null) {
            rVar = new r(this, onMenuItemClickListener);
        } else {
            rVar = null;
        }
        this.f11550c.setOnMenuItemClickListener(rVar);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.f11550c.setShortcut(c10, c11);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        this.f11550c.setShowAsAction(i10);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        this.f11550c.setShowAsActionFlags(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f11550c.setTitle(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11550c.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f11550c.setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        return this.f11550c.setVisible(z10);
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f11550c.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f11550c.setIcon(i10);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f11550c.setNumericShortcut(c10, i10);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f11550c.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f11550c.setTitle(i10);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        l0.a aVar = this.f11550c;
        aVar.setActionView(i10);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new p(actionView));
        }
        return this;
    }
}
