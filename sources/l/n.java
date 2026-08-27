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
import g7.k8;
import g7.o7;
import java.util.ArrayList;

public final class n implements l0.a {
    public o A;
    public MenuItem.OnActionExpandListener B;

    public final int f15334a;

    public final int f15335b;

    public final int f15336c;
    public final int d;

    public CharSequence f15337e;

    public CharSequence f15338f;

    public Intent f15339g;
    public char h;

    public char f15341j;

    public Drawable f15343l;

    public final l f15345n;

    public e0 f15346o;

    public MenuItem.OnMenuItemClickListener f15347p;

    public CharSequence f15348q;

    public CharSequence f15349r;

    public int f15355y;

    public View f15356z;

    public int f15340i = 4096;

    public int f15342k = 4096;

    public int f15344m = 0;

    public ColorStateList f15350s = null;

    public PorterDuff.Mode f15351t = null;

    public boolean f15352u = false;
    public boolean v = false;

    public boolean f15353w = false;

    public int f15354x = 16;
    public boolean C = false;

    public n(l lVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f15345n = lVar;
        this.f15334a = i11;
        this.f15335b = i10;
        this.f15336c = i12;
        this.d = i13;
        this.f15337e = charSequence;
        this.f15355y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(o oVar) {
        this.f15356z = null;
        this.A = oVar;
        this.f15345n.p(true);
        o oVar2 = this.A;
        if (oVar2 != null) {
            oVar2.f15358b = new ae.b(this, 22);
            oVar2.f15357a.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override
    public final o b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f15355y & 8) == 0) {
            return false;
        }
        if (this.f15356z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f15345n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f15353w && (this.f15352u || this.v)) {
            drawable = k8.d(drawable).mutate();
            if (this.f15352u) {
                drawable.setTintList(this.f15350s);
            }
            if (this.v) {
                drawable.setTintMode(this.f15351t);
            }
            this.f15353w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f15355y & 8) == 0) {
            return false;
        }
        if (this.f15356z == null && (oVar = this.A) != null) {
            this.f15356z = oVar.a(this);
        }
        return this.f15356z != null;
    }

    @Override
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f15345n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f15354x |= 32;
        } else {
            this.f15354x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f15356z;
        if (view != null) {
            return view;
        }
        o oVar = this.A;
        if (oVar == null) {
            return null;
        }
        View viewA = oVar.a(this);
        this.f15356z = viewA;
        return viewA;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f15342k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f15341j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f15348q;
    }

    @Override
    public final int getGroupId() {
        return this.f15335b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f15343l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f15344m;
        if (i10 == 0) {
            return null;
        }
        Drawable drawableB = o7.b(this.f15345n.f15310a, i10);
        this.f15344m = 0;
        this.f15343l = drawableB;
        return d(drawableB);
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f15350s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f15351t;
    }

    @Override
    public final Intent getIntent() {
        return this.f15339g;
    }

    @Override
    public final int getItemId() {
        return this.f15334a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f15340i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f15336c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f15346o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f15337e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15338f;
        return charSequence != null ? charSequence : this.f15337e;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f15349r;
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f15346o != null;
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override
    public final boolean isCheckable() {
        return (this.f15354x & 1) == 1;
    }

    @Override
    public final boolean isChecked() {
        return (this.f15354x & 2) == 2;
    }

    @Override
    public final boolean isEnabled() {
        return (this.f15354x & 16) != 0;
    }

    @Override
    public final boolean isVisible() {
        o oVar = this.A;
        if (oVar == null || !oVar.f15357a.overridesItemVisibility()) {
            return (this.f15354x & 8) == 0;
        }
        return (this.f15354x & 8) == 0 && this.A.f15357a.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override
    public final MenuItem setActionView(View view) {
        int i10;
        this.f15356z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f15334a) > 0) {
            view.setId(i10);
        }
        l lVar = this.f15345n;
        lVar.f15318k = true;
        lVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f15341j == c10) {
            return this;
        }
        this.f15341j = Character.toLowerCase(c10);
        this.f15345n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f15354x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f15354x = i11;
        if (i10 != i11) {
            this.f15345n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        int i10 = this.f15354x;
        int i11 = i10 & 4;
        l lVar = this.f15345n;
        if (i11 == 0) {
            int i12 = (i10 & (-3)) | (z10 ? 2 : 0);
            this.f15354x = i12;
            if (i10 != i12) {
                lVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = lVar.f15314f;
        int size = arrayList.size();
        lVar.w();
        for (int i13 = 0; i13 < size; i13++) {
            n nVar = (n) arrayList.get(i13);
            if (nVar.f15335b == this.f15335b && (nVar.f15354x & 4) != 0 && nVar.isCheckable()) {
                boolean z11 = nVar == this;
                int i14 = nVar.f15354x;
                int i15 = (z11 ? 2 : 0) | (i14 & (-3));
                nVar.f15354x = i15;
                if (i14 != i15) {
                    nVar.f15345n.p(false);
                }
            }
        }
        lVar.v();
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
            this.f15354x |= 16;
        } else {
            this.f15354x &= -17;
        }
        this.f15345n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f15344m = 0;
        this.f15343l = drawable;
        this.f15353w = true;
        this.f15345n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15350s = colorStateList;
        this.f15352u = true;
        this.f15353w = true;
        this.f15345n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15351t = mode;
        this.v = true;
        this.f15353w = true;
        this.f15345n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f15339g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f15345n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15347p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f15341j = Character.toLowerCase(c11);
        this.f15345n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f15355y = i10;
        l lVar = this.f15345n;
        lVar.f15318k = true;
        lVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f15337e = charSequence;
        this.f15345n.p(false);
        e0 e0Var = this.f15346o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15338f = charSequence;
        this.f15345n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        int i10 = this.f15354x;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f15354x = i11;
        if (i10 != i11) {
            l lVar = this.f15345n;
            lVar.h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f15337e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f15348q = charSequence;
        this.f15345n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f15349r = charSequence;
        this.f15345n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f15341j == c10 && this.f15342k == i10) {
            return this;
        }
        this.f15341j = Character.toLowerCase(c10);
        this.f15342k = KeyEvent.normalizeMetaState(i10);
        this.f15345n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.h == c10 && this.f15340i == i10) {
            return this;
        }
        this.h = c10;
        this.f15340i = KeyEvent.normalizeMetaState(i10);
        this.f15345n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.h = c10;
        this.f15340i = KeyEvent.normalizeMetaState(i10);
        this.f15341j = Character.toLowerCase(c11);
        this.f15342k = KeyEvent.normalizeMetaState(i11);
        this.f15345n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f15343l = null;
        this.f15344m = i10;
        this.f15353w = true;
        this.f15345n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f15345n.f15310a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        l lVar = this.f15345n;
        Context context = lVar.f15310a;
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f15356z = viewInflate;
        this.A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i11 = this.f15334a) > 0) {
            viewInflate.setId(i11);
        }
        lVar.f15318k = true;
        lVar.p(true);
        return this;
    }
}
