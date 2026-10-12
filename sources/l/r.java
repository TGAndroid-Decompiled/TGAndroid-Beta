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
    public final l0.a f15038c;
    public Method d;

    public r(Context context, l0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f15038c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public final boolean collapseActionView() {
        return this.f15038c.collapseActionView();
    }

    @Override
    public final boolean expandActionView() {
        return this.f15038c.expandActionView();
    }

    @Override
    public final ActionProvider getActionProvider() {
        n b10 = this.f15038c.b();
        if (b10 != null) {
            return b10.f15031a;
        }
        return null;
    }

    @Override
    public final View getActionView() {
        View actionView = this.f15038c.getActionView();
        if (actionView instanceof o) {
            return (View) ((o) actionView).f15033a;
        }
        return actionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f15038c.getAlphabeticModifiers();
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f15038c.getAlphabeticShortcut();
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f15038c.getContentDescription();
    }

    @Override
    public final int getGroupId() {
        return this.f15038c.getGroupId();
    }

    @Override
    public final Drawable getIcon() {
        return this.f15038c.getIcon();
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f15038c.getIconTintList();
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f15038c.getIconTintMode();
    }

    @Override
    public final Intent getIntent() {
        return this.f15038c.getIntent();
    }

    @Override
    public final int getItemId() {
        return this.f15038c.getItemId();
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f15038c.getMenuInfo();
    }

    @Override
    public final int getNumericModifiers() {
        return this.f15038c.getNumericModifiers();
    }

    @Override
    public final char getNumericShortcut() {
        return this.f15038c.getNumericShortcut();
    }

    @Override
    public final int getOrder() {
        return this.f15038c.getOrder();
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f15038c.getSubMenu();
    }

    @Override
    public final CharSequence getTitle() {
        return this.f15038c.getTitle();
    }

    @Override
    public final CharSequence getTitleCondensed() {
        return this.f15038c.getTitleCondensed();
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f15038c.getTooltipText();
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f15038c.hasSubMenu();
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.f15038c.isActionViewExpanded();
    }

    @Override
    public final boolean isCheckable() {
        return this.f15038c.isCheckable();
    }

    @Override
    public final boolean isChecked() {
        return this.f15038c.isChecked();
    }

    @Override
    public final boolean isEnabled() {
        return this.f15038c.isEnabled();
    }

    @Override
    public final boolean isVisible() {
        return this.f15038c.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        n nVar = new n(this, actionProvider);
        if (actionProvider == null) {
            nVar = null;
        }
        this.f15038c.a(nVar);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new o(view);
        }
        this.f15038c.setActionView(view);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f15038c.setAlphabeticShortcut(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f15038c.setCheckable(z10);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        this.f15038c.setChecked(z10);
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f15038c.setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        this.f15038c.setEnabled(z10);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f15038c.setIcon(drawable);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15038c.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15038c.setIconTintMode(mode);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f15038c.setIntent(intent);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        this.f15038c.setNumericShortcut(c10);
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
        this.f15038c.setOnActionExpandListener(pVar);
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
        this.f15038c.setOnMenuItemClickListener(qVar);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.f15038c.setShortcut(c10, c11);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        this.f15038c.setShowAsAction(i10);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        this.f15038c.setShowAsActionFlags(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f15038c.setTitle(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15038c.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f15038c.setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        return this.f15038c.setVisible(z10);
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f15038c.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f15038c.setIcon(i10);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f15038c.setNumericShortcut(c10, i10);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f15038c.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f15038c.setTitle(i10);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        l0.a aVar = this.f15038c;
        aVar.setActionView(i10);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new o(actionView));
        }
        return this;
    }
}
