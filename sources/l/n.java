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
    public final int f15160a;
    public final int f15161b;
    public final int f15162c;
    public final int d;
    public CharSequence f15163e;
    public CharSequence f15164f;
    public Intent f15165g;
    public char h;
    public char f15167j;
    public Drawable f15169l;
    public final l f15171n;
    public e0 f15172o;
    public MenuItem.OnMenuItemClickListener f15173p;
    public CharSequence f15174q;
    public CharSequence f15175r;
    public int f15181y;
    public View f15182z;
    public int f15166i = 4096;
    public int f15168k = 4096;
    public int f15170m = 0;
    public ColorStateList f15176s = null;
    public PorterDuff.Mode f15177t = null;
    public boolean f15178u = false;
    public boolean v = false;
    public boolean f15179w = false;
    public int f15180x = 16;
    public boolean C = false;

    public n(l lVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f15171n = lVar;
        this.f15160a = i11;
        this.f15161b = i10;
        this.f15162c = i12;
        this.d = i13;
        this.f15163e = charSequence;
        this.f15181y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(o oVar) {
        this.f15182z = null;
        this.A = oVar;
        this.f15171n.p(true);
        o oVar2 = this.A;
        if (oVar2 != null) {
            oVar2.f15184b = new xa.c(this, 26);
            oVar2.f15183a.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override
    public final o b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f15181y & 8) == 0) {
            return false;
        }
        if (this.f15182z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f15171n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f15179w && (this.f15178u || this.v)) {
            drawable = o8.d(drawable).mutate();
            if (this.f15178u) {
                drawable.setTintList(this.f15176s);
            }
            if (this.v) {
                drawable.setTintMode(this.f15177t);
            }
            this.f15179w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f15181y & 8) != 0) {
            if (this.f15182z == null && (oVar = this.A) != null) {
                this.f15182z = oVar.a(this);
            }
            if (this.f15182z != null) {
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
            return this.f15171n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f15180x |= 32;
        } else {
            this.f15180x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f15182z;
        if (view != null) {
            return view;
        }
        o oVar = this.A;
        if (oVar != null) {
            View a2 = oVar.a(this);
            this.f15182z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f15168k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f15167j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f15174q;
    }

    @Override
    public final int getGroupId() {
        return this.f15161b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f15169l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f15170m;
        if (i10 != 0) {
            Drawable b10 = u7.b(this.f15171n.f15136a, i10);
            this.f15170m = 0;
            this.f15169l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f15176s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f15177t;
    }

    @Override
    public final Intent getIntent() {
        return this.f15165g;
    }

    @Override
    public final int getItemId() {
        return this.f15160a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f15166i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f15162c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f15172o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f15163e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15164f;
        if (charSequence == null) {
            return this.f15163e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f15175r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f15172o != null) {
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
        if ((this.f15180x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f15180x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f15180x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        o oVar = this.A;
        if (oVar != null && oVar.f15183a.overridesItemVisibility()) {
            if ((this.f15180x & 8) == 0 && this.A.f15183a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f15180x & 8) == 0) {
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
        this.f15182z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f15160a) > 0) {
            view.setId(i10);
        }
        l lVar = this.f15171n;
        lVar.f15144k = true;
        lVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f15167j == c10) {
            return this;
        }
        this.f15167j = Character.toLowerCase(c10);
        this.f15171n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f15180x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f15180x = i11;
        if (i10 != i11) {
            this.f15171n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f15180x;
        int i12 = i11 & 4;
        int i13 = 2;
        l lVar = this.f15171n;
        if (i12 != 0) {
            ArrayList arrayList = lVar.f15140f;
            int size = arrayList.size();
            lVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                n nVar = (n) arrayList.get(i14);
                if (nVar.f15161b == this.f15161b && (nVar.f15180x & 4) != 0 && nVar.isCheckable()) {
                    if (nVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i15 = nVar.f15180x;
                    int i16 = i15 & (-3);
                    if (z11) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i17 = i10 | i16;
                    nVar.f15180x = i17;
                    if (i15 != i17) {
                        nVar.f15171n.p(false);
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
        this.f15180x = i19;
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
            this.f15180x |= 16;
        } else {
            this.f15180x &= -17;
        }
        this.f15171n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f15170m = 0;
        this.f15169l = drawable;
        this.f15179w = true;
        this.f15171n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15176s = colorStateList;
        this.f15178u = true;
        this.f15179w = true;
        this.f15171n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15177t = mode;
        this.v = true;
        this.f15179w = true;
        this.f15171n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f15165g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f15171n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15173p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f15167j = Character.toLowerCase(c11);
        this.f15171n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f15181y = i10;
        l lVar = this.f15171n;
        lVar.f15144k = true;
        lVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f15163e = charSequence;
        this.f15171n.p(false);
        e0 e0Var = this.f15172o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15164f = charSequence;
        this.f15171n.p(false);
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
        int i11 = this.f15180x;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f15180x = i13;
        if (i11 != i13) {
            l lVar = this.f15171n;
            lVar.h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f15163e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f15174q = charSequence;
        this.f15171n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f15175r = charSequence;
        this.f15171n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f15167j == c10 && this.f15168k == i10) {
            return this;
        }
        this.f15167j = Character.toLowerCase(c10);
        this.f15168k = KeyEvent.normalizeMetaState(i10);
        this.f15171n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.h == c10 && this.f15166i == i10) {
            return this;
        }
        this.h = c10;
        this.f15166i = KeyEvent.normalizeMetaState(i10);
        this.f15171n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.h = c10;
        this.f15166i = KeyEvent.normalizeMetaState(i10);
        this.f15167j = Character.toLowerCase(c11);
        this.f15168k = KeyEvent.normalizeMetaState(i11);
        this.f15171n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f15169l = null;
        this.f15170m = i10;
        this.f15179w = true;
        this.f15171n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f15171n.f15136a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        l lVar = this.f15171n;
        Context context = lVar.f15136a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f15182z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f15160a) > 0) {
            inflate.setId(i11);
        }
        lVar.f15144k = true;
        lVar.p(true);
        return this;
    }
}
