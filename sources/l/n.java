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
import v7.o8;
import v7.u7;
public final class n implements l0.a {
    public o A;
    public MenuItem.OnActionExpandListener B;
    public final int f15134a;
    public final int f15135b;
    public final int f15136c;
    public final int d;
    public CharSequence f15137e;
    public CharSequence f15138f;
    public Intent f15139g;
    public char h;
    public char f15141j;
    public Drawable f15143l;
    public final l f15145n;
    public e0 f15146o;
    public MenuItem.OnMenuItemClickListener f15147p;
    public CharSequence f15148q;
    public CharSequence f15149r;
    public int f15155y;
    public View f15156z;
    public int f15140i = 4096;
    public int f15142k = 4096;
    public int f15144m = 0;
    public ColorStateList f15150s = null;
    public PorterDuff.Mode f15151t = null;
    public boolean f15152u = false;
    public boolean v = false;
    public boolean f15153w = false;
    public int f15154x = 16;
    public boolean C = false;

    public n(l lVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f15145n = lVar;
        this.f15134a = i11;
        this.f15135b = i10;
        this.f15136c = i12;
        this.d = i13;
        this.f15137e = charSequence;
        this.f15155y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(o oVar) {
        this.f15156z = null;
        this.A = oVar;
        this.f15145n.p(true);
        o oVar2 = this.A;
        if (oVar2 != null) {
            oVar2.f15158b = new xa.c(this, 26);
            oVar2.f15157a.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override
    public final o b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f15155y & 8) == 0) {
            return false;
        }
        if (this.f15156z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f15145n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f15153w && (this.f15152u || this.v)) {
            drawable = o8.d(drawable).mutate();
            if (this.f15152u) {
                drawable.setTintList(this.f15150s);
            }
            if (this.v) {
                drawable.setTintMode(this.f15151t);
            }
            this.f15153w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f15155y & 8) != 0) {
            if (this.f15156z == null && (oVar = this.A) != null) {
                this.f15156z = oVar.a(this);
            }
            if (this.f15156z != null) {
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
            return this.f15145n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f15154x |= 32;
        } else {
            this.f15154x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f15156z;
        if (view != null) {
            return view;
        }
        o oVar = this.A;
        if (oVar != null) {
            View a2 = oVar.a(this);
            this.f15156z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f15142k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f15141j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f15148q;
    }

    @Override
    public final int getGroupId() {
        return this.f15135b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f15143l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f15144m;
        if (i10 != 0) {
            Drawable b10 = u7.b(this.f15145n.f15110a, i10);
            this.f15144m = 0;
            this.f15143l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f15150s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f15151t;
    }

    @Override
    public final Intent getIntent() {
        return this.f15139g;
    }

    @Override
    public final int getItemId() {
        return this.f15134a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f15140i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f15136c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f15146o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f15137e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15138f;
        if (charSequence == null) {
            return this.f15137e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f15149r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f15146o != null) {
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
        if ((this.f15154x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f15154x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f15154x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        o oVar = this.A;
        if (oVar != null && oVar.f15157a.overridesItemVisibility()) {
            if ((this.f15154x & 8) == 0 && this.A.f15157a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f15154x & 8) == 0) {
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
        this.f15156z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f15134a) > 0) {
            view.setId(i10);
        }
        l lVar = this.f15145n;
        lVar.f15118k = true;
        lVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f15141j == c10) {
            return this;
        }
        this.f15141j = Character.toLowerCase(c10);
        this.f15145n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f15154x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f15154x = i11;
        if (i10 != i11) {
            this.f15145n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f15154x;
        int i12 = i11 & 4;
        int i13 = 2;
        l lVar = this.f15145n;
        if (i12 != 0) {
            ArrayList arrayList = lVar.f15114f;
            int size = arrayList.size();
            lVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                n nVar = (n) arrayList.get(i14);
                if (nVar.f15135b == this.f15135b && (nVar.f15154x & 4) != 0 && nVar.isCheckable()) {
                    if (nVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i15 = nVar.f15154x;
                    int i16 = i15 & (-3);
                    if (z11) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i17 = i10 | i16;
                    nVar.f15154x = i17;
                    if (i15 != i17) {
                        nVar.f15145n.p(false);
                    }
                }
            }
            lVar.v();
            return this;
        }
        int i18 = i11 & (-3);
        if (!z10) {
            i13 = 0;
        }
        int i19 = i18 | i13;
        this.f15154x = i19;
        if (i11 != i19) {
            lVar.p(false);
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
            this.f15154x |= 16;
        } else {
            this.f15154x &= -17;
        }
        this.f15145n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f15144m = 0;
        this.f15143l = drawable;
        this.f15153w = true;
        this.f15145n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15150s = colorStateList;
        this.f15152u = true;
        this.f15153w = true;
        this.f15145n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15151t = mode;
        this.v = true;
        this.f15153w = true;
        this.f15145n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f15139g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f15145n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15147p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f15141j = Character.toLowerCase(c11);
        this.f15145n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f15155y = i10;
        l lVar = this.f15145n;
        lVar.f15118k = true;
        lVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f15137e = charSequence;
        this.f15145n.p(false);
        e0 e0Var = this.f15146o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15138f = charSequence;
        this.f15145n.p(false);
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
        int i11 = this.f15154x;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f15154x = i13;
        if (i11 != i13) {
            l lVar = this.f15145n;
            lVar.h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f15137e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f15148q = charSequence;
        this.f15145n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f15149r = charSequence;
        this.f15145n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f15141j == c10 && this.f15142k == i10) {
            return this;
        }
        this.f15141j = Character.toLowerCase(c10);
        this.f15142k = KeyEvent.normalizeMetaState(i10);
        this.f15145n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.h == c10 && this.f15140i == i10) {
            return this;
        }
        this.h = c10;
        this.f15140i = KeyEvent.normalizeMetaState(i10);
        this.f15145n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.h = c10;
        this.f15140i = KeyEvent.normalizeMetaState(i10);
        this.f15141j = Character.toLowerCase(c11);
        this.f15142k = KeyEvent.normalizeMetaState(i11);
        this.f15145n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f15143l = null;
        this.f15144m = i10;
        this.f15153w = true;
        this.f15145n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f15145n.f15110a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        l lVar = this.f15145n;
        Context context = lVar.f15110a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f15156z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f15134a) > 0) {
            inflate.setId(i11);
        }
        lVar.f15118k = true;
        lVar.p(true);
        return this;
    }
}
