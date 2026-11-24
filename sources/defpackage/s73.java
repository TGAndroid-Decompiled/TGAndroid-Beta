package defpackage;

import java.io.File;
public final class s73 extends vw5 implements qp4 {
    public final byte b;
    public final Object c;

    public s73(Object obj, byte b) {
        super(1);
        this.b = b;
        this.c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                v73 v73Var = (v73) this.c;
                if (th != null) {
                    v73Var.h.L(new uf4(th));
                }
                if (v73Var.j.b != pd5.d) {
                    ((hb4) v73Var.j.getValue()).close();
                }
                return g5c.a;
            default:
                File file = (File) obj;
                file.getClass();
                return new rg7(((dw2) this.c).a, file);
        }
    }
}
