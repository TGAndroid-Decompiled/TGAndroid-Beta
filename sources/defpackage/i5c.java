package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i5c implements RequestDelegate {
    public final byte a;
    public final p5c b;

    public i5c(p5c p5cVar, byte b) {
        this.a = b;
        this.b = p5cVar;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final p5c p5cVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        p5c p5cVar2 = p5cVar;
                        switch (b2) {
                            case 0:
                                p5cVar2.p0(tLObject2, tL_error2);
                                return;
                            default:
                                p5cVar2.q0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            case 1:
                gm.c3(new l5c(p5cVar, tL_error, (byte) 0));
                return;
            case 2:
                gm.c3(new l5c(p5cVar, tL_error, (byte) 1));
                return;
            case 3:
                gm.c3(new l5c(p5cVar, tL_error, (byte) 2));
                return;
            default:
                p5cVar.getClass();
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        p5c p5cVar2 = p5cVar;
                        switch (b2) {
                            case 0:
                                p5cVar2.p0(tLObject2, tL_error2);
                                return;
                            default:
                                p5cVar2.q0(tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
