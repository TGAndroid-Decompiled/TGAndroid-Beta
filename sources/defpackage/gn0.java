package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gn0 implements Runnable {
    public final byte a;
    public final TLRPC.Chat b;
    public final int c;
    public final ArrayList d;
    public final pcc e;

    public gn0(TLRPC.Chat chat, int i, ArrayList arrayList, pcc pccVar, byte b) {
        this.a = b;
        this.b = chat;
        this.c = i;
        this.d = arrayList;
        this.e = pccVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pcc pccVar = this.e;
        ArrayList arrayList = this.d;
        int i = this.c;
        TLRPC.Chat chat = this.b;
        switch (b) {
            case 0:
                if (chat == null) {
                    on0.o(i, arrayList);
                }
                pccVar.a(arrayList);
                return;
            default:
                if (chat == null) {
                    on0.o(i, arrayList);
                }
                pccVar.a(arrayList);
                return;
        }
    }
}
