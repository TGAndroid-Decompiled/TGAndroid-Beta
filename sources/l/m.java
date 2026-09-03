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
import j7.i8;
import j7.r7;
import java.util.ArrayList;
public final class m implements l0.a {
    public n A;
    public MenuItem.OnActionExpandListener B;
    public final int f11173a;
    public final int f11174b;
    public final int f11175c;
    public final int d;
    public CharSequence e;
    public CharSequence f11176f;
    public Intent f11177g;
    public char h;
    public char f11179j;
    public Drawable f11181l;
    public final k f11183n;
    public d0 f11184o;
    public MenuItem.OnMenuItemClickListener f11185p;
    public CharSequence f11186q;
    public CharSequence f11187r;
    public int f11193y;
    public View f11194z;
    public int f11178i = 4096;
    public int f11180k = 4096;
    public int f11182m = 0;
    public ColorStateList f11188s = null;
    public PorterDuff.Mode f11189t = null;
    public boolean f11190u = false;
    public boolean v = false;
    public boolean f11191w = false;
    public int f11192x = 16;
    public boolean C = false;

    public m(k kVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f11183n = kVar;
        this.f11173a = i11;
        this.f11174b = i10;
        this.f11175c = i12;
        this.d = i13;
        this.e = charSequence;
        this.f11193y = i14;
    }

    public static void c(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    @Override
    public final l0.a a(n nVar) {
        this.f11194z = null;
        this.A = nVar;
        this.f11183n.p(true);
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.f11196b = new bb.b(this, 22);
            nVar2.f11195a.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override
    public final n b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f11193y & 8) == 0) {
            return false;
        }
        if (this.f11194z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f11183n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f11191w && (this.f11190u || this.v)) {
            drawable = i8.d(drawable).mutate();
            if (this.f11190u) {
                drawable.setTintList(this.f11188s);
            }
            if (this.v) {
                drawable.setTintMode(this.f11189t);
            }
            this.f11191w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f11193y & 8) != 0) {
            if (this.f11194z == null && (nVar = this.A) != null) {
                this.f11194z = nVar.a(this);
            }
            if (this.f11194z != null) {
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
            return this.f11183n.f(this);
        }
        return false;
    }

    public final void f(boolean z4) {
        if (z4) {
            this.f11192x |= 32;
        } else {
            this.f11192x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f11194z;
        if (view != null) {
            return view;
        }
        n nVar = this.A;
        if (nVar != null) {
            View a2 = nVar.a(this);
            this.f11194z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f11180k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f11179j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f11186q;
    }

    @Override
    public final int getGroupId() {
        return this.f11174b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f11181l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f11182m;
        if (i10 != 0) {
            Drawable b10 = r7.b(this.f11183n.f11150a, i10);
            this.f11182m = 0;
            this.f11181l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f11188s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f11189t;
    }

    @Override
    public final Intent getIntent() {
        return this.f11177g;
    }

    @Override
    public final int getItemId() {
        return this.f11173a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f11178i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f11175c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f11184o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f11176f;
        if (charSequence == null) {
            return this.e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f11187r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f11184o != null) {
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
        if ((this.f11192x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f11192x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f11192x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        n nVar = this.A;
        if (nVar != null && nVar.f11195a.overridesItemVisibility()) {
            if ((this.f11192x & 8) == 0 && this.A.f11195a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f11192x & 8) == 0) {
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
        int i10;
        this.f11194z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f11173a) > 0) {
            view.setId(i10);
        }
        k kVar = this.f11183n;
        kVar.f11157k = true;
        kVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f11179j == c3) {
            return this;
        }
        this.f11179j = Character.toLowerCase(c3);
        this.f11183n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z4) {
        int i10 = this.f11192x;
        int i11 = (z4 ? 1 : 0) | (i10 & (-2));
        this.f11192x = i11;
        if (i10 != i11) {
            this.f11183n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z4) {
        boolean z10;
        int i10;
        int i11 = this.f11192x;
        int i12 = i11 & 4;
        int i13 = 2;
        k kVar = this.f11183n;
        if (i12 != 0) {
            ArrayList arrayList = kVar.f11153f;
            int size = arrayList.size();
            kVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                m mVar = (m) arrayList.get(i14);
                if (mVar.f11174b == this.f11174b && (mVar.f11192x & 4) != 0 && mVar.isCheckable()) {
                    if (mVar == this) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i15 = mVar.f11192x;
                    int i16 = i15 & (-3);
                    if (z10) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i17 = i10 | i16;
                    mVar.f11192x = i17;
                    if (i15 != i17) {
                        mVar.f11183n.p(false);
                    }
                }
            }
            kVar.v();
            return this;
        }
        int i18 = i11 & (-3);
        if (!z4) {
            i13 = 0;
        }
        int i19 = i18 | i13;
        this.f11192x = i19;
        if (i11 != i19) {
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
    public final MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.f11192x |= 16;
        } else {
            this.f11192x &= -17;
        }
        this.f11183n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f11182m = 0;
        this.f11181l = drawable;
        this.f11191w = true;
        this.f11183n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11188s = colorStateList;
        this.f11190u = true;
        this.f11191w = true;
        this.f11183n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11189t = mode;
        this.v = true;
        this.f11191w = true;
        this.f11183n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f11177g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c3) {
        if (this.h == c3) {
            return this;
        }
        this.h = c3;
        this.f11183n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f11185p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c3, char c10) {
        this.h = c3;
        this.f11179j = Character.toLowerCase(c10);
        this.f11183n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f11193y = i10;
        k kVar = this.f11183n;
        kVar.f11157k = true;
        kVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.f11183n.p(false);
        d0 d0Var = this.f11184o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11176f = charSequence;
        this.f11183n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z4) {
        int i10;
        int i11 = this.f11192x;
        int i12 = i11 & (-9);
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f11192x = i13;
        if (i11 != i13) {
            k kVar = this.f11183n;
            kVar.h = true;
            kVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f11186q = charSequence;
        this.f11183n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f11187r = charSequence;
        this.f11183n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c3, int i10) {
        if (this.f11179j == c3 && this.f11180k == i10) {
            return this;
        }
        this.f11179j = Character.toLowerCase(c3);
        this.f11180k = KeyEvent.normalizeMetaState(i10);
        this.f11183n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c3, int i10) {
        if (this.h == c3 && this.f11178i == i10) {
            return this;
        }
        this.h = c3;
        this.f11178i = KeyEvent.normalizeMetaState(i10);
        this.f11183n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c3, char c10, int i10, int i11) {
        this.h = c3;
        this.f11178i = KeyEvent.normalizeMetaState(i10);
        this.f11179j = Character.toLowerCase(c10);
        this.f11180k = KeyEvent.normalizeMetaState(i11);
        this.f11183n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f11181l = null;
        this.f11182m = i10;
        this.f11191w = true;
        this.f11183n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f11183n.f11150a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        k kVar = this.f11183n;
        Context context = kVar.f11150a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f11194z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f11173a) > 0) {
            inflate.setId(i11);
        }
        kVar.f11157k = true;
        kVar.p(true);
        return this;
    }
}
