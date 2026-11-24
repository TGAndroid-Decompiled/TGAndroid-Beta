package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tc4 implements Runnable {
    public final byte a;
    public final ad4 b;
    public final TLRPC.TL_messages_sendMedia c;
    public final Object[] d;

    public tc4(ad4 ad4Var, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, byte b) {
        this.a = b;
        this.b = ad4Var;
        this.c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object[] objArr = this.d;
        ad4 ad4Var = this.b;
        switch (b) {
            case 0:
                boolean booleanValue = ((Boolean) objArr[5]).booleanValue();
                ad4Var.getSendMessagesHelper().O(this.c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (m5a) objArr[4], booleanValue);
                return;
            default:
                ad4Var.getSendMessagesHelper().O(this.c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (m5a) objArr[4], ((Boolean) objArr[5]).booleanValue());
                return;
        }
    }
}
