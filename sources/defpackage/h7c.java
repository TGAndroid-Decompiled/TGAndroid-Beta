package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h7c implements RequestDelegate {
    public final byte a;
    public final o7c b;

    public h7c(o7c o7cVar, byte b) {
        this.a = b;
        this.b = o7cVar;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final o7c o7cVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        o7c o7cVar2 = o7cVar;
                        switch (b2) {
                            case 0:
                                o7cVar2.o0(tLObject2, tL_error2);
                                return;
                            default:
                                o7cVar2.p0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            case 1:
                hl.c3(new k7c(o7cVar, tL_error, (byte) 0));
                return;
            case 2:
                hl.c3(new k7c(o7cVar, tL_error, (byte) 1));
                return;
            case 3:
                hl.c3(new k7c(o7cVar, tL_error, (byte) 2));
                return;
            default:
                o7cVar.getClass();
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        o7c o7cVar2 = o7cVar;
                        switch (b2) {
                            case 0:
                                o7cVar2.o0(tLObject2, tL_error2);
                                return;
                            default:
                                o7cVar2.p0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
