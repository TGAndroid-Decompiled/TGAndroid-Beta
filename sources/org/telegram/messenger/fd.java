package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fd implements RequestDelegate {
    public final int f15538a;
    public final nd f15539b;

    public fd(nd ndVar, int i10) {
        this.f15538a = i10;
        this.f15539b = ndVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15538a) {
            case 0:
                nd ndVar = this.f15539b;
                if (tL_error != null) {
                    ndVar.getClass();
                    return;
                } else {
                    ndVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    return;
                }
            case 1:
                nd ndVar2 = this.f15539b;
                if (tL_error != null) {
                    ndVar2.getClass();
                    return;
                } else {
                    ndVar2.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_affectedMessages;
                nd ndVar3 = this.f15539b;
                if (z10) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    ndVar3.getMessagesController().J3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                ndVar3.getClass();
                return;
        }
    }
}
