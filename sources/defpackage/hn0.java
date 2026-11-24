package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hn0 implements RequestDelegate {
    public final byte a;
    public final p8c b;
    public final p8c c;

    public hn0(p8c p8cVar, p8c p8cVar2, byte b) {
        this.a = b;
        this.b = p8cVar;
        this.c = p8cVar2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                gl.c3(new nn6(tL_error, this.b, this.c));
                return;
            default:
                gl.c3(new s67(tL_error, this.b, tLObject, this.c, (byte) 9));
                return;
        }
    }
}
