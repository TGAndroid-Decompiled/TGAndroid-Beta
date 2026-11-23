package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k8 implements Runnable {
    public final int f25038a;
    public final r8 f25039b;
    public final TLRPC.TL_messages_sendMedia f25040c;
    public final Object[] d;

    public k8(r8 r8Var, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i7) {
        this.f25038a = i7;
        this.f25039b = r8Var;
        this.f25040c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f25038a) {
            case 0:
                az sendMessagesHelper = this.f25039b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f25040c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (my) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                az sendMessagesHelper2 = this.f25039b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f25040c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (my) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
