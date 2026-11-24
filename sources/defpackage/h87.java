package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h87 implements RequestDelegate {
    public final byte a = 0;
    public final int b;
    public final boolean c;
    public final TLRPC.User d;
    public final gk7 e;
    public final Object f;

    public h87(na7 na7Var, int i, TLRPC.Chat chat, TLRPC.User user, boolean z) {
        this.e = na7Var;
        this.b = i;
        this.f = chat;
        this.d = user;
        this.c = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j;
        byte b = this.a;
        Object obj = this.f;
        gk7 gk7Var = this.e;
        switch (b) {
            case 0:
                na7 na7Var = (na7) gk7Var;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                na7Var.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.b));
                    ad7 messagesStorage = na7Var.getMessagesStorage();
                    if (chat != null) {
                        j = -chat.id;
                    } else {
                        j = this.d.id;
                    }
                    messagesStorage.Z1(j, arrayList, !this.c, -1, 0, false, null);
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                gl.d3(new m05((u58) gk7Var, (String) obj, this.b, tLObject, this.c, this.d));
                return;
        }
    }

    public h87(u58 u58Var, String str, int i, boolean z, TLRPC.User user) {
        this.e = u58Var;
        this.f = str;
        this.b = i;
        this.c = z;
        this.d = user;
    }
}
