package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Runnable {
    public final int f17399a;
    public final w8 f17400b;
    public final TLRPC.TL_messages_sendMultiMedia f17401c;
    public final Object[] d;

    public o8(w8 w8Var, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f17399a = i10;
        this.f17400b = w8Var;
        this.f17401c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f17399a) {
            case 0:
                rz sendMessagesHelper = this.f17400b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f17401c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (dz) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                rz sendMessagesHelper2 = this.f17400b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f17401c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (dz) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
