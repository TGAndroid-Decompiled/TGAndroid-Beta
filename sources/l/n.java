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
    public final int f13969a;
    public final int f13970b;
    public final int f13971c;
    public final int d;
    public CharSequence e;
    public CharSequence f13972f;
    public Intent f13973g;
    public char h;
    public char f13975j;
    public Drawable f13977l;
    public final l f13979n;
    public e0 f13980o;
    public MenuItem.OnMenuItemClickListener f13981p;
    public CharSequence f13982q;
    public CharSequence f13983r;
    public int f13989y;
    public View f13990z;
    public int f13974i = 4096;
    public int f13976k = 4096;
    public int f13978m = 0;
    public ColorStateList f13984s = null;
    public PorterDuff.Mode f13985t = null;
    public boolean f13986u = false;
    public boolean v = false;
    public boolean f13987w = false;
    public int f13988x = 16;
    public boolean C = false;

    public n(l lVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f13979n = lVar;
        this.f13969a = i11;
        this.f13970b = i10;
        this.f13971c = i12;
        this.d = i13;
        this.e = charSequence;
        this.f13989y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(o oVar) {
        this.f13990z = null;
        this.A = oVar;
        this.f13979n.p(true);
        o oVar2 = this.A;
        if (oVar2 != null) {
            oVar2.f13992b = new android.support.v4.media.c(this, 24);
            oVar2.f13991a.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override
    public final o b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f13989y & 8) == 0) {
            return false;
        }
        if (this.f13990z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f13979n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f13987w && (this.f13986u || this.v)) {
            drawable = s8.d(drawable).mutate();
            if (this.f13986u) {
                drawable.setTintList(this.f13984s);
            }
            if (this.v) {
                drawable.setTintMode(this.f13985t);
            }
            this.f13987w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f13989y & 8) != 0) {
            if (this.f13990z == null && (oVar = this.A) != null) {
                this.f13990z = oVar.a(this);
            }
            if (this.f13990z != null) {
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
            return this.f13979n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f13988x |= 32;
        } else {
            this.f13988x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f13990z;
        if (view != null) {
            return view;
        }
        o oVar = this.A;
        if (oVar != null) {
            View a2 = oVar.a(this);
            this.f13990z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f13976k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f13975j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f13982q;
    }

    @Override
    public final int getGroupId() {
        return this.f13970b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f13977l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f13978m;
        if (i10 != 0) {
            Drawable b10 = w7.b(this.f13979n.f13946a, i10);
            this.f13978m = 0;
            this.f13977l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f13984s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f13985t;
    }

    @Override
    public final Intent getIntent() {
        return this.f13973g;
    }

    @Override
    public final int getItemId() {
        return this.f13969a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f13974i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f13971c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f13980o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13972f;
        if (charSequence == null) {
            return this.e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f13983r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f13980o != null) {
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
        if ((this.f13988x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f13988x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f13988x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        o oVar = this.A;
        if (oVar != null && oVar.f13991a.overridesItemVisibility()) {
            if ((this.f13988x & 8) == 0 && this.A.f13991a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f13988x & 8) == 0) {
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
        this.f13990z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f13969a) > 0) {
            view.setId(i10);
        }
        l lVar = this.f13979n;
        lVar.f13953k = true;
        lVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f13975j == c10) {
            return this;
        }
        this.f13975j = Character.toLowerCase(c10);
        this.f13979n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f13988x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f13988x = i11;
        if (i10 != i11) {
            this.f13979n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f13988x;
        int i12 = i11 & 4;
        int i13 = 2;
        l lVar = this.f13979n;
        if (i12 != 0) {
            ArrayList arrayList = lVar.f13949f;
            int size = arrayList.size();
            lVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                n nVar = (n) arrayList.get(i14);
                if (nVar.f13970b == this.f13970b && (nVar.f13988x & 4) != 0 && nVar.isCheckable()) {
                    if (nVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i15 = nVar.f13988x;
                    int i16 = i15 & (-3);
                    if (z11) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i17 = i10 | i16;
                    nVar.f13988x = i17;
                    if (i15 != i17) {
                        nVar.f13979n.p(false);
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
        this.f13988x = i19;
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
            this.f13988x |= 16;
        } else {
            this.f13988x &= -17;
        }
        this.f13979n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f13978m = 0;
        this.f13977l = drawable;
        this.f13987w = true;
        this.f13979n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13984s = colorStateList;
        this.f13986u = true;
        this.f13987w = true;
        this.f13979n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13985t = mode;
        this.v = true;
        this.f13987w = true;
        this.f13979n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f13973g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f13979n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13981p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f13975j = Character.toLowerCase(c11);
        this.f13979n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f13989y = i10;
        l lVar = this.f13979n;
        lVar.f13953k = true;
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
        this.f13979n.p(false);
        e0 e0Var = this.f13980o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13972f = charSequence;
        this.f13979n.p(false);
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
        int i11 = this.f13988x;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f13988x = i13;
        if (i11 != i13) {
            l lVar = this.f13979n;
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
        this.f13982q = charSequence;
        this.f13979n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f13983r = charSequence;
        this.f13979n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f13975j == c10 && this.f13976k == i10) {
            return this;
        }
        this.f13975j = Character.toLowerCase(c10);
        this.f13976k = KeyEvent.normalizeMetaState(i10);
        this.f13979n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.h == c10 && this.f13974i == i10) {
            return this;
        }
        this.h = c10;
        this.f13974i = KeyEvent.normalizeMetaState(i10);
        this.f13979n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.h = c10;
        this.f13974i = KeyEvent.normalizeMetaState(i10);
        this.f13975j = Character.toLowerCase(c11);
        this.f13976k = KeyEvent.normalizeMetaState(i11);
        this.f13979n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f13977l = null;
        this.f13978m = i10;
        this.f13987w = true;
        this.f13979n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f13979n.f13946a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        l lVar = this.f13979n;
        Context context = lVar.f13946a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f13990z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f13969a) > 0) {
            inflate.setId(i11);
        }
        lVar.f13953k = true;
        lVar.p(true);
        return this;
    }
}
