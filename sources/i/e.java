package i;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import v7.f8;
public final class e extends f implements j0.b {
    public boolean E;
    public b F;
    public f8 G;
    public int H;
    public int I;
    public boolean J;
    public b f11437y;

    public e(b bVar, Resources resources) {
        this.f11442e = 255;
        this.h = -1;
        this.H = -1;
        this.I = -1;
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
        this.f11439a = bVar;
        int i10 = this.h;
        if (i10 >= 0) {
            Drawable d = bVar.d(i10);
            this.f11441c = d;
            if (d != null) {
                b(d);
            }
        }
        this.d = null;
        this.f11437y = bVar;
        this.F = bVar;
    }

    public final Drawable f() {
        if (!this.E) {
            super.mutate();
            b bVar = this.f11437y;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.E = true;
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
        f8 f8Var = this.G;
        if (f8Var != null) {
            f8Var.d();
            this.G = null;
            c(this.H);
            this.H = -1;
            this.I = -1;
        }
    }

    @Override
    public final Drawable mutate() {
        if (!this.J) {
            f();
            b bVar = this.F;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.J = true;
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
        f8 f8Var = this.G;
        if (f8Var != null && (visible || z11)) {
            if (z10) {
                f8Var.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }
}
