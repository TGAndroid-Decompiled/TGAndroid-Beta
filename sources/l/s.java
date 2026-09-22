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
    public final l0.a f13998c;
    public Method d;

    public s(Context context, l0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f13998c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public final boolean collapseActionView() {
        return this.f13998c.collapseActionView();
    }

    @Override
    public final boolean expandActionView() {
        return this.f13998c.expandActionView();
    }

    @Override
    public final ActionProvider getActionProvider() {
        o b10 = this.f13998c.b();
        if (b10 != null) {
            return b10.f13991a;
        }
        return null;
    }

    @Override
    public final View getActionView() {
        View actionView = this.f13998c.getActionView();
        if (actionView instanceof p) {
            return (View) ((p) actionView).f13993a;
        }
        return actionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f13998c.getAlphabeticModifiers();
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f13998c.getAlphabeticShortcut();
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f13998c.getContentDescription();
    }

    @Override
    public final int getGroupId() {
        return this.f13998c.getGroupId();
    }

    @Override
    public final Drawable getIcon() {
        return this.f13998c.getIcon();
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f13998c.getIconTintList();
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f13998c.getIconTintMode();
    }

    @Override
    public final Intent getIntent() {
        return this.f13998c.getIntent();
    }

    @Override
    public final int getItemId() {
        return this.f13998c.getItemId();
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f13998c.getMenuInfo();
    }

    @Override
    public final int getNumericModifiers() {
        return this.f13998c.getNumericModifiers();
    }

    @Override
    public final char getNumericShortcut() {
        return this.f13998c.getNumericShortcut();
    }

    @Override
    public final int getOrder() {
        return this.f13998c.getOrder();
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f13998c.getSubMenu();
    }

    @Override
    public final CharSequence getTitle() {
        return this.f13998c.getTitle();
    }

    @Override
    public final CharSequence getTitleCondensed() {
        return this.f13998c.getTitleCondensed();
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f13998c.getTooltipText();
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f13998c.hasSubMenu();
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.f13998c.isActionViewExpanded();
    }

    @Override
    public final boolean isCheckable() {
        return this.f13998c.isCheckable();
    }

    @Override
    public final boolean isChecked() {
        return this.f13998c.isChecked();
    }

    @Override
    public final boolean isEnabled() {
        return this.f13998c.isEnabled();
    }

    @Override
    public final boolean isVisible() {
        return this.f13998c.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        o oVar = new o(this, actionProvider);
        if (actionProvider == null) {
            oVar = null;
        }
        this.f13998c.a(oVar);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new p(view);
        }
        this.f13998c.setActionView(view);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f13998c.setAlphabeticShortcut(c10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f13998c.setCheckable(z10);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        this.f13998c.setChecked(z10);
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f13998c.setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        this.f13998c.setEnabled(z10);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f13998c.setIcon(drawable);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13998c.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13998c.setIconTintMode(mode);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f13998c.setIntent(intent);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        this.f13998c.setNumericShortcut(c10);
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
        this.f13998c.setOnActionExpandListener(qVar);
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
        this.f13998c.setOnMenuItemClickListener(rVar);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.f13998c.setShortcut(c10, c11);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        this.f13998c.setShowAsAction(i10);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        this.f13998c.setShowAsActionFlags(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13998c.setTitle(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13998c.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f13998c.setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        return this.f13998c.setVisible(z10);
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f13998c.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f13998c.setIcon(i10);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f13998c.setNumericShortcut(c10, i10);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f13998c.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f13998c.setTitle(i10);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        l0.a aVar = this.f13998c;
        aVar.setActionView(i10);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new p(actionView));
        }
        return this;
    }
}
