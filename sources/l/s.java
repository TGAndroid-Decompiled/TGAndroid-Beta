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
public final class s extends g.p implements MenuItem {
    public final l0.a f15164c;
    public Method d;

    public s(Context context, l0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f15164c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public final boolean collapseActionView() {
        return this.f15164c.collapseActionView();
    }

    @Override
    public final boolean expandActionView() {
        return this.f15164c.expandActionView();
    }

    @Override
    public final ActionProvider getActionProvider() {
        o b10 = this.f15164c.b();
        if (b10 != null) {
            return b10.f15157a;
        }
        return null;
    }

    @Override
    public final View getActionView() {
        View actionView = this.f15164c.getActionView();
        if (actionView instanceof p) {
            return (View) ((p) actionView).f15159a;
        }
        return actionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f15164c.getAlphabeticModifiers();
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f15164c.getAlphabeticShortcut();
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f15164c.getContentDescription();
    }

    @Override
    public final int getGroupId() {
        return this.f15164c.getGroupId();
    }

    @Override
    public final Drawable getIcon() {
        return this.f15164c.getIcon();
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f15164c.getIconTintList();
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f15164c.getIconTintMode();
    }

    @Override
    public final Intent getIntent() {
        return this.f15164c.getIntent();
    }

    @Override
    public final int getItemId() {
        return this.f15164c.getItemId();
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f15164c.getMenuInfo();
    }

    @Override
    public final int getNumericModifiers() {
        return this.f15164c.getNumericModifiers();
    }

    @Override
    public final char getNumericShortcut() {
        return this.f15164c.getNumericShortcut();
    }

    @Override
    public final int getOrder() {
        return this.f15164c.getOrder();
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f15164c.getSubMenu();
    }

    @Override
    public final CharSequence getTitle() {
        return this.f15164c.getTitle();
    }

    @Override
    public final CharSequence getTitleCondensed() {
        return this.f15164c.getTitleCondensed();
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f15164c.getTooltipText();
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f15164c.hasSubMenu();
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.f15164c.isActionViewExpanded();
    }

    @Override
    public final boolean isCheckable() {
        return this.f15164c.isCheckable();
    }

    @Override
    public final boolean isChecked() {
        return this.f15164c.isChecked();
    }

    @Override
    public final boolean isEnabled() {
        return this.f15164c.isEnabled();
    }

    @Override
    public final boolean isVisible() {
        return this.f15164c.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        o oVar = new o(this, actionProvider);
        if (actionProvider == null) {
            oVar = null;
        }
        this.f15164c.a(oVar);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new p(view);
        }
        this.f15164c.setActionView(view);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f15164c.setAlphabeticShortcut(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f15164c.setCheckable(z10);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        this.f15164c.setChecked(z10);
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f15164c.setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        this.f15164c.setEnabled(z10);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f15164c.setIcon(drawable);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15164c.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15164c.setIconTintMode(mode);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f15164c.setIntent(intent);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        this.f15164c.setNumericShortcut(c10);
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
        this.f15164c.setOnActionExpandListener(qVar);
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
        this.f15164c.setOnMenuItemClickListener(rVar);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.f15164c.setShortcut(c10, c11);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        this.f15164c.setShowAsAction(i10);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        this.f15164c.setShowAsActionFlags(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f15164c.setTitle(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15164c.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f15164c.setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        return this.f15164c.setVisible(z10);
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f15164c.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f15164c.setIcon(i10);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f15164c.setNumericShortcut(c10, i10);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f15164c.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f15164c.setTitle(i10);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        l0.a aVar = this.f15164c;
        aVar.setActionView(i10);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new p(actionView));
        }
        return this;
    }
}
