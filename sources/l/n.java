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
    public final int f11520a;
    public final int f11521b;
    public final int f11522c;
    public final int d;
    public CharSequence e;
    public CharSequence f11523f;
    public Intent f11524g;
    public char h;
    public char f11526j;
    public Drawable f11528l;
    public final l f11530n;
    public e0 f11531o;
    public MenuItem.OnMenuItemClickListener f11532p;
    public CharSequence f11533q;
    public CharSequence f11534r;
    public int f11540y;
    public View f11541z;
    public int f11525i = 4096;
    public int f11527k = 4096;
    public int f11529m = 0;
    public ColorStateList f11535s = null;
    public PorterDuff.Mode f11536t = null;
    public boolean f11537u = false;
    public boolean v = false;
    public boolean f11538w = false;
    public int f11539x = 16;
    public boolean C = false;

    public n(l lVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f11530n = lVar;
        this.f11520a = i11;
        this.f11521b = i10;
        this.f11522c = i12;
        this.d = i13;
        this.e = charSequence;
        this.f11540y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(o oVar) {
        this.f11541z = null;
        this.A = oVar;
        this.f11530n.p(true);
        o oVar2 = this.A;
        if (oVar2 != null) {
            oVar2.f11543b = new m0(this);
            oVar2.f11542a.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override
    public final o b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f11540y & 8) == 0) {
            return false;
        }
        if (this.f11541z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f11530n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f11538w && (this.f11537u || this.v)) {
            drawable = drawable.mutate();
            if (this.f11537u) {
                drawable.setTintList(this.f11535s);
            }
            if (this.v) {
                drawable.setTintMode(this.f11536t);
            }
            this.f11538w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f11540y & 8) != 0) {
            if (this.f11541z == null && (oVar = this.A) != null) {
                this.f11541z = oVar.a(this);
            }
            if (this.f11541z != null) {
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
            return this.f11530n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f11539x |= 32;
        } else {
            this.f11539x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f11541z;
        if (view != null) {
            return view;
        }
        o oVar = this.A;
        if (oVar != null) {
            View a2 = oVar.a(this);
            this.f11541z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f11527k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f11526j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f11533q;
    }

    @Override
    public final int getGroupId() {
        return this.f11521b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f11528l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f11529m;
        if (i10 != 0) {
            Drawable b10 = r7.b(this.f11530n.f11497a, i10);
            this.f11529m = 0;
            this.f11528l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f11535s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f11536t;
    }

    @Override
    public final Intent getIntent() {
        return this.f11524g;
    }

    @Override
    public final int getItemId() {
        return this.f11520a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f11525i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f11522c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f11531o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f11523f;
        if (charSequence == null) {
            return this.e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f11534r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f11531o != null) {
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
        if ((this.f11539x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f11539x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f11539x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        o oVar = this.A;
        if (oVar != null && oVar.f11542a.overridesItemVisibility()) {
            if ((this.f11539x & 8) == 0 && this.A.f11542a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f11539x & 8) == 0) {
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
        this.f11541z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f11520a) > 0) {
            view.setId(i10);
        }
        l lVar = this.f11530n;
        lVar.f11504k = true;
        lVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f11526j == c10) {
            return this;
        }
        this.f11526j = Character.toLowerCase(c10);
        this.f11530n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f11539x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f11539x = i11;
        if (i10 != i11) {
            this.f11530n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f11539x;
        int i12 = i11 & 4;
        int i13 = 2;
        l lVar = this.f11530n;
        if (i12 != 0) {
            ArrayList arrayList = lVar.f11500f;
            int size = arrayList.size();
            lVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                n nVar = (n) arrayList.get(i14);
                if (nVar.f11521b == this.f11521b && (nVar.f11539x & 4) != 0 && nVar.isCheckable()) {
                    if (nVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i15 = nVar.f11539x;
                    int i16 = i15 & (-3);
                    if (z11) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i17 = i10 | i16;
                    nVar.f11539x = i17;
                    if (i15 != i17) {
                        nVar.f11530n.p(false);
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
        this.f11539x = i19;
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
            this.f11539x |= 16;
        } else {
            this.f11539x &= -17;
        }
        this.f11530n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f11529m = 0;
        this.f11528l = drawable;
        this.f11538w = true;
        this.f11530n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11535s = colorStateList;
        this.f11537u = true;
        this.f11538w = true;
        this.f11530n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11536t = mode;
        this.v = true;
        this.f11538w = true;
        this.f11530n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f11524g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f11530n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f11532p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f11526j = Character.toLowerCase(c11);
        this.f11530n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f11540y = i10;
        l lVar = this.f11530n;
        lVar.f11504k = true;
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
        this.f11530n.p(false);
        e0 e0Var = this.f11531o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11523f = charSequence;
        this.f11530n.p(false);
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
        int i11 = this.f11539x;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f11539x = i13;
        if (i11 != i13) {
            l lVar = this.f11530n;
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
        this.f11533q = charSequence;
        this.f11530n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f11534r = charSequence;
        this.f11530n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f11526j == c10 && this.f11527k == i10) {
            return this;
        }
        this.f11526j = Character.toLowerCase(c10);
        this.f11527k = KeyEvent.normalizeMetaState(i10);
        this.f11530n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.h == c10 && this.f11525i == i10) {
            return this;
        }
        this.h = c10;
        this.f11525i = KeyEvent.normalizeMetaState(i10);
        this.f11530n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.h = c10;
        this.f11525i = KeyEvent.normalizeMetaState(i10);
        this.f11526j = Character.toLowerCase(c11);
        this.f11527k = KeyEvent.normalizeMetaState(i11);
        this.f11530n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f11528l = null;
        this.f11529m = i10;
        this.f11538w = true;
        this.f11530n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f11530n.f11497a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        l lVar = this.f11530n;
        Context context = lVar.f11497a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f11541z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f11520a) > 0) {
            inflate.setId(i11);
        }
        lVar.f11504k = true;
        lVar.p(true);
        return this;
    }
}
