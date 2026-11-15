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
import hi.l0;
import java.util.ArrayList;
public final class m implements l0.a {
    public n A;
    public MenuItem.OnActionExpandListener B;
    public final int f18837a;
    public final int f18838b;
    public final int f18839c;
    public final int d;
    public CharSequence f18840e;
    public CharSequence f18841f;
    public Intent f18842g;
    public char h;
    public char f18844j;
    public Drawable f18846l;
    public final k f18848n;
    public d0 f18849o;
    public MenuItem.OnMenuItemClickListener f18850p;
    public CharSequence f18851q;
    public CharSequence f18852r;
    public int f18858y;
    public View f18859z;
    public int f18843i = 4096;
    public int f18845k = 4096;
    public int f18847m = 0;
    public ColorStateList f18853s = null;
    public PorterDuff.Mode f18854t = null;
    public boolean f18855u = false;
    public boolean v = false;
    public boolean f18856w = false;
    public int f18857x = 16;
    public boolean C = false;

    public m(k kVar, int i7, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f18848n = kVar;
        this.f18837a = i10;
        this.f18838b = i7;
        this.f18839c = i11;
        this.d = i12;
        this.f18840e = charSequence;
        this.f18858y = i13;
    }

    public static void c(StringBuilder sb2, int i7, int i10, String str) {
        if ((i7 & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(n nVar) {
        this.f18859z = null;
        this.A = nVar;
        this.f18848n.p(true);
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.f18861b = new l0(this, 7);
            nVar2.f18860a.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override
    public final n b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f18858y & 8) == 0) {
            return false;
        }
        if (this.f18859z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f18848n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f18856w && (this.f18855u || this.v)) {
            drawable = drawable.mutate();
            if (this.f18855u) {
                drawable.setTintList(this.f18853s);
            }
            if (this.v) {
                drawable.setTintMode(this.f18854t);
            }
            this.f18856w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f18858y & 8) != 0) {
            if (this.f18859z == null && (nVar = this.A) != null) {
                this.f18859z = nVar.a(this);
            }
            if (this.f18859z != null) {
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
            return this.f18848n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f18857x |= 32;
        } else {
            this.f18857x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f18859z;
        if (view != null) {
            return view;
        }
        n nVar = this.A;
        if (nVar != null) {
            View a10 = nVar.a(this);
            this.f18859z = a10;
            return a10;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f18845k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f18844j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f18851q;
    }

    @Override
    public final int getGroupId() {
        return this.f18838b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f18846l;
        if (drawable != null) {
            return d(drawable);
        }
        int i7 = this.f18847m;
        if (i7 != 0) {
            Drawable b10 = b5.a.b(this.f18848n.f18813a, i7);
            this.f18847m = 0;
            this.f18846l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f18853s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f18854t;
    }

    @Override
    public final Intent getIntent() {
        return this.f18842g;
    }

    @Override
    public final int getItemId() {
        return this.f18837a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f18843i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f18839c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f18849o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f18840e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f18841f;
        if (charSequence == null) {
            return this.f18840e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f18852r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f18849o != null) {
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
        if ((this.f18857x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f18857x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f18857x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        n nVar = this.A;
        if (nVar != null && nVar.f18860a.overridesItemVisibility()) {
            if ((this.f18857x & 8) == 0 && this.A.f18860a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f18857x & 8) == 0) {
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
        this.f18859z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i7 = this.f18837a) > 0) {
            view.setId(i7);
        }
        k kVar = this.f18848n;
        kVar.f18821k = true;
        kVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f18844j == c10) {
            return this;
        }
        this.f18844j = Character.toLowerCase(c10);
        this.f18848n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i7 = this.f18857x;
        int i10 = (z10 ? 1 : 0) | (i7 & (-2));
        this.f18857x = i10;
        if (i7 != i10) {
            this.f18848n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i7;
        int i10 = this.f18857x;
        int i11 = i10 & 4;
        int i12 = 2;
        k kVar = this.f18848n;
        if (i11 != 0) {
            ArrayList arrayList = kVar.f18817f;
            int size = arrayList.size();
            kVar.w();
            for (int i13 = 0; i13 < size; i13++) {
                m mVar = (m) arrayList.get(i13);
                if (mVar.f18838b == this.f18838b && (mVar.f18857x & 4) != 0 && mVar.isCheckable()) {
                    if (mVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i14 = mVar.f18857x;
                    int i15 = i14 & (-3);
                    if (z11) {
                        i7 = 2;
                    } else {
                        i7 = 0;
                    }
                    int i16 = i7 | i15;
                    mVar.f18857x = i16;
                    if (i14 != i16) {
                        mVar.f18848n.p(false);
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
        this.f18857x = i18;
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
            this.f18857x |= 16;
        } else {
            this.f18857x &= -17;
        }
        this.f18848n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f18847m = 0;
        this.f18846l = drawable;
        this.f18856w = true;
        this.f18848n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f18853s = colorStateList;
        this.f18855u = true;
        this.f18856w = true;
        this.f18848n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f18854t = mode;
        this.v = true;
        this.f18856w = true;
        this.f18848n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f18842g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f18848n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f18850p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f18844j = Character.toLowerCase(c11);
        this.f18848n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i7) {
        int i10 = i7 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f18858y = i7;
        k kVar = this.f18848n;
        kVar.f18821k = true;
        kVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f18840e = charSequence;
        this.f18848n.p(false);
        d0 d0Var = this.f18849o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f18841f = charSequence;
        this.f18848n.p(false);
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
        int i10 = this.f18857x;
        int i11 = i10 & (-9);
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        int i12 = i7 | i11;
        this.f18857x = i12;
        if (i10 != i12) {
            k kVar = this.f18848n;
            kVar.h = true;
            kVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f18840e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f18851q = charSequence;
        this.f18848n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f18852r = charSequence;
        this.f18848n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i7) {
        if (this.f18844j == c10 && this.f18845k == i7) {
            return this;
        }
        this.f18844j = Character.toLowerCase(c10);
        this.f18845k = KeyEvent.normalizeMetaState(i7);
        this.f18848n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i7) {
        if (this.h == c10 && this.f18843i == i7) {
            return this;
        }
        this.h = c10;
        this.f18843i = KeyEvent.normalizeMetaState(i7);
        this.f18848n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i7, int i10) {
        this.h = c10;
        this.f18843i = KeyEvent.normalizeMetaState(i7);
        this.f18844j = Character.toLowerCase(c11);
        this.f18845k = KeyEvent.normalizeMetaState(i10);
        this.f18848n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i7) {
        this.f18846l = null;
        this.f18847m = i7;
        this.f18856w = true;
        this.f18848n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i7) {
        setTitle(this.f18848n.f18813a.getString(i7));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i7) {
        int i10;
        k kVar = this.f18848n;
        Context context = kVar.f18813a;
        View inflate = LayoutInflater.from(context).inflate(i7, (ViewGroup) new LinearLayout(context), false);
        this.f18859z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.f18837a) > 0) {
            inflate.setId(i10);
        }
        kVar.f18821k = true;
        kVar.p(true);
        return this;
    }
}
