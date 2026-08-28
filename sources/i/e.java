package i;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import f7.h8;
public final class e extends f implements j0.b {
    public boolean A;
    public b B;
    public h8 C;
    public int D;
    public int E;
    public boolean F;
    public b f10835y;

    public e(b bVar, Resources resources) {
        this.f10840e = 255;
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
        this.f10837a = bVar;
        int i9 = this.h;
        if (i9 >= 0) {
            Drawable d = bVar.d(i9);
            this.f10839c = d;
            if (d != null) {
                b(d);
            }
        }
        this.d = null;
        this.f10835y = bVar;
        this.B = bVar;
    }

    public final Drawable f() {
        if (!this.A) {
            super.mutate();
            b bVar = this.f10835y;
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
        h8 h8Var = this.C;
        if (h8Var != null) {
            h8Var.d();
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
        h8 h8Var = this.C;
        if (h8Var != null && (visible || z11)) {
            if (z10) {
                h8Var.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }
}
