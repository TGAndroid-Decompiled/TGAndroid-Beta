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
import j7.h8;
import j7.r7;
import java.util.ArrayList;
public final class m implements l0.a {
    public n A;
    public MenuItem.OnActionExpandListener B;
    public final int f11063a;
    public final int f11064b;
    public final int f11065c;
    public final int d;
    public CharSequence e;
    public CharSequence f11066f;
    public Intent f11067g;
    public char h;
    public char f11069j;
    public Drawable f11071l;
    public final k f11073n;
    public d0 f11074o;
    public MenuItem.OnMenuItemClickListener f11075p;
    public CharSequence f11076q;
    public CharSequence f11077r;
    public int f11083y;
    public View f11084z;
    public int f11068i = 4096;
    public int f11070k = 4096;
    public int f11072m = 0;
    public ColorStateList f11078s = null;
    public PorterDuff.Mode f11079t = null;
    public boolean f11080u = false;
    public boolean v = false;
    public boolean f11081w = false;
    public int f11082x = 16;
    public boolean C = false;

    public m(k kVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f11073n = kVar;
        this.f11063a = i11;
        this.f11064b = i10;
        this.f11065c = i12;
        this.d = i13;
        this.e = charSequence;
        this.f11083y = i14;
    }

    public static void c(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    @Override
    public final l0.a a(n nVar) {
        this.f11084z = null;
        this.A = nVar;
        this.f11073n.p(true);
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.f11086b = new a3.c(this, 21);
            nVar2.f11085a.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override
    public final n b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f11083y & 8) == 0) {
            return false;
        }
        if (this.f11084z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f11073n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f11081w && (this.f11080u || this.v)) {
            drawable = h8.d(drawable).mutate();
            if (this.f11080u) {
                drawable.setTintList(this.f11078s);
            }
            if (this.v) {
                drawable.setTintMode(this.f11079t);
            }
            this.f11081w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f11083y & 8) != 0) {
            if (this.f11084z == null && (nVar = this.A) != null) {
                this.f11084z = nVar.a(this);
            }
            if (this.f11084z != null) {
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
            return this.f11073n.f(this);
        }
        return false;
    }

    public final void f(boolean z4) {
        if (z4) {
            this.f11082x |= 32;
        } else {
            this.f11082x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f11084z;
        if (view != null) {
            return view;
        }
        n nVar = this.A;
        if (nVar != null) {
            View a2 = nVar.a(this);
            this.f11084z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f11070k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f11069j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f11076q;
    }

    @Override
    public final int getGroupId() {
        return this.f11064b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f11071l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f11072m;
        if (i10 != 0) {
            Drawable b10 = r7.b(this.f11073n.f11040a, i10);
            this.f11072m = 0;
            this.f11071l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f11078s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f11079t;
    }

    @Override
    public final Intent getIntent() {
        return this.f11067g;
    }

    @Override
    public final int getItemId() {
        return this.f11063a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f11068i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f11065c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f11074o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f11066f;
        if (charSequence == null) {
            return this.e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f11077r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f11074o != null) {
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
        if ((this.f11082x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f11082x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f11082x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        n nVar = this.A;
        if (nVar != null && nVar.f11085a.overridesItemVisibility()) {
            if ((this.f11082x & 8) == 0 && this.A.f11085a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f11082x & 8) == 0) {
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
        this.f11084z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f11063a) > 0) {
            view.setId(i10);
        }
        k kVar = this.f11073n;
        kVar.f11047k = true;
        kVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f11069j == c3) {
            return this;
        }
        this.f11069j = Character.toLowerCase(c3);
        this.f11073n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z4) {
        int i10 = this.f11082x;
        int i11 = (z4 ? 1 : 0) | (i10 & (-2));
        this.f11082x = i11;
        if (i10 != i11) {
            this.f11073n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z4) {
        boolean z10;
        int i10;
        int i11 = this.f11082x;
        int i12 = i11 & 4;
        int i13 = 2;
        k kVar = this.f11073n;
        if (i12 != 0) {
            ArrayList arrayList = kVar.f11043f;
            int size = arrayList.size();
            kVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                m mVar = (m) arrayList.get(i14);
                if (mVar.f11064b == this.f11064b && (mVar.f11082x & 4) != 0 && mVar.isCheckable()) {
                    if (mVar == this) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i15 = mVar.f11082x;
                    int i16 = i15 & (-3);
                    if (z10) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i17 = i10 | i16;
                    mVar.f11082x = i17;
                    if (i15 != i17) {
                        mVar.f11073n.p(false);
                    }
                }
            }
            kVar.v();
            return this;
        }
        int i18 = i11 & (-3);
        if (!z4) {
            i13 = 0;
        }
        int i19 = i18 | i13;
        this.f11082x = i19;
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
    public final MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.f11082x |= 16;
        } else {
            this.f11082x &= -17;
        }
        this.f11073n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f11072m = 0;
        this.f11071l = drawable;
        this.f11081w = true;
        this.f11073n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11078s = colorStateList;
        this.f11080u = true;
        this.f11081w = true;
        this.f11073n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11079t = mode;
        this.v = true;
        this.f11081w = true;
        this.f11073n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f11067g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c3) {
        if (this.h == c3) {
            return this;
        }
        this.h = c3;
        this.f11073n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f11075p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c3, char c10) {
        this.h = c3;
        this.f11069j = Character.toLowerCase(c10);
        this.f11073n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f11083y = i10;
        k kVar = this.f11073n;
        kVar.f11047k = true;
        kVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.f11073n.p(false);
        d0 d0Var = this.f11074o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11066f = charSequence;
        this.f11073n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z4) {
        int i10;
        int i11 = this.f11082x;
        int i12 = i11 & (-9);
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f11082x = i13;
        if (i11 != i13) {
            k kVar = this.f11073n;
            kVar.h = true;
            kVar.p(true);
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
        this.f11076q = charSequence;
        this.f11073n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f11077r = charSequence;
        this.f11073n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c3, int i10) {
        if (this.f11069j == c3 && this.f11070k == i10) {
            return this;
        }
        this.f11069j = Character.toLowerCase(c3);
        this.f11070k = KeyEvent.normalizeMetaState(i10);
        this.f11073n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c3, int i10) {
        if (this.h == c3 && this.f11068i == i10) {
            return this;
        }
        this.h = c3;
        this.f11068i = KeyEvent.normalizeMetaState(i10);
        this.f11073n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c3, char c10, int i10, int i11) {
        this.h = c3;
        this.f11068i = KeyEvent.normalizeMetaState(i10);
        this.f11069j = Character.toLowerCase(c10);
        this.f11070k = KeyEvent.normalizeMetaState(i11);
        this.f11073n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f11071l = null;
        this.f11072m = i10;
        this.f11081w = true;
        this.f11073n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f11073n.f11040a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        k kVar = this.f11073n;
        Context context = kVar.f11040a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f11084z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f11063a) > 0) {
            inflate.setId(i11);
        }
        kVar.f11047k = true;
        kVar.p(true);
        return this;
    }
}
