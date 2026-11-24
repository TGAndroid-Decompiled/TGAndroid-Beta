package defpackage;

import java.io.File;
public final class e93 extends vy5 implements rr4 {
    public final byte b;
    public final Object c;

    public e93(Object obj, byte b) {
        super(1);
        this.b = b;
        this.c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                h93 h93Var = (h93) this.c;
                if (th != null) {
                    h93Var.h.F(new vh4(th));
                }
                if (h93Var.j.b != nf5.d) {
                    ((hd4) h93Var.j.getValue()).close();
                }
                return g7c.a;
            default:
                File file = (File) obj;
                file.getClass();
                return new ui7(((nx2) this.c).a, file);
        }
    }
}
