package defpackage;

import java.util.ListIterator;
public final class po7 extends vw5 implements op4 {
    public final byte b;
    public final vo7 c;

    public po7(vo7 vo7Var, byte b) {
        super(0);
        this.b = b;
        this.c = vo7Var;
    }

    @Override
    public final Object invoke() {
        ?? r3;
        byte b = this.b;
        g5c g5cVar = g5c.a;
        vo7 vo7Var = this.c;
        switch (b) {
            case 0:
                vo7Var.a();
                return g5cVar;
            case 1:
                yn4 yn4Var = vo7Var.c;
                if (yn4Var == null) {
                    ks ksVar = vo7Var.b;
                    ListIterator listIterator = ksVar.listIterator(ksVar.c);
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            r3 = listIterator.previous();
                            if (((yn4) r3).a) {
                            }
                        } else {
                            r3 = 0;
                        }
                    }
                    yn4Var = r3;
                }
                vo7Var.c = null;
                if (yn4Var != null) {
                    yn4Var.a();
                }
                return g5cVar;
            default:
                vo7Var.a();
                return g5cVar;
        }
    }
}
