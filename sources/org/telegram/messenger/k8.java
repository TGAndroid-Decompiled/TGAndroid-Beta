package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k8 implements Runnable {
    public final int f24660a;
    public final r8 f24661b;
    public final TLRPC.TL_messages_sendMedia f24662c;
    public final Object[] d;

    public k8(r8 r8Var, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i7) {
        this.f24660a = i7;
        this.f24661b = r8Var;
        this.f24662c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f24660a) {
            case 0:
                ez sendMessagesHelper = this.f24661b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f24662c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (qy) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                ez sendMessagesHelper2 = this.f24661b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f24662c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (qy) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
