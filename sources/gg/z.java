package gg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z implements Runnable {
    public final int f6820a;
    public final TLRPC.Chat f6821b;
    public final int f6822c;
    public final ArrayList d;
    public final Utilities.Callback e;

    public z(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f6820a = i11;
        this.f6821b = chat;
        this.f6822c = i10;
        this.d = arrayList;
        this.e = callback;
    }

    @Override
    public final void run() {
        switch (this.f6820a) {
            case 0:
                TLRPC.Chat chat = this.f6821b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    p0.m(this.f6822c, arrayList);
                }
                this.e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f6821b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    p0.m(this.f6822c, arrayList2);
                }
                this.e.run(arrayList2);
                return;
        }
    }
}
