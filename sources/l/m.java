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
import v7.r8;
import v7.v7;
public final class m implements l0.a {
    public n A;
    public MenuItem.OnActionExpandListener B;
    public final int f15194a;
    public final int f15195b;
    public final int f15196c;
    public final int d;
    public CharSequence f15197e;
    public CharSequence f15198f;
    public Intent f15199g;
    public char h;
    public char f15201j;
    public Drawable f15203l;
    public final k f15205n;
    public d0 f15206o;
    public MenuItem.OnMenuItemClickListener f15207p;
    public CharSequence f15208q;
    public CharSequence f15209r;
    public int f15215y;
    public View f15216z;
    public int f15200i = 4096;
    public int f15202k = 4096;
    public int f15204m = 0;
    public ColorStateList f15210s = null;
    public PorterDuff.Mode f15211t = null;
    public boolean f15212u = false;
    public boolean v = false;
    public boolean f15213w = false;
    public int f15214x = 16;
    public boolean C = false;

    public m(k kVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f15205n = kVar;
        this.f15194a = i11;
        this.f15195b = i10;
        this.f15196c = i12;
        this.d = i13;
        this.f15197e = charSequence;
        this.f15215y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(n nVar) {
        this.f15216z = null;
        this.A = nVar;
        this.f15205n.p(true);
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.f15218b = new a6.m(this, 29);
            nVar2.f15217a.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override
    public final n b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f15215y & 8) == 0) {
            return false;
        }
        if (this.f15216z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f15205n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f15213w && (this.f15212u || this.v)) {
            drawable = r8.d(drawable).mutate();
            if (this.f15212u) {
                drawable.setTintList(this.f15210s);
            }
            if (this.v) {
                drawable.setTintMode(this.f15211t);
            }
            this.f15213w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f15215y & 8) != 0) {
            if (this.f15216z == null && (nVar = this.A) != null) {
                this.f15216z = nVar.a(this);
            }
            if (this.f15216z != null) {
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
            return this.f15205n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f15214x |= 32;
        } else {
            this.f15214x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f15216z;
        if (view != null) {
            return view;
        }
        n nVar = this.A;
        if (nVar != null) {
            View a2 = nVar.a(this);
            this.f15216z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f15202k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f15201j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f15208q;
    }

    @Override
    public final int getGroupId() {
        return this.f15195b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f15203l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f15204m;
        if (i10 != 0) {
            Drawable b10 = v7.b(this.f15205n.f15170a, i10);
            this.f15204m = 0;
            this.f15203l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f15210s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f15211t;
    }

    @Override
    public final Intent getIntent() {
        return this.f15199g;
    }

    @Override
    public final int getItemId() {
        return this.f15194a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f15200i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f15196c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f15206o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f15197e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15198f;
        if (charSequence == null) {
            return this.f15197e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f15209r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f15206o != null) {
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
        if ((this.f15214x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f15214x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f15214x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        n nVar = this.A;
        if (nVar != null && nVar.f15217a.overridesItemVisibility()) {
            if ((this.f15214x & 8) == 0 && this.A.f15217a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f15214x & 8) == 0) {
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
        this.f15216z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f15194a) > 0) {
            view.setId(i10);
        }
        k kVar = this.f15205n;
        kVar.f15178k = true;
        kVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f15201j == c10) {
            return this;
        }
        this.f15201j = Character.toLowerCase(c10);
        this.f15205n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f15214x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f15214x = i11;
        if (i10 != i11) {
            this.f15205n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f15214x;
        int i12 = i11 & 4;
        int i13 = 2;
        k kVar = this.f15205n;
        if (i12 != 0) {
            ArrayList arrayList = kVar.f15174f;
            int size = arrayList.size();
            kVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                m mVar = (m) arrayList.get(i14);
                if (mVar.f15195b == this.f15195b && (mVar.f15214x & 4) != 0 && mVar.isCheckable()) {
                    if (mVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i15 = mVar.f15214x;
                    int i16 = i15 & (-3);
                    if (z11) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i17 = i10 | i16;
                    mVar.f15214x = i17;
                    if (i15 != i17) {
                        mVar.f15205n.p(false);
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
        this.f15214x = i19;
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
            this.f15214x |= 16;
        } else {
            this.f15214x &= -17;
        }
        this.f15205n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f15204m = 0;
        this.f15203l = drawable;
        this.f15213w = true;
        this.f15205n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15210s = colorStateList;
        this.f15212u = true;
        this.f15213w = true;
        this.f15205n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15211t = mode;
        this.v = true;
        this.f15213w = true;
        this.f15205n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f15199g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f15205n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15207p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f15201j = Character.toLowerCase(c11);
        this.f15205n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f15215y = i10;
        k kVar = this.f15205n;
        kVar.f15178k = true;
        kVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f15197e = charSequence;
        this.f15205n.p(false);
        d0 d0Var = this.f15206o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15198f = charSequence;
        this.f15205n.p(false);
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
        int i11 = this.f15214x;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f15214x = i13;
        if (i11 != i13) {
            k kVar = this.f15205n;
            kVar.h = true;
            kVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f15197e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f15208q = charSequence;
        this.f15205n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f15209r = charSequence;
        this.f15205n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f15201j == c10 && this.f15202k == i10) {
            return this;
        }
        this.f15201j = Character.toLowerCase(c10);
        this.f15202k = KeyEvent.normalizeMetaState(i10);
        this.f15205n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.h == c10 && this.f15200i == i10) {
            return this;
        }
        this.h = c10;
        this.f15200i = KeyEvent.normalizeMetaState(i10);
        this.f15205n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.h = c10;
        this.f15200i = KeyEvent.normalizeMetaState(i10);
        this.f15201j = Character.toLowerCase(c11);
        this.f15202k = KeyEvent.normalizeMetaState(i11);
        this.f15205n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f15203l = null;
        this.f15204m = i10;
        this.f15213w = true;
        this.f15205n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f15205n.f15170a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        k kVar = this.f15205n;
        Context context = kVar.f15170a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f15216z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f15194a) > 0) {
            inflate.setId(i11);
        }
        kVar.f15178k = true;
        kVar.p(true);
        return this;
    }
}
