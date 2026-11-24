package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nz8 {
    public final TLObject a;
    public final long b;
    public int c;

    public nz8(int i, TLObject tLObject) {
        this.a = tLObject;
        this.c = i;
        if (tLObject instanceof TLRPC.User) {
            this.b = ((TLRPC.User) tLObject).id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.b = -((TLRPC.Chat) tLObject).id;
        }
    }
}
