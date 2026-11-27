package defpackage;

import org.telegram.ui.o;
import org.telegram.ui.web.HttpGetFileTask;
public final class jt implements Runnable {
    public final byte a;
    public final float b;
    public final Object c;

    public jt(Object obj, float f, byte b) {
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
                l11 l11Var = (l11) obj;
                if (l11Var.a.getTranslationX() == f) {
                    l11Var.E.b();
                    return;
                }
                return;
            case 2:
                HttpGetFileTask.a((HttpGetFileTask) obj, f);
                return;
            case 3:
                co8 co8Var = (co8) obj;
                int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                gkc gkcVar = co8Var.c;
                int i2 = gkcVar.x;
                if (i > 0) {
                    if (i2 < 2) {
                        gkcVar.c(i2 + 1, true);
                    }
                } else if (i2 > 0) {
                    gkcVar.c(i2 - 1, true);
                }
                co8Var.b = false;
                return;
            case 4:
                er9 er9Var = ((tq9) obj).a;
                if (er9Var.t0 != f) {
                    er9Var.t0 = f;
                    er9Var.r();
                    er9Var.f.requestLayout();
                    return;
                }
                return;
            default:
                rr9 rr9Var = (rr9) obj;
                rr9Var.i = f;
                s64 s64Var = rr9Var.f;
                if (s64Var != null) {
                    s64Var.R(f);
                    return;
                }
                return;
        }
    }
}
