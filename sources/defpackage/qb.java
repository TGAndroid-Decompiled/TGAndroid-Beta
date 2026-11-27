package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qb implements RequestDelegate {
    public final byte a;
    public final cc b;
    public final id c;

    public qb(cc ccVar, id idVar, byte b) {
        this.a = b;
        this.b = ccVar;
        this.c = idVar;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final cc ccVar = this.b;
                ccVar.getClass();
                final id idVar = this.c;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        id idVar2 = idVar;
                        cc ccVar2 = ccVar;
                        switch (b) {
                            case 0:
                                ccVar2.F0(idVar2, tLObject2, tL_error2);
                                return;
                            default:
                                ccVar2.I0(idVar2, tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            default:
                final cc ccVar2 = this.b;
                final id idVar2 = this.c;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        id idVar22 = idVar2;
                        cc ccVar22 = ccVar2;
                        switch (b) {
                            case 0:
                                ccVar22.F0(idVar22, tLObject2, tL_error2);
                                return;
                            default:
                                ccVar22.I0(idVar22, tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
