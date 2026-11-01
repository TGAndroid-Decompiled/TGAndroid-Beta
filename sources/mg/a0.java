package mg;

import java.util.ArrayList;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f13065a;
    public final TLRPC.Chat f13066b;
    public final int f13067c;
    public final ArrayList d;
    public final r20 e;

    public a0(TLRPC.Chat chat, int i10, ArrayList arrayList, r20 r20Var, int i11) {
        this.f13065a = i11;
        this.f13066b = chat;
        this.f13067c = i10;
        this.d = arrayList;
        this.e = r20Var;
    }

    @Override
    public final void run() {
        switch (this.f13065a) {
            case 0:
                TLRPC.Chat chat = this.f13066b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    k0.m(this.f13067c, arrayList);
                }
                this.e.a(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f13066b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    k0.m(this.f13067c, arrayList2);
                }
                this.e.a(arrayList2);
                return;
        }
    }
}
