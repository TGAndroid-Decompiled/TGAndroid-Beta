package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class vba extends r59 {
    public final byte f3;
    public final tca g3;

    public vba(tca tcaVar, Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.f3 = b;
        this.g3 = tcaVar;
    }

    @Override
    public final boolean F0(float f) {
        byte b = this.f3;
        float f2 = 58.0f;
        tca tcaVar = this.g3;
        switch (b) {
            case 0:
                if (tcaVar.c2 && tcaVar.j2[1] != null) {
                    f2 = 111.0f;
                }
                if (f < gm.L(f2) + tcaVar.B2.b) {
                    return false;
                }
                return true;
            default:
                if (tcaVar.c2 && tcaVar.j2[1] != null) {
                    f2 = 111.0f;
                }
                if (f < gm.L(f2) + tcaVar.B2.b) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        byte b = this.f3;
        float f = 58.0f;
        tca tcaVar = this.g3;
        switch (b) {
            case 0:
                r59 r59Var = tcaVar.z1;
                if (r59Var.getVisibility() != 8) {
                    canvas.save();
                    int i = tcaVar.k2;
                    if (tcaVar.c2 && tcaVar.j2[1] != null) {
                        f = 111.0f;
                    }
                    canvas.clipRect(0, gm.L(f) + i, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (r59Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                r59 r59Var2 = tcaVar.z1;
                if (r59Var2.getVisibility() != 8) {
                    canvas.save();
                    int i2 = tcaVar.k2;
                    if (tcaVar.c2 && tcaVar.j2[1] != null) {
                        f = 111.0f;
                    }
                    canvas.clipRect(0, gm.L(f) + i2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (r59Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
