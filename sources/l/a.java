package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
public final class a implements l0.a {
    public CharSequence f17363a;
    public CharSequence f17364b;
    public Intent f17365c;
    public char d;
    public int f17366e;
    public char f17367f;
    public int f17368g;
    public Drawable h;
    public Context f17369i;
    public CharSequence f17370j;
    public CharSequence f17371k;
    public ColorStateList f17372l;
    public PorterDuff.Mode f17373m;
    public boolean f17374n;
    public boolean f17375o;
    public int f17376p;

    @Override
    public final l0.a a(n nVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final n b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.f17374n || this.f17375o) {
                this.h = drawable;
                Drawable mutate = drawable.mutate();
                this.h = mutate;
                if (this.f17374n) {
                    mutate.setTintList(this.f17372l);
                }
                if (this.f17375o) {
                    this.h.setTintMode(this.f17373m);
                }
            }
        }
    }

    @Override
    public final boolean collapseActionView() {
        return false;
    }

    @Override
    public final boolean expandActionView() {
        return false;
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final View getActionView() {
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f17368g;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f17367f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f17370j;
    }

    @Override
    public final int getGroupId() {
        return 0;
    }

    @Override
    public final Drawable getIcon() {
        return this.h;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f17372l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f17373m;
    }

    @Override
    public final Intent getIntent() {
        return this.f17365c;
    }

    @Override
    public final int getItemId() {
        return 16908332;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f17366e;
    }

    @Override
    public final char getNumericShortcut() {
        return this.d;
    }

    @Override
    public final int getOrder() {
        return 0;
    }

    @Override
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f17363a;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f17364b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f17363a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f17371k;
    }

    @Override
    public final boolean hasSubMenu() {
        return false;
    }

    @Override
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override
    public final boolean isCheckable() {
        if ((this.f17376p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f17376p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f17376p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        if ((this.f17376p & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f17367f = Character.toLowerCase(c2);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f17376p = (z10 ? 1 : 0) | (this.f17376p & (-2));
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        int i3;
        int i10 = this.f17376p & (-3);
        if (z10) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        this.f17376p = i3 | i10;
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f17370j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        int i3;
        int i10 = this.f17376p & (-17);
        if (z10) {
            i3 = 16;
        } else {
            i3 = 0;
        }
        this.f17376p = i3 | i10;
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f17372l = colorStateList;
        this.f17374n = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f17373m = mode;
        this.f17375o = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f17365c = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c2) {
        this.d = c2;
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setShortcut(char c2, char c10) {
        this.d = c2;
        this.f17367f = Character.toLowerCase(c10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f17363a = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f17364b = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f17371k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        int i3 = 8;
        int i10 = this.f17376p & 8;
        if (z10) {
            i3 = 0;
        }
        this.f17376p = i10 | i3;
        return this;
    }

    @Override
    public final MenuItem setActionView(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c2, int i3) {
        this.f17367f = Character.toLowerCase(c2);
        this.f17368g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f17370j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c2, int i3) {
        this.d = c2;
        this.f17366e = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i3) {
        this.f17363a = this.f17369i.getResources().getString(i3);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f17371k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setIcon(int i3) {
        this.h = this.f17369i.getDrawable(i3);
        c();
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c2, char c10, int i3, int i10) {
        this.d = c2;
        this.f17366e = KeyEvent.normalizeMetaState(i3);
        this.f17367f = Character.toLowerCase(c10);
        this.f17368g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override
    public final void setShowAsAction(int i3) {
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i3) {
        return this;
    }
}
