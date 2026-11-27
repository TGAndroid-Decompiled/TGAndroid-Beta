package defpackage;

import java.util.ArrayList;
public final class p5a implements Runnable {
    public final byte a;
    public final r7a b;
    public final long c;
    public final ArrayList d;

    public p5a(r7a r7aVar, long j, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = j;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        long j = this.c;
        r7a r7aVar = this.b;
        switch (b) {
            case 0:
                r7aVar.getMessagesController().t3(arrayList, j);
                return;
            case 1:
                r7aVar.getMessagesController().t3(arrayList, j);
                return;
            default:
                r7aVar.getMessagesController().t3(arrayList, j);
                return;
        }
    }
}
