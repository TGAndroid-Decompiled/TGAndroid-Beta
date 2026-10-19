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
import v7.q7;
public final class m implements l0.a {
    public n A;
    public MenuItem.OnActionExpandListener B;
    public final int f15778a;
    public final int f15779b;
    public final int f15780c;
    public final int d;
    public CharSequence e;
    public CharSequence f15781f;
    public Intent f15782g;
    public char h;
    public char f15784j;
    public Drawable f15786l;
    public final k f15788n;
    public d0 f15789o;
    public MenuItem.OnMenuItemClickListener f15790p;
    public CharSequence f15791q;
    public CharSequence f15792r;
    public int f15798y;
    public View f15799z;
    public int f15783i = 4096;
    public int f15785k = 4096;
    public int f15787m = 0;
    public ColorStateList f15793s = null;
    public PorterDuff.Mode f15794t = null;
    public boolean f15795u = false;
    public boolean v = false;
    public boolean f15796w = false;
    public int f15797x = 16;
    public boolean C = false;

    public m(k kVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f15788n = kVar;
        this.f15778a = i11;
        this.f15779b = i10;
        this.f15780c = i12;
        this.d = i13;
        this.e = charSequence;
        this.f15798y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(n nVar) {
        this.f15799z = null;
        this.A = nVar;
        this.f15788n.p(true);
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.f15801b = new a4.l(this, 28);
            nVar2.f15800a.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override
    public final n b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f15798y & 8) == 0) {
            return false;
        }
        if (this.f15799z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f15788n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f15796w && (this.f15795u || this.v)) {
            drawable = drawable.mutate();
            if (this.f15795u) {
                drawable.setTintList(this.f15793s);
            }
            if (this.v) {
                drawable.setTintMode(this.f15794t);
            }
            this.f15796w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f15798y & 8) != 0) {
            if (this.f15799z == null && (nVar = this.A) != null) {
                this.f15799z = nVar.a(this);
            }
            if (this.f15799z != null) {
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
            return this.f15788n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f15797x |= 32;
        } else {
            this.f15797x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f15799z;
        if (view != null) {
            return view;
        }
        n nVar = this.A;
        if (nVar != null) {
            View a2 = nVar.a(this);
            this.f15799z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f15785k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f15784j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f15791q;
    }

    @Override
    public final int getGroupId() {
        return this.f15779b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f15786l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f15787m;
        if (i10 != 0) {
            Drawable b10 = q7.b(this.f15788n.f15755a, i10);
            this.f15787m = 0;
            this.f15786l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f15793s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f15794t;
    }

    @Override
    public final Intent getIntent() {
        return this.f15782g;
    }

    @Override
    public final int getItemId() {
        return this.f15778a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f15783i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f15780c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f15789o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15781f;
        if (charSequence == null) {
            return this.e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f15792r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f15789o != null) {
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
        if ((this.f15797x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f15797x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f15797x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        n nVar = this.A;
        if (nVar != null && nVar.f15800a.overridesItemVisibility()) {
            if ((this.f15797x & 8) == 0 && this.A.f15800a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f15797x & 8) == 0) {
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
        this.f15799z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f15778a) > 0) {
            view.setId(i10);
        }
        k kVar = this.f15788n;
        kVar.f15762k = true;
        kVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f15784j == c10) {
            return this;
        }
        this.f15784j = Character.toLowerCase(c10);
        this.f15788n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f15797x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f15797x = i11;
        if (i10 != i11) {
            this.f15788n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f15797x;
        int i12 = i11 & 4;
        int i13 = 2;
        k kVar = this.f15788n;
        if (i12 != 0) {
            ArrayList arrayList = kVar.f15758f;
            int size = arrayList.size();
            kVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                m mVar = (m) arrayList.get(i14);
                if (mVar.f15779b == this.f15779b && (mVar.f15797x & 4) != 0 && mVar.isCheckable()) {
                    if (mVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i15 = mVar.f15797x;
                    int i16 = i15 & (-3);
                    if (z11) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i17 = i10 | i16;
                    mVar.f15797x = i17;
                    if (i15 != i17) {
                        mVar.f15788n.p(false);
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
        this.f15797x = i19;
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
            this.f15797x |= 16;
        } else {
            this.f15797x &= -17;
        }
        this.f15788n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f15787m = 0;
        this.f15786l = drawable;
        this.f15796w = true;
        this.f15788n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15793s = colorStateList;
        this.f15795u = true;
        this.f15796w = true;
        this.f15788n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15794t = mode;
        this.v = true;
        this.f15796w = true;
        this.f15788n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f15782g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f15788n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15790p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f15784j = Character.toLowerCase(c11);
        this.f15788n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f15798y = i10;
        k kVar = this.f15788n;
        kVar.f15762k = true;
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
        this.f15788n.p(false);
        d0 d0Var = this.f15789o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15781f = charSequence;
        this.f15788n.p(false);
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
        int i11 = this.f15797x;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f15797x = i13;
        if (i11 != i13) {
            k kVar = this.f15788n;
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
        this.f15791q = charSequence;
        this.f15788n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f15792r = charSequence;
        this.f15788n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f15784j == c10 && this.f15785k == i10) {
            return this;
        }
        this.f15784j = Character.toLowerCase(c10);
        this.f15785k = KeyEvent.normalizeMetaState(i10);
        this.f15788n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.h == c10 && this.f15783i == i10) {
            return this;
        }
        this.h = c10;
        this.f15783i = KeyEvent.normalizeMetaState(i10);
        this.f15788n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.h = c10;
        this.f15783i = KeyEvent.normalizeMetaState(i10);
        this.f15784j = Character.toLowerCase(c11);
        this.f15785k = KeyEvent.normalizeMetaState(i11);
        this.f15788n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f15786l = null;
        this.f15787m = i10;
        this.f15796w = true;
        this.f15788n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f15788n.f15755a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        k kVar = this.f15788n;
        Context context = kVar.f15755a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f15799z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f15778a) > 0) {
            inflate.setId(i11);
        }
        kVar.f15762k = true;
        kVar.p(true);
        return this;
    }
}
