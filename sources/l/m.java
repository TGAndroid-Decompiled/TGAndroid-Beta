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
    public final int f13745a;
    public final int f13746b;
    public final int f13747c;
    public final int d;
    public CharSequence e;
    public CharSequence f13748f;
    public Intent f13749g;
    public char h;
    public char f13751j;
    public Drawable f13753l;
    public final k f13755n;
    public d0 f13756o;
    public MenuItem.OnMenuItemClickListener f13757p;
    public CharSequence f13758q;
    public CharSequence f13759r;
    public int f13765y;
    public View f13766z;
    public int f13750i = 4096;
    public int f13752k = 4096;
    public int f13754m = 0;
    public ColorStateList f13760s = null;
    public PorterDuff.Mode f13761t = null;
    public boolean f13762u = false;
    public boolean v = false;
    public boolean f13763w = false;
    public int f13764x = 16;
    public boolean C = false;

    public m(k kVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f13755n = kVar;
        this.f13745a = i11;
        this.f13746b = i10;
        this.f13747c = i12;
        this.d = i13;
        this.e = charSequence;
        this.f13765y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(n nVar) {
        this.f13766z = null;
        this.A = nVar;
        this.f13755n.p(true);
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.f13768b = new k2.b0(this, 1);
            nVar2.f13767a.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override
    public final n b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f13765y & 8) == 0) {
            return false;
        }
        if (this.f13766z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f13755n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f13763w && (this.f13762u || this.v)) {
            drawable = r8.d(drawable).mutate();
            if (this.f13762u) {
                drawable.setTintList(this.f13760s);
            }
            if (this.v) {
                drawable.setTintMode(this.f13761t);
            }
            this.f13763w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f13765y & 8) != 0) {
            if (this.f13766z == null && (nVar = this.A) != null) {
                this.f13766z = nVar.a(this);
            }
            if (this.f13766z != null) {
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
            return this.f13755n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f13764x |= 32;
        } else {
            this.f13764x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f13766z;
        if (view != null) {
            return view;
        }
        n nVar = this.A;
        if (nVar != null) {
            View a2 = nVar.a(this);
            this.f13766z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f13752k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f13751j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f13758q;
    }

    @Override
    public final int getGroupId() {
        return this.f13746b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f13753l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f13754m;
        if (i10 != 0) {
            Drawable b10 = v7.b(this.f13755n.f13722a, i10);
            this.f13754m = 0;
            this.f13753l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f13760s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f13761t;
    }

    @Override
    public final Intent getIntent() {
        return this.f13749g;
    }

    @Override
    public final int getItemId() {
        return this.f13745a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f13750i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f13747c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f13756o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13748f;
        if (charSequence == null) {
            return this.e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f13759r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f13756o != null) {
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
        if ((this.f13764x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f13764x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f13764x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        n nVar = this.A;
        if (nVar != null && nVar.f13767a.overridesItemVisibility()) {
            if ((this.f13764x & 8) == 0 && this.A.f13767a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f13764x & 8) == 0) {
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
        this.f13766z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f13745a) > 0) {
            view.setId(i10);
        }
        k kVar = this.f13755n;
        kVar.f13729k = true;
        kVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f13751j == c10) {
            return this;
        }
        this.f13751j = Character.toLowerCase(c10);
        this.f13755n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f13764x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f13764x = i11;
        if (i10 != i11) {
            this.f13755n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f13764x;
        int i12 = i11 & 4;
        int i13 = 2;
        k kVar = this.f13755n;
        if (i12 != 0) {
            ArrayList arrayList = kVar.f13725f;
            int size = arrayList.size();
            kVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                m mVar = (m) arrayList.get(i14);
                if (mVar.f13746b == this.f13746b && (mVar.f13764x & 4) != 0 && mVar.isCheckable()) {
                    if (mVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i15 = mVar.f13764x;
                    int i16 = i15 & (-3);
                    if (z11) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i17 = i10 | i16;
                    mVar.f13764x = i17;
                    if (i15 != i17) {
                        mVar.f13755n.p(false);
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
        this.f13764x = i19;
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
            this.f13764x |= 16;
        } else {
            this.f13764x &= -17;
        }
        this.f13755n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f13754m = 0;
        this.f13753l = drawable;
        this.f13763w = true;
        this.f13755n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13760s = colorStateList;
        this.f13762u = true;
        this.f13763w = true;
        this.f13755n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13761t = mode;
        this.v = true;
        this.f13763w = true;
        this.f13755n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f13749g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f13755n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13757p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f13751j = Character.toLowerCase(c11);
        this.f13755n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f13765y = i10;
        k kVar = this.f13755n;
        kVar.f13729k = true;
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
        this.f13755n.p(false);
        d0 d0Var = this.f13756o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13748f = charSequence;
        this.f13755n.p(false);
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
        int i11 = this.f13764x;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f13764x = i13;
        if (i11 != i13) {
            k kVar = this.f13755n;
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
        this.f13758q = charSequence;
        this.f13755n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f13759r = charSequence;
        this.f13755n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f13751j == c10 && this.f13752k == i10) {
            return this;
        }
        this.f13751j = Character.toLowerCase(c10);
        this.f13752k = KeyEvent.normalizeMetaState(i10);
        this.f13755n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.h == c10 && this.f13750i == i10) {
            return this;
        }
        this.h = c10;
        this.f13750i = KeyEvent.normalizeMetaState(i10);
        this.f13755n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.h = c10;
        this.f13750i = KeyEvent.normalizeMetaState(i10);
        this.f13751j = Character.toLowerCase(c11);
        this.f13752k = KeyEvent.normalizeMetaState(i11);
        this.f13755n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f13753l = null;
        this.f13754m = i10;
        this.f13763w = true;
        this.f13755n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f13755n.f13722a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        k kVar = this.f13755n;
        Context context = kVar.f13722a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f13766z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f13745a) > 0) {
            inflate.setId(i11);
        }
        kVar.f13729k = true;
        kVar.p(true);
        return this;
    }
}
