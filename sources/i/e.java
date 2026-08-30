package i;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import j7.x7;
public final class e extends g implements j0.b {
    public boolean B;
    public b C;
    public x7 D;
    public int E;
    public int F;
    public boolean G;
    public b f7200y;

    public e(b bVar, Resources resources) {
        this.e = 255;
        this.h = -1;
        this.E = -1;
        this.F = -1;
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
        this.f7204a = bVar;
        int i10 = this.h;
        if (i10 >= 0) {
            Drawable d = bVar.d(i10);
            this.f7206c = d;
            if (d != null) {
                b(d);
            }
        }
        this.d = null;
        this.f7200y = bVar;
        this.C = bVar;
    }

    public final Drawable f() {
        if (!this.B) {
            super.mutate();
            b bVar = this.f7200y;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.B = true;
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
        x7 x7Var = this.D;
        if (x7Var != null) {
            x7Var.d();
            this.D = null;
            c(this.E);
            this.E = -1;
            this.F = -1;
        }
    }

    @Override
    public final Drawable mutate() {
        if (!this.G) {
            f();
            b bVar = this.C;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.G = true;
        }
        return this;
    }

    @Override
    public final boolean onStateChange(int[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: i.e.onStateChange(int[]):boolean");
    }

    @Override
    public final boolean setVisible(boolean z4, boolean z10) {
        boolean visible = super.setVisible(z4, z10);
        x7 x7Var = this.D;
        if (x7Var != null && (visible || z10)) {
            if (z4) {
                x7Var.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }
}
