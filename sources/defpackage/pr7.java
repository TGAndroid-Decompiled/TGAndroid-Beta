package defpackage;

import java.util.ListIterator;
public final class pr7 extends az5 implements sr4 {
    public final byte b;
    public final vr7 c;

    public pr7(vr7 vr7Var, byte b) {
        super(0);
        this.b = b;
        this.c = vr7Var;
    }

    @Override
    public final Object invoke() {
        ?? r3;
        byte b = this.b;
        f9c f9cVar = f9c.a;
        vr7 vr7Var = this.c;
        switch (b) {
            case 0:
                vr7Var.a();
                return f9cVar;
            case 1:
                cq4 cq4Var = vr7Var.c;
                if (cq4Var == null) {
                    ls lsVar = vr7Var.b;
                    ListIterator listIterator = lsVar.listIterator(lsVar.c);
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            r3 = listIterator.previous();
                            if (((cq4) r3).a) {
                            }
                        } else {
                            r3 = 0;
                        }
                    }
                    cq4Var = r3;
                }
                vr7Var.c = null;
                if (cq4Var != null) {
                    cq4Var.a();
                }
                return f9cVar;
            default:
                vr7Var.a();
                return f9cVar;
        }
    }
}
