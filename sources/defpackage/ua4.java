package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class ua4 implements Runnable {
    public final byte a;
    public final ab4 b;
    public final TL_ephemeral.TL_sendMessage c;
    public final Object[] d;

    public ua4(ab4 ab4Var, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, byte b) {
        this.a = b;
        this.b = ab4Var;
        this.c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object[] objArr = this.d;
        ab4 ab4Var = this.b;
        switch (b) {
            case 0:
                boolean booleanValue = ((Boolean) objArr[5]).booleanValue();
                ab4Var.getSendMessagesHelper().O(this.c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (k3a) objArr[4], booleanValue);
                return;
            default:
                ab4Var.getSendMessagesHelper().O(this.c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (k3a) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
        }
    }
}
