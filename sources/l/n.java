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
import k2.m0;
import v7.r7;
public final class n implements l0.a {
    public o A;
    public MenuItem.OnActionExpandListener B;
    public final int f11521a;
    public final int f11522b;
    public final int f11523c;
    public final int d;
    public CharSequence e;
    public CharSequence f11524f;
    public Intent f11525g;
    public char h;
    public char f11527j;
    public Drawable f11529l;
    public final l f11531n;
    public e0 f11532o;
    public MenuItem.OnMenuItemClickListener f11533p;
    public CharSequence f11534q;
    public CharSequence f11535r;
    public int f11541y;
    public View f11542z;
    public int f11526i = 4096;
    public int f11528k = 4096;
    public int f11530m = 0;
    public ColorStateList f11536s = null;
    public PorterDuff.Mode f11537t = null;
    public boolean f11538u = false;
    public boolean v = false;
    public boolean f11539w = false;
    public int f11540x = 16;
    public boolean C = false;

    public n(l lVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f11531n = lVar;
        this.f11521a = i11;
        this.f11522b = i10;
        this.f11523c = i12;
        this.d = i13;
        this.e = charSequence;
        this.f11541y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(o oVar) {
        this.f11542z = null;
        this.A = oVar;
        this.f11531n.p(true);
        o oVar2 = this.A;
        if (oVar2 != null) {
            oVar2.f11544b = new m0(this);
            oVar2.f11543a.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override
    public final o b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f11541y & 8) == 0) {
            return false;
        }
        if (this.f11542z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f11531n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f11539w && (this.f11538u || this.v)) {
            drawable = drawable.mutate();
            if (this.f11538u) {
                drawable.setTintList(this.f11536s);
            }
            if (this.v) {
                drawable.setTintMode(this.f11537t);
            }
            this.f11539w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f11541y & 8) != 0) {
            if (this.f11542z == null && (oVar = this.A) != null) {
                this.f11542z = oVar.a(this);
            }
            if (this.f11542z != null) {
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
            return this.f11531n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f11540x |= 32;
        } else {
            this.f11540x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f11542z;
        if (view != null) {
            return view;
        }
        o oVar = this.A;
        if (oVar != null) {
            View a2 = oVar.a(this);
            this.f11542z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f11528k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f11527j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f11534q;
    }

    @Override
    public final int getGroupId() {
        return this.f11522b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f11529l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f11530m;
        if (i10 != 0) {
            Drawable b10 = r7.b(this.f11531n.f11498a, i10);
            this.f11530m = 0;
            this.f11529l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f11536s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f11537t;
    }

    @Override
    public final Intent getIntent() {
        return this.f11525g;
    }

    @Override
    public final int getItemId() {
        return this.f11521a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f11526i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f11523c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f11532o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f11524f;
        if (charSequence == null) {
            return this.e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f11535r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f11532o != null) {
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
        if ((this.f11540x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f11540x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f11540x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        o oVar = this.A;
        if (oVar != null && oVar.f11543a.overridesItemVisibility()) {
            if ((this.f11540x & 8) == 0 && this.A.f11543a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f11540x & 8) == 0) {
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
        this.f11542z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f11521a) > 0) {
            view.setId(i10);
        }
        l lVar = this.f11531n;
        lVar.f11505k = true;
        lVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f11527j == c10) {
            return this;
        }
        this.f11527j = Character.toLowerCase(c10);
        this.f11531n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f11540x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f11540x = i11;
        if (i10 != i11) {
            this.f11531n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f11540x;
        int i12 = i11 & 4;
        int i13 = 2;
        l lVar = this.f11531n;
        if (i12 != 0) {
            ArrayList arrayList = lVar.f11501f;
            int size = arrayList.size();
            lVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                n nVar = (n) arrayList.get(i14);
                if (nVar.f11522b == this.f11522b && (nVar.f11540x & 4) != 0 && nVar.isCheckable()) {
                    if (nVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i15 = nVar.f11540x;
                    int i16 = i15 & (-3);
                    if (z11) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i17 = i10 | i16;
                    nVar.f11540x = i17;
                    if (i15 != i17) {
                        nVar.f11531n.p(false);
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
        this.f11540x = i19;
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
            this.f11540x |= 16;
        } else {
            this.f11540x &= -17;
        }
        this.f11531n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f11530m = 0;
        this.f11529l = drawable;
        this.f11539w = true;
        this.f11531n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11536s = colorStateList;
        this.f11538u = true;
        this.f11539w = true;
        this.f11531n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11537t = mode;
        this.v = true;
        this.f11539w = true;
        this.f11531n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f11525g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f11531n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f11533p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f11527j = Character.toLowerCase(c11);
        this.f11531n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f11541y = i10;
        l lVar = this.f11531n;
        lVar.f11505k = true;
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
        this.f11531n.p(false);
        e0 e0Var = this.f11532o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11524f = charSequence;
        this.f11531n.p(false);
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
        int i11 = this.f11540x;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f11540x = i13;
        if (i11 != i13) {
            l lVar = this.f11531n;
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
        this.f11534q = charSequence;
        this.f11531n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f11535r = charSequence;
        this.f11531n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f11527j == c10 && this.f11528k == i10) {
            return this;
        }
        this.f11527j = Character.toLowerCase(c10);
        this.f11528k = KeyEvent.normalizeMetaState(i10);
        this.f11531n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.h == c10 && this.f11526i == i10) {
            return this;
        }
        this.h = c10;
        this.f11526i = KeyEvent.normalizeMetaState(i10);
        this.f11531n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.h = c10;
        this.f11526i = KeyEvent.normalizeMetaState(i10);
        this.f11527j = Character.toLowerCase(c11);
        this.f11528k = KeyEvent.normalizeMetaState(i11);
        this.f11531n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f11529l = null;
        this.f11530m = i10;
        this.f11539w = true;
        this.f11531n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f11531n.f11498a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        l lVar = this.f11531n;
        Context context = lVar.f11498a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f11542z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f11521a) > 0) {
            inflate.setId(i11);
        }
        lVar.f11505k = true;
        lVar.p(true);
        return this;
    }
}
