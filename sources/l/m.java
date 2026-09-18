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
    public final int f13769a;
    public final int f13770b;
    public final int f13771c;
    public final int d;
    public CharSequence e;
    public CharSequence f13772f;
    public Intent f13773g;
    public char h;
    public char f13775j;
    public Drawable f13777l;
    public final k f13779n;
    public d0 f13780o;
    public MenuItem.OnMenuItemClickListener f13781p;
    public CharSequence f13782q;
    public CharSequence f13783r;
    public int f13789y;
    public View f13790z;
    public int f13774i = 4096;
    public int f13776k = 4096;
    public int f13778m = 0;
    public ColorStateList f13784s = null;
    public PorterDuff.Mode f13785t = null;
    public boolean f13786u = false;
    public boolean v = false;
    public boolean f13787w = false;
    public int f13788x = 16;
    public boolean C = false;

    public m(k kVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f13779n = kVar;
        this.f13769a = i11;
        this.f13770b = i10;
        this.f13771c = i12;
        this.d = i13;
        this.e = charSequence;
        this.f13789y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override
    public final l0.a a(n nVar) {
        this.f13790z = null;
        this.A = nVar;
        this.f13779n.p(true);
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.f13792b = new k2.c0(this, 1);
            nVar2.f13791a.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override
    public final n b() {
        return this.A;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f13789y & 8) == 0) {
            return false;
        }
        if (this.f13790z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f13779n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f13787w && (this.f13786u || this.v)) {
            drawable = r8.d(drawable).mutate();
            if (this.f13786u) {
                drawable.setTintList(this.f13784s);
            }
            if (this.v) {
                drawable.setTintMode(this.f13785t);
            }
            this.f13787w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f13789y & 8) != 0) {
            if (this.f13790z == null && (nVar = this.A) != null) {
                this.f13790z = nVar.a(this);
            }
            if (this.f13790z != null) {
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
            return this.f13779n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f13788x |= 32;
        } else {
            this.f13788x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f13790z;
        if (view != null) {
            return view;
        }
        n nVar = this.A;
        if (nVar != null) {
            View a2 = nVar.a(this);
            this.f13790z = a2;
            return a2;
        }
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f13776k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f13775j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f13782q;
    }

    @Override
    public final int getGroupId() {
        return this.f13770b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f13777l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f13778m;
        if (i10 != 0) {
            Drawable b10 = v7.b(this.f13779n.f13746a, i10);
            this.f13778m = 0;
            this.f13777l = b10;
            return d(b10);
        }
        return null;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f13784s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f13785t;
    }

    @Override
    public final Intent getIntent() {
        return this.f13773g;
    }

    @Override
    public final int getItemId() {
        return this.f13769a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f13774i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override
    public final int getOrder() {
        return this.f13771c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f13780o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13772f;
        if (charSequence == null) {
            return this.e;
        }
        return charSequence;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f13783r;
    }

    @Override
    public final boolean hasSubMenu() {
        if (this.f13780o != null) {
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
        if ((this.f13788x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isChecked() {
        if ((this.f13788x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled() {
        if ((this.f13788x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isVisible() {
        n nVar = this.A;
        if (nVar != null && nVar.f13791a.overridesItemVisibility()) {
            if ((this.f13788x & 8) == 0 && this.A.f13791a.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.f13788x & 8) == 0) {
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
        this.f13790z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f13769a) > 0) {
            view.setId(i10);
        }
        k kVar = this.f13779n;
        kVar.f13753k = true;
        kVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f13775j == c10) {
            return this;
        }
        this.f13775j = Character.toLowerCase(c10);
        this.f13779n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f13788x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f13788x = i11;
        if (i10 != i11) {
            this.f13779n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f13788x;
        int i12 = i11 & 4;
        int i13 = 2;
        k kVar = this.f13779n;
        if (i12 != 0) {
            ArrayList arrayList = kVar.f13749f;
            int size = arrayList.size();
            kVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                m mVar = (m) arrayList.get(i14);
                if (mVar.f13770b == this.f13770b && (mVar.f13788x & 4) != 0 && mVar.isCheckable()) {
                    if (mVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i15 = mVar.f13788x;
                    int i16 = i15 & (-3);
                    if (z11) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i17 = i10 | i16;
                    mVar.f13788x = i17;
                    if (i15 != i17) {
                        mVar.f13779n.p(false);
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
        this.f13788x = i19;
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
            this.f13788x |= 16;
        } else {
            this.f13788x &= -17;
        }
        this.f13779n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f13778m = 0;
        this.f13777l = drawable;
        this.f13787w = true;
        this.f13779n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13784s = colorStateList;
        this.f13786u = true;
        this.f13787w = true;
        this.f13779n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13785t = mode;
        this.v = true;
        this.f13787w = true;
        this.f13779n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f13773g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.h == c10) {
            return this;
        }
        this.h = c10;
        this.f13779n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13781p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.h = c10;
        this.f13775j = Character.toLowerCase(c11);
        this.f13779n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f13789y = i10;
        k kVar = this.f13779n;
        kVar.f13753k = true;
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
        this.f13779n.p(false);
        d0 d0Var = this.f13780o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13772f = charSequence;
        this.f13779n.p(false);
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
        int i11 = this.f13788x;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f13788x = i13;
        if (i11 != i13) {
            k kVar = this.f13779n;
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
        this.f13782q = charSequence;
        this.f13779n.p(false);
        return this;
    }

    @Override
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.f13783r = charSequence;
        this.f13779n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f13775j == c10 && this.f13776k == i10) {
            return this;
        }
        this.f13775j = Character.toLowerCase(c10);
        this.f13776k = KeyEvent.normalizeMetaState(i10);
        this.f13779n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.h == c10 && this.f13774i == i10) {
            return this;
        }
        this.h = c10;
        this.f13774i = KeyEvent.normalizeMetaState(i10);
        this.f13779n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.h = c10;
        this.f13774i = KeyEvent.normalizeMetaState(i10);
        this.f13775j = Character.toLowerCase(c11);
        this.f13776k = KeyEvent.normalizeMetaState(i11);
        this.f13779n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f13777l = null;
        this.f13778m = i10;
        this.f13787w = true;
        this.f13779n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f13779n.f13746a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        k kVar = this.f13779n;
        Context context = kVar.f13746a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f13790z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f13769a) > 0) {
            inflate.setId(i11);
        }
        kVar.f13753k = true;
        kVar.p(true);
        return this;
    }
}
