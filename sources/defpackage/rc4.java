package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class rc4 implements Runnable {
    public final byte a;
    public final xc4 b;
    public final TL_ephemeral.TL_sendMessage c;
    public final Object[] d;

    public rc4(xc4 xc4Var, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, byte b) {
        this.a = b;
        this.b = xc4Var;
        this.c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object[] objArr = this.d;
        xc4 xc4Var = this.b;
        switch (b) {
            case 0:
                boolean booleanValue = ((Boolean) objArr[5]).booleanValue();
                xc4Var.getSendMessagesHelper().O(this.c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (d7a) objArr[4], booleanValue);
                return;
            default:
                xc4Var.getSendMessagesHelper().O(this.c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (d7a) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
        }
    }
}
