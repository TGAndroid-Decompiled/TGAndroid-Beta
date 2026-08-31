package hg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z implements Runnable {
    public final int f7678a;
    public final TLRPC.Chat f7679b;
    public final int f7680c;
    public final ArrayList d;
    public final Utilities.Callback f7681e;

    public z(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f7678a = i11;
        this.f7679b = chat;
        this.f7680c = i10;
        this.d = arrayList;
        this.f7681e = callback;
    }

    @Override
    public final void run() {
        switch (this.f7678a) {
            case 0:
                TLRPC.Chat chat = this.f7679b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    p0.m(this.f7680c, arrayList);
                }
                this.f7681e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f7679b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    p0.m(this.f7680c, arrayList2);
                }
                this.f7681e.run(arrayList2);
                return;
        }
    }
}
