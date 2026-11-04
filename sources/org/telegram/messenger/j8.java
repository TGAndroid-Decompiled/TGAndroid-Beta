package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class j8 implements Runnable {
    public final int f23652a;
    public final r8 f23653b;
    public final TLRPC.TL_messages_sendMultiMedia f23654c;
    public final Object[] d;

    public j8(r8 r8Var, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i3) {
        this.f23652a = i3;
        this.f23653b = r8Var;
        this.f23654c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f23652a) {
            case 0:
                yy sendMessagesHelper = this.f23653b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f23654c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (ky) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                yy sendMessagesHelper2 = this.f23653b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f23654c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (ky) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
