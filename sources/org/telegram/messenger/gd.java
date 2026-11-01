package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gd implements RequestDelegate {
    public final int f15879a;
    public final od f15880b;

    public gd(od odVar, int i10) {
        this.f15879a = i10;
        this.f15880b = odVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15879a) {
            case 0:
                od odVar = this.f15880b;
                if (tL_error != null) {
                    odVar.getClass();
                    return;
                } else {
                    odVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    return;
                }
            case 1:
                od odVar2 = this.f15880b;
                if (tL_error != null) {
                    odVar2.getClass();
                    return;
                } else {
                    odVar2.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_affectedMessages;
                od odVar3 = this.f15880b;
                if (z10) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    odVar3.getMessagesController().J3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                odVar3.getClass();
                return;
        }
    }
}
