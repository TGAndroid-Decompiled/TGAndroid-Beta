package defpackage;

import java.util.ArrayList;
public final class q1a implements Runnable {
    public final byte a;
    public final z3a b;
    public final long c;
    public final ArrayList d;

    public q1a(z3a z3aVar, long j, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = j;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        long j = this.c;
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                z3aVar.getMessagesController().m3(arrayList, j);
                return;
            case 1:
                z3aVar.getMessagesController().m3(arrayList, j);
                return;
            default:
                z3aVar.getMessagesController().m3(arrayList, j);
                return;
        }
    }
}
