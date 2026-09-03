package gg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z implements Runnable {
    public final int f6807a;
    public final TLRPC.Chat f6808b;
    public final int f6809c;
    public final ArrayList d;
    public final Utilities.Callback e;

    public z(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f6807a = i11;
        this.f6808b = chat;
        this.f6809c = i10;
        this.d = arrayList;
        this.e = callback;
    }

    @Override
    public final void run() {
        switch (this.f6807a) {
            case 0:
                TLRPC.Chat chat = this.f6808b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    p0.m(this.f6809c, arrayList);
                }
                this.e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f6808b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    p0.m(this.f6809c, arrayList2);
                }
                this.e.run(arrayList2);
                return;
        }
    }
}
