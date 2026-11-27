package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class mda extends d79 {
    public final byte f3;
    public final kea g3;

    public mda(kea keaVar, Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.f3 = b;
        this.g3 = keaVar;
    }

    @Override
    public final boolean G0(float f) {
        byte b = this.f3;
        float f2 = 58.0f;
        kea keaVar = this.g3;
        switch (b) {
            case 0:
                if (keaVar.c2 && keaVar.j2[1] != null) {
                    f2 = 111.0f;
                }
                if (f < hl.L(f2) + keaVar.B2.b) {
                    return false;
                }
                return true;
            default:
                if (keaVar.c2 && keaVar.j2[1] != null) {
                    f2 = 111.0f;
                }
                if (f < hl.L(f2) + keaVar.B2.b) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        byte b = this.f3;
        float f = 58.0f;
        kea keaVar = this.g3;
        switch (b) {
            case 0:
                d79 d79Var = keaVar.z1;
                if (d79Var.getVisibility() != 8) {
                    canvas.save();
                    int i = keaVar.k2;
                    if (keaVar.c2 && keaVar.j2[1] != null) {
                        f = 111.0f;
                    }
                    canvas.clipRect(0, hl.L(f) + i, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (d79Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                d79 d79Var2 = keaVar.z1;
                if (d79Var2.getVisibility() != 8) {
                    canvas.save();
                    int i2 = keaVar.k2;
                    if (keaVar.c2 && keaVar.j2[1] != null) {
                        f = 111.0f;
                    }
                    canvas.clipRect(0, hl.L(f) + i2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (d79Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
