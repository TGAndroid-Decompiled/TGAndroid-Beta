package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class l8 implements Runnable {
    public final int f24814a;
    public final r8 f24815b;
    public final TL_ephemeral.TL_sendMessage f24816c;
    public final Object[] d;

    public l8(r8 r8Var, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i7) {
        this.f24814a = i7;
        this.f24815b = r8Var;
        this.f24816c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f24814a) {
            case 0:
                ez sendMessagesHelper = this.f24815b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f24816c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (qy) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                ez sendMessagesHelper2 = this.f24815b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f24816c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (qy) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
