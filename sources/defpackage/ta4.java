package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ta4 implements Runnable {
    public final byte a;
    public final ab4 b;
    public final TLRPC.TL_messages_sendMedia c;
    public final Object[] d;

    public ta4(ab4 ab4Var, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, byte b) {
        this.a = b;
        this.b = ab4Var;
        this.c = tL_messages_sendMedia;
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
