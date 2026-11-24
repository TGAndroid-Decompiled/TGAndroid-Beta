package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class se1 implements RequestDelegate {
    public final byte a;
    public final nf1 b;

    public se1(nf1 nf1Var, byte b) {
        this.a = b;
        this.b = nf1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final nf1 nf1Var = this.b;
        switch (b) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    gl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = tL_channels_adminLogResults;
                            nf1 nf1Var2 = nf1Var;
                            switch (b2) {
                                case 0:
                                    nf1Var2.U0(tL_channels_adminLogResults2);
                                    return;
                                default:
                                    nf1Var2.V0(tL_channels_adminLogResults2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                nf1Var.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i));
                        }
                    }
                    nf1Var.getMessagesController().b4(arrayList2, false);
                    return;
                }
                return;
            case 2:
                nf1Var.getClass();
                gl.c3(new q21(nf1Var, tLObject, (byte) 19));
                return;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    gl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults22 = tL_channels_adminLogResults2;
                            nf1 nf1Var2 = nf1Var;
                            switch (b2) {
                                case 0:
                                    nf1Var2.U0(tL_channels_adminLogResults22);
                                    return;
                                default:
                                    nf1Var2.V0(tL_channels_adminLogResults22);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                gl.c3(new fv0(nf1Var, tL_error, tLObject, (byte) 15));
                return;
        }
    }
}
