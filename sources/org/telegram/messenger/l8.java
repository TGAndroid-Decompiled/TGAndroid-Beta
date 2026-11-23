package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class l8 implements Runnable {
    public final int f25166a;
    public final r8 f25167b;
    public final TL_ephemeral.TL_sendMessage f25168c;
    public final Object[] d;

    public l8(r8 r8Var, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i7) {
        this.f25166a = i7;
        this.f25167b = r8Var;
        this.f25168c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f25166a) {
            case 0:
                az sendMessagesHelper = this.f25167b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f25168c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (my) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                az sendMessagesHelper2 = this.f25167b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f25168c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (my) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
