package defpackage;

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
public final class n27 extends zo implements MenuItem {
    public final ufb c;
    public Method d;

    public n27(Context context, ufb ufbVar) {
        super(context);
        if (ufbVar != null) {
            this.c = ufbVar;
        } else {
            lq5.j("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override
    public final boolean collapseActionView() {
        return this.c.collapseActionView();
    }

    @Override
    public final boolean expandActionView() {
        return this.c.expandActionView();
    }

    @Override
    public final ActionProvider getActionProvider() {
        k27 b = this.c.b();
        if (b instanceof k27) {
            return b.a;
        }
        return null;
    }

    @Override
    public final View getActionView() {
        View actionView = this.c.getActionView();
        if (actionView instanceof l27) {
            return (View) ((l27) actionView).a;
        }
        return actionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.c.getAlphabeticModifiers();
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.c.getAlphabeticShortcut();
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.c.getContentDescription();
    }

    @Override
    public final int getGroupId() {
        return this.c.getGroupId();
    }

    @Override
    public final Drawable getIcon() {
        return this.c.getIcon();
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.c.getIconTintList();
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.c.getIconTintMode();
    }

    @Override
    public final Intent getIntent() {
        return this.c.getIntent();
    }

    @Override
    public final int getItemId() {
        return this.c.getItemId();
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.c.getMenuInfo();
    }

    @Override
    public final int getNumericModifiers() {
        return this.c.getNumericModifiers();
    }

    @Override
    public final char getNumericShortcut() {
        return this.c.getNumericShortcut();
    }

    @Override
    public final int getOrder() {
        return this.c.getOrder();
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.c.getSubMenu();
    }

    @Override
    public final CharSequence getTitle() {
        return this.c.getTitle();
    }

    @Override
    public final CharSequence getTitleCondensed() {
        return this.c.getTitleCondensed();
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.c.getTooltipText();
    }

    @Override
    public final boolean hasSubMenu() {
        return this.c.hasSubMenu();
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.c.isActionViewExpanded();
    }

    @Override
    public final boolean isCheckable() {
        return this.c.isCheckable();
    }

    @Override
    public final boolean isChecked() {
        return this.c.isChecked();
    }

    @Override
    public final boolean isEnabled() {
        return this.c.isEnabled();
    }

    @Override
    public final boolean isVisible() {
        return this.c.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        k27 k27Var = new k27(this, actionProvider);
        if (actionProvider == null) {
            k27Var = null;
        }
        this.c.a(k27Var);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i) {
        ufb ufbVar = this.c;
        ufbVar.setActionView(i);
        View actionView = ufbVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ufbVar.setActionView(new l27(actionView));
        }
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c) {
        this.c.setAlphabeticShortcut(c);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z) {
        this.c.setCheckable(z);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z) {
        this.c.setChecked(z);
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.c.setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z) {
        this.c.setEnabled(z);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.c.setIcon(drawable);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.c.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.c.setIconTintMode(mode);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.c.setIntent(intent);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c) {
        this.c.setNumericShortcut(c);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        m27 m27Var;
        if (onActionExpandListener != null) {
            m27Var = new m27(this, onActionExpandListener);
        } else {
            m27Var = null;
        }
        this.c.setOnActionExpandListener(m27Var);
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        rfb rfbVar;
        if (onMenuItemClickListener != null) {
            rfbVar = new rfb(this, onMenuItemClickListener);
        } else {
            rfbVar = null;
        }
        this.c.setOnMenuItemClickListener(rfbVar);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c, char c2) {
        this.c.setShortcut(c, c2);
        return this;
    }

    @Override
    public final void setShowAsAction(int i) {
        this.c.setShowAsAction(i);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i) {
        this.c.setShowAsActionFlags(i);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.c.setTitle(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.c.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.c.setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z) {
        return this.c.setVisible(z);
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.c.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i) {
        this.c.setIcon(i);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c, int i) {
        this.c.setNumericShortcut(c, i);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.c.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i) {
        this.c.setTitle(i);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new l27(view);
        }
        this.c.setActionView(view);
        return this;
    }
}
