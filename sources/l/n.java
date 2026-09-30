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
    public final int f13982a;
    public final int f13983b;
    public final int f13984c;
    public final int d;
    public CharSequence e;
    public CharSequence f13985f;
    public Intent f13986g;
    public char h;
    public char f13988j;
    public Drawable f13990l;
    public final l f13992n;
    public e0 f13993o;
    public MenuItem.OnMenuItemClickListener f13994p;
    public CharSequence f13995q;
    public CharSequence f13996r;
    public int f14002y;
    public View f14003z;
    public int f13987i = 4096;
    public int f13989k = 4096;
    public int f13991m = 0;
    public ColorStateList f13997s = null;
    public PorterDuff.Mode f13998t = null;
    public boolean f13999u = false;
    public boolean v = false;
    public boolean f14000w = false;
    public int f14001x = 16;
    public boolean C = false;

    public n(l lVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f13992n = lVar;
        this.f13982a = i11;
        this.f13983b = i10;
        this.f13984c = i12;
        this.d = i13;
        this.e = charSequence;
        this.f14002y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(o oVar) {
        this.f14003z = null;
        this.A = oVar;
        this.f13992n.p(true);
        o oVar2 = this.A;
        if (oVar2 != null) {
            oVar2.f14005b = new a4.m(this, 25);
            oVar2.f14004a.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override
    public final o b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f14002y & 8) == 0) {
            return false;
        }
        if (this.f14003z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f13992n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f14000w && (this.f13999u || this.v)) {
            drawable = s8.d(drawable).mutate();
            if (this.f13999u) {
                drawable.setTintList(this.f13997s);
            }
            if (this.v) {
                drawable.setTintMode(this.f13998t);
            }
            this.f14000w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f14002y & 8) != 0) {
            if (this.f14003z == null && (oVar = this.A) != null) {
                this.f14003z = oVar.a(this);
            }
            if (this.f14003z != null) {
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
            return this.f13992n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f14001x |= 32;
        } else {
            this.f14001x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f14003z;
        if (view != null) {
            return view;
        }
        o oVar = this.A;
        if (oVar != null) {
            View a2 = oVar.a(this);
            this.f14003z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f13989k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f13988j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f13995q;
    }

    @Override
    public final int getGroupId() {
        return this.f13983b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f13990l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f13991m;
        if (i10 != 0) {
            Drawable b10 = w7.b(this.f13992n.f13959a, i10);
            this.f13991m = 0;
            this.f13990l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f13997s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f13998t;
    }

    @Override
    public final Intent getIntent() {
        return this.f13986g;
    }

    @Override
    public final int getItemId() {
        return this.f13982a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f13987i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f13984c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f13993o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13985f;
        if (charSequence == null) {
            return this.e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f13996r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f13993o != null) {
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
        if ((this.f14001x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f14001x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f14001x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        o oVar = this.A;
        if (oVar != null && oVar.f14004a.overridesItemVisibility()) {
            if ((this.f14001x & 8) == 0 && this.A.f14004a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f14001x & 8) == 0) {
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
        this.f14003z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f13982a) > 0) {
            view.setId(i10);
        }
        l lVar = this.f13992n;
        lVar.f13966k = true;
        lVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f13988j == c10) {
            return this;
        }
        this.f13988j = Character.toLowerCase(c10);
        this.f13992n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f14001x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f14001x = i11;
        if (i10 != i11) {
            this.f13992n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f14001x;
        int i12 = i11 & 4;
        int i13 = 2;
        l lVar = this.f13992n;
        if (i12 != 0) {
            ArrayList arrayList = lVar.f13962f;
            int size = arrayList.size();
            lVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                n nVar = (n) arrayList.get(i14);
                if (nVar.f13983b == this.f13983b && (nVar.f14001x & 4) != 0 && nVar.isCheckable()) {
                    if (nVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i15 = nVar.f14001x;
                    int i16 = i15 & (-3);
                    if (z11) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i17 = i10 | i16;
                    nVar.f14001x = i17;
                    if (i15 != i17) {
                        nVar.f13992n.p(false);
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
        this.f14001x = i19;
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
            this.f14001x |= 16;
        } else {
            this.f14001x &= -17;
        }
        this.f13992n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f13991m = 0;
        this.f13990l = drawable;
        this.f14000w = true;
        this.f13992n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13997s = colorStateList;
        this.f13999u = true;
        this.f14000w = true;
        this.f13992n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13998t = mode;
        this.v = true;
        this.f14000w = true;
        this.f13992n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f13986g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f13992n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13994p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f13988j = Character.toLowerCase(c11);
        this.f13992n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f14002y = i10;
        l lVar = this.f13992n;
        lVar.f13966k = true;
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
        this.f13992n.p(false);
        e0 e0Var = this.f13993o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13985f = charSequence;
        this.f13992n.p(false);
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
        int i11 = this.f14001x;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f14001x = i13;
        if (i11 != i13) {
            l lVar = this.f13992n;
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
        this.f13995q = charSequence;
        this.f13992n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f13996r = charSequence;
        this.f13992n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f13988j == c10 && this.f13989k == i10) {
            return this;
        }
        this.f13988j = Character.toLowerCase(c10);
        this.f13989k = KeyEvent.normalizeMetaState(i10);
        this.f13992n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.h == c10 && this.f13987i == i10) {
            return this;
        }
        this.h = c10;
        this.f13987i = KeyEvent.normalizeMetaState(i10);
        this.f13992n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.h = c10;
        this.f13987i = KeyEvent.normalizeMetaState(i10);
        this.f13988j = Character.toLowerCase(c11);
        this.f13989k = KeyEvent.normalizeMetaState(i11);
        this.f13992n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f13990l = null;
        this.f13991m = i10;
        this.f14000w = true;
        this.f13992n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f13992n.f13959a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        l lVar = this.f13992n;
        Context context = lVar.f13959a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f14003z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f13982a) > 0) {
            inflate.setId(i11);
        }
        lVar.f13966k = true;
        lVar.p(true);
        return this;
    }
}
