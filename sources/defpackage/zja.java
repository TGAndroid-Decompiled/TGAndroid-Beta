package defpackage;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zja extends r7 {
    public final yja A0;
    public boolean B0;
    public n7 C0;
    public boolean D0;
    public boolean E0;

    public zja(Context context, yja yjaVar, int i, int i2, boolean z, ylb ylbVar) {
        super(context, null, i, i2, z, ylbVar);
        this.D0 = true;
        this.E0 = true;
        this.A0 = yjaVar;
        setDelegate(new vja(yjaVar));
    }

    @Override
    public final void F() {
        n7 n7Var = this.C0;
        if (n7Var != null) {
            n7Var.k(getSearchField());
        }
    }

    @Override
    public final void G(boolean z) {
        this.A0.a.C(z, true);
    }

    @Override
    public final r7 K(n7 n7Var) {
        this.C0 = n7Var;
        return this;
    }

    @Override
    public final r7 M() {
        N();
        return this;
    }

    @Override
    public final r7 N() {
        this.B0 = true;
        this.A0.a.setSearchItem(this);
        return this;
    }

    @Override
    public final void P(CharSequence charSequence, boolean z) {
        this.A0.a.setSearchFieldText(charSequence);
    }

    @Override
    public final boolean T(boolean z) {
        rja rjaVar = this.A0.a;
        if (rjaVar.G) {
            rjaVar.o(z);
            return false;
        }
        return rjaVar.C(z, true);
    }

    public final void X() {
        if (!this.D0) {
            super.setVisibility(8);
        }
    }

    public final void Y(boolean z, boolean z2) {
        boolean z3 = this.D0;
        yja yjaVar = this.A0;
        if (z3 == z) {
            if (!z && !z2 && getVisibility() != 8) {
                super.setVisibility(8);
                yjaVar.f = true;
                yjaVar.requestLayout();
                return;
            } else if (z && getVisibility() != 0) {
                super.setVisibility(0);
                return;
            } else {
                return;
            }
        }
        this.D0 = z;
        if (z) {
            setEnabled(this.E0);
            super.setVisibility(0);
        } else {
            this.E0 = isEnabled();
            setEnabled(false);
            if (!z2 || !isLaidOut() || !yjaVar.isLaidOut()) {
                super.setVisibility(8);
            }
        }
        if (!z2 || !yjaVar.a.y()) {
            yjaVar.f = true;
        }
        yjaVar.requestLayout();
    }

    public yja getParentMenu() {
        return this.A0;
    }

    @Override
    public EditTextBoldCursor getSearchField() {
        return this.A0.a.getSearchField();
    }

    public n7 getSearchListener() {
        return this.C0;
    }

    @Override
    public bka getSubMenuOverlay() {
        return this.A0.a.getMenuOverlay();
    }

    @Override
    public h27 getSubMenuOverlayHost() {
        return this.A0.a;
    }

    @Override
    public final boolean j() {
        yja yjaVar = this.A0;
        if (yjaVar.b && !yjaVar.a.x()) {
            return false;
        }
        return true;
    }

    @Override
    public final void o() {
        this.A0.a.setSearchFieldText("");
    }

    @Override
    public void setSearchFieldCaption(CharSequence charSequence) {
        this.A0.a.setSearchFieldCaption(charSequence);
    }

    @Override
    public void setSearchFieldHint(CharSequence charSequence) {
        this.A0.a.setSearchFieldHint(charSequence);
        setContentDescription(charSequence);
    }

    @Override
    public void setVisibility(int i) {
        boolean z;
        yja yjaVar = this.A0;
        if (yjaVar != null && i != 4) {
            boolean z2 = false;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            rja rjaVar = yjaVar.a;
            if (yjaVar.isLaidOut() && rjaVar.y() && (!yjaVar.b || (rjaVar.x() && rjaVar.getActionModeFactor() > 0.0f))) {
                z2 = true;
            }
            Y(z, z2);
            return;
        }
        super.setVisibility(i);
    }

    @Override
    public final boolean v() {
        return this.B0;
    }

    @Override
    public final boolean w() {
        return this.A0.a.G;
    }

    @Override
    public final boolean x() {
        return this.A0.a.G;
    }
}
