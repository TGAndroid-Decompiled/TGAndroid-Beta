package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class j8 implements Runnable {
    public final int f23517a;
    public final r8 f23518b;
    public final TLRPC.TL_messages_sendMultiMedia f23519c;
    public final Object[] d;

    public j8(r8 r8Var, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i7) {
        this.f23517a = i7;
        this.f23518b = r8Var;
        this.f23519c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f23517a) {
            case 0:
                gz sendMessagesHelper = this.f23518b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f23519c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (sy) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                gz sendMessagesHelper2 = this.f23518b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f23519c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (sy) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
