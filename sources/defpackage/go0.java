package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class go0 implements Runnable {
    public final byte a;
    public final TLRPC.Chat b;
    public final int c;
    public final ArrayList d;
    public final qac e;

    public go0(TLRPC.Chat chat, int i, ArrayList arrayList, qac qacVar, byte b) {
        this.a = b;
        this.b = chat;
        this.c = i;
        this.d = arrayList;
        this.e = qacVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qac qacVar = this.e;
        ArrayList arrayList = this.d;
        int i = this.c;
        TLRPC.Chat chat = this.b;
        switch (b) {
            case 0:
                if (chat == null) {
                    oo0.o(i, arrayList);
                }
                qacVar.a(arrayList);
                return;
            default:
                if (chat == null) {
                    oo0.o(i, arrayList);
                }
                qacVar.a(arrayList);
                return;
        }
    }
}
