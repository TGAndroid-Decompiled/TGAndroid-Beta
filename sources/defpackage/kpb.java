package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kpb implements RequestDelegate {
    public final byte a;
    public final pqb b;

    public kpb(pqb pqbVar, byte b) {
        this.a = b;
        this.b = pqbVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final pqb pqbVar = this.b;
        switch (b) {
            case 0:
                pqbVar.getClass();
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        pqb pqbVar2 = pqbVar;
                        switch (b2) {
                            case 0:
                                pqbVar2.a1(tLObject2);
                                return;
                            default:
                                pqbVar2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        pqbVar2.Y0 = tL_wallPaper;
                                        pqbVar2.g1(false);
                                        pqbVar2.o1();
                                        pqbVar2.W0.add(0, pqbVar2.Y0);
                                        nqb nqbVar = pqbVar2.S0;
                                        if (nqbVar != null) {
                                            nqbVar.f();
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
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        pqb pqbVar2 = pqbVar;
                        switch (b2) {
                            case 0:
                                pqbVar2.a1(tLObject2);
                                return;
                            default:
                                pqbVar2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        pqbVar2.Y0 = tL_wallPaper;
                                        pqbVar2.g1(false);
                                        pqbVar2.o1();
                                        pqbVar2.W0.add(0, pqbVar2.Y0);
                                        nqb nqbVar = pqbVar2.S0;
                                        if (nqbVar != null) {
                                            nqbVar.f();
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
