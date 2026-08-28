package bg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f1713a;
    public final TLRPC.Chat f1714b;
    public final int f1715c;
    public final ArrayList d;
    public final Utilities.Callback f1716e;

    public c0(TLRPC.Chat chat, int i9, ArrayList arrayList, Utilities.Callback callback, int i10) {
        this.f1713a = i10;
        this.f1714b = chat;
        this.f1715c = i9;
        this.d = arrayList;
        this.f1716e = callback;
    }

    @Override
    public final void run() {
        switch (this.f1713a) {
            case 0:
                TLRPC.Chat chat = this.f1714b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    u0.m(this.f1715c, arrayList);
                }
                this.f1716e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f1714b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    u0.m(this.f1715c, arrayList2);
                }
                this.f1716e.run(arrayList2);
                return;
        }
    }
}
