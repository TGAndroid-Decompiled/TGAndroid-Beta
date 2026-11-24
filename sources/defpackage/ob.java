package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ob implements RequestDelegate {
    public final byte a;
    public final bc b;
    public final he c;

    public ob(bc bcVar, he heVar, byte b) {
        this.a = b;
        this.b = bcVar;
        this.c = heVar;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final bc bcVar = this.b;
                bcVar.getClass();
                final he heVar = this.c;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        he heVar2 = heVar;
                        bc bcVar2 = bcVar;
                        switch (b) {
                            case 0:
                                bcVar2.F0(heVar2, tLObject2, tL_error2);
                                return;
                            default:
                                bcVar2.I0(heVar2, tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            default:
                final bc bcVar2 = this.b;
                final he heVar2 = this.c;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        he heVar22 = heVar2;
                        bc bcVar22 = bcVar2;
                        switch (b) {
                            case 0:
                                bcVar22.F0(heVar22, tLObject2, tL_error2);
                                return;
                            default:
                                bcVar22.I0(heVar22, tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
