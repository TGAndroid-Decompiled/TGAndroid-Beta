package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g7a implements RequestDelegate {
    public final String a;
    public final i7a b;

    public g7a(i7a i7aVar, String str) {
        this.b = i7aVar;
        this.a = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new en9(this, this.a, (byte) 24));
    }
}
