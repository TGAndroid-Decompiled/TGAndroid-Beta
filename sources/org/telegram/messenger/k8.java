package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k8 implements Runnable {
    public final int f23673a;
    public final r8 f23674b;
    public final TLRPC.TL_messages_sendMedia f23675c;
    public final Object[] d;

    public k8(r8 r8Var, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i7) {
        this.f23673a = i7;
        this.f23674b = r8Var;
        this.f23675c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f23673a) {
            case 0:
                gz sendMessagesHelper = this.f23674b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f23675c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (sy) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                gz sendMessagesHelper2 = this.f23674b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f23675c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (sy) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
