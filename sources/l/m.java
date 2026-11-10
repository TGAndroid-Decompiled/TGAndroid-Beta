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
public final class m implements l0.a {
    public n A;
    public MenuItem.OnActionExpandListener B;
    public final int f17698a;
    public final int f17699b;
    public final int f17700c;
    public final int d;
    public CharSequence f17701e;
    public CharSequence f17702f;
    public Intent f17703g;
    public char h;
    public char f17705j;
    public Drawable f17707l;
    public final k f17709n;
    public d0 f17710o;
    public MenuItem.OnMenuItemClickListener f17711p;
    public CharSequence f17712q;
    public CharSequence f17713r;
    public int f17719y;
    public View f17720z;
    public int f17704i = 4096;
    public int f17706k = 4096;
    public int f17708m = 0;
    public ColorStateList f17714s = null;
    public PorterDuff.Mode f17715t = null;
    public boolean f17716u = false;
    public boolean v = false;
    public boolean f17717w = false;
    public int f17718x = 16;
    public boolean C = false;

    public m(k kVar, int i7, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f17709n = kVar;
        this.f17698a = i10;
        this.f17699b = i7;
        this.f17700c = i11;
        this.d = i12;
        this.f17701e = charSequence;
        this.f17719y = i13;
    }

    public static void c(StringBuilder sb2, int i7, int i10, String str) {
        if ((i7 & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(n nVar) {
        this.f17720z = null;
        this.A = nVar;
        this.f17709n.p(true);
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.f17722b = new g6.d0(this, 10);
            nVar2.f17721a.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override
    public final n b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f17719y & 8) == 0) {
            return false;
        }
        if (this.f17720z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f17709n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f17717w && (this.f17716u || this.v)) {
            drawable = drawable.mutate();
            if (this.f17716u) {
                drawable.setTintList(this.f17714s);
            }
            if (this.v) {
                drawable.setTintMode(this.f17715t);
            }
            this.f17717w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f17719y & 8) != 0) {
            if (this.f17720z == null && (nVar = this.A) != null) {
                this.f17720z = nVar.a(this);
            }
            if (this.f17720z != null) {
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
            return this.f17709n.f(this);
        }
        return false;
    }

    public final void f(boolean z9) {
        if (z9) {
            this.f17718x |= 32;
        } else {
            this.f17718x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f17720z;
        if (view != null) {
            return view;
        }
        n nVar = this.A;
        if (nVar != null) {
            View a10 = nVar.a(this);
            this.f17720z = a10;
            return a10;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f17706k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f17705j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f17712q;
    }

    @Override
    public final int getGroupId() {
        return this.f17699b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f17707l;
        if (drawable != null) {
            return d(drawable);
        }
        int i7 = this.f17708m;
        if (i7 != 0) {
            Drawable b10 = b5.a.b(this.f17709n.f17674a, i7);
            this.f17708m = 0;
            this.f17707l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f17714s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f17715t;
    }

    @Override
    public final Intent getIntent() {
        return this.f17703g;
    }

    @Override
    public final int getItemId() {
        return this.f17698a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f17704i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f17700c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f17710o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f17701e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f17702f;
        if (charSequence == null) {
            return this.f17701e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f17713r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f17710o != null) {
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
        if ((this.f17718x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f17718x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f17718x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        n nVar = this.A;
        if (nVar != null && nVar.f17721a.overridesItemVisibility()) {
            if ((this.f17718x & 8) == 0 && this.A.f17721a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f17718x & 8) == 0) {
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
        this.f17720z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i7 = this.f17698a) > 0) {
            view.setId(i7);
        }
        k kVar = this.f17709n;
        kVar.f17682k = true;
        kVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f17705j == c10) {
            return this;
        }
        this.f17705j = Character.toLowerCase(c10);
        this.f17709n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z9) {
        int i7 = this.f17718x;
        int i10 = (z9 ? 1 : 0) | (i7 & (-2));
        this.f17718x = i10;
        if (i7 != i10) {
            this.f17709n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z9) {
        boolean z10;
        int i7;
        int i10 = this.f17718x;
        int i11 = i10 & 4;
        int i12 = 2;
        k kVar = this.f17709n;
        if (i11 != 0) {
            ArrayList arrayList = kVar.f17678f;
            int size = arrayList.size();
            kVar.w();
            for (int i13 = 0; i13 < size; i13++) {
                m mVar = (m) arrayList.get(i13);
                if (mVar.f17699b == this.f17699b && (mVar.f17718x & 4) != 0 && mVar.isCheckable()) {
                    if (mVar == this) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i14 = mVar.f17718x;
                    int i15 = i14 & (-3);
                    if (z10) {
                        i7 = 2;
                    } else {
                        i7 = 0;
                    }
                    int i16 = i7 | i15;
                    mVar.f17718x = i16;
                    if (i14 != i16) {
                        mVar.f17709n.p(false);
                    }
                }
            }
            kVar.v();
            return this;
        }
        int i17 = i10 & (-3);
        if (!z9) {
            i12 = 0;
        }
        int i18 = i17 | i12;
        this.f17718x = i18;
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
    public final MenuItem setEnabled(boolean z9) {
        if (z9) {
            this.f17718x |= 16;
        } else {
            this.f17718x &= -17;
        }
        this.f17709n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f17708m = 0;
        this.f17707l = drawable;
        this.f17717w = true;
        this.f17709n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f17714s = colorStateList;
        this.f17716u = true;
        this.f17717w = true;
        this.f17709n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f17715t = mode;
        this.v = true;
        this.f17717w = true;
        this.f17709n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f17703g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f17709n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f17711p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f17705j = Character.toLowerCase(c11);
        this.f17709n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i7) {
        int i10 = i7 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f17719y = i7;
        k kVar = this.f17709n;
        kVar.f17682k = true;
        kVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f17701e = charSequence;
        this.f17709n.p(false);
        d0 d0Var = this.f17710o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f17702f = charSequence;
        this.f17709n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z9) {
        int i7;
        int i10 = this.f17718x;
        int i11 = i10 & (-9);
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        int i12 = i7 | i11;
        this.f17718x = i12;
        if (i10 != i12) {
            k kVar = this.f17709n;
            kVar.h = true;
            kVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f17701e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f17712q = charSequence;
        this.f17709n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f17713r = charSequence;
        this.f17709n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i7) {
        if (this.f17705j == c10 && this.f17706k == i7) {
            return this;
        }
        this.f17705j = Character.toLowerCase(c10);
        this.f17706k = KeyEvent.normalizeMetaState(i7);
        this.f17709n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i7) {
        if (this.h == c10 && this.f17704i == i7) {
            return this;
        }
        this.h = c10;
        this.f17704i = KeyEvent.normalizeMetaState(i7);
        this.f17709n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i7, int i10) {
        this.h = c10;
        this.f17704i = KeyEvent.normalizeMetaState(i7);
        this.f17705j = Character.toLowerCase(c11);
        this.f17706k = KeyEvent.normalizeMetaState(i10);
        this.f17709n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i7) {
        this.f17707l = null;
        this.f17708m = i7;
        this.f17717w = true;
        this.f17709n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i7) {
        setTitle(this.f17709n.f17674a.getString(i7));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i7) {
        int i10;
        k kVar = this.f17709n;
        Context context = kVar.f17674a;
        View inflate = LayoutInflater.from(context).inflate(i7, (ViewGroup) new LinearLayout(context), false);
        this.f17720z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.f17698a) > 0) {
            inflate.setId(i10);
        }
        kVar.f17682k = true;
        kVar.p(true);
        return this;
    }
}
