package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qa7 implements RequestDelegate {
    public final byte a = 2;
    public final int b;
    public final boolean c;
    public final fn7 d;
    public final Object e;
    public final Object f;

    public qa7(uc7 uc7Var, int i, TLRPC.Chat chat, TLRPC.User user, boolean z) {
        this.d = uc7Var;
        this.b = i;
        this.e = chat;
        this.f = user;
        this.c = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j;
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        fn7 fn7Var = this.d;
        switch (b) {
            case 0:
                uc7 uc7Var = (uc7) fn7Var;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                uc7Var.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.b));
                    kf7 messagesStorage = uc7Var.getMessagesStorage();
                    if (chat != null) {
                        j = -chat.id;
                    } else {
                        j = user.id;
                    }
                    messagesStorage.e2(j, arrayList, !this.c, -1, 0, false, null);
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                hl.c3(new q25((lm7) fn7Var, (jm7) obj2, this.b, (String) obj, this.c, tLObject, (byte) 1));
                return;
            default:
                hl.c3(new q25((l98) fn7Var, (String) obj2, this.b, tLObject, this.c, (TLRPC.User) obj, (byte) 2));
                return;
        }
    }

    public qa7(lm7 lm7Var, jm7 jm7Var, int i, String str, boolean z) {
        this.d = lm7Var;
        this.e = jm7Var;
        this.b = i;
        this.f = str;
        this.c = z;
    }

    public qa7(l98 l98Var, String str, int i, boolean z, TLRPC.User user) {
        this.d = l98Var;
        this.e = str;
        this.b = i;
        this.c = z;
        this.f = user;
    }
}
