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
import b8.oc;
import java.util.ArrayList;
public final class m implements l0.a {
    public n A;
    public MenuItem.OnActionExpandListener B;
    public final int f17441a;
    public final int f17442b;
    public final int f17443c;
    public final int d;
    public CharSequence f17444e;
    public CharSequence f17445f;
    public Intent f17446g;
    public char h;
    public char f17448j;
    public Drawable f17450l;
    public final k f17452n;
    public d0 f17453o;
    public MenuItem.OnMenuItemClickListener f17454p;
    public CharSequence f17455q;
    public CharSequence f17456r;
    public int f17462y;
    public View f17463z;
    public int f17447i = 4096;
    public int f17449k = 4096;
    public int f17451m = 0;
    public ColorStateList f17457s = null;
    public PorterDuff.Mode f17458t = null;
    public boolean f17459u = false;
    public boolean v = false;
    public boolean f17460w = false;
    public int f17461x = 16;
    public boolean C = false;

    public m(k kVar, int i3, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f17452n = kVar;
        this.f17441a = i10;
        this.f17442b = i3;
        this.f17443c = i11;
        this.d = i12;
        this.f17444e = charSequence;
        this.f17462y = i13;
    }

    public static void c(StringBuilder sb2, int i3, int i10, String str) {
        if ((i3 & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(n nVar) {
        this.f17463z = null;
        this.A = nVar;
        this.f17452n.p(true);
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.f17465b = new hi.d(this, 6);
            nVar2.f17464a.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override
    public final n b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f17462y & 8) == 0) {
            return false;
        }
        if (this.f17463z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f17452n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f17460w && (this.f17459u || this.v)) {
            drawable = drawable.mutate();
            if (this.f17459u) {
                drawable.setTintList(this.f17457s);
            }
            if (this.v) {
                drawable.setTintMode(this.f17458t);
            }
            this.f17460w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f17462y & 8) != 0) {
            if (this.f17463z == null && (nVar = this.A) != null) {
                this.f17463z = nVar.a(this);
            }
            if (this.f17463z != null) {
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
            return this.f17452n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f17461x |= 32;
        } else {
            this.f17461x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f17463z;
        if (view != null) {
            return view;
        }
        n nVar = this.A;
        if (nVar != null) {
            View a10 = nVar.a(this);
            this.f17463z = a10;
            return a10;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f17449k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f17448j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f17455q;
    }

    @Override
    public final int getGroupId() {
        return this.f17442b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f17450l;
        if (drawable != null) {
            return d(drawable);
        }
        int i3 = this.f17451m;
        if (i3 != 0) {
            Drawable b10 = oc.b(this.f17452n.f17417a, i3);
            this.f17451m = 0;
            this.f17450l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f17457s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f17458t;
    }

    @Override
    public final Intent getIntent() {
        return this.f17446g;
    }

    @Override
    public final int getItemId() {
        return this.f17441a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f17447i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f17443c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f17453o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f17444e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f17445f;
        if (charSequence == null) {
            return this.f17444e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f17456r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f17453o != null) {
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
        if ((this.f17461x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f17461x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f17461x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        n nVar = this.A;
        if (nVar != null && nVar.f17464a.overridesItemVisibility()) {
            if ((this.f17461x & 8) == 0 && this.A.f17464a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f17461x & 8) == 0) {
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
        int i3;
        this.f17463z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i3 = this.f17441a) > 0) {
            view.setId(i3);
        }
        k kVar = this.f17452n;
        kVar.f17425k = true;
        kVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f17448j == c2) {
            return this;
        }
        this.f17448j = Character.toLowerCase(c2);
        this.f17452n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i3 = this.f17461x;
        int i10 = (z10 ? 1 : 0) | (i3 & (-2));
        this.f17461x = i10;
        if (i3 != i10) {
            this.f17452n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i3;
        int i10 = this.f17461x;
        int i11 = i10 & 4;
        int i12 = 2;
        k kVar = this.f17452n;
        if (i11 != 0) {
            ArrayList arrayList = kVar.f17421f;
            int size = arrayList.size();
            kVar.w();
            for (int i13 = 0; i13 < size; i13++) {
                m mVar = (m) arrayList.get(i13);
                if (mVar.f17442b == this.f17442b && (mVar.f17461x & 4) != 0 && mVar.isCheckable()) {
                    if (mVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i14 = mVar.f17461x;
                    int i15 = i14 & (-3);
                    if (z11) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i16 = i3 | i15;
                    mVar.f17461x = i16;
                    if (i14 != i16) {
                        mVar.f17452n.p(false);
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
        this.f17461x = i18;
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
            this.f17461x |= 16;
        } else {
            this.f17461x &= -17;
        }
        this.f17452n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f17451m = 0;
        this.f17450l = drawable;
        this.f17460w = true;
        this.f17452n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f17457s = colorStateList;
        this.f17459u = true;
        this.f17460w = true;
        this.f17452n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f17458t = mode;
        this.v = true;
        this.f17460w = true;
        this.f17452n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f17446g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f17452n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f17454p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c2, char c10) {
        this.h = c2;
        this.f17448j = Character.toLowerCase(c10);
        this.f17452n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i3) {
        int i10 = i3 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f17462y = i3;
        k kVar = this.f17452n;
        kVar.f17425k = true;
        kVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f17444e = charSequence;
        this.f17452n.p(false);
        d0 d0Var = this.f17453o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f17445f = charSequence;
        this.f17452n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        int i3;
        int i10 = this.f17461x;
        int i11 = i10 & (-9);
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        int i12 = i3 | i11;
        this.f17461x = i12;
        if (i10 != i12) {
            k kVar = this.f17452n;
            kVar.h = true;
            kVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f17444e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.f17455q = charSequence;
        this.f17452n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f17456r = charSequence;
        this.f17452n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c2, int i3) {
        if (this.f17448j == c2 && this.f17449k == i3) {
            return this;
        }
        this.f17448j = Character.toLowerCase(c2);
        this.f17449k = KeyEvent.normalizeMetaState(i3);
        this.f17452n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c2, int i3) {
        if (this.h == c2 && this.f17447i == i3) {
            return this;
        }
        this.h = c2;
        this.f17447i = KeyEvent.normalizeMetaState(i3);
        this.f17452n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c2, char c10, int i3, int i10) {
        this.h = c2;
        this.f17447i = KeyEvent.normalizeMetaState(i3);
        this.f17448j = Character.toLowerCase(c10);
        this.f17449k = KeyEvent.normalizeMetaState(i10);
        this.f17452n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i3) {
        this.f17450l = null;
        this.f17451m = i3;
        this.f17460w = true;
        this.f17452n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i3) {
        setTitle(this.f17452n.f17417a.getString(i3));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i3) {
        int i10;
        k kVar = this.f17452n;
        Context context = kVar.f17417a;
        View inflate = LayoutInflater.from(context).inflate(i3, (ViewGroup) new LinearLayout(context), false);
        this.f17463z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.f17441a) > 0) {
            inflate.setId(i10);
        }
        kVar.f17425k = true;
        kVar.p(true);
        return this;
    }
}
