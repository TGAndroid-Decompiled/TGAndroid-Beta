package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class llb implements RequestDelegate {
    public final byte a;
    public final qmb b;

    public llb(qmb qmbVar, byte b) {
        this.a = b;
        this.b = qmbVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final qmb qmbVar = this.b;
        switch (b) {
            case 0:
                qmbVar.getClass();
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        qmb qmbVar2 = qmbVar;
                        switch (b2) {
                            case 0:
                                qmbVar2.Z0(tLObject2);
                                return;
                            default:
                                qmbVar2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        qmbVar2.Y0 = tL_wallPaper;
                                        qmbVar2.f1(false);
                                        qmbVar2.n1();
                                        qmbVar2.W0.add(0, qmbVar2.Y0);
                                        omb ombVar = qmbVar2.S0;
                                        if (ombVar != null) {
                                            ombVar.f();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        qmb qmbVar2 = qmbVar;
                        switch (b2) {
                            case 0:
                                qmbVar2.Z0(tLObject2);
                                return;
                            default:
                                qmbVar2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        qmbVar2.Y0 = tL_wallPaper;
                                        qmbVar2.f1(false);
                                        qmbVar2.n1();
                                        qmbVar2.W0.add(0, qmbVar2.Y0);
                                        omb ombVar = qmbVar2.S0;
                                        if (ombVar != null) {
                                            ombVar.f();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
