package defpackage;

import java.util.ArrayList;
public final class s3a implements Runnable {
    public final byte a;
    public final a6a b;
    public final long c;
    public final ArrayList d;

    public s3a(a6a a6aVar, long j, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = j;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        long j = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                a6aVar.getMessagesController().p3(arrayList, j);
                return;
            case 1:
                a6aVar.getMessagesController().p3(arrayList, j);
                return;
            default:
                a6aVar.getMessagesController().p3(arrayList, j);
                return;
        }
    }
}
