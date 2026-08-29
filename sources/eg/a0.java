package eg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f5911a;
    public final TLRPC.Chat f5912b;
    public final int f5913c;
    public final ArrayList d;
    public final Utilities.Callback f5914e;

    public a0(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f5911a = i11;
        this.f5912b = chat;
        this.f5913c = i10;
        this.d = arrayList;
        this.f5914e = callback;
    }

    @Override
    public final void run() {
        switch (this.f5911a) {
            case 0:
                TLRPC.Chat chat = this.f5912b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    q0.m(this.f5913c, arrayList);
                }
                this.f5914e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f5912b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    q0.m(this.f5913c, arrayList2);
                }
                this.f5914e.run(arrayList2);
                return;
        }
    }
}
