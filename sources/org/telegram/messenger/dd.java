package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dd implements RequestDelegate {
    public final int f22176a;
    public final ld f22177b;

    public dd(ld ldVar, int i3) {
        this.f22176a = i3;
        this.f22177b = ldVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22176a) {
            case 0:
                ld ldVar = this.f22177b;
                if (tL_error != null) {
                    ldVar.getClass();
                    return;
                } else {
                    ldVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                }
            case 1:
                ld ldVar2 = this.f22177b;
                if (tL_error != null) {
                    ldVar2.getClass();
                    return;
                } else {
                    ldVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_affectedMessages;
                ld ldVar3 = this.f22177b;
                if (z10) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    ldVar3.getMessagesController().M3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                ldVar3.getClass();
                return;
        }
    }
}
