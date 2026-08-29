package i;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import h7.b8;
public final class e extends f implements j0.b {
    public boolean A;
    public b B;
    public b8 C;
    public int D;
    public int E;
    public boolean F;
    public b f8173y;

    public e(b bVar, Resources resources) {
        this.f8178e = 255;
        this.h = -1;
        this.D = -1;
        this.E = -1;
        d(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static i.e e(android.content.Context r24, android.content.res.Resources r25, android.content.res.XmlResourceParser r26, android.util.AttributeSet r27, android.content.res.Resources.Theme r28) {
        throw new UnsupportedOperationException("Method not decompiled: i.e.e(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):i.e");
    }

    @Override
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override
    public final void d(b bVar) {
        this.f8175a = bVar;
        int i10 = this.h;
        if (i10 >= 0) {
            Drawable d = bVar.d(i10);
            this.f8177c = d;
            if (d != null) {
                b(d);
            }
        }
        this.d = null;
        this.f8173y = bVar;
        this.B = bVar;
    }

    public final Drawable f() {
        if (!this.A) {
            super.mutate();
            b bVar = this.f8173y;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.A = true;
        }
        return this;
    }

    @Override
    public final boolean isStateful() {
        return true;
    }

    @Override
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        b8 b8Var = this.C;
        if (b8Var != null) {
            b8Var.d();
            this.C = null;
            c(this.D);
            this.D = -1;
            this.E = -1;
        }
    }

    @Override
    public final Drawable mutate() {
        if (!this.F) {
            f();
            b bVar = this.B;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.F = true;
        }
        return this;
    }

    @Override
    public final boolean onStateChange(int[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: i.e.onStateChange(int[]):boolean");
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        b8 b8Var = this.C;
        if (b8Var != null && (visible || z11)) {
            if (z10) {
                b8Var.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }
}
