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
import j7.s7;
import java.util.ArrayList;
public final class n implements l0.a {
    public o A;
    public MenuItem.OnActionExpandListener B;
    public final int f11419a;
    public final int f11420b;
    public final int f11421c;
    public final int d;
    public CharSequence f11422e;
    public CharSequence f11423f;
    public Intent f11424g;
    public char h;
    public char f11426j;
    public Drawable f11428l;
    public final l f11430n;
    public e0 f11431o;
    public MenuItem.OnMenuItemClickListener f11432p;
    public CharSequence f11433q;
    public CharSequence f11434r;
    public int f11440y;
    public View f11441z;
    public int f11425i = 4096;
    public int f11427k = 4096;
    public int f11429m = 0;
    public ColorStateList f11435s = null;
    public PorterDuff.Mode f11436t = null;
    public boolean f11437u = false;
    public boolean v = false;
    public boolean f11438w = false;
    public int f11439x = 16;
    public boolean C = false;

    public n(l lVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f11430n = lVar;
        this.f11419a = i11;
        this.f11420b = i10;
        this.f11421c = i12;
        this.d = i13;
        this.f11422e = charSequence;
        this.f11440y = i14;
    }

    public static void c(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    @Override
    public final l0.a a(o oVar) {
        this.f11441z = null;
        this.A = oVar;
        this.f11430n.p(true);
        o oVar2 = this.A;
        if (oVar2 != null) {
            oVar2.f11443b = new ja.c(this);
            oVar2.f11442a.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override
    public final o b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f11440y & 8) == 0) {
            return false;
        }
        if (this.f11441z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f11430n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f11438w && (this.f11437u || this.v)) {
            drawable = i8.d(drawable).mutate();
            if (this.f11437u) {
                drawable.setTintList(this.f11435s);
            }
            if (this.v) {
                drawable.setTintMode(this.f11436t);
            }
            this.f11438w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f11440y & 8) != 0) {
            if (this.f11441z == null && (oVar = this.A) != null) {
                this.f11441z = oVar.a(this);
            }
            if (this.f11441z != null) {
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
            return this.f11430n.f(this);
        }
        return false;
    }

    public final void f(boolean z4) {
        if (z4) {
            this.f11439x |= 32;
        } else {
            this.f11439x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f11441z;
        if (view != null) {
            return view;
        }
        o oVar = this.A;
        if (oVar != null) {
            View a2 = oVar.a(this);
            this.f11441z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f11427k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f11426j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f11433q;
    }

    @Override
    public final int getGroupId() {
        return this.f11420b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f11428l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f11429m;
        if (i10 != 0) {
            Drawable b10 = s7.b(this.f11430n.f11395a, i10);
            this.f11429m = 0;
            this.f11428l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f11435s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f11436t;
    }

    @Override
    public final Intent getIntent() {
        return this.f11424g;
    }

    @Override
    public final int getItemId() {
        return this.f11419a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f11425i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f11421c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f11431o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f11422e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f11423f;
        if (charSequence == null) {
            return this.f11422e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f11434r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f11431o != null) {
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
        if ((this.f11439x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f11439x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f11439x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        o oVar = this.A;
        if (oVar != null && oVar.f11442a.overridesItemVisibility()) {
            if ((this.f11439x & 8) == 0 && this.A.f11442a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f11439x & 8) == 0) {
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
        this.f11441z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f11419a) > 0) {
            view.setId(i10);
        }
        l lVar = this.f11430n;
        lVar.f11403k = true;
        lVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f11426j == c3) {
            return this;
        }
        this.f11426j = Character.toLowerCase(c3);
        this.f11430n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z4) {
        int i10 = this.f11439x;
        int i11 = (z4 ? 1 : 0) | (i10 & (-2));
        this.f11439x = i11;
        if (i10 != i11) {
            this.f11430n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z4) {
        boolean z10;
        int i10;
        int i11 = this.f11439x;
        int i12 = i11 & 4;
        int i13 = 2;
        l lVar = this.f11430n;
        if (i12 != 0) {
            ArrayList arrayList = lVar.f11399f;
            int size = arrayList.size();
            lVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                n nVar = (n) arrayList.get(i14);
                if (nVar.f11420b == this.f11420b && (nVar.f11439x & 4) != 0 && nVar.isCheckable()) {
                    if (nVar == this) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i15 = nVar.f11439x;
                    int i16 = i15 & (-3);
                    if (z10) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i17 = i10 | i16;
                    nVar.f11439x = i17;
                    if (i15 != i17) {
                        nVar.f11430n.p(false);
                    }
                }
            }
            lVar.v();
            return this;
        }
        int i18 = i11 & (-3);
        if (!z4) {
            i13 = 0;
        }
        int i19 = i18 | i13;
        this.f11439x = i19;
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
    public final MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.f11439x |= 16;
        } else {
            this.f11439x &= -17;
        }
        this.f11430n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f11429m = 0;
        this.f11428l = drawable;
        this.f11438w = true;
        this.f11430n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11435s = colorStateList;
        this.f11437u = true;
        this.f11438w = true;
        this.f11430n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11436t = mode;
        this.v = true;
        this.f11438w = true;
        this.f11430n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f11424g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c3) {
        if (this.h == c3) {
            return this;
        }
        this.h = c3;
        this.f11430n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f11432p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c3, char c10) {
        this.h = c3;
        this.f11426j = Character.toLowerCase(c10);
        this.f11430n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f11440y = i10;
        l lVar = this.f11430n;
        lVar.f11403k = true;
        lVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f11422e = charSequence;
        this.f11430n.p(false);
        e0 e0Var = this.f11431o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11423f = charSequence;
        this.f11430n.p(false);
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
        int i11 = this.f11439x;
        int i12 = i11 & (-9);
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f11439x = i13;
        if (i11 != i13) {
            l lVar = this.f11430n;
            lVar.h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f11422e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f11433q = charSequence;
        this.f11430n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f11434r = charSequence;
        this.f11430n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c3, int i10) {
        if (this.f11426j == c3 && this.f11427k == i10) {
            return this;
        }
        this.f11426j = Character.toLowerCase(c3);
        this.f11427k = KeyEvent.normalizeMetaState(i10);
        this.f11430n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c3, int i10) {
        if (this.h == c3 && this.f11425i == i10) {
            return this;
        }
        this.h = c3;
        this.f11425i = KeyEvent.normalizeMetaState(i10);
        this.f11430n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c3, char c10, int i10, int i11) {
        this.h = c3;
        this.f11425i = KeyEvent.normalizeMetaState(i10);
        this.f11426j = Character.toLowerCase(c10);
        this.f11427k = KeyEvent.normalizeMetaState(i11);
        this.f11430n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f11428l = null;
        this.f11429m = i10;
        this.f11438w = true;
        this.f11430n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f11430n.f11395a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        l lVar = this.f11430n;
        Context context = lVar.f11395a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f11441z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f11419a) > 0) {
            inflate.setId(i11);
        }
        lVar.f11403k = true;
        lVar.p(true);
        return this;
    }
}
