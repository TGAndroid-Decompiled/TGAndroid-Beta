package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h3c implements RequestDelegate {
    public final byte a;
    public final p3c b;

    public h3c(p3c p3cVar, byte b) {
        this.a = b;
        this.b = p3cVar;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final p3c p3cVar = this.b;
        switch (b) {
            case 0:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        p3c p3cVar2 = p3cVar;
                        switch (b2) {
                            case 0:
                                p3cVar2.o0(tLObject2, tL_error2);
                                return;
                            default:
                                p3cVar2.p0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            case 1:
                gl.c3(new k3c(p3cVar, tL_error, (byte) 0));
                return;
            case 2:
                gl.c3(new k3c(p3cVar, tL_error, (byte) 1));
                return;
            case 3:
                gl.c3(new k3c(p3cVar, tL_error, (byte) 2));
                return;
            default:
                p3cVar.getClass();
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        p3c p3cVar2 = p3cVar;
                        switch (b2) {
                            case 0:
                                p3cVar2.o0(tLObject2, tL_error2);
                                return;
                            default:
                                p3cVar2.p0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
