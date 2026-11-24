package defpackage;

import java.util.ArrayList;
public final class hq3 implements Runnable {
    public final byte a;
    public final p8c b;
    public final ArrayList c;

    public hq3(p8c p8cVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = p8cVar;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                p8cVar.a(arrayList);
                return;
            default:
                if (p8cVar != null) {
                    p8cVar.a(arrayList);
                    return;
                }
                return;
        }
    }
}
