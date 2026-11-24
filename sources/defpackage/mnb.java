package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mnb implements RequestDelegate {
    public final byte a;
    public final rob b;

    public mnb(rob robVar, byte b) {
        this.a = b;
        this.b = robVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final rob robVar = this.b;
        switch (b) {
            case 0:
                robVar.getClass();
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        rob robVar2 = robVar;
                        switch (b2) {
                            case 0:
                                robVar2.a1(tLObject2);
                                return;
                            default:
                                robVar2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        robVar2.Y0 = tL_wallPaper;
                                        robVar2.g1(false);
                                        robVar2.o1();
                                        robVar2.W0.add(0, robVar2.Y0);
                                        pob pobVar = robVar2.S0;
                                        if (pobVar != null) {
                                            pobVar.f();
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
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        rob robVar2 = robVar;
                        switch (b2) {
                            case 0:
                                robVar2.a1(tLObject2);
                                return;
                            default:
                                robVar2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        robVar2.Y0 = tL_wallPaper;
                                        robVar2.g1(false);
                                        robVar2.o1();
                                        robVar2.W0.add(0, robVar2.Y0);
                                        pob pobVar = robVar2.S0;
                                        if (pobVar != null) {
                                            pobVar.f();
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
