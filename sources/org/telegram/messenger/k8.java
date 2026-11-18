package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k8 implements Runnable {
    public final int f25008a;
    public final r8 f25009b;
    public final TLRPC.TL_messages_sendMedia f25010c;
    public final Object[] d;

    public k8(r8 r8Var, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i7) {
        this.f25008a = i7;
        this.f25009b = r8Var;
        this.f25010c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f25008a) {
            case 0:
                zy sendMessagesHelper = this.f25009b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f25010c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (ly) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                zy sendMessagesHelper2 = this.f25009b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f25010c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (ly) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
