package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class k8 implements Runnable {
    public final int f25107a;
    public final q8 f25108b;
    public final TL_ephemeral.TL_sendMessage f25109c;
    public final Object[] d;

    public k8(q8 q8Var, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i7) {
        this.f25107a = i7;
        this.f25108b = q8Var;
        this.f25109c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f25107a) {
            case 0:
                zy sendMessagesHelper = this.f25108b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f25109c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (ly) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                zy sendMessagesHelper2 = this.f25108b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f25109c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (ly) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
