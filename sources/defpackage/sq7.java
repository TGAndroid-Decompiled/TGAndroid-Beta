package defpackage;

import java.util.ListIterator;
public final class sq7 extends vy5 implements pr4 {
    public final byte b;
    public final yq7 c;

    public sq7(yq7 yq7Var, byte b) {
        super(0);
        this.b = b;
        this.c = yq7Var;
    }

    @Override
    public final Object invoke() {
        ?? r3;
        byte b = this.b;
        g7c g7cVar = g7c.a;
        yq7 yq7Var = this.c;
        switch (b) {
            case 0:
                yq7Var.a();
                return g7cVar;
            case 1:
                zp4 zp4Var = yq7Var.c;
                if (zp4Var == null) {
                    lt ltVar = yq7Var.b;
                    ListIterator listIterator = ltVar.listIterator(ltVar.c);
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            r3 = listIterator.previous();
                            if (((zp4) r3).a) {
                            }
                        } else {
                            r3 = 0;
                        }
                    }
                    zp4Var = r3;
                }
                yq7Var.c = null;
                if (zp4Var != null) {
                    zp4Var.a();
                }
                return g7cVar;
            default:
                yq7Var.a();
                return g7cVar;
        }
    }
}
