package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class p8 implements Runnable {
    public final int f17419a;
    public final w8 f17420b;
    public final TLRPC.TL_messages_sendMedia f17421c;
    public final Object[] d;

    public p8(w8 w8Var, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f17419a = i10;
        this.f17420b = w8Var;
        this.f17421c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f17419a) {
            case 0:
                qz sendMessagesHelper = this.f17420b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f17421c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (cz) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                qz sendMessagesHelper2 = this.f17420b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f17421c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (cz) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
