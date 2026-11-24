package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class ag1 implements RequestDelegate {
    public final byte a;
    public final vg1 b;

    public ag1(vg1 vg1Var, byte b) {
        this.a = b;
        this.b = vg1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final vg1 vg1Var = this.b;
        switch (b) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    gm.c3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = tL_channels_adminLogResults;
                            vg1 vg1Var2 = vg1Var;
                            switch (b2) {
                                case 0:
                                    vg1Var2.V0(tL_channels_adminLogResults2);
                                    return;
                                default:
                                    vg1Var2.W0(tL_channels_adminLogResults2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                vg1Var.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i));
                        }
                    }
                    vg1Var.getMessagesController().d4(arrayList2, false);
                    return;
                }
                return;
            case 2:
                vg1Var.getClass();
                gm.c3(new y31(vg1Var, tLObject, (byte) 20));
                return;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    gm.c3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults22 = tL_channels_adminLogResults2;
                            vg1 vg1Var2 = vg1Var;
                            switch (b2) {
                                case 0:
                                    vg1Var2.V0(tL_channels_adminLogResults22);
                                    return;
                                default:
                                    vg1Var2.W0(tL_channels_adminLogResults22);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                gm.c3(new tv0(vg1Var, tL_error, tLObject, (byte) 16));
                return;
        }
    }
}
