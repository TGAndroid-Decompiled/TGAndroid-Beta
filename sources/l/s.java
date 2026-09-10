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
    public final l0.a f12680c;
    public Method d;

    public s(Context context, l0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f12680c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public final boolean collapseActionView() {
        return this.f12680c.collapseActionView();
    }

    @Override
    public final boolean expandActionView() {
        return this.f12680c.expandActionView();
    }

    @Override
    public final ActionProvider getActionProvider() {
        o b10 = this.f12680c.b();
        if (b10 != null) {
            return b10.f12673a;
        }
        return null;
    }

    @Override
    public final View getActionView() {
        View actionView = this.f12680c.getActionView();
        if (actionView instanceof p) {
            return (View) ((p) actionView).f12675a;
        }
        return actionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f12680c.getAlphabeticModifiers();
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f12680c.getAlphabeticShortcut();
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f12680c.getContentDescription();
    }

    @Override
    public final int getGroupId() {
        return this.f12680c.getGroupId();
    }

    @Override
    public final Drawable getIcon() {
        return this.f12680c.getIcon();
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f12680c.getIconTintList();
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f12680c.getIconTintMode();
    }

    @Override
    public final Intent getIntent() {
        return this.f12680c.getIntent();
    }

    @Override
    public final int getItemId() {
        return this.f12680c.getItemId();
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f12680c.getMenuInfo();
    }

    @Override
    public final int getNumericModifiers() {
        return this.f12680c.getNumericModifiers();
    }

    @Override
    public final char getNumericShortcut() {
        return this.f12680c.getNumericShortcut();
    }

    @Override
    public final int getOrder() {
        return this.f12680c.getOrder();
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f12680c.getSubMenu();
    }

    @Override
    public final CharSequence getTitle() {
        return this.f12680c.getTitle();
    }

    @Override
    public final CharSequence getTitleCondensed() {
        return this.f12680c.getTitleCondensed();
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f12680c.getTooltipText();
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f12680c.hasSubMenu();
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.f12680c.isActionViewExpanded();
    }

    @Override
    public final boolean isCheckable() {
        return this.f12680c.isCheckable();
    }

    @Override
    public final boolean isChecked() {
        return this.f12680c.isChecked();
    }

    @Override
    public final boolean isEnabled() {
        return this.f12680c.isEnabled();
    }

    @Override
    public final boolean isVisible() {
        return this.f12680c.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        o oVar = new o(this, actionProvider);
        if (actionProvider == null) {
            oVar = null;
        }
        this.f12680c.a(oVar);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new p(view);
        }
        this.f12680c.setActionView(view);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f12680c.setAlphabeticShortcut(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f12680c.setCheckable(z10);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        this.f12680c.setChecked(z10);
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f12680c.setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        this.f12680c.setEnabled(z10);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f12680c.setIcon(drawable);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f12680c.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f12680c.setIconTintMode(mode);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f12680c.setIntent(intent);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        this.f12680c.setNumericShortcut(c10);
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
        this.f12680c.setOnActionExpandListener(qVar);
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
        this.f12680c.setOnMenuItemClickListener(rVar);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.f12680c.setShortcut(c10, c11);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        this.f12680c.setShowAsAction(i10);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        this.f12680c.setShowAsActionFlags(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f12680c.setTitle(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f12680c.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f12680c.setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        return this.f12680c.setVisible(z10);
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f12680c.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f12680c.setIcon(i10);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f12680c.setNumericShortcut(c10, i10);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f12680c.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f12680c.setTitle(i10);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        l0.a aVar = this.f12680c;
        aVar.setActionView(i10);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new p(actionView));
        }
        return this;
    }
}
