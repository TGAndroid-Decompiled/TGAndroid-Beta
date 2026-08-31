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
public final class s extends f2.v implements MenuItem {
    public final l0.a f11449c;
    public Method d;

    public s(Context context, l0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f11449c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public final boolean collapseActionView() {
        return this.f11449c.collapseActionView();
    }

    @Override
    public final boolean expandActionView() {
        return this.f11449c.expandActionView();
    }

    @Override
    public final ActionProvider getActionProvider() {
        o b10 = this.f11449c.b();
        if (b10 != null) {
            return b10.f11442a;
        }
        return null;
    }

    @Override
    public final View getActionView() {
        View actionView = this.f11449c.getActionView();
        if (actionView instanceof p) {
            return (View) ((p) actionView).f11444a;
        }
        return actionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f11449c.getAlphabeticModifiers();
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f11449c.getAlphabeticShortcut();
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f11449c.getContentDescription();
    }

    @Override
    public final int getGroupId() {
        return this.f11449c.getGroupId();
    }

    @Override
    public final Drawable getIcon() {
        return this.f11449c.getIcon();
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f11449c.getIconTintList();
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f11449c.getIconTintMode();
    }

    @Override
    public final Intent getIntent() {
        return this.f11449c.getIntent();
    }

    @Override
    public final int getItemId() {
        return this.f11449c.getItemId();
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f11449c.getMenuInfo();
    }

    @Override
    public final int getNumericModifiers() {
        return this.f11449c.getNumericModifiers();
    }

    @Override
    public final char getNumericShortcut() {
        return this.f11449c.getNumericShortcut();
    }

    @Override
    public final int getOrder() {
        return this.f11449c.getOrder();
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f11449c.getSubMenu();
    }

    @Override
    public final CharSequence getTitle() {
        return this.f11449c.getTitle();
    }

    @Override
    public final CharSequence getTitleCondensed() {
        return this.f11449c.getTitleCondensed();
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f11449c.getTooltipText();
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f11449c.hasSubMenu();
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.f11449c.isActionViewExpanded();
    }

    @Override
    public final boolean isCheckable() {
        return this.f11449c.isCheckable();
    }

    @Override
    public final boolean isChecked() {
        return this.f11449c.isChecked();
    }

    @Override
    public final boolean isEnabled() {
        return this.f11449c.isEnabled();
    }

    @Override
    public final boolean isVisible() {
        return this.f11449c.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        o oVar = new o(this, actionProvider);
        if (actionProvider == null) {
            oVar = null;
        }
        this.f11449c.a(oVar);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new p(view);
        }
        this.f11449c.setActionView(view);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c3) {
        this.f11449c.setAlphabeticShortcut(c3);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z4) {
        this.f11449c.setCheckable(z4);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z4) {
        this.f11449c.setChecked(z4);
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f11449c.setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z4) {
        this.f11449c.setEnabled(z4);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f11449c.setIcon(drawable);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11449c.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11449c.setIconTintMode(mode);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f11449c.setIntent(intent);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c3) {
        this.f11449c.setNumericShortcut(c3);
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
        this.f11449c.setOnActionExpandListener(qVar);
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
        this.f11449c.setOnMenuItemClickListener(rVar);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c3, char c10) {
        this.f11449c.setShortcut(c3, c10);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        this.f11449c.setShowAsAction(i10);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        this.f11449c.setShowAsActionFlags(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f11449c.setTitle(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11449c.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f11449c.setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z4) {
        return this.f11449c.setVisible(z4);
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c3, int i10) {
        this.f11449c.setAlphabeticShortcut(c3, i10);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f11449c.setIcon(i10);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c3, int i10) {
        this.f11449c.setNumericShortcut(c3, i10);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c3, char c10, int i10, int i11) {
        this.f11449c.setShortcut(c3, c10, i10, i11);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f11449c.setTitle(i10);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        l0.a aVar = this.f11449c;
        aVar.setActionView(i10);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new p(actionView));
        }
        return this;
    }
}
