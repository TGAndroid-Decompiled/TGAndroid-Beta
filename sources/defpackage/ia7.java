package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ia7 implements RequestDelegate {
    public final byte a = 0;
    public final int b;
    public final boolean c;
    public final TLRPC.User d;
    public final jm7 e;
    public final Object f;

    public ia7(oc7 oc7Var, int i, TLRPC.Chat chat, TLRPC.User user, boolean z) {
        this.e = oc7Var;
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
        jm7 jm7Var = this.e;
        switch (b) {
            case 0:
                oc7 oc7Var = (oc7) jm7Var;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                oc7Var.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.b));
                    cf7 messagesStorage = oc7Var.getMessagesStorage();
                    if (chat != null) {
                        j = -chat.id;
                    } else {
                        j = this.d.id;
                    }
                    messagesStorage.Z1(j, arrayList, !this.c, -1, 0, false, null);
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                gm.c3(new m25((w78) jm7Var, (String) obj, this.b, tLObject, this.c, this.d));
                return;
        }
    }

    public ia7(w78 w78Var, String str, int i, boolean z, TLRPC.User user) {
        this.e = w78Var;
        this.f = str;
        this.b = i;
        this.c = z;
        this.d = user;
    }
}
