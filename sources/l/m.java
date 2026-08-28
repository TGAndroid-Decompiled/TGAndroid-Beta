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
import f7.q8;
import f7.t7;
import java.util.ArrayList;
public final class m implements l0.a {
    public n A;
    public MenuItem.OnActionExpandListener B;
    public final int f16578a;
    public final int f16579b;
    public final int f16580c;
    public final int d;
    public CharSequence f16581e;
    public CharSequence f16582f;
    public Intent f16583g;
    public char h;
    public char f16585j;
    public Drawable f16587l;
    public final k f16589n;
    public d0 f16590o;
    public MenuItem.OnMenuItemClickListener f16591p;
    public CharSequence f16592q;
    public CharSequence f16593r;
    public int f16599y;
    public View f16600z;
    public int f16584i = 4096;
    public int f16586k = 4096;
    public int f16588m = 0;
    public ColorStateList f16594s = null;
    public PorterDuff.Mode f16595t = null;
    public boolean f16596u = false;
    public boolean v = false;
    public boolean f16597w = false;
    public int f16598x = 16;
    public boolean C = false;

    public m(k kVar, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f16589n = kVar;
        this.f16578a = i10;
        this.f16579b = i9;
        this.f16580c = i11;
        this.d = i12;
        this.f16581e = charSequence;
        this.f16599y = i13;
    }

    public static void c(StringBuilder sb2, int i9, int i10, String str) {
        if ((i9 & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(n nVar) {
        this.f16600z = null;
        this.A = nVar;
        this.f16589n.p(true);
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.f16602b = new android.support.v4.media.c(this, 23);
            nVar2.f16601a.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override
    public final n b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f16599y & 8) == 0) {
            return false;
        }
        if (this.f16600z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f16589n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f16597w && (this.f16596u || this.v)) {
            drawable = q8.d(drawable).mutate();
            if (this.f16596u) {
                drawable.setTintList(this.f16594s);
            }
            if (this.v) {
                drawable.setTintMode(this.f16595t);
            }
            this.f16597w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f16599y & 8) != 0) {
            if (this.f16600z == null && (nVar = this.A) != null) {
                this.f16600z = nVar.a(this);
            }
            if (this.f16600z != null) {
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
            return this.f16589n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f16598x |= 32;
        } else {
            this.f16598x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f16600z;
        if (view != null) {
            return view;
        }
        n nVar = this.A;
        if (nVar != null) {
            View a2 = nVar.a(this);
            this.f16600z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f16586k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f16585j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f16592q;
    }

    @Override
    public final int getGroupId() {
        return this.f16579b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f16587l;
        if (drawable != null) {
            return d(drawable);
        }
        int i9 = this.f16588m;
        if (i9 != 0) {
            Drawable b10 = t7.b(this.f16589n.f16554a, i9);
            this.f16588m = 0;
            this.f16587l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f16594s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f16595t;
    }

    @Override
    public final Intent getIntent() {
        return this.f16583g;
    }

    @Override
    public final int getItemId() {
        return this.f16578a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f16584i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f16580c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f16590o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f16581e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f16582f;
        if (charSequence == null) {
            return this.f16581e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f16593r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f16590o != null) {
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
        if ((this.f16598x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f16598x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f16598x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        n nVar = this.A;
        if (nVar != null && nVar.f16601a.overridesItemVisibility()) {
            if ((this.f16598x & 8) == 0 && this.A.f16601a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f16598x & 8) == 0) {
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
        int i9;
        this.f16600z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i9 = this.f16578a) > 0) {
            view.setId(i9);
        }
        k kVar = this.f16589n;
        kVar.f16562k = true;
        kVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f16585j == c10) {
            return this;
        }
        this.f16585j = Character.toLowerCase(c10);
        this.f16589n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i9 = this.f16598x;
        int i10 = (z10 ? 1 : 0) | (i9 & (-2));
        this.f16598x = i10;
        if (i9 != i10) {
            this.f16589n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i9;
        int i10 = this.f16598x;
        int i11 = i10 & 4;
        int i12 = 2;
        k kVar = this.f16589n;
        if (i11 != 0) {
            ArrayList arrayList = kVar.f16558f;
            int size = arrayList.size();
            kVar.w();
            for (int i13 = 0; i13 < size; i13++) {
                m mVar = (m) arrayList.get(i13);
                if (mVar.f16579b == this.f16579b && (mVar.f16598x & 4) != 0 && mVar.isCheckable()) {
                    if (mVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i14 = mVar.f16598x;
                    int i15 = i14 & (-3);
                    if (z11) {
                        i9 = 2;
                    } else {
                        i9 = 0;
                    }
                    int i16 = i9 | i15;
                    mVar.f16598x = i16;
                    if (i14 != i16) {
                        mVar.f16589n.p(false);
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
        this.f16598x = i18;
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
            this.f16598x |= 16;
        } else {
            this.f16598x &= -17;
        }
        this.f16589n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f16588m = 0;
        this.f16587l = drawable;
        this.f16597w = true;
        this.f16589n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f16594s = colorStateList;
        this.f16596u = true;
        this.f16597w = true;
        this.f16589n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f16595t = mode;
        this.v = true;
        this.f16597w = true;
        this.f16589n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f16583g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f16589n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f16591p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f16585j = Character.toLowerCase(c11);
        this.f16589n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i9) {
        int i10 = i9 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f16599y = i9;
        k kVar = this.f16589n;
        kVar.f16562k = true;
        kVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i9) {
        setShowAsAction(i9);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f16581e = charSequence;
        this.f16589n.p(false);
        d0 d0Var = this.f16590o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f16582f = charSequence;
        this.f16589n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        int i9;
        int i10 = this.f16598x;
        int i11 = i10 & (-9);
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        int i12 = i9 | i11;
        this.f16598x = i12;
        if (i10 != i12) {
            k kVar = this.f16589n;
            kVar.h = true;
            kVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f16581e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f16592q = charSequence;
        this.f16589n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f16593r = charSequence;
        this.f16589n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i9) {
        if (this.f16585j == c10 && this.f16586k == i9) {
            return this;
        }
        this.f16585j = Character.toLowerCase(c10);
        this.f16586k = KeyEvent.normalizeMetaState(i9);
        this.f16589n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i9) {
        if (this.h == c10 && this.f16584i == i9) {
            return this;
        }
        this.h = c10;
        this.f16584i = KeyEvent.normalizeMetaState(i9);
        this.f16589n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i9, int i10) {
        this.h = c10;
        this.f16584i = KeyEvent.normalizeMetaState(i9);
        this.f16585j = Character.toLowerCase(c11);
        this.f16586k = KeyEvent.normalizeMetaState(i10);
        this.f16589n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i9) {
        this.f16587l = null;
        this.f16588m = i9;
        this.f16597w = true;
        this.f16589n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i9) {
        setTitle(this.f16589n.f16554a.getString(i9));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i9) {
        int i10;
        k kVar = this.f16589n;
        Context context = kVar.f16554a;
        View inflate = LayoutInflater.from(context).inflate(i9, (ViewGroup) new LinearLayout(context), false);
        this.f16600z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.f16578a) > 0) {
            inflate.setId(i10);
        }
        kVar.f16562k = true;
        kVar.p(true);
        return this;
    }
}
