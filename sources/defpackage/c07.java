package defpackage;

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
public final class c07 implements ybb {
    public d07 A;
    public MenuItem.OnActionExpandListener B;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public char j;
    public Drawable l;
    public final yz6 n;
    public bab o;
    public MenuItem.OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public int y;
    public View z;
    public int i = 4096;
    public int k = 4096;
    public int m = 0;
    public ColorStateList s = null;
    public PorterDuff.Mode t = null;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public int x = 16;
    public boolean C = false;

    public c07(yz6 yz6Var, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.n = yz6Var;
        this.a = i2;
        this.b = i;
        this.c = i3;
        this.d = i4;
        this.e = charSequence;
        this.y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override
    public final ybb a(d07 d07Var) {
        this.z = null;
        this.A = d07Var;
        this.n.p(true);
        d07 d07Var2 = this.A;
        if (d07Var2 != null) {
            d07Var2.b = new z24(this, (byte) 19);
            d07Var2.a.setVisibilityListener(d07Var2);
        }
        return this;
    }

    @Override
    public final d07 b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.y & 8) != 0) {
            if (this.z == null) {
                return true;
            }
            MenuItem.OnActionExpandListener onActionExpandListener = this.B;
            if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
                return false;
            }
            return this.n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.w && (this.u || this.v)) {
            drawable = drawable.mutate();
            if (this.u) {
                drawable.setTintList(this.s);
            }
            if (this.v) {
                drawable.setTintMode(this.t);
            }
            this.w = false;
        }
        return drawable;
    }

    public final boolean e() {
        d07 d07Var;
        if ((this.y & 8) != 0) {
            View view = this.z;
            if (view == null && (d07Var = this.A) != null) {
                view = d07Var.a.onCreateActionView(this);
                this.z = view;
            }
            if (view != null) {
                return true;
            }
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
            return this.n.f(this);
        }
        return false;
    }

    public final void f(boolean z) {
        int i = this.x;
        if (z) {
            this.x = i | 32;
        } else {
            this.x = i & (-33);
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        d07 d07Var = this.A;
        if (d07Var != null) {
            View onCreateActionView = d07Var.a.onCreateActionView(this);
            this.z = onCreateActionView;
            return onCreateActionView;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.q;
    }

    @Override
    public final int getGroupId() {
        return this.b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.m;
        if (i != 0) {
            Drawable a = hmd.a(this.n.a, i);
            this.m = 0;
            this.l = a;
            return d(a);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    @Override
    public final Intent getIntent() {
        return this.g;
    }

    @Override
    public final int getItemId() {
        return this.a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.e;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.o != null) {
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
        if ((this.x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        d07 d07Var = this.A;
        if (d07Var != null && d07Var.a.overridesItemVisibility()) {
            if ((this.x & 8) != 0 || !this.A.a.isVisible()) {
                return false;
            }
            return true;
        } else if ((this.x & 8) != 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override
    public final MenuItem setActionView(int i) {
        int i2;
        yz6 yz6Var = this.n;
        Context context = yz6Var.a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.a) > 0) {
            inflate.setId(i2);
        }
        yz6Var.k = true;
        yz6Var.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.j == c && this.k == i) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.k = KeyEvent.normalizeMetaState(i);
        this.n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z) {
        int i = this.x;
        int i2 = (i & (-2)) | (z ? 1 : 0);
        this.x = i2;
        if (i != i2) {
            this.n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z) {
        boolean z2;
        int i;
        int i2 = this.x;
        int i3 = i2 & 4;
        int i4 = 2;
        yz6 yz6Var = this.n;
        if (i3 != 0) {
            ArrayList arrayList = yz6Var.f;
            int size = arrayList.size();
            yz6Var.w();
            for (int i5 = 0; i5 < size; i5++) {
                c07 c07Var = (c07) arrayList.get(i5);
                if (c07Var.b == this.b && (c07Var.x & 4) != 0 && c07Var.isCheckable()) {
                    if (c07Var == this) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i6 = c07Var.x;
                    int i7 = i6 & (-3);
                    if (z2) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    int i8 = i7 | i;
                    c07Var.x = i8;
                    if (i6 != i8) {
                        c07Var.n.p(false);
                    }
                }
            }
            yz6Var.v();
            return this;
        }
        int i9 = i2 & (-3);
        if (!z) {
            i4 = 0;
        }
        int i10 = i9 | i4;
        this.x = i10;
        if (i2 != i10) {
            yz6Var.p(false);
        }
        return this;
    }

    @Override
    public final ybb setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.n.p(false);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z) {
        int i = this.x;
        if (z) {
            this.x = i | 16;
        } else {
            this.x = i & (-17);
        }
        this.n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i) {
        this.l = null;
        this.m = i;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.v = true;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.h == c && this.i == i) {
            return this;
        }
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            w26.j("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.y = i;
        yz6 yz6Var = this.n;
        yz6Var.k = true;
        yz6Var.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.p(false);
        bab babVar = this.o;
        if (babVar != null) {
            babVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.p(false);
        return this;
    }

    @Override
    public final ybb setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.n.p(false);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z) {
        int i;
        int i2 = this.x;
        int i3 = i2 & (-9);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i3 | i;
        this.x = i4;
        if (i2 != i4) {
            yz6 yz6Var = this.n;
            yz6Var.h = true;
            yz6Var.p(true);
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
    public final MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i) {
        setTitle(this.n.a.getString(i));
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c) {
        if (this.h == c) {
            return this;
        }
        this.h = c;
        this.n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c, char c2) {
        this.h = c;
        this.j = Character.toLowerCase(c2);
        this.n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.j == c) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.n.p(false);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        int i;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i = this.a) > 0) {
            view.setId(i);
        }
        yz6 yz6Var = this.n;
        yz6Var.k = true;
        yz6Var.p(true);
        return this;
    }
}
