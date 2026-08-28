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
public final class r extends f2.x implements MenuItem {
    public final l0.a f16608c;
    public Method d;

    public r(Context context, l0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f16608c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public final boolean collapseActionView() {
        return this.f16608c.collapseActionView();
    }

    @Override
    public final boolean expandActionView() {
        return this.f16608c.expandActionView();
    }

    @Override
    public final ActionProvider getActionProvider() {
        n b10 = this.f16608c.b();
        if (b10 != null) {
            return b10.f16601a;
        }
        return null;
    }

    @Override
    public final View getActionView() {
        View actionView = this.f16608c.getActionView();
        if (actionView instanceof o) {
            return (View) ((o) actionView).f16603a;
        }
        return actionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f16608c.getAlphabeticModifiers();
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f16608c.getAlphabeticShortcut();
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f16608c.getContentDescription();
    }

    @Override
    public final int getGroupId() {
        return this.f16608c.getGroupId();
    }

    @Override
    public final Drawable getIcon() {
        return this.f16608c.getIcon();
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f16608c.getIconTintList();
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f16608c.getIconTintMode();
    }

    @Override
    public final Intent getIntent() {
        return this.f16608c.getIntent();
    }

    @Override
    public final int getItemId() {
        return this.f16608c.getItemId();
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f16608c.getMenuInfo();
    }

    @Override
    public final int getNumericModifiers() {
        return this.f16608c.getNumericModifiers();
    }

    @Override
    public final char getNumericShortcut() {
        return this.f16608c.getNumericShortcut();
    }

    @Override
    public final int getOrder() {
        return this.f16608c.getOrder();
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f16608c.getSubMenu();
    }

    @Override
    public final CharSequence getTitle() {
        return this.f16608c.getTitle();
    }

    @Override
    public final CharSequence getTitleCondensed() {
        return this.f16608c.getTitleCondensed();
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f16608c.getTooltipText();
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f16608c.hasSubMenu();
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.f16608c.isActionViewExpanded();
    }

    @Override
    public final boolean isCheckable() {
        return this.f16608c.isCheckable();
    }

    @Override
    public final boolean isChecked() {
        return this.f16608c.isChecked();
    }

    @Override
    public final boolean isEnabled() {
        return this.f16608c.isEnabled();
    }

    @Override
    public final boolean isVisible() {
        return this.f16608c.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        n nVar = new n(this, actionProvider);
        if (actionProvider == null) {
            nVar = null;
        }
        this.f16608c.a(nVar);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new o(view);
        }
        this.f16608c.setActionView(view);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f16608c.setAlphabeticShortcut(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f16608c.setCheckable(z10);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        this.f16608c.setChecked(z10);
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f16608c.setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        this.f16608c.setEnabled(z10);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f16608c.setIcon(drawable);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f16608c.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f16608c.setIconTintMode(mode);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f16608c.setIntent(intent);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        this.f16608c.setNumericShortcut(c10);
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
        this.f16608c.setOnActionExpandListener(pVar);
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
        this.f16608c.setOnMenuItemClickListener(qVar);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.f16608c.setShortcut(c10, c11);
        return this;
    }

    @Override
    public final void setShowAsAction(int i9) {
        this.f16608c.setShowAsAction(i9);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i9) {
        this.f16608c.setShowAsActionFlags(i9);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f16608c.setTitle(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f16608c.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f16608c.setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        return this.f16608c.setVisible(z10);
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i9) {
        this.f16608c.setAlphabeticShortcut(c10, i9);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i9) {
        this.f16608c.setIcon(i9);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i9) {
        this.f16608c.setNumericShortcut(c10, i9);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i9, int i10) {
        this.f16608c.setShortcut(c10, c11, i9, i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i9) {
        this.f16608c.setTitle(i9);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i9) {
        l0.a aVar = this.f16608c;
        aVar.setActionView(i9);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new o(actionView));
        }
        return this;
    }
}
