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
import v7.s8;
import v7.w7;
public final class n implements l0.a {
    public o A;
    public MenuItem.OnActionExpandListener B;
    public final int f13997a;
    public final int f13998b;
    public final int f13999c;
    public final int d;
    public CharSequence e;
    public CharSequence f14000f;
    public Intent f14001g;
    public char h;
    public char f14003j;
    public Drawable f14005l;
    public final l f14007n;
    public e0 f14008o;
    public MenuItem.OnMenuItemClickListener f14009p;
    public CharSequence f14010q;
    public CharSequence f14011r;
    public int f14017y;
    public View f14018z;
    public int f14002i = 4096;
    public int f14004k = 4096;
    public int f14006m = 0;
    public ColorStateList f14012s = null;
    public PorterDuff.Mode f14013t = null;
    public boolean f14014u = false;
    public boolean v = false;
    public boolean f14015w = false;
    public int f14016x = 16;
    public boolean C = false;

    public n(l lVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f14007n = lVar;
        this.f13997a = i11;
        this.f13998b = i10;
        this.f13999c = i12;
        this.d = i13;
        this.e = charSequence;
        this.f14017y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(o oVar) {
        this.f14018z = null;
        this.A = oVar;
        this.f14007n.p(true);
        o oVar2 = this.A;
        if (oVar2 != null) {
            oVar2.f14020b = new a4.m(this, 25);
            oVar2.f14019a.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override
    public final o b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f14017y & 8) == 0) {
            return false;
        }
        if (this.f14018z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f14007n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f14015w && (this.f14014u || this.v)) {
            drawable = s8.d(drawable).mutate();
            if (this.f14014u) {
                drawable.setTintList(this.f14012s);
            }
            if (this.v) {
                drawable.setTintMode(this.f14013t);
            }
            this.f14015w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f14017y & 8) != 0) {
            if (this.f14018z == null && (oVar = this.A) != null) {
                this.f14018z = oVar.a(this);
            }
            if (this.f14018z != null) {
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
            return this.f14007n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f14016x |= 32;
        } else {
            this.f14016x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f14018z;
        if (view != null) {
            return view;
        }
        o oVar = this.A;
        if (oVar != null) {
            View a2 = oVar.a(this);
            this.f14018z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f14004k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f14003j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f14010q;
    }

    @Override
    public final int getGroupId() {
        return this.f13998b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f14005l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f14006m;
        if (i10 != 0) {
            Drawable b10 = w7.b(this.f14007n.f13974a, i10);
            this.f14006m = 0;
            this.f14005l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f14012s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f14013t;
    }

    @Override
    public final Intent getIntent() {
        return this.f14001g;
    }

    @Override
    public final int getItemId() {
        return this.f13997a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f14002i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f13999c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f14008o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f14000f;
        if (charSequence == null) {
            return this.e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f14011r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f14008o != null) {
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
        if ((this.f14016x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f14016x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f14016x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        o oVar = this.A;
        if (oVar != null && oVar.f14019a.overridesItemVisibility()) {
            if ((this.f14016x & 8) == 0 && this.A.f14019a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f14016x & 8) == 0) {
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
        this.f14018z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f13997a) > 0) {
            view.setId(i10);
        }
        l lVar = this.f14007n;
        lVar.f13981k = true;
        lVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f14003j == c10) {
            return this;
        }
        this.f14003j = Character.toLowerCase(c10);
        this.f14007n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f14016x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f14016x = i11;
        if (i10 != i11) {
            this.f14007n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f14016x;
        int i12 = i11 & 4;
        int i13 = 2;
        l lVar = this.f14007n;
        if (i12 != 0) {
            ArrayList arrayList = lVar.f13977f;
            int size = arrayList.size();
            lVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                n nVar = (n) arrayList.get(i14);
                if (nVar.f13998b == this.f13998b && (nVar.f14016x & 4) != 0 && nVar.isCheckable()) {
                    if (nVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i15 = nVar.f14016x;
                    int i16 = i15 & (-3);
                    if (z11) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i17 = i10 | i16;
                    nVar.f14016x = i17;
                    if (i15 != i17) {
                        nVar.f14007n.p(false);
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
        this.f14016x = i19;
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
            this.f14016x |= 16;
        } else {
            this.f14016x &= -17;
        }
        this.f14007n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f14006m = 0;
        this.f14005l = drawable;
        this.f14015w = true;
        this.f14007n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f14012s = colorStateList;
        this.f14014u = true;
        this.f14015w = true;
        this.f14007n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f14013t = mode;
        this.v = true;
        this.f14015w = true;
        this.f14007n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f14001g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f14007n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f14009p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f14003j = Character.toLowerCase(c11);
        this.f14007n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f14017y = i10;
        l lVar = this.f14007n;
        lVar.f13981k = true;
        lVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.f14007n.p(false);
        e0 e0Var = this.f14008o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f14000f = charSequence;
        this.f14007n.p(false);
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
        int i11 = this.f14016x;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f14016x = i13;
        if (i11 != i13) {
            l lVar = this.f14007n;
            lVar.h = true;
            lVar.p(true);
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
        this.f14010q = charSequence;
        this.f14007n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f14011r = charSequence;
        this.f14007n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f14003j == c10 && this.f14004k == i10) {
            return this;
        }
        this.f14003j = Character.toLowerCase(c10);
        this.f14004k = KeyEvent.normalizeMetaState(i10);
        this.f14007n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.h == c10 && this.f14002i == i10) {
            return this;
        }
        this.h = c10;
        this.f14002i = KeyEvent.normalizeMetaState(i10);
        this.f14007n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.h = c10;
        this.f14002i = KeyEvent.normalizeMetaState(i10);
        this.f14003j = Character.toLowerCase(c11);
        this.f14004k = KeyEvent.normalizeMetaState(i11);
        this.f14007n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f14005l = null;
        this.f14006m = i10;
        this.f14015w = true;
        this.f14007n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f14007n.f13974a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        l lVar = this.f14007n;
        Context context = lVar.f13974a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f14018z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f13997a) > 0) {
            inflate.setId(i11);
        }
        lVar.f13981k = true;
        lVar.p(true);
        return this;
    }
}
