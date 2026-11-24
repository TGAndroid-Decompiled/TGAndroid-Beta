package defpackage;

import org.telegram.ui.o;
import org.telegram.ui.web.HttpGetFileTask;
public final class kt implements Runnable {
    public final byte a;
    public final float b;
    public final Object c;

    public kt(Object obj, float f, byte b) {
        this.a = b;
        this.c = obj;
        this.b = f;
    }

    @Override
    public final void run() {
        byte b = this.a;
        float f = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((o) obj).i0.N.c(true, f);
                return;
            case 1:
                c11 c11Var = (c11) obj;
                if (c11Var.a.getTranslationX() == f) {
                    c11Var.E.b();
                    return;
                }
                return;
            case 2:
                HttpGetFileTask.b((HttpGetFileTask) obj, f);
                return;
            case 3:
                pk8 pk8Var = (pk8) obj;
                int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                bgc bgcVar = pk8Var.c;
                int i2 = bgcVar.x;
                if (i > 0) {
                    if (i2 < 2) {
                        bgcVar.c(i2 + 1, true);
                    }
                } else if (i2 > 0) {
                    bgcVar.c(i2 - 1, true);
                }
                pk8Var.b = false;
                return;
            case 4:
                on9 on9Var = ((dn9) obj).a;
                if (on9Var.t0 != f) {
                    on9Var.t0 = f;
                    on9Var.r();
                    on9Var.f.requestLayout();
                    return;
                }
                return;
            default:
                ao9 ao9Var = (ao9) obj;
                ao9Var.i = f;
                y54 y54Var = ao9Var.f;
                if (y54Var != null) {
                    y54Var.R(f);
                    return;
                }
                return;
        }
    }
}
