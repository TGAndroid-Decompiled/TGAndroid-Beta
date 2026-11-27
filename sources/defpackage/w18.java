package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.p;
public final class w18 implements RequestDelegate {
    public final byte a;
    public final p b;

    public w18(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final p pVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        p pVar2 = pVar;
                        switch (b2) {
                            case 0:
                                pVar2.p0(tLObject2);
                                return;
                            default:
                                pVar2.r0(tLObject2);
                                return;
                        }
                    }
                });
                return;
            case 1:
                hl.c3(new c28(pVar, tL_error, tLObject, (byte) 0));
                return;
            case 2:
                hl.c3(new pl7(pVar, tL_error, (byte) 24));
                return;
            default:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        p pVar2 = pVar;
                        switch (b2) {
                            case 0:
                                pVar2.p0(tLObject2);
                                return;
                            default:
                                pVar2.r0(tLObject2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
