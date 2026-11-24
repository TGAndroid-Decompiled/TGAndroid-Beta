package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class v9a extends o39 {
    public final byte f3;
    public final taa g3;

    public v9a(taa taaVar, Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
        this.f3 = b;
        this.g3 = taaVar;
    }

    @Override
    public final boolean F0(float f) {
        byte b = this.f3;
        float f2 = 58.0f;
        taa taaVar = this.g3;
        switch (b) {
            case 0:
                if (taaVar.c2 && taaVar.j2[1] != null) {
                    f2 = 111.0f;
                }
                if (f < gl.L(f2) + taaVar.B2.b) {
                    return false;
                }
                return true;
            default:
                if (taaVar.c2 && taaVar.j2[1] != null) {
                    f2 = 111.0f;
                }
                if (f < gl.L(f2) + taaVar.B2.b) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        byte b = this.f3;
        float f = 58.0f;
        taa taaVar = this.g3;
        switch (b) {
            case 0:
                o39 o39Var = taaVar.z1;
                if (o39Var.getVisibility() != 8) {
                    canvas.save();
                    int i = taaVar.k2;
                    if (taaVar.c2 && taaVar.j2[1] != null) {
                        f = 111.0f;
                    }
                    canvas.clipRect(0, gl.L(f) + i, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (o39Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                o39 o39Var2 = taaVar.z1;
                if (o39Var2.getVisibility() != 8) {
                    canvas.save();
                    int i2 = taaVar.k2;
                    if (taaVar.c2 && taaVar.j2[1] != null) {
                        f = 111.0f;
                    }
                    canvas.clipRect(0, gl.L(f) + i2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (o39Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
