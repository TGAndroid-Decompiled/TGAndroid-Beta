package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ob implements RequestDelegate {
    public final byte a;
    public final bc b;
    public final hd c;

    public ob(bc bcVar, hd hdVar, byte b) {
        this.a = b;
        this.b = bcVar;
        this.c = hdVar;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final bc bcVar = this.b;
                bcVar.getClass();
                final hd hdVar = this.c;
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        hd hdVar2 = hdVar;
                        bc bcVar2 = bcVar;
                        switch (b) {
                            case 0:
                                bcVar2.E0(hdVar2, tLObject2, tL_error2);
                                return;
                            default:
                                bcVar2.H0(hdVar2, tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            default:
                final bc bcVar2 = this.b;
                final hd hdVar2 = this.c;
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        hd hdVar22 = hdVar2;
                        bc bcVar22 = bcVar2;
                        switch (b) {
                            case 0:
                                bcVar22.E0(hdVar22, tLObject2, tL_error2);
                                return;
                            default:
                                bcVar22.H0(hdVar22, tLObject2, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
