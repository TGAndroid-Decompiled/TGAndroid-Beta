package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class j8 implements Runnable {
    public final int f24807a;
    public final r8 f24808b;
    public final TLRPC.TL_messages_sendMultiMedia f24809c;
    public final Object[] d;

    public j8(r8 r8Var, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i7) {
        this.f24807a = i7;
        this.f24808b = r8Var;
        this.f24809c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f24807a) {
            case 0:
                az sendMessagesHelper = this.f24808b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f24809c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (my) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                az sendMessagesHelper2 = this.f24808b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f24809c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (my) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
