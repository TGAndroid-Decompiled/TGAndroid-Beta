package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.p;
public final class qy7 implements RequestDelegate {
    public final byte a;
    public final p b;

    public qy7(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final p pVar = this.b;
        switch (b) {
            case 0:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        p pVar2 = pVar;
                        switch (b2) {
                            case 0:
                                pVar2.r0(tLObject2);
                                return;
                            default:
                                pVar2.p0(tLObject2);
                                return;
                        }
                    }
                });
                return;
            case 1:
                gl.c3(new bj7(pVar, tL_error, (byte) 26));
                return;
            case 2:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        p pVar2 = pVar;
                        switch (b2) {
                            case 0:
                                pVar2.r0(tLObject2);
                                return;
                            default:
                                pVar2.p0(tLObject2);
                                return;
                        }
                    }
                });
                return;
            default:
                gl.c3(new xy7(pVar, tL_error, tLObject, (byte) 0));
                return;
        }
    }
}
