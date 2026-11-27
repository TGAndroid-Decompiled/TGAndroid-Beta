package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class af1 implements RequestDelegate {
    public final byte a;
    public final wf1 b;

    public af1(wf1 wf1Var, byte b) {
        this.a = b;
        this.b = wf1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final wf1 wf1Var = this.b;
        switch (b) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    hl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = tL_channels_adminLogResults;
                            wf1 wf1Var2 = wf1Var;
                            switch (b2) {
                                case 0:
                                    wf1Var2.V0(tL_channels_adminLogResults2);
                                    return;
                                default:
                                    wf1Var2.W0(tL_channels_adminLogResults2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                wf1Var.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i));
                        }
                    }
                    wf1Var.getMessagesController().j4(arrayList2, false);
                    return;
                }
                return;
            case 2:
                wf1Var.getClass();
                hl.c3(new z21(wf1Var, tLObject, (byte) 19));
                return;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    hl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults22 = tL_channels_adminLogResults2;
                            wf1 wf1Var2 = wf1Var;
                            switch (b2) {
                                case 0:
                                    wf1Var2.V0(tL_channels_adminLogResults22);
                                    return;
                                default:
                                    wf1Var2.W0(tL_channels_adminLogResults22);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                hl.c3(new tu0(wf1Var, tL_error, tLObject, (byte) 16));
                return;
        }
    }
}
