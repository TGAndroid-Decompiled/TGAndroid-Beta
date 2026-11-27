package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xn5 {
    public final TLObject a;
    public TLRPC.User b;
    public final byte c;
    public final boolean d;
    public boolean e;

    public xn5(int i, TLObject tLObject) {
        boolean z;
        this.a = tLObject;
        this.c = i;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
    }
}
