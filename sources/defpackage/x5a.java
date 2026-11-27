package defpackage;

import java.util.List;
public final class x5a implements Runnable {
    public final byte a;
    public final r7a b;
    public final String c;
    public final List d;

    public x5a(r7a r7aVar, String str, List list, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        byte b = this.a;
        List list = this.d;
        String str = this.c;
        r7a r7aVar = this.b;
        switch (b) {
            case 0:
                r7aVar.r.remove(str);
                list.remove(str);
                return;
            default:
                r7aVar.r.remove(str);
                list.remove(str);
                return;
        }
    }
}
