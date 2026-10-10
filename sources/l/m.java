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
import v7.s7;
public final class m implements l0.a {
    public n A;
    public MenuItem.OnActionExpandListener B;
    public final int f15263a;
    public final int f15264b;
    public final int f15265c;
    public final int d;
    public CharSequence f15266e;
    public CharSequence f15267f;
    public Intent f15268g;
    public char h;
    public char f15270j;
    public Drawable f15272l;
    public final k f15274n;
    public d0 f15275o;
    public MenuItem.OnMenuItemClickListener f15276p;
    public CharSequence f15277q;
    public CharSequence f15278r;
    public int f15284y;
    public View f15285z;
    public int f15269i = 4096;
    public int f15271k = 4096;
    public int f15273m = 0;
    public ColorStateList f15279s = null;
    public PorterDuff.Mode f15280t = null;
    public boolean f15281u = false;
    public boolean v = false;
    public boolean f15282w = false;
    public int f15283x = 16;
    public boolean C = false;

    public m(k kVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f15274n = kVar;
        this.f15263a = i11;
        this.f15264b = i10;
        this.f15265c = i12;
        this.d = i13;
        this.f15266e = charSequence;
        this.f15284y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(n nVar) {
        this.f15285z = null;
        this.A = nVar;
        this.f15274n.p(true);
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.f15287b = new a4.l(this, 27);
            nVar2.f15286a.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override
    public final n b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f15284y & 8) == 0) {
            return false;
        }
        if (this.f15285z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f15274n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f15282w && (this.f15281u || this.v)) {
            drawable = drawable.mutate();
            if (this.f15281u) {
                drawable.setTintList(this.f15279s);
            }
            if (this.v) {
                drawable.setTintMode(this.f15280t);
            }
            this.f15282w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f15284y & 8) != 0) {
            if (this.f15285z == null && (nVar = this.A) != null) {
                this.f15285z = nVar.a(this);
            }
            if (this.f15285z != null) {
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
            return this.f15274n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f15283x |= 32;
        } else {
            this.f15283x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f15285z;
        if (view != null) {
            return view;
        }
        n nVar = this.A;
        if (nVar != null) {
            View a2 = nVar.a(this);
            this.f15285z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f15271k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f15270j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f15277q;
    }

    @Override
    public final int getGroupId() {
        return this.f15264b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f15272l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f15273m;
        if (i10 != 0) {
            Drawable b10 = s7.b(this.f15274n.f15239a, i10);
            this.f15273m = 0;
            this.f15272l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f15279s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f15280t;
    }

    @Override
    public final Intent getIntent() {
        return this.f15268g;
    }

    @Override
    public final int getItemId() {
        return this.f15263a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f15269i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f15265c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f15275o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f15266e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15267f;
        if (charSequence == null) {
            return this.f15266e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f15278r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f15275o != null) {
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
        if ((this.f15283x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f15283x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f15283x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        n nVar = this.A;
        if (nVar != null && nVar.f15286a.overridesItemVisibility()) {
            if ((this.f15283x & 8) == 0 && this.A.f15286a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f15283x & 8) == 0) {
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
        this.f15285z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f15263a) > 0) {
            view.setId(i10);
        }
        k kVar = this.f15274n;
        kVar.f15247k = true;
        kVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f15270j == c10) {
            return this;
        }
        this.f15270j = Character.toLowerCase(c10);
        this.f15274n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f15283x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f15283x = i11;
        if (i10 != i11) {
            this.f15274n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f15283x;
        int i12 = i11 & 4;
        int i13 = 2;
        k kVar = this.f15274n;
        if (i12 != 0) {
            ArrayList arrayList = kVar.f15243f;
            int size = arrayList.size();
            kVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                m mVar = (m) arrayList.get(i14);
                if (mVar.f15264b == this.f15264b && (mVar.f15283x & 4) != 0 && mVar.isCheckable()) {
                    if (mVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i15 = mVar.f15283x;
                    int i16 = i15 & (-3);
                    if (z11) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i17 = i10 | i16;
                    mVar.f15283x = i17;
                    if (i15 != i17) {
                        mVar.f15274n.p(false);
                    }
                }
            }
            kVar.v();
            return this;
        }
        int i18 = i11 & (-3);
        if (!z10) {
            i13 = 0;
        }
        int i19 = i18 | i13;
        this.f15283x = i19;
        if (i11 != i19) {
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
            this.f15283x |= 16;
        } else {
            this.f15283x &= -17;
        }
        this.f15274n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f15273m = 0;
        this.f15272l = drawable;
        this.f15282w = true;
        this.f15274n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15279s = colorStateList;
        this.f15281u = true;
        this.f15282w = true;
        this.f15274n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15280t = mode;
        this.v = true;
        this.f15282w = true;
        this.f15274n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f15268g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f15274n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15276p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f15270j = Character.toLowerCase(c11);
        this.f15274n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f15284y = i10;
        k kVar = this.f15274n;
        kVar.f15247k = true;
        kVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f15266e = charSequence;
        this.f15274n.p(false);
        d0 d0Var = this.f15275o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15267f = charSequence;
        this.f15274n.p(false);
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
        int i11 = this.f15283x;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f15283x = i13;
        if (i11 != i13) {
            k kVar = this.f15274n;
            kVar.h = true;
            kVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f15266e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f15277q = charSequence;
        this.f15274n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f15278r = charSequence;
        this.f15274n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f15270j == c10 && this.f15271k == i10) {
            return this;
        }
        this.f15270j = Character.toLowerCase(c10);
        this.f15271k = KeyEvent.normalizeMetaState(i10);
        this.f15274n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.h == c10 && this.f15269i == i10) {
            return this;
        }
        this.h = c10;
        this.f15269i = KeyEvent.normalizeMetaState(i10);
        this.f15274n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.h = c10;
        this.f15269i = KeyEvent.normalizeMetaState(i10);
        this.f15270j = Character.toLowerCase(c11);
        this.f15271k = KeyEvent.normalizeMetaState(i11);
        this.f15274n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f15272l = null;
        this.f15273m = i10;
        this.f15282w = true;
        this.f15274n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f15274n.f15239a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        k kVar = this.f15274n;
        Context context = kVar.f15239a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f15285z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f15263a) > 0) {
            inflate.setId(i11);
        }
        kVar.f15247k = true;
        kVar.p(true);
        return this;
    }
}
