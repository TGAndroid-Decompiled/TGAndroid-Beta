package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.p;
public final class s08 implements RequestDelegate {
    public final byte a;
    public final p b;

    public s08(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final p pVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        p pVar2 = pVar;
                        switch (b2) {
                            case 0:
                                pVar2.s0(tLObject2);
                                return;
                            default:
                                pVar2.q0(tLObject2);
                                return;
                        }
                    }
                });
                return;
            case 1:
                gm.c3(new bl7(pVar, tL_error, (byte) 27));
                return;
            case 2:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        p pVar2 = pVar;
                        switch (b2) {
                            case 0:
                                pVar2.s0(tLObject2);
                                return;
                            default:
                                pVar2.q0(tLObject2);
                                return;
                        }
                    }
                });
                return;
            default:
                gm.c3(new z08(pVar, tL_error, tLObject, (byte) 0));
                return;
        }
    }
}
