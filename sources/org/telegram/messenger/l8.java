package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class l8 implements Runnable {
    public final int f23955a;
    public final r8 f23956b;
    public final TL_ephemeral.TL_sendMessage f23957c;
    public final Object[] d;

    public l8(r8 r8Var, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i3) {
        this.f23955a = i3;
        this.f23956b = r8Var;
        this.f23957c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f23955a) {
            case 0:
                yy sendMessagesHelper = this.f23956b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f23957c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (ky) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                yy sendMessagesHelper2 = this.f23956b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f23957c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (ky) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
