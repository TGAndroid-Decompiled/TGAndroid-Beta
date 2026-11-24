package defpackage;

import java.util.List;
public final class x1a implements Runnable {
    public final byte a;
    public final z3a b;
    public final String c;
    public final List d;

    public x1a(z3a z3aVar, String str, List list, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        byte b = this.a;
        List list = this.d;
        String str = this.c;
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                z3aVar.r.remove(str);
                list.remove(str);
                return;
            default:
                z3aVar.r.remove(str);
                list.remove(str);
                return;
        }
    }
}
