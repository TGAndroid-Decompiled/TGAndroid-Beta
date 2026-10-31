package mg;

import java.util.ArrayList;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f13064a;
    public final TLRPC.Chat f13065b;
    public final int f13066c;
    public final ArrayList d;
    public final q20 e;

    public a0(TLRPC.Chat chat, int i10, ArrayList arrayList, q20 q20Var, int i11) {
        this.f13064a = i11;
        this.f13065b = chat;
        this.f13066c = i10;
        this.d = arrayList;
        this.e = q20Var;
    }

    @Override
    public final void run() {
        switch (this.f13064a) {
            case 0:
                TLRPC.Chat chat = this.f13065b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    k0.m(this.f13066c, arrayList);
                }
                this.e.a(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f13065b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    k0.m(this.f13066c, arrayList2);
                }
                this.e.a(arrayList2);
                return;
        }
    }
}
