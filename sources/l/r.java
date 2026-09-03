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
    public final l0.a f11202c;
    public Method d;

    public r(Context context, l0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f11202c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public final boolean collapseActionView() {
        return this.f11202c.collapseActionView();
    }

    @Override
    public final boolean expandActionView() {
        return this.f11202c.expandActionView();
    }

    @Override
    public final ActionProvider getActionProvider() {
        n b10 = this.f11202c.b();
        if (b10 != null) {
            return b10.f11195a;
        }
        return null;
    }

    @Override
    public final View getActionView() {
        View actionView = this.f11202c.getActionView();
        if (actionView instanceof o) {
            return (View) ((o) actionView).f11197a;
        }
        return actionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f11202c.getAlphabeticModifiers();
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f11202c.getAlphabeticShortcut();
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f11202c.getContentDescription();
    }

    @Override
    public final int getGroupId() {
        return this.f11202c.getGroupId();
    }

    @Override
    public final Drawable getIcon() {
        return this.f11202c.getIcon();
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f11202c.getIconTintList();
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f11202c.getIconTintMode();
    }

    @Override
    public final Intent getIntent() {
        return this.f11202c.getIntent();
    }

    @Override
    public final int getItemId() {
        return this.f11202c.getItemId();
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f11202c.getMenuInfo();
    }

    @Override
    public final int getNumericModifiers() {
        return this.f11202c.getNumericModifiers();
    }

    @Override
    public final char getNumericShortcut() {
        return this.f11202c.getNumericShortcut();
    }

    @Override
    public final int getOrder() {
        return this.f11202c.getOrder();
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f11202c.getSubMenu();
    }

    @Override
    public final CharSequence getTitle() {
        return this.f11202c.getTitle();
    }

    @Override
    public final CharSequence getTitleCondensed() {
        return this.f11202c.getTitleCondensed();
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f11202c.getTooltipText();
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f11202c.hasSubMenu();
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.f11202c.isActionViewExpanded();
    }

    @Override
    public final boolean isCheckable() {
        return this.f11202c.isCheckable();
    }

    @Override
    public final boolean isChecked() {
        return this.f11202c.isChecked();
    }

    @Override
    public final boolean isEnabled() {
        return this.f11202c.isEnabled();
    }

    @Override
    public final boolean isVisible() {
        return this.f11202c.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        n nVar = new n(this, actionProvider);
        if (actionProvider == null) {
            nVar = null;
        }
        this.f11202c.a(nVar);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new o(view);
        }
        this.f11202c.setActionView(view);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c3) {
        this.f11202c.setAlphabeticShortcut(c3);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z4) {
        this.f11202c.setCheckable(z4);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z4) {
        this.f11202c.setChecked(z4);
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f11202c.setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z4) {
        this.f11202c.setEnabled(z4);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f11202c.setIcon(drawable);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11202c.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11202c.setIconTintMode(mode);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f11202c.setIntent(intent);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c3) {
        this.f11202c.setNumericShortcut(c3);
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
        this.f11202c.setOnActionExpandListener(pVar);
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
        this.f11202c.setOnMenuItemClickListener(qVar);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c3, char c10) {
        this.f11202c.setShortcut(c3, c10);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        this.f11202c.setShowAsAction(i10);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        this.f11202c.setShowAsActionFlags(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f11202c.setTitle(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11202c.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f11202c.setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z4) {
        return this.f11202c.setVisible(z4);
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c3, int i10) {
        this.f11202c.setAlphabeticShortcut(c3, i10);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f11202c.setIcon(i10);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c3, int i10) {
        this.f11202c.setNumericShortcut(c3, i10);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c3, char c10, int i10, int i11) {
        this.f11202c.setShortcut(c3, c10, i10, i11);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f11202c.setTitle(i10);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        l0.a aVar = this.f11202c;
        aVar.setActionView(i10);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new o(actionView));
        }
        return this;
    }
}
