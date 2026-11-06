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
    public final l0.a f17722c;
    public Method d;

    public r(Context context, l0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f17722c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public final boolean collapseActionView() {
        return this.f17722c.collapseActionView();
    }

    @Override
    public final boolean expandActionView() {
        return this.f17722c.expandActionView();
    }

    @Override
    public final ActionProvider getActionProvider() {
        n b10 = this.f17722c.b();
        if (b10 != null) {
            return b10.f17715a;
        }
        return null;
    }

    @Override
    public final View getActionView() {
        View actionView = this.f17722c.getActionView();
        if (actionView instanceof o) {
            return (View) ((o) actionView).f17717a;
        }
        return actionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f17722c.getAlphabeticModifiers();
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f17722c.getAlphabeticShortcut();
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f17722c.getContentDescription();
    }

    @Override
    public final int getGroupId() {
        return this.f17722c.getGroupId();
    }

    @Override
    public final Drawable getIcon() {
        return this.f17722c.getIcon();
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f17722c.getIconTintList();
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f17722c.getIconTintMode();
    }

    @Override
    public final Intent getIntent() {
        return this.f17722c.getIntent();
    }

    @Override
    public final int getItemId() {
        return this.f17722c.getItemId();
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f17722c.getMenuInfo();
    }

    @Override
    public final int getNumericModifiers() {
        return this.f17722c.getNumericModifiers();
    }

    @Override
    public final char getNumericShortcut() {
        return this.f17722c.getNumericShortcut();
    }

    @Override
    public final int getOrder() {
        return this.f17722c.getOrder();
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f17722c.getSubMenu();
    }

    @Override
    public final CharSequence getTitle() {
        return this.f17722c.getTitle();
    }

    @Override
    public final CharSequence getTitleCondensed() {
        return this.f17722c.getTitleCondensed();
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f17722c.getTooltipText();
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f17722c.hasSubMenu();
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.f17722c.isActionViewExpanded();
    }

    @Override
    public final boolean isCheckable() {
        return this.f17722c.isCheckable();
    }

    @Override
    public final boolean isChecked() {
        return this.f17722c.isChecked();
    }

    @Override
    public final boolean isEnabled() {
        return this.f17722c.isEnabled();
    }

    @Override
    public final boolean isVisible() {
        return this.f17722c.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        n nVar = new n(this, actionProvider);
        if (actionProvider == null) {
            nVar = null;
        }
        this.f17722c.a(nVar);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new o(view);
        }
        this.f17722c.setActionView(view);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f17722c.setAlphabeticShortcut(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z9) {
        this.f17722c.setCheckable(z9);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z9) {
        this.f17722c.setChecked(z9);
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f17722c.setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z9) {
        this.f17722c.setEnabled(z9);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f17722c.setIcon(drawable);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f17722c.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f17722c.setIconTintMode(mode);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f17722c.setIntent(intent);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        this.f17722c.setNumericShortcut(c10);
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
        this.f17722c.setOnActionExpandListener(pVar);
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
        this.f17722c.setOnMenuItemClickListener(qVar);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.f17722c.setShortcut(c10, c11);
        return this;
    }

    @Override
    public final void setShowAsAction(int i7) {
        this.f17722c.setShowAsAction(i7);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i7) {
        this.f17722c.setShowAsActionFlags(i7);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f17722c.setTitle(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f17722c.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f17722c.setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z9) {
        return this.f17722c.setVisible(z9);
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i7) {
        this.f17722c.setAlphabeticShortcut(c10, i7);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i7) {
        this.f17722c.setIcon(i7);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i7) {
        this.f17722c.setNumericShortcut(c10, i7);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i7, int i10) {
        this.f17722c.setShortcut(c10, c11, i7, i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i7) {
        this.f17722c.setTitle(i7);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i7) {
        l0.a aVar = this.f17722c;
        aVar.setActionView(i7);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new o(actionView));
        }
        return this;
    }
}
