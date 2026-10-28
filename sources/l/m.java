package l;

import a8.kc;
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
import jg.s0;
public final class m implements l0.a {
    public n A;
    public MenuItem.OnActionExpandListener B;
    public final int f16741a;
    public final int f16742b;
    public final int f16743c;
    public final int d;
    public CharSequence e;
    public CharSequence f16744f;
    public Intent f16745g;
    public char h;
    public char f16747j;
    public Drawable f16749l;
    public final k f16751n;
    public d0 f16752o;
    public MenuItem.OnMenuItemClickListener f16753p;
    public CharSequence f16754q;
    public CharSequence f16755r;
    public int f16761y;
    public View f16762z;
    public int f16746i = 4096;
    public int f16748k = 4096;
    public int f16750m = 0;
    public ColorStateList f16756s = null;
    public PorterDuff.Mode f16757t = null;
    public boolean f16758u = false;
    public boolean v = false;
    public boolean f16759w = false;
    public int f16760x = 16;
    public boolean C = false;

    public m(k kVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f16751n = kVar;
        this.f16741a = i11;
        this.f16742b = i10;
        this.f16743c = i12;
        this.d = i13;
        this.e = charSequence;
        this.f16761y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(n nVar) {
        this.f16762z = null;
        this.A = nVar;
        this.f16751n.p(true);
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.f16764b = new s0(this, 3);
            nVar2.f16763a.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override
    public final n b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f16761y & 8) == 0) {
            return false;
        }
        if (this.f16762z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f16751n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f16759w && (this.f16758u || this.v)) {
            drawable = drawable.mutate();
            if (this.f16758u) {
                drawable.setTintList(this.f16756s);
            }
            if (this.v) {
                drawable.setTintMode(this.f16757t);
            }
            this.f16759w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f16761y & 8) != 0) {
            if (this.f16762z == null && (nVar = this.A) != null) {
                this.f16762z = nVar.a(this);
            }
            if (this.f16762z != null) {
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
            return this.f16751n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f16760x |= 32;
        } else {
            this.f16760x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f16762z;
        if (view != null) {
            return view;
        }
        n nVar = this.A;
        if (nVar != null) {
            View a2 = nVar.a(this);
            this.f16762z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f16748k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f16747j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f16754q;
    }

    @Override
    public final int getGroupId() {
        return this.f16742b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f16749l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f16750m;
        if (i10 != 0) {
            Drawable b10 = kc.b(this.f16751n.f16718a, i10);
            this.f16750m = 0;
            this.f16749l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f16756s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f16757t;
    }

    @Override
    public final Intent getIntent() {
        return this.f16745g;
    }

    @Override
    public final int getItemId() {
        return this.f16741a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f16746i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f16743c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f16752o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f16744f;
        if (charSequence == null) {
            return this.e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f16755r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f16752o != null) {
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
        if ((this.f16760x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f16760x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f16760x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        n nVar = this.A;
        if (nVar != null && nVar.f16763a.overridesItemVisibility()) {
            if ((this.f16760x & 8) == 0 && this.A.f16763a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f16760x & 8) == 0) {
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
        this.f16762z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f16741a) > 0) {
            view.setId(i10);
        }
        k kVar = this.f16751n;
        kVar.f16725k = true;
        kVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f16747j == c10) {
            return this;
        }
        this.f16747j = Character.toLowerCase(c10);
        this.f16751n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f16760x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f16760x = i11;
        if (i10 != i11) {
            this.f16751n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f16760x;
        int i12 = i11 & 4;
        int i13 = 2;
        k kVar = this.f16751n;
        if (i12 != 0) {
            ArrayList arrayList = kVar.f16721f;
            int size = arrayList.size();
            kVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                m mVar = (m) arrayList.get(i14);
                if (mVar.f16742b == this.f16742b && (mVar.f16760x & 4) != 0 && mVar.isCheckable()) {
                    if (mVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i15 = mVar.f16760x;
                    int i16 = i15 & (-3);
                    if (z11) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i17 = i10 | i16;
                    mVar.f16760x = i17;
                    if (i15 != i17) {
                        mVar.f16751n.p(false);
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
        this.f16760x = i19;
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
            this.f16760x |= 16;
        } else {
            this.f16760x &= -17;
        }
        this.f16751n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f16750m = 0;
        this.f16749l = drawable;
        this.f16759w = true;
        this.f16751n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f16756s = colorStateList;
        this.f16758u = true;
        this.f16759w = true;
        this.f16751n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f16757t = mode;
        this.v = true;
        this.f16759w = true;
        this.f16751n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f16745g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f16751n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f16753p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f16747j = Character.toLowerCase(c11);
        this.f16751n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f16761y = i10;
        k kVar = this.f16751n;
        kVar.f16725k = true;
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
        this.f16751n.p(false);
        d0 d0Var = this.f16752o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f16744f = charSequence;
        this.f16751n.p(false);
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
        int i11 = this.f16760x;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f16760x = i13;
        if (i11 != i13) {
            k kVar = this.f16751n;
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
        this.f16754q = charSequence;
        this.f16751n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f16755r = charSequence;
        this.f16751n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f16747j == c10 && this.f16748k == i10) {
            return this;
        }
        this.f16747j = Character.toLowerCase(c10);
        this.f16748k = KeyEvent.normalizeMetaState(i10);
        this.f16751n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.h == c10 && this.f16746i == i10) {
            return this;
        }
        this.h = c10;
        this.f16746i = KeyEvent.normalizeMetaState(i10);
        this.f16751n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.h = c10;
        this.f16746i = KeyEvent.normalizeMetaState(i10);
        this.f16747j = Character.toLowerCase(c11);
        this.f16748k = KeyEvent.normalizeMetaState(i11);
        this.f16751n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f16749l = null;
        this.f16750m = i10;
        this.f16759w = true;
        this.f16751n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f16751n.f16718a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        k kVar = this.f16751n;
        Context context = kVar.f16718a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f16762z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f16741a) > 0) {
            inflate.setId(i11);
        }
        kVar.f16725k = true;
        kVar.p(true);
        return this;
    }
}
