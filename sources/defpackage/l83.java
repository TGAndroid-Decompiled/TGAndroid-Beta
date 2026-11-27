package defpackage;

import java.io.File;
public final class l83 extends az5 implements ur4 {
    public final byte b;
    public final Object c;

    public l83(Object obj, byte b) {
        super(1);
        this.b = b;
        this.c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                o83 o83Var = (o83) this.c;
                if (th != null) {
                    o83Var.h.H(new sh4(th));
                }
                if (o83Var.j.b != qf5.d) {
                    ((ed4) o83Var.j.getValue()).close();
                }
                return g9c.a;
            default:
                File file = (File) obj;
                file.getClass();
                return new bj7(((xw2) this.c).a, file);
        }
    }
}
