package defpackage;

import org.telegram.ui.o;
import org.telegram.ui.web.HttpGetFileTask;
public final class ku implements Runnable {
    public final byte a;
    public final float b;
    public final Object c;

    public ku(Object obj, float f, byte b) {
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
                k21 k21Var = (k21) obj;
                if (k21Var.a.getTranslationX() == f) {
                    k21Var.E.b();
                    return;
                }
                return;
            case 2:
                HttpGetFileTask.b((HttpGetFileTask) obj, f);
                return;
            case 3:
                rm8 rm8Var = (rm8) obj;
                int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                cic cicVar = rm8Var.c;
                int i2 = cicVar.x;
                if (i > 0) {
                    if (i2 < 2) {
                        cicVar.c(i2 + 1, true);
                    }
                } else if (i2 > 0) {
                    cicVar.c(i2 - 1, true);
                }
                rm8Var.b = false;
                return;
            case 4:
                pp9 pp9Var = ((ep9) obj).a;
                if (pp9Var.t0 != f) {
                    pp9Var.t0 = f;
                    pp9Var.r();
                    pp9Var.f.requestLayout();
                    return;
                }
                return;
            default:
                bq9 bq9Var = (bq9) obj;
                bq9Var.i = f;
                h74 h74Var = bq9Var.f;
                if (h74Var != null) {
                    h74Var.R(f);
                    return;
                }
                return;
        }
    }
}
