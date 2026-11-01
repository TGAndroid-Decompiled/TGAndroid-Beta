package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class q8 implements Runnable {
    public final int f17754a;
    public final w8 f17755b;
    public final TL_ephemeral.TL_sendMessage f17756c;
    public final Object[] d;

    public q8(w8 w8Var, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f17754a = i10;
        this.f17755b = w8Var;
        this.f17756c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f17754a) {
            case 0:
                rz sendMessagesHelper = this.f17755b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f17756c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (dz) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                rz sendMessagesHelper2 = this.f17755b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f17756c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (dz) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
