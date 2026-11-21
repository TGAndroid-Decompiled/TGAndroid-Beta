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
    public final int f19229a;
    public final int f19230b;
    public final int f19231c;
    public final int d;
    public CharSequence f19232e;
    public CharSequence f19233f;
    public Intent f19234g;
    public char h;
    public char f19236j;
    public Drawable f19238l;
    public final k f19240n;
    public d0 f19241o;
    public MenuItem.OnMenuItemClickListener f19242p;
    public CharSequence f19243q;
    public CharSequence f19244r;
    public int f19250y;
    public View f19251z;
    public int f19235i = 4096;
    public int f19237k = 4096;
    public int f19239m = 0;
    public ColorStateList f19245s = null;
    public PorterDuff.Mode f19246t = null;
    public boolean f19247u = false;
    public boolean v = false;
    public boolean f19248w = false;
    public int f19249x = 16;
    public boolean C = false;

    public m(k kVar, int i7, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f19240n = kVar;
        this.f19229a = i10;
        this.f19230b = i7;
        this.f19231c = i11;
        this.d = i12;
        this.f19232e = charSequence;
        this.f19250y = i13;
    }

    public static void c(StringBuilder sb2, int i7, int i10, String str) {
        if ((i7 & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(n nVar) {
        this.f19251z = null;
        this.A = nVar;
        this.f19240n.p(true);
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.f19253b = new g1(this, 7);
            nVar2.f19252a.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override
    public final n b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f19250y & 8) == 0) {
            return false;
        }
        if (this.f19251z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f19240n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f19248w && (this.f19247u || this.v)) {
            drawable = drawable.mutate();
            if (this.f19247u) {
                drawable.setTintList(this.f19245s);
            }
            if (this.v) {
                drawable.setTintMode(this.f19246t);
            }
            this.f19248w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f19250y & 8) != 0) {
            if (this.f19251z == null && (nVar = this.A) != null) {
                this.f19251z = nVar.a(this);
            }
            if (this.f19251z != null) {
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
            return this.f19240n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f19249x |= 32;
        } else {
            this.f19249x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f19251z;
        if (view != null) {
            return view;
        }
        n nVar = this.A;
        if (nVar != null) {
            View a10 = nVar.a(this);
            this.f19251z = a10;
            return a10;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f19237k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f19236j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f19243q;
    }

    @Override
    public final int getGroupId() {
        return this.f19230b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f19238l;
        if (drawable != null) {
            return d(drawable);
        }
        int i7 = this.f19239m;
        if (i7 != 0) {
            Drawable b10 = c8.z.b(this.f19240n.f19205a, i7);
            this.f19239m = 0;
            this.f19238l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f19245s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f19246t;
    }

    @Override
    public final Intent getIntent() {
        return this.f19234g;
    }

    @Override
    public final int getItemId() {
        return this.f19229a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f19235i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f19231c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f19241o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f19232e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f19233f;
        if (charSequence == null) {
            return this.f19232e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f19244r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f19241o != null) {
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
        if ((this.f19249x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f19249x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f19249x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        n nVar = this.A;
        if (nVar != null && nVar.f19252a.overridesItemVisibility()) {
            if ((this.f19249x & 8) == 0 && this.A.f19252a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f19249x & 8) == 0) {
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
        this.f19251z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i7 = this.f19229a) > 0) {
            view.setId(i7);
        }
        k kVar = this.f19240n;
        kVar.f19213k = true;
        kVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f19236j == c10) {
            return this;
        }
        this.f19236j = Character.toLowerCase(c10);
        this.f19240n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i7 = this.f19249x;
        int i10 = (z10 ? 1 : 0) | (i7 & (-2));
        this.f19249x = i10;
        if (i7 != i10) {
            this.f19240n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i7;
        int i10 = this.f19249x;
        int i11 = i10 & 4;
        int i12 = 2;
        k kVar = this.f19240n;
        if (i11 != 0) {
            ArrayList arrayList = kVar.f19209f;
            int size = arrayList.size();
            kVar.w();
            for (int i13 = 0; i13 < size; i13++) {
                m mVar = (m) arrayList.get(i13);
                if (mVar.f19230b == this.f19230b && (mVar.f19249x & 4) != 0 && mVar.isCheckable()) {
                    if (mVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i14 = mVar.f19249x;
                    int i15 = i14 & (-3);
                    if (z11) {
                        i7 = 2;
                    } else {
                        i7 = 0;
                    }
                    int i16 = i7 | i15;
                    mVar.f19249x = i16;
                    if (i14 != i16) {
                        mVar.f19240n.p(false);
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
        this.f19249x = i18;
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
            this.f19249x |= 16;
        } else {
            this.f19249x &= -17;
        }
        this.f19240n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f19239m = 0;
        this.f19238l = drawable;
        this.f19248w = true;
        this.f19240n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f19245s = colorStateList;
        this.f19247u = true;
        this.f19248w = true;
        this.f19240n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f19246t = mode;
        this.v = true;
        this.f19248w = true;
        this.f19240n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f19234g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f19240n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f19242p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f19236j = Character.toLowerCase(c11);
        this.f19240n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i7) {
        int i10 = i7 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f19250y = i7;
        k kVar = this.f19240n;
        kVar.f19213k = true;
        kVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f19232e = charSequence;
        this.f19240n.p(false);
        d0 d0Var = this.f19241o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f19233f = charSequence;
        this.f19240n.p(false);
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
        int i10 = this.f19249x;
        int i11 = i10 & (-9);
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        int i12 = i7 | i11;
        this.f19249x = i12;
        if (i10 != i12) {
            k kVar = this.f19240n;
            kVar.h = true;
            kVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f19232e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f19243q = charSequence;
        this.f19240n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f19244r = charSequence;
        this.f19240n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i7) {
        if (this.f19236j == c10 && this.f19237k == i7) {
            return this;
        }
        this.f19236j = Character.toLowerCase(c10);
        this.f19237k = KeyEvent.normalizeMetaState(i7);
        this.f19240n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i7) {
        if (this.h == c10 && this.f19235i == i7) {
            return this;
        }
        this.h = c10;
        this.f19235i = KeyEvent.normalizeMetaState(i7);
        this.f19240n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i7, int i10) {
        this.h = c10;
        this.f19235i = KeyEvent.normalizeMetaState(i7);
        this.f19236j = Character.toLowerCase(c11);
        this.f19237k = KeyEvent.normalizeMetaState(i10);
        this.f19240n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i7) {
        this.f19238l = null;
        this.f19239m = i7;
        this.f19248w = true;
        this.f19240n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i7) {
        setTitle(this.f19240n.f19205a.getString(i7));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i7) {
        int i10;
        k kVar = this.f19240n;
        Context context = kVar.f19205a;
        View inflate = LayoutInflater.from(context).inflate(i7, (ViewGroup) new LinearLayout(context), false);
        this.f19251z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.f19229a) > 0) {
            inflate.setId(i10);
        }
        kVar.f19213k = true;
        kVar.p(true);
        return this;
    }
}
