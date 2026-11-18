package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class j8 implements Runnable {
    public final int f24823a;
    public final r8 f24824b;
    public final TLRPC.TL_messages_sendMultiMedia f24825c;
    public final Object[] d;

    public j8(r8 r8Var, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i7) {
        this.f24823a = i7;
        this.f24824b = r8Var;
        this.f24825c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f24823a) {
            case 0:
                zy sendMessagesHelper = this.f24824b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f24825c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (ly) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                zy sendMessagesHelper2 = this.f24824b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f24825c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (ly) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
