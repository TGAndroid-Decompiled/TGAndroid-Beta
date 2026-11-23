package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i8 implements Runnable {
    public final int f24770a;
    public final q8 f24771b;
    public final TLRPC.TL_messages_sendMultiMedia f24772c;
    public final Object[] d;

    public i8(q8 q8Var, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i7) {
        this.f24770a = i7;
        this.f24771b = q8Var;
        this.f24772c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f24770a) {
            case 0:
                zy sendMessagesHelper = this.f24771b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f24772c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (ly) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                zy sendMessagesHelper2 = this.f24771b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f24772c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (ly) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
