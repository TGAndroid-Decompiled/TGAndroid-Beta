package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class l8 implements Runnable {
    public final int f23852a;
    public final r8 f23853b;
    public final TL_ephemeral.TL_sendMessage f23854c;
    public final Object[] d;

    public l8(r8 r8Var, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i7) {
        this.f23852a = i7;
        this.f23853b = r8Var;
        this.f23854c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f23852a) {
            case 0:
                gz sendMessagesHelper = this.f23853b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.f23854c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (sy) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
            default:
                gz sendMessagesHelper2 = this.f23853b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.f23854c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (sy) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                return;
        }
    }
}
