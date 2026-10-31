package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Runnable {
    public final int f17237a;
    public final w8 f17238b;
    public final TLRPC.TL_messages_sendMultiMedia f17239c;
    public final Object[] d;

    public o8(w8 w8Var, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f17237a = i10;
        this.f17238b = w8Var;
        this.f17239c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f17237a) {
            case 0:
                qz sendMessagesHelper = this.f17238b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f17239c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (cz) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                qz sendMessagesHelper2 = this.f17238b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f17239c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (cz) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
