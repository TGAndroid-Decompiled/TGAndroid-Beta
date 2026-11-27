package defpackage;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sla extends s7 {
    public final rla A0;
    public boolean B0;
    public o7 C0;
    public boolean D0;
    public boolean E0;

    public sla(Context context, rla rlaVar, int i, int i2, boolean z, vnb vnbVar) {
        super(context, null, i, i2, z, vnbVar);
        this.D0 = true;
        this.E0 = true;
        this.A0 = rlaVar;
        setDelegate(new ola(rlaVar));
    }

    @Override
    public final void F() {
        o7 o7Var = this.C0;
        if (o7Var != null) {
            o7Var.k(getSearchField());
        }
    }

    @Override
    public final void G(boolean z) {
        this.A0.a.F(z, true);
    }

    @Override
    public final s7 K(o7 o7Var) {
        this.C0 = o7Var;
        return this;
    }

    @Override
    public final s7 M() {
        N();
        return this;
    }

    @Override
    public final s7 N() {
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
        jla jlaVar = this.A0.a;
        if (jlaVar.L) {
            jlaVar.o(z);
            return false;
        }
        return jlaVar.F(z, true);
    }

    public final void X() {
        if (!this.D0) {
            super.setVisibility(8);
        }
    }

    public final void Y(boolean z, boolean z2) {
        boolean z3 = this.D0;
        rla rlaVar = this.A0;
        if (z3 == z) {
            if (!z && !z2 && getVisibility() != 8) {
                super.setVisibility(8);
                rlaVar.f = true;
                rlaVar.requestLayout();
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
            if (!z2 || !isLaidOut() || !rlaVar.isLaidOut()) {
                super.setVisibility(8);
            }
        }
        if (!z2 || !rlaVar.a.A()) {
            rlaVar.f = true;
        }
        rlaVar.requestLayout();
    }

    public rla getParentMenu() {
        return this.A0;
    }

    @Override
    public EditTextBoldCursor getSearchField() {
        return this.A0.a.getSearchField();
    }

    public o7 getSearchListener() {
        return this.C0;
    }

    @Override
    public ula getSubMenuOverlay() {
        return this.A0.a.getMenuOverlay();
    }

    @Override
    public o27 getSubMenuOverlayHost() {
        return this.A0.a;
    }

    @Override
    public final boolean j() {
        rla rlaVar = this.A0;
        if (rlaVar.b && !rlaVar.a.z()) {
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
        rla rlaVar = this.A0;
        if (rlaVar != null && i != 4) {
            boolean z2 = false;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            jla jlaVar = rlaVar.a;
            if (rlaVar.isLaidOut() && jlaVar.A() && (!rlaVar.b || (jlaVar.z() && jlaVar.getActionModeFactor() > 0.0f))) {
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
        return this.A0.a.L;
    }

    @Override
    public final boolean x() {
        return this.A0.a.L;
    }
}
