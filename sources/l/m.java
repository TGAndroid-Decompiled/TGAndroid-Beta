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
import h9.g1;
import java.util.ArrayList;
public final class m implements l0.a {
    public n A;
    public MenuItem.OnActionExpandListener B;
    public final int f19204a;
    public final int f19205b;
    public final int f19206c;
    public final int d;
    public CharSequence f19207e;
    public CharSequence f19208f;
    public Intent f19209g;
    public char h;
    public char f19211j;
    public Drawable f19213l;
    public final k f19215n;
    public d0 f19216o;
    public MenuItem.OnMenuItemClickListener f19217p;
    public CharSequence f19218q;
    public CharSequence f19219r;
    public int f19225y;
    public View f19226z;
    public int f19210i = 4096;
    public int f19212k = 4096;
    public int f19214m = 0;
    public ColorStateList f19220s = null;
    public PorterDuff.Mode f19221t = null;
    public boolean f19222u = false;
    public boolean v = false;
    public boolean f19223w = false;
    public int f19224x = 16;
    public boolean C = false;

    public m(k kVar, int i7, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f19215n = kVar;
        this.f19204a = i10;
        this.f19205b = i7;
        this.f19206c = i11;
        this.d = i12;
        this.f19207e = charSequence;
        this.f19225y = i13;
    }

    public static void c(StringBuilder sb2, int i7, int i10, String str) {
        if ((i7 & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(n nVar) {
        this.f19226z = null;
        this.A = nVar;
        this.f19215n.p(true);
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.f19228b = new g1(this, 7);
            nVar2.f19227a.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override
    public final n b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f19225y & 8) == 0) {
            return false;
        }
        if (this.f19226z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f19215n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f19223w && (this.f19222u || this.v)) {
            drawable = drawable.mutate();
            if (this.f19222u) {
                drawable.setTintList(this.f19220s);
            }
            if (this.v) {
                drawable.setTintMode(this.f19221t);
            }
            this.f19223w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f19225y & 8) != 0) {
            if (this.f19226z == null && (nVar = this.A) != null) {
                this.f19226z = nVar.a(this);
            }
            if (this.f19226z != null) {
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
            return this.f19215n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f19224x |= 32;
        } else {
            this.f19224x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f19226z;
        if (view != null) {
            return view;
        }
        n nVar = this.A;
        if (nVar != null) {
            View a10 = nVar.a(this);
            this.f19226z = a10;
            return a10;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f19212k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f19211j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f19218q;
    }

    @Override
    public final int getGroupId() {
        return this.f19205b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f19213l;
        if (drawable != null) {
            return d(drawable);
        }
        int i7 = this.f19214m;
        if (i7 != 0) {
            Drawable b10 = c8.z.b(this.f19215n.f19180a, i7);
            this.f19214m = 0;
            this.f19213l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f19220s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f19221t;
    }

    @Override
    public final Intent getIntent() {
        return this.f19209g;
    }

    @Override
    public final int getItemId() {
        return this.f19204a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f19210i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f19206c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f19216o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f19207e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f19208f;
        if (charSequence == null) {
            return this.f19207e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f19219r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f19216o != null) {
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
        if ((this.f19224x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f19224x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f19224x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        n nVar = this.A;
        if (nVar != null && nVar.f19227a.overridesItemVisibility()) {
            if ((this.f19224x & 8) == 0 && this.A.f19227a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f19224x & 8) == 0) {
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
        int i7;
        this.f19226z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i7 = this.f19204a) > 0) {
            view.setId(i7);
        }
        k kVar = this.f19215n;
        kVar.f19188k = true;
        kVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f19211j == c10) {
            return this;
        }
        this.f19211j = Character.toLowerCase(c10);
        this.f19215n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i7 = this.f19224x;
        int i10 = (z10 ? 1 : 0) | (i7 & (-2));
        this.f19224x = i10;
        if (i7 != i10) {
            this.f19215n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i7;
        int i10 = this.f19224x;
        int i11 = i10 & 4;
        int i12 = 2;
        k kVar = this.f19215n;
        if (i11 != 0) {
            ArrayList arrayList = kVar.f19184f;
            int size = arrayList.size();
            kVar.w();
            for (int i13 = 0; i13 < size; i13++) {
                m mVar = (m) arrayList.get(i13);
                if (mVar.f19205b == this.f19205b && (mVar.f19224x & 4) != 0 && mVar.isCheckable()) {
                    if (mVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i14 = mVar.f19224x;
                    int i15 = i14 & (-3);
                    if (z11) {
                        i7 = 2;
                    } else {
                        i7 = 0;
                    }
                    int i16 = i7 | i15;
                    mVar.f19224x = i16;
                    if (i14 != i16) {
                        mVar.f19215n.p(false);
                    }
                }
            }
            kVar.v();
            return this;
        }
        int i17 = i10 & (-3);
        if (!z10) {
            i12 = 0;
        }
        int i18 = i17 | i12;
        this.f19224x = i18;
        if (i10 != i18) {
            kVar.p(false);
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
            this.f19224x |= 16;
        } else {
            this.f19224x &= -17;
        }
        this.f19215n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f19214m = 0;
        this.f19213l = drawable;
        this.f19223w = true;
        this.f19215n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f19220s = colorStateList;
        this.f19222u = true;
        this.f19223w = true;
        this.f19215n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f19221t = mode;
        this.v = true;
        this.f19223w = true;
        this.f19215n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f19209g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f19215n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f19217p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f19211j = Character.toLowerCase(c11);
        this.f19215n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i7) {
        int i10 = i7 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f19225y = i7;
        k kVar = this.f19215n;
        kVar.f19188k = true;
        kVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f19207e = charSequence;
        this.f19215n.p(false);
        d0 d0Var = this.f19216o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f19208f = charSequence;
        this.f19215n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        int i7;
        int i10 = this.f19224x;
        int i11 = i10 & (-9);
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        int i12 = i7 | i11;
        this.f19224x = i12;
        if (i10 != i12) {
            k kVar = this.f19215n;
            kVar.h = true;
            kVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f19207e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f19218q = charSequence;
        this.f19215n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f19219r = charSequence;
        this.f19215n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i7) {
        if (this.f19211j == c10 && this.f19212k == i7) {
            return this;
        }
        this.f19211j = Character.toLowerCase(c10);
        this.f19212k = KeyEvent.normalizeMetaState(i7);
        this.f19215n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i7) {
        if (this.h == c10 && this.f19210i == i7) {
            return this;
        }
        this.h = c10;
        this.f19210i = KeyEvent.normalizeMetaState(i7);
        this.f19215n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i7, int i10) {
        this.h = c10;
        this.f19210i = KeyEvent.normalizeMetaState(i7);
        this.f19211j = Character.toLowerCase(c11);
        this.f19212k = KeyEvent.normalizeMetaState(i10);
        this.f19215n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i7) {
        this.f19213l = null;
        this.f19214m = i7;
        this.f19223w = true;
        this.f19215n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i7) {
        setTitle(this.f19215n.f19180a.getString(i7));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i7) {
        int i10;
        k kVar = this.f19215n;
        Context context = kVar.f19180a;
        View inflate = LayoutInflater.from(context).inflate(i7, (ViewGroup) new LinearLayout(context), false);
        this.f19226z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.f19204a) > 0) {
            inflate.setId(i10);
        }
        kVar.f19188k = true;
        kVar.p(true);
        return this;
    }
}
