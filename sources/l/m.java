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
import v7.r8;
import v7.v7;
public final class m implements l0.a {
    public n A;
    public MenuItem.OnActionExpandListener B;
    public final int f15193a;
    public final int f15194b;
    public final int f15195c;
    public final int d;
    public CharSequence f15196e;
    public CharSequence f15197f;
    public Intent f15198g;
    public char h;
    public char f15200j;
    public Drawable f15202l;
    public final k f15204n;
    public d0 f15205o;
    public MenuItem.OnMenuItemClickListener f15206p;
    public CharSequence f15207q;
    public CharSequence f15208r;
    public int f15214y;
    public View f15215z;
    public int f15199i = 4096;
    public int f15201k = 4096;
    public int f15203m = 0;
    public ColorStateList f15209s = null;
    public PorterDuff.Mode f15210t = null;
    public boolean f15211u = false;
    public boolean v = false;
    public boolean f15212w = false;
    public int f15213x = 16;
    public boolean C = false;

    public m(k kVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f15204n = kVar;
        this.f15193a = i11;
        this.f15194b = i10;
        this.f15195c = i12;
        this.d = i13;
        this.f15196e = charSequence;
        this.f15214y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(n nVar) {
        this.f15215z = null;
        this.A = nVar;
        this.f15204n.p(true);
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.f15217b = new a6.m(this, 29);
            nVar2.f15216a.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override
    public final n b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f15214y & 8) == 0) {
            return false;
        }
        if (this.f15215z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f15204n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f15212w && (this.f15211u || this.v)) {
            drawable = r8.d(drawable).mutate();
            if (this.f15211u) {
                drawable.setTintList(this.f15209s);
            }
            if (this.v) {
                drawable.setTintMode(this.f15210t);
            }
            this.f15212w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f15214y & 8) != 0) {
            if (this.f15215z == null && (nVar = this.A) != null) {
                this.f15215z = nVar.a(this);
            }
            if (this.f15215z != null) {
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
            return this.f15204n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f15213x |= 32;
        } else {
            this.f15213x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f15215z;
        if (view != null) {
            return view;
        }
        n nVar = this.A;
        if (nVar != null) {
            View a2 = nVar.a(this);
            this.f15215z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f15201k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f15200j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f15207q;
    }

    @Override
    public final int getGroupId() {
        return this.f15194b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f15202l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f15203m;
        if (i10 != 0) {
            Drawable b10 = v7.b(this.f15204n.f15169a, i10);
            this.f15203m = 0;
            this.f15202l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f15209s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f15210t;
    }

    @Override
    public final Intent getIntent() {
        return this.f15198g;
    }

    @Override
    public final int getItemId() {
        return this.f15193a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f15199i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f15195c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f15205o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f15196e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15197f;
        if (charSequence == null) {
            return this.f15196e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f15208r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f15205o != null) {
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
        if ((this.f15213x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f15213x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f15213x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        n nVar = this.A;
        if (nVar != null && nVar.f15216a.overridesItemVisibility()) {
            if ((this.f15213x & 8) == 0 && this.A.f15216a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f15213x & 8) == 0) {
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
        this.f15215z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f15193a) > 0) {
            view.setId(i10);
        }
        k kVar = this.f15204n;
        kVar.f15177k = true;
        kVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f15200j == c10) {
            return this;
        }
        this.f15200j = Character.toLowerCase(c10);
        this.f15204n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f15213x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f15213x = i11;
        if (i10 != i11) {
            this.f15204n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f15213x;
        int i12 = i11 & 4;
        int i13 = 2;
        k kVar = this.f15204n;
        if (i12 != 0) {
            ArrayList arrayList = kVar.f15173f;
            int size = arrayList.size();
            kVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                m mVar = (m) arrayList.get(i14);
                if (mVar.f15194b == this.f15194b && (mVar.f15213x & 4) != 0 && mVar.isCheckable()) {
                    if (mVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i15 = mVar.f15213x;
                    int i16 = i15 & (-3);
                    if (z11) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i17 = i10 | i16;
                    mVar.f15213x = i17;
                    if (i15 != i17) {
                        mVar.f15204n.p(false);
                    }
                }
            }
            kVar.v();
            return this;
        }
        int i18 = i11 & (-3);
        if (!z10) {
            i13 = 0;
        }
        int i19 = i18 | i13;
        this.f15213x = i19;
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
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f15213x |= 16;
        } else {
            this.f15213x &= -17;
        }
        this.f15204n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f15203m = 0;
        this.f15202l = drawable;
        this.f15212w = true;
        this.f15204n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15209s = colorStateList;
        this.f15211u = true;
        this.f15212w = true;
        this.f15204n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15210t = mode;
        this.v = true;
        this.f15212w = true;
        this.f15204n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f15198g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f15204n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15206p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f15200j = Character.toLowerCase(c11);
        this.f15204n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f15214y = i10;
        k kVar = this.f15204n;
        kVar.f15177k = true;
        kVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f15196e = charSequence;
        this.f15204n.p(false);
        d0 d0Var = this.f15205o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15197f = charSequence;
        this.f15204n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        int i10;
        int i11 = this.f15213x;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f15213x = i13;
        if (i11 != i13) {
            k kVar = this.f15204n;
            kVar.h = true;
            kVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f15196e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f15207q = charSequence;
        this.f15204n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f15208r = charSequence;
        this.f15204n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f15200j == c10 && this.f15201k == i10) {
            return this;
        }
        this.f15200j = Character.toLowerCase(c10);
        this.f15201k = KeyEvent.normalizeMetaState(i10);
        this.f15204n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.h == c10 && this.f15199i == i10) {
            return this;
        }
        this.h = c10;
        this.f15199i = KeyEvent.normalizeMetaState(i10);
        this.f15204n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.h = c10;
        this.f15199i = KeyEvent.normalizeMetaState(i10);
        this.f15200j = Character.toLowerCase(c11);
        this.f15201k = KeyEvent.normalizeMetaState(i11);
        this.f15204n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f15202l = null;
        this.f15203m = i10;
        this.f15212w = true;
        this.f15204n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f15204n.f15169a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        k kVar = this.f15204n;
        Context context = kVar.f15169a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f15215z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f15193a) > 0) {
            inflate.setId(i11);
        }
        kVar.f15177k = true;
        kVar.p(true);
        return this;
    }
}
