package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k8 implements Runnable {
    public final int f23802a;
    public final r8 f23803b;
    public final TLRPC.TL_messages_sendMedia f23804c;
    public final Object[] d;

    public k8(r8 r8Var, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i3) {
        this.f23802a = i3;
        this.f23803b = r8Var;
        this.f23804c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f23802a) {
            case 0:
                yy sendMessagesHelper = this.f23803b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f23804c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (ky) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                yy sendMessagesHelper2 = this.f23803b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f23804c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (ky) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
