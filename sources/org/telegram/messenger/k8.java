package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k8 implements Runnable {
    public final int f24663a;
    public final r8 f24664b;
    public final TLRPC.TL_messages_sendMedia f24665c;
    public final Object[] d;

    public k8(r8 r8Var, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i7) {
        this.f24663a = i7;
        this.f24664b = r8Var;
        this.f24665c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f24663a) {
            case 0:
                ez sendMessagesHelper = this.f24664b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f24665c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (qy) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                ez sendMessagesHelper2 = this.f24664b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f24665c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (qy) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
