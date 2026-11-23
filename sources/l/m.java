package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
public final class m implements l0.a {
    public n A;
    public MenuItem.OnActionExpandListener B;
    public final int f19297a;
    public final int f19298b;
    public final int f19299c;
    public final int d;
    public CharSequence f19300e;
    public CharSequence f19301f;
    public Intent f19302g;
    public char h;
    public char f19304j;
    public Drawable f19306l;
    public final k f19308n;
    public d0 f19309o;
    public MenuItem.OnMenuItemClickListener f19310p;
    public CharSequence f19311q;
    public CharSequence f19312r;
    public int f19318y;
    public View f19319z;
    public int f19303i = 4096;
    public int f19305k = 4096;
    public int f19307m = 0;
    public ColorStateList f19313s = null;
    public PorterDuff.Mode f19314t = null;
    public boolean f19315u = false;
    public boolean v = false;
    public boolean f19316w = false;
    public int f19317x = 16;
    public boolean C = false;

    public m(k kVar, int i7, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f19308n = kVar;
        this.f19297a = i10;
        this.f19298b = i7;
        this.f19299c = i11;
        this.d = i12;
        this.f19300e = charSequence;
        this.f19318y = i13;
    }

    public static void c(StringBuilder sb2, int i7, int i10, String str) {
        if ((i7 & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(n nVar) {
        this.f19319z = null;
        this.A = nVar;
        this.f19308n.p(true);
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.f19321b = new j6.r(this, 4);
            nVar2.f19320a.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override
    public final n b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f19318y & 8) == 0) {
            return false;
        }
        if (this.f19319z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f19308n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f19316w && (this.f19315u || this.v)) {
            drawable = drawable.mutate();
            if (this.f19315u) {
                drawable.setTintList(this.f19313s);
            }
            if (this.v) {
                drawable.setTintMode(this.f19314t);
            }
            this.f19316w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f19318y & 8) != 0) {
            if (this.f19319z == null && (nVar = this.A) != null) {
                this.f19319z = nVar.a(this);
            }
            if (this.f19319z != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean expandActionView() {
        if (e()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.B;
            if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
                return false;
            }
            return this.f19308n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f19317x |= 32;
        } else {
            this.f19317x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f19319z;
        if (view != null) {
            return view;
        }
        n nVar = this.A;
        if (nVar != null) {
            View a10 = nVar.a(this);
            this.f19319z = a10;
            return a10;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f19305k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f19304j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f19311q;
    }

    @Override
    public final int getGroupId() {
        return this.f19298b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f19306l;
        if (drawable != null) {
            return d(drawable);
        }
        int i7 = this.f19307m;
        if (i7 != 0) {
            Drawable b10 = c8.a0.b(this.f19308n.f19273a, i7);
            this.f19307m = 0;
            this.f19306l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f19313s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f19314t;
    }

    @Override
    public final Intent getIntent() {
        return this.f19302g;
    }

    @Override
    public final int getItemId() {
        return this.f19297a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f19303i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f19299c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f19309o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f19300e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f19301f;
        if (charSequence == null) {
            return this.f19300e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f19312r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f19309o != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override
    public final boolean isCheckable() {
        if ((this.f19317x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f19317x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f19317x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        n nVar = this.A;
        if (nVar != null && nVar.f19320a.overridesItemVisibility()) {
            if ((this.f19317x & 8) == 0 && this.A.f19320a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f19317x & 8) == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override
    public final MenuItem setActionView(View view) {
        int i7;
        this.f19319z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i7 = this.f19297a) > 0) {
            view.setId(i7);
        }
        k kVar = this.f19308n;
        kVar.f19281k = true;
        kVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f19304j == c10) {
            return this;
        }
        this.f19304j = Character.toLowerCase(c10);
        this.f19308n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i7 = this.f19317x;
        int i10 = (z10 ? 1 : 0) | (i7 & (-2));
        this.f19317x = i10;
        if (i7 != i10) {
            this.f19308n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i7;
        int i10 = this.f19317x;
        int i11 = i10 & 4;
        int i12 = 2;
        k kVar = this.f19308n;
        if (i11 != 0) {
            ArrayList arrayList = kVar.f19277f;
            int size = arrayList.size();
            kVar.w();
            for (int i13 = 0; i13 < size; i13++) {
                m mVar = (m) arrayList.get(i13);
                if (mVar.f19298b == this.f19298b && (mVar.f19317x & 4) != 0 && mVar.isCheckable()) {
                    if (mVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i14 = mVar.f19317x;
                    int i15 = i14 & (-3);
                    if (z11) {
                        i7 = 2;
                    } else {
                        i7 = 0;
                    }
                    int i16 = i7 | i15;
                    mVar.f19317x = i16;
                    if (i14 != i16) {
                        mVar.f19308n.p(false);
                    }
                }
            }
            kVar.v();
            return this;
        }
        int i17 = i10 & (-3);
        if (!z10) {
            i12 = 0;
        }
        int i18 = i17 | i12;
        this.f19317x = i18;
        if (i10 != i18) {
            kVar.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f19317x |= 16;
        } else {
            this.f19317x &= -17;
        }
        this.f19308n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f19307m = 0;
        this.f19306l = drawable;
        this.f19316w = true;
        this.f19308n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f19313s = colorStateList;
        this.f19315u = true;
        this.f19316w = true;
        this.f19308n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f19314t = mode;
        this.v = true;
        this.f19316w = true;
        this.f19308n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f19302g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f19308n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f19310p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f19304j = Character.toLowerCase(c11);
        this.f19308n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i7) {
        int i10 = i7 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f19318y = i7;
        k kVar = this.f19308n;
        kVar.f19281k = true;
        kVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f19300e = charSequence;
        this.f19308n.p(false);
        d0 d0Var = this.f19309o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f19301f = charSequence;
        this.f19308n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        int i7;
        int i10 = this.f19317x;
        int i11 = i10 & (-9);
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        int i12 = i7 | i11;
        this.f19317x = i12;
        if (i10 != i12) {
            k kVar = this.f19308n;
            kVar.h = true;
            kVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f19300e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f19311q = charSequence;
        this.f19308n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f19312r = charSequence;
        this.f19308n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i7) {
        if (this.f19304j == c10 && this.f19305k == i7) {
            return this;
        }
        this.f19304j = Character.toLowerCase(c10);
        this.f19305k = KeyEvent.normalizeMetaState(i7);
        this.f19308n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i7) {
        if (this.h == c10 && this.f19303i == i7) {
            return this;
        }
        this.h = c10;
        this.f19303i = KeyEvent.normalizeMetaState(i7);
        this.f19308n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i7, int i10) {
        this.h = c10;
        this.f19303i = KeyEvent.normalizeMetaState(i7);
        this.f19304j = Character.toLowerCase(c11);
        this.f19305k = KeyEvent.normalizeMetaState(i10);
        this.f19308n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i7) {
        this.f19306l = null;
        this.f19307m = i7;
        this.f19316w = true;
        this.f19308n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i7) {
        setTitle(this.f19308n.f19273a.getString(i7));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i7) {
        int i10;
        k kVar = this.f19308n;
        Context context = kVar.f19273a;
        View inflate = LayoutInflater.from(context).inflate(i7, (ViewGroup) new LinearLayout(context), false);
        this.f19319z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.f19297a) > 0) {
            inflate.setId(i10);
        }
        kVar.f19281k = true;
        kVar.p(true);
        return this;
    }
}
