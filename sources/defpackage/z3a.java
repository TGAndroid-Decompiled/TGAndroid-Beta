package defpackage;

import java.util.List;
public final class z3a implements Runnable {
    public final byte a;
    public final a6a b;
    public final String c;
    public final List d;

    public z3a(a6a a6aVar, String str, List list, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        byte b = this.a;
        List list = this.d;
        String str = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                a6aVar.r.remove(str);
                list.remove(str);
                return;
            default:
                a6aVar.r.remove(str);
                list.remove(str);
                return;
        }
    }
}
